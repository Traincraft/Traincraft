/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("BlockDistil.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.blocks.distillery;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import traincraft.Traincraft;
import traincraft.blocks.BaseContainerBlock;

import javax.annotation.Nonnull;
import java.util.Random;

public class BlockDistil extends BaseContainerBlock {
    
    public static final PropertyBool ACTIVE = PropertyBool.create("active");
    
    public BlockDistil(){
        super(Material.ROCK, TileDistillery.class);
        this.setRegistryName(Traincraft.MOD_ID, "distillery");
        
        this.setCreativeTab(Traincraft.TAB);
        this.setHardness(3.5F);
        this.setSoundType(SoundType.STONE);
        
        this.setDefaultState(this.blockState.getBaseState().withProperty(ACTIVE, false).withProperty(BlockHorizontal.FACING, EnumFacing.NORTH));
    }
    
    // state: ABCD => B = active; CD = facing
    @SuppressWarnings("deprecation")
    @Nonnull
    @Override
    public IBlockState getStateFromMeta(int meta){
        return this.getDefaultState().withProperty(ACTIVE, (meta & 0b0100) > 0).withProperty(BlockHorizontal.FACING, EnumFacing.byHorizontalIndex(meta & 0b0011));
    }
    
    @Override
    public int getMetaFromState(IBlockState state){
        return (state.getValue(ACTIVE) ? 0b0100 : 0b0000) | (state.getValue(BlockHorizontal.FACING).getHorizontalIndex());
    }
    
    @Override
    public void randomDisplayTick(IBlockState state, @Nonnull World world, @Nonnull BlockPos pos, @Nonnull Random rand){
        if(state.getValue(ACTIVE)){
            float x = pos.getX() + 0.5F;
            float y = pos.getY() + rand.nextFloat() * 6F / 16F;
            float z = pos.getZ() + 0.5F;
            float randOffset = rand.nextFloat() * 0.6F - 0.3F;
            
            for(int t = 0; t < 10; t++){
                world.spawnParticle(EnumParticleTypes.SPELL_MOB_AMBIENT, x, y + 1F, z, 0, 0, 0);
            }
            
            switch(state.getValue(BlockHorizontal.FACING)){
                case NORTH:{
                    world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, x + randOffset, y, z - 0.52F, 0.0D, 0.0D, 0.0D);
                    world.spawnParticle(EnumParticleTypes.FLAME, x + randOffset, y, z - 0.52F, 0.0D, 0.0D, 0.0D);
                    break;
                }
                case EAST:{
                    world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, x + 0.52F, y, z + randOffset, 0.0D, 0.0D, 0.0D);
                    world.spawnParticle(EnumParticleTypes.FLAME, x + 0.52F, y, z + randOffset, 0.0D, 0.0D, 0.0D);
                    break;
                }
                case SOUTH:{
                    world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, x + randOffset, y, z + 0.52F, 0.0D, 0.0D, 0.0D);
                    world.spawnParticle(EnumParticleTypes.FLAME, x + randOffset, y, z + 0.52F, 0.0D, 0.0D, 0.0D);
                    break;
                }
                case WEST:{
                    world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, x - 0.52F, y, z + randOffset, 0.0D, 0.0D, 0.0D);
                    world.spawnParticle(EnumParticleTypes.FLAME, x - 0.52F, y, z + randOffset, 0.0D, 0.0D, 0.0D);
                    break;
                }
            }
        }
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
        return new BlockStateContainer(this, ACTIVE, BlockHorizontal.FACING);
    }
    
    @Override
    public int getLightValue(IBlockState state, @Nonnull IBlockAccess world, @Nonnull BlockPos pos){
        return state.getValue(ACTIVE) ? 12 : 0;
    }
    
}
