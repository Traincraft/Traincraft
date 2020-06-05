package traincraft.blocks.distillery;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import traincraft.Traincraft;
import traincraft.blocks.BaseContainerBlock;

import java.util.Random;

public class BlockDistil extends BaseContainerBlock {

	public static final PropertyBool ACTIVE = PropertyBool.create("active");

	public BlockDistil() {
		super(Material.ROCK, TileDistillery.class);
		this.setRegistryName(Traincraft.MOD_ID, "distillery");
		
		this.setCreativeTab(Traincraft.TAB);
		this.setHardness(3.5F);
		this.setSoundType(SoundType.STONE);
		
		this.setDefaultState(this.blockState.getBaseState().withProperty(ACTIVE, false).withProperty(BlockHorizontal.FACING, EnumFacing.NORTH));
	}
	
	@Override
	public int getLightValue(IBlockState state, IBlockAccess world, BlockPos pos) {
		return state.getValue(ACTIVE) ? 12 : 0;
	}
	
	// state: ABCD => B = active; CD = facing
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(ACTIVE, (meta & 0b0100) > 0).withProperty(BlockHorizontal.FACING, EnumFacing.byHorizontalIndex(meta & 0b0011));
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		return (state.getValue(ACTIVE) ? 0b0100 : 0b0000) | (state.getValue(BlockHorizontal.FACING).getHorizontalIndex());
	}
	
	@Override
	public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
		return super.getStateForPlacement(world, pos, facing, hitX, hitY, hitZ, meta, placer).withProperty(BlockHorizontal.FACING, placer.getHorizontalFacing().getOpposite());
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, ACTIVE, BlockHorizontal.FACING);
	}
	
	// todo traincraft.blocks.distillery particle effects
	@Override
	public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random rand) {
		if(state.getValue(ACTIVE)){
			EnumFacing facing = state.getValue(BlockHorizontal.FACING);
			
		}
	}
	
	/*
	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int i, int j, int k, Random random) {
		if (this.isActive) {
			ForgeDirection side = ((TileEntityDistil) world.getTileEntity(i, j, k)).getFacing();
			float var7 = (float) i + 0.5F;
			float var8 = (float) j + 0.0F + random.nextFloat() * 6.0F / 16.0F;
			float var9 = (float) k + 0.5F;
			float var10 = 0.52F;
			float var11 = random.nextFloat() * 0.6F - 0.3F;
			for (int t = 0; t < 10; t++) {

				world.spawnParticle("mobSpellAmbient", var7, (double) j + 1F, var9, 0, 0, 0);
			}
			if (side == ForgeDirection.WEST) {
				world.spawnParticle("smoke", (double) (var7 - var10), (double) var8, (double) (var9 + var11), 0.0D, 0.0D, 0.0D);
				world.spawnParticle("flame", (double) (var7 - var10), (double) var8, (double) (var9 + var11), 0.0D, 0.0D, 0.0D);
			}
			else if (side == ForgeDirection.EAST) {
				world.spawnParticle("smoke", (double) (var7 + var10), (double) var8, (double) (var9 + var11), 0.0D, 0.0D, 0.0D);
				world.spawnParticle("flame", (double) (var7 + var10), (double) var8, (double) (var9 + var11), 0.0D, 0.0D, 0.0D);
			}
			else if (side == ForgeDirection.NORTH) {
				world.spawnParticle("smoke", (double) (var7 + var11), (double) var8, (double) (var9 - var10), 0.0D, 0.0D, 0.0D);
				world.spawnParticle("flame", (double) (var7 + var11), (double) var8, (double) (var9 - var10), 0.0D, 0.0D, 0.0D);
			}
			else if (side == ForgeDirection.SOUTH) {
				world.spawnParticle("smoke", (double) (var7 + var11), (double) var8, (double) (var9 + var10), 0.0D, 0.0D, 0.0D);
				world.spawnParticle("flame", (double) (var7 + var11), (double) var8, (double) (var9 + var10), 0.0D, 0.0D, 0.0D);
			}
		}
	}
	
	 */

}
