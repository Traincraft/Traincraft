package train.common.library;

import train.common.entity.rollingStock.*;

public enum EnumSounds {

	locoCherepanov(EntityLocoSteamCherepanov.class, "steam_horn", 0.6F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoHeavySteam(EntityLocoSteamHeavy.class, "hancock_3chime", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteam(EntityLocoSteam4_4_0.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoA4(EntityLocoSteamMallardA4.class, "a4_whistle", 0.6F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamBig(EntityLocoSteamHeavy.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamBR01_DB(EntityLocoSteamBR01_DB.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamBR80_DB(EntityLocoSteamBR80_DB.class, "german_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamEr_USSR(EntityLocoSteamEr_Ussr.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamPannier(EntityLocoSteamPannier.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamC41(EntityLocoSteamC41.class, "american_steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamC41080(EntityLocoSteamC41_080.class, "american_steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamfowler(EntityLocoSteamFowler.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamberk765(EntityLocoSteamBerk765.class, "class62_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamberk1225(EntityLocoSteamBerk1225.class, "class62_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamAlcoSC4(EntityLocoSteamAlcoSC4.class, "american_steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamS100UK(EntityLocoSteamUSATCUK.class, "german_steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamS100US(EntityLocoSteamUSATCUS.class, "american_steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamHallClass(EntityLocoSteamHallClass.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamKingClass(EntityLocoSteamKingClass.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamSouthern1102(EntityLocoSteamSouthern1102.class, "american_steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamC41T(EntityLocoSteamC41T.class, "american_steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamForney(EntityLocoSteamForneyRed.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamMogul(EntityLocoSteamMogulBlue.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamSmall(EntityLocoSteamSmall.class, "steam_horn", 0.5F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamShay(EntityLocoSteamShay.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamClass62(EntityLocoSteamC62Class.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamD51S(EntityLocoSteamD51.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamD51L(EntityLocoSteamD51Long.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamSnowPlow(EntityLocoSteamSnowPlow.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamAdler(EntityLocoSteamAdler.class, "adler_whistle", 0.8F, "adler_run", 0.2F, 20, "adler_run", 0.2F, 20,
			true),
	GS4(EntityLocoSteamGS4.class, "american_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	MILWClassA(EntityLocoSteamMILWClassA.class, "american_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoAlice(EntityLocoSteamAlice0_4_0.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20,
			true),
	locoGLYN(EntityLocoSteamGLYN042T.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20,
			true),
	locovb(EntityLocoSteam040VB.class, "adler_whistle", 0.8F, "adler_run", 0.2F, 20, "adler_run", 0.2F, 20, true),
	locosvbShay(EntityLocoSteamVBShay.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	loco262T(EntityLocoSteam262T.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoClimax(EntityLocoSteamClimax.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoCoranationClass(EntityLocoSteamCoranationClass.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run",
			0.4F, 20, true),

	locoVL10(EntityLocoElectricVL10.class, "vl10_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoBR_E69(EntityLocoElectricBR_E69.class, "eu07_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoMineTrain(EntityLocoElectricMinetrain.class, "tram_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoHighSpeed(EntityLocoElectricHighSpeedZeroED.class, "high_speed_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoSubwayNY(EntityLocoElectricTramNY.class, "subway_horn", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoTramWood(EntityLocoElectricTramWood.class, "tram_bell", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoIC4_DSB_MG(EntityLocoDieselIC4_DSB_MG.class, "mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false),
	locoSpeedGrey(EntityLocoElectricNewHighSpeed.class, "high_speed_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	ICE1(EntityLocoElectricICE1.class, "mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false),
	E10(EntityLocoElectricE10_DB.class, "mg_horn", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	locoBR185(EntityLocoElectricBR185.class, "mg_horn", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	locoClass85(EntityLocoElectricClass85.class, "mg_horn", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),

	locoCD742(EntityLocoDieselCD742.class, "742_horn", 0.8F, "742_motor_slow", 0.65F, 40, "742_motor", 0.65F, 40,
			false),
	locoChME3(EntityLocoDieselChME3.class, "chme3_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoGP7Red(EntityLocoDieselGP7Red.class, "gp_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoBP4(EntityLocoElectricBP4.class, "nathan_k5La_3", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoFOLM1(EntityLocoDieselFOLM1.class, "nathan_p01235", 0.8F, "FM_38D_6_Notch8", 0.65F, 40, "FM_38D_6_Idle", 0.65F, 40, false),
	locoKof_DB(EntityLocoDieselKof_DB.class, "chme3_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoSD40(EntityLocoDieselSD40.class, "gp_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoWLs40(EntityLocoDieselWLs40.class, "vl10_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoBamboo(EntityLocoDieselBamboo.class, "gp_horn", 0F, "chme3_idle", 0.2F, 40, "chme3_idle", 0.1F, 40, false),
	locoSD70(EntityLocoDieselSD70.class, "sd70_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoDD35A(EntityLocoDieselDD35A.class, "sd70_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoShunter(EntityLocoDieselShunter.class, "british_two_tone", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoV60_DB(EntityLocoDieselV60_DB.class, "v60_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	loco44tonSwitcher(EntityLocoDiesel44TonSwitcher.class, "v60_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoF7(EntityLocoDieselEMDF7.class, "sd70_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoF3(EntityLocoDieselEMDF3.class, "sd70_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	MILW_H1044(EntityLocoDieselMILW_H1044.class, "eu07_horn", 0.8F, "vl10_idle", 0.65F, 40, "vl10_idle", 0.65F, 40, false),
	locoDeltic(EntityLocoDieselDeltic.class, "british_two_tone", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40,
			false),
	locoClass66(EntityLocoDieselClass66.class, "british_two_tone", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40,
			false),
	locoCD151(EntityLocoElectricCD151.class,"mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false),
	locoLSSP7(EntityLocoSteamLSSP7.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	E103(EntityLocoElectricE103.class, "mg_horn", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),

	//Community Port
	//Not American Stuff
	DieselCD810(EntityLocoDieselCD810.class, "tram_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, true),
	DieselCD814(EntityLocoDieselCD814.class, "tram_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, true),
	DieselClass44(EntityLocoDieselClass44.class, "british_two_tone", 0.8F, "vl10_idle", 0.65F, 40, "vl10_idle", 0.65F, 40, false),
	DieselKOF_III(EntityLocoDieselKof_III.class, "chme3_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	DieselKOF_III_M(EntityLocoDieselKof_III_M.class, "chme3_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	DieselSM42(EntityLocoDieselSM42.class, "sm42_chime", 0.8F, "sm42_run", 0.65F, 40, "sm42_idle", 0.65F, 40, false),
	ElectricClass345(EntityElectricClass345.class, "subway_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	Electric440R(EntityLocoElectric440RFront.class, "446Horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	ElectricBR155(EntityLocoElectricBR155.class, "br155_chime", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	ElectricClass158(EntityLocoDieselClass158.class, "british_two_tone", 0.8F, "mg_run", 0.65F, 40, "mg_idle", 0.65F, 40, false),
	ElectricDB143(EntityLocoElectricDB143.class, "mg_horn", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	ElectricDStockEngine(EntityElectricDstockEngine.class, "dstock_whistle", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	ElectricEU07(EntityLocoElectricEU07.class, "mg_horn", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	ElectricFeve3300(EntityLocoElectricFeve3300.class, "446Horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	ElectricILMA(EntityLocoElectricILMA.class, "subway_horn", 0.8F, "MILW_Notch8", 0.6F, 50, "MILW_Idle", 0.6F, 50, false),
	ElectricILMB(EntityLocoElectricILMB.class, "subway_horn", 0.8F, "MILW_Notch8", 0.6F, 50, "MILW_Idle", 0.6F, 50, false),
	ElectricLUEngine(EntityElectricLUengine.class, "dstock_whistle", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	ElectricPCH120(EntityLocoElectricPCH120.class, "446Horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	ElectricRenfe446Motor(EntityLocoElectricRenfe446Motor.class, "446Horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	ElectricRenfe450Motor(EntityLocoElectricRenfe450Motor.class, "446Horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	SteamC11(EntityLocoSteamC11.class, "class62_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	SteamStarClass(EntityLocoSteamStarClass.class, "adler_whistle", 0.8F, "adler_run", 0.2F, 20, "adler_run", 0.2F, 20, true),



	//American Stuff
	Diesel3GS21B(EntityLocoDieselBapNRE3gs21b.class, "nathan_k3ha", 2.5F, "QSK19C_Notch8", 0.65F, 40, "QSK19C_Idle", 0.65F, 50, true),
	DieselB23(EntityLocoDieselBapB23.class, "nathan_m3h", 2.5F, "GE_7FDL_12_Notch8", 0.65F, 40, "GE_7FDL_12_Idle", 0.65F, 50, true),
	DieselCF7Bap(EntityLocoDieselBapCF7.class, "nathan_k3la_4", 0.65F, "EMD_16_567BC_Notch8", 0.65F, 10, "EMD_16_567BC_Idle", 0.8F, 3, true),
	DieselCF7(EntityLocoDieselCF7.class, "nathan_k3la", 0.65F, "EMD_16_567BC_Notch8", 0.65F, 10, "EMD_16_567BC_Idle", 0.8F, 3, true),
	DieselCF7Round(EntityLocoDieselBapCF7round.class, "leslie_s3lr", 0.65F, "EMD_16_567BC_Notch8", 0.65F, 10, "EMD_16_567BC_Idle", 0.8F, 3, true),
	DieselC424(EntityLocoDieselBapC424.class, "leslie_s3", 2.5F, "ALCO_16_251C_Notch8", 0.5F, 20, "ALCO_16_251C_Idle", 0.5F, 20, false),
	DieselC425(EntityLocoDieselBapC425.class, "leslie_s3l", 2.5F, "ALCO_16_251C_Notch8", 0.5F, 20, "ALCO_16_251C_Idle", 0.5F, 20, false),
	DieselDash840B(EntityLocoDieselBapDash840B.class, "nathan_k3la_4", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 40, "GE_7FDL_16_Idle", 0.65F, 50, true),
	DieselDash840BB(EntityLocoDieselBapDash840BB.class, "Silence", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 40, "GE_7FDL_16_Idle", 0.65F, 50, true),
	DieselDash840BW(EntityLocoDieselBapDash840BW.class, "leslie_s3lr", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 40, "GE_7FDL_16_Idle", 0.65F, 50, true),
	DieselDash840C(EntityLocoDieselBapDash840C.class, "nathan_k5La", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 40, "GE_7FDL_16_Idle", 0.65F, 50, true),
	DieselDash9C44W(EntityLocoDieselBapDash9_44CW.class, "nathan_k3la_4", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 40, "GE_7FDL_16_Idle", 0.65F, 50, true),
	DieselDH643(EntityLocoDieselBapDH643.class, "nathan_p3_2", 2.5F, "ALCO_12_251C_Notch8", 0.5F, 20, "ALCO_12_251C_Idle", 0.5F, 20, false),
	DieselES44(EntityLocoDieselBapES44.class, "nathan_k5hll", 1F, "GE_GEVO_12_Notch8", 0.65F, 20, "GE_GEVO_12_Idle", 0.75F, 50, true),
	DieselF7A(EntityLocoDieselBapF7A.class, "leslie_a200_2", 1F, "EMD_16_567B_Notch8", 0.45F, 15, "EMD_16_567B_Idle", 0.75F, 3, true),
	DieselF7B(EntityLocoDieselBapF7B.class, "Silence", 1F, "EMD_16_567B_Notch8", 0.45F, 15, "EMD_16_567B_Idle", 0.75F, 3, true),
	DieselFOLM1B(EntityLocoDieselFOLM1B.class, "Silence", 0.0F,"FM_38D_6_Notch8", 0.65F, 40, "FM_38D_6_Idle", 0.65F, 40, false),
	DieselGP7(EntityLocoDieselBapGP7.class, "nathan_m5", 1F, "EMD_16_567B_Notch8", 0.9F, 8, "EMD_16_567B_Idle", 0.7F, 50, false),
	DieselGP7wccp(EntityLocoDieselWWCPGP7.class, "gp40_2_horn", 1F, "EMD_16_567B_Notch8", 0.9F, 8, "EMD_16_567B_Idle", 0.7F, 50, false),
	DieselGP7b(EntityLocoDieselBapGP7b.class, "leslie_a200", 1F, "EMD_16_567B_Notch8", 0.9F, 8, "EMD_16_567B_Idle", 0.7F, 50, false),
	DieselGP7u(EntityLocoDieselBapGP7u.class, "nathan_k3la_2", 1F, "EMD_16_567B_Notch8", 0.9F, 8, "EMD_16_567B_Idle", 0.7F, 50, false),
	DieselGP9(EntityLocoDieselBapGP9.class, "nathan_p5", 1F, "EMD_16_567C_Notch8", 0.9F, 8, "EMD_16_567C_Idle", 0.7F, 50, false),
	DieselGP13(EntityLocoDieselGP13.class, "nathan_p6", 0.8F, "EMD_16_645E3_Notch8", 0.65F, 35, "EMD_16_645E3_Idle", 0.65F, 40, false),
	DieselGP15(EntityLocoDieselGP15.class,"nathan_k3ha", 2.5F, "EMD_12_645E_Notch8", 1F, 8, "EMD_12_645E_Idle", 1F, 50, false ),
	DieselGP15Bap(EntityLocoDieselBapGP15.class,"nathan_k3la", 2.5F, "EMD_12_645E_Notch8", 1F, 8, "EMD_12_645E_Idle", 1F, 50, false ),
	DieselGP30(EntityLocoDieselBapGP30.class, "nathan_p5", 0.8F, "EMD_16_567D3_Notch8", 0.65F, 35, "EMD_16_567D3_Idle", 0.65F, 40, false),
	DieselGP38dash2(EntityLocoDieselBapGP38dash2.class, "nathan_k3la_3", 0.8F, "EMD_16_645E_Notch8", 0.65F, 35, "EMD_16_645E_Idle", 0.65F, 40, false),
	DieselGP38dash9W(EntityLocoDieselBapGP38dash9W.class, "nathan_k5la_5", 0.8F, "EMD_16_645E_Notch8", 0.65F, 35, "EMD_16_645E_Idle", 0.65F, 40, false),
	DieselGP49(EntityLocoDieselBapGP49.class,"nathan_p3_3", 2.5F, "EMD_12_645E3_Notch8", 1F, 8, "EMD_12_645E3_Idle", 1F, 50, false ),
	DieselGE44Ton(EntityLocoDieselGE44Ton.class, "leslie_a125", 1.0F, "CAT_8_D17000_Notch8", 0.65F, 40, "CAT_8_D17000_Idle", 0.65F, 40, false),
	DieselHH600(EntityLocoDieselBapHH660.class,"leslie_a200", 2.5F, "ALCO_6_531_Notch8", 0.7F, 40, "ALCO_6_531_Notch8", 0.7F, 60, false ),
	DieselH1044(EntityLocoDieselBapH1044.class, "wabco_e2", 10F, "FM_38D_6_Notch8", 0.65F, 40, "FM_38D_6_Notch8", 0.45F, 40, false),
	DieselML4000(EntityLocoDieselBapKrautt.class,"nathan_p3_2", 2.5F, "Maybach_MD870_16_Notch8", 0.7F, 40, "Maybach_MD870_16_Idle", 0.7F, 60, false ),
	DieselRSD15(EntityLocoDieselBapRSD15.class, "leslie_rs5t", 1F, "ALCO_16_251C_Notch8", 0.50F, 40, "ALCO_16_251C_Idle", 0.65F, 40, true),
	DieselS2(EntityLocoDieselBapAlcoS2.class, "leslie_a200", 1F, "ALCO_6_539T_Notch8", 0.50F, 40, "ALCO_6_539T_Idle", 0.65F, 40, true),
	DieselSD9(EntityLocoDieselBapSD9.class, "nathan_m3", 1F, "EMD_16_567C_Notch8", 0.9F, 8, "EMD_16_567C_Idle", 0.7F, 50, false),
	DieselSD40Dash2Bap(EntityLocoDieselBapSD40dash2.class, "leslie_rs3k_2", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 10, "EMD_16_645E3_Idle", 0.8F, 5, true),
	DieselSD70M(EntityLocoDieselBapSD70Mac.class, "nathan_k5la_4", 2F, "EMD_16_710G3B_Notch8", 0.5F, 40, "EMD_16_710G3B_Idle", 0.5F, 20, false),
	DieselSWBLW(EntityLocoDieselBapBeep.class,"leslie_s3lr", 2.5F, "EMD_16_567BC_Idle", 0.7F, 40, "EMD_16_567BC_Notch8", 0.7F, 60, false ),
	DieselSW1(EntityLocoDieselBapSW1.class, "leslie_a200", 0.9F, "EMD_6_567A_Notch8", 0.45F, 40, "EMD_6_567A_Idle", 0.75F, 40, false),
	DieselSW8(EntityLocoDieselSW8.class, "leslie_a200", 0.9F, "EMD_8_567C_Notch8", 0.45F, 40, "EMD_8_567C_Idle", 0.75F, 40, false),
	DieselSW1200(EntityLocoDieselBapSW1200.class, "nathan_p2", 0.65F, "EMD_12_567C_Notch8", 0.65F, 10, "EMD_12_567C_Idle", 0.8F, 3, true),
	DieselSW1500(EntityLocoDieselBapSW1500.class, "nathan_p3", 0.65F, "EMD_12_645E_Notch8", 0.65F, 10, "EMD_12_645E_Idle", 0.8F, 3, true),
	DieselU18B(EntityLocoDieselBapU18B.class, "leslie_s3", 2.5F, "GE_7FDL_8_Notch8", 0.65F, 40, "GE_7FDL_8_Idle", 0.65F, 50, true),
	DieselU23B(EntityLocoDieselBapU23B.class, "leslie_s3l", 2.5F, "GE_7FDL_12_Notch8", 0.65F, 40, "GE_7FDL_12_Idle", 0.65F, 50, true),
	DieselU36C(EntityLocoDieselBapU36C.class, "leslie_s3lr", 2.5F, "GE_FDL16_Notch8", 0.5F, 10, "GE_FDL16_Idle", 0.5F, 3, true),
	ElectricGM6C(EntityLocoElectricBapGM6C.class, "nathan_p01235", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, true),
	ElectricEF1(EntityLocoElectricBapEF1.class, "wabco_e2", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, true),
	ElectricEF1B(EntityLocoElectricBapEF1B.class, "Silence", 0, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, true),
	ElectricEP1A(EntityLocoElectricBapEP1A.class, "wabco_e2", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, true),
	SteamClimax(EntityLocoSteamClimaxNew.class, "lukenhimer_3chime", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	SteamOnion(EntityLocoOnion.class, "hancock_3chime", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	SteamPE(EntityLocoSteamPELoco.class, "pe_chime", 0.8F, "pe_run", 0.2F, 20, "pe_idle", 0.2F, 20, true),
	SteamVBShay(EntityLocoSteamVBShay2.class, "crosby_3chime", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	SteamSkookum(EntityLocoSteamSkook.class,"skookum_whistle", 1F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	SteamShay3Truck(EntityLocoSteamShay3Truck.class, "lukenhimer_3chime", 1F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	DieselEMDE8A(EntityLocoDieselEMDE8A.class, "leslie_a200_2", 1F, "EMD_12_567B_Notch8", 0.45F, 15, "EMD_16_567B_Idle", 0.75F, 3, true),
	DieselAlcoPA1(EntityLocoDieselAlcoPA1.class, "leslie_a200_2", 1F, "ALCO_16_244_Notch8", 0.25F, 40, "ALCO_16_244_Idle", 0.4F, 40, true),
	DieselAlcoPB1(EntityLocoDieselAlcoPB1.class, "wabco_e2", 2.5F,  "ALCO_16_244_Notch8", 0.25F, 40, "ALCO_16_244_Idle", 0.4F, 40, true),


	Class43(EntityLocoDieselClass43.class, "british_two_tone", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	Class90(EntityElectricClass90.class, "mg_horn", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	Class91(EntityElectricClass91.class, "mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false),
	Class321(EntityElectricClass321.class, "mg_horn", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	Class319Engine(EntityElectricClass319.class, "mg_horn", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),



	//Storage (Touch When Needed)
	/*
	DieselC415H(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC415H.class, "nathan_p14r2", 0.65F, "ALCO_8_251F_Notch8", 0.65F, 10, "ALCO_8_251F_Idle", 0.8F, 3, true),
	DieselC415L(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC415L.class, "leslie_s3lr", 0.65F, "ALCO_8_251F_Notch8", 0.65F, 10, "ALCO_8_251F_Idle", 0.8F, 3, true),
	DieselC415S(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC415S.class, "leslie_s3lr", 0.65F, "ALCO_8_251F_Notch8", 0.65F, 10, "ALCO_8_251F_Idle", 0.8F, 3, true),
	DieselVO1000(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselVO1000.class,"wabco_e2", 2.5F, "Baldwin_8VO_Notch8", 1F, 8, "Baldwin_8VO_Idle", 1F, 50, false ),
	DieselCF7R(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselCF7R.class, "nathan_p012", 0.85F, "EMD_12_645E_Notch8", 0.65F, 10, "EMD_12_645E_Idle", 0.8F, 3, true),
	DieselF3A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF3A.class, "leslie_a200_2", 1F, "EMD_16_567B_Notch8", 0.45F, 15, "EMD_16_567B_Idle", 0.75F, 3, true),
	DieselE8B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselE8B.class, "leslie_a200_2", 1F, "EMD_12_567B_Notch8", 0.45F, 15, "EMD_16_567B_Idle", 0.75F, 3, true),
	DieselE9A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselE9A.class, "leslie_a200_2", 1F, "EMD_12_567C_Notch8", 0.45F, 15, "EMD_16_567C_Idle", 0.75F, 3, true),
	DieselE9B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselE9B.class, "leslie", 1F, "EMD_12_567C_Notch8", 0.45F, 15, "EMD_16_567C_Idle", 0.75F, 3, true),
	DieselF45(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF45.class,"leslie_s3", 2.5F, "EMD_20_645E3_Notch8", 1F, 8, "EMD_20_645E3_Idle", 1F, 50, false ),
	DieselFP45(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFP45.class,"leslie_rs5t", 2.5F, "EMD_20_645E3_Notch8", 1F, 8, "EMD_20_645E3_Idle", 1F, 50, false ),
	DieselMP15DCW9(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselMP15DCW9.class,"leslie_rs3j", 2.5F, "EMD_12_645E_Notch8", 1F, 8, "EMD_12_645E_Idle", 1F, 50, false ),
	DieselSD9(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD9.class, "nathan_m3", 2.5F, "EMD_16_567C_Notch8", 0.45F, 10, "EMD_16_567C_Idle", 0.75F, 3, true),
	DieselSD40Tdash2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD40T2.class, "nathan_p3", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 10, "EMD_16_645E3_Idle", 0.8F, 5, true),
	DieselSD45dash2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD45dash2.class, "leslie_rs5t", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 10, "EMD_16_645E3_Idle", 0.65F, 3, true),
	DieselSD45dash2B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD45dash2B.class, " ", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 10, "EMD_16_645E3_Idle", 0.65F, 3, false),
	DieselSDL39(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSDL39.class, "nathan_m3", 2F, "EMD_12_645E3_Notch8", 0.65F, 10, "EMD_12_645E3_Idle", 0.65F, 3, true),
	DieselSDP40F(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSDP40F.class, "leslie_sl4t", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 10, "EMD_16_645E3_Idle", 0.8F, 5, false),
	DieselSF30C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSF30C.class, "leslie_s3lr", 2.5F, "GE_FDL16_Notch8", 0.5F, 10, "GE_FDL16_Idle", 0.5F, 3, true),
	DieselBoxcab23Ton(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselBoxcab23Ton.class, "wabco_e2", 10F, "GE_HBI_600_Notch8", 0.5F, 15, "GE_HBI_600_Idle", 0.5F, 25, false),
	ElectricClass345(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricClass345.class, "br_horn", 1F, "mg_run", 0.9F, 8, "mg_idle", 0.7F, 50, false),
	TF2_Bombcart(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.BombCart.class, "", 1.5F, "bombcart_run", 1F, 60, "", 0.2F, 20, false),
	Dieselgtavthing(com.jcirmodelsquad.tcjcir.vehicles.locomotives.Dieselgtavthing.class,"leslie_s3l", 1F, "EMD_16_567D3_Notch8", 0.9F, 8, "EMD_16_567D3_Idle", 0.7F, 50, false ),
	DieselHustler(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHustler.class, "wabco3bell", 1F, "Plymouth_V8_Notch8", 0.9F, 8, "Plymouth_V8_Idle", 0.7F, 50, false),
	DieselTGVMobile(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselTGVmobile.class, "truck_horn", 1F, "GE_HBI_600_Notch8", 0.9F, 8, "GE_HBI_600_Idle", 0.7F, 50, false),
	DieselHHGregg(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHHgregg.class,"hhgregg600horn", 2.5F, "hhgregg600_run", 1F, 287, "hhgregg600_idle", 1F, 287, false ),
	Thanos(com.jcirmodelsquad.tcjcir.vehicles.locomotives.Thanos.class, "thanos_horn", 5, "thanos_run", 0.65F, 50, "thanos_idle", 0.65F, 50, false),
	BigMeme(com.jcirmodelsquad.tcjcir.vehicles.locomotives.BigMeme.class, "leslie_a425", 15, "aircompresser", 0.65F, 50, "aircompresser", 0.65F, 50, false),
	 */
	;


	private Class entityClass;
	private String horn;
	private float hornVolume;
	private String run;
	private String idle;
	private float runVolume;
	private float idleVolume;
	private int runSoundLenght;
	private int idleSoundLenght;
	private boolean soundChangeWithSpeed;

	/**
	 * Defines the sounds for the locomotives Many locomotives have the same sound for run and idle
	 * 
	 * @param entityClass
	 * @param horn
	 * @param hornVolume
	 * @param run
	 * @param runVolume
	 * @param runSoundLenght
	 * @param idle
	 * @param idleVolume
	 * @param idleSoundLenght
	 * @param soundChangeWithSpeed
	 */
	private EnumSounds(Class entityClass, String horn, float hornVolume, String run, float runVolume, int runSoundLenght, String idle, float idleVolume, int idleSoundLenght, boolean soundChangeWithSpeed) {
		this.entityClass = entityClass;
		this.horn = horn;
		this.hornVolume = hornVolume;
		this.run = run;
		this.idle = idle;
		this.runVolume = runVolume;
		this.idleVolume = idleVolume;
		this.runSoundLenght = runSoundLenght;
		this.idleSoundLenght = idleSoundLenght;
		this.soundChangeWithSpeed = soundChangeWithSpeed;
	}

	public Class getEntityClass() {
		return entityClass;
	}

	public String getHornString() {
		return horn;
	}

	public String getRunString() {
		return run;
	}

	public String getIdleString() {
		return idle;
	}

	public Float getHornVolume() {
		return hornVolume;
	}

	public Float getRunVolume() {
		return runVolume;
	}

	public Float getIdleVolume() {
		return idleVolume;
	}

	public int getRunSoundLenght() {
		return runSoundLenght;
	}

	public int getIdleSoundLenght() {
		return idleSoundLenght;
	}

	public boolean getSoundChangeWithSpeed() {
		return soundChangeWithSpeed;
	}
}
