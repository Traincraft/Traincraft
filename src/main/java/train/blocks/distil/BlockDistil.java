package train.blocks.distil;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.blocks.BlockDynamic;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import train.Traincraft;
import train.blocks.TCBlocks;
import train.library.GuiIDs;

import java.util.Random;

public class BlockDistil extends BlockDynamic {


	public BlockDistil() {
		super(Material.rock, true,true);
		//setRequiresSelfNotify();
	}

	@Override
	public Item getItemDropped(int i, Random random, int j) {
		return Item.getItemFromBlock(TCBlocks.blockDistil);
	}

	@Override
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer player, int par6, float par7, float par8, float par9) {
		TileEntity te = world.getTileEntity(i, j, k);
		if (player.isSneaking()) {
			return false;
		}
		if (!world.isRemote) {
			if (te instanceof TileEntityDistil) {
				player.openGui(Traincraft.instance, GuiIDs.DISTIL, world, i, j, k);
			}
		}
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int i, int j, int k, Random random) {
		TileEntity te = Minecraft.getMinecraft().theWorld.getTileEntity((int) minX, (int) minY, (int) minZ);
		if (te instanceof TileEntityDistil && ((TileEntityDistil) te).isBurning()) {
			setLightLevel(0.8F);
			ForgeDirection side = ((TileEntityDistil) te).getFacing();
			float var7 = i + 0.5F;
			float var8 = j + 0.0F + random.nextFloat() * 6.0F / 16.0F;
			float var9 = k + 0.5F;
			float var11 = random.nextFloat() * 0.6F - 0.3F;
			for (int t = 0; t < 10; t++) {
				world.spawnParticle("mobSpellAmbient", var7, (double) j + 1F, var9, 0, 0, 0);
			}

			if (side == ForgeDirection.WEST) {
				world.spawnParticle("smoke", (double) (var7 - 0.52F), (double) var8, (double) (var9 + var11), 0.0D, 0.0D, 0.0D);
				world.spawnParticle("flame", (double) (var7 - 0.52F), (double) var8, (double) (var9 + var11), 0.0D, 0.0D, 0.0D);
			} else if (side == ForgeDirection.EAST) {
				world.spawnParticle("smoke", (double) (var7 + 0.52F), (double) var8, (double) (var9 + var11), 0.0D, 0.0D, 0.0D);
				world.spawnParticle("flame", (double) (var7 + 0.52F), (double) var8, (double) (var9 + var11), 0.0D, 0.0D, 0.0D);
			} else if (side == ForgeDirection.NORTH) {
				world.spawnParticle("smoke", (double) (var7 + var11), (double) var8, (double) (var9 - 0.52F), 0.0D, 0.0D, 0.0D);
				world.spawnParticle("flame", (double) (var7 + var11), (double) var8, (double) (var9 - 0.52F), 0.0D, 0.0D, 0.0D);
			} else if (side == ForgeDirection.SOUTH) {
				world.spawnParticle("smoke", (double) (var7 + var11), (double) var8, (double) (var9 + 0.52F), 0.0D, 0.0D, 0.0D);
				world.spawnParticle("flame", (double) (var7 + var11), (double) var8, (double) (var9 + 0.52F), 0.0D, 0.0D, 0.0D);
			}
		} else {
			setLightLevel(0.0F);
		}
	}

	public ResourceLocation getTexture(int x, int y, int z){
		if(Minecraft.getMinecraft().theWorld.getTileEntity(x,y,z) instanceof TileEntityDistil){
			if(((TileEntityDistil) Minecraft.getMinecraft().theWorld.getTileEntity(x,y,z)).isBurning()){
				return new ResourceLocation("traincraft", "textures/blocks/distil_on.png");
			}
		}
		return new ResourceLocation("traincraft", "textures/blocks/distil_off.png");
	}

	@Override
	public void breakBlock(World world, int i, int j, int k, Block par5, int par6) {
		//todo: keep inventory code for item
		TileEntity te = world.getTileEntity(i,j,k);
		if(te instanceof TileEntityDistil){
			((TileEntityDistil) te).dropInventory();
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

}
