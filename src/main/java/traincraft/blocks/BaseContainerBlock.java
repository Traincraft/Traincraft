/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("BaseContainerBlock.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import traincraft.items.BaseItemBlock;
import traincraft.network.GuiHandler;
import traincraft.tile.BaseTile;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class BaseContainerBlock extends BlockContainer implements IItemBlockSupplier {
    
    private final Class<? extends BaseTile> tileClass;
    
    protected BaseContainerBlock(Material materialIn, Class<? extends BaseTile> tileClass){
        super(materialIn);
        this.tileClass = tileClass;
    }
    
    protected BaseContainerBlock(Material materialIn, MapColor color, Class<? extends BaseTile> tileClass){
        super(materialIn, color);
        this.tileClass = tileClass;
    }
    
    @Override
    public EnumBlockRenderType getRenderType(IBlockState state){
        return EnumBlockRenderType.MODEL;
    }
    
    @Override
    public void breakBlock(World world, BlockPos pos, IBlockState state){
        TileEntity tile = world.getTileEntity(pos);
        if(tile instanceof BaseTile){
            ((BaseTile) tile).onBlockBreak(state);
        }
        super.breakBlock(world, pos, state);
    }
    
    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
        if(player.isSneaking()){
            return false;
        }
        TileEntity te = world.getTileEntity(pos);
        if(te instanceof BaseTile){
            if(((BaseTile) te).hasGui()){
                if(!world.isRemote){
                    GuiHandler.openTileGui(player, te);
                }
                return true;
            } else{
                return ((BaseTile) te).onBlockInteraction(player, hand, facing, hitX, hitY, hitZ);
            }
        }
        return false;
    }
    
    @Override
    public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack){
        TileEntity tile = world.getTileEntity(pos);
        if(tile instanceof BaseTile){
            ((BaseTile) tile).onBlockPlacedBy(placer, stack);
        }
    }
    
    @Override
    public String getTranslationKey(){
        return this.getRegistryName().toString();
    }
    
    @Override
    public void onNeighborChange(@Nonnull IBlockAccess world, @Nonnull BlockPos pos, @Nonnull BlockPos neighbor){
        TileEntity tile = world.getTileEntity(pos);
        if(tile instanceof BaseTile){
            for(EnumFacing facing : EnumFacing.VALUES){
                if(neighbor.offset(facing).equals(pos)){
                    ((BaseTile) tile).onNeighborChange(neighbor, facing);
                    break;
                }
            }
        }
    }
    
    @Override
    public ItemBlock getItemBlock(){
        return new BaseItemBlock(this);
    }
    
    @Nullable
    @Override
    public TileEntity createNewTileEntity(World world, int meta){
        try{
            return this.tileClass.newInstance();
        } catch(IllegalAccessException | InstantiationException e){
            e.printStackTrace();
        }
        return null;
    }
    
    public Class<? extends BaseTile> getTileClass(){
        return tileClass;
    }
}
