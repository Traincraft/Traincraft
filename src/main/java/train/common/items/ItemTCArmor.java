/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;
import train.common.Traincraft;
import train.common.library.Info;
import train.common.library.ItemIDs;

public class ItemTCArmor extends ItemArmor {
	public int color;
	private IIcon iconOverlay;
	public int updateTicks=0;
	private String iconName = "";
	
	public ItemTCArmor(String iconName, ArmorMaterial material, int par3, int par4, int color) {
		super(material, par3, par4);
		setCreativeTab(Traincraft.tcTab);
		this.color = color;
		this.iconName = iconName;
	}

	/**
     * Called by RenderBiped and RenderPlayer to determine the armor texture that 
     * should be use for the currently equiped item.
     * This will only be called on instances of ItemArmor. 
     * 
     * Returning null from this function will use the default value.
     * 
     * @param stack ItemStack for the equpt armor
     * @param entity The entity wearing the armor
     * @param slot The slot the armor is in
     * @param type The subtype, can be null or "overlay"
     * @return Path of texture to bind, or null to use default
     */
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if (stack.getItem() == ItemIDs.overalls.item) {
			return Info.resourceLocation+":"+Info.armorPrefix + "blue_overalls.png";
		}
		else if (stack.getItem() == ItemIDs.jacket.item) {
			return Info.resourceLocation+":"+Info.armorPrefix + "orange_jacket.png";
		}
		else if(stack.getItem() == ItemIDs.hat.item){
			return Info.resourceLocation+":"+Info.armorPrefix + "blue_hat.png";

		}
		else if(stack.getItem() == ItemIDs.hat_ticketMan_paintable.item || stack.getItem() == ItemIDs.jacket_ticketMan_paintable.item){
			if(type!=null){
				return (Info.resourceLocation+":"+Info.armorPrefix+"ticket_man_2.png");
			}
			return Info.resourceLocation+":"+Info.armorPrefix+"ticket_man_1.png";
		}else if(stack.getItem() == ItemIDs.pants_ticketMan_paintable.item){
			if(type!=null)return Info.resourceLocation+":"+Info.armorPrefix+"ticket_man_pants_2.png";
			return Info.resourceLocation+":"+Info.armorPrefix+"ticket_man_pants_1.png";
			
		}else if(stack.getItem() == ItemIDs.hat_driver_paintable.item || stack.getItem() == ItemIDs.jacket_driver_paintable.item){
			if(type!=null)return Info.resourceLocation+":"+Info.armorPrefix+"driver_"+2+".png";
			return Info.resourceLocation+":"+Info.armorPrefix+"driver_"+1+".png";
		}else if(stack.getItem() == ItemIDs.pants_driver_paintable.item){
			if(type!=null)return Info.resourceLocation+":"+Info.armorPrefix+"driver_pants_"+2+".png";
			return Info.resourceLocation+":"+Info.armorPrefix+"driver_pants_"+1+".png";
			
		}
		else{
			return super.getArmorTexture(stack, entity, slot, type);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean requiresMultipleRenderPasses() {
		return color!=0;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIconFromDamageForRenderPass(int par1, int par2) {
		return par2 == 1 ? this.iconOverlay : super.getIconFromDamageForRenderPass(par1, par2);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":armour/" + this.iconName);
		if(color!=0){
			this.iconOverlay = iconRegister.registerIcon(Info.modID.toLowerCase() + ":armour/" + this.iconName + "_overlay");
		}
	}

	@Override
	public void func_82813_b(ItemStack par1ItemStack, int par2)
	{
		if (color==0)
		{
			throw new UnsupportedOperationException("Can\'t dye!");
		}
		else
		{
			NBTTagCompound nbttagcompound = par1ItemStack.getTagCompound();

			if (nbttagcompound == null)
			{
				nbttagcompound = new NBTTagCompound();
				par1ItemStack.setTagCompound(nbttagcompound);
			}

			NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");

			if (!nbttagcompound.hasKey("display"))
			{
				nbttagcompound.setTag("display", nbttagcompound1);
			}

			nbttagcompound1.setInteger("color", par2);
		}
	}

	/**
	 * Remove the color from the specified armor ItemStack.
	 */
	@Override
	public void removeColor(ItemStack par1ItemStack)
	{
		if (color==0)
		{
			NBTTagCompound nbttagcompound = par1ItemStack.getTagCompound();

			if (nbttagcompound != null)
			{
				NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");

				if (nbttagcompound1.hasKey("color"))
				{
					nbttagcompound1.removeTag("color");
				}
			}
		}
	}

	/**
	 * Return whether the specified armor ItemStack has a color.
	 */
	@Override
	public boolean hasColor(ItemStack par1ItemStack)
	{
		return color != 0 && (par1ItemStack.hasTagCompound() && (par1ItemStack.getTagCompound().hasKey("display") && par1ItemStack.getTagCompound().getCompoundTag("display").hasKey("color")));
	}

	/**
	 * Return the color for the specified armor ItemStack.
	 */
	@Override
	public int getColor(ItemStack par1ItemStack)
	{
		if (color==0)
		{
			return -1;
		}
		else
		{
			NBTTagCompound nbttagcompound = par1ItemStack.getTagCompound();

			if (nbttagcompound == null)
			{
				return color;
			}
			else
			{
				NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");
				return nbttagcompound1 == null ? color : (nbttagcompound1.hasKey("color") ? nbttagcompound1.getInteger("color") : color);
			}
		}
	}
	@SideOnly(Side.CLIENT)
	@Override
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
		if(color==0)return 16777215;
        if (par2 > 0)
        {
            return 16777215;
        }
        else
        {
            int j = this.getColor(par1ItemStack);

            if (j < 0)
            {
                j = color;
            }

            return j;
        }
    }
}
