package si.meansoft.traincraft.api.recipes;

import net.minecraft.item.ItemStack;
import si.meansoft.traincraft.Util;
import si.meansoft.traincraft.tileEntities.crafter.TileEntityCrafterBase;

import java.util.HashMap;

/**
 * @author canitzp
 */
public class CrafterRecipes{

    public static HashMap<Recipe, ItemStack> steamRecipes = new HashMap<Recipe, ItemStack>();
    public static HashMap<Recipe, ItemStack> dieselRecipes = new HashMap<Recipe, ItemStack>();
    public static HashMap<Recipe, ItemStack> electroRecipes = new HashMap<Recipe, ItemStack>();

    //Crafter Steam:
    public static void addSteamRecipe(ItemStack output, ItemStack boiler, ItemStack brake, ItemStack cabin, ItemStack cabinLight, ItemStack coupler, ItemStack fireChamber, ItemStack frontLight, ItemStack roof, ItemStack smokeStack, ItemStack wheel){
        steamRecipes.put(new Recipe(boiler, brake, cabin, cabinLight, coupler, fireChamber, frontLight, roof, smokeStack, wheel), output);
    }

    public static ItemStack getSteamOutput(Recipe recipeHandler){
        return steamRecipes.get(recipeHandler);
    }

    public static void craftSteam(TileEntityCrafterBase tileEntity, Recipe recipeHandler){
        ItemStack output = getSteamOutput(recipeHandler);
        if(output != null){
            for(int i = 0; i < recipeHandler.inputs.length; i++){
                tileEntity.decrStackSize(i+16, Util.getStackSize(recipeHandler.inputs[i]));
            }

            tileEntity.setInventorySlotContents(tileEntity.getNextFreeSlot(8, 8+7), output.copy());
        }
    }

    //Crafter Diesel:
    public static void addDieselRecipe(ItemStack output, ItemStack boiler, ItemStack brake, ItemStack cabin, ItemStack cabinLight, ItemStack coupler, ItemStack fireChamber, ItemStack frontLight, ItemStack roof, ItemStack smokeStack, ItemStack wheel){
        dieselRecipes.put(new Recipe(boiler, brake, cabin, cabinLight, coupler, fireChamber, frontLight, roof, smokeStack, wheel), output);
    }

    public static ItemStack getDieselOutput(Recipe recipeHandler){
        return dieselRecipes.get(recipeHandler);
    }

    public static void craftDiesel(TileEntityCrafterBase tileEntity, Recipe recipeHandler){
        ItemStack output = getDieselOutput(recipeHandler);
        if(output != null){
            for(int i = 0; i < recipeHandler.inputs.length; i++){
                tileEntity.decrStackSize(i+16, Util.getStackSize(recipeHandler.inputs[i]));
            }

            tileEntity.setInventorySlotContents(tileEntity.getNextFreeSlot(8, 8+7), output.copy());
        }
    }

    //Crafter Electro:
    public static void addElectroRecipe(ItemStack output, ItemStack boiler, ItemStack brake, ItemStack cabin, ItemStack cabinLight, ItemStack coupler, ItemStack fireChamber, ItemStack frontLight, ItemStack roof, ItemStack smokeStack, ItemStack wheel){
        electroRecipes.put(new Recipe(boiler, brake, cabin, cabinLight, coupler, fireChamber, frontLight, roof, smokeStack, wheel), output);
    }

    public static ItemStack getElectroOutput(Recipe recipeHandler){
        return electroRecipes.get(recipeHandler);
    }

    public static void craftElectro(TileEntityCrafterBase tileEntity, Recipe recipeHandler){
        ItemStack output = getElectroOutput(recipeHandler);
        if(output != null){
            for(int i = 0; i < recipeHandler.inputs.length; i++){
                tileEntity.decrStackSize(i+16, Util.getStackSize(recipeHandler.inputs[i]));
            }

            tileEntity.setInventorySlotContents(tileEntity.getNextFreeSlot(8, 8+7), output.copy());
        }
    }

    public static class Recipe{

        public ItemStack[] inputs = new ItemStack[10];

        public Recipe(ItemStack battery, ItemStack brake, ItemStack cabin, ItemStack cabinLight, ItemStack coupler, ItemStack generator, ItemStack headLight, ItemStack horn, ItemStack ventilator, ItemStack wheel){
            this.inputs[0] = battery;
            this.inputs[1] = brake;
            this.inputs[2] = cabin;
            this.inputs[3] = cabinLight;
            this.inputs[4] = coupler;
            this.inputs[5] = generator;
            this.inputs[6] = headLight;
            this.inputs[7] = horn;
            this.inputs[8] = ventilator;
            this.inputs[9] = wheel;
        }

        @Override
        public boolean equals(Object obj){
            if(obj instanceof Recipe){
                Recipe rh = (Recipe)obj;
                for(int i = 0; i < this.inputs.length; i++){
                    //TODO This might have to be areItemsEqual, as we don't want to check for stacksize?
                    if(!ItemStack.areItemStacksEqual(rh.inputs[i], this.inputs[i])){
                        return false;
                    }
                }
                return true;
            }
            else{
                return false;
            }
        }
    }
}
