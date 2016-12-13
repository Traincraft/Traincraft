/*
 * This file ("BlockCrafter.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.blocks;

import net.minecraft.block.material.Material;
import si.meansoft.traincraft.client.gui.GuiCrafter;
import si.meansoft.traincraft.container.ContainerCrafter;
import si.meansoft.traincraft.network.GuiHandler;
import si.meansoft.traincraft.tile.crafter.TileEntityCrafterBase;
import si.meansoft.traincraft.tile.crafter.TileEntityCrafterDiesel;
import si.meansoft.traincraft.tile.crafter.TileEntityCrafterElectro;
import si.meansoft.traincraft.tile.crafter.TileEntityCrafterSteam;

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
        STEAM("crafter_steam", GuiHandler.CRAFTERSTEAM, TileEntityCrafterSteam.class),
        DIESEL("crafter_diesel", GuiHandler.CRAFTERDIESEL, TileEntityCrafterDiesel.class),
        ELECTRO("crafter_electro", GuiHandler.CRAFTERELECTRO, TileEntityCrafterElectro.class);
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
