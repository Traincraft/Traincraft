package train.common.blocks;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import train.common.Traincraft;
import train.common.library.Info;

/**
 * This is a combined block for all ores. We should seperate them!
 */
public class OilSandOre extends BlockFalling {

	public OilSandOre() {
		super(Material.ROCK);
		this.setRegistryName(Info.modID, "ore_oil_sand");
		this.setCreativeTab(Traincraft.tcTab);
	}

}
