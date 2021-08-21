package train.common.wellcar;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import java.util.List;

public class ItemFortyFootContainer extends ItemBlock {
    public ItemFortyFootContainer(Block p_i45328_1_) {
        super(p_i45328_1_);
        setMaxStackSize(1);
    }
    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add("\u00a77" + "A container that you can put items in.");
        par3List.add("\u00a77" + "Can be put on wellcars.");
        par3List.add("\u00a77" + "Color can be changed with a paintbrush.");
        par3List.add("\u00a77" + EnumChatFormatting.RED + "Warning, a work in progress! Things may break!");
    }


}
