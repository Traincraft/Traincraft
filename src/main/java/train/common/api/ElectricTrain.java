package train.common.api;

import cofh.api.energy.IEnergyContainerItem;
import cofh.api.energy.IEnergyHandler;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public abstract class ElectricTrain extends Locomotive {

	private int timeSinceIgnited;
	private boolean Ignite;
	//private boolean hasUranium;
	//private int reduceExplosionChance;
	public int maxEnergy = 20000;

	public ElectricTrain(World world) {
		super(world);
		fuelTrain = 0;

		numCargoSlots = 5;
		numCargoSlots1 = 5;
		numCargoSlots2 = 5;
		inventorySize = numCargoSlots + numCargoSlots2 + numCargoSlots1 + 1;
		locoInvent = new ItemStack[inventorySize];
		//hasUranium = false;
		//reduceExplosionChance = 1000;
		Ignite = false;
		timeSinceIgnited = 0;
	}
	@Override
	public void onUpdate() {
		super.onUpdate();
		if (worldObj.isRemote) {
			return;
		}
		this.setState("hot");
		
		if (rand.nextInt(4) == 0 && Ignite) {

			timeSinceIgnited++;

		}
		if(!this.canCheckInvent)return;
		
		/* if the loco has fuel */
		if (getFuel() < maxEnergy && locoInvent[0] != null)
		{
			Item item = locoInvent[0].getItem();
			if (item == Items.redstone && ((getFuel() + 2000) <= maxEnergy))
			{
				fuelTrain += 2000;
				decrStackSize(0, 1);
			} else if (item == Item.getItemFromBlock(Blocks.redstone_block) && (getFuel() + (18000)) <= maxEnergy)
			{
				fuelTrain += 18000;
				decrStackSize(0, 1);

			}else if (item instanceof IEnergyContainerItem)
			{
				int draw = MathHelper.floor_double(Math.min(200, maxEnergy - getFuel()) * 0.1); // amount of energy to attempt to draw this tick
				fuelTrain += ((IEnergyContainerItem) item).extractEnergy(locoInvent[0], draw, false) * 10;
			}
			/*else if ((PluginIndustrialCraft.getItems().containsKey(PluginIndustrialCraft.getNames()[4]) && PluginIndustrialCraft.getItems().containsKey(PluginIndustrialCraft.getNames()[3])) && (item == PluginIndustrialCraft.getItems().get(PluginIndustrialCraft.getNames()[4]).getItem())) {

				int transfer = ElectricItem.manager.discharge(locoInvent[0], maxEnergy - getFuel(), 2, false, false);
				fuelTrain = transfer;
				//System.out.println("Amount: " + transfer + " Fuel: " + getFuel());//TODO debug
			}*/
		}/* else if (getFuel() <= 0) {// fuel check if (locoInvent[0] != null && (PluginIndustrialCraft.getItems().containsKey(PluginIndustrialCraft.getNames()[20])) && (PluginIndustrialCraft.getItems().containsKey(PluginIndustrialCraft.getNames()[23]))) { if ((locoInvent[0].itemID == PluginIndustrialCraft.getItems().get(PluginIndustrialCraft.getNames()[20]).itemID)) { hasUranium = true; fuelTrain = maxEnergy; if (!worldObj.isRemote) { decrStackSize(0, 1); } reduceExplosionChance = 1000; for (int u = 1; u < locoInvent.length; u++) {// checks the inventory
		  * 
		  * if (locoInvent[u] != null) { if (locoInvent[u].itemID == PluginIndustrialCraft.getItems().get(PluginIndustrialCraft.getNames()[21]).itemID) { reduceExplosionChance += 10000; if (rand.nextInt(10) == 0 && (!worldObj.isRemote)) { locoInvent[u].setItemDamage(1); } } } } } else if ((locoInvent[0].itemID == PluginIndustrialCraft.getItems().get(PluginIndustrialCraft.getNames()[23]).itemID)) { hasUranium = true; fuelTrain = 800 + 1000000; // locoInvent[0] = null; if (!worldObj.isRemote) { decrStackSize(0, 1); } reduceExplosionChance = 1000; for (int u = 1; u < locoInvent.length; u++) {// checks the inventory if (locoInvent[u] != null) { if (locoInvent[u].itemID == PluginIndustrialCraft.getItems().get(PluginIndustrialCraft.getNames()[21]).itemID) { reduceExplosionChance += 10000; if (rand.nextInt(10) == 0 && (!worldObj.isRemote)) { locoInvent[u].setItemDamage(1); } } } } } } } */

		blocksToCheck = new TileEntity[]{worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY-1),MathHelper.floor_double(posZ)),
				worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY+2),MathHelper.floor_double(posZ)),
				worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY+3),MathHelper.floor_double(posZ)),
				worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY+4),MathHelper.floor_double(posZ))
		};

		int draw = 0;
		for (TileEntity block : blocksToCheck) {
			if (block instanceof IEnergyHandler) {
				for (ForgeDirection direction : ForgeDirection.VALID_DIRECTIONS) {
					if (draw != 0) {
						break;
					}
					int max = ((IEnergyHandler) block).getEnergyStored(direction);
					if (max > 0) {
						draw = ((IEnergyHandler) block).receiveEnergy(direction, Math.max(-MathHelper.floor_double(Math.min(200, maxEnergy - getFuel()) * 0.1), -max), false);
					}
				}
				fuelTrain += -draw;
			}
			if (draw != 0) {
				break;
			}
		}
	}
	@Override
	protected void updateFuelTrain(int amount) {
		//reduceExplosionChance = 1000;
		if (fuelTrain < 0) {
			//hasUranium = false;
			motionX *= 0.8;
			motionZ *= 0.8;
		}
		else {
			if(this.isLocoTurnedOn()) {
				fuelTrain -= amount;
				if (fuelTrain < 0){
					fuelTrain = 0;
					setLocoTurnedOnFromPacket(false);
				}
			}
		}
		/*if (hasUranium && (rand.nextInt(reduceExplosionChance) == 0) && (!Ignite)) {// fuse
			Ignite = true;
			setFire(8);
			worldObj.playSoundAtEntity(this, "random.fuse", 1.0F, 0.5F);
		}*/
		if (Ignite && timeSinceIgnited == 100) {
			worldObj.createExplosion(this, posX, posY, posZ, 200F, true);
			// ConfigHandler2.logger.fine("Train has exploded");
			Ignite = false;
			//hasUranium = false;
			isDead = true;
		}
	}
	@Override
	public int getFuelDiv(int i) {
		if (worldObj.isRemote) {
			return ((this.dataWatcher.getWatchableObjectInt(24) * (i)) / maxEnergy);
		}
		return (this.fuelTrain * (i)) / maxEnergy;
	}
	@Override
	public boolean canOverheat() {
		return false;
	}
}
