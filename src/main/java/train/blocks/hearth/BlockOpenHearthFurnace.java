/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.blocks.hearth;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.blocks.BlockDynamic;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import train.Traincraft;
import train.blocks.distil.TileEntityDistil;
import train.library.BlockIDs;
import train.library.GuiIDs;
import train.library.Info;
import train.blocks.TileTraincraft;

import java.util.Random;

public class BlockOpenHearthFurnace extends BlockDynamic {


	public BlockOpenHearthFurnace() {
		super(Material.rock, true,true);
		//setRequiresSelfNotify();
	}

	public ResourceLocation getTexture(int x, int y, int z){
		//todo this is inefficient, do from tile entity
		if(Minecraft.getMinecraft().theWorld.getTileEntity(x,y,z) instanceof TileEntityDistil){
			if(((TileEntityOpenHearthFurnace) Minecraft.getMinecraft().theWorld.getTileEntity(x,y,z)).isBurning()){
				return new ResourceLocation("traincraft", "textures/blocks/furnace_on.png");
			}
		}
		return new ResourceLocation("traincraft", "textures/blocks/furnace_off.png");
	}

	@Override
	public Item getItemDropped(int i, Random random, int j) {
		return Item.getItemFromBlock(BlockIDs.openFurnaceIdle.block);
	}

	public static void updateHearthFurnaceBlockState(boolean flag, World world, int i, int j, int k) {
		int l = world.getBlockMetadata(i, j, k);
		TileEntity tileentity = world.getTileEntity(i, j, k);
		world.setBlockMetadataWithNotify(i, j, k, l, 0);
		if (tileentity != null) {
			tileentity.validate();
			world.setTileEntity(i, j, k, tileentity);
		}

		if(TrainsInMotion.proxy.isClient()) {
			if(flag){
				world.getBlock(i,j,k).setLightLevel(0.8F);
			} else {
				world.getBlock(i,j,k).setCreativeTab(Traincraft.tcTab);
			}
		}
	}

	@Override
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer player, int par6, float par7, float par8, float par9) {
		TileEntity te = world.getTileEntity(i, j, k);
		if (player.isSneaking()) {
			return false;
		}
		if (!world.isRemote) {
			if (te instanceof TileEntityOpenHearthFurnace) {
				player.openGui(Traincraft.instance, GuiIDs.OPEN_HEARTH_FURNACE, world, i, j, k);
			}
		}
		return true;
	}

	@Override
	public void onBlockAdded(World world, int i, int j, int k) {
		super.onBlockAdded(world, i, j, k);
		world.markBlockForUpdate(i, j, k);
	}

	@Override
	public void breakBlock(World world, int i, int j, int k, Block par5, int par6) {
		//todo:keep inventory on break?

		TileEntity te = world.getTileEntity(i,j,k);
		if(te instanceof TileEntityOpenHearthFurnace){
			((TileEntityOpenHearthFurnace) te).dropInventory();
		}
		super.breakBlock(world, i, j, k, par5, par6);
	}

	@Override
	public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack stack) {
		TileEntityOpenHearthFurnace te = (TileEntityOpenHearthFurnace) world.getTileEntity(i, j, k);
		if (te != null) {
			int dir = MathHelper.floor_double((entityliving.rotationYaw * 4F) / 360F + 0.5D) & 3;
			te.setFacing(ForgeDirection.getOrientation(dir == 0 ? 2 : dir == 1 ? 5 : dir == 2 ? 3 : 4));
			world.markBlockForUpdate(i, j, k);
		}
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int i) {
		return new TileEntityOpenHearthFurnace();
	}

}
