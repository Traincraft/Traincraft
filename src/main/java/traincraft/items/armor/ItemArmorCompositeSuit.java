/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("ItemArmorCompositeSuit.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.items.armor;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.IRarity;
import net.minecraftforge.common.util.EnumHelper;
import traincraft.Traincraft;

import javax.annotation.Nullable;
import java.util.Arrays;

public class ItemArmorCompositeSuit extends ItemArmor {
    
    public static final ArmorMaterial ARMOR_MATERIAL = EnumHelper.addArmorMaterial(Traincraft.MOD_ID + ":composite_suit", "composite_suit", 70, new int[]{2, 6, 5, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2);
    
    public ItemArmorCompositeSuit(EntityEquipmentSlot entityEquipmentSlot){
        super(ARMOR_MATERIAL, 0, entityEquipmentSlot);
        this.setRegistryName(Traincraft.MOD_ID, "armor_composite_suit_" + entityEquipmentSlot.getName());
        this.setTranslationKey(this.getRegistryName().toString());
        
        this.setCreativeTab(Traincraft.TAB);
    }
    
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair){
        return repair.getItem() == Items.DIAMOND;
    }
    
    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack stack){
        if(world.getTotalWorldTime() % 20 == 0){
            if(stack.getItem() instanceof ItemArmorCompositeSuit){
                EntityEquipmentSlot equipmentSlot = ((ItemArmorCompositeSuit) stack.getItem()).armorType;
                switch(equipmentSlot){
                    case HEAD:{
                        // remove potion effects for 5 damage
                        for(Potion potion : Arrays.asList(MobEffects.POISON, MobEffects.WITHER, MobEffects.BLINDNESS, MobEffects.NAUSEA)){
                            PotionEffect activePotionEffect = player.getActivePotionEffect(potion);
                            if(activePotionEffect != null && stack.getMaxDamage() - stack.getItemDamage() > 5){
                                player.removePotionEffect(potion);
                                stack.damageItem(5, player);
                            }
                        }
                        
                        if(player.isInWater() && stack.getMaxDamage() - stack.getItemDamage() > 1){
                            PotionEffect waterBreatingEffect = player.getActivePotionEffect(MobEffects.WATER_BREATHING);
                            if(waterBreatingEffect != null){
                                if(waterBreatingEffect.getDuration() < 300){
                                    player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 400 + (300 - waterBreatingEffect.getDuration())));
                                    stack.damageItem(1, player);
                                }
                            } else{
                                player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 400));
                                stack.damageItem(1, player);
                            }
                        }
                        
                        if(!world.isDaytime() && stack.getMaxDamage() - stack.getItemDamage() > 1){
                            PotionEffect nightVisionEffect = player.getActivePotionEffect(MobEffects.NIGHT_VISION);
                            if(nightVisionEffect != null){
                                if(nightVisionEffect.getDuration() < 300){
                                    player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 400 + (300 - nightVisionEffect.getDuration())));
                                    stack.damageItem(1, player);
                                }
                            } else{
                                player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 400));
                                stack.damageItem(1, player);
                            }
                        }
                        break;
                    }
                    case CHEST:{
                        if(player.getHealth() < player.getMaxHealth() && world.getTotalWorldTime() % 100 == 0){
                            if(stack.getMaxDamage() - stack.getItemDamage() > 1){
                                player.heal(1.0F);
                                stack.damageItem(1, player);
                            }
                        }
                        break;
                    }
                    case LEGS:{
                        if(player.getHealth() < player.getMaxHealth() && stack.getMaxDamage() - stack.getItemDamage() > 1){
                            if(player.isBurning()){
                                player.extinguish();
                                stack.damageItem(1, player);
                            }
                        }
                        break;
                    }
                    case FEET:{
                        if(!player.isInWater() && stack.getMaxDamage() - stack.getItemDamage() > 5){
                            PotionEffect effect = player.getActivePotionEffect(MobEffects.JUMP_BOOST);
                            if(effect != null){
                                if(effect.getDuration() < 300){
                                    player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 400 + (300 - effect.getDuration())));
                                    stack.damageItem(1, player);
                                }
                            } else{
                                player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 400));
                                stack.damageItem(1, player);
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type){
        if(slot != EntityEquipmentSlot.LEGS){
            String name = type != null ? "composite_suit_overlay.png" : "composite_suit.png";
            return Traincraft.MOD_ID + ":textures/armor/" + name;
        } else{
            String name = type != null ? "composite_suit_pants_overlay.png" : "composite_suit_pants.png";
            return Traincraft.MOD_ID + ":textures/armor/" + name;
        }
    }
    
    @Override
    public IRarity getForgeRarity(ItemStack stack){
        return EnumRarity.EPIC;
    }
    
}