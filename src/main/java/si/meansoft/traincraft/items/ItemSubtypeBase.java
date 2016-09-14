package si.meansoft.traincraft.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import si.meansoft.traincraft.IRegistryEntry;
import si.meansoft.traincraft.network.CommonProxy;

import java.util.List;

/**
 * @author Ellpeck
 */
public class ItemSubtypeBase extends ItemBase{

    private Class<? extends Enum> subtypes;

    public ItemSubtypeBase(String name, Class<? extends Enum> subtypes){
        super(name, false);
        this.subtypes = subtypes;
        this.setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int damage){
        return damage;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack){
        if(stack.getItemDamage() >= this.subtypes.getEnumConstants().length){
            return "uwotm8";
        }
        else{
            return this.getUnlocalizedName()+this.subtypes.getEnumConstants()[stack.getItemDamage()].toString();
        }
    }

    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> list){
        for(int j = 0; j < this.subtypes.getEnumConstants().length; j++){
            list.add(new ItemStack(this, 1, j));
        }
    }

    @Override
    public void onRegister(IRegistryEntry[] otherEntries){
        for(int i = 0; i < this.subtypes.getEnumConstants().length; i++){
            String modelName = this.getRegistryName()+this.subtypes.getEnumConstants()[i].toString();
            CommonProxy.addForgeRender(new ItemStack(this, 1, i), new ModelResourceLocation(modelName, "inventory"));
        }
    }
}
