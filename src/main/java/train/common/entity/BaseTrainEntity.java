package train.common.entity;

import net.minecraft.client.gui.Gui;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.world.World;

public abstract class BaseTrainEntity extends EntityMinecart {
    
    public BaseTrainEntity(World worldIn) {
        super(worldIn);
    }
    
    public BaseTrainEntity(World worldIn, double x, double y, double z) {
        super(worldIn, x, y, z);
    }
    
    @Override
    public Type getType() {
        // this value shouldn't have any effect, since all important calls are overwritten
        return Type.RIDEABLE;
    }
    
    @Override
    public abstract boolean isPoweredCart();
    
    @Override
    public abstract boolean canBeRidden();
    
    public Gui openGui(EntityPlayer player){
        return null;
    }
    
    public Container openContainer(EntityPlayer player){
        return null;
    }
}
