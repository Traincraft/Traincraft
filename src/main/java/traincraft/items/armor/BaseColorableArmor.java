/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("BaseColorableArmor.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.items.armor;

import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.entity.Entity;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.common.util.EnumHelper;
import traincraft.Traincraft;

import javax.annotation.Nullable;

public class BaseColorableArmor extends ItemArmor implements IItemColor {
    
    public static final ArmorMaterial DRIVER = EnumHelper.addArmorMaterial(Traincraft.MOD_ID + ":driver", "driver", 5, new int[]{1, 2, 2, 1}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
    public static final int DRIVER_HAT_DEFAULT_COLOR = 0x1469d9;
    public static final int DRIVER_JACKET_DEFAULT_COLOR = 0x1469d9;
    public static final int DRIVER_PANTS_DEFAULT_COLOR = 0x1535d4;
    public static final ArmorMaterial TICKETMAN = EnumHelper.addArmorMaterial(Traincraft.MOD_ID + ":ticketman", "ticketman", 5, new int[]{1, 2, 2, 1}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
    public static final int TICKETMAN_HAT_DEFAULT_COLOR = 0x9fafb5;
    public static final int TICKETMAN_JACKET_DEFAULT_COLOR = 0x002cdb;
    public static final int TICKETMAN_PANTS_DEFAULT_COLOR = 0xdedede;
    
    private final boolean hasOverlay;
    private final int defaultColor;
    private final String textureName;
    
    public BaseColorableArmor(ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn, String name, String textureName, int defaultColor, boolean hasOverlay){
        super(materialIn, 0, equipmentSlotIn);
        this.hasOverlay = hasOverlay;
        this.defaultColor = defaultColor;
        this.textureName = textureName;
        
        ResourceLocation registryName = new ResourceLocation(Traincraft.MOD_ID, name);
        this.setRegistryName(registryName);
        this.setTranslationKey(registryName.toString());
        
        this.setCreativeTab(Traincraft.TAB);
    }
    
    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type){
        if(this.hasOverlay && "overlay".equals(type)){
            return String.format("%s:textures/armor/%s_overlay.png", Traincraft.MOD_ID, this.textureName);
        }
        return String.format("%s:textures/armor/%s.png", Traincraft.MOD_ID, this.textureName);
    }
    
    @Override
    public boolean hasColor(ItemStack stack){
        return true;
    }
    
    @Override
    public int getColor(ItemStack stack){
        return stack.hasTagCompound() && stack.getTagCompound().hasKey("color", Constants.NBT.TAG_INT) ? stack.getTagCompound().getInteger("color") : this.defaultColor;
    }
    
    @Override
    public void removeColor(ItemStack stack){
        this.setColor(stack, this.defaultColor);
    }
    
    @Override
    public void setColor(ItemStack stack, int color){
        NBTTagCompound nbt = stack.hasTagCompound() ? stack.getTagCompound() : new NBTTagCompound();
        nbt.setInteger("color", color);
        stack.setTagCompound(nbt);
    }
    
    @Override
    public int colorMultiplier(ItemStack stack, int tintIndex){
        return this.getColor(stack);
    }
}
