package train.common.library;

import net.minecraft.item.Item;
import net.minecraft.stats.Achievement;

public enum AchievementIDs {
	steel(new Item[] { ItemIDs.steel.itemID }),
	stake(new Item[] { ItemIDs.stake.itemID }),
	dieselFuel(new Item[] { ItemIDs.diesel.itemID }),
	electMotor(new Item[] { ItemIDs.electmotor.itemID }),
	dieselEngine(new Item[] { ItemIDs.dieselengine.itemID }),
	firebox(new Item[] { ItemIDs.firebox.itemID, ItemIDs.ironFirebox.itemID }),
	zeppelin(new Item[] { ItemIDs.zeppelin.itemID, ItemIDs.airship.itemID }),
	smallSteam(new Item[] { ItemIDs.minecartLoco3.itemID }),
	normalSteam(new Item[] { ItemIDs.minecartPower.itemID, ItemIDs.minecartLocoBR01_DB.itemID,
			ItemIDs.minecartLocoBR80_DB.itemID, ItemIDs.minecartLocoEr.itemID, ItemIDs.minecartLocoForneyRed.itemID,
			ItemIDs.minecartLocomogulBlue.itemID, }),
	passenger(new Item[] { ItemIDs.minecartPassenger5.itemID, ItemIDs.minecartPassengerBlue.itemID,
			ItemIDs.minecartPassenger2.itemID, ItemIDs.minecartCaboose.itemID, ItemIDs.minecartCaboose3.itemID,
			ItemIDs.minecartPassenger7.itemID, ItemIDs.minecartPassenger8_1class_DB.itemID,
			ItemIDs.minecartPassenger9_2class_DB.itemID }),
	freight(new Item[] { ItemIDs.minecartChest.itemID, ItemIDs.minecartGrain.itemID, ItemIDs.minecartWood.itemID,
			ItemIDs.minecartFreightCart2.itemID, ItemIDs.minecartOpenWagon.itemID, ItemIDs.minecartBoxCartUS.itemID,
			ItemIDs.minecartFreightCartSmall.itemID, ItemIDs.minecartFreightCartUS.itemID,
			ItemIDs.minecartFreightCenterBeam_Empty.itemID, ItemIDs.minecartFreightCenterBeam_Wood_1.itemID,
			ItemIDs.minecartFreightCenterBeam_Wood_2.itemID, ItemIDs.minecartFreightClosed.itemID,
			ItemIDs.minecartFreightClosed.itemID, ItemIDs.minecartFreightGondola_DB.itemID,
			ItemIDs.minecartFreightHopperUS.itemID, ItemIDs.minecartFreightOpen2.itemID,
			ItemIDs.minecartFreightTrailer.itemID, ItemIDs.minecartFreightWagon_DB.itemID,
			ItemIDs.minecartFreightWellcar.itemID, ItemIDs.minecartFreightWood2.itemID,
			ItemIDs.minecartOpenWagon.itemID }),
	liquid(new Item[] { ItemIDs.minecartWatertransp.itemID, ItemIDs.minecartTankWagon.itemID,
			ItemIDs.minecartTankWagon2.itemID, ItemIDs.minecartTankWagon_DB.itemID,
			ItemIDs.minecartTankWagonUS.itemID }),
	tender(new Item[] { ItemIDs.minecartTender.itemID, ItemIDs.minecartTenderBR01_DB.itemID,
			ItemIDs.minecartTenderEr.itemID, ItemIDs.minecartSteamRedTender.itemID }),
	diesel(new Item[] { ItemIDs.minecartGP7Red.itemID, ItemIDs.minecartShunter.itemID, ItemIDs.minecartChmE3.itemID,
			ItemIDs.minecartCD742.itemID, ItemIDs.minecartKof_DB.itemID, ItemIDs.minecartLocoSD70.itemID,
			ItemIDs.minecartV60_DB.itemID }),
	tram(new Item[] { ItemIDs.minecartTramWood.itemID, ItemIDs.minecartTramWood.itemID }),
	fast(new Item[] { ItemIDs.minecartVL10.itemID, ItemIDs.minecartBR_E69.itemID }),
	// heavySteam(new Item[] { ItemIDs.minecartHeavySteam.itemID }),//TODO put it back once Heavy
	// Steam is back
	workCart(new Item[] { ItemIDs.minecartWork.itemID, ItemIDs.minecartCabooseWork.itemID }),
	builder(new Item[] { ItemIDs.minecartBuilder.itemID }),
	// jukebox(new Item[] { ItemIDs.minecartJukeBoxCart.itemID }),

	openHearth(new Item[] { Item.getItemFromBlock(BlockIDs.openFurnaceIdle.blockID) }),
	trainWB(new Item[] { Item.getItemFromBlock(BlockIDs.trainWorkbench.blockID) }),
	assemblyTable(new Item[] { Item.getItemFromBlock(BlockIDs.assemblyTableI.blockID),
			Item.getItemFromBlock(BlockIDs.assemblyTableII.blockID),
			Item.getItemFromBlock(BlockIDs.assemblyTableIII.blockID) }),
	engineer(new Item[] { ItemIDs.overalls.itemID, ItemIDs.hat.itemID, ItemIDs.jacket.itemID }),
	woodenParts(new Item[] { ItemIDs.woodenBogie.itemID, ItemIDs.woodenCab.itemID, ItemIDs.woodenFrame.itemID,
			ItemIDs.seats.itemID }),
	ironParts(new Item[] { ItemIDs.ironBogie.itemID, ItemIDs.ironBoiler.itemID, ItemIDs.ironCab.itemID,
			ItemIDs.ironChimney.itemID, ItemIDs.ironFirebox.itemID, ItemIDs.ironFrame.itemID }),
	steelParts(new Item[] { ItemIDs.bogie.itemID, ItemIDs.steelcab.itemID, ItemIDs.steelchimney.itemID,
			ItemIDs.steelframe.itemID, ItemIDs.boiler.itemID, ItemIDs.firebox.itemID }),
	plastic(new Item[] { ItemIDs.rawPlastic.itemID }),
	fineCopperWire(new Item[] { ItemIDs.copperWireFine.itemID }),
	electronicCircuit(new Item[] { ItemIDs.electronicCircuit.itemID }),
	generator(new Item[] { ItemIDs.generator.itemID }),
	cherepanov(new Item[] { ItemIDs.minecartLocoCherepanov.itemID }),
	minetrain(new Item[] { ItemIDs.minecartLocoMineTrain.itemID }),
	flatCart(new Item[] { ItemIDs.minecartFlatCart.itemID, ItemIDs.minecartFlatCart_DB.itemID,
			ItemIDs.minecartFlatCartLogs_DB.itemID, ItemIDs.minecartFlatCartRail_DB.itemID,
			ItemIDs.minecartFlatCartSU.itemID, ItemIDs.minecartFlatCartUS.itemID,
			ItemIDs.minecartFlatCartWoodUS.itemID }),
	mail(new Item[] { ItemIDs.minecartMailWagon_DB.itemID }),
	caboose(new Item[] { ItemIDs.minecartCaboose.itemID, ItemIDs.minecartCaboose3.itemID,
			ItemIDs.minecartCabooseWork.itemID }),
	stockCar(new Item[] { ItemIDs.minecartStockCar.itemID }),
	distilationTower(new Item[] { Item.getItemFromBlock(BlockIDs.distilIdle.blockID) });

	public Achievement	achievement;
	protected Item[]	items;
	
	public Item[] getItems() {
		return this.items;
	}
	
	private AchievementIDs(Item[] items) {
		this.items = items;
	}
}