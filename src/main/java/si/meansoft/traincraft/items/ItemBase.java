package si.meansoft.traincraft.items;

import net.minecraft.item.Item;
import si.meansoft.traincraft.Traincraft;

/**
 * @author canitzp
 */
public class ItemBase extends Item{

    public ItemBase(String name){
        this(name, true);
    }

    public ItemBase(String name, boolean defaultRenderer){
        Traincraft.registerItem(this, name, defaultRenderer);
    }

}
