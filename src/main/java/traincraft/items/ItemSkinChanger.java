package traincraft.items;

public class ItemSkinChanger extends BaseItem {
    
    public ItemSkinChanger() {
        super("skin_changer", item -> {
            item.setMaxStackSize(1);
        });
    }
}
