package train.common.api;

import java.util.List;

import mods.railcraft.api.carts.IMinecart;
import mods.railcraft.api.carts.IRoutableCart;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import train.common.items.ItemTCRail;
import train.common.library.BlockIDs;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailGag;

import com.mojang.authlib.GameProfile;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityBogie extends EntityMinecart implements IMinecart, IRoutableCart {

	public boolean isOnRail;
	public float prevDpdx;
	public float prevDpdz;
	public World worldObj;
	public int meta;
	public EntityRollingStock entityMainTrain;
	public int entityMainTrainID;
	protected int bogieIndex;
	public double bogieShift;
	protected Side side;


	public EntityBogie(World world) {

		super(world);

		this.isOnRail = false;
		this.prevDpdx = 0F;
		this.prevDpdz = 0F;
		this.worldObj = world;

		if (entityMainTrain != null) {

			setSize(entityMainTrain.width, entityMainTrain.height);
		}
		else {

			setSize(0.98F, 1.98F);
		}

		//this.boundingBox.offset(0, 0.5, 0);
		setCollisionHandler(null);
		this.yOffset = 0.65f;
		//this.setSize(0.1F, 1.98F);
		this.side = FMLCommonHandler.instance().getEffectiveSide();
	}

	public EntityBogie(World world, double d, double d1, double d2, EntityRollingStock mainTrain, int id, int index, double bogieShift) {

		this(world);

		this.entityMainTrain = mainTrain;
		this.motionX = 0.0D;
		this.motionY = 0.0D;
		this.motionZ = 0.0D;
		this.prevPosX = d;
		this.prevPosY = d1;
		this.prevPosZ = d2;
		this.entityMainTrainID = id;
		this.bogieIndex = index;
		this.bogieShift = bogieShift;
		this.setPosition(d, d1 + this.yOffset, d2);
	}

	@Override
	public boolean canBePushed() {

		return false;
	}

	/**
	 * Returns a boundingBox used to collide the entity with other entities and blocks. This enables the entity to be pushable on contact, like boats or minecarts.
	 */
	@Override
	public AxisAlignedBB getCollisionBox(Entity par1Entity) {

		return null;
	}

	@Override
	public boolean attackEntityFrom(DamageSource damageSource, float f) {

		if (this.entityMainTrain != null) {

			return entityMainTrain.attackEntityFrom(damageSource, f);
		}

		return false;
	}

	@Override
	public void applyEntityCollision(Entity entity) {

		if (this.entityMainTrain != null && entity != this.entityMainTrain) {

			this.entityMainTrain.applyEntityCollision(entity);
		}
	}

	public void updateDistance() {
		float dx = (float) (this.posX - entityMainTrain.posX);
		float dz = (float) (this.posZ - entityMainTrain.posZ);
		float angle = (float) Math.toDegrees(Math.atan2(dz, dx)) - 90F;
		angle = MathHelper.wrapAngleTo180_float(angle);
		float serverRealRotation = angle;
		//System.out.println("distance "+Math.sqrt(dx*dx+dz*dz)+" "+this.entityMainTrain);
		//
		//		double rads = serverRealRotation * Math.PI / 180.0D;
		//		double pitchRads = entityMainTrain.serverRealPitch * Math.PI / 180.0D;
		//		double cos = Math.cos(rads);
		//		double sin = Math.sin(rads);
		//this.setPosition((entityMainTrain.posX - Math.cos(rads) * this.bogieShift), entityMainTrain.posY + ((Math.tan(pitchRads) * -this.bogieShift)+ entityMainTrain.getMountedYOffset()), (entityMainTrain.posZ - Math.sin(rads) * this.bogieShift));
		//this.bogieLoco[i] = new EntityBogie(worldObj, (posX - Math.cos(rads) * this.bogieShift), posY + ((Math.tan(pitchRads) * -this.bogieShift) + getMountedYOffset()), (posZ - Math.sin(rads) * this.bogieShift), this, this.ID, i, this.bogieShift[i]);
		//System.out.println("sin "+ sin);
		//System.out.println("cos "+ cos);
		//if (cos==-1)cos=0;
		//System.out.println("shift "+bogieShift);
		//System.out.println(this.posZ +" Z "+  (posZ - (sin * this.bogieShift)));
		//System.out.println(this.posX +" X "+  (posX - (cos * this.bogieShift)));
		float rotationCos1 = (float) Math.cos(Math.toRadians(serverRealRotation + 90));
		float rotationSin1 = (float) Math.sin(Math.toRadians((serverRealRotation + 90)));
		//float anglePitchClient = serverRealPitch*60;
		double bogieX1 = (entityMainTrain.posX + (rotationCos1 * Math.abs(this.bogieShift)));
		double bogieZ1 = (entityMainTrain.posZ + (rotationSin1 * Math.abs(this.bogieShift)));
		/*System.out.println("rotation "+serverRealRotation);
		System.out.println(this.posZ +" Z "+  bogieZ1);
		System.out.println(this.posX +" X "+  bogieX1);
		System.out.println(this.posX +" X "+  bogieX1);*/
		this.setPosition(bogieX1, this.posY, bogieZ1);


		//		double d = entityMainTrain.posX - this.posX;
		//		double d1 = entityMainTrain.posZ - this.posZ;
		//		double d2 = MathHelper.sqrt_double((d * d) + (d1 * d1));
		//
		//		double vecX = entityMainTrain.posX - this.posX;
		//		double vecZ = entityMainTrain.posZ - this.posZ;
		//
		//		double vecNorm = MathHelper.sqrt_double(vecX * vecX + vecZ * vecZ);
		//
		//		double unitX = vecX / vecNorm;
		//		double unitZ = vecZ / vecNorm;
		//
		//		float optDist = (float) -bogieShift;
		//		double stretch = d2 - optDist;
		//
		//		double div = spring();
		//		if (Math.sqrt(entityMainTrain.motionX * entityMainTrain.motionX + entityMainTrain.motionZ * entityMainTrain.motionZ) < 0.17) {
		//			div = 0.049;
		//		}
		//		double springX = div * stretch * vecX * -1;
		//		double springZ = div * stretch * vecZ * -1;
		//
		//		springX = limitForce(springX);
		//		springZ = limitForce(springZ);
		//
		//		/* if (adj1) { ((AbstractTrains) cart1).motionX += springX; ((AbstractTrains) cart1).motionZ += springZ; }
		//		if (adj2) {
		//		System.out.println(entityMainTrain.motionX + " " + entityMainTrain.motionZ);
		//		System.out.println(Math.sqrt(entityMainTrain.motionX*entityMainTrain.motionX + entityMainTrain.motionZ*entityMainTrain.motionZ));
		//
		//		if (Math.abs(entityMainTrain.motionX) > 0.003 || Math.abs(entityMainTrain.motionZ) > 0.003) {
		//			this.motionX -= springX;
		//			this.motionZ -= springZ;
		//		}
		//		else {
		//			this.motionX = 0;
		//			this.motionZ = 0;
		//			entityMainTrain.motionX = 0;
		//			entityMainTrain.motionZ = 0;
		//		}*/
		//		this.motionX -= springX;
		//		this.motionZ -= springZ;
		//		double speedVecX = entityMainTrain.motionX - this.motionX;
		//		double speedVecZ = entityMainTrain.motionZ - this.motionZ;
		//
		//		double dot = speedVecX * unitX + speedVecZ * unitZ;
		//
		//		double divider = damp();
		//		if (Math.sqrt(entityMainTrain.motionX * entityMainTrain.motionX + entityMainTrain.motionZ * entityMainTrain.motionZ) < 0.017) {
		//			divider = 0.2;
		//		}
		//		double dampX = divider * dot * unitX * -1;// 0.4
		//		double dampZ = divider * dot * unitZ * -1;
		//
		//		dampX = limitForce(dampX);
		//		dampZ = limitForce(dampZ);
		//		this.motionX -= dampX;
		//		this.motionZ -= dampZ;
		/*
		 * if (adj1) { ((AbstractTrains) cart1).motionX += dampX; ((AbstractTrains) cart1).motionZ += dampZ; }
		if (adj2) {
		if (Math.abs(entityMainTrain.motionX) > 0.003 || Math.abs(entityMainTrain.motionZ) > 0.003) {
			this.motionX -= dampX;
			this.motionZ -= dampZ;
		}
		else {
			this.motionX = 0;
			this.motionZ = 0;
			entityMainTrain.motionX = 0;
			entityMainTrain.motionZ = 0;
		}
		}*/
	}

	protected double spring() {

		return 0.25D; //0.2499999761581421D; // For sanity's sake..
	}

	protected double damp() {

		return 0.4D; //0.4000000059604645D;
	}

	protected double limitForce(double force) {

		return Math.copySign(Math.abs(Math.min(Math.abs((double) force), 6.0D)), (double) force);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public float getShadowSize() {

		return this.height / 2.0F;
	}

	@Override
	public boolean interactFirst(EntityPlayer entityplayer) {

		if (this.entityMainTrain != null) {

			this.entityMainTrain.interactFirst(entityplayer);
		}

		return true;
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {

		this.entityMainTrainID = nbttagcompound.getInteger("trainID");
		this.bogieIndex = nbttagcompound.getInteger("bogieIndex");
		this.bogieShift = nbttagcompound.getDouble("bogieShift");

		super.readEntityFromNBT(nbttagcompound);
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {

		nbttagcompound.setInteger("trainID", entityMainTrainID);
		nbttagcompound.setInteger("bogieIndex", bogieIndex);
		nbttagcompound.setDouble("bogieShift", bogieShift);

		super.writeEntityToNBT(nbttagcompound);
	}

	@Override
	public int getMinecartType() {

		return -1;
	}

	@Override
	public String getDestination() {

		if (this.entityMainTrain != null) {

			return this.entityMainTrain.getDestination();
		}

		return null;
	}

	@Override
	public boolean setDestination(ItemStack ticket) {

		if (this.entityMainTrain != null) {

			return this.entityMainTrain.setDestination(ticket);
		}

		return false;
	}

	@Override
	public boolean doesCartMatchFilter(ItemStack stack, EntityMinecart cart) {

		return false;
	}

	/**
	 * Return false if this cart should not call onMinecartPass() and should ignore Powered Rails.
	 *
	 * @return True if this cart should call onMinecartPass().
	 */
	@Override
	public boolean shouldDoRailFunctions() {

		return false;
	}

	@Override
	public double getSlopeAdjustment() {

		return 0;
	}

	/**
	 * Returns the carts max speed when traveling on rails. Carts going faster than 1.1 cause issues with chunk loading. Carts cant traverse slopes or corners at greater than 0.5 - 0.6. This value is compared with the rails max speed and the carts current speed cap to determine the carts current max speed. A normal rail's max speed is 0.4.
	 *
	 * @return Carts max speed.
	 */
	@Override
	public float getMaxCartSpeedOnRail() {

		return 1.8f;
	}

	@Override
	protected void func_145821_a(int x, int y, int z, double maxSpeed, double slopeAdjustment, Block block, int railMeta) {

		super.func_145821_a(x, y, z, this.getMaxCartSpeedOnRail(), slopeAdjustment, block, railMeta);
	}
	/**
	 * Called to update the entity's position/logic.
	 */
	@Override
	public void onUpdate(){

		//super.onUpdate(); // XXX I'll just assume that this is not supposed to be there. Why would you run Vanilla update code, only to run your own code afterwards to do basically the same..?

		this.setCurrentCartSpeedCapOnRail(1.8F);
		this.setMaxSpeedAirLateral(1.8F);

		if (!this.worldObj.isRemote) {

			this.prevPosX = this.posX;
			this.prevPosY = this.posY;
			this.prevPosZ = this.posZ;

			int i = MathHelper.floor_double(this.posX);
			int j = MathHelper.floor_double(this.posY);
			int k = MathHelper.floor_double(this.posZ);
			Block block = this.worldObj.getBlock(i, j - 1, k);

			if (BlockRailBase.func_150051_a(block) || block == BlockIDs.tcRail.block || block == BlockIDs.tcRailGag.block) {

				j--;
			}
			else {

				block = this.worldObj.getBlock(i, j, k);
			}

			if (BlockRailBase.func_150051_a(block)) {

				super.onUpdate();
			}
			else {

				TileEntity tileEntity = this.worldObj.getTileEntity(i, j, k);
				TileTCRail tileRail;

				if (block == BlockIDs.tcRailGag.block) {

					if (tileEntity instanceof TileTCRailGag) {

						TileTCRailGag tileGag = (TileTCRailGag) tileEntity;
						tileEntity = this.worldObj.getTileEntity(tileGag.originX, tileGag.originY, tileGag.originZ);
					}
					else {

						return;
					}
				}

				if (tileEntity instanceof TileTCRail) {

					tileRail = (TileTCRail) tileEntity;
				}
				else {

					return;
				}

				//applyDragAndPushForces();
				limitSpeedOnTCRail(i, j, k);

				if (ItemTCRail.isTCTurnTrack(tileRail)) {

					int meta = tileRail.getBlockMetadata();

					shouldIgnoreSwitch(tileRail, i, j, k, meta);
					moveOnTC90TurnRail(i, j, k, tileRail.r, tileRail.cx, tileRail.cy, tileRail.cz, tileRail.getType(), meta);
				}

				if (ItemTCRail.isTCStraightTrack(tileRail)) {

					moveOnTCStraight(i, j, k, tileRail.xCoord, tileRail.yCoord, tileRail.zCoord, tileRail.getBlockMetadata());
				}

				if (ItemTCRail.isTCTwoWaysCrossingTrack(tileRail)) {

					moveOnTCTwoWaysCrossing(i, j, k, tileRail.xCoord, tileRail.yCoord, tileRail.zCoord, tileRail.getBlockMetadata());
				}

				if (ItemTCRail.isTCSlopeTrack(tileRail)) {

					moveOnTCSlope(i, j, k, tileRail.xCoord, tileRail.yCoord, tileRail.zCoord, tileRail.slopeAngle, tileRail.slopeHeight, tileRail.slopeLength, tileRail.getBlockMetadata());
				}
			}

			this.func_145775_I();
			this.rotationPitch = 0.0F;
		}

		if (this instanceof EntityBogieUtility) {

			return;
		}

		if (!this.worldObj.isRemote) {

			if(this.entityMainTrain == null) {

				this.setDead();
			}

			AxisAlignedBB axisAlignedBB;

			if (getCollisionHandler() != null) {

				axisAlignedBB = getCollisionHandler().getMinecartCollisionBox(this);
			}
			else {

				axisAlignedBB = this.boundingBox.expand(0.2D, 0.0D, 0.2D);
			}

			@SuppressWarnings("rawtypes")
			List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, axisAlignedBB);

			if (list != null && !list.isEmpty()) {

				Entity entity;

				for(int i = 0; i < list.size(); ++i) {

					entity = (Entity) list.get(i);

					if (entity != this.riddenByEntity) {

						this.applyEntityCollision(entity);
					}
				}
			}
		}
	}

	protected void moveOnTCStraight(int i, int j, int k, double cx, double cy, double cz, int meta){

		this.posY = j + 0.2D;

		if (meta % 2 == 0) {

			double norm = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);

			this.setPosition(cx + 0.5D, this.posY + this.yOffset, this.posZ);
			this.moveEntity(0.0D, 0.0D, Math.copySign(Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ), this.motionZ));

			this.motionX = 0.0D;
			this.motionZ = Math.copySign(norm, this.motionZ);
		}
		else {

			double norm = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);

			this.setPosition(this.posX, this.posY + this.yOffset, cz + 0.5D);
			this.moveEntity(Math.copySign(norm, this.motionX), 0.0D, 0.0D);

			this.motionX = Math.copySign(norm, this.motionX);
			this.motionZ = 0.0D;
		}
	}

	protected void moveOnTCTwoWaysCrossing(int i, int j, int k, double cx, double cy, double cz, int meta){

		this.posY = j + 0.2D;

		//System.out.println(l);
		//if(l==2||l==0)moveEntity(motionX, 0.0D, 0.0D);
		//if(l==1||l==3)moveEntity(0.0D, 0.0D, motionZ);
		//if(Math.abs(motionX)>Math.abs(motionZ))System.out.println("X");
		//if(Math.abs(motionZ)>Math.abs(motionX))System.out.println("Z");

		if ((MathHelper.floor_double((double) (this.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) % 2 == 0) {

			double norm = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);

			this.setPosition(this.posX, this.posY + this.yOffset, cz + 0.5);
			this.moveEntity(Math.copySign(norm, this.motionX), 0.0D, 0.0D);

			this.motionX = Math.copySign(norm, this.motionX);
			this.motionZ = 0.0D;
		}
		else {

			double norm = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);

			this.setPosition(cx + 0.5D, this.posY + this.yOffset, this.posZ);
			this.moveEntity(0.0D, 0.0D, Math.copySign(norm, this.motionZ));

			this.motionX = 0.0D;
			this.motionZ = Math.copySign(norm, this.motionZ);
		}

	}
	protected void moveOnTCSlope(int i, int j, int k, double cx, double cy, double cz, double slopeAngle, double slopeHeight, double slopeLength, int meta) {

		if (Math.abs(this.motionX) > 0.3D) {

			this.motionX = Math.copySign(0.3D, this.motionX);

			if (this.entityMainTrain != null) {

				this.entityMainTrain.motionX = Math.copySign(0.3D, this.entityMainTrain.motionX);
			}
		}

		if (Math.abs(this.motionZ) > 0.3D) {

			this.motionZ = Math.copySign(0.3D, this.motionZ);

			if (this.entityMainTrain != null) {

				this.entityMainTrain.motionZ = Math.copySign(0.3D, this.entityMainTrain.motionZ);
			}
		}

		this.posY = j + 0.2D;

		if (meta == 2 || meta == 0) {

			if (meta == 2) {

				cz += 1;
			}

			double norm = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
			double newPosY = (j + Math.abs(Math.tan(slopeAngle * Math.abs(cz - this.posZ))) + this.yOffset + 0.2D);
			double maxPosY = (j + this.yOffset + 0.25D + slopeHeight);

			if (newPosY > maxPosY) {

				newPosY = maxPosY;
			}

			this.setPosition(cx + 0.5D, newPosY, this.posZ);
			this.moveEntity(0.0D, 0.0D, Math.copySign(norm, this.motionZ));

			this.motionX = 0.0D;
			this.motionY = 0.0D;
			this.motionZ = Math.copySign(norm, this.motionZ);
		}
		else if (meta == 1 || meta == 3) {

			if (meta == 1) {

				cx += 1;
			}

			double norm = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
			double newPosY = (j + Math.abs(Math.tan(slopeAngle * Math.abs(cx - this.posX))) + this.yOffset + 0.2D);
			double maxPosY = (j + this.yOffset + 0.25D + slopeHeight);

			if (newPosY > maxPosY) {

				newPosY = maxPosY;
			}

			this.setPosition(this.posX, newPosY, cz + 0.5D);
			this.moveEntity(Math.copySign(norm, this.motionX), 0.0D, 0.0D);

			this.motionX = Math.copySign(norm, this.motionX);
			this.motionY = 0.0D;
			this.motionZ = 0.0D;
		}
	}

	protected void moveOnTC90TurnRail(int i, int j, int k, double r, double cx, double cy, double cz, String type, int meta){
		posY = j + 0.2;
		double cpx = posX - cx;
		double cpz = posZ - cz;
		double cp_norm = Math.sqrt(cpx * cpx + cpz * cpz);

		double vnorm = Math.sqrt(motionX * motionX + motionZ * motionZ);

		double norm_cpx = cpx / cp_norm;//u
		double norm_cpz = cpz / cp_norm;//v

		double vx2 = -norm_cpz * vnorm;//-v
		double vz2 = norm_cpx * vnorm;//u

		double px2 = posX + motionX;
		double pz2 = posZ + motionZ;

		double px2_cx = px2 - cx;
		double pz2_cz = pz2 - cz;

		double p2_c_norm = Math.sqrt((px2_cx * px2_cx) + (pz2_cz * pz2_cz));

		double px2_cx_norm = px2_cx / p2_c_norm;
		double pz2_cz_norm = pz2_cz / p2_c_norm;

		double px3 = cx + (px2_cx_norm * r);
		double pz3 = cz + (pz2_cz_norm * r);

		double signX = px3 - posX;
		double signZ = pz3 - posZ;

		vx2 = Math.copySign(vx2, signX);
		vz2 = Math.copySign(vz2, signZ);

		double p_corr_x = cx + ((cpx / cp_norm) * r);
		double p_corr_z = cz + ((cpz / cp_norm) * r);

		setPosition(p_corr_x, posY + yOffset, p_corr_z);

		moveEntity(vx2, 0.0D, vz2);
		motionX = vx2;
		motionZ = vz2;
	}

	private boolean shouldIgnoreSwitch(TileTCRail tile, int x, int y, int z, int meta) {

		if (tile != null && (ItemTCRail.TrackTypes.MEDIUM_RIGHT_TURN.getLabel().equals(tile.getType()) || ItemTCRail.TrackTypes.MEDIUM_LEFT_TURN.getLabel().equals(tile.getType())) && tile.canTypeBeModifiedBySwitch) {

			if (meta >= 0 && meta <= 3) {

				// TODO Re-activate if needed.
				//moveOnTCStraight(x, y, z, tile.xCoord, tile.yCoord, tile.zCoord, meta);
				tile.setType(ItemTCRail.TrackTypes.SMALL_STRAIGHT.getLabel());

				TileEntity tile2 = null;

				switch (meta) {

					case 0:
						if (this.motionZ < 0.0D && Math.abs(this.motionX) < 0.01D) {

							tile2 = this.worldObj.getTileEntity(x, y, z - 1);
						}
						break;

					case 1:
						if (Math.abs(this.motionZ) < 0.01D && this.motionX > 0.0D) {

							tile2 = this.worldObj.getTileEntity(x + 1, y, z);
						}
						break;

					case 2:
						if (this.motionZ > 0.0D && Math.abs(this.motionX) < 0.01D) {

							tile2 = this.worldObj.getTileEntity(x, y, z + 1);
						}
						break;

					case 3:
						if (Math.abs(this.motionZ) < 0.01D && this.motionX < 0.0D) {

							tile2 = this.worldObj.getTileEntity(x - 1, y, z);
						}
						break;
				}

				if (tile2 instanceof TileTCRail) {

					((TileTCRail) tile2).setSwitchState(false, true);
				}

				return true;
			}
		}

		return false;
	}

	public void limitSpeedOnTCRail(int x, int y, int z) {

		/*
		Block id = worldObj.getBlock(x, y, z);

		if (!BlockRailBase.isRailBlock(id)) {

			return;
		}

		railMaxSpeed = ((BlockRailBase) Block.blocksList[id]).getRailMaxSpeed(worldObj, this, x, y, z);
		 */

		//double railMaxSpeed = 3; // XXX Really? Define a field for THAT? Come on..
		double maxSpeed = Math.min(3.0D, getMaxCartSpeedOnRail());

		if (this.motionX < -maxSpeed) {

			this.motionX = -maxSpeed;
		}
		else if (this.motionX > maxSpeed) {

			this.motionX = maxSpeed;
		}

		if (this.motionZ < -maxSpeed) {

			this.motionZ = -maxSpeed;
		}
		else if (this.motionZ > maxSpeed) {

			this.motionZ = maxSpeed;
		}
	}

	@Override
	public GameProfile getOwner() {

		return  this.entityMainTrain.getOwner();
	}
}