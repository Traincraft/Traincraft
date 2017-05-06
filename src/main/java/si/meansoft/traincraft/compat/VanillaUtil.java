/*
 * This file ("VanillaUtil.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2017
 */

package si.meansoft.traincraft.compat;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import javax.annotation.Nonnull;

/**
 * @author canitzp
 */
public class VanillaUtil {

    public static ItemStack getEmpty() {
        return null;
    }

    public static void decreaseStack(@Nonnull ItemStack stack, int count) {
        stack.stackSize -= count;
    }

    public static void increaseStack(@Nonnull ItemStack stack, int count) {
        stack.stackSize += count;
    }

    public static int getCount(ItemStack stack) {
        return stack.stackSize;
    }

    public static boolean isEmpty(ItemStack stack) {
        return stack != null;
    }

    public static ItemStack newStack(NBTTagCompound nbt) {
        return ItemStack.func_77949_a(nbt);
    }

}
