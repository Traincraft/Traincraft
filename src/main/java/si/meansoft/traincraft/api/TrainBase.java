/*
 * This file ("TrainBase.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.api;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import si.meansoft.traincraft.Util;
import si.meansoft.traincraft.client.models.TrainModel;
import si.meansoft.traincraft.client.models.TrainModelRenderer;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author canitzp
 * Notes: may use IEntityAdditionalSpawnData
 */
public abstract class TrainBase extends Entity{

    /** Internal variables */
    protected String name;
    private static final DataParameter<Float> DAMAGE = EntityDataManager.<Float>createKey(EntityMinecart.class, DataSerializers.FLOAT);
    private ArrayList<TrainPart<? extends TrainBase>> trainParts = new ArrayList<>();

    /** Train related variables*/
    public UUID owner;
    public boolean isLocked = false;

    public TrainBase(World world, String name){
        this(world);
        this.name = name;
        this.processModelChanges(TrainProvider.modelMap.get(name));
    }

    private TrainBase(World world){
        super(world);
    }

    @Override
    public abstract double getMountedYOffset();

    @Override
    protected void entityInit(){
        this.dataManager.register(DAMAGE, 0.0F);
    }

    protected abstract List<TrainPart<? extends TrainBase>> initParts(TrainModel<? extends TrainBase> model);

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
        this.rotationYaw++;
        this.rotationPitch++;
        for(TrainPart<? extends TrainBase> part : this.trainParts){
            part.setLocationAndAngles(this.posX + part.getxOffset(), this.posY + part.getyOffset(), this.posZ + part.getzOffset(), this.rotationYaw, this.rotationPitch);
        }
        //this.setEntityBoundingBox(rotate(this.getEntityBoundingBox(), (int) this.rotationYaw, EnumFacing.Axis.Y));
        if(!this.world.isRemote){

        }
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        return this.attackTrainPart(null, TrainPart.TrainParts.MAIN, source, amount);
    }

    @Override
    @Nullable
    public AxisAlignedBB getCollisionBox(Entity entityIn) {
        return Block.NULL_AABB;//entityIn.canBePushed() ? this.getEntityBoundingBox() : null;
    }

    @Override
    public boolean canBeCollidedWith() {
        return false;
    }

    @Nullable
    public AxisAlignedBB getCollisionBoundingBox() {
        return Block.NULL_AABB;
    }

    @Override
    public boolean processInitialInteract(EntityPlayer player, EnumHand hand) {
        return this.processInitialInteractPart(null, TrainPart.TrainParts.MAIN, player, hand);
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
        this.trainParts.addAll(this.initParts(model));
        for(TrainModelRenderer renderer : model.getPartWheels()){
            this.trainParts.add(new TrainPart<>(this, TrainPart.TrainParts.WHEEL, renderer, model));
        }
        for(TrainPart<? extends TrainBase> part : this.trainParts){
            //TODO send TrainPart update Packet to the client!
            //CommonProxy.wrapper.sendToAll(new PacketUpdateBlockState(part));
        }
    }

    public boolean attackTrainPart(TrainPart<? extends TrainBase> trainPart, TrainPart.TrainParts part, DamageSource source, float amount){
        if(!this.world.isRemote){
            this.setDamage(getDamage() + amount * 10.0F);
            if(this.getDamage() >= 40.0F){
                this.setDead();
            }
            return true;
        }
        return super.attackEntityFrom(source, amount);
    }

    public boolean processInitialInteractPart(TrainPart<? extends TrainBase> trainPart, TrainPart.TrainParts part, EntityPlayer player, EnumHand hand){
        World world = player.getEntityWorld();
        if(!world.isRemote){
            switch (part){
                case SEET:{
                    if(!player.isSneaking()){
                        player.startRiding(trainPart);
                        return true;
                    }
                    break;
                }
            }
        }
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

    /**
     * Rotates the {@link AxisAlignedBB} around the axis based on the specified angle.<br>
     *
     * @param aabb the aabb
     * @param angle the angle
     * @param axis the axis
     * @return the axis aligned bb
     */
    private static int[] cos = { 1, 0, -1, 0 };
    private static int[] sin = { 0, 1, 0, -1 };
    public static AxisAlignedBB rotate(AxisAlignedBB aabb, int angle, EnumFacing.Axis axis)
    {
        if (aabb == null || angle == 0 || axis == null)
            return aabb;

        int a = -angle & 3;
        int s = sin[a];
        int c = cos[a];

        aabb = aabb.offset(-0.5F, -0.5F, -0.5F);

        double minX = aabb.minX;
        double minY = aabb.minY;
        double minZ = aabb.minZ;
        double maxX = aabb.maxX;
        double maxY = aabb.maxY;
        double maxZ = aabb.maxZ;

        if (axis == EnumFacing.Axis.X)
        {
            minY = (aabb.minY * c) - (aabb.minZ * s);
            maxY = (aabb.maxY * c) - (aabb.maxZ * s);
            minZ = (aabb.minY * s) + (aabb.minZ * c);
            maxZ = (aabb.maxY * s) + (aabb.maxZ * c);

        }
        if (axis == EnumFacing.Axis.Y)
        {
            minX = (aabb.minX * c) - (aabb.minZ * s);
            maxX = (aabb.maxX * c) - (aabb.maxZ * s);
            minZ = (aabb.minX * s) + (aabb.minZ * c);
            maxZ = (aabb.maxX * s) + (aabb.maxZ * c);
        }

        if (axis == EnumFacing.Axis.Z)
        {
            minX = (aabb.minX * c) - (aabb.minY * s);
            maxX = (aabb.maxX * c) - (aabb.maxY * s);
            minY = (aabb.minX * s) + (aabb.minY * c);
            maxY = (aabb.maxX * s) + (aabb.maxY * c);
        }

        aabb = new AxisAlignedBB(minX + 0.5F, minY + 0.5F, minZ + 0.5F, maxX + 0.5F, maxY + 0.5F, maxZ + 0.5F);
        return aabb;
    }


}
