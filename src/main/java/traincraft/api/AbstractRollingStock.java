/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("AbstractRollingStock.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.api;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.InvWrapper;
import traincraft.compat.CompatibilityManager;
import traincraft.items.ItemConnector;
import traincraft.items.ItemSkinChanger;
import traincraft.network.EnumKeyEvent;
import traincraft.network.GuiHandler;
import traincraft.network.TCEntityPackets;
import traincraft.tile.BaseTile;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.*;

public abstract class AbstractRollingStock<A extends AbstractRollingStock<A>> extends EntityMinecart implements IRollingStock {
    
    private UUID owner;
    private String name;
    private EnumRestriction restriction = EnumRestriction.PUBLIC;
    private int activeSkin = 0;
    private double travelDistance = 0D;
    private Map<String, ResourceLocation> skins;
    private AbstractRollingStock<?> next, previous;
    private List<Vec3d> axes;
    private List<PassengerSeat> seats;
    
    public AbstractRollingStock(World worldIn){
        super(worldIn);
    }
    
    public AbstractRollingStock(World worldIn, double x, double y, double z){
        super(worldIn, x, y, z);
    }
    
    @Override
    protected void entityInit(){
        super.entityInit();
        
        this.skins = new HashMap<>();
        this.registerSkins(this, this.skins);
        
        this.axes = new ArrayList<>();
        this.addAxes(this, this.axes);
        
        this.seats = new ArrayList<>();
        this.registerSeats(this, this.seats);
    }
    
    @Override
    public void onUpdate(){
        if(this.getRollingAmplitude() > 0){
            this.setRollingAmplitude(this.getRollingAmplitude() - 1);
        }
        if(this.getDamage() > 0.0F){
            this.setDamage(this.getDamage() - 1.0F);
        }
        if(this.posY < -64.0D){
            this.outOfWorld();
        }
        
        if(world.isRemote){
            // todo client code
        } else{
            this.prevPosX = this.posX;
            this.prevPosY = this.posY;
            this.prevPosZ = this.posZ;
            if(!this.hasNoGravity()){
                this.motionY -= 0.03999999910593033D;
            }
            
            /*
            Vec3d positionVector = new Vec3d(this.posX, this.posY, this.posZ);
            Vec3d frontAxis = this.getFrontAxis(this);
            Vec3d backAxis = this.getBackAxis(this);
            if(frontAxis != null && backAxis != null){ // dual axis mode
                ITrack frontTrack = Util.getTileEntity(this.world, frontAxis, true);
                if(frontTrack != null){ // move front axis
                    Vec3d frontMotion = this.calculateMotion(this, frontAxis);
                    Vec3d frontNextPosition = frontTrack.getNextPosition(frontAxis, frontMotion);
                    // todo @erwin move this rolling stock
                } else {
                    // todo @erwin derail movement
                }
                ITrack backTrack = Util.getTileEntity(this.world, backAxis, true);
                if(backTrack != null){ // move back axis
                    Vec3d backMotion = this.calculateMotion(this, backAxis);
                    Vec3d backNextPosition = backTrack.getNextPosition(backAxis, backMotion);
                    // todo @erwin move this rolling stock
                } else {
                    // todo @erwin derail movement
                }
            } else { // single axis mode
                ITrack track = Util.getTileEntity(this.world, positionVector, true);
                if(track != null){
                    Vec3d motion = this.calculateMotion(this, positionVector);
                    Vec3d nextPosition = track.getNextPosition(positionVector, motion);
                    // todo @erwin move this rolling stock
                } else {
                    // todo @erwin derail movement
                }
            }*/
            
            this.doBlockCollisions();
            this.rotationPitch = 0.0F;
            double deltaX = this.prevPosX - this.posX;
            double deltaZ = this.prevPosZ - this.posZ;
            if(deltaX * deltaX + deltaZ * deltaZ > 0.001D){
                this.rotationYaw = (float) (MathHelper.atan2(deltaZ, deltaX) * 180.0D / Math.PI);
            }
            this.setRotation(this.rotationYaw, this.rotationPitch);
            
            // apply collisions to entities except passengers
            List<AxisAlignedBB> collisionBoxes = this.getCollisionBoxes(this, new Vec3d(this.posX, this.posY, this.posZ));
            if(!collisionBoxes.isEmpty()){
                List<Entity> list = new ArrayList<>();
                for(AxisAlignedBB collisionBox : collisionBoxes){
                    list.addAll(this.world.getEntitiesWithinAABBExcludingEntity(this, collisionBox));
                }
                for(Entity entity : list){
                    if(!this.isPassenger(entity) && entity.canBePushed()){
                        if(entity instanceof EntityPlayer){
                            this.onCollideWithPlayer((EntityPlayer) entity);
                        }
                        this.applyEntityCollision(entity);
                    }
                }
            }
            this.handleWaterMovement();
        }
    }
    
    @Override
    public void setPosition(double x, double y, double z){
        this.posX = x;
        this.posY = y;
        this.posZ = z;
        Vec3d size = this.getSize(this);
        double halfWidth = (size.x / 2.0D);
        double height = size.y;
        double halfDepth = (size.z / 2.0D);
        AxisAlignedBB bb = new AxisAlignedBB(x - halfWidth, y, z - halfDepth, x + halfWidth, y + height, z + halfDepth);
        // todo rotate aabb -> TCUtil.generateRotatedAABB
        this.setEntityBoundingBox(bb);
    }
    
    @Override
    protected void readEntityFromNBT(NBTTagCompound compound){
        super.readEntityFromNBT(compound);
        this.readFromNBT(this, compound, BaseTile.NBTState.SAVE);
    }
    
    @Override
    protected void writeEntityToNBT(NBTTagCompound compound){
        super.writeEntityToNBT(compound);
        this.writeToNBT(this, compound, BaseTile.NBTState.SAVE);
    }
    
    @Override
    public void setPositionAndRotationDirect(double x, double y, double z, float yaw, float pitch, int posRotationIncrements, boolean teleport){
        super.setPositionAndRotationDirect(x, y, z, yaw, pitch, posRotationIncrements, teleport);
        this.setPosition(x, y, z); // to recalculate the bounding box
    }
    
    @Nonnull
    @Override
    public Type getType(){
        return Type.RIDEABLE;
    }
    
    @Override
    public void readFromNBT(AbstractRollingStock<?> rollingStock, NBTTagCompound nbt, BaseTile.NBTState state){
        if(nbt.hasUniqueId("owner")){
            this.owner = nbt.getUniqueId("owner");
        }
        if(nbt.hasKey("name", Constants.NBT.TAG_STRING)){
            this.name = nbt.getString("name");
        }
        if(nbt.hasKey("restriction", Constants.NBT.TAG_INT)){
            this.restriction = EnumRestriction.values()[nbt.getInteger("restriction")];
        }
        if(nbt.hasKey("active_skin", Constants.NBT.TAG_INT)){
            this.activeSkin = nbt.getInteger("active_skin");
        }
        if(nbt.hasKey("travel_distance", Constants.NBT.TAG_DOUBLE)){
            this.travelDistance = nbt.getInteger("travel_distance");
        }
        if(nbt.hasKey("inventory")){
            NBTTagCompound inventoryNBT = nbt.getCompoundTag("inventory");
            IItemHandler inventory = this.getInventory(this, null);
            if(inventory instanceof InvWrapper && ((InvWrapper) inventory).getInv() instanceof INBTSerializable<?>){
                ((INBTSerializable<NBTTagCompound>) ((InvWrapper) inventory).getInv()).deserializeNBT(inventoryNBT);
            }
        }
        if(nbt.hasKey("fluid_tank")){
            NBTTagCompound fluidTankNBT = nbt.getCompoundTag("fluid_tank");
            IFluidHandler fluidHandler = this.getFluidTank(this, null);
            if(fluidHandler instanceof INBTSerializable<?>){
                ((INBTSerializable<NBTTagCompound>) fluidHandler).deserializeNBT(fluidTankNBT);
            }
        }
        // todo read energy capabililty
        
        CompatibilityManager.readRollingStockNBT(this, nbt, state);
    }
    
    @Override
    public void writeToNBT(AbstractRollingStock<?> rollingStock, NBTTagCompound nbt, BaseTile.NBTState state){
        if(this.owner != null){
            nbt.setUniqueId("owner", this.owner);
        }
        if(this.name != null){
            nbt.setString("name", this.name);
        }
        nbt.setInteger("restriction", this.restriction.ordinal());
        nbt.setInteger("active_skin", this.activeSkin);
        nbt.setDouble("travel_distance", this.travelDistance);
        
        IItemHandler inventory = this.getInventory(this, null);
        if(inventory instanceof InvWrapper && ((InvWrapper) inventory).getInv() instanceof INBTSerializable<?>){
            NBTBase value = ((INBTSerializable<?>) ((InvWrapper) inventory).getInv()).serializeNBT();
            if(value instanceof NBTTagCompound){
                nbt.setTag("inventory", value);
            }
        }
        
        IFluidHandler fluidHandler = this.getFluidTank(this, null);
        if(fluidHandler instanceof INBTSerializable<?>){
            NBTBase value = ((INBTSerializable<?>) fluidHandler).serializeNBT();
            if(value instanceof NBTTagCompound){
                nbt.setTag("fluid_tank", value);
            }
        }
        
        // todo write energy capabililty
        
        CompatibilityManager.writeRollingStockNBT(this, nbt, state);
    }
    
    // called every frame! should be cached if possible!!!
    public ResourceLocation getTexture(AbstractRollingStock<?> rollingStock){
        return !this.skins.isEmpty() ? this.getActiveSkin().getValue() : TextureMap.LOCATION_MISSING_TEXTURE;
    }
    
    @Override
    public void postRender(AbstractRollingStock<?> rollingStock, RenderManager renderManager, double x, double y, double z, float entityYaw, float partialTicks){
        GlStateManager.pushMatrix();
        
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        //GlStateManager.translate(x, y, z);
        for(PassengerSeat seat : this.seats){
            AxisAlignedBB bb = seat.getBoundingBox();
            RenderGlobal.drawBoundingBox(bb.minX, bb.minY, bb.minZ, bb.maxX, bb.maxY, bb.maxZ, 1.0F, 1.0F, 0.0F, 1.0F);
        }
        
        GlStateManager.popMatrix();
    }
    
    @Override
    public boolean handlePlayerClickWithItem(@Nonnull AbstractRollingStock<?> rollingStock, @Nonnull EntityPlayer player, @Nonnull EnumHand hand, @Nonnull ItemStack stack, @Nonnull Vec3d hitVector){
        if(stack.getItem() instanceof ItemConnector){
            ItemConnector.handleEntityClick(this, player, hand, stack);
            return true;
        } else if(stack.getItem() instanceof ItemSkinChanger){
            this.setActiveSkin(this.getNextSkinId());
            return true;
        }
        return false;
    }
    
    @Override
    public boolean canLinkToAnotherRollingStock(@Nonnull AbstractRollingStock<?> rollingStock, @Nonnull AbstractRollingStock<?> other, @Nullable EntityPlayer linker){
        return false; //todo
    }
    
    @Override
    public void linkToAnotherRollingStock(@Nonnull AbstractRollingStock<?> rollingStock, @Nonnull AbstractRollingStock<?> other, @Nullable EntityPlayer linker){
    
    }
    
    @Override
    public boolean canPlayerOpenGuiOrContainer(@Nonnull AbstractRollingStock<?> rollingStock, @Nonnull EntityPlayer player){
        if(this.restriction == EnumRestriction.PRIVATE || this.restriction == EnumRestriction.SEATS_ONLY){
            if(!player.getUniqueID().equals(this.owner)){
                return false;
            }
        }
        return player.getDistanceSq(this.posX + 0.5D, this.posY + 0.5D, this.posZ + 0.5D) <= 64.0D;
    }
    
    @Override
    public void updatePassenger(@Nonnull Entity passenger){
        this.seats.stream().filter(seat -> seat.isUsedBy(passenger)).forEach(seat -> {
            double width = this.getEntityBoundingBox().maxX - this.getEntityBoundingBox().minX;
            double depth = this.getEntityBoundingBox().maxZ - this.getEntityBoundingBox().minZ;
            Vec3d seatCenter = seat.getCenter();
            double x = this.posX + (width / 2.0F) + seatCenter.x;
            double y = this.posY + (seatCenter.y - (seat.getHeight() / 2D));
            double z = this.posZ + (depth / 2.0F) + seatCenter.z;
            passenger.setPosition(x, y, z);
        });
    }
    
    @Override
    public void removePassengers(){
        super.removePassengers();
        this.seats.forEach(passengerSeat -> passengerSeat.setCurrentUser(null));
    }
    
    @Override
    protected void addPassenger(@Nonnull Entity passenger){
        if(this.seats.stream().anyMatch(passengerSeat -> passengerSeat.isUsedBy(passenger))){
            super.addPassenger(passenger);
        }
    }
    
    @Override
    protected void removePassenger(@Nonnull Entity passenger){
        this.seats.stream().filter(passengerSeat -> passengerSeat.isUsedBy(passenger)).forEach(passengerSeat -> passengerSeat.setCurrentUser(null));
        super.removePassenger(passenger);
    }
    
    @Override
    protected boolean canFitPassenger(@Nonnull Entity passenger){
        return this.seats.stream().anyMatch(PassengerSeat::isFree);
    }
    
    @Nonnull
    @Override
    public EnumActionResult applyPlayerInteraction(@Nonnull EntityPlayer player, @Nonnull Vec3d hitVec, @Nonnull EnumHand hand){
        ItemStack holdingItem = player.getHeldItem(hand);
        if(!holdingItem.isEmpty() && this.handlePlayerClickWithItem(this, player, hand, holdingItem, hitVec)){
            return EnumActionResult.SUCCESS;
        }
        if(!player.isSneaking()){
            System.out.println(hitVec);
            for(PassengerSeat seat : this.seats){
                if(seat.getBoundingBox().contains(hitVec)){
                    if(seat.isFree()){
                        //this.startRiding(player);
                        System.out.println("place in seat");
                    }
                    break;
                }
            }
        }
        if(this.canPlayerOpenGuiOrContainer(this, player)){
            GuiHandler.openEntityGui(player, this);
            return EnumActionResult.SUCCESS;
        }
        return EnumActionResult.PASS;
    }
    
    @Override
    public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing){
        return this.getCapability(capability, facing) != null || CompatibilityManager.hasRollingStockCapability(this, capability, facing);
    }
    
    @Nullable
    @Override
    public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing){
        if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY){
            IItemHandler itemHandler = this.getInventory(this, facing);
            if(itemHandler != null){
                return CapabilityItemHandler.ITEM_HANDLER_CAPABILITY.cast(itemHandler);
            }
        } else if(capability == CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY){
            IFluidHandler fluidHandler = this.getFluidTank(this, facing);
            if(fluidHandler != null){
                return CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY.cast(fluidHandler);
            }
        } else if(capability == CapabilityEnergy.ENERGY){
            IEnergyStorage energyStorage = this.getEnergyStorage(this, facing);
            if(energyStorage != null){
                return CapabilityEnergy.ENERGY.cast(energyStorage);
            }
        }
        T compatCapability = CompatibilityManager.getRollingStockCapability(this, capability, facing);
        if(compatCapability != null){
            return compatCapability;
        }
        return super.getCapability(capability, facing);
    }
    
    @Nullable
    @Override
    public Entity getControllingPassenger(){
        return this.seats.stream().filter(PassengerSeat::isControllingSeat).findFirst().map(PassengerSeat::getCurrentUser).orElse(null);
    }
    
    public UUID getOwner(){
        return this.owner;
    }
    
    public A setOwner(UUID owner){
        this.owner = owner;
        return (A) this;
    }
    
    public A setOwner(EntityPlayer owner){
        this.owner = owner.getUniqueID();
        return (A) this;
    }
    
    public EntityPlayer getOwnerAsPlayer(){
        return this.getEntityWorld().getPlayerEntityByUUID(this.getOwner());
    }
    
    public String getRollingStockName(){
        return this.name;
    }
    
    public A setRollingStockName(String name){
        this.name = name;
        return (A) this;
    }
    
    public EnumRestriction getRestriction(){
        return this.restriction;
    }
    
    public A setRestriction(EnumRestriction restriction){
        this.restriction = restriction;
        return (A) this;
    }
    
    public Map.Entry<String, ResourceLocation> getActiveSkin(){
        if(this.skins.size() > this.activeSkin){
            return (Map.Entry<String, ResourceLocation>) this.skins.entrySet().toArray()[this.activeSkin];
        } else if(this.skins.size() > 0){
            return (Map.Entry<String, ResourceLocation>) this.skins.entrySet().toArray()[0];
        }
        return null;
    }
    
    public A setActiveSkin(int skinId){
        if(this.skins.size() > skinId){
            this.activeSkin = skinId;
        }
        return (A) this;
    }
    
    public int getActiveSkinId(){
        return this.activeSkin;
    }
    
    public int getNextSkinId(){
        int nextId = this.activeSkin + 1;
        if(this.skins.size() > nextId){
            return nextId;
        }
        return 0;
    }
    
    public double getTravelDistance(){
        return this.travelDistance;
    }
    
    public IMessage onNetworkPacketClient(@Nonnull TCEntityPackets packet, @Nonnull NBTTagCompound data){
        return packet.run(this, data);
    }
    
    public IMessage onNetworkPacketServer(@Nonnull TCEntityPackets packet, @Nonnull NBTTagCompound data){
        return packet.run(this, data);
    }
    
    public void clientKeyPress(EnumKeyEvent key, boolean isGuiOpen){
    }
    
    /* Utility methods below*/
    public void sendSyncPacketToClients(){
        NBTTagCompound syncData = new NBTTagCompound();
        this.writeToNBT(this, syncData, BaseTile.NBTState.SYNC);
        TCEntityPackets.SYNC.sendToClientsAround(this, syncData);
    }
}
