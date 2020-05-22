package traincraft.items;

import net.minecraft.item.Item;
import train.common.Traincraft;

import java.util.function.Consumer;

/**
 * @author canitzp
 */
public class BaseItem extends Item{
    
    public BaseItem(String name){
        this(name, baseItem -> {});
    }
    
    public BaseItem(String name, Consumer<BaseItem> itemAction){
        this.setRegistryName(Traincraft.MOD_ID, name);
        
        this.setCreativeTab(Traincraft.TAB);
        
        itemAction.accept(this);
    }

}
