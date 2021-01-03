package train.library;

import ebf.tim.entities.GenericRailTransport;
import train.entity.trains.*;
import train.entity.rollingStock.*;

public class TrainRegistry {

    public static GenericRailTransport[] listSteam(){
        return new GenericRailTransport[]{
                new EntityLocoSteam4_4_0(null), new EntityLocoSteamMallardA4(null),
                new EntityLocoSteamHallClass(null), new EntityLocoSteam040VB(null),
                new EntityLocoSteam262T(null), new EntityLocoSteamAdler(null),
                new EntityLocoSteamAlcoSC4(null), new EntityLocoSteamAlice0_4_0(null),
                new EntityLocoSteamBerk765(null), new EntityLocoSteamBerk1225(null),
                new EntityLocoSteamBR01_DB(null), new EntityLocoSteamBR80_DB(null),
                new EntityLocoSteamC41(null), new EntityLocoSteamC41_080(null),
                new EntityLocoSteamC41T(null), new EntityLocoSteamC62Class(null),
                new EntityLocoSteamCherepanov(null), new EntityLocoSteamClimax(null),
                new EntityLocoSteamCoranationClass(null), new EntityLocoSteamD51(null),
                new EntityLocoSteamD51Long(null), new EntityLocoSteamEr_Ussr(null),
                new EntityLocoSteamForneyRed(null), new EntityLocoSteamFowler(null),
                new EntityLocoSteamGLYN042T(null), new EntityLocoSteamGS4(null),
                new EntityLocoSteamHeavy(null), new EntityLocoSteamKingClass(null),
                new EntityLocoSteamLSSP7(null), new EntityLocoSteamMILWClassA(null),
                new EntityLocoSteamMogulBlue(null), new EntityLocoSteamPannier(null),
                new EntityLocoSteamShay(null), new EntityLocoSteamSmall(null),
                new EntityLocoSteamSnowPlow(null), new EntityLocoSteamSouthern1102(null),
                new EntityLocoSteamUSATCUK(null), new EntityLocoSteamUSATCUS(null),
                new EntityLocoSteamVBShay(null)
        };
    }


    public static GenericRailTransport[] listDiesel(){
        return new GenericRailTransport[]{
                new EntityLocoDiesel44TonSwitcher(null), new EntityLocoDieselBamboo(null),
                new EntityLocoDieselCD742(null), new EntityLocoDieselChME3(null),
                new EntityLocoDieselClass66(null), new EntityLocoDieselDD35A(null),
                new EntityLocoDieselDeltic(null), new EntityLocoDieselEMDF3(null),
                new EntityLocoDieselEMDF7(null), new EntityLocoDieselFOLM1(null),
                new EntityLocoDieselGP7Red(null), new EntityLocoDieselIC4_DSB_MG(null),
                new EntityLocoDieselKof_DB(null), new EntityLocoDieselMILW_H1044(null),
                new EntityLocoDieselSD40(null), new EntityLocoDieselSD70(null),
                new EntityLocoDieselShunter(null), new EntityLocoDieselV60_DB(null),
                new EntityLocoDieselWLs40(null)
        };
    }


    public static GenericRailTransport[] listElectric(){
        return new GenericRailTransport[]{
                new EntityLocoElectricBP4(null), new EntityLocoElectricBR185(null),
                new EntityLocoElectricBR_E69(null), new EntityLocoElectricCD151(null),
                new EntityLocoElectricClass85(null), new EntityLocoElectricE10_DB(null),
                new EntityLocoElectricE103(null), new EntityLocoElectricHighSpeedZeroED(null),
                new EntityLocoElectricICE1(null), new EntityLocoElectricMinetrain(null),
                new EntityLocoElectricTramNY(null), new EntityLocoElectricTramWood(null),
                new EntityLocoElectricVL10(null)
        };
    }


    public static GenericRailTransport[] listPassenger(){
        return new GenericRailTransport[]{
                new EntityPassenger2(null), new EntityPassenger5(null),
                new EntityPassenger7(null), new EntityPassenger_1class_DB(null),
                new EntityPassenger_2class_DB(null), new EntityPassengerAdler(null),
                new EntityPassengerBamboo(null), new EntityPassengerBlue(null),
                new EntityPassengerDBOriental(null), new EntityPassengerDenverRioGrande(null),
                new EntityPassengerDenverRioGrandeCombo(null), new EntityPassengerGS4(null),
                new EntityPassengerGS4_Observatory(null), new EntityPassengerGS4_Tail(null),
                new EntityPassengerHighSpeedCarZeroED(null), new EntityPassengerICE_1class(null),
                new EntityPassengerICE_2class(null), new EntityPassengerICE_Restaurant(null),
                new EntityPassengerMILW(null), new EntityPassengerMILWTail(null),
                new EntityPassengerRheingold(null), new EntityPassengerRheingoldDining1(null),
                new EntityPassengerRheingoldDining2(null), new EntityPassengerRheingoldPanorama(null),
                new EntityPassengerTramNY(null), new PassengerIC4_DSB_FG(null),
                new PassengerIC4_DSB_FH(null)
        };
    }

    public static GenericRailTransport[] listFreight(){
        return new GenericRailTransport[]{
                new EntityBoxCartUS(null), new EntityBoxCartPRR(null),
                new EntityBulkheadFlatCart(null), new EntityFlatCar_DB(null),
                new EntityFlatCarLogs_DB(null), new EntityFlatCarRails_DB(null),
                new EntityFlatCart(null), new EntityFlatCartSU(null),
                new EntityFlatCartUS(null), new EntityFlatCartWoodUS(null),
                new EntityFreight100TonHopper(null), new EntityFreightASTFAutorack(null),
                new EntityFreightBaggageMILW(null), new EntityFreightBamboo(null),
                new EntityFreightCart(null), new EntityFreightCart2(null),
                new EntityFreightCartL(null), new EntityFreightCartSmall(null),
                new EntityFreightCartUS(null), new EntityFreightCenterbeam_Empty(null),
                new EntityFreightCenterbeam_Wood_1(null), new EntityFreightCenterbeam_Wood_2(null),
                new EntityFreightClosed(null), new EntityFreightDenverRioGrande(null),
                new EntityFreightDepressedFlatbed(null), new EntityFreightGermanPost(null),
                new EntityFreightGondola_DB(null), new EntityFreightGrain(null),
                new EntityFreightGS4_Baggage(null), new EntityFreightGTNG(null),
                new EntityFreightHeavyweight(null), new EntityFreightHeavyweightBaggage(null),
                new EntityFreightHopperUS(null), new EntityFreightIceWagon(null),
                new EntityFreightKClassRailBox(null), new EntityFreightLongCoveredHopper(null),
                new EntityFreightMinetrain(null), new EntityFreightOpen2(null),
                new EntityFreightOpenWagon(null), new EntityFreightShortCoveredHopper(null),
                new EntityFreightSlateWagon(null), new EntityFreightTrailer(null),
                new EntityFreightWagenDB(null), new EntityFreightWellcar(null),
                new EntityFreightWood(null), new EntityFreightWood2(null),
                new EntityMailWagen_DB(null)

        };
    }


    public static GenericRailTransport[] listWorkCart(){
        return new GenericRailTransport[]{
                new EntityCaboose(null), new EntityCaboose3(null),
                new EntityCabooseLogging(null), new EntityCabooseLoggingPRR(null),
                new EntityCabooseWorkCart(null), new EntityGWRBrakeVan(null),
                new EntityWorkCart(null)
        };
    }

    public static GenericRailTransport[] listTender(){
        return new GenericRailTransport[]{
                new EntityTender4_4_0(null), new EntityTender4000(null),
                new EntityTender_C41(null), new EntityTender_Southern1102(null),
                new EntityTenderA4(null), new EntityTenderAdler(null),
                new EntityTenderBerk1225(null), new EntityTenderBR01_DB(null),
                new EntityTenderC62Class(null), new EntityTenderCoranationClass(null),
                new EntityTenderD51(null), new EntityTenderEr_Ussr(null),
                new EntityTenderFowler4F(null), new EntityTenderGS4(null),
                new EntityTenderHeavy(null), new EntityTenderMILW(null),
                new EntityTenderSmall(null)
        };
    }

    public static GenericRailTransport[] listTanker(){
        return new GenericRailTransport[]{
                new EntityTankLava(null), new EntityTankWagon(null),
                new EntityTankWagon2(null), new EntityTankWagon_DB(null),
                new EntityTankWagonThreeDome(null), new EntityTankWagonUS(null)
        };
    }


    public static GenericRailTransport[] listSpecial(){
        return new GenericRailTransport[]{
                new EntityBUnitDD35(null), new EntityBUnitEMDF3(null),
                new EntityBUnitEMDF7(null),

                new EntityPropagandaBritain(null),
                new EntityPropagandaJapan(null), new EntityPropagandaUS(null),
                new EntityPropagandaUSSR(null),

                new EntityStockCar(null), new EntityStockCarDRWG(null)
        };
    }
}
