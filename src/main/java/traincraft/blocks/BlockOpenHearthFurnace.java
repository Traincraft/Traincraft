/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("BlockOpenHearthFurnace.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.blocks;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import traincraft.Traincraft;
import traincraft.tile.TileOpenHearthFurnace;

public class BlockOpenHearthFurnace extends BaseContainerBlock {
    
    public static final PropertyBool ACTIVE = PropertyBool.create("active");
    
    protected BlockOpenHearthFurnace(){
        super(Material.ROCK, TileOpenHearthFurnace.class);
        this.setRegistryName(Traincraft.MOD_ID, "hearth_furnace");
        
        this.setCreativeTab(Traincraft.TAB);
        this.setHardness(3.5F);
        this.setSoundType(SoundType.STONE);
        
        this.setDefaultState(this.blockState.getBaseState().withProperty(ACTIVE, false).withProperty(BlockHorizontal.FACING, EnumFacing.NORTH));
    }
    
    // state: ABCD => B = active; CD = facing
    @SuppressWarnings("deprecation")
    @Override
    public IBlockState getStateFromMeta(int meta){
        return this.getDefaultState().withProperty(ACTIVE, (meta & 0b0100) > 0).withProperty(BlockHorizontal.FACING, EnumFacing.byHorizontalIndex(meta & 0b0011));
    }
    
    @Override
    public int getMetaFromState(IBlockState state){
        return (state.getValue(ACTIVE) ? 0b0100 : 0b0000) | (state.getValue(BlockHorizontal.FACING).getHorizontalIndex());
    }
    
    @SuppressWarnings("deprecation")
    @Override
    public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer){
        return super.getStateForPlacement(world, pos, facing, hitX, hitY, hitZ, meta, placer).withProperty(BlockHorizontal.FACING, placer.getHorizontalFacing().getOpposite());
    }
    
    @Override
    protected BlockStateContainer createBlockState(){
        return new BlockStateContainer(this, ACTIVE, BlockHorizontal.FACING);
    }
    
    @Override
    public int getLightValue(IBlockState state, IBlockAccess world, BlockPos pos){
        return state.getValue(ACTIVE) ? 12 : 0;
    }
}
