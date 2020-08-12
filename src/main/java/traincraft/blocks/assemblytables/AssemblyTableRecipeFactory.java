/*
 * Traincraft
 * Copyright (c) 2011-2020.
 * <p>
 * This file ("AssemblyTableRecipeFactory.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.blocks.assemblytables;

import com.google.gson.JsonObject;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.crafting.IRecipeFactory;
import net.minecraftforge.common.crafting.JsonContext;

/**
 * Json parser for all 3 tiers of assembly table.
 *
 * @author PseudonymPatel
 * @since 2020-8-7
 */
public class AssemblyTableRecipeFactory implements IRecipeFactory {
    @Override
    public IRecipe parse(JsonContext context, JsonObject json) {
        return null;
    }
}
