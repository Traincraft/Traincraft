package si.meansoft.traincraft.items;

import net.minecraft.item.Item;
import si.meansoft.traincraft.Traincraft;

/**
 * @author canitzp
 */
public class ItemBase extends Item{

    public ItemBase(String name){
        Traincraft.registerItem(this, name);
    }

}
