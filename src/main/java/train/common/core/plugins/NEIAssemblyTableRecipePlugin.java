package train.common.core.plugins;

import static codechicken.lib.gui.GuiDraw.changeTexture;
import static codechicken.lib.gui.GuiDraw.drawString;
import static codechicken.lib.gui.GuiDraw.drawTexturedModalRect;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.lwjgl.opengl.GL11;

import codechicken.nei.NEIClientUtils;
import codechicken.nei.PositionedStack;
import codechicken.nei.recipe.ShapedRecipeHandler;
import codechicken.nei.recipe.TemplateRecipeHandler.CachedRecipe;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraftforge.oredict.OreDictionary;
import train.client.gui.GuiCrafterTier;
import train.common.core.managers.TierRecipe;
import train.common.core.managers.TierRecipeManager;
import train.common.recipes.ShapedTrainRecipes;

public class NEIAssemblyTableRecipePlugin extends ShapedRecipeHandler {
	private Map<Integer, List<TierRecipe>> recipeList = assemblyListCleaner(
			TierRecipeManager.getInstance().getRecipeList());

	private CachedShapedRecipe getShape(TierRecipe recipe) {
		CachedShapedRecipe shape = new CachedShapedRecipe(0, 0, null, recipe.getOutput());
		PositionedStack stack = null;
		if (recipe.getInput().get(0) != null) {
			stack = new PositionedStack(recipe.getInput().get(0), 20, 16);
			stack.setMaxSize(recipe.getInput().get(0).stackSize);
			shape.ingredients.add(stack);
			stack = null;
		}
		if (recipe.getInput().get(1) != null) {
			stack = new PositionedStack(recipe.getInput().get(1), 38, 82);
			stack.setMaxSize(recipe.getInput().get(1).stackSize);
			shape.ingredients.add(stack);
			stack = null;
		}
		if (recipe.getInput().get(2) != null) {
			stack = new PositionedStack(recipe.getInput().get(2), 74, 82);
			stack.setMaxSize(recipe.getInput().get(2).stackSize);
			shape.ingredients.add(stack);
			stack = null;
		}
		if (recipe.getInput().get(3) != null) {
			stack = new PositionedStack(recipe.getInput().get(3), 140, 82);
			stack.setMaxSize(recipe.getInput().get(3).stackSize);
			shape.ingredients.add(stack);
			stack = null;
		}
		if (recipe.getInput().get(4) != null) {
			stack = new PositionedStack(recipe.getInput().get(4), 74, 16);
			stack.setMaxSize(recipe.getInput().get(4).stackSize);
			shape.ingredients.add(stack);
			stack = null;
		}
		if (recipe.getInput().get(5) != null) {
			stack = new PositionedStack(recipe.getInput().get(5), 110, 16);
			stack.setMaxSize(recipe.getInput().get(5).stackSize);
			shape.ingredients.add(stack);
			stack = null;
		}
		if (recipe.getInput().get(6) != null) {
			stack = new PositionedStack(recipe.getInput().get(6), 74, 50);
			stack.setMaxSize(recipe.getInput().get(6).stackSize);
			shape.ingredients.add(stack);
			stack = null;
		}
		if (recipe.getInput().get(7) != null) {
			stack = new PositionedStack(recipe.getInput().get(7), 110, 50);
			stack.setMaxSize(recipe.getInput().get(7).stackSize);
			shape.ingredients.add(stack);
			stack = null;
		}
		if (recipe.getInput().get(8) != null) {
			stack = new PositionedStack(recipe.getInput().get(8), 20, 50);
			stack.setMaxSize(recipe.getInput().get(8).stackSize);
			shape.ingredients.add(stack);
			stack = null;
		}
		if (recipe.getInput().get(9) != null) {
			stack = new PositionedStack(recipe.getInput().get(9), 140, 16);
			stack.setMaxSize(recipe.getInput().get(9).stackSize);
			shape.ingredients.add(stack);
			stack = null;
		}

		shape.result.relx = 87;
		shape.result.rely = 118;
		return shape;
	}

	public class CachedShapedRecipe extends CachedRecipe {
		public ArrayList<PositionedStack> ingredients;
		public PositionedStack result;

		public CachedShapedRecipe(int width, int height, Object[] items, ItemStack out) {
			result = new PositionedStack(out, 119, 24);
			ingredients = new ArrayList<PositionedStack>();
			setIngredients(width, height, items);
		}

		public CachedShapedRecipe(ShapedRecipes recipe) {
			this(recipe.recipeWidth, recipe.recipeHeight, recipe.recipeItems, recipe.getRecipeOutput());
		}

		/**
		 * @param width
		 * @param height
		 * @param items  an ItemStack[] or ItemStack[][]
		 */
		public void setIngredients(int width, int height, Object[] items) {
			for (int x = 0; x < width; x++) {
				for (int y = 0; y < height; y++) {
					if (items[y * width + x] == null)
						continue;

					PositionedStack stack = new PositionedStack(items[y * width + x], 25 + x * 18, 6 + y * 18, false);
					stack.setMaxSize(1);
					ingredients.add(stack);
				}
			}
		}

		@Override
		public List<PositionedStack> getIngredients() {
			return getCycledIngredients(cycleticks / 20, ingredients);
		}

		public PositionedStack getResult() {
			return result;
		}

		public void computeVisuals() {
			for (PositionedStack p : ingredients)
				p.generatePermutations();

			result.generatePermutations();
		}

		/**
		 * This will perform default cycling of ingredients, mulitItem capable
		 * 
		 * @return
		 */
		private int cycleTicks = 0;

		@Override
		public List<PositionedStack> getCycledIngredients(int cycle, List<PositionedStack> ingredients) {
			cycleTicks++;

			int id = getOutputID(result.item.getItem());
			List<TierRecipe> recipes = recipeList.get(id);

			for (int itemIndex = 0; itemIndex < ingredients.size(); itemIndex++) {

				Set<ItemStack> stacks = new HashSet<>();
				for (TierRecipe otherRecipe : recipes) {
					ArrayList<PositionedStack> ingreds = getShape(otherRecipe).ingredients;
					PositionedStack incredient = itemIndex < ingreds.size() ? ingreds.get(itemIndex) : null;
					if (incredient != null) {
						stacks.add(incredient.item);
					}
				}

				ArrayList<ItemStack> list = new ArrayList<>(stacks);
				if (list != null && list.size() > 1) {
					Random rand = new Random(cycle + System.currentTimeMillis());
					if (cycleTicks % 15 == 0) {
						int stackSize = ingredients.get(itemIndex).item.stackSize;
						ingredients.get(itemIndex).item = (ItemStack) list.get(Math.abs(rand.nextInt()) % list.size());
						ingredients.get(itemIndex).item.stackSize = stackSize;
					}
				} else {
					randomRenderPermutation(ingredients.get(itemIndex), cycle + itemIndex);
				}
			}

			return ingredients;
		}
	}

	@Override
	public void loadCraftingRecipes(ItemStack result) {
		if (result != null) {
			int id = getOutputID(result.getItem());
			List<TierRecipe> results = recipeList.get(id);
			if (results != null) {
				for (TierRecipe recipe : results) {
					this.arecipes.add(getShape(recipe));
					break;
				}
			}
		}
	}

	@Override
	public Class<? extends GuiContainer> getGuiClass() {
		return GuiCrafterTier.class;
	}

	@Override
	public String getRecipeName() {
		return "Assembly Table";
	}

	public String getGuiTexture() {
		return "tc:textures/gui/gui_tierI_ironAge.png";
	}

	public String getGuiTexture(int tier) {
		if (tier == 1) {
			return "tc:textures/gui/gui_tierI_ironAge.png";
		} else if (tier == 2) {
			return "tc:textures/gui/gui_tierII_steelAge.png";
		} else if (tier == 3) {
			return "tc:textures/gui/gui_tierIII_advancedAge.png";
		}
		return "tc:textures/gui/gui_tierI_ironAge.png";
	}

	@Override
	public boolean hasOverlay(GuiContainer gui, Container container, int recipe) {
		return false;
	}

	public void drawBackground(int recipe) {
		GL11.glColor4f(1, 1, 1, 1);
		PositionedStack result = super.getResultStack(recipe);
		Item output = result.item.getItem();
		int id = getOutputID(output);

		List<TierRecipe> recipes = recipeList.get(id);

		TierRecipe tierRecipe = recipes != null && !recipes.isEmpty() ? recipes.get(0) : null;
		if (tierRecipe != null) {
			changeTexture(getGuiTexture(tierRecipe.getTier()));
		}
		drawTexturedModalRect(0, 0, 5, 11, 172, 133);
		if (tierRecipe != null) {
			drawString("Tier: " + tierRecipe.getTier(), 0, -11, 0x404040, false);
		}
	}

	@Override
	public int recipiesPerPage() {
		return 1;
	}

	@Override
	public void loadTransferRects() {
		transferRects.add(new RecipeTransferRect(new Rectangle(91, 100, 72, 10), "assembly tables"));
	}

	@Override
	public void loadUsageRecipes(ItemStack ingredient) {
		Set<Integer> outputIDs = new HashSet<>();
		for (List<TierRecipe> recipes : recipeList.values()) {
			for (TierRecipe recipe : recipes) {
				for (ItemStack source : recipe.getInput()) {
					int outputID = getOutputID(recipe.getOutput().getItem());
					if (!outputIDs.contains(outputID)) {
						if (NEIClientUtils.areStacksSameTypeCrafting(source, ingredient)) {
							outputIDs.add(outputID);
							this.arecipes.add(getShape(recipe));
							break;
						}
					}
				}
			}
		}
	}

	@Override
	public void loadCraftingRecipes(String outputId, Object... results) {
		if (outputId.equals("assembly tables") && getClass() == NEIAssemblyTableRecipePlugin.class) {
			for (List<TierRecipe> recipe : recipeList.values()) {
				this.arecipes.add(getShape(recipe.get(0)));
			}
		} else {
			super.loadCraftingRecipes(outputId, results);
		}
	}

	public static Map<Integer, List<TierRecipe>> assemblyListCleaner(List recipeList) {
		Map<Integer, List<TierRecipe>> sortedRecipes = new HashMap<>();

		for (int i = 0; i < recipeList.size(); i++) {
			if (recipeList.get(i) instanceof TierRecipe) {
				TierRecipe tierRecipe = (TierRecipe) recipeList.get(i);

				Item output = tierRecipe.getOutput().getItem();
				int id = getOutputID(output);

				List<TierRecipe> recipes = sortedRecipes.get(id);
				if (recipes == null) {
					recipes = new ArrayList<TierRecipe>();
					sortedRecipes.put(id, recipes);
				}
				recipes.add(tierRecipe);
			}
		}
		return sortedRecipes;
	}

	private static int getOutputID(Item pOutputItem) {
		return Item.getIdFromItem(pOutputItem);
	}
}