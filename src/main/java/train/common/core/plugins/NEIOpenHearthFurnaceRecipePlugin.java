package train.common.core.plugins;

import codechicken.nei.ItemList;
import codechicken.nei.NEIServerUtils;
import codechicken.nei.PositionedStack;
import codechicken.nei.recipe.ShapedRecipeHandler;
import codechicken.nei.recipe.TemplateRecipeHandler;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.tileentity.TileEntityFurnace;
import train.client.gui.GuiOpenHearthFurnace;
import train.common.inventory.TrainCraftingManager;
import train.common.recipes.OpenHearthFurnaceRecipe;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class NEIOpenHearthFurnaceRecipePlugin extends ShapedRecipeHandler {
	CachedShapedRecipe getShape(ItemStack ingredient1, ItemStack ingredient2, ItemStack result) {
		CachedShapedRecipe shape = new CachedShapedRecipe(0, 0, null, result);

		if (ingredient1 != null) {
			PositionedStack stack = new PositionedStack(ingredient1, 30, 6);
			stack.setMaxSize(1);
			shape.ingredients.add(stack);
			stack = null;
		}
		if (ingredient2 != null) {
			PositionedStack stack = new PositionedStack(ingredient2, 51, 6);
			stack.setMaxSize(1);
			shape.ingredients.add(stack);
		}

		shape.result.relx = 111;
		shape.result.rely = 24;
		return shape;
	}
	public class CachedShapedRecipe extends CachedRecipe
    {
        public ArrayList<PositionedStack> ingredients;
        public PositionedStack result;
        
        public CachedShapedRecipe(int width, int height, Object[] items, ItemStack out)
        {
            result = new PositionedStack(out, 119, 24);
            ingredients = new ArrayList<PositionedStack>();
            setIngredients(width, height, items);
        }
        
        public CachedShapedRecipe(ShapedRecipes recipe)
        {
            this(recipe.recipeWidth, recipe.recipeHeight, recipe.recipeItems, recipe.getRecipeOutput());
        }
        
        /**
         * @param width
         * @param height
         * @param items an ItemStack[] or ItemStack[][]
         */
        public void setIngredients(int width, int height, Object[] items)
        {
            for(int x = 0; x < width; x++)
            {
                for(int y = 0; y < height; y++)
                {
                    if(items[y*width+x] == null)
                        continue;
                    
                    PositionedStack stack = new PositionedStack(items[y*width+x], 25+x*18, 6+y*18, false);
                    stack.setMaxSize(1);
                    ingredients.add(stack);
                }
            }
        }
        
        @Override
        public List<PositionedStack> getIngredients()
        {
            return getCycledIngredients(cycleticks / 20, ingredients);
        }
        
        public PositionedStack getResult()
        {
            return result;
        }
        
        public void computeVisuals()
        {
            for(PositionedStack p : ingredients)
                p.generatePermutations();
            
            result.generatePermutations();
        }
        @Override
		public PositionedStack getOtherStack() {
			return afuels.get((cycleticks / 48) % afuels.size()).stack;
		}
    }
	@Override
	public Class<? extends GuiContainer> getGuiClass() {
		return GuiOpenHearthFurnace.class;
	}

	@Override
	public String getRecipeName() {
		return "Open Hearth Furnace";
	}

	@Override
	public void loadTransferRects() {
		//transferRects.add(new RecipeTransferRect(new Rectangle(50, 23, 18, 18), "fuel"));
		transferRects.add(new RecipeTransferRect(new Rectangle(74, 23, 24, 18), "open hearth furnace"));
	}

	@Override
	public void loadCraftingRecipes(String outputId, Object... results) {
		if (outputId.equals("open hearth furnace") && getClass() == NEIOpenHearthFurnaceRecipePlugin.class) {
			for (OpenHearthFurnaceRecipe recipe : TrainCraftingManager.instance.getHearthFurnaceRecipeList()) {
				ItemStack[] items = recipe.getRecipe();
				ItemStack output = recipe.getCraftingResult();
				arecipes.add(getShape(items[0], items[1], output));
			}
		}
		else {
			super.loadCraftingRecipes(outputId, results);
		}
	}

	@Override
	public void loadCraftingRecipes(ItemStack result) {
		for (OpenHearthFurnaceRecipe recipe : TrainCraftingManager.instance.getHearthFurnaceRecipeList()) {
			ItemStack item = recipe.getCraftingResult();
			if (NEIServerUtils.areStacksSameType(item, result)) {
				ItemStack[] items = recipe.getRecipe();
				arecipes.add(getShape(items[0], items[1], result));
			}
		}

	}

	@Override
	public void loadUsageRecipes(String inputId, Object... ingredients) {
		if (inputId.equals("fuel") && getClass() == NEIOpenHearthFurnaceRecipePlugin.class) {
			loadCraftingRecipes("open hearth furnace");
		}
		else {
			super.loadUsageRecipes(inputId, ingredients);
		}
	}

	@Override
	public void loadUsageRecipes(ItemStack ingredient) {
		for (OpenHearthFurnaceRecipe recipe : TrainCraftingManager.instance.getHearthFurnaceRecipeList()) {
			ItemStack item = recipe.getCraftingResult();
			ItemStack[] items = recipe.getRecipe();
			if (ingredient.getItem() == items[0].getItem() || ingredient.getItem() == items[1].getItem()) {
				arecipes.add(getShape(items[0], items[1], item));
			}
		}
	}

	@Override
	public String getGuiTexture() {
		return "tc:textures/gui/gui_open_hearth_furnace.png";
	}

	public static class FuelPair {
		public FuelPair(ItemStack ingred, int burnTime) {
			this.stack = new PositionedStack(ingred, 42, 42, false);
			this.burnTime = burnTime;
		}

		public PositionedStack stack;
		public int burnTime;
	}

	public static ArrayList<FuelPair> afuels;

	@Override
	public TemplateRecipeHandler newInstance() {
		if (afuels == null) findFuels();
		return super.newInstance();
	}

	@Override
	public void drawExtras(int recipe) {
		drawProgressBar(51, 25, 176, 0, 14, 14, 48, 7);
		drawProgressBar(31, 25, 176, 0, 14, 14, 48, 7);
		drawProgressBar(74, 23, 176, 14, 24, 16, 48, 0);
	}


	private static void findFuels() {
		afuels = new ArrayList<FuelPair>();
		for (ItemStack item : ItemList.items) {
				int burnTime = TileEntityFurnace.getItemBurnTime(item);
				if (burnTime > 0) afuels.add(new FuelPair(item.copy(), burnTime));
		}
	}

	static {
	}
}
