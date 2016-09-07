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
    public String getName(){
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
