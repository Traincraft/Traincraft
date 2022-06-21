/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal & DV8FromTheWorld. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal & DV8FromTheWorld
 ******************************************************************************/

package train.common.core.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import train.common.library.AchievementIDs;
import train.common.library.BlockIDs;
import train.common.library.ItemIDs;

public class AchievementHandler {

	public static AchievementPage tmPage;
	
	private static Achievement achievement(String name, int column, int row, Block block, Achievement parent) {
		return achievement(name, column, row, new ItemStack(block), parent);
	}
	
	private static Achievement achievement(String name, int column, int row, Item item, Achievement parent) {
		return achievement(name, column, row, new ItemStack(item), parent);
	}
	
	private static Achievement achievement(String name, int column, int row, ItemStack stack, Achievement parent) {
		Achievement result = new Achievement("achievement.tc." + name, "tc:" + name, column, row, stack, parent);
		if(stack == null) {
			result.initIndependentStat();
		}
		return result.registerStat();
	}

	public static void load() {
		AchievementIDs.trainWB.achievement = achievement("trainWB", 0, 0, BlockIDs.trainWorkbench.block, null);
		AchievementIDs.woodenParts.achievement = achievement("woodenParts", -2, 2, ItemIDs.woodenBogie.item, AchievementIDs.trainWB.achievement);
		AchievementIDs.ironParts.achievement = achievement("ironParts", 0, 2, ItemIDs.ironBogie.item, AchievementIDs.trainWB.achievement);
		AchievementIDs.steelParts.achievement = achievement("steelParts", 2, 2, ItemIDs.bogie.item, AchievementIDs.trainWB.achievement);
		AchievementIDs.firebox.achievement = achievement("firebox", 0, 4, ItemIDs.firebox.item, AchievementIDs.ironParts.achievement);
		AchievementIDs.zeppelin.achievement = achievement("zeppelin", 2, 4, ItemIDs.airship.item, AchievementIDs.firebox.achievement);
		AchievementIDs.smallSteam.achievement = achievement("smallSteam", -2, 6, ItemIDs.minecartLoco3.item, AchievementIDs.firebox.achievement);
		AchievementIDs.normalSteam.achievement = achievement("normalSteam", 0, 6, ItemIDs.minecartPower.item, AchievementIDs.firebox.achievement);
		AchievementIDs.heavySteam.achievement = achievement("heavySteam", 2, 6, ItemIDs.minecartHeavySteam.item, AchievementIDs.firebox.achievement);
		//TODO put it back once Heavy Steam is back

		AchievementIDs.openHearth.achievement = achievement("openHearth", -4, 0, BlockIDs.openFurnaceActive.block, null);
		AchievementIDs.steel.achievement = achievement("steel", -4, 2, ItemIDs.steel.item, AchievementIDs.openHearth.achievement);
		AchievementIDs.stake.achievement = achievement("stake", -4, 4, ItemIDs.stake.item, AchievementIDs.steel.achievement);
		AchievementIDs.dieselEngine.achievement = achievement("dieselEngine", -6, 4, ItemIDs.dieselengine.item, AchievementIDs.steel.achievement);
		AchievementIDs.diesel.achievement = achievement("dieselLoco", -6, 6, ItemIDs.minecartCD742.item, AchievementIDs.dieselEngine.achievement);

		AchievementIDs.distilationTower.achievement = achievement("distilationTower", -10, 0, BlockIDs.distilActive.block,null);
		AchievementIDs.dieselFuel.achievement = achievement("dieselFuel", -8, 2, ItemIDs.diesel.item, AchievementIDs.distilationTower.achievement);
		AchievementIDs.plastic.achievement = achievement("plastic", -12, 2, ItemIDs.rawPlastic.item, AchievementIDs.distilationTower.achievement);
		AchievementIDs.fineCopperWire.achievement = achievement("fineCopperWire", -12, 4, ItemIDs.copperWireFine.item, AchievementIDs.plastic.achievement);
		AchievementIDs.electronicCircuit.achievement = achievement("electronicCircuit", -12, 6, ItemIDs.electronicCircuit.item, AchievementIDs.fineCopperWire.achievement);
		AchievementIDs.generator.achievement = achievement("generator", -14, 8, ItemIDs.generator.item, AchievementIDs.electronicCircuit.achievement);
		AchievementIDs.electMotor.achievement = achievement("electMotor", -10, 8, ItemIDs.electmotor.item, AchievementIDs.electronicCircuit.achievement);
		AchievementIDs.tram.achievement = achievement("tram", -12, 10, ItemIDs.minecartTramWood.item, AchievementIDs.electMotor.achievement);
		AchievementIDs.fast.achievement = achievement("fast", -8, 10, ItemIDs.minecartVL10.item, AchievementIDs.electMotor.achievement);

		AchievementIDs.engineer.achievement = achievement("engineer", -2, -2, ItemIDs.overalls.item, null);

		AchievementIDs.assemblyTable.achievement = achievement("assemblyTable", 6, 0, BlockIDs.assemblyTableI.block, null);
		AchievementIDs.passenger.achievement = achievement("passenger", 5, 2, ItemIDs.minecartPassenger2.item, AchievementIDs.assemblyTable.achievement);
		AchievementIDs.freight.achievement = achievement("freight", 7, 2, ItemIDs.minecartChest.item, AchievementIDs.assemblyTable.achievement);
		AchievementIDs.liquid.achievement = achievement("liquid", 5, 4, ItemIDs.minecartWatertransp.item, AchievementIDs.assemblyTable.achievement);
		AchievementIDs.tender.achievement = achievement("tender", 7, 4, ItemIDs.minecartTender.item, AchievementIDs.assemblyTable.achievement);
		AchievementIDs.workCart.achievement = achievement("workCart", 5, 6, ItemIDs.minecartWork.item, AchievementIDs.assemblyTable.achievement).setSpecial();
		AchievementIDs.builder.achievement = achievement("builder", 7, 6, ItemIDs.minecartBuilder.item, AchievementIDs.assemblyTable.achievement);
		AchievementIDs.jukebox.achievement = achievement("jukebox", 5, 8, ItemIDs.minecartJukeBoxCart.item,
				AchievementIDs.assemblyTable.achievement).setSpecial();
		AchievementIDs.minetrain.achievement = achievement("minetrain", 7, 8, ItemIDs.minecartMineTrain.item, AchievementIDs.assemblyTable.achievement);
		AchievementIDs.cherepanov.achievement = achievement("cherepanov", 5, 10, ItemIDs.minecartLocoCherepanov.item, AchievementIDs.assemblyTable.achievement);
		AchievementIDs.mail.achievement = achievement("mail", 7, 10, ItemIDs.minecartMailWagon_DB.item, AchievementIDs.assemblyTable.achievement);
		AchievementIDs.stockCar.achievement = achievement("stockcar", 5, 12, ItemIDs.minecartStockCar.item, AchievementIDs.assemblyTable.achievement);
		AchievementIDs.caboose.achievement = achievement("caboose", 7, 12, ItemIDs.minecartCaboose.item, AchievementIDs.assemblyTable.achievement);
		AchievementIDs.flatCart.achievement = achievement("flatCart", 5, 14, ItemIDs.minecartFlatCartRail_DB.item, AchievementIDs.assemblyTable.achievement);
		AchievementIDs.mtg.achievement = achievement("mtg",-14,10,ItemIDs.minecartLUengine.item, AchievementIDs.tram.achievement);
		AchievementIDs.massTransit.achievement = achievement("massTransit", -14, 12, ItemIDs.minecartClass345car.item, AchievementIDs.mtg.achievement);
		AchievementIDs.cercanias.achievement = achievement("cercanias", -16, 10, ItemIDs.minecartLocoRenfe446Motor.item, AchievementIDs.mtg.achievement);

		AchievementIDs.geared.achievement = achievement("geared", 0, 8, ItemIDs.minecartVBShay2.item, AchievementIDs.normalSteam.achievement);
		AchievementIDs.powerful.achievement = achievement("powerful", -8, 5, ItemIDs.minecartLocoDD35A.item, AchievementIDs.dieselEngine.achievement);
		AchievementIDs.switchin.achievement = achievement("switchin", -8, 3, ItemIDs.minecartLocoSW8.item, AchievementIDs.dieselEngine.achievement);



		//TODO put this: AchievementIDs.heavySteam.achievement  back once Heavy Steam is back
		Achievement ach[] = new Achievement[] { AchievementIDs.steel.achievement, AchievementIDs.stake.achievement,
				AchievementIDs.dieselFuel.achievement, AchievementIDs.electMotor.achievement,
				AchievementIDs.dieselEngine.achievement, AchievementIDs.firebox.achievement,
				AchievementIDs.zeppelin.achievement, AchievementIDs.smallSteam.achievement,
				AchievementIDs.normalSteam.achievement, AchievementIDs.passenger.achievement,
				AchievementIDs.freight.achievement, AchievementIDs.liquid.achievement,
				AchievementIDs.tender.achievement, AchievementIDs.diesel.achievement, AchievementIDs.tram.achievement,
				AchievementIDs.fast.achievement, AchievementIDs.workCart.achievement,
				AchievementIDs.builder.achievement, AchievementIDs.openHearth.achievement,
				AchievementIDs.engineer.achievement, AchievementIDs.distilationTower.achievement,
				AchievementIDs.plastic.achievement, AchievementIDs.fineCopperWire.achievement,
				AchievementIDs.electronicCircuit.achievement, AchievementIDs.generator.achievement,
				AchievementIDs.woodenParts.achievement, AchievementIDs.ironParts.achievement,
				AchievementIDs.steelParts.achievement, AchievementIDs.trainWB.achievement,
				AchievementIDs.assemblyTable.achievement, AchievementIDs.mail.achievement,
				AchievementIDs.minetrain.achievement, AchievementIDs.cherepanov.achievement,
				AchievementIDs.flatCart.achievement, AchievementIDs.stockCar.achievement,
				AchievementIDs.caboose.achievement, AchievementIDs.mtg.achievement,
				AchievementIDs.massTransit.achievement, AchievementIDs.cercanias.achievement,
				AchievementIDs.powerful.achievement, AchievementIDs.switchin.achievement,
				AchievementIDs.heavySteam.achievement,AchievementIDs.jukebox.achievement, AchievementIDs.geared.achievement};

		tmPage = new AchievementPage("TrainCraft", ach);

	}
}