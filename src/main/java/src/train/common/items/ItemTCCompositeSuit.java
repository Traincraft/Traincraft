/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package src.train.common.items;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import src.train.client.render.models.ModelColoredArmor;
import src.train.common.Traincraft;
import src.train.common.core.handlers.ChunkHandler;
import src.train.common.library.Info;
import src.train.common.library.ItemIDs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemTCCompositeSuit extends ItemTCArmor {
	/** The EnumArmorMaterial used for this ItemArmor */
	private final EnumArmorMaterial material;
	public ItemTCCompositeSuit(int par1, EnumArmorMaterial material, int par3, int par4, int color) {
		super(par1, material, par3, par4,color);
		this.material = material;
		setCreativeTab(Traincraft.tcTab);
		this.color = color;
		MinecraftForge.EVENT_BUS.register(this);
		
	}
	/*@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		if(stack.getItem() == ItemIDs.helmet_suit_paintable.item || stack.getItem() == ItemIDs.jacket_suit_paintable.item || stack.getItem() == ItemIDs.boots_suit_paintable.item){
			return Info.resourceLocation+":"+Info.armorPrefix+"composite_suit_"+layer+".png";
		}else if(stack.getItem() == ItemIDs.pants_suit_paintable.item){
			return Info.resourceLocation+":"+Info.armorPrefix+"composite_suit_pants_"+layer+".png";	
		}
		else{
			return "";
		}
	}*/
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
		if(stack.getItem() == ItemIDs.helmet_suit_paintable.item || stack.getItem() == ItemIDs.jacket_suit_paintable.item || stack.getItem() == ItemIDs.boots_suit_paintable.item){
			if(type!=null)return Info.resourceLocation+":"+Info.armorPrefix+"composite_suit_"+2+".png";
			return Info.resourceLocation+":"+Info.armorPrefix+"composite_suit_"+1+".png";
		}else if(stack.getItem() == ItemIDs.pants_suit_paintable.item){
			if(type!=null)return Info.resourceLocation+":"+Info.armorPrefix+"composite_suit_pants_"+2+".png";	
			return Info.resourceLocation+":"+Info.armorPrefix+"composite_suit_pants_"+1+".png";	
		}
		else{
			return "";
		}
	}
	/**
     * Return an item rarity from EnumRarity
     */
	@Override
	@SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.epic;
    }
	@Override
	public void onArmorTickUpdate(World world, EntityPlayer player,
			ItemStack stack) {
		super.onArmorTickUpdate(world, player, stack);
		updateTicks++;
		ItemStack armorHelmet = player.inventory.armorItemInSlot(3);
		if(armorHelmet!=null && armorHelmet.getItem() instanceof ItemTCCompositeSuit){
			ItemTCCompositeSuit itemarmor = (ItemTCCompositeSuit)armorHelmet.getItem();
			/**
			 * Helmet cures poison blindness, confusion
			 * allows water breathing
			 * and night vision
			 */
			if(itemarmor.getArmorMaterial() == Traincraft.instance.armorCompositeSuit){
				PotionEffect poison = player.getActivePotionEffect(Potion.poison);
				PotionEffect wither = player.getActivePotionEffect(Potion.wither);
				PotionEffect blindness = player.getActivePotionEffect(Potion.blindness);
				PotionEffect confusion = player.getActivePotionEffect(Potion.confusion);
				if(poison!=null){
					player.removePotionEffect(poison.getPotionID());
					armorHelmet.damageItem(5, player);
				}
				if(wither!=null){
					player.removePotionEffect(wither.getPotionID());
					armorHelmet.damageItem(5, player);
				}
				if(blindness!=null){
					player.removePotionEffect(blindness.getPotionID());
					armorHelmet.damageItem(5, player);
				}
				if(confusion!=null){
					player.removePotionEffect(confusion.getPotionID());
					armorHelmet.damageItem(5, player);
				}
				if(player.isInWater() && player.getActivePotionEffect(Potion.waterBreathing)==null){
					player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 10 * 20, 0));
					armorHelmet.damageItem(5, player);
				}
				//System.out.println(world.getBlockLightValue((int)player.posX, (int)player.posY+(int)player.getEyeHeight(), (int)player.posZ) +" "+world.isAirBlock((int)player.posX, (int)player.posY+(int)player.getEyeHeight(), (int)player.posZ) +" "+world.isAnyLiquid(player.boundingBox));
				if(!world.isRemote && world.getBlockLightValue((int)player.posX, (int)player.posY+(int)player.getEyeHeight(), (int)player.posZ)<=4 && (world.isAirBlock((int)player.posX, (int)player.posY+(int)player.getEyeHeight(), (int)player.posZ)||world.isAnyLiquid(player.boundingBox)) && player.getActivePotionEffect(Potion.nightVision)==null){
						player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 10 * 20, 0));
						armorHelmet.damageItem(1, player);
				}
			}
		}
		/**
		 * Chest heals half a heart every 100 ticks
		 */
		ItemStack armorChest = player.inventory.armorItemInSlot(2);
		if(armorChest!=null && armorChest.getItem() instanceof ItemTCCompositeSuit){
			ItemTCCompositeSuit itemarmor = (ItemTCCompositeSuit)armorChest.getItem();
			if(itemarmor.getArmorMaterial() == Traincraft.instance.armorCompositeSuit){
				if(player.getHealth()<player.getMaxHealth() && updateTicks%100==0){
					player.heal(1);
					armorChest.damageItem(1, player);
				}
			}
		}
		/**
		 * pants are fire resistant
		 */
		ItemStack armorPants = player.inventory.armorItemInSlot(1);
		if(armorPants!=null && armorPants.getItem() instanceof ItemTCCompositeSuit){
			ItemTCCompositeSuit itemarmor = (ItemTCCompositeSuit)armorPants.getItem();
			if(player.isBurning()){
				player.extinguish();
				if(updateTicks%5==0)armorPants.damageItem(1, player);
			}
			/*if(itemarmor.getArmorMaterial() == Traincraft.instance.armorCompositeSuit && armorPants.isItemEnchantable()){
				armorPants.addEnchantment(Enchantment.fireProtection, 3);
			}*/
		}

	}
	/**
	 * Initially projected to have a jump boost
	 */
	/*
	@ForgeSubscribe
	public void onEntityLivingJumpEvent(LivingJumpEvent event)
	{
		if(event.entity instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer)event.entity;
			ItemStack armor = player.inventory.armorItemInSlot(1);
			if(armor!=null && armor.getItem() instanceof ItemTCArmor){
				ItemTCArmor itemarmor = (ItemTCArmor)armor.getItem();
				if(itemarmor.getArmorMaterial() == Traincraft.instance.armorSuit){
					event.entity.motionY+=0.05;
					armor.damageItem(10, player);
				}
			}
		}
	}*/
	/**
	 * Boots protect against fall damage
	 */
	@ForgeSubscribe
	public void onEntityLivingFallEvent(LivingFallEvent event)
	{
		if(event.entity instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer)event.entity;
			ItemStack armor = player.inventory.armorItemInSlot(0);
			if(armor!=null && armor.getItem() instanceof ItemTCCompositeSuit){
				ItemTCCompositeSuit itemarmor = (ItemTCCompositeSuit)armor.getItem();
				if(itemarmor.getArmorMaterial() == Traincraft.instance.armorCompositeSuit){
					int fallDamage = (int)event.distance-3;
					if(fallDamage>0)armor.damageItem(10, player);
					event.setCanceled(true);
				}
			}
		}

	}
}
