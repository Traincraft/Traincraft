/*package train.common.api;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.common.ForgeChunkManager.Ticket;
import net.minecraftforge.common.util.ChunkCoordComparator;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;
import org.apache.commons.lang3.ArrayUtils;
import traincraft.Traincraft;
import train.common.core.handlers.ConfigHandler;
import train.common.core.handlers.TrainHandler;
import traincraft.items.ItemChunkLoaderActivator;
import traincraft.items.ItemWrench;
import train.common.library.EnumTrains;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class AbstractTrains extends EntityMinecart implements IEntityAdditionalSpawnData {

	/**
	 * The color of the current rollingstock -1 if default
	 *//*
	protected int color;
	public boolean isAttached = false;
	public boolean isAttaching = false;
	public static int numberOfTrains = Integer.MIN_VALUE;
	public EntityPlayer playerEntity;
	public double Link1;
	public double Link2;
	protected boolean linked = false;
	public EntityRollingStock cartLinked1;
	public EntityRollingStock cartLinked2;
	public int clearLinkTimer = 0;
	//private Set chunks;
	protected Ticket chunkTicket;
	public float renderYaw;
	protected float renderPitch;
	public TrainHandler train;
	public List<ChunkCoordComparator> loadedChunks = new ArrayList<>();
	public boolean shouldChunkLoad = true;
	protected boolean itemdropped =false;
	/**
	 * A reference to EnumTrains containing all spec for this specific train
	 *//*
	protected EnumTrains trainSpec;

	/**
	 * The name of the train based on the item name
	 *//*
	public String trainName = "";
	public double accelerate = 0.7D;
	public double brake = 0.96D;
	/**
	 * determines the mass of the carts from 0 to 10 it's then multiplied by 10
	 * to pretend this is [tons]
	 *//*
	public double mass = 1;
	/**
	 * the default mass, not affected by weight of items/liquids
	 *//*
	public double defaultMass = 1;
	/**
	 * the power of locomotives, 0 for carts
	 *//*
	public int power = 0;
	/**
	 * Whether this train is locked and can only be used by the Owner
	 *//*
	public boolean locked = false;
	/**
	 * The owner of the train: The user who spawned it
	 *//*
	public String trainOwner = "";

	public String getTrainOwner() {
		return trainOwner;
	}

	public void setTrainOwner(String trainOwner) {
		this.trainOwner = trainOwner;
	}

	/**
	 * The creator of the train
	 *//*
	public String trainCreator = "";

	/**
	 * The type of the train: steam tender diesel electric freight flat tank
	 * passenger work special
	 *//*
	public String trainType = "";

	/**
	 * player who destroyed the train
	 *//*
	protected String trainDestroyer = "";

	/**
	 * unique ID for a train. ID is create when item is created. This allows to
	 * track a train not only in his entity form
	 *//*
	public int uniqueID = -1;
	/**
	 * supposed to store the last ID given;
	 *//*
	public static int uniqueIDs = 1;

	/**
	 * The distance this train has traveled
	 *//*
	public double trainDistanceTraveled = 0;

	public String destination = "";

	/**
	 * Registers all possible color textures
	 *//*
	public ArrayList<Byte> acceptedColors;


	public AbstractTrains(World world) {
		super(world);
		//renderDistanceWeight = 2.0D;
		color = -1;
		//dataWatcher.addObject(12, color);
		acceptedColors = new ArrayList<Byte>();
		//dataWatcher.addObject(6, trainType);
		//dataWatcher.addObject(7, trainOwner);
		//dataWatcher.addObject(8, trainDestroyer);
		//dataWatcher.addObject(9, trainName);
		//dataWatcher.addObject(10, numberOfTrains);
		//dataWatcher.addObject(11, uniqueID);
		//dataWatcher.addObject(13, trainCreator);
		shouldChunkLoad=ConfigHandler.CHUNK_LOADING;
		this.setFlag(7, shouldChunkLoad);


		for (EnumTrains trains : EnumTrains.values()) {
			if (trains.getEntityClass().equals(this.getClass())) {
				this.setDefaultMass(trains.getMass());
				trainSpec = trains;
				if (trains.getColors() != null) {
					for (int i = 0; i < trains.getColors().length; i++) {
						this.acceptedColors.add((trains.getColors()[i]));
					}
				}
				this.setSize(0.98f, 1.98f);
				//this.setMinecartName(trainSpec.name());

				break;
			}
		}
	}

	public AbstractTrains(World world, double x, double y, double z){
		this(world);
		this.setPosition(x, y, z);
	}

	@Override
	public AxisAlignedBB getCollisionBox(Entity p_70114_1_) {
		if(this.getControllingPassenger() != p_70114_1_){
			return super.getCollisionBox(p_70114_1_);
		} else {
			return null;
		}
	}
	/**
	 * this is basically NBT for entity spawn, to keep data between client and server in sync because some data is not automatically shared.
	 *//*
	@Override
	public void readSpawnData(ByteBuf additionalData) {
		locked = additionalData.readBoolean();
		if(additionalData.readBoolean()){
			getEntityData().setString("puuid", ByteBufUtils.readUTF8String(additionalData));
			getEntityData().setString("theCreator", ByteBufUtils.readUTF8String(additionalData));
			getEntityData().setString("theOwner", ByteBufUtils.readUTF8String(additionalData));
			getEntityData().setInteger("color", additionalData.readInt());
		}
	}
	@Override
	public void writeSpawnData(ByteBuf buffer) {
		buffer.writeBoolean(locked);
		if(getEntityData().hasKey("puuid")) {
			buffer.writeBoolean(true);
			ByteBufUtils.writeUTF8String(buffer, getEntityData().getString("puuid"));
			ByteBufUtils.writeUTF8String(buffer, getEntityData().getString("theCreator"));
			ByteBufUtils.writeUTF8String(buffer, getEntityData().getString("theOwner"));
			buffer.writeInt(getEntityData().getInteger("color"));
		} else {
			buffer.writeBoolean(false);
		}
	}


	public abstract boolean isLocomotive();

	public abstract boolean isPassenger();

	public abstract boolean isFreightCart();

	public abstract boolean isFreightOrPassenger();

	public abstract boolean isBuilder();

	public abstract boolean isTender();

	public abstract boolean isWorkCart();

	public abstract boolean isElectricTrain();

	public abstract boolean isLinked();

	protected abstract boolean canOverheat();

	protected abstract int getOverheatTime();

	public abstract float getLinkageDistance(EntityMinecart cart);

	//public abstract int getID();

	public abstract boolean canBeAdjusted(EntityMinecart cart2);

	public abstract float getOptimalDistance(EntityMinecart cart2);

	public abstract List<ItemStack> getItemsDropped();

	public int getUniqueTrainID(){
		return uniqueID;
	}

	public void manageChunkLoading(){
		//if(this instanceof Locomotive)System.out.println("I'm alive. Remote: " + worldObj.isRemote);
		if (!this.world.isRemote && this.uniqueID == -1) {
			if (FMLCommonHandler.instance().getMinecraftServerInstance() != null) {
				//TraincraftSaveHandler.createFile(FMLCommonHandler.instance().getMinecraftServerInstance());
				//int readID = TraincraftSaveHandler.readInt(FMLCommonHandler.instance().getMinecraftServerInstance(), "numberOfTrains:");
				//int newID = setNewUniqueID(readID);
				setNewUniqueID();
				//TraincraftSaveHandler.writeValue(FMLCommonHandler.instance().getMinecraftServerInstance(), "numberOfTrains:", new String("" + newID));
				//System.out.println("Train is missing an ID, adding new one for "+this.trainName+" "+this.uniqueID);
			}
		}
		shouldChunkLoad = getFlag(7);
		if (shouldChunkLoad){
			if(this.chunkTicket == null) {
				this.requestTicket();
			}
		}
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if(!(this instanceof EntityRollingStock)) {
			manageChunkLoading();
		}
		/*
		 * if (worldObj.isRemote) { if (this.getFlag(6)) { if (this.chunks !=
		 * null) { Iterator var3 = this.chunks.iterator(); while
		 * (var3.hasNext()) { ChunkCoordIntPair var4 = (ChunkCoordIntPair)
		 * var3.next(); int x = var4.getCenterXPos(); int z =
		 * var4.getCenterZPosition();
		 * this.worldObj.spawnParticle("mobSpellAmbient", x, posY, z, 0, 0, 0);
		 * for (int i = 0; i < 10; i++) { this.worldObj.spawnParticle("portal",
		 * x + (this.rand.nextDouble() - 0.5D) * (double) 8, this.posY +
		 * this.rand.nextDouble() * (double) 6 - 0.25D, z +
		 * (this.rand.nextDouble() - 0.5D) * (double) 8, (this.rand.nextDouble()
		 * - 0.5D) * 2.0D, -this.rand.nextDouble(), (this.rand.nextDouble() -
		 * 0.5D) * 2.0D); } } } else { this.setupChunks(this.chunkCoordX,
		 * this.chunkCoordZ); } } } else if (!ConfigHandler.CHUNK_LOADING) {
		 * this.releaseTicket(); } else { if (this.ticket == null) {
		 * this.requestTicket(); } }
		 *//*
	}
	@Override
	public void setDead() {
		ForgeChunkManager.releaseTicket(chunkTicket);
	}

	public int setNewUniqueID() {
		// System.out.println(numberOfTrains);
		if (numberOfTrains == Integer.MIN_VALUE) {
			numberOfTrains = uniqueIDs++;
		}
		else {
			uniqueIDs = numberOfTrains++;
		}
		this.uniqueID = numberOfTrains;
		getEntityData().setInteger("uniqueID", numberOfTrains);
		// System.out.println("setting new ID "+uniqueID);
		return numberOfTrains;
	}
	
	@Override
	public boolean processInitialInteract(EntityPlayer player, EnumHand hand) {
		ItemStack heldStack = player.getHeldItem(hand);
		if (!this.world.isRemote && ConfigHandler.CHUNK_LOADING && (this instanceof Locomotive) ) {
			if (!heldStack.isEmpty() && heldStack.getItem() instanceof ItemChunkLoaderActivator) {
				this.playerEntity = player;
				if (getFlag(7)) {
					this.setFlag(7, false);
					player.sendMessage(new TextComponentString("Stop loading chunks"));
					ForgeChunkManager.releaseTicket(chunkTicket);
					chunkTicket = null;
				}
				else if (!getFlag(7)) {
					this.setFlag(7, true);
					player.sendMessage(new TextComponentString("Start loading chunks"));
				}
				heldStack.damageItem(1, player);
				return true;
			} else if(lockThisCart(heldStack, player)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * set the color of the rollingstock
	 *
	 * @see ItemRollingStock
	 * @param color
	 *//*
	public void setColor(int color) {
		if (EnumTrains.getCurrentTrain(getCartItem().getItem()).getColors()!=null){
			if (color==-1 || !ArrayUtils.contains(EnumTrains.getCurrentTrain(getCartItem().getItem()).getColors(),(byte)color)) {
				color = (EnumTrains.getCurrentTrain(getCartItem().getItem()).getColors()[0]);
			}
		}
		//dataWatcher.updateObject(12, color);
		this.getEntityData().setInteger("color", color);
	}

	public void setRenderYaw(float yaw) {
		this.renderYaw = yaw;
	}

	public void setRenderPitch(float pitch) {
		this.renderPitch = pitch;
	}

	public int getColor() {
		return 0;//dataWatcher.getWatchableObjectInt(12);
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		//super.writeEntityToNBT(nbttagcompound);
		nbttagcompound.setInteger("color", getColor());
		nbttagcompound.setBoolean("chunkLoadingState", getFlag(7));
		nbttagcompound.setDouble("trainDistanceTraveled", trainDistanceTraveled);
		nbttagcompound.setString("theOwner", trainOwner);
		nbttagcompound.setBoolean("locked", locked);
		nbttagcompound.setString("theCreator", trainCreator);
		nbttagcompound.setString("theName", trainName);
		nbttagcompound.setString("theType", trainType);
		nbttagcompound.setInteger("uniqueID", uniqueID);
		//nbttagcompound.setInteger("uniqueIDs",uniqueIDs);

		nbttagcompound.setInteger("numberOfTrains", AbstractTrains.numberOfTrains);
		nbttagcompound.setBoolean("isAttached", this.isAttached);
		nbttagcompound.setBoolean("linked", this.linked);
		//nbttagcompound.setDouble("motionX", motionX);
		//nbttagcompound.setDouble("motionZ", motionZ);
		nbttagcompound.setDouble("Link1", Link1);
		nbttagcompound.setDouble("Link2", Link2);

		nbttagcompound.setInteger("Dim", this.dimension);

		nbttagcompound.setLong("UUIDM", this.getUniqueID().getMostSignificantBits());
		nbttagcompound.setLong("UUIDL", this.getUniqueID().getLeastSignificantBits());
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		//super.readEntityFromNBT(nbttagcompound);
		setColor(nbttagcompound.getInteger("color"));
		setFlag(7, nbttagcompound.getBoolean("chunkLoadingState"));
		trainDistanceTraveled = nbttagcompound.getDouble("trainDistanceTraveled");
		trainOwner = nbttagcompound.getString("theOwner");
		this.locked = nbttagcompound.getBoolean("locked");
		setFlag(8, locked);
		trainCreator = nbttagcompound.getString("theCreator");
		trainName = nbttagcompound.getString("theName");
		trainType = nbttagcompound.getString("theType");
		uniqueID = nbttagcompound.getInteger("uniqueID");
		if(uniqueIDs==Integer.MIN_VALUE && nbttagcompound.hasKey("uniqueIDs")) {
			uniqueIDs = nbttagcompound.getInteger("uniqueIDs");
		} else {
			uniqueIDs =Integer.MIN_VALUE;
		}
		setInformation(trainType, trainOwner, trainCreator, trainName, uniqueID);

		numberOfTrains = nbttagcompound.getInteger("numberOfTrains");
		isAttached = nbttagcompound.getBoolean("isAttached");
		linked = nbttagcompound.getBoolean("linked");
		//motionX = nbttagcompound.getDouble("motionX");
		//motionZ = nbttagcompound.getDouble("motionZ");
		Link1 = nbttagcompound.getDouble("Link1");
		Link2 = nbttagcompound.getDouble("Link2");
		if(nbttagcompound.hasKey("Dim")){
			this.dimension=nbttagcompound.getInteger("Dim");
		}

		if(nbttagcompound.hasKey("UUIDM")){
			this.entityUniqueID = new UUID(nbttagcompound.getLong("UUIDM"), nbttagcompound.getLong("UUIDL"));
		}
	}
	
	@Override
	public boolean writeToNBTOptional(NBTTagCompound p_70039_1_) {
		if (!this.isDead && this.getEntityString() != null) {
			p_70039_1_.setString("id", this.getEntityString());
			this.writeToNBT(p_70039_1_);
			return true;
		}
		return false;
	}

	public void setInformation(String trainType, String trainOwner, String trainCreator, String trainName, int uniqueID) {
		if (!this.world.isRemote) {
			//dataWatcher.updateObject(6, trainType);
			//dataWatcher.updateObject(7, trainOwner);
			//dataWatcher.updateObject(9, trainName);
			//dataWatcher.updateObject(11, uniqueID);
			if (trainCreator != null && trainCreator.length() > 0){
				//dataWatcher.updateObject(13, trainCreator);
			}
		}
	}

	public static String getColorAsString(int i) {
		switch (i) {
			case 0:
				return "Black";
			case 1:
				return "Red";
			case 2:
				return "Green";
			case 3:
				return "Brown";
			case 4:
				return "Blue";
			case 5:
				return "Purple";
			case 6:
				return "Cyan";
			case 7:
				return "LightGrey";
			case 8:
				return "Grey";
			case 13:
				return "Magenta";
			case 10:
				return "Lime";
			case 11:
				return "Yellow";
			case 12:
				return "LightBlue";
			case 9:
				return "Pink";
			case 14:
				return "Orange";
			case 15:
				return "White";
			case 100:
				return "Empty";
			case 101:
				return "Full";
			default:
				return "" + i;
		}
	}

	public String getColorAsString() {
		switch (getColor()) {
			case 0:
				return "Black";
			case 1:
				return "Red";
			case 2:
				return "Green";
			case 3:
				return "Brown";
			case 4:
				return "Blue";
			case 5:
				return "Purple";
			case 6:
				return "Cyan";
			case 7:
				return "LightGrey";
			case 8:
				return "Grey";
			case 13:
				return "Magenta";
			case 10:
				return "Lime";
			case 11:
				return "Yellow";
			case 12:
				return "LightBlue";
			case 9:
				return "Pink";
			case 14:
				return "Orange";
			case 15:
				return "White";
			case 100:
				return "Empty";
			case 101:
				return "Full";
			default:
				return "" + getColor();
		}
	}

	public void dropCartAsItem(boolean isCreative) {
		if (!isCreative && !itemdropped) {
			itemdropped=true;
			for (ItemStack item : getItemsDropped()) {
				if (item.getItem() instanceof ItemRollingStock){
					ItemStack stack = ItemRollingStock.setPersistentData(item,this,this.getUniqueTrainID(),null);
					entityDropItem(stack!=null?stack:item,0);
				} else {
					entityDropItem(item, 0);
				}
			}
		}
	}
	
	@Override
	public ItemStack getPickedResult(RayTraceResult target) {
		return this.getCartItem();
	}

	protected void setDefaultMass(double def) {
		this.mass = def;
		this.defaultMass = def;
	}

	protected double getDefaultMass() {
		return defaultMass;
	}

	/**
	 * Lock packet
	 *//*
	public boolean getTrainLockedFromPacket() {
		return locked;
	}

	/**
	 * Lock packet
	 *//*
	public void setTrainLockedFromPacket(boolean set) {
		// System.out.println(worldObj.isRemote + " " + set);
		locked = set;
	}


	/** Locking for passengers, flat, caboose, jukebox,workcart *//*
	protected boolean lockThisCart(ItemStack itemstack, EntityPlayer entityplayer) {
		if (itemstack != null && (itemstack.getItem() instanceof ItemWrench || itemstack.getItem() instanceof ItemAdminBook)) {
			if (entityplayer.getDisplayName().getUnformattedText().equals(this.trainOwner) || entityplayer.getGameProfile().getName().equals(this.trainOwner)
					|| this.trainOwner.equals("") || entityplayer.canUseCommand(2, "tc.admin")) {
				if (locked) {
					locked = false;
					if(this.world.isRemote) {
						playerEntity.sendMessage(new TextComponentString("unlocked"));
					}
				}
				else {
					locked = true;
					if(this.world.isRemote) {
						playerEntity.sendMessage(new TextComponentString("locked"));
					}
				}
			}
			else if (this.world.isRemote) {
				playerEntity.sendMessage(new TextComponentString("You are not the owner!"));
			}
			return true;
		}
		return false;
	}

	protected boolean canBeRiddenWhileLocked(AbstractTrains train) {
		return (train instanceof Locomotive) || (train instanceof IPassenger) || (train instanceof AbstractWorkCart);
	}

	protected boolean canBeDestroyedByPlayer(DamageSource damagesource) {
		if (this.getTrainLockedFromPacket()) {
			if (damagesource.getImmediateSource() instanceof EntityPlayer) {
				if ((damagesource.getImmediateSource() instanceof EntityPlayerMP) &&
						damagesource.getImmediateSource().canUseCommand(2, "tc.admin") &&
					!((EntityPlayer) damagesource.getImmediateSource()).inventory.getCurrentItem().isEmpty() &&
						((EntityPlayer) damagesource.getImmediateSource()).inventory.getCurrentItem().getItem() instanceof ItemWrench) {

					damagesource.getImmediateSource().sendMessage(new TextComponentString("Removing the train using OP permission"));
					return false;
				}
				else if (!damagesource.getImmediateSource().getDisplayName().getUnformattedComponentText().toLowerCase().equals(this.trainOwner.toLowerCase())) {
					damagesource.getImmediateSource().sendMessage(new TextComponentString("You are not the owner!"));
					return true;
				}
			}
			else return !damagesource.isProjectile();
		}
		return false;
	}

	public static String getTicketDestination(ItemStack ticket) {
		if ((ticket == null)) { return ""; }
		NBTTagCompound nbt = ticket.getTagCompound();
		if (nbt == null) { return ""; }
		return nbt.getString("dest");
	}

	public void setTicket(ForgeChunkManager.Ticket ticket){
		this.chunkTicket = ticket;
	}
	public ForgeChunkManager.Ticket getTicket(){
		return this.chunkTicket;
	}

	public void requestTicket() {
		ForgeChunkManager.Ticket chunkTicket = ForgeChunkManager.requestTicket(Traincraft.instance, this.world, ForgeChunkManager.Type.ENTITY);
		if(chunkTicket != null) {
			chunkTicket.setChunkListDepth(25);
			chunkTicket.bindEntity(this);
			this.setTicket(chunkTicket);
		}
	}
	
	public String getPersistentUUID() {
		if(getEntityData().hasKey("puuid")) {
			return getEntityData().getString("puuid");
		} else {
			System.out.println("setting UUID");
			getEntityData().setString("puuid", getUniqueID().toString());
			return this.getUniqueID().toString();
		}
	}
}*/