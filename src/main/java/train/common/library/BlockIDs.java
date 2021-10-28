/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.library;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import train.common.items.*;
import train.common.wellcar.ItemFortyFootContainer;

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
	switchStand(false, null),
	MFPBWigWag(false, null),
	waterWheel(true, ItemBlockGeneratorWaterWheel.class),
	windMill(true, ItemBlockGeneratorWindMill.class),
	generatorDiesel(true, ItemBlockGeneratorDiesel.class),
	mtcTransmitterSpeed(false, null),
	mtcTransmitterMTC(false, null),
	mtcATOStopTransmitter(false, null),
	mtcReceiverMTC(false, null),
	mtcReceiverDestination(false, null),
	pdmInstructionBlock(false, null),
	//Liquids
	diesel(false, ItemBlockFluid.class),
	refinedFuel(false, ItemBlockFluid.class),
	
	tcRailGag(false,null),
	tcRail(false,null),
	bridgePillar(false,null),

	MILWSwitchStand(false, null),
	autoSwtichStand(false, null),
	owoSwitchStand(true,ItemBlockOWOSwitchStand.class),
	circleSwitchStand(false,null),
	owoYardSwitchStand(true,ItemBlockOWOYardSwitch.class),
	overheadWire(false,null),
	overheadWireDouble(false,null),
	poweredGravel(false,null),
	snowGravel(false,null),
	signalSpanish(false,null),//ItemsignalSpanish.class
	trackConcrete(false,null),
	kSignal(false,null),
	FortyFootContainer(true, ItemFortyFootContainer.class),
	speedSign(false, null),
	dirtyBallast(false,null),
	dirtierBallast(false,null),
	;

	public Block block;
	public boolean hasItemBlock;
	public Class itemBlockClass;

	BlockIDs(boolean hasItemBlock, Class<? extends ItemBlock> itemBlockClass) {
		this.hasItemBlock = hasItemBlock;
		this.itemBlockClass = itemBlockClass;
	}
}
