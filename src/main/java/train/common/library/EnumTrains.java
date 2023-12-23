package train.common.library;

import net.minecraft.util.EnumChatFormatting;
import train.common.api.TrainRecord;
import train.common.entity.rollingStock.*;

public class EnumTrains {

	/**
	 * Passengers
	 */
	public static TrainRecord[] trains() {
		return new TrainRecord[]{
				TrainRecord.makeEntry("passengerCartBlue", "Passenger Blue", EntityPassengerBlue.class, ItemIDs.minecartPassengerBlue.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Red", "Green", "White", "Black", "Cyan", "Orange", "Grey", "LightGrey", "Brown", "Pink", "Purple", "Lime", "Magenta", "LightBlue", "Yellow", "Skin17", "Skin19"}, 18, 0),
				TrainRecord.makeEntry("passengerCartBlackSmall", "Passenger Small Black", EntityPassenger2.class, ItemIDs.minecartPassenger2.item, "passenger", 0, 0, 0.5, 0, 0, 0, 0, 0, 0, null, 18, 0),
				TrainRecord.makeEntry("passengerLongGreen", "Passenger Green Long", EntityPassenger5.class, ItemIDs.minecartPassenger5.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Green", "Yellow"}, 18, 0),
				TrainRecord.makeEntry("passengerShortGreen", "Passenger Short Green", EntityPassenger7.class, ItemIDs.minecartPassenger7.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, null, 18, 0),
				TrainRecord.makeEntry("passenger_1class_DB", "Passenger 1Class DB", EntityPassenger_1class_DB.class, ItemIDs.minecartPassenger8_1class_DB.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, null, 18, 0),
				TrainRecord.makeEntry("passenger_2class_DB", "Passenger 2Class DB", EntityPassenger_2class_DB.class, ItemIDs.minecartPassenger9_2class_DB.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, new String[]{"Green", "Grey"}, 18, 0),
				TrainRecord.makeEntry("passengerHighSpeedZeroED", "Passenger High Speed Zero ED", EntityPassengerHighSpeedCarZeroED.class, ItemIDs.minecartPassengerHighSpeedCarZeroED.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, null, 18, 0),
				TrainRecord.makeEntry("passengerTramNY", "Passenger Tram NY", EntityPassengerTramNY.class, ItemIDs.minecartPassengerTramNY.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, null, 18, 0),
				TrainRecord.makeEntry("passengerAdler", "Passenger Adler", EntityPassengerAdler.class, ItemIDs.minecartPassengerAdler.item, "passenger", 0, 0, 0.5, 0, 0, 0, 0, 0, 0, null, 18, 0),
				TrainRecord.makeEntry("passengerDBOriental", "Passenger DB oriental", EntityPassengerDBOriental.class, ItemIDs.minecartPassengerDBOriental.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Yellow", "Blue", "White", "Green", "Purple", "Red"}, 18, 0),
				TrainRecord.makeEntry("passengerIC4_DSB_FG", "Passenger IC4 DSB FG", PassengerIC4_DSB_FG.class, ItemIDs.minecartIC4_DSB_FG.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, null, 10, 0, "Unfinished, Creative Only"),
				TrainRecord.makeEntry("passengerIC4_DSB_FH", "Passenger IC4 DSB FH", PassengerIC4_DSB_FH.class, ItemIDs.minecartIC4_DSB_FH.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, null, 10, 0, "Unfinished, Creative Only"),
				TrainRecord.makeEntry("passengerICE1_Class1", "Passenger ICE 1st Class", EntityPassengerICE_1class.class, ItemIDs.minecartICE1_1stClass.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, new String[]{"White", "Blue"}, 10, 0),
				TrainRecord.makeEntry("passengerICE1_Class2", "Passenger ICE 2nd Class", EntityPassengerICE_2class.class, ItemIDs.minecartICE1_2ndClass.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, new String[]{"White", "Blue"}, 10, 0),
				TrainRecord.makeEntry("passengerICE1_Restaurant", "ICE Restaurant", EntityPassengerICE_Restaurant.class,
						ItemIDs.minecartICE1_Restaurant.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, new String[]{"White", "Blue"}, 10, 0),
				TrainRecord.makeEntry("passengerGS4", "Passenger GS4", EntityPassengerGS4.class, ItemIDs.minecartGS4_Passenger.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Orange", "White", "Yellow", "Brown", "Green", "Lime", "Red", "Grey", "Green", "LightGrey", "Blue", "Black", "LightBlue"}, 10, 0),
				TrainRecord.makeEntry("passengerGS4Observatory", "Passenger GS4 Observatory", EntityPassengerGS4_Observatory.class, ItemIDs.minecartGS4_Observatory.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Orange", "White", "Yellow", "Brown", "Lime", "Red", "Grey", "Green", "LightGrey", "Black", "LightBlue"}, 10, 0),
				TrainRecord.makeEntry("passengerGS4_Tail", "Passenger GS4 Tail", EntityPassengerGS4_Tail.class, ItemIDs.minecartGS4_Tail.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Orange", "White", "Yellow", "Brown", "Lime", "Red", "Grey", "Green", "LightGrey", "Black", "LightBlue"}, 10, 0),

				TrainRecord.makeEntry("passengerDenverRioGrange", "Passenger Denver Rio Grande", EntityPassengerDenverRioGrande.class, ItemIDs.minecartDenverRioGrandePassenger.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Yellow", "Red", "Green"}, 10, 0),
				TrainRecord.makeEntry("passengerDenverRioGrandeCombo", "Passenger Denver Rio Grande Combo", EntityPassengerDenverRioGrandeCombo.class, ItemIDs.minecartDenverRioGrandeCombo.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Yellow", "Red", "Green"}, 10, 0),

				TrainRecord.makeEntry("passengerRheingold", "Passenger Rheingold", EntityPassengerRheingold.class, ItemIDs.minecartPassengerRheingold.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Red", "Green", "LightBlue", "Magenta", "Lime", "Brown"}, 18, 0),
				TrainRecord.makeEntry("passengerRheingoldDining1", "Rheingold Dining", EntityPassengerRheingoldDining1.class, ItemIDs.minecartPassengerRheingoldDining1.item, "work", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Red", "Green", "LightBlue", "Magenta", "Lime"}, 18, 0),
				TrainRecord.makeEntry("passengerRheingoldDining2", "Rheingold Dining Alternate", EntityPassengerRheingoldDining2.class, ItemIDs.minecartPassengerRheingoldDining2.item, "work", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Red", "Green", "LightBlue", "Magenta", "Lime"}, 18, 0),
				TrainRecord.makeEntry("passengerRheingoldPanorama", "Rheingold Panorama", EntityPassengerRheingoldPanorama.class, ItemIDs.minecartPassengerRheingoldPanorama.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Red"}, 18, 0),

				TrainRecord.makeEntry("passengerMILW", "Passenger MILW", EntityPassengerMILW.class, ItemIDs.minecartPassengerMILW.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, null, 18, 0),
				TrainRecord.makeEntry("passengerMILWTail", "Passenger MILW Tail", EntityPassengerMILWTail.class, ItemIDs.minecartPassengerMILWTail.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, null, 18, 0),
				//TrainRecord.makeEntry("passengerMILWDiner",Passenger MILW Diner",EntityPassengerMILWDiner.class, ItemIDs.minecartPassengerMILWDiner.item,"passenger",0,0,1,0,0,0,0,0,0,null,18,0),

				TrainRecord.makeEntry("passengerBamboo", "Bamboo Flatcar Passenger", EntityPassengerBamboo.class, ItemIDs.minecartPassengerBamboo.item, "passenger", 0, 0, 0.1, 0, 0, 0, 0, 0, 0, new String[]{"Red", "Blue", "Black", "Yellow", "Magenta", "Cyan", "Pink", "LightGrey", "Green", "White", "LightBlue", "Lime", "Brown", "Purple", "Orange", "Grey"}, 18, 0),


				/**
				 * Caboose
				*/
				TrainRecord.makeEntry("cabooseRed", "Caboose Red", EntityCaboose.class, ItemIDs.minecartCaboose.item, "caboose", 0, 0, 0.5, 0, 0, 0, 0, 0, 0, null, 18, 0),
				TrainRecord.makeEntry("cabooseBlack", "Caboose Black", EntityCaboose3.class, ItemIDs.minecartCaboose3.item, "caboose", 0, 0, 0.5, 0, 0, 0, 0, 0, 0, null, 18, 0),

				/**
				 * Specials
				 **/
				TrainRecord.makeEntry("GWRBrakeVan", "GWR Toad Brake Van", EntityGWRBrakeVan.class, ItemIDs.minecartGWRBrakeVan.item, "work", 0, 0, 0.7, 0, 0, 0, 0, 0, 0, null, 18, 0),
				TrainRecord.makeEntry("stockCar", "Stock Cart", EntityStockCar.class, ItemIDs.minecartStockCar.item, "special", 0, 0, 2, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Red", "Yellow", "White"}, 18, 0),
				TrainRecord.makeEntry("drwgStockCar", "DRWG Stock Cart", EntityStockCarDRWG.class, ItemIDs.minecartDRWGStockCar.item, "special", 0, 0, 2, 0, 0, 0, 0, 0, 0, null, 18, 0),
				TrainRecord.makeEntry("workCart", "Work Cart Yellow", EntityWorkCart.class, ItemIDs.minecartWork.item, "work", 0, 0, 0.7, 0, 0, 0, 0, 0, 0, null, 18, 0),
				TrainRecord.makeEntry("flatCart", "Flat Cart", EntityFlatCart.class, ItemIDs.minecartFlatCart.item, "flat", 0, 0, 0.2, 0, 0, 0, 0, 0, 0, null, 18, 0),
				TrainRecord.makeEntry("workCaboose", "Work Caboose", EntityCabooseWorkCart.class, ItemIDs.minecartCabooseWork.item, "work", 0, 0, 0.6, 0, 0, 0, 0, 0, 0, null, 18, 0),
				TrainRecord.makeEntry("cabooseLogging", "Caboose Logging", EntityCabooseLogging.class, ItemIDs.minecartCabooseLogging.item, "work", 0, 0, 0.2, 0, 0, 0, 0, 0, 0, new String[]{"Red", "Cyan", "Grey"}, 18, 0),
				TrainRecord.makeEntry("cabooseLoggingPRR", "PRR Caboose Logging", EntityCabooseLoggingPRR.class, ItemIDs.minecartCabooseLoggingPRR.item, "work", 0, 0, 0.2, 0, 0, 0, 0, 0, 0, new String[]{"Red", "Blue", "Green"}, 18, 0),
				TrainRecord.makeEntry("mailWagen_DB", "Mail Wagon DB", EntityMailWagen_DB.class, ItemIDs.minecartMailWagon_DB.item, "work", 0, 0, 1, 0, 0, 0, 0, 0, 0, null, 18, 0),
				TrainRecord.makeEntry("jukeBoxCart", "JukeBox Cart", EntityJukeBoxCart.class, ItemIDs.minecartJukeBoxCart.item, "special", 0, 0, 0.2, 0, 0, 0, 0, 0, 0, null, 18, 0, "Supports MP3/OGG format M3U/PLS links, like Shoutcast"),
				TrainRecord.makeEntry("flatCartSU", "Flat Cart SU", EntityFlatCartSU.class, ItemIDs.minecartFlatCartSU.item, "flat", 0, 0, 0.2, 0, 0, 0, 0, 0, 0, null, 18, 0),
				TrainRecord.makeEntry("flatCartUS", "Flat Cart US", EntityFlatCartUS.class, ItemIDs.minecartFlatCartUS.item, "flat", 0, 0, 0.4, 0, 0, 0, 0, 0, 0, null, 18, 0),
				TrainRecord.makeEntry("tracksBuilder", "Tracks Builder", EntityTracksBuilder.class, ItemIDs.minecartBuilder.item, "special", 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 14, 0),
				TrainRecord.makeEntry("flatCar_DB", "Flat Cart DB", EntityFlatCar_DB.class, ItemIDs.minecartFlatCart_DB.item, "flat", 0, 0, 0.2, 0, 0, 0, 0, 0, 0, new String[]{"Red", "Green"}, 18, 0),
				TrainRecord.makeEntry("BUnitEMDF7", "EMD F7 B Unit", EntityBUnitEMDF7.class, ItemIDs.minecartLocoEMDF7B.item, "b-unit", 0, 0, 5, 0,
						0,
						0, 0, 0, 12000, new String[]{"Black", "Lime", "Red", "Brown", "Green", "Orange", "Yellow"}, 18, 0,
						"Reduces weight carried by 50 tons when fueled"),
				TrainRecord.makeEntry("BUnitEMDF3", "EMD F3 B Unit", EntityBUnitEMDF3.class, ItemIDs.minecartLocoEMDF3B.item, "b-unit", 0, 0, 5, 0,
						0,
						0, 0, 0, 12000, new String[]{"Yellow", "Black", "Orange", "Blue", "Brown", "Green", "Magenta"}, 18, 0,
						"Reduces weight carried by 50 tons when fueled"),
				TrainRecord.makeEntry("BUnitDD35", "DD35 B Unit", EntityBUnitDD35.class, ItemIDs.minecartLocoDD35B.item, "b-unit", 0, 0, 8, 0, 0, 0, 0, 0,
						12000, new String[]{"Orange", "Black"}, 18, 0, "Reduces weight carried by 80 tons when fueled"),
				TrainRecord.makeEntry("propagandaUs", "Propaganda USA", EntityPropagandaUS.class, ItemIDs.minecartPropagandaUs.item, "decorative", 0, 0, 0.1, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "White", "Red"}, 14, 0),
				TrainRecord.makeEntry("propagandaUSSR", "Propaganda USSR", EntityPropagandaUSSR.class, ItemIDs.minecartPropagandaUSSR.item, "decorative", 0, 0, 0.1, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "White", "Red"}, 14, 0),
				TrainRecord.makeEntry("propagandaJapan", "Propaganda Japan", EntityPropagandaJapan.class, ItemIDs.minecartPropagandaJapan.item, "decorative", 0, 0, 0.1, 0, 0, 0, 0, 0, 0, new String[]{"Red", "White", "Yellow"}, 14, 0),
				TrainRecord.makeEntry("propagandaBritain", "Propaganda Britain", EntityPropagandaBritain.class, ItemIDs.minecartPropagandaBritish.item, "decorative", 0, 0, 0.1, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "White", "Yellow"}, 14, 0),

				/**
				 * Freight
				*/
				TrainRecord.makeEntry("freightCartRed", "Freight Cart Red", EntityFreightCart2.class, ItemIDs.minecartFreightCart2.item, "freight", 3, null, 18, 36, "Cargo: any"),
				TrainRecord.makeEntry("freightCartYellow", "Freight Cart Yellow", EntityFreightCart.class, ItemIDs.minecartChest.item, "freight", 3, null, 18, 36, "Cargo: any"),
				TrainRecord.makeEntry("freightWood", "Freight Flat Cart Log", EntityFreightWood.class, ItemIDs.minecartWood.item, "freight", 3, null, 18, 27, "Cargo: only Logs"),
				TrainRecord.makeEntry("freightHopper", "Freight Hopper Green", EntityFreightGrain.class, ItemIDs.minecartGrain.item, "freight", 4, null, 18, 36, "Cargo: wheat, seeds"),
				TrainRecord.makeEntry("freightKClassRailBox", "Freight K Class Rail Box", EntityFreightKClassRailBox.class, ItemIDs.minecartKClassRailBox.item, "freight", 4, new String[]{"Yellow", "Orange"}, 18, 36, "Fictional. Cargo: any"),
				TrainRecord.makeEntry("freightShortCoveredHopper", "Freight Short Covered Hopper", EntityFreightShortCoveredHopper.class, ItemIDs.minecartShortCoveredHopper.item, "freight", 4, new String[]{"Grey", "Orange", "LightBlue", "Lime", "Blue", "Yellow"}, 18, 36, "Cargo: any"),
				TrainRecord.makeEntry("freightLongCoveredHopper", "Freight Long Covered Hopper", EntityFreightLongCoveredHopper.class, ItemIDs.minecartLongCoveredHopper.item, "freight", 6, new String[]{"LightGrey", "Grey", "Pink", "White", "Green", "Orange", "Lime"}, 18, 54, "Cargo: any"),
				TrainRecord.makeEntry("freightOpenWagon", "Freight Open Wagon", EntityFreightOpenWagon.class, ItemIDs.minecartOpenWagon.item, "freight", 2, null, 18, 36, "Cargo: blocks, vanilla items"),//"train_hopper" for open wagon => weird
				TrainRecord.makeEntry("freightHopperUS", "Freight Hopper US", EntityFreightHopperUS.class, ItemIDs.minecartFreightHopperUS.item, "freight", 4, new String[]{"Brown", "Grey", "LightGrey", "Blue", "Red", "Yellow", "Black", "LightBlue", "Purple", "Green", "Magenta", "Orange", "Lime"}, 18, 27, "Cargo: blocks"),
				TrainRecord.makeEntry("freight100TonHopper", "Freight 100 Ton Hopper", EntityFreight100TonHopper.class, ItemIDs.minecartFreight100TonHopper.item, "freight", 4, new String[]{"Red", "Black", "Blue", "Grey"}, 18, 54, "Cargo: blocks"),
				TrainRecord.makeEntry("flatCartWoodUS", "Freight Flat Cart Wood US", EntityFlatCartWoodUS.class, ItemIDs.minecartFlatCartWoodUS.item, "freight", 3, null, 18, 27, "Cargo: wood stuff"),
				TrainRecord.makeEntry("bulkheadFlatCartWood", "Freight Bulkhead Flat Cart", EntityBulkheadFlatCart.class, ItemIDs.minecartBulkheadFlatCart.item, "freight", 3, new String[]{"Brown", "Yellow", "Green"}, 18, 27, "Cargo: only planks"),
				TrainRecord.makeEntry("freightCartUS", "Freight Cart US", EntityFreightCartUS.class, ItemIDs.minecartFreightCartUS.item, "freight", 3.5, new String[]{"Brown", "Yellow", "Black", "Blue", "Cyan", "Green", "Grey", "LightBlue", "LightGrey", "Lime", "Magenta", "Orange", "Pink", "Purple", "Red", "White"}, 18, 36, "Cargo: blocks, vanilla items"),
				TrainRecord.makeEntry("freightBoxCartUS", "Freight Box Cart US", EntityBoxCartUS.class, ItemIDs.minecartBoxCartUS.item, "freight", 2, new String[]{"Brown", "Red", "Blue", "Black", "Yellow", "Magenta", "Cyan", "Pink", "LightGrey", "Green", "White", "LightBlue", "Lime", "Purple", "Orange", "Grey"}, 18, 45, "Cargo: any"),
				TrainRecord.makeEntry("freightBoxCartPRR", "Freight Box Cart PRR", EntityBoxCartPRR.class, ItemIDs.minecartBoxCartPRR.item, "freight", 2, null, 18, 45, "Cargo: any"),
				TrainRecord.makeEntry("freightCartSmall", "Freight Cart Small", EntityFreightCartSmall.class, ItemIDs.minecartFreightCartSmall.item, "freight", 1, null, 18, 36, "Cargo: any"),
				TrainRecord.makeEntry("freightMinetrain", "Freight Minecart Yellow", EntityFreightMinetrain.class, ItemIDs.minecartMineTrain.item, "freight", 0.5, null, 18, 18, "Cargo: opaque blocks"),
				TrainRecord.makeEntry("freightGTNG", "Freight GTNG Ore Wagon", EntityFreightGTNG.class, ItemIDs.minecartFreightGTNG.item, "freight", 0.5, null, 18, 18, "Cargo: opaque blocks"),
				TrainRecord.makeEntry("flatCartWoodLogs", "Freight Flat Logs", EntityFreightWood2.class, ItemIDs.minecartFreightWood2.item, "freight", 3, null, 18, 18, "Cargo: only logs"),
				TrainRecord.makeEntry("freightClosedRedBrown", "Freight Cart Closed RedBrown", EntityFreightClosed.class, ItemIDs.minecartFreightClosed.item, "freight", 2.5, null, 18, 36, "Cargo: any"),
				TrainRecord.makeEntry("freightOpenRedBrown", "Freight Open RedBrown", EntityFreightOpen2.class, ItemIDs.minecartFreightOpen2.item, "freight", 5, null, 18, 21, "Cargo: any"),
				TrainRecord.makeEntry("freightWagen_DB", "Freight Wagon DB", EntityFreightWagenDB.class, ItemIDs.minecartFreightWagon_DB.item, "freight", 4, new String[]{"Red", "Green", "Yellow"}, 18, 54, "Cargo: any"),
				TrainRecord.makeEntry("flatCarRails_DB", "Freight Flat Cart Rails DB", EntityFlatCarRails_DB.class, ItemIDs.minecartFlatCartRail_DB.item, "freight", 5, new String[]{"Red", "Green"}, 18, 36, "Cargo: only rails"),
				TrainRecord.makeEntry("ASTFAutorack", "Freight ASTF Autorack", EntityFreightASTFAutorack.class, ItemIDs.minecartASTFAutorack.item, "freight", 5, null, 18, 36, "Cargo: any | Stack limit 1"),
				TrainRecord.makeEntry("flatCarLogs_DB", "Freight Flat Cart Logs DB", EntityFlatCarLogs_DB.class, ItemIDs.minecartFlatCartLogs_DB.item, "freight", 4, new String[]{"Red", "Green"}, 18, 45, "Cargo: only logs"),
				TrainRecord.makeEntry("slateWagon", "Freight Slate Wagon", EntityFreightSlateWagon.class, ItemIDs.minecartSlateWagon.item, "freight",
						0.5, null, 18, 38, "Cargo: only stone and ores"),
				TrainRecord.makeEntry("iceWagon", "Freight Ice Wagon", EntityFreightIceWagon.class, ItemIDs.minecartIceWagon.item, "freight",
						0.5, null, 18, 38, "Cargo: only ice"),
				TrainRecord.makeEntry("freightCartGS4", "Freight Cart GS4 Baggage", EntityFreightGS4_Baggage.class, ItemIDs.minecartGS4_Baggage.item, "freight", 1, new String[]{"Orange", "White", "Yellow", "Brown", "Lime", "Red", "Grey", "Green", "LightGrey", "Black", "LightBlue"}, 18, 45, "Cargo: any"),
				TrainRecord.makeEntry("freightGondola_DB", "Freight Gondola DB", EntityFreightGondola_DB.class, ItemIDs.minecartFreightGondola_DB.item, "freight", 3.5, new String[]{"Red", "Green"}, 18, 45, "Cargo: blocks, vanilla items"),
				TrainRecord.makeEntry("freightCenterBeam_Empty", "Freight Center Beam Empty", EntityFreightCenterbeam_Empty.class, ItemIDs.minecartFreightCenterBeam_Empty.item, "freight", 1, new String[]{"Grey", "LightGrey"}, 18, 54, "Cargo: any"),
				TrainRecord.makeEntry("freightCenterBeam_Wood1", "Freight Center Beam Wood1", EntityFreightCenterbeam_Wood_1.class, ItemIDs.minecartFreightCenterBeam_Wood_1.item, "freight", 3, new String[]{"Brown", "Blue", "White"}, 18, 54, "Cargo: wood stuff"),
				TrainRecord.makeEntry("freightCenterBeam_Wood2", "Freight Center Beam Wood2", EntityFreightCenterbeam_Wood_2.class, ItemIDs.minecartFreightCenterBeam_Wood_2.item, "freight", 3, new String[]{"Brown", "Yellow", "White"}, 18, 54, "Cargo: wood stuff"),
				//TrainRecord.makeEntry("freightWellcar",Freight Well Car",EntityFreightWellcar.class, ItemIDs.minecartFreightWellcar.item,"freight",3,new String[] {"Blue","Red","Green","LightGrey","Grey", "Yellow"},18,54,new String[] {"Cargo: any"},
				TrainRecord.makeEntry("freightWellcar", "Freight Well Car", EntityFreightWellcar.class, ItemIDs.minecartFreightWellcar.item, "freight", 3, new String[]{"Blue", "Red", "Green", "Black", "Grey", "Cyan", "Brown", "Lime", "LightBlue", "LightGrey", "Magenta", "Orange", "Pink", "Purple", "White", "Yellow"}, 18, 54, "Cargo: any"),
				TrainRecord.makeEntry("freightTrailer", "Freight Trailer", EntityFreightTrailer.class, ItemIDs.minecartFreightTrailer.item, "freight", 3, new String[]{"Blue", "Yellow", "LightBlue", "Red", "Grey", "LightGrey", "Magenta", "Orange", "Pink", "Purple", "Lime", "White"}, 18, 54, "Cargo: any"),
				TrainRecord.makeEntry("freightDenverRioGrange", "Denver Rio Grande Baggage", EntityFreightDenverRioGrande.class, ItemIDs.minecartDenverRioGrandeBaggage.item, "freight", 0.5, new String[]{"Yellow", "Red", "Green"}, 18, 54, "Cargo: any"),
				TrainRecord.makeEntry("freightMILWBaggage", "MILW Baggage", EntityFreightBaggageMILW.class, ItemIDs.minecartBaggageMILW.item, "freight", 0.5, null, 18, 54, "Cargo: any"),
				TrainRecord.makeEntry("freightheavyweight", "Heavyweight Freight Car", EntityFreightHeavyweight.class, ItemIDs.minecartHeavyweightMailcar.item, "freight", 0.5, null, 18, 27, "Cargo: any"),
				TrainRecord.makeEntry("freightCartBamboo", "Bamboo Flatcar Freight", EntityFreightBamboo.class, ItemIDs.minecartFreightBamboo.item, "freight", 0.1, new String[]{"Red", "Blue", "Black", "Yellow", "Magenta", "Cyan", "Pink", "LightGrey", "Green", "White", "LightBlue", "Lime", "Brown", "Purple", "Orange", "Grey"}, 18, 36, "Cargo: any"),
				TrainRecord.makeEntry("freightGermanPost", "Freight German Post", EntityFreightGermanPost.class, ItemIDs.minecartFreightGermanPost.item, "freight", 0.1, new String[]{"Yellow", "Red", "Blue"}, 18, 36, "Cargo: non-blocks"),
				TrainRecord.makeEntry("freightDepressedFlatbed", "Freight Depressed Flatcar", EntityFreightDepressedFlatbed.class, ItemIDs.minecartFreightDepressedFlatbed.item, "freight", 0.5, new String[]{"Black", "Grey", "LightGrey", "Yellow"}, 18, 36, "Cargo: any"),
				TrainRecord.makeEntry("freightCarL", "Freight Car L", EntityFreightCartL.class, ItemIDs.minecartFreightL.item, "freight", 3, new String[]{"Red", "Blue"}, 18, 27, "Cargo: any"),
				TrainRecord.makeEntry("freightHeavyweight", "Freight Heavyweight Baggage", EntityFreightHeavyweightBaggage.class, ItemIDs.minecartHeavyweightFreight.item, "freight", 3, new String[]{"Red", "Grey"}, 18, 36, "Cargo: any"),
				//TrainRecord.makeEntry("freight7Plank",Freight 7 Plank", EntityFreight7Plank.class, ItemIDs.minecart7Plank.item, "freight", 0.5, new String[]{"Black", "Brown", "LightGrey", "Lime", "Red"}, 18, 27, "Pack: B.I.P."),
				/**
				 * Tanks
				 **/
				TrainRecord.makeEntry("tankWagon_DB", "Tank Wagon DB", EntityTankWagon_DB.class, ItemIDs.minecartTankWagon_DB.item, "tank", 0, 0, 6, 0, 0, 0, 0, 0, 50000, new String[]{"Blue", "Green"}, 18, 0, "Capacity: 50000mb"),
				TrainRecord.makeEntry("tankThreeDome", "Tank Wagon Three Dome", EntityTankWagonThreeDome.class, ItemIDs.minecartTankWagonThreeDome.item, "tank", 0, 0, 7.5, 0, 0, 0, 0, 0, 90000, new String[]{"Green", "White"}, 18, 0, "Capacity: 90000mb"),
				TrainRecord.makeEntry("tankWagonUS", "Tank Wagon US", EntityTankWagonUS.class, ItemIDs.minecartTankWagonUS.item, "tank", 0, 0, 6, 0, 0, 0, 0, 0, 70000, new String[]{"Black", "Pink", "Grey", "White", "LightGrey", "Yellow", "Green", "Purple", "Red", "Brown"}, 18, 0, "Capacity: 70000mb"),
				TrainRecord.makeEntry("tankWagonGrey", "Tank Wagon Grey", EntityTankWagon2.class, ItemIDs.minecartTankWagon2.item, "tank", 0, 0, 3, 0, 0, 0, 0, 0, 40000, null, 18, 0, "Capacity: 40000mb"),
				TrainRecord.makeEntry("tankCartLava", "Tank Lava", EntityTankLava.class, ItemIDs.minecartWatertransp.item, "tank", 0, 0, 5, 0, 0, 0, 0, 0, 30000, new String[]{"Empty", "Full"}, 18, 0, "Lava Capacity: 30000mb"),
				TrainRecord.makeEntry("tankWagonYellow", "Tank Wagon Yellow", EntityTankWagon.class, ItemIDs.minecartTankWagon.item, "tank", 0, 0, 6, 0, 0, 0, 0, 0, 40000, null, 18, 0, "Capacity: 40000mb"),

				/**
				 * Tenders
				*/
				TrainRecord.makeEntry("tenderSmall", "Tender Small Black", EntityTenderSmall.class, ItemIDs.minecartTender.item, "tender", 0, 0, 0.1, 0, 0, 0, 0, 0, 5000, new String[]{"Black", "Red", "Blue", "Green", "Yellow"}, 18, 0, "Water capacity: 5000mb"),
				TrainRecord.makeEntry("tenderHeavy", "Tender Heavy", EntityTenderHeavy.class,
						ItemIDs.minecartTenderHeavy.item, "tender", 0, 0, 2, 0, 0, 0, 0, 0, 14000, new String[]{"Black", "Brown"}, 18, 0,
						"Water capacity: 14000mb"),
				TrainRecord.makeEntry("tenderGS4", "Tender GS4", EntityTenderGS4.class, ItemIDs.minecartGS4_Tender.item, "tender", 0, 0, 2, 0, 0, 0, 0, 0, 18000, new String[]{"Orange", "White"}, 18, 0, "Water capacity: 18000mb"),
				TrainRecord.makeEntry("Model4000GallonTender", "4000GallonTender", EntityTender4000.class, ItemIDs.minecart4000GallonTender.item, "tender", 0, 0, 2, 0, 0, 0, 0, 0, 15000, new String[]{"Green", "Blue", "Red", "Lime"}, 18, 0, "Water capacity: 15000mb"),
				TrainRecord.makeEntry("ModelFowler4FTender", "Fowler 4F Tender", EntityTenderFowler4F.class, ItemIDs.minecartFowler4FTender.item, "tender", 0, 0, 2, 0, 0, 0, 0, 0, 15000, null, 18, 0, "Water capacity: 15000mb"),
				TrainRecord.makeEntry("Model225Tender", "1225 tender", EntityTenderBerk1225.class, ItemIDs.minecarttenderBerk1225.item, "tender", 0, 0, 2, 0, 0, 0, 0, 0, 15000, new String[]{"Black", "Grey"}, 18, 0, "Water capacity: 15000mb"),
				TrainRecord.makeEntry("tender4_4_0", "Tender 4-4-0", EntityTender4_4_0.class, ItemIDs.minecartSteamRedTender.item, "tender", 0, 0, 0.2,
						0, 0, 0, 0, 0, 8000, new String[]{"Black", "White", "Brown", "Blue", "Green", "Red", "Purple"}, 18, 0,
						"Water capacity: 8000mb"),
				TrainRecord.makeEntry("tenderA4", "Tender A4 Mallard", EntityTenderA4.class, ItemIDs.minecartLocoA4MallardTender.item, "tender", 0, 0, 0.2, 0, 0, 0, 0, 0, 6000, new String[]{"Blue", "Lime", "Black", "Green", "White"}, 18, 0, "Water capacity: 6000mb"),
				TrainRecord.makeEntry("tenderBR01", "Tender BR01", EntityTenderBR01_DB.class, ItemIDs.minecartTenderBR01_DB.item, "tender", 0, 0, 0.5, 0, 0, 0, 0, 0, 20000, null, 18, 0, "Water capacity: 20000mb"),
				TrainRecord.makeEntry("tenderCoranationClass", "Tender Coranation Class", EntityTenderCoranationClass.class, ItemIDs.minecartLocoCoranationClassTender.item, "tender", 0, 0, 0.5, 0, 0, 0, 0, 0, 20000, null, 18, 0, "Water capacity: 20000mb"),
				TrainRecord.makeEntry("tenderEr_Ussr", "Tender ER_USSR", EntityTenderEr_Ussr.class, ItemIDs.minecartTenderEr.item, "tender", 0, 0, 2, 0, 0, 0, 0, 0, 16000, null, 18, 0, "Water capacity: 16000mb"),
				TrainRecord.makeEntry("tenderC62Class", "Tender C62Class", EntityTenderC62Class.class, ItemIDs.minecartTenderC62Class.item, "tender", 0,
						0, 0.5, 0, 0, 0, 0, 0, 14000, new String[]{"Black", "Red"}, 18, 0,
						"Water capacity: 14000mb"),
				TrainRecord.makeEntry("tenderD51", "Tender D51", EntityTenderD51.class, ItemIDs.minecartTenderD51.item, "tender", 0,
						0, 0.5, 0, 0, 0, 0, 0, 14000, null, 18, 0,
						"Water capacity: 12000mb"),
				TrainRecord.makeEntry("tenderAdler", "Tender Adler", EntityTenderAdler.class, ItemIDs.minecartTenderAdler.item, "tender", 0, 0, 0.5, 0, 0, 0, 0, 0, 4000, null, 18, 0, "Water capacity: 4000mb"),
				TrainRecord.makeEntry("tender_C41", "Tender C41", EntityTender_C41.class, ItemIDs.minecartTenderC41.item, "tender", 0, 0, 1.5, 0, 0, 0, 0, 0, 16000, null, 18, 0, "Water capacity: 16000mb"),
				TrainRecord.makeEntry("tender_Southern1102", "Tender Southern1102", EntityTender_Southern1102.class, ItemIDs.minecartTenderSouthern1102.item, "tender", 0, 0, 1.5, 0, 0, 0, 0, 0, 16000, null, 18, 0, "Water capacity: 16000mb"),
				TrainRecord.makeEntry("tender_MILW", "Tender MILW", EntityTenderMILW.class, ItemIDs.minecartMILWTender.item, "tender", 0, 0, 1.5, 0, 0, 0, 0, 0, 16000, null, 18, 0, "Water capacity: 16000mb"),
				TrainRecord.makeEntry("tender_BR_Black_5", "Tender_BR_Black_5", EntityTenderBR_Black_5.class, ItemIDs.minecartBR_Black_5_Tender.item, "tender", 0, 0, 0.6, 0, 0, 0, 0, 0, 16000, new String[]{"Blue", "Cyan", "Green", "Grey", "LightGrey", "Red", "White", "Magenta", "Yellow", "Purple"}, 18, 0, "Water capacity: 16000mb"),
				TrainRecord.makeEntry("tender_BR1", "Tender_BR1", EntityTenderBR1.class, ItemIDs.minecartBR1Tender.item, "tender", 0, 0, 0.6, 0, 0, 0, 0, 0, 16000, new String[]{"Green", "Black", "Blue", "Grey", "LightGrey", "Orange", "Yellow", "Cyan"}, 18, 0, "Water capacity: 16000mb"),
				TrainRecord.makeEntry("tender_RW_Type_2", "Tender_RW_Type_2", EntityTenderRWType2.class, ItemIDs.minecartRWType2Tender.item, "tender", 0, 0, 0.6, 0, 0, 0, 0, 0, 10000, new String[]{"Black", "Brown", "Green", "Grey", "LightGrey", "Red", "Purple", "Pink"}, 18, 0, "Water capacity: 10000mb"),
				/** Diesel */
				TrainRecord.makeEntry("locoDieselKOF", "Loco Diesel KOF DB", EntityLocoDieselKof_DB.class, ItemIDs.minecartKof_DB.item, "diesel", 750, 45, 0, 60, 0, 170, 0.66, 0.96, 5000, new String[]{"Red", "Green", "Yellow", "Black", "Blue"}, 17, -1.6),
				TrainRecord.makeEntry("locoDieselGP40", "Loco Diesel CD742", EntityLocoDieselCD742.class, ItemIDs.minecartCD742.item, "diesel", 1184, 90,
						0, 50, 0, 250, 0.8, 0.966, 10000, new String[]{"Yellow", "White", "Blue", "Orange", "LightBlue"}, 15, -2.5),
				TrainRecord.makeEntry("locoDieselChME3", "Loco Diesel ChME3", EntityLocoDieselChME3.class, ItemIDs.minecartChmE3.item, "diesel", 2383, 95, 0, 60, 0, 170, 0.66, 0.96, 5000, null, 15, -1.2),
				TrainRecord.makeEntry("locoDieselGP7Red", "Loco Diesel GP7", EntityLocoDieselGP7Red.class, ItemIDs.minecartGP7Red.item, "diesel", 2464, 105, 0, 50, 0, 200, 0.74, 0.96, 20000, new String[]{"Red", "Blue", "Black", "Yellow", "Magenta", "Cyan", "Pink", "LightGrey", "Green", "White", "LightBlue", "Lime", "Brown", "Purple", "Orange", "Grey", "Skin16"}, 15, -1.4),
				TrainRecord.makeEntry("locoDieselSD40", "Loco Diesel SD40", EntityLocoDieselSD40.class, ItemIDs.minecartLocoSD40.item, "diesel", 3041, 105, 0, 60, 0, 200, 0.8, 0.97, 20000, new String[]{"Red", "Yellow", "Black", "Green", "Orange", "Magenta", "Blue", "Pink"}, 10, -2.3),
				TrainRecord.makeEntry("locoDieselSD70", "Loco Diesel SD70", EntityLocoDieselSD70.class, ItemIDs.minecartLocoSD70.item, "diesel", 4055, 120, 0, 60, 0, 200, 0.8, 0.97, 20000, new String[]{"Orange", "Yellow", "Red", "Blue", "Magenta", "Black", "Pink"}, 10, -2.3),
				TrainRecord.makeEntry("locoDieselShunter", "Loco Diesel Shunter", EntityLocoDieselShunter.class, ItemIDs.minecartShunter.item, "diesel", 354, 32, 0, 70, 0, 260, 0.6, 0.94, 8000, new String[]{"Blue", "Green", "Red", "Black"}, 14, -2.58),
				TrainRecord.makeEntry("locoDieselV60_DB", "Loco Diesel V60 DB", EntityLocoDieselV60_DB.class, ItemIDs.minecartV60_DB.item, "diesel", 1058, 60, 0, 60, 0, 170, 0.66, 0.96, 8000, new String[]{"Red", "Green", "Yellow", "Cyan"}, 15, -1.5),
				TrainRecord.makeEntry("locoDieselIC4_DSB_MG", "Loco Diesel IC4 DSB MG", EntityLocoDieselIC4_DSB_MG.class, ItemIDs.minecartIC4_DSB_MG.item, "diesel", 760, 200, 0, 60, 0, 200, 0.8, 0.97, 20000, new String[]{"White", "Red"}, 10, -6, "Unfinished, Creative Only"),
				TrainRecord.makeEntry("locoDieselMILW_H1044", "Loco Diesel MILW H10-44", EntityLocoDieselMILW_H1044.class, ItemIDs.minecartMILW_H1044.item, "diesel", 1618, 97, 0, 60, 0, 170, 0.66, 0.96, 8000, new String[]{"Orange", "Yellow", "Black", "Red", "Blue", "Grey", "LightBlue", "Green"}, 15, -4.4),
				TrainRecord.makeEntry("locoDieselEMDF7", "Loco Diesel EMD F-7", EntityLocoDieselEMDF7.class, ItemIDs.minecartLocoEMDF7.item, "diesel",
						1600, 150, 0, 50, 0, 200, 0.8, 0.97, 12000, new String[]{"Black", "Lime", "Red", "Brown", "Green", "Orange", "Yellow"}, 10, -2.4),
				TrainRecord.makeEntry("locoDieselEMDF3", "Loco Diesel EMD F-3", EntityLocoDieselEMDF3.class, ItemIDs.minecartLocoEMDF3.item, "diesel",
						1500, 166, 0, 55, 0, 200, 0.8, 0.97, 12000, new String[]{"Yellow", "Black", "Orange", "Blue", "Brown", "Green", "Magenta"}, 10, -2.25),
				TrainRecord.makeEntry("locoDieselEWSClass66", "Loco Electric EWS Class 66", EntityLocoDieselClass66.class,
						ItemIDs.minecartLocoEWSClass66.item, "diesel", 3300, 121, 0, 10, 0, 170, 0.7, 0.965, 6400,
						new String[]{"Pink", "Green", "Red"}, 18, -5.5),
				TrainRecord.makeEntry("locoDieselDeltic", "Loco Diesel Deltic", EntityLocoDieselDeltic.class, ItemIDs.minecartLocoDeltic.item, "diesel",
						3300, 161, 0, 10, 0, 170, 0.7, 0.965, 6400, null, 18, -4.7),
				TrainRecord.makeEntry("locoDieselDD35A", "Loco Diesel DD35A", EntityLocoDieselDD35A.class, ItemIDs.minecartLocoDD35A.item, "diesel", 5070, 145, 0, 10, 0, 170, 0.7, 0.965, 6850, new String[]{"Orange", "Black"}, 18, -4.75),
				TrainRecord.makeEntry("locoDiesel44TonSwitcher", "GE 44-ton Diesel switcher", EntityLocoDiesel44TonSwitcher.class, ItemIDs.minecartLoco44TonSwitcher.item, "diesel", 400, 56, 0, 10, 0, 170, 0.7, 0.965, 6850, new String[]{"Black", "Cyan"}, 18, -2.75),
				TrainRecord.makeEntry("locoDieselBamboo", "Bamboo Flatcar Engine", EntityLocoDieselBamboo.class, ItemIDs.minecartTrainBamboo.item, "diesel", 30, 20, 0, 10, 0, 170, 0.7, 0.965, 3000, new String[]{"Red", "Blue", "Black", "Yellow", "Magenta", "Cyan", "Pink", "LightGrey", "Green", "White", "LightBlue", "Lime", "Brown", "Purple", "Orange", "Grey"}, 18, -2),
				TrainRecord.makeEntry("locoDieselWLs40", "Loco WLs40", EntityLocoDieselWLs40.class, ItemIDs.minecartLocoWLs40.item, "diesel", 60, 17, 0, 10, 0, 170, 0.7, 0.965, 3000, null, 18, -3),
				TrainRecord.makeEntry("locoDieselFOL_M1", "Loco FOL M1", EntityLocoDieselFOLM1.class, ItemIDs.minecartLocoFOLM1.item, "diesel", 5000, 110, 0, 10, 0, 170, 0.7, 0.965, 15000, new String[]{"Grey", "Blue"}, 18, -3.9, "Fictional loco from Factorio"),
				TrainRecord.makeEntry("FOLM1B", "FOL-M1B", EntityLocoDieselFOLM1B.class, ItemIDs.minecartFOLM1B.item, "diesel", 5000, 110, 0, 10, 0, 170, 0.7, 0.965, 15000, new String[]{"Grey", "Blue"}, 18, -3.8, "Fictional B unit for the Fictional loco from Factorio"),


				/** Electric */
				TrainRecord.makeEntry("locoElectricVL10", "Loco Electric VL10", EntityLocoElectricVL10.class, ItemIDs.minecartVL10.item, "electric", 6250, 100, 0, 8, 0, 400, 1.1, 0.956, 0, null, 14, -2.3),
				TrainRecord.makeEntry("locoElectricBR_E69", "Loco Electric BR_E69", EntityLocoElectricBR_E69.class, ItemIDs.minecartBR_E69.item, "electric", 400, 50, 0, 5, 0, 400, 0.9, 0.946, 0, new String[]{"Green", "Red", "Black", "Grey"}, 18, 0),
				TrainRecord.makeEntry("locoElectricMineTrain", "Loco Electric Minetrain", EntityLocoElectricMinetrain.class, ItemIDs.minecartLocoMineTrain.item, "electric", 500, 40, 0, 80, 0, 160, 0.5, 0.97, 0, null, 18, -1),
				TrainRecord.makeEntry("locoElectricSpeedZeroED", "Loco Electric High Speed ZeroED", EntityLocoElectricHighSpeedZeroED.class, ItemIDs.minecartLocoHighSpeedZeroED.item, "electric", 700, 240, 0, 3, 0, 230, 1.4, 0.98, 0, null, 13, -3.4),
				TrainRecord.makeEntry("locoElectricICE1", "Loco Electric ICE 1", EntityLocoElectricICE1.class, ItemIDs.minecartICE1_Loco.item,
						"electric", 869, 280, 0, 40, 0, 250, 1.5, 0.98, 0, new String[]{"White", "Blue"}, 13, -5),
				//TrainRecord.makeEntry("locoSpeedGrey",Loco High Speed",EntityLocoElectricNewHighSpeedLoco.class, null,null),
				TrainRecord.makeEntry("locoElectricTramYellow", "Loco Electric Yellow Wood Tram", EntityLocoElectricTramWood.class, ItemIDs.minecartTramWood.item, "electric", 300, 55, 0, 10, 0, 140, 0.5, 0.965, 0, null, 14, -2),
				TrainRecord.makeEntry("locoElectricTramNY", "Loco Electric Tram NY", EntityLocoElectricTramNY.class, ItemIDs.minecartNYTram.item,
						"electric", 1327, 89, 0, 10, 0, 170, 0.7, 0.965, 0, null, 18, -3),
				TrainRecord.makeEntry("locoElectricBR185", "Loco Electric BR 185", EntityLocoElectricBR185.class, ItemIDs.minecartLocoBR185.item, "electric", 2890, 160, 0, 6, 0, 170, 0.9, 0.965, 0, new String[]{"Red", "Blue", "Magenta", "Cyan", "Grey", "LightBlue", "LightGrey", "Orange", "Pink", "Purple", "White", "Yellow", "Black"}, 18, -5),
				TrainRecord.makeEntry("locoDieselE10lDB", "Loco Electric E10 DB", EntityLocoElectricE10_DB.class, ItemIDs.minecartE10_DB.item, "electric", 2473, 150, 0, 8, 0, 170, 0.66, 0.96, 8000, new String[]{"Blue", "Red", "Grey", "Brown", "Green"}, 15, -3.8),
				TrainRecord.makeEntry("locoDieselE103", "Loco Electric E103", EntityLocoElectricE103.class, ItemIDs.minecartE103.item, "electric", 2806, 200, 0, 8, 0, 170, 0.66, 0.96, 8000, new String[]{"Red", "Blue"}, 15, -3.6),
				TrainRecord.makeEntry("locoElectricClass85", "Loco Electric Class 85", EntityLocoElectricClass85.class, ItemIDs.minecartLocoClass85.item, "electric", 2400, 160, 0, 10, 0, 170, 0.7, 0.965, 0, new String[]{"Blue", "Red"}, 18, -5),
				TrainRecord.makeEntry("locoElectricCD151", "Loco Electric CD151", EntityLocoElectricCD151.class, ItemIDs.minecartLocoCD151.item, "electric", 1133, 160, 0, 10, 0, 170, 0.7, 0.965, 6850, new String[]{"Blue", "Yellow", "Red", "Green", "Cyan", "Brown", "Orange", "Purple", "White"}, 18, -4),
				TrainRecord.makeEntry("locoElectricBP4", "Loco Electric BP4", EntityLocoElectricBP4.class, ItemIDs.minecartLocoBP4.item, "electric", 1520, 105, 0, 60, 0, 200, 0.8, 0.97, 8650, new String[]{"Green", "Purple"}, 10, -4.25),

				/** Steam */
				TrainRecord.makeEntry("locoSteamA4", "Loco Steam A4 Mallard", EntityLocoSteamMallardA4.class, ItemIDs.minecartLocoA4Mallard.item, "steam", 1418, 203, 0, 60, 200, 160, 0.65, 0.97, 10000, new String[]{"Blue", "Lime", "Black", "Green", "White"}, 7, -5),
				TrainRecord.makeEntry("locosteamHallClass", "Loco Hall Class", EntityLocoSteamHallClass.class, ItemIDs.minecartLocoHallClass.item, "steam", 1091, 164, 0, 60, 200, 160, 0.65, 0.97, 10000, new String[]{"Green", "Red", "Lime"}, 7, -4.95),
				TrainRecord.makeEntry("locosteamBerk1225", "Loco Berkshire 1225", EntityLocoSteamBerk1225.class, ItemIDs.minecartLocoBerk1225.item, "steam", 2775, 164, 0, 60, 200, 160, 0.65, 0.97, 10000, null, 7, -4.25),
				TrainRecord.makeEntry("locosteamBerk765", "Loco Berkshire 765", EntityLocoSteamBerk765.class, ItemIDs.minecartLocoBerk765.item, "steam", 2563, 164, 0, 60, 200, 160, 0.65, 0.97, 10000, null, 7, -4.25),
				TrainRecord.makeEntry("locosteamFowler", "Loco Fowler", EntityLocoSteamFowler.class, ItemIDs.minecartLocoFowler.item, "steam", 980, 102, 0, 60, 200, 160, 0.65, 0.97, 10000, null, 7, -3.25),
				TrainRecord.makeEntry("locosteamKingClass", "Loco King Class", EntityLocoSteamKingClass.class, ItemIDs.minecartLocoKingClass.item, "steam", 1613, 174, 0, 60, 200, 160, 0.65, 0.97, 10000, new String[]{"Green", "Blue", "Lime"}, 7, -5.35),
				TrainRecord.makeEntry("locoSteamMILW", "Loco Steam MILW Class A", EntityLocoSteamMILWClassA.class, ItemIDs.minecartLocoMILWClassA.item, "steam", 1228, 193, 0, 60, 150, 160, 0.65, 0.97, 10000, null, 7, -4.5),
				TrainRecord.makeEntry("locoSteamCherepanov", "Loco Steam Cherepanov", EntityLocoSteamCherepanov.class, ItemIDs.minecartLocoCherepanov.item, "steam", 60, 30, 0, 40, 120, 120, 0.3D, 0.98D, 3000, null, 18, -1.7),
				TrainRecord.makeEntry("locoSteamBR80", "Loco Steam BR80", EntityLocoSteamBR80_DB.class, ItemIDs.minecartLocoBR80_DB.item, "steam", 575, 45, 0, 100, 130, 135, 0.45, 0.97, 7000, new String[]{"Black", "Green"}, 16, -1.1),
				TrainRecord.makeEntry("locoSteam4_4_0", "Loco Steam 4-4-0", EntityLocoSteam4_4_0.class, ItemIDs.minecartPower.item, "steam", 400, 50, 0, 40, 160, 190, 0.65, 0.95, 5000, new String[]{"Red", "White", "Blue", "Brown", "Green", "Black", "Purple"}, 16, -2),
				TrainRecord.makeEntry("locoSteamSmall", "Loco Steam Small", EntityLocoSteamSmall.class, ItemIDs.minecartLoco3.item, "steam", 250, 45, 0, 140, 140, 160, 0.5D, 0.968D, 5000, new String[]{"Blue", "Red", "Green", "Yellow", "Black"}, 18, -1.7),
				TrainRecord.makeEntry("locoSteamLSSP7", "Loco Steam LSSP7", EntityLocoSteamLSSP7.class, ItemIDs.minecartLocoLSSP7.item, "steam", 250, 45, 0, 140, 140, 160, 0.5D, 0.968D, 5000, null, 18, -1.1),
				TrainRecord.makeEntry("locoHeavySteam", "Loco Steam Heavy", EntityLocoSteamHeavy.class, ItemIDs.minecartHeavySteam.item, "steam", 3000, 75, 0, 40, 140, 190, 0.4D, 0.9D, 10000, new String[]{"Black", "Brown"}, 7, -3),//its back
				TrainRecord.makeEntry("locoSteamC62Class", "Loco Steam C62Class", EntityLocoSteamC62Class.class, ItemIDs.minecartLocoC62Class.item,
						"steam", 1223, 129, 0, 60, 180, 160, 0.7, 0.97, 10000, new String[]{"Black", "Red"}, 7, -5.66),
				TrainRecord.makeEntry("locoSteamD51Short", "Loco Steam D51 Short Streamlining", EntityLocoSteamD51.class, ItemIDs.minecartLocoD51Short.item,
						"steam", 1658, 85, 0, 60, 180, 160, 0.7, 0.97, 10000, new String[]{"Black", "Grey"}, 7, -5.66),
				TrainRecord.makeEntry("locoSteamD51Long", "Loco Steam D51 Long Streamlining", EntityLocoSteamD51Long.class, ItemIDs.minecartLocoD51Long.item,
						"steam", 1658, 85, 0, 60, 180, 160, 0.7, 0.97, 10000, new String[]{"Black", "Grey"}, 7, -5.66),
				TrainRecord.makeEntry("locoSteamBR01_DB", "Loco Steam BR01", EntityLocoSteamBR01_DB.class, ItemIDs.minecartLocoBR01_DB.item, "steam", 2120, 130, 0, 60, 200, 300, 0.6, 0.97, 10000, new String[]{"Black", "Grey", "LightGrey"}, 10, -3.7),
				TrainRecord.makeEntry("locoSteamCoranationClass", "Loco Steam Coranation Class", EntityLocoSteamCoranationClass.class,
						ItemIDs.minecartLocoCoranationClass.item, "steam", 1619, 183, 0, 60, 200, 300, 0.6, 0.97, 10000, null, 10,
						-6),
				TrainRecord.makeEntry("locoSteamGS4", "Loco Steam GS4", EntityLocoSteamGS4.class, ItemIDs.minecartGS4_Loco.item, "steam", 2653, 180, 0, 60, 350, 450, 0.6, 0.95, 8800, new String[]{"Orange", "White"}, 10, -6),
				TrainRecord.makeEntry("locoSteamEr_USSR", "Loco Steam ER_USSR", EntityLocoSteamEr_Ussr.class, ItemIDs.minecartLocoEr.item, "steam", 800, 80, 0, 80, 100, 200, 0.35, 0.975, 10000, null, 10, -3.7),
				TrainRecord.makeEntry("locoSteamC41", "Loco Steam C41", EntityLocoSteamC41.class, ItemIDs.minecartLocoC41.item, "steam", 1484, 120, 0, 80, 100, 200, 0.35, 0.975, 4000, null, 10, -3.4),
				TrainRecord.makeEntry("locoSteamC41_080", "Loco Steam C41 0-8-0", EntityLocoSteamC41_080.class, ItemIDs.minecartLocoC41_080.item, "steam", 1484, 120, 0, 80, 100, 200, 0.35, 0.975, 4000, null, 10, -3.4),
				TrainRecord.makeEntry("locoSteamAlcoSc4", "Loco Steam Alco SC4", EntityLocoSteamAlcoSC4.class, ItemIDs.minecartLocoAlcoSC4.item, "steam", 800, 120, 0, 80, 100, 200, 0.35, 0.975, 4000, null, 10, -3.4),
				TrainRecord.makeEntry("locoSteamSouthern1102", "Loco Steam Southern 1102", EntityLocoSteamSouthern1102.class, ItemIDs.minecartLocoSouthern1102.item, "steam", 1236, 118, 0, 80, 100, 200, 0.35, 0.975, 10000, null, 10, -3.4),
				TrainRecord.makeEntry("locoSteamUSATCUS", "Loco Steam USATCUS", EntityLocoSteamUSATCUS.class, ItemIDs.minecartLocoUSATCUS.item, "steam", 210, 75, 0, 80, 100, 200, 0.35, 0.975, 10000, null, 10, -2.5),
				TrainRecord.makeEntry("locoSteamUSATCUK", "Loco Steam USATCUK", EntityLocoSteamUSATCUK.class, ItemIDs.minecartLocoUSATCUK.item, "steam", 210, 75, 0, 80, 100, 200, 0.35, 0.975, 10000, null, 10, -2.5),
				TrainRecord.makeEntry("locoSteamC41T", "Loco Steam C41T", EntityLocoSteamC41T.class, ItemIDs.minecartLocoC41T.item, "steam", 1484, 110, 0, 80, 100, 200, 0.35, 0.975, 16000, null, 10, -3.4),
				TrainRecord.makeEntry("locoSteamForney", "Loco Steam Forney", EntityLocoSteamForneyRed.class, ItemIDs.minecartLocoForneyRed.item, "steam", 600, 70, 0, 60, 160, 130, 0.44, 0.968, 8000, new String[]{"Red", "Grey", "Yellow", "Brown", "Blue", "Green"}, 17, -1.8),
				TrainRecord.makeEntry("locoSteamMogul", "Loco Steam Mogul", EntityLocoSteamMogulBlue.class, ItemIDs.minecartLocomogulBlue.item, "steam", 500, 65, 0, 50, 180, 180, 0.56, 0.967, 5000, new String[]{"Blue", "Black", "Brown", "Green", "Red", "White"}, 15, -2.2),
				TrainRecord.makeEntry("locoSteamShay", "Loco Steam Shay", EntityLocoSteamShay.class, ItemIDs.minecartLocoSteamShay.item, "steam", 250, 50, 0, 50, 160, 130, 0.5, 0.968, 4000, null, 15, -1),
				TrainRecord.makeEntry("locoSteamVBShay", "Loco Steam VB Shay", EntityLocoSteamVBShay.class, ItemIDs.minecartLocoSteamVBShay.item, "steam", 250, 32, 0, 40, 140, 100, 0.5, 0.968, 3000, null, 15, -0.5),
				TrainRecord.makeEntry("locoSteamClimax", "Loco Steam Climax", EntityLocoSteamClimax.class, ItemIDs.minecartLocoSteamClimax.item, "steam", 250, 45, 0, 50, 160, 130, 0.5, 0.968, 4000, null, 15, -1.5),
				TrainRecord.makeEntry("locoSteamPannier", "Loco Steam Pannier", EntityLocoSteamPannier.class, ItemIDs.minecartLocoSteamPannier.item, "steam", 903, 80, 0, 50, 160, 130, 0.5, 0.968, 8000, null, 15, -3.5),
				TrainRecord.makeEntry("locoSteamAlice", "Loco Steam Alice", EntityLocoSteamAlice0_4_0.class, ItemIDs.minecartLocoSteamAlice.item, "steam", 200, 32, 0, 60, 160, 200, 0.5, 0.968, 3750, null, 15, -2),
				TrainRecord.makeEntry("locoSteamGLYN", "Loco Steam glyn", EntityLocoSteamGLYN042T.class, ItemIDs.minecartLocoSteamGLYN.item, "steam", 600, 32, 0, 60, 160, 200, 0.45, 0.968, 3750, null, 15, -2.5),
				TrainRecord.makeEntry("locoSteam262T", "Loco Steam 262T", EntityLocoSteam262T.class, ItemIDs.minecartLocoSteam262T.item, "steam", 300, 70, 0, 60, 160, 300, 0.5, 0.968, 4250, null, 15, -3),
				TrainRecord.makeEntry("locoSteam040VB", "Loco Steam 040VB", EntityLocoSteam040VB.class, ItemIDs.minecartLocoSteam040vb.item, "steam", 200, 32, 0, 40, 120, 200, 0.5, 0.968, 2500, null, 15, -1.1),
				TrainRecord.makeEntry("locoSteamAdler", "Loco Steam Adler", EntityLocoSteamAdler.class, ItemIDs.minecartLocoSteamAdler.item, "steam", 200, 65, 0, 60, 160, 300, 0.5, 0.968, 3000, null, 15, -1.5),
				TrainRecord.makeEntry("locoSteamSnowPlow", "Loco Steam Snow Plow", EntityLocoSteamSnowPlow.class, ItemIDs.minecartLocoSnowPlow.item, "steam, snow plow", 200, 20, 0, 10, 120, 170, 0.7, 0.965, 6850, null, 18, -4.75),

				TrainRecord.makeEntry("locoDieselCF7", "Loco Diesel CF7", EntityLocoDieselCF7.class, ItemIDs.minecartLocoCF7.item, "diesel", 1500, 116, 0, 25, 0, 200, 0.8, 0.97, 12000, new String[]{"Yellow", "Lime", "Pink"}, 10, -3, "Pack: Classic"),
				TrainRecord.makeEntry("locoDieselGP15", "Loco Diesel GP15", EntityLocoDieselGP15.class, ItemIDs.minecartLocoGP15.item, "diesel", 1800, 105, 0, 25, 0, 160, 0.79, 0.93, 15000, new String[]{"Yellow", "Orange", "Red"}, 10, -2.6, "Pack: Classic"),
				TrainRecord.makeEntry("LocoDieselSW8", "SW8", EntityLocoDieselSW8.class, ItemIDs.minecartLocoSW8.item, "diesel", 800, 105, 0, 15, 0, 160, 0.6, 0.890, 10000, new String[]{"Red", "Black"}, 10, -2.0, "Pack: Classic"),
				TrainRecord.makeEntry("locoElectricRenfe446Motor", "Loco Electric Renfe 446 Motor", EntityLocoElectricRenfe446Motor.class, ItemIDs.minecartLocoRenfe446Motor.item, "electric", 1050, 100, 0, 3, 0, 230, 1.4, 0.98, 0, new String[]{"Red", "White", "Purple", "Orange"}, 10, -3.1, "Pack: Spanish Pack"),
				TrainRecord.makeEntry("passengerRenfe446Coach", "Passenger Renfe 446 Coach", EntityPassengerRenfe446Coach.class, ItemIDs.minecartPassengerRenfe446Coach.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Red", "White", "Purple", "Orange"}, 10, 0, "Pack: Spanish Pack"),
				TrainRecord.makeEntry("cabooseRenfe446Tail", "Passenger Renfe 446 Tail", EntityCabooseRenfe446Tail.class, ItemIDs.minecartCabooseRenfe446Tail.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Red", "White", "Purple", "Orange"}, 10, 0, "Pack: Spanish Pack"),
				TrainRecord.makeEntry("pch120", "PCH-120 Commute", EntityLocoElectricPCH120.class, ItemIDs.minecartPCH120Commute.item, "electric", 1400, 120, 0, 5, 0, 160, 0.8, 0.985, 0, new String[]{"White", "Blue", "Green"}, 18, -2.7, "Pack: Peachy's Railtech"),
				TrainRecord.makeEntry("pch120coach", "PCH-120 Commute Car", EntityPassengerPCH120Coach.class, ItemIDs.minecartPCH120Car.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, new String[]{"White", "Blue", "Green"}, 0, 0, "Pack: Peachy's Railtech"),
				TrainRecord.makeEntry("LUengine", "London Underground Engine", EntityElectricLUengine.class, ItemIDs.minecartLUengine.item, "electric", 600, 100, 0, 10, 0, 100, 0.7, 0.8, 1000, null, 18, -2, "Pack: B.I.P."),
				TrainRecord.makeEntry("LUpassenger", "London Underground Passenger Car", EntityLUpassenger.class, ItemIDs.minecartLUcar.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, null, 10, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("DstockEngine", "London D Stock Engine", EntityElectricDstockEngine.class, ItemIDs.minecartDstockEngine.item, "electric", 600, 80, 0, 10, 0, 100, 0.7, 0.8, 1000, new String[]{"Red", "Blue", "Grey", "Orange"}, 18, -2, "Pack: MetroIM"),
				TrainRecord.makeEntry("DstockPassenger", "London D Stock Passenger Car", EntityDstockPassenger.class, ItemIDs.minecartDstockCar.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, new String[]{"Red", "Blue", "Grey", "Orange"}, 10, 0, "Pack: MetroIM"),
				TrainRecord.makeEntry("Class345", "Class 345 Engine", EntityElectricClass345.class, ItemIDs.minecartClass345engine.item, "electric", 1500, 300, 0, 10, 0, 100, 0.9, 0.9, 1000, new String[]{"White", "Red", "Orange", "Pink"}, 18, -3.15, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class345Coach", "Class 345 Passenger Car", EntityClass345Coach.class, ItemIDs.minecartClass345car.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"White", "Red", "Orange", "Pink"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("passengerPS52SeatCoach", "PS 52 Seat Coach", EntityPassengerPS52SeatCoach.class, ItemIDs.minecartPS52seatCoach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Orange", "LightBlue", "Black", "Cyan", "Yellow", "Pink", "Magenta"}, 10, 0, "Pack: BAP"),
				TrainRecord.makeEntry("passengerPSCombine", "PS Combine Coach", EntityPassengerPSCombine.class, ItemIDs.minecartPScombine.item, "passenger/combine", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Orange"}, 10, 0, "Pack: BAP"),
				TrainRecord.makeEntry("passengerPScenterDiner", "PS Center Diner", EntityPassengerPScenterDiner.class, ItemIDs.minecartPSCenterDiner.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Cyan"}, 10, 0, "Pack: BAP"),
				TrainRecord.makeEntry("passengerPSAnotherDiner", "PS Center Diner 2", EntityPassengerPSAnotherDiner.class, ItemIDs.minecartPSAnotherDiner.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Orange", "Cyan"}, 10, 0, "Pack: BAP"),
				TrainRecord.makeEntry("locoElectricBNLRV_A", "BNLRV_A", EntityLocoElectricBNLRV_A.class, ItemIDs.minecartBNLRV_A.item, "electric", 500, 70, 3, 10, 0, 0, 0.7, 0.95, 0, new String[]{"Orange", "White", "Yellow", "Grey", "Black"}, 10, -4, "Pack: Trams In Motion"),
				TrainRecord.makeEntry("passengerBNLRV_B", "BNLRV_B", EntityPassengerBNLRV_B.class, ItemIDs.minecartBNLRV_B.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Orange", "White", "Yellow", "Grey", "Black"}, 10, 0, "Pack: Trams in Motion"),
				TrainRecord.makeEntry("passengerBW305", "BW305", EntityPassengerBW305.class, ItemIDs.minecartPassengerBW305.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, new String[]{"Orange", "Green", "Yellow", "Blue", "Magenta", "Cyan", "Brown"}, 0, 0, "Pack: Trams in Motion"),
				TrainRecord.makeEntry("locoElectricTW305", "TW305", EntityLocoElectricTW305.class, ItemIDs.minecartLocoElectricTW305.item, "electric", 350, 55, 0, 10, 0, 140, 0.75, 0.7, 0, new String[]{"Orange", "Green", "Yellow", "Blue", "Magenta", "Cyan", "Brown"}, 14, -2, "Pack: Trams in Motion"),
				TrainRecord.makeEntry("locoElectricMetro2000", "Metro2000loco", EntityElectricMetro2000Motor.class, ItemIDs.minecartMetro2000Loco.item, "electric", 600, 65, 3, 10, 0, 0, 0.8, 0.9, 0, new String[]{"Blue", "White", "Red"}, 18, -3.1, "Pack: Metro in Motion"),
				TrainRecord.makeEntry("passengerMetro2000", "Metro2000Passenger", EntityPassengerMetro2000.class, ItemIDs.minecartMetro2000Passenger.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "White", "Red"}, 0, 0, "Pack: Metro In Motion"),

				TrainRecord.makeEntry("locoElectricRenfe450Motor", "Loco Electric Renfe 450 Motor", EntityLocoElectricRenfe450Motor.class, ItemIDs.minecartLocoRenfe450Motor.item, "electric", 2900, 140, 0, 3, 0, 230, 1.4, 0.98, 0, new String[]{"Red", "White"}, 10, -3.6, "Pack: Spanish Pack"),
				TrainRecord.makeEntry("passengerRenfe450Coach", "Passenger Renfe 450 Coach", EntityPassengerRenfe450Coach.class, ItemIDs.minecartPassengerRenfe450Coach.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, new String[]{"Red", "White"}, 10, 0, "Pack: Spanish Pack"),
				TrainRecord.makeEntry("cabooseRenfe450Tail", "Passenger Renfe 450 Tail", EntityCabooseRenfe450Tail.class, ItemIDs.minecartCabooseRenfe450Tail.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, new String[]{"Red", "White"}, 10, 0, "Pack: Spanish Pack"),
				TrainRecord.makeEntry("locoCD814", "CD814 Driving Motor", EntityLocoDieselCD814.class, ItemIDs.minecartCD814.item, "diesel", 325, 80, 0, 10, 0, 200, 0.8, 0.97, 6000, new String[]{"Blue", "Yellow"}, 10, -2.0, "Pack: Classic"),
				TrainRecord.makeEntry("passengerCD014", "CD014 Trailer", EntityPassengerCD014.class, ItemIDs.minecartCD014.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Yellow"}, 10, 0, "Pack: Classic"),
				TrainRecord.makeEntry("passengerCD914", "CD914 Driving Trailer", EntityPassengerCD914.class, ItemIDs.minecartCD914.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Yellow"}, 10, 0, "Pack: Classic"),
				TrainRecord.makeEntry("locoCD810", "CD810 Driving Motor", EntityLocoDieselCD810.class, ItemIDs.minecartCD810.item, "diesel", 207, 80, 0, 60, 0, 200, 0.8, 0.97, 6000, new String[]{"Blue", "Red", "Yellow"}, 10, -2.0, "Pack: Classic"),
				TrainRecord.makeEntry("passengerCD010", "CD010 Trailer", EntityPassengerCD010.class, ItemIDs.minecartCD010.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Red", "Yellow"}, 10, 0, "Pack: Classic"),
				TrainRecord.makeEntry("VBShay", "2TruckVerticalBoilerShay", EntityLocoSteamVBShay2.class, ItemIDs.minecartVBShay2.item, "steam", 230, 35, 0, 50, 160, 120, 0.7, 0.99, 5000, null, 15, -1.0, "Pack: ?"),
				TrainRecord.makeEntry("locoSteamClimax2", "2TruckClimax", EntityLocoSteamClimaxNew.class, ItemIDs.minecartClimaxNew.item, "steam", 280, 55, 0, 50, 160, 120, 0.7, 0.99, 8000, null, 15, -1.0, "Pack: ?"),
				TrainRecord.makeEntry("freightRoundHopper", "Freight Round Covered Hopper", EntityFreightRoundHopper.class, ItemIDs.minecartRoundHopper.item, "freight", 3, new String[]{"Red", "Black", "White", "LightGrey"}, 18, 36, "Cargo: any. Pack: Classic"),
				TrainRecord.makeEntry("freightRibbedHopper", "Freight Ribbed Covered Hopper", EntityFreightRibbedHopper.class, ItemIDs.minecartRibbedHopper.item, "freight", 3, new String[]{"Grey", "Cyan", "LightGrey", "Red", "Brown", "White"}, 18, 36, "Cargo: any. Pack: Classic"),
				TrainRecord.makeEntry("locoDieselSM42", "Loco SM42", EntityLocoDieselSM42.class, ItemIDs.minecartLocoSM42.item, "diesel", 800, 90, 0, 35, 0, 200, 0.8, 0.97, 10000, new String[]{"Green", "Lime"}, 10, -3, "Pack: Modern"),
				TrainRecord.makeEntry("locoSteamC11", "Loco Steam C11", EntityLocoSteamC11.class, ItemIDs.minecartLocoC11.item, "steam", 1030, 97, 0, 80, 100, 200, 0.35, 0.975, 16000, null, 10, -3.0, "Pack: BJP"),
				TrainRecord.makeEntry("locoDieselGE44Ton", "GE 44-ton", EntityLocoDieselGE44Ton.class, ItemIDs.minecartLocoGE44Ton.item, "diesel", 360, 56, 0, 10, 0, 170, 0.7, 0.965, 6850, new String[]{"Yellow", "Black"}, 10, -2.0, "Pack: BAP"),
				TrainRecord.makeEntry("amfleet", "Amfleet", EntityPassengerAmfleet.class, ItemIDs.minecartAmfleet.item, "passenger", 2, new String[]{"White", "Grey", "LightGrey", "LightBlue", "Red", "Blue"}, 10, 0, "Pack: ?"),
				TrainRecord.makeEntry("amfleet2", "Amfleet2", EntityPassengerAmfleet2.class, ItemIDs.minecartAmfleet2.item, "passenger", 2, new String[]{"Blue", "LightGrey", "Grey"}, 0, 0, "Pack: ?"),
				TrainRecord.makeEntry("Bap40highcube", "40highcube", EntityFreightBap40highcube.class, ItemIDs.minecart40highcube.item, "freight", 4, new String[]{"Brown", "Green", "Cyan", "Orange", "Grey", "Red", "Lime", "LightGrey", "Pink", "Purple", "Blue", "Black", "White", "Magenta"}, 0, 40, "Pack: BAP"),
				TrainRecord.makeEntry("BapWoodchipHopper", "Woodchip Hopper", EntityFreightBapWoodchipHopper.class, ItemIDs.minecartWoodchipHopper.item, "freight", 5, new String[]{"Brown", "Blue", "Green", "Orange", "Red", "White"}, 0, 50, "Cargo: woodchips/sawdust. Pack: BAP"),
				TrainRecord.makeEntry("BapOreJenny", "Ore Jenny", EntityFreightBapOreJenny.class, ItemIDs.minecartOreJenny.item, "freight", 0.5, new String[]{"Brown", "Red", "Orange", "Pink", "Black"}, 0, 27, "Cargo: Ores. Pack: BAP"),
				TrainRecord.makeEntry("BapMillGondola", "52footMillGondola", EntityFreightBapMillGondola.class, ItemIDs.minecartMillGondola.item, "freight", 5, new String[]{"Red", "Black", "Orange", "Green"}, 30, 50, "Pack: BAP"),
				TrainRecord.makeEntry("BapMILW40boxcar", "MILW40boxcar", EntityFreightBapMILW40boxcar.class, ItemIDs.minecartMILW40boxcar.item, "freight", 4, new String[]{"Red", "Brown", "Yellow", "Green", "Blue", "Purple", "Orange", "Lime"}, 0, 27, "Pack: BAP"),
				TrainRecord.makeEntry("Bap60centerbeam", "60centerbeam", EntityFreightBap60centerbeam.class, ItemIDs.minecart60centerbeam.item, "freight", 6, new String[]{"Black", "Yellow", "Green", "LightGrey"}, 0, 54, "Cargo: Woodthings. Pack: BAP"),
				TrainRecord.makeEntry("Bap66centerbeam", "66centerbeam", EntityFreightBap66centerbeam.class, ItemIDs.minecart66centerbeam.item, "freight", 6, new String[]{"Orange", "Green", "Lime", "LightBlue", "Pink", "Blue", "Yellow", "Red", "Black"}, 0, 54, "Cargo: Woodthings. Pack: BAP"),
				TrainRecord.makeEntry("Bap73centerbeam", "73centerbeam", EntityFreightBap73centerbeam.class, ItemIDs.minecart73centerbeam.item, "freight", 7, new String[]{"Pink", "Green"}, 0, 54, "Cargo: Woodthings. Pack: BAP"),
				TrainRecord.makeEntry("BapPS140", "PS140", EntityFreightBapPS140.class, ItemIDs.minecartPS140.item, "freight", 4, new String[]{"Brown", "Red", "LightBlue", "Green"}, 0, 27, "Pack: BAP"),
				TrainRecord.makeEntry("BapPS150", "PS150", EntityFreightBapPS150.class, ItemIDs.minecartPS150.item, "freight", 5, new String[]{"White", "Lime", "Red", "Yellow"}, 0, 36, "Pack: BAP"),
				TrainRecord.makeEntry("BapPS160", "PS160", EntityFreightBapPS160.class, ItemIDs.minecartPS160.item, "freight", 6, new String[]{"Blue", "Orange"}, 0, 45, "Pack: BAP"),
				TrainRecord.makeEntry("BapWVcaboose", "WVcaboose", EntityCabooseBapWVcaboose.class, ItemIDs.minecartWVcaboose.item, "caboose", 4, new String[]{"Red", "Green", "Lime", "Cyan"}, 0, 36, "Pack: BAP"),
				TrainRecord.makeEntry("BapPEcoach", "PEcoach", EntityPassengerBapPEcoach.class, ItemIDs.minecartPEcooch.item, "festive passenger", 0, 0, 6, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Cyan"}, 10, 0),
				TrainRecord.makeEntry("BapPEobserve", "PEobserve", EntityPassengerBapPEobserve.class, ItemIDs.minecartPEobserve.item, "festive passenger", 0, 0, 6, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Cyan"}, 10, 0),
				TrainRecord.makeEntry("BapVersaLongi", "VersaLongi", EntityFreightBapVersaLongi.class, ItemIDs.minecartVersaLongi.item, "freight", 5, new String[]{"LightGrey", "Black", "Orange"}, 30, 36, "Cargo: Aggregates. Pack: BAP"),
				TrainRecord.makeEntry("BapVersaTrans", "VersaTrans", EntityFreightBapVersaTrans.class, ItemIDs.minecartVersaTrans.item, "freight", 5, new String[]{"LightBlue", "Grey", "LightGrey"}, 30, 36, "Cargo: Aggregates. Pack: BAP"),
				TrainRecord.makeEntry("BapDOT11111000", "DOT11000", EntityFreightBapDOT11111000.class, ItemIDs.minecart11000DOT111.item, "tank", 0, 0, 4, 0, 0, 0, 0, 0, 41000, new String[]{"Black", "LightGrey", "Grey"}, 10, 0, "Capacity: 41000mb. Pack: BAP"),
				TrainRecord.makeEntry("BapDOT11120600", "DOT20600", EntityFreightBapDOT11120600.class, ItemIDs.minecart20600DOT111.item, "tank", 0, 0, 5, 0, 0, 0, 0, 0, 78000, new String[]{"Grey", "Black"}, 10, 0, "Capacity: 78000mb. Pack: BAP"),
				TrainRecord.makeEntry("BapDOT11129080", "DOT29080", EntityFreightBapDOT11129080.class, ItemIDs.minecart29080DOT111.item, "tank", 0, 0, 6, 0, 0, 0, 0, 0, 110000, new String[]{"Black", "Orange", "LightGrey"}, 10, 0, "Capacity: 110000mb. Pack: BAP"),
				TrainRecord.makeEntry("BapF7A", "F7A", EntityLocoDieselBapF7A.class, ItemIDs.minecartF7A.item, "diesel", 1500, 133, 0, 25, 0, 180, 0.7, 0.79, 15000, new String[]{"Green", "LightGrey", "White", "Orange", "Black", "Yellow", "Grey", "Magenta", "LightBlue", "Pink", "Cyan", "Brown", "Red", "Lime", "Blue", "Purple", "Skin16"}, 10, -2.5, "Pack: Bap"),
				TrainRecord.makeEntry("BapF7B", "F7B", EntityLocoDieselBapF7B.class, ItemIDs.minecartF7B.item, "diesel", 1500, 133, 0, 25, 0, 180, 0.7, 0.79, 15000, new String[]{"Green", "LightGrey", "White", "Orange", "Black", "Yellow", "Grey", "Magenta", "LightBlue", "Pink", "Cyan", "Brown", "Red", "Lime", "Blue", "Purple"}, 10, -2.4, "Pack: Bap"),
				TrainRecord.makeEntry("H1044", "H1044", EntityLocoDieselBapH1044.class, ItemIDs.minecartH1044.item, "diesel", 1000, 97, 0, 25, 0, 175, 0.75, 0.85, 10000, new String[]{"Green", "Yellow", "Black", "Red", "Blue", "Grey", "LightBlue", "Orange", "White", "Lime", "LightGrey"}, 18, -2.2, "Pack: BAP"),
				TrainRecord.makeEntry("locoSteamStarClass", "Loco Steam Star Class", EntityLocoSteamStarClass.class, ItemIDs.minecartStarClass.item, "steam", 303, 80, 0, 60, 160, 300, 0.5, 0.968, 3000, null, 15, -1.5, "Pack: WWCP"),
				TrainRecord.makeEntry("tenderStarClass", "Tender Star Class", EntityTenderStarClass.class, ItemIDs.minecartStarClassTender.item, "tender", 0, 0, 0.5, 0, 0, 0, 0, 0, 4000, null, 18, 0, "Water capacity: 4000mb"),
				TrainRecord.makeEntry("passengerStarCarFat", "Passenger Star Fat", EntityPassengerStarCarFat.class, ItemIDs.minecartStarCarFat.item, "passenger", 0, 0, 0.5, 0, 0, 0, 0, 0, 0, null, 10, 0, "Pack: WWCP"),
				TrainRecord.makeEntry("passengerStarCarNotFat", "Passenger Star Not Fat", EntityPassengerStarCarNotFat.class, ItemIDs.minecartStarCarNotFat.item, "passenger", 0, 0, 0.5, 0, 0, 0, 0, 0, 0, null, 10, 0, "Pack: WWCP"),
				TrainRecord.makeEntry("LightCrane", "LightCrane", EntityLightCrane.class, ItemIDs.minecartLightCrane.item, "mobile crane", 10, new String[]{"Red", "Blue"}, 10, 0, "Pack: ?"),
				TrainRecord.makeEntry("BR155", "Loco Electric BR155", EntityLocoElectricBR155.class, ItemIDs.minecartBR155.item, "electric", 6839, 120, 0, 38, 0, 170, 0.66, 0.96, 8000, new String[]{"Grey", "Red", "Brown", "Green"}, 15, -3.6, "Pack: WWCP"),
				TrainRecord.makeEntry("Onion", "Onion", EntityLocoOnion.class, ItemIDs.minecartOnion.item, "steam", 350, 155, 0, 50, 140, 100, 0.7, 0.99, 8000, new String[]{"Black", "Orange", "Blue", "Grey", "Red", "Yellow", "White", "Brown", "LightGrey", "Pink"}, 15, -1.3, "Pack: BAP"),
				TrainRecord.makeEntry("OnionTender", "Onion Tender", EntityTenderOnion.class, ItemIDs.minecartOnionTender.item, "tender", 0, 0, 0.1, 0, 0, 0, 0, 0, 12000, new String[]{"Black", "Orange", "Blue", "Grey", "Red", "Yellow", "White", "Brown", "LightGrey", "Pink"}, 15, 0, "Water capacity: 12000mb. Pack: Bap"),
				TrainRecord.makeEntry("loco440RFront", "Loco 440R Front", EntityLocoElectric440RFront.class, ItemIDs.minecart440RFront.item, "electric", 700, 140, 0, 35, 0, 230, 1.4, 0.98, 0, new String[]{"Red", "White", "Purple"}, 10, -3.6, "Pack: Spanish Pack"),
				TrainRecord.makeEntry("passenger440RMid", "Passenger 440R Mid", EntityPassenger440RMid.class, ItemIDs.minecart440RMid.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, new String[]{"Red", "White", "Purple"}, 10, 0, "Pack: Spanish Pack"),
				TrainRecord.makeEntry("passenger440RRear", "Passenger 440R Rear", EntityPassenger440RRear.class, ItemIDs.minecart440RRear.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, new String[]{"Red", "White", "Purple"}, 10, 0, "Pack: Spanish Pack"),
				TrainRecord.makeEntry("GP13", "GP13", EntityLocoDieselGP13.class, ItemIDs.minecartGP13.item, "diesel", 2510, 90, 0, 15, 0, 200, 0.74, 0.96, 15000, new String[]{"Blue", "LightBlue", "Black", "Orange", "White", "Yellow"}, 10, 1.4, "Pack: ?. Uses the heritage GP40 Model"),
				TrainRecord.makeEntry("DB143", "Loco Electric DB143", EntityLocoElectricDB143.class, ItemIDs.minecartDB143.item, "electric", 4990, 120, 0, 8, 0, 170, 0.66, 0.96, 8000, null, 15, -3.6, "Pack: ?"),
				TrainRecord.makeEntry("locoSteamPELoco", "Loco Steam PELoco", EntityLocoSteamPELoco.class, ItemIDs.minecartPELocomotive.item, "steam", 1484, 120, 0, 80, 100, 200, 0.35, 0.975, 4000, null, 10, -3.4),
				TrainRecord.makeEntry("tenderPETender", "Tender PETender", EntityTenderPETender.class, ItemIDs.minecartPETender.item, "tender", 0, 0, 1.5, 0, 0, 0, 0, 0, 20000, null, 18, 0, "Water capacity: 20000mb"),
				TrainRecord.makeEntry("BapB23", "B23-7", EntityLocoDieselBapB23.class, ItemIDs.minecartB23.item, "diesel", 2250, 90, 0, 35, 0, 190, 0.74, 0.91, 18000, new String[]{"Yellow", "Red", "Blue", "LightGrey", "White", "Orange", "Pink"}, 10, -3.3, "Pack: Bap"),
				TrainRecord.makeEntry("C424", "C424", EntityLocoDieselBapC424.class, ItemIDs.minecartC424.item, "diesel", 2400, 113, 0, 40, 0, 190, 0.7, 0.8, 18000, new String[]{"Yellow", "Red", "Cyan", "Pink"}, 10, -3.5, "Pack: Bap"),
				TrainRecord.makeEntry("C425", "C425", EntityLocoDieselBapC425.class, ItemIDs.minecartC425.item, "diesel", 2500, 113, 0, 40, 0, 190, 0.7, 0.8, 18000, new String[]{"Black"}, 10, -3.5, "Pack: Bap"),
				TrainRecord.makeEntry("GP7u", "GP7u", EntityLocoDieselBapGP7u.class, ItemIDs.minecartGP7u.item, "diesel", 1500, 100, 0, 25, 0, 170, 0.81, 0.93, 18000, new String[]{"Red", "Blue", "LightGrey", "Grey", "White", "Yellow"}, 10, -2.9, "Pack: Bap"),
				TrainRecord.makeEntry("GP7", "GP7", EntityLocoDieselBapGP7.class, ItemIDs.minecartGP7.item, "diesel", 1500, 105, 0, 25, 0, 170, 0.81, 0.93, 18000, new String[]{"Yellow", "Blue", "White", "Brown", "Black", "Red", "Green", "Purple", "LightGrey", "Grey", "Lime", "Cyan", "Pink", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21"}, 10, -2.9, "Pack: Bap"),
				TrainRecord.makeEntry("GP7b", "GP7b", EntityLocoDieselBapGP7b.class, ItemIDs.minecartGP7b.item, "diesel", 1500, 105, 0, 25, 0, 170, 0.81, 0.93, 18000, new String[]{"Blue", "White", "Red", "Yellow"}, 10, -2.9, "Pack: Bap"),
				TrainRecord.makeEntry("GP9", "GP9", EntityLocoDieselBapGP9.class, ItemIDs.minecartGP9.item, "diesel", 1750, 100, 0, 25, 0, 170, 0.81, 0.93, 18000, new String[]{"Grey", "Red", "Orange", "Magenta", "Yellow", "Black", "Brown", "Blue", "Green"}, 10, -2.9, "Pack: Bap"),
				TrainRecord.makeEntry("GP30", "GP30", EntityLocoDieselBapGP30.class, ItemIDs.minecartGP30.item, "diesel", 2250, 114, 0, 30, 0, 180, 0.7, 0.91, 20000, new String[]{"LightGrey", "Black", "Yellow", "Blue", "Orange", "White", "Grey", "Red", "Purple", "Pink", "Cyan"}, 10, -3.1, "Pack: Bap"),
				TrainRecord.makeEntry("GP38dash2", "GP38dash2", EntityLocoDieselBapGP38dash2.class, ItemIDs.minecartGP38dash2.item, "diesel", 2000, 105, 0, 25, 0, 180, 0.75, 0.9, 20000, new String[]{"Cyan", "Green", "LightGrey", "Red", "Blue", "Yellow", "Orange", "Grey", "Black", "Pink", "Lime"}, 10, -3.1, "Pack: Bap"),
				TrainRecord.makeEntry("KOF_III", "Kof III", EntityLocoDieselKof_III.class, ItemIDs.minecartKofIII.item, "diesel", 240, 30, 0, 45, 0, 200, 0.74, 0.78, 5000, new String[]{"Red", "LightBlue", "Blue", "Cyan"}, 10, -1.5, "Pack: WWCP"),
				TrainRecord.makeEntry("KOF_III_M", "Kof III M", EntityLocoDieselKof_III_M.class, ItemIDs.minecartKofIIIM.item, "diesel", 240, 45, 0, 45, 0, 200, 0.74, 0.78, 5000, new String[]{"Red", "Yellow"}, 10, -1.5, "Pack: WWCP"),
				TrainRecord.makeEntry("U36C", "U36C", EntityLocoDieselBapU36C.class, ItemIDs.minecartU36C.item, "diesel", 3600, 113, 0, 35, 0, 180, 0.75, 0.84, 21000, new String[]{"Grey", "Blue", "Red", "Yellow", "Orange"}, 10, -3.75, "Pack: Bap"),
				TrainRecord.makeEntry("GP49", "GP49", EntityLocoDieselBapGP49.class, ItemIDs.minecartGP49.item, "diesel", 2800, 105, 0, 35, 0, 180, 0.75, 0.9, 20000, null, 10, -3.1, "Pack: Bap"),
				TrainRecord.makeEntry("BapGP15", "GP15", EntityLocoDieselBapGP15.class, ItemIDs.minecartGP15.item, "diesel", 1800, 105, 0, 15, 0, 160, 0.79, 0.90, 15000, new String[]{"Yellow", "LightGrey"}, 10, -2.6, "Pack: Bap"),
				TrainRecord.makeEntry("spookyGarrattFront", "Garratt Front", EntityLocoSteamGarrattFront.class, ItemIDs.minecartGarrattFront.item, "steam", 2838, 112, 0, 1, 1, 10, 0.65, 0.90, 10000, null, 7, -2.25, "Multi-Segment Locomotive. Creative Only."),//front
				TrainRecord.makeEntry("spookyGarrattRear", "Garratt Rear", EntityLocoSteamGarrattRear.class, ItemIDs.minecartGarrattBack.item, "steam", 2838, 112, 0, 1, 1, 10, 0.65, 0.90, 10000, null, 7, -2.25, "Multi-Segment Locomotive. Creative Only."),//rear
				TrainRecord.makeEntry("spookyGarrattMid", "Garratt Mid", EntityLocoSteamGarrattMid.class, ItemIDs.minecartGarrattMid.item, "steam", 2838, 112, 0, 1, 1, 160, 0.65, 0.90, 10000, null, 7, -4.25, "Multi-Segment Locomotive. Creative Only."),//mid
				TrainRecord.makeEntry("Skook", "Skookum", EntityLocoSteamSkook.class, ItemIDs.minecartSkook.item, "steam", 1000, 75, 0, 75, 75, 190, 0.8, 0.91, 2000, null, 10, -2.4, "Pack: Bap"),
				TrainRecord.makeEntry("SkookTender", "Skookum Tender", EntityTenderSkookTender.class, ItemIDs.minecartSkookTender.item, "tender", 0, 0, 2, 0, 0, 0, 0, 0, 15000, null, 18, 0, "Water capacity: 15000mb. Pack: Bap"),
				TrainRecord.makeEntry("EF1", "EF1", EntityLocoElectricBapEF1.class, ItemIDs.minecartEF1.item, "electric", 1720, 64, 0, 55, 0, 150, 0.65, 0.75, 12500, new String[]{"Orange", "Yellow", "Red", "Green", "Black", "Grey"}, 10, -3.4375, "Pack: Bap"),
				TrainRecord.makeEntry("EF1B", "EF1B", EntityLocoElectricBapEF1B.class, ItemIDs.minecartEF1B.item, "electric", 1720, 64, 0, 55, 0, 150, 0.65, 0.75, 12500, new String[]{"Orange", "Red", "Black", "Pink"}, 10, -2.3125, "Pack: Bap"),
				TrainRecord.makeEntry("EP1A", "EP1A", EntityLocoElectricBapEP1A.class, ItemIDs.minecartEP1A.item, "electric", 2500, 120, 0, 55, 0, 150, 0.75, 0.85, 12500, new String[]{"Orange", "Red"}, 10, -3.4375, "Pack: Bap"),
				TrainRecord.makeEntry("SD9", "SD9", EntityLocoDieselBapSD9.class, ItemIDs.minecartSD9.item, "diesel", 1750, 104, 0, 35, 0, 190, 0.75, 0.89, 15000, new String[]{"Black", "Green", "Lime", "Orange", "White", "Cyan", "Grey", "Yellow", "LightGrey"}, 10, -3.2, "Pack: Bap"),
				TrainRecord.makeEntry("SD40dash2", "SD40-2", EntityLocoDieselBapSD40dash2.class, ItemIDs.minecartSD40dash2.item, "diesel", 3000, 105, 0, 45, 0, 190, 0.75, 0.89, 20000, new String[]{"LightGrey", "Orange", "Cyan", "Grey"}, 10, -3.8, "Pack: Bap"),
				//TrainRecord.makeEntry(""HuskyStackWellcar",53' HuskyStack Wellcar", EntityFreightBapHuskyStack.class, ItemIDs.minecartHuskyStackWellcar.item, "freight", 4, new String[] {"Yellow", "Pink"}, 0,0, "Pack: Bap. Load Containers into it by RClicking!"),
				TrainRecord.makeEntry("U23B", "U23B", EntityLocoDieselBapU23B.class, ItemIDs.minecartU23B.item, "diesel", 2250, 70, 0, 35, 0, 180, 0.7, 0.88, 18000, new String[]{"Grey", "Orange", "LightGrey", "Yellow", "Blue", "LightBlue", "Black", "Green", "Purple"}, 10, -3.3, "Pack: Bap"),
				TrainRecord.makeEntry("U18B", "U18B", EntityLocoDieselBapU18B.class, ItemIDs.minecartU18B.item, "diesel", 1800, 70, 0, 20, 0, 140, 0.7, 0.88, 10000, new String[]{"Orange", "Green", "Black", "Purple", "Pink", "Red", "Magenta", "Brown", "LightBlue", "Yellow", "LightGrey", "Lime", "Grey", "Blue", "Cyan", "White", "Skin16", "Skin17", "Skin18", "Skin19"}, 10, -2.5, "Pack: Bap"),
				TrainRecord.makeEntry("hicube60foot", "60 Foot Hi-Cube Boxcar", EntityFreightBaphicube60foot.class, ItemIDs.minecarthicube60foot.item, "freight", 7, new String[]{"Yellow", "Red", "Pink", "Blue"}, 10, 54, "Pack: BAP"),
				TrainRecord.makeEntry("freightBNSFGon", "Freight BNSF Gondola", EntityFreightBNSFGon.class, ItemIDs.minecartBNSFGon.item, "freight", 5, new String[]{"Black", "Grey"}, 18, 45, "Cargo: Blocks, Vanilla Items. Pack: TCM"),
				TrainRecord.makeEntry("locoElectricILMA", "Loco Electric ILMA", EntityLocoElectricILMA.class, ItemIDs.minecartILMA.item, "electric", 400, 40, 0, 15, 0, 400, 0.9, 0.946, 0, new String[]{"Green", "Lime"}, 18, -1, "Pack: Bigj's Little locos"),
				TrainRecord.makeEntry("locoElectricILMB", "Loco Electric ILMB", EntityLocoElectricILMB.class, ItemIDs.minecartILMB.item, "electric", 500, 40, 0, 15, 0, 400, 0.9, 0.946, 0, new String[]{"Brown", "Lime"}, 18, -1, "Pack: Bigj's Little locos"),
				TrainRecord.makeEntry("feve3300front", "Feve3300Front", EntityLocoElectricFeve3300.class, ItemIDs.minecart3300Front.item, "electric", 897, 80, 0, 35, 0, 230, 1.4, 0.98, 0, new String[]{"Red", "Yellow", "Purple", "Blue"}, 10, -3.4, "Pack: Spanish Pack"),
				TrainRecord.makeEntry("feve3300rear", "Feve3300Rear", EntityPassengerFeve3300.class, ItemIDs.minecart3300Rear.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, new String[]{"Red", "Yellow", "Purple", "Blue"}, 10, 0, "Pack: Spanish Pack"),
				TrainRecord.makeEntry("HH660", "HH660", EntityLocoDieselBapHH660.class, ItemIDs.minecartHH660.item, "diesel", 660, 50, 0, 20, 0, 165, 0.9, 0.95, 8000, new String[]{"Yellow", "Orange", "Black"}, 10, -2, "Pack: Bap"),
				TrainRecord.makeEntry("Krautt", "Krautt", EntityLocoDieselBapKrautt.class, ItemIDs.minecartKrautt.item, "diesel", 3540, 113, 0, 65, 0, 190, 0.75, 0.89, 20000, new String[]{"Grey", "LightGrey", "Black", "Red"}, 10, -3.3, "Pack: Bap"),
				//TrainRecord.makeEntry(""BoxMotor",boxmotor", EntityLocoElectricBoxMotor.class, ItemIDs.minecartBoxMotor.item, "electric", 450, 85, 0, 35, 0,230, 1.4, 0.98, 0, null, 10,  -3.4, "Pack: TCM"),
				TrainRecord.makeEntry("Hopper5201", "5201 Cu Foot Hopper", EntityFreightBapHopper5201.class, ItemIDs.minecartHopper5201.item, "freight", 4, new String[]{"Grey", "Cyan"}, 10, 36, "Pack: Bap"),
				TrainRecord.makeEntry("Hopper6260", "6260 Cu Foot Jumbo Hopper", EntityFreightBapHopper6260.class, ItemIDs.minecartHopper6260.item, "freight", 6, new String[]{"Grey", "LightGrey"}, 10, 45, "Pack: Bap"),
				TrainRecord.makeEntry("Skeleton", "Skeleton", EntityFreightBapSkeletonLogCar.class, ItemIDs.minecartSkeletonLogCar.item, "freight", 1.5, new String[]{"Black", "LightGrey"}, 18, 18, "Cargo: only Logs. Pack: Bap"),
				TrainRecord.makeEntry("Shay3Truck", "3 Truck Shay", EntityLocoSteamShay3Truck.class, ItemIDs.minecartShay3Truck.item, "steam", 438, 35, 0, 75, 75, 190, 0.8, 0.91, 4000, new String[]{"Black", "Grey"}, 10, -1.8, "Pack: Bap"),
				TrainRecord.makeEntry("Shay3TruckTender", "3 Truck Shay Tender", EntityTenderShay3Truck.class, ItemIDs.minecartShay3TruckTender.item, "tender", 0, 0, 2, 0, 0, 0, 0, 0, 15000, new String[]{"Black", "Grey"}, 18, 0, "Water capacity: 15000mb. Pack: Bap"),
				TrainRecord.makeEntry("Dash840B", "Dash840B", EntityLocoDieselBapDash840B.class, ItemIDs.minecartDash840B.item, "diesel", 4000, 90, 0, 45, 0, 180, 0.7, 0.88, 20000, new String[]{"Grey", "Blue", "Cyan"}, 10, -3.3, "Pack: Bap"),
				TrainRecord.makeEntry("Class44", "Class 44", EntityLocoDieselClass44.class, ItemIDs.minecartClass44.item, "diesel", 1800, 145, 0, 40, 0, 170, 0.7, 0.90, 6400, new String[]{"Blue", "LightBlue", "Green", "Lime", "Pink"}, 18, -4.5, "Pack: Classic"),
				TrainRecord.makeEntry("EU07", "EU07", EntityLocoElectricEU07.class, ItemIDs.minecartEU07.item, "electric", 2680, 125, 0, 18, 0, 170, 0.66, 0.90, 8000, new String[]{"Blue", "Green", "Lime"}, 15, -3.8, "Pack: ?"),
				TrainRecord.makeEntry("SW1500", "SW1500", EntityLocoDieselBapSW1500.class, ItemIDs.minecartSW1500.item, "diesel", 1500, 105, 0, 25, 0, 180, 0.85, 0.90, 10000, new String[]{"LightBlue", "Black", "Green", "Blue"}, 10, -2, "Pack: Bap"),
				TrainRecord.makeEntry("SW1", "SW1", EntityLocoDieselBapSW1.class, ItemIDs.minecartSW1.item, "diesel", 600, 105, 0, 25, 0, 160, 0.6, 0.890, 8000, new String[]{"Orange", "Green", "Blue", "Black", "Pink", "Cyan", "LightGrey", "White", "LightBlue"}, 10, -2, "Pack: Bap"),
				TrainRecord.makeEntry("GM6C", "GM6C", EntityLocoElectricBapGM6C.class, ItemIDs.minecartGM6C.item, "electric", 6000, 115, 0, 45, 0, 150, 0.65, 0.79, 12500, null, 10, -3.8, "Pack: Bap"),
				TrainRecord.makeEntry("Dash840C", "Dash840C", EntityLocoDieselBapDash840C.class, ItemIDs.minecartDash840C.item, "diesel", 4000, 90, 0, 45, 0, 180, 0.7, 0.88, 20000, new String[]{"Orange", "Yellow", "Black", "Grey", "Red", "LightGrey"}, 10, -3.3, "Pack: Bap"),
				TrainRecord.makeEntry("SW1200", "SW1200", EntityLocoDieselBapSW1200.class, ItemIDs.minecartSW1200.item, "diesel", 1200, 105, 0, 25, 0, 160, 0.6, 0.890, 8000, new String[]{"Grey", "Blue", "Black", "Magenta", "Lime", "Yellow", "Brown", "Red"}, 10, -2, "Pack: Bap"),
				TrainRecord.makeEntry("RSD15", "RSD15", EntityLocoDieselBapRSD15.class, ItemIDs.minecartRSD15.item, "diesel", 2400, 105, 0, 30, 0, 180, 0.7, 0.91, 18000, new String[]{"Black", "Grey", "Blue"}, 10, -3.2, "Pack: Bap"),
				TrainRecord.makeEntry("freightPS73Baggage", "Freight PS 73 Baggage", EntityFreightPS73Baggage.class, ItemIDs.minecartPS73Baggage.item, "freight", 1.5, new String[]{"Blue"}, 18, 27, "Pack: Bap"),
				TrainRecord.makeEntry("freightPS85Baggage", "Freight PS 85 Baggage", EntityFreightPS85Baggage.class, ItemIDs.minecartPS85Baggage.item, "freight", 2, new String[]{"Blue", "Orange"}, 18, 27, "Pack: Bap"),
				TrainRecord.makeEntry("ES44", "ES44", EntityLocoDieselBapES44.class, ItemIDs.minecartES44.item, "diesel", 4400, 120, 0, 10, 0, 190, 0.7, 0.8, 23000, new String[]{"Lime", "Orange", "Red", "Yellow", "Blue", "LightGrey", "Grey", "Black"}, 10, -4.3, "Pack: Bap"),
				TrainRecord.makeEntry("SD70Mac", "SD70Mac", EntityLocoDieselBapSD70Mac.class, ItemIDs.minecartSD70Mac.item, "diesel", 4000, 112, 0, 10, 0, 150, 0.6, 0.8, 23000, new String[]{"Red", "Blue", "Grey", "LightGrey", "LightBlue", "Yellow", "Black", "Green", "Orange", "Lime", "Pink", "Magenta", "Brown", "Cyan"}, 18, -4, "Pack: Bap"),
				TrainRecord.makeEntry("Dash9_44CW", "Dash9_44CW", EntityLocoDieselBapDash9_44CW.class, ItemIDs.minecartDash9_44CW.item, "diesel", 4400, 119, 0, 10, 0, 190, 0.7, 0.83, 23000, new String[]{"Grey", "LightGrey", "Green"}, 10, -4.3, "Pack: Bap"),
				TrainRecord.makeEntry("Dash840BB", "Dash840BB", EntityLocoDieselBapDash840BB.class, ItemIDs.minecartDash840BB.item, "diesel", 4000, 90, 0, 45, 0, 180, 0.7, 0.88, 20000, new String[]{"Red"}, 10, -3.3, "Pack: Bap"),
				TrainRecord.makeEntry("Dash840BW", "Dash840BW", EntityLocoDieselBapDash840BW.class, ItemIDs.minecartDash840BW.item, "diesel", 4000, 90, 0, 45, 0, 180, 0.7, 0.88, 20000, new String[]{"Red"}, 10, -3.3, "Pack: Bap"),
				TrainRecord.makeEntry("Reefer64", "Reefer64", EntityFreightBapReefer64Foot.class, ItemIDs.minecartReefer64.item, "freight", 6.5, new String[]{"White", "LightGrey", "Grey", "Orange", "Green", "Red", "Black", "Cyan"}, 10, 54, "Pack: BAP"),
				TrainRecord.makeEntry("DH643", "DH643", EntityLocoDieselBapDH643.class, ItemIDs.minecartDH643.item, "diesel", 4300, 124, 0, 60, 0, 180, 0.7, 0.87, 26000, null, 10, -4.1, "Pack: Bap"),
				TrainRecord.makeEntry("CF7", "CF7angle", EntityLocoDieselBapCF7.class, ItemIDs.minecartCF7.item, "diesel", 1500, 116, 0, 25, 0, 185, 0.8, 0.8, 12000, new String[]{"Yellow", "Red", "LightGrey", "White", "Green", "Brown", "Skin16", "Skin17", "Orange", "Skin18", "Skin19", "Skin20", "Skin21", "Black", "Grey", "Cyan", "Magenta"}, 10, -2.5, "Pack: Bap"),
				TrainRecord.makeEntry("CF7round", "CF7round", EntityLocoDieselBapCF7round.class, ItemIDs.minecartCF7round.item, "diesel", 1500, 116, 0, 25, 0, 185, 0.8, 0.8, 12000, new String[]{"Blue", "Yellow", "White", "Grey"}, 10, -2.5, "Pack: Bap"),
				TrainRecord.makeEntry("NRE3gs21b", "NRE3gs21b", EntityLocoDieselBapNRE3gs21b.class, ItemIDs.minecartNRE3gs21b.item, "diesel genset", 2100, 104, 0, 10, 0, 160, 0.78, 0.8, 14000, new String[]{"Yellow", "Orange", "Grey", "LightGrey"}, 10, -3.1, "Pack: Bap"),
				TrainRecord.makeEntry("GP38dash9W", "GP38dash9W", EntityLocoDieselBapGP38dash9W.class, ItemIDs.minecartGP38dash9W.item, "diesel", 2000, 105, 0, 45, 0, 185, 0.75, 0.8, 10000, null, 10, -3.2, "Pack: Bap"),
				TrainRecord.makeEntry("locoAlcoS2", "Alco S2", EntityLocoDieselBapAlcoS2.class, ItemIDs.minecartAlcoS2.item, "diesel", 1000, 96, 0, 25, 0, 170, 0.7, 0.9, 13000, new String[]{"Black", "Grey", "Green", "Orange", "Pink", "Yellow", "Blue", "LightGrey", "Magenta", "Red"}, 18, -2, "Pack: Bap"),
				TrainRecord.makeEntry("Beep", "Beep", EntityLocoDieselBapBeep.class, ItemIDs.minecartBeep.item, "diesel", 1500, 105, 0, 25, 0, 180, 0.89, 0.8, 13000, null, 10, -2.2, "Pack: Bap"),

				TrainRecord.makeEntry("Class158", "Class 158 Engine", EntityLocoDieselClass158.class, ItemIDs.minecartClass158engine.item, "diesel", 350, 145, 3, 10, 0, 100, 0.7, 0.8, 8000, new String[]{"White", "Green", "Cyan", "Blue", "Purple", "Grey", "LightBlue", "Lime", "LightGrey", "Yellow", "Magenta", "Orange"}, 18, -4.82, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class158Coach", "Class 158 Passenger Car", EntityClass158Coach.class, ItemIDs.minecartClass158car.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"White", "Green", "Cyan", "Blue", "Purple", "Grey", "LightBlue", "Lime", "LightGrey", "Yellow", "Magenta", "Orange"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class153", "Class 153 Engine", EntityLocoDieselClass153.class, ItemIDs.minecartClass153engine.item, "diesel", 350, 120, 1.4, 10, 0, 100, 0.7, 0.9, 8000, new String[]{"LightBlue", "Green", "Grey", "Orange", "Yellow", "Blue", "Lime", "Purple", "LightGrey"}, 18, -4.18, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class153Coach", "Class 153 Coach", EntityPassengerClass153.class, ItemIDs.minecartClass153Coach.item, "passenger", 0, 0, 1.4, 0, 0, 0, 0, 0, 0, new String[]{"LightBlue", "Green", "Grey", "Orange", "Yellow", "Blue", "Lime", "Purple", "LightGrey"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class156", "Class 156 Engine", EntityLocoDieselClass156.class, ItemIDs.minecartClass156engine.item, "diesel", 285, 121, 1.4, 10, 0, 100, 0.8, 0.8, 8000, new String[]{"Black", "Blue", "Cyan", "Green", "Grey", "LightBlue", "LightGrey", "Magenta", "Pink", "Red", "White"}, 18, -3.7, "Pack:  B.I.P."),
				TrainRecord.makeEntry("Class47", "Class 47", EntityLocoDieselClass47.class, ItemIDs.minecartClass47.item, "diesel", 2580, 154, 1.4, 10, 0, 100, 0.7, 0.8, 8000, new String[]{"Black", "Blue", "Green", "Grey", "LightBlue", "LightGrey", "Magenta", "Orange", "Purple", "Red", "White", "Yellow", "Brown", "Cyan", "Pink", "Lime", "Skin17", "Skin18", "Skin19"}, 18, -4.25, "Pack: B.I.P."),
				TrainRecord.makeEntry("DRGWCaboose", "DRGWCaboose", EntityCabooseBapDRGW.class, ItemIDs.minecartDRGWCaboose.item, "caboose", 2, new String[]{"LightGrey", "Grey", "Lime", "Yellow", "Black", "Red", "Orange", "Pink"}, 0, 0, "Pack: BAP"),
				TrainRecord.makeEntry("passengerPSSleeper565", "PS 5-6-5 Sleeper", EntityPassengerPSSleeper565.class, ItemIDs.minecartPSSleeper565.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "LightBlue", "Grey", "Brown", "Orange", "LightGrey", "Cyan"}, 10, 0, "Pack: BAP"),
				TrainRecord.makeEntry("passengerPSSleeper565DRGW", "PS 5-6-5 Sleeper DRGW Edition", EntityPassengerPSSleeper565DRGW.class, ItemIDs.minecartPSSleeper565DRGW.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, null, 10, 0, "Pack: BAP"),
				TrainRecord.makeEntry("AlcoPA1", "PA1", EntityLocoDieselAlcoPA1.class, ItemIDs.minecartAlcoPA1.item, "diesel", 2000, 188, 0, 25, 0, 180, 0.7, 0.79, 15000, new String[]{"Red", "Pink", "Black", "Blue", "Cyan", "Purple", "Yellow", "Orange", "Grey", "LightGrey", "Green", "Lime", "LightBlue"}, 10, -3, "Pack: BAP"),
				TrainRecord.makeEntry("AlcoPB1", "PB1", EntityLocoDieselAlcoPB1.class, ItemIDs.minecartAlcoPB1.item, "diesel", 2000, 188, 0, 25, 0, 180, 0.7, 0.79, 15000, new String[]{"Red", "Black", "Yellow", "Orange", "LightGrey"}, 10, -3.1, "Pack: BAP"),
				TrainRecord.makeEntry("EMDE8A", "E8A", EntityLocoDieselEMDE8A.class, ItemIDs.minecartEMDE8A.item, "diesel", 2250, 188, 0, 20, 0, 180, 0.7, 0.79, 15000, new String[]{"Orange", "Purple", "Cyan", "Blue", "Brown", "Red", "Pink", "Yellow", "Lime", "Grey", "LightGrey"}, 10, -3.45, "Pack: BAP"),
				TrainRecord.makeEntry("EMDE8B", "E8B", EntityLocoDieselEMDE8B.class, ItemIDs.minecartEMDE8B.item, "diesel", 2250, 188, 0, 20, 0, 180, 0.7, 0.79, 15000, new String[]{"Orange", "Blue", "Red", "Grey", "LightGrey"}, 10, -3.77, "Pack: BAP"),
				TrainRecord.makeEntry("SNCB_M6", "SNCB_M6", EntityPassengerSNCB_M6.class, ItemIDs.minecartSNCB_M6.item, "passenger", 0, 0, 3.0, 0, 0, 0, 0, 0, 0, new String[]{"White", "Yellow"}, 0, -4, "Pack: B.I.P."),
				TrainRecord.makeEntry("SNCB_M6_TAIL", "SNCB_M6_TAIL", EntityPassengerSNCB_M6_TAIL.class, ItemIDs.minecartSNCB_M6_TAIL.item, "passenger", 0, 0, 3.0, 0, 0, 0, 0, 0, 0, new String[]{"White"}, 0, -4.40, "Pack: B.I.P."),

				TrainRecord.makeEntry("Class319Engine", "Class 319 Engine", EntityElectricClass319.class, ItemIDs.minecartClass319Engine.item, "electric", 750, 160, 0, 60, 0, 100, 0.7, 0.8, 1000, new String[]{"Red", "Blue", "Cyan", "Green", "Magenta", "White", "Lime"}, 18, -3.3, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class319Middle", "Class 319 Passenger Car", EntityPassengerClass319Middle.class, ItemIDs.minecartClass319passenger.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Red", "Blue", "Cyan", "Green", "Magenta", "White", "Lime"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class319Panto", "Class 319 Panto Car", EntityPassengerClass319Panto.class, ItemIDs.minecartClass319panto.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Red", "Blue", "Cyan", "Green", "Magenta", "White", "Lime"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class319Tail", "Class 319 Tail Car", EntityPassengerClass319Tail.class, ItemIDs.minecartClass319Tail.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Red", "Blue", "Cyan", "Green", "Magenta", "White", "Lime"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("PSRPOPM", "PSPMRPO", EntityFreightPSRPOPM.class, ItemIDs.minecartPSRPOPM.item, "freight", 1.5, new String[]{"Blue"}, 18, 27, "Pack: Bap"),
				TrainRecord.makeEntry("PSRPO", "PSRPO", EntityFreightPSRPO.class, ItemIDs.minecartPSRPO.item, "freight", 1.5, new String[]{"Blue", "Yellow", "Cyan"}, 18, 27, "Pack: Bap"),
				TrainRecord.makeEntry("BoulderWagon", "BoulderWagon", EntityBoulderWagon.class, ItemIDs.minecartBoulderWagon.item, "freight", 5, new String[]{"Grey", "Orange"}, 0, 9, "Made by hariesh"),
				TrainRecord.makeEntry("KVB_2300", "KVB_2300", EntityElectricKVB_2300.class, ItemIDs.minecartKVB_2300.item, "electric", 300, 60, 0, 60, 0, 100, 0.7, 0.8, 1000, new String[]{"Red", "Grey", "White"}, 18, -2.4, "Made by Kranker"),
				TrainRecord.makeEntry("KVB_2300_B", "KVB_2300_B", EntityPassengerKVB_2300_B.class, ItemIDs.minecartKVB_2300_B.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Red", "Grey", "White"}, 0, -2.4, "Made by Kranker"),
				TrainRecord.makeEntry("BR_MK2C_BSO", "BR_MK2C_BSO", EntityPassengerBR_MK2C_BSO.class, ItemIDs.minecartBR_Mk2c_BSO.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Brown", "Cyan", "Grey", "Magenta", "Lime", "Purple", "LightGrey", "LightBlue", "Green"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("BR_MK2C_Coach", "BR_MK2C_Coach", EntityPassengerBR_MK2C_Coach.class, ItemIDs.minecartBR_MK2C_Coach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Brown", "Cyan", "Grey", "Magenta", "Red", "LightBlue", "Green", "Black", "LightGrey", "Yellow", "Lime", "Pink", "Purple"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("BR_MK2F_BSO", "BR_MK2F_BSO", EntityPassengerBR_MK2F_BSO.class, ItemIDs.minecartBR_Mk2f_BSO.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Brown", "Cyan", "Grey", "Magenta", "Red", "Lime", "Purple", "Black", "Orange", "LightGrey", "Green"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("BR_MK2F_Coach", "BR_MK2F_Coach", EntityPassengerBR_MK2F_Coach.class, ItemIDs.minecartBR_MK2F_Coach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Brown", "Cyan", "Grey", "Magenta", "Red", "Orange", "LightBlue", "Green", "White", "Black", "LightGrey", "Yellow", "Lime", "Pink", "Purple", "Skin17", "Skin18", "Skin19"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("BR_MK2F_DBSO", "BR_MK2F_DBSO", EntityElectricBR_MK2F_DBSO.class, ItemIDs.minecartBR_Mk2f_DBSO.item, "electric", 1000, 161, 3.3, 60, 0, 0, 0.8, 0.64, 0, new String[]{"Blue", "Cyan", "Grey", "LightBlue", "Purple", "Yellow", "Black", "Red"}, 18, -4.03, "Pack: B.I.P."),
				TrainRecord.makeEntry("BR_MK3_DVT", "BR_MK3_DVT", EntityElectricBR_MK3_DVT.class, ItemIDs.minecartBR_MK3_DVT.item, "electric", 1100, 201, 3, 60, 0, 0, 0.8, 0.645, 0, new String[]{"Blue", "Cyan", "Grey", "LightGrey", "Red", "White", "Yellow", "LightBlue"}, 18, -4, "Pack: B.I.P."),
				TrainRecord.makeEntry("BR_MK3_Buffet", "BR_MK3_Buffet", EntityPassengerBR_MK3_Buffet.class, ItemIDs.minecartBR_MK3_Buffet.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Cyan", "Black", "Brown", "Red", "White", "Pink", "LightGrey", "Green", "Magenta", "Yellow", "LightBlue", "Grey", "Purple", "Orange", "Lime", "Skin17"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("BR_MK3_Coach", "BR_MK3_Coach", EntityPassengerBR_MK3_Coach.class, ItemIDs.minecartBR_MK3_Coach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Cyan", "Black", "Brown", "Red", "White", "Pink", "LightGrey", "Green", "Magenta", "Yellow", "Grey", "Lime", "LightBlue", "Purple", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("BR_MK3a_Coach", "BR_MK3a_Coach", EntityPassengerBR_MK3a_Coach.class, ItemIDs.minecartBR_MK3a_Coach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Purple", "Pink", "Orange", "Magenta", "LightBlue", "Cyan", "Blue", "Yellow", "Brown"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("BR_MK3_Pantograph", "BR_MK3_Pantograph", EntityPassengerBR_MK3_Pantograph.class, ItemIDs.minecartBR_MK3_Pantograph.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Yellow", "Orange", "Blue", "Cyan", "Grey", "Green", "LightBlue", "Lime", "LightGrey", "Magenta"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("BR_MK4_DVT", "BR_MK4_DVT", EntityElectricBR_MK4_DVT.class, ItemIDs.minecartBR_MK4_DVT.item, "electric", 1100, 260, 3, 25, 0, 100, 0.8, 0.645, 1000, new String[]{"Blue", "Red", "White", "Black", "Pink"}, 18, -4.65, "Pack: B.I.P."),
				TrainRecord.makeEntry("BR_MK4_Coach", "BR_MK4_Coach", EntityPassengerBR_MK4_Coach.class, ItemIDs.minecartBR_MK4_Coach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Red", "White", "Black", "Green", "Magenta", "Yellow", "Grey", "Pink"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("BR_MK4_Buffet", "BR_MK4_Buffet", EntityPassengerBR_MK4_Buffet.class, ItemIDs.minecartBR_MK4_Buffet.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Red", "White", "Black", "Pink"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("BR_Black_5", "BR_Black_5", EntityLocoSteamBR_Black_5.class, ItemIDs.minecartBR_Black_5.item, "steam", 1450, 149, 3, 10, 10, 100, 0.7, 0.7, 6000, new String[]{"Black", "Grey", "LightGrey", "Red", "White", "Magenta", "Yellow", "Purple"}, 18, -3.5f, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class43", "Class43", EntityLocoDieselClass43.class, ItemIDs.minecartClass43.item, "diesel", 2250, 238, 0, 25, 0, 180, 0.7, 0.7, 13000, new String[]{"White", "Blue", "Brown", "Green", "Red", "Cyan", "LightBlue", "Orange", "Yellow", "Purple", "Pink", "Black", "Grey", "LightGrey", "Magenta", "Lime", "Skin17", "Skin18", "Skin19", "Skin20"}, 0, -3.15, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class90", "Class90", EntityElectricClass90.class, ItemIDs.minecartClass90.item, "electric", 5000, 178, 0, 60, 0, 100, 0.75, 0.7, 1000, new String[]{"Black", "Green", "LightGrey", "Grey", "Pink", "Red", "White", "Magenta", "Brown"}, 18, -2.77, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class91", "Class91", EntityElectricClass91.class, ItemIDs.minecartClass91.item, "electric", 6300, 260, 0, 60, 0, 100, 0.7, 0.7, 1000, new String[]{"Blue", "Red", "White", "Pink"}, 18, -4.2, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class321", "Class321", EntityElectricClass321.class, ItemIDs.minecartClass321.item, "electric", 1438, 178, 0, 60, 0, 100, 0.7, 0.7, 1000, new String[]{"Purple", "Grey", "White", "Red", "Green", "Blue", "LightGrey"}, 18, -4, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class321Motor", "Class321Motor", EntityPassengerClass321Panto.class, ItemIDs.minecartClass321Panto.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Purple", "Grey", "White", "Red", "Green", "Blue", "LightGrey"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class321Coach", "Class321Coach", EntityPassengerClass321Coach.class, ItemIDs.minecartClass321Coach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Purple", "Grey", "White", "Red", "Green", "LightGrey"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("passengerMinetrain", "Passenger Minecart Yellow", EntityPassengerMinetrain.class, ItemIDs.minecartPassengerMinetrain.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, null, 0, 0, EnumChatFormatting.YELLOW + "Not the most comfortabel of seats " + EnumChatFormatting.DARK_PURPLE + "-hariesh"),
				//TrainRecord.makeEntry("asteri",asteri", EntityLocoSteamasteri.class, ItemIDs.minecartasteri.item, "steam",303,69420,0,1,1,1,10,50,69420,null,15,-1.5, "Pack: Your Mum"),

				/** TCCE 6 */
				TrainRecord.makeEntry("C415H", "C415H", EntityLocoDieselC415H.class, ItemIDs.minecartC415H.item, "diesel", 1500, 106, 0, 35, 0, 200, 0.87, 0.93, 10000, new String[]{"Purple", "Magenta", "Yellow", "Orange", "Grey", "LightGrey", "Red", "Pink",}, 10, -2.5),
				TrainRecord.makeEntry("C415S", "C415S", EntityLocoDieselC415S.class, ItemIDs.minecartC415S.item, "diesel", 1500, 106, 0, 35, 0, 200, 0.87, 0.93, 10000, new String[]{"Green", "Yellow"}, 10, -2.5),
				TrainRecord.makeEntry("C415L", "C415L", EntityLocoDieselC415L.class, ItemIDs.minecartC415L.item, "diesel", 1500, 106, 0, 35, 0, 200, 0.87, 0.93, 17000, new String[]{"Black"}, 10, -2.5),
				TrainRecord.makeEntry("GE25Ton", "GE 25-ton", EntityLocoDieselGE25Ton.class, ItemIDs.minecart25Ton.item, "diesel", 150, 50, 0, 10, 0, 200, 0.65, 0.7, 4000, new String[]{"Brown", "Pink", "Cyan", "Orange"}, 10, -1),
				TrainRecord.makeEntry("GSI60FootBulkhead", "GSI_Bulkhead", EntityFreightGSI60FootBulkhead.class, ItemIDs.minecartGSI60FootBulkhead.item, "freight", 5, new String[]{"Blue", "LightBlue", "Green", "Black", "Grey", "Brown"}, 10, 45, "Cargo: Bulkhead Items."),
				TrainRecord.makeEntry("GSC60FootFlatcar", "GSC_Flatcar", EntityFreightGSC60FootFlat.class, ItemIDs.minecartGSC60FootFlatcar.item, "freight", 3, new String[]{"Cyan", "LightBlue", "Orange", "Yellow", "Brown", "Green", "Lime"}, 10, 45, "Cargo: whatever flatcars carry i guess"),
				TrainRecord.makeEntry("H24_66", "H24-66", EntityLocoDieselFMH24_66.class, ItemIDs.minecartH24_66.item, "diesel", 2400, 130, 0, 45, 0, 200, 0.87, 0.93, 18000, new String[]{"Red", "Black", "Brown", "Yellow", "Grey", "LightGrey"}, 10, -3.75),
				TrainRecord.makeEntry("H24_66L", "H24-66L", EntityLocoDieselFMH24_66L.class, ItemIDs.minecartH24_66L.item, "diesel", 2400, 130, 0, 45, 0, 200, 0.87, 0.93, 18000, new String[]{"Blue", "Green"}, 10, -3.75),
				TrainRecord.makeEntry("passengerPSLunchCounter_Lounge", "PS Lunch Counter-Lounge", EntityPassengerPSLunchCounter_Lounge.class, ItemIDs.minecartPSLunchCounter_Lounge.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Cyan", "Orange", "Yellow", "Pink", "Magenta"}, 10, 0, "Pack: BAP"),
				TrainRecord.makeEntry("passengerPS30SeatParlor", "PS 30 Seat Parlor", EntityPassengerPS30SeatParlor.class, ItemIDs.minecartPS30SeatParlor.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Cyan", "LightBlue"}, 10, 0, "Pack: BAP"),
				TrainRecord.makeEntry("passengerPS54SeatCoach_Lounge", "PS 54 Seat Coach-Lounge", EntityPassengerPS54SeatCoach_Lounge.class, ItemIDs.minecartPS54SeatCoach_Lounge.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Cyan", "LightBlue", "LightGrey", "Orange"}, 10, 0, "Pack: BAP"),
				TrainRecord.makeEntry("passengerPS58SeatCoach_Observation", "PS 58 Seat Coach-Observation", EntityPassengerPS58SeatCoach_Observation.class, ItemIDs.minecartPS58SeatCoach_Observation.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Cyan", "LightBlue", "Purple", "LightGrey", "Grey", "Orange", "Red", "Magenta", "Pink"}, 10, 0, "Pack: BAP"),
				TrainRecord.makeEntry("passengerPSBM56SeatCoach", "PS B&M 56 Seat Coach", EntityPassengerPSBM56SeatCoach.class, ItemIDs.minecartPSBM56SeatCoach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Magenta", "LightGrey", "Grey", "Brown", "Red", "Pink"}, 10, 0, "Pack: BAP"),
				TrainRecord.makeEntry("passengerPSBMCombine", "PS B&M Combine", EntityPassengerPSBMCombine.class, ItemIDs.minecartPSBMCombine.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Magenta", "Brown"}, 10, 0, "Pack: BAP"),
				TrainRecord.makeEntry("passengerPSBMDiner_Lounge", "PS B&M Diner_Lounge", EntityPassengerPSBMDiner_Lounge.class, ItemIDs.minecartPSBMDiner_Lounge.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Magenta", "Brown", "LightGrey"}, 10, 0, "Pack: BAP"),
				TrainRecord.makeEntry("EMDE7A", "E7A", EntityLocoDieselEMDE7A.class, ItemIDs.minecartEMDE7A.item, "diesel", 2000, 188, 4.5, 20, 0, 180, 0.7, 0.79, 15000, new String[]{"Magenta", "Cyan", "Green", "Lime", "Brown", "Black", "Orange", "Blue", "LightBlue", "Yellow", "Grey", "LightGrey", "Purple", "Red", "Pink", "White", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26"}, 10, -3.45, "Pack: BAP"),
				TrainRecord.makeEntry("EMDE7B", "E7B", EntityLocoDieselEMDE7B.class, ItemIDs.minecartEMDE7B.item, "diesel", 2000, 188, 4.5, 20, 0, 180, 0.7, 0.79, 15000, new String[]{"Magenta", "Orange", "Yellow", "Grey", "LightGrey", "Purple", "Red", "Pink"}, 10, -3.77, "Pack: BAP"),
				TrainRecord.makeEntry("freight5Plank", "5Plank", EntityFreight5Plank.class, ItemIDs.minecart5Plank.item, "freight", 1, new String[]{"Black", "Brown", "Green", "Grey", "LightBlue", "Lime", "Magenta", "Red"}, 18, 36, "Pack: B.I.P."),
				TrainRecord.makeEntry("BR_Mk1_BSO", "BR_Mk1_BSO", EntityPassengerBR_Mk1_BSO.class, ItemIDs.minecartBR_Mk1_BSO.item, "passenger", 0, 0, 3.5, 0, 0, 0, 0, 0, 0, new String[]{"Magenta", "Blue", "Brown", "Cyan", "Green", "Grey", "LightBlue", "Red"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("BR_Mk1_TSO", "BR_Mk1_TSO", EntityPassengerBR_Mk1_TSO.class, ItemIDs.minecartBR_Mk1_TSO.item, "passenger", 0, 0, 3.5, 0, 0, 0, 0, 0, 0, new String[]{"Magenta", "Pink", "Blue", "Grey", "Brown", "Black", "Cyan", "Lime", "Green", "Yellow", "LightBlue", "Purple", "Red", "Orange", "LightGrey", "White", "Skin17", "Skin20"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("BR_Mk1_Buffet", "BR_Mk1_Buffet", EntityPassengerBR_Mk1_Buffet.class, ItemIDs.minecartBR_Mk1_Buffet.item, "passenger", 0, 0, 3.5, 0, 0, 0, 0, 0, 0, new String[]{"Magenta", "Blue", "Brown", "Cyan", "Green", "Grey", "Red"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("BR_Mk1_Baggage", "BR_Mk1_Baggage", EntityPassengerBR_Mk1_BG.class, ItemIDs.minecartBR_Mk1_BG.item, "passenger", 0, 0, 3.2, 0, 0, 0, 0, 0, 0, new String[]{"Magenta", "Blue", "Brown", "Cyan", "Green", "Grey", "LightBlue", "Red", "Orange", "Purple"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("BR_Mk1_TPO_Stowage", "BR_Mk1_TPO_Stowage", EntityFreightBR_Mk1_TPO_Stowage.class, ItemIDs.minecartBR_Mk1_TPO_Stowage.item, "freight", 3, new String[]{"Red", "Blue"}, 18, 36, "Pack: B.I.P."),
				TrainRecord.makeEntry("NMBS_HLE_18", "NMBS_HLE_18", EntityLocoElectricNMBS_HLE_18.class, ItemIDs.minecartNMBS_HLE_18.item, "electric", 6705, 201, 0, 10, 0, 0, 5, 0.79, 0, new String[]{"White", "Grey"}, 10, -3.7, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class175", "Class175", EntityLocoDieselClass175.class, ItemIDs.minecartClass175.item, "diesel", 900, 161, 0, 10, 0, 100, 0.85, 0.7, 15000, new String[]{"Cyan", "Green", "Grey", "LightBlue", "Purple", "White"}, 18, -4.5, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class175Coach", "Class175Coach", EntityPassengerClass175Coach.class, ItemIDs.minecartClass175Coach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Cyan", "Green", "Grey", "LightBlue", "Purple", "White"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("H16_66", "H16-66", EntityLocoDieselFMH16_66.class, ItemIDs.minecartH16_66.item, "diesel", 1600, 130, 0, 45, 0, 200, 0.87, 0.93, 16000, new String[]{"Blue", "Yellow", "LightGrey", "Green", "Lime", "Black", "Grey", "Orange", "Brown", "Red", "Pink", "Magenta"}, 10, -3.35, "Pack: BAP"),
				TrainRecord.makeEntry("ACFGNRPO_30", "AC&F GN RPO (30' mail)", EntityPassengerACFGNRPO_30.class, ItemIDs.minecartACFGNRPO_30.item, "freight", 1.5, new String[]{"Orange", "Green"}, 18, 27, "Pack: BAP"),
				TrainRecord.makeEntry("ACFGN60SeatCoach", "AC&F GN 60 Seat Coach", EntityPassengerACFGN60SeatCoach.class, ItemIDs.minecartACFGN60SeatCoach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Orange", "Yellow", "Green", "LightGrey"}, 10, 0, "Pack: BAP"),
				TrainRecord.makeEntry("FGV4300Motor", "FGV_4300_Motor", EntityLocoElectricFGV4300.class, ItemIDs.minecartFGV4300Motor.item, "electric", 500, 80, 0, 10, 0, 0, 0.9, 0.9, 0, null, 10, -2.75),
				TrainRecord.makeEntry("FGV4300Coach", "FGV_4300_Coach", EntityPassengerFGV4300Coach.class, ItemIDs.minecartFGV4300Coach.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, null, 0, 0, "Pack: Metro In Motion"),
				TrainRecord.makeEntry("FGV4300Tail", "FGV_4300_Tail", EntityPassengerFGV4300Tail.class, ItemIDs.minecartFGV4300Tail.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, null, 0, 0, "Pack: Metro In Motion"),
				TrainRecord.makeEntry("locoElectricInterurban_Series_100", "Interurban Series 100", EntityElectricInterurbanSeries100.class, ItemIDs.minecartLocoElectricInterurbanSeries100.item, "electric", 600, 70, 0, 10, 0, 0, 0.7, 0.7, 0, new String[]{"Green", "Blue"}, 14, -3, "Pack: Trams in Motion"),
				TrainRecord.makeEntry("locoElectricMetro3000", "Metro3000loco", EntityElectricMetro3000Motor.class, ItemIDs.minecartMetro3000Loco.item, "electric", 700, 70, 3, 10, 0, 0, 0.8, 0.9, 0, new String[]{"Blue", "White", "Grey"}, 18, -3.1, "Pack: Metro in Motion"),
				TrainRecord.makeEntry("PassengerMetro3000", "Metro3000Passenger", EntityPassengerMetro3000.class, ItemIDs.minecartMetro3000Passenger.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "White", "Grey"}, 0, 0, "Pack: Metro In Motion"),
				TrainRecord.makeEntry("PassengerMetro3000Tail", "Metro3000Tail", EntityPassengerMetro3000Tail.class, ItemIDs.minecartMetro3000Tail.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "White", "Grey"}, 0, 0, "Pack: Metro In Motion"),
				TrainRecord.makeEntry("CQ310", "CQ310 Loco", EntityElectricCQ310Loco.class, ItemIDs.minecartcq310Loco.item, "electric", 500, 110, 3, 7, 0, 0, 0.9, 0.7, 0, new String[]{"Black", "Grey"}, 0, -2.75, "Pack: Metro In Motion"),
				TrainRecord.makeEntry("CQ310Passenger", "CQ310 Tail", EntityPassengerCQ310Passenger.class, ItemIDs.minecartcq310Tail.item, "Passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Black", "Grey"}, 0, 0, "Pack: Metro In Motion"),
				TrainRecord.makeEntry("Class162Engine", "Class162Engine", EntityElectricClass162.class, ItemIDs.minecartClass162Engine.item, "electric", 800, 160, 0, 50, 0, 100, 0.7, 0.8, 1000, new String[]{"Blue", "Grey", "LightBlue", "Yellow", "Green", "Red"}, 18, -4, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class162CoachB", "Class162CoachB", EntityPassengerClass162CoachB.class, ItemIDs.minecartClass162CoachB.item, "passenger", 0, 0, 0, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Grey", "LightBlue", "Yellow", "Green", "Red"}, 18, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class162CoachA", "Class162CoachA", EntityPassengerClass162CoachA.class, ItemIDs.minecartClass162CoachA.item, "passenger", 0, 0, 0, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Grey", "LightBlue", "Yellow", "Green", "Red"}, 18, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class162Tail", "Class162tail", EntityPassengerClass162Tail.class, ItemIDs.minecartClass162Tail.item, "passenger", 0, 0, 0, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Grey", "LightBlue", "Yellow", "Green", "Red"}, 18, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class34", "Class34", EntityLocoDieselClass34.class, ItemIDs.minecartClass34.item, "diesel", 2000, 146, 0, 10, 0, 100, 0.75, 0.9, 6000, new String[]{"Black", "Blue", "Green", "Grey", "Lime", "Orange", "Pink", "Purple", "Red", "White", "LightGrey", "Yellow", "Cyan", "Magenta", "Brown"}, 18, -3, "Pack: B.I.P."),
				TrainRecord.makeEntry("tankTankerUK", "TankerUK", EntityTankerUK.class, ItemIDs.minecartTanker_UK.item, "tank", 2, new String[]{"Black", "Red", "Green", "Yellow", "White"}, 18, 36, "Pack: B.I.P."),
				TrainRecord.makeEntry("MetalTram", "MetalTram", EntityLocoElectricMetalTram.class, ItemIDs.minecartMetalTram.item, "electric", 500, 50, 0, 10, 0, 100, 0.7, 0.8, 1000, new String[]{"Green", "Brown", "Yellow"}, 18, -2, "Modeller: Lord Squid"),
				TrainRecord.makeEntry("MetalTramCoach", "MetalTramCoach", EntityPassengerMetalTramCoach.class, ItemIDs.minecartMetalTramCoach.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, new String[]{"Green", "Brown", "Yellow"}, 0, 0, "Modeller: Lord Squid"),
				TrainRecord.makeEntry("RW_Type_3", "RWType3", EntityLocoSteamRWType3.class, ItemIDs.minecartRWType3.item, "steam", 900, 101, 0, 10, 10, 100, 0.7, 0.7, 4000, new String[]{"Black", "Blue", "Green", "Lime", "Pink", "Red"}, 18, -2.6f, "Pack: B.I.P."),
				TrainRecord.makeEntry("RW_Type_2", "RWType2", EntityLocoSteamRWType2.class, ItemIDs.minecartRWType2.item, "steam", 775, 81, 0, 10, 10, 100, 0.7, 0.7, 8000, new String[]{"Black", "Brown", "Green", "Grey", "LightGrey", "Red", "Purple", "Pink"}, 18, -2.4f, "Pack: B.I.P."),
				TrainRecord.makeEntry("HopperUK", "HopperUK", EntityFreightHopperUK.class, ItemIDs.minecartHopper_UK.item, "freight", 1.5, new String[]{"Grey", "Yellow"}, 18, 36, "Pack: B.I.P."),
				TrainRecord.makeEntry("GWR_42xx", "GWR42xx", EntityLocoSteamGWR42xx.class, ItemIDs.minecartGWR42xx.item, "steam", 1300, 105, 0, 10, 10, 100, 0.7, 0.7, 8200, new String[]{"Black", "Blue", "Green", "Lime"}, 18, -4.3f, "Pack: B.I.P."),
				TrainRecord.makeEntry("GWR_72xx", "GWR72xx", EntityLocoSteamGWR72xx.class, ItemIDs.minecartGWR72xx.item, "steam", 1375, 105, 0, 10, 10, 100, 0.7, 0.7, 9000, new String[]{"Black", "Blue", "Green", "Lime"}, 18, -5.0f, "Pack: B.I.P."),
				TrainRecord.makeEntry("GWR_101_Class", "GWR101Class", EntityLocoSteamGWR101Class.class, ItemIDs.minecartGWR101Class.item, "steam", 550, 51, 0, 10, 10, 100, 0.7, 0.7, 9500, new String[]{"Blue", "Brown", "Green", "Grey", "Lime", "Purple", "Red", "Black", "Magenta", "Grey", "LightGrey", "White"}, 18, -2.4f, "Pack: B.I.P."),
				TrainRecord.makeEntry("B80C_A", "B80C_A", EntityElectricB80C_A.class, ItemIDs.minecartB80C_A.item, "electric", 300, 80, 0, 60, 0, 100, 0.7, 0.8, 1000, new String[]{"Red", "Grey", "White", "Pink", "Yellow", "Green", "Orange", "Magenta"}, 18, -2.4, "Pack: Metro In Motion"),
				TrainRecord.makeEntry("B80C_B", "B80C_B", EntityPassengerB80C_B.class, ItemIDs.minecartB80C_B.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Red", "Grey", "White", "Pink", "Yellow", "Green", "Orange", "Magenta"}, 0, -2.4, "Pack: Metro In Motion"),
				TrainRecord.makeEntry("WoodenTramCoach", "WoodenTramCoach", EntityPassengerWoodenTramCoach.class, ItemIDs.minecartWoodenTramCoach.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Green", "Pink", "Yellow", "Lime"}, 18, 0),
				TrainRecord.makeEntry("MA100_Loco", "MA100_Loco", EntityElectricMA100_Loco.class, ItemIDs.minecartMA100_Loco.item, "electric", 600, 70, 0, 10, 0, 100, 0.7, 0.8, 1000, new String[]{"Yellow", "Cyan", "Purple", "Orange"}, 18, -2, "Pack: MetroIM"),
				TrainRecord.makeEntry("MA100_Tail", "MA100_Tail", EntityPassengerMA100_Tail.class, ItemIDs.minecartMA100_Tail.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, new String[]{"Yellow", "Cyan", "Purple", "Orange"}, 10, 0, "Pack: MetroIM"),
				TrainRecord.makeEntry("ExpressFreightVan", "ExpressFreightVan", EntityFreightExpressFreightVan.class, ItemIDs.minecartExpressFreightVan.item, "freight", 1.5, new String[]{"Purple", "Blue", "Yellow"}, 18, 36, "Pack: B.I.P."),
				TrainRecord.makeEntry("WWCP_Class_062T", "WWCPClass062T", EntityLocoSteamWWCPClass062T.class, ItemIDs.minecartWWCPClass062T.item, "steam", 1100, 72, 0, 10, 10, 100, 0.7, 0.7, 8500, new String[]{"Blue"}, 18, -4.15f, "Pack: WWCP"),
				TrainRecord.makeEntry("BR_Britannia_Class", "BRBritanniaClass", EntityLocoSteamBR_Britannia_Class.class, ItemIDs.minecartBRBritanniaClass.item, "steam", 1950, 161, 0, 10, 10, 100, 0.7, 0.7, 8000, new String[]{"Green", "Black", "Blue", "Grey", "Magenta", "Red", "White", "Yellow", "Cyan"}, 18, -4.1f, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class390Front", "Class390Front", EntityElectricClass390.class, ItemIDs.minecartClass390Front.item, "electric", 6840, 260, 0, 60, 0, 100, 0.7, 0.8, 1000, new String[]{"Red", "Blue", "Brown", "Cyan", "Grey", "LightGrey", "Lime", "Magenta", "Orange", "Pink", "Purple", "Black", "White", "Yellow"}, 18, -5.1, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class390Coach", "Class390Coach", EntityPassengerClass390Coach.class, ItemIDs.minecartClass390Coach.item, "passenger", 0, 0, 4, 0, 0, 0, 0, 0, 0, new String[]{"Red", "Blue", "Cyan", "Green", "Grey", "LightBlue", "LightGrey", "Lime", "Magenta", "Orange", "Pink", "Black", "White", "Yellow"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class390Panto", "Class390Panto", EntityPassengerClass390Panto.class, ItemIDs.minecartClass390Panto.item, "passenger", 0, 0, 4, 0, 0, 0, 0, 0, 0, new String[]{"Red", "Blue", "Cyan", "LightBlue", "LightGrey", "Lime", "Magenta", "Pink", "Black", "White"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class121Bubblecar", "Class121Bubblecar", EntityLocoDieselClass121.class, ItemIDs.minecartClass121Bubblecar.item, "diesel", 300, 120, 0, 10, 0, 100, 0.7, 0.9, 8000, new String[]{"Red", "Blue", "Brown", "Cyan", "Green", "Grey", "LightBlue", "LightGrey", "Lime", "Magenta", "Pink", "Purple", "Black", "White"}, 18, -4.1, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class121Trailer", "Class121Trailer", EntityPassengerClass121Trailer.class, ItemIDs.minecartClass121Trailer.item, "passenger", 0, 0, 0.8, 0, 0, 0, 0, 0, 0, new String[]{"Red", "LightBlue", "Lime", "Green", "Grey", "Blue", "Cyan", "White"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class117", "Class117", EntityLocoDieselClass117.class, ItemIDs.minecartClass117.item, "diesel", 500, 120, 0, 10, 0, 100, 0.7, 0.9, 8000, new String[]{"Red", "LightBlue", "Lime", "Green", "Grey", "Blue", "Cyan", "White"}, 18, -4.1, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class117Middle", "Class117Middle", EntityPassengerClass117Middle.class, ItemIDs.minecartClass117Middle.item, "passenger", 0, 0, 0.8, 0, 0, 0, 0, 0, 0, new String[]{"Red", "LightBlue", "Lime", "Green", "Grey", "Blue", "Cyan", "White"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("TipperUK", "TipperUK", EntityFreightTipperUK.class, ItemIDs.minecartTipperUK.item, "freight", 1.5, new String[]{"Grey", "Red", "Brown", "Black"}, 18, 36, "Pack: B.I.P."),
				TrainRecord.makeEntry("ShuntingTenderUK", "ShuntingTenderUK", EntityTenderShuntingTenderUK.class, ItemIDs.minecartShuntingTenderUK.item, "tender", 0.8, new String[]{"Black", "Blue"}, 18, 36, "Pack: B.I.P."),
				TrainRecord.makeEntry("BRBrakeVan", "BRBrakeVan", EntityCabooseBRBrakeVan.class, ItemIDs.minecartBRBrakeVan.item, "passenger", 1.5, new String[]{"Grey", "Blue", "Brown", "Yellow", "Red", "LightBlue", "LightGrey", "Pink"}, 18, 36, "Pack: B.I.P."),

				/** TCCE 7 */
				TrainRecord.makeEntry("DuewagT4ER", "DuewagT4ER", EntityElectricDuewagT4ER.class, ItemIDs.minecartDuewagT4ER.item, "electric", 200, 70, 0, 20, 0, 100, 0.7, 0.8, 1000, new String[]{"Grey", "Red", "Yellow", "Green"}, 18, -2, "Pack: Trams In Motion"),
				TrainRecord.makeEntry("DuewagGT6ZRLoco", "DuewagGT6ZRLoco", EntityElectricDuewagGT6ZRLoco.class, ItemIDs.minecartDuewagGT6ZRLoco.item, "electric", 250, 70, 0, 20, 0, 100, 0.7, 0.8, 1000, new String[]{"Green", "Blue", "Grey", "Orange", "Lime"}, 18, -1.95, "Pack: Trams In Motion"),
				TrainRecord.makeEntry("DuewagGT6ZRTail", "DuewagGT6ZRTail", EntityPassengerDuewagGT6ZRTail.class, ItemIDs.minecartDuewagGT6ZRTail.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Green", "Blue", "Grey", "Orange", "Lime"}, 18, -1.35, "Pack: Trams In Motion"),
				TrainRecord.makeEntry("M8CLoco", "M8CLoco", EntityElectricM8CLoco.class, ItemIDs.minecartM8CLoco.item, "electric", 250, 70, 0, 20, 0, 100, 0.7, 0.8, 1000, new String[]{"Yellow", "Pink", "Orange", "Grey", "Brown", "Red"}, 18, -2.55, "Pack: Trams In Motion"),
				TrainRecord.makeEntry("M8CTail", "M8CTail", EntityPassengerM8CTail.class, ItemIDs.minecartM8CTail.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Yellow", "Pink", "Orange", "Grey", "Brown", "Red"}, 18, -2.55, "Pack: Trams In Motion"),
				TrainRecord.makeEntry("Class416Loco", "Class416Loco", EntityElectricClass416Loco.class, ItemIDs.minecartClass416Locomotive.item, "electric", 850, 121, 0, 10, 0, 0, 0.7, 0.8, 0, new String[]{"Blue", "Cyan", "Green", "Grey", "LightBlue", "Orange"}, 18, -4, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class416Tail", "Class416Tail", EntityPassengerClass416Tail.class, ItemIDs.minecartClass416Tail.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Cyan", "Green", "Grey", "LightBlue", "Orange"}, 18, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("DB420Loco", "DB420Loco", EntityElectricDB420Loco.class, ItemIDs.minecartDB420Loco.item, "electric", 800, 120, 0, 10, 0, 100, 0.7, 0.8, 1000, new String[]{"Red", "Yellow"}, 18, -3, "Pack: MetroIM"),
				TrainRecord.makeEntry("DB420Middle", "DB420Middle", EntityPassengerDB420Middle.class, ItemIDs.minecartDB420Middle.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, new String[]{"Red", "Yellow"}, 10, 0, "Pack: MetroIM"),
				TrainRecord.makeEntry("DB420Tail", "DB420Tail", EntityPassengerDB420Tail.class, ItemIDs.minecartDB420Tail.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, new String[]{"Red", "Yellow"}, 10, -3, "Pack: MetroIM"),
				TrainRecord.makeEntry("CattleVan", "CattleVan", EntityCattleVan.class, ItemIDs.minecartCattleVan.item, "special", 0, 0, 3.3, 0, 0, 0, 0, 0, 0, null, 18, 0, "pack: B.I.P."),
				TrainRecord.makeEntry("Class401Engine", "Class401Engine", EntityLocoElectricClass401.class, ItemIDs.minecartClass401Loco.item, "electric", 428, 121, 0, 7, 0, 0, 0.5, 0.9, 0, new String[]{"Blue", "Lime", "Green", "Grey", "LightGrey"}, 18, -3.4, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class401Tail", "Class401Tail", EntityPassengerClass401Tail.class, ItemIDs.minecartClass401Tail.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Lime", "Green", "Grey", "LightGrey"}, 18, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("passenger10tonBrakeVan", "10tonbrakevan", EntityPassenger10tonBrakeVan.class, ItemIDs.minecartTENtonBrakeVan.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Black", "Orange", "Brown", "Red", "Grey", "White", "LightGrey"}, 18, 0),
				TrainRecord.makeEntry("Class230Engine", "Class230Engine", EntityElectricClass230.class, ItemIDs.minecartClass230Engine.item, "electric", 789, 101, 0, 10, 0, 100, 0.7, 0.8, 1000, new String[]{"Red", "Green"}, 18, -2.6, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class230Middle", "Class230Middle", EntityClass230Middle.class, ItemIDs.minecartClass230Middle.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, new String[]{"Red", "Green"}, 10, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("DuewagGT6ERLoco", "DuewagGT6ERLoco", EntityElectricDuewagGT6ERLoco.class, ItemIDs.minecartDuewagGT6ERLoco.item, "electric", 250, 70, 0, 20, 0, 100, 0.7, 0.8, 1000, new String[]{"Magenta", "Green", "Blue", "White", "Grey", "Orange", "Red", "Yellow", "Purple"}, 18, -1.95, "Pack: Trams In Motion"),
				TrainRecord.makeEntry("DuewagGT6ERTail", "DuewagGT6ERTail", EntityPassengerDuewagGT6ERTail.class, ItemIDs.minecartDuewagGT6ERTail.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Magenta", "Green", "Blue", "White", "Grey", "Orange", "Red", "Yellow", "Purple"}, 18, -1.35, "Pack: Trams In Motion"),
				TrainRecord.makeEntry("Mineralwagon", "Mineralwagon", EntityFreightMineralwagon.class, ItemIDs.minecartMineralwagon.item, "freight", 1.5, new String[]{"Black", "Blue", "Grey", "LightGrey", "Orange", "Yellow"}, 18, 45, "Pack: B.I.P."),
				TrainRecord.makeEntry("J50loco", "J50loco", EntityLocoSteamJ50.class, ItemIDs.minecartJ50.item, "steam", 618, 80, 0, 15, 7, 100, 0.8, 0.8, 7000, new String[]{"Black", "Blue", "Brown", "Cyan", "Lime", "Green", "Grey", "LightBlue", "LightGrey", "Orange", "Pink", "Red", "Yellow"}, 18, -2.45f, "Pack: B.I.P."),
				TrainRecord.makeEntry("VentilatedVan", "Van", EntityFreightVentilatedVan.class, ItemIDs.minecartVentilatedVan.item, "freight", 3.3, new String[]{"Black", "Brown", "Grey", "White"}, 18, 56, "Pack: B.I.P."),
				TrainRecord.makeEntry("SentinelY3", "SentinelY3", EntityLocoSteamSentinelY3.class, ItemIDs.minecartSentinelY3.item, "steam", 275, 59, 0, 8, 7, 100, 1, 0.8, 3000, new String[]{"Black", "Blue", "Cyan", "Green", "Grey", "LightGrey", "Lime", "Red"}, 18, -1f, "B.I.P."),
				TrainRecord.makeEntry("Class143Front", "Class143front", EntityLocoDieselClass143.class, ItemIDs.minecartClass143Front.item, "diesel", 225, 121, 0, 5, 0, 100, 0.9, 0.9, 7500, new String[]{"Black", "Blue", "Cyan", "Green", "Grey", "LightBlue", "LightGrey", "Lime", "Magenta", "Orange", "Pink", "Purple", "Red", "White", "Yellow"}, 18, -2, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class143Rear", "Class143rear", EntityPassengerClass143.class, ItemIDs.minecartClass143Rear.item, "passenger", 3, new String[]{"Black", "Blue", "Cyan", "Green", "Grey", "LightBlue", "LightGrey", "Lime", "Magenta", "Orange", "Pink", "Purple", "Red", "White", "Yellow"}, 18, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class143Middle", "Class143middle", EntityPassengerClass143M.class, ItemIDs.minecartClass143Middle.item, "passenger", 2.5, new String[]{"Blue", "Grey", "Magenta", "Pink", "Purple", "White", "Yellow"}, 18, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("locoDieselCD754", "CD754", EntityLocoDieselCD754.class, ItemIDs.minecartCD754.item, "diesel", 1974, 101, 0, 60, 0, 170, 0.66, 0.96, 5000, new String[]{"Red"}, 13, -3),
				TrainRecord.makeEntry("Class374Front", "Class374Front", EntityElectricClass374.class, ItemIDs.minecartClass374Front.item, "electric", 5250, 321, 0, 60, 0, 100, 0.7, 0.8, 1000, new String[]{"Blue", "White", "LightBlue", "Pink"}, 18, -5.1, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class374PremierPanto", "Class374PremierPanto", EntityPassengerClass374PremierPanto.class, ItemIDs.minecartClass374PremierPanto.item, "passenger", 0, 0, 4, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "LightBlue", "Cyan", "White", "LightGrey", "Grey", "Yellow", "Pink"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class374StandardPanto", "Class374StandardPanto", EntityPassengerClass374StandardPanto.class, ItemIDs.minecartClass374StandardPanto.item, "passenger", 0, 0, 4, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "LightBlue", "Cyan", "White", "LightGrey", "Grey", "Yellow", "Orange", "Pink", "Purple"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class374Buffet", "Class374Buffet", EntityPassengerClass374Buffet.class, ItemIDs.minecartClass374Buffet.item, "passenger", 0, 0, 4, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "White", "LightBlue", "Pink"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class387Front", "Class387Front", EntityElectricClass387Front.class, ItemIDs.minecartClass387Front.item, "electric", 2250, 178, 0, 60, 0, 100, 0.7, 0.7, 1000, new String[]{"Cyan", "Pink", "Green", "Red", "Purple", "White", "Lime", "Black", "Blue", "LightBlue", "LightGrey", "Yellow", "Grey"}, 18, -4, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class387Coach", "Class387Coach", EntityPassengerClass387Coach.class, ItemIDs.minecartClass387Coach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Cyan", "Pink", "Green", "Red", "Purple", "White", "Lime", "Black", "Blue", "LightBlue", "LightGrey", "Yellow", "Grey"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class387Panto", "Class387Panto", EntityPassengerClass387Panto.class, ItemIDs.minecartClass387Panto.item, "passenger", 0, 0, 3.5, 0, 0, 0, 0, 0, 0, new String[]{"Cyan", "Pink", "Green", "Red", "Purple", "White", "Lime", "Black", "Blue", "LightBlue", "LightGrey", "Yellow", "Grey"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class387Tail", "Class387Tail", EntityPassengerClass387Tail.class, ItemIDs.minecartClass387Tail.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Cyan", "Pink", "Green", "Red", "Purple", "White", "Lime", "Black", "Blue", "LightBlue", "LightGrey", "Yellow", "Grey"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class378Front", "Class378Front", EntityElectricClass378Front.class, ItemIDs.minecartClass378Front.item, "electric", 2400, 121, 0, 60, 0, 100, 0.7, 0.7, 1000, new String[]{"Orange", "White"}, 18, -3.9, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class378Middle", "Class378Middle", EntityPassengerClass378Middle.class, ItemIDs.minecartClass378Middle.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Orange", "Red", "Brown", "White", "LightGrey"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class378Tail", "Class378Tail", EntityPassengerClass378Tail.class, ItemIDs.minecartClass378Tail.item, "passenger", 0, 0, 3.5, 0, 0, 0, 0, 0, 0, new String[]{"Orange", "White"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Jacknail", "Jacknail", EntitylocoSteamJacknail.class, ItemIDs.minecartJacknail.item, "steam", 1078, 75, 0, 10, 10, 100, 0.8, 0.5, 15000, new String[]{"Black", "Blue", "Cyan", "Green", "Grey", "LightGrey", "Lime", "Orange", "Yellow"}, 0, -2.45, "Pack: B.I.P."),
				TrainRecord.makeEntry("MRcompound", "MRCompound", EntitylocoSteamMRCompound.class, ItemIDs.minecartMRcompound.item, "steam", 2265, 137, 0, 10, 10, 120, 0.75, 0.7, 7500, new String[]{"Black", "Grey", "Magenta", "Pink", "Red", "Yellow"}, 0, -3.9, "Pack: B.I.P."),
				TrainRecord.makeEntry("MRcompoundTender", "MRCompoundTender", EntityTenderMRCompound.class, ItemIDs.minecartMRcompoundTender.item, "tender", 0, 0, 4, 0, 0, 0, 0, 0, 4000, new String[]{"Black", "Grey", "Magenta", "Pink", "Red", "Yellow"}, 18, 0, "Water capacity: 4000. B.I.P."),
				TrainRecord.makeEntry("Class142Front", "Class142Front", EntityLocoDieselClass142.class, ItemIDs.minecartClass142Front.item, "diesel", 225, 121, 0, 5, 0, 100, 0.9, 0.9, 7500, new String[]{"Purple", "Cyan", "Blue", "LightBlue", "LightGrey", "Red", "Yellow", "Orange"}, 18, -2.5, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class142Tail", "Class142Tail", EntityPassengerClass142Tail.class, ItemIDs.minecartClass142Tail.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Purple", "Cyan", "Blue", "LightBlue", "LightGrey", "Red", "Yellow", "Orange"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Bagnall", "Bagnall", EntityLocoDieselBagnall.class, ItemIDs.minecartBagnall.item, "diesel", 90, 100, 0, 5, 0, 100, 0.9, 0.9, 7500, new String[]{"Blue", "Red", "Yellow"}, 18, -2, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class389Front", "Class389Front", EntityElectricClass389Front.class, ItemIDs.minecartClass389Front.item, "electric", 2250, 178, 0, 60, 0, 100, 0.7, 0.7, 1000, new String[]{"Orange", "White", "Purple"}, 18, -4.35, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class389Middle", "Class389Middle", EntityPassengerClass389Middle.class, ItemIDs.minecartClass389Middle.item, "passenger", 0, 0, 3.5, 0, 0, 0, 0, 0, 0, new String[]{"Orange", "Brown", "White", "LightGrey", "Purple", "Magenta"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class389Tail", "Class389Tail", EntityPassengerClass389Tail.class, ItemIDs.minecartClass389Tail.item, "passenger", 0, 0, 3.5, 0, 0, 0, 0, 0, 0, new String[]{"Orange", "White", "Purple"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class442DTS", "Class442DTS", EntityElectricClass442DTS.class, ItemIDs.minecartClass442DTS.item, "electric", 1610, 175, 0, 60, 0, 100, 0.7, 0.7, 1000, new String[]{"White", "Orange", "Red", "Yellow", "Blue"}, 18, -4.34, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class442TS", "Class442TS", EntityPassengerClass442TS.class, ItemIDs.minecartClass442TS.item, "passenger", 0, 0, 3.4, 0, 0, 0, 0, 0, 0, new String[]{"White", "Orange", "Red", "Yellow", "Blue"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class442MBLS", "Class442MBLS", EntityPassengerClass442MBLS.class, ItemIDs.minecartClass442MBLS.item, "passenger", 0, 0, 5.1, 0, 0, 0, 0, 0, 0, new String[]{"White", "Orange", "Red", "Yellow", "Blue"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class205loco", "Class205loco", EntityLocoDieselClass205loco.class, ItemIDs.minecartClass205loco.item, "diesel", 600, 121, 0, 55, 0, 100, 0.6, 0.7, 12000, new String[]{"Blue", "Cyan", "Green", "Grey", "LightBlue", "LightGrey", "Lime", "Orange", "Pink", "Red", "Yellow"}, 18, -4, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class205tso", "Class205tso", EntityPassengerClass205tso.class, ItemIDs.minecartCLass205tso.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Cyan", "Green", "Grey", "Lime", "Pink", "Red", "Yellow"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("Class205Tail", "Class205tail", EntityPassengerClass205tail.class, ItemIDs.minecartClass205tail.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Cyan", "Green", "Grey", "LightBlue", "LightGrey", "Lime", "Orange", "Pink", "Red", "Yellow"}, 0, 0, "Pack: B.I.P."),
				TrainRecord.makeEntry("M8DNF1Loco", "M8DNF1Loco", EntityElectricM8DNF1Loco.class, ItemIDs.minecartM8DNF1Loco.item, "electric", 250, 70, 0, 20, 0, 100, 0.9, 0.4, 1000, new String[]{"Blue"}, 18, -1.65, "Pack: Trams In Motion"),
				TrainRecord.makeEntry("M8DNF1Middlelong", "M8DNF1Middlelong", EntityPassengerM8DNF1MiddleLong.class, ItemIDs.minecartM8DNF1Middlelong.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Blue"}, 18, 0, "Pack: Trams In Motion"),
				TrainRecord.makeEntry("M8DNF1Middleshort", "M8DNF1Middleshort", EntityPassengerM8DNF1MiddleShort.class, ItemIDs.minecartM8DNF1Middleshort.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Blue"}, 18, 0, "Pack: Trams In Motion"),
				TrainRecord.makeEntry("M8DNF1Tail", "M8DNF1Tail", EntityPassengerM8DNF1Tail.class, ItemIDs.minecartM8DNF1Tail.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Blue"}, 18, -1.65, "Pack: Trams In Motion")
		};
	}


	//String trainType,int MHP,int maxSpeed, double mass, int fuelConsumption, int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, String[] colors,
	
	/*private String internalName;
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
	private int[] colors;
	private int guiRenderScale;
	private double bogieLocoPosition;
	private String additionnalTooltip;
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
	 *
	private EnumTrains(String internalName,Class entityClass, Item item, String trainType,int MHP,int maxSpeed, double mass, int fuelConsumption, int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, int[] colors, int guiRenderScale, double bogieLocoPosition){
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
	 *
	private EnumTrains(String internalName,Class entityClass, Item item, String trainType,int MHP,int maxSpeed, double mass, int fuelConsumption,int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, int[] colors, int guiRenderScale, double bogieLocoPositions, String additionnalTooltip){
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
	 *
	private EnumTrains(String internalName,Class entityClass, Item item, String trainType, double mass, int[] colors, int guiRenderScale, int cargoCapacity, String additionnalTooltip){
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


	@Override
	public String getName(){
		return this.name();
	}

	@Override
	public String getInternalName(){
		return this.internalName;
	}

	@Override
	public Item getItem(){
		return this.item;
	}

	@Override
	public String getTrainType(){
		return this.trainType;
	}

	@Override
	public int getMHP(){
		return this.MHP;
	}

	@Override
	public int getMaxSpeed(){
		return this.maxSpeed;
	}

	@Override
	public double getMass(){
		return this.mass;
	}

	@Override
	public int getFuelConsumption(){
		return this.fuelConsumption;
	}

	@Override
	public int getWaterConsumption(){
		return this.waterConsumption;
	}

	@Override
	public int getHeatingTime(){
		return this.heatingTime;
	}

	@Override
	public double getAccelerationRate(){
		return this.accelerationRate;
	}

	@Override
	public double getBrakeRate(){
		return this.brakeRate;
	}

	@Override
	public int getTankCapacity(){
		return this.tankCapacity;
	}

	@Override
	public int[] getColors(){
		return this.colors;
	}

	@Override
	public double getBogieLocoPosition(){
		return this.bogieLocoPosition;
	}


	@Override
	public Class getEntityClass() {
		return this.entityClass;
	}

	@Override
	public int getGuiRenderScale(){
		return this.guiRenderScale;
	}

	@Override
	public String getAdditionnalTooltip(){
		return this.additionnalTooltip;
	}

	@Override
	public int getCargoCapacity(){
		return cargoCapacity;
	}
	@Override
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
	@Override
	public AbstractTrains getEntity(World world, double x, double y, double z){
		try {
			if(world.isRemote){
				entityClass.getConstructor(World.class).newInstance(world);
			} else {
				return (AbstractTrains) entityClass.getConstructor(World.class, double.class, double.class, double.class).newInstance(world, x, y, z);
			}
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
	}*/
}
