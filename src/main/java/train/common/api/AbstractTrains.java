package train.common.api;

import buildcraft.api.tools.IToolWrench;
import cpw.mods.fml.common.FMLCommonHandler;
import mods.railcraft.api.carts.IMinecart;
import mods.railcraft.api.carts.IRoutableCart;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.common.ForgeChunkManager.Ticket;
import net.minecraftforge.common.ForgeChunkManager.Type;
import train.common.Traincraft;
import train.common.core.handlers.*;
import train.common.items.ItemChunkLoaderActivator;
import train.common.items.ItemRollingStock;
import train.common.library.EnumTrains;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTrains extends EntityMinecart implements IMinecart, IRoutableCart {

	/**
	 * The color of the current rollingstock -1 if default
	 */
	protected int color;
	/** Railcraft integration */
	private float trainSpeed = 1.2f;
	public boolean isAttached = false;
	public boolean isAttaching = false;
	public int ID;
	public static int numberOfTrains;
	public EntityPlayer playerEntity;
	public double Link1;
	public double Link2;
	protected boolean linked = false;
	public EntityRollingStock cartLinked1;
	public EntityRollingStock cartLinked2;
	public int clearLinkTimer = 0;
	//private Set chunks;
	private Ticket chunkTicket;
	private boolean chunkLoadErrorDisplayed = false;
	private boolean chunkLoadMsgDisplayed = false;
	protected float renderYaw;
	protected float renderPitch;
	public TrainHandler train;
	protected int oldChunkCoordX;
	protected int oldChunkCoordZ;
	private ArrayList<ChunkCoordIntPair> oldChunks = new ArrayList<ChunkCoordIntPair>();
	private boolean chunkForced = false;
	public boolean shouldChunkLoad = true;
	/**
	 * A reference to EnumTrains containing all spec for this specific train
	 */
	protected EnumTrains trainSpec;

	/**
	 * The name of the train based on the item name
	 */
	public String trainName = "";
	public double accelerate = 0.7D;
	public double brake = 0.96D;
	/**
	 * determines the mass of the carts from 0 to 10 it's then multiplied by 10
	 * to pretend this is [tons]
	 */
	public double mass = 1;
	/**
	 * the default mass, not affected by weight of items/liquids
	 */
	public double defaultMass = 1;
	/**
	 * the power of locomotives, 0 for carts
	 */
	public int power = 0;
	/**
	 * Whether this train is locked and can only be used by the Owner
	 */
	public boolean locked = false;
	/**
	 * The owner of the train: The user who spawned it
	 */
	public String trainOwner = "";

	public String getTrainOwner() {
		return trainOwner;
	}

	public void setTrainOwner(String trainOwner) {
		this.trainOwner = trainOwner;
	}

	/**
	 * The creator of the train
	 */
	public String trainCreator = "";

	/**
	 * The type of the train: steam tender diesel electric freight flat tank
	 * passenger work special
	 */
	public String trainType = "";

	/**
	 * player who destroyed the train
	 */
	protected String trainDestroyer = "";

	/**
	 * unique ID for a train. ID is create when item is created. This allows to
	 * track a train not only in his entity form
	 */
	public int uniqueID = -1;
	/**
	 * supposed to store the last ID given;
	 */
	public static int uniqueIDs = 1;

	/**
	 * The distance this train has traveled
	 */
	public double trainDistanceTraveled = 0;

	public String destination = "";

	/**
	 * Registers all possible color textures
	 */
	public ArrayList<Integer> acceptedColors;

	protected RollingStockStatsEventHandler statsEventHandler;

	public AbstractTrains(World world) {
		super(world);
		renderDistanceWeight = 2.0D;
		statsEventHandler = new RollingStockStatsEventHandler(this);
		color = -1;
		dataWatcher.addObject(12, color);
		acceptedColors = new ArrayList();
		if (!world.isRemote) ID = ++numberOfTrains;
		dataWatcher.addObject(5, ID);
		dataWatcher.addObject(6, trainType);
		dataWatcher.addObject(7, trainOwner);
		dataWatcher.addObject(8, trainDestroyer);
		dataWatcher.addObject(9, trainName);
		dataWatcher.addObject(10, numberOfTrains);
		dataWatcher.addObject(11, uniqueID);
		dataWatcher.addObject(13, trainCreator);
		if(!ConfigHandler.CHUNK_LOADING)shouldChunkLoad=false;
		this.setFlag(7, shouldChunkLoad);
		
		for (EnumTrains trains : EnumTrains.values()) {
			if (trains.getEntityClass().equals(this.getClass())) {
				this.setDefaultMass(trains.getMass());
				trainSpec = trains;
				if (trains.getColors() != null) {
					for (int i = 0; i < trains.getColors().length; i++) {
						this.acceptedColors.add(this.getColorFromString(trains.getColors()[i]));
					}
				}
				this.setSize((float) trainSpec.getWidth(), (float) trainSpec.getHeight());
				this.setMinecartName(trainSpec.name());
			}
		}
	}

	public AbstractTrains(World world, double x, double y, double z){
		this(world);
		this.setPosition(x, y, z);
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

	@Override
	public void onUpdate() {
		super.onUpdate();
		//if(this instanceof Locomotive)System.out.println("I'm alive. Remote: " + worldObj.isRemote);
		if (!worldObj.isRemote && this.uniqueID == -1) {
			if (FMLCommonHandler.instance().getMinecraftServerInstance() != null) {
				TraincraftSaveHandler.createFile(FMLCommonHandler.instance().getMinecraftServerInstance());
				int readID = TraincraftSaveHandler.readInt(FMLCommonHandler.instance().getMinecraftServerInstance(), "numberOfTrains:");
				int newID = setNewUniqueID(readID);
				TraincraftSaveHandler.writeValue(FMLCommonHandler.instance().getMinecraftServerInstance(), "numberOfTrains:", "" + newID);
				statsEventHandler.trainPlace(newID, this.trainName, this.trainType, this.trainOwner, this.trainOwner, (int) posX + ";" + (int) posY + ";" + (int) posZ);
				//System.out.println("Train is missing an ID, adding new one for "+this.trainName+" "+this.uniqueID);
			}
		}
		shouldChunkLoad = getFlag(7);
		statsEventHandler.trainDistance();
		if (shouldChunkLoad){
			if (!worldObj.isRemote) {
				if (chunkTicket == null) {
					chunkTicket = ForgeChunkManager.requestTicket(Traincraft.instance, worldObj, Type.NORMAL);
					chunkForced = false;
				}
				if (chunkTicket == null) {
					if (playerEntity != null && !this.chunkLoadErrorDisplayed) {
						chunkLoadErrorDisplayed = true;
						FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().sendChatMsg(new ChatComponentText(String.format("[TRAINCRAFT] The locomotive at %d, %d, %d will not load chunk because there are no more chunkloaders available", (int)posX, (int)posY, (int)posZ)));
					}
					chunkForced = false;
				}
				else if(!chunkForced){
					chunkTicket.getModData().setInteger("locoID", this.ID);
					ForgeChunkManager.forceChunk(chunkTicket, new ChunkCoordIntPair((int) posX >> 4, (int) posZ >> 4));
					forceChunkLoading(chunkTicket);
					chunkForced = true;
				}
			}
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
		 */
	}
	@Override
	public void setDead() {
		ForgeChunkManager.releaseTicket(chunkTicket);
	}
	
	public Ticket getChunkTicket(){
		return this.chunkTicket;
	}
	
	public void forceChunkLoading(Ticket ticket) {
		if (chunkTicket == null) {
			chunkTicket = ticket;
		}
		
		//System.out.println("chunk " + this);
		ArrayList<ChunkCoordIntPair> chunks = new ArrayList<ChunkCoordIntPair>();
		ChunkCoordIntPair locoChunk = new ChunkCoordIntPair((int)chunkCoordX, (int)chunkCoordZ);
		chunks.add(locoChunk);
		ForgeChunkManager.forceChunk(ticket, locoChunk);
		
		ChunkCoordIntPair oldChunk = new ChunkCoordIntPair(oldChunkCoordX, oldChunkCoordZ);
		oldChunks.add(oldChunk);
		
		for (int i = 0; i < oldChunks.size(); i++) {
			ForgeChunkManager.unforceChunk(chunkTicket, oldChunks.get(i));
			oldChunks.clear();
		}
		
		if (train != null && train.getTrains().size() > 1 && this instanceof Locomotive) {
			for (int i = 0; i < train.getTrains().size(); i++) {
				if (train.getTrains().get(i) != null && !train.getTrains().get(i).equals(this)){
					int pX = (int)train.getTrains().get(i).chunkCoordX;
					int pZ = (int)train.getTrains().get(i).chunkCoordZ;
					int oldPX = (int)train.getTrains().get(i).oldChunkCoordX;
					int oldPZ = (int)train.getTrains().get(i).oldChunkCoordZ;
					ChunkCoordIntPair chunk = new ChunkCoordIntPair(pX, pZ);
					ForgeChunkManager.forceChunk(ticket, chunk);
					chunks.add(chunk);
					ChunkCoordIntPair oldChunkRemote = new ChunkCoordIntPair(oldPX, oldPZ);
					oldChunks.add(oldChunkRemote);
				}
			}
		}
		if (this.playerEntity != null && !this.chunkLoadMsgDisplayed) {
			this.chunkLoadMsgDisplayed = true;
			FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().sendChatMsg(new ChatComponentText(String.format("[TRAINCRAFT] The locomotive at %d %d %d will keep chunks loaded for herself and %d carts", (int)posX, (int)posY, (int)posZ, chunks.size()-1)));
		}
		oldChunkCoordX = this.chunkCoordX;
		oldChunkCoordZ = this.chunkCoordZ;
	}
	public int setNewUniqueID(int numberOfTrains) {
		if (numberOfTrains <= 0) {
			numberOfTrains = uniqueIDs++;
		}
		else {
			uniqueIDs = numberOfTrains++;
		}
		this.uniqueID = numberOfTrains;
		getEntityData().setInteger("uniqueID", numberOfTrains);
		//System.out.println("setting new ID "+uniqueID);
		return numberOfTrains;
	}

	@Override
	public boolean interactFirst(EntityPlayer entityplayer) {
		ItemStack itemstack = entityplayer.inventory.getCurrentItem();
		if (!worldObj.isRemote && ConfigHandler.CHUNK_LOADING && (this instanceof Locomotive) ) {
			if (itemstack != null && itemstack.getItem() instanceof ItemChunkLoaderActivator) {
				this.playerEntity = entityplayer;
				if (getFlag(7)) {
					this.setFlag(7, false);
					entityplayer.addChatMessage(new ChatComponentText("Stop loading chunks"));
					ForgeChunkManager.releaseTicket(chunkTicket);
					chunkForced = false;
					chunkTicket = null;
				}
				else if (!getFlag(7)) {
					this.setFlag(7, true);
					entityplayer.addChatMessage(new ChatComponentText("Start loading chunks"));
				}
				itemstack.damageItem(1, entityplayer);
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
	 */
	public void setColor(int color) {
		dataWatcher.updateObject(12, color);
	}

	public void setRenderYaw(float yaw) {
		this.renderYaw = yaw;
	}

	public void setRenderPitch(float pitch) {
		this.renderPitch = pitch;
	}

	public int getColor() {
		return dataWatcher.getWatchableObjectInt(12);
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		//super.writeEntityToNBT(nbttagcompound);
		nbttagcompound.setInteger("color", getColor());
		nbttagcompound.setBoolean("chunkLoadingState", getFlag(7));
		nbttagcompound.setDouble("trainDistanceTraveled", trainDistanceTraveled);
		nbttagcompound.setString("theOwner", trainOwner);
		nbttagcompound.setBoolean("Locked", locked);
		nbttagcompound.setString("theCreator", trainCreator);
		nbttagcompound.setString("theName", trainName);
		nbttagcompound.setString("theType", trainType);
		nbttagcompound.setInteger("uniqueID", uniqueID);
		//nbttagcompound.setInteger("uniqueIDs",uniqueIDs);
		
		nbttagcompound.setInteger("numberOfTrains", this.numberOfTrains);
		nbttagcompound.setInteger("ID", this.ID);
		nbttagcompound.setBoolean("isAttached", this.isAttached);
		nbttagcompound.setBoolean("linked", this.linked);
		nbttagcompound.setDouble("motionX", motionX);
		nbttagcompound.setDouble("motionZ", motionZ);
		nbttagcompound.setDouble("Link1", Link1);
		nbttagcompound.setDouble("Link2", Link2);
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		//super.readEntityFromNBT(nbttagcompound);
		setColor(nbttagcompound.getInteger("color"));
		setFlag(7, nbttagcompound.getBoolean("chunkLoadingState"));
		trainDistanceTraveled = nbttagcompound.getDouble("trainDistanceTraveled");
		trainOwner = nbttagcompound.getString("theOwner");
		locked = nbttagcompound.getBoolean("Locked");
		setFlag(8, locked);
		trainCreator = nbttagcompound.getString("theCreator");
		trainName = nbttagcompound.getString("theName");
		trainType = nbttagcompound.getString("theType");
		uniqueID = nbttagcompound.getInteger("uniqueID");
		//uniqueIDs = nbttagcompound.getInteger("uniqueIDs");
		((EntityRollingStock) this).setInformation(trainType, trainOwner, trainCreator, trainName, uniqueID);
		
		ID = nbttagcompound.getInteger("ID");
		numberOfTrains = nbttagcompound.getInteger("numberOfTrains");
		isAttached = nbttagcompound.getBoolean("isAttached");
		linked = nbttagcompound.getBoolean("linked");
		//motionX = nbttagcompound.getDouble("motionX");
		//motionZ = nbttagcompound.getDouble("motionZ");
		Link1 = nbttagcompound.getDouble("Link1");
		Link2 = nbttagcompound.getDouble("Link2");
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
			return "LightGreen";
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
			return "LightGreen";
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

	public static int getColorFromString(String color) {
		if (color.equals("Black")) return 0;
		if (color.equals("Red")) return 1;
		if (color.equals("Green")) return 2;
		if (color.equals("Brown")) return 3;
		if (color.equals("Blue")) return 4;
		if (color.equals("Purple")) return 5;
		if (color.equals("Cyan")) return 6;
		if (color.equals("LightGrey")) return 7;
		if (color.equals("Grey")) return 8;
		if (color.equals("Magenta")) return 13;
		if (color.equals("LightGreen")) return 10;
		if (color.equals("Yellow")) return 11;
		if (color.equals("LightBlue")) return 12;
		if (color.equals("Pink")) return 9;
		if (color.equals("Orange")) return 14;
		if (color.equals("White")) return 15;
		if (color.equals("Empty")) return 100;
		if (color.equals("Full")) return 101;
		return -1;
	}

	public void dropCartAsItem() {
		for (ItemStack item : getItemsDropped()) {
			setUniqueIDToItem(item);
			entityDropItem(item, 0);
		}
	}

	protected void setUniqueIDToItem(ItemStack stack) {
		NBTTagCompound var3 = stack.getTagCompound();
		if (var3 == null) {
			var3 = new NBTTagCompound();
			stack.setTagCompound(var3);
		}
		if (this.uniqueID != -1) stack.getTagCompound().setInteger("uniqueID", this.uniqueID);
		if (this.trainCreator != null && this.trainCreator.length() > 0) stack.getTagCompound().setString("trainCreator", this.trainCreator);
		if (this.getColor() != -1) stack.getTagCompound().setInteger("trainColor", this.getColor());
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
	 */
	public void setTrainLockedFromPacket(boolean set) {
		//System.out.println(worldObj.isRemote+" "+set);
		locked = set;
	}

	/**
	 * Lock packet and owner
	 */
	public void setTrainLockedFromPacket(boolean set, String owner) {
		locked = set;
		trainOwner = owner;
	}

	/**
	 * Lock packet
	 */
	public boolean getTrainLockedFromPacket() {
		return locked;
	}

	public void sendTrainLockedPacket(EntityPlayer entity, boolean locked) {
		Traincraft.modChannel.sendToServer(PacketHandler.setTrainLockedToClient(entity, this, locked));
	}

	/** Locking for passengers, flat, caboose, jukebox,workcart */
	protected boolean lockThisCart(ItemStack itemstack, EntityPlayer entityplayer) {
		if (itemstack != null && itemstack.getItem() instanceof IToolWrench) {
			if (entityplayer.getDisplayName().equals(this.trainOwner)) {
				if (locked) {
					locked = false;
					entityplayer.addChatMessage(new ChatComponentText("unlocked"));
				}
				else if (!locked) {
					locked = true;
					entityplayer.addChatMessage(new ChatComponentText("locked"));
				}
			}
			else {
				entityplayer.addChatMessage(new ChatComponentText("You are not the owner!"));
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
			if (damagesource.getEntity() instanceof EntityPlayer) {
				if ((damagesource.getEntity() instanceof EntityPlayerMP) && MinecraftServer.getServer() != null && MinecraftServer.getServer().getConfigurationManager() != null && MinecraftServer.getServer().getConfigurationManager().func_152596_g(((EntityPlayer) damagesource.getEntity()).getGameProfile()) && ((EntityPlayer) damagesource.getEntity()).inventory.getCurrentItem() != null && ((EntityPlayer) damagesource.getEntity()).inventory.getCurrentItem().getItem() instanceof IToolWrench) {

					((EntityPlayer) damagesource.getEntity()).addChatMessage(new ChatComponentText("Removing the train using OP permission"));
				}
				else if (!((EntityPlayer) damagesource.getEntity()).getDisplayName().toLowerCase().equals(this.trainOwner.toLowerCase())) {
					((EntityPlayer) damagesource.getEntity()).addChatMessage(new ChatComponentText("You are not the owner!"));
					return true;
				}
			}
			else {
				return true;
			}
		}
		return false;
	}

	/** Railcraft routing integration */
	@Override
	public boolean doesCartMatchFilter(ItemStack stack, EntityMinecart cart) {
		if (stack == null || cart == null) { return false; }
		ItemStack cartItem = cart.getCartItem();
		return cartItem != null && stack.isItemEqual(cartItem);
	}

	@Override
	public String getDestination() {
		if (destination == null) return "";
		return destination;
	}

	/**
	 * Only locomotives can receive a destination from a track. It is then
	 * transmitted to attached carts
	 */
	@Override
	public boolean setDestination(ItemStack ticket) {
		return false;
	}

	public static String getTicketDestination(ItemStack ticket) {
		if ((ticket == null)) { return ""; }
		NBTTagCompound nbt = ticket.getTagCompound();
		if (nbt == null) { return ""; }
		return nbt.getString("dest");
	}
}