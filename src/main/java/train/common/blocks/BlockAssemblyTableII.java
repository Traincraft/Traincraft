package train.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.Traincraft;
import train.common.library.GuiIDs;
import train.common.library.Info;
import train.common.tile.TileCrafterTierII;
import train.common.tile.TileHelper;

import java.util.Random;

public class BlockAssemblyTableII extends BlockContainer {

	private IIcon textureTop;
	private IIcon textureBottom;
	private IIcon textureFront;
	private IIcon textureSide;

	public BlockAssemblyTableII(Material material) {
		super(material);
		setCreativeTab(Traincraft.tcTab);
	}

	@Override
	public int damageDropped(int i) {
		return i;
	}

	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
		return 1;
	}

	@Override
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer player, int par6, float par7, float par8, float par9) {
		TileEntity te = world.getTileEntity(i, j, k);
		if (player.isSneaking()) {
			return false;
		}
		if (!world.isRemote) {
			if (te != null && te instanceof TileCrafterTierII) {
				player.openGui(Traincraft.instance, GuiIDs.CRAFTER_TIER_II, world, i, j, k);
			}
		}
		return true;
	}

	@Override
	public IIcon getIcon(int i, int j) {
		if (i == 1) {
			return textureTop;
		}
		if (i == 0) {
			return textureBottom;
		}
		if (i == 3) {
			return textureFront;
		}
		else {
			return textureSide;
		}
	}

	@Override
	public IIcon getIcon(IBlockAccess worldAccess, int i, int j, int k, int side) {
		if (((TileCrafterTierII) worldAccess.getTileEntity(i, j, k)).getFacing() != null) {
			side = TileHelper.getOrientationFromSide(((TileCrafterTierII) worldAccess.getTileEntity(i, j, k)).getFacing(), ForgeDirection.getOrientation(side)).ordinal();
		}
		return side == 1 ? textureTop : side == 0 ? textureBottom : side == 3 ? textureFront : textureSide;
	}

	@Override
	public void breakBlock(World world, int i, int j, int k, Block par5, int par6) {
		Random distilRand = new Random();
		TileCrafterTierII tileentitytierII = (TileCrafterTierII) world.getTileEntity(i, j, k);
		if (tileentitytierII != null) {
			label0: for (int l = 0; l < tileentitytierII.getSizeInventory(); l++) {
				ItemStack itemstack = tileentitytierII.getStackInSlot(l);
				if (itemstack == null) {
					continue;
				}
				float f = distilRand.nextFloat() * 0.8F + 0.1F;
				float f1 = distilRand.nextFloat() * 0.8F + 0.1F;
				float f2 = distilRand.nextFloat() * 0.8F + 0.1F;
				do {
					if (itemstack.stackSize <= 0) {
						continue label0;
					}
					int i1 = distilRand.nextInt(21) + 10;
					if (i1 > itemstack.stackSize) {
						i1 = itemstack.stackSize;
					}
					itemstack.stackSize -= i1;
					EntityItem entityitem = new EntityItem(world, i + f, j + f1, k + f2, itemstack.splitStack(i1));
					float f3 = 0.05F;
					entityitem.motionX = (float) distilRand.nextGaussian() * f3;
					entityitem.motionY = (float) distilRand.nextGaussian() * f3 + 0.2F;
					entityitem.motionZ = (float) distilRand.nextGaussian() * f3;
					world.spawnEntityInWorld(entityitem);
				} while (true);
			}
		}
		super.breakBlock(world, i, j, k, par5, par6);
	}

	@Override
	public void onBlockAdded(World world, int i, int j, int k) {
		super.onBlockAdded(world, i, j, k);
		world.markBlockForUpdate(i, j, k);
	}

	@Override
	public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack stack) {
		super.onBlockPlacedBy(world, i, j, k, entityliving, stack);
		TileCrafterTierII te = (TileCrafterTierII) world.getTileEntity(i, j, k);
		if (te != null) {
			int dir = MathHelper.floor_double((entityliving.rotationYaw * 4F) / 360F + 0.5D) & 3;
			te.setFacing(ForgeDirection.getOrientation(dir == 0 ? 2 : dir == 1 ? 5 : dir == 2 ? 3 : 4));
			world.markBlockForUpdate(i, j, k);
		}
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int meta) {
		return new TileCrafterTierII();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		textureTop = iconRegister.registerIcon(Info.modID.toLowerCase() + ":assembly_2_top");
		textureBottom = iconRegister.registerIcon(Info.modID.toLowerCase() + ":assembly_2_bottom");
		textureFront = iconRegister.registerIcon(Info.modID.toLowerCase() + ":assembly_2_front");
		textureSide = iconRegister.registerIcon(Info.modID.toLowerCase() + ":assembly_2_side");
	}
}