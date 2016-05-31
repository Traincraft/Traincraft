/**
 * Enum containing all tracks
 * 
 * @author Spitfire4466
 * @see PluginRailcraft to register the track and name it
 */
package train.common.library;

import mods.railcraft.api.tracks.TrackRegistry;
import mods.railcraft.api.tracks.TrackSpec;
import train.common.blocks.tracks.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum TrackIDs {
	DETECTOR_FREIGHT(2, "detector.freight", 8, BlockDetectorFreightTrack.class, Arrays.asList("Emits a redstone signal on all","passing Traincraft freight carts")),
	DETECTOR_PASSENGER(2, "detector.passenger", 8, BlockDetectorPassengerTrack.class,Arrays.asList("Emits a redstone signal on all","passing Traincraft passengers carts")),
	DETECTOR_ALL_LOCOMOTIVES(2, "detector.loco", 8, BlockDetectorAllLocomotiveTrack.class,Arrays.asList("Emits a redstone signal on all","passing Traincraft locomotives")),
	DETECTOR_STEAM_LOCOMOTIVES(2, "detector.steam", 8, BlockDetectorSteamLocomotiveTrack.class,Arrays.asList("Emits a redstone signal on all","passing Traincraft steam locomotives")),
	DETECTOR_DIESEL_LOCOMOTIVES(2, "detector.diesel", 8, BlockDetectorDieselLocomotiveTrack.class,Arrays.asList("Emits a redstone signal on all","passing Traincraft diesel locomotives")),
	DETECTOR_TANK_CARTS(2, "detector.tank", 8, BlockDetectorTankCartsTrack.class,Arrays.asList("Emits a redstone signal on all","passing Traincraft tank carts")),
	COUPLER_TRACK(2, "coupler", 8, BlockCouplerTrack.class,Arrays.asList("Will attach any passing rolling stock","(Railcraft carts included) when powered","An unpowered track will detach carts")),
	COPPER_TRACK(2, "copper", 32, BlockCopperTrack.class,Arrays.asList("A cheaper but slower track")),
	STEEL_TRACK(2, "steel", 32, BlockSteelTrack.class,Arrays.asList("A faster track")),
	ANIMAL_BOARDING_TRACK(2, "boarding.animal", 8, BlockAnimalBoardingTrack.class,Arrays.asList("Will put any close animal inside the Stock car")),
	MOB_BOARDING_TRACK(2, "boarding.mob", 8, BlockMobBoardingTrack.class,Arrays.asList("Will put any close mob inside the Stock car")),
	DISEMBARK_TRACK(2, "disembark", 8, BlockDisembarkTrack.class,Arrays.asList("Will disembark anything mounting the Stock cart")),
	ENERGY_TRACK(4, "energy", 16, BlockEnergyTrack.class,Arrays.asList("A track that can transfer power to", "Traincraft electric locomotives","Power it with a redstone power source","See the Traincraft guide for more info")),
	LOCO_SPEED_CONTROLLER(5, "speed.loco", 8, BlockLocomotiveSpeedControllerTrack.class,Arrays.asList("Controls Traincraft locomotive's max speed","Use a crowbar to change the mode")),
	LOCO_HOLDING_TRACK(2, "holding.loco", 8, BlockLocomotiveHoldingTrack.class,Arrays.asList("Unpowered: hold any Traincraft locomotive","Powered: Release the locomotive and launch to its previous speed","Won't boost passing locomotives")),
	STATION_TRACK(8, "station", 8, BlockStationTrack.class,Arrays.asList("Requires redstone power","A track which holds any Traincraft locomotive","as well as any minecart","Track has an internal clock and will activate"," by default every 15s for 5s","Use a crowbar to change the mode")),
	HORN_ALL_LOCOMOTIVES(2, "horn.loco", 8, BlockDetectorHornAllLocomotiveTrack.class,Arrays.asList("Sounds the horn on all","passing Traincraft locomotives")),
	VANILLA_SNOWY_TRACK(2, "snow", 1, BlockVanillaSnowyTrack.class,Arrays.asList("Vanilla track with snow")),
	SNOWY_STEEL_TRACK(2, "snow.steel", 1, BlockSnowySteelTrack.class,Arrays.asList("A faster track with snow")),
	SNOWY_COPPER_TRACK(2, "snow.copper", 1, BlockSnowyCopperTrack.class,Arrays.asList("A cheaper but slower track with snow"));
	

	private final String tag;
	private final int recipeOutput;
	private final int numIcons;
	private final TrackSpec trackSpec;
	private static final List creativeList;

	private TrackIDs(int numIcons, String tag, int recipeOutput, Class track,List<String> tooltip) {
		this.numIcons = numIcons;
		this.tag = tag;
		this.recipeOutput = recipeOutput;

		this.trackSpec = new TrackSpec((short) (ordinal() + 513), getTag(), TrackTextureLoader.INSTANCE, track,tooltip);
		TrackRegistry.registerTrackSpec(this.trackSpec);
	}

	public String getTextureTag() {
		return Info.modID.toLowerCase() + ":tracks/track." + this.tag;
	}

	public int getNumIcons() {
		return this.numIcons;
	}

	public TrackSpec getTrackSpec() {
		return this.trackSpec;
	}

	public static List getCreativeList() {
		return creativeList;
	}

	public String getTag() {
		return "tc.track." + this.tag;
	}

	public int getRecipeOutput() {
		return this.recipeOutput;
	}

	static {
		TrackRegistry.registerIconLoader(TrackTextureLoader.INSTANCE);
		creativeList = new ArrayList();
		creativeList.add(DETECTOR_FREIGHT);
		creativeList.add(DETECTOR_PASSENGER);
		creativeList.add(DETECTOR_ALL_LOCOMOTIVES);
		creativeList.add(DETECTOR_STEAM_LOCOMOTIVES);
		creativeList.add(DETECTOR_DIESEL_LOCOMOTIVES);
		creativeList.add(COUPLER_TRACK);
		creativeList.add(ENERGY_TRACK);
		creativeList.add(DETECTOR_TANK_CARTS);
		creativeList.add(COPPER_TRACK);
		creativeList.add(STEEL_TRACK);
		creativeList.add(ANIMAL_BOARDING_TRACK);
		creativeList.add(MOB_BOARDING_TRACK);
		creativeList.add(DISEMBARK_TRACK);
		creativeList.add(LOCO_SPEED_CONTROLLER);
		creativeList.add(LOCO_HOLDING_TRACK);
		creativeList.add(STATION_TRACK);
		creativeList.add(HORN_ALL_LOCOMOTIVES);
		creativeList.add(VANILLA_SNOWY_TRACK);
		creativeList.add(SNOWY_STEEL_TRACK);
		creativeList.add(SNOWY_COPPER_TRACK);
	}
}