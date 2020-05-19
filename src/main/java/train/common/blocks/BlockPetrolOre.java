package train.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import train.common.Traincraft;

public class BlockPetrolOre extends Block {

	public BlockPetrolOre() {
		super(Material.ROCK);
		this.setRegistryName(Traincraft.MOD_ID, "petrol_ore");
		
		this.setCreativeTab(Traincraft.TAB);
		this.setHardness(3.0F);
		this.setResistance(5F);
		this.setSoundType(SoundType.STONE);
		this.setHarvestLevel("pickaxe", 1);
	}

}
