package ebf.tim.utility;


import cofh.api.energy.IEnergyContainerItem;
import cofh.api.energy.IEnergyHandler;
import ebf.tim.TrainsInMotion;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.registry.TiMFluids;
import mods.railcraft.api.electricity.IElectricGrid;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.MathHelper;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

/**
 * <h1>Fuel management for trains</h1>
 * used to process burnHeat addition and consumption.
 *
 * @author Eternal Blue Flame
 */
public class FuelHandler{

	/**the main burnHeat variable used by most trains*/
	public int burnHeat =0;
	private float burnTime =0;
	private float burnTimeMax =0;

	public enum DefaultTanks {
		STEAM(new String[][]{{FluidRegistry.WATER.getName()},{TiMFluids.fluidSteam.getName()}}),
		HEAVY_STEAM(new String[][]{{FluidRegistry.WATER.getName()},{TiMFluids.fluidHeavySteam.getName()}}),
		DIESEL(new String[][]{{TiMFluids.fluidDiesel.getName(), TiMFluids.fluidfueloil.getName()}}),
		ELECTRIC(new String[][]{{TiMFluids.fluidRedstone.getName()}}),
		DIESEL_ELECTRIC(new String[][]{{TiMFluids.fluidDiesel.getName(), TiMFluids.fluidfueloil.getName()}, {TiMFluids.fluidRedstone.getName()}});
		private String[][] t;
		DefaultTanks(String[][] type){this.t = type;}

		public String[][] value(){return t;}

	}


	public float maxHeat(GenericRailTransport transport){
		return transport.getMaxFuel() * 750;
	}

	/**
	 * <h2>check if an item is a usable water source item</h2>
	 * @return if the train can add the water to the boiler or not.
	 * TiM only water items and support for 3rd party/vanilla fuels are managed here
	 *
	 */
	@Deprecated
	public static FluidStack getUseableFluid(ItemStack itemStack, GenericRailTransport transport){
		if(itemStack==null || itemStack.getItem()==null){
			return null;
		}

		if(transport.getTypes().contains(TrainsInMotion.transportTypes.ELECTRIC)) {
			if (itemStack.getItem() == Items.redstone) {
				return new FluidStack(TiMFluids.fluidRedstone, 250);
			} else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.redstone_block)) {
				return new FluidStack(TiMFluids.fluidRedstone, 2250);
			} else if (itemStack.getItem() instanceof IEnergyContainerItem) {
				return new FluidStack(TiMFluids.fluidRedstone, ((IEnergyContainerItem) itemStack.getItem()).extractEnergy(itemStack, 250, true));
			}
		}
		if(transport.getTypes().contains(TrainsInMotion.transportTypes.DIESEL)){
			if(FluidContainerRegistry.getFluidForFilledItem(itemStack)!=null &&
					FluidContainerRegistry.getFluidForFilledItem(itemStack).getUnlocalizedName().toLowerCase().contains("diesel")){
				return new FluidStack(TiMFluids.fluidDiesel,1000);
			}

		}
		if(transport.getTypes().contains(TrainsInMotion.transportTypes.STEAM)){
			if(FluidContainerRegistry.getFluidForFilledItem(itemStack)!=null &&
					FluidContainerRegistry.getFluidForFilledItem(itemStack).getFluid()==FluidRegistry.WATER){
				return new FluidStack(FluidRegistry.WATER,1000);
			}
		}

		if(transport.getTypes().contains(TrainsInMotion.transportTypes.TANKER)){
			return FluidContainerRegistry.getFluidForFilledItem(itemStack);
		}

		return null;
	}

	public static FluidStack getUseableFluid(int slot, GenericRailTransport transport){
		return transport.getSlotIndexByID(slot)==null?null:getUseableFluid(transport.getSlotIndexByID(slot).getStack(),transport);
	}

	//public FluidStack getFluidForSlot(GenericRailTransport train, int slot){
	//	return FluidContainerRegistry.getFluidForFilledItem(train.getSlotIndexByID(slot).getStack());
	//}


    //adds burn times for items that aren't normally registered to minecraft's burnable system.
    public static int itemBurnTime(ItemStackSlot slotId) {
		if(slotId !=null && slotId.getStack() !=null) {
			switch (slotId.getItem().delegate.name()) {

				//case "modid:Item":{ return 20;}
				default:{return TileEntityFurnace.getItemBurnTime(slotId.getStack());}
			}

		}
		return 0;
	}


	/**
	 * <h2>steam management</h2>
	 *
	 * Credit to zodiacmal for the heat calculation.
	 * @param train
	 */
	public void manageSteam(EntityTrainCore train){
		//manage solid burnHeat
		ItemStackSlot slotId=train.getSlotIndexByID(400);
		if (burnTime <1){
			burnTime=0;
			if (slotId != null && itemBurnTime(slotId)>0) {
				burnHeat = (int) (itemBurnTime(slotId) * train.getEfficiency());
				burnTime = MathHelper.ceiling_double_int(burnHeat *0.1);
				burnTimeMax = burnTime;
				if (!train.getBoolean(GenericRailTransport.boolValues.CREATIVE)) {
					train.getSlotIndexByID(400).decrStackSize(1);
				}
			} else {
				burnHeat = 0;
				burnTimeMax = 0;
			}
		} else {
			burnTime--;
		}

		//if there's a fluid item in the slot and the train can consume the entire thing
		if (getUseableFluid(train.waterSlot().getSlotID(),train) !=null &&
				train.fill(null, getUseableFluid(401,train))) {

			train.fill(null, getUseableFluid(train.waterSlot().getSlotID(),train), true);
			if (!train.getBoolean(GenericRailTransport.boolValues.CREATIVE)) {
				train.getSlotIndexByID(train.waterSlot().getSlotID()).decrStackSize(1);
				train.addItem(new ItemStack(Items.bucket));
			}
		}
		//manage boiler heat
		if (burnHeat > 1) {
			//calculate the heat increase
			float heat = train.getDataWatcher().getWatchableObjectFloat(16);
			if(heat==0){heat=1;}
			train.getDataWatcher().updateObject(16,
					(heat+
							(float) ((1f- Math.sqrt(heat/maxHeat(train))) * Math.sqrt((heat+burnHeat)/burnHeat))*train.getEfficiency()));

		} else {//if engine is not running
			float heat = (((train.worldObj.getBiomeGenForCoords(train.chunkCoordX, train.chunkCoordZ).temperature -0.15f)//biome temperature with offset to compensate for freezing point
							- (0.0014166695f * ((float)train.posY - 64f)))//temperature changes by 0.00166667 for every meter above or below sea level (64)
							*0.368f//convert to celsius*0.01
			);

			//cap the heat to the biome temp
			if((heat >0 && train.getDataWatcher().getWatchableObjectFloat(16)>= heat*100)
			|| (heat <0 && train.getDataWatcher().getWatchableObjectFloat(16)<= heat*100)
			){
				train.getDataWatcher().updateObject(16, heat*100);
			} else {
				train.getDataWatcher().updateObject(16, train.getDataWatcher().getWatchableObjectFloat(16)+heat);
			}
		}
		//if the boiler temp is above the boiling point, start generating steam.
		if (train.getDataWatcher().getWatchableObjectFloat(16) >100){
			int steam = (int)Math.floor(
					((train.getDataWatcher().getWatchableObjectFloat(16)-100)*0.005f) * //calculate heat from burnHeat
							(train.getTankInfo(null)[0].fluid.amount*0.005f) //calculate surface area of water
			);
			//drain fluid
			if (train.drain(null, steam!=0?steam/5:0,true)!= null) {
				train.fill(null, new FluidStack(TiMFluids.fluidSteam, (int)(-(Math.abs(train.accelerator) * (train.getTankInfo(null)[1].capacity*0.01f))+steam*0.9f)), true);

				//if no fluid left and not creative mode, explode.
			} else if (!train.getBoolean(GenericRailTransport.boolValues.CREATIVE)){
				train.worldObj.createExplosion(train, train.posX, train.posY, train.posZ, 5f, false);
				train.dropItem(train.getItem(), 1);
				train.setDead();
			}
			train.setBoolean(GenericRailTransport.boolValues.RUNNING, true);
		} else {
			train.setBoolean(GenericRailTransport.boolValues.RUNNING, false);
			train.accelerator=0;
		}

		if (train.getTankInfo(null)[1] !=null && train.getTankInfo(null)[1].fluid.amount >0) {
			//steam is expelled through the pistons to push them back and forth, but even when the accelerator is off, a degree of steam is still escaping.
			train.getTankInfo(null)[1].fluid.amount -= (5 * train.getEfficiency()) * ((train.accelerator) * train.getEfficiency()) * 0.55;
		}

		//update the datawatchers so client can display the info on the GUI.
		train.getDataWatcher().updateObject(13, burnTime>0?(int)((burnTime/ burnTimeMax)*18):0);
		train.getDataWatcher().updateObject(15, MathHelper.floor_float(train.getDataWatcher().getWatchableObjectFloat(16) * 100f));
	}

	public void manageDiesel(EntityTrainCore train){
		manageDieselFuel(train);
	}

    public static void manageDieselFuel(EntityTrainCore train){
        //add fuel to the fuel tank
        if(getUseableFluid(400,train) !=null) {
			if (train.fill(null, getUseableFluid(400,train))) {
				if(!train.getBoolean(GenericRailTransport.boolValues.CREATIVE)) {
					train.getSlotIndexByID(train.fuelSlot().getSlotID()).decrStackSize(1);
					train.addItem(new ItemStack(Items.bucket));
				}
			}
            //todo: fluid pipe support, should be able to be toggled in server settings
        }

        //use stored fuel
        if (train.getBoolean(GenericRailTransport.boolValues.RUNNING)){
            //diesel trains use fuel similar to electric, except idle will use fuel.
			if(train.accelerator==0){//idle
				if(train.drain(null, 0, (int)(1f*train.getEfficiency()),false)==0) {
					train.drain(null, 0, (int) (1f * train.getEfficiency()), true);
				} else {
					train.setBoolean(GenericRailTransport.boolValues.RUNNING, false);
				}
			} else {//moving
				if (train.drain(null, 0, MathHelper.floor_double((1 * train.getEfficiency()) + (Math.copySign(train.accelerator, 1) * (5 * train.getEfficiency()))), false)==0) {
					train.drain(null, 0,  MathHelper.floor_double((1 * train.getEfficiency()) + (Math.copySign(train.accelerator, 1) * (5 * train.getEfficiency()))), true);
				} else {
					train.setBoolean(GenericRailTransport.boolValues.RUNNING, false);
				}
			}
        }
    }

    /* Unfinished
    //Calculate burn times for various items
    public float itemBurnTimes(EntityTrainCore train) {

		ItemStackSlot slotId=train.getSlotIndexByID(400);
		if(slotId !=null && slotId.getStack() !=null && train.getSlotIndexByID(400) !=null) {



		switch (slotId.getItem()) {

			case  :

			return TileEntityFurnace.getItemBurnTime(new ItemStack(Items.coal)) * train.getEfficiency() * 0.2f;
				break;

				default:
					return 0;
		}

		}

		return 0;

	}
*/
	public void manageElectric(EntityTrainCore train){
		manageElectricFuel(train);
	}

	public static void manageElectricFuel(EntityTrainCore train){
		//add redstone to the fuel tank
		if(getUseableFluid(train.fuelSlot().getSlotID(),train)!=null){
			if(train.fill(null,getUseableFluid(train.fuelSlot().getSlotID(),train))){
				train.fill(null,getUseableFluid(train.fuelSlot().getSlotID(),train),true);
				if(train.getSlotIndexByID(train.fuelSlot().getSlotID()).getItem() instanceof IEnergyContainerItem){
					((IEnergyContainerItem) train.getSlotIndexByID(train.fuelSlot().getSlotID()).getItem())
							.extractEnergy(train.getSlotIndexByID(train.fuelSlot().getSlotID()).getStack(), 250, false);
				} else {
					train.getSlotIndexByID(train.fuelSlot().getSlotID()).decrStackSize(1);
				}

			}
		}

		//fill from overhead wires/3rd rail
		if (train.fill(null, new FluidStack(TiMFluids.fluidRedstone, 100), false) == 0) {
			int draw = 0;
			TileEntity te;
			Block b;
			for (int i=-1; i<5;i++) {
				te=train.worldObj.getTileEntity(MathHelper.floor_double(train.posX), MathHelper.floor_double(train.posY + i), MathHelper.floor_double(train.posZ));
				if (te instanceof IEnergyHandler) {
					for (ForgeDirection direction : ForgeDirection.VALID_DIRECTIONS) {
						draw = ((IEnergyHandler) te).receiveEnergy(direction, 100, true);

						if (draw != 0) {
							((IEnergyHandler) te).receiveEnergy(direction, 100, false);
							train.fill(null, new FluidStack(TiMFluids.fluidRedstone, 100), true);
							break;
						}
					}
				} else{
					b= train.worldObj.getBlock(MathHelper.floor_double(train.posX), MathHelper.floor_double(train.posY + i), MathHelper.floor_double(train.posZ));
					if (b instanceof IElectricGrid && ((IElectricGrid) b).getChargeHandler().getCharge()>=100){
						((IElectricGrid) b).getChargeHandler().removeCharge(100);
						train.fill(null, new FluidStack(TiMFluids.fluidRedstone, 100), true);
					}
				}
				if (draw != 0) {
					break;
				}
			}
		}

		//use stored energy
		if (train.getBoolean(GenericRailTransport.boolValues.RUNNING)){
			//electric trains run at a generally set rate which is multiplied at the square of speed.
			if (train.drain(null, 0, MathHelper.floor_double((1*train.getEfficiency()) + (Math.copySign(train.accelerator, 1)*(5*train.getEfficiency()))), false)<1){
				train.drain(null, 0, MathHelper.floor_double((1*train.getEfficiency()) + (Math.copySign(train.accelerator, 1)*(5*train.getEfficiency()))), true);
			} else {
				train.setBoolean(GenericRailTransport.boolValues.RUNNING, false);
			}
		}
	}


	public static void manageTanker(GenericRailTransport transport){

		if (getUseableFluid(transport.tankerInputSlot().getSlotID(), transport) != null &&
				transport.fill(null, getUseableFluid(transport.tankerInputSlot().getSlotID(), transport))) {

			transport.fill(null, getUseableFluid(transport.tankerInputSlot().getSlotID(), transport), true);

			if (!transport.getBoolean(GenericRailTransport.boolValues.CREATIVE)) {
				transport.addItem(FluidContainerRegistry.drainFluidContainer(transport.getSlotIndexByID(transport.tankerInputSlot().getSlotID()).getStack()));
				transport.getSlotIndexByID(transport.tankerInputSlot().getSlotID()).decrStackSize(1);

			}

		}
		//attempt to fill any buckets in the drain slot
		if (transport.getSlotIndexByID(transport.tankerOutputSlot().getSlotID())!=null && FluidContainerRegistry.isEmptyContainer(transport.getSlotIndexByID(401).getStack())) {
			for (int i = 0; i < transport.getTankCapacity().length; i++) {
				if (FluidContainerRegistry.fillFluidContainer(
						new FluidStack(transport.getTankInfo(ForgeDirection.UNKNOWN)[i].fluid,1000)
						, transport.getSlotIndexByID(transport.tankerOutputSlot().getSlotID()).getStack()) !=null) {

					transport.addItem(FluidContainerRegistry.fillFluidContainer(
							new FluidStack(transport.getTankInfo(ForgeDirection.UNKNOWN)[i].fluid,1000)
							, transport.getSlotIndexByID(transport.tankerOutputSlot().getSlotID()).getStack()));
					transport.getSlotIndexByID(transport.tankerOutputSlot().getSlotID()).decrStackSize(1);
					return;
				}
			}
		}


			//drain from top slot
			/*if (transport.getStackInSlot(1) == null && isUseableFluid(transport.getStackInSlot(0), transport) == null &&
					transport.drain(null, 1000, false) != null && transport.drain(null, 1000, false).amount >= 1000){
				transport.setInventorySlotContents(1, FluidContainerRegistry.fillFluidContainer(transport.drain(null, 1000, false), transport.getStackInSlot(0)));
				if (transport.getStackInSlot(0).stackSize == 1) {
					transport.setInventorySlotContents(0, null);
				} else {
					transport.getStackInSlot(0).stackSize--;
				}
				if (!transport.getBoolean(GenericRailTransport.boolValues.CREATIVE)) {
					transport.drain(null, 1000, true);
				}
			}
		}*/
	}

} 
