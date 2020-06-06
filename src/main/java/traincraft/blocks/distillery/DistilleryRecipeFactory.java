package traincraft.blocks.distillery;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.crafting.IRecipeFactory;
import net.minecraftforge.common.crafting.JsonContext;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

public class DistilleryRecipeFactory implements IRecipeFactory {
    
    @Override
    public IRecipe parse(JsonContext context, JsonObject json) {
        Ingredient inputIngredient;
        int inputAmount = 1;
        int burnTime = 200;
        ItemStack outputIngredient;
        FluidStack fluid = null;
        if(json.has("input")){
            inputIngredient = ShapedRecipes.deserializeIngredient(json.get("input"));
        } else {
            throw new JsonSyntaxException("input can't be null");
        }
        if(json.has("input_amount")){
            if(json.get("input_amount").isJsonPrimitive() && json.get("input_amount").getAsJsonPrimitive().isNumber()){
                inputAmount = json.get("input_amount").getAsInt();
            } else {
                throw new JsonSyntaxException("input_amount has to be a integer");
            }
        }
        if(json.has("burn_time")){
            if(json.get("burn_time").isJsonPrimitive() && json.get("burn_time").getAsJsonPrimitive().isNumber()){
                burnTime = json.get("burn_time").getAsInt();
            } else {
                throw new JsonSyntaxException("burn_time has to be a integer");
            }
        }
        if(json.has("output") && json.get("output").isJsonObject()){
            outputIngredient = ShapedRecipes.deserializeItem(json.get("output").getAsJsonObject(), true);
        } else {
            throw new JsonSyntaxException("output has to be a json object");
        }
        if(json.has("fluid")){
            fluid = deserializeFluidStack(json.get("fluid"));
        }
        return new DistilleryRecipe(inputIngredient, inputAmount, burnTime, outputIngredient, fluid);
    }
    
    public static FluidStack deserializeFluidStack(JsonElement element){
        if(element != null && !element.isJsonNull()){
            if(element.isJsonObject()){
                JsonObject fluidJson = (JsonObject) element;
                String fluidName;
                int amount = 0;
                NBTTagCompound nbt;
                if(fluidJson.has("name")){
                    fluidName = fluidJson.get("name").getAsString();
                } else {
                    throw new JsonSyntaxException("name(fluid) is not populated");
                }
                if(fluidJson.has("amount")){
                    if(fluidJson.get("amount").isJsonPrimitive() && ((JsonPrimitive) fluidJson.get("amount")).isNumber()){
                        amount = fluidJson.get("amount").getAsInt();
                    } else {
                        throw new JsonSyntaxException("amount is not a number");
                    }
                }
                // todo fluid stack nbt
    
                Fluid fluid = FluidRegistry.getFluid(fluidName);
                if(fluid != null){
                    return new FluidStack(fluid, amount);
                } else {
                    throw new JsonSyntaxException("supplied fluid name has no corresponding fluid");
                }
            } else {
                throw new JsonSyntaxException("fluid has to be a json object");
            }
        } else {
            throw new JsonSyntaxException("fluid can't be null");
        }
    }
}
