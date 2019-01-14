package train.common.core.plugins;

import cpw.mods.fml.common.registry.GameRegistry;
import mods.railcraft.api.crafting.RailcraftCraftingManager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import train.common.core.util.TraincraftUtil;
import train.common.library.ItemIDs;
import train.common.library.Tracks;

import java.util.ArrayList;

public class PluginRailcraft {

	public static void init(){
		registerRecipes();
	}

	private static void registerRecipes(){
		for(Tracks track : Tracks.values()){
			if(track.crafting != null){
				GameRegistry.addRecipe(new ShapedOreRecipe(track.getOutput(), track.crafting));
			}
		}
		GameRegistry.addShapelessRecipe(Tracks.SNOWY_STEEL_TRACK.getOutput(), Tracks.STEEL_TRACK.getTrackSpec().getItem(1), Items.snowball);
		GameRegistry.addShapelessRecipe(Tracks.SNOWY_COPPER_TRACK.getOutput(), Tracks.COPPER_TRACK.getTrackSpec().getItem(1), Items.snowball);
		GameRegistry.addShapelessRecipe(Tracks.VANILLA_SNOWY_TRACK.getOutput(), Blocks.rail, Items.snowball);
		ArrayList<ItemStack> copper = OreDictionary.getOres("ingotCopper");
		if (copper != null && copper.size() >= 0) {
			for(ItemStack aCopper : copper){
				RailcraftCraftingManager.rollingMachine.addRecipe(new ItemStack(ItemIDs.copperRail.item, 8), "XXX", "   ", "XXX", 'X', aCopper);
			}
		}
		ArrayList<ItemStack> steel = OreDictionary.getOres("ingotSteel");
		if (steel != null && steel.size() >= 0) {
			for(ItemStack aSteel : steel){
				RailcraftCraftingManager.rollingMachine.addRecipe(new ItemStack(ItemIDs.steelRail.item, 16), "XXX", "   ", "XXX", 'X', aSteel);
			}
		}
	}

	public enum RailcraftParts{
		COKE("fuel.coke", 0),
		INGOT_STEEL("ingot", 0),
		RAIL_STANDARD("part.rail", 0),
		RAIL_ADVANCED("part.rail", 1),
		RAIL_WOOD("part.rail", 2),
		RAIL_SPEED("part.rail", 3),
		RAIL_REINFORCED("part.rail", 4),
		RAILBED_WOOD("part.railbed", 0),
		RAILBED_STONE("part.railbed", 1);

		public ItemStack stack;
		RailcraftParts(String itemName, int meta){
			this.stack = TraincraftUtil.getItemFromUnlocalizedName("Railcraft:" + itemName, meta);
		}
	}

	// "fuel.coke", "part.ingot.steel", "part.rail.advanced", "part.rail.reinforced", "part.rail.speed", "part.rail.standard", "part.rail.wood", "part.railbed.stone", "part.railbed.wood"

}