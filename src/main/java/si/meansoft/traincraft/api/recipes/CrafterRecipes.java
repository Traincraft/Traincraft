package si.meansoft.traincraft.api.recipes;

import net.minecraft.item.ItemStack;
import si.meansoft.traincraft.Util;
import si.meansoft.traincraft.tileEntities.TileEntityCrafter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author canitzp
 */
public class CrafterRecipes{

    public static HashMap<RecipeHandlerSteam, ItemStack> steamRecipes = new HashMap<RecipeHandlerSteam, ItemStack>();
    public static HashMap<RecipeHandlerDiesel, ItemStack> dieselRecipes = new HashMap<RecipeHandlerDiesel, ItemStack>();
    public static HashMap<RecipeHandlerElectro, ItemStack> electroRecipes = new HashMap<RecipeHandlerElectro, ItemStack>();

    //Crafter Steam:
    public static void addSteamRecipe(ItemStack output, ItemStack boiler, ItemStack brake, ItemStack cabin, ItemStack cabinLight, ItemStack coupler, ItemStack fireChamber, ItemStack frontLight, ItemStack roof, ItemStack smokeStack, ItemStack wheel){
        steamRecipes.put(new RecipeHandlerSteam(boiler, brake, cabin, cabinLight, coupler, fireChamber, frontLight, roof, smokeStack, wheel), output);
    }
    public static ItemStack getSteamOutput(RecipeHandlerSteam recipeHandler){
        for(Map.Entry<RecipeHandlerSteam, ItemStack> map : steamRecipes.entrySet()){
            if(map.getKey().equals(recipeHandler)){
                return map.getValue();
            }
        }
        return null;
    }
    public static void craftSteam(TileEntityCrafter tileEntity, RecipeHandlerSteam recipeHandler){
        ItemStack output = getSteamOutput(recipeHandler);
        if(output != null){
            tileEntity.decrStackSize(16, Util.getStackSize(recipeHandler.smokeStack));
            tileEntity.decrStackSize(17, Util.getStackSize(recipeHandler.roof));
            tileEntity.decrStackSize(18, Util.getStackSize(recipeHandler.cabinLight));
            tileEntity.decrStackSize(19, Util.getStackSize(recipeHandler.cabin));
            tileEntity.decrStackSize(20, Util.getStackSize(recipeHandler.frontLight));
            tileEntity.decrStackSize(21, Util.getStackSize(recipeHandler.boiler));
            tileEntity.decrStackSize(22, Util.getStackSize(recipeHandler.fireChamber));
            tileEntity.decrStackSize(23, Util.getStackSize(recipeHandler.brake));
            tileEntity.decrStackSize(24, Util.getStackSize(recipeHandler.wheel));
            tileEntity.decrStackSize(25, Util.getStackSize(recipeHandler.coupler));
            tileEntity.setInventorySlotContents(tileEntity.getNextFreeSlot(8, 8+7), output.copy());
        }
    }

    //Crafter Diesel:
    public static void addDieselRecipe(ItemStack output, ItemStack boiler, ItemStack brake, ItemStack cabin, ItemStack cabinLight, ItemStack coupler, ItemStack fireChamber, ItemStack frontLight, ItemStack roof, ItemStack smokeStack, ItemStack wheel){
        dieselRecipes.put(new RecipeHandlerDiesel(boiler, brake, cabin, cabinLight, coupler, fireChamber, frontLight, roof, smokeStack, wheel), output);
    }
    public static ItemStack getDieselOutput(RecipeHandlerDiesel recipeHandler){
        for(Map.Entry<RecipeHandlerDiesel, ItemStack> map : dieselRecipes.entrySet()){
            if(map.getKey().equals(recipeHandler)){
                return map.getValue();
            }
        }
        return null;
    }
    public static void craftDiesel(TileEntityCrafter tileEntity, RecipeHandlerDiesel recipeHandler){
        ItemStack output = getDieselOutput(recipeHandler);
        if(output != null){
            tileEntity.decrStackSize(16, Util.getStackSize(recipeHandler.horn));
            tileEntity.decrStackSize(17, Util.getStackSize(recipeHandler.ventilator));
            tileEntity.decrStackSize(18, Util.getStackSize(recipeHandler.cabinLight));
            tileEntity.decrStackSize(19, Util.getStackSize(recipeHandler.headLight));
            tileEntity.decrStackSize(20, Util.getStackSize(recipeHandler.generator));
            tileEntity.decrStackSize(21, Util.getStackSize(recipeHandler.battery));
            tileEntity.decrStackSize(22, Util.getStackSize(recipeHandler.cabin));
            tileEntity.decrStackSize(23, Util.getStackSize(recipeHandler.brake));
            tileEntity.decrStackSize(24, Util.getStackSize(recipeHandler.wheel));
            tileEntity.decrStackSize(25, Util.getStackSize(recipeHandler.coupler));
            tileEntity.setInventorySlotContents(tileEntity.getNextFreeSlot(8, 8+7), output.copy());
        }
    }

    //Crafter Electro:
    public static void addElectroRecipe(ItemStack output, ItemStack boiler, ItemStack brake, ItemStack cabin, ItemStack cabinLight, ItemStack coupler, ItemStack fireChamber, ItemStack frontLight, ItemStack roof, ItemStack smokeStack, ItemStack wheel){
        electroRecipes.put(new RecipeHandlerElectro(boiler, brake, cabin, cabinLight, coupler, fireChamber, frontLight, roof, smokeStack, wheel), output);
    }
    public static ItemStack getElectroOutput(RecipeHandlerElectro recipeHandler){
        for(Map.Entry<RecipeHandlerElectro, ItemStack> map : electroRecipes.entrySet()){
            if(map.getKey().equals(recipeHandler)){
                return map.getValue();
            }
        }
        return null;
    }
    public static void craftElectro(TileEntityCrafter tileEntity, RecipeHandlerElectro recipeHandler){
        ItemStack output = getElectroOutput(recipeHandler);
        if(output != null){
            tileEntity.decrStackSize(16, Util.getStackSize(recipeHandler.horn));
            tileEntity.decrStackSize(17, Util.getStackSize(recipeHandler.roof));
            tileEntity.decrStackSize(18, Util.getStackSize(recipeHandler.ventilator));
            tileEntity.decrStackSize(19, Util.getStackSize(recipeHandler.currentCollectorBracket));
            tileEntity.decrStackSize(20, Util.getStackSize(recipeHandler.cabin));
            tileEntity.decrStackSize(21, Util.getStackSize(recipeHandler.battery));
            tileEntity.decrStackSize(22, Util.getStackSize(recipeHandler.engine));
            tileEntity.decrStackSize(23, Util.getStackSize(recipeHandler.brake));
            tileEntity.decrStackSize(24, Util.getStackSize(recipeHandler.wheel));
            tileEntity.decrStackSize(25, Util.getStackSize(recipeHandler.coupler));
            tileEntity.setInventorySlotContents(tileEntity.getNextFreeSlot(8, 8+7), output.copy());
        }
    }

    public static class RecipeHandlerSteam{
        public ItemStack smokeStack, roof, cabinLight, cabin, frontLight, boiler, fireChamber, brake, wheel, coupler;
        public RecipeHandlerSteam(ItemStack boiler, ItemStack brake, ItemStack cabin, ItemStack cabinLight, ItemStack coupler, ItemStack fireChamber, ItemStack frontLight, ItemStack roof, ItemStack smokeStack, ItemStack wheel){
            this.boiler = boiler;
            this.brake = brake;
            this.cabin = cabin;
            this.cabinLight = cabinLight;
            this.coupler = coupler;
            this.fireChamber = fireChamber;
            this.frontLight = frontLight;
            this.roof = roof;
            this.smokeStack = smokeStack;
            this.wheel = wheel;
        }

        @Override
        public boolean equals(Object obj){
            if(obj instanceof RecipeHandlerSteam){
                RecipeHandlerSteam rh = (RecipeHandlerSteam) obj;
                if(ItemStack.areItemStacksEqual(rh.smokeStack, this.smokeStack)){
                    if(ItemStack.areItemStacksEqual(rh.roof, this.roof)){
                        if(ItemStack.areItemStacksEqual(rh.cabinLight, this.cabinLight)){
                            if(ItemStack.areItemStacksEqual(rh.cabin, this.cabin)){
                                if(ItemStack.areItemStacksEqual(rh.frontLight, this.frontLight)){
                                    if(ItemStack.areItemStacksEqual(rh.boiler, this.boiler)){
                                        if(ItemStack.areItemStacksEqual(rh.fireChamber, this.fireChamber)){
                                            if(ItemStack.areItemStacksEqual(rh.brake, this.brake)){
                                                if(ItemStack.areItemStacksEqual(rh.wheel, this.wheel)){
                                                    if(ItemStack.areItemStacksEqual(rh.coupler, this.coupler)){
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
    }

    public static class RecipeHandlerDiesel{
        public ItemStack horn, ventilator, cabinLight, headLight, generator, battery, cabin, brake, wheel, coupler;
        public RecipeHandlerDiesel(ItemStack battery, ItemStack brake, ItemStack cabin, ItemStack cabinLight, ItemStack coupler, ItemStack generator, ItemStack headLight, ItemStack horn, ItemStack ventilator, ItemStack wheel){
            this.battery = battery;
            this.brake = brake;
            this.cabin = cabin;
            this.cabinLight = cabinLight;
            this.coupler = coupler;
            this.generator = generator;
            this.headLight = headLight;
            this.horn = horn;
            this.ventilator = ventilator;
            this.wheel = wheel;
        }
        @Override
        public boolean equals(Object obj){
            if(obj instanceof RecipeHandlerDiesel){
                RecipeHandlerDiesel rh = (RecipeHandlerDiesel) obj;
                if(ItemStack.areItemStacksEqual(rh.horn, this.horn)){
                    if(ItemStack.areItemStacksEqual(rh.ventilator, this.ventilator)){
                        if(ItemStack.areItemStacksEqual(rh.cabinLight, this.cabinLight)){
                            if(ItemStack.areItemStacksEqual(rh.headLight, this.headLight)){
                                if(ItemStack.areItemStacksEqual(rh.generator, this.generator)){
                                    if(ItemStack.areItemStacksEqual(rh.battery, this.battery)){
                                        if(ItemStack.areItemStacksEqual(rh.cabin, this.cabin)){
                                            if(ItemStack.areItemStacksEqual(rh.brake, this.brake)){
                                                if(ItemStack.areItemStacksEqual(rh.wheel, this.wheel)){
                                                    if(ItemStack.areItemStacksEqual(rh.coupler, this.coupler)){
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
    }

    public static class RecipeHandlerElectro{
        public ItemStack horn, roof, ventilator, currentCollectorBracket, cabin, battery, engine, brake, wheel, coupler;
        public RecipeHandlerElectro(ItemStack battery, ItemStack brake, ItemStack cabin, ItemStack coupler, ItemStack currentCollectorBracket, ItemStack engine, ItemStack horn, ItemStack roof, ItemStack ventilator, ItemStack wheel){
            this.battery = battery;
            this.brake = brake;
            this.cabin = cabin;
            this.coupler = coupler;
            this.currentCollectorBracket = currentCollectorBracket;
            this.engine = engine;
            this.horn = horn;
            this.roof = roof;
            this.ventilator = ventilator;
            this.wheel = wheel;
        }
        @Override
        public boolean equals(Object obj){
            if(obj instanceof RecipeHandlerElectro){
                RecipeHandlerElectro rh = (RecipeHandlerElectro) obj;
                if(ItemStack.areItemStacksEqual(rh.horn, this.horn)){
                    if(ItemStack.areItemStacksEqual(rh.roof, this.roof)){
                        if(ItemStack.areItemStacksEqual(rh.ventilator, this.ventilator)){
                            if(ItemStack.areItemStacksEqual(rh.currentCollectorBracket, this.currentCollectorBracket)){
                                if(ItemStack.areItemStacksEqual(rh.cabin, this.cabin)){
                                    if(ItemStack.areItemStacksEqual(rh.battery, this.battery)){
                                        if(ItemStack.areItemStacksEqual(rh.engine, this.engine)){
                                            if(ItemStack.areItemStacksEqual(rh.brake, this.brake)){
                                                if(ItemStack.areItemStacksEqual(rh.wheel, this.wheel)){
                                                    if(ItemStack.areItemStacksEqual(rh.coupler, this.coupler)){
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
    }

}
