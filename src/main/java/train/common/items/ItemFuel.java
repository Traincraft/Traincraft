package train.common.items;

import net.minecraft.item.Item;
import train.common.Traincraft;

import java.util.ArrayList;

//Keeping this class for future uses. It is not used at the moment
public class ItemFuel extends Item {
	private ArrayList<String[]> info;

	public ItemFuel(ArrayList<String[]> list) {
		super();
		maxStackSize = 64;
		setCreativeTab(Traincraft.tcTab);
		this.info = list;
	}

	//Examples of usages:
	//ItemIDs.diesel.item = new ItemFuel(ItemIDs.diesel.itemID,new ArrayList<String[]>() {{add(new String[] {"Can produce:"}); add(new String[] {"3.0MJ/t for 200000 ticks (Combustion Engine)"}); add(new String[] {"60k heat (Liquid Fueled Firebox)"});}}).setIconIndex(ItemIDs.diesel.iconIndex);
	//ItemIDs.refinedFuel.item = new ItemFuel(ItemIDs.refinedFuel.itemID,new ArrayList<String[]>() {{add(new String[] {"Can produce:"}); add(new String[] {"6.0MJ/t for 100000 ticks (Combustion Engine)"}); add(new String[] {"96k heat (Liquid Fueled Firebox)"});}}).setIconIndex(ItemIDs.refinedFuel.iconIndex);

}