/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("BlockLantern.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import traincraft.Traincraft;

/**
 * In 1.7 the lantern has a tile entity to do the coloring. It would be better if the color is handled within the block.
 * This includes deleting the tile entity and maybe using right lick with itemdye for color change
 */
public class BlockLantern extends BaseBlock {
    
    public static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.2F, 0.0F, 0.2F, 0.7F, 0.9F, 0.7F);
    
    public BlockLantern(){
        super(Material.ROCK);
        this.setRegistryName(Traincraft.MOD_ID, "lantern");
        
        this.setCreativeTab(Traincraft.TAB);
        this.setTickRandomly(true);
        this.setHardness(1.7F);
        this.setSoundType(SoundType.METAL);
        this.setLightLevel(0.98F);
    }
    
    @SuppressWarnings("deprecation")
    @Override
    public boolean isFullBlock(IBlockState state){
        return false;
    }
    
    @SuppressWarnings("deprecation")
    @Override
    public EnumBlockRenderType getRenderType(IBlockState state){
        return EnumBlockRenderType.MODEL;
    }
    
    @SuppressWarnings("deprecation")
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
        return BOUNDING_BOX;
    }
    
    @SuppressWarnings("deprecation")
    @Override
    public boolean isOpaqueCube(IBlockState state){
        return false;
    }

	/* todo particles for lantern
	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {
		double d0 = (double) ((float) par2 + 0.5F);
		double d2 = (double) ((float) par4 + 0.5F);
		double d3 = 0.2199999988079071D;

		par1World.spawnParticle("smoke", d0, par3 + d3, d2, 0.0D, 0.0D, 0.0D);
		par1World.spawnParticle("flame", d0, par3 + d3, d2, 0.0D, 0.0D, 0.0D);

	}
	*/
 
}