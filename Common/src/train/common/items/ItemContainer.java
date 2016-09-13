/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * 
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package src.train.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import src.train.common.Traincraft;
import src.train.common.library.Info;
import src.train.common.library.ItemIDs;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemContainer extends Item {

	public ItemContainer(int par1) {
		super(par1);
		maxStackSize = 64;
		setCreativeTab(Traincraft.tcTab);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":parts/" + ItemIDs.getIcon(this.itemID));
	}
	
	@Override
	public Item getContainerItem() {
		return ItemIDs.emptyCanister.item;
	}
	
	@Override
	public ItemStack getContainerItemStack(ItemStack itemStack) {
		return new ItemStack(ItemIDs.emptyCanister.item);
	}

}
