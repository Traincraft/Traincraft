package src.train.common.library;

import net.minecraft.stats.Achievement;

public enum AchievementIDs {
	steel(new int[] { ItemIDs.steel.item.itemID }),
	stake(new int[] { ItemIDs.stake.item.itemID }),
	dieselFuel(new int[] { ItemIDs.diesel.item.itemID }),
	electMotor(new int[] { ItemIDs.electmotor.item.itemID }),
	dieselEngine(new int[] { ItemIDs.dieselengine.item.itemID }),
	firebox(new int[] { ItemIDs.firebox.item.itemID, ItemIDs.ironFirebox.item.itemID }),
	zeppelin(new int[] { ItemIDs.zeppelin.item.itemID,ItemIDs.airship.item.itemID }),
	smallSteam(new int[] { ItemIDs.minecartLoco3.item.itemID }),
	normalSteam(new int[] { ItemIDs.minecartPower.item.itemID, ItemIDs.minecartLocoBR01_DB.item.itemID, ItemIDs.minecartLocoBR80_DB.item.itemID, ItemIDs.minecartLocoEr.item.itemID, ItemIDs.minecartLocoForneyRed.item.itemID, ItemIDs.minecartLocomogulBlue.item.itemID, }),
	passenger(new int[] { ItemIDs.minecartPassenger5.item.itemID, ItemIDs.minecartPassengerBlue.item.itemID, ItemIDs.minecartPassenger2.item.itemID, ItemIDs.minecartCaboose.item.itemID, ItemIDs.minecartCaboose3.item.itemID, ItemIDs.minecartPassenger7.item.itemID, ItemIDs.minecartPassenger8_1class_DB.item.itemID, ItemIDs.minecartPassenger9_2class_DB.item.itemID }),
	freight(new int[] { ItemIDs.minecartChest.item.itemID, ItemIDs.minecartGrain.item.itemID, ItemIDs.minecartWood.item.itemID, ItemIDs.minecartFreightCart2.item.itemID, ItemIDs.minecartOpenWagon.item.itemID, ItemIDs.minecartBoxCartUS.item.itemID, ItemIDs.minecartFreightCartSmall.item.itemID, ItemIDs.minecartFreightCartUS.item.itemID, ItemIDs.minecartFreightCenterBeam_Empty.item.itemID, ItemIDs.minecartFreightCenterBeam_Wood_1.item.itemID, ItemIDs.minecartFreightCenterBeam_Wood_2.item.itemID, ItemIDs.minecartFreightClosed.item.itemID, ItemIDs.minecartFreightClosed.item.itemID, ItemIDs.minecartFreightGondola_DB.item.itemID, ItemIDs.minecartFreightHopperUS.item.itemID, ItemIDs.minecartFreightOpen2.item.itemID, ItemIDs.minecartFreightTrailer.item.itemID, ItemIDs.minecartFreightWagon_DB.item.itemID, ItemIDs.minecartFreightWellcar.item.itemID, ItemIDs.minecartFreightWood2.item.itemID, ItemIDs.minecartOpenWagon.item.itemID }),
	liquid(new int[] { ItemIDs.minecartWatertransp.item.itemID, ItemIDs.minecartTankWagon.item.itemID, ItemIDs.minecartTankWagon2.item.itemID, ItemIDs.minecartTankWagon_DB.item.itemID, ItemIDs.minecartTankWagonUS.item.itemID }),
	tender(new int[] { ItemIDs.minecartTender.item.itemID, ItemIDs.minecartTenderBR01_DB.item.itemID, ItemIDs.minecartTenderEr.item.itemID, ItemIDs.minecartSteamRedTender.item.itemID }),
	diesel(new int[] { ItemIDs.minecartGP7Red.item.itemID, ItemIDs.minecartShunter.item.itemID, ItemIDs.minecartChmE3.item.itemID, ItemIDs.minecartCD742.item.itemID, ItemIDs.minecartKof_DB.item.itemID, ItemIDs.minecartLocoSD70.item.itemID, ItemIDs.minecartV60_DB.item.itemID }),
	tram(new int[] { ItemIDs.minecartTramWood.item.itemID, ItemIDs.minecartTramWood.item.itemID }),
	fast(new int[] { ItemIDs.minecartVL10.item.itemID, ItemIDs.minecartBR_E69.item.itemID }),
	//heavySteam(new int[] { ItemIDs.minecartHeavySteam.item.itemID }),//TODO put it back once Heavy Steam is back
	workCart(new int[] { ItemIDs.minecartWork.item.itemID, ItemIDs.minecartCabooseWork.item.itemID }),
	builder(new int[] { ItemIDs.minecartBuilder.item.itemID }),
	jukebox(new int[] { ItemIDs.minecartJukeBoxCart.item.itemID }),

	openHearth(new int[] { BlockIDs.openFurnaceIdle.block.blockID }),
	trainWB(new int[] { BlockIDs.trainWorkbench.block.blockID }),
	assemblyTable(new int[] { BlockIDs.assemblyTableI.block.blockID, BlockIDs.assemblyTableII.block.blockID, BlockIDs.assemblyTableIII.block.blockID }),
	engineer(new int[] { ItemIDs.overalls.item.itemID, ItemIDs.hat.item.itemID, ItemIDs.jacket.item.itemID }),
	woodenParts(new int[] { ItemIDs.woodenBogie.item.itemID, ItemIDs.woodenCab.item.itemID, ItemIDs.woodenFrame.item.itemID, ItemIDs.seats.item.itemID }),
	ironParts(new int[] { ItemIDs.ironBogie.item.itemID, ItemIDs.ironBoiler.item.itemID, ItemIDs.ironCab.item.itemID, ItemIDs.ironChimney.item.itemID, ItemIDs.ironFirebox.item.itemID, ItemIDs.ironFrame.item.itemID }),
	steelParts(new int[] { ItemIDs.bogie.item.itemID, ItemIDs.steelcab.item.itemID, ItemIDs.steelchimney.item.itemID, ItemIDs.steelframe.item.itemID, ItemIDs.boiler.item.itemID, ItemIDs.firebox.item.itemID }),
	plastic(new int[] { ItemIDs.rawPlastic.item.itemID }),
	fineCopperWire(new int[] { ItemIDs.copperWireFine.item.itemID }),
	electronicCircuit(new int[] { ItemIDs.electronicCircuit.item.itemID }),
	generator(new int[] { ItemIDs.generator.item.itemID }),
	cherepanov(new int[] { ItemIDs.minecartLocoCherepanov.item.itemID }),
	minetrain(new int[] { ItemIDs.minecartLocoMineTrain.item.itemID }),
	flatCart(new int[] { ItemIDs.minecartFlatCart.item.itemID, ItemIDs.minecartFlatCart_DB.item.itemID, ItemIDs.minecartFlatCartLogs_DB.item.itemID, ItemIDs.minecartFlatCartRail_DB.item.itemID, ItemIDs.minecartFlatCartSU.item.itemID, ItemIDs.minecartFlatCartUS.item.itemID, ItemIDs.minecartFlatCartWoodUS.item.itemID }),
	mail(new int[] { ItemIDs.minecartMailWagon_DB.item.itemID }),
	caboose(new int[] { ItemIDs.minecartCaboose.item.itemID, ItemIDs.minecartCaboose3.item.itemID, ItemIDs.minecartCabooseWork.item.itemID }),
	stockCar(new int[] { ItemIDs.minecartStockCar.item.itemID }),
	distilationTower(new int[] { BlockIDs.distilIdle.block.blockID });

	public Achievement achievement;
	protected int[] itemIds;

	public int[] getItemIds() {
		return itemIds;
	}

	AchievementIDs(int[] itemIds) {
		this.itemIds = itemIds;
	}
}