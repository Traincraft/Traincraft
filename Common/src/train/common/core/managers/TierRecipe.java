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
import net.minecraftforge.oredict.OreDictionary;
import src.train.common.api.crafting.ITierRecipe;

public class TierRecipe implements ITierRecipe {

	private final int tier;
	private final ItemStack planks;
	private final ItemStack wheels;
	private final ItemStack frame;
	private final ItemStack coupler;
	private final ItemStack chimney;
	private final ItemStack cab;
	private final ItemStack boiler;
	private final ItemStack firebox;
	private final ItemStack additional;
	private final ItemStack dye;
	private final ItemStack output;
	private final int outputSize;

	private final List<ItemStack> stacks;

	public TierRecipe(int tier, ItemStack planks, ItemStack wheels, ItemStack frame, ItemStack coupler, ItemStack chimney, ItemStack cab, ItemStack boiler, ItemStack firebox, ItemStack additional, ItemStack dye, ItemStack output, int outputSize) {
		this.tier = tier;
		this.planks = planks;
		this.wheels = wheels;
		this.frame = frame;
		this.coupler = coupler;
		this.chimney = chimney;
		this.cab = cab;
		this.boiler = boiler;
		this.firebox = firebox;
		this.additional = additional;
		this.dye = dye;
		this.output = output;
		this.outputSize = outputSize;

		stacks = new ArrayList<ItemStack>();

		stacks.add(0, planks);
		stacks.add(1, wheels);
		stacks.add(2, frame);
		stacks.add(3, coupler);
		stacks.add(4, chimney);
		stacks.add(5, cab);
		stacks.add(6, boiler);
		stacks.add(7, firebox);
		stacks.add(8, additional);
		stacks.add(9, dye);
	}

	@Override
	public int getTier() {
		return tier;
	}

	@Override
	public int getOutputSize() {
		return outputSize;
	}

	@Override
	public ItemStack getOutput() {
		return output;
	}

	@Override
	public String getRecipeName() {
		return output.getDisplayName();
	}

	@Override
	public ItemStack getRecipeIn(int slot) {
		ItemStack stack;
		switch (slot) {
		case 0:
			stack = planks;
		case 1:
			stack = wheels;
		case 2:
			stack = frame;
		case 3:
			stack = coupler;
		case 4:
			stack = chimney;
		case 5:
			stack = cab;
		case 6:
			stack = boiler;
		case 7:
			stack = firebox;
		case 8:
			stack = additional;
		case 9:
			stack = dye;
		default:
			stack = null;
		}
		return stack;
	}

	@Override
	public List<ItemStack> getInput() {
		List<ItemStack> list = getList(planks, wheels, frame, coupler, chimney, cab, boiler, firebox, additional, dye);
		return list;
	}

	public static List getList(ItemStack planks, ItemStack wheels, ItemStack frame, ItemStack coupler, ItemStack chimney, ItemStack cab, ItemStack boiler, ItemStack firebox, ItemStack additional, ItemStack dye) {
		List<ItemStack> list = new ArrayList<ItemStack>();
		list.add(0, planks);
		list.add(1, wheels);
		list.add(2, frame);
		list.add(3, coupler);
		list.add(4, chimney);
		list.add(5, cab);
		list.add(6, boiler);
		list.add(7, firebox);
		list.add(8, additional);
		list.add(9, dye);
		return list;
	}

	public ItemStack hasComponents(ItemStack planks, ItemStack wheels, ItemStack frame, ItemStack coupler, ItemStack chimney, ItemStack cab, ItemStack boiler, ItemStack firebox, ItemStack additional, ItemStack dye) {
		List<ItemStack> list = getList(planks, wheels, frame, coupler, chimney, cab, boiler, firebox, additional, dye);
		int x = 0;
		for (int i = 0; i < 10; i++) {
			if (areItemsIdentical(list.get(i), stacks.get(i)) && areSizesIdentical(list.get(i), stacks.get(i))) {
				x++;
			}
		}
		if (x == 10) {
			return output;
		}
		return null;
	}

	public static boolean areItemsIdentical(ItemStack inSlot, ItemStack inRecipe) {
		if (inRecipe == null) {
			return true;
		}
		else {
			if (inRecipe.getItemDamage() == OreDictionary.WILDCARD_VALUE) {
				if (inSlot == null && inRecipe != null) {
					return false;
				}
				if ((inSlot.itemID == inRecipe.itemID)) {
					return true;
				}
			}
			else {
				if (inSlot == null && inRecipe != null) {
					return false;
				}
				if ((inSlot.itemID == inRecipe.itemID) && (inSlot.getItemDamage() == inRecipe.getItemDamage())) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean areSizesIdentical(ItemStack inSlot, ItemStack inRecipe) {
		if (inRecipe == null) {
			return true;
		}
		if (inSlot == null && inRecipe != null) {
			return false;
		}
		if (inSlot.stackSize >= inRecipe.stackSize) {
			return true;
		}
		return false;
	}

	@Override
	public int toDecrease(int slot) {
		if (stacks.get(slot) != null) {
			return stacks.get(slot).stackSize;
		}
		return 0;
	}
}
