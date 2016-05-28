package train.common.library;

public enum EnumSoundsFiles {

	chme3_horn("chme3_horn.wav"),
	chme3_run("chme3_run.wav"),
	chme3_idle("chme3_idle.wav"),
	vl10_horn("vl10_horn.wav"),
	vl10_run("vl10_run.wav"),
	vl10_idle("vl10_idle.wav"),
	eu07_horn("eu07_horn.wav"),
	shunter_horn("shunter_horn.wav"),
	tram_horn("tram_horn.wav"),
	gp_horn("gp_horn.wav"),
	steam_horn("steam_horn.wav"),
	steam_run("steam_run.wav"),
	steam_idle("steam_idle.wav"),
	v60_horn("v60_horn.wav"),
	subway_horn("subway_horn.wav"),
	high_speed_horn("high_speed_horn.wav"),
	gp40_2_horn("gp40-2_horn.wav"),
	german_steam_horn("german_steam_horn.wav"),
	american_steam_horn("american_steam_horn.wav"),
	sd70_horn("sd70_horn.wav"),
	british_two_tone("british_two_tone.wav"),
	shay_horn("shay_horn.wav"),
	class62_horn("class62_horn.wav"),
	cd742_horn("742_horn.wav"),
	cd742_engine("742_motor.wav"),
	cd742_engine_slow("742_motor_slow.wav"),
	cd742_engine_fast("742_motor_fast.wav"),
	adler_horn("adler_whistle.wav"),
	adler_run("adler_run.wav");

	private String soundName;

	private EnumSoundsFiles(String soundName) {
		this.soundName = soundName;
	}

	public String getSoundName() {
		return soundName;
	}
}
