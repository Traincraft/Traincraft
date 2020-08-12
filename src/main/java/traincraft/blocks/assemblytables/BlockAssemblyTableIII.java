/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("BlockAssemblyTableIII.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.blocks.assemblytables;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import traincraft.Traincraft;
import traincraft.blocks.BaseContainerBlock;

import javax.annotation.Nonnull;

public class BlockAssemblyTableIII extends BaseContainerBlock {
    
    public BlockAssemblyTableIII(){
        super(Material.ROCK, TileAssemblyTableIII.class);
        this.setRegistryName(Traincraft.MOD_ID, "assembly_table_3");
        
        this.setCreativeTab(Traincraft.TAB);
        this.setHardness(3.5F);
        this.setSoundType(SoundType.STONE);
        this.setHarvestLevel("pickaxe", 0);
        
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockHorizontal.FACING, EnumFacing.NORTH));
    }
    
    // state: ABCD => B = active; CD = facing
    @SuppressWarnings("deprecation")
    @Nonnull
    @Override
    public IBlockState getStateFromMeta(int meta){
        return this.getDefaultState().withProperty(BlockHorizontal.FACING, EnumFacing.byHorizontalIndex(meta & 0b0011));
    }
    
    @Override
    public int getMetaFromState(IBlockState state){
        return state.getValue(BlockHorizontal.FACING).getHorizontalIndex();
    }
    
    @SuppressWarnings("deprecation")
    @Nonnull
    @Override
    public IBlockState getStateForPlacement(@Nonnull World world, @Nonnull BlockPos pos, @Nonnull EnumFacing facing, float hitX, float hitY, float hitZ, int meta, @Nonnull EntityLivingBase placer){
        return super.getStateForPlacement(world, pos, facing, hitX, hitY, hitZ, meta, placer).withProperty(BlockHorizontal.FACING, placer.getHorizontalFacing().getOpposite());
    }
    
    @Nonnull
    @Override
    protected BlockStateContainer createBlockState(){
        return new BlockStateContainer(this, BlockHorizontal.FACING);
    }
    
}