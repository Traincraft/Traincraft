package train.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import train.common.Traincraft;
import train.common.library.Info;

import java.util.ArrayList;
import java.util.List;

public class ItemBolt extends Item {
    private ArrayList<String[]> info;

    public ItemBolt() {
        super();
        maxStackSize = 64;
        setCreativeTab(Traincraft.tcTab);
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":bolt");
    }
    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add("\u00a77" + EnumChatFormatting.GREEN + "Use this to craft Track");
    }
}
