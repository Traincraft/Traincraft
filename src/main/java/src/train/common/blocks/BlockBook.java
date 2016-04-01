/*******************************************************************************
 * Copyright (c) 2013 Mrbrutal. All rights reserved.
 * 
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package src.train.common.blocks;

import static net.minecraftforge.common.util.ForgeDirection.UP;

import java.util.ArrayList;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import src.train.common.Traincraft;
import src.train.common.library.GuiIDs;
import src.train.common.library.Info;
import src.train.common.tile.TileBook;
import src.train.common.tile.TileEntityDistil;
import src.train.common.tile.TileGeneratorDiesel;
import src.train.common.tile.TileStopper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockBook extends BlockContainer {
	
	IIcon texture;

	public BlockBook(int par1) {
		super(par1, Material.wood);
		setCreativeTab(Traincraft.tcTab);
		setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.14F, 1F);
	}
	
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	@Override
	public int getRenderType() {
		return -1;
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	@Override
	public IIcon getIcon(int i, int j) {
		return texture;
	}
	
	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addCreativeItems(ArrayList itemList) {
		itemList.add(new ItemStack(this));
	}
	
	@Override
	public boolean canPlaceBlockAt(World world, int x, int y, int z) {
		Block block = Block.blocksList[world.getBlockId(x, y-1, z)];
		if(block != null && world.isBlockSolidOnSide(x, y - 1, z, UP)) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer player, int par6, float par7, float par8, float par9) {
		TileEntity te = world.getBlockTileEntity(i, j, k);
		if (player.isSneaking()) {
			return false;
		}
		if (!world.isRemote) {
			System.out.println("Opening GUI!");
			//player.openGui(Traincraft.instance, GuiIDs.RECIPE_BOOK2, world, i, j, k);
			return true;
		}
		return false;
	}
	
	@Override
	public void onBlockPlacedBy(World world, int par2, int par3, int par4, EntityLivingBase living, ItemStack stack) {
		TileBook te = (TileBook) world.getBlockTileEntity(par2, par3, par4);
		int var6 = MathHelper.floor_double((double) (living.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
		int var7 = world.getBlockMetadata(par2, par3, par4) >> 2;
		++var6;
		var6 %= 4;

		if (var6 == 0) {
			if (te != null) {
				te.setFacing(2 | var7 << 2);
			}
		}

		if (var6 == 1) {
			if (te != null) {
				te.setFacing(3 | var7 << 2);
			}
		}

		if (var6 == 2) {
			if (te != null) {
				te.setFacing(0 | var7 << 2);
			}
		}

		if (var6 == 3) {
			if (te != null) {
				te.setFacing(1 | var7 << 2);
			}
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		texture = iconRegister.registerIcon(Info.modID.toLowerCase() + ":item_book_blue");
	}
	
	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileBook();
	}
}