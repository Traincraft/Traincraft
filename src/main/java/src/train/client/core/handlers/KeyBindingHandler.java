/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package src.train.client.core.handlers;

import java.util.EnumSet;

import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.client.settings.KeyBinding;
import src.train.client.core.helpers.KeyBindingHelper;
import src.train.common.library.Info;
import cpw.mods.fml.client.registry.KeyBindingRegistry;

public class KeyBindingHandler extends KeyBindingRegistry.KeyHandler {

	public KeyBindingHandler() {
		super(KeyBindingHelper.gatherKeyBindings(), KeyBindingHelper.gatherIsRepeating());
	}

	@Override
	public String getLabel() {
		return Info.modName + ": " + this.getClass().getSimpleName();
	}

	@Override
	public EnumSet<TickEvent.Type> ticks() {
		return EnumSet.of(TickEvent.Type.CLIENT);
	}

	private static String getLocalizedKey(String key) {
		return /* LanguageRegistry.instance().getStringLocalization(key) */"test";
	}

	@Override
	public void keyDown(EnumSet<TickEvent.Type> types, KeyBinding kb, boolean tickEnd, boolean isRepeat) {}

	@Override
	public void keyUp(EnumSet<TickEvent.Type> types, KeyBinding kb, boolean tickEnd) {}

}
