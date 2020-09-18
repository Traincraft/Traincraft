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

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.JsonUtils;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.crafting.IRecipeFactory;
import net.minecraftforge.common.crafting.JsonContext;
import net.minecraftforge.oredict.OreDictionary;
import traincraft.api.NumberedIngredient;

import javax.annotation.Nullable;

import static net.minecraft.item.crafting.ShapedRecipes.deserializeItem;

/**
 * Json parser for all 3 tiers of assembly table.
 *
 * @author PseudonymPatel
 * @since 2020-8-7
 */
public class AssemblyTableRecipeFactory implements IRecipeFactory {
    
    private static final String[] COMPONENTS = {"planks", "chimney", "cab", "dye", "component", "boiler", "firebox", "wheels", "frame", "coupler"};
    
    @Override
    public IRecipe parse(JsonContext context, JsonObject json){
        
        if(!json.has("tier")){
            throw new JsonSyntaxException("No tier element found in assembly table recipe");
        }
        int tier = json.get("tier").getAsInt();
        
        if(!json.has("result")){
            throw new JsonSyntaxException("No result element found in assembly table recipe");
        }
        ItemStack resultItemStack = deserializeItem(JsonUtils.getJsonObject(json, "result"), true);
        
        //set a blank AssemblyTableRecipe to add to.
        AssemblyTableRecipe recipeInProgress = new AssemblyTableRecipe(tier, resultItemStack);
        
        if(json.has("planks")){
            recipeInProgress.setCraftingIngredient(0, deserializeIngredient(json.get("planks")));
        } else{
            throw new JsonSyntaxException("Could not find planks in assembly table recipe.");
        }
        
        for(int i = 0; i < 10; ++i){
            //since we initialize to empty slots, those that do not have an element in the json will be empty slots in the recipe.
            if(json.has(COMPONENTS[i])){
                recipeInProgress.setCraftingIngredient(i, deserializeIngredient(json.get(COMPONENTS[i])));
            }
        }
        
        return recipeInProgress;
    }
    
    /**
     * Takes a jsonElement describing a Ingredient and turns it into the corresponding Ingredient.
     * NOTE: this is overridden to provide support for forge ore dictionary.
     * Should be removed in 1.15 in favor of a tweaked default Ingredient method.
     *
     * @param jsonElement object/array of objects describing single ingredient.
     * @return the ingredient
     */
    private static NumberedIngredient deserializeIngredient(@Nullable JsonElement jsonElement){
        if(jsonElement != null && !jsonElement.isJsonNull()){
            //first check if using ore dict, otherwise do normal stuff
            if(jsonElement.getAsJsonObject().has("type")){
                if(jsonElement.getAsJsonObject().get("type").getAsString().equals("forge:ore_dict")){
                    if(jsonElement.getAsJsonObject().has("ore")){
                        //find all ItemStacks for ore
                        NonNullList<ItemStack> itemStacksNNlist = OreDictionary.getOres(jsonElement.getAsJsonObject().get("ore").getAsString());
                        ItemStack[] itemStacks = new ItemStack[itemStacksNNlist.size()];
                        for(int i = 0; i < itemStacksNNlist.size(); ++i){
                            itemStacks[i] = itemStacksNNlist.get(i);
                        }
                        if(jsonElement.getAsJsonObject().has("count")){
                            return new NumberedIngredient(jsonElement.getAsJsonObject().get("count").getAsInt(), itemStacks);
                        }
                        return new NumberedIngredient(1, itemStacks);
                    } else{
                        throw new JsonSyntaxException("Does not contain ore item.");
                    }
                } else{
                    throw new JsonSyntaxException("Does not support non forge:ore_dict types.");
                }
            } else if(jsonElement.isJsonObject()){
                ItemStack stack = deserializeItem(jsonElement.getAsJsonObject(), false);
                if(jsonElement.getAsJsonObject().has("count")){
                    return new NumberedIngredient(jsonElement.getAsJsonObject().get("count").getAsInt(), stack);
                }
                return new NumberedIngredient(1, stack);
            } else if(!jsonElement.isJsonArray()){
                throw new JsonSyntaxException("Expected item to be object or array of objects");
            } else{
                JsonArray jsonarray = jsonElement.getAsJsonArray();
                
                if(jsonarray.size() == 0){
                    throw new JsonSyntaxException("Item array cannot be empty, at least one item must be defined");
                } else{
                    ItemStack[] aitemstack = new ItemStack[jsonarray.size()];
                    
                    for(int i = 0; i < jsonarray.size(); ++i){
                        aitemstack[i] = deserializeItem(JsonUtils.getJsonObject(jsonarray.get(i), "item"), false);
                    }
                    if(jsonElement.getAsJsonObject().has("count")){
                        return new NumberedIngredient(jsonElement.getAsJsonObject().get("count").getAsInt(), aitemstack);
                    }
                    return new NumberedIngredient(1, aitemstack);
                }
            }
        }
        return NumberedIngredient.EMPTY;
    }
}
