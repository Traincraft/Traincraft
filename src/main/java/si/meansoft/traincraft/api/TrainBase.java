/*
 * This file ("TrainBase.java") is part of the Traincraft mod for Minecraft.
 * It is created by all persons that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.api;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import si.meansoft.traincraft.Util;
import si.meansoft.traincraft.client.models.TrainModel;
import si.meansoft.traincraft.client.models.TrainModelRenderer;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author canitzp
 * Notes: may use IEntityAdditionalSpawnData
 */
public abstract class TrainBase extends Entity{

    /** Internal variables */
    protected final String name;
    private static final DataParameter<Float> DAMAGE = EntityDataManager.<Float>createKey(EntityMinecart.class, DataSerializers.FLOAT);
    private NonNullList<TrainPart<? extends TrainBase>> trainParts = NonNullList.create();

    /** Train related variables*/
    public UUID owner;
    public boolean isLocked = false;
    public HashMap<Seat, EntityLivingBase> seats = new HashMap<>();

    public TrainBase(World world, String name){
        super(world);
        this.name = name;
    }

    @Override
    protected void entityInit(){
        this.dataManager.register(DAMAGE, 0.0F);
    }

    @Override
    protected final void readEntityFromNBT(NBTTagCompound nbt){
        this.readNBT(nbt, Util.NBTType.SAVE);
    }

    @Override
    protected final void writeEntityToNBT(NBTTagCompound nbt){
        this.writeNBT(nbt, Util.NBTType.SAVE);
    }

    @Override
    public void onEntityUpdate() {
        super.onEntityUpdate();
        for(TrainPart<? extends TrainBase> part : this.trainParts){
            part.setLocationAndAngles(this.posX + part.getxOffset(), this.posY + part.getyOffset(), this.posZ + part.getzOffset(), this.rotationYaw, this.rotationPitch);
        }
    }

    @Override
    public void addPassenger(Entity passenger) {
        if(passenger instanceof EntityLivingBase){
            Seat seat = null;
            for(Map.Entry<Seat, EntityLivingBase> entry : seats.entrySet()){
                if(entry.getValue() == null){
                    seat = entry.getKey();
                    break;
                }
            }
            if(seat != null){
                seats.put(seat, (EntityLivingBase) passenger);
            } else {
                System.out.println("No space for you :(");
            }
        }
    }

    @Override
    public void removePassenger(Entity passenger) {
        if(passenger instanceof EntityLivingBase){
            Seat seat = null;
            for(Map.Entry<Seat, EntityLivingBase> entry : seats.entrySet()){
                if(entry.getValue().equals(passenger)){
                    seat = entry.getKey();
                }
            }
            if(seat != null){
                seats.put(seat, null);
            }
        }
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        if(!this.world.isRemote){
            this.setDamage(getDamage() + amount * 10.0F);
            if(this.getDamage() >= 40.0F){
                this.setDead();
            }
            return true;
        }
        return super.attackEntityFrom(source, amount);
    }

    @Override
    @Nullable
    public AxisAlignedBB getCollisionBox(Entity entityIn) {
        return entityIn.canBePushed() ? this.getEntityBoundingBox() : null;
    }

    @Override
    public boolean canBeCollidedWith() {
        return true;
    }

    @Nullable
    public AxisAlignedBB getCollisionBoundingBox() {
        return this.getEntityBoundingBox();
    }

    @Nullable
    @Override
    public Entity[] getParts() {
        return this.trainParts.toArray(new Entity[]{});
    }

    public void processModelChanges(TrainModel<? extends TrainBase> model){
        System.out.println("Process");
        this.trainParts.clear();
        for(TrainModelRenderer renderer : model.getPartWheels()){
            this.trainParts.add(new TrainPart<>(this, TrainPart.TrainParts.WHEEL, renderer, model));
        }
    }

    public boolean attackTrainPart(TrainPart<? extends TrainBase> trainPart, TrainPart.TrainParts part, DamageSource source, float damage){
        return false;
    }

    protected abstract void writeNBT(NBTTagCompound nbt, Util.NBTType type);

    protected abstract void readNBT(NBTTagCompound nbt, Util.NBTType type);

    private void addSeat(float xOffset, float yOffset){
        this.seats.put(new Seat(xOffset, yOffset), null);
    }

    public void setDamage(float damage) {
        this.dataManager.set(DAMAGE, damage);
    }

    public float getDamage() {
        return this.dataManager.get(DAMAGE);
    }

    public static class Seat{
        private float xOffset = 0;
        private float yOffset= 0;
        public Seat(float xOffset, float yOffset){
            this.xOffset = xOffset;
            this.yOffset = yOffset;
        }
        public float getXOffset() {
            return xOffset;
        }

        public float getYOffset() {
            return yOffset;
        }
    }

}
