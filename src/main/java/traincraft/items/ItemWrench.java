/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("ItemWrench.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.items;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemWrench extends BaseItem {
    
    public ItemWrench(){
        super("wrench");
        this.maxStackSize = 1;
    }
    
    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
        if(!world.isRemote){
            player.swingArm(hand);
            IBlockState state = world.getBlockState(pos);
            state.getBlock().rotateBlock(world, pos, facing);
        }
        return EnumActionResult.SUCCESS;
    }
    
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn){
        tooltip.add("\u00a77" + "Works same as a BuildCraft wrench.");
        tooltip.add("\u00a77" + "Use it to change lantern color.");
        tooltip.add("\u00a77" + "Use it to lock/unlock certain carts (passenger)");
        tooltip.add("\u00a77" + "Use it to remove locked trains (OP only)");
    }
    
    @Override
    public boolean doesSneakBypassUse(ItemStack stack, IBlockAccess world, BlockPos pos, EntityPlayer player){
        return true;
    }
    
}