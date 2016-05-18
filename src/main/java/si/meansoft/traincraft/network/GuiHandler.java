package si.meansoft.traincraft.network;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import org.apache.commons.lang3.tuple.Pair;

import java.util.HashMap;

/**
 * @author canitzp
 */
public class GuiHandler implements IGuiHandler {

    public static final int DISTILLERY = 0, CRAFTERSTEAM = 2, CRAFTERDIESEL = 3, CRAFTERELECTRO = 4;
    public static final int HEARTH_FURNACE = 5;
    public static HashMap<Integer, Pair<Class<? extends GuiContainer>, Class<? extends Container>>> guiConMap = new HashMap<Integer, Pair<Class<? extends GuiContainer>, Class<? extends Container>>>();

    public static void addGuiContainerDepend(int id, Class<? extends GuiContainer> gui, Class<? extends Container> container){
        guiConMap.put(id, Pair.of(gui, container));
    }

    public static GuiContainer getGui(int id, EntityPlayer player, TileEntity tile){
        if(guiConMap.containsKey(id)){
            try {
                Container c = getContainer(id, player, tile);
                return guiConMap.get(id).getKey().getConstructor(Container.class, EntityPlayer.class, TileEntity.class).newInstance(c, player, tile);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static Container getContainer(int id, EntityPlayer player, TileEntity tile){
        if(guiConMap.containsKey(id)){
            try {
                return guiConMap.get(id).getValue().getConstructor(EntityPlayer.class, TileEntity.class).newInstance(player, tile);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return getGui(ID, player, world.getTileEntity(new BlockPos(x, y, z)));
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return getContainer(ID, player, world.getTileEntity(new BlockPos(x, y, z)));
    }
}
