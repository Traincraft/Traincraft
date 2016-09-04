package train.common.blocks;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.library.BlockIDs;
import train.common.library.Info;

public class BlockOreTC extends BlockSand {

	private static IIcon texture1;
	private static IIcon texture2;
	private static IIcon texture3;
	private static IIcon texture4;

	public BlockOreTC(int tex) {
		super();
		setCreativeTab(Traincraft.tcTab);
	}

	@Override
	public IIcon getIcon(int side, int metadata) {
		if (metadata == 0) {
			return texture1;
		}
		else if (metadata == 1) {
			return texture2;
		}
		else if(metadata == 2){
			return texture3;
		}else{
			return texture4;
		}
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
		if ((this == BlockIDs.oreTC.blockID) && world.getBlockMetadata(x, y, z) == 1) {
			world.scheduleBlockUpdate(x, y, z, this, 5);
		}
	}

	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, Block par5) {
		if ((this == BlockIDs.oreTC.blockID) && world.getBlockMetadata(x, y, z) == 1) {
			if (!world.isRemote) {
				tryToFall(world, x, y, z);
				world.scheduleBlockUpdate(x, y, z, this, 5);
			}
		}
	}

	@Override
	public void updateTick(World world, int x, int y, int z, Random par5Random) {
		if ((this == BlockIDs.oreTC.blockID) && world.getBlockMetadata(x, y, z) == 1) {
			if (!world.isRemote) {
				if (Block.getIdFromBlock(world.getBlock(x, y - 1, z)) == 0) {
					tryToFall(world, x, y, z);
				}
			}
		}
	}

	private void tryToFall(World world, int x, int y, int z) {
		if (!world.isRemote) {
			int meta = world.getBlockMetadata(x, y, z);
			if (canFallBelow(world, x, y - 1, z) && y >= 0) {
				byte byte0 = 32;
				if (!world.checkChunksExist(x - byte0, y - byte0, z - byte0, x + byte0, y + byte0, z + byte0)) {
					world.setBlock(x, y, z, Blocks.air);
					for (; canFallBelow(world, x, y - 1, z) && y > 0; y--) {
						if (y > 0) {
							world.setBlock(x, y, z, BlockIDs.oreTC.blockID);
							world.setBlockMetadataWithNotify(x, y, z, meta, 3);
						}
					}
				}
				else {
					EntityFallingBlock ent = new EntityFallingBlock(world, x + 0.5D, y + 0.5D, z + 0.5D, this, meta);
					//onStartFalling(ent);
					world.spawnEntityInWorld(ent);
				}
			}
		}
	}

	public static boolean canFallBelow(World world, int x, int y, int z) {
		Block var4 = world.getBlock(x, y, z);
		if (var4 == Blocks.air) {
			return true;
		}
		else if (var4 == Blocks.fire) {
			return true;
		}
		else {
			Material var5 = var4.getMaterial();
			return var5 == Material.water ? true : var5 == Material.lava;
		}
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
