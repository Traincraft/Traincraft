/*
 * This file ("ItemBase.java") is part of the Traincraft mod for Minecraft.
 * It is created by all persons that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.items;

import net.minecraft.item.Item;
import si.meansoft.traincraft.IRegistryEntry;
import si.meansoft.traincraft.Traincraft;
import si.meansoft.traincraft.network.CommonProxy;

/**
 * @author canitzp
 */
public class ItemBase extends Item implements IRegistryEntry{

    private String name;

    public ItemBase(String name, boolean defaultRenderer){
        this.name = name;
        this.setCreativeTab(Traincraft.generalTab);
        this.setUnlocalizedName(Traincraft.MODID + "." + name);
    }

    @Override
    public IRegistryEntry[] getRegisterElements(){
        return new IRegistryEntry[]{this};
    }

    @Override
    public String getRegisterName(){
        return this.name;
    }

    @Override
    public void onRegister(IRegistryEntry[] otherEntries){
        CommonProxy.addForgeRender(this);
    }

    @Override
    public void ownRegistry(){

    }
}
