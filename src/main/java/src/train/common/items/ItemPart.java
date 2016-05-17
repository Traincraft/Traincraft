package src.train.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import src.train.common.Traincraft;
import src.train.common.library.Info;
import src.train.common.library.ItemIDs;

/**
 * @author canitzp
 */
public class ItemPart extends Item{

    protected String iconName = "";
    protected String folder = "parts";

    public ItemPart(String iconName){
        this.iconName = iconName;
        this.setMaxStackSize(64);
        this.setCreativeTab(Traincraft.tcTab);
    }

    public ItemPart overridePath(String newFolder){
        this.folder = newFolder;
        return this;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":" + this.folder + "/" + this.iconName);
    }

}
