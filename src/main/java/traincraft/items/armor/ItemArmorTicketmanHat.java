package traincraft.items.armor;

import javax.annotation.Nullable;

import net.minecraft.entity.Entity;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.common.util.EnumHelper;
import train.common.Traincraft;

public class ItemArmorTicketmanHat extends ItemArmor {
    
    public static final ArmorMaterial ARMOR_MATERIAL = EnumHelper.addArmorMaterial(Traincraft.MOD_ID + ":ticketman_hat", "ticketman_hat", 5, new int[]{1, 2, 2, 1}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
    public static final int DEFAULT_COLOR = 0x9fafb5;
    
    public ItemArmorTicketmanHat() {
        super(ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD);
    
        this.setCreativeTab(Traincraft.TAB);
    }
    
    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
        return Traincraft.MOD_ID + ":textures/armor/ticketman_hat.png";
    }
    
    @Override
    public boolean hasColor(ItemStack stack) {
        return true;
    }
    
    @Override
    public int getColor(ItemStack stack) {
        return stack.hasTagCompound() && stack.getTagCompound().hasKey("color", Constants.NBT.TAG_INT) ? stack.getTagCompound().getInteger("color") : DEFAULT_COLOR;
    }
    
    @Override
    public void removeColor(ItemStack stack) {
        this.setColor(stack, DEFAULT_COLOR);
    }
    
    @Override
    public void setColor(ItemStack stack, int color) {
        NBTTagCompound nbt = stack.hasTagCompound() ? stack.getTagCompound() : new NBTTagCompound();
        nbt.setInteger("color", color);
        stack.setTagCompound(nbt);
    }
}
