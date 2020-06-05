package traincraft.blocks;

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
import traincraft.tile.TileTrainWorkbench;

public class BlockTrainWorkbench extends BaseContainerBlock {

	public BlockTrainWorkbench() {
		super(Material.WOOD, TileTrainWorkbench.class);
		this.setRegistryName(Traincraft.MOD_ID, "train_workbench");
		
		this.setCreativeTab(Traincraft.TAB);
		this.setHardness(1.7F);
		this.setSoundType(SoundType.WOOD);
		this.setHarvestLevel("axe", 0);
	}

}