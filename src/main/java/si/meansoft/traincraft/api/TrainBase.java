/*
 * This file ("TrainBase.java") is part of the Traincraft mod for Minecraft.
 * It is created by all persons that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.api;

import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import si.meansoft.traincraft.Util;
import si.meansoft.traincraft.client.models.TrainModel;
import si.meansoft.traincraft.client.models.TrainModelRenderer;

import javax.annotation.Nullable;
import java.util.List;
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
    private static List<Seat> seats = Lists.newArrayList(new Seat(0, 0));

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
        //this.move(MoverType.SELF, this.posX, this.posY, this.posZ + 0.01D);
        //this.setLocationAndAngles(this.posX, this.posY, this.posZ + 0.01D, this.rotationYaw, this.rotationPitch);
        for(TrainPart<? extends TrainBase> part : this.trainParts){
            part.setLocationAndAngles(this.posX + part.getxOffset(), this.posY + part.getyOffset(), this.posZ + part.getzOffset(), this.rotationYaw, this.rotationPitch);
        }
    }

    @Override
    public boolean processInitialInteract(EntityPlayer player, EnumHand hand) {
        if(!player.getEntityWorld().isRemote && !player.isSneaking()){
            player.startRiding(this);
        }
        return super.processInitialInteract(player, hand);
    }

    @Override
    protected boolean canFitPassenger(Entity passenger) {
        for(Seat seat : seats){
            if(!seat.isOccupied()){
                System.out.println("true");
                return true;
            }
        }
        return false;
    }

    @Override
    public void addPassenger(Entity passenger) {
        if(passenger instanceof EntityLivingBase){
            for(Seat seat : seats){
                if(!seat.isOccupied()){
                    seat.entityEnter((EntityLivingBase) passenger);
                    return;
                }
            }
            passenger.sendMessage(new TextComponentString("No space for you :("));
        }
    }

    @Override
    public void removePassenger(Entity passenger) {
        if(passenger instanceof EntityLivingBase){
            for(Seat seat1 : seats){
                if(passenger.equals(seat1.entity)){
                    seat1.entityEnter(null);
                    return;
                }
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
        return null;//entityIn.canBePushed() ? this.getEntityBoundingBox() : null;
    }

    @Override
    public boolean canBeCollidedWith() {
        return true;
    }

    @Nullable
    public AxisAlignedBB getCollisionBoundingBox() {
        return null;
    }

    @Nullable
    @Override
    public Entity[] getParts() {
        return this.trainParts.toArray(new Entity[]{});
    }

    public void processModelChanges(TrainModel<? extends TrainBase> model){
        System.out.println("Process");
        float max = Math.max(model.getMaxWidth(), model.getMaxDepth());
        this.setSize(max + max/4, model.getMaxHeight() + model.getWheelHeight());
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

    public void setDamage(float damage) {
        this.dataManager.set(DAMAGE, damage);
    }

    public float getDamage() {
        return this.dataManager.get(DAMAGE);
    }

    public static class Seat{
        private EntityLivingBase entity;
        private float xOffset = 0;
        private float yOffset = 0;
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

        public void entityEnter(EntityLivingBase entity){
            this.entity = entity;
        }
        public EntityLivingBase getSitting(){
            return this.entity;
        }
        public boolean isOccupied(){
            return getSitting() != null;
        }
    }

}
