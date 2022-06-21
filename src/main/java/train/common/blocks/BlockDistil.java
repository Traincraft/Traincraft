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
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.Traincraft;
import train.common.library.BlockIDs;
import train.common.library.GuiIDs;
import train.common.library.Info;
import train.common.tile.TileEntityDistil;
import train.common.tile.TileHelper;

import java.util.Random;

public class BlockDistil extends BlockContainer {

	private final boolean isActive;
	private static boolean keepDistilInventory = false;
	private Random distilRand;

	private IIcon textureTop;
	private IIcon textureBottom;
	private IIcon textureFront_off;
	private IIcon textureFront_on;
	private IIcon textureSide;
	private IIcon textureBack;

	public BlockDistil(int j, boolean flag) {
		super(Material.anvil);
		isActive = flag;
		distilRand = new Random();
		//setRequiresSelfNotify();

		if (isActive) {
			setLightLevel(0.8F);
		} else {
			setCreativeTab(Traincraft.tcTab);
		}
	}

	@Override
	public Item getItemDropped(int i, Random random, int j) {
		return Item.getItemFromBlock(BlockIDs.distilIdle.block);
	}

	@Override
	public IIcon getIcon(int i, int j) {
		if (!this.isActive) {
			if (i == 1) {
				return textureTop;
			}
			if (i == 0) {
				return textureBottom;
			}
			if (i == 4) {
				return textureBack;
			}
			if (i == 3) {
				return textureFront_off;
			}
			else {
				return textureSide;
			}
		}
		else {
			if (i == 1) {
				return textureTop;
			}
			if (i == 0) {
				return textureBottom;
			}
			if (i == 4) {
				return textureBack;
			}
			if (i == 3) {
				return textureFront_on;
			}
			else {
				return textureSide;
			}
		}
	}

	@Override
	public IIcon getIcon(IBlockAccess worldAccess, int i, int j, int k, int side) {
		if (((TileEntityDistil) worldAccess.getTileEntity(i, j, k)).getFacing() != null) {
			side = TileHelper.getOrientationFromSide(((TileEntityDistil) worldAccess.getTileEntity(i, j, k)).getFacing(), ForgeDirection.getOrientation(side)).ordinal();
		}
		if (!this.isActive) {
			return side == 1 ? textureTop : side == 0 ? textureBottom : side == 4 ? textureSide : side == 5 ? textureSide : side == 3 ? textureFront_off : textureBack;
		}
		else {
			return side == 1 ? textureTop : side == 0 ? textureBottom : side == 4 ? textureSide : side == 5 ? textureSide : side == 3 ? textureFront_on : textureBack;
		}
	}

	@Override
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer player, int par6, float par7, float par8, float par9) {
		TileEntity te = world.getTileEntity(i, j, k);
		if (player.isSneaking()) {
			return false;
		}
		if (!world.isRemote) {
			if (te != null && te instanceof TileEntityDistil) {
				player.openGui(Traincraft.instance, GuiIDs.DISTIL, world, i, j, k);
			}
		}
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int i, int j, int k, Random random) {
		if (this.isActive) {
			ForgeDirection side = ((TileEntityDistil) world.getTileEntity(i, j, k)).getFacing();
			float var7 = (float) i + 0.5F;
			float var8 = (float) j + 0.0F + random.nextFloat() * 6.0F / 16.0F;
			float var9 = (float) k + 0.5F;
			float var10 = 0.52F;
			float var11 = random.nextFloat() * 0.6F - 0.3F;
			for (int t = 0; t < 10; t++) {

				world.spawnParticle("mobSpellAmbient", var7, (double) j + 1F, var9, 0, 0, 0);
			}
			if (side == ForgeDirection.WEST) {
				world.spawnParticle("smoke", (double) (var7 - var10), (double) var8, (double) (var9 + var11), 0.0D, 0.0D, 0.0D);
				world.spawnParticle("flame", (double) (var7 - var10), (double) var8, (double) (var9 + var11), 0.0D, 0.0D, 0.0D);
			}
			else if (side == ForgeDirection.EAST) {
				world.spawnParticle("smoke", (double) (var7 + var10), (double) var8, (double) (var9 + var11), 0.0D, 0.0D, 0.0D);
				world.spawnParticle("flame", (double) (var7 + var10), (double) var8, (double) (var9 + var11), 0.0D, 0.0D, 0.0D);
			}
			else if (side == ForgeDirection.NORTH) {
				world.spawnParticle("smoke", (double) (var7 + var11), (double) var8, (double) (var9 - var10), 0.0D, 0.0D, 0.0D);
				world.spawnParticle("flame", (double) (var7 + var11), (double) var8, (double) (var9 - var10), 0.0D, 0.0D, 0.0D);
			}
			else if (side == ForgeDirection.SOUTH) {
				world.spawnParticle("smoke", (double) (var7 + var11), (double) var8, (double) (var9 + var10), 0.0D, 0.0D, 0.0D);
				world.spawnParticle("flame", (double) (var7 + var11), (double) var8, (double) (var9 + var10), 0.0D, 0.0D, 0.0D);
			}
		}
	}

	public static void updateDistilBlockState(boolean flag, World world, int i, int j, int k) {
		int l = world.getBlockMetadata(i, j, k);
		TileEntity tileentity = world.getTileEntity(i, j, k);
		keepDistilInventory = true;
		if (flag) {
			world.setBlock(i, j, k, BlockIDs.distilActive.block);
		}
		else {
			world.setBlock(i, j, k, BlockIDs.distilIdle.block);
		}
		keepDistilInventory = false;
		world.setBlockMetadataWithNotify(i, j, k, l, 2);
		if (tileentity != null) {
			tileentity.validate();
			world.setTileEntity(i, j, k, tileentity);
		}
	}

	@Override
	public void breakBlock(World world, int i, int j, int k, Block par5, int par6) {
		if (!keepDistilInventory) {
			TileEntityDistil tileentitydistil = (TileEntityDistil) world.getTileEntity(i, j, k);
			if (tileentitydistil != null) {
				label0: for (int l = 0; l < tileentitydistil.getSizeInventory(); l++) {
					ItemStack itemstack = tileentitydistil.getStackInSlot(l);
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
						EntityItem entityitem = new EntityItem(world, (float) i + f, (float) j + f1, (float) k + f2, itemstack.splitStack(i1));
						float f3 = 0.05F;
						entityitem.motionX = (float) distilRand.nextGaussian() * f3;
						entityitem.motionY = (float) distilRand.nextGaussian() * f3 + 0.2F;
						entityitem.motionZ = (float) distilRand.nextGaussian() * f3;
						world.spawnEntityInWorld(entityitem);
					} while (true);
				}
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
		TileEntityDistil te = (TileEntityDistil) world.getTileEntity(i, j, k);
		if (te != null) {
			int dir = MathHelper.floor_double((double) ((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
			te.setFacing(ForgeDirection.getOrientation(dir == 0 ? 2 : dir == 1 ? 5 : dir == 2 ? 3 : 4));
			world.markBlockForUpdate(i, j, k);
		}
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileEntityDistil();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		textureTop = iconRegister.registerIcon(Info.modID.toLowerCase() + ":distil_top");
		textureBottom = iconRegister.registerIcon(Info.modID.toLowerCase() + ":distil_bottom");
		textureFront_off = iconRegister.registerIcon(Info.modID.toLowerCase() + ":distil_off_front");
		textureFront_on = iconRegister.registerIcon(Info.modID.toLowerCase() + ":distil_on_front");
		textureSide = iconRegister.registerIcon(Info.modID.toLowerCase() + ":distil_side");
		textureBack = iconRegister.registerIcon(Info.modID.toLowerCase() + ":distil_bottom");
	}
}
