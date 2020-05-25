package train.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import traincraft.Traincraft;

public class BlockCopperOre extends Block {

	public BlockCopperOre() {
		super(Material.ROCK);
		this.setRegistryName(Traincraft.MOD_ID, "copper_ore");
		
		this.setCreativeTab(Traincraft.TAB);
		this.setHardness(3.0F);
		this.setResistance(5F);
		this.setSoundType(SoundType.STONE);
		this.setHarvestLevel("pickaxe", 1);
	}

}
