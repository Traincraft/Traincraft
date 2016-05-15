package si.meansoft.traincraft;

import net.minecraft.item.Item;
import si.meansoft.traincraft.items.ItemMaterial;

/**
 * @author canitzp
 */
public class ItemRegistry{

    public static Item material;

    public static void preInit(){
        material = new ItemMaterial();
    }

}
