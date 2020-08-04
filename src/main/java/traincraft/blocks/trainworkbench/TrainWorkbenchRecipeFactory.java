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

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.JsonUtils;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.crafting.IRecipeFactory;
import net.minecraftforge.common.crafting.JsonContext;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.Set;

import static net.minecraft.item.crafting.ShapedRecipes.deserializeItem;

/**
 * This class allows for json implementation of recipes for the Train Workbench, used to craft train parts.
 *
 * WARNING: Please make sure patterns are 3x3 to avoid any problems. This should be fixed once things work.
 *
 * @author PseudonymPatel
 * @since 2020-7-30
 */
public class TrainWorkbenchRecipeFactory implements IRecipeFactory {

    public IRecipe parse(JsonContext context, JsonObject json) {

        //this basically a copy of how minecraft does it.
        //String group = JsonUtils.getString(json, "group", ""); //we can use group in the future if there is a need for it.
        Map<String, Ingredient> map = deserializeKey(JsonUtils.getJsonObject(json, "key"));
        String[] patternString = shrink(patternFromJson(JsonUtils.getJsonArray(json, "pattern")));

        //these aid in non-3x3 crafting.
        int i = patternString[0].length();
        int j = patternString.length;
        NonNullList<Ingredient> nonnulllist = deserializeIngredients(patternString, map, i, j);
        ItemStack itemstack = deserializeItem(JsonUtils.getJsonObject(json, "result"), true);

        //turn the nonnulllist into a InventoryBasic. Or nevermind, just make everything use the nonnulllist.
        return new TrainWorkbenchRecipe(nonnulllist, itemstack, i, j);
    }

    //This function is also copied directly from vanilla ShapedRecipes class (because private)
    private static NonNullList<Ingredient> deserializeIngredients(String[] pattern, Map<String, Ingredient> keys, int patternWidth, int patternHeight) {
        NonNullList<Ingredient> nonnulllist = NonNullList.<Ingredient>withSize(patternWidth * patternHeight, Ingredient.EMPTY);
        Set<String> set = Sets.newHashSet(keys.keySet());
        set.remove(" ");

        for (int i = 0; i < pattern.length; ++i) {
            for (int j = 0; j < pattern[i].length(); ++j) {
                String s = pattern[i].substring(j, j + 1);
                Ingredient ingredient = keys.get(s);

                if (ingredient == null) {
                    throw new JsonSyntaxException("Pattern references symbol '" + s + "' but it's not defined in the key");
                }

                set.remove(s);
                nonnulllist.set(j + patternWidth * i, ingredient);
            }
        }

        if (!set.isEmpty()) {
            throw new JsonSyntaxException("Key defines symbols that aren't used in pattern: " + set);
        } else {
            return nonnulllist;
        }
    }

    //also from ShapedRecipes, this one takes the pattern element and turns it into a array of strings.
    private static String[] patternFromJson(JsonArray jsonArr) {
        String[] astring = new String[jsonArr.size()];

        if (astring.length > 3) {
            throw new JsonSyntaxException("Invalid pattern: too many rows, 3 is maximum");
        } else if (astring.length == 0) {
            throw new JsonSyntaxException("Invalid pattern: empty pattern not allowed");
        } else {
            for (int i = 0; i < astring.length; ++i) {
                String s = JsonUtils.getString(jsonArr.get(i), "pattern[" + i + "]");

                if (s.length() > 3) {
                    throw new JsonSyntaxException("Invalid pattern: too many columns, 3 is maximum");
                }

                if (i > 0 && astring[0].length() != s.length()) {
                    throw new JsonSyntaxException("Invalid pattern: each row must be the same width");
                }

                astring[i] = s;
            }

            return astring;
        }
    }

    /**
     * Turns the json object into a map of recipe ingredient keys (ie. #, X, etc.) and the corresponding ingredient.
     *
     * @param json The object containing the array of keys
     * @return A map of the keys to the corresponding Ingredient
     */
    private static Map<String, Ingredient> deserializeKey(JsonObject json) {
        Map<String, Ingredient> map = Maps.<String, Ingredient>newHashMap();

        for (Map.Entry<String, JsonElement> entry : json.entrySet()) {
            if (((String)entry.getKey()).length() != 1) {
                throw new JsonSyntaxException("Invalid key entry: '" + (String)entry.getKey() + "' is an invalid symbol (must be 1 character only).");
            }

            if (" ".equals(entry.getKey())) {
                throw new JsonSyntaxException("Invalid key entry: ' ' is a reserved symbol.");
            }

            map.put(entry.getKey(), deserializeIngredient(entry.getValue()));
        }

        map.put(" ", Ingredient.EMPTY);
        return map;
    }

    /**
     * Removes empty rows and columns from the crafting recipe, good for being able to use (ie) one row recipe in any row.
     *
     * @param toShrink array of strings to shrink.
     * @return shrunken recipe
     */
    private static String[] shrink(String... toShrink) {
        int i = Integer.MAX_VALUE;
        int j = 0;
        int k = 0;
        int l = 0;

        for (int i1 = 0; i1 < toShrink.length; ++i1) {
            String s = toShrink[i1];
            i = Math.min(i, firstNonSpace(s));
            int j1 = lastNonSpace(s);
            j = Math.max(j, j1);

            if (j1 < 0) {
                if (k == i1)
                {
                    ++k;
                }

                ++l;
            } else {
                l = 0;
            }
        }

        if (toShrink.length == l) {
            return new String[0];
        } else {
            String[] astring = new String[toShrink.length - l - k];

            for (int k1 = 0; k1 < astring.length; ++k1) {
                astring[k1] = toShrink[k1 + k].substring(i, j + 1);
            }

            return astring;
        }
    }

    //ngl, never seen a for loop used in the way it is in the next two functions. v cool tho
    private static int firstNonSpace(String str) {
        int i;

        for (i = 0; i < str.length() && str.charAt(i) == ' '; ++i) {
            ;
        }

        return i;
    }

    private static int lastNonSpace(String str) {
        int i;

        for (i = str.length() - 1; i >= 0 && str.charAt(i) == ' '; --i) {
            ;
        }

        return i;
    }

    /**
     * Takes a jsonElement describing a Ingredient and turns it into the corresponding Ingredient.
     * NOTE: this is overridden to provide support for forge ore dictionary.
     *
     * @param jsonElement object/array of objects describing single ingredient.
     * @return the ingredient
     */
    public static Ingredient deserializeIngredient(@Nullable JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            //first check if using ore dict, otherwise do normal stuff
            if (jsonElement.getAsJsonObject().has("type")) {
                if (jsonElement.getAsJsonObject().get("type").getAsString().equals("forge:ore_dict")) {
                    if (jsonElement.getAsJsonObject().has("ore")) {
                        //find all ItemStacks for ore
                        NonNullList<ItemStack> itemStacksNNlist = OreDictionary.getOres(jsonElement.getAsJsonObject().get("ore").getAsString());
                        ItemStack[] itemStacks = new ItemStack[itemStacksNNlist.size()];
                        for (int i = 0; i < itemStacksNNlist.size(); ++i) {
                            itemStacks[i] = itemStacksNNlist.get(i);
                        }
                        return Ingredient.fromStacks(itemStacks);
                    } else {
                        throw new JsonSyntaxException("Does not contain ore item.");
                    }
                } else {
                    throw new JsonSyntaxException("Does not support non forge:ore_dict types.");
                }
            } else if (jsonElement.isJsonObject()) {
                return Ingredient.fromStacks(deserializeItem(jsonElement.getAsJsonObject(), false));
            } else if (!jsonElement.isJsonArray()) {
                throw new JsonSyntaxException("Expected item to be object or array of objects");
            } else {
                JsonArray jsonarray = jsonElement.getAsJsonArray();

                if (jsonarray.size() == 0) {
                    throw new JsonSyntaxException("Item array cannot be empty, at least one item must be defined");
                } else {
                    ItemStack[] aitemstack = new ItemStack[jsonarray.size()];

                    for (int i = 0; i < jsonarray.size(); ++i) {
                        aitemstack[i] = deserializeItem(JsonUtils.getJsonObject(jsonarray.get(i), "item"), false);
                    }

                    return Ingredient.fromStacks(aitemstack);
                }
            }
        }
        else {
            throw new JsonSyntaxException("Item cannot be null");
        }
    }
}
