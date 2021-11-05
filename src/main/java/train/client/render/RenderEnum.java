package train.client.render;

import tmt.ModelBase;
import train.client.render.models.*;
import train.common.api.AbstractTrains;
import train.common.api.EntityRollingStock;
import train.common.entity.rollingStock.*;

import java.util.ArrayList;

public enum RenderEnum {

	/** Passengers */
	passengerCartBlue(EntityPassengerBlue.class, new ModelPassenger6(), "passenger_", true, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	passengerCartBlackSmall(EntityPassenger2.class, new ModelPassenger2(), "passenger3", false, new float[] { 0.0F, -0.32F, -0.1F }, null, null, "", 0, null, "", null, 0, false),
	passengerLongGreen(EntityPassenger5.class, new ModelPassenger5(), "passenger5_", true, new float[] { 0.0F, -0.32F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	passengerShortGreen(EntityPassenger7.class, new ModelPassenger7(), "passenger7", false, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	passenger_1class_DB(EntityPassenger_1class_DB.class, new ModelPassenger_1class_DB(), "passenger_1class_DB", false, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	passenger_2class_DB(EntityPassenger_2class_DB.class, new ModelPassenger_2class_DB(), "passenger_2class_DB_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	passengerHighSpeedZeroED(EntityPassengerHighSpeedCarZeroED.class, new ModelPassengerHighSpeedCarZeroED(), "passengerHighSpeedCarZeroED", false, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	passengerTramNY(EntityPassengerTramNY.class, new ModelTramNY(), "locoTramNY", false, new float[] { 0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	passengerAdler(EntityPassengerAdler.class, new ModelPassengerAdler(), "passengerAdler", false, new float[] { 0F, 1.04F, 0.0F }, new float[] { 180F, -90F, 0F }, null, "", 0, null, "", null, 0, false),
	passenger_DB_oriental(EntityPassengerDBOriental.class, new ModelPassenger_DB_oriental(), "passenger_DB_oriental_", true, new float[] { 0F, -0.42F, 0.0F }, new float[] { 180F, 0F, 0F }, new float[] { -1F, -1F, 1F }, "", 0, null, "", null, 0,false),
	passengerCE1Class1(EntityPassengerICE_1class.class, new ModelICE1Passenger(), "ICE1_1st_class_", true,
			new float[] { 0.0F, 0.18F, 0F }, new float[] { 0F, 180F, 180F }, new float[] { 0.8f, 1f, 0.8f }, "", 0, null,
			"", null, 0, false),
	passengerCE1Class2(EntityPassengerICE_2class.class, new ModelICE1Passenger(), "ICE1_2nd_class_", true,
			new float[] { 0.0F, 0.18F, 0F }, new float[] { 0F, 180F, 180F }, new float[] { 0.8f, 1f, 0.8f }, "", 0, null,
			"", null, 0, false),
	passengerCE1Restaurant(EntityPassengerICE_Restaurant.class, new ModelICE1Restaurant(), "ICE1_Restaurant_", true, new float[] { 0.0F, 0.18F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.8f}, "", 0, null, "", null, 0, false),
	passengerGS4(EntityPassengerGS4.class, new ModelGS4Passenger(), "GS4_Passenger_", true, new float[] { 0.0F, 0.03F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.8f}, "", 0, null, "", null, 0, false),
	passengerGS4_Tail(EntityPassengerGS4_Tail.class, new ModelGS4Tail(), "GS4_Tail_", true, new float[] { -0.2F, 0.025F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.8f}, "", 0, null, "", null, 0, false),
	passengerGS4_Observatory(EntityPassengerGS4_Observatory.class, new ModelGS4Tavern(), "GS4_Tavern_", true, new float[] { 0.0F, 0.025F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.8f}, "", 0, null, "", null, 0, false),
	passengerRheingold(EntityPassengerRheingold.class, new ModelRheingoldPassenger(), "Rheingold_passenger_", true, new float[] { 1.55F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	passengerRheingoldDining1(EntityPassengerRheingoldDining1.class, new ModelRheingoldPassenger_Dining1(), "Rheingold_passenger_dining1_", true, new float[] { 1.7F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	passengerRheingoldDining2(EntityPassengerRheingoldDining2.class, new ModelRheingoldPassenger_Dining2(), "Rheingold_passenger_dining2_", true, new float[] { 0.05F, 0.15F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	passengerRheingoldPanorama(EntityPassengerRheingoldPanorama.class, new ModelRheingoldPassenger_Panorama(), "Rheingold_passenger_panorama_", true, new float[] { -0.1F, 0.15F, 0.1F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	drgPasenger(EntityPassengerDenverRioGrande.class, new ModelDRGPassenger(), "drg_passenger_", true, new float[] { 0.0F, 0.14F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	drgPasengerCombo(EntityPassengerDenverRioGrandeCombo.class, new ModelDRGCombo(), "drg_combo_", true, new float[] { 0.0F, 0.14F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	MILWPasenger(EntityPassengerMILW.class, new ModelMILWPassenger(), "milw_passenger", false, new float[] { 0.2F, 0F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,0.9f,0.9f}, "", 0, null, "", null, 0, false),
	MILWPasengerTail(EntityPassengerMILWTail.class, new ModelMILWTail(), "milw_passenger_tail", false, new float[] { 0.1F, 0.1F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,0.9f,0.9f}, "", 0, null, "", null, 0, false),
	//MILWPasengerDiner(EntityPassengerMILWDiner.class, new ModelMILW1935Passenger(), "milw_passenger_diner", false, new float[] { 0.0F, -0.14F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),

	PasengerBamboo(EntityPassengerBamboo.class, new ModelBambooTrainPassenger(), "passenger_bamboo_", true, new float[] { 0.1F, 0F, 0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	/** Caboose */
	cabooseRed(EntityCaboose3.class, new ModelCaboose3(), "caboose3", false, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	cabooseBlack(EntityCaboose.class, new ModelCaboose(), "caboose", false, new float[] { 0.0F, -0.32F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	cabooseLogging(EntityCabooseLogging.class, new ModelCabooseLogging(), "cabLogging_", true, new float[] { 0.0F, -0.45F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	cabooseLoggingPRR(EntityCabooseLoggingPRR.class, new ModelPRRCaboose(), "PRRCaboose_", true, new float[] { 0.0F, -0.38F, 0.0F },new float[]{0,180,180}, null, "", 0, null, "", null, 0, false),
	GWRBrakeVan(EntityGWRBrakeVan.class, new ModelGWRBrakeVan(), "GWRBrakeVan", false, new float[] { 0F, 0.1F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	/** Specials **/
	stockCar(EntityStockCar.class, new ModelStockCar(), "stockcar_", true, new float[] { -.0F, -0.32F, 0.0F }, new float[]{0,0,0}, null, "", 0, null, "", null, 0, false),
	drwgStockCar(EntityStockCarDRWG.class, new ModelDRWGStockCar(), "drwgstockcar", false, new float[] { 1.0F, -0.4F, 0.0F }, new float[]{0,0,180}, null, "", 0, null, "", null, 0, false),
	workCart(EntityWorkCart.class, new ModelWorkCart(), "workcart", false, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCart(EntityFlatCart.class, new ModelFlatCar(), "flatcart", false, new float[] { 0.0F, -0.32F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	workCaboose(EntityCabooseWorkCart.class, new ModelWorkCaboose(), "workcaboose", false, new float[] { 0.0F, -0.32F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	jukeBoxCart(EntityJukeBoxCart.class, new ModelJukeBox(), "jukebox", false, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCartSU(EntityFlatCartSU.class, new ModelFlatCarSU(), "flatcarsu", false, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCartUS(EntityFlatCartUS.class, new ModelFlatCarUS(), "flatCartUS", false, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tracksBuilder(EntityTracksBuilder.class, new ModelBuilder(), "builder2", false, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { -1.3D, 2.1D, 0.0D });
		}
	}, "", null, 0, true),

	/** Freight */
	freightCartRed(EntityFreightCart2.class, new ModelFreightCart2(), "freightcart2", false, new float[] { 0.0F, -0.32F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightCartYellow(EntityFreightCart.class, new ModelFreightCart2(), "freightcart", false, new float[] { 0.0F, -0.32F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightWood(EntityFreightWood.class, new ModelWood(), "wood_Full", false, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightHopper(EntityFreightGrain.class, new ModelGrain(), "hopper", false, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightOpenWagon(EntityFreightOpenWagon.class, new ModelOpenWagon(), "openwagon", false, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	//passenger4(EntityPassenger4.class, new ModelPassenger4(), "passenger4",false,new float[] {0.0F, -0.32F, 0.0F},null,null,"",0,null,"",null,0),//apparently has been removed
	freightHopperUS(EntityFreightHopperUS.class, new ModelFreightHopper(), "freightHopperUS_", true,
			new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCartWoodUS(EntityFlatCartWoodUS.class, new ModelFlatCarWoodUS(), "flatCartWoodUS", false, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightCartUS(EntityFreightCartUS.class, new ModelFreightCartUS(), "freightCartUS_", true, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightBoxCartUS(EntityBoxCartUS.class, new ModelBoxCartUS(), "boxCartUS_", true, new float[] { 0.0F, -0.45F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightBoxCartPRR(EntityBoxCartPRR.class, new ModelPRRX31Wagon(), "PRR_X31a", false, new float[] { 0.0F, -0.38F, 0.0F }, new float[]{0,180,180}, null, "", 0, null, "", null, 0, false),
	freightTGNG(EntityFreightGTNG.class, new ModelGTNG(), "GTNGOreWagon", false, new float[] { 0.0F, 0.2F, 0.0F }, new float[]{0,0,180}, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	freightCartSmall(EntityFreightCartSmall.class, new ModelSmallFreightCart(), "freightCartSmall", false, new float[] { 0.0F, -0.20F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightMinetrain(EntityFreightMinetrain.class, new ModelMinetrain(), "minetrain", false, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCartWoodLogs(EntityFreightWood2.class, new ModelFreightWood(), "flatCartWood2", false, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	freightClosedRedBrown(EntityFreightClosed.class, new ModelFreightClosed(), "freightClosed", false, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	freightOpenRedBrown(EntityFreightOpen2.class, new ModelFreightOpen2(), "freightOpen2", false, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	mailWagen_DB(EntityMailWagen_DB.class, new ModelMailWagen(), "mailWagen_DB", false, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightWagen_DB(EntityFreightWagenDB.class, new ModelFreightWagenDB(), "freightWagen_DB_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCarRails_DB(EntityFlatCarRails_DB.class, new ModelFlatCarRails_DB(), "flatCarRails_DB_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCar_DB(EntityFlatCar_DB.class, new ModelFlatCar_DB(), "flatCar_DB_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCarLogs_DB(EntityFlatCarLogs_DB.class, new ModelFlatCarLogs_DB(), "flatCarLogs_DB_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightGondola_DB(EntityFreightGondola_DB.class, new ModelFreightGondola_DB(), "freightGondola_DB_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightCenterBeam_Empty(EntityFreightCenterbeam_Empty.class, new ModelFreightCenterBeam_Empty(), "freight_centerbeam_empty_", true, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	freightCenterBeam_Wood1(EntityFreightCenterbeam_Wood_1.class, new ModelFreightCenterBeam_Wood_1(), "freight_centerbeam_wood_1_", true, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	freightCenterBeam_Wood2(EntityFreightCenterbeam_Wood_2.class, new ModelFreightCenterBeam_Wood_2(), "freight_centerbeam_wood_2_", true, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	//freightWellcar(EntityFreightWellcar.class, new ModelFreightWellcar(), "freightWellcar_", true, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	freightWellcar(EntityFreightWellcar.class, new ModelWellcar(), "wellcar_", true, new float[] { 0.0F, 0.0F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightTrailer(EntityFreightTrailer.class, new ModelFreightTrailer(), "freightTrailer_", true, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	freightGS4(EntityFreightGS4_Baggage.class, new ModelGS4Baggage(), "GS4_baggage_", true, new float[] { 0.0F, 0.025F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.8f}, "", 0, null, "", null, 0, false),
	freightSlateWagon(EntityFreightSlateWagon.class, new ModelSlateWagon(), "freightslatewagon", false, new float[] { 0.0F, 0.2F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	freightIceeWagon(EntityFreightIceWagon.class, new ModelIceWagon(), "icewagon", false, new float[] { 0.0F, 0.2F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	freight100TonHopper(EntityFreight100TonHopper.class, new Model100TonHopper(), "freight_100tonhopper_", true, new float[] { -0.1F, 0.0F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	freightBulkheadFlatCar(EntityBulkheadFlatCart.class, new ModelBulkheadFlat(), "BulkheadFlat_", true, new float[] { 0.0F, 0.1F, 0.0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	drgBaggage(EntityFreightDenverRioGrande.class, new ModelDRGBaggage(), "drg_baggage_", true, new float[] { 0.0F, 0.14F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	MILW1935Baggage(EntityFreightBaggageMILW.class, new ModelMILWBaggage(), "milw_baggage", false, new float[] { 0.1F, 0.1F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,0.9f,0.9f}, "", 0, null, "", null, 0, false),
	HeavyweightMailcar(EntityFreightHeavyweight.class, new ModelHeavyweight(), "heavyweight_mailcar", false, new float[] { 0.1F, 0.18F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	BambooFreightcar(EntityFreightBamboo.class, new ModelBambooTrainCargo(), "bamboo_freight_", true, new float[] { 0.1F, 0F, 0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightGermanPost(EntityFreightGermanPost.class, new ModelGermanPost(), "german_post_", true, new float[] { -1F, 0.15F, -0.075F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	freightDepressedFlatbed(EntityFreightDepressedFlatbed.class, new ModelDepressedFlatbed(), "depressed_flatbed_", true, new float[] { -0.1F, 0.15F, -0.075F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightCartL(EntityFreightCartL.class, new ModelFreightCarL(), "freightCarL_", true, new float[] { 0F, 0.2F, 0.825F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightKclassrailBox(EntityFreightKClassRailBox.class, new ModelKClassRailBox(), "KClassRailBox_", true, new float[] { -1.5F, 0.1F, 0.125F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightShortCoveredHopper(EntityFreightShortCoveredHopper.class, new ModelShortCoveredHopper(), "ShortCoveredHopper_", true, new float[] { -2.2F, -0.25F, 0.7F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightLongCoveredHopper(EntityFreightLongCoveredHopper.class, new ModelLongCoveredHopper(), "LongCoveredHopper_", true, new float[] { -1F, -0.25F, 0.65F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightHeavyweightBoxcar(EntityFreightHeavyweightBaggage.class, new ModelHeavyweightBaggage(), "heavyweightBoxcar_", true, new float[] { 0F, 0.1F, -0.05F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightASTFAutorack(EntityFreightASTFAutorack.class, new ModelASTFAutorack(), "astf_autorack", false, new float[] { -1F, 0.2F, 0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	BoulderWagon(EntityBoulderWagon.class, new ModelBoulderWagon(),"BoulderWagon_",true, new float[]{0F,0.2F,0F}, new float[] { 0F, 180F, 180F },null, "",0,null,  "",null, 0,false),

	/** Tanks **/
	tankWagon_DB(EntityTankWagon_DB.class, new ModelTankWagon_DB(), "tankWagon_DB_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tankWagonUS(EntityTankWagonUS.class, new ModelTankWagonUS(), "tankWagonUS_", true, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tankWagonGrey(EntityTankWagon2.class, new ModelTankWagon2(), "tankwagon2", false, new float[] { 0.0F, -0.32F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tankCartLava(EntityTankLava.class, new ModelWatertransp(), "lavacar_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tankWagonYellow(EntityTankWagon.class, new ModelTankWagon(), "tankwagon", false, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tankWagonThreeDome(EntityTankWagonThreeDome.class, new ModelTankWagonThreeDome(), "tanker_three_dome_", true, new float[] { 0.0F, 0.17F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	/** Tenders */
	tenderSmall(EntityTenderSmall.class, new ModelTender(), "tender2_", true, new float[] { 0.0F, -0.5F, 0.0F }, new float[] { 0F, 90F, 0F }, new float[] { 0.75F, 0.75F, 0.75F }, "", 0, null, "", null, 0, false),
	tenderHeavy(EntityTenderHeavy.class, new ModelTenderHeavy(), "heavytender_", true, new float[] { 0.0F, -0.4F, 0.0F }, new float[] { 0F, 180F, 0F }, null, "", 0, null, "", null, 0, false),
	tender4_4_0(EntityTender4_4_0.class, new ModelNormalSteamTender(), "4-4-0-loco_tender_", true, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	tenderBR01(EntityTenderBR01_DB.class, new ModelTenderBR01_DB(), "tenderBR01_DB", false, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tenderEr_Ussr(EntityTenderEr_Ussr.class, new ModelTenderEr_Ussr(), "tenderEr_Ussr", false, new float[] { 0.06F, -0.44F, 0.0F }, new float[] { 0F, 180F, 0F }, null, "", 0, null, "", null, 0, false),
	tenderC62Class(EntityTenderC62Class.class, new ModelC62Tender(), "c62_tender_", true,
			new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tenderD51(EntityTenderD51.class, new ModelD51Tender(), "d51_tender", false,
			new float[] { -3.0F, 0.35F, 0.0F }, new float[]{0,180f,180f}, null, "", 0, null, "", null, 0, false),
	tenderAdler(EntityTenderAdler.class, new ModelTenderAdler(), "tender_adler", false, new float[] { 0.0F, 1.05F, 0.0F }, new float[] { 180F, -90F, 0F }, null, "", 0, null, "", null, 0, false),
	tenderGS4(EntityTenderGS4.class, new ModelGS4Tender(), "GS4_tender_", true, new float[] { 0.0F, 0.15F, -0.05F },
			new float[] { 0F, 180F, 180F }, new float[] { 0.8f, 1f, 0.8f }, "", 0, null, "", null, 0, false),
	Model4000GallonTender(EntityTender4000.class, new Model4000GallonTender(), "GWR_Tender_",  true, new float[] { -4.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	ModelFowler4FTender(EntityTenderFowler4F.class, new ModelFowler4FTender(), "Fowler_4F_Tender",  false, new float[] { -5.25F, -0.51585F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	tenderCoranationClass(EntityTenderCoranationClass.class, new ModelCoranationClassTender(), "CoranationClassTender", false, new float[] { 0.0F, 0.2F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	tenderBerk1225(EntityTenderBerk1225.class, new Model1225Tender(), "Berkshire_tender_",  true, new float[] { 2.75F, -0.65F, 0.0625F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	tenderC41(EntityTender_C41.class, new ModelTenderC41(), "C41Tender", false, new float[] { 0.1F, 0.2F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	tenderSouthern1102(EntityTender_Southern1102.class, new ModelSouthern1102Tender(), "Southern1102Tender", false, new float[] { -5.25F, -0.5F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	tenderMILW(EntityTenderMILW.class, new ModelMILWTender(), "milw_tender", false, new float[] {0.15F, 0.055F, 0.025F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,0.9f,0.9f}, "", 0, null, "", null, 0, false),

	/** Diesel */
	locoKOF(EntityLocoDieselKof_DB.class, new ModelKof(), "locoKof_DB_", true, new float[] { -1.0F, -0.44F, 0.0F }, null, null, "smoke", 2, new ArrayList<double[]>() {
		{
			add(new double[] { 0.9D, 1.1D, 0.0D });
		}
	}, "", null, 0, true),
	locoGP40(EntityLocoDieselCD742.class, new ModelGP40(), "cd742_", true, new float[] { -0.8F, 0.75F, 0.0F }, new float[] { 180F, 180F, 0F }, new float[] { 0.8F, 0.8F, 0.8F }, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 1.25D, 1.15D, 0.0D });
		}
	}, "", null, 0, false),
	locoChME3(EntityLocoDieselChME3.class, new ModelChME3(), "chme3", false, new float[] { -0.5F, -0.47F, 0.0F }, null, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 0.6D, 1.55D, 0.0D });
		}
	}, "", null, 0, false),
	locoGP7Red(EntityLocoDieselGP7Red.class, new ModelGP7(), "gp7_", true, new float[] { -0.8F, -0.47F, 0.0F }, new float[] { 0F, 180F, 0F }, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { -0.2D, 1.3D, 0.0D });
			add(new double[] { 0.45D, 1.3D, 0.0D });
		}
	}, "", null, 0, false),
	loco44tonner(EntityLocoDiesel44TonSwitcher.class, new ModelLoco44TonSwitcher(), "loco_44tonswitcher_", true, new float[] { -2.75F, -0.425F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 0.6D, 1.55D, 0.0D });
			add(new double[] { 2D, 1.55D, 0.0D });
		}
	}, "", null, 0, false),
	locoSD40(EntityLocoDieselSD40.class, new ModelSD40(), "locoSD40_", true, new float[] { -1.2F, -0.47F, 0.0F }, new float[] { 180F, 90F, 0F }, new float[] { -1F, -1F, 1F }, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 1.45D, 1.45D, 0.0D });
		}
	}, "", null, 0, false),
	locoSD70(EntityLocoDieselSD70.class, new ModelSD70(), "locoSD70_", true, new float[] { -1.2F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 0.4D, 1.3D, 0.0D });
		}
	}, "", null, 0, false),

	locoShunter(EntityLocoDieselShunter.class, new ModelShunter(), "shunter_", true, new float[] { -1.2F, -0.42F, 0.0F }, null, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 2.4D, 1.5D, -0.1D });
			add(new double[] { 2.4D, 1.5D, 0.1D });
		}
	}, "", null, 0, true),
	locoWLs40(EntityLocoDieselWLs40.class, new ModelWLs40(), "wls40", false, new float[] { 0F, 0.1F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 3.0D, 1.4D, 0.0D });
		}
	}, "", null, 0, true),
	locoV60_DB(EntityLocoDieselV60_DB.class, new ModelV60(), "locoV60_DB_", true, new float[] { -0.75F, -0.44F, 0.0F }, null, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 0.75D, 1.7D, 0.0D });
		}
	}, "", null, 0, false),
	locoMILW_H1044(EntityLocoDieselMILW_H1044.class, new ModelMILW_H1044(), "MILW_H1044_", true, new float[]{0,0.06f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "largesmoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 3.7D, 1.7D, 0D });
		}
	}, "", null, 0, false),
	locoEMDF7(EntityLocoDieselEMDF7.class, new ModelEMDF7(), "emdf7_", true, new float[]{-2.2f,0.1f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 4, new ArrayList<double[]>() {
		{
					add(new double[] { -0.15D, 1.6D, 0.0D });
					add(new double[] { 0.5D, 1.6D, 0.0D });
		}
	}, "", null, 0, false),
	locoEMDF3(EntityLocoDieselEMDF3.class, new ModelEMDF3(), "emdf3_", true, new float[]{-2.2f,0.1f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 4, new ArrayList<double[]>() {
		{
					add(new double[] { -0.15D, 1.6D, 0.0D });
					add(new double[] { 0.55D, 1.6D, 0.0D });
		}
	}, "", null, 0, false),
	locoEMDF7b(EntityBUnitEMDF7.class, new ModelEMDF7B(), "emdf7b_", true, new float[]{0,0.1f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 4, null, "", null, 0, false),
	locoEMDF3b(EntityBUnitEMDF3.class, new ModelEMDF3B(), "emdf3b_", true, new float[]{0,0.1f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 4, null, "", null, 0, false),
	DD35b(EntityBUnitDD35.class, new ModelDD35B(), "dd35b_", true, new float[]{0,0.18f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	locoDieselDD35A(EntityLocoDieselDD35A.class, new ModelDD35A(), "dd35a_", true, new float[]{-5,0.18f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 3.9D, 1.6D, 0.0D });

			add(new double[] { -0.4D, 1.6D, 0.0D });
		}
	}, "", null, 0, false),
	locoBamboo(EntityLocoDieselBamboo.class, new ModelBambooTrainEngine(), "loco_bamboo_", true, new float[] { -1.0F, 0F, 0.0F }, new float[]{180,180,0}, null, "smoke", 2, new ArrayList<double[]>() {
		{
			add(new double[] { -0.05D, -0.05D, 0.0D });
		}
	}, "", null, 0, true),
	/** Electric */
	locoE10DB(EntityLocoElectricE10_DB.class, new ModelE10DB(), "locoe10_db_", true, new float[] { -1.7F, 0.05F, 0.0F }, new float[] { 0F, 0F, 180F }, new float[]{0.9f,0.9f,0.9f}, "",0,null, "", null, 0, false),
	locoCD151(EntityLocoElectricCD151.class, new ModelLocoCD151(), "CD151_", true, new float[]{-2,0.18f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "",0,null, "", null, 0, false),
	locoE103(EntityLocoElectricE103.class, new ModelE103(), "E103_", true, new float[]{-2,0.05f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "",0,null, "", null, 0, false),
	locoVL10(EntityLocoElectricVL10.class, new ModelVL10(), "vl10", false, new float[] { -1.2F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoBR_E69(EntityLocoElectricBR_E69.class, new ModelBR_E69(), "locoBR_E69_", true, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoMineTrain(EntityLocoElectricMinetrain.class, new ModelLocoMinetrain(), "locoMinetrain", false, new float[] { -0.8F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoSpeedZeroED(EntityLocoElectricHighSpeedZeroED.class, new ModelLocoHighSpeedZeroED(), "locoHighSpeedZeroED", false, new float[] { -1.7F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoICE1(EntityLocoElectricICE1.class, new ModelICE1(), "ICE1_Engine_", true, new float[] { 0.0F, 0.18F, 0.1F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.8f}, "", 0, null, "", null, 0, false),
	//locoSpeedGrey(EntityNewHighSpeedLoco.class, new ModelNewHighSpeedLoco(), "newhighspeedloco", false, new float[] { -0.05F, -0.5F, 0.0F }, new float[] { 0F, 90F, 0F }, new float[] { 0.8F, 0.8F, 0.8F }, "", 0, null, "", null, 0),
	locoTramYellow(EntityLocoElectricTramWood.class, new ModelTram(), "tram", false, new float[] { -0.8F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoTramNY(EntityLocoElectricTramNY.class, new ModelTramNY(), "locoTramNY", false, new float[] { -1.5F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),

	passengerC4FG(PassengerIC4_DSB_FG.class, new ModelLocoDieselIC4_DSB_FG(), "IC4_DSB_FG", false, new float[] { -0.8F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	passengerC4FH(PassengerIC4_DSB_FH.class, new ModelLocoDieselIC4_DSB_FH(), "IC4_DSB_FH", false, new float[] { -0.8F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoIC4MG(EntityLocoDieselIC4_DSB_MG.class, new ModelLocoDieselIC4_DSB_MG(), "IC4_DSB_MG_", true, new float[] { -0.8F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoBR185(EntityLocoElectricBR185.class, new BR185_EngineModel(), "BR185_Engine_", true, new float[] { -2.0F, 0.1F, 0.0F },  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	locoClass85(EntityLocoElectricClass85.class, new ModelClass85(), "Class85_", true, new float[] { -3.0F, 0.65F, 0.0F },  new float[] { 0F, 90F, 180F }, null, "", 0, null, "", null, 0, false),
	locoBP4(EntityLocoElectricBP4.class, new ModelBP4(), "bp4_", true, new float[] { -2.2F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	locoDeltic(EntityLocoDieselDeltic.class, new ModelDeltic(), "Deltic", false, new float[] { -2.25F, 0.8F, 0.0F },  new float[] { 0F, 90F, 180F }, null, "largesmoke", 1, new ArrayList<double[]>() {
		{
			add(new double[]{2.3D, 1.6D, 0D});
		}
	}, "", null, 0, false),
	locoEWSClass66(EntityLocoDieselClass66.class, new ModelEWSClass66(), "Class66_", true, new float[] { -3.0F, 0.65F, 0.0F },  new float[] { 0F, 90F, 180F }, null, "largesmoke", 2, new ArrayList<double[]>() {
		{
			add(new double[]{0.9D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	locoFOL_M1(EntityLocoDieselFOLM1.class, new ModelFOL_M1(), "FOL_M1_", true, new float[] { -2.8F, 0.05F, 0.9F },  new float[] { 0F, 180F, 180F }, null, "smoke", 3, new ArrayList<double[]>() {
		{
			add(new double[]{1.3D, 1.45D, 0.0D});
		}
	}, "", null, 0, false),
	FOLM1B(EntityLocoDieselFOLM1B.class, new ModelFOLM1B(), "FOL_M1b_", true, new float[] { -2.2F, 0.05F, 0.F },  new float[] { 0F, 180F, 180F }, null, "smoke", 3, new ArrayList<double[]>() {
		{
			add(new double[]{1.6D, 1.45D, 0.0D});
		}
	}, "", null, 0, false),
	/** Steam */
	locoCherepanov(EntityLocoSteamCherepanov.class, new ModelLocoCherepanov(), "locoCherepanov", false, new float[] { -0.875F, -0.47F, 0.0F }, new float[] { 0, 180, 0 }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 1.5D, 2.1D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 0.875D, 0.2D, 0.2D });
		}
	}, 2, true),
	locoPannier(EntityLocoSteamPannier.class, new ModelLocoPannier(), "locoPannier", false, new float[] { 0.15F, 0.2F, 0.0F }, new float[] { 0, 180, 180 }, new float[]{0.9f,0.9f,0.9f}, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.4D, 1.8D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.575D, 0.05D, 0.65D });
		}
	}, 2, true),
	locoC41(EntityLocoSteamC41.class, new ModelLocoC41(), "locoC41", false, new float[] {  -3.5F, -0.5F, 0.0F }, new float[] { 0, 180, 180 }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.55D, 1.65D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.9D, 0.05D, 0.65D });
		}
	}, 2, true),
	locoC41_080(EntityLocoSteamC41_080.class, new ModelC41_080(), "locoC41_080", false, new float[] {  -3.5F, -0.5F, 0.0F }, new float[] { 0, 180, 180 }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.55D, 1.65D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.9D, 0.05D, 0.65D });
		}
	}, 2, true),
	locoAlcoSC4(EntityLocoSteamAlcoSC4.class, new ModelAlcoSC4(), "AlcoSC4", false, new float[] {  -3.5F, -0.5F, 0.0F }, new float[] { 0, 180, 180 }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.55D, 1.65D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.9D, 0.05D, 0.65D });
		}
	}, 2, true),
	locoC41T(EntityLocoSteamC41T.class, new ModelLocoC41T(), "locoC41t", false, new float[] {  -3.5F, -0.5F, 0.0F }, new float[] { 0, 180, 180 }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.55D, 1.65D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.9D, 0.05D, 0.65D });
		}
	}, 2, true),
	locoSouthern1102(EntityLocoSteamSouthern1102.class, new ModelSouthern1102(), "Southern1102", false, new float[] { -3.5F, -0.5F, 0.0F }, new float[] { 0, 180, 180 }, new float[]{1f,1f,1f}, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.55D, 1.65D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.9D, 0.05D, 0.65D });
		}
	}, 2, true),
	locoUSATCUS(EntityLocoSteamUSATCUS.class, new ModelUSATCUS(), "USATCUS", false, new float[] { -2.0F, -0.25F, 0.8375F }, new float[] { 0, 180, 180 }, new float[]{1f,1f,1f}, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 2.5D, 1.2D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.5D, -0.5D, 0.65D });
		}
	}, 2, true),
	locoUSATCUK(EntityLocoSteamUSATCUK.class, new ModelUSATCUK(), "USATCUK", false, new float[] { -2.0F, -0.25F, 0.8375F }, new float[] { 0, 180, 180 }, new float[]{1f,1f,1f}, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 2.5D, 1.2D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.5D, -0.5D, 0.65D });
		}
	}, 2, true),
	locoCoranationClass(EntityLocoSteamCoranationClass.class, new ModelCoranationClass(), "CoranationClass", false, new float[] { -3.8F, 0.2F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
					add(new double[] { 5.45D, 1.9D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
					add(new double[] {4.8D, 0.15D, 0.5D });
		}
	}, 2, true),
	locoBR80(EntityLocoSteamBR80_DB.class, new ModelLocoBR80_DB(), "locoBR80_DB_", true, new float[] { -0.75F, -0.44F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 1.8D, 1.75D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, -0.4D, 0.8D });
		}
	}, 4, true),
	loco4_4_0(EntityLocoSteam4_4_0.class, new ModelLoco(), "4-4-0-loco_", true, new float[] { -0.66F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, 2.05D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.56D, -0.2D, 0.8D });
		}
	}, 4, true),
	locoSteamSmall(EntityLocoSteamSmall.class, new ModelLoco3(), "loco3_", true, new float[] { -0.99F, -0.5F, 0.0F }, new float[] { 0F, -90F, 0F }, new float[] { 0.8F, 0.8F, 0.8F }, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 1.69D, 1.1D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamLSSP7(EntityLocoSteamLSSP7.class, new ModelLSSP7(), "LSSP7", false, new float[] { -1F, -0.2F, 0.8F }, new float[] { 0F, 180F, 180F }, new float[] { 1F, 1F, 1F }, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 0.1D, 1.15D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 0.7D, -0.4D, 0.5D });
			add(new double[] { 0.7D, -0.4D, -0.5D });
		}
	}, 2, true),
	locoHeavySteam(EntityLocoSteamHeavy.class, new ModelHeavySteamLoco(), "heavysteam_", true, new float[] { 0F, -0.42F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.1D, 2D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 3D, -0.2D, 0.8D });
		}
	}, 2, true),
	locoSteamC62Class(EntityLocoSteamC62Class.class, new ModelC62Locomotive(), "c62_engine_", true,
			new float[] { 0F, -0.44F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 5.0D, 1.75D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 5.2D, -0.2D, 0.8D });
		}
	}, 2, false),
	locoSteamD51Short(EntityLocoSteamD51.class, new ModelD51ShortStreamlining(), "d51_short_", true,
			new float[] { 0F, -0.5F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 4.85D, 1.85D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 4.6D, -0.2D, 0.8D });
		}
	}, 2, false),
	locoSteamD51Long(EntityLocoSteamD51Long.class, new ModelD51LongStreamlining(), "d51_long_", true,
			new float[] { 0F, -0.5F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 4.85D, 1.85D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 4.6D, -0.2D, 0.8D });
		}
	}, 2, false),
	locoSteamBR01_DB(EntityLocoSteamBR01_DB.class, new ModelLocoBR01_DB(), "locoBR01_DB", false, new float[] { -1.0F, -0.44F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.45D, 1.8D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 3.4D, -0.2D, 0.8D });
		}
	}, 2, false),
	locoSteamGS4(EntityLocoSteamGS4.class, new ModelGS4Loco(), "GS4_engine_", true, new float[] { 0.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, new float[]{0.95f,0.95f,0.95f}, "largesmoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 5.8D, 1.7D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 5.2D, -0.2D, 0.8D });
		}
	}, 2, false),
	locoSteamEr_USSR(EntityLocoSteamEr_Ussr.class, new ModelLocoEr_Ussr(), "locoEr_Ussr", false, new float[] { -0.75F, -0.44F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.45D, 1.9D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 3.4D, -0.2D, 0.8D });
		}
	}, 2, false),
	locoSteamForney(EntityLocoSteamForneyRed.class, new ModelLocoForney(), "locoForney_", true, new float[] { -1.3F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 2.2D, 1.9D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.2D, -0.2D, 0.8D });
		}
	}, 2, true),
	locoSteamMogul(EntityLocoSteamMogulBlue.class, new ModelLocoMogul(), "locoMogul_", true, new float[] { -0.6F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 1.55D, 1.95D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.45D, -0.2D, 0.8D });
		}
	}, 2, true),
	locoSteamShay(EntityLocoSteamShay.class, new ModelLocoSteamShay(), "locoShay", false, new float[] { -0.4F, -0.45F, -0.0F }, new float[] { 0F, 180F, 0F }, null, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 1.8D, 1.7D, 0.2D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamVBShay(EntityLocoSteamVBShay.class, new ModelVBShay(), "vbshay", false, new float[] { 0F, 0.2F, 0.0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 0.55D, 2.2D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamClimax(EntityLocoSteamClimax.class, new ModelLocoClimax(), "loco_climax", false, new float[] { 0F, 0.18F, 0.0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 2.05D, 1.9D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamAdler(EntityLocoSteamAdler.class, new ModelLocoSteamAdler(), "locoAdler", false, new float[] { -0.8F, 1.05F, 0F }, new float[] { 180F, -90F, 0F }, new float[]{0.9f,1f,0.9f}, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, 1.3D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.5D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamAlice(EntityLocoSteamAlice0_4_0.class, new ModelLocoAlice040(), "0-4-0-loco-alice", false, new float[] { 0F, 0.15F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 2.2D, 1.6D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.8D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteam040VB(EntityLocoSteam040VB.class, new ModelVB040(), "loco040VB", false, new float[] { 0F, 0.15F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 0.6D, 1.75D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.8D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamGLYN(EntityLocoSteamGLYN042T.class, new Model042TGLYN(), "0-4-2-loco-glyn", false, new float[] { 0F, 0.15F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 2.15D, 1.75D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.8D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteam626T(EntityLocoSteam262T.class, new ModelT262(), "262t", false, new float[] { 0F, 0.15F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 2.65D, 1.7D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.8D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamA4Mallard(EntityLocoSteamMallardA4.class, new ModelA4Locomotive(), "locoA4_UK_", true, new float[] {-3.0F, 0.2F, 0F },new float[] { 0F, 180F, 180F }, new float[]{0.975f,0.975f,0.975f}, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 4.8D, 1.95D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 4.9D, -0.4D, 0.8D });
		}
	}, 2, true),
	LocoSteamHallClass(EntityLocoSteamHallClass.class, new ModelHallClass(), "Hall_Class_Locomotive_", true, new float[] {-0.65F, 0.15F, -0.25F },/*position*/  new float[] { 0F, 180F, 180F }, new float[]{1f,1f,1f},/*scale*/ "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 4.25D, 1.55D, 0D });//smoke
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 4D, -0.4D, 0.8D });//steam
		}
	}, 2, true),
	LocoSteamKingClass(EntityLocoSteamKingClass.class, new ModelKingClass(), "King_Class_Locomotive_", true, new float[] {-1.75F, 0.15F, 0.0F },/*position*/  new float[] { 0F, 180F, 180F }, new float[]{1f,1f,1f},/*scale*/ "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 4.8D, 1.6D, 0.0D });//smoke
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 3.6D, -0.4D, 0.8D });//steam
		}
	}, 2, true),
	LocoSteamBerk1225(EntityLocoSteamBerk1225.class, new Model1225(), "Berk1225_Locomotive", false, new float[] {-2.0F, -0.65F, 0.0625F },/*position*/  new float[] { 0F, 0F, 180F }, new float[]{1f,1f,1f},/*scale*/ "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 4.65D, 1.7D, 0.0D });//smoke
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 4.2D, -0.4D, 0.8D });//steam
		}
	}, 2, true),
	LocoSteamBerk765(EntityLocoSteamBerk765.class, new Model765(), "Berk765_Locomotive", false, new float[] {-2.0F, -0.65F, 0.0625F },/*position*/  new float[] { 0F, 0F, 180F }, new float[]{1f,1f,1f},/*scale*/ "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 4.65D, 1.7D, 0.0D });//smoke
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 4.2D, -0.4D, 0.8D });//steam
		}
	}, 2, true),
	locoSteamMILWClassA(EntityLocoSteamMILWClassA.class, new ModelMILWClassA(), "locoMILW_ClassA", false, new float[] {0.0F, 0.1F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,0.9f,0.9f}, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 4.4D, 1.35D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 4.2D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamFowler(EntityLocoSteamFowler.class, new ModelFowler(), "loco_Fowler", false, new float[] { -3F, -0.51585F, 0.0F }, new float[] { 0F, 180F, 180F }, new float[]{1f,1f,1f}, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 3.2D, 1.6D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2D, -0.4D, 0D });
		}
	}, 2, true),
	locoSteamA4Tender(EntityTenderA4.class, new ModelTenderA4(), "tenderA4_UK_", true, new float[] { -0.2F, 0.2F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PropagandaUS(EntityPropagandaUS.class, new ModelPropagandaCar(), "propaganda_US_", true, new float[] { 1.1F, 0.2F, -0.1F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PropagandaJapan(EntityPropagandaJapan.class, new ModelPropagandaCar(), "propaganda_Japan_", true, new float[] { 1.1F, 0.2F, -0.1F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PropagandaUSSR(EntityPropagandaUSSR.class, new ModelPropagandaCar(), "propaganda_USSR_", true, new float[] { 1.1F, 0.2F, -0.1F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PropagandaBritain(EntityPropagandaBritain.class, new ModelPropagandaCar(), "propaganda_Britain_", true, new float[] { 1.1F, 0.2F, -0.1F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	SnowPlow(EntityLocoSteamSnowPlow.class, new ModelSnowPlow(), "train_snowplow", false, new float[] { -2F, 0.12F, 0F }, new float[] { 0F, 180F, 180F }, null,  "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 3.15D, 1.6D, 0.0D });
		}
	}, "", null, 0, false),


	locoDieselCF7(EntityLocoDieselCF7.class, new ModelCF7(), "CF7_", true,new float[] {-1.5F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{0.6D, 1.4D, 0.0D});
			add(new double[]{1.1D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	locoDieselGP15(EntityLocoDieselGP15.class, new ModelGP15(),"gp15_", true,new float[] {-1.3F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.33D, 1.45D, 0.0D});
			add(new double[]{0.75D, 1.45D, 0.0D});
		}
	}, "", null, 0, false),
	LocoDieselSW8( EntityLocoDieselSW8.class,  new ModelSW8(), "sw8_", true,new float[] {-1.0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.3D, 1.3D, 0.0D});
		}
	}, "", null, 0, false),
	locoElectricRenfe446Motor(EntityLocoElectricRenfe446Motor.class, new Modelrenfe446end(), "446_", true, new float[] { -1.9F, 0.1F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	passengerRenfe446Coach(EntityPassengerRenfe446Coach.class, new Modelrenfe446middle(), "446_", true, new float[] { -0.3F, 0.1F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	cabooseRenfe446Tail(EntityCabooseRenfe446Tail.class, new Modelrenfe446end(), "446_", true, new float[] { 0.0F, 0.1F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	pch120(EntityLocoElectricPCH120.class, new ModelPCH120Commute(), "pch120commute_", true,new float[] {-1.3F, 0.01F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	pch120Coach(EntityPassengerPCH120Coach.class, new ModelPCH120Car(), "pch120car_", true,new float[] {0F, 0.01F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Class345(EntityElectricClass345.class, new ModelClass345(), "class345", false,new float[] {-1.0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Class345Coach( EntityClass345Coach.class, new ModelClass345Coach(),"class345coach", false, new float[] {0F, 0F, 0F},  new float[] { 0F, 180F, 180F },null, "", 0, null, "", null, 0, false),
	LUengine(EntityElectricLUengine.class, new ModelLUengine(), "lu_engine", false,new float[] {-1.0F, 0.16F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	LUpassenger(EntityLUpassenger.class, new ModelLUpassenger(), "lu_passenger",false,new float[] {0F, 0.16F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	DstockEngine(EntityElectricDstockEngine.class, new ModelDstockEngine(), "D_stock_engine", false,new float[] {-1.0F, 0.16F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	DstockCar(EntityDstockPassenger.class, new ModelDstockPassenger(), "D_stock_passenger",false,new float[] {0F, 0.16F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	passengerPS52SeatCoach(EntityPassengerPS52SeatCoach.class, new ModelPS52SeatCoach(), "PS_lightweight_52seat_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	passengerPSCombine(EntityPassengerPSCombine.class, new ModelPSCombine(), "PS_lightweight_baggage-coach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	passengerPScenterDiner(EntityPassengerPScenterDiner.class, new ModelPScenterDiner(), "PS_lightweight_center_diner_Blue", false, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	passengerPSAnotherDiner(EntityPassengerPSAnotherDiner.class, new ModelPSscrewyoutoomanydiners(), "PS_lightweight_center_diner_2_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	locoElectricRenfe450Motor(EntityLocoElectricRenfe450Motor.class, new Modelrenfe450endA(), "450_loco_", true, new float[] { -1.9F, 0.1F, 0.0F },   new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	passengerRenfe450Coach(EntityPassengerRenfe450Coach.class, new Modelrenfe450middle(), "450_passenger_", true, new float[] { -0.0F, 0.1F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	cabooseRenfe450Tail(EntityCabooseRenfe450Tail.class, new Modelrenfe450endB(), "450_passenger_", true, new float[] { 0.0F, 0.1F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	passengerCD014(EntityPassengerCD014.class, new ModelCD014(), "cd014_", true, new float[] { 0.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	passengerCD914(EntityPassengerCD914.class, new ModelCD914(), "cd914_", true, new float[] { 0.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	passengerCD010(EntityPassengerCD010.class, new ModelCD010(), "cd010_", true, new float[] { 0.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	locoCD814(EntityLocoDieselCD814.class, new ModelCD814(), "cd814_", true, new float[] { -0.8F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	locoCD810(EntityLocoDieselCD810.class, new ModelCD810(), "cd810_", true, new float[] { -0.8F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	VBShay(EntityLocoSteamVBShay2.class, new ModelVertiBoi2(), "vbshay2", false, new float[] { -0.4F, -1.15F, -0.0F }, new float[] { 0F, 0F, 0F }, null, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 0.6D, 1.9D, -0.1D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 0.6D, -0.4D, 0.8D });
			add(new double[] { 0.3D, 2.3D, 0.0D });
		}
	}, 2, true),
	locoSteamClimax2(EntityLocoSteamClimaxNew.class, new ModelClimaxNew(), "climax_Grey", false, new float[] { -0.4F, -1.15F, -0.0F }, new float[] { 0F, 180F, 0F }, null, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 1.55D, 1.6D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.0D, -0.0D, 0.8D });
		}
	}, 2, true),
	freightRoundHopper(EntityFreightRoundHopper.class, new ModelRoundHopper(), "roundedhopper_", true, new float[] { -0F,0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightRibbedHopper(EntityFreightRibbedHopper.class, new ModelRibbedHopper(), "ribbed_hopper_", true, new float[] { -0F,0.1F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	locoSM42(EntityLocoDieselSM42.class, new SM42(), "SM42_", true, new float[] { -2.0F, 0.05F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 0.9D, 1.35D, 0.0D });
		}
	}, "", null, 0, false),
	locoDieselWWCPGP7(EntityLocoDieselWWCPGP7.class, new ModelWWCPGP7(), "GP7_Highood_", true, new float[]{-2f,0.15f,0}, new float[] { 0F, 0F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 1.7D, 1.3D, 0.0D });

			add(new double[] { 0.85D, 1.3D, 0.0D });
		}
	}, "", null, 0, false),
	locoC11(EntityLocoSteamC11.class, new ModellocoC11(), "locoC11", false, new float[] {  -1.5F, 0.2F, 0.0F }, new float[] { 0, 180, 180 }, null, "largesmoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 3.05D, 1.25D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.9D, 0.00D, 0.75D });
		}
	}, 3, true),
	LocoDieselGE44Ton( EntityLocoDieselGE44Ton.class,  new ModelGE44Ton(), "44_ton_", true,new float[] {-1.0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.6D, 1.1D, 0.0D});
			add(new double[]{1.4D, 1.1D, 0.0D});
		}
	}, "", null, 0, false),
	amfleet(EntityPassengerAmfleet.class, new ModelAmfleet(),"amfleet_", true, new float[]{0F, -0.4F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	amfleet2(EntityPassengerAmfleet2.class, new ModelAmfleet2(),"amfleet2_", true, new float[]{0F, -0.4F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	bawx40highcube(EntityFreightBap40highcube.class, new Model40highcube(),"40highcube_", true, new float[]{0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	WoodchipHopper(EntityFreightBapWoodchipHopper.class, new ModelWoodchipHopper(),"woodchiphopper_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	OreJenny(EntityFreightBapOreJenny.class, new ModelOreJenny(),"orejenny_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	MillGondola(EntityFreightBapMillGondola.class, new ModelMillGondola(),"MillGondola_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	MILW40boxcar(EntityFreightBapMILW40boxcar.class, new ModelMILW40boxcar(),"milw40_", true, new float[]{0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Freight60centerbeam(EntityFreightBap60centerbeam.class, new Model60centerbeam(),"60ftcb_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Freight66centerbeam(EntityFreightBap66centerbeam.class, new Model66centerbeam(),"66ftcb_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Freight73centerbeam(EntityFreightBap73centerbeam.class, new Model73centerbeam(),"73ftcb_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PS140(EntityFreightBapPS140.class, new ModelPS140(),"ps140_", true, new float[]{0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PS150(EntityFreightBapPS150.class, new ModelPS150(),"ps150_", true, new float[]{0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PS160(EntityFreightBapPS160.class, new ModelPS160(),"ps160_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	WVcaboose(EntityCabooseBapWVcaboose.class, new ModelWVcaboose(),"wvcaboose_", true, new float[]{0F, 0.1675F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	//OWO60Verticube(EntityFreightBapOWO60Verticube.class, new ModelOWO60Verticube(),"owo60verticube_", true, new float[]{0F, 0.1875F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PEcoach(EntityPassengerBapPEcoach.class, new ModelPEcoach(),"PECoach_", true, new float[]{0F,  0.105F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PEobserve(EntityPassengerBapPEobserve.class, new ModelPEobserve(),"PEObserve_", true, new float[]{0F,  0.105F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	VersaLongi(EntityFreightBapVersaLongi.class, new ModelVersaLongi(),"versa_longi_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	VersaTrans(EntityFreightBapVersaTrans.class, new ModelVersaTrans(),"versa_trans_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	DOT11111000(EntityFreightBapDOT11111000.class, new Model11000DOT111(),"dot11K_", true, new float[]{0F, 0.00F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	DOT11120600(EntityFreightBapDOT11120600.class, new Model20600DOT111(),"dot206K_", true, new float[]{0F, 0.00F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	DOT11129080(EntityFreightBapDOT11129080.class, new Model29080DOT111(),"dot290K_", true, new float[]{0F, 0.00F /*was 0.20F for height*/, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	F7A( EntityLocoDieselBapF7A.class,  new ModelF7A(), "F7A_", true,new float[] {-1.375F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.9375D, 1.3D, 0.0D});
			add(new double[]{0.25D, 1.3D, 0.0D});

		}
	}, "", null, 0, false),
	F7B( EntityLocoDieselBapF7B.class,  new ModelF7B(), "F7B_", true,new float[] {-1.25F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.35D, 1.3D, 0.0D});
			add(new double[]{0.55D, 1.3D, 0.0D});

		}
	}, "", null, 0, false),
	H1044( EntityLocoDieselBapH1044.class,  new ModelH1044(), "FM_H10-44_", true,new float[] {-1.1F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{1.9D, 1.45D, -0.16D});
			add(new double[]{1.9D, 1.45D, 0.16D});
		}
	}, "", null, 0, false),
	locoSteamStarClass(EntityLocoSteamStarClass.class, new ModelStarClass(), "StarLoco", false, new float[] { -0.8F, 0.15F, 0F }, new float[] { 0F, 180F, 180F }, null, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 1.65D, 1.3D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.5D, -0.4D, 0.8D });
		}
	}, 2, true),
	tenderStarClass(EntityTenderStarClass.class, new ModelStarClassTender(), "StarTender", false, new float[] { 0.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	passengerStarCarFat(EntityPassengerStarCarFat.class, new ModelStarCarFat(), "GWRClosed", false, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	passengerStarCarNotFat(EntityPassengerStarCarNotFat.class, new ModelStarCarNotFat(), "GWROpen", false, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	LightCrane(EntityLightCrane.class, new ModelLightCrane(),"lightcrane2_", true, new float[]{0F,0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	BR155(EntityLocoElectricBR155.class, new ModelBR155(), "BR155_", true, new float[] { -1.7F, 0.05F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "",0,null, "", null, 0, false),
	Onion(EntityLocoOnion.class, new ModelOnion(), "Onion_", true, new float[] { -0.7F, 0.1F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 0.6D, 1.5D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.2D, -0.4D, 0.8D });
		}
	}, 2, true),
	OnionTender(EntityTenderOnion.class, new ModelOnionTender(), "Onion_Tender_", true, new float[] { 0.0F, 0.1F, 0.0F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	loco440RFront(EntityLocoElectric440RFront.class, new Model440R_Front(), "440R_", true, new float[] { -1.9F, 0.1F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	passenger440RMid(EntityPassenger440RMid.class, new Model440R_Mid(), "440R_", true, new float[] { -0.0F, 0.1F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	passenger440RRear(EntityPassenger440RRear.class, new Model440R_Back(), "440R_", true, new float[] { 0.0F, 0.1F, 0.0F },   new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	GP13(EntityLocoDieselGP13.class, new ModelGP13(), "gp13_", true, new float[] { -0.8F, -0.47F, 0.0F }, new float[] { 0F, 180F, 0F }, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { -0.2D, 1.2D, 0.0D });
			add(new double[] { 0.45D, 1.2D, 0.0D });
		}
	}, "", null, 0, false),
	DB143(EntityLocoElectricDB143.class, new ModelDB143(), "DB143", false, new float[] { -1.7F, 0.2F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "",0,null, "", null, 0, false),
	tenderPETender(EntityTenderPETender.class, new ModelPE_Tender(), "PETender", false, new float[] { 0.1F, 0.15F, 0.0F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	locoSteamPELoco(EntityLocoSteamPELoco.class, new ModelPE_Loco(), "PELoco", false, new float[] {  -1.5F, 0.15F, 0.0F }, new float[] { 0, 180, 180 }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.1D, 1.4D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.9D, 0.05D, 0.65D });
		}
	}, 2, true),
	BapB23( EntityLocoDieselBapB23.class,  new ModelB23(), "b23_", true,new float[] {-1.7F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	C424( EntityLocoDieselBapC424.class,  new ModelC424(), "c424_", true,new float[] {-1.6F, 0.1F, 0F},  new float[] { 0F, 180F, 180F }, null, "largesmoke", 2,  new ArrayList<double[]>() {
		{
			add(new double[]{1D, 1.65D, 0.0D});
		}
	}, "", null, 0, false),
	C425( EntityLocoDieselBapC425.class,  new ModelC425(), "c425_", true,new float[] {-1.6F, 0.1F, 0F},  new float[] { 0F, 180F, 180F }, null, "largesmoke", 2,  new ArrayList<double[]>() {
		{
			add(new double[]{1D, 1.65D, 0.0D});
		}
	}, "", null, 0, false),
	GP9( EntityLocoDieselBapGP9.class,  new ModelGP9(), "gp9_", true,new float[] {-1.5F, -0.05F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{0.45D, 1.35D, 0.0D});
			add(new double[]{1.25D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	GP7b( EntityLocoDieselBapGP7b.class,  new ModelGP7b(), "bettergp7b_", true,new float[] {-1.5F, -0.05F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{0.45D, 1.35D, 0.0D});
			add(new double[]{1.25D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	GP7u( EntityLocoDieselBapGP7u.class,  new ModelGP7u(), "gp7u_", true,new float[] {-1.5F, -0.05F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{0.45D, 1.35D, 0.0D});
			add(new double[]{1.25D, 1.35D, 0.0D});

		}
	}, "", null, 0, false),
	GP7( EntityLocoDieselBapGP7.class,  new ModelGP7BAP(), "bettergp7_", true,new float[] {-1.5F, -0.05F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{0.45D, 1.35D, 0.0D});
			add(new double[]{1.25D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	GP30( EntityLocoDieselBapGP30.class,  new ModelGP30(), "gp30_", true,new float[] {-1.5F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			//add(new double[]{1.9D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	GP38dash2( EntityLocoDieselBapGP38dash2.class,  new ModelGP38dash2(), "gp38dash2_", true,new float[] {-1.5F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.75D, 1.4D, 0.0D});
			add(new double[]{1.55D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	KOF_III(EntityLocoDieselKof_III.class, new ModelKOF_III(), "KofIII_", true, new float[] { -0.8F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 0.5D, 1.0D, 0.0D });
		}
	}, "", null, 0, false),
	KOF_III_M(EntityLocoDieselKof_III_M.class, new ModelKOF_III_M(), "KofIIIM_", true, new float[] { -0.8F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 0.5D, 1.0D, 0.0D });
		}
	}, "", null, 0, false),
	U36C( EntityLocoDieselBapU36C.class,  new ModelU36C(), "u36c_", true,new float[] {-2.3125F, -0.15F/* -0.13F*/, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			//add(new double[]{0.75D, 1.75D, 0.0D});

		}
	}, "", null, 0, false),
	GP49( EntityLocoDieselBapGP49.class,  new ModelGP49(), "gp49_arr_2807", false,new float[] {-1.5F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	GP15( EntityLocoDieselBapGP15.class,  new ModelBapGP15(), "gp15_bap_", true,new float[] {-1.3F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	spookyGarrattFront(EntityLocoSteamGarrattFront.class, new ModelGarrattFront(), "GarrattTexture", false, new float[] {3.5F, 0.155F, 0.0F },/*position*/  new float[] { 0F, 180F, 180F }, new float[]{1f,1f,1f},/*scale*/ "largesmoke", 20, new ArrayList<double[]>() {
		{
			//add(new double[] { 4.65D, 1.7D, 0.0D });//smoke
		}
	}, "explode", new ArrayList<double[]>() {
		{
			//add(new double[] { 4.2D, -0.4D, 0.8D });//steam
		}
	}, 2, true),
	spookyGarrattRear(EntityLocoSteamGarrattRear.class, new ModelGarrattBack(), "GarrattTexture", false, new float[] {3.25F, 0.155F, 0.0F },/*position*/  new float[] { 0F, 0F, 180F }, new float[]{1f,1f,1f},/*scale*/ "largesmoke", 20, new ArrayList<double[]>() {
		{
			//add(new double[] { 4.65D, 1.7D, 0.0D });//smoke
		}
	}, "explode", new ArrayList<double[]>() {
		{
			//add(new double[] { 4.2D, -0.4D, 0.8D });//steam
		}
	}, 2, true),
	spookyGarrattMid(EntityLocoSteamGarrattMid.class, new ModelGarrattMid(), "GarrattTexture", false, new float[] {-2.25F, 0.155F, 0.0F },/*position*/  new float[] { 0F, 0F, 180F }, new float[]{1f,1f,1f},/*scale*/ "largesmoke", 20, new ArrayList<double[]>() {
		{
			//add(new double[] { 4.65D, 1.7D, 0.0D });//smoke
		}
	}, "explode", new ArrayList<double[]>() {
		{
			//add(new double[] { 4.2D, -0.4D, 0.8D });//steam
		}
	}, 2, true),
	Skook(EntityLocoSteamSkook.class, new ModelSkookum(), "skookum", false, new float[] { -0.0F, -0.0F, -0.0F }, new float[] { 0F, 180F, 180F }, null, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 2.4D, 1.5D, -0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 0.9D, -0.4D, 0.8D });
			add(new double[] { 2.5D, -0.4D, 0.8D });
			add(new double[] { -0.5D, 1.5D, 0.0D });
		}
	}, 2, true),
	SkookTender(EntityTenderSkookTender.class, new ModelSkookumTender(), "skookumtender", false, new float[] {-0.00F, 0.0F, 0F},  new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	EF1(EntityLocoElectricBapEF1.class,  new ModelEF1(), "ef1_", true,new float[] {-1.60F, 0.1875F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	EF1B(EntityLocoElectricBapEF1B.class,  new ModelEF1B(), "ef1b_", true,new float[] {-1.15635F, 0.1875F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	EP1A(EntityLocoElectricBapEP1A.class,  new ModelEP1A(), "ep1a_", true,new float[] {-1.60F, 0.1875F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	SD9(EntityLocoDieselBapSD9.class,  new ModelSD9(), "SD9_", true,new float[] {-1.6F,0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			//add(new double[]{0.8D, 1.4D, 0.0D});
			//add(new double[]{1.6D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	SD40dash2(EntityLocoDieselBapSD40dash2.class,  new ModelSD40dash2(), "sd40_", true,new float[] {-1.9F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			//add(new double[]{2.3D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),
	WWCP40FootBox(EntityFreightWWCP40FootBox.class, new ModelWWCP40FootBox(),"40ft_Boxcar_", true, new float[]{0F, 0.1875F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	//HuskyStackWellcar(EntityFreightBapHuskyStack.class, new ModelHuskyStack(), "huskystack_", true, new float[]{0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	U23B( EntityLocoDieselBapU23B.class,  new ModelU23B(), "U23B_", true,new float[] {-0F, -0.0F, 0F},  null, null, "smoke", 4,  new ArrayList<double[]>() {
		{ }}, "", null, 0, false),
	U18B( EntityLocoDieselBapU18B.class,  new ModelU18B(), "U18B_", true,new float[] {-0F, -0.0F, 0F},  null, null, "smoke", 4,  new ArrayList<double[]>() {
		{ }}, "", null, 0, false),
	hicube60foot(EntityFreightBaphicube60foot.class, new Modelhicube60foot(),"hicube60_", true, new float[]{0F, 0.155F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightBNSFGon(EntityFreightBNSFGon.class, new ModelBNSFGon(), "BNSFMillGon_", true, new float[] { 0.0F, 0.0F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoILMA(EntityLocoElectricILMA.class, new ModelILMA(), "ILMA_", true, new float[] { 0.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	locoILMB(EntityLocoElectricILMB.class, new ModelILMB(), "ILMB_", true, new float[] { 0.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Feve3300Front(EntityLocoElectricFeve3300.class, new Modelfeve3300front(), "feve3300_", true, new float[] { -1.8F, 0.1F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Feve3300Rear(EntityPassengerFeve3300.class, new Modelfeve3300rear(), "feve3300_", true, new float[] { -0.0F, 0.1F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	HH660( EntityLocoDieselBapHH660.class,  new ModelHH660(), "hh600_", true,new float[] {-1F, -0.1F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{2.0D, 1.35D, 0D});
		}
	}, "", null, 0, false),
	Krautt(EntityLocoDieselBapKrautt.class,  new ModelKrautt(), "KM_ML4000_", true,new float[] {0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{ }}, "", null, 0, false),
	BoxMotor(EntityLocoElectricBoxMotor.class, new boxmotor(), "BoxMotorTexture", false, new float[] { -1.8F, 0.1F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Hopper5201(EntityFreightBapHopper5201.class, new ModelHopper5201(), "5201_", true, new float[] { -0F,0.0F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Hopper6260(EntityFreightBapHopper6260.class, new ModelHopper6260(), "6260_", true, new float[] { -0F,0.0F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Skeleton(EntityFreightBapSkeletonLogCar.class, new ModelSkeletonLogCar(), "SkeletonLogCar_", true, new float[] { 0.0F, -0.0F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Shay3Truck(EntityLocoSteamShay3Truck.class,  new ModelShay3Truck(), "3truckShay_", true,new float[] {0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "largesmoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[] { 2.15D, 1.3D, -0.17D });//1.1D
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 0.9D, -0.4D, 0.6D });
			//add(new double[] { 0.6D, 1.1D, 0.0D });
		}
	}, 2, true),
	Shay3TruckTender(EntityTenderShay3Truck.class, new ModelShay3TruckTender(), "3truckShay_", true, new float[] { 0.0F, 0.0F, 0.0F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	Dash840B( EntityLocoDieselBapDash840B.class,  new ModelDash840B(), "dash8_40b_", true,new float[] {-0F, -0.0F, 0F},  null, null, "smoke", 4,  new ArrayList<double[]>() {
		{ }}, "", null, 0, false),
	Class44(EntityLocoDieselClass44.class, new ModelClass44(), "Class44_", true, new float[] { 0F, 0.0F, 0.0F },  new float[] { 0F, 90F, 180F }, null, "largesmoke", 1, new ArrayList<double[]>() {
		{
			add(new double[]{2.3D, 1.6D, 0D});
		}
	}, "", null, 0, false),
	EU07(EntityLocoElectricEU07.class, new EU07Modernised(), "EU07_", true, new float[] { -0F, 0.00F, 0.0F }, new float[] { 0F, 0F, 180F }, new float[]{0.9f,0.9f,0.9f}, "",0,null, "", null, 0, false),
	SW1( EntityLocoDieselBapSW1.class,  new ModelSW1(), "sw1_", true,new float[] {-0.0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {{ }}, "", null, 0, false),
	SW1500( EntityLocoDieselBapSW1500.class,  new ModelSW1500(), "sw1500_", true,new float[] {-0.0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {{ }}, "", null, 0, false),
	GM6C(EntityLocoElectricBapGM6C.class,  new ModelGM6C(), "GM6C_demo", false,new float[] {-0.0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Dash840C( EntityLocoDieselBapDash840C.class,  new ModelDash840C(), "dash8_40c_", true,new float[] {-0F, -0.0F, 0F},  null, null, "smoke", 4,  new ArrayList<double[]>() {
		{ }}, "", null, 0, false),
	SW1200( EntityLocoDieselBapSW1200.class,  new ModelSW1200(), "sw1200_", true,new float[] {-0.0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {{ }}, "", null, 0, false),
	RSD15( EntityLocoDieselBapRSD15.class,  new ModelRSD15(), "RSD15_", true,new float[] {-0.0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {{ }}, "", null, 0, false),
	PSBaggage(EntityFreightPS73Baggage.class, new ModelPS73Baggage(), "PS_Baggage_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	ES44( EntityLocoDieselBapES44.class,  new ModelES44(), "es44_", true,new float[] {-2.2F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.0D, 1.4D, 0.0D});

		}
	}, "", null, 0, false),
	Dash9_44CW( EntityLocoDieselBapDash9_44CW.class,  new ModelDash9_44CW(), "d9-44cw_", true,new float[] {-2.2F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{

		}
	}, "", null, 0, false),
	SD70Mac( EntityLocoDieselBapSD70Mac.class,  new ModelSD70Mac(), "sd70mac_", true,new float[] {-2.1F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {

		{
			add(new double[]{2.35D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),
	Dash840BB( EntityLocoDieselBapDash840BB.class,  new ModelDash840BB(), "dash8_40b_b_", true,new float[] {-0F, -0.0F, 0F},  null, null, "smoke", 4,  new ArrayList<double[]>() {
		{ }}, "", null, 0, false),
	Dash840BW( EntityLocoDieselBapDash840BW.class,  new ModelDash840BW(), "dash8_40bw_", true,new float[] {-0F, -0.0F, 0F},  null, null, "smoke", 4,  new ArrayList<double[]>() {
		{ }}, "", null, 0, false),
	PSBaggage85(EntityFreightPS85Baggage.class, new ModelPS85Baggage(), "PS_lightweight_85_baggage_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Reefer64(EntityFreightBapReefer64Foot.class, new ModelReefer64Foot(),"reefer_64_", true, new float[]{0F, 0.155F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	DH643( EntityLocoDieselBapDH643.class,  new ModelDH643(), "alco_dh423_not_dumb", false,new float[] {-0.0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {{ }}, "", null, 0, false),
	CF7( EntityLocoDieselBapCF7.class,  new ModelCF7Angle(), "cf7angle_", true,new float[] {-0F, -0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	CF7round( EntityLocoDieselBapCF7round.class,  new ModelCF7round(), "cf7round_", true,new float[] {-1.5F, -0.16F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{0.6D, 1.4D, 0.0D});
			add(new double[]{1.1D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	alcoS2( EntityLocoDieselBapAlcoS2.class,  new ModelAlcoS2(), "alcos2_", true,new float[] {0f, 0f, 0f},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{0.7D, 1.3D, -0.18D});
		}
	}, "", null, 0, false),
	NRE3gs21b( EntityLocoDieselBapNRE3gs21b.class,  new ModelNRE3gs21b(), "3gs21b_", true,new float[] {-1.5F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.15D, 1.3D, 0.0D}); //farthest from cab
			add(new double[]{1.05D, 1.3D, 0.0D}); //middle
			add(new double[]{2.0D, 1.3D, 0.0D}); // closest to cab
		}
	}, "", null, 0, false),
	Beep( EntityLocoDieselBapBeep.class,  new ModelBeep(), "atsfbeep", false,new float[] {-0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{1.45D, 1.25D, 0.0D});
			add(new double[]{1.65D, 1.25D, 0.0D});
			add(new double[]{1.05D, 1.25D, 0.0D});
			add(new double[]{1.25D, 1.25D, 0.0D});
		}
	}, "", null, 0, false),
	GP38dash9W( EntityLocoDieselBapGP38dash9W.class,  new ModelGP38dash9W(), "GP38dash9W_Green", false,new float[] {-1.5F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	class158motor(EntityLocoDieselClass158.class, new ModelClass158(), "Class_158_", true, new float[] { -1.9F, 0.15F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "smoke", 2, new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	class158car(EntityClass158Coach.class, new ModelClass158Middle(), "Class_158_Middle_", true, new float[] { -0.0F, 0.15F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	//HBC1C(EntityCabooseBapHBC1C.class, new ModelHBC1C(),"HBC1C_", true, null, null, null, "", 0, null, "", null, 0, false),
	DRGWCaboose(EntityCabooseBapDRGW.class, new ModelDRGW01400Caboose(),"BAP_DRGW_01400_", true, null, null, null, "", 0, null, "", null, 0, false),
	passengerPSSleeper565(EntityPassengerPSSleeper565.class, new ModelPSSleeper565(), "PS_lightweight_5-6-5_sleeper_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	passengerPSSleeper565DRGW(EntityPassengerPSSleeper565DRGW.class, new ModelPSSleeper565DRGW(), "PS_DRGW_lightweight_5-6-5_sleeper", false, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	AlcoPA1( EntityLocoDieselAlcoPA1.class,  new ModelAlcoPA(), "AlcoPA1_", true,new float[] {-1.6F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{}
	}, "", null, 0, false),
	AlcoPB1( EntityLocoDieselAlcoPB1.class,  new ModelAlcoPB(), "AlcoPB1_", true,new float[] {-1.55F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{}
	}, "", null, 0, false),
	EMDE8A( EntityLocoDieselEMDE8A.class,  new ModelEMDE8A(), "EMDE8A_", true,new float[] {-1.85F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{}
	}, "", null, 0, false),

	//tcce4 new stuff
	SNCB_M6( EntityPassengerSNCB_M6.class, new ModelSNCB_M6(),"sncb_m6", false, new float[] {-3.3F, .1F, 0F},  new float[] { 0F, 180F, 180F },null, "", 0, null, "", null, 0, false),
	Class319Engine(EntityElectricClass319.class, new ModelClass319Engine(), "Br_319_", true,new float[] {-1.65F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Class319Middle( EntityPassengerClass319Middle.class, new ModelClass319Middle(),"Br_319_", true, new float[] {0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },null, "", 0, null, "", null, 0, false),
	Class319Panto( EntityPassengerClass319Panto.class, new ModelClass319Panto(),"Br_319_", true, new float[] {0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },null, "", 0, null, "", null, 0, false),
	Class319Tail( EntityPassengerClass319Tail.class, new ModelClass319Engine(), "Br_319_", true, new float[] {0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },null, "", 0, null, "", null, 0, false),
	PSRPOPM(EntityFreightPSRPOPM.class, new ModelPSRPOPM(), "PSRPOPM_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSRPO(EntityFreightPSRPO.class, new ModelPSRPO(), "PSRPO_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	KVB_2300(EntityElectricKVB_2300.class, new ModelKVB_2300(), "kvb_2300_", true,new float[] {-1.25F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	KVB_2300_B( EntityPassengerKVB_2300_B.class, new ModelKVB_2300_B(),"kvb_2300_", true, new float[] {0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },null, "", 0, null, "", null, 0, false),
	BR_MK3_Buffet( EntityPassengerBR_MK3_Buffet.class, new ModelBR_MK3_Buffet(),"BR_Mk3_Buffet_", true, new float[] {0F, 0F, 0F},  new float[] { 0F, 180F, 180F },null, "", 0, null, "", null, 0, false),
	BR_MK3_Coach( EntityPassengerBR_MK3_Coach.class, new ModelBR_MK3_Coach(),"BR_MK3_Coach_", true, new float[] {0F, 0F, 0F},  new float[] { 0F, 180F, 180F },null, "", 0, null, "", null, 0, false),
	BR_MK4_DVT( EntityElectricBR_MK4_DVT.class, new ModelBR_MK4_DVT(),"BR_Mk4_DVT_", true, new float[] {-1.2F, 0F, 0F},  new float[] { 0F, 180F, 180F },null, "", 0, null, "", null, 0, false),
	BR_MK4_Coach( EntityPassengerBR_MK4_Coach.class, new ModelBR_MK4_Coach(),"BR_Mk4_", true, new float[] {0F, 0F, 0F},  new float[] { 0F, 180F, 180F },null, "", 0, null, "", null, 0, false),
	BR_MK4_Buffet( EntityPassengerBR_MK4_Buffet.class, new ModelBR_MK4_Buffet(),"BR_Mk4_Buffet_", true, new float[] {0F, 0F, 0F},  new float[] { 0F, 180F, 180F },null, "", 0, null, "", null, 0, false),
	Class43( EntityLocoDieselClass43.class, new ModelClass43(),"Class_43_", true, new float[] {-0.65F, 0F, 0F},  new float[] { 0F, 180F, 180F },null, "", 0, null, "", null, 0, false),
	Class90( EntityElectricClass90.class, new ModelClass90(),"Class_90_", true, new float[] {-0.55F, 0F, 0F},  new float[] { 0F, 180F, 180F },null, "", 0, null, "", null, 0, false),
	Class91( EntityElectricClass91.class, new ModelClass91(),"Class_91_", true, new float[] {-0.6F, 0F, 0F},  new float[] { 0F, 180F, 180F },null, "", 0, null, "", null, 0, false),
	Class321( EntityElectricClass321.class, new ModelClass321(),"Class_321_", true, new float[] {-2F, 0.155F, 0F},  new float[] { 0F, 180F, 180F },null, "", 0, null, "", null, 0, false),
	Class321Panto( EntityPassengerClass321Panto.class, new ModelClass321_Panto(),"Class_321_Panto_Car_", true, new float[] {0F, 0.155F, 0F},  new float[] { 0F, 180F, 180F },null, "", 0, null, "", null, 0, false),
	Class321Coach( EntityPassengerClass321Coach.class, new ModelClass321Coach(),"Class_321_Trailer_Car_", true, new float[] {0F, 0.155F, 0F},  new float[] { 0F, 180F, 180F },null, "", 0, null, "", null, 0, false),
	passengerMinetrain(EntityPassengerMinetrain.class, new ModelPassengerMinetrain(), "minetrain", false, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),




	;

	private Class<? extends AbstractTrains> entityClass;
	private ModelBase model;
	private String texture;
	private boolean multiTexture;
	private float[] trans;
	private float[] rotate;
	private float[] scale;
	private String smokeType;
	private ArrayList<double[]> smokeFX;
	private String explosionType;
	private ArrayList<double[]> explosionFX;
	private int smokeIterations;
	private int explosionFXIterations;
	private boolean hasSmokeOnSlopes;

	/**
	 * Defines the render @param for a RollingStock
	 *
	 * @param model ModelBase
	 * @param texture String
	 * @param multiTexture boolean
	 * @param trans float[]
	 * @param rotate float[]
	 * @param scale float[]
	 * @param smokeType String
	 * @param smokeFX ArrayList
	 * @param explosionType String
	 * @param explosionFX ArrayList
	 * @see RenderRollingStock
	 */
	RenderEnum(Class<? extends EntityRollingStock> entityClass, ModelBase model, String texture, boolean multiTexture, float[] trans, float[] rotate, float[] scale, String smokeType, int smokeIterations, ArrayList<double[]> smokeFX, String explosionType, ArrayList<double[]> explosionFX, int explosionFXIterations, boolean hasSmokeOnSlopes) {
		this.entityClass = entityClass;
		this.model = model;
		this.texture = texture;
		this.multiTexture = multiTexture;
		this.trans = trans;
		this.rotate = rotate;
		this.scale = scale;
		this.smokeType = smokeType;
		this.smokeFX = smokeFX;
		this.explosionType = explosionType;
		this.explosionFX = explosionFX;
		this.smokeIterations = smokeIterations;
		this.explosionFXIterations = explosionFXIterations;
		this.hasSmokeOnSlopes = hasSmokeOnSlopes;
	}

	public Class<? extends AbstractTrains> getEntityClass() {
		return entityClass;
	}

	public ModelBase getModel() {
		return model;
	}

	public boolean getIsMultiTextured() {
		return multiTexture;
	}

	public boolean hasSmoke() {
		return smokeType.length() > 0;
	}

	public boolean hasSmokeOnSlopes() {
		return hasSmokeOnSlopes;
	}

	public String getSmokeType() {
		return smokeType;
	}

	public ArrayList<double[]> getSmokeFX() {
		return smokeFX;
	}

	public String getExplosionType() {
		return explosionType;
	}

	public boolean hasExplosion() {
		return explosionType.length() > 0;
	}

	public ArrayList<double[]> getExplosionFX() {
		return explosionFX;
	}

	public float[] getTrans() {
		return trans;
	}

	public float[] getRotate() {
		return rotate;
	}

	public float[] getScale() {
		return scale;
	}

	public String getTexture() {
		return texture;
	}

	public int getSmokeIterations() {
		return smokeIterations;
	}

	public int getExplosionFXIterations() {
		return explosionFXIterations;
	}
}
