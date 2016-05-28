package train.common.entity.digger;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockTorch;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import train.common.core.FakePlayer;

import java.util.List;

public class EntityRotativeWheel extends Entity {

	/** For the driver seat position */

	public double seatX;
	public double seatY;
	public double seatZ;
	public double riderOffset;
	public int seatID;
	public Entity entity;
	/** Fake player instance used for block mining */
	private EntityPlayer fakePlayer;
	public int startWheel;
	private int field_9394_d;

	public EntityRotativeWheel(World world) {
		super(world);
		riderOffset = 0;
		setSize(1F, 1F);

		// noClip=true;
		preventEntitySpawning = false;
		isImmuneToFire = true;
		fakePlayer = new FakePlayer(world);
		this.dataWatcher.addObject(21, new Integer(startWheel));
	}

	/**
	 * 
	 * @param world
	 * @param entity
	 * @param numSeat
	 * @param x
	 * @param y
	 * @param z
	 * @param riderOffset
	 */
	public EntityRotativeWheel(World world, Entity entity, int numSeat, double x, double y, double z, double riderOffset) {
		this(world);
		this.entity = entity;
		this.seatID = numSeat;
		this.seatX = x;
		this.seatY = y;
		this.seatZ = z;
		this.riderOffset = riderOffset;

	}

	@Override
	protected void entityInit() {
		// TODO Auto-generated method stub

	}
	@Override
	public boolean canBeCollidedWith() {
		return !isDead;
	}
	@Override
	public void onUpdate() {

		if (entity != null && entity instanceof EntityRotativeDigger) {
			startWheel = ((EntityRotativeDigger) entity).getStart();
			this.dataWatcher.updateObject(21, startWheel);

		}
		if (fakePlayer == null && worldObj != null)
			fakePlayer = new FakePlayer(worldObj);

		List listLiving = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.expand(0.4, 0.4, 0.4));
		if (listLiving != null && listLiving.size() > 0 && entity != null && entity instanceof EntityRotativeDigger && ((EntityRotativeDigger) entity).getFuel() > 0) {//&& ((EntityRotativeDigger) entity).start){

			for (int j1 = 0; j1 < listLiving.size(); j1++) {
				float f3 = 0.05F;
				double X = (float) rand.nextGaussian() * f3;
				double Y = (float) rand.nextGaussian() * f3 + 0.2F;
				double Z = (float) rand.nextGaussian() * f3;

				Entity entity = (Entity) listLiving.get(j1);
				if (entity instanceof EntityRotativeDigger) {
					// do not affect
				}
				else if (entity instanceof EntityLiving) {
					entity.attackEntityFrom(DamageSource.generic, 4);
					entity.addVelocity(X, Y, Z);

				}
				else {
					entity.addVelocity(X, Y, Z);// for items on ground
				}

			}
		}
		if (entity != null && entity instanceof EntityRotativeDigger && ((EntityRotativeDigger) entity).getFuel() > 0) {//TODO should only dig when rotative digger has fuel and dig mode is on, doesn't work yet
			Vec3 vec = null;

			vec = Vec3.createVectorHelper(posX - 0.5, posY, posZ - 0.5);

			this.harvestBlock_do(vec);
			//TODO how many blocks should be harvested?
			/*for (int h = -1; h < 2; h++) { vec = Vec3.vec3dPool.getVecFromPool(posX, posY + h, posZ); this.harvestBlock_do(vec); vec = Vec3.vec3dPool.getVecFromPool(posX + 1, posY + h, posZ); this.harvestBlock_do(vec); vec = Vec3.vec3dPool.getVecFromPool(posX - 1, posY + h, posZ); this.harvestBlock_do(vec); vec = Vec3.vec3dPool.getVecFromPool(posX, posY + h, posZ - 1); this.harvestBlock_do(vec); vec = Vec3.vec3dPool.getVecFromPool(posX, posY + h, posZ + 1); this.harvestBlock_do(vec); vec = Vec3.vec3dPool.getVecFromPool(posX + 1, posY + h, posZ - 1); this.harvestBlock_do(vec); vec = Vec3.vec3dPool.getVecFromPool(posX - 1, posY + h, posZ + 1); this.harvestBlock_do(vec); vec = Vec3.vec3dPool.getVecFromPool(posX - 1, posY + h, posZ - 1); this.harvestBlock_do(vec); vec = Vec3.vec3dPool.getVecFromPool(posX + 1, posY + h, posZ + 1); this.harvestBlock_do(vec);
			 * 
			 * } */

		}
		if (worldObj.isRemote) {
			if (field_9394_d > 0) {
				double d1 = posX + (field_9393_e - posX) / (double) field_9394_d;
				double d5 = posY + (field_9392_f - posY) / (double) field_9394_d;
				double d9 = posZ + (field_9391_g - posZ) / (double) field_9394_d;
				double d12;
				for (d12 = field_9390_h - (double) rotationYaw; d12 < -180D; d12 += 360D) {
				}
				for (; d12 >= 180D; d12 -= 360D) {
				}
				rotationYaw += d12 / (double) field_9394_d;
				rotationPitch += (field_9389_i - (double) rotationPitch) / (double) field_9394_d;
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
	}

	/**
	 * Perform block harvesting, drop the item, remove block and play sound.
	 * 
	 * @param pos
	 */

	private void harvestBlock_do(Vec3 pos) {
		if (pos == null)
			return;

		Block id = worldObj.getBlock((int) pos.xCoord, (int) pos.yCoord, (int) pos.zCoord);
		int meta = worldObj.getBlockMetadata((int) pos.xCoord, (int) pos.yCoord, (int) pos.zCoord);
		if (id != null) {
			this.playMiningEffect(pos, id);
		}

		if (!shouldIgnoreBlockForHarvesting(pos, id)) {

			if (id != null) {
				id.harvestBlock(worldObj, fakePlayer, (int) pos.xCoord, (int) pos.yCoord, (int) pos.zCoord, meta);
				worldObj.setBlock((int) pos.xCoord, (int) pos.yCoord, (int) pos.zCoord, null);

				worldObj.playAuxSFX(2001, (int) pos.xCoord, (int) pos.yCoord, (int) pos.zCoord, Block.getIdFromBlock(id) + (meta << 12));
				this.playMiningEffect(pos, id);
			}
		}

	}

	/**
	 * Check if block is unharvestable
	 * 
	 * @param pos
	 * @param id block id
	 * @return is not harvested
	 */
	private boolean shouldIgnoreBlockForHarvesting(Vec3 pos, Block id) {

		if (id == null || id instanceof BlockTorch || id == Block.getBlockFromName("bedrock") || id == Block.getBlockFromName("fire") || id == Block.getBlockFromName("portal") || id == Block.getBlockFromName("endPortal") || id instanceof BlockLiquid || Block.getIdFromBlock(id) == 55 || Block.getIdFromBlock(id) == 70 || Block.getIdFromBlock(id) == 72) {
			return true;
		}

		boolean flag = false;

		if (flag && id.getCollisionBoundingBoxFromPool(worldObj, (int) pos.xCoord, (int) pos.yCoord, (int) pos.zCoord) == null) {
			return true;
		}

		return false;

	}

	public int getStartWheel() {
		return (this.dataWatcher.getWatchableObjectInt(21));
	}

	/**
	 * Spawn breaking particles for blockparticles
	 * 
	 * @param pos position
	 * @param block_index index of the block in mining list
	 */
	private int miningTickCounter = 0;

	@SideOnly(Side.CLIENT)
	private void playMiningEffect(Vec3 pos, Block block_index) {

		miningTickCounter++;
		Block id = worldObj.getBlock((int) pos.xCoord, (int) pos.yCoord, (int) pos.zCoord);
		Block block = id;
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
	public void applyEntityCollision(Entity entity) {

	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound var1) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound var1) {
		// TODO Auto-generated method stub

	}

	@SideOnly(Side.CLIENT)
	@Override
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

	@SideOnly(Side.CLIENT)
	@Override
	public void setVelocity(double d, double d1, double d2) {
		field_9388_j = motionX = d;
		// field_9387_k = motionY = d1;
		field_9386_l = motionZ = d2;
	}

	private double field_9393_e;
	private double field_9392_f;
	private double field_9391_g;
	private double field_9390_h;
	private double field_9389_i;
	private double field_9388_j;
	private double field_9387_k;
	private double field_9386_l;

}