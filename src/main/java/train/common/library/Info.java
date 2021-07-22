/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.library;

public class Info {

	/* Mod relevant information */
	public static final String modID = "tc";
	public static final String modName = "Traincraft";
	public static final String		modVersion				= "@VERSION1@";
	public static final String channel = "Traincraft";
	public static final String keyChannel = "TraincraftKey";
	public static final String rotationChannel = "TCRotation";

	/* Localization keys for versioning */

	/* All the resources for the mod */
	public static final String resourceLocation = "tc";
	public static final String guiPrefix = "textures/gui/";
	public static final String bookPrefix = "textures/gui/book/";
	public static final String trainsPrefix = "textures/trains/";
	public static final String zeppelinTexturePrefix = "textures/zeppelin/";
	public static final String modelPrefix = "tc:models/";//"/src/train/Resources/Models/";
	//public static final String modelPrefix2 = "models/";
	public static final String modelTexPrefix = "textures/models/";
	public static final String armorPrefix = "textures/armor/";
	public static final String villagerPrefix = "textures/villager/";

	public static final String TEX_TIER_I = guiPrefix + "gui_tierI_ironAge.png";
	public static final String TEX_TIER_II = guiPrefix + "gui_tierII_steelAge.png";
	public static final String TEX_TIER_III = guiPrefix + "gui_tierIII_advancedAge.png";

	/* Other variables */
	public static final String[] tooltipsTierI = new String[] { "Planks", "Chimney", "Cab", "Dye", "Component", "Boiler", "Firebox", "Wheels", "Frame", "Coupler" };
	public static final String[] tooltipsTierII = new String[] { "Component", "Chimney", "Cab", "Dye", "Component", "Power", "Engine", "Wheels", "Frame", "Coupler" };
}
