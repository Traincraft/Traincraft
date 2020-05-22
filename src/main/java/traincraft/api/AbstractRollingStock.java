package traincraft.api;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import train.common.Traincraft;
import traincraft.items.ItemConnector;
import traincraft.network.GuiHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.*;

public abstract class AbstractRollingStock<A extends AbstractRollingStock<A>> extends EntityMinecart implements IRollingStock {
    
    private UUID owner;
    private String name;
    private EnumRestriction restriction;
    private int activeSkin;
    private double travelDistance;
    private Map<String, ResourceLocation> skins = new HashMap<>();
    private AbstractRollingStock next, previous;
    
    private List<PassengerSeat> seats = new ArrayList<>();
    
    public AbstractRollingStock(World worldIn) {
        super(worldIn);
    }
    
    public AbstractRollingStock(World worldIn, double x, double y, double z) {
        super(worldIn, x, y, z);
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
    
        Vec3d size = this.getSize(this);
        this.setSize(((float) size.x), (float) size.y);
    
        this.registerSkins(this, this.skins);
    }
    
    @Override
    public boolean hasCapability(Capability<?> capability, @Nullable EnumFacing facing) {
        return this.getCapability(capability, facing) != null;
    }
    
    @Nullable
    @Override
    public <T> T getCapability(Capability<T> capability, @Nullable EnumFacing facing) {
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
        return super.getCapability(capability, facing);
    }
    
    public A setOwner(UUID owner){
        this.owner = owner;
        return (A) this;
    }
    
    public A setOwner(EntityPlayer owner){
        this.owner = owner.getUniqueID();
        return (A) this;
    }
    
    public UUID getOwner(){
        return this.owner;
    }
    
    public EntityPlayer getOwnerAsPlayer(){
        return this.getEntityWorld().getPlayerEntityByUUID(this.getOwner());
    }
    
    public A setRollingStockName(String name){
        this.name = name;
        return (A) this;
    }
    
    public String getRollingStockName(){
        return this.name;
    }
    
    public A setRestriction(EnumRestriction restriction){
        this.restriction = restriction;
        return (A) this;
    }
    
    public EnumRestriction getRestriction(){
        return this.restriction;
    }
    
    public A setActiveSkin(int skinId){
        if(this.skins.size() > skinId){
            this.activeSkin = skinId;
        }
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
    
    @Override
    public void removePassengers() {
        super.removePassengers();
        this.seats.forEach(passengerSeat -> passengerSeat.setCurrentUser(null));
    }
    
    @Override
    protected void addPassenger(@Nonnull Entity passenger) {
        if(this.seats.stream().anyMatch(passengerSeat -> passengerSeat.isUsedBy(passenger))){
            super.addPassenger(passenger);
        }
    }
    
    @Override
    protected void removePassenger(@Nonnull Entity passenger) {
        this.seats.stream().filter(passengerSeat -> passengerSeat.isUsedBy(passenger)).forEach(passengerSeat -> passengerSeat.setCurrentUser(null));
        super.removePassenger(passenger);
    }
    
    @Override
    protected boolean canFitPassenger(@Nonnull Entity passenger) {
        return this.seats.stream().anyMatch(PassengerSeat::isFree);
    }
    
    @Nullable
    @Override
    public Entity getControllingPassenger() {
        return this.seats.stream().filter(PassengerSeat::isControllingSeat).findFirst().map(PassengerSeat::getCurrentUser).orElse(null);
    }
    
    @Override
    public void updatePassenger(@Nonnull Entity passenger) {
        this.seats.stream().filter(seat -> seat.isUsedBy(passenger)).forEach(seat -> {
            double width = this.getEntityBoundingBox().maxX - this.getEntityBoundingBox().minX;
            double depth = this.getEntityBoundingBox().maxZ - this.getEntityBoundingBox().minZ;
            double x = this.posX + (width / 2.0F) + (seat.getX() + (seat.getWidth() / 2.0F));
            double y = this.posY + seat.getY();
            double z = this.posZ + (depth / 2.0F) + (seat.getZ() + (seat.getWidth() / 2.0F));
            passenger.setPosition(x, y, z);
        });
    }
    
    @Override
    public boolean canPlayerOpenGuiOrContainer(@Nonnull AbstractRollingStock<?> rollingStock, @Nonnull EntityPlayer player) {
        if(this.restriction == EnumRestriction.PRIVATE || this.restriction == EnumRestriction.SEATS_ONLY){
            if(!player.getUniqueID().equals(this.owner)){
                return false;
            }
        }
        return player.getDistanceSq(this.posX + 0.5D, this.posY + 0.5D, this.posZ + 0.5D) <= 64.0D;
    }
    
    @Nonnull
    @Override
    public EnumActionResult applyPlayerInteraction(@Nonnull EntityPlayer player, @Nonnull Vec3d hitVec, @Nonnull EnumHand hand) {
        ItemStack holdingItem = player.getHeldItem(hand);
        if(!holdingItem.isEmpty() && this.handlePlayerClickWithItem(this, player, hand, holdingItem, hitVec)){
            return EnumActionResult.SUCCESS;
        }
        if(!player.isSneaking()){
            // todo seat code
        }
        if(this.canPlayerOpenGuiOrContainer(this, player)){
            GuiHandler.openEntityGui(player, this);
            return EnumActionResult.SUCCESS;
        }
        return EnumActionResult.PASS;
    }
    
    @Override
    public boolean handlePlayerClickWithItem(@Nonnull AbstractRollingStock<?> rollingStock, @Nonnull EntityPlayer player, @Nonnull EnumHand hand, @Nonnull ItemStack stack, @Nonnull Vec3d hitVector) {
        if(stack.getItem() instanceof ItemConnector){
            ItemConnector.handleEntityClick(this, player, hand, stack);
            return true;
        }
        return false;
    }
}
