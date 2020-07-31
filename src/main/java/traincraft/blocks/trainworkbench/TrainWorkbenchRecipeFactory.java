/*
 * Traincraft
 * Copyright (c) 2011-2020.
 * <p>
 * This file ("TrainWorkbenchRecipeFactory.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.blocks.trainworkbench;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import net.fexcraft.lib.mc.crafting.BluePrintTableContainer2;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.IRecipeFactory;
import net.minecraftforge.common.crafting.JsonContext;

import java.util.concurrent.ExecutionException;

/**
 * This class allows for json implementation of recipes for the Train Workbench, used to craft train parts.
 *
 * @author PseudonymPatel
 * @since 2020-7-30
 */
public class TrainWorkbenchRecipeFactory implements IRecipeFactory {

    public IRecipe parse(JsonContext context, JsonObject json){

        //base inventory to fill with items from crafting recipe grid
        InventoryBasic recipe = new InventoryBasic("recipe", false, 9);
        //item that will be crafted
        ItemStack output;

        //iterate through the rows of json pattern, and reference symbols with things

        //get the item that will be crafted, and also the count, and combine into ItemStack
        if (json.has("result")) {
            //parse the result dict and look for item and count
            //look up working with json and want to get result[item] and find TCItems or TCBlock association,
            //also find result[count] and make
            //output = new ItemStack(result[item], result[count])
        } else {
            throw new JsonSyntaxException("Result must exist in recipe.");
        }
        return new TrainWorkbenchRecipe(recipe, output);
    }
}
