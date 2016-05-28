package train.common.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockOreTC extends ItemBlock {

	private final static String[] subNames = { "copperOre", "oilSands", "petroleum", "ballast" };

	public ItemBlockOreTC(Block id) {
		super(id);
		setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int damageValue) {
		return damageValue;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		if(itemstack.getItemDamage()<subNames.length){
			return super.getUnlocalizedName() + "." + subNames[itemstack.getItemDamage()];
		}else{
			return super.getUnlocalizedName() + "." + "";
		}
	}
}
