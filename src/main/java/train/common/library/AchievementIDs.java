package train.common.library;

import net.minecraft.item.Item;
import net.minecraft.stats.Achievement;

public enum AchievementIDs {
	steel(new Item[] { ItemIDs.steel.item }),
	stake(new Item[] { ItemIDs.stake.item }),
	dieselFuel(new Item[] {ItemIDs.diesel.item }),
	electMotor(new Item[] { ItemIDs.electmotor.item }),
	dieselEngine(new Item[] { ItemIDs.dieselengine.item }),
	firebox(new Item[] { ItemIDs.firebox.item, ItemIDs.ironFirebox.item }),
	zeppelin(new Item[] { ItemIDs.zeppelin.item, ItemIDs.airship.item }),
	smallSteam(new Item[] { ItemIDs.minecartLoco3.item }),
	normalSteam(new Item[] { ItemIDs.minecartPower.item, ItemIDs.minecartLocoBR01_DB.item,
			ItemIDs.minecartLocoBR80_DB.item, ItemIDs.minecartLocoEr.item, ItemIDs.minecartLocoForneyRed.item,
			ItemIDs.minecartLocomogulBlue.item, }),
	passenger(new Item[] { ItemIDs.minecartPassenger5.item, ItemIDs.minecartPassengerBlue.item,
			ItemIDs.minecartPassenger2.item, ItemIDs.minecartCaboose.item, ItemIDs.minecartCaboose3.item,
			ItemIDs.minecartPassenger7.item, ItemIDs.minecartPassenger8_1class_DB.item,
			ItemIDs.minecartPassenger9_2class_DB.item }),
	freight(new Item[] { ItemIDs.minecartChest.item, ItemIDs.minecartGrain.item, ItemIDs.minecartWood.item,
			ItemIDs.minecartFreightCart2.item, ItemIDs.minecartOpenWagon.item, ItemIDs.minecartBoxCartUS.item,
			ItemIDs.minecartFreightCartSmall.item, ItemIDs.minecartFreightCartUS.item,
			ItemIDs.minecartFreightCenterBeam_Empty.item, ItemIDs.minecartFreightCenterBeam_Wood_1.item,
			ItemIDs.minecartFreightCenterBeam_Wood_2.item, ItemIDs.minecartFreightClosed.item,
			ItemIDs.minecartFreightClosed.item, ItemIDs.minecartFreightGondola_DB.item,
			ItemIDs.minecartFreightHopperUS.item, ItemIDs.minecartFreightOpen2.item,
			ItemIDs.minecartFreightTrailer.item, ItemIDs.minecartFreightWagon_DB.item,
			ItemIDs.minecartFreightWellcar.item, ItemIDs.minecartFreightWood2.item,
			ItemIDs.minecartOpenWagon.item }),
	liquid(new Item[] { ItemIDs.minecartWatertransp.item, ItemIDs.minecartTankWagon.item,
			ItemIDs.minecartTankWagon2.item, ItemIDs.minecartTankWagon_DB.item,
			ItemIDs.minecartTankWagonUS.item }),
	tender(new Item[] { ItemIDs.minecartTender.item, ItemIDs.minecartTenderBR01_DB.item,
			ItemIDs.minecartTenderEr.item, ItemIDs.minecartSteamRedTender.item }),
	diesel(new Item[] { ItemIDs.minecartGP7Red.item, ItemIDs.minecartShunter.item, ItemIDs.minecartChmE3.item,
			ItemIDs.minecartCD742.item, ItemIDs.minecartKof_DB.item, ItemIDs.minecartLocoSD70.item,
			ItemIDs.minecartV60_DB.item }),
	tram(new Item[] { ItemIDs.minecartTramWood.item, ItemIDs.minecartTramWood.item }),
	fast(new Item[] { ItemIDs.minecartVL10.item, ItemIDs.minecartBR_E69.item }),
	// heavySteam(new Item[] { ItemIDs.minecartHeavySteam.item }),//TODO put it back once Heavy
	// Steam is back
	workCart(new Item[] { ItemIDs.minecartWork.item, ItemIDs.minecartCabooseWork.item }),
	builder(new Item[] { ItemIDs.minecartBuilder.item }),
	jukebox(new Item[] { ItemIDs.minecartJukeBoxCart.item }),

	openHearth(new Item[] { Item.getItemFromBlock(BlockIDs.openFurnaceIdle.block) }),
	trainWB(new Item[] { Item.getItemFromBlock(BlockIDs.trainWorkbench.block) }),
	assemblyTable(new Item[] { Item.getItemFromBlock(BlockIDs.assemblyTableI.block),
			Item.getItemFromBlock(BlockIDs.assemblyTableII.block),
			Item.getItemFromBlock(BlockIDs.assemblyTableIII.block) }),
	engineer(new Item[] { ItemIDs.overalls.item, ItemIDs.hat.item, ItemIDs.jacket.item }),
	woodenParts(new Item[] { ItemIDs.woodenBogie.item, ItemIDs.woodenCab.item, ItemIDs.woodenFrame.item,
			ItemIDs.seats.item }),
	ironParts(new Item[] { ItemIDs.ironBogie.item, ItemIDs.ironBoiler.item, ItemIDs.ironCab.item,
			ItemIDs.ironChimney.item, ItemIDs.ironFirebox.item, ItemIDs.ironFrame.item }),
	steelParts(new Item[] { ItemIDs.bogie.item, ItemIDs.steelcab.item, ItemIDs.steelchimney.item,
			ItemIDs.steelframe.item, ItemIDs.boiler.item, ItemIDs.firebox.item }),
	plastic(new Item[] { ItemIDs.rawPlastic.item }),
	fineCopperWire(new Item[] { ItemIDs.copperWireFine.item }),
	electronicCircuit(new Item[] { ItemIDs.electronicCircuit.item }),
	generator(new Item[] { ItemIDs.generator.item }),
	cherepanov(new Item[] { ItemIDs.minecartLocoCherepanov.item }),
	minetrain(new Item[] { ItemIDs.minecartLocoMineTrain.item }),
	flatCart(new Item[] { ItemIDs.minecartFlatCart.item, ItemIDs.minecartFlatCart_DB.item,
			ItemIDs.minecartFlatCartLogs_DB.item, ItemIDs.minecartFlatCartRail_DB.item,
			ItemIDs.minecartFlatCartSU.item, ItemIDs.minecartFlatCartUS.item,
			ItemIDs.minecartFlatCartWoodUS.item }),
	mail(new Item[] { ItemIDs.minecartMailWagon_DB.item }),
	caboose(new Item[] { ItemIDs.minecartCaboose.item, ItemIDs.minecartCaboose3.item,
			ItemIDs.minecartCabooseWork.item }),
	stockCar(new Item[] { ItemIDs.minecartStockCar.item, ItemIDs.minecartDRWGStockCar.item }),
	distilationTower(new Item[] { Item.getItemFromBlock(BlockIDs.distilIdle.block) }),
	mtg(new Item[] {ItemIDs.minecartLUengine.item}),
	massTransit(new Item[] { ItemIDs.minecartClass345engine.item, ItemIDs.minecartDstockEngine.item, ItemIDs.minecartLocoRenfe446Motor.item }),
	cercanias(new Item[] { ItemIDs.minecartLocoRenfe446Motor.item,}),
	geared(new Item[] { ItemIDs.minecartVBShay2.item, ItemIDs.minecartLocoSteamVBShay.item,
			ItemIDs.minecartLocoSteamShay.item, ItemIDs.minecartLocoSteamClimax.item,
			ItemIDs.minecartLocoLSSP7.item}),
	switchin(new Item[]{ItemIDs.minecartLocoSW8.item, ItemIDs.minecartLocoGP15.item}),
	powerful(new Item[]{ItemIDs.minecartLocoDD35A.item}),
	heavySteam(new Item[]{ItemIDs.minecartHeavySteam.item}),
	;

	public Achievement	achievement;
	protected Item[]	items;
	
	public Item[] getItems() {
		return this.items;
	}
	
	private AchievementIDs(Item[] items) {
		this.items = items;
	}
}