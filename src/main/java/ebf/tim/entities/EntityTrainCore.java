package ebf.tim.entities;

import ebf.tim.registry.NBTKeys;
import ebf.tim.utility.CommonProxy;
import ebf.tim.utility.CommonUtil;
import ebf.tim.utility.FuelHandler;
import fexcraft.tmt.slim.Vec3d;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.List;
import java.util.UUID;

import static ebf.tim.TrainsInMotion.transportTypes.DIESEL;
import static ebf.tim.TrainsInMotion.transportTypes.ELECTRIC;

/**
 * <h1>Train core</h1>
 * this is the management core for all trains.
 * @author Eternal Blue Flame
 */
public class EntityTrainCore extends GenericRailTransport {

    /**manages the items for burnHeat, and the burnHeat itself.*/
    public FuelHandler fuelHandler = new FuelHandler();
    /**defines the speed percentage the user is attempting to apply.*/
    public int accelerator =0;




    /*
     * <h2> Base train Constructor</h2>
     */

    /** default constructor for all trains, server only.
     * Usually this is the one you would reference unless you need to do something only on client.
     * @param owner the owner profile, used to define owner of the entity,
     * @param world the world to spawn the entity in, used in super's super.
     * @param xPos the x position to spawn entity at, used in super's super.
     * @param yPos the y position to spawn entity at, used in super's super.
     * @param zPos the z position to spawn entity at, used in super's super.
     */
    public EntityTrainCore(UUID owner, World world, double xPos, double yPos, double zPos){
        super(owner, world, xPos, yPos, zPos);
    }

    /**default constructor for all trains, client only.
     * use this if you need to do something only on client.
     * @param world the world to spawn the entity in, used in super's super.
     */
    public EntityTrainCore(World world){
        super(world);
    }

    /**loads the entity's save file*/
    @Override
    protected void readEntityFromNBT(NBTTagCompound tag) {
        super.readEntityFromNBT(tag);
        accelerator = tag.getInteger(NBTKeys.accelerator);
        dataWatcher.updateObject(16, tag.getFloat(NBTKeys.transportFuel));
        vectorCache[1][0] = tag.getFloat(NBTKeys.trainSpeed);


    }
    /**saves the entity to server world*/
    @Override
    protected void writeEntityToNBT(NBTTagCompound tag) {
        super.writeEntityToNBT(tag);
        tag.setInteger(NBTKeys.accelerator, accelerator);
        tag.setFloat(NBTKeys.transportFuel, dataWatcher.getWatchableObjectFloat(16));
        tag.setFloat(NBTKeys.trainSpeed, vectorCache[1][0]);

    }

    @Override
    public void entityInit(){
        super.entityInit();
        this.dataWatcher.addObject(18, accelerator);//accelerator
        this.updateWatchers = true;
    }

    @Override
    public void initInventorySlots(){
        super.initInventorySlots();
        inventory.add(fuelSlot());
        if(getTankInfo(ForgeDirection.UNKNOWN).length>1){
            inventory.add(waterSlot());
        }
    }


    @Override
    public boolean hasDrag(){return !getBoolean(boolValues.RUNNING) || accelerator==0;}

    @Override
    public float getPower(){
        //the average difference between metric horsepower and MHP is about 3.75% or tractiveEffort*26.3=MHP
            return (transportTractiveEffort()<1f?transportMetricHorsePower()*281.125f
                    :transportTractiveEffort());

                    //90mhp translating to 1 mircoblock a second sounds about right
                    //(*0.009/16 = 0.0005625), then divide by ticks to turn to seconds (0.0005625/20=0.000028125).
                    //*0.000028125f;
    }

    //returns the current speed in blocks (meters) per tick
    public float getVelocity(){
        return (float)Math.max(Math.abs(motionX)+Math.abs(motionZ),0.01f);
    }
    //gets the throttle position as a percentage with 1 as max and -1 as max reverse
    public float getAcceleratiorPercentage(){
        switch (Math.abs(accelerator)){
            case 1:{return Math.copySign(0.1f,accelerator);}//would otherwise be 0833
            case 2:{return Math.copySign(0.175f,accelerator);}//would otherwise be 166
            case 3:{return Math.copySign(0.24f,accelerator);}//would otherwise be 2499
            case 4:{return Math.copySign(0.3f,accelerator);}//would otherwise be 33
            case 5:{return Math.copySign(0.375f,accelerator);}//would otherwise be 4166
            case 6: case 7:{return Math.copySign(0.425f,accelerator);}//would otherwise be 499
            default:{return 0;}
        }
        //old way that didnt compensate for pressure/gearing efficiency.
        //return (accelerator*0.16666666666f)*0.05f;
    }

    private float maxPowerMicroblocks =0;

    @Override
    public void setValuesOnLinkUpdate(List<GenericRailTransport> consist){
        super.setValuesOnLinkUpdate(consist);
        maxPowerMicroblocks =0;
        for(GenericRailTransport t : consist) {
            maxPowerMicroblocks +=t.getPower();
        }
    }

    /**
     * <h2>Calculate speed increase rate</h2>
     */
    public void calculateAcceleration(){
        if (accelerator !=0 && accelerator!=8) {
            //speed is defined by the power in newtons divided by the weight, divided by the number of ticks in a second.
            if(getPower() !=0) {
                float weight = pullingWeight* (getBoolean(boolValues.BRAKE)?4:1);
                //update the consist if somehow it didnt get initialized.
                if(maxPowerMicroblocks==0 || pullingWeight==0){
                    updateConsist();
                    weight = pullingWeight* (getBoolean(boolValues.BRAKE)?4:1);
                }
                // weight's effect on HP is generally inverse of HP itself, it can be described as
                // 30 lbs of coal about 100 feet in one minute = 33,000 lbf for 1.01387 MHP
                //or roughly 13.6kg over 30.48 meters in one minute = 1MHP
                // however this is for vertical, converting to horizontal means multiplying by around 85% of gravity
                // so say you have a train with 75mhp, that means your carrying capacity sits around
                // 75*1.11039648 tons. (83.279)
                //clamp to a max of the pulling power as to not generate negative pulling power

                //so roughly, we divide the weight by the standard to get the idea of how much MHP is needed
                //1814.3kg/13.6kg=133.4MHP
                //so in this case, we need 133.4MHP to pull a load of 1814.3kg with no hinderance
                //so we then divide the actual MHP by what's needed
                //75*gravityZ/133.4=0.62428
                //this end result means we now can move at 0.62428 of the speed provided by MHP
                //0.62428*0.508=0.317 blocks per second acceleration.



                vectorCache[1][0] = (maxPowerMicroblocks*1.11039648f)
                        *getAcceleratiorPercentage();//applied MHP, buffed by linear gravity

                //skip the rest of updating if speed is 0.
                if(vectorCache[1][0]==0){
                    return;
                }

                vectorCache[1][0]*=(weight/13.6f);
                vectorCache[1][0]*=0.0254f; //movement distance of 1 MHP in meters per second (30.48/60/20).
                vectorCache[1][0]*=0.05f;//scale to ticks
                vectorCache[1][0]*=0.0000001f;//scale to i dont even know but it feels right
                if(!CommonProxy.realSpeed){
                    vectorCache[1][0]*=0.25f;//scale to TC speed
                }


                //-4.0880573E-7 applied MHP somehow needs to relate to a value that can move

                //debuff traction for rain
                vectorCache[1][1]=( (1.75f * (worldObj.isRaining()?0.5f:1)));

                //todo rework this, the math isnt based on newtons anymore.
                if(Math.abs(vectorCache[1][0])*-745.7>vectorCache[1][1]/7457){
                    //todo: add sparks to animator.
                    //DebugUtil.println("SCREECH","wheelspin: " + (vectorCache[1][0]*-745.7),
                    //        "Grip: " + (vectorCache[1][1]/7457), "i really need to get those spark particles in..");
                   // vectorCache[1][0] *=0.33f;
                }


                //velocity cap, since a running train has no drag, 0 is keep speed.
                if (accelerator>0){
                    if(getVelocity()>= (transportTopSpeed()*0.0297f)*(CommonProxy.realSpeed?1:0.25)) {
                        vectorCache[1][0]=0;
                    }
                } else if(accelerator<0) {
                    if(getVelocity()>= (transportTopSpeedReverse()*0.0297f)*(CommonProxy.realSpeed?1:0.25)){
                        vectorCache[1][0]=0;
                    }
                }

            } else {
                updateConsist();
            }
        }
    }
    /**a method to interface getting the accelerator value
     * this is intended for external use like collisions that need to see if the train is in gear from a superclass cast*/
    @Override
    public int getAccelerator(){
        return accelerator;
    }

    /**
     * <h2> on entity update</h2>
     * first we have to manage our speed by updating our motion vector and applying it to the bogies.
     * after that we let the super handle things.
     * @see GenericRailTransport#onUpdate()
     * lastly we use a tick check to define if we should manage fuel, since we shouldn't be doing that every tick.
     */
    @Override
    public void onUpdate() {

        super.onUpdate();

        if(frontBogie != null && backBogie != null) {

            if (!worldObj.isRemote) {
                //twice a second, re-calculate the speed.
                if (accelerator != 0 && ticksExisted % 10 == 0) {
                    //stop calculation if it can't move, running should be managed from the fuel handler, to be more dynamic
                    if (getBoolean(boolValues.RUNNING) && !getBoolean(boolValues.BRAKE)) {
                        //skip updating speed on TC style cruise control
                        if(accelerator!=8 && accelerator!=-8) {
                            calculateAcceleration();
                        } else {
                            vectorCache[1][0] = 0;
                        }
                    } else {
                        vectorCache[1][0] = 0;
                        accelerator = 0;
                        this.dataWatcher.updateObject(18, accelerator);
                    }
                }

                //cap to top speed, top speed is calculated as KMH converted to meters per second, converted to meters per tick
                if(accelerator>0 && vectorCache[1][0]!=0) {
                    //handle TiM forward movement
                    Vec3d velocity = CommonUtil.rotateDistance(vectorCache[1][0],0, rotationYaw);
                    frontBogie.addVelocity(velocity.xCoord,0,velocity.zCoord);
                    backBogie.addVelocity(velocity.xCoord,0,velocity.zCoord);
                } else if(accelerator<0 && vectorCache[1][0]!=0) {
                    //handle TiM backwards movement
                    Vec3d velocity = CommonUtil.rotateDistance(vectorCache[1][0],0, rotationYaw);
                    frontBogie.addVelocity(velocity.xCoord,0,velocity.zCoord);
                    backBogie.addVelocity(velocity.xCoord,0,velocity.zCoord);
                }



                updatePosition();
            }

        }
    }

    @Override
    public void manageFuel(){
        if(getTypes().contains(DIESEL)){
            FuelHandler.manageDieselFuel(this);
        } else if(getTypes().contains(ELECTRIC)){
            FuelHandler.manageElectricFuel(this);
        }
    }


    /**
     * <h2>linking management</h2>
     * this is an override to make sure rollingstock doesn't push trains
     * @see GenericRailTransport#manageLinks(GenericRailTransport)
     */
    @Override
    public void manageLinks(GenericRailTransport linkedTransport){
        if(accelerator==0){
            super.manageLinks(linkedTransport);
        }
    }


    @Override
    public boolean interact(int player, boolean isFront, boolean isBack, int key) {
        if (!super.interact(player, isFront, isBack, key)){
            switch (key){
                case 8:{ //toggle ignition
                    setBoolean(boolValues.RUNNING, !getBoolean(boolValues.RUNNING));
                    return true;
                }case 9:{ //plays a sound on all clients within hearing distance
                    //the second to last value is volume, and idk what the last one is.
                    worldObj.playSoundEffect(posX, posY, posZ, getHorn().getResourcePath(), 1, 0.5f);
                    return true;
                }case 2:{ //decrease speed
                    if (accelerator >-6 && getBoolean(boolValues.RUNNING)) {
                        if(accelerator>6){
                            accelerator=6;
                        } else {
                            accelerator--;
                        }
                        this.dataWatcher.updateObject(18, accelerator);
                    }
                    return true;
                }case 3:{ //increase speed
                    if (accelerator <6 && getBoolean(boolValues.RUNNING)) {
                        if(accelerator<-6){
                            accelerator=-6;
                        } else {
                            accelerator++;
                        }
                        this.dataWatcher.updateObject(18, accelerator);
                    }
                    return true;
                }case 11:{//TC control forward
                    if(getBoolean(boolValues.RUNNING)) {
                        accelerator = 7;
                        this.dataWatcher.updateObject(18, accelerator);
                    }
                    return true;
                }case 12:{//TC control reverse
                    if(getBoolean(boolValues.RUNNING)) {
                        accelerator = -7;
                        this.dataWatcher.updateObject(18, accelerator);
                    }
                    return true;
                }case 4: {//TC control, keep speed
                    if(getBoolean(boolValues.RUNNING)) {
                        accelerator = (int)Math.copySign(8,accelerator);
                        this.dataWatcher.updateObject(18, accelerator);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int getMinecartType(){return 10004;}

    /*
     * <h2>Inherited variables</h2>
     * these functions are overridden by classes that extend this so that way the values can be changed indirectly.
     */
    /**gets the resource location for the horn sound*/
    public ResourceLocation getHorn(){return null;}
    /**gets the resource location for the running/chugging sound*/
    public ResourceLocation getRunningSound(){return null;}
    /**gets the multiplication of fuel consumption, 1 is normal, 2 would be double, 1.5 would be halfway between the two, etc.*/
    public float getEfficiency(){return 1;}

}
