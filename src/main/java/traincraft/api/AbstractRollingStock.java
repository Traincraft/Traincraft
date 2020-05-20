package traincraft.api;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

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
    protected void addPassenger(Entity passenger) {
        if(this.seats.stream().anyMatch(passengerSeat -> passengerSeat.isUsedBy(passenger))){
            super.addPassenger(passenger);
        }
    }
    
    @Override
    protected void removePassenger(Entity passenger) {
        this.seats.stream().filter(passengerSeat -> passengerSeat.isUsedBy(passenger)).forEach(passengerSeat -> passengerSeat.setCurrentUser(null));
        super.removePassenger(passenger);
    }
    
    @Override
    protected boolean canFitPassenger(Entity passenger) {
        return this.seats.stream().anyMatch(PassengerSeat::isFree);
    }
    
    @Nullable
    @Override
    public Entity getControllingPassenger() {
        return super.getControllingPassenger();
    }
    
    @Override
    public List<Entity> getPassengers() {
        return super.getPassengers();
    }
    
    @Override
    public boolean isPassenger(Entity entityIn) {
        return super.isPassenger(entityIn);
    }
    
    /**
     * Called when a player right clicks this entity.
     * This is fired through a event, so we get the Vector at which the player has clicked.
     * This is used to determine which seat should be used for the player.
     *
     * @param player The clicker
     * @param hand The hand used by the clicker
     * @param hitVec The vector at which the clicker hit this entity. Reference: {@link PlayerInteractEvent.EntityInteractSpecific#getLocalPos()}
     */
    public void onPlayerClick(EntityPlayer player, EnumHand hand, Vec3d hitVec){
    
    }
}
