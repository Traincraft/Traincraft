package train.common.tile;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public abstract class BaseTile extends TileEntity {
    
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
    
}
