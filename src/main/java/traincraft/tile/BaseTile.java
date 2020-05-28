package traincraft.tile;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

import javax.annotation.Nullable;

public abstract class BaseTile extends TileEntity {
    
    @Nullable
    @Override
    public SPacketUpdateTileEntity getUpdatePacket() {
        NBTTagCompound compound = new NBTTagCompound();
        this.writeToNBT(compound);
        return new SPacketUpdateTileEntity(getPos(), 0, compound);
    }
    
    @Override
    public final void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
        if (pkt != null) {
            this.readFromNBT(pkt.getNbtCompound());
        }
    }
    
    @Override
    public final void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
    }
    
    @Override
    public final NBTTagCompound writeToNBT(NBTTagCompound compound) {
        return super.writeToNBT(compound);
    }
    
    public void readNBT(NBTTagCompound nbt, NBTState state){}
    
    public void writeNBT(NBTTagCompound nbt, NBTState state){}
    
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
