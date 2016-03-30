/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal & DV8FromTheWorld. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal & DV8FromTheWorld
 ******************************************************************************/

package src.train.common.core.handlers;

import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import src.train.common.library.AchievementIDs;
import src.train.common.library.BlockIDs;
import src.train.common.library.ItemIDs;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class AchievementHandler {

	public static AchievementPage tmPage;

	public static void load() {
		AchievementIDs.trainWB.achievement = new Achievement(20121, "trainWB", 0, 0, BlockIDs.trainWorkbench.block, (Achievement) null).setIndependent().registerAchievement();
		AchievementIDs.woodenParts.achievement = new Achievement(20129, "woodenParts", -2, 2, ItemIDs.woodenBogie.item, AchievementIDs.trainWB.achievement).registerAchievement();
		AchievementIDs.ironParts.achievement = new Achievement(20130, "ironParts", 0, 2, ItemIDs.ironBogie.item, AchievementIDs.trainWB.achievement).registerAchievement();
		AchievementIDs.steelParts.achievement = new Achievement(20131, "steelParts", 2, 2, ItemIDs.bogie.item, AchievementIDs.trainWB.achievement).registerAchievement();
		AchievementIDs.firebox.achievement = new Achievement(20116, "firebox", 0, 4, ItemIDs.firebox.item, AchievementIDs.ironParts.achievement).registerAchievement();
		AchievementIDs.zeppelin.achievement = new Achievement(20117, "zeppelin", 2, 4, ItemIDs.airship.item, AchievementIDs.firebox.achievement).registerAchievement();
		AchievementIDs.smallSteam.achievement = new Achievement(20100, "smallSteam", -2, 6, ItemIDs.minecartLoco3.item, AchievementIDs.firebox.achievement).registerAchievement();
		AchievementIDs.normalSteam.achievement = new Achievement(20101, "normalSteam", 0, 6, ItemIDs.minecartPower.item, AchievementIDs.firebox.achievement).registerAchievement();
		//AchievementIDs.heavySteam.achievement = new Achievement(20109, "heavySteam", 2, 6, ItemIDs.minecartHeavySteam.item, AchievementIDs.firebox.achievement).registerAchievement();
		//TODO put it back once Heavy Steam is back

		AchievementIDs.openHearth.achievement = new Achievement(20122, "openHearth", -4, 0, BlockIDs.openFurnaceActive.block, (Achievement) null).setIndependent().registerAchievement();
		AchievementIDs.steel.achievement = new Achievement(20119, "steel", -4, 2, ItemIDs.steel.item, AchievementIDs.openHearth.achievement).registerAchievement();
		AchievementIDs.stake.achievement = new Achievement(20118, "stake", -4, 4, ItemIDs.stake.item, AchievementIDs.steel.achievement).registerAchievement();
		AchievementIDs.dieselEngine.achievement = new Achievement(20115, "dieselEngine", -6, 4, ItemIDs.dieselengine.item, AchievementIDs.steel.achievement).registerAchievement();
		AchievementIDs.diesel.achievement = new Achievement(20106, "dieselLoco", -6, 6, ItemIDs.minecartCD742.item, AchievementIDs.dieselEngine.achievement).registerAchievement();

		AchievementIDs.distilationTower.achievement = new Achievement(20123, "distilationTower", -10, 0, BlockIDs.distilActive.block, (Achievement) null).setIndependent().registerAchievement();
		AchievementIDs.dieselFuel.achievement = new Achievement(20113, "dieselFuel", -8, 2, ItemIDs.diesel.item, AchievementIDs.distilationTower.achievement).registerAchievement();
		AchievementIDs.plastic.achievement = new Achievement(20124, "plastic", -12, 2, ItemIDs.rawPlastic.item, AchievementIDs.distilationTower.achievement).registerAchievement();
		AchievementIDs.fineCopperWire.achievement = new Achievement(20125, "fineCopperWire", -12, 4, ItemIDs.copperWireFine.item, AchievementIDs.plastic.achievement).registerAchievement();
		AchievementIDs.electronicCircuit.achievement = new Achievement(20126, "electronicCircuit", -12, 6, ItemIDs.electronicCircuit.item, AchievementIDs.fineCopperWire.achievement).registerAchievement();
		AchievementIDs.generator.achievement = new Achievement(20127, "generator", -14, 8, ItemIDs.generator.item, AchievementIDs.electronicCircuit.achievement).registerAchievement();
		AchievementIDs.electMotor.achievement = new Achievement(20114, "electMotor", -10, 8, ItemIDs.electmotor.item, AchievementIDs.electronicCircuit.achievement).registerAchievement();
		AchievementIDs.tram.achievement = new Achievement(20107, "tram", -12, 10, ItemIDs.minecartTramWood.item, AchievementIDs.electMotor.achievement).registerAchievement();
		AchievementIDs.fast.achievement = new Achievement(20108, "fast", -8, 10, ItemIDs.minecartVL10.item, AchievementIDs.electMotor.achievement).registerAchievement();

		AchievementIDs.engineer.achievement = new Achievement(20128, "engineer", -2, -2, ItemIDs.overalls.item, (Achievement) null).setIndependent().registerAchievement();

		AchievementIDs.assemblyTable.achievement = new Achievement(20132, "assemblyTable", 6, 0, BlockIDs.assemblyTableI.block, (Achievement) null).setIndependent().registerAchievement();
		AchievementIDs.passenger.achievement = new Achievement(20102, "passenger", 5, 2, ItemIDs.minecartPassenger2.item, AchievementIDs.assemblyTable.achievement).registerAchievement();
		AchievementIDs.freight.achievement = new Achievement(20103, "freight", 7, 2, ItemIDs.minecartChest.item, AchievementIDs.assemblyTable.achievement).registerAchievement();
		AchievementIDs.liquid.achievement = new Achievement(20112, "liquid", 5, 4, ItemIDs.minecartWatertransp.item, AchievementIDs.assemblyTable.achievement).registerAchievement();
		AchievementIDs.tender.achievement = new Achievement(20105, "tender", 7, 4, ItemIDs.minecartTender.item, AchievementIDs.assemblyTable.achievement).registerAchievement();
		AchievementIDs.workCart.achievement = new Achievement(20110, "workCart", 5, 6, ItemIDs.minecartWork.item, AchievementIDs.assemblyTable.achievement).registerAchievement().setSpecial();
		AchievementIDs.builder.achievement = new Achievement(20111, "builder", 7, 6, ItemIDs.minecartBuilder.item, AchievementIDs.assemblyTable.achievement).registerAchievement();
		AchievementIDs.jukebox.achievement = new Achievement(20120, "jukebox", 5, 8, ItemIDs.minecartJukeBoxCart.item, AchievementIDs.assemblyTable.achievement).registerAchievement().setSpecial();
		AchievementIDs.minetrain.achievement = new Achievement(20133, "minetrain", 7, 8, ItemIDs.minecartMineTrain.item, AchievementIDs.assemblyTable.achievement).registerAchievement();
		AchievementIDs.cherepanov.achievement = new Achievement(20134, "cherepanov", 5, 10, ItemIDs.minecartLocoCherepanov.item, AchievementIDs.assemblyTable.achievement).registerAchievement();
		AchievementIDs.mail.achievement = new Achievement(20135, "mail", 7, 10, ItemIDs.minecartMailWagon_DB.item, AchievementIDs.assemblyTable.achievement).registerAchievement();
		AchievementIDs.stockCar.achievement = new Achievement(20136, "stockcar", 5, 12, ItemIDs.minecartStockCar.item, AchievementIDs.assemblyTable.achievement).registerAchievement();
		AchievementIDs.caboose.achievement = new Achievement(20137, "caboose", 7, 12, ItemIDs.minecartCaboose.item, AchievementIDs.assemblyTable.achievement).registerAchievement();
		AchievementIDs.flatCart.achievement = new Achievement(20138, "caboose", 5, 14, ItemIDs.minecartFlatCartRail_DB.item, AchievementIDs.assemblyTable.achievement).registerAchievement();
		//TODO put this: AchievementIDs.heavySteam.achievement  back once Heavy Steam is back
		Achievement ach[] = new Achievement[] { AchievementIDs.steel.achievement, AchievementIDs.stake.achievement, AchievementIDs.dieselFuel.achievement, AchievementIDs.electMotor.achievement, AchievementIDs.dieselEngine.achievement, AchievementIDs.firebox.achievement, AchievementIDs.zeppelin.achievement, AchievementIDs.smallSteam.achievement, AchievementIDs.normalSteam.achievement, AchievementIDs.passenger.achievement, AchievementIDs.freight.achievement, AchievementIDs.liquid.achievement, AchievementIDs.tender.achievement, AchievementIDs.diesel.achievement, AchievementIDs.tram.achievement, AchievementIDs.fast.achievement, AchievementIDs.workCart.achievement, AchievementIDs.builder.achievement, AchievementIDs.jukebox.achievement, AchievementIDs.openHearth.achievement, AchievementIDs.engineer.achievement, AchievementIDs.distilationTower.achievement, AchievementIDs.plastic.achievement, AchievementIDs.fineCopperWire.achievement, AchievementIDs.electronicCircuit.achievement, AchievementIDs.generator.achievement, AchievementIDs.woodenParts.achievement, AchievementIDs.ironParts.achievement, AchievementIDs.steelParts.achievement, AchievementIDs.trainWB.achievement, AchievementIDs.assemblyTable.achievement, AchievementIDs.mail.achievement, AchievementIDs.minetrain.achievement, AchievementIDs.cherepanov.achievement, AchievementIDs.flatCart.achievement, AchievementIDs.stockCar.achievement, AchievementIDs.caboose.achievement };

		tmPage = new AchievementPage("TrainCraft", ach);
	}
}