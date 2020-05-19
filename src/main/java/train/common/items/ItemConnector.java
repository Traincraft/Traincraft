package train.common.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemConnector extends BaseItem {

	public ItemConnector() {
		super("connector");
		
		this.maxStackSize = 1;
		this.setMaxDamage(200);
	}

	@Override
	public boolean isFull3D() {
		return true;
	}

	@Override
	public boolean shouldRotateAroundWhenRendering() {
		return true;
	}
	
	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("\u00a77" + "Right click on a rolling stock");
		tooltip.add("\u00a77" + " to enter attaching mode.");
		tooltip.add("\u00a77" + "Click a few time to reset links.");
		tooltip.add("\u00a77" + "Sneak+Right click on a locomotive");
		tooltip.add("\u00a77" + " to set mode: 'Can pull/Can be pulled'");
	}
	
}