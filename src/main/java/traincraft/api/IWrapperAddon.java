package traincraft.api;

import com.google.gson.JsonObject;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;

import java.io.File;

public interface IWrapperAddon<T extends AbstractRollingStock<?>> {
    
    T createEntity(World world);
    
    T createEntity(World world, double x, double y, double z);

    Item createItem();
    
    void loadFromFile(Side side, File file, JsonObject root);
    
    ResourceLocation getId();
    
}
