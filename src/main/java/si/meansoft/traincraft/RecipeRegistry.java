/*
 * This file ("RecipeRegistry.java") is part of the Traincraft mod for Minecraft.
 * It is created by all persons that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import si.meansoft.traincraft.api.recipes.DistilleryRecipes;
import si.meansoft.traincraft.api.recipes.HearthFurnaceRecipes;
import si.meansoft.traincraft.items.ItemMaterial;

/**
 * @author canitzp
 */
public class RecipeRegistry {

    public static void init(){
        initShaped();
        initShapeless();
        initDistillRecipes();
        initCrafterRecipes();
        initHearthFurnaceRecipes();
    }

    private static void initShaped(){

    }

    private static void initShapeless(){
        ItemStack plasticStack = new ItemStack(Registry.material, 1, ItemMaterial.Materials.PLASTIC.ordinal());
        GameRegistry.addShapelessRecipe(new ItemStack(Registry.material, 2, ItemMaterial.Materials.FUEL_CANISTER_EMPTY.ordinal()), plasticStack.copy(), plasticStack.copy(), plasticStack.copy(), plasticStack.copy());
    }

    private static void initDistillRecipes(){
        DistilleryRecipes.addRecipe(new ItemStack(Registry.material, 1, ItemMaterial.Materials.PLASTIC.ordinal()), new ItemStack(Registry.oilSand), new FluidStack(Registry.diesel, 1000), 50, 200);
        DistilleryRecipes.addFillingRecipe(new ItemStack(Registry.material, 2, ItemMaterial.Materials.FUEL_CANISTER_FULL.ordinal()), new ItemStack(Registry.material, 2, ItemMaterial.Materials.FUEL_CANISTER_EMPTY.ordinal()), new FluidStack(Registry.diesel, 1000));
    }

    private static void initCrafterRecipes(){
        //CrafterRecipes.addSteamRecipe(new ItemStack(Blocks.BRICK_BLOCK), null, null, null, null, null, null, null, null, null, null);
    }

    private static void initHearthFurnaceRecipes(){
        HearthFurnaceRecipes.addRecipe(new ItemStack(Registry.material, 1, ItemMaterial.Materials.GRAPHITE.ordinal()), new ItemStack(Items.IRON_INGOT), new ItemStack(Registry.material, 1, ItemMaterial.Materials.STEEL_INGOT.ordinal()), 1200);
    }

}
