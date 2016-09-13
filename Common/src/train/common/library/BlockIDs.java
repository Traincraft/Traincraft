/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package src.train.common.library;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import src.train.common.items.ItemBlockFluid;
import src.train.common.items.ItemBlockGeneratorDiesel;
import src.train.common.items.ItemBlockGeneratorWaterWheel;
import src.train.common.items.ItemBlockGeneratorWindMill;
import src.train.common.items.ItemBlockOreTC;

public enum BlockIDs {

	assemblyTableI(false, null),
	assemblyTableII(false, null),
	assemblyTableIII(false, null),

	distilIdle(false, null),
	distilActive(false, null),
	signal(false, null),
	
	//book(true, ItemBlockBook.class),

	trainWorkbench(false, null),

	stopper(false, null),

	openFurnaceIdle(false, null),
	openFurnaceActive(false, null),
	oreTC(true, ItemBlockOreTC.class),
	lantern(false, null),
	waterWheel(true, ItemBlockGeneratorWaterWheel.class),
	windMill(true, ItemBlockGeneratorWindMill.class),
	generatorDiesel(true, ItemBlockGeneratorDiesel.class),
	
	//Liquids
	diesel(false, ItemBlockFluid.class),
	refinedFuel(false, ItemBlockFluid.class),
	
	tcRailGag(false,null),
	tcRail(false,null),
	bridgePillar(false,null);

	public Block block;
	public int blockID;
	public boolean hasItemBlock;
	public Class itemBlockClass;

	BlockIDs(boolean hasItemBlock, Class<? extends ItemBlock> itemBlockClass) {
		this.hasItemBlock = hasItemBlock;
		this.itemBlockClass = itemBlockClass;
	}
}
