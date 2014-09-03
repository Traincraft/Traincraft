/*
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 */

package si.meansoft.traincraft.client.core;

import cpw.mods.fml.client.IModGuiFactory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import si.meansoft.meancore.client.gui.GuiConfigMC;

import java.util.Set;

public class GuiFactory implements IModGuiFactory {
    @Override
    public void initialize(Minecraft minecraftInstance) {}

    @Override
    public Class<? extends GuiScreen> mainConfigGuiClass() {
        return GuiConfigMC.class;
    }

    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
        return null;
    }

    @Override
    public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) {
        return null;
    }
}
