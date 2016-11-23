/*
 * This file ("BlockContainerBase.java") is part of the Traincraft mod for Minecraft.
 * It is created by all persons that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/LICENSE.MD)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.blocks;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.apache.commons.lang3.ArrayUtils;
import si.meansoft.traincraft.IRegistryEntry;
import si.meansoft.traincraft.Traincraft;
import si.meansoft.traincraft.network.GuiHandler;
import si.meansoft.traincraft.tile.TileEntityBase;

/**
 * @author canitzp
 */
public class BlockContainerBase extends BlockBase implements ITileEntityProvider{

    protected Class<? extends TileEntityBase> tileClass;
    protected int guiId = -1;
    public static final PropertyDirection FACING = BlockHorizontal.FACING;

    public BlockContainerBase(Material materialIn, String name, Class<? extends TileEntityBase> tileClass) {
        super(materialIn, name);
        this.isBlockContainer = true;
        this.tileClass = tileClass;
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

    public BlockContainerBase addGuiContainer(int id, Class<? extends GuiContainer> gui, Class<? extends Container> con){
        GuiHandler.addGuiContainerDepend(id, gui, con);
        this.guiId = id;
        return this;
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
        if(guiId >= 0){
            if(!worldIn.isRemote){
                playerIn.openGui(Traincraft.INSTANCE, guiId, worldIn, pos.getX(), pos.getY(), pos.getZ());
            }
            return true;
        } else {
            return super.onBlockActivated(worldIn, pos, state, playerIn, hand, side, hitX, hitY, hitZ);
        }
    }

    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        super.breakBlock(worldIn, pos, state);
        worldIn.removeTileEntity(pos);
    }

    public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int id, int param){
        super.eventReceived(state, worldIn, pos, id, param);
        TileEntity tileentity = worldIn.getTileEntity(pos);
        return tileentity != null && tileentity.receiveClientEvent(id, param);
    }

    @Override
    public TileEntityBase createNewTileEntity(World worldIn, int meta) {
        try {
            return tileClass.newInstance();
        } catch (Exception e) {
            Traincraft.logger.fatal("Creating a TileEntity threw an exception!", e);
            return null;
        }
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(FACING).getHorizontalIndex();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, FACING);
    }

    @Override
    public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer, EnumHand hand) {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }

    @Override
    public IRegistryEntry[] getRegisterElements(){
        return ArrayUtils.addAll(super.getRegisterElements(), createNewTileEntity(null, 0));
    }
}
