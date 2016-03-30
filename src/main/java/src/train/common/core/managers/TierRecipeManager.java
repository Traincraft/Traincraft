/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package src.train.common.core.managers;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;
import src.train.common.api.crafting.ITierCraftingManager;
import src.train.common.api.crafting.ITierRecipe;

public class TierRecipeManager implements ITierCraftingManager {

	private final List<TierRecipe> recipeList;
	private static TierRecipeManager instance = new TierRecipeManager();

	public TierRecipeManager() {
		recipeList = new ArrayList<TierRecipe>();
	}

	public static ITierCraftingManager getInstance() {
		return instance;
	}

	@Override
	public void addRecipe(ItemStack planks, ItemStack wheels, ItemStack frame, ItemStack coupler, ItemStack chimney, ItemStack cab, ItemStack boiler, ItemStack firebox, ItemStack additional, ItemStack dye, ItemStack output) {
		addRecipeFinal(1, planks, wheels, frame, coupler, chimney, cab, boiler, firebox, additional, dye, output, 1);
	}

	@Override
	public void addRecipe(int tier, ItemStack planks, ItemStack wheels, ItemStack frame, ItemStack coupler, ItemStack chimney, ItemStack cab, ItemStack boiler, ItemStack firebox, ItemStack additional, ItemStack dye, ItemStack output) {
		if (tier > 0 && tier < 4) {
			addRecipeFinal(tier, planks, wheels, frame, coupler, chimney, cab, boiler, firebox, additional, dye, output, 1);
		}
		else {
			addRecipeFinal(1, planks, wheels, frame, coupler, chimney, cab, boiler, firebox, additional, dye, output, 1);
		}
	}

	@Override
	public void addRecipe(ItemStack planks, ItemStack wheels, ItemStack frame, ItemStack coupler, ItemStack chimney, ItemStack cab, ItemStack boiler, ItemStack firebox, ItemStack additional, ItemStack dye, ItemStack output, int outputSize) {
		if (outputSize > 0 && outputSize < 65) {
			addRecipeFinal(1, planks, wheels, frame, coupler, chimney, cab, boiler, firebox, additional, dye, output, outputSize);
		}
		else {
			addRecipeFinal(1, planks, wheels, frame, coupler, chimney, cab, boiler, firebox, additional, dye, output, 1);
		}
	}

	@Override
	public void addRecipe(int tier, ItemStack planks, ItemStack wheels, ItemStack frame, ItemStack coupler, ItemStack chimney, ItemStack cab, ItemStack boiler, ItemStack firebox, ItemStack additional, ItemStack dye, ItemStack output, int outputSize) {
		if ((tier > 0 && tier < 4) && outputSize > 0 && outputSize < 65) {
			addRecipeFinal(tier, planks, wheels, frame, coupler, chimney, cab, boiler, firebox, additional, dye, output, outputSize);
		}
		else {
			addRecipeFinal(1, planks, wheels, frame, coupler, chimney, cab, boiler, firebox, additional, dye, output, 1);
		}
	}

	public void addRecipeFinal(int tier, ItemStack planks, ItemStack wheels, ItemStack frame, ItemStack coupler, ItemStack chimney, ItemStack cab, ItemStack boiler, ItemStack firebox, ItemStack additional, ItemStack dye, ItemStack output, int outputSize) {
		//if(!recipeAlreadyExists(tier, planks, wheels, frame, coupler, chimney, cab, boiler, firebox, additional, dye, output)) {
		recipeList.add(new TierRecipe(tier, planks, wheels, frame, coupler, chimney, cab, boiler, firebox, additional, dye, output, outputSize));
		/*
		 * } else { Traincraft.tcLog.log(Level.SEVERE, "Recipe already exists, skipping: " + output.getDisplayName() + " : " + output.getItemName()); } */
	}

	private boolean recipeAlreadyExists(int tier, ItemStack planks, ItemStack wheels, ItemStack frame, ItemStack coupler, ItemStack chimney, ItemStack cab, ItemStack boiler, ItemStack firebox, ItemStack additional, ItemStack dye, ItemStack output) {
		boolean exists = false;
		List list = new ArrayList(this.recipeList);
		List checks = new ArrayList();
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(0, planks);
		items.add(1, wheels);
		items.add(2, frame);
		items.add(3, coupler);
		items.add(4, chimney);
		items.add(5, cab);
		items.add(6, boiler);
		items.add(7, firebox);
		items.add(8, additional);
		items.add(9, dye);
		for (int i = 0; i < list.size(); i++) {
			TierRecipe recipe = (TierRecipe) list.get(i);
			for (int j = 0; j < 10; j++) {
				if (recipe.getRecipeIn(j) == null && items.get(j) == null) {
					checks.add(0);
				}
				else if (recipe.getRecipeIn(j) == null && items.get(j) != null || recipe.getRecipeIn(j) != null && items.get(j) == null) {
					checks.add(1);
				}
				else if (recipe.getRecipeIn(j).itemID == items.get(j).itemID) {
					checks.add(0);
				}
				else {
					checks.add(1);
				}
			}
			if (checks.contains(0) && recipe.getTier() == tier && recipe.getOutput().itemID == output.itemID) {
				exists = true;
				break;
			}
			else {
				checks = new ArrayList();
			}
		}
		return exists;
	}

	@Override
	public ITierRecipe getRecipe(ItemStack output) {
		List list = new ArrayList(this.recipeList);
		if (output != null) {
			for (int i = 0; i < list.size(); i++) {
				TierRecipe recipe = (TierRecipe) list.get(i);
				if (recipe != null && recipe.getOutput().itemID == output.itemID) {
					return recipe;
				}
			}
		}
		return null;
	}

	@Override
	public ITierRecipe getTierRecipe(int tier, ItemStack output) {
		List list = new ArrayList(this.recipeList);
		if (output != null) {
			for (int i = 0; i < list.size(); i++) {
				TierRecipe recipe = (TierRecipe) list.get(i);
				if ((recipe != null && recipe.getOutput().itemID == output.itemID) && (recipe.getTier() == tier)) {
					return recipe;
				}
			}
		}
		return null;
	}

	@Override
	public List<TierRecipe> getRecipeList() {
		List<TierRecipe> list = new ArrayList<TierRecipe>(this.recipeList);
		return list;
	}

	@Override
	public List<TierRecipe> getTierRecipeList(int tier) {
		List<TierRecipe> list = new ArrayList<TierRecipe>();
		for (int i = 0; i < recipeList.size(); i++) {
			if (((TierRecipe) recipeList.get(i)).getTier() == tier) {
				list.add(recipeList.get(i));
			}
		}
		return list;
	}

	@Override
	public int getRecipeSize() {
		return recipeList.size();
	}

	@Override
	public int getRecipeTierSize(int tier) {
		return getTierRecipeList(tier).size();
	}
}
