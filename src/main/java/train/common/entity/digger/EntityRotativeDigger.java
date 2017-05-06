package train.common.entity.digger;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.core.handlers.ConfigHandler;
import train.common.core.network.PacketKeyPress;
import train.common.library.ItemIDs;

import java.util.List;

public class EntityRotativeDigger extends Entity implements IInventory {

	public int start;
	private ItemStack cargoItems[];// added
	private ItemStack zeppInvent[];
	public int numCargoSlots;
	public int numCargoSlots1;
	public int numCargoSlots2;
	public int inventorySize;
	public int fuel;
	public boolean idle;
	public boolean altitude;
	private static int KEY_ACC;
	private static int KEY_DEC;
	private static int KEY_TURNLEFT;
	private static int KEY_TURNRIGHT;
	private static int KEY_UP;
	private static int KEY_DOWN;
	private static int KEY_IDLE;
	private static int KEY_INV;
	private static int KEY_BOMB;

	public int boatCurrentDamage;
	public int boatTimeSinceHit;
	public int boatRockDirection;
	private int field_9394_d;
	private double field_9393_e;
	private double field_9392_f;
	private double field_9391_g;
	private double field_9390_h;
	private double field_9389_i;
	private double field_9388_j;
	private double field_9387_k;
	private double field_9386_l;

	public float pitch = 0F;
	public float roll = 0F;
	public float pitchLimits = 0.75F;
	/** passengers wheels */
	protected EntityRotativeWheel[] wheels;

	public EntityRotativeDigger(World world) {
		super(world);
		boatCurrentDamage = 0;
		boatTimeSinceHit = 0;
		boatRockDirection = 1;
		preventEntitySpawning = true;
		setSize(1.5F, 0.8F);
		yOffset = height / 2.0F;
		numCargoSlots = 3;
		numCargoSlots1 = 3;
		numCargoSlots2 = 3;
		inventorySize = numCargoSlots + numCargoSlots2 + numCargoSlots1 + 5;
		zeppInvent = new ItemStack[inventorySize];
		idle = false;

		/**
		 * Entities are always rendered even if out player's sight => no more flickering/disappearing
		 */
		if (ConfigHandler.FLICKERING) {
			this.ignoreFrustumCheck = true;
		}
		stepHeight = 0.6F;
		if (worldObj.isRemote) {
			this.wheels = new EntityRotativeWheel[1];
			this.wheels[0] = new EntityRotativeWheel(this.worldObj, this, 0, 5.4D, 0, 0, 0.0D);
			worldObj.spawnEntityInWorld(this.wheels[0]);
		}
		this.dataWatcher.addObject(20, new Integer(fuel));
		this.dataWatcher.addObject(21, new Integer(start));

	}

	@Override
	protected boolean canTriggerWalking() {
		return false;
	}

	@Override
	protected void entityInit() {}

	@Override
	public AxisAlignedBB getCollisionBox(Entity entity) {
		return entity.boundingBox;
	}

	@Override
	public AxisAlignedBB getBoundingBox() {
		return boundingBox;
	}

	@Override
	public boolean canBePushed() {
		return false;
	}

	@Override
	public void applyEntityCollision(Entity entity) {
		if ((entity instanceof EntityRotativeWheel))
			return;
		if ((entity instanceof EntityPlayer))
			return;

		if (entity != entity.riddenByEntity) {
			double var2 = entity.posX - this.posX;
			double var4 = entity.posZ - this.posZ;
			double var6 = MathHelper.abs_max(var2, var4);

			if (var6 >= 0.009999999776482582D) {
				var6 = MathHelper.sqrt_double(var6);
				var2 /= var6;
				var4 /= var6;
				double var8 = 1.0D / var6;

				if (var8 > 1.0D) {
					var8 = 1.0D;
				}

				var2 *= var8;
				var4 *= var8;
				var2 *= 0.05000000074505806D;
				var4 *= 0.05000000074505806D;
				var2 *= (1.0F - this.entityCollisionReduction);
				var4 *= (1.0F - this.entityCollisionReduction);
				this.addVelocity(-var2, 0.0D, -var4);
				entity.addVelocity(var2, 0.0D, var4);
			}
		}
		return;
	}

	public EntityRotativeDigger(World world, double d, double d1, double d2) {
		this(world);
		setPosition(d, d1 + yOffset, d2);
		motionX = 0.0D;
		motionY = 0.0D;
		motionZ = 0.0D;
		prevPosX = d;
		prevPosY = d1;
		prevPosZ = d2;
	}

	@Override
	public double getMountedYOffset() {
		return height * 0.0D - 0.30000001192092896D;
	}

	@Override
	public boolean attackEntityFrom(DamageSource damagesource, float i) {
		if (worldObj.isRemote || isDead) {
			return true;
		}
		boatRockDirection = -boatRockDirection;
		boatTimeSinceHit = 10;
		boatCurrentDamage += i * 10;
		setBeenAttacked();
		if (boatCurrentDamage > 40) {

			//dropItemWithOffset(ItemIDs.minecartRotativeDigger.item.shiftedIndex, 1, 0.0F);

			setDead();
		}
		return true;
	}

	@Override
	public void setDead() {
		label0: for (int i = 0; i < getSizeInventory(); i++) {
			ItemStack itemstack = getStackInSlot(i);
			if (itemstack == null) {
				continue;
			}
			float f = rand.nextFloat() * 0.8F + 0.1F;
			float f1 = rand.nextFloat() * 0.8F + 0.1F;
			float f2 = rand.nextFloat() * 0.8F + 0.1F;
			do {
				if (itemstack.stackSize <= 0) {
					continue label0;
				}
				int k = rand.nextInt(21) + 10;
				if (k > itemstack.stackSize) {
					k = itemstack.stackSize;
				}
				
				EntityItem entityitem = new EntityItem(worldObj, posX + f, posY + f1, posZ + f2, itemstack.splitStack(k));
				float f3 = 0.05F;
				entityitem.motionX = (float) rand.nextGaussian() * f3;
				entityitem.motionY = (float) rand.nextGaussian() * f3 + 0.2F;
				entityitem.motionZ = (float) rand.nextGaussian() * f3;
				worldObj.spawnEntityInWorld(entityitem);
			} while (true);
		}
	if (wheels != null && wheels.length > 0) {

		for (int i = 0; i < wheels.length; i++) {
			wheels[i].setDead();
		}
	}
	super.setDead();
	}

	public void pressKeyClient(int i) {

		Traincraft.keyChannel.sendToServer(new PacketKeyPress(i));
	}

	public void pressKey(int i) {

		if (i == 7 && riddenByEntity != null && riddenByEntity instanceof EntityPlayer) {
			//TODO there is no GUI for it currently
			//((EntityPlayer) riddenByEntity).openGui(Traincraft.instance, GuiIDs.DIGGER, worldObj, (int) this.posX, (int) this.posY, (int) this.posZ);
		}
		if (i == 9) {
			if (start == 0) {
				start = 1;
			}
			else {
				start = 0;
			}

		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void performHurtAnimation() {
		boatRockDirection = -boatRockDirection;
		boatTimeSinceHit = 10;
		boatCurrentDamage += boatCurrentDamage * 10;
	}

	@Override
	public boolean canBeCollidedWith() {
		return !isDead;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void setPositionAndRotation2(double d, double d1, double d2, float f, float f1, int i) {
		field_9393_e = d;
		field_9392_f = d1;
		field_9391_g = d2;
		field_9390_h = f;
		field_9389_i = f1;
		field_9394_d = i + 4;
		motionX = field_9388_j;
		// motionY = field_9387_k;
		motionZ = field_9386_l;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void setVelocity(double d, double d1, double d2) {
		field_9388_j = motionX = d;
		// field_9387_k = motionY = d1;
		field_9386_l = motionZ = d2;
	}

	/**
	 * Used to setup the wheel
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public Vec3 rotate(double x, double y, double z) {

		double cosYaw = Math.cos(this.getYaw() * 3.141593F / 180.0F);
		double sinYaw = Math.sin(this.getYaw() * 3.141593F / 180.0F);
		double cosPitch = Math.cos((this.getPitch()) * 3.141593F / 180.0F);
		double sinPitch = Math.sin((this.getPitch()) * 3.141593F / 180.0F);
		double cosRoll = Math.cos(0 * 3.141593F / 180.0F);// 0.01745
		double sinRoll = Math.sin(0 * 3.141593F / 180.0F);// 0

		double newX = (-x * cosRoll - y * sinRoll) * cosYaw + ((-x * sinRoll + y * cosRoll) * 0 + z * 0.01745) * sinYaw;
		double newY = -(((cosPitch - x) * -sinPitch));
		double newZ = (y * sinRoll - x * cosRoll) * sinYaw + ((-x * sinRoll + y * cosRoll) * 0 + z * 0.01745) * cosYaw;

		return Vec3.createVectorHelper(newX, newY, newZ);
	}

	public float getYaw() {
		return this.rotationYaw;
	}

	public float getPitch() {
		return this.pitch;
	}

	public double speedXFromPitch(EntityPlayer player, double var3) {
		return (-MathHelper.sin((rotationYaw + 90) / 180.0F * (float) Math.PI) * var3 * MathHelper.cos(player.rotationPitch / 180.0F * (float) Math.PI) * var3);
	}

	public double speedZFromPitch(EntityPlayer player, double var3) {
		return (MathHelper.cos((rotationYaw + 90) / 180.0F * (float) Math.PI) * var3 * MathHelper.cos(player.rotationPitch / 180.0F * (float) Math.PI) * var3);
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (fuel > 0 && riddenByEntity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) riddenByEntity;
			motionX = motionX + player.moveForward * speedXFromPitch(player, 0.2) * 0.1;
			motionZ = motionZ + player.moveForward * speedZFromPitch(player, 0.2) * 0.1;
			rotationYaw += player.moveStrafing * .5;
		}
		
		if (riddenByEntity == null) {
			pitch = 0F;
		}

		/**
		 * Handle the wheels mouvements
		 */
		if (wheels != null) {
			for (int seatNum = 0; seatNum < wheels.length; seatNum++) {
				Vec3 posVec = this.rotate(wheels[seatNum].seatX, wheels[seatNum].seatY, wheels[seatNum].seatZ).addVector(this.posX, this.posY + 0.7, this.posZ);
				//wheels[seatNum].setPosition(posVec.xCoord, posVec.yCoord, posVec.zCoord);

				wheels[seatNum].setPositionAndRotation(posVec.xCoord, posVec.yCoord, posVec.zCoord, this.rotationYaw, pitch);
			}
		}

		//It hasn't any GUI for now
		/*if (fuel <= 0) { if (zeppInvent[0] != null && zeppInvent[0].itemID == ItemIDs.refinedFuel.item.shiftedIndex) { fuel = ConfigHandler2.ZeppelinCoal; this.dataWatcher.updateObject(20, fuel); decrStackSize(0, 1); } } */

		if (boatTimeSinceHit > 0) {
			boatTimeSinceHit--;
		}
		if (boatCurrentDamage > 0) {
			boatCurrentDamage--;
		}

		prevPosX = posX;
		prevPosY = posY;
		prevPosZ = posZ;
		int i = 5;
		double d = 0.0D;
		for (int j = 0; j < i; j++) {
			double d4 = (boundingBox.minY + ((boundingBox.maxY - boundingBox.minY) * (j + 0)) / i) - 0.125D;
			double d8 = (boundingBox.minY + ((boundingBox.maxY - boundingBox.minY) * (j + 1)) / i) - 0.125D;
			AxisAlignedBB axisalignedbb = AxisAlignedBB.getBoundingBox(boundingBox.minX, d4, boundingBox.minZ, boundingBox.maxX, d8, boundingBox.maxZ);
			if (worldObj.isAABBInMaterial(axisalignedbb, Material.water)) {
				d += 1.0D / i;
			}
		}

		double d11 = Math.sqrt(motionX * motionX + motionZ * motionZ);
		if (getFuel() > 0) {
			// if(d11 > 0.14999999999999999D)
			// {
			double d13 = Math.cos((rotationYaw * 3.1415926535897931D) / 180D);
			double d15 = Math.sin((rotationYaw * 3.1415926535897931D) / 180D);

			double d18 = rand.nextFloat() * 2.0F - 1.0F;
			double d20 = (rand.nextInt(2) * 2 - 1) * 0.69999999999999996D;
			if (rand.nextBoolean()) {
				double d21 = (posX - d13 * d18 * 0.80000000000000004D) + d15 * d20;
				double d23 = posZ - d15 * d18 * 0.80000000000000004D - d13 * d20;
				// worldObj.spawnParticle("splash", d21, posY - 0.125D, d23, motionX, motionY, motionZ);
				worldObj.spawnParticle("largesmoke", d21, posY - 0.125D, d23, motionX, motionY, motionZ);
			}
			else {
				double d22 = posX + d13 + d15 * d18 * 0.69999999999999996D;
				double d24 = (posZ + d15) - d13 * d18 * 0.69999999999999996D;
				// worldObj.spawnParticle("splash", d22, posY - 0.125D, d24, motionX, motionY, motionZ);
				worldObj.spawnParticle("largesmoke", d22, posY - 0.125D, d24, motionX, motionY, motionZ);
			}
		}
		if (worldObj.isRemote) {
			if (field_9394_d > 0) {
				double d1 = posX + (field_9393_e - posX) / field_9394_d;
				double d5 = posY + (field_9392_f - posY) / field_9394_d;
				double d9 = posZ + (field_9391_g - posZ) / field_9394_d;
				double d12;
				for (d12 = field_9390_h - rotationYaw; d12 < -180D; d12 += 360D) {
				}
				for (; d12 >= 180D; d12 -= 360D) {
				}
				rotationYaw += d12 / field_9394_d;
				rotationPitch += (field_9389_i - rotationPitch) / field_9394_d;
				field_9394_d--;
				setPosition(d1, d5, d9);
				setRotation(rotationYaw, rotationPitch);
			}
			else {
				double d2 = posX + motionX;
				double d6 = posY + motionY;
				double d10 = posZ + motionZ;
				setPosition(d2, d6, d10);
				if (onGround) {

				}
				motionX *= 0.99000000953674316D;
				// motionY *= 0.94999998807907104D;
				motionZ *= 0.99000000953674316D;
			}
			return;
		}
		double d7 = 0.20000000000000002D;
		if (motionX < -d7) {
			motionX = -d7;
		}
		if (motionX > d7) {
			motionX = d7;
		}
		if (motionZ < -d7) {
			motionZ = -d7;
		}
		if (motionZ > d7) {
			motionZ = d7;
		}
		if (onGround) {
		}
		if (rand.nextInt(4) == 0 && fuel > 0) {
			fuel--;
			this.dataWatcher.updateObject(20, fuel);
		}
		if (fuel <= 0) {
			motionX *= 0.3;
			motionZ *= 0.3;
		}
		//TODO This is what allows the entity to climb any height, a better system should be created...
		if (this.isCollidedHorizontally) {

			motionY = 0.051;
		}
		else {
			double d3 = d * 2D - 1.0D;
			motionY += 0.039999999105930328D * d3;
		}

		motionX *= 0.7400000953674316D;
		motionY *= 0.94999998807907104D;
		motionZ *= 0.7400000953674316D;

		moveEntity(motionX, motionY, motionZ);

		/* This is how the entity rotates with the look of the player */
		if (getFuel() > 0 && riddenByEntity != null && riddenByEntity instanceof EntityPlayer) {
			Vec3 vecLook = ((EntityPlayer) riddenByEntity).getLook(2);// .addVector(posX, posY, posZ);
			double da = rotationYaw;
			double db = 0 - vecLook.xCoord;
			double dc = 0 - vecLook.zCoord;
			if (db * db + dc * dc > 0.0000001D) {
				da = (float) ((Math.atan2(dc, db) * 180D) / 3.1415926535897931D);
			}

			double d19;
			for (d19 = da - (double) rotationYaw; d19 >= 180D; d19 -= 360D) {
			}
			for (; d19 < -180D; d19 += 360D) {
			}
			if (d19 > 20D) {
				d19 = 20D;
			}
			if (d19 < 0 && d19 > 0) {
				d19 = 0;
			}
			if (d19 > -0 && d19 < 0) {
				d19 = 0;
			}
			if (d19 < -20D) {
				d19 = -20D;
			}

			double rot = rotationYaw;

			rot += d19 * 0.2;

			//deactivate this line for test purpose
			setRotation((float) rot, rotationPitch);
		}

		setRotation(rotationYaw, rotationPitch);
		List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.expand(0.20000000298023224D, 0.0D, 0.20000000298023224D));
		if (list != null && list.size() > 0) {
			for (int j1 = 0; j1 < list.size(); j1++) {
				Entity entity = (Entity) list.get(j1);
				if (entity != riddenByEntity && entity.canBePushed() && !(entity instanceof EntityRotativeWheel)) {
					entity.applyEntityCollision(this);
				}
			}

		}
		if (riddenByEntity != null && riddenByEntity.isDead) {
			riddenByEntity = null;
		}

		if (Math.sqrt((motionX * motionX) + (motionZ * motionZ)) > 0.01) {
			Vec3 pos = Vec3.createVectorHelper(posX, posY - 1, posZ);
			Block id = worldObj.getBlock((int) posX, (int) posY - 1, (int) posZ);
			if (id != null) {
				this.playMiningEffect(pos, Block.getIdFromBlock(id));
			}
		}
	}

	/**
	 * Spawn breaking particles for blockparticles
	 * 
	 * @param pos position
	 * @param block_index index of the block in mining list
	 */

	private void playMiningEffect(Vec3 pos, int block_index) {
		Block id = worldObj.getBlock((int) pos.xCoord, (int) pos.yCoord, (int) pos.zCoord);
		Block block = id;
		if (block != null) {
			Minecraft.getMinecraft().effectRenderer.addBlockHitEffects((int) pos.xCoord, (int) pos.yCoord, (int) pos.zCoord, block_index < 4 ? getSideFromYaw() : (block_index < 6 ? 1 : 0));
		}
	}

	/**
	 * Convert "rotation yaw" angle to block side index.
	 * 
	 * @return block side for particles
	 */
	private int getSideFromYaw() {
		if (rotationYaw == 0) {
			return 5;
		}
		if (rotationYaw == 90) {
			return 3;
		}
		if (rotationYaw == 180) {
			return 4;
		}
		if (rotationYaw == 270) {
			return 2;
		}
		return 1;
	}

	@Override
	public boolean shouldRiderSit() {
		return false;
	}

	@Override
	public void updateRiderPosition() {
		if (riddenByEntity == null) {
			return;
		}
		else {

			riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 1.1F, posZ);
			if (riddenByEntity instanceof EntityLiving) {
				pitch = ((EntityPlayer) riddenByEntity).rotationPitch;
				if (pitch > Math.toDegrees(pitchLimits))
					pitch = (float) Math.toDegrees(pitchLimits);
				if (pitch < Math.toDegrees(-pitchLimits))
					pitch = (float) Math.toDegrees(-pitchLimits);
			}

			return;
		}
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		nbttagcompound.setShort("Fuel", (short) fuel);
		NBTTagList nbttaglist = new NBTTagList();
		for (int i = 0; i < zeppInvent.length; i++) {
			if (zeppInvent[i] != null) {
				NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Slot", (byte) i);
				zeppInvent[i].writeToNBT(nbttagcompound1);
				nbttaglist.appendTag(nbttagcompound1);
			}
		}
		nbttagcompound.setTag("Items", nbttaglist);
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		fuel = nbttagcompound.getShort("Fuel");
		NBTTagList nbttaglist = nbttagcompound.getTagList("Items", Constants.NBT.TAG_COMPOUND);
		zeppInvent = new ItemStack[getSizeInventory()];
		for (int i = 0; i < nbttaglist.tagCount(); i++) {
			NBTTagCompound nbttagcompound1 = (NBTTagCompound) nbttaglist.getCompoundTagAt(i);
			int j = nbttagcompound1.getByte("Slot") & 0xff;
			if (j >= 0 && j < zeppInvent.length) {
				zeppInvent[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
			}
		}
	}

	@Override
	public float getShadowSize() {
		return 0.0F;
	}

	@Override
	public int getSizeInventory() {
		return inventorySize;
	}

	@Override
	public ItemStack getStackInSlot(int i) {
		return zeppInvent[i];
	}

	/**
	 * works exactly like getStackInSlot, is only used upon closing GUIs
	 */
	@Override
	public ItemStack getStackInSlotOnClosing(int par1) {
		if (this.zeppInvent[par1] != null) {
			ItemStack var2 = this.zeppInvent[par1];
			this.zeppInvent[par1] = null;
			return var2;
		}
		else {
			return null;
		}
	}

	@Override
	public ItemStack decrStackSize(int i, int j) {

		if (zeppInvent[i] != null) {
			if (zeppInvent[i].stackSize <= j) {
				ItemStack itemstack = zeppInvent[i];
				zeppInvent[i] = null;
				return itemstack;
			}
			ItemStack itemstack1 = zeppInvent[i].splitStack(j);
			if (zeppInvent[i].stackSize == 0) {
				zeppInvent[i] = null;
			}
			return itemstack1;
		}
		else {
			return null;
		}

	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) {

		zeppInvent[i] = itemstack;
		if (itemstack != null && itemstack.stackSize > getInventoryStackLimit()) {
			itemstack.stackSize = getInventoryStackLimit();
		}
		if (itemstack != null && itemstack.getItem() == Items.coal && i == 0 && riddenByEntity != null && (riddenByEntity instanceof EntityPlayer)) {
			// ((EntityPlayer)riddenByEntity).func_25046_a(Train.field_27542_startTrain, 1);
		}

	}

	@Override
	public String getInventoryName() {
		return "Rotative Digger";
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	public boolean isFuelled() {
		return getFuel() > 0;
	}

	public int c(int i) {
		return (getFuel() * i) / 1000;
	}

	@Override
	public void markDirty() {}

	public int getFuel() {
		return (this.dataWatcher.getWatchableObjectInt(20));
	}

	public int getStart() {
		return (this.dataWatcher.getWatchableObjectInt(21));
	}

	boolean ImIn = false;// changed
	ItemStack itemstack;

	@Override
	public boolean interactFirst(EntityPlayer entityplayer) {
		itemstack = entityplayer.inventory.getCurrentItem();

		if (riddenByEntity != null && (riddenByEntity instanceof EntityPlayer) && riddenByEntity != entityplayer) {

			return true;
		}

		/* This is a temporary fix for testing purpose Or maybe not. Does this thing really needs a GUI? */
		ItemStack var2 = entityplayer.inventory.getCurrentItem();

		if (var2 != null && var2.getItem() == ItemIDs.refinedFuel.item) {
			if (--var2.stackSize == 0) {
				entityplayer.inventory.setInventorySlotContents(entityplayer.inventory.currentItem, (ItemStack) null);
			}

			this.fuel += 3600;
			this.dataWatcher.updateObject(20, fuel);
			return true;
		}

		if (!worldObj.isRemote) {
			entityplayer.mountEntity(this);
		}

		return true;
	}

	@Override
	public void openInventory() {}

	@Override
	public void closeInventory() {}

	@Override
	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		if (isDead) {
			return false;
		}
		return entityplayer.getDistanceSqToEntity(this) <= 64D;
	}

	@Override
	public boolean hasCustomInventoryName() {
		return false;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}
}
