/*******************************************************************************
 * Copyright (c) 2013 Spitfire4466. All rights reserved.
 *
 * @name TrainCraft
 * @author Spitfire4466
 ******************************************************************************/

package traincraft.blocks;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import traincraft.Traincraft;
import train.common.library.GuiIDs;
import traincraft.items.ItemBlockGeneratorDiesel;
import traincraft.tile.TileDieselGenerator;

public class BlockGeneratorDiesel extends BaseContainerBlock {
	
	public static final PropertyBool ACTIVE = PropertyBool.create("active");
	
	public BlockGeneratorDiesel() {
		super(Material.IRON, TileDieselGenerator.class);
		this.setRegistryName(Traincraft.MOD_ID, "generator_diesel");
		
		this.setCreativeTab(Traincraft.TAB);
		this.setTickRandomly(true);
		this.setHardness(1.7F);
		this.setSoundType(SoundType.METAL);
		
		this.setDefaultState(this.blockState.getBaseState().withProperty(ACTIVE, false).withProperty(BlockHorizontal.FACING, EnumFacing.NORTH));
	}
	
	@Override
	public ItemBlock getItemBlock() {
		return new ItemBlockGeneratorDiesel();
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
	
	/**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
	/* todo add redstone detection for tile base
	@Override
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, Block par5)
    {
        boolean flag = par1World.isBlockIndirectlyGettingPowered(par2, par3, par4);
        TileGeneratorDiesel tile = (TileGeneratorDiesel)par1World.getTileEntity(par2, par3, par4);

        if (tile != null)
        {
            tile.powered = flag;
        }
    }
    
	 */
	
	/* todo particles for disel generator
	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(World world, int par2, int par3, int par4, Random rand) {
		int l = world.getBlockMetadata(par2, par3, par4);
		TileEntity tile = world.getTileEntity(par2, par3, par4);
		if(tile !=null && tile instanceof TileGeneratorDiesel && ((TileGeneratorDiesel)tile).currentBurnTime > 0){
			double d0 = (double) ((float) par2 + 0.5F);
			double d2 = (double) ((float) par4 + 0.5F);
			double d3 = 1.67D;
			//System.out.println(l+" "+par1World.isRemote);
			switch(l){
			case 0:
				for(int i=0;i<40;i++){
					world.spawnParticle("smoke", d0+0.2, par3 + d3, d2-0.42, 0.0D, 0.0D, 0.0D);
				}
				break;
			case 1:
				for(int i=0;i<40;i++){
					world.spawnParticle("smoke", d0+0.42, par3 + d3, d2+0.2, 0.0D, 0.0D, 0.0D);
				}
				break;
			case 2:
				for(int i=0;i<40;i++){
					world.spawnParticle("smoke", d0-0.2, par3 + d3, d2+0.42, 0.0D, 0.0D, 0.0D);
				}
				break;
			case 3:
				for(int i=0;i<40;i++){
					world.spawnParticle("smoke", d0-0.42, par3 + d3, d2-0.2, 0.0D, 0.0D, 0.0D);
				}
				break;
			default:
				break;
			}
			//world.spawnParticle("flame", d0, par3 + d3, d2, 0.0D, 0.0D, 0.0D);
		}
	}
	 */
	
}