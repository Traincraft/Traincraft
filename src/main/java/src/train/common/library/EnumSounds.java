package src.train.common.library;

import src.train.common.entity.rollingStock.EntityLocoDieselChME3;
import src.train.common.entity.rollingStock.EntityLocoDieselCD742;
import src.train.common.entity.rollingStock.EntityLocoDieselGP7Red;
import src.train.common.entity.rollingStock.EntityLocoDieselKof_DB;
import src.train.common.entity.rollingStock.EntityLocoDieselSD40;
import src.train.common.entity.rollingStock.EntityLocoDieselSD70;
import src.train.common.entity.rollingStock.EntityLocoDieselShunter;
import src.train.common.entity.rollingStock.EntityLocoDieselV60_DB;
import src.train.common.entity.rollingStock.EntityLocoElectricBR_E69;
import src.train.common.entity.rollingStock.EntityLocoElectricHighSpeedZeroED;
import src.train.common.entity.rollingStock.EntityLocoElectricMinetrain;
import src.train.common.entity.rollingStock.EntityLocoElectricNewHighSpeed;
import src.train.common.entity.rollingStock.EntityLocoElectricTramNY;
import src.train.common.entity.rollingStock.EntityLocoElectricTramWood;
import src.train.common.entity.rollingStock.EntityLocoElectricVL10;
import src.train.common.entity.rollingStock.EntityLocoSteam4_4_0;
import src.train.common.entity.rollingStock.EntityLocoSteamAdler;
import src.train.common.entity.rollingStock.EntityLocoSteamBR01_DB;
import src.train.common.entity.rollingStock.EntityLocoSteamBR80_DB;
import src.train.common.entity.rollingStock.EntityLocoSteamC62Class;
import src.train.common.entity.rollingStock.EntityLocoSteamCherepanov;
import src.train.common.entity.rollingStock.EntityLocoSteamEr_Ussr;
import src.train.common.entity.rollingStock.EntityLocoSteamForneyRed;
import src.train.common.entity.rollingStock.EntityLocoSteamHeavy;
import src.train.common.entity.rollingStock.EntityLocoSteamMogulBlue;
import src.train.common.entity.rollingStock.EntityLocoSteamShay;
import src.train.common.entity.rollingStock.EntityLocoSteamSmall;

public enum EnumSounds {

	/*chme3_horn("chme3_horn.wav"), chme3_run("chme3_run.wav"), chme3_idle("chme3_idle.wav"), vl10_horn("vl10_horn.wav"), vl10_run("vl10_run.wav"), vl10_idle("vl10_idle.wav"), eu07_horn("eu07_horn.wav"), shunter_horn("shunter_horn.wav"), subway_horn("subway_horn.wav"), gp_horn("gp_horn.wav"), steam_horn("steam_horn.wav"), steam_run("steam_run.wav"), steam_idle("steam_idle.wav") */

	locoCherepanov(EntityLocoSteamCherepanov.class, "steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoHeavySteam(EntityLocoSteamHeavy.class, "steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteam(EntityLocoSteam4_4_0.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamBig(EntityLocoSteamHeavy.class, "steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamBR01_DB(EntityLocoSteamBR01_DB.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamBR80_DB(EntityLocoSteamBR80_DB.class, "german_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamEr_USSR(EntityLocoSteamEr_Ussr.class, "steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamForney(EntityLocoSteamForneyRed.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamMogul(EntityLocoSteamMogulBlue.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamSmall(EntityLocoSteamSmall.class, "steam_horn", 0.5F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamShay(EntityLocoSteamShay.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamClass62(EntityLocoSteamC62Class.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamAdler(EntityLocoSteamAdler.class, "adler_horn", 0.8F, "adler_run", 0.2F, 20, "adler_run", 0.2F, 20, true),

	locoVL10(EntityLocoElectricVL10.class, "vl10_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoBR_E69(EntityLocoElectricBR_E69.class, "eu07_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoMineTrain(EntityLocoElectricMinetrain.class, "tram_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoHighSpeed(EntityLocoElectricHighSpeedZeroED.class, "high_speed_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoSubwayNY(EntityLocoElectricTramNY.class, "subway_horn", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoTramWood(EntityLocoElectricTramWood.class, "tram_horn", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoSpeedGrey(EntityLocoElectricNewHighSpeed.class, "high_speed_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),

	locoCD742(EntityLocoDieselCD742.class, "cd742_horn", 0.8F, "cd742_engine_slow", 0.65F, 40, "cd742_engine", 0.65F, 40, false),
	locoChME3(EntityLocoDieselChME3.class, "chme3_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoGP7Red(EntityLocoDieselGP7Red.class, "gp_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoKof_DB(EntityLocoDieselKof_DB.class, "chme3_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoSD40(EntityLocoDieselSD40.class, "gp_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoSD70(EntityLocoDieselSD70.class, "sd70_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoShunter(EntityLocoDieselShunter.class, "british_two_tone", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoV60_DB(EntityLocoDieselV60_DB.class, "v60_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false);

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
