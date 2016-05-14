package si.meansoft.traincraft;

import net.minecraft.item.Item;
import si.meansoft.traincraft.items.ItemBase;

/**
 * @author canitzp
 */
public class ItemRegistry{

    public static Item plastic, fuelCanister, fuelCanisterEmpty;

    public static void preInit(){
        plastic = new ItemBase("plastic");
        fuelCanister = new ItemBase("fuelCanister");
        fuelCanisterEmpty = new ItemBase("fuelCanisterEmpty");
    }

}
