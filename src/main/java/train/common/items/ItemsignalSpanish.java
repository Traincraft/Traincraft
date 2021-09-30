package train.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemBlock;
import train.common.Traincraft;
import train.common.library.Info;

public class ItemsignalSpanish extends ItemBlock {

    public ItemsignalSpanish(Block id) {
        super(id);
        maxStackSize = 64;
        setCreativeTab(Traincraft.tcTab);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":paintbrushThing");
    }


}
