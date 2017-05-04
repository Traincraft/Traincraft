package train.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.library.Info;

import java.util.List;
import java.util.Random;

public class BlockOreTC extends BlockFalling {

	private static IIcon texture1;
	private static IIcon texture2;
	private static IIcon texture3;
	private static IIcon texture4;

	public BlockOreTC() {
		super(Material.rock);
		setCreativeTab(Traincraft.tcTab);
	}

	@Override
	public IIcon getIcon(int side, int metadata) {
		if (metadata == 0) return texture1;
		else if (metadata == 1) return texture2;
		else if (metadata == 2) return texture3;
		else return texture4;
	}

	@Override
	public int damageDropped(int metadata) {
		return metadata;
	}

	@Override
	public int quantityDropped(Random random) {
		return 1;
	}

	@Override
    public void onBlockAdded(World world, int x, int y, int z) {
		if (world.getBlockMetadata(x, y, z) == 1) world.scheduleBlockUpdate(x, y, z, this, this.tickRate(world));
    }

	@Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
		if (world.getBlockMetadata(x, y, z) == 1) world.scheduleBlockUpdate(x, y, z, this, this.tickRate(world));
    }

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item par1, CreativeTabs tab, List subItems) {
		for (int i = 0; i < 4; i++) {
			subItems.add(new ItemStack(this, 1, i));
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		texture1 = iconRegister.registerIcon(Info.modID.toLowerCase() + ":ores/ore_copper");
		texture2 = iconRegister.registerIcon(Info.modID.toLowerCase() + ":ores/ore_oilsands");
		texture3 = iconRegister.registerIcon(Info.modID.toLowerCase() + ":ores/ore_petroleum");
		texture4 = iconRegister.registerIcon(Info.modID.toLowerCase() + ":ballast_test");
	}

	public static IIcon getTexture1() {
		return texture1;
	}
}
