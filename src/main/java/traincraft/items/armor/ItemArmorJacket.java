/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("ItemArmorJacket.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.items.armor;

import net.minecraft.entity.Entity;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import traincraft.Traincraft;

import javax.annotation.Nullable;

public class ItemArmorJacket extends ItemArmor {
    
    public static final ArmorMaterial ARMOR_MATERIAL = EnumHelper.addArmorMaterial(Traincraft.MOD_ID + ":jacket", "jacket", 5, new int[]{1, 2, 2, 1}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
    
    public ItemArmorJacket(){
        super(ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST);
        this.setRegistryName(Traincraft.MOD_ID, "armor_jacket");
        this.setTranslationKey(this.getRegistryName().toString());
        
        this.setCreativeTab(Traincraft.TAB);
    }
    
    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type){
        return Traincraft.MOD_ID + ":textures/armor/orange_jacket.png";
    }
    
}
