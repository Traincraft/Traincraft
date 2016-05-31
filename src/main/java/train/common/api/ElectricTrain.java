package train.common.api;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public abstract class ElectricTrain extends Locomotive {

	private int timeSinceIgnited;
	private boolean Ignite;
	private boolean hasUranium;
	private int reduceExplosionChance;
	private long lastTotalEnergyConducted;
	private int tour;

	public int maxEnergy = 10000;

	private int redstoneEnergy = 2000;

	public ElectricTrain(World world) {
		super(world);
		fuelTrain = 0;

		numCargoSlots = 5;
		numCargoSlots1 = 5;
		numCargoSlots2 = 5;
		inventorySize = numCargoSlots + numCargoSlots2 + numCargoSlots1 + 1;
		locoInvent = new ItemStack[inventorySize];
		hasUranium = false;
		reduceExplosionChance = 1000;
		Ignite = false;
		timeSinceIgnited = 0;
		lastTotalEnergyConducted = 0;
		tour = 0;
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
		if (getFuel() < maxEnergy) {
			if (locoInvent[0] != null && locoInvent[0].getItem() == Items.redstone && ((getFuel() + redstoneEnergy) <= maxEnergy)) {
				fuelTrain += redstoneEnergy;
				decrStackSize(0, 1);
			}
			/*else if (locoInvent[0] != null && (PluginIndustrialCraft.getItems().containsKey(PluginIndustrialCraft.getNames()[4]) && PluginIndustrialCraft.getItems().containsKey(PluginIndustrialCraft.getNames()[3])) && (locoInvent[0].itemID == PluginIndustrialCraft.getItems().get(PluginIndustrialCraft.getNames()[4]).itemID)) {

				int transfer = ElectricItem.manager.discharge(locoInvent[0], maxEnergy - getFuel(), 2, false, false);
				fuelTrain = transfer;
				//System.out.println("Amount: " + transfer + " Fuel: " + getFuel());//TODO debug
			}*/
			//else if (locoInvent[0] != null && locoInvent[0].getItem() instanceof IElectricItem) {
			//	double transfer = ElectricItem.manager.discharge(locoInvent[0], (int)(maxEnergy - getFuel()),3,false,false,false);
			//	fuelTrain += (int) transfer;// / 100;
			//}
		}/* else if (getFuel() <= 0) {// fuel check if (locoInvent[0] != null && (PluginIndustrialCraft.getItems().containsKey(PluginIndustrialCraft.getNames()[20])) && (PluginIndustrialCraft.getItems().containsKey(PluginIndustrialCraft.getNames()[23]))) { if ((locoInvent[0].itemID == PluginIndustrialCraft.getItems().get(PluginIndustrialCraft.getNames()[20]).itemID)) { hasUranium = true; fuelTrain = maxEnergy; if (!worldObj.isRemote) { decrStackSize(0, 1); } reduceExplosionChance = 1000; for (int u = 1; u < locoInvent.length; u++) {// checks the inventory
		  * 
		  * if (locoInvent[u] != null) { if (locoInvent[u].itemID == PluginIndustrialCraft.getItems().get(PluginIndustrialCraft.getNames()[21]).itemID) { reduceExplosionChance += 10000; if (rand.nextInt(10) == 0 && (!worldObj.isRemote)) { locoInvent[u].setItemDamage(1); } } } } } else if ((locoInvent[0].itemID == PluginIndustrialCraft.getItems().get(PluginIndustrialCraft.getNames()[23]).itemID)) { hasUranium = true; fuelTrain = 800 + 1000000; // locoInvent[0] = null; if (!worldObj.isRemote) { decrStackSize(0, 1); } reduceExplosionChance = 1000; for (int u = 1; u < locoInvent.length; u++) {// checks the inventory if (locoInvent[u] != null) { if (locoInvent[u].itemID == PluginIndustrialCraft.getItems().get(PluginIndustrialCraft.getNames()[21]).itemID) { reduceExplosionChance += 10000; if (rand.nextInt(10) == 0 && (!worldObj.isRemote)) { locoInvent[u].setItemDamage(1); } } } } } } } */
	}
	@Override
	protected void updateFuelTrain() {
		reduceExplosionChance = 1000;
		if (fuelTrain < 0) {
			hasUranium = false;
			motionX *= 0.8;
			motionZ *= 0.8;
		}
		else {
			if(this.isLocoTurnedOn())fuelTrain--;
		}
		if (hasUranium && (rand.nextInt(reduceExplosionChance) == 0) && (!Ignite)) {// fuse
			Ignite = true;
			setFire(8);
			worldObj.playSoundAtEntity(this, "random.fuse", 1.0F, 0.5F);
		}
		if (Ignite && timeSinceIgnited == 100) {
			worldObj.createExplosion(this, posX, posY, posZ, 200F, true);
			// ConfigHandler2.logger.fine("Train has exploded");
			Ignite = false;
			hasUranium = false;
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