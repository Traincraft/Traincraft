package src.train.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import src.train.common.Traincraft;
import src.train.common.library.Info;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockOrePetrol extends Block {

	private IIcon texture1;
	private IIcon texture2;
	private int tx;

	public BlockOrePetrol(int i, int j) {
		super(i, Material.rock);
		tx = j;
		setCreativeTab(Traincraft.tcTab);
	}

	@Override
	public IIcon getIcon(int par1, int par2) {
		if (tx == 0) {
			return texture1;
		}
		else {
			return texture2;
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		texture1 = iconRegister.registerIcon(Info.modID.toLowerCase() + ":ores/ore_oilsands");
		texture2 = iconRegister.registerIcon(Info.modID.toLowerCase() + ":ores/ore_petroleum");
	}
}
