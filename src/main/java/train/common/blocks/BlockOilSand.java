package train.common.blocks;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import traincraft.Traincraft;

public class BlockOilSand extends BlockFalling {

	public BlockOilSand() {
		super(Material.SAND);
		this.setRegistryName(Traincraft.MOD_ID, "ore_oil_sand");
		
		this.setCreativeTab(Traincraft.TAB);
		this.setHardness(3.0F);
		this.setResistance(3.0F);
		this.setSoundType(SoundType.SAND);
		this.setHarvestLevel("shovel", 1);
	}

}
