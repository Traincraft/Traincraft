package train.common.api;

import com.mojang.authlib.GameProfile;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.NetworkRegistry.TargetPoint;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import mods.railcraft.api.carts.CartTools;
import mods.railcraft.api.carts.ILinkableCart;
import mods.railcraft.api.tracks.RailTools;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockRailBase;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.entity.*;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.minecart.MinecartCollisionEvent;
import net.minecraftforge.event.entity.minecart.MinecartInteractEvent;
import net.minecraftforge.event.entity.minecart.MinecartUpdateEvent;
import train.client.core.handlers.SoundUpdaterRollingStock;
import train.common.Traincraft;
import train.common.adminbook.ServerLogger;
import train.common.blocks.BlockTCRail;
import train.common.blocks.BlockTCRailGag;
import train.common.core.HandleOverheating;
import train.common.core.handlers.*;
import train.common.core.network.PacketRollingStockRotation;
import train.common.core.util.TraincraftUtil;
import train.common.entity.rollingStock.EntityTracksBuilder;
import train.common.items.ItemPaintbrushThing;
import train.common.items.ItemTCRail;
import train.common.items.ItemTCRail.TrackTypes;
import train.common.items.ItemWrench;
import train.common.library.BlockIDs;
import train.common.library.EnumTrains;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailGag;

import java.util.ArrayList;
import java.util.List;

import static train.common.core.util.TraincraftUtil.degrees;
import static train.common.core.util.TraincraftUtil.isRailBlockAt;

public class EntityRollingStock extends AbstractTrains implements ILinkableCart {
	public int fuelTrain;
	protected static final int matrix[][][] = { { { 0, 0, -1 }, { 0, 0, 1 } }, { { -1, 0, 0 }, { 1, 0, 0 } }, { { -1, -1, 0 }, { 1, 0, 0 } }, { { -1, 0, 0 }, { 1, -1, 0 } }, { { 0, 0, -1 }, { 0, -1, 1 } }, { { 0, -1, -1 }, { 0, 0, 1 } }, { { 0, 0, 1 }, { 1, 0, 0 } }, { { 0, 0, 1 }, { -1, 0, 0 } }, { { 0, 0, -1 }, { -1, 0, 0 } }, { { 0, 0, -1 }, { 1, 0, 0 } } };

	protected EntityPlayer playerEntity;

	/** Axis aligned bounding box. */
	private AxisAlignedBB boundingBoxSmall;

	public float maxSpeed;
	public float railMaxSpeed;
	public double speedLimiter = 1;
	public boolean speedWasSet = false;

	public ItemStack item;
	public float rotation;

	public int rail;
	public int meta;
	public double d6;
	public double d7;

	/** appears to be the progress of the turn */
	private int rollingturnProgress;
	private double rollingX;
	private double rollingY;
	private double rollingZ;
	private float rollingServerPitch;
	public double rotationYawClient;
	public float rotationYawClientReal;
	public float anglePitchClient;//was a double
	public float serverRealRotation;
	private float previousServerRealRotation;
	public boolean isServerInReverse = false;
	public boolean isClientInReverse = false;
	public boolean serverInReverseSignPositive = false;
	public float serverRealPitch;
	private double rollingPitch;
	public float oldClientYaw = 0;//used in rendering class
	@SideOnly(Side.CLIENT)
	private double rollingVelocityX;
	@SideOnly(Side.CLIENT)
	private double rollingVelocityY;
	@SideOnly(Side.CLIENT)
	private double rollingVelocityZ;

	private CollisionHandler collisionhandler;
	private LinkHandler linkhandler;
	private TrainsOnClick trainsOnClick;
	public boolean isBraking;
	public boolean isClimbing;
	public int overheatLevel;
	public int linkageNumber;

	public Side side;
	@SideOnly(Side.CLIENT)
	private SoundHandler theSoundManager;
	@SideOnly(Side.CLIENT)
	private SoundUpdaterRollingStock sndUpdater;
	/**
	 * Array containing @TrainHandler objects. In other words it contains all
	 * the "trains" object the train object contains an array which contains all @RollingStocks
	 * that are part of the train
	 */
	public static ArrayList<TrainHandler> allTrains = new ArrayList<TrainHandler>();
	public int updateTicks = 0;
	private HandleOverheating handleOverheating;
	public ArrayList<EntityRollingStock> RollingStock;
	/**
	 * each ticks: numLaps++ used for fuel consumption rate
	 */
	private int numLaps;

	private int ticksSinceHeld = 0;
	private boolean cartLocked = false;

	/**
	 * New physics integration
	 */
	private double bogieShift = 0;
	private boolean needsBogieUpdate;
	private boolean firstLoad = true;
	public EntityBogie bogieLoco = null;
	private boolean hasSpawnedBogie = false;
	private double mountedOffset = -0.5;
	public double posYFromServer;
	private boolean shouldServerSetPosYOnClient = true;
	private int clientTicks = 0;
	
	private double derailSpeed = 0.46;

	private int scrollPosition;

	public EntityRollingStock(World world) {
		super(world);
		initRollingStock(world);
	}

	@Override
	public GameProfile getOwner() {
		return CartTools.getCartOwner(this);
	}

	public EntityRollingStock(World world, double d, double d1, double d2) {
		super(world,d,d1,d2);
		initRollingStock(world);
		setPosition(d, d1 + yOffset, d2);
		motionX = 0.0D;
		motionY = 0.0D;
		motionZ = 0.0D;
		prevPosX = d;
		prevPosY = d1;
		prevPosZ = d2;
	}

	public void initRollingStock(World world) {
		dataWatcher.addObject(20, 0);//heat
		dataWatcher.addObject(14, 0);
		dataWatcher.addObject(21, 0);

		preventEntitySpawning = true;
		isImmuneToFire = true;
		//field_70499_f = false;

		//setSize(0.98F, 1.98F);
		//yOffset = 0;
		//ySize = 0.98F;
		yOffset = 0.65f;

		linkageNumber = 0;

		entityCollisionReduction = 0.8F;

		boundingBoxSmall = AxisAlignedBB.getBoundingBox(0.0D, 0.0D, 0.0D, 0.0D, 2.0D, 1.0D);
		//setBoundingBoxSmall(0.0D, 0.0D, 0.0D, 0.98F, 0.7F);
		setBoundingBoxSmall(0.0D, 0.0D, 0.0D, 2.0F, 1.0F);
		RollingStock = new ArrayList<EntityRollingStock>();
		handleOverheating = new HandleOverheating(this);

		collisionhandler = new CollisionHandler(world);
		linkhandler = new LinkHandler(world);
		trainsOnClick = new TrainsOnClick();

		/* Railcraft's stuff */
		//maxSpeed = defaultMaxSpeedRail;
		//maxSpeedGround = defaultMaxSpeedGround;
		maxSpeedAirLateral = defaultMaxSpeedAirLateral;
		maxSpeedAirVertical = defaultMaxSpeedAirVertical;
		dragAir = defaultDragAir;

		/**
		 * Trains are always rendered even if out player's sight => no more
		 * flickering/disappearing
		 */
		if (ConfigHandler.FLICKERING) {
			this.ignoreFrustumCheck = true;
		}
		side = FMLCommonHandler.instance().getEffectiveSide();
		if (side == Side.CLIENT) {
			sndUpdater = new SoundUpdaterRollingStock();
		}

		this.needsBogieUpdate = false;
		setCollisionHandler(null);
		//this.boundingBox.offset(0, 0.5, 0);
	}


	/**
	 * this is basically NBT for entity spawn, to keep data between client and server in sync because some data is not automatically shared.
	 */
	@Override
	public void readSpawnData(ByteBuf additionalData) {
		isBraking = additionalData.readBoolean();
		setTrainLockedFromPacket(additionalData.readBoolean());
	}
	@Override
	public void writeSpawnData(ByteBuf buffer) {
		buffer.writeBoolean(isBraking);
		buffer.writeBoolean(getTrainLockedFromPacket());
	}

	public String getTrainName() {
		return dataWatcher.getWatchableObjectString(9);
	}

	public String getTrainType() {
		return dataWatcher.getWatchableObjectString(6);
	}

	@Override
	public String getTrainOwner() {
		return dataWatcher.getWatchableObjectString(7);
	}

	public String getTrainCreator() {
		return dataWatcher.getWatchableObjectString(13);
	}

	public int getIDForServer() {
		return dataWatcher.getWatchableObjectInt(5);
	}

	public int getNumberOfTrainsForServer() {
		return dataWatcher.getWatchableObjectInt(10);
	}

	public int getUniqueTrainIDClient() {
		return dataWatcher.getWatchableObjectInt(11);
	}

	/*
	 * @Override public int getID() { return ID; }
	 */

	@Override
	protected boolean canTriggerWalking() {
		return false;
	}

	@Override
	public double getMountedYOffset() {
		return mountedOffset;
	}

	public void setMountedYOffset(double offset) {
		mountedOffset = offset;
	}

	public void setYFromServer(double posYServer) {
		this.posYFromServer = posYServer;
	}

	@Override
	protected void entityInit() {
		dataWatcher.addObject(16, (byte) 0);
		dataWatcher.addObject(17, 0);
		dataWatcher.addObject(18, 1);
		dataWatcher.addObject(19, 0.0F);
	}

	@Override
	public AxisAlignedBB getCollisionBox(Entity entity) {
		return null;
	}

	@Override
	public boolean canBePushed() {
		return true;
	}

	@Override
	public boolean isLocomotive() {
		return  (this instanceof Locomotive);
	}

	@Override
	public boolean isPassenger() {
		return (this instanceof IPassenger);
	}

	@Override
	public boolean isFreightCart() {
		return (this instanceof Freight || this instanceof LiquidTank);
	}

	@Override
	public boolean isFreightOrPassenger() {
		return (this instanceof Freight || this instanceof IPassenger || this instanceof LiquidTank);
	}

	@Override
	public boolean isBuilder() {
		return (this instanceof EntityTracksBuilder);
	}

	@Override
	public boolean isTender() {
		return (this instanceof Tender);
	}

	@Override
	public boolean isWorkCart() {
		return (this instanceof AbstractWorkCart);
	}

	@Override
	public boolean isElectricTrain() {
		return (this instanceof ElectricTrain);
	}

	protected int steamFuelLast(ItemStack it) {
		return FuelHandler.steamFuelLast(it);
	}

	@Override
	public boolean attackEntityFrom(DamageSource damagesource, float i) {
		if (worldObj.isRemote || isDead) { return true; }
		if (damagesource.getEntity() instanceof EntityPlayer && !damagesource.isProjectile()) {
			if(this instanceof IPassenger){
				if (canBeDestroyedByPlayer(damagesource)) return false;
			}
			setRollingDirection(-getRollingDirection());
			setRollingAmplitude(10);
			setBeenAttacked();
			if (((EntityPlayer) damagesource.getEntity()).capabilities.isCreativeMode) {
				this.setDamage(1000);
				if (ConfigHandler.ENABLE_WAGON_REMOVAL_NOTICES && ((EntityPlayer) damagesource.getEntity()).canCommandSenderUseCommand(2,"")) {
					((EntityPlayer) damagesource.getEntity()).addChatComponentMessage(new ChatComponentText("Operator removed train owned by " + getTrainOwner()));
				}
			}
			setDamage(getDamage() + i * 10);
			if (getDamage() > 40) {
				if (riddenByEntity != null) {
					riddenByEntity.mountEntity(this);
				}
				ServerLogger.deleteWagon(this);
				/**
				 * Destroy IPassenger since they don't extend Freight or
				 * Locomotive and don't have a proper attackEntityFrom() method
				 */
				if (this instanceof IPassenger) {
					this.setDead();
					dropCartAsItem(((EntityPlayer)damagesource.getEntity()).capabilities.isCreativeMode);
				}
			}
		}
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void performHurtAnimation() {
		setRollingDirection(-getRollingDirection());
		setRollingAmplitude(10);
		setDamage(getDamage() + getDamage() * 10);
	}
	
	public void unLink(){
		if (this.isAttached) {
			if (this.cartLinked1 != null) {
				if (cartLinked1.Link1 == this.uniqueID) {
					cartLinked1.Link1 = 0;
					cartLinked1.cartLinked1 = null;
					if(cartLinked1.RollingStock!=null)cartLinked1.RollingStock.clear();
					//System.out.println("clear cartLinked1 link1");
				}
				else if (cartLinked1.Link2 == this.uniqueID) {
					cartLinked1.Link2 = 0;
					cartLinked1.cartLinked2 = null;
					if(cartLinked1.RollingStock!=null)cartLinked1.RollingStock.clear();
					//System.out.println("clear cartLinked1 link2");
				}
			}
			if (this.cartLinked2 != null) {
				if (cartLinked2.Link1 == this.uniqueID) {
					cartLinked2.Link1 = 0;
					cartLinked2.cartLinked1 = null;
					if(cartLinked2.RollingStock!=null)cartLinked2.RollingStock.clear();
					//System.out.println("clear cartLinked2 link1");
				}
				else if (cartLinked2.Link2 == this.uniqueID) {
					cartLinked2.Link2 = 0;
					cartLinked2.cartLinked2 = null;
					if(cartLinked2.RollingStock!=null)cartLinked2.RollingStock.clear();
					//System.out.println("clear cartLinked2 link2");
				}
			}
			this.cartLinked1 = null;
			this.cartLinked2 = null;
			this.isAttached = false;
		}
	}

	@Override
	public void setDead() {
		super.setDead();
		this.unLink();
		if (train != null) {
			if (train.getTrains() != null) {
				for (int i2 = 0; i2 < train.getTrains().size(); i2++) {
					if ((train.getTrains().get(i2)) instanceof Locomotive) {
						train.getTrains().get(i2).cartLinked1 = null;
						train.getTrains().get(i2).Link1 = 0;
						train.getTrains().get(i2).cartLinked2 = null;
						train.getTrains().get(i2).Link2 = 0;
					}
					if ((train.getTrains().get(i2)) != this) {
						if (train != null && train.getTrains() != null && train.getTrains().get(i2) != null && train.getTrains().get(i2).train != null && train.getTrains().get(i2).train.getTrains() != null) train.getTrains().get(i2).train.getTrains().clear();
					}
				}
			}
		}
		if (train != null && train.getTrains().size() <= 1) {
			train.getTrains().clear();
			allTrains.remove(train);
		}
		if (this.bogieLoco != null) {
			bogieLoco.setDead();
			bogieLoco.isDead = true;
		}
		isDead = true;
		Side side = FMLCommonHandler.instance().getEffectiveSide();
		if (side == Side.CLIENT) {
			soundUpdater();
		}
	}

	@Override
	public boolean canBeCollidedWith() {
		return !isDead;
	}

	public void pressKey(int i) {}

	/**
	 * gets packet from server and distribute for GUI handles motion
	 *
	 * @param i
	 */
	public void keyHandlerFromPacket(int i) {
		this.pressKey(i);
	}

	private void handleTrain() {
		if (this instanceof Locomotive && train != null) {
			for (int i2 = 0; i2 < train.getTrains().size(); i2++) {
				if (RailTools.isCartLockedDown(train.getTrains().get(i2))) {
					cartLocked = true;
					/** If something in the train is locked down */
					ticksSinceHeld = 40;
					if (!((Locomotive) this).canBeAdjusted) {
						((Locomotive) this).setCanBeAdjusted(true);
						//System.out.println(((Locomotive)this)+" canBeAdjusted=true");
					}
				}
				cartLocked = false;
			}
			if (ticksSinceHeld > 0 && !cartLocked) {
				ticksSinceHeld--;
			}
			if (ticksSinceHeld <= 0 && !cartLocked) {
				if (((Locomotive) this).canBeAdjusted && !((Locomotive) this).canBePulled) {
					((Locomotive) this).setCanBeAdjusted(false);
					//System.out.println(((Locomotive)this)+" canBeAdjusted=false");
				}
			}
		}

		/*
		 * if(train!=null && RailTools.isCartLockedDown((EntityMinecart) this)){
		 * train.setTicksSinceHeld(100); train.setCartLocked(true); for(int
		 * i2=0;i2<train.getTrains().size();i2++){ if(train.getTrains().get(i2)
		 * instanceof Locomotive &&
		 * !((Locomotive)train.getTrains().get(i2)).canBeAdjusted){
		 * ((Locomotive)train.getTrains().get(i2)).setCanBeAdjusted(true);
		 * System
		 * .out.println(((Locomotive)train.getTrains().get(i2))+"canBeAdjusted=true"
		 * ); } } }
		 */

		/**
		 * if the global train list is empty this is only used when the first @EntityRollingStock
		 * is put down or when the world reloads
		 */
		if (updateTicks % 40 != 0) return;
		if (allTrains.size() == 0) {
			//System.out.println("array empty");
			if ((this.cartLinked1 != null || this.cartLinked2 != null)) {
				//System.out.println("array empty => add");
				train = new TrainHandler(this);
			}
			/**
			 * This is used when global train list isn't empty but this @EntityRollingStock
			 * isn't part of a train yet
			 */
		}
		else if (train == null || (train != null && train.getTrains().size() == 0)) {
			if ((this.cartLinked1 != null || this.cartLinked2 != null)) {
				if (this.cartLinked1 != null && cartLinked1.train != null && cartLinked1.train.getTrains() != null && cartLinked1.train.getTrains().size() != 0) {
					train = cartLinked1.train;
					return;
				}
				if (this.cartLinked2 != null && cartLinked2.train != null && cartLinked2.train.getTrains() != null && cartLinked2.train.getTrains().size() != 0) {
					train = cartLinked2.train;
					return;
				}
				//System.out.println("add");
				train = new TrainHandler(this);
			}
		}
		/**
		 * getting main locomotive of the train and copying its destination to
		 * all attached carts
		 */
		if (train != null && train.getTrains().size() > 1) {
			if (this instanceof Locomotive && !((Locomotive) this).canBeAdjusted && this.getDestination().length() > 0) {
				for (int i = 0; i < train.getTrains().size(); i++) {
					if (train.getTrains().get(i) != null && !train.getTrains().get(i).equals(this)) train.getTrains().get(i).destination = this.getDestination();
					CartTools.setCartOwner(train.getTrains().get(i), CartTools.getCartOwner(this));
				}
			}
		}
		/**
		 * Resets destination
		 */
		else if (!(this instanceof Locomotive)) {
			destination = "";
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	/**
	 * Sets the position and rotation. Only difference from the other one is no bounding on the rotation. Args: posX,
	 * posY, posZ, yaw, pitch
	 */
	public void setPositionAndRotation2(double par1, double par3, double par5, float par7, float par8, int par9) {
		this.rollingX = par1;
		this.rollingY = par3;
		this.rollingZ = par5;
		this.rollingPitch = par8;
		this.rollingturnProgress = par9 + 2;
		this.motionX = this.rollingVelocityX;
		this.motionY = this.rollingVelocityY;
		this.motionZ = this.rollingVelocityZ;
	}

	List list =null;
	Block l;

	@Override
	public void onUpdate() {

		if (addedToChunk && !this.hasSpawnedBogie && this.trainSpec.getBogieLocoPosition() != 0) {
				//System.out.println(i + " " + this.trainSpec.getBogiePositions()[i]);
				if (bogieLoco == null) {
					this.bogieShift = this.trainSpec.getBogieLocoPosition();
					this.bogieLoco = new EntityBogie(worldObj,
							(posX - Math.cos(this.serverRealRotation * TraincraftUtil.radian) * this.bogieShift),
							posY + ((Math.tan(this.renderPitch * TraincraftUtil.radian) * -this.bogieShift) + getMountedYOffset()),
							(posZ - Math.sin(this.serverRealRotation * TraincraftUtil.radian) * this.bogieShift), this, this.uniqueID, 0, this.bogieShift);

					//if(!worldObj.isRemote)System.out.println("ID: "+this.getID());
					if (!worldObj.isRemote) worldObj.spawnEntityInWorld(bogieLoco);
					this.needsBogieUpdate = true;
				}
				this.hasSpawnedBogie = true;
		}
		
		super.manageChunkLoading();
		
		/**
		 * Set the uniqueID if the entity doesn't have one.
		 */
		if (!worldObj.isRemote && this.uniqueID == -1) {
			if (FMLCommonHandler.instance().getMinecraftServerInstance() != null) {
				//TraincraftSaveHandler.createFile(FMLCommonHandler.instance().getMinecraftServerInstance());
				//int readID = TraincraftSaveHandler.readInt(FMLCommonHandler.instance().getMinecraftServerInstance(), "numberOfTrains:");
				//int newID = setNewUniqueID(readID);
				
					//TraincraftSaveHandler seems to not work, may cause uniqueID bug.
				setNewUniqueID(this.getEntityId());
				
				//TraincraftSaveHandler.writeValue(FMLCommonHandler.instance().getMinecraftServerInstance(), "numberOfTrains:", "" + newID);
				//System.out.println("Train is missing an ID, adding new one for "+this.trainName+" "+this.uniqueID);
			}
		}

		if (riddenByEntity instanceof EntityPlayer){
			((EntityPlayer) riddenByEntity).addPotionEffect(new PotionEffect(Potion.resistance.id, 20, 5, true));
		}

		if (getRollingAmplitude() > 0) {
			setRollingAmplitude(getRollingAmplitude() - 1);
		}
		if (getDamage() > 0) {
			setDamage(getDamage() - 1);
		}

		isBraking = false;

		if (worldObj.isRemote && Traincraft.proxy.getCurrentScreen() == null && riddenByEntity instanceof EntityLivingBase) {
			EntityLivingBase entity = (EntityLivingBase) riddenByEntity;
			if (TraincraftEntityHelper.getIsJumping(entity)) isBraking = true;
		}

		int var2;
		if (!this.worldObj.isRemote && this.worldObj instanceof WorldServer) {
			this.worldObj.theProfiler.startSection("portal");
			MinecraftServer var1 = MinecraftServer.getServer();
			var2 = this.getMaxInPortalTime();

			if (this.inPortal) {
				if (var1.getAllowNether()) {
					if (this.ridingEntity == null && this.portalCounter++ >= var2) {
						this.portalCounter = var2;
						this.timeUntilPortal = this.getPortalCooldown();
						byte var3;

						if (this.worldObj.provider.dimensionId == -1) {
							var3 = 0;
						}
						else {
							var3 = -1;
						}

						this.travelToDimension(var3);
					}

					this.inPortal = false;
				}
			}
			else {
				if (this.portalCounter > 0) {
					this.portalCounter -= 4;
				}

				if (this.portalCounter < 0) {
					this.portalCounter = 0;
				}
			}

			if (this.timeUntilPortal > 0) {
				--this.timeUntilPortal;
			}

			this.worldObj.theProfiler.endSection();
		}

		Side side = FMLCommonHandler.instance().getEffectiveSide();
		if (side == Side.CLIENT) {
			soundUpdater();
		}

		if (worldObj.isRemote) {
			clientTicks++;
			//rotationYaw = (float) rotationYawClient;
			if (rollingturnProgress > 0) {
				rotationYaw = (float) rotationYawClient;
				this.rotationPitch = (float) (this.rotationPitch + (this.rollingPitch - this.rotationPitch) / this.rollingturnProgress);

				this.setPosition(this.posX + (this.rollingX - this.posX) / this.rollingturnProgress,
						this.posY + (this.rollingY - this.posY) / this.rollingturnProgress,
						this.posZ + (this.rollingZ - this.posZ) / this.rollingturnProgress);
				--this.rollingturnProgress;
				this.setRotation(this.rotationYaw, this.rotationPitch);
				//System.out.println("1 client "+var46 +" Server "+this.posYFromServer + "ticks "+clientTicks);
			}
			else {
				setPosition(posX, posY, posZ);
				setRotation(rotationYaw, rotationPitch);
				//System.out.println("2 client "+posY +" Server "+this.posYFromServer);
			}
			if (posYFromServer != 0 && clientTicks < 600 && posY > posYFromServer && shouldServerSetPosYOnClient && Math.abs(posY - posYFromServer) > 0.04) {
				//System.out.println(posYFromServer);
				posY = posYFromServer;
			}
			return;
		}

		/*
		 * if(this.updateTicks<5){
		 * System.out.println(this.getID()+" "+this.entityName); }
		 */
		/**
		 * As entities can't be registered in nbttagcompound I had to setup this
		 * system... When world loads, only the (double) Link1 and Link2 are
		 * known. This method search for the entity with the ID corresponding to
		 * Link1 or Link2 When it finds it, (EntityRollingStock)cartLinked1 and
		 * cartLinked2 will be updated accordingly
		 */
		if (addedToChunk && ((this.cartLinked1 == null && this.Link1 != 0) || (this.cartLinked2 == null && this.Link2 != 0))) {
			list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.expand(15, 15, 15));
			//System.out.println("link " + this.uniqueID + " " + this + " to " + this.Link1 + " " + this.Link2);
			if (list != null && list.size() > 0) {
				for (Object entity : list) {
					if (entity instanceof EntityRollingStock) {
						if (((EntityRollingStock) entity).uniqueID == this.Link1) {
							this.cartLinked1 = (EntityRollingStock) entity;
						}
						else if (((EntityRollingStock) entity).uniqueID == this.Link2) {
							this.cartLinked2 = (EntityRollingStock) entity;
						}
					}
				}
			}
		}

		prevPosX = posX;
		prevPosY = posY;
		prevPosZ = posZ;

		int i = MathHelper.floor_double(posX);
		int j = MathHelper.floor_double(posY);
		int k = MathHelper.floor_double(posZ);
		//System.out.println(this.serverRealRotation);
		if (needsBogieUpdate) {
			if (bogieLoco != null) {
				float rotationCos1 = (float) Math.cos(Math.toRadians(serverRealRotation));
				float rotationSin1 = (float) Math.sin(Math.toRadians((serverRealRotation)));
				if (!firstLoad) {
					rotationCos1 = (float) Math.cos(Math.toRadians(serverRealRotation + 90));
					rotationSin1 = (float) Math.sin(Math.toRadians((serverRealRotation + 90)));
				}
				double bogieX1 = (this.posX + (rotationCos1 * Math.abs(bogieShift)));
				double bogieZ1 = (this.posZ + (rotationSin1 * Math.abs(bogieShift)));
				this.bogieLoco.setPosition(bogieX1, bogieLoco.posY, bogieZ1);
				/*
				 * double rads = this.serverRealRotation *
				 * 3.141592653589793D / 180.0D; double pitchRads =
				 * this.renderPitch * 3.141592653589793D / 180.0D;
				 * this.bogieLoco[bog].setPosition((float) (posX -
				 * Math.cos(rads) * this.bogieShift[bog]), (float) posY +
				 * ((Math.tan(pitchRads) * -this.bogieShift[bog]) +
				 * getMountedYOffset()), (float) (posZ - Math.sin(rads) *
				 * this.bogieShift[bog]));
				 */
			}
			firstLoad = false;
			/*
			 * for (int bog = 0; bog < this.bogieUtility.length; bog++) { if
			 * (bogieUtility[bog] != null) {
			 *
			 * double rads = this.serverRealRotation * 3.141592653589793D /
			 * 180.0D; double pitchRads = this.renderPitch * 3.141592653589793D
			 * / 180.0D; this.bogieUtility[bog].setPosition((float) (posX -
			 * Math.cos(rads) * this.bogieShift[bog]), (float) posY +
			 * ((Math.tan(pitchRads) * -this.bogieShift[bog]) +
			 * getMountedYOffset()), (float) (posZ - Math.sin(rads) *
			 * this.bogieShift[bog]));
			 * //System.out.println("updatePos "+this.bogieUtility
			 * [bog].posX+" "+ this.bogieUtility[bog].posY
			 * +" "+this.bogieUtility[bog].posZ); } }
			 */
			needsBogieUpdate = false;
		}
		if (!needsBogieUpdate) {
				if (bogieLoco != null) {
					bogieLoco.updateDistance();
				}
		}

		if (isRailBlockAt(worldObj, i, j - 1, k) || worldObj.getBlock(i, j - 1, k) == BlockIDs.tcRail.block || worldObj.getBlock(i, j - 1, k) == BlockIDs.tcRailGag.block) {
			j--;
		} else if (isRailBlockAt(worldObj, i, j + 1, k) || worldObj.getBlock(i, j + 1, k) == BlockIDs.tcRail.block || worldObj.getBlock(i, j + 1, k) == BlockIDs.tcRailGag.block) {
			j++;
		}
		
		l = worldObj.getBlock(i, j, k);

		updateOnTrack(i, j, k, l);
		// System.out.println(this.posY);

		updateTicks++;
		d6 = prevPosX - posX;
		d7 = prevPosZ - posZ;
		prevRotationYaw = rotationYaw;
		//System.out.println("before "+rotationYaw +" "+prevRotationYaw);
		//this.rotationPitch = 0.0F;
		//System.out.println(Math.sqrt(d6*d6+d7*d7));
		if (d6 * d6 + d7 * d7 > 0.0001D) {
			this.rotationYaw = (float) (Math.atan2(d7, d6) * 180.0D / Math.PI);
			if (this.isClientInReverse) {
				this.rotationYaw += 180.0F;
			}
		}

		//double var49 = MathHelper.wrapAngleTo180_float(this.rotationYaw - this.prevRotationYaw);

		float anglePitch=0;
		if (bogieLoco != null) {

			serverRealRotation = MathHelper.wrapAngleTo180_float((float) Math.toDegrees(Math.atan2((float) (bogieLoco.posZ - this.posZ), (float) (bogieLoco.posX - this.posX))) - 90F);

			anglePitch = (float) Math.atan(((bogieLoco.posY - posY)) /
					MathHelper.sqrt_double(((bogieLoco.posX - posX) * (bogieLoco.posX - posX)) +
							((bogieLoco.posZ - posZ) * (bogieLoco.posZ - posZ))));//1.043749988079071
			serverRealPitch = anglePitch +(float)
							((bogieLoco.posZ - posZ) * (bogieLoco.posZ - posZ));//1.043749988079071
		}
		else {
			float rotation = rotationYaw;

			float delta = MathHelper.wrapAngleTo180_float(this.rotationYaw - this.previousServerRealRotation); //Math.abs(this.rotationYaw - this.previousServerRealRotation);

			this.previousServerRealRotation = this.rotationYaw;

			if (delta < -179.0F || delta > 179.0F) { // if (delta > 170.0F || delta < 190.0F) {

				this.rotationYaw += 180.0F;
				this.isServerInReverse = !this.isServerInReverse;
			}
			previousServerRealRotation = rotation;
			if (this.isServerInReverse) {
				if (serverInReverseSignPositive) {
					rotation += 180.0f;
				}
				else {
					rotation -= 180.0f;
				}
			}

			serverRealRotation = rotation;

			double zDist = posZ - prevPosZ;
			double xDist = posX - prevPosX;
			float tempPitch = rollingServerPitch;
			float tempPitch2 = tempPitch;
			if (Math.abs(zDist) > 0.02) {
				double rads = Math.atan((posY - prevPosY) / zDist);
				tempPitch = (float) ((Math.atan((posY - prevPosY) / zDist)) * degrees);
			}
			else if (Math.abs(xDist) > 0.02) {
				tempPitch = (float) (( Math.atan((posY - prevPosY) / xDist)) * degrees);
				//pitch=tempPitch;
			}

			//if (Math.abs(tempPitch) > 16) {
				//tempPitch=Math.copySign(16, tempPitch);
			//}
			if (tempPitch2 < tempPitch && Math.abs(tempPitch2 - tempPitch) > 3) {
				tempPitch2 += 3;
			}
			else if (tempPitch2 > tempPitch && Math.abs(tempPitch2 - tempPitch) > 3) {
				tempPitch2 -= 3;
			}
			else if (tempPitch2 < tempPitch && Math.abs(tempPitch2 - tempPitch) > 0.5) {
				tempPitch2 += 0.5;
			}
			else if (tempPitch2 > tempPitch && Math.abs(tempPitch2 - tempPitch) > 0.5) {
				tempPitch2 -= 0.5;
			}
			anglePitch = -tempPitch2;
			rollingServerPitch = tempPitch2;
		}
		//System.out.println(updateTicks);
		if (updateTicks % 2 == 0) {
			shouldServerSetPosYOnClient = true;
		}
		if (shouldServerSetPosYOnClient) {
			Traincraft.rotationChannel.sendToAllAround(new PacketRollingStockRotation(this, (int) (anglePitch * 60)), new TargetPoint(worldObj.provider.dimensionId, posX, posY, posZ, 300.0D));
			shouldServerSetPosYOnClient = false;
		}
		if(!worldObj.isRemote){
			anglePitchClient=(anglePitch * 60);
		}

		//this.setRotation(this.rotationYaw, this.rotationPitch);

		list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, getCollisionHandler()!=null?
				getCollisionHandler().getMinecartCollisionBox(this):
				boundingBox.expand(0.2D, 0.0D, 0.2D));

		if (list != null && !list.isEmpty()) {
			Entity entity;
			for (Object obj : list) {
				entity = (Entity) obj;

				if (entity != this.riddenByEntity && entity.canBePushed() && entity instanceof EntityMinecart) {
					entity.applyEntityCollision(this);
				}
				else if (entity != this.riddenByEntity && entity.canBePushed() && !(entity instanceof EntityMinecart)) {
					this.applyEntityCollision(entity);
				}
			}
		}

		handleTrain();
		handleOverheating.HandleHeatLevel(this);
		linkhandler.handleStake(this, boundingBox);
		collisionhandler.handleCollisions(this, boundingBox);
		this.func_145775_I();
		MinecraftForge.EVENT_BUS.post(new MinecartUpdateEvent(this, i, j, k));
		//setBoundingBoxSmall(posX, posY, posZ, 0.98F, 0.7F);
		numLaps++;
		if ((this instanceof Locomotive) && (this.Link1 == 0) && (this.Link2 == 0) && numLaps > 700) {
			this.RollingStock.clear();
		}

		if (this.riddenByEntity != null && this.riddenByEntity.isDead) {
			if (this.riddenByEntity.ridingEntity == this) {
				this.riddenByEntity.ridingEntity = null;
			}
			this.riddenByEntity = null;
		}
		this.dataWatcher.updateObject(14, (int) (motionX * 100));
		this.dataWatcher.updateObject(21, (int) (motionZ * 100));

		if (ConfigHandler.ENABLE_LOGGING && !worldObj.isRemote && updateTicks%120==0){
			ServerLogger.writeWagonToFolder(this);
		}
	}

	boolean flag,flag1;
	private void updateOnTrack(int i, int j, int k, Block l) {
		if (canUseRail() && BlockRailBase.func_150051_a(l)) {
			
			Vec3 vec3d = func_514_g(posX, posY, posZ);
			 int i1 = ((BlockRailBase) l).getBasicRailMetadata(worldObj, this, i, j, k);
			 meta = i1;
			 posY = j;
			 flag = false;
			 flag1 = false;
			 if (l == Blocks.golden_rail) {
				 flag = (worldObj.getBlockMetadata(i, j, k) & 8) != 0;
				 flag1 = !flag;
				 if (i1 == 8) {i1 = 0;}
				 else if (i1 == 9) {i1 = 1;}
			 }

			if (l == Blocks.detector_rail){
				worldObj.setBlockMetadataWithNotify(i, j, k, meta | 8, 3);
				worldObj.notifyBlocksOfNeighborChange(i, j, k, l);
				worldObj.notifyBlocksOfNeighborChange(i, j - 1, k, l);
				worldObj.markBlockRangeForRenderUpdate(i, j, k, i, j, k);
				worldObj.scheduleBlockUpdate(i, j, k, l, l.tickRate(worldObj));
			}

			 if (i1 >= 2 && i1 <= 5) {
			 posY = (j + 1);
			 }
			
			 adjustSlopeVelocities(i1);
			

			 int ai[][] = matrix[i1];
			 double d9 = ai[1][0] - ai[0][0];
			 double d10 = ai[1][2] - ai[0][2];
			 double d11 = Math.sqrt(d9 * d9 + d10 * d10);
			 if (motionX * d9 + motionZ * d10 < 0.0D) {
			 d9 = -d9;
			 d10 = -d10;
			 }
			 double d13 = Math.sqrt(motionX * motionX + motionZ * motionZ);
			 motionX = (d13 * d9) / d11;
			 motionZ = (d13 * d10) / d11;
			 if (flag1 && shouldDoRailFunctions()) {
			 if (Math.sqrt(motionX * motionX + motionZ * motionZ) < 0.029999999999999999D) {
			 motionX = 0.0D;
			 motionY = 0.0D;
			 motionZ = 0.0D;
			 }
			 else {
			 motionX *= 0.5D;
			 motionY *= 0.0D;
			 motionZ *= 0.5D;
			 }
			 }
			 double d17 = 0.0D;
			 double d18 = i + 0.5D + ai[0][0] * 0.5D;
			 double d19 = k + 0.5D + ai[0][2] * 0.5D;
			 double d20 = i + 0.5D + ai[1][0] * 0.5D;
			 double d21 = k + 0.5D + ai[1][2] * 0.5D;
			 d9 = d20 - d18;
			 d10 = d21 - d19;
			 if (d9 == 0.0D) {
			 posX = i + 0.5D;
			 d17 = posZ - k;
			 }
			 else if (d10 == 0.0D) {
			 posZ = k + 0.5D;
			 d17 = posX - i;
			 }
			 else {
			 double d22 = posX - d18;
			 double d24 = posZ - d19;
			 d17 = (d22 * d9 + d24 * d10) * 2D;
			 //double derailSpeed = 0;//0.46;
			 //System.out.println(d13);
			 if(bogieLoco != null) {
				 if (!bogieLoco.isOnRail()) {
					 derailSpeed = 0;
					 this.unLink();
				 }
			 }
			 /**
			 * Handles derail
			 */
			 if (this instanceof Locomotive && d13 > derailSpeed && i1 >= 6) {
			 if (d9 > 0 && d10 < 0) {
			 d10 = 0;
			 d9 += 2;
			 }
			 else if (d9 < 0 && d10 > 0) {
			 d9 = 0;
			 d10 += 2;
			 }
			 else if (d10 < 0 && d9 < 0) {
			 d10 -= 2;
			 d9 = 0;
			 }
			 else if (d9 > 0 && d10 > 0) {
			 d10 += 2;
			 d9 = 0;
			 }
			 if (FMLCommonHandler.instance().getMinecraftServerInstance() != null &&
			 this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer) {
			 FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().sendChatMsg(new
						ChatComponentText(((EntityPlayer) this.riddenByEntity).getDisplayName() + "derailed"
								+ this.trainOwner + "'s locomotive"));
			 }
			 }
			
			 }
			 posX = d18 + d9 * d17;
			 posZ = d19 + d10 * d17;
			setPosition(posX, posY + yOffset + 0.35, posZ);

			 moveMinecartOnRail(i, j, k, 0.0D);
			
			 if (ai[0][1] != 0 && MathHelper.floor_double(posX) - i == ai[0][0] &&
			 MathHelper.floor_double(posZ) - k == ai[0][2]) {
			 setPosition(posX, posY + ai[0][1], posZ);
			 }
			 else if (ai[1][1] != 0 && MathHelper.floor_double(posX) - i == ai[1][0] &&
			 MathHelper.floor_double(posZ) - k == ai[1][2]) {
			 setPosition(posX, posY + ai[1][1], posZ);
			 }
			
			 applyDragAndPushForces();
			
			Vec3 vec3d1 = func_514_g(posX, posY, posZ);
			if (vec3d1 != null && vec3d != null) {
				double d28 = (vec3d.yCoord - vec3d1.yCoord) * 0.050000000000000003D;
				if (this instanceof Locomotive) d28 = 0;
				double d14 = Math.sqrt(motionX * motionX + motionZ * motionZ);
				if (d14 > 0.0D) {
					motionX = (motionX / d14) * (d14 + d28);
					motionZ = (motionZ / d14) * (d14 + d28);
				}
				setPosition(posX, posY + yOffset - 0.8d, posZ);
			}
			 int k1 = MathHelper.floor_double(posX);
			 int l1 = MathHelper.floor_double(posZ);
			 if (k1 != i || l1 != k) {
			 double d15 = Math.sqrt(motionX * motionX + motionZ * motionZ);
			 motionX = d15 * (k1 - i);
			 motionZ = d15 * (l1 - k);
			 }
			
			 if (shouldDoRailFunctions()) {
			 ((BlockRailBase) l).onMinecartPass(worldObj, this, i, j, k);
			 }
			
			 if (flag && shouldDoRailFunctions()) {
			 double d31 = Math.sqrt(motionX * motionX + motionZ * motionZ);
			 if (d31 > 0.01D) {
			 motionX += (motionX / d31) * 0.059999999999999998D;
			 motionZ += (motionZ / d31) * 0.059999999999999998D;
			 }
			 else if (i1 == 1) {
			 if (worldObj.isBlockNormalCubeDefault(i - 1, j, k,false)) {
			 motionX = 0.02D;
			 }
			 else if (worldObj.isBlockNormalCubeDefault(i + 1, j, k,false)) {
			 motionX = -0.02D;
			 }
			 }
			 else if (i1 == 0) {
			 if (worldObj.isBlockNormalCubeDefault(i, j, k - 1,false)) {
			 motionZ = 0.02D;
			 }
			 else if (worldObj.isBlockNormalCubeDefault(i, j, k + 1,false)) {
			 motionZ = -0.02D;
			 }
			 }
			 }
		}
		else if (l == BlockIDs.tcRail.block) {
			//applyDragAndPushForces();
			limitSpeedOnTCRail();
			//if(worldObj.getTileEntity(i,j,k)==null || !(worldObj.getTileEntity(i,j,k) instanceof TileTCRail))return;
			TileTCRail tile = (TileTCRail) worldObj.getTileEntity(i, j, k);

			//System.out.println(tile.getType());
			if (ItemTCRail.isTCTurnTrack(tile)) {
				
				if(bogieLoco != null) {
					if (!bogieLoco.isOnRail()) {
						derailSpeed = 0;
					}
				}
				if(derailSpeed == 0){
					this.unLink();
					moveOnTCStraight(i, j, k, tile.xCoord, tile.zCoord, (tile.getBlockMetadata()+1)%4);
				}
				else{
					int meta = tile.getBlockMetadata();
					if (shouldIgnoreSwitch(tile, i, j, k, meta)) {
						moveOnTCStraight(i, j, k, tile.xCoord, tile.zCoord, meta);
					} else {
						if (ItemTCRail.isTCTurnTrack(tile))
							moveOnTC90TurnRail(i, j, k, tile.r, tile.cx, tile.cz);
					}
					// shouldIgnoreSwitch(tile, i, j, k, meta);
					// if (ItemTCRail.isTCTurnTrack(tile)) moveOnTC90TurnRail(i, j, k, r, cx, cy,
					// cz, tile.getType(), meta);
				}
			}
			if (ItemTCRail.isTCStraightTrack(tile)) {
				moveOnTCStraight(i, j, k, tile.xCoord, tile.zCoord, tile.getBlockMetadata());
			}
			if (ItemTCRail.isTCSlopeTrack(tile)) {
				moveOnTCSlope( j, tile.xCoord, tile.zCoord, tile.slopeAngle, tile.slopeHeight, tile.getBlockMetadata());
			}
			if (ItemTCRail.isTCTwoWaysCrossingTrack(tile)) {
				moveOnTCTwoWaysCrossing(i, j, k, tile.xCoord, tile.yCoord, tile.zCoord, tile.getBlockMetadata());
			}

		}
		else if (l == BlockIDs.tcRailGag.block) {
			//applyDragAndPushForces();
			limitSpeedOnTCRail();
			//if(worldObj.getBlockTileEntity(i,j,k)==null || !(worldObj.getBlockTileEntity(i,j,k) instanceof TileTCRailGag))return;
			TileTCRailGag tileGag = (TileTCRailGag) worldObj.getTileEntity(i, j, k);
			//if(worldObj.getBlockTileEntity(tileGag.originX, tileGag.originY, tileGag.originZ)==null || !(worldObj.getBlockTileEntity(tileGag.originX, tileGag.originY, tileGag.originZ) instanceof TileTCRail))return;
			if (worldObj.getTileEntity(tileGag.originX, tileGag.originY, tileGag.originZ) instanceof TileTCRail) {
				TileTCRail tile = (TileTCRail) worldObj.getTileEntity(tileGag.originX, tileGag.originY, tileGag.originZ);
				//System.out.println(tile.getType());
				if (ItemTCRail.isTCTurnTrack(tile)) {
					moveOnTC90TurnRail(i, j, k, tile.r, tile.cx, tile.cz);
				}
				if (ItemTCRail.isTCStraightTrack(tile)) {
					moveOnTCStraight(i, j, k, tile.xCoord, tile.zCoord, tile.getBlockMetadata());
				}
				if (ItemTCRail.isTCSlopeTrack(tile)) {
					moveOnTCSlope(j, tile.xCoord, tile.zCoord, tile.slopeAngle, tile.slopeHeight, tile.getBlockMetadata());
				}
			}
		}
		else {
			//moveMinecartOffRail(i,j,k);
			super.onUpdate();
		}

	}
	
	private boolean shouldIgnoreSwitch(TileTCRail tile, int i, int j, int k, int meta) {
		if (tile != null
				&& (tile.getType().equals(TrackTypes.MEDIUM_RIGHT_TURN.getLabel())
						|| tile.getType().equals(TrackTypes.MEDIUM_LEFT_TURN.getLabel())
						|| tile.getType().equals(TrackTypes.LARGE_LEFT_TURN.getLabel())
						|| tile.getType().equals(TrackTypes.LARGE_RIGHT_TURN.getLabel()))
				&& tile.canTypeBeModifiedBySwitch) {
			

			if (meta == 2) {
				if (motionZ > 0 && Math.abs(motionX) < 0.01) {
					TileEntity tile2 = worldObj.getTileEntity(i, j, k + 1);
					if (tile2 instanceof TileTCRail) {
						((TileTCRail) tile2).setSwitchState(false, true);
					}
					return true;
				}
			}
			if (meta == 0) {
				if (motionZ < 0 && Math.abs(motionX) < 0.01) {
					TileEntity tile2 = worldObj.getTileEntity(i, j, k - 1);
					if (tile2 instanceof TileTCRail) {
						((TileTCRail) tile2).setSwitchState(false, true);
					}
					return true;
				}
			}
			if (meta == 1) {
				if (Math.abs(motionZ) < 0.01 && motionX > 0) {
					TileEntity tile2 = worldObj.getTileEntity(i + 1, j, k);
					if (tile2 instanceof TileTCRail) {
						((TileTCRail) tile2).setSwitchState(false, true);
					}
					return true;
				}
			}
			if (meta == 3) {
				if (Math.abs(motionZ) < 0.01 && motionX < 0) {
					TileEntity tile2 = worldObj.getTileEntity(i - 1, j, k);
					if (tile2 instanceof TileTCRail) {
						((TileTCRail) tile2).setSwitchState(false, true);
					}
					return true;
				}
			}
		}
		return false;
	}

	private void moveOnTCStraight(int i, int j, int k, double cx, double cz, int meta) {
		posY = j + 0.2;
		if (meta == 2 || meta == 0) {
			double norm = Math.sqrt(motionX * motionX + motionZ * motionZ);

			setPosition(cx + 0.5, posY + yOffset, posZ);
			//setPosition(posX, posY + yOffset, posZ);

			motionX = 0;
			motionZ = Math.copySign(norm, motionZ);
			this.boundingBox.offset(0, 0 , Math.copySign(norm, this.motionZ));

			List boxes = worldObj.getCollidingBoundingBoxes(this, boundingBox);
			for(Object b : boxes){
				if(!(b instanceof BlockRailBase) && !(b instanceof BlockTCRail) && !(b instanceof BlockTCRailGag) && !(b instanceof BlockAir)){
					return;
				}
			}
			this.posX = (this.boundingBox.minX + this.boundingBox.maxX) / 2.0D;
			this.posY = this.boundingBox.minY + (double)this.yOffset - (double)this.ySize;
			this.posZ = (this.boundingBox.minZ + this.boundingBox.maxZ) / 2.0D;

			//System.out.println("straight z "+Math.copySign(norm, motionZ));
		}
		if (meta == 1 || meta == 3) {

			setPosition(posX, posY + yOffset, cz + 0.5);
			//setPosition(posX, posY + yOffset, posZ);

			motionX = Math.copySign(Math.sqrt(motionX * motionX + motionZ * motionZ), motionX);
			motionZ = 0;
			this.boundingBox.offset(motionX, 0 , 0);

			List boxes = worldObj.getCollidingBoundingBoxes(this, boundingBox);
			for(Object b : boxes){
				if(!(b instanceof BlockRailBase) && !(b instanceof BlockTCRail) && !(b instanceof BlockTCRailGag) && !(b instanceof BlockAir)){
					return;
				}
			}
			this.posX = (this.boundingBox.minX + this.boundingBox.maxX) / 2.0D;
			this.posY = this.boundingBox.minY + (double)this.yOffset - (double)this.ySize;
			this.posZ = (this.boundingBox.minZ + this.boundingBox.maxZ) / 2.0D;

			//System.out.println("straight x "+Math.copySign(norm, motionX));
		}
	}

	private void moveOnTCSlope(int j, double cx, double cz, double slopeAngle, double slopeHeight, int meta) {
		//posY = j + 2.5;
		if (meta == 2 || meta == 0) {

			if (meta == 2) {
				cz += 1;
			}

			double norm = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
			this.setPosition(cx + 0.5D,  Math.abs(j + (Math.tan(slopeAngle * Math.abs(cz - this.posZ))) + this.yOffset +0.3), this.posZ);
			this.boundingBox.offset(0, 0 , Math.copySign(norm, this.motionZ));
			this.posX = (this.boundingBox.minX + this.boundingBox.maxX) / 2.0D;
			this.posY = this.boundingBox.minY + (double)this.yOffset - (double)this.ySize;
			this.posZ = (this.boundingBox.minZ + this.boundingBox.maxZ) / 2.0D;

			if (!(this instanceof Locomotive) && !(this instanceof EntityTracksBuilder)) {
				if ((this.posY - this.prevPosY) < 0) {
					norm *= 1.02;
				} else if ((this.posY - this.prevPosY) > 0) {
					norm *= 0.98;
				}
				if (norm < 0.01) {
					//System.out.println(motionZ);
					if ((motionZ) < 0 && meta == 2) {
						norm += 0.0001;
						motionZ = Math.copySign(motionZ, 1);
					}
					if ((motionZ) > 0 && meta == 0) {
						norm += 0.0001;
						motionZ = Math.copySign(motionZ, -1);
					}
				}
			}

			this.motionX = 0.0D;
			this.motionY = 0.0D;
			this.motionZ = Math.copySign(norm, this.motionZ);
		}
		else if (meta == 1 || meta == 3) {
			if (meta == 1) {
				cx += 1;
			}

			double norm = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
			this.setPosition(this.posX, (j + (Math.tan(slopeAngle * Math.abs(cx - this.posX))) + this.yOffset+0.3), cz + 0.5D);
			this.boundingBox.offset(Math.copySign(norm, this.motionX), 0 ,0);
			this.posX = (this.boundingBox.minX + this.boundingBox.maxX) / 2.0D;
			this.posY = this.boundingBox.minY + (double)this.yOffset - (double)this.ySize;
			this.posZ = (this.boundingBox.minZ + this.boundingBox.maxZ) / 2.0D;

			if (!(this instanceof Locomotive) && !(this instanceof EntityTracksBuilder)) {
				if ((this.posY - this.prevPosY) < 0) {
					norm *= 1.02;
				} else if ((this.posY - this.prevPosY) > 0) {
					norm *= 0.98;
				}
				if (norm < 0.01) {
					//System.out.println(motionX);
					if ((motionX) < 0 && meta == 1) {
						norm += 0.0001;
						motionX = Math.copySign(motionX, 1);
					}
					if ((motionX) > 0 && meta == 3) {
						norm += 0.0001;
						motionX = Math.copySign(motionX, -1);
					}
				}
			}
			this.motionX = Math.copySign(norm, this.motionX);
			this.motionY = 0.0D;
			this.motionZ = 0.0D;
		}
	}

	protected void moveOnTC90TurnRail(int i, int j, int k, double r, double cx, double cz) {
		//System.out.println("curve");
		posY = j + 0.2;
		double cpx = posX - cx;
		double cpz = posZ - cz;
		double cp_norm = Math.sqrt(cpx * cpx + cpz * cpz);

		double vnorm = Math.sqrt(motionX * motionX + motionZ * motionZ);

		double vx2 = -(cpz / cp_norm) * vnorm;//-v
		double vz2 = (cpx / cp_norm) * vnorm;//u

		double px2_cx = (posX + motionX * 2) - cx;
		double pz2_cz = (posZ + motionZ * 2) - cz;

		double p2_c_norm = Math.sqrt((px2_cx * px2_cx) + (pz2_cz * pz2_cz));

		vx2 = Math.copySign(vx2, (cx + ((px2_cx / p2_c_norm) * r)) - posX);
		vz2 = Math.copySign(vz2, (cz + ((pz2_cz / p2_c_norm) * r)) - posZ);

		setPosition(cx + ((cpx / cp_norm) * r), posY + yOffset, cz + ((cpz / cp_norm) * r));

		moveEntity(vx2, 0.0D, vz2);

		motionX = vx2;
		motionZ = vz2;

	}

	protected void moveOnTCTwoWaysCrossing(int i, int j, int k, double cx, double cy, double cz, int meta) {
		posY = j + 0.2;

		if (!(this instanceof Locomotive)) {
			int l = MathHelper.floor_double(serverRealRotation * 4.0F / 360.0F + 0.5D) & 3;
			//System.out.println(l);
			if (l == 2 || l == 0){
				moveEntity(motionX, 0.0D, 0.0D);
			} else if (l == 1 || l == 3){
				moveEntity(0.0D, 0.0D, motionZ);
			}
		}
		else {
			int l = MathHelper.floor_double(rotationYaw * 4.0F / 360.0F + 0.5D) & 3;
			//System.out.println(l);
			if (l == 2 || l == 0){
				moveEntity(motionX, 0.0D, 0.0D);
			}
			else if (l == 1 || l == 3){
				moveEntity(0.0D, 0.0D, motionZ);
			}
			//moveEntity(motionX, 0.0D, motionZ);
		}
	}

	public void limitSpeedOnTCRail() {
		railMaxSpeed = 3;
		maxSpeed = Math.min(railMaxSpeed, getMaxCartSpeedOnRail());
		maxSpeed = SpeedHandler.handleSpeed(railMaxSpeed, maxSpeed, this);
		//System.out.println(maxSpeed);
		if (this.speedLimiter != 0 && speedWasSet) {
			//maxSpeed *= this.speedLimiter;
			adjustSpeed(maxSpeed, speedLimiter);
		}
		motionX *= 0.9D;
		motionZ *= 0.9D;

		if (motionX < -maxSpeed) {
			motionX = -maxSpeed;
		}
		if (motionX > maxSpeed) {
			motionX = maxSpeed;
		}
		if (motionZ < -maxSpeed) {
			motionZ = -maxSpeed;
		}
		if (motionZ > maxSpeed) {
			motionZ = maxSpeed;
		}
	}

	protected void moveMinecartOffRail(int i, int j, int k) {
		motionY -= 0.039999999105930328D;
		double d2 = getMaxCartSpeedOnRail();
		if (!onGround) {
			d2 = getMaxSpeedAirLateral();
		}
		if (motionX < -d2) motionX = -d2;
		if (motionX > d2) motionX = d2;
		if (motionZ < -d2) motionZ = -d2;
		if (motionZ > d2) motionZ = d2;
		double moveY = motionY;
		if (getMaxSpeedAirVertical() > 0 && motionY > getMaxSpeedAirVertical()) {
			moveY = getMaxSpeedAirVertical();
			if (Math.abs(motionX) < 0.3f && Math.abs(motionZ) < 0.3f) {
				moveY = 0.15f;
				motionY = moveY;
			}
		}
		if (onGround) {
			motionX *= 0.5D;
			motionY *= 0.5D;
			motionZ *= 0.5D;
		}
		moveEntity(motionX, moveY, motionZ);
		if (!onGround) {
			motionX *= getDragAir();
			motionY *= getDragAir();
			motionZ *= getDragAir();
		}
	}

	public Vec3 func_514_g(double d, double d1, double d2) {
		int i = MathHelper.floor_double(d);
		int j = MathHelper.floor_double(d1);
		int k = MathHelper.floor_double(d2);
		if (isRailBlockAt(worldObj, i, j - 1, k)) {
			j--;
		} else if (isRailBlockAt(worldObj, i, j + 1, k)) {
			j++;
		}
		Block l = worldObj.getBlock(i, j, k);
		if (BlockRailBase.func_150051_a(l)) {
			int i1 = ((BlockRailBase) l).getBasicRailMetadata(worldObj, this, i, j, k);// getBasicRailMetadata2(worldObj, this, i, j, k);
			if (l == Blocks.golden_rail) {
				if (i1 == 8) {
					i1 = 0;
				}
				if (i1 == 9) {
					i1 = 1;
				}
			}
			int ai[][] = matrix[i1];
			double d3 = 0.0D;
			double d4 = i + 0.5D + ai[0][0] * 0.5D;
			double d5 = j + 0.5D + ai[0][1] * 0.5D;
			double d6 = k + 0.5D + ai[0][2] * 0.5D;
			double d7 = i + 0.5D + ai[1][0] * 0.5D;
			double d8 = j + 0.5D + ai[1][1] * 0.5D;
			double d9 = k + 0.5D + ai[1][2] * 0.5D;
			double d10 = d7 - d4;
			double d11 = (d8 - d5) * 2D;
			double d12 = d9 - d6;
			if (d10 == 0.0D) {
				d3 = d2 - k;
			}
			else if (d12 == 0.0D) {
				d3 = d - i;
			}
			else {
				double d13 = d - d4;
				double d14 = d2 - d6;
				d3 =  (d13 * d10 + d14 * d12) * 2D;
			}
			d1 = d5 + d11 * d3;
			if (d11 < 0.0D) {
				d1++;
			}
			else if (d11 > 0.0D) {
				d1 += 0.5D;
			}
			return Vec3.createVectorHelper(d4 + d10 * d3, d1, d6 + d12 * d3);
		}
		else {
			return null;
		}
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		super.writeEntityToNBT(nbttagcompound);
		nbttagcompound.setDouble("speedLimiter", this.speedLimiter);
		nbttagcompound.setFloat("serverRealRotation", this.serverRealRotation);
		nbttagcompound.setFloat("yawRotation", this.rotationYaw);
		//nbttagcompound.setBoolean("hasSpawnedBogie", this.hasSpawnedBogie);
		//nbttagcompound.setBoolean("needsBogieUpdate", this.needsBogieUpdate);
		nbttagcompound.setBoolean("firstLoad", this.firstLoad);
		nbttagcompound.setFloat("rotation", this.rotation);
		nbttagcompound.setBoolean("brake", isBraking);
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		super.readEntityFromNBT(nbttagcompound);
		this.speedLimiter = nbttagcompound.getDouble("speedLimiter");
		this.serverRealRotation = nbttagcompound.getFloat("serverRealRotation");

		if (nbttagcompound.hasKey("yawRotation")){
			rotationYaw = nbttagcompound.getFloat("yawRotation");
		}
		//if (Math.abs(this.serverRealRotation) > 178.5f) this.serverRealRotation = Math.copySign(178.5f, this.serverRealRotation);
		//this.hasSpawnedBogie = nbttagcompound.getBoolean("hasSpawnedBogie");
		//this.needsBogieUpdate = nbttagcompound.getBoolean("needsBogieUpdate");
		this.firstLoad = nbttagcompound.getBoolean("firstLoad");
		this.rotation = nbttagcompound.getFloat("rotation");
		this.isBraking = nbttagcompound.getBoolean("brake");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public float getShadowSize() {
		return 0.0F;
	}

	@Override
	public boolean interactFirst(EntityPlayer entityplayer) {
		if (super.interactFirst(entityplayer)){
			return true;
		}
		if (entityplayer.ridingEntity == this){
			return false;
		}

		if(lockThisCart(entityplayer.inventory.getCurrentItem(), entityplayer)){
			return true;
		}

		playerEntity = entityplayer;
		ItemStack itemstack = entityplayer.inventory.getCurrentItem();

		if (this.getTrainLockedFromPacket()) {
			if (!playerEntity.getDisplayName().toLowerCase().equals(this.trainOwner.toLowerCase()) && !canBeRiddenWhileLocked(this)) {
				if (!worldObj.isRemote) entityplayer.addChatMessage(new ChatComponentText("Train is locked"));
				return true;
			}
			else if (!playerEntity.getDisplayName().toLowerCase().equals(this.trainOwner.toLowerCase()) && entityplayer.inventory.getCurrentItem() != null && entityplayer.inventory.getCurrentItem().getItem() instanceof ItemDye && (this instanceof Locomotive)) {
				if (!worldObj.isRemote) entityplayer.addChatMessage(new ChatComponentText("Train is locked"));
				return true;
			}

		}

		if (itemstack != null && itemstack.getItem() instanceof ItemWrench && this instanceof Locomotive
				&& entityplayer.isSneaking() && !worldObj.isRemote) {
			destination = "";
			entityplayer.addChatMessage(new ChatComponentText("Destination reset"));
			return true;
		}
		if (MinecraftForge.EVENT_BUS.post(new MinecartInteractEvent(this, entityplayer))) { return true; }
		if (itemstack != null && itemstack.hasTagCompound() && getTicketDestination(itemstack) != null && getTicketDestination(itemstack).length() > 0) {
			this.setDestination(itemstack);
			/**
			 * ticket are single use but golden ones are multiple uses
			 */
			ItemStack ticket = GameRegistry.findItemStack("Railcraft", "railcraft.routing.ticket", 1);
			if (ticket != null && ticket.getItem() != null && itemstack.getItem() == ticket.getItem()) {
				if (--itemstack.stackSize == 0) {
					entityplayer.inventory.setInventorySlotContents(entityplayer.inventory.currentItem, null);
				}
			}
			return true;
		}
		/**
		 * If the color is valid for the cart, then change it and reduce
		 * itemstack size
		 */
		if (itemstack != null && itemstack.getItem() instanceof ItemDye) {
			if (this.acceptedColors != null && this.acceptedColors.size() > 0) {
				for (int i = 0; i < this.acceptedColors.size(); i++) {
					if (itemstack.getItemDamage() == this.acceptedColors.get(i)) {
						this.setColor(itemstack.getItemDamage());
						itemstack.stackSize--;

						//if (!worldObj.isRemote)PacketHandler.sendPacketToClients(PacketHandler.sendStatsToServer(10,this.uniqueID,trainName ,trainType, this.trainOwner, this.getColorAsString(itemstack.getItemDamage()), (int)posX, (int)posY, (int)posZ),this.worldObj, (int)posX,(int)posY,(int)posZ, 12.0D);

						return true;
					}
				}
				if (worldObj.isRemote && ConfigHandler.SHOW_POSSIBLE_COLORS) {
					String concatColors = ": ";
					for (int t = 0; t < this.acceptedColors.size(); t++) {
						concatColors = concatColors.concat(getColorAsString(this.acceptedColors.get(t)) + ", ");
					}
					entityplayer.addChatMessage(new ChatComponentText("Possible colors" + concatColors));
					entityplayer.addChatMessage(new ChatComponentText("To paint, click me with the right dye"));
					return true;
				}
			}
			else if (this.acceptedColors != null && this.acceptedColors.size() == 0) {
				entityplayer.addChatMessage(new ChatComponentText("No other colors available"));
			}
		}
		else if ((trainsOnClick.onClickWithStake(this, itemstack, playerEntity, worldObj))) { return true; }

		if (itemstack != null && itemstack.getItem() instanceof ItemPaintbrushThing && entityplayer.isSneaking()) {
			if (this.acceptedColors != null && this.acceptedColors.size() > 0) {
				if (scrollPosition > this.acceptedColors.size() - 1) {
					this.setColor(acceptedColors.get(0));
					scrollPosition = 0;
				} else {
					this.setColor(acceptedColors.get(scrollPosition));
					scrollPosition++;
				}
			}

			if (this.acceptedColors != null && this.acceptedColors.size() == 0) {
				entityplayer.addChatMessage(new ChatComponentText("There are no other colors available."));
			}
			return true;
		}

		return worldObj.isRemote;
	}

	@SideOnly(Side.CLIENT)
	private void soundUpdater() {
		if (FMLClientHandler.instance().getClient() != null) {
			this.theSoundManager = FMLClientHandler.instance().getClient().getSoundHandler();
		}
		if (FMLClientHandler.instance().getClient() != null && this.theSoundManager != null && FMLClientHandler.instance().getClient().thePlayer != null) {
			if (sndUpdater != null) {
				sndUpdater.update(FMLClientHandler.instance().getClient().getSoundHandler(), this, FMLClientHandler.instance().getClient().thePlayer);
			}
		}
	}

	/**
	 * Applies a velocity to each of the entities pushing them away from each
	 * other. Args: entity
	 */
	@Override
	public void applyEntityCollision(Entity par1Entity) {
		//System.out.println(par1Entity +" " +this.bogieLoco +" "+this.bogieUtility[0]);
		//if(par1Entity instanceof EntityPlayer)return;
		if (this.bogieLoco == null) return;

		if (par1Entity == this){
			return;
		}
		if (par1Entity instanceof EntityBogie) {
			if (((EntityBogie) par1Entity).entityMainTrainID == this.uniqueID) return;
		}
		if (par1Entity == bogieLoco){ return;}
		if (par1Entity instanceof EntityRollingStock && ((EntityRollingStock) par1Entity).bogieLoco != null) {
				if (par1Entity == ((EntityRollingStock) par1Entity).bogieLoco) return;
		}

		MinecraftForge.EVENT_BUS.post(new MinecartCollisionEvent(this, par1Entity));
		if (getCollisionHandler() != null) {
			getCollisionHandler().onEntityCollision(this, par1Entity);
			return;
		}
		if (!this.worldObj.isRemote) {
			if (par1Entity != this.riddenByEntity) {
				/*
				 * if (par1Entity instanceof EntityLiving && !(par1Entity
				 * instanceof EntityPlayer) && !(par1Entity instanceof
				 * EntityIronGolem) && canBeRidden() && this.motionX *
				 * this.motionX + this.motionZ * this.motionZ > 0.01D &&
				 * this.riddenByEntity == null && par1Entity.ridingEntity ==
				 * null) { par1Entity.mountEntity(this); }
				 */
				/*
				 * if ((this instanceof EntityStockCar)) { if
				 * (!(unAutorizedMob(par1Entity, this)) && (par1Entity
				 * instanceof EntityLiving) && !(par1Entity instanceof
				 * EntityPlayer)) { if (this.canBeRidden() &&
				 * this.riddenByEntity == null && par1Entity.ridingEntity ==
				 * null) { par1Entity.mountEntity(this); } } }
				 */
				/*
				 * if(this.isAttached)return; if(par1Entity instanceof
				 * EntityRollingStock &&
				 * ((EntityRollingStock)par1Entity).isAttached)return;
				 * if(par1Entity instanceof EntityBogie){
				 * if(((EntityBogie)par1Entity).entityMainTrain!=null &&
				 * ((EntityBogie)par1Entity).entityMainTrain.isAttached)return;
				 * }
				 */
				//System.out.println(par1Entity);
				double d0 = par1Entity.posX - this.posX;
				double d1 = par1Entity.posZ - this.posZ;
				double distancesX[] = new double[4];
				double distancesZ[] = new double[4];
				double euclidian[] = new double[4];
				if (par1Entity instanceof EntityRollingStock) {
					EntityRollingStock entity = (EntityRollingStock)par1Entity;
					if (((EntityRollingStock) par1Entity).bogieLoco != null || this.bogieLoco != null) {

						if (((EntityRollingStock) par1Entity).bogieLoco != null && this.bogieLoco == null) {
							distancesX[0] = entity.posX - this.posX;
							distancesZ[0] = entity.posZ - this.posZ;
							euclidian[0] = MathHelper.sqrt_double((distancesX[0] * distancesX[0]) + (distancesZ[0] * distancesZ[0]));
							distancesX[1] = entity.bogieLoco.posX - this.posX;
							distancesZ[1] = entity.bogieLoco.posZ - this.posZ;
							euclidian[1] = MathHelper.sqrt_double((distancesX[1] * distancesX[1]) + (distancesZ[1] * distancesZ[1]));
							distancesX[2] = 100;
							distancesZ[2] = 100;
							euclidian[2] = MathHelper.sqrt_double((distancesX[2] * distancesX[2]) + (distancesZ[2] * distancesZ[2]));
							distancesX[3] = 100;
							distancesZ[3] = 100;
							euclidian[3] = MathHelper.sqrt_double((distancesX[3] * distancesX[3]) + (distancesZ[3] * distancesZ[3]));
						}
						else if (((EntityRollingStock) par1Entity).bogieLoco == null && this.bogieLoco != null) {
							distancesX[0] = entity.posX - this.posX;
							distancesZ[0] = entity.posZ - this.posZ;
							euclidian[0] = MathHelper.sqrt_double((distancesX[0] * distancesX[0]) + (distancesZ[0] * distancesZ[0]));
							distancesX[1] = entity.posX - this.bogieLoco.posX;
							distancesZ[1] = entity.posZ - this.bogieLoco.posZ;
							euclidian[1] = MathHelper.sqrt_double((distancesX[1] * distancesX[1]) + (distancesZ[1] * distancesZ[1]));
							distancesX[2] = 100;
							distancesZ[2] = 100;
							euclidian[2] = MathHelper.sqrt_double((distancesX[2] * distancesX[2]) + (distancesZ[2] * distancesZ[2]));
							distancesX[3] = 100;
							distancesZ[3] = 100;
							euclidian[3] = MathHelper.sqrt_double((distancesX[3] * distancesX[3]) + (distancesZ[3] * distancesZ[3]));
						}
						else {
							distancesX[0] = entity.posX - this.posX;
							distancesZ[0] = entity.posZ - this.posZ;
							euclidian[0] = MathHelper.sqrt_double((distancesX[0] * distancesX[0]) + (distancesZ[0] * distancesZ[0]));
							distancesX[1] = entity.bogieLoco.posX - this.posX;
							distancesZ[1] = entity.bogieLoco.posZ - this.posZ;
							euclidian[1] = MathHelper.sqrt_double((distancesX[1] * distancesX[1]) + (distancesZ[1] * distancesZ[1]));
							distancesX[2] = entity.posX - this.bogieLoco.posX;
							distancesZ[2] = entity.posZ - this.bogieLoco.posZ;
							euclidian[2] = MathHelper.sqrt_double((distancesX[2] * distancesX[2]) + (distancesZ[2] * distancesZ[2]));
							distancesX[3] = entity.bogieLoco.posX - this.bogieLoco.posX;
							distancesZ[3] = entity.bogieLoco.posZ - this.bogieLoco.posZ;
							euclidian[3] = MathHelper.sqrt_double((distancesX[3] * distancesX[3]) + (distancesZ[3] * distancesZ[3]));
						}
						double min = euclidian[0];
						int minIndex = 0;
						for (int k = 0; k < euclidian.length; k++) {
							if (Math.abs(euclidian[k]) < Math.abs(min)) {
								min = euclidian[k];
								minIndex = k;
							}
						}
						d0 = distancesX[minIndex];
						d1 = distancesZ[minIndex];
					}
				}
				double d2 = d0 * d0 + d1 * d1;

				if ((par1Entity instanceof AbstractTrains && d2 <= ((AbstractTrains) par1Entity).getLinkageDistance((EntityMinecart) par1Entity) * 0.7 && d2 >= 9.999999747378752E-5D) || (par1Entity instanceof EntityBogie && ((EntityBogie) par1Entity).entityMainTrain != null && d2 <= ((EntityBogie) par1Entity).entityMainTrain.getLinkageDistance((EntityMinecart) par1Entity) * 0.7 && d2 >= 9.999999747378752E-5D) || (!(par1Entity instanceof AbstractTrains) && d2 >= 9.999999747378752E-5D))// >= 9.999999747378752E-5D)
				{
					d2 = MathHelper.sqrt_double(d2);
					if (d0 != 0) {
						d0 /= d2;
					} else {
						d2=0;
					}
					if (d1 != 0) {
						d1 /= d2;
					} else {
						d2=0;
					}

					if (d2 > 1.0D) {
						d2 = 1.0D;
					}

					d0 *= d2;
					d1 *= d2;
					d0 *= 0.10000000149011612D;
					d1 *= 0.10000000149011612D;
					d0 *= 1.0F - this.entityCollisionReduction;
					d1 *= 1.0F - this.entityCollisionReduction;
					d0 *= 0.5D;
					d1 *= 0.5D;

					if ((par1Entity instanceof EntityMinecart ) && !this.isAttached) {

						Vec3 vec31 = Vec3.createVectorHelper(MathHelper.cos(this.rotationYaw * (float) Math.PI / 180.0F), 0.0D, MathHelper.sin(this.rotationYaw * (float) Math.PI / 180.0F)).normalize();

						if (Math.abs(Vec3.createVectorHelper(par1Entity.posX - this.posX, 0.0D,par1Entity.posZ - this.posZ).normalize().dotProduct(vec31)) < 0.800000011920929D) { return; }

						double d9 = par1Entity.motionX + this.motionX;
						double d8 = par1Entity.motionZ + this.motionZ;

						if ((par1Entity instanceof Locomotive && !isPoweredCart()) || (((EntityMinecart) par1Entity).isPoweredCart()) && !isPoweredCart()) {
							//System.out.println("1 "+par1Entity +"     "+ this);

							this.motionX *= 0.20000000298023224D;
							this.motionZ *= 0.20000000298023224D;
							this.addVelocity(par1Entity.motionX - d0, 0.0D, par1Entity.motionZ - d1);
							if (!(par1Entity instanceof Locomotive)) {
								par1Entity.motionX *= 0.949999988079071D;
								par1Entity.motionZ *= 0.949999988079071D;
							}
						}
						else if ((!(par1Entity instanceof Locomotive) && isPoweredCart()) || (!((EntityMinecart) par1Entity).isPoweredCart() && isPoweredCart())) {
							//System.out.println("2 "+par1Entity +"     "+ this);
							if (par1Entity instanceof EntityBogie && ((EntityBogie) par1Entity).entityMainTrain != null) {
								this.motionX *= 0.2;
								this.motionZ *= 0.2;
								this.addVelocity(this.motionX + d0 * 3, 0.0D, this.motionZ + d1 * 3);
								if (this instanceof Locomotive && ((EntityBogie) par1Entity).entityMainTrain instanceof Locomotive) {
									this.motionX *= 0;
									this.motionZ *= 0;
									((EntityBogie) par1Entity).entityMainTrain.motionX *= 0;
									((EntityBogie) par1Entity).entityMainTrain.motionZ *= 0;
								}
							}
							else {
								par1Entity.motionX *= 0.20000000298023224D;
								par1Entity.motionZ *= 0.20000000298023224D;
								par1Entity.addVelocity(this.motionX + d0, 0.0D, this.motionZ + d1);
							}
							if (!(this instanceof Locomotive)) {
								this.motionX *= 0.949999988079071D;
								this.motionZ *= 0.949999988079071D;
							}

						}
						else {
							//System.out.println("3 "+par1Entity +"     "+ this);
							d9 *= 0.4D;
							d8 *= 0.4D;

							if (par1Entity instanceof EntityBogie || par1Entity instanceof Locomotive) {
								d9 *= -1;//-3
								d8 *= -1;//-3
							}

							this.motionX *= 0.20000000298023224D;
							this.motionZ *= 0.20000000298023224D;
							this.addVelocity(d9 - d0, 0.0D, d8 - d1);
							if (par1Entity instanceof EntityBogie) {
								//d7/=3;
								//d8/=3;
								d9 *= 0.333333333333;
								d8 *= 0.333333333333;
							}

							par1Entity.motionX *= 0.20000000298023224D;
							par1Entity.motionZ *= 0.20000000298023224D;
							par1Entity.addVelocity(d9 + d0, 0.0D, d8 + d1);

						}
					}
					else {

						if (!(par1Entity instanceof EntityItem) && !(par1Entity instanceof EntityPlayer && this instanceof Locomotive) && !(par1Entity instanceof EntityCreature) && !(par1Entity instanceof EntityBogie)) {
							this.addVelocity(-d0 * 2, 0.0D, -d1 * 2);
						}
						else if ((par1Entity instanceof EntityBogie)) {
							this.addVelocity(-d0, 0.0D, -d1);
						}/*
						 * else if(par1Entity instanceof EntityBogie){
						 * par1Entity.addVelocity(-d0, 0.0D, -d1);
						 * 
						 * }
						 */
						//if(!(par1Entity instanceof EntityPlayer))par1Entity.addVelocity(d0 / 4.0D, 0.0D, d1 / 4.0D);
						//par1Entity.setVelocity(0, 0.0D, 0);
						par1Entity.addVelocity(d0 * 2 * 100, 0.0D, d1 * 2 * 100);
						/*
						 * if(this.bogieUtility[0]!=null &&
						 * this.bogieUtility[1]!=null){
						 * this.bogieUtility[0].addVelocity(-d0*2, 0.0D, -d1*2);
						 * this.bogieUtility[1].addVelocity(-d0*2, 0.0D, -d1*2);
						 * }
						 */

						if (par1Entity instanceof EntityPlayer) {

							MovingObjectPosition movingobjectposition = new MovingObjectPosition(par1Entity);
							if (movingobjectposition.entityHit != null) {
								// float f1 = MathHelper.sqrt_double(this.motionX * this.motionX +
								// this.motionY * this.motionY + this.motionZ * this.motionZ);
								// float f7 = MathHelper.sqrt_double(this.motionX * this.motionX +
								// this.motionZ * this.motionZ);
								//movingobjectposition.entityHit.setVelocity(-par1Entity.motionX, 0, -par1Entity.motionZ);
								//movingobjectposition.entityHit.addVelocity(-((par1Entity.motionX * (double) (Math.abs(this.motionX+0.01)) * 2.60000002384185791D)) / (double) f7, 0.00000000000000001D, -(((par1Entity.motionZ * (double) (Math.abs(this.motionZ+0.01)) * 2.60000002384185791D)) / (double) f7));
								//movingobjectposition.entityHit.addVelocity(-((Math.abs(this.motionX) * (double) 1 * 0.0260000002384185791D)) / (double) f7, 0.00000000000000001D, -(((Math.abs(this.motionZ) * (double) 1 * 0.0260000002384185791D)) / (double) f7));
								par1Entity.velocityChanged = true;
							}
						}

						if (par1Entity instanceof EntityLiving) {
							float f1 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ) *60;
							//f1 *= 6;//ratio
							//f1 *= 10;//to get speed in "pseudo m/s"
							if ((f1 * 3.6) < 35) {//if speed is smaller than 35km/h then don't do any damage but push entities
								return;
							}
							int j1 = (int) Math.ceil((f1) * ((par1Entity instanceof EntityCreeper)?100:1));
							par1Entity.attackEntityFrom(TrainsDamageSource.ranOver, j1);
						}
					}
				}
			}
		}
	}

	/**
	 * To disable linking altogether, return false here.
	 * 
	 * @return True if this cart is linkable.
	 */
	@Override
	public boolean isLinkable() {
		return true;
	}

	/**
	 * Check called when attempting to link carts.
	 * 
	 * @param cart
	 *            The cart that we are attempting to link with.
	 * @return True if we can link with this cart.
	 */
	@Override
	public boolean canLinkWithCart(EntityMinecart cart) {
		return true;
	}

	/**
	 * Returns true if this cart has two links or false if it can only link with
	 * one cart.
	 * 
	 * @return True if two links
	 */
	@Override
	public boolean hasTwoLinks() {
		return true;
	}

	/**
	 * Gets the distance at which this cart can be linked. This is called on
	 * both carts and added together to determine how close two carts need to be
	 * for a successful link. Default = LinkageManager.LINKAGE_DISTANCE
	 * 
	 * @param cart
	 *            The cart that you are attempting to link with.
	 * @return The linkage distance
	 */
	@Override
	public float getLinkageDistance(EntityMinecart cart) {
		return this.getOptimalDistance(cart) + 2.4F;
	}

	/**
	 * Gets the optimal distance between linked carts. This is called on both
	 * carts and added together to determine the optimal rest distance between
	 * linked carts. The LinkageManager will attempt to maintain this distance
	 * between linked carts at all times. Default =
	 * LinkageManager.OPTIMAL_DISTANCE
	 * ETERNAL's NOTE: because this is forcing the value of EntityMinecart, it's actually a call to the super but using this instance. Not actually an infinate look like compiler thinks.
	 * 
	 * @param cart
	 *            The cart that you are linked with.
	 * @return The optimal rest distance
	 */
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return this.getOptimalDistance(cart);
	}

	/**
	 * Return false if linked carts have no effect on the velocity of this cart.
	 * Use carefully, if you link two carts that can't be adjusted, it will
	 * behave as if they are not linked.
	 * 
	 * @param cart
	 *            The cart doing the adjusting.
	 * @return Whether the cart can have its velocity adjusted.
	 */
	@Override
	public boolean canBeAdjusted(EntityMinecart cart) {
		return true;
	}

	@Override
	public void onLinkCreated(EntityMinecart cart) {
		linked = true;
	}

	/**
	 * Called when a link is broken (usually).
	 * 
	 * @param cart
	 *            The cart we were linked with.
	 */
	@Override
	public void onLinkBroken(EntityMinecart cart) {
		linked = false;
	}

	@Override
	public boolean isLinked() {
		return linked;
	}

	/**
	 * This function returns an ItemStack that represents this cart. This should
	 * be an ItemStack that can be used by the player to place the cart. This is
	 * the item that was registered with the cart via the registerMinecart
	 * function, but is not necessary the item the cart drops when destroyed.
	 * 
	 * @return An ItemStack that can be used to place the cart.
	 */
	@Override
	public ItemStack getCartItem() {
		return getItemsDropped().get(0);
	}

	/**
	 * Returns true if this cart is self propelled.
	 * 
	 * @return True if powered.
	 */
	@Override
	public boolean isPoweredCart() {
		return (isLocomotive());
	}

	/**
	 * Returns true if this cart is a storage cart Some carts may have
	 * inventories but not be storage carts and some carts without inventories
	 * may be storage carts.
	 * 
	 * @return True if this cart should be classified as a storage cart.
	 */
	public boolean isStorageCart() {
		return (isFreightCart());
	}

	/**
	 * Returns true if this cart can be ridden by an Entity.
	 * 
	 * @return True if this cart can be ridden.
	 */
	@Override
	public boolean canBeRidden() {
		return ((isLocomotive() || isPassenger() || isWorkCart()));
	}

	/**
	 * Returns true if this cart can currently use rails. This function is
	 * mainly used to gracefully detach a minecart from a rail.
	 * 
	 * @return True if the minecart can use rails.
	 */
	@Override
	public boolean canUseRail() {
		return canUseRail;
	}

	/**
	 * Set whether the minecart can use rails. This function is mainly used to
	 * gracefully detach a minecart from a rail.
	 * 
	 * @param use
	 *            Whether the minecart can currently use rails.
	 */
	@Override
	public void setCanUseRail(boolean use) {
		canUseRail = use;
	}

	/**
	 * Return false if this cart should not call IRail.onMinecartPass() and
	 * should ignore Powered Rails.
	 * 
	 * @return True if this cart should call IRail.onMinecartPass().
	 */
	@Override
	public boolean shouldDoRailFunctions() {
		return true;
	}

	protected void applyDragAndPushForces() {
		motionX *= getDragAir();
		motionY *= 0.0D;
		motionZ *= getDragAir();
	}

	/**
	 * Carts should return their drag factor here
	 * 
	 * @return The drag rate.
	 */
	@Override
	public double getDragAir() {
		return 0.98D;
	}

	@Override
	public void moveMinecartOnRail(int i, int j, int k, double d) {
		Block id = worldObj.getBlock(i, j, k);
		if (!BlockRailBase.func_150051_a(id)) { return; }
		railMaxSpeed = ((BlockRailBase) id).getRailMaxSpeed(worldObj, this, i, j, k);
		maxSpeed = Math.max(railMaxSpeed, getMaxCartSpeedOnRail());
		maxSpeed = SpeedHandler.handleSpeed(railMaxSpeed, maxSpeed, this);
		if (this.speedLimiter != 0 && speedWasSet) {
			//maxSpeed *= this.speedLimiter;
			adjustSpeed(maxSpeed, speedLimiter);
		}
		if ((!isLocomotive())) {
			motionX *= 0.99D;
			motionZ *= 0.99D;
		}
		else {
			motionX *= 1D;
			motionZ *= 1D;
		}
		if (motionX < -maxSpeed) {
			motionX = -maxSpeed;
		}
		if (motionX > maxSpeed) {
			motionX = maxSpeed;
		}
		if (motionZ < -maxSpeed) {
			motionZ = -maxSpeed;
		}
		if (motionZ > maxSpeed) {
			motionZ = maxSpeed;
		}
		moveEntity(motionX, 0.0D, motionZ);
	}

	public void adjustSpeed(float maxSpeed, double limiter) {
		float targetSpeed = (float) (maxSpeed * limiter);
		float targetSpeedX = (float) Math.copySign(targetSpeed, motionX);
		float targetSpeedZ = (float) Math.copySign(targetSpeed, motionZ);
		if (motionX > targetSpeedX && motionX != 0) motionX -= 0.01;
		if (motionZ > targetSpeedZ && motionZ != 0) motionZ -= 0.01;
		if (motionX < targetSpeedX && motionX != 0) motionX += 0.01;
		if (motionZ < targetSpeedZ && motionZ != 0) motionZ += 0.01;
		//System.out.println(motionX + " X " + targetSpeedX);
		//System.out.println(motionZ + " Z " + targetSpeedZ);
		if ((Math.abs(motionX) < Math.abs(targetSpeedX) + 0.01) && (Math.abs(motionX) > Math.abs(targetSpeedX) - 0.01)) {
			speedWasSet = false;
		}
		if ((Math.abs(motionZ) < Math.abs(targetSpeedZ) + 0.01) && (Math.abs(motionZ) > Math.abs(targetSpeedZ) - 0.01)) {
			speedWasSet = false;
		}
	}


	protected void adjustSlopeVelocities(int i1) {
		if (this instanceof Locomotive) { return; }
		double d4 = -0.002D;//0.0078125D
		if (i1 == 2) {
			motionX -= d4;
		}
		else if (i1 == 3) {
			motionX += d4;
		}
		else if (i1 == 4) {
			motionZ += d4;
		}
		else if (i1 == 5) {
			motionZ -= d4;
		}
	}

	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		return (!isDead && entityplayer.getDistanceSqToEntity(this) <= 300D);
	}

	/**
	 * Returns the carts max speed. Carts going faster than 1.1 cause issues
	 * with chunk loading. This value is compared with the rails max speed to determine
	 * the carts current max speed. A normal rails max speed is 0.4.
	 * 
	 * @return Carts max speed.
	 */
	@Override
	public float getMaxCartSpeedOnRail() {
		return maxSpeed;
	}

	@Override
	public float getMaxSpeedAirLateral() {
		return maxSpeedAirLateral;
	}

	@Override
	public void setMaxSpeedAirLateral(float value) {
		maxSpeedAirLateral = value;
	}

	@Override
	public float getMaxSpeedAirVertical() {
		return maxSpeedAirVertical;
	}

	@Override
	public void setMaxSpeedAirVertical(float value) {
		maxSpeedAirVertical = value;
	}

	@Override
	public void setDragAir(double value) {
		dragAir = value;
	}

	@Override
	public boolean canOverheat() {
		return false;
	}

	@Override
	public int getOverheatTime() {
		return 0;
	}

	/**
	 * returns the middle of the overheat bar in the HUD
	 *
	 */
	public int getAverageOverheat() {
		return (this.getOverheatTime() + 30) / 2;
	}

	/**
	 * client-server communication
	 */
	public void setOverheatLevel(int overheatLevel) {
		this.overheatLevel = overheatLevel;
		this.dataWatcher.updateObject(20, overheatLevel);
	}

	/**
	 * client-server communication
	 *
	 */
	public int getOverheatLevel() {
		return (this.dataWatcher.getWatchableObjectInt(20));
	}

	/**
	 * @see SpeedHandler description in SpeedHandler
	 */
	public double convertSpeed(Locomotive entity) {
		double speed = entity.getCustomSpeed();// speed in m/s
		if (ConfigHandler.REAL_TRAIN_SPEED) {
			speed /= 2;// applying ratio
		}
		else {
			speed /= 6;
		}
		speed /= 10;
		return speed;
	}

	/**
	 * Used in SoundUpdaterRollingStock
	 *
	 */
	public int getMotionXClient() {
		return (this.dataWatcher.getWatchableObjectInt(14));
	}

	/**
	 * Used in SoundUpdaterRollingStock
	 *
	 */
	public int getMotionZClient() {
		return (this.dataWatcher.getWatchableObjectInt(21));
	}

	@Override
	protected void  func_145775_I() {
		int var1 = MathHelper.floor_double(this.boundingBoxSmall.minX + 0.001D);
		int var2 = MathHelper.floor_double(this.boundingBoxSmall.minY + 0.001D);
		int var3 = MathHelper.floor_double(this.boundingBoxSmall.minZ + 0.001D);
		int var4 = MathHelper.floor_double(this.boundingBoxSmall.maxX - 0.001D);
		int var5 = MathHelper.floor_double(this.boundingBoxSmall.maxY - 0.001D);
		int var6 = MathHelper.floor_double(this.boundingBoxSmall.maxZ - 0.001D);

		if (this.worldObj.checkChunksExist(var1, var2, var3, var4, var5, var6)) {
			for (int var7 = var1; var7 <= var4; ++var7) {
				for (int var8 = var2; var8 <= var5; ++var8) {
					for (int var9 = var3; var9 <= var6; ++var9) {
						Block var10 = this.worldObj.getBlock(var7, var8, var9);

						if (var10 != null) {
							var10.onEntityCollidedWithBlock(this.worldObj, var7, var8, var9, this);
						}
					}
				}
			}
		}
	}

	private void setBoundingBoxSmall(double par1, double par3, double par5, float width, float height) {
		float var7 = width * 0.5F;
		this.boundingBoxSmall.setBounds(par1 - var7, par3 - this.yOffset + this.ySize, par5 - var7, par1 + var7, par3 - this.yOffset + this.ySize + height, par5 + var7);
	}

	public float getYaw() {
		return this.rotationYaw;
	}

	public float getPitch() {
		return this.rotationPitch;
	}

	@Override
	public int getMinecartType() {
		return 0;
	}

	@Override
	public List<ItemStack> getItemsDropped() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		for (EnumTrains trains : EnumTrains.values()) {
			if (trains.getEntityClass().equals(this.getClass())) {
				items.add(new ItemStack(trains.getItem()));
				return items;
			}
		}
		return null;
	}

	@SideOnly(Side.CLIENT)
	public Vec3 renderY(double par1, double par3, double par5, double par7) {
		int i = MathHelper.floor_double(par1);
		int j = MathHelper.floor_double(par3);
		int k = MathHelper.floor_double(par5);

		if (worldObj.getBlock(i, j - 1, k) == BlockIDs.tcRail.block || worldObj.getBlock(i, j - 1, k) == BlockIDs.tcRailGag.block) {
			--j;
		} else if (worldObj.getBlock(i, j + 1, k) == BlockIDs.tcRail.block || worldObj.getBlock(i, j + 1, k) == BlockIDs.tcRailGag.block){
			j++;
		}

		Block l = this.worldObj.getBlock(i, j, k);
		int i1;
		if (l == BlockIDs.tcRail.block || l == BlockIDs.tcRailGag.block) {
			i1 = worldObj.getBlockMetadata(i, j, k);
			if (i1 == 2){ i1 = 0;}
			else if (i1 == 3){ i1 = 1;}
		}
		else {
			return null;
		}
		if (l != BlockIDs.tcRail.block && l != BlockIDs.tcRailGag.block) {
			par3 = j;

			if (i1 >= 2 && i1 <= 5) {
				par3 = j + 1;
			}
		}
		else if (l == BlockIDs.tcRail.block || l == BlockIDs.tcRailGag.block) {
			TileEntity tile = worldObj.getTileEntity(i, j, k);
			if (tile != null && tile instanceof TileTCRail) {
				if (((TileTCRail) tile).getType() != null && !ItemTCRail.isTCSlopeTrack((TileTCRail) tile)) {
					par3 = j;
				}
			} else if (tile != null && tile instanceof TileTCRailGag) {
				int xOrigin = ((TileTCRailGag) tile).originX;
				int yOrigin = ((TileTCRailGag) tile).originY;
				int zOrigin = ((TileTCRailGag) tile).originZ;
				TileEntity tileOrigin = worldObj.getTileEntity(xOrigin, yOrigin, zOrigin);
				if (tileOrigin != null && (tileOrigin instanceof TileTCRail) && ((TileTCRail) tileOrigin).getType() != null && !ItemTCRail.isTCSlopeTrack((TileTCRail) tileOrigin)) {
					par3 = j;
				}
			}
		}
		int[][] aint = matrix[i1];
		double d4 = aint[1][0] - aint[0][0];
		double d5 = aint[1][2] - aint[0][2];
		double d6 = Math.sqrt(d4 * d4 + d5 * d5);
		d4 /= d6;
		d5 /= d6;
		par1 += d4 * par7;
		par5 += d5 * par7;

		if (l != BlockIDs.tcRail.block && l != BlockIDs.tcRailGag.block) {
			if (aint[0][1] != 0 && MathHelper.floor_double(par1) - i == aint[0][0] && MathHelper.floor_double(par5) - k == aint[0][2]) {
				par3 += aint[0][1];
			}
			else if (aint[1][1] != 0 && MathHelper.floor_double(par1) - i == aint[1][0] && MathHelper.floor_double(par5) - k == aint[1][2]) {
				par3 += aint[1][1];
			}
		}
		return this.func_70489_a(par1, par3, par5);
	}

	//private int renderTicks;
	public Vec3 yVector(double par1, double par3, double par5) {
		int i = MathHelper.floor_double(par1);
		int j = MathHelper.floor_double(par3);
		int k = MathHelper.floor_double(par5);
		if (worldObj.getBlock(i, j - 1, k) == BlockIDs.tcRail.block || worldObj.getBlock(i, j - 1, k) == BlockIDs.tcRailGag.block) {
			--j;
		} else if (worldObj.getBlock(i, j + 1, k) == BlockIDs.tcRail.block || worldObj.getBlock(i, j + 1, k) == BlockIDs.tcRailGag.block){
			j++;
		}

		Block l = this.worldObj.getBlock(i, j, k);
		int i1 = 0;

		/*
		 * boolean shouldIgnoreYCoord = false; TileEntity tile =
		 * worldObj.getBlockTileEntity(i, j, k); if(tile!=null && tile
		 * instanceof TileTCRail){ if(((TileTCRail)tile).getType()!=null &&
		 * ((TileTCRail
		 * )tile).getType().equals(TrackTypes.MEDIUM_SLOPE.getLabel())){
		 * shouldIgnoreYCoord = true; } } if(tile!=null && tile instanceof
		 * TileTCRailGag){ int xOrigin = ((TileTCRailGag)tile).originX; int
		 * yOrigin = ((TileTCRailGag)tile).originY; int zOrigin =
		 * ((TileTCRailGag)tile).originZ; TileEntity tileOrigin =
		 * worldObj.getBlockTileEntity(xOrigin, yOrigin, zOrigin);
		 * if(tileOrigin!=null && (tileOrigin instanceof TileTCRail) &&
		 * ((TileTCRail)tileOrigin).getType()!=null &&
		 * ((TileTCRail)tileOrigin).getType
		 * ().equals(TrackTypes.MEDIUM_SLOPE.getLabel())){ shouldIgnoreYCoord =
		 * true; } }
		 */
		if (l == BlockIDs.tcRail.block || l == BlockIDs.tcRailGag.block) {
			//par3 = (double) j;
			int[][] aint = matrix[i1];
			double d3 = 0.0D;
			double d4 = i + 0.5D + aint[0][0] * 0.5D;
			double d6 = k + 0.5D + aint[0][2] * 0.5D;
			double d10 = (i + 0.5D + aint[1][0] * 0.5D) - d4;
			double d12 = (k + 0.5D + aint[1][2] * 0.5D) - d6;

			if (d10 == 0.0D) {
				d3 = par5 - k;
			}
			else if (d12 == 0.0D) {
				d3 = par1 - i;
			}
			else {
				double d13 = par1 - d4;
				double d14 = par5 - d6;
				d3 = (d13 * d10 + d14 * d12) * 2.0D;
			}
			return Vec3.createVectorHelper(d4 + d10 * d3, par3, d6 + d12 * d3);
		}
		else {
			return null;
		}
	}

	public ItemStack[] getInventory(){return null;}
}