package train.common.items;

import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.blocks.TCBlocks;

import javax.annotation.Nullable;
import java.util.List;

public class ItemBlockGeneratorWaterWheel extends BaseItemBlock{

	public ItemBlockGeneratorWaterWheel() {
		super(TCBlocks.WATER_WHEEL);
	}
	
	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("\u00a77" + "RF generator.");
		tooltip.add("\u00a77" + "Max Production: 5 RF/t.");
		tooltip.add("\u00a77" + "Output at the sides.");
		tooltip.add("\u00a77" + "Orients itself automatically");
		tooltip.add("\u00a77" + "according to water flow direction.");
	}
	
}
