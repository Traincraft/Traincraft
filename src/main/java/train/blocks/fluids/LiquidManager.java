package train.blocks.fluids;

import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.*;

public class LiquidManager {

	private static LiquidManager instance;
	public static Fluid oil;
	public static Fluid steam;
	public static Fluid fuel;
	public static Fluid biomass;
	public static Fluid biofuel;
	public static Fluid bioDiesel;
	public static Fluid bioethanol;

	public static final Fluid DIESEL = new Fluid("Diesel").setUnlocalizedName("diesel.name").setDensity(860);

	public static LiquidManager getInstance() {
		if (instance == null) {
			instance = new LiquidManager();
		}
		return instance;
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


}
