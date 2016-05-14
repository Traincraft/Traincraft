package si.meansoft.traincraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import si.meansoft.traincraft.container.ContainerCrafter;
import si.meansoft.traincraft.gui.GuiCrafter;
import si.meansoft.traincraft.network.GuiHandler;
import si.meansoft.traincraft.tileEntities.TileEntityCrafter;

/**
 * @author canitzp
 */
public class BlockCrafter extends BlockContainerBase {

    public CrafterTier tier;

    public BlockCrafter(CrafterTier tier) {
        super(Material.ANVIL, tier.name, TileEntityCrafter.class, RenderType.FORGEJSON);
        this.tier = tier;
        addGuiContainer(tier.guiID, GuiCrafter.class, ContainerCrafter.class);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        try {
            return tileClass.getConstructor(CrafterTier.class).newInstance(this.tier);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public enum CrafterTier{
        STEAM("crafterSteam", GuiHandler.CRAFTERSTEAM),
        DIESEL("crafterDiesel", GuiHandler.CRAFTERDIESEL),
        ELECTRO("crafterElectro", GuiHandler.CRAFTERELECTRO);
        public String name;
        public int guiID;
        CrafterTier(String name, int guiID) {
            this.name = name;
            this.guiID = guiID;
        }
        public static CrafterTier getTierFromInt(int tier){
            switch(tier){
                case 1: return STEAM;
                case 2: return DIESEL;
                case 3: return ELECTRO;
            }
            return null;
        }
        public int getID(){
            switch(this){
                case STEAM: return 1;
                case DIESEL: return 2;
                case ELECTRO: return 3;
            }
            return 0;
        }
    }

}
