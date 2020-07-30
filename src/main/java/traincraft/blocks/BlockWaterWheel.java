/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("BlockWaterWheel.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.blocks;

import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import traincraft.Traincraft;
import traincraft.items.ItemBlockGeneratorWaterWheel;
import traincraft.tile.TileWaterWheel;

public class BlockWaterWheel extends BaseContainerBlock {
    
    public BlockWaterWheel(){
        super(Material.WOOD, TileWaterWheel.class);
        this.setRegistryName(Traincraft.MOD_ID, "water_wheel");
        this.setDefaultState(this.getBlockState().getBaseState().withProperty(BlockHorizontal.FACING, EnumFacing.NORTH));
        
        this.setCreativeTab(Traincraft.TAB);
        this.setTickRandomly(true);
        this.setHardness(1.7F);
        this.setSoundType(SoundType.WOOD);
        this.setHarvestLevel("axe", 0);
    }
    
    @Override
    public EnumBlockRenderType getRenderType(IBlockState state){
        return EnumBlockRenderType.MODEL;
    }
    
    @Override
    public ItemBlock getItemBlock(){
        return new ItemBlockGeneratorWaterWheel();
    }
    
    @SuppressWarnings("deprecation")
    @Override
    public boolean isFullBlock(IBlockState state){
        return false;
    }
    
    // state: ABCD => CD = facing
    @SuppressWarnings("deprecation")
    @Override
    public IBlockState getStateFromMeta(int meta){
        return this.getDefaultState().withProperty(BlockHorizontal.FACING, EnumFacing.byHorizontalIndex(meta & 0b0011));
    }

	/* todo waterwheel particle code
	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {
		TileEntity tile = par1World.getTileEntity(par2, par3, par4);
		if (tile != null && tile instanceof TileWaterWheel && ((TileWaterWheel) tile).getWaterDir() > -1001) {
			double d0 = (double) ((float) par2 + 0.5F);
			double d2 = (double) ((float) par4 + 0.5F);

			par1World.spawnParticle("splash", d0, par3 + 1, d2, 0.0D, 0.0D, 0.0D);
			par1World.spawnParticle("splash", d0, par3, d2, 0.0D, 0.0D, 0.0D);
			if (par5Random.nextInt(20) == 0) {
				par1World.playSound(par2, par3, par4, "liquid.water", par5Random.nextFloat() * 0.25F + 0.75F, par5Random.nextFloat() * 1F + 0.1F, true);
			}
		}
	}
	 */
    
    @Override
    public int getMetaFromState(IBlockState state){
        return state.getValue(BlockHorizontal.FACING).getHorizontalIndex();
    }
    
    @SuppressWarnings("deprecation")
    @Override
    public boolean isOpaqueCube(IBlockState state){
        return false;
    }
    
    @SuppressWarnings("deprecation")
    @Override
    public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer){
        return super.getStateForPlacement(world, pos, facing, hitX, hitY, hitZ, meta, placer).withProperty(BlockDirectional.FACING, placer.getHorizontalFacing().getOpposite());
    }
    
    @Override
    protected BlockStateContainer createBlockState(){
        return new BlockStateContainer(this, BlockHorizontal.FACING);
    }
}
