package si.meansoft.traincraft.blocks;

import net.minecraft.block.material.Material;
import si.meansoft.traincraft.container.ContainerCrafter;
import si.meansoft.traincraft.gui.GuiCrafter;
import si.meansoft.traincraft.network.GuiHandler;
import si.meansoft.traincraft.tileEntities.crafter.TileEntityCrafterBase;
import si.meansoft.traincraft.tileEntities.crafter.TileEntityCrafterDiesel;
import si.meansoft.traincraft.tileEntities.crafter.TileEntityCrafterElectro;
import si.meansoft.traincraft.tileEntities.crafter.TileEntityCrafterSteam;

/**
 * @author canitzp
 */
public class BlockCrafter extends BlockContainerBase {

    public CrafterTier tier;

    public BlockCrafter(CrafterTier tier) {
        super(Material.ANVIL, tier.name, tier.tileClass);
        this.tier = tier;
        addGuiContainer(tier.guiID, GuiCrafter.class, ContainerCrafter.class);
    }

    public enum CrafterTier{
        STEAM("crafterSteam", GuiHandler.CRAFTERSTEAM, TileEntityCrafterSteam.class),
        DIESEL("crafterDiesel", GuiHandler.CRAFTERDIESEL, TileEntityCrafterDiesel.class),
        ELECTRO("crafterElectro", GuiHandler.CRAFTERELECTRO, TileEntityCrafterElectro.class);
        public String name;
        public int guiID;
        public Class<? extends TileEntityCrafterBase> tileClass;
        CrafterTier(String name, int guiID, Class<? extends TileEntityCrafterBase> tileClass) {
            this.name = name;
            this.guiID = guiID;
            this.tileClass = tileClass;
        }
    }

}
