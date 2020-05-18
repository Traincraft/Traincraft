package train.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import train.common.Traincraft;
import train.common.library.Info;

/**
 * This is currently a combined block for oil sand and petrolium. We should seperate this in two different blocks
 */
public class PetrolOre extends Block {

	public PetrolOre() {
		super(Material.ROCK);
		this.setRegistryName(Info.modID, "oil_sand");
		this.setCreativeTab(Traincraft.tcTab);
	}

}
