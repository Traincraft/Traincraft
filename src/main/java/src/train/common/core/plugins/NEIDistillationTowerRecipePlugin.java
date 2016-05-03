package src.train.common.core.plugins;

import static codechicken.core.gui.GuiDraw.changeTexture;
import static codechicken.core.gui.GuiDraw.drawTexturedModalRect;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeSet;

import net.minecraft.block.Block;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;

import org.lwjgl.opengl.GL11;

import src.train.client.gui.GuiDistil;
import src.train.common.items.ItemBlockOreTC;
import src.train.common.library.ItemIDs;
import src.train.common.recipes.DistilRecipes;
import codechicken.nei.ItemList;
import codechicken.nei.NEIClientUtils;
import codechicken.nei.NEIServerUtils;
import codechicken.nei.PositionedStack;
import codechicken.nei.recipe.FurnaceRecipeHandler;
import codechicken.nei.recipe.TemplateRecipeHandler;

public class NEIDistillationTowerRecipePlugin extends FurnaceRecipeHandler{
	public class SmeltingPair extends CachedRecipe
    {
        public SmeltingPair(ItemStack ingred, ItemStack result)
        {
            ingred.stackSize = 1;
            this.ingred = new PositionedStack(ingred, 51, 13);
            this.result = null;//new PositionedStack(result, 118, 29);
        }
        @Override
        public PositionedStack getIngredient()
        {
            int cycle = cycleticks / 48;
            if(ingred.item.getItemDamage() == -1)
            {
                PositionedStack stack = ingred.copy();
                int maxDamage = 0;
                do
                {
                    maxDamage++;
                    stack.item.setItemDamage(maxDamage);
                }
                while(NEIClientUtils.isValidItem(stack.item));
                
                stack.item.setItemDamage(cycle % maxDamage);
                return stack;
            }
            return ingred;
        }
        @Override
        public PositionedStack getResult()
        {
            return result;
        }
        @Override
        public PositionedStack getOtherStack() 
        {
            return afuelsDistil.get((cycleticks/48) % afuelsDistil.size()).stack;
        }
        /**
         * Return extra items that are not directly involved in the ingredient->result relationship. Eg fuels.
         * Use this if you have more than one other stack
         * @return A list of positioned items.
         */
        @Override
        public List<PositionedStack> getOtherStacks()
        {
            ArrayList<PositionedStack> stacks = new ArrayList<PositionedStack>();
            PositionedStack stack = afuelsDistil.get((cycleticks/48) % afuelsDistil.size()).stack;
            PositionedStack stackPlastic = new PositionedStack(new ItemStack(ItemIDs.rawPlastic.item,1,-1), 111, 56);
            if(stack != null)
                stacks.add(stack);
            if(stackPlastic != null)
                stacks.add(stackPlastic);
            
            return stacks;
        }
        
        PositionedStack ingred;
        PositionedStack result;
    }
	@Override
    public void loadTransferRects()
    {
        transferRects.add(new RecipeTransferRect(new Rectangle(74, 23, 24, 41), "tc distillation tower"));
    }
    
    @Override
    public Class<? extends GuiContainer> getGuiClass()
    {
        return GuiDistil.class;
    }
    
    @Override
    public String getRecipeName()
    {
        return "Distillation tower";
    }
    
    @Override
    public void loadCraftingRecipes(String outputId, Object... results)
    {
        if(outputId.equals("tc distillation tower") && getClass() == NEIDistillationTowerRecipePlugin.class)//don't want subclasses getting a hold of this
        {
            HashMap<Integer, ItemStack> recipes = (HashMap<Integer, ItemStack>) DistilRecipes.smelting().getSmeltingList();

            for(Entry<Integer, ItemStack> recipe : recipes.entrySet())
            {
                ItemStack item = recipe.getValue();
                ItemStack ingredient = new ItemStack(recipe.getKey(), 1, -1);
            	if(ingredient!=null && ingredient.getItem() instanceof ItemBlockOreTC){
            		ingredient.setItemDamage(1);
            		arecipes.add(new SmeltingPair(ingredient, item));
            		ingredient.setItemDamage(2);
            		arecipes.add(new SmeltingPair(ingredient, item));
            	}else{
            		arecipes.add(new SmeltingPair(ingredient, item));
            	}
            }
      
        }
        else
        {
            super.loadCraftingRecipes(outputId, results);
        }
    }
    
    @Override
    public void loadCraftingRecipes(ItemStack result)
    {
        HashMap<Integer, ItemStack> recipes = (HashMap<Integer, ItemStack>) DistilRecipes.smelting().getSmeltingList();

        for(Entry<Integer, ItemStack> recipe : recipes.entrySet())
        {
            ItemStack item = recipe.getValue();
            if(NEIServerUtils.areStacksSameType(item, result))
            {
            	ItemStack ingredient = new ItemStack(Item.getItemById(recipe.getKey()), 1, -1);
            	if(ingredient!=null && ingredient.getItem() instanceof ItemBlockOreTC){
            		ingredient.setItemDamage(1);
            		arecipes.add(new SmeltingPair(ingredient, item));
            		ingredient.setItemDamage(2);
            		arecipes.add(new SmeltingPair(ingredient, item));
            	}else{
            		arecipes.add(new SmeltingPair(ingredient, item));
            	}
            }
        }
        
    }
    
    @Override
    public void loadUsageRecipes(String inputId, Object... ingredients)
    {
        if(inputId.equals("fuel") && getClass() == NEIDistillationTowerRecipePlugin.class)//don't want subclasses getting a hold of this
        {
            loadCraftingRecipes("tc distillation tower");
        }
        else
        {
            super.loadUsageRecipes(inputId, ingredients);
        }
    }
    
    @Override
    public void loadUsageRecipes(ItemStack ingredient)
    {
        HashMap<Integer, ItemStack> recipes = (HashMap<Integer, ItemStack>) DistilRecipes.smelting().getSmeltingList();
        
        for(Entry<Integer, ItemStack> recipe : recipes.entrySet())
        {
            ItemStack item = recipe.getValue();
            if(Item.getIdFromItem(ingredient.getItem()) == recipe.getKey())
            {
            	if(ingredient!=null && ingredient.getItem() instanceof ItemBlockOreTC){
            		ingredient.setItemDamage(1);
            		arecipes.add(new SmeltingPair(ingredient, item));
            		ingredient.setItemDamage(2);
            		arecipes.add(new SmeltingPair(ingredient, item));
            	}else{
            		arecipes.add(new SmeltingPair(ingredient, item));
            	}
            }
        }
       
    }
    
    @Override
    public String getGuiTexture()
    {
        return "tc:textures/gui/gui_distillation_tower2.png";
    }

    @Override
    public void drawExtras(int recipe)
    {
        drawProgressBar(51, 32, 176, 0, 14, 14, 48, 7);
        drawProgressBar(74, 30, 176, 14, 31, 41, 48, 0);
        if(recipe==5){//TODO this is very bad
        	drawProgressBar(140, 2, 197, 57, 18, 52, 70, 3);
        }else{
        	drawProgressBar(140, 2, 177, 57, 18, 52, 70, 3);
        }
    }
    public void drawBackground(int recipe)
    {
        GL11.glColor4f(1, 1, 1, 1);
        changeTexture(getGuiTexture());
        drawTexturedModalRect(0, 0, 5, 4, 166, 75);
    }
    @Override
    public String getOverlayIdentifier()
    {
        return "tc distillation tower";
    }
    @Override
	public int recipiesPerPage()
	{
		return 1;
	}
    public static ArrayList<FuelPairDistil> afuelsDistil;
    public static TreeSet<Integer> efuelsDistil;
    @Override
    public TemplateRecipeHandler newInstance()
    {
        if(afuelsDistil == null)
            findFuelsDistil();
        return super.newInstance();
    }
    private static void removeFuelsDistil()
    {
        efuelsDistil = new TreeSet<Integer>();
        efuelsDistil.add(39);//brown mushroom
        efuelsDistil.add(40);//red mushroom
        efuelsDistil.add(63);//signpost
        efuelsDistil.add(68);//wall signpost
        efuelsDistil.add(64);//wooden door
        efuelsDistil.add(146);//trapped chest
    }
    
    private static void findFuelsDistil()
    {        
        afuelsDistil = new ArrayList<FuelPairDistil>();
        for(ItemStack item : ItemList.items)
        {
            if(!efuelsDistil.contains(Item.getIdFromItem(item.getItem())))
            {
                int burnTime = TileEntityFurnace.getItemBurnTime(item);
                if(burnTime > 0)
                    afuelsDistil.add(new FuelPairDistil(item.copy(), burnTime));
            }
        }
    }
    static
    {
        removeFuelsDistil();
    }
    public static class FuelPairDistil
    {
        public FuelPairDistil(ItemStack ingred, int burnTime)
        {
            this.stack = new PositionedStack(ingred, 51, 49, false);
            this.burnTime = burnTime;
        }
        
        public PositionedStack stack;
        public int burnTime;
    }
}
