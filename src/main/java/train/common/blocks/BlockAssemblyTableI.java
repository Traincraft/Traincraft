package train.common.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import traincraft.Traincraft;
import train.common.library.GuiIDs;
import traincraft.tile.TileAssemblyTableI;

public class BlockAssemblyTableI extends BaseContainerBlock {

	public BlockAssemblyTableI() {
		super(Material.WOOD);
		this.setRegistryName(Traincraft.MOD_ID, "assembly_table_1");
		
		this.setCreativeTab(Traincraft.TAB);
		this.setHardness(3.5F);
		this.setSoundType(SoundType.WOOD);
		this.setHarvestLevel("axe", 0);
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			if (!player.isSneaking()) {
				TileEntity te = world.getTileEntity(pos);
				if (te instanceof TileAssemblyTableI) {
					player.openGui(Traincraft.instance, GuiIDs.CRAFTER_TIER_I, world, pos.getX(), pos.getY(), pos.getZ());
				}
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileAssemblyTableI();
	}

}