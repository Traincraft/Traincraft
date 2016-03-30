package src.train.common.items;

import ic2.api.item.IBoxable;

import java.util.ArrayList;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import src.train.common.Traincraft;

//Keeping this class for future uses. It is not used at the moment
public class ItemFuel extends Item implements IBoxable {
	private ArrayList<String[]> info;

	public ItemFuel(int i, ArrayList<String[]> list) {
		super(i);
		maxStackSize = 64;
		setCreativeTab(Traincraft.tcTab);
		this.info = list;
	}

	//Examples of usages:
	//ItemIDs.diesel.item = new ItemFuel(ItemIDs.diesel.itemID,new ArrayList<String[]>() {{add(new String[] {"Can produce:"}); add(new String[] {"3.0MJ/t for 200000 ticks (Combustion Engine)"}); add(new String[] {"60k heat (Liquid Fueled Firebox)"});}}).setIconIndex(ItemIDs.diesel.iconIndex);
	//ItemIDs.refinedFuel.item = new ItemFuel(ItemIDs.refinedFuel.itemID,new ArrayList<String[]>() {{add(new String[] {"Can produce:"}); add(new String[] {"6.0MJ/t for 100000 ticks (Combustion Engine)"}); add(new String[] {"96k heat (Liquid Fueled Firebox)"});}}).setIconIndex(ItemIDs.refinedFuel.iconIndex);
	@Override
	public boolean canBeStoredInToolbox(ItemStack itemstack) {
		return true;
	}
}