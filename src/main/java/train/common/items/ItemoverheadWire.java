package train.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemBlock;
import train.common.Traincraft;

public class ItemoverheadWire extends ItemBlock {
    public ItemoverheadWire(Block p_i45328_1_) {
        super(p_i45328_1_);
        setTextureName("tc:overheadWireItem");
        setCreativeTab(Traincraft.tcTab);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon( "tc:ceramic");
    }
}
