package train.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import train.common.Traincraft;
import traincraft.tile.TileWaterWheel;

import javax.annotation.Nullable;

public class BlockWaterWheel extends Block {

	public BlockWaterWheel() {
		super(Material.WOOD);
		this.setRegistryName(Traincraft.MOD_ID, "water_wheel");
		
		this.setCreativeTab(Traincraft.TAB);
		this.setTickRandomly(true);
		this.setHardness(1.7F);
		this.setSoundType(SoundType.WOOD);
		this.setHarvestLevel("axe", 0);
		
		this.setDefaultState(this.getBlockState().getBaseState().withProperty(BlockDirectional.FACING, EnumFacing.NORTH));
	}
	
	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}
	
	@Nullable
	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileWaterWheel();
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
	
	// state: ABCD => CD = facing
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(BlockDirectional.FACING, EnumFacing.byHorizontalIndex(meta & 0b0011));
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(BlockDirectional.FACING).getHorizontalIndex();
	}
	
	@Override
	public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
		return super.getStateForPlacement(world, pos, facing, hitX, hitY, hitZ, meta, placer).withProperty(BlockDirectional.FACING, placer.getHorizontalFacing().getOpposite());
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, BlockDirectional.FACING);
	}
}
