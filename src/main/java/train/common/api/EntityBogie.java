package train.common.api;

import com.mojang.authlib.GameProfile;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.railcraft.api.carts.IMinecart;
import mods.railcraft.api.carts.IRoutableCart;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.material.Material;
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
import train.common.blocks.BlockTCRail;
import train.common.blocks.BlockTCRailGag;
import train.common.core.util.TraincraftUtil;
import train.common.items.ItemTCRail;
import train.common.items.ItemTCRail.TrackTypes;
import train.common.library.BlockIDs;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailGag;

import java.util.List;

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


	private int turnProgress;
    private double minecartX;
    private double minecartY;
    private double minecartZ;
    private double minecartYaw;
    private double minecartPitch;
    private int i,j,k;//used for pathfinding, reduces GC overhead



	public EntityBogie(World world) {

		super(world);

		this.isOnRail = false;
		this.prevDpdx = 0F;
		this.prevDpdz = 0F;
		this.worldObj = world;

		if (entityMainTrain != null) {

			setSize(entityMainTrain.width, entityMainTrain.height);
		}

		//this.boundingBox.offset(0, 0.5, 0);
		setCollisionHandler(null);
		this.yOffset = 0.65f;
		//this.setSize(0.1F, 1.98F);
		this.side = FMLCommonHandler.instance().getEffectiveSide();

		isImmuneToFire = true;
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
		isImmuneToFire = true;
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
		return (this.entityMainTrain != null && entityMainTrain.attackEntityFrom(damageSource, f));
	}

	@Override
	public void applyEntityCollision(Entity entity) {

		if (this.entityMainTrain != null && entity != this.entityMainTrain) {

			this.entityMainTrain.applyEntityCollision(entity);
		}
	}

	public void updateDistance() {
		float angle = TraincraftUtil.atan2f((this.posZ - entityMainTrain.posZ), (this.posX - entityMainTrain.posX));
		angle %= 6.28319F;

		if (angle >= 3.14159F) {
			angle -= 6.28319F;
		}

		if (angle < -3.14159F) {
			angle += 6.28319F;
		}

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
		//float anglePitchClient = serverRealPitch*60;
		/*System.out.println("rotation "+serverRealRotation);
		System.out.println(this.posZ +" Z "+  bogieZ1);
		System.out.println(this.posX +" X "+  bogieX1);
		/*System.out.println(this.posX +" X "+  bogieX1);*/
		this.motionX = ((entityMainTrain.posX + (Math.cos(angle) * Math.abs(this.bogieShift))) - this.posX);
		this.motionZ = ((entityMainTrain.posZ + (Math.sin((angle)) * Math.abs(this.bogieShift))) - this.posZ);
		//this.setPosition(bogieX1, this.posY, bogieZ1);


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

	public boolean isOnRail(){

		Block block = this.worldObj.getBlock(MathHelper.floor_double(this.posX),
				MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ));
		
		if(block.getMaterial()== Material.air) {
			block = this.worldObj.getBlock(MathHelper.floor_double(this.posX),
					MathHelper.floor_double(this.posY)-1, MathHelper.floor_double(this.posZ));

			if(!(BlockRailBase.func_150051_a(block) || block == BlockIDs.tcRail.block || block == BlockIDs.tcRailGag.block)) {
				block = this.worldObj.getBlock(MathHelper.floor_double(this.posX),
						MathHelper.floor_double(this.posY)+1, MathHelper.floor_double(this.posZ));
			}
		}
		return (BlockRailBase.func_150051_a(block) || block == BlockIDs.tcRail.block || block == BlockIDs.tcRailGag.block);
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

		return (this.entityMainTrain != null && this.entityMainTrain.setDestination(ticket));
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
	 * Returns the carts max speed when traveling on rails. Carts going faster than 1.1 cause issues
	 * with chunk loading. This value is compared with the rails max speed and the carts current
	 * speed cap to determine the carts current max speed. A normal rail's max speed is 0.4.
	 *
	 * @return Carts max speed.
	 */
	@Override
	public float getMaxCartSpeedOnRail() {

		return 1.8f;
	}

	@Override
	protected void func_145821_a(int x, int y, int z, double maxSpeed, double slopeAdjustment, Block block, int railMeta) {
		//super.func_145821_a(x, y, z, maxSpeed, slopeAdjustment, block, railMeta);
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

			if(this.entityMainTrain == null) {
				this.setDead();
				worldObj.removeEntity(this);
			}
			
			this.prevPosX = this.posX;
			this.prevPosY = this.posY;
			this.prevPosZ = this.posZ;

			i = MathHelper.floor_double(this.posX);
			j = MathHelper.floor_double(this.posY);
			k = MathHelper.floor_double(this.posZ);
			Block block = this.worldObj.getBlock(i, j - 1, k);

			if (BlockRailBase.func_150051_a(block) || block == BlockIDs.tcRail.block || block == BlockIDs.tcRailGag.block) {
				j--;
			} else {
				block = this.worldObj.getBlock(i, j + 1, k);
				if(BlockRailBase.func_150051_a(block) || block == BlockIDs.tcRail.block || block == BlockIDs.tcRailGag.block){
					j++;
				} else {
					block = this.worldObj.getBlock(i, j, k);
				}
			}

			if (BlockRailBase.func_150051_a(block)) {
				super.onUpdate();
				this.setPosition(this.posX, this.posY + yOffset - 0.3d, this.posZ);
				// System.out.println("Server Y: " + this.posY);
			} else {
		        	TileEntity tileEntity = this.worldObj.getTileEntity(i, j, k);
		        	TileTCRail tileRail;

					if (tileEntity instanceof TileTCRailGag) {
						TileTCRailGag tileGag = (TileTCRailGag) tileEntity;
						tileEntity = this.worldObj.getTileEntity(tileGag.originX, tileGag.originY, tileGag.originZ);
					}

					if (tileEntity instanceof TileTCRail) {

						tileRail = (TileTCRail) tileEntity;
					}
					else {
						super.onUpdate();
						return;
					}

					//applyDragAndPushForces();
					limitSpeedOnTCRail();

					if (ItemTCRail.isTCTurnTrack(tileRail)) {

						int meta = tileRail.getBlockMetadata();

					if (shouldIgnoreSwitch(tileRail, i, j, k, meta)) {
						moveOnTCStraight(j, tileRail.xCoord, tileRail.zCoord, tileRail.getBlockMetadata());
					} else {
						if (ItemTCRail.isTCTurnTrack(tileRail))
							moveOnTC90TurnRail(j, tileRail.r, tileRail.cx, tileRail.cz);
					}
					
					// shouldIgnoreSwitch(tileRail, i, j, k, meta);
					// if (ItemTCRail.isTCTurnTrack(tileRail)) moveOnTC90TurnRail(i, j, k,
					// tileRail.r, tileRail.cx, tileRail.cy, tileRail.cz, tileRail.getType(), meta);
					}

					if (ItemTCRail.isTCStraightTrack(tileRail)) {

						moveOnTCStraight(j, tileRail.xCoord, tileRail.zCoord, tileRail.getBlockMetadata());
					}

					else if (ItemTCRail.isTCTwoWaysCrossingTrack(tileRail)) {

					moveOnTCTwoWaysCrossing();
					}

					else if (ItemTCRail.isTCSlopeTrack(tileRail)) {

						moveOnTCSlope(j, tileRail.xCoord, tileRail.zCoord, tileRail.slopeAngle, tileRail.slopeHeight, tileRail.getBlockMetadata());
					}
			}
			this.func_145775_I();
			this.rotationPitch = 0.0F;


			@SuppressWarnings("rawtypes")
			List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, getCollisionHandler()!=null?
					getCollisionHandler().getMinecartCollisionBox(this):
					this.boundingBox.expand(0.2D, 0.0D, 0.2D));

			if (list != null && !list.isEmpty()) {
				for(i = 0; i < list.size(); ++i) {
					this.applyEntityCollision((Entity)list.get(i));
				}
			}

		} else if (this.turnProgress > 0) {
			this.rotationYaw = (float)(this.rotationYaw + MathHelper.wrapAngleTo180_double(this.minecartYaw - this.rotationYaw) / this.turnProgress);
			this.rotationPitch = (float)(this.rotationPitch + (this.minecartPitch - this.rotationPitch) / this.turnProgress);
			--this.turnProgress;
			this.setPosition(this.posX + (this.minecartX - this.posX) / this.turnProgress
					, this.posY + (this.minecartY - this.posY) / this.turnProgress,
					this.posZ + (this.minecartZ - this.posZ) / this.turnProgress);
			this.setRotation(this.rotationYaw, this.rotationPitch);
		} else {
			this.setPosition(this.posX, this.posY, this.posZ);
			this.setRotation(this.rotationYaw, this.rotationPitch);
		}

		if (posX == 0 && posZ == 0) {
			setDead();
			worldObj.removeEntity(this);
		}
	}

	private void moveOnTCStraight(int j, double cx, double cz, int meta) {
		posY=j;
		if (meta == 2 || meta == 0) {
			double norm = Math.sqrt(motionX * motionX + motionZ * motionZ);

			setPosition(cx + 0.5, posY + yOffset+0.5, posZ);
			//setPosition(posX, posY + yOffset, posZ);

			motionX = 0;
			motionZ = Math.copySign(norm, motionZ);
			this.boundingBox.offset(0, 0 , Math.copySign(norm, this.motionZ));

			List boxes = worldObj.getCollidingBoundingBoxes(this, boundingBox);
			for(Object b : boxes){
				if(!(b instanceof BlockRailBase) && !(b instanceof BlockTCRail) && !(b instanceof BlockTCRailGag) && !(b instanceof BlockAir)){
					return;
				}
			}
			this.posX = (this.boundingBox.minX + this.boundingBox.maxX) *0.5D;
			this.posY = this.boundingBox.minY + (double)this.yOffset - (double)this.ySize -0.5d;
			this.posZ = (this.boundingBox.minZ + this.boundingBox.maxZ) *0.5D;

			//System.out.println("straight z "+Math.copySign(norm, motionZ));
		}
		if (meta == 1 || meta == 3) {

			setPosition(posX, posY + yOffset+this.ySize+0.5, cz + 0.5);
			//setPosition(posX, posY + yOffset, posZ);

			motionX = Math.copySign(Math.sqrt(motionX * motionX + motionZ * motionZ), motionX);
			motionZ = 0;
			this.boundingBox.offset(motionX, 0 , 0);

			List boxes = worldObj.getCollidingBoundingBoxes(this, boundingBox);
			for(Object b : boxes){
				if(!(b instanceof BlockRailBase) && !(b instanceof BlockTCRail) && !(b instanceof BlockTCRailGag) && !(b instanceof BlockAir)){
					return;
				}
			}
			posX=(this.boundingBox.minX + this.boundingBox.maxX) *0.5;
					posY=this.boundingBox.minY + this.yOffset - this.ySize-0.5;
					posZ=(this.boundingBox.minZ + this.boundingBox.maxZ)*0.5;

			//System.out.println("straight x "+Math.copySign(norm, motionX));
		}
	}

	private void moveOnTCTwoWaysCrossing() {
		/*
		 * Nitro-Note: Do we need all those shitty motionX and Z? We don't even
		 * need something to parse to this function. setPosition is superflous since you can't place
		 * trains down on 2 way crossings.
		 */
		 //this.posY = j;// + 0.2D;
		//System.out.println(l);
		//if(l==2||l==0)moveEntity(motionX, 0.0D, 0.0D);
		//if(l==1||l==3)moveEntity(0.0D, 0.0D, motionZ);
		//if(Math.abs(motionX)>Math.abs(motionZ))System.out.println("X");
		//if(Math.abs(motionZ)>Math.abs(motionX))System.out.println("Z");
		
		double norm = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
		
		if (Math.abs(motionZ) > Math.abs(motionX)) {

			// this.setPosition(this.posX, this.posY + this.yOffset, cz + 0.5D);
			this.moveEntity(0.0D, 0.0D, Math.copySign(norm, this.motionZ));

			// this.motionX = 0.0D;
			// this.motionZ = Math.copySign(norm, this.motionZ);
		}
		else {
			
			// double norm = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
			
			// this.setPosition(cx + 0.5D, this.posY + this.yOffset, this.posZ);
			this.moveEntity(Math.copySign(norm, this.motionX), 0.0D, 0.0D);

			// this.motionX = Math.copySign(norm, this.motionX);
			// this.motionZ = 0.0D;
		}

	}
	private void moveOnTCSlope(int j, double cx, double cz, double slopeAngle, double slopeHeight, int meta) {

		posY = j + 0.5;
		if (meta == 2 || meta == 0) {

			if (meta == 2) {
				cz += 1;
			}

			double norm = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
			double newPosY = Math.abs(j + (Math.tan(slopeAngle * Math.abs(cz - this.posZ))) + this.yOffset + 0.3);
			this.setPosition(cx + 0.5D, newPosY, this.posZ);

			this.boundingBox.offset(0, 0 , Math.copySign(norm, this.motionZ));
			this.posX = (this.boundingBox.minX + this.boundingBox.maxX) / 2.0D;
			this.posY = this.boundingBox.minY + (double)this.yOffset - (double)this.ySize;
			this.posZ = (this.boundingBox.minZ + this.boundingBox.maxZ) / 2.0D;

			this.motionX = 0.0D;
			this.motionY = 0.0D;
			this.motionZ = Math.copySign(norm, this.motionZ);
		} else if (meta == 1 || meta == 3) {
			if (meta == 1) {
				cx += 1;
			}

			double norm = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
			double newPosY = (j + (Math.tan(slopeAngle * Math.abs(cx - this.posX))) + this.yOffset + 0.3);
			this.setPosition(this.posX, newPosY, cz + 0.5D);

			this.boundingBox.offset(Math.copySign(norm, this.motionX), 0 ,0);
			this.posX = (this.boundingBox.minX + this.boundingBox.maxX) / 2.0D;
			this.posY = this.boundingBox.minY + (double)this.yOffset - (double)this.ySize;
			this.posZ = (this.boundingBox.minZ + this.boundingBox.maxZ) / 2.0D;

			this.motionX = Math.copySign(norm, this.motionX);
			this.motionY = 0.0D;
			this.motionZ = 0.0D;
		}
	}

	private void moveOnTC90TurnRail(int j,double r, double cx, double cz){
		posY = j;// + 0.2;
		double cpx = posX - cx;
		double cpz = posZ - cz;
		double cp_norm = Math.sqrt(cpx * cpx + cpz * cpz);

		double vnorm = Math.sqrt(motionX * motionX + motionZ * motionZ);

		double vx2 = -(cpz/cp_norm) * vnorm;//-v
		double vz2 = (cpx/cp_norm) * vnorm;//u

		double px2_cx = (posX + motionX) - cx;
		double pz2_cz = (posZ + motionZ) - cz;

		double p2_c_norm = Math.sqrt((px2_cx * px2_cx) + (pz2_cz * pz2_cz));

		double p_corr_x = cx + ((cpx / cp_norm) * r);
		double p_corr_z = cz + ((cpz / cp_norm) * r);

		setPosition(p_corr_x, posY + yOffset, p_corr_z);

		moveEntity(motionX= Math.copySign(vx2, cx + ((px2_cx/p2_c_norm) * r) - posX),
				0.0D,
				motionZ=Math.copySign(vz2, cz + ((pz2_cz/p2_c_norm) * r) - posZ));
	}
	private boolean shouldIgnoreSwitch(TileTCRail tile, int i, int j, int k, int meta) {
		if (tile != null
				&& (tile.getType().equals(TrackTypes.MEDIUM_RIGHT_TURN.getLabel())
						|| tile.getType().equals(TrackTypes.MEDIUM_LEFT_TURN.getLabel())
						|| tile.getType().equals(TrackTypes.LARGE_LEFT_TURN.getLabel())
						|| tile.getType().equals(TrackTypes.LARGE_RIGHT_TURN.getLabel()))
				&& tile.canTypeBeModifiedBySwitch) {
			if (meta == 2) {
				if (motionZ > 0 && Math.abs(motionX) < 0.01) {
					TileEntity tile2 = worldObj.getTileEntity(i, j, k + 1);
					if (tile2 instanceof TileTCRail) {
						((TileTCRail) tile2).setSwitchState(false, true);
					}
					return true;
				}
			}
			if (meta == 0) {
				if (motionZ < 0 && Math.abs(motionX) < 0.01) {
					TileEntity tile2 = worldObj.getTileEntity(i, j, k - 1);
					if (tile2 instanceof TileTCRail) {
						((TileTCRail) tile2).setSwitchState(false, true);
					}
					return true;
				}
			}
			if (meta == 1) {
				if (Math.abs(motionZ) < 0.01 && motionX > 0) {
					TileEntity tile2 = worldObj.getTileEntity(i + 1, j, k);
					if (tile2 instanceof TileTCRail) {
						((TileTCRail) tile2).setSwitchState(false, true);
					}
					return true;
				}
			}
			if (meta == 3) {
				if (Math.abs(motionZ) < 0.01 && motionX < 0) {
					TileEntity tile2 = worldObj.getTileEntity(i - 1, j, k);
					if (tile2 instanceof TileTCRail) {
						((TileTCRail) tile2).setSwitchState(false, true);
					}
					return true;
				}
			}
		}
		return false;
	}
	private void limitSpeedOnTCRail() {

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
	
	@Override
	@SideOnly(Side.CLIENT)
	public void setPositionAndRotation2(double p_70056_1_, double p_70056_3_, double p_70056_5_, float p_70056_7_,
			float p_70056_8_, int p_70056_9_) {
		super.setPositionAndRotation2(p_70056_1_, p_70056_3_, p_70056_5_, p_70056_7_, p_70056_8_, p_70056_9_);
		this.minecartX = p_70056_1_;
		this.minecartY = p_70056_3_;
		this.minecartZ = p_70056_5_;
		this.minecartYaw = p_70056_7_;
		this.minecartPitch = p_70056_8_;
		this.turnProgress = p_70056_9_ + 2;
	}
}