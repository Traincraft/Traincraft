/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.library;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import train.items.*;

public enum BlockIDs {

	signal(false, null),
	
	//book(true, ItemBlockBook.class),

	trainWorkbench(false, null),

	openFurnaceIdle(false, null),
	openFurnaceActive(false, null),
	lantern(false, null),
	switchStand(false, null),
	waterWheel(true, ItemBlockGeneratorWaterWheel.class),
	windMill(true, ItemBlockGeneratorWindMill.class),
	generatorDiesel(true, ItemBlockGeneratorDiesel.class),
	pdmInstructionBlock(false, null),
	//Liquids
	//diesel(false, ItemBlockFluid.class),
	//refinedFuel(false, ItemBlockFluid.class),

	bridgePillar(false,null);


	public Block block;
	public boolean hasItemBlock;
	public Class itemBlockClass;

	BlockIDs(boolean hasItemBlock, Class<? extends ItemBlock> itemBlockClass) {
		this.hasItemBlock = hasItemBlock;
		this.itemBlockClass = itemBlockClass;
	}
}
