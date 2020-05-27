package traincraft.items.armor;

import net.minecraft.entity.Entity;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.common.util.EnumHelper;
import traincraft.Traincraft;

import javax.annotation.Nullable;

public class ItemArmorJacket extends ItemArmor {
    
    public static final ArmorMaterial ARMOR_MATERIAL = EnumHelper.addArmorMaterial(Traincraft.MOD_ID + ":jacket", "jacket", 5, new int[]{1, 2, 2, 1}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
    
    public ItemArmorJacket() {
        super(ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST);
        this.setRegistryName(Traincraft.MOD_ID, "armor_jacket");
    
        this.setCreativeTab(Traincraft.TAB);
    }
    
    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
        return Traincraft.MOD_ID + ":textures/armor/jacket.png";
    }
    
    @Override
    public boolean hasColor(ItemStack stack) {
        return stack.hasTagCompound() && stack.getTagCompound().hasKey("color", Constants.NBT.TAG_INT);
    }
    
    @Override
    public int getColor(ItemStack stack) {
        return stack.getTagCompound().getInteger("color");
    }
    
    @Override
    public void removeColor(ItemStack stack) {
        stack.getTagCompound().removeTag("color");
        if(stack.getTagCompound().isEmpty()){
            stack.setTagCompound(null);
        }
    }
    
    @Override
    public void setColor(ItemStack stack, int color) {
        NBTTagCompound nbt = stack.hasTagCompound() ? stack.getTagCompound() : new NBTTagCompound();
        nbt.setInteger("color", color);
        stack.setTagCompound(nbt);
    }
}
