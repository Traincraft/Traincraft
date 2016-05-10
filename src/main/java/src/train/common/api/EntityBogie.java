package src.train.common.api;

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
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.minecart.MinecartUpdateEvent;
import src.train.common.items.ItemTCRail;
import src.train.common.items.ItemTCRail.TrackTypes;
import src.train.common.library.BlockIDs;
import src.train.common.tile.TileTCRail;
import src.train.common.tile.TileTCRailGag;
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
	private int updateTicks;
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
		this.setCollisionHandler(null);
		yOffset = 0.65f;
		//this.setSize(0.1F, 1.98F);
		side = FMLCommonHandler.instance().getEffectiveSide();
	}

	public EntityBogie(World world, double d, double d1, double d2, EntityRollingStock mainTrain, int id, int index, double bogieShift) {
		this(world);
		entityMainTrain = mainTrain;
		this.motionX = 0.0D;
		this.motionY = 0.0D;
		this.motionZ = 0.0D;
		this.prevPosX = d;
		this.prevPosY = d1;
		this.prevPosZ = d2;
		this.entityMainTrainID = id;
		this.bogieIndex = index;
		this.bogieShift = bogieShift;
		setPosition(d, d1 + yOffset, d2);
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
	public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
		if (this.entityMainTrain != null)
			return entityMainTrain.attackEntityFrom(par1DamageSource, par2);
		return false;
	}

	@Override
	public void applyEntityCollision(Entity par1Entity) {
		if (this.entityMainTrain != null && (par1Entity != entityMainTrain))
			this.entityMainTrain.applyEntityCollision(par1Entity);
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
		return 0.2499999761581421D;
	}

	protected double damp() {
		return 0.4000000059604645D;
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
	protected void entityInit() {
		super.entityInit();
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		//this.entityMainTrainID = nbttagcompound.getInteger("trainID");
		//this.bogieIndex = nbttagcompound.getInteger("bogieIndex");
		//this.bogieShift = nbttagcompound.getDouble("bogieShift");
		//super.readFromNBT(nbttagcompound);
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		//nbttagcompound.setInteger("trainID", entityMainTrainID);
		//nbttagcompound.setInteger("bogieIndex", bogieIndex);
		//nbttagcompound.setDouble("bogieShift", bogieShift);
		//super.writeToNBT(nbttagcompound);	
	}

	@Override
	public int getMinecartType() {
		return -1;
	}

	@Override
	public String getDestination() {
		if (this.entityMainTrain != null)
			return this.entityMainTrain.getDestination();
		return null;
	}

	@Override
	public boolean setDestination(ItemStack ticket) {
		if (this.entityMainTrain != null)
			return this.entityMainTrain.setDestination(ticket);
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
	protected void updateOnTrack(int par1, int par2, int par3, double par4, double par6, int par8, int par9) {
		par4 = 1.8;
		super.updateOnTrack(par1, par2, par3, par4, par6, par8, par9);
	}
	/**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
    	//if(side.isClient())System.out.println("client "+ posY);
		//if(side.isServer())System.out.println("Bogie server "+ posY);
    	setCurrentCartSpeedCapOnRail(1.8F);
		setMaxSpeedAirLateral(1.8F);
		
        if (this.field_82344_g != null)
        {
            this.field_82344_g.update();
        }

        if (this.getRollingAmplitude() > 0)
        {
            this.setRollingAmplitude(this.getRollingAmplitude() - 1);
        }

        if (this.getDamage() > 0.0F)
        {
            this.setDamage(this.getDamage() - 1.0F);
        }

        if (this.posY < -64.0D)
        {
            this.kill();
        }

        int i;

        if (!this.worldObj.isRemote && this.worldObj instanceof WorldServer)
        {
            this.worldObj.theProfiler.startSection("portal");
            MinecraftServer minecraftserver = ((WorldServer)this.worldObj).getMinecraftServer();
            i = this.getMaxInPortalTime();

            if (this.inPortal)
            {
                if (minecraftserver.getAllowNether())
                {
                    if (this.ridingEntity == null && this.portalCounter++ >= i)
                    {
                        this.portalCounter = i;
                        this.timeUntilPortal = this.getPortalCooldown();
                        byte b0;

                        if (this.worldObj.provider.dimensionId == -1)
                        {
                            b0 = 0;
                        }
                        else
                        {
                            b0 = -1;
                        }

                        this.travelToDimension(b0);
                    }

                    this.inPortal = false;
                }
            }
            else
            {
                if (this.portalCounter > 0)
                {
                    this.portalCounter -= 4;
                }

                if (this.portalCounter < 0)
                {
                    this.portalCounter = 0;
                }
            }

            if (this.timeUntilPortal > 0)
            {
                --this.timeUntilPortal;
            }

            this.worldObj.theProfiler.endSection();
        }

        if (this.worldObj.isRemote)
        {
            if (this.turnProgress > 0)
            {
                double d0 = this.posX + (this.minecartX - this.posX) / (double)this.turnProgress;
                double d1 = this.posY + (this.minecartY - this.posY) / (double)this.turnProgress;
                double d2 = this.posZ + (this.minecartZ - this.posZ) / (double)this.turnProgress;
                double d3 = MathHelper.wrapAngleTo180_double(this.minecartYaw - (double)this.rotationYaw);
                this.rotationYaw = (float)((double)this.rotationYaw + d3 / (double)this.turnProgress);
                this.rotationPitch = (float)((double)this.rotationPitch + (this.minecartPitch - (double)this.rotationPitch) / (double)this.turnProgress);
                --this.turnProgress;
                this.setPosition(d0, d1, d2);
                this.setRotation(this.rotationYaw, this.rotationPitch);
            }
            else
            {
                this.setPosition(this.posX, this.posY, this.posZ);
                this.setRotation(this.rotationYaw, this.rotationPitch);
            }
        }
        else
        {
            this.prevPosX = this.posX;
            this.prevPosY = this.posY;
            this.prevPosZ = this.posZ;
            int j = MathHelper.floor_double(this.posX);
            i = MathHelper.floor_double(this.posY);
            int k = MathHelper.floor_double(this.posZ);
            int x=j;
        	int y=i;
        	int z=k;
        	
            /*if (BlockRailBase.isRailBlockAt(this.worldObj, j, i - 1, k))
            {
                --i;
            }*/
            if (BlockRailBase.func_150051_a(worldObj.getBlock(x,y -1,z)) || worldObj.getBlock(x, y - 1, z) == BlockIDs.tcRail.block || worldObj.getBlock(x, y - 1, z) == BlockIDs.tcRailGag.block) {
    			i--;
    			y--;
    		}

            double d4 = 0.4D;
            double d5 = 0.0078125D;
            Block l = this.worldObj.getBlock(j, i, k);

            if (canUseRail() && BlockRailBase.func_150051_a(l))
            {
                BlockRailBase rail = (BlockRailBase)l;
                float railMaxSpeed = rail.getRailMaxSpeed(worldObj, this, j, i, k);
                double maxSpeed = Math.min(railMaxSpeed, getCurrentCartSpeedCapOnRail());
                int i1 = rail.getBasicRailMetadata(worldObj, this, j, i, k);
                this.updateOnTrack(j, i, k, maxSpeed, getSlopeAdjustment(), Block.getIdFromBlock(l), i1);
                if (l == Block.railActivator.blockID)
                {
                    this.onActivatorRailPass(j, i, k, (worldObj.getBlockMetadata(j, i, k) & 8) != 0);
                }
            }
            else if(l == BlockIDs.tcRail.block){
    			//applyDragAndPushForces();
    			limitSpeedOnTCRail(x,y,z);
    			if(worldObj.getTileEntity(x,y,z)==null || !(worldObj.getTileEntity(x,y,z) instanceof TileTCRail))return;
    			TileTCRail tile = (TileTCRail) worldObj.getTileEntity(x,y,z);
    			//System.out.println(tile.getType());
    			if(ItemTCRail.isTCTurnTrack(tile)){
    				double r = tile.r;
    				double cx = tile.cx;
    				double cy = tile.cy;
    				double cz = tile.cz;
    				int meta = tile.getBlockMetadata();
    				shouldIgnoreSwitch(tile, x, y, z, meta);
    				moveOnTC90TurnRail(x, y, z, r, cx, cy, cz, tile.getType(), meta);
    			}
    			if(ItemTCRail.isTCStraightTrack(tile)){
    				int meta = tile.getBlockMetadata();
    				double cx = tile.xCoord;
    				double cy = tile.yCoord;
    				double cz = tile.zCoord;
    				moveOnTCStraight(x,y,z,cx,cy,cz,meta);
    			}
    			if(ItemTCRail.isTCTwoWaysCrossingTrack(tile)){
    				int meta = tile.getBlockMetadata();
    				double cx = tile.xCoord;
    				double cy = tile.yCoord;
    				double cz = tile.zCoord;
    				moveOnTCTwoWaysCrossing(x, y, z, cx, cy, cz, meta);
    			}
    			if (ItemTCRail.isTCSlopeTrack(tile)) {
    				int meta = tile.getBlockMetadata();
    				double cx = tile.xCoord;
    				double cy = tile.yCoord;
    				double cz = tile.zCoord;
    				double slopeAngle = tile.slopeAngle;
    				double slopeHeight = tile.slopeHeight;
    				double slopeLength = tile.slopeLength;
    				moveOnTCSlope(x, y, z, cx, cy, cz, slopeAngle, slopeHeight, slopeLength, meta);
    			}

    		}else if(l == BlockIDs.tcRailGag.block){
    			//applyDragAndPushForces();
    			limitSpeedOnTCRail(x,y,z);
    			if(worldObj.getTileEntity(x,y,z)==null || !(worldObj.getTileEntity(x,y,z) instanceof TileTCRailGag))return;
    			TileTCRailGag tileGag = (TileTCRailGag) worldObj.getTileEntity(x,y,z);
    			TileTCRail tile = (TileTCRail) worldObj.getTileEntity(tileGag.originX, tileGag.originY, tileGag.originZ);
    			//System.out.println(tile.getType());
    			if(ItemTCRail.isTCTurnTrack(tile)){
    				double r = tile.r;
    				double cx = tile.cx;
    				double cy = tile.cy;
    				double cz = tile.cz;
    				int meta = tile.getBlockMetadata();
    				moveOnTC90TurnRail(x,y,z,r,cx,cy,cz,tile.getType(),meta);
    			}
    			if(ItemTCRail.isTCStraightTrack(tile)){
    				int meta = tile.getBlockMetadata();
    				double cx = tile.xCoord;
    				double cy = tile.yCoord;
    				double cz = tile.zCoord;
    				moveOnTCStraight(x,y,z,cx,cy,cz,meta);
    			}
    			if (ItemTCRail.isTCSlopeTrack(tile)) {
    				int meta = tile.getBlockMetadata();
    				double cx = tile.xCoord;
    				double cy = tile.yCoord;
    				double cz = tile.zCoord;
    				double slopeAngle = tile.slopeAngle;
    				double slopeHeight = tile.slopeHeight;
    				double slopeLength = tile.slopeLength;
    				moveOnTCSlope(x, y, z, cx, cy, cz, slopeAngle, slopeHeight, slopeLength, meta);
    			}
    		}
            else
            {
            	this.motionY -= 0.03999999910593033D;
                this.func_94088_b(onGround ? d4 : getMaxSpeedAirLateral());
            }
           
            this.func_145775_I();
            this.rotationPitch = 0.0F;
            double d6 = this.prevPosX - this.posX;
            double d7 = this.prevPosZ - this.posZ;

            if (d6 * d6 + d7 * d7 > 0.001D)
            {
                this.rotationYaw = (float)(Math.atan2(d7, d6) * 180.0D / Math.PI);

                if (this.isInReverse)
                {
                    this.rotationYaw += 180.0F;
                }
            }
            double d8 = (double)MathHelper.wrapAngleTo180_float(this.rotationYaw - this.prevRotationYaw);

            if (d8 < -170.0D || d8 >= 170.0D)
            {
                this.rotationYaw += 180.0F;
                this.isInReverse = !this.isInReverse;
            }

            this.setRotation(this.rotationYaw, this.rotationPitch);

            AxisAlignedBB box;
            if (getCollisionHandler() != null)
            {
                box = getCollisionHandler().getMinecartCollisionBox(this);
            }
            else
            {
                box = boundingBox.expand(0.2D, 0.0D, 0.2D);
            }

            List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, box);

            if (list != null && !list.isEmpty())
            {
                for (int j1 = 0; j1 < list.size(); ++j1)
                {
                    Entity entity = (Entity)list.get(j1);

                    if (entity != this.riddenByEntity && entity.canBePushed() && entity instanceof EntityMinecart)
                    {
                        entity.applyEntityCollision(this);
                    }
                }
            }

            if (this.riddenByEntity != null && this.riddenByEntity.isDead)
            {
                if (this.riddenByEntity.ridingEntity == this)
                {
                    this.riddenByEntity.ridingEntity = null;
                }

                this.riddenByEntity = null;
            }

            MinecraftForge.EVENT_BUS.post(new MinecartUpdateEvent(this, j, i, k));
        }
        
       // System.out.println(this.entityMainTrainID);
        if (this instanceof EntityBogieUtility)
			return;
		updateTicks++;
		if (!worldObj.isRemote) {
			//if(updateTicks%20==0)System.out.println(this);
			if (this.entityMainTrain == null) {
				this.setDead();
				/*AxisAlignedBB box2 = null;
				box2 = boundingBox.expand(20, 20, 20);
				List lis = worldObj.getEntitiesWithinAABBExcludingEntity(this, box2);

				if (lis != null && lis.size() > 0) {

					for (int j1 = 0; j1 < lis.size(); j1++) {
						Entity entity = (Entity) lis.get(j1);
						if (entity instanceof AbstractTrains) {
							//System.out.println(entityMainTrainID+ " "+ ((AbstractTrains) entity).getID());
							if (((AbstractTrains) entity).uniqueID == this.entityMainTrainID) {
								entityMainTrain = (EntityRollingStock) entity;
								entityMainTrain.bogieLoco[bogieIndex] = this;
							}
						}
					}
				}
				if (entityMainTrain == null && updateTicks > 200) {
					this.setDead();
				}*/
			}

			AxisAlignedBB box;// = AxisAlignedBB.getBoundingBox(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
			
			//box.setSize(this.width, this.height);
			if (getCollisionHandler() != null) {
				box = getCollisionHandler().getMinecartCollisionBox(this);
			}
			else {
				box = boundingBox.expand(0.2D, 0.0D, 0.2D);
			}

			List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, box);

			if (list != null && !list.isEmpty()) {
				for (int j1 = 0; j1 < list.size(); ++j1) {
					Entity entity = (Entity) list.get(j1);

					if (entity != this.riddenByEntity) {
						//System.out.println(entity);
						this.applyEntityCollision(entity);
					}
				}
			}
		}
    }
    protected void moveOnTCStraight(int i, int j, int k, double cx, double cy, double cz, int meta) {
		float newRotationYaw = rotationYaw;
		posY = j + 0.2;

		if (meta == 2 || meta == 0) {
			double p_corr_x = cx + 0.5;
			double norm = Math.sqrt(motionX * motionX + motionZ * motionZ);

			setPosition(p_corr_x, posY + yOffset, posZ);

			moveEntity(0.0D, 0.0D, Math.copySign(norm, motionZ));

			//System.out.println("straight z "+Math.copySign(norm, motionZ));

			motionX = 0;
			motionZ = Math.copySign(norm, motionZ);
		}
		if (meta == 1 || meta == 3) {
			double p_corr_z = cz + 0.5;
			double norm = Math.sqrt(motionX * motionX + motionZ * motionZ);

			setPosition(posX, posY + yOffset, p_corr_z);

			moveEntity(Math.copySign(norm, motionX), 0.0D, 0.0D);

			//System.out.println("straight x "+Math.copySign(norm, motionX));

			motionX = Math.copySign(norm, motionX);
			motionZ = 0;
		}
	}
    protected void moveOnTCTwoWaysCrossing(int i, int j, int k, double cx, double cy, double cz, int meta) {
    	posY = j + 0.2;
    	int l = MathHelper.floor_double((double) (rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
    	//System.out.println(l);
    	//if(l==2||l==0)moveEntity(motionX, 0.0D, 0.0D);
    	//if(l==1||l==3)moveEntity(0.0D, 0.0D, motionZ);
    	//if(Math.abs(motionX)>Math.abs(motionZ))System.out.println("X");
    	//if(Math.abs(motionZ)>Math.abs(motionX))System.out.println("Z");
    	if(l==2||l==0){
    		//moveEntity(motionX, 0.0D, 0.0D);
    		//motionZ=0;
    		double p_corr_z = cz + 0.5;
			double norm = Math.sqrt(motionX * motionX + motionZ * motionZ);

			setPosition(posX, posY + yOffset, p_corr_z);

			moveEntity(Math.copySign(norm, motionX), 0.0D, 0.0D);
			
			motionX = Math.copySign(norm, motionX);
			motionZ = 0;
    	}
    	if(l==1||l==3){
    		//moveEntity(0.0D, 0.0D, motionZ);
    		//motionX=0;
    		
    		double p_corr_x = cx + 0.5;
			double norm = Math.sqrt(motionX * motionX + motionZ * motionZ);

			setPosition(p_corr_x, posY + yOffset, posZ);

			moveEntity(0.0D, 0.0D, Math.copySign(norm, motionZ));

			motionX = 0;
			motionZ = Math.copySign(norm, motionZ);
    	}

	}
    protected void moveOnTCSlope(int i, int j, int k, double cx, double cy, double cz, double slopeAngle, double slopeHeight, double slopeLength, int meta) {
		//double currentHeight = posY;
    	if(Math.abs(motionX)>0.3){
    		motionX = Math.copySign(0.3, motionX);
    		if(this.entityMainTrain!=null){
    			entityMainTrain.motionX = Math.copySign(0.3, entityMainTrain.motionX);
    		}
    	}
		if(Math.abs(motionZ)>0.3){
			motionZ = Math.copySign(0.3, motionZ);
			if(this.entityMainTrain!=null){
    			entityMainTrain.motionZ = Math.copySign(0.3, entityMainTrain.motionZ);
    		}
		}
		posY = j + 0.2;
		if (meta == 2 || meta == 0) {
			if(meta == 2)cz+=1;
			
			double p_corr_x = cx + 0.5;
			double norm = Math.sqrt(motionX * motionX + motionZ * motionZ);
			double zPosProgress = Math.abs(cz-posZ);
			double yPosProgress = Math.tan(slopeAngle*zPosProgress);
			double newPosY = (j + Math.abs(yPosProgress)+yOffset+0.2);
			if(newPosY>(j+yOffset+0.2+slopeHeight+0.05))newPosY = (j+yOffset+0.2+slopeHeight+0.05);
			//System.out.println("new "+newPosY);
			//System.out.println("max "+(j+yOffset+0.2+slopeHeight+0.05));
			setPosition(p_corr_x,newPosY, posZ);
			
			moveEntity(0.0D, 0.0D, Math.copySign(norm, motionZ));

			motionX = 0;
			motionY = 0;
			motionZ = Math.copySign(norm, motionZ);
		}
		if (meta == 1 || meta == 3) {
			double p_corr_z = cz + 0.5;
			if(meta == 1)cx+=1;
			double norm = Math.sqrt(motionX * motionX + motionZ * motionZ);
			double xPosProgress = Math.abs(cx-posX);
			double yPosProgress = Math.tan(slopeAngle*xPosProgress);
			double newPosY = (j + Math.abs(yPosProgress)+yOffset+0.2);
			if(newPosY>(j+yOffset+slopeHeight+0.2+0.05))newPosY = (j+yOffset+slopeHeight+0.2+0.05);
			//System.out.println("new "+newPosY);
			//System.out.println("max "+(j+yOffset+0.2+slopeHeight));
			
			/*System.out.println("xPosProgress "+xPosProgress);
			System.out.println("yPosProgress "+yPosProgress);*/
			//System.out.println("newPosY "+newPosY);
			
			setPosition(posX, newPosY, p_corr_z);

			moveEntity(Math.copySign(norm, motionX), 0.0D, 0.0D);

			motionX = Math.copySign(norm, motionX);
			motionY = 0;
			motionZ = 0;
		}
	}
	protected void moveOnTC90TurnRail(int i, int j, int k, double r, double cx, double cy, double cz, String type, int meta) {
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
	private boolean shouldIgnoreSwitch(TileTCRail tile, int i, int j, int k, int meta) {
		if (tile != null && (tile.getType().equals(TrackTypes.MEDIUM_RIGHT_TURN.getLabel()) || tile.getType().equals(TrackTypes.MEDIUM_LEFT_TURN.getLabel())) && tile.canTypeBeModifiedBySwitch) {
			if (meta == 2) {
				if (motionZ > 0 && Math.abs(motionX) < 0.01) {
					double cx = tile.xCoord;
					double cy = tile.yCoord;
					double cz = tile.zCoord;
					//moveOnTCStraight(i, j, k, cx, cy, cz, meta);
					tile.setType(TrackTypes.SMALL_STRAIGHT.getLabel());
					TileEntity tile2 = worldObj.getTileEntity(i, j, k+1);
					if(tile2!=null && tile2 instanceof TileTCRail){
						((TileTCRail)tile2).setSwitchState(false,true);
					}
					return true;
				}
			}
			if (meta == 0) {
				if (motionZ < 0 && Math.abs(motionX) < 0.01) {
					double cx = tile.xCoord;
					double cy = tile.yCoord;
					double cz = tile.zCoord;
					//moveOnTCStraight(i, j, k, cx, cy, cz, meta);
					tile.setType(TrackTypes.SMALL_STRAIGHT.getLabel());
					TileEntity tile2 = worldObj.getTileEntity(i, j, k-1);
					if(tile2!=null && tile2 instanceof TileTCRail){
						((TileTCRail)tile2).setSwitchState(false,true);
					}
					return true;
				}
			}
			if (meta == 1) {
				if (Math.abs(motionZ) < 0.01 && motionX > 0) {
					double cx = tile.xCoord;
					double cy = tile.yCoord;
					double cz = tile.zCoord;
					//moveOnTCStraight(i, j, k, cx, cy, cz, meta);
					tile.setType(TrackTypes.SMALL_STRAIGHT.getLabel());
					TileEntity tile2 = worldObj.getTileEntity(i+1, j, k);
					if(tile2!=null && tile2 instanceof TileTCRail){
						((TileTCRail)tile2).setSwitchState(false,true);
					}
					return true;
				}
			}
			if (meta == 3) {
				if (Math.abs(motionZ) < 0.01 && motionX < 0) {
					double cx = tile.xCoord;
					double cy = tile.yCoord;
					double cz = tile.zCoord;
					//moveOnTCStraight(i, j, k, cx, cy, cz, meta);
					tile.setType(TrackTypes.SMALL_STRAIGHT.getLabel());
					TileEntity tile2 = worldObj.getTileEntity(i-1, j, k);
					if(tile2!=null && tile2 instanceof TileTCRail){
						((TileTCRail)tile2).setSwitchState(false,true);
					}
					return true;
				}
			}
		}
		return false;
	}

	public void limitSpeedOnTCRail(int i, int j, int k) {
		Block id = worldObj.getBlock(i, j, k);
		/*if (!BlockRailBase.isRailBlock(id)) {
			return;
		}
		railMaxSpeed = ((BlockRailBase) Block.blocksList[id]).getRailMaxSpeed(worldObj, this, i, j, k);*/
		double railMaxSpeed = 3;
		double maxSpeed = Math.min(railMaxSpeed, getMaxCartSpeedOnRail());
		
		if (motionX < -maxSpeed) {
			motionX = -maxSpeed;
		}
		if (motionX > maxSpeed) {
			motionX = maxSpeed;
		}
		if (motionZ < -maxSpeed) {
			motionZ = -maxSpeed;
		}
		if (motionZ > maxSpeed) {
			motionZ = maxSpeed;
		}
	}
    

}
