package src.train.common.core;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EnumStatus;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.inventory.ContainerPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.StatBase;
import net.minecraft.tileentity.TileEntityBrewingStand;
import net.minecraft.tileentity.TileEntityDispenser;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.FoodStats;
import net.minecraft.world.World;

/**
 * Fake player entity, which is used in calls requiring player instance. All methods are modified to do nothing, to prevent modification of player stats.
 * 
 * @author MightyPork
 * @copy 2012
 */
public class FakePlayer extends EntityPlayer {
	/**
	 * Create fake player in world
	 * 
	 * @param world the world
	 */
	public FakePlayer(World world) {
		super(world, "");
		inventory = new InventoryPlayer(this);
		inventory.currentItem = 0;
		inventory.setInventorySlotContents(0, new ItemStack(Item.pickaxeDiamond, 1, 0));
		foodStats = new FoodStats();
		flyToggleTimer = 0;
		// score = 0;
		boolean isSwinging = false; // Maybe spawnForced ??
		xpCooldown = 0;
		timeUntilPortal = 20;
		inPortal = false;
		capabilities = new PlayerCapabilities();
		speedOnGround = 0.1F;
		speedInAir = 0.02F;
		fishEntity = null;
		this.inventoryContainer = new ContainerPlayer(this.inventory, !world.isRemote, this);
		this.openContainer = this.inventoryContainer;
		yOffset = 1.62F;

		fireResistance = 20;
	}

	@Override
	protected void entityInit() {
		super.entityInit();
	}

	@Override
	public void onUpdate() {}

	@Override
	public void preparePlayerToSpawn() {}

	@Override
	protected void updateEntityActionState() {}

	@Override
	public void onLivingUpdate() {}

	@Override
	public void onDeath(DamageSource damagesource) {
		super.onDeath(damagesource);
	}

	@Override
	public EntityItem dropPlayerItem(ItemStack itemstack) {
		return null;
	}

	@Override
	public EntityItem dropPlayerItemWithRandomChoice(ItemStack itemstack, boolean flag) {
		return null;
	}

	@Override
	public boolean canHarvestBlock(Block block) {
		return true;
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound nbttagcompound) {}

	@Override
	public void writeEntityToNBT(NBTTagCompound nbttagcompound) {}

	@Override
	public int getTotalArmorValue() {
		return 0;
	}

	@Override
	public void displayGUIFurnace(TileEntityFurnace tileentityfurnace) {}

	@Override
	public void displayGUIDispenser(TileEntityDispenser tileentitydispenser) {}

	@Override
	public void displayGUIBrewingStand(TileEntityBrewingStand tileentitybrewingstand) {}

	@Override
	public ItemStack getCurrentEquippedItem() {
		return null;
	}

	@Override
	public void destroyCurrentEquippedItem() {}

	@Override
	public double getYOffset() {
		return 0;
	}

	@Override
	public void swingItem() {}

	@Override
	public void attackTargetEntityWithCurrentItem(Entity entity) {}

	@Override
	public void onCriticalHit(Entity entity) {}

	@Override
	public void onEnchantmentCritical(Entity entity) {}

	@Override
	public void respawnPlayer() {}

	@Override
	public void setDead() {
		super.setDead();
	}

	@Override
	public boolean isEntityInsideOpaqueBlock() {
		return false;
	}

	@Override
	public EnumStatus sleepInBedAt(int i, int j, int k) {
		return EnumStatus.OK;
	}

	@Override
	public void wakeUpPlayer(boolean flag, boolean flag1, boolean flag2) {}

	@Override
	public float getBedOrientationInDegrees() {
		return 0.0F;
	}

	@Override
	public boolean isPlayerSleeping() {
		return sleeping;
	}

	@Override
	public boolean isPlayerFullyAsleep() {
		return false;
	}

	@Override
	public int getSleepTimer() {
		return 0;
	}

	@Override
	public void addChatMessage(String s) {}

	@Override
	public void triggerAchievement(StatBase statbase) {}

	@Override
	public void addStat(StatBase statbase, int i) {}

	@Override
	public void addToPlayerScore(Entity par1Entity, int par2) {}

	@Override
	protected void jump() {}

	@Override
	public void moveEntityWithHeading(float f, float f1) {}

	@Override
	public void addMovementStat(double d, double d1, double d2) {}

	@Override
	protected void fall(float f) {}

	@Override
	public void setInPortal() {}

	@Override
	public int xpBarCap() {
		return 1000;
	}

	@Override
	public void addExhaustion(float f) {}

	@Override
	public FoodStats getFoodStats() {
		return foodStats;
	}

	@Override
	public boolean canEat(boolean flag) {
		return false;
	}

	@Override
	public boolean shouldHeal() {
		return false;
	}

	@Override
	public void setItemInUse(ItemStack itemstack, int i) {}

	@Override
	protected int getExperiencePoints(EntityPlayer entityplayer) {
		return 0;
	}

	@Override
	protected boolean isPlayer() {
		return true;
	}

	@Override
	public boolean canCommandSenderUseCommand(int var1, String var2) {
		return false;
	}

	@Override
	public ChunkCoordinates getPlayerCoordinates() {
		return null;
	}

	@Override
	public void sendChatToPlayer(ChatMessageComponent chatmessagecomponent) {}
}
