package train.common.api;

import buildcraft.api.fuels.BuildcraftFuelRegistry;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.railcraft.api.fuel.FuelManager;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.*;
import train.common.blocks.BlockTraincraftFluid;
import train.common.items.ItemBlockFluid;
import train.common.library.BlockIDs;
import train.common.library.ItemIDs;

public class LiquidManager {

	public static final int BUCKET_VOLUME = 1000;
	private static LiquidManager instance;
	public static FluidStack WATER_FILTER = new FluidStack(FluidRegistry.WATER, 1);
	public static FluidStack LAVA_FILTER = new FluidStack(FluidRegistry.LAVA, 1);
	public static Fluid oil;
	public static Fluid steam;
	public static Fluid fuel;
	public static Fluid biomass;
	public static Fluid biofuel;
	public static Fluid bioDiesel;
	public static Fluid bioethanol;

	public static final Fluid DIESEL = new Fluid("Diesel").setUnlocalizedName("diesel.name").setDensity(860);
	public static final Fluid REFINED_FUEL = new Fluid("RefinedFuel").setDensity(820).setUnlocalizedName("refinedfuel.name");

	public static LiquidManager getInstance() {
		if (instance == null) {
			instance = new LiquidManager();
		}
		return instance;
	}

	public static void registerFluidBlock(BlockTraincraftFluid block){
		GameRegistry.registerBlock(block, ItemBlockFluid.class, "fluid." + block.getFluid().getName());
	}

	public void registerLiquids() {
		FluidRegistry.registerFluid(DIESEL);
		FluidRegistry.registerFluid(REFINED_FUEL);
		BlockIDs.diesel.block = new BlockTraincraftFluid(DIESEL, Material.water).setFlammable(true).setFlammability(5);
		DIESEL.setBlock(BlockIDs.diesel.block);
		BlockIDs.refinedFuel.block = new BlockTraincraftFluid(REFINED_FUEL, Material.water).setFlammable(true).setFlammability(4);
		REFINED_FUEL.setBlock(BlockIDs.refinedFuel.block);
		FluidContainerRegistry.registerFluidContainer(DIESEL, new ItemStack(ItemIDs.diesel.item), new ItemStack(ItemIDs.emptyCanister.item));
		FluidContainerRegistry.registerFluidContainer(REFINED_FUEL, new ItemStack(ItemIDs.refinedFuel.item), new ItemStack(ItemIDs.emptyCanister.item));
		dieselFilter();
		if (Loader.isModLoaded("Railcraft")) {
			addRCFluids();
		}
		if (Loader.isModLoaded("BuildCraft|Energy")) {
			addBCFluids();
		}
		MinecraftForge.EVENT_BUS.register(this);

		registerFluidBlock((BlockTraincraftFluid) BlockIDs.diesel.block);
		registerFluidBlock((BlockTraincraftFluid) BlockIDs.refinedFuel.block);
	}

	@Optional.Method(modid = "BuildCraft|Energy")
	private void addBCFluids(){
		BuildcraftFuelRegistry.fuel.addFuel(DIESEL, 30, 200000);
		BuildcraftFuelRegistry.fuel.addFuel(REFINED_FUEL, 60, 100000);
	}

	@Optional.Method(modid = "Railcraft")
	private void addRCFluids() {
		FuelManager.addBoilerFuel(DIESEL, 60000);
		FuelManager.addBoilerFuel(REFINED_FUEL, 96000);
	}
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void textureHook(TextureStitchEvent.Post event) {
		if (event.map.getTextureType() == 0) {
			DIESEL.setIcons(BlockIDs.diesel.block.getBlockTextureFromSide(1), BlockIDs.diesel.block.getBlockTextureFromSide(2));
			REFINED_FUEL.setIcons(BlockIDs.refinedFuel.block.getBlockTextureFromSide(1), BlockIDs.refinedFuel.block.getBlockTextureFromSide(2));
		}
	}

	public static void getLiquidsFromDictionnary() {
		oil = FluidRegistry.getFluid("oil");
		steam = FluidRegistry.getFluid("steam");
		fuel = FluidRegistry.getFluid("fuel");
		biomass = FluidRegistry.getFluid("biomass");
		bioethanol = FluidRegistry.getFluid("bioethanol");
		biofuel = FluidRegistry.getFluid("biofuel");
		bioDiesel = FluidRegistry.getFluid("biodiesel");
	}

	public boolean isDieselLocoFuel(ItemStack stack) {
		FluidStack[] multiFilter;
		FluidStack bucketLiquid = getFluidInContainer(stack);
		LiquidManager.getInstance();
		multiFilter = LiquidManager.dieselFilter();
		if (multiFilter != null) {
			for(FluidStack aMultiFilter : multiFilter){
				if(aMultiFilter != null && bucketLiquid != null && aMultiFilter.isFluidEqual(bucketLiquid))
					return true;
				if(isEmptyContainer(stack))
					return true;
			}
		}
		return false;
	}

	public static FluidStack[] dieselFilter() {
		FluidStack[] fuels = new FluidStack[4];
		if (DIESEL != null)
			fuels[0] = new FluidStack(DIESEL, 1);
		if (REFINED_FUEL != null)
			fuels[1] = new FluidStack(REFINED_FUEL, 1);
		if (biofuel != null)
			fuels[2] = new FluidStack(biofuel, 1);
		if (bioDiesel != null)
			fuels[2] = new FluidStack(bioDiesel, 1);
		if (fuel != null)
			fuels[3] = new FluidStack(fuel, 1);
		if (bioethanol != null)
			fuels[2] = new FluidStack(bioethanol, 1);
		return fuels;
	}

	public boolean isContainer(ItemStack stack) {
		return FluidContainerRegistry.isContainer(stack);
	}

	public boolean isFilledContainer(ItemStack stack) {
		return FluidContainerRegistry.isFilledContainer(stack);
	}

	public boolean isEmptyContainer(ItemStack stack) {
		return FluidContainerRegistry.isEmptyContainer(stack);
	}

	public ItemStack fillFluidContainer(FluidStack liquid, ItemStack empty) {
		if ((liquid == null) || (empty == null))
			return null;
		return FluidContainerRegistry.fillFluidContainer(liquid, empty);
	}

	public FluidStack getFluidInContainer(ItemStack stack) {
		return FluidContainerRegistry.getFluidForFilledItem(stack);
	}

	public boolean containsFluid(ItemStack stack, FluidStack liquid) {
		return FluidContainerRegistry.containsFluid(stack, liquid);
	}

	public boolean isFluidEqual(FluidStack L1, FluidStack L2) {
		return !((L1 == null) || (L2 == null)) && L1.isFluidEqual(L2);
	}

	public ItemStack processContainer(IInventory inventory, IFluidTank tank, ItemStack itemstack, int tankIndex) {
		FluidStack bucketLiquid = getFluidInContainer(itemstack);
		ItemStack emptyItem = itemstack.getItem().getContainerItem(itemstack);

		if ((bucketLiquid != null) && (emptyItem == null)) {
			int used = tank.fill(bucketLiquid, false);
			if (used >= bucketLiquid.amount) {
				tank.fill(bucketLiquid, true);
				inventory.decrStackSize(0, 1);
				return null;
			}
		}
		else if ((getInstance().isEmptyContainer(itemstack))) {
			ItemStack filled = getInstance().fillFluidContainer(tank.getFluid(), itemstack);
			if ((filled != null)) {
				FluidStack liquid = getFluidInContainer(filled);
				FluidStack drain = tank.drain(liquid.amount, false);
				if ((drain != null) && (drain.amount > 0)) {
					tank.drain(liquid.amount, true);
					inventory.decrStackSize(0, 1);
					return filled;
				}
			}
		}
		return null;
	}

	public ItemStack processContainer(IInventory inventory, int inventoryIndex, IFluidHandler tank, ItemStack itemstack) {
		FluidStack bucketLiquid = getFluidInContainer(itemstack);
		ItemStack emptyItem = itemstack.getItem().getContainerItem(itemstack);
		if ((bucketLiquid != null)) {
			int used = tank.fill(ForgeDirection.UNKNOWN,bucketLiquid, false);
			if (used >= bucketLiquid.amount) {
				tank.fill(ForgeDirection.UNKNOWN,bucketLiquid, true);
				if (itemstack.getItem() == Items.potionitem){
					return new ItemStack(Items.glass_bottle, 1);
				}
				inventory.decrStackSize(inventoryIndex, 1);
				return emptyItem;
			}
		}
		else if ((getInstance().isEmptyContainer(itemstack))) {
			ItemStack filled = getInstance().fillFluidContainer(tank.drain(ForgeDirection.UNKNOWN,1000,false), itemstack);
			if ((filled != null)) {
				FluidStack liquid = getFluidInContainer(filled);
				FluidStack drain = tank.drain(ForgeDirection.UNKNOWN,liquid.amount, false);
				if ((drain != null) && (drain.amount > 0)) {
					tank.drain(ForgeDirection.UNKNOWN,liquid.amount, true);
					inventory.decrStackSize(inventoryIndex, 1);
					return filled;
				}
			}
		}
		return null;
	}

	public class StandardTank extends FluidTank {
		private int tankIndex;

		public StandardTank(int capacity) {
			super(capacity);
		}

		public void setTankIndex(int index) {
			this.tankIndex = index;
		}

		public int getTankIndex() {
			return this.tankIndex;
		}

		public boolean isEmpty() {
			return (getFluid() == null) || (getFluid().amount <= 0);
		}
	}

	public class FilteredTank extends StandardTank {
		private final FluidStack filter;
		private final FluidStack[] multiFilter;

		public FilteredTank(int capacity, FluidStack filter) {
			super(capacity);
			this.filter = filter;
			this.multiFilter = null;
		}

		public FilteredTank(int capacity, FluidStack filter, int pressure) {
			this(capacity, filter);
		}

		public FilteredTank(int capacity, FluidStack[] filter) {
			super(capacity);
			this.multiFilter = filter;
			this.filter = null;
		}

		public FilteredTank(int capacity, FluidStack[] filter, int pressure) {
			this(capacity, filter);
		}

		@Override
		public int fill(FluidStack resource, boolean doFill) {
			if (multiFilter != null) {
				for (int i = 0; i < multiFilter.length; i++) {
					if (multiFilter[i] != null && isFluidEqual(this.multiFilter[i], resource)) {
						return super.fill(resource, doFill);
					}
				}
			}
			else
			if (this.filter.isFluidEqual(resource)) {
				return super.fill(resource, doFill);
			}
			return 0;
		}

		public FluidStack getFilter() {
			return this.filter.copy();
		}

		public boolean liquidMatchesFilter(FluidStack resource) {
			return !((resource == null) || (this.filter == null)) && this.filter.isFluidEqual(resource);
		}
	}

	public class ReverseFilteredTank extends StandardTank {
		private final FluidStack filter;
		private final FluidStack[] multiFilter;

		public ReverseFilteredTank(int capacity, FluidStack filter) {
			super(capacity);
			this.filter = filter;
			this.multiFilter = null;
		}

		public ReverseFilteredTank(int capacity, FluidStack filter, int pressure) {
			this(capacity, filter);
		}

		public ReverseFilteredTank(int capacity, FluidStack[] filter) {
			super(capacity);
			this.multiFilter = filter;
			this.filter = null;
		}

		public ReverseFilteredTank(int capacity, FluidStack[] filter, int pressure) {
			this(capacity, filter);
		}

		@Override
		public int fill(FluidStack resource, boolean doFill) {
			if (multiFilter != null) {
				for (int i = 0; i < multiFilter.length; i++) {
					if (multiFilter[i] != null && (resource.getFluidID() != multiFilter[i].getFluidID())) {
						return super.fill(resource, doFill);
					}
				}
			}
			else if (filter.getFluidID() != resource.getFluidID()) {
				return super.fill(resource, doFill);
			}
			return 0;
		}

		public FluidStack getFilter() {
			return filter.copy();
		}

		public boolean liquidMatchesFilter(FluidStack resource) {
			return !((resource == null) || (filter == null)) && filter.isFluidEqual(resource);
		}
	}
}
