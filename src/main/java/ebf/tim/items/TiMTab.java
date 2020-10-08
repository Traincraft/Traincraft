package ebf.tim.items;

import ebf.tim.registry.TiMGenericRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;

/**
 * <h1>Creative tab</h1>
 * defines the creative tab's information.
 * @author Eternal Blue Flame
 */
public class TiMTab extends CreativeTabs {
    public Item tabItem;

    /**instances the tab by handling it through the super.*/
    public TiMTab(String name, String MODID, String textureName) {
        super(CreativeTabs.getNextID(), name);
        tabItem= TiMGenericRegistry.RegisterItem(new Item(),MODID,textureName,null);
    }
    public TiMTab(String name, Item tabItem) {
        super(CreativeTabs.getNextID(), name);
        this.tabItem= tabItem;
    }
    /**returns the label of the tab, this is defined in the language files,*/
    @Override
    public String getTranslatedTabLabel() {
        return StatCollector.translateToLocal(tabItem.getUnlocalizedName());
    }
    /**the icon for the tab. don't override this one*/
    @Override
    public Item getTabIconItem(){return getTabItem();}

    /**the icon for the tab. override this one*/
    public Item getTabItem(){return tabItem;}
}
