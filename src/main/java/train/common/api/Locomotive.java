package train.common.api;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.NetworkRegistry.TargetPoint;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.world.World;
import org.lwjgl.input.Keyboard;
import train.common.Traincraft;
import train.common.adminbook.ServerLogger;
import train.common.core.HandleMaxAttachedCarts;
import train.common.core.handlers.ConfigHandler;
import train.common.core.network.PacketKeyPress;
import train.common.core.network.PacketParkingBrake;
import train.common.core.network.PacketSlotsFilled;
import train.common.library.EnumSounds;
import train.common.library.Info;
import train.common.mtc.PDMMessage;
import train.common.mtc.TilePDMInstructionRadio;
import train.common.mtc.packets.*;

import java.util.List;
import java.util.Random;

public abstract class Locomotive extends EntityRollingStock implements IInventory, WirelessTransmitter {
    public int inventorySize;
    protected ItemStack locoInvent[];
    private int soundPosition = 0;
    public boolean parkingBrake = false;
    private int whistleDelay = 0;
    private int blowUpDelay = 0;
    private String lastRider = "";
    private Entity lastEntityRider;
    public int numCargoSlots;
    public int numCargoSlots1;
    public int numCargoSlots2;
    private boolean hasDrowned = false;
    protected boolean canCheckInvent = true;
    private int slotsFilled = 0;
    private int fuelUpdateTicks = 0;
    public boolean isLocoTurnedOn = false;
    public boolean forwardPressed = false;
    private boolean backwardPressed = false;
    public boolean brakePressed = false;


    public int speedLimit = 0;
    public String trainLevel = "1";
    public int mtcStatus = 0;
    public int mtcType = 1;
    public int atoStatus = 0;
    public Double xFromStopPoint = 0.0;
    public Double yFromStopPoint = 0.0;
    public Double zFromStopPoint = 0.0;
    public Double distanceFromStopPoint = 0.0;
    public Double xStationStop = 0.0;
    public Double yStationStop = 0.0;
    public Double zStationStop = 0.0;
    public Double distanceFromStationStop = 0.0;
    public boolean stationStopping = false;
    public int nextSpeedLimit = 0;
    public Double distanceFromSpeedChange = 0.0;
    public Double xSpeedLimitChange = 0.0;
    public Double ySpeedLimitChange = 0.0;
    public Double zSpeedLimitChange = 0.0;
    public boolean isDriverOverspeed = false;
    public boolean overspeedBrakingInProgress = false;
    public Boolean mtcOverridePressed = false;
    public Boolean overspeedOveridePressed = false;
    public String serverUUID = "";
    public String trainID;
    public String currentSignalBlock = "";
    public boolean speedGoingDown = false;
    public boolean isConnected = false;
    public TileEntity[] blocksToCheck;
    public boolean stationStop = false;
    /**
     * state of the loco
     */
    private String locoState = "";
    /**
     * false if linked carts have no effect on the velocity of this cart. Use
     * carefully, if you link two carts that can't be adjusted, it will behave
     * as if they are not linked.
     */
    protected boolean canBeAdjusted = false;

    /**
     * These variables are used to display changes in the GUI
     */
    public int currentNumCartsPulled = 0;
    public double currentMassPulled = 0;
    public double currentSpeedSlowDown = 0;
    public double currentAccelSlowDown = 0;
    public double currentBrakeSlowDown = 0;
    public double currentFuelConsumptionChange = 0;

    /**
     * used internally inside each loco to set the fuel consumption
     */
    protected int fuelRate;
    /**
     * This is for the "can pull" feature It is used to avoid conflict with
     * isCartLockDown @see EntityRollingStock line 422 This is set in @see
     * TrainsOnClick
     */
    public boolean canBePulled = false;


    public Locomotive(World world) {
        super(world);
        setFuelConsumption(0);
        inventorySize = numCargoSlots + numCargoSlots2 + numCargoSlots1;
        dataWatcher.addObject(2, 0);
        this.setDefaultMass(0);
        this.setCustomSpeed(getMaxSpeed());
        dataWatcher.addObject(3, destination);
        dataWatcher.addObject(22, locoState);
        dataWatcher.addObject(24, fuelTrain);
        dataWatcher.addObject(25, (int) convertSpeed(Math.sqrt(Math.abs(motionX * motionX) + Math.abs(motionZ * motionZ))));//convertSpeed((Math.abs(this.motionX) + Math.abs(this.motionZ))
        dataWatcher.addObject(26, castToString(currentNumCartsPulled));
        dataWatcher.addObject(27, castToString(currentMassPulled));
        dataWatcher.addObject(28, castToString(Math.round(currentSpeedSlowDown)));
        dataWatcher.addObject(29, castToString(currentAccelSlowDown));
        dataWatcher.addObject(30, castToString(currentBrakeSlowDown));
        dataWatcher.addObject(31, castToString(currentFuelConsumptionChange));
        dataWatcher.addObject(15, (float)Math.round((getCustomSpeed() * 3.6f)));
        //dataWatcher.addObject(32, lineWaypoints);
        setAccel(0);
        setBrake(0);
        this.entityCollisionReduction = 0.99F;
        if(this instanceof SteamTrain)isLocoTurnedOn = true;
        char[] chars = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
        StringBuilder sb = new StringBuilder(5);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();
        trainID = output;
        if (serverUUID != "") {
            attemptConnection(serverUUID);
        }
    }

    /**
     * this is basically NBT for entity spawn, to keep data between client and server in sync because some data is not automatically shared.
     */
    @Override
    public void readSpawnData(ByteBuf additionalData) {
        super.readSpawnData(additionalData);
        isLocoTurnedOn = additionalData.readBoolean();
        parkingBrake = additionalData.readBoolean();
    }
    @Override
    public void writeSpawnData(ByteBuf buffer) {
        super.writeSpawnData(buffer);
        buffer.writeBoolean(isLocoTurnedOn);
        buffer.writeBoolean(parkingBrake);
    }

    private String castToString(double str) {
        return "" + str;
    }

    @Override
    public boolean isPoweredCart() {
        return true;
    }

    @Override
    public boolean canBeRidden() {
        return true;
    }

    /**
     * To disable linking altogether, return false here.
     *
     * @return True if this cart is linkable.
     */
    @Override
    public boolean isLinkable() {
        return false;
    }

    /**
     * Returns true if this cart is a storage cart Some carts may have
     * inventories but not be storage carts and some carts without inventories
     * may be storage carts.
     *
     * @return True if this cart should be classified as a storage cart.
     */
    @Override
    public boolean isStorageCart() {
        return false;
    }

    protected int getCurrentMaxSpeed() {
        return (dataWatcher.getWatchableObjectInt(2));
    }

    protected void setCurrentMaxSpeed(int maxSpeed) {
        if (!worldObj.isRemote) {
            dataWatcher.updateObject(2, maxSpeed);
        }
    }

    /**
     * set the max speed in km/h if the param is 0 then the default speed is
     * used
     *
     * //@param speed //this is for making documentation of some sort via javadoc, shouldn't be relevant to the operation of the mod
     */
    public void setCustomSpeed(double m) {
        if (m != 0) {
            setCurrentMaxSpeed((int) m);
            return;
        }
        setCurrentMaxSpeed((int) this.getMaxSpeed());
    }

    /**
     * returns the absolute maximum speed of the given locomotive (speed in
     * km/h) divided by 3.6 to get ms
     *
     * @return double
     */
    public float getMaxSpeed() {
        if (trainSpec != null) {
            if (currentMassPulled > 1) {
                float power = (float) currentMassPulled / (((float) trainSpec.getMHP())*0.37f);
                if (power > 1) {
                    return trainSpec.getMaxSpeed() / (power);
                }
            }
            return trainSpec.getMaxSpeed();
        }
        return 50;
    }

    /**
     * returns the current maximum speed of the given locomotive (speed in km/h)
     * divided by 3.6 to get ms
     *
     * @return double
     */
    public float getCustomSpeed() {
        return getCurrentMaxSpeed() / 3.6f;
    }

    @Override
    public boolean canOverheat() {
        return getOverheatTime() > 0;
    }

    @Override
    public int getOverheatTime() {
        if (trainSpec != null) { return trainSpec.getHeatingTime(); }
        return 0;
    }

    @Override
    public void limitSpeedOnTCRail() {
        maxSpeed = SpeedHandler.handleSpeed(getMaxSpeed(), maxSpeed, this);
        //System.out.println(maxSpeed);
        if (this.speedLimiter != 0 && speedWasSet) {
            //maxSpeed *= this.speedLimiter;
            adjustSpeed(maxSpeed, speedLimiter);
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
    }

    /**
     * set the fuel consumption rate for each loco if i is 0 then default
     * consumption is used
     *
     * //@param i //this is for making documentation of some sort via javadoc, shouldn't be relevant to the operation of the mod
     * @return
     */
    public int setFuelConsumption(int c) {
        if (c != 0) { return fuelRate = c; }
        if (trainSpec != null) { return fuelRate = trainSpec.getFuelConsumption(); }
        return 0;

    }

    /**
     * returns the fuel consumption rate for each loco
     *
     * @return int
     */
    public int getFuelConsumption() {
        return fuelRate==0?trainSpec.getFuelConsumption():fuelRate;
    }

    /**
     * Return the power of the loco, used for cart pulling
     *
     * @see HandleMaxAttachedCarts for calculations
     */
    public int getPower() {
        if (trainSpec != null) { return trainSpec.getMHP(); }
        return 0;
    }

    /**
     * Set acceleration rate if rate = 0, default value is used
     *
     * @param rate
     */
    public double setAccel(double rate) {
        if (rate != 0) {
            return accelerate = rate;
        }
        else {
            if (trainSpec != null) { return accelerate = trainSpec.getAccelerationRate(); }
            return 0.45;
        }
    }

    /**
     * Set brake rate if rate = 0, default value is used
     *
     * @param rate
     */
    public double setBrake(double rate) {
        if (rate != 0) {
            return brake = rate;
        }
        else {
            if (trainSpec != null) { return brake = trainSpec.getBrakeRate(); }
            return 0.98;
        }
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
        super.writeEntityToNBT(nbttagcompound);
        nbttagcompound.setBoolean("canBeAdjusted", canBeAdjusted);
        nbttagcompound.setBoolean("canBePulled", canBePulled);
        nbttagcompound.setInteger("overheatLevel",  getOverheatLevel());
        nbttagcompound.setString("lastRider", lastRider);
        nbttagcompound.setString("destination", destination);
        nbttagcompound.setBoolean("parkingBrake", parkingBrake);
        if (!(this instanceof SteamTrain)) {
            nbttagcompound.setBoolean("isLocoTurnedOn", isLocoTurnedOn);
        }
        nbttagcompound.setString("trainID", trainID);
        nbttagcompound.setInteger("speedLimit", speedLimit);
        nbttagcompound.setString("trainLevel", trainLevel);
        nbttagcompound.setInteger("mtcStatus", mtcStatus);
        nbttagcompound.setInteger("mtcType", mtcType);
        nbttagcompound.setInteger("atoStatus", atoStatus);
        nbttagcompound.setDouble("xFromStop", xFromStopPoint);
        nbttagcompound.setDouble("yFromStop", yFromStopPoint);
        nbttagcompound.setDouble("zFromStop", zFromStopPoint);
        nbttagcompound.setDouble("xFromStationStop", xStationStop);
        nbttagcompound.setDouble("yFromStationStop", yStationStop);
        nbttagcompound.setDouble("zFromStationStop", zStationStop);
        nbttagcompound.setInteger("nextSpeedLimit", nextSpeedLimit);
        nbttagcompound.setDouble("xSpeedChange", xSpeedLimitChange);
        nbttagcompound.setDouble("ySpeedChange", ySpeedLimitChange);
        nbttagcompound.setDouble("zSpeedChange", zSpeedLimitChange);
        nbttagcompound.setBoolean("mtcOverridePressed", mtcOverridePressed);
        nbttagcompound.setBoolean("overspeedOverridePressed", overspeedOveridePressed);
        nbttagcompound.setString("serverUUID", serverUUID);
        nbttagcompound.setString("currentSignalBlock", currentSignalBlock);
        nbttagcompound.setBoolean("isConnected", isConnected);
        nbttagcompound.setBoolean("stationStop", stationStop);
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound ntc) {
        super.readEntityFromNBT(ntc);
        canBeAdjusted = ntc.getBoolean("canBeAdjusted");
        canBePulled = ntc.getBoolean("canBePulled");
        setOverheatLevel(ntc.getInteger("overheatLevel"));
        lastRider = ntc.getString("lastRider");
        destination = ntc.getString("destination");
        this.parkingBrake = ntc.getBoolean("parkingBrake");
        if (!(this instanceof SteamTrain)) {
            isLocoTurnedOn = ntc.getBoolean("isLocoTurnedOn");
        }
        trainID = ntc.getString("trainID");
        speedLimit = ntc.getInteger("speedLimit");
        trainLevel = ntc.getString("trainLevel");
        mtcStatus = ntc.getInteger("mtcStatus");
        mtcType = ntc.getInteger("mtcType");
        atoStatus = ntc.getInteger("atoStatus");
        xFromStopPoint = ntc.getDouble("xFromStop");
        yFromStopPoint = ntc.getDouble("yFromStop");
        zFromStopPoint = ntc.getDouble("zFromStop");
        xStationStop = ntc.getDouble("xFromStationStop");
        yStationStop = ntc.getDouble("yFromStationStop");
        zStationStop = ntc.getDouble("zFromStationStop");
        nextSpeedLimit = ntc.getInteger("nextSpeedLimit");
        xSpeedLimitChange = ntc.getDouble("xSpeedChange");
        ySpeedLimitChange = ntc.getDouble("ySpeedChange");
        zSpeedLimitChange = ntc.getDouble("zSpeedChange");
        mtcOverridePressed = ntc.getBoolean("mtcOverridePressed");
        overspeedOveridePressed = ntc.getBoolean("overspeedOverridePressed");
        serverUUID = ntc.getString("serverUUID");
        currentSignalBlock = ntc.getString("currentSignalBlock");
        isConnected = ntc.getBoolean("isConnected");
        stationStop = ntc.getBoolean("stationStop");
    }

    /**
     * Returns true if this entity should push and be pushed by other entities
     * when colliding.
     */
    @Override
    public boolean canBePushed() {
        return false;
    }

    public void setCanBeAdjusted(boolean canBeAdj) {
        this.canBeAdjusted = canBeAdj;
    }

    /**
     * gets packet from server and distribute for GUI handles motion
     *
     * @param i
     */
    @Override
    public void keyHandlerFromPacket(int i) {
        if (this.getTrainLockedFromPacket()) {
            if (this.riddenByEntity instanceof EntityPlayer
                    && !((EntityPlayer) this.riddenByEntity).getDisplayName().toLowerCase()
                    .equals(this.getTrainOwner().toLowerCase())) {
                return;
            }
        }
        pressKey(i);
        if (i == 8 && ConfigHandler.SOUNDS) {
            soundHorn();
        }
        if (i == 10){
            soundWhistle();
        }
        if (i == 4) {
            forwardPressed = true;
        }
        if (i == 5) {
            backwardPressed = true;
        }
        if (i == 12) {
            brakePressed = true;
        }
        if (i == 13) {
            forwardPressed = false;
        }
        if (i == 14) {
            backwardPressed = false;
        }
        if (i == 15) {
            brakePressed = false;
        }
        if (i == 16) {
            if (mtcStatus != 0 && this.mtcType == 2) {
                if (!(this instanceof SteamTrain && !ConfigHandler.ALLOW_ATO_ON_STEAMERS)) {
                    if (atoStatus == 1) {
                        atoStatus = 0;
                    } else {
                        atoStatus = 1;
                    }
                }
            }
        }

        if (i == 17) {

            if (mtcOverridePressed) {
                mtcOverridePressed = false;
            } else {
                mtcOverridePressed = true;
                this.mtcStatus = 0;
                this.speedLimit = 0;
                this.nextSpeedLimit = 0;
                this.xSpeedLimitChange = 0.0;
                this.ySpeedLimitChange = 0.0;
                this.zSpeedLimitChange = 0.0;
                this.xFromStopPoint = 0.0;
                this.yFromStopPoint = 0.0;
                this.zFromStopPoint = 0.0;
                this.trainLevel = "0";
                disconnectFromServer();
            }



        }
        if (i == 18) {
            if (mtcStatus != 0) {
                if (overspeedOveridePressed ) {
                    overspeedOveridePressed = false;
                } else {
                    overspeedOveridePressed = true;
                }
            }
        }
    }

    /**
     * All this is used in GUI only
     *
     * @return
     */
    public String getCurrentNumCartsPulled() {
        return (this.dataWatcher.getWatchableObjectString(26));
    }

    public String getCurrentMassPulled() {
        return (this.dataWatcher.getWatchableObjectString(27));
    }

    public String getCurrentSpeedSlowDown() {
        return (this.dataWatcher.getWatchableObjectString(28));
    }

    public String getCurrentAccelSlowDown() {
        return (this.dataWatcher.getWatchableObjectString(29));
    }

    public String getCurrentBrakeSlowDown() {
        return (this.dataWatcher.getWatchableObjectString(30));
    }

    public String getCurrentFuelConsumptionChange() {
        return (this.dataWatcher.getWatchableObjectString(31));
    }

    public Float getCustomSpeedGUI() {
        return (this.dataWatcher.getWatchableObjectFloat(15));
    }

    public String getDestinationGUI() {
        if (worldObj.isRemote) { return (this.dataWatcher.getWatchableObjectString(3)); }
        return destination;
    }

    private double convertSpeed(double speed) {
        //System.out.println("X "+motionX +" Z "+motionZ);
        if (ConfigHandler.REAL_TRAIN_SPEED) {
            speed *= 2;// applying ratio
        }
        else {
            speed *= 6;
        }
        speed *= 36;
        //speed *= 10;// convert in ms
        //speed *= 6;// applying ratio
        //speed *= 3.6;// convert in km/h
        return speed;
    }

    public void soundHorn() {
        for (EnumSounds sounds : EnumSounds.values()) {
            if (sounds.getEntityClass() != null && !sounds.getHornString().equals("")&& sounds.getEntityClass().equals(this.getClass()) && whistleDelay == 0) {
                worldObj.playSoundAtEntity(this, Info.resourceLocation + ":" + sounds.getHornString(), sounds.getHornVolume(), 1.0F);
                whistleDelay = 65;
            }
        }
        List entities = worldObj.getEntitiesWithinAABB(EntityAnimal.class, AxisAlignedBB.getBoundingBox(
                this.posX-20,this.posY-5,this.posZ-20,
                this.posX+20,this.posY+5,this.posZ+20));

        for(Object e : entities) {
            if(e instanceof EntityAnimal) {
                ((EntityAnimal) e).setTarget(this);
                ((EntityAnimal) e).getNavigator().setPath(null, 0);
            }
        }
    }

    public void soundWhistle() {
        worldObj.playSoundAtEntity(this, Info.resourceLocation + ":" + "bell", 0.5F, 1.0F);

    }

    @Override
    public void onUpdate() {

        if (worldObj.isRemote && ticksExisted %2 ==0 && !Minecraft.getMinecraft().ingameGUI.getChatGUI().getChatOpen()){
            if (Keyboard.isKeyDown(FMLClientHandler.instance().getClient().gameSettings.keyBindForward.getKeyCode())
                    && !forwardPressed) {
                Traincraft.keyChannel.sendToServer(new PacketKeyPress(4));
                forwardPressed = true;
            } else if (!Keyboard
                    .isKeyDown(FMLClientHandler.instance().getClient().gameSettings.keyBindForward.getKeyCode())
                    && forwardPressed) {
                Traincraft.keyChannel.sendToServer(new PacketKeyPress(13));
                forwardPressed = false;
            }
            if (Keyboard.isKeyDown(FMLClientHandler.instance().getClient().gameSettings.keyBindBack.getKeyCode())
                    && !backwardPressed) {
                Traincraft.keyChannel.sendToServer(new PacketKeyPress(5));
                backwardPressed = true;
            } else if (!Keyboard
                    .isKeyDown(FMLClientHandler.instance().getClient().gameSettings.keyBindBack.getKeyCode())
                    && backwardPressed) {
                Traincraft.keyChannel.sendToServer(new PacketKeyPress(14));
                backwardPressed = false;
            }
            if (Keyboard.isKeyDown(FMLClientHandler.instance().getClient().gameSettings.keyBindJump.getKeyCode())
                    && !brakePressed) {
                Traincraft.keyChannel.sendToServer(new PacketKeyPress(12));
                brakePressed = true;
            } else if (!Keyboard
                    .isKeyDown(FMLClientHandler.instance().getClient().gameSettings.keyBindJump.getKeyCode())
                    && brakePressed) {
                Traincraft.keyChannel.sendToServer(new PacketKeyPress(15));
                brakePressed = false;
            }

        }

        // if (worldObj.isRemote) {
        // if (updateTicks % 50 == 0) {
        // Traincraft.brakeChannel
        // .sendToServer(new PacketParkingBrake(parkingBrake, this.getEntityId()));
        // Traincraft.ignitionChannel.sendToServer(new PacketSetLocoTurnedOn(isLocoTurnedOn));//
        // sending to client
        // updateTicks=0;
        // }
        // }
        if (!worldObj.isRemote) {
            if (this.riddenByEntity instanceof EntityLivingBase) {
                //EntityLivingBase entity = (EntityLivingBase) this.riddenByEntity;
                if (forwardPressed || backwardPressed) {
                    if (getFuel() > 0 && this.isLocoTurnedOn() && rand.nextInt(4) == 0 && !worldObj.isRemote) {
                        if (this.getTrainLockedFromPacket() && !((EntityPlayer) this.riddenByEntity).getDisplayName()
                                .toLowerCase().equals(this.getTrainOwner().toLowerCase())) {
                            return;
                        }
                        if (riddenByEntity instanceof EntityPlayer) {
                            int dir = MathHelper
                                    .floor_double((((EntityPlayer) riddenByEntity).rotationYaw * 4F) / 360F + 0.5D) & 3;
                            if (dir == 2){
                                if (forwardPressed) {
                                    motionZ -= 0.0075 * this.accelerate;
                                } else {
                                    motionZ += 0.0075 * this.accelerate;
                                }
                            } else if (dir == 0){
                                if (forwardPressed) {
                                    motionZ += 0.0075 * this.accelerate;
                                } else {
                                    motionZ -= 0.0075 * this.accelerate;
                                }
                            } else if (dir == 1){
                                if (forwardPressed) {
                                    motionX -= 0.0075 * this.accelerate;
                                } else {
                                    motionX += 0.0075 * this.accelerate;
                                }
                            } else if (dir == 3){
                                if (forwardPressed) {
                                    motionX += 0.0075 * this.accelerate;
                                } else {
                                    motionX -= 0.0075 * this.accelerate;
                                }
                            }
                        }
                    }
                } else if (brakePressed) {
                    motionX *= brake;
                    motionZ *= brake;
                }
            }


            if (updateTicks % 20 == 0) HandleMaxAttachedCarts.PullPhysic(this);
            /**
             * Can't use datawatcher here. Locomotives use them all already
             * Check inventory The packet never arrives if it is sent when the
             * entity reads its NBT (player hasn't been initialised probably)
             */
            if (updateTicks % 200 == 0) {
                this.slotsFilled = 0;
                for (int i = 0; i < getSizeInventory(); i++) {
                    ItemStack itemstack = getStackInSlot(i);
                    if (itemstack != null) {
                        slotsFilled++;
                    }
                }

                Traincraft.slotschannel.sendToAllAround(new PacketSlotsFilled(this, slotsFilled), new TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, 150.0D));
            }
            /**
             * Fuel consumption
             */
            //if (this instanceof DieselTrain) consumption /= 5;
            if (fuelUpdateTicks >= 100) {
                fuelUpdateTicks = 0;
                updateFuelTrain(this.getFuelConsumption());
            }
            fuelUpdateTicks++;

            if (!this.isLocoTurnedOn()) {
                motionX *= 0;
                motionZ *= 0;
            }

        }
        if (whistleDelay > 0) {
            whistleDelay--;
        }
        if (this.riddenByEntity instanceof EntityPlayer) {
            this.lastRider = ((EntityPlayer) this.riddenByEntity).getDisplayName();
            this.lastEntityRider = (this.riddenByEntity);
        }

        if (!this.worldObj.isRemote && this.getParkingBrakeFromPacket() && !getState().equals("broken")) {
            motionX *= 0.0;
            motionZ *= 0.0;
        }
        if (ConfigHandler.SOUNDS) {
            for (EnumSounds sounds : EnumSounds.values()) {
                if (sounds.getEntityClass() != null && !sounds.getHornString().equals("")&& sounds.getEntityClass().equals(this.getClass()) && whistleDelay == 0) {
                    if (getFuel() > 0 && this.isLocoTurnedOn()) {
                        double speed = Math.sqrt(motionX * motionX + motionZ * motionZ);
                        if (speed > -0.001D && speed < 0.01D && soundPosition == 0) {
                            worldObj.playSoundAtEntity(this, Info.resourceLocation + ":" + sounds.getIdleString(), sounds.getIdleVolume(), 0.001F);
                            soundPosition = sounds.getIdleSoundLenght();
                        }
                        if (sounds.getSoundChangeWithSpeed() && !sounds.getHornString().equals("")&& sounds.getEntityClass().equals(this.getClass()) && whistleDelay == 0) {
                            if (speed > 0.01D && speed < 0.06D && soundPosition == 0) {
                                worldObj.playSoundAtEntity(this, Info.resourceLocation + ":" + sounds.getRunString(), sounds.getRunVolume(), 0.1F);
                                soundPosition = sounds.getRunSoundLenght();
                            }
                            else if (speed > 0.06D && speed < 0.2D && soundPosition == 0) {
                                worldObj.playSoundAtEntity(this, Info.resourceLocation + ":" + sounds.getRunString(), sounds.getRunVolume(), 0.4F);
                                soundPosition = sounds.getRunSoundLenght() / 2;
                            }
                            else if (speed > 0.2D && soundPosition == 0) {
                                worldObj.playSoundAtEntity(this, Info.resourceLocation + ":" + sounds.getRunString(), sounds.getRunVolume(), 0.5F);
                                soundPosition = sounds.getRunSoundLenght() / 3;
                            }
                        }
                        else {
                            if (speed > 0.01D && soundPosition == 0) {
                                worldObj.playSoundAtEntity(this, Info.resourceLocation + ":" + sounds.getRunString(), sounds.getRunVolume(), 0.4F);
                                soundPosition = sounds.getRunSoundLenght();
                            }
                        }
                        if (soundPosition > 0) {
                            soundPosition--;
                        }
                    }
                    break;
                }
            }
        }
        if (getState().equals("cold")) {
            this.extinguish();
            if (getCurrentMaxSpeed() >= (getMaxSpeed() * 0.6)) {
                motionX *= 0.0;
                motionZ *= 0.0;
            }
        }
        if (getState().equals("warm")) {
            this.extinguish();
            if (getCurrentMaxSpeed() >= (getMaxSpeed() * 0.7)) {
                motionX *= 0.94;
                motionZ *= 0.94;
            }
        }
        if (getState().equals("hot")) {
            this.extinguish();
        }
        //if (getState().equals("very hot")) {}
        if (getState().equals("too hot")) {
            motionX *= 0.95;
            motionZ *= 0.95;
            worldObj.spawnParticle("largesmoke", posX, posY + 0.3, posZ, 0.0D, 0.0D, 0.0D);
        }
        if (getState().equals("broken")) {
            setFire(8);
            this.setCustomSpeed(0);// set speed to normal
            this.setAccel(0.000001);// simulate a break down
            this.setBrake(1);
            this.motionX *= 0.97;// slowly slows down
            this.motionZ *= 0.97;
            worldObj.spawnParticle("largesmoke", posX, posY + 0.3, posZ, 0.0D, 0.0D, 0.0D);
            worldObj.spawnParticle("largesmoke", posX, posY + 0.3, posZ, 0.0D, 0.0D, 0.0D);
            blowUpDelay++;
            if (blowUpDelay > 80) {
                if (!worldObj.isRemote) {
                    //worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 0.5F, true);
                    worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 0.5F, false);
                    this.setDead();
                }
                if (!worldObj.isRemote && FMLCommonHandler.instance().getMinecraftServerInstance() != null && this.lastEntityRider instanceof EntityPlayer) {
                    FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().sendChatMsg(new ChatComponentText(((EntityPlayer) this.lastEntityRider).getDisplayName() + " blew " + this.getTrainOwner() + "'s locomotive"));
                    FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().sendChatMsg(new ChatComponentText(((EntityPlayer) this.lastEntityRider).getDisplayName() + " blew " + this.getTrainOwner() + "'s locomotive"));
                }
            }
        }
        //Minecraft Train Control things.
        if (!worldObj.isRemote) {
            if (mtcStatus == 1 | mtcStatus == 2) {
                if (mtcType == 2) {
                    //Send updates every few seconds
                    if (this.ticksExisted % 20 == 0 && !canBePulled) {
                        JsonObject sendingObj = new JsonObject();
                        sendingObj.addProperty("funct", "update");
                        sendingObj.addProperty("signalBlock", this.currentSignalBlock);
                        sendingObj.addProperty("destination", this.getDestinationGUI());
                        sendingObj.addProperty("trainLevel", this.trainLevel);
                        sendMessage(new PDMMessage(this.trainID, this.serverUUID, sendingObj.toString(), 1));
                    }
                }
                if (getSpeed() > speedLimit && speedLimit != 0) {
                    isDriverOverspeed = true;
                } else {
                    isDriverOverspeed = false;

                }
                if (isDriverOverspeed && ticksExisted % 120 == 0 && !overspeedBrakingInProgress && !overspeedOveridePressed && atoStatus != 1) {
                    //Start braking because the driver is an idiot.
                    overspeedBrakingInProgress = true;
                }
                if (overspeedBrakingInProgress && atoStatus != 1) {
                    if (getSpeed() < speedLimit) {
                        //Stop overspeed braking.
                        overspeedBrakingInProgress = false;
                        isDriverOverspeed = false;
                    } else {
                        slow(speedLimit);
                    }
                }

                distanceFromStopPoint = this.getDistance(this.xFromStopPoint, this.yFromStopPoint, this.zFromStopPoint);
                distanceFromSpeedChange = this.getDistance(this.xSpeedLimitChange, this.ySpeedLimitChange, this.zSpeedLimitChange);

                if (distanceFromSpeedChange <= this.speedLimit && distanceFromSpeedChange <= this.getSpeed() && !(distanceFromSpeedChange <= this.nextSpeedLimit)) {
                    speedLimit = (int) Math.round(distanceFromSpeedChange);
                    speedGoingDown = true;

                    Traincraft.itsChannel.sendToAllAround(new PacketSetSpeed(this.speedLimit, (int) this.posX, (int) this.posY, (int) this.posZ, getEntityId()), new TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, 150.0D));
                    if (distanceFromSpeedChange <= 6) {
                        this.xSpeedLimitChange = 0.0;
                        this.ySpeedLimitChange = 0.0;
                        this.zSpeedLimitChange = 0.0;
                        speedLimit = nextSpeedLimit;
                        this.nextSpeedLimit = 0;
                        Traincraft.itsChannel.sendToAllAround(new PacketSetSpeed(this.speedLimit, (int) this.posX, (int) this.posY, (int) this.posZ, getEntityId()), new TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, 150.0D));
                        Traincraft.itnsChannel.sendToAllAround(new PacketNextSpeed( nextSpeedLimit, 0,0,0, xSpeedLimitChange, ySpeedLimitChange, zSpeedLimitChange, this.getEntityId()), new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, 150.0D));
                        speedGoingDown = false;
                        speedGoingDown = false;
                        speedGoingDown = false;
                        speedGoingDown = false;
                    }

                }

                if (distanceFromStopPoint >= 40 && distanceFromStopPoint < this.speedLimit && !(xFromStopPoint == 0.0) && mtcType == 1){
                    this.speedLimit = (int)Math.round(distanceFromStopPoint);
                    Traincraft.itsChannel.sendToAllAround(new PacketSetSpeed(this.speedLimit, (int) this.posX, (int) this.posY, (int) this.posZ, getEntityId()), new TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, 150.0D));
                    speedGoingDown = true;
                } else {

                }
                if (distanceFromStopPoint >= 10 && distanceFromStopPoint < this.speedLimit && !(xFromStopPoint == 0.0) && mtcType == 2){
                    this.speedLimit = (int)Math.round(distanceFromStopPoint);
                    Traincraft.itsChannel.sendToAllAround(new PacketSetSpeed(this.speedLimit, (int) this.posX, (int) this.posY, (int) this.posZ, getEntityId()), new TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, 150.0D));
                    speedGoingDown = true;
                } else {

                }


				/*if (distanceFromStopPoint < this.getSpeed() && !(distanceFromStopPoint < nextSpeedLimit)  && !(this instanceof EntityLocoElectricPeachDriverlessMetro)) {
					speedLimit = (int) Math.round(distanceFromStopPoint);
					Traincraft.itsChannel.sendToAllAround(new PacketSetSpeed(this.speedLimit, (int) this.posX, (int) this.posY, (int) this.posZ, getEntityId()), new TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, 150.0D) );
				}*/




                //For Automatic Train Operation
                if (this.atoStatus == 1) {
                    distanceFromStationStop = this.getDistance(this.xStationStop, this.yStationStop, this.zStationStop);
                    if (this.parkingBrake) {
                        this.parkingBrake = false;
                        //Accelerate to the speed limit
                    }
                    if (!(distanceFromStopPoint < this.getSpeed()) && (!(distanceFromSpeedChange < this.getSpeed()))) {
                        accel(this.speedLimit);
                    }


                    if (distanceFromStopPoint < this.getSpeed()) {
                        //Stop it at a certain point
                        stop(Vec3.createVectorHelper(this.xFromStopPoint, this.yFromStopPoint, this.zFromStopPoint));

                    }
                    if (distanceFromStationStop < this.getSpeed()) {
                        stop(Vec3.createVectorHelper(this.xStationStop, this.yStationStop, this.zStationStop));
                        stationStopping = true;

                    } else {
                        stationStopping = false;
                    }

                    if (distanceFromSpeedChange < this.getSpeed() && !(this.getSpeed() == this.nextSpeedLimit)) {
                        //Slow it down to the next speed limit
                        slow(this.nextSpeedLimit);
                    }

                    if (isDriverOverspeed) {
                        //The ATO system is speeding somehow, slow it down
                        slow(this.speedLimit);
                    }
                    if (this.distanceFromStopPoint < 2 || this.distanceFromStationStop < 2) {
                        this.parkingBrake = true;
                        this.isBraking = true;
                        if (this.distanceFromStopPoint < 2 ) {
                            this.xFromStopPoint = 0.0;
                            this.yFromStopPoint = 0.0;
                            this.zFromStopPoint = 0.0;
                        } else if (this.distanceFromStationStop < 2) {
                            this.xStationStop = 0.0;
                            this.yStationStop = 0.0;
                            this.zStationStop = 0.0;
                        }
                        this.atoStatus = 0;
                        this.stationStop = true;

                        Traincraft.atoChannel.sendToAllAround(new PacketATO(this.getEntityId(), 0),new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, 150.0D));

                        Traincraft.atoSetStopPoint.sendToAllAround(new PacketATOSetStopPoint(this.getEntityId(), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0), new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, 150.0D));
                        Traincraft.brakeChannel.sendToAllAround(new PacketParkingBrake(true, this.getEntityId()), new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, 150.0D));
                        JsonObject sendingObj = new JsonObject();
                        sendingObj.addProperty("funct", "stationstopcomplete");
                        sendMessage(new PDMMessage(this.trainID, serverUUID, sendingObj.toString(), 0));

                    }


                }

            }
        }

        super.onUpdate();
        if (!worldObj.isRemote) {
            //System.out.println(motionX +" "+motionZ);
            dataWatcher.updateObject(25, (int) convertSpeed(Math.sqrt(motionX * motionX + motionZ * motionZ)));
            dataWatcher.updateObject(24, fuelTrain);
            dataWatcher.updateObject(20, overheatLevel);
            dataWatcher.updateObject(22, locoState);
            dataWatcher.updateObject(3, destination);
            dataWatcher.updateObject(26, (castToString(currentNumCartsPulled)));
            dataWatcher.updateObject(27, (castToString((currentMassPulled)) + " tons"));
            dataWatcher.updateObject(28, ((int) currentSpeedSlowDown) + " km/h");
            dataWatcher.updateObject(29, (castToString((double) (Math.round(currentAccelSlowDown * 1000)) / 1000)));
            dataWatcher.updateObject(30, (castToString((double) (Math.round(currentBrakeSlowDown * 1000)) / 1000)));
            dataWatcher.updateObject(31, ("1c/" + castToString((int) (currentFuelConsumptionChange)) + " per tick"));
            dataWatcher.updateObject(15, getMaxSpeed());
            //System.out.println();
            if (this.worldObj.handleMaterialAcceleration(this.boundingBox.expand(0.0D, -0.2000000059604645D, 0.0D).contract(0.001D, 0.001D, 0.001D), Material.water, this) && this.updateTicks % 4 == 0) {
                if (!hasDrowned && !worldObj.isRemote && FMLCommonHandler.instance().getMinecraftServerInstance() != null && this.lastEntityRider instanceof EntityPlayer) {
                    FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().sendChatMsg(new ChatComponentText(((EntityPlayer) this.lastEntityRider).getDisplayName() + " drowned " + this.getTrainOwner() + "'s locomotive"));
                    FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().sendChatMsg(new ChatComponentText(((EntityPlayer) this.lastEntityRider).getDisplayName() + " drowned " + this.getTrainOwner() + "'s locomotive"));
                }
                //this.attackEntityFrom(DamageSource.generic, 100);
                this.setCustomSpeed(0);// set speed to normal
                this.setAccel(0.000001);// simulate a break down
                this.setBrake(1);
                this.motionX *= 0.97;// slowly slows down
                this.motionZ *= 0.97;
                this.fuelTrain = 0;
                this.hasDrowned = true;
                this.canCheckInvent = false;
                blowUpDelay++;
                if (blowUpDelay > 20) {
                    this.attackEntityFrom(DamageSource.drown, 100);
                }
            }/*
             * else{ this.canCheckInvent=true; this.hasDrowned=false; }
             */
        }
    }

    @Override
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
        return 1D;
    }

    /**
     * Added for SMP
     *
     * @return true if on, false if off
     */
    public boolean getParkingBrakeFromPacket() {
        return parkingBrake;
    }

    /**
     * Added for SMP
     *
     * @param set
     *            set 0 if parking break is false, 1 if true
     */
    public void setParkingBrakeFromPacket(boolean set) {
        parkingBrake = set;
    }

    /**
     * added for SMP, used by the HUD
     *
     * @return
     */
    public double getSpeed() {
        return dataWatcher.getWatchableObjectInt(25);
    }

    /**
     * added for SMP, used by the HUD
     *
     * @return
     */
    @Override
    public int getOverheatLevel() {
        return (this.dataWatcher.getWatchableObjectInt(20));
    }

    /**
     * returns the state of the loco state is the consequence of overheating
     *
     * @return cold warm hot very hot too hot broken
     */
    public String getState() {
        return (this.dataWatcher.getWatchableObjectString(22));
    }

    /**
     * set the state of the loco
     *
     * @param state
     *            cold warm hot very hot too hot broken
     */
    public void setState(String state) {
        locoState = state;
        this.dataWatcher.updateObject(22, state);
    }

    /**
     * added for SMP, used by the HUD
     *
     * @return
     */
    public int getFuel() {
        if (worldObj.isRemote) { return (this.dataWatcher.getWatchableObjectInt(24)); }
        return fuelTrain;
    }

    /**
     * Is it fuelled? used in GUI
     */
    public boolean getIsFuelled() {
        if (worldObj.isRemote) { return (this.dataWatcher.getWatchableObjectInt(24)) > 0; }
        return (this.fuelTrain > 0);
    }

    /** Used for the gui */
    public int getFuelDiv(int i) {
        if (worldObj.isRemote) { return ((this.dataWatcher.getWatchableObjectInt(24) * i) / 1200); }
        return (this.fuelTrain * i) / 1200;
    }

    /**
     * This code applies fuel consumption.
     * @param consumption
     */
    protected void updateFuelTrain(int consumption) {
        if (fuelTrain < 0) {
            motionX *= 0.8;
            motionZ *= 0.8;
        }
        else {
            if (this.isLocoTurnedOn()) {
                fuelTrain -= consumption;
                if (fuelTrain < 0) fuelTrain = 0;
            }
        }
    }
    public void setLocoTurnedOnFromPacket(boolean set) {
        isLocoTurnedOn = set;
    }

    public boolean isLocoTurnedOn() {
        return isLocoTurnedOn;
    }

    // private int placeInSpecialInvent(ItemStack itemstack1, int i, boolean doAdd) {
    // if (locoInvent[i] == null) {
    // if (doAdd) locoInvent[i] = itemstack1;
    // return itemstack1.stackSize;
    // }
    // else if (locoInvent[i] != null && locoInvent[i] == itemstack1 && itemstack1.isStackable() &&
    // (!itemstack1.getHasSubtypes() || locoInvent[i].getItemDamage() == itemstack1.getItemDamage())
    // && ItemStack.areItemStackTagsEqual(locoInvent[i], itemstack1)) {
    //
    // int var9 = locoInvent[i].stackSize + itemstack1.stackSize;
    // if (var9 <= itemstack1.getMaxStackSize()) {
    // if (doAdd) locoInvent[i].stackSize = var9;
    // return var9;
    // }
    // else if (locoInvent[i].stackSize < itemstack1.getMaxStackSize()) {
    // if (doAdd) locoInvent[i].stackSize = locoInvent[i].getMaxStackSize();
    // return Math.abs(locoInvent[i].getMaxStackSize() - locoInvent[i].stackSize -
    // itemstack1.stackSize);
    //
    // }
    // }
    // return itemstack1.stackSize;
    //
    // }


    //TODO Fix ISided Inventory buildcraft support
	/*
	/**
	 * Offers an ItemStack for addition to the inventory.
	 *
	 * @param stack
	 *            ItemStack offered for addition. Do not manipulate this!
	 * @param doAdd
	 *            If false no actual addition should take place.
	 * @param from
	 *            Orientation the ItemStack is offered from.
	 * @return Amount of items used from the passed stack.
	 */
	/*
	@Override
	public int addItem(ItemStack stack, boolean doAdd, ForgeDirection from) {
		if (stack == null) { return 0; }
		//FuelHandler.steamFuelLast(itemstack) > 0 || LiquidManager.getInstance().isDieselLocoFuel(itemstack)||(itemstack.getItem().shiftedIndex==Item.redstone.shiftedIndex) || (itemstack.getItem() instanceof IElectricItem)
		//LiquidManager.getInstance().isContainer(itemstack1)&&loco instanceof SteamTrain
		if (this instanceof SteamTrain) {
			//System.out.println("is fuel? "+(FuelHandler.steamFuelLast(stack) > 0) + "return "+placeInSpecialInvent(stack,0,false));
			if (FuelHandler.steamFuelLast(stack) > 0) return placeInSpecialInvent(stack, 0, doAdd);
			if (LiquidManager.getInstance().isContainer(stack)) return placeInSpecialInvent(stack, 1, doAdd);
		}
		if (this instanceof DieselTrain) {
			//System.out.println("is diesel? "+(LiquidManager.getInstance().isDieselLocoFuel(stack)) + "return "+placeInSpecialInvent(stack,0,false));
			if (LiquidManager.getInstance().isDieselLocoFuel(stack)) return placeInSpecialInvent(stack, 0, doAdd);
		}
		if (this instanceof ElectricTrain) {
			if ((stack.getItem() == Item.itemRegistry.getObject("redstone")) || (stack.getItem() instanceof IElectricItem)) return placeInSpecialInvent(stack, 0, doAdd);
		}
		return 0;

	}
	*/

    //  Quoted out as it doesn't seem to have any use nor to be called at all.
    //	/**
    //	 * Requests items to be extracted from the inventory
    //	 *
    //	 * @param doRemove
    //	 *            If false no actual extraction may occur.
    //	 * @param from
    //	 *            Orientation the ItemStack is requested from.
    //	 * @param maxItemCount
    //	 *            Maximum amount of items to extract (spread over all returned
    //	 *            item stacks)
    //	 * @return Array of item stacks extracted from the inventory
    //	 */
    //	@Override
    //	public ItemStack[] extractItem(boolean doRemove, ForgeDirection from, int maxItemCount) {
    //		return null;
    //	}

    @Override
    public boolean attackEntityFrom(DamageSource damagesource, float i) {
        if (worldObj.isRemote) { return true; }
        if (canBeDestroyedByPlayer(damagesource)) return true;
        super.attackEntityFrom(damagesource, i);
        setRollingDirection(-getRollingDirection());
        setRollingAmplitude(10);
        setBeenAttacked();
        setDamage(getDamage() + i * 10);
        if (getDamage() > 40) {
            if (riddenByEntity != null) {
                riddenByEntity.mountEntity(this);
            }
            this.setDead();
            disconnectFromServer();
            ServerLogger.deleteWagon(this);
            if (damagesource.getEntity() instanceof EntityPlayer) {
                dropCartAsItem(((EntityPlayer)damagesource.getEntity()).capabilities.isCreativeMode);
            } else {
                dropCartAsItem(false);
            }
        }
        return true;
    }

    @Override
    public void dropCartAsItem(boolean isCreative){
        if(!itemdropped) {
            super.dropCartAsItem(isCreative);
            for (ItemStack stack : locoInvent) {
                if (stack != null) {
                    entityDropItem(stack, 0);
                }
            }
        }
    }

    /** RC routing integration */
    @Override
    public boolean setDestination(ItemStack ticket) {
        if (ticket != null) {
            destination = getTicketDestination(ticket);
            return true;
        }
        return false;
    }

    /* IInventory implements */
    @Override
    public ItemStack getStackInSlot(int i) {
        return locoInvent[i];
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int par1) {
        if (this.locoInvent[par1] != null) {
            ItemStack var2 = this.locoInvent[par1];
            this.locoInvent[par1] = null;
            return var2;
        }
        else {
            return null;
        }
    }

    @Override
    public ItemStack decrStackSize(int i, int j) {
        if (locoInvent[i] != null) {
            if (locoInvent[i].stackSize <= j) {
                ItemStack itemstack = locoInvent[i];
                locoInvent[i] = null;
                return itemstack;
            }
            ItemStack itemstack1 = locoInvent[i].splitStack(j);
            if (locoInvent[i].stackSize == 0) {
                locoInvent[i] = null;
            }
            return itemstack1;

        }
        else {
            return null;
        }
    }

    @Override
    public void setInventorySlotContents(int i, ItemStack itemstack) {
        locoInvent[i] = itemstack;
        if (itemstack != null && itemstack.stackSize > getInventoryStackLimit()) {
            itemstack.stackSize = getInventoryStackLimit();
        }
    }

    @Override
    public void openInventory() {}

    @Override
    public void closeInventory() {}

    @Override
    public void markDirty() {

        if (!worldObj.isRemote) {

            this.slotsFilled = 0;

            for (int i = 0; i < getSizeInventory(); i++) {

                ItemStack itemstack = getStackInSlot(i);

                if (itemstack != null) {

                    slotsFilled++;
                }
            }

            Traincraft.slotschannel.sendToAllAround(new PacketSlotsFilled(this, slotsFilled), new TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, 150.0D));
        }
    }

    public int getAmmountOfCargo() {
        return slotsFilled;
    }

    public void recieveSlotsFilled(int amount) {
        this.slotsFilled = amount;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public ItemStack[] getInventory(){return locoInvent;}


    /** For MTC's Automatic Train Operation system */
    public void accel(Integer desiredSpeed) {
        if (this.worldObj != null) {

            if (this.getSpeed() != desiredSpeed) {
                if ((int) this.getSpeed() <= this.speedLimit) {
                    if (this.riddenByEntity == null) {

                        double rotation = this.serverRealRotation;
                        if (rotation == 90.0) {

                            this.motionX -= 0.0020 * this.accelerate;


                        } else if (rotation == -90.0) {

                            this.motionX += 0.0020 * this.accelerate;

                        } else if (rotation == 0.0) {

                            this.motionZ += 0.0020 * this.accelerate;

                        } else if (rotation == -180.0) {

                            this.motionZ -= 0.0020 * this.accelerate;
                        } else {

                        }

                    } else {
                        int dir = MathHelper
                                .floor_double((((EntityPlayer) riddenByEntity).rotationYaw * 4F) / 360F + 0.5D) & 3;
                        if (dir == 2) {

                            this.motionZ -= 0.0020 * this.accelerate;


                        } else if (dir == 0) {

                            this.motionZ += 0.0020 * this.accelerate;

                        } else if (dir == 1) {

                            this.motionX -= 0.0020 * this.accelerate;

                        } else if (dir == 3) {

                            this.motionX += 0.0020 * this.accelerate;

                        }

                    }
                }

            }
        }
    }

    public void slow(Integer desiredSpeed) {
        if (this.getSpeed() >= desiredSpeed){
            motionX *= brake;
            motionZ *= brake;
        }
    }
    public void stop(Vec3 signalPosition) {
        double currentDistance = Math.copySign(Vec3.createVectorHelper(this.posX, this.posY, this.posZ).distanceTo(signalPosition), 1.0D);
        double originalDistance;
        originalDistance=currentDistance;
        double slowPercentage = 0.5D;
        if(1.0D - currentDistance != 0.0D && originalDistance != 0.0D) {
            slowPercentage = currentDistance / this.getSpeed();
        }

        this.motionX *= slowPercentage;
        this.motionZ *= slowPercentage;

    }
    @Override
    public void receiveMessage(PDMMessage message) {
        JsonParser parser = new JsonParser();

        JsonObject thing = parser.parse(message.message.toString()).getAsJsonObject();
        //System.out.println("Got one!");

        if (message != null) {
            if (thing.get("funct").getAsString().equals("startlevel2")) {
                //That's actually really great, now let's get where it sent from owo
                //	System.out.println("Connected!");
                serverUUID = message.UUIDFrom;
                mtcType = 2;
                mtcStatus = thing.get("mtcStatus").getAsInt();
                isConnected = true;
                Traincraft.mscChannel.sendToAllAround(new PacketMTC(getEntityId(), mtcStatus, 2), new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, 150.0D));
                speedLimit = thing.get("speedLimit").getAsInt();
                nextSpeedLimit = thing.get("nextSpeedLimit").getAsInt();
                Traincraft.itsChannel.sendToAllAround(new PacketSetSpeed(speedLimit, 0, 0, 0, getEntityId()), new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, 150.0D));
                if (nextSpeedLimit != 0) {
                    xSpeedLimitChange = thing.get("nextSpeedLimitChangeX").getAsDouble();
                    ySpeedLimitChange = thing.get("nextSpeedLimitChangeY").getAsDouble();
                    zSpeedLimitChange = thing.get("nextSpeedLimitChangeZ").getAsDouble();
                }

            } else if (thing.get("funct").getAsString().equals("response")) {
                mtcType = 2;
                this.mtcStatus = thing.get("mtcStatus").getAsInt();
                Traincraft.mscChannel.sendToAllAround(new PacketMTC(getEntityId(), mtcStatus, 2), new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, 150.0D));
                nextSpeedLimit = thing.get("nextSpeedLimit").getAsInt();
                if (!speedGoingDown && xFromStopPoint == 0.0) {
                    speedLimit = thing.get("speedLimit").getAsInt();
                    Traincraft.itsChannel.sendToAllAround(new PacketSetSpeed(speedLimit, 0, 0, 0, getEntityId()), new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, 150.0D));
                }
                if (thing.get("speedChange").getAsBoolean()) {
                    xSpeedLimitChange = thing.get("nextSpeedLimitChangeX").getAsDouble();
                    ySpeedLimitChange = thing.get("nextSpeedLimitChangeY").getAsDouble();
                    zSpeedLimitChange = thing.get("nextSpeedLimitChangeZ").getAsDouble();
                    Traincraft.itnsChannel.sendToAllAround(new PacketNextSpeed( nextSpeedLimit, 0,0,0, xSpeedLimitChange, ySpeedLimitChange, zSpeedLimitChange, this.getEntityId()), new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, 150.0D));
                }

                if (thing.get("endSoon").getAsBoolean()) {
                    if (!(stationStop)) {
                        xFromStopPoint = thing.get("xStopPoint").getAsDouble();
                        yFromStopPoint = thing.get("yStopPoint").getAsDouble();
                        zFromStopPoint = thing.get("zStopPoint").getAsDouble();
                        Traincraft.atoSetStopPoint.sendToAllAround(new PacketATOSetStopPoint(this.getEntityId(), xFromStopPoint, yFromStopPoint, zFromStopPoint, xStationStop, yStationStop, zStationStop), new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, 150.0D));
                    }
                }
                if (thing.get("stationStopSoon").getAsBoolean() && !stationStop) {
                    xStationStop = thing.get("xStationStop").getAsDouble();
                    yStationStop = thing.get("yStationStop").getAsDouble();
                    zStationStop = thing.get("zStationStop").getAsDouble();


                    Traincraft.atoSetStopPoint.sendToAllAround(new PacketATOSetStopPoint(this.getEntityId(), xFromStopPoint, yFromStopPoint, zFromStopPoint, xStationStop, yStationStop, zStationStop), new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, 150.0D));
                } if (thing.get("atoStatus") != null) {
                    this.atoStatus = thing.get("atoStatus").getAsInt();
                    Traincraft.atoChannel.sendToAllAround(new PacketATO(this.getEntityId(), thing.get("atoStatus").getAsInt()),new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, 150.0D));
                }
               

            }
        }
    }
    @Override
    public void sendMessage(PDMMessage message) {
        //	System.out.println("Sendmessage..");
        AxisAlignedBB targetBox = AxisAlignedBB.getBoundingBox(this.posX, this.posY, this.posZ, this.posX + 2000, this.posY + 2000, this.posZ + 2000);
        List<TileEntity> allTEs = worldObj.loadedTileEntityList;
        for (TileEntity te : allTEs) {

            if (te instanceof TilePDMInstructionRadio) {

                TilePDMInstructionRadio teP = (TilePDMInstructionRadio)te;

                if (teP.uniqueID.equals(message.UUIDTo)) {

                    //System.out.println(message.message);
                    teP.receiveMessage(message);
                }

            }
        }


    }

    public void attemptConnection(String theServerUUID) {
        //Oh, that's great! We just got the servers UUID. Now let's try connecting to it.
        if (theServerUUID != null && !serverUUID.equals(theServerUUID) && !canBePulled) {
            //	System.out.println("Oh, that's great! We just got the servers UUID. Now let's try connecting to it.");
            JsonObject sendTo = new JsonObject();
            sendTo.addProperty("funct", "attemptconnection");
            sendTo.addProperty("trainType", this.trainLevel);
            //	System.out.println(sendTo.toString());
            sendMessage(new PDMMessage(this.trainID, theServerUUID, sendTo.toString(), 0));
        }
    }

    public void disconnectFromServer() {
	if (Loader.isModLoaded("ComputerCraft") || Loader.isModLoaded("OpenComputers")) {
        JsonObject sendTo = new JsonObject();
        sendTo.addProperty("funct", "disconnect");
        sendMessage(new PDMMessage(this.trainID, serverUUID, sendTo.toString(), 0));
        this.mtcType = 1;
        this.serverUUID = "";
        isConnected = false;
	}
    }


}
