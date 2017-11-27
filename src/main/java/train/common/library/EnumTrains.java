package train.common.library;

import net.minecraft.item.Item;
import net.minecraft.world.World;
import train.common.api.AbstractTrains;
import train.common.entity.rollingStock.*;

import java.lang.reflect.InvocationTargetException;

public enum EnumTrains {
	
	/** Passengers */
	passengerCartBlue("Passenger Blue",EntityPassengerBlue.class, ItemIDs.minecartPassengerBlue.item,"passenger",0,0,0.9,0,0,0,0,0,0,new String[] {"Blue","Red","Green", "White", "Black"},18, 0),
	passengerCartBlackSmall("Passenger Small Black",EntityPassenger2.class, ItemIDs.minecartPassenger2.item,"passenger",0,0,0.1,0,0,0,0,0,0,null,18,0),
	passengerLongGreen("Passenger Green Long",EntityPassenger5.class, ItemIDs.minecartPassenger5.item,"passenger",0,0,0.6,0,0,0,0,0,0,new String[]{"Green", "Yellow"},18,0),
	passengerShortGreen("Passenger Short Green",EntityPassenger7.class, ItemIDs.minecartPassenger7.item,"passenger",0,0,0.5,0,0,0,0,0,0,null,18,0),
	passenger_1class_DB("Passenger 1Class DB",EntityPassenger_1class_DB.class,ItemIDs.minecartPassenger8_1class_DB.item,"passenger",0,0,1.5,0,0,0,0,0,0,null,18,0),
	passenger_2class_DB("Passenger 2Class DB",EntityPassenger_2class_DB.class,ItemIDs.minecartPassenger9_2class_DB.item,"passenger",0,0,1,0,0,0,0,0,0,null,18,0),
	passengerHighSpeedZeroED("Passenger High Speed Zero ED",EntityPassengerHighSpeedCarZeroED.class, ItemIDs.minecartPassengerHighSpeedCarZeroED.item,"passenger",0,0,2,0,0,0,0,0,0,null,18,0),
	passengerTramNY("Passenger Tram NY",EntityPassengerTramNY.class, ItemIDs.minecartPassengerTramNY.item,"passenger",0,0,1,0,0,0,0,0,0,null,18,0),
	passengerAdler("Passenger Adler",EntityPassengerAdler.class, ItemIDs.minecartPassengerAdler.item,"passenger",0,0,1,0,0,0,0,0,0,null,18,0),
	//passengerDBOriental("pass_DB_oriental",EntityPassengerDBOriental.class, ItemIDs.minecartPassengerDBOriental.item,"train_tram_ny","passenger",0,0,1,0,0,0,0,0,0,null,18,null,null),
	passengerIC4_DSB_FG("Passenger IC4 DSB FG",PassengerIC4_DSB_FG.class, ItemIDs.minecartIC4_DSB_FG.item,"passenger, Unfinished, Creative Only",0,0,0.5,0,0,0,0,0,0,null,10,0),
	passengerIC4_DSB_FH("Passenger IC4 DSB FH",PassengerIC4_DSB_FH.class, ItemIDs.minecartIC4_DSB_FH.item,"passenger, Unfinished, Creative Only",0,0,0.5,0,0,0,0,0,0,null,10,0),
	passengerICE1_Class1("Passenger ICE 1st Class", EntityPassengerICE_1class.class,ItemIDs.minecartICE1_1stClass.item, "passenger", 0, 0, 0.5, 0, 0, 0, 0, 0, 0, null, 10, 0),
	passengerICE1_Class2("Passenger ICE 2nd Class", EntityPassengerICE_2class.class,ItemIDs.minecartICE1_2ndClass.item, "passenger", 0, 0, 0.5, 0, 0, 0, 0, 0, 0, null, 10, 0),
	passengerICE1_Restaurant("ICE Restaurant", EntityPassengerICE_Restaurant.class,
			ItemIDs.minecartICE1_Restaurant.item, "passenger", 0, 0, 0.5, 0, 0, 0, 0, 0, 0, null, 10, 0),
	passengerGS4("Passenger GS4",EntityPassengerGS4.class,ItemIDs.minecartGS4_Passenger.item,"passenger",0,0,0.5,0,0,0,0,0,0,new String[]{"Orange", "White", "Yellow"},10,0),
	passengerGS4Observatory("Passenger GS4 Observatory",EntityPassengerGS4_Observatory.class,ItemIDs.minecartGS4_Observatory.item,"passenger",0,0,0.5,0,0,0,0,0,0,new String[]{"Orange", "White", "Yellow"},10,0),
	passengerGS4_Tail("Passenger GS4 Tail",EntityPassengerGS4_Tail.class,ItemIDs.minecartGS4_Tail.item,"passenger",0,0,0.5,0,0,0,0,0,0,new String[]{"Orange", "White", "Yellow"},10,0),
	
	/** Caboose */
	cabooseRed("Caboose Red",EntityCaboose.class, ItemIDs.minecartCaboose.item,"caboose",0,0,0.5,0,0,0,0,0,0,null,18,0),
	cabooseBlack("Caboose Black",EntityCaboose3.class, ItemIDs.minecartCaboose3.item,"caboose",0,0,0.5,0,0,0,0,0,0,null,18,0),

	/** Specials **/
	stockCar("Stock Cart",EntityStockCar.class, ItemIDs.minecartStockCar.item,"special",0,0,2,0,0,0,0,0,0,new String [] {"Blue", "Red", "Yellow", "White"},18,0),
	drwgStockCar("DRWG Stock Cart",EntityStockCarDRWG.class, ItemIDs.minecartDRWGStockCar.item,"special",0,0,2,0,0,0,0,0,0,null,18,0),
	workCart("Work Cart Yellow",EntityWorkCart.class,ItemIDs.minecartWork.item,"work",0,0,0.7,0,0,0,0,0,0,null,18,0),
	flatCart("Flat Cart",EntityFlatCart.class, ItemIDs.minecartFlatCart.item,"flat",0,0,0.2,0,0,0,0,0,0,null,18,0),
	workCaboose("Work Caboose",EntityCabooseWorkCart.class, ItemIDs.minecartCabooseWork.item,"work",0,0,0.6,0,0,0,0,0,0,null,18,0),
	cabooseLogging("Caboose Logging",EntityCabooseLogging.class, ItemIDs.minecartCabooseLogging.item,"work",0,0,0.2,0,0,0,0,0,0,null,18,0),
	cabooseLoggingPRR("PRR Caboose Logging",EntityCabooseLoggingPRR.class, ItemIDs.minecartCabooseLoggingPRR.item,"work",0,0,0.2,0,0,0,0,0,0,new String [] {"Red", "Blue", "Green"},18,0),
	mailWagen_DB("Mail Wagon DB",EntityMailWagen_DB.class,ItemIDs.minecartMailWagon_DB.item,"work",0,0,1,0,0,0,0,0,0,null,18,0),
	jukeBoxCart("JukeBox Cart",EntityJukeBoxCart.class, ItemIDs.minecartJukeBoxCart.item,"special",0,0,0.2,0,0,0,0,0,0,null,18,0),
	flatCartSU("Flat Cart SU",EntityFlatCartSU.class, ItemIDs.minecartFlatCartSU.item,"flat",0,0,0.2,0,0,0,0,0,0,null,18,0),
	flatCartUS("Flat Cart US",EntityFlatCartUS.class, ItemIDs.minecartFlatCartUS.item,"flat",0,0,0.4,0,0,0,0,0,0,null,18,0),
	tracksBuilder("Tracks Builder",EntityTracksBuilder.class, ItemIDs.minecartBuilder.item,"special",0,0,0,0,0,0,0,0,0,null,14,0),
	flatCar_DB("Flat Cart DB",EntityFlatCar_DB.class,ItemIDs.minecartFlatCart_DB.item,"flat",0,0,0.2,0,0,0,0,0,0,null,18,0),
	BUnitEMDF7("EMD F7 B Unit", EntityBUnitEMDF7.class, ItemIDs.minecartLocoEMDF7B.item, "b-unit", 0, 0, -8, 0,
			0,
			0, 0, 0, 12000, new String[] { "Grey", "Black" }, 18, 0),
	BUnitEMDF3("EMD F3 B Unit", EntityBUnitEMDF3.class, ItemIDs.minecartLocoEMDF3B.item, "b-unit", 0, 0, -8, 0,
			0,
			0, 0, 0, 12000, null, 18, 0),
	BUnitDD35("DD35 B Unit", EntityBUnitDD35.class, ItemIDs.minecartLocoDD35B.item, "b-unit", 0, 0, -8, 0,
			0,
			0, 0, 0, 12000, null, 18, 0),

	/** Freight */
	freightCartRed("Freight Cart Red",EntityFreightCart2.class, ItemIDs.minecartFreightCart2.item,"freight",3,null,18,36,new String[] {"Cargo: any"}),
	freightCartYellow("Freight Cart Yellow",EntityFreightCart.class, ItemIDs.minecartChest.item,"freight",3,null,18,36,new String[] {"Cargo: any"}),
	freightWood("Freight Flat Cart Log",EntityFreightWood.class, ItemIDs.minecartWood.item,"freight",3,null,18,27,new String[] {"Cargo: only Logs"}),
	freightHopper("Freight Hopper Green",EntityFreightGrain.class, ItemIDs.minecartGrain.item,"freight",4,null,18, 36,new String[] {"Cargo: wheat, seeds"}),
	freightOpenWagon("Freight Open Wagon",EntityFreightOpenWagon.class,ItemIDs.minecartOpenWagon.item,"freight",2,null,18,36,new String[] {"Cargo: blocks, vanilla items"}),//"train_hopper" for open wagon => weird
	freightHopperUS("Freight Hopper US",EntityFreightHopperUS.class, ItemIDs.minecartFreightHopperUS.item,"freight",4,new String [] {"Brown","Grey"},18, 27, new String[] {"Cargo: blocks"}),
	flatCartWoodUS("Freight Flat Cart Wood US",EntityFlatCartWoodUS.class, ItemIDs.minecartFlatCartWoodUS.item,"freight",3,null,18, 27,new String[] {"Cargo: only planks"}),
	freightCartUS("Freight Cart US",EntityFreightCartUS.class, ItemIDs.minecartFreightCartUS.item,"freight",3.5,null,18,36,new String[] {"Cargo: blocks, vanilla items"}),
	freightBoxCartUS("Freight Box Cart US",EntityBoxCartUS.class, ItemIDs.minecartBoxCartUS.item,"freight",2,new String[]{"Brown", "Yellow", "Blue"},18,45,new String[] {"Cargo: any"}),
	freightBoxCartPRR("Freight Box Cart PRR",EntityBoxCartPRR.class, ItemIDs.minecartBoxCartPRR.item,"freight",2,null,18,45,new String[] {"Cargo: any"}),
	freightCartSmall("Freight Cart Small",EntityFreightCartSmall.class, ItemIDs.minecartFreightCartSmall.item,"freight",1,null,18,36,new String[] {"Cargo: any"}),
	freightMinetrain("Freight Minecart Yellow",EntityFreightMinetrain.class, ItemIDs.minecartMineTrain.item,"freight",0.5,null,18, 18,new String[] {"Cargo: opaque blocks"}),
	freightGTNG("Freight GTNG Ore Wagon",EntityFreightGTNG.class, ItemIDs.minecartFreightGTNG.item,"freight",0.5,null,18, 18,new String[] {"Cargo: opaque blocks"}),
	flatCartWoodLogs("Freight Flat Logs",EntityFreightWood2.class, ItemIDs.minecartFreightWood2.item,"freight",3,null,18,18,new String[] {"Cargo: only logs"}),
	freightClosedRedBrown("Freight Cart Closed RedBrown",EntityFreightClosed.class, ItemIDs.minecartFreightClosed.item,"freight",2.5,null,18,36,new String[] {"Cargo: any"}),
	freightOpenRedBrown("Freight Open RedBrown",EntityFreightOpen2.class, ItemIDs.minecartFreightOpen2.item,"freight",5,null,18,21,new String[] {"Cargo: any"}),
	freightWagen_DB("Freight Wagon DB",EntityFreightWagenDB.class,ItemIDs.minecartFreightWagon_DB.item,"freight",4,null,18, 54,new String[] {"Cargo: any"}),
	flatCarRails_DB("Freight Flat Cart Rails DB",EntityFlatCarRails_DB.class,ItemIDs.minecartFlatCartRail_DB.item,"freight",5,null,18, 36,new String[] {"Cargo: only rails"}),
	flatCarLogs_DB("Freight Flat Cart Logs DB",EntityFlatCarLogs_DB.class,ItemIDs.minecartFlatCartLogs_DB.item,"freight",4,null,18,45,new String[] {"Cargo: only logs"}),
	slateWagon("Freight Slate Wagon", EntityFreightSlateWagon.class, ItemIDs.minecartSlateWagon.item, "freight",
			0.5, null, 18, 38, new String[] { "Cargo: only stone and ores" }),
	freightCartGS4("Freight Cart GS4 Baggage",EntityFreightGS4_Baggage.class,ItemIDs.minecartGS4_Baggage.item,"freight",1,new String[]{"Orange", "White", "Yellow"},18,45,new String[] {"Cargo: any"}),
	freightGondola_DB("Freight Gondola DB",EntityFreightGondola_DB.class,ItemIDs.minecartFreightGondola_DB.item,"freight",3.5,null,18,45,new String[] {"Cargo: blocks, vanilla items"}),
	freightCenterBeam_Empty("Freight Center Beam Empty",EntityFreightCenterbeam_Empty.class, ItemIDs.minecartFreightCenterBeam_Empty.item,"freight",0.5,null,18,54,new String[] {"Cargo: any"}),
	freightCenterBeam_Wood1("Freight Center Beam Wood1",EntityFreightCenterbeam_Wood_1.class, ItemIDs.minecartFreightCenterBeam_Wood_1.item,"freight",3,null,18,54,new String[] {"Cargo: wood stuff"}),
	freightCenterBeam_Wood2("Freight Center Beam Wood2", EntityFreightCenterbeam_Wood_2.class, ItemIDs.minecartFreightCenterBeam_Wood_2.item, "freight", 3, null, 18,54, new String[] { "Cargo: wood stuff" }),
	freightWellcar("Freight Well Car",EntityFreightWellcar.class, ItemIDs.minecartFreightWellcar.item,"freight",3,new String[] {"Blue","Red","Green","LightGrey","Grey", "Yellow"},18,54,new String[] {"Cargo: any"}),
	freightTrailer("Freight Trailer",EntityFreightTrailer.class, ItemIDs.minecartFreightTrailer.item,"freight",3,new String[] {"Blue","Yellow","LightBlue","Red","Grey"},18,54,new String[] {"Cargo: any"}),

	/** Tanks **/
	tankWagon_DB("Tank Wagon DB",EntityTankWagon_DB.class,ItemIDs.minecartTankWagon_DB.item,"tank",0,0,6,0,0,0,0,0,50000,null,18,0,new String[] {"Capacity: 50000mb"}),
	tankWagonUS("Tank Wagon US",EntityTankWagonUS.class, ItemIDs.minecartTankWagonUS.item,"tank",0,0,6,0,0,0,0,0,70000,new String[]{"Black", "Grey"},18,0,new String[] {"Capacity: 70000mb"}),
	tankWagonGrey("Tank Wagon Grey",EntityTankWagon2.class,ItemIDs.minecartTankWagon2.item,"tank",0,0,3,0,0,0,0,0,40000,null,18,0,new String[] {"Capacity: 40000mb"}),
	tankCartLava("Tank Lava",EntityTankLava.class, ItemIDs.minecartWatertransp.item,"tank",0,0,5,0,0,0,0,0,30000,new String[] {"Empty","Full"},18,0,new String[] {"Capacity: 30000mb","Only lava"}),
	tankWagonYellow("Tank Wagon Yellow",EntityTankWagon.class, ItemIDs.minecartTankWagon.item,"tank",0,0,6,0,0,0,0,0,40000,null,18,0,new String[] {"Capacity: 40000mb"}),

	/** Tenders */
	tenderSmall("Tender Small Black",EntityTenderSmall.class, ItemIDs.minecartTender.item,"tender",0,0,0.1,0,0,0,0,0,5000,new String[]{"Black","Red","Blue","Green","Yellow"},18,0,new String[] {"Water capacity: 5000mb"}),
	 tenderHeavy("Tender Heavy",EntityTenderHeavy.class,
	 ItemIDs.minecartTenderHeavy.item,"tender",0,0,2,0,0,0,0,0,14000,null,18,0,new
	 String[] {"Water capacity: 14000mb"}),
	tenderGS4("Tender GS4",EntityTenderGS4.class, ItemIDs.minecartGS4_Tender.item,"tender",0,0,2,0,0,0,0,0,18000,new String[]{"Orange", "Blue"},18,0,new String[] {"Water capacity: 18000mb"}),
	tender4_4_0("Tender 4-4-0", EntityTender4_4_0.class,  ItemIDs.minecartSteamRedTender.item, "tender", 0, 0, 0.2,
			0, 0, 0, 0, 0, 8000, new String[] { "Black", "White", "Brown", "Blue", "Green", "Red", "Purple" }, 18, 0,
			new String[] { "Water capacity: 8000mb" }),
	tenderA4("Tender A4 Mallard", EntityTenderA4.class,  ItemIDs.minecartLocoA4MallardTender.item,"tender, Unfinished, Creative Only", 0, 0, 0.2, 0, 0, 0, 0, 0, 6000, new String[] { "Blue", "Lime", "Black", "Green", "White" }, 18,0, new String[] { "Water capacity: 6000mb" }),
	tenderBR01("Tender BR01",EntityTenderBR01_DB.class, ItemIDs.minecartTenderBR01_DB.item,"tender",0,0,0.5,0,0,0,0,0,20000,null,18,0,new String[] {"Water capacity: 20000mb"}),
	tenderCoranationClass("Tender Coranation Class",EntityTenderCoranationClass.class,ItemIDs.minecartLocoCoranationClassTender.item,"tender",0,0,0.5,0,0,0,0,0,20000,null,18,0,new String[] {"Water capacity: 20000mb"}),
	tenderEr_Ussr("Tender ER_USSR",EntityTenderEr_Ussr.class, ItemIDs.minecartTenderEr.item,"tender",0,0,2,0,0,0,0,0,16000,null,18,0,new String[] {"Water capacity: 16000mb"}),
	tenderC62Class("Tender C62Class", EntityTenderC62Class.class, ItemIDs.minecartTenderC62Class.item, "tender", 0,
			0, 0.5, 0, 0, 0, 0, 0, 14000, new String[] { "Black", "Red" }, 18, 0,
			new String[] { "Water capacity: 14000mb" }),
	tenderAdler("Tender Adler",EntityTenderAdler.class, ItemIDs.minecartTenderAdler.item,"tender",0,0,0.5,0,0,0,0,0,4000,null,18,0,new String[] {"Water capacity: 4000mb"}),

	/** Diesel */
	locoDieselKOF("Loco Diesel KOF DB",EntityLocoDieselKof_DB.class,ItemIDs.minecartKof_DB.item, "diesel",243,45,0,60,0,170,0.66,0.96,5000,new String[] {"Red","Green","Yellow","Black","Blue"},17,-1.6),
	locoDieselGP40("Loco Diesel CD742", EntityLocoDieselCD742.class,  ItemIDs.minecartCD742.item, "diesel", 1200, 90,
			0, 50, 0, 250, 0.8, 0.966, 10000, new String[] { "Yellow", "White" }, 15, -2.5),
	locoDieselChME3("Loco Diesel ChME3", EntityLocoDieselChME3.class,  ItemIDs.minecartChmE3.item,"diesel", 1318, 95, 0, 60, 0, 170, 0.66, 0.96, 5000, null, 15,  -1.2),
	locoDieselGP7Red("Loco Diesel GP7",EntityLocoDieselGP7Red.class, ItemIDs.minecartGP7Red.item,"diesel",1520,112,0,50,0,200,0.74,0.96,20000,new String[] {"Red","Blue","Black","Yellow"},15,-1.4),
	locoDieselSD40("Loco Diesel SD40",EntityLocoDieselSD40.class, ItemIDs.minecartLocoSD40.item,"diesel",3041,134,0,60,0,200,0.8,0.97,20000,new String[] {"Red","Yellow","Black","Green","Orange","Magenta","Blue"},10,-2.3),
	locoDieselSD70("Loco Diesel SD70",EntityLocoDieselSD70.class, ItemIDs.minecartLocoSD70.item,"diesel",4055,112,0,60,0,200,0.8,0.97,20000,new String[] {"Orange","Yellow","Red","Blue","Magenta","Black", "Pink"},10,-2.3),
	locoDieselShunter("Loco Diesel Shunter", EntityLocoDieselShunter.class,  ItemIDs.minecartShunter.item,"diesel", 354, 32, 0, 70, 0, 260, 0.6, 0.94, 8000,new String[] { "Blue", "Green", "Red", "Black" }, 14,  -2.58),
	locoDieselV60_DB("Loco Diesel V60 DB",EntityLocoDieselV60_DB.class, ItemIDs.minecartV60_DB.item,"diesel",648,60,0,60,0,170,0.66,0.96,8000,new String[] {"Red","Green","Yellow","Cyan"},15,-1.3),
	locoDieselIC4_DSB_MG("Loco Diesel IC4 DSB MG",EntityLocoDieselIC4_DSB_MG.class, ItemIDs.minecartIC4_DSB_MG.item,"diesel, Unfinished, Creative Only",760,200,0,60,0,200,0.8,0.97,20000,new String[] {"White","Red"},10,-6),
	locoDieselMILW_H1044("Loco Diesel MILW H10-44",EntityLocoDieselMILW_H1044.class,ItemIDs.minecartMILW_H1044.item,"diesel",1013,97,0,60,0,170,0.66,0.96,8000,null,15,-4.4),
	locoDieselEMDF7("Loco Diesel EMD F-7", EntityLocoDieselEMDF7.class, ItemIDs.minecartLocoEMDF7.item, "diesel",
			1520, 166, 0, 50, 0, 200, 0.8, 0.97, 12000, new String[] { "Grey", "Black" }, 10, -2.4),
	locoDieselEMDF3("Loco Diesel EMD F-3", EntityLocoDieselEMDF3.class, ItemIDs.minecartLocoEMDF3.item, "diesel",
			1100, 169, 0, 55, 0, 200, 0.8, 0.97, 12000, null, 10, -2.25),
	locoDieselEWSClass66("Loco Electric EWS Class 66", EntityLocoDieselClass66.class,
			ItemIDs.minecartLocoEWSClass66.item, "diesel", 3041, 121, 0, 10, 0, 170, 0.7, 0.965, 6400,
			new String[] { "Pink", "Green" }, 18, -6),
	locoDieselDeltic("Loco Diesel Deltic", EntityLocoDieselDeltic.class, ItemIDs.minecartLocoDeltic.item, "diesel",
			1673, 161, 0, 10, 0, 170, 0.7, 0.965, 6400, null, 18, -5),
	locoDieselDD35A("Loco Diesel DD35A", EntityLocoDieselDD35A.class, ItemIDs.minecartLocoDD35A.item, "diesel",
			1689, 144, 0, 10, 0, 170, 0.7, 0.965, 6850, null, 18, -4.75),

	/** Electric */
	locoElectricVL10("Loco Electric VL10", EntityLocoElectricVL10.class,  ItemIDs.minecartVL10.item, "electric", 6250, 100, 0, 8, 0, 400, 1.1, 0.956, 0, null, 14, -2.3),
	locoElectricBR_E69("Loco Electric BR_E69",EntityLocoElectricBR_E69.class, ItemIDs.minecartBR_E69.item,"electric",400,50,0,5,0,400,0.9,0.946,0,new String[] {"Green","Red","Black","Grey"},18,0),
	locoElectricMineTrain("Loco Electric Minetrain",EntityLocoElectricMinetrain.class,ItemIDs.minecartLocoMineTrain.item,"electric",500,40,0,80,0,160,0.5,0.97,0,null,18,-1),
	locoElectricSpeedZeroED("Loco Electric High Speed ZeroED", EntityLocoElectricHighSpeedZeroED.class, ItemIDs.minecartLocoHighSpeedZeroED.item, "electric", 700, 237, 0, 3, 0,230, 1.4, 0.98, 0, null, 13,  -3.4),
	locoElectricICE1("Loco Electric ICE 1", EntityLocoElectricICE1.class, ItemIDs.minecartICE1_Loco.item,
			"electric", 13080, 280, 0, 4, 0, 250, 1.5, 0.98, 0, null, 13, -5),
	//locoSpeedGrey("Loco High Speed",EntityLocoElectricNewHighSpeedLoco.class, null,null),
	locoElectricTramYellow("Loco Electric Yellow Wood Tram",EntityLocoElectricTramWood.class, ItemIDs.minecartTramWood.item,"electric",300,55,0,10,0,140,0.5,0.965,0,null,14,-2),
	locoElectricTramNY("Loco Electric Tram NY", EntityLocoElectricTramNY.class,  ItemIDs.minecartNYTram.item,
			"electric", 149, 89, 0, 10, 0, 170, 0.7, 0.965, 0, null, 18, -3),
	locoElectricBR185("Loco Electric BR 185", EntityLocoElectricBR185.class, ItemIDs.minecartLocoBR185.item,
			"electric", 7604, 140, 0, 10, 0, 170, 0.7, 0.965, 0, null, 18, -5),
	locoElectricClass85("Loco Electric Class 85", EntityLocoElectricClass85.class,
			ItemIDs.minecartLocoClass85.item, "electric", 3244, 160, 0, 10, 0, 170, 0.7, 0.965, 0, null, 18, -5),

	/** Steam */
	locoSteamA4("Loco Steam A4 Mallard", EntityLocoSteamMallardA4.class,  ItemIDs.minecartLocoA4Mallard.item, "steam, Unfinished, Creative Only", 639, 140, 0, 60, 150, 160, 0.65, 0.97, 10000, new String[] { "Blue", "Lime", "Black", "Green", "White" }, 7, -2.5 ),
	locoSteamCherepanov("Loco Steam Cherepanov",EntityLocoSteamCherepanov.class, ItemIDs.minecartLocoCherepanov.item,"steam",150,30,0,40,120,120,0.3D,0.98D,3000,null,18,-1.7),
	locoSteamBR80("Loco Steam BR80",EntityLocoSteamBR80_DB.class,ItemIDs.minecartLocoBR80_DB.item,"steam",350,45,0,100,130,135,0.45,0.97,7000,new String [] {"Black", "Green"},16,-1.1),
	locoSteam4_4_0("Loco Steam 4-4-0",EntityLocoSteam4_4_0.class, ItemIDs.minecartPower.item,"steam",400,50,0,40,160,190,0.65,0.95,5000,new String[] {"Red","White","Blue","Brown","Green","Black", "Purple"},16,-2),
	locoSteamSmall("Loco Steam Small",EntityLocoSteamSmall.class,  ItemIDs.minecartLoco3.item, "steam",250,45,0,140,140,160,0.5D,0.968D,5000,new String[] {"Blue","Red","Green","Yellow","Black"},18,-1.7),
	//locoHeavySteam("Loco Steam Heavy",EntityLocoHeavySteam.class,"train_steam_heavy",null),//removed
	locoSteamC62Class("Loco Steam C62Class", EntityLocoSteamC62Class.class,  ItemIDs.minecartLocoC62Class.item,
			"steam", 500, 129, 0, 60, 180, 160, 0.7, 0.97, 10000, new String[] { "Black", "Red" }, 7, -5.66),
	locoSteamBR01_DB("Loco Steam BR01", EntityLocoSteamBR01_DB.class, ItemIDs.minecartLocoBR01_DB.item,"steam", 700, 120, 0, 60, 200, 300, 0.6, 0.97, 10000, null, 10,  -3.7),
	locoSteamCoranationClass("Loco Steam Coranation Class", EntityLocoSteamCoranationClass.class,
			ItemIDs.minecartLocoCoranationClass.item, "steam", 1545, 183, 0, 60, 200, 300, 0.6, 0.97, 10000, null, 10,
			-6),
	locoSteamGS4("Loco Steam GS4", EntityLocoSteamGS4.class,  ItemIDs.minecartGS4_Loco.item, "steam", 800, 170, 0, 60, 350, 450, 0.6, 0.95, 88000, new String[]{"Orange", "Blue"}, 10, -5.5 ),
	locoSteamEr_USSR("Loco Steam ER_USSR", EntityLocoSteamEr_Ussr.class, ItemIDs.minecartLocoEr.item,"steam", 800, 80, 0, 80, 100, 200, 0.35, 0.975, 10000, null, 10, -3.7 ),
	locoSteamForney("Loco Steam Forney",EntityLocoSteamForneyRed.class, ItemIDs.minecartLocoForneyRed.item,"steam",600,70,0,60,160,130,0.44,0.968,8000,new String[] {"Red","Grey","Yellow","Brown","Blue","Green"},15,-1.35),
	locoSteamMogul("Loco Steam Mogul",EntityLocoSteamMogulBlue.class, ItemIDs.minecartLocomogulBlue.item,"steam",500,65,0,50,180,180,0.56,0.967,5000,new String[] {"Blue","Black","Brown","Green","Red","White"},15,-2.2),
	locoSteamShay("Loco Steam Shay",EntityLocoSteamShay.class, ItemIDs.minecartLocoSteamShay.item,"steam",250,50,0,50,160,130,0.5,0.968,4000,null,15,-1.5),
	locoSteamVBShay("Loco Steam VB Shay",EntityLocoSteamVBShay.class, ItemIDs.minecartLocoSteamVBShay.item,"steam",250,32,0,40,140,100,0.5,0.968,3000,null,15,-0.5),
	locoSteamClimax("Loco Steam Climax",EntityLocoSteamClimax.class, ItemIDs.minecartLocoSteamClimax.item,"steam",250,45,0,50,160,130,0.5,0.968,4000,null,15,-1.5),
	locoSteamAlice("Loco Steam Alice",EntityLocoSteamAlice0_4_0.class, ItemIDs.minecartLocoSteamAlice.item,"steam",200,32,0,60,160,200,0.5,0.968,3750,null,15,-2),
	locoSteamGLYN("Loco Steam glyn",EntityLocoSteamGLYN042T.class, ItemIDs.minecartLocoSteamGLYN.item,"steam",200,32,0,60,160,200,0.45,0.968,3750,null,15,-2.5),
	locoSteam262T("Loco Steam 262T",EntityLocoSteam262T.class, ItemIDs.minecartLocoSteam262T.item,"steam",300,70,0,60,160,300,0.5,0.968,4250,null,15,-3),
	locoSteam040VB("Loco Steam 040VB",EntityLocoSteam040VB.class, ItemIDs.minecartLocoSteam040vb.item,"steam",200,32,0,40,120,200,0.5,0.968,2500,null,15,-1.1),
	locoSteamAdler("Loco Steam Adler",EntityLocoSteamAdler.class, ItemIDs.minecartLocoSteamAdler.item,"steam",200,45,0,60,160,300,0.5,0.968,3000,null,15,-1.5);

//String trainType,int MHP,int maxSpeed, double mass, int fuelConsumption, int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, String[] colors,
	
	private String internalName;
	private Class entityClass;
	private Item item;
	private String trainType;
	private int MHP;
	private int maxSpeed;
	private double mass;
	private int fuelConsumption;
	private int waterConsumption;
	private int heatingTime;
	private double accelerationRate;
	private double brakeRate;
	private int tankCapacity;
	private String[] colors;
	private int guiRenderScale;
	private double bogieLocoPosition;
	private String[] additionnalTooltip;
	private int cargoCapacity;
	
	/**
	 * 
	 * @param internalName : Only used by EntityRegistry
	 * @param entityClass
	 * @param item
	 * @param trainType: "steam", "diesel", "freight", "passenger", "special", "flat", "electric"
	 * @param MHP: power of the locomotive
	 * @param maxSpeed
	 * @param mass (will be multiplied by 10 internally. That means putting 0.1 here will create a mass of 1 Ton in game)
	 * @param fuelConsumption: 1 unit is consumed every x ticks
	 * @param waterConsumption: 1 unit is consumed every x ticks
	 * @param heatingTime
	 * @param accelerationRate: generally around 0.45
	 * @param brakeRate: generally around 0.98
	 * @param tankCapacity
	 * @param colors: an array with all possible colors. Index 0 is used as default color when train is first spawned. leave null if no color available
	 * @param guiRenderScale: scale at which the entity will be rendered inside the GUI (crafting GUI)
	 */
	private EnumTrains(String internalName,Class entityClass, Item item, String trainType,int MHP,int maxSpeed, double mass, int fuelConsumption, int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, String[] colors, int guiRenderScale, double bogieLocoPosition){
		this.internalName = internalName;
		this.entityClass = entityClass;
		this.item = item;
		this.trainType=trainType;
		this.MHP=MHP;
		this.maxSpeed=maxSpeed;
		this.mass=mass;
		this.fuelConsumption=fuelConsumption;
		this.waterConsumption=waterConsumption;
		this.heatingTime=heatingTime;
		this.accelerationRate=accelerationRate;
		this.brakeRate=brakeRate;
		this.tankCapacity=tankCapacity;
		this.colors=colors;
		this.guiRenderScale = guiRenderScale;
		this.bogieLocoPosition = bogieLocoPosition;
	}
	
	/**
	 * Constructor for additionnal tooltips on the item
	 * @param internalName
	 * @param entityClass
	 * @param item
	 * @param trainType
	 * @param MHP
	 * @param maxSpeed
	 * @param mass
	 * @param fuelConsumption
	 * @param waterConsumption
	 * @param heatingTime
	 * @param accelerationRate
	 * @param brakeRate
	 * @param tankCapacity
	 * @param colors
	 * @param guiRenderScale
	 * @param bogieLocoPositions
	 * @param additionnalTooltip
	 */
	private EnumTrains(String internalName,Class entityClass, Item item, String trainType,int MHP,int maxSpeed, double mass, int fuelConsumption,int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, String[] colors, int guiRenderScale, double bogieLocoPositions, String[] additionnalTooltip){
		this.internalName = internalName;
		this.entityClass = entityClass;
		this.item = item;
		this.trainType=trainType;
		this.MHP=MHP;
		this.maxSpeed=maxSpeed;
		this.mass=mass;
		this.fuelConsumption=fuelConsumption;
		this.waterConsumption=waterConsumption;
		this.heatingTime=heatingTime;
		this.accelerationRate=accelerationRate;
		this.brakeRate=brakeRate;
		this.tankCapacity=tankCapacity;
		this.colors=colors;
		this.guiRenderScale = guiRenderScale;
		this.bogieLocoPosition = bogieLocoPositions;
		this.additionnalTooltip=additionnalTooltip;
	}
	
	/**
	 * Constructor for freight carts
	 * @param internalName
	 * @param entityClass
	 * @param item
	 * @param trainType
	 * @param mass
	 * @param colors
	 * @param guiRenderScale
	 * //@param bogieLocoPositions
	 * //@param bogieUtilityPositions
	 * @param cargoCapacity
	 * @param additionnalTooltip
	 */
	private EnumTrains(String internalName,Class entityClass, Item item, String trainType, double mass, String[] colors, int guiRenderScale, int cargoCapacity, String[] additionnalTooltip){
		this.internalName = internalName;
		this.entityClass = entityClass;
		this.item = item;
		this.trainType=trainType;
		this.mass=mass;
		this.colors=colors;
		this.guiRenderScale = guiRenderScale;
		this.additionnalTooltip=additionnalTooltip;
		this.cargoCapacity = cargoCapacity;
	}
	
	public String getInternalName(){
		return this.internalName;
	}
	
	public Item getItem(){
		return this.item;
	}

	public String getTrainType(){
		return this.trainType;
	}
	
	public int getMHP(){
		return this.MHP;
	}
	
	public int getMaxSpeed(){
		return this.maxSpeed;
	}
	
	public double getMass(){
		return this.mass;
	}
	
	public int getFuelConsumption(){
		return this.fuelConsumption;
	}
	
	public int getWaterConsumption(){
		return this.waterConsumption;
	}
	
	public int getHeatingTime(){
		return this.heatingTime;
	}
	
	public double getAccelerationRate(){
		return this.accelerationRate;
	}
	
	public double getBrakeRate(){
		return this.brakeRate;
	}
	
	public int getTankCapacity(){
		return this.tankCapacity;
	}
	
	public String[] getColors(){
		return this.colors;
	}
	
	public double getBogieLocoPosition(){
		return this.bogieLocoPosition;
	}

	
	public Class getEntityClass() {
		return this.entityClass;
	}
	
	public int getGuiRenderScale(){
		return this.guiRenderScale;
	}
	
	public String[] getAdditionnalTooltip(){
		return this.additionnalTooltip;
	}
	
	public int getCargoCapacity(){
		return cargoCapacity;
	}
	
	public static EnumTrains getCurrentTrain(Item item){
		if(item==null)return null;
		for (EnumTrains trains : EnumTrains.values()) {
			if(trains!=null && trains.getItem()!=null && trains.getItem() == item){
				return trains;
			}
		}
		return null;	
	}
	
	public static AbstractTrains getEntityWithItem(Item item, World world, double x, double y, double z){
		if(item==null)return null;
		for (EnumTrains trains : EnumTrains.values()) {
			if(trains!=null && trains.getItem()!=null && trains.getItem() == item){
				return trains.getEntity(world, x, y, z);
			}
		}
		return null;
	}
	
	public AbstractTrains getEntity(World world){
		try {
			return (AbstractTrains) entityClass.getConstructor(World.class).newInstance(world);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public AbstractTrains getEntity(World world, double x, double y, double z){
		try {
			return (AbstractTrains) entityClass.getConstructor(World.class,double.class,double.class,double.class).newInstance(world,x,y,z);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}
}