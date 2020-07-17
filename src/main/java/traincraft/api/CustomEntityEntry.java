package traincraft.api;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.EntityEntry;

public class CustomEntityEntry<T extends AbstractRollingStock<T>> extends EntityEntry {
    
    private WrapperRollingStock wrapper;
    
    public CustomEntityEntry(WrapperRollingStock wrapper, String name) {
        super(WrapperRollingStock.WrapperRollingStockEntityImpl.class, name);
        this.wrapper = wrapper;
        this.setRegistryName(wrapper.getId());
    }
    
    @Override
    protected void init() {}
    
    @Override
    public Entity newInstance(World world) {
        return this.wrapper.createEntity(world);
    }
}
