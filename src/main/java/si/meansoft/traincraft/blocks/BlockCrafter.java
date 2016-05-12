package si.meansoft.traincraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;
import si.meansoft.traincraft.container.ContainerCrafterSteam;
import si.meansoft.traincraft.gui.GuiCrafterSteam;
import si.meansoft.traincraft.network.GuiHandler;
import si.meansoft.traincraft.tileEntities.TileEntityCrafterSteam;

/**
 * @author canitzp
 */
public class BlockCrafter extends BlockContainerBase {

    public CrafterTier tier;

    public BlockCrafter(CrafterTier tier) {
        super(Material.ANVIL, tier.name, tier.tileEntity, RenderType.FORGEJSON);
        this.tier = tier;
        addGuiContainer(tier.guiID, tier.guiClass, tier.containerClass);
    }

    public enum CrafterTier{
        STEAM("crafterSteam", TileEntityCrafterSteam.class, GuiHandler.CRAFTERSTEAM, GuiCrafterSteam.class, ContainerCrafterSteam.class),
        DIESEL("crafterDiesel", null, GuiHandler.CRAFTERDIESEL, null, null),
        ELECTRO("crafterElectro", null, GuiHandler.CRAFTERELECTRO, null, null);
        public String name;
        public int guiID;
        public Class<? extends TileEntity> tileEntity;
        public Class<? extends GuiContainer> guiClass;
        public Class<? extends Container> containerClass;
        CrafterTier(String name, Class<? extends TileEntity> tileEntity, int guiID, Class<? extends GuiContainer> gui, Class<? extends Container> con) {
            this.name = name;
            this.tileEntity = tileEntity;
            this.guiID = guiID;
            this.guiClass = gui;
            this.containerClass = con;
        }
    }

}
