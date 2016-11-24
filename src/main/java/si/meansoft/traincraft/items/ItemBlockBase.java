/*
 * This file ("ItemBlockBase.java") is part of the Traincraft mod for Minecraft.
 * It is created by all persons that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import si.meansoft.traincraft.IRegistryEntry;
import si.meansoft.traincraft.network.CommonProxy;

/**
 * @author canitzp
 */
public class ItemBlockBase extends ItemBlock implements IRegistryEntry{

    public ItemBlockBase(Block block){
        super(block);
    }

    @Override
    public IRegistryEntry[] getRegisterElements(){
        return new IRegistryEntry[]{this};
    }

    @Override
    public String getRegisterName(){
        return this.block.getRegistryName().getResourcePath();
    }

    @Override
    public void onRegister(IRegistryEntry[] otherEntries){
        CommonProxy.addForgeRender(this);
    }

    @Override
    public void ownRegistry(){

    }

}
