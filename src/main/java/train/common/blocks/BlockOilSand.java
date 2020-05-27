package train.common.blocks;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import traincraft.Traincraft;
import traincraft.items.BaseItemBlock;

public class BlockOilSand extends BlockFalling implements IItemBlockSupplier {

	public BlockOilSand() {
		super(Material.SAND);
		this.setRegistryName(Traincraft.MOD_ID, "ore_oil_sand");
		
		this.setCreativeTab(Traincraft.TAB);
		this.setHardness(3.0F);
		this.setResistance(3.0F);
		this.setSoundType(SoundType.SAND);
		this.setHarvestLevel("shovel", 1);
	}
	
	@Override
	public ItemBlock getItemBlock() {
		return new BaseItemBlock(this);
	}
}
