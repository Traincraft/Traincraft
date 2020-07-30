/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("BaseItem.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import traincraft.Traincraft;

import java.util.function.Consumer;

/**
 * @author canitzp
 */
public class BaseItem extends Item {
    
    public BaseItem(String name){
        this(name, baseItem -> {});
    }
    
    public BaseItem(String name, Consumer<BaseItem> itemAction){
        this.setRegistryName(Traincraft.MOD_ID, name);
        this.setTranslationKey(this.getRegistryName().toString());
        
        this.setCreativeTab(Traincraft.TAB);
        
        itemAction.accept(this);
    }
    
    public void registerModel(){
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(this.getRegistryName(), "inventory"));
    }
    
}
