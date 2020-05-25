/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import traincraft.Traincraft;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

@Mod.EventBusSubscriber(modid = Traincraft.MOD_ID)
public class TCBlocks {

	public static final BlockDistil DISTILLERY = new BlockDistil();
	public static final BlockAssemblyTableI ASSEMBLY_TABLE_I = new BlockAssemblyTableI();
	public static final BlockAssemblyTableII ASSEMBLY_TABLE_II = new BlockAssemblyTableII();
	public static final BlockAssemblyTableIII ASSEMBLY_TABLE_III = new BlockAssemblyTableIII();
	public static final BlockTrainWorkbench TRAIN_WORKBENCH = new BlockTrainWorkbench();
	public static final BlockOpenHearthFurnace OPEN_HEARTH_FURNACE = new BlockOpenHearthFurnace();
	
	public static final BlockWaterWheel WATER_WHEEL = new BlockWaterWheel();
	public static final BlockWindMill WIND_MILL = new BlockWindMill();
	public static final BlockGeneratorDiesel GENERATOR_DIESEL = new BlockGeneratorDiesel();
	
	public static final BlockStopper STOPPER = new BlockStopper();
	public static final BlockSwitchStand SWITCH_STAND = new BlockSwitchStand();
	public static final BlockBridgePillar BRIDGE_PILLAR = new BlockBridgePillar();
	public static final BlockLantern LANTERN = new BlockLantern();
	
	public static final BlockOilSand OIL_SAND = new BlockOilSand();
	public static final BlockPetrolOre PETROL_ORE = new BlockPetrolOre();
	public static final BlockCopperOre COPPER_ORE = new BlockCopperOre();
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event){
		IForgeRegistry<Block> registry = event.getRegistry();
		
		try{
			for(Field field : TCBlocks.class.getDeclaredFields()){
				if(Modifier.isPublic(field.getModifiers()) && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())){
					Object obj = field.get(null);
					if(obj instanceof Block){
						registry.register((Block) obj);
					}
				}
			}
		}catch(IllegalAccessException ignored){}
		
	}
	
	public static void init() {
		//loadBlocks();
		//registerBlocks();
		//setHarvestLevels();
	}

	public static void loadBlocks() {
		//BlockIDs.signal.block = new BlockSignal(BlockIDs.signal.blockID, 16).setHardness(1.7F).setStepSound(Block.soundTypeMetal);
		
		//BlockIDs.tcRail.block = new BlockTCRail().setHardness(1.0F).setStepSound(Block.soundTypeMetal).setCreativeTab(null);
		//BlockIDs.tcRailGag.block = new BlockTCRailGag().setHardness(1.0F).setStepSound(Block.soundTypeMetal).setCreativeTab(null);
		
		/*if (Loader.isModLoaded("ComputerCraft") || Loader.isModLoaded("OpenComputers")) {
			BlockIDs.mtcTransmitterSpeed.block = new BlockInfoTransmitterSpeed(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockTextureName("tc:speedTransmitter").setBlockName("mtcspeedtransmitter").setCreativeTab(Traincraft.tcTab);
			BlockIDs.mtcTransmitterMTC.block = new BlockInfoTransmitterMTC(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockTextureName("tc:mtctransmitter").setBlockName("mtcstatustransmitter").setCreativeTab(Traincraft.tcTab);
			BlockIDs.mtcATOStopTransmitter.block = new BlockATOTransmitterStopPoint(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockTextureName("tc:atostoptransmitter").setBlockName("mtcatostoppointtransmitter").setCreativeTab(Traincraft.tcTab);
			BlockIDs.mtcReceiverMTC.block = new BlockInfoGrabberMTC(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockTextureName("tc:mtcreceiver").setBlockName("mtcstatusreceiver").setCreativeTab(Traincraft.tcTab);
			BlockIDs.mtcReceiverDestination.block = new BlockInfoGrabberDestination(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockTextureName("tc:destinationreceiver").setBlockName("mtcdestinationreceiver").setCreativeTab(Traincraft.tcTab);
			BlockIDs.pdmInstructionBlock.block = new BlockPDMInstructionRadio(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockTextureName("tc:pdmradio").setBlockName("pdmradio").setCreativeTab(Traincraft.tcTab);
		}*/

		//BlockIDs.book.block = new BlockBook(BlockIDs.book.blockID);
	}

	/*public static void registerBlocks() {
		for (BlockIDs blocks : BlockIDs.values()) {
			if(blocks.block != null) {
				blocks.block.setBlockName(Info.modID + ":" + blocks.name());
				if (blocks.hasItemBlock) {
					GameRegistry.registerBlock(blocks.block, blocks.itemBlockClass, blocks.name());
				} else {
					GameRegistry.registerBlock(blocks.block, blocks.name());
				}
			}
		}
	}*/

	public static void setHarvestLevels() {
		//Blocks.rail.setHarvestLevel("ItemStacked", 0);
		//Blocks.detector_rail.setHarvestLevel("ItemStacked", 0);
		//Blocks.golden_rail.setHarvestLevel("ItemStacked", 0);
	}
}