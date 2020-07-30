/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("CustomEntityEntry.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.api;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.EntityEntry;

public class CustomEntityEntry<T extends AbstractRollingStock<T>> extends EntityEntry {
    
    private final WrapperRollingStock wrapper;
    
    public CustomEntityEntry(WrapperRollingStock wrapper, String name){
        super(WrapperRollingStock.WrapperRollingStockEntityImpl.class, name);
        this.wrapper = wrapper;
        this.setRegistryName(wrapper.getId());
    }
    
    @Override
    protected void init(){
    }
    
    @Override
    public Entity newInstance(World world){
        return this.wrapper.createEntity(world);
    }
}
