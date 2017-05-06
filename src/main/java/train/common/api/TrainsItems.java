package train.common.api;

import net.minecraft.item.ItemStack;

import java.util.Map;
import java.util.TreeMap;

/**
 * This class contains a registry of all currently active Trains mod items. Which items are registered depends on the user's settings in "TrainConfig.cfg", so the available items may vary from one installation to the next.
 * 
 * Initialization of the registry will occur during the BaseMod.load() function. It is strongly recommended you wait until the BaseMod.modsLoaded() function to reference the registry.
 * 
 * @author CovertJaguar <railcraft.wikispaces.com>
 * 
 * Modified by Spitfire4466 under authorization of CovertJaguar
 */
public class TrainsItems {

	private static final Map<String, ItemStack> registry = new TreeMap<String, ItemStack>();

	/**
	 * This function will return an ItemStack containing the item that corresponds to the provided tag.
	 * 
	 * Generally item tags will correspond to the tags used in "TrainConfig.cfg", but there will be some exceptions.
	 * 
	 * This function can and will return null for just about every item if the item is disabled via the configuration files. You must test the return value for safety.
	 * 
	 * For list of available tags see the printItemTags() function.
	 * 
	 * @param tag The item tag
	 * @param qty The stackSize of the returned item
	 * @return The ItemStack or null if no item exists for that tag
	 */
	public ItemStack getItem(String tag, int qty) {
		ItemStack stack = registry.get(tag);
		if (stack != null) {
			stack = stack.copy();
			stack.stackSize = qty;
		}
		return stack;
	}

	/**
	 * Registers a new item with the Registry.
	 * 
	 * This should generally only be called by the mod itself while the mod is initializing during the Train.load() call.
	 * 
	 * @param tag The tag name
	 * @param item The item
	 */
	public static void registerItem(String tag, ItemStack item) {
		registry.put(tag, item);
	}

	/**
	 * This function will print a list of all currently registered items to the console.
	 * 
	 * Use this for development purposes.
	 */
	public static void printItemTags() {
		System.out.println();
		System.out.println("Printing all registered Train mod items:");
		for (String tag : registry.keySet()) {
			System.out.println(tag);
		}
		System.out.println();
	}
}
