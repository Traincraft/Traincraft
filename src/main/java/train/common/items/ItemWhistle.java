package train.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.library.Info;

import java.util.List;

public class ItemWhistle extends Item {

    public ItemWhistle() {
        super();
        maxStackSize = 64;
        setCreativeTab(Traincraft.tcTab);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":whistle");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add("\u00a77" + EnumChatFormatting.GREEN + "Right click to whistle!");
    }

    @Override
    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_) {
        p_77659_2_.playSoundAtEntity(p_77659_3_, Info.resourceLocation + ":" + "whistle", 1F, 1.0F);
        return super.onItemRightClick(p_77659_1_, p_77659_2_, p_77659_3_);

    }
}
