package train.common.library;

import net.minecraft.stats.Achievement;

public enum AchievementIDs {
	steel(new int[] { ItemIDs.steel.itemID }),
	stake(new int[] { ItemIDs.stake.itemID }),
	dieselFuel(new int[] { ItemIDs.diesel.itemID }),
	electMotor(new int[] { ItemIDs.electmotor.itemID }),
	dieselEngine(new int[] { ItemIDs.dieselengine.itemID }),
	firebox(new int[] { ItemIDs.firebox.itemID, ItemIDs.ironFirebox.itemID }),
	zeppelin(new int[] { ItemIDs.zeppelin.itemID,ItemIDs.airship.itemID }),
	smallSteam(new int[] { ItemIDs.minecartLoco3.itemID }),
	normalSteam(new int[] { ItemIDs.minecartPower.itemID, ItemIDs.minecartLocoBR01_DB.itemID, ItemIDs.minecartLocoBR80_DB.itemID, ItemIDs.minecartLocoEr.itemID, ItemIDs.minecartLocoForneyRed.itemID, ItemIDs.minecartLocomogulBlue.itemID, }),
	passenger(new int[] { ItemIDs.minecartPassenger5.itemID, ItemIDs.minecartPassengerBlue.itemID, ItemIDs.minecartPassenger2.itemID, ItemIDs.minecartCaboose.itemID, ItemIDs.minecartCaboose3.itemID, ItemIDs.minecartPassenger7.itemID, ItemIDs.minecartPassenger8_1class_DB.itemID, ItemIDs.minecartPassenger9_2class_DB.itemID }),
	freight(new int[] { ItemIDs.minecartChest.itemID, ItemIDs.minecartGrain.itemID, ItemIDs.minecartWood.itemID, ItemIDs.minecartFreightCart2.itemID, ItemIDs.minecartOpenWagon.itemID, ItemIDs.minecartBoxCartUS.itemID, ItemIDs.minecartFreightCartSmall.itemID, ItemIDs.minecartFreightCartUS.itemID, ItemIDs.minecartFreightCenterBeam_Empty.itemID, ItemIDs.minecartFreightCenterBeam_Wood_1.itemID, ItemIDs.minecartFreightCenterBeam_Wood_2.itemID, ItemIDs.minecartFreightClosed.itemID, ItemIDs.minecartFreightClosed.itemID, ItemIDs.minecartFreightGondola_DB.itemID, ItemIDs.minecartFreightHopperUS.itemID, ItemIDs.minecartFreightOpen2.itemID, ItemIDs.minecartFreightTrailer.itemID, ItemIDs.minecartFreightWagon_DB.itemID, ItemIDs.minecartFreightWellcar.itemID, ItemIDs.minecartFreightWood2.itemID, ItemIDs.minecartOpenWagon.itemID }),
	liquid(new int[] { ItemIDs.minecartWatertransp.itemID, ItemIDs.minecartTankWagon.itemID, ItemIDs.minecartTankWagon2.itemID, ItemIDs.minecartTankWagon_DB.itemID, ItemIDs.minecartTankWagonUS.itemID }),
	tender(new int[] { ItemIDs.minecartTender.itemID, ItemIDs.minecartTenderBR01_DB.itemID, ItemIDs.minecartTenderEr.itemID, ItemIDs.minecartSteamRedTender.itemID }),
	diesel(new int[] { ItemIDs.minecartGP7Red.itemID, ItemIDs.minecartShunter.itemID, ItemIDs.minecartChmE3.itemID, ItemIDs.minecartCD742.itemID, ItemIDs.minecartKof_DB.itemID, ItemIDs.minecartLocoSD70.itemID, ItemIDs.minecartV60_DB.itemID }),
	tram(new int[] { ItemIDs.minecartTramWood.itemID, ItemIDs.minecartTramWood.itemID }),
	fast(new int[] { ItemIDs.minecartVL10.itemID, ItemIDs.minecartBR_E69.itemID }),
	//heavySteam(new int[] { ItemIDs.minecartHeavySteam.itemID }),//TODO put it back once Heavy Steam is back
	workCart(new int[] { ItemIDs.minecartWork.itemID, ItemIDs.minecartCabooseWork.itemID }),
	builder(new int[] { ItemIDs.minecartBuilder.itemID }),
	// jukebox(new int[] { ItemIDs.minecartJukeBoxCart.itemID }),

	openHearth(new int[] { BlockIDs.openFurnaceIdle.blockID }),
	trainWB(new int[] { BlockIDs.trainWorkbench.blockID }),
	assemblyTable(new int[] { BlockIDs.assemblyTableI.blockID, BlockIDs.assemblyTableII.blockID, BlockIDs.assemblyTableIII.blockID }),
	engineer(new int[] { ItemIDs.overalls.itemID, ItemIDs.hat.itemID, ItemIDs.jacket.itemID }),
	woodenParts(new int[] { ItemIDs.woodenBogie.itemID, ItemIDs.woodenCab.itemID, ItemIDs.woodenFrame.itemID, ItemIDs.seats.itemID }),
	ironParts(new int[] { ItemIDs.ironBogie.itemID, ItemIDs.ironBoiler.itemID, ItemIDs.ironCab.itemID, ItemIDs.ironChimney.itemID, ItemIDs.ironFirebox.itemID, ItemIDs.ironFrame.itemID }),
	steelParts(new int[] { ItemIDs.bogie.itemID, ItemIDs.steelcab.itemID, ItemIDs.steelchimney.itemID, ItemIDs.steelframe.itemID, ItemIDs.boiler.itemID, ItemIDs.firebox.itemID }),
	plastic(new int[] { ItemIDs.rawPlastic.itemID }),
	fineCopperWire(new int[] { ItemIDs.copperWireFine.itemID }),
	electronicCircuit(new int[] { ItemIDs.electronicCircuit.itemID }),
	generator(new int[] { ItemIDs.generator.itemID }),
	cherepanov(new int[] { ItemIDs.minecartLocoCherepanov.itemID }),
	minetrain(new int[] { ItemIDs.minecartLocoMineTrain.itemID }),
	flatCart(new int[] { ItemIDs.minecartFlatCart.itemID, ItemIDs.minecartFlatCart_DB.itemID, ItemIDs.minecartFlatCartLogs_DB.itemID, ItemIDs.minecartFlatCartRail_DB.itemID, ItemIDs.minecartFlatCartSU.itemID, ItemIDs.minecartFlatCartUS.itemID, ItemIDs.minecartFlatCartWoodUS.itemID }),
	mail(new int[] { ItemIDs.minecartMailWagon_DB.itemID }),
	caboose(new int[] { ItemIDs.minecartCaboose.itemID, ItemIDs.minecartCaboose3.itemID, ItemIDs.minecartCabooseWork.itemID }),
	stockCar(new int[] { ItemIDs.minecartStockCar.itemID }),
	distilationTower(new int[] { BlockIDs.distilIdle.blockID });

	public Achievement achievement;
	protected int[] itemIds;

	public int[] getItemIds() {
		return itemIds;
	}

	AchievementIDs(int[] itemIds) {
		this.itemIds = itemIds;
	}
}