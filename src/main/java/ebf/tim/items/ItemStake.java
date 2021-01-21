package ebf.tim.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.utility.CommonUtil;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

//this class mostly serves for instanceof and flavor text
public class ItemStake extends Item {


    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List stringList, boolean p_77624_4_) {
        stringList.add(CommonUtil.translate("menu.item.stake.lore1") + " ");
        stringList.add(CommonUtil.translate("menu.item.stake.lore2") + " ");
    }
}
