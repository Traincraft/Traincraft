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
import traincraft.tile.TileAssemblyTableIII;

public class BlockAssemblyTableIII extends BaseContainerBlock {

	public BlockAssemblyTableIII() {
		super(Material.ROCK, TileAssemblyTableIII.class);
		this.setRegistryName(Traincraft.MOD_ID, "assembly_table_3");
		
		this.setCreativeTab(Traincraft.TAB);
		this.setHardness(3.5F);
		this.setSoundType(SoundType.STONE);
		this.setHarvestLevel("pickaxe", 0);
	}

}