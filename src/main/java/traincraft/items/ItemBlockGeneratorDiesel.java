/*******************************************************************************
 * Copyright (c) 2013 Spitfire4466. All rights reserved.
 * 
 * @name TrainCraft
 * @author Spitfire4466
 ******************************************************************************/

package traincraft.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.IRarity;
import train.common.blocks.TCBlocks;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class ItemBlockGeneratorDiesel extends BaseItemBlock {

	public ItemBlockGeneratorDiesel() {
		super(TCBlocks.GENERATOR_DIESEL);
	}
	
	@Override
	public void addInformation(@Nonnull ItemStack stack, @Nullable World worldIn, List<String> tooltip, @Nonnull ITooltipFlag flagIn) {
		tooltip.add("\u00a77" + "RF generator.");
		tooltip.add("\u00a77" + "Max Production: 70 RF/t.");
		tooltip.add("\u00a77" + "Don't place 2 together.");
	}
	
	@Nonnull
	@Override
	public IRarity getForgeRarity(@Nonnull ItemStack stack) {
		return EnumRarity.RARE;
	}
}
