package traincraft.tile;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.server.management.PlayerChunkMapEntry;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.InvWrapper;
import traincraft.api.AbstractRollingStock;
import traincraft.compat.CompatibilityManager;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class BaseTile extends TileEntity {
    
    private boolean sync = false;
    
    @Override
    public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newState) {
        return oldState.getBlock() != newState.getBlock();
    }
    
    public IInventory getRealInventory(){
        return null;
    }
    
    public IItemHandler getInventory(@Nullable EnumFacing side){
        return null;
    }
    
    public IFluidHandler getFluidTank(@Nullable EnumFacing side){
        return null;
    }
    
    public IEnergyStorage getEnergyStorage(@Nullable EnumFacing side){
        return null;
    }
    
    /**
     * Update method for checking things like syncing. Has to be called by the tile itself.
     * This approach was choosen to avoid every BaseTile from ticking
     */
    protected final void updateBaseTile(){
        if(this.sync){
            this.sync = false;
            if(this.world instanceof WorldServer){
                SPacketUpdateTileEntity updatePacket = this.getUpdatePacket();
                if(updatePacket != null){
                    PlayerChunkMapEntry entry = ((WorldServer) this.world).getPlayerChunkMap().getEntry(this.pos.getX() >> 4, this.getPos().getZ() >> 4);
                    if(entry != null){
                        for(EntityPlayerMP player : entry.getWatchingPlayers()){
                            player.connection.sendPacket(updatePacket);
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing) {
        return this.getCapability(capability, facing) != null;
    }
    
    @Nullable
    @Override
    public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing) {
        if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY){
            IItemHandler itemHandler = this.getInventory(facing);
            if(itemHandler != null){
                return CapabilityItemHandler.ITEM_HANDLER_CAPABILITY.cast(itemHandler);
            }
        } else if(capability == CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY){
            IFluidHandler fluidHandler = this.getFluidTank(facing);
            if(fluidHandler != null){
                return CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY.cast(fluidHandler);
            }
        } else if(capability == CapabilityEnergy.ENERGY){
            IEnergyStorage energyStorage = this.getEnergyStorage(facing);
            if(energyStorage != null){
                return CapabilityEnergy.ENERGY.cast(energyStorage);
            }
        }
        return super.getCapability(capability, facing);
    }
    
    @Nullable
    @Override
    public SPacketUpdateTileEntity getUpdatePacket() {
        NBTTagCompound compound = new NBTTagCompound();
        this.writeNBT(compound, NBTState.SYNC);
        return new SPacketUpdateTileEntity(getPos(), 0, compound);
    }
    
    @Override
    public final void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
        if (pkt != null) {
            this.readNBT(pkt.getNbtCompound(), NBTState.SYNC);
        }
    }
    
    public void syncToClient() {
        this.sync = true;
    }
    
    @Override
    public final void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.readNBT(compound, NBTState.SAVE);
    }
    
    @Override
    public final NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        this.writeNBT(compound, NBTState.SAVE);
        return compound;
    }
    
    public void readNBT(NBTTagCompound nbt, NBTState state){
        if(nbt.hasKey("inventory")){
            NBTTagCompound inventoryNBT = nbt.getCompoundTag("inventory");
            IItemHandler inventory = this.getInventory(null);
            if(inventory instanceof InvWrapper && ((InvWrapper) inventory).getInv() instanceof INBTSerializable<?>){
                ((INBTSerializable<NBTTagCompound>) ((InvWrapper) inventory).getInv()).deserializeNBT(inventoryNBT);
            } else if(this.getRealInventory() != null && this.getRealInventory() instanceof INBTSerializable<?>){
                ((INBTSerializable<NBTTagCompound>) this.getRealInventory()).deserializeNBT(inventoryNBT);
            }
        }
        if(nbt.hasKey("fluid_tank")){
            NBTTagCompound fluidTankNBT = nbt.getCompoundTag("fluid_tank");
            IFluidHandler fluidHandler = this.getFluidTank(null);
            if(fluidHandler instanceof INBTSerializable<?>){
                ((INBTSerializable<NBTTagCompound>) fluidHandler).deserializeNBT(fluidTankNBT);
            }
        }
        // todo read energy capabililty
    }
    
    public void writeNBT(NBTTagCompound nbt, NBTState state){
        IItemHandler inventory = this.getInventory(null);
        if(inventory instanceof InvWrapper && ((InvWrapper) inventory).getInv() instanceof INBTSerializable<?>){
            NBTBase value = ((INBTSerializable<?>) ((InvWrapper) inventory).getInv()).serializeNBT();
            if(value instanceof NBTTagCompound){
                nbt.setTag("inventory", value);
            }
        } else if(this.getRealInventory() != null && this.getRealInventory() instanceof INBTSerializable<?>){
            NBTBase value = ((INBTSerializable<?>) this.getRealInventory()).serializeNBT();
            if(value instanceof NBTTagCompound){
                nbt.setTag("inventory", value);
            }
        }
    
        IFluidHandler fluidHandler = this.getFluidTank(null);
        if(fluidHandler instanceof INBTSerializable<?>){
            NBTBase value = ((INBTSerializable<?>) fluidHandler).serializeNBT();
            if(value instanceof NBTTagCompound){
                nbt.setTag("fluid_tank", value);
            }
        }
        // todo write energy capabililty
    }
    
    public GuiScreen openGui(EntityPlayer player){
        return null;
    }
    
    public Container openContainer(EntityPlayer player){
        return null;
    }
    
    public void onBlockBreak(IBlockState state){
        // drop inventory if present
    }
    
    public void onBlockPlacedBy(EntityLivingBase placer, ItemStack stack){
    
    }
    
    public static enum NBTState {
        SAVE,
        SYNC,
        DROP
    }
    
}
