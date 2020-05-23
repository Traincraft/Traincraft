package train.common.blocks;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import train.common.Traincraft;

/**
 * In 1.7 this block needed a tile entity, but we can change this with properties
 */
public class BlockSwitchStand extends Block {

	public static final PropertyBool ACTIVE = PropertyBool.create("active");
	
	public BlockSwitchStand() {
		super(Material.IRON);
		this.setRegistryName(Traincraft.MOD_ID, "switch_stand");
		
		this.setCreativeTab(Traincraft.TAB);
		this.setHardness(1.7F);
		this.setSoundType(SoundType.METAL);
		
		this.setDefaultState(this.getBlockState().getBaseState().withProperty(ACTIVE, false).withProperty(BlockDirectional.FACING, EnumFacing.NORTH));
	}
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.MODEL;
	}
	
	@Override
	public boolean isFullBlock(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
		// empty
	}
	
	@Override
	public int getWeakPower(IBlockState state, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
		return state.getValue(ACTIVE) ? 15 : 0;
	}
	
	@Override
	public int getStrongPower(IBlockState state, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
		return state.getValue(ACTIVE) ? 15 : 0;
	}
	
	@Override
	public boolean canProvidePower(IBlockState state) {
		return true;
	}
	
	// state: ABCD => B = active; CD = facing
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(ACTIVE, (meta & 0b0100) > 0).withProperty(BlockDirectional.FACING, EnumFacing.byHorizontalIndex(meta & 0b0011));
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		return (state.getValue(ACTIVE) ? 0b0100 : 0b0000) | (state.getValue(BlockDirectional.FACING).getHorizontalIndex());
	}
	
	@Override
	public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
		return super.getStateForPlacement(world, pos, facing, hitX, hitY, hitZ, meta, placer).withProperty(BlockDirectional.FACING, placer.getHorizontalFacing().getOpposite());
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, ACTIVE, BlockDirectional.FACING);
	}
	
}