/*
 * This file ("TrainBase.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2017
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
 *         Notes: may use IEntityAdditionalSpawnData
 */
public abstract class TrainBase extends Entity {

    /**
     * Internal variables
     */
    protected String name;
    private static final DataParameter<Float> DAMAGE = EntityDataManager.<Float>createKey(EntityMinecart.class, DataSerializers.FLOAT);
    private ArrayList<TrainPart<? extends TrainBase>> trainParts = new ArrayList<>();

    /**
     * Train related variables
     */
    public UUID owner;
    public boolean isLocked = false;

    public TrainBase(World world, String name) {
        this(world);
        this.name = name;
        this.processModelChanges(TrainProvider.modelMap.get(name));
    }

    private TrainBase(World world) {
        super(world);
    }

    @Override
    public abstract double getMountedYOffset();

    @Override
    protected void entityInit() {
        this.dataManager.register(DAMAGE, 0.0F);
    }

    protected abstract List<TrainPart<? extends TrainBase>> initParts(TrainModel<? extends TrainBase> model);

    @Override
    protected final void readEntityFromNBT(NBTTagCompound nbt) {
        this.readNBT(nbt, Util.NBTType.SAVE);
    }

    @Override
    protected final void writeEntityToNBT(NBTTagCompound nbt) {
        this.writeNBT(nbt, Util.NBTType.SAVE);
    }

    @Override
    public void onEntityUpdate() {
        super.onEntityUpdate();
        this.rotationYaw++;
        //this.rotationPitch++;

        if (this.rotationYaw >= 359) {
            this.rotationYaw -= 360;
        }

        float radius = 8;
        double offX = Math.floor((Math.sin(Math.toRadians(this.rotationYaw)) * radius)) / 16;
        double offZ = Math.floor((-Math.cos(Math.toRadians(this.rotationYaw)) * radius)) / 16;


        //this.setEntityBoundingBox(rotate(this.getEntityBoundingBox(), (int) this.rotationYaw, EnumFacing.Axis.Y));
        if (this.world.isRemote) {
            for (TrainPart<? extends TrainBase> part : this.trainParts) {
                //,  + (Math.sin(this.rotationYaw / 12) * radius) / 16
                System.out.println(offZ);
                part.setLocationAndAngles(this.posX + part.getxOffset() + offX, this.posY + part.getyOffset(), this.posZ + part.getzOffset() + offZ, this.rotationYaw, this.rotationPitch);
            }
        }
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        return this.attackTrainPart(null, TrainPart.TrainParts.MAIN, source, amount);
    }

    @Override
    @Nullable
    public AxisAlignedBB getCollisionBox(Entity entityIn) {
        return Block.NULL_AABB;
    }

    @Override
    public boolean canBeCollidedWith() {
        return false;
    }

    @Nullable
    public AxisAlignedBB getCollisionBoundingBox() {
        return Block.NULL_AABB;
    }

    //@Override
    public boolean processInitialInteract(EntityPlayer player, EnumHand hand) {
        return this.processInitialInteractPart(null, TrainPart.TrainParts.MAIN, player, hand);
    }

    @Nullable
    @Override
    public Entity[] getParts() {
        return this.trainParts.toArray(new Entity[]{});
    }

    public void processModelChanges(TrainModel<? extends TrainBase> model) {
        System.out.println("Process");
        float max = Math.max(model.getMaxWidth(), model.getMaxDepth());
        this.setSize(max + max / 4, model.getMaxHeight() + model.getWheelHeight());
        this.trainParts.clear();
        this.trainParts.addAll(this.initParts(model));
        for (TrainModelRenderer renderer : model.getPartWheels()) {
            this.trainParts.add(new TrainPart<>(this, TrainPart.TrainParts.WHEEL, renderer, model));
        }
        for (TrainPart<? extends TrainBase> part : this.trainParts) {
            //TODO send TrainPart update Packet to the client!
            //CommonProxy.wrapper.sendToAll(new PacketUpdateBlockState(part));
        }
    }

    public boolean attackTrainPart(TrainPart<? extends TrainBase> trainPart, TrainPart.TrainParts part, DamageSource source, float amount) {
        if (!this.world.isRemote) {
            this.setDamage(getDamage() + amount * 10.0F);
            if (this.getDamage() >= 40.0F) {
                this.setDead();
            }
            return true;
        }
        return super.attackEntityFrom(source, amount);
    }

    public boolean processInitialInteractPart(TrainPart<? extends TrainBase> trainPart, TrainPart.TrainParts part, EntityPlayer player, EnumHand hand) {
        this.rotationYaw += 45;
        System.out.println(this.rotationYaw);
        World world = player.getEntityWorld();
        if (!world.isRemote) {
            switch (part) {
                case SEET: {
                    if (!player.isSneaking()) {
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

}
