package train.common.core.handlers;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.minecart.MinecartCollisionEvent;
import train.common.api.AbstractTrains;
import train.common.api.EntityRollingStock;
import train.common.api.Locomotive;
import train.common.entity.EntityLasersLines;
import train.common.entity.rollingStock.EntityStockCar;
import train.common.entity.rollingStock.EntityStockCarDRWG;

import java.util.List;
import java.util.Random;

public class CollisionHandler {

	private World worldObj;
	private Random rand;

	public CollisionHandler(World world) {
		worldObj = world;
		this.rand = new Random();

	}

	private List listRide;
	private Entity entity;
	private AxisAlignedBB box = null;
	public void handleCollisions(Entity entityOne, AxisAlignedBB boundingBox) {
		/**
		 * A smaller BB is needed otherwise the entity will get sucked back as soon as it unmounts this does not affect collisions with player or other carts. Only collisions with mobs
		 */
		listRide = worldObj.getEntitiesWithinAABBExcludingEntity(entityOne, boundingBox.expand(-0.5, -0.5, -0.5));
		if (listRide != null && listRide.size() > 0) {
			for (int j1 = 0; j1 < listRide.size(); j1++) {
				entity = (Entity) listRide.get(j1);
				if (!(entity instanceof EntityLasersLines) && !entity.noClip) {
					if (entity != entity.riddenByEntity && !(unAutorizedMob(entity, entityOne)) && (entity instanceof EntityLiving)) {
						applyRideEntity(entity, entityOne);
					}
				}
			}
		}
		if (Math.round(entityOne.rotationYaw) == -90 || Math.round(entityOne.rotationYaw) == 90) {
			box = boundingBox.expand(0.0, 0, 2);
		}
		else if (Math.round(entityOne.rotationYaw) == 180 || Math.round(entityOne.rotationYaw) == 0) {
			box = boundingBox.expand(2, 0, 0.0);
		}
		else {
			box = boundingBox.expand(2, 0, 2);
		}
		listRide = worldObj.getEntitiesWithinAABBExcludingEntity(entityOne, box);
		if (listRide != null && listRide.size() > 0) {

			for (int j1 = 0; j1 < listRide.size(); j1++) {
				entity = (Entity) listRide.get(j1);

				if (!(entity instanceof EntityLasersLines) && !entity.noClip) {

					if (entity != entity.riddenByEntity && (entity instanceof EntityLiving) && (!entity.getClass().getName().equals("EntityLittleMaid")) && (unAutorizedMob(entity, entityOne))) {

						applyCollisionLiving(entity, entityOne);
						// applyEntityCollision(entity, entityOne);
						return;
					}
					if (entity != entity.riddenByEntity && (entity instanceof EntityPlayer) && (entityOne instanceof AbstractTrains)) {

						applyEntityCollision(entity, entityOne);
						return;
					}

				}

			}
		}
		//box = boundingBox.expand(2, 2, 2);

		listRide = worldObj.getEntitiesWithinAABBExcludingEntity(entityOne, box);
		if (listRide != null && listRide.size() > 0) {

			for (int j1 = 0; j1 < listRide.size(); j1++) {
				entity = (Entity) listRide.get(j1);
				if (!(entity instanceof EntityLasersLines) && !entity.noClip && !(entity instanceof EntityLiving) && !(entityOne instanceof EntityLiving)) {

					if (entity != entity.riddenByEntity && entity.canBePushed() && (entityOne instanceof AbstractTrains) && (entity instanceof AbstractTrains) && !((AbstractTrains) entityOne).isAttached) {

						//applyCollision3(entity, entityOne);
						applyEntityCollisionVanilla(entity, (EntityMinecart) entityOne);
						return;
						// MinecraftForge.EVENT_BUS.post(new MinecartCollisionEvent((EntityMinecart)entityOne, entity));

					}
					else if (entity != entity.riddenByEntity && entity.canBePushed() && (entity instanceof EntityMinecart) && !(entity instanceof AbstractTrains) && (entityOne instanceof AbstractTrains) && !((AbstractTrains) entityOne).isAttached) {

						//applyCollision2(entity, entityOne);
						applyEntityCollisionVanilla(entity, (EntityMinecart) entityOne);
						return;
						// MinecraftForge.EVENT_BUS.post(new MinecartCollisionEvent((EntityMinecart)entityOne, entity));
					}
					else if (entity != entity.riddenByEntity && entity.canBePushed() && (entity instanceof AbstractTrains) && (entityOne instanceof AbstractTrains) && !(entity == ((EntityRollingStock)entityOne).cartLinked1) && !(entity == ((EntityRollingStock)entityOne).cartLinked2)) {

						//applyCollision2(entity, entityOne);
						applyEntityCollisionVanilla(entity, (EntityMinecart) entityOne);
						return;
						// MinecraftForge.EVENT_BUS.post(new MinecartCollisionEvent((EntityMinecart)entityOne, entity));
					}
				}

			}

		}

	}

	/**
	 * Applies a velocity to each of the entities pushing them away from each other. Args: entity
	 */
	public void applyEntityCollisionVanilla(Entity par1Entity, EntityMinecart entityOne) {
		MinecraftForge.EVENT_BUS.post(new MinecartCollisionEvent(entityOne, par1Entity));
		if (entityOne.getCollisionHandler() != null) {
			entityOne.getCollisionHandler().onEntityCollision(entityOne, par1Entity);
			return;
		}
		if (!this.worldObj.isRemote) {
			if (par1Entity != entityOne.riddenByEntity) {

				double d0 = par1Entity.posX - entityOne.posX;
				double d1 = par1Entity.posZ - entityOne.posZ;
				double d2 = d0 * d0 + d1 * d1;
				d2 = MathHelper.sqrt_double(d2);

				if (d2 <= ((AbstractTrains) entityOne).getLinkageDistance(entityOne) && d2 >= 9.999999747378752E-5D) {

					d0 /= d2;
					d1 /= d2;
					double d3 = 1.0D / d2;

					if (d3 > 1.0D) {
						d3 = 1.0D;
					}

					d0 *= d3;
					d1 *= d3;
					d0 *= 0.10000000149011612D;
					d1 *= 0.10000000149011612D;
					d0 *= 0.4D;
					d1 *= 0.4D;
					d0 *= 0.5D;
					d1 *= 0.5D;

					if (par1Entity instanceof EntityMinecart) {

						/*
						 * if (d6 < 0.800000011920929D) { return; } */

						double d7 = par1Entity.motionX + entityOne.motionX;
						double d8 = par1Entity.motionZ + entityOne.motionZ;

						if (((EntityMinecart) par1Entity).isPoweredCart() && !entityOne.isPoweredCart()) {
							entityOne.motionX *= 0.20000000298023224D;
							entityOne.motionZ *= 0.20000000298023224D;
							entityOne.addVelocity(par1Entity.motionX - d0, 0.0D, par1Entity.motionZ - d1);
							par1Entity.motionX *= 0.949999988079071D;
							par1Entity.motionZ *= 0.949999988079071D;
						}
						else if (!((EntityMinecart) par1Entity).isPoweredCart() && entityOne.isPoweredCart()) {
							par1Entity.motionX *= 0.20000000298023224D;
							par1Entity.motionZ *= 0.20000000298023224D;
							par1Entity.addVelocity(entityOne.motionX + d0, 0.0D, entityOne.motionZ + d1);
							entityOne.motionX *= 0.949999988079071D;
							entityOne.motionZ *= 0.949999988079071D;
						}
						else {
							//System.out.println(par1Entity);
							d7 /= 2.0D;
							d8 /= 2.0D;
							entityOne.motionX *= 0.02000000298023224D;
							entityOne.motionZ *= 0.02000000298023224D;
							entityOne.addVelocity(d7 - d0 / 2, 0.0D, d8 - d1 / 2);
							par1Entity.motionX *= 0.02000000298023224D;
							par1Entity.motionZ *= 0.02000000298023224D;
							par1Entity.addVelocity(d7 + d0 / 2, 0.0D, d8 + d1 / 2);
						}
					}
				}
			}
		}
	}

	public void applyEntityCollision(Entity entity, Entity entityOne) {
		if (entityOne instanceof Locomotive && entity instanceof EntityPlayer) {
			applyCollisionLiving(entity, entityOne);
			return;
		}
		if (entity instanceof Locomotive && entityOne instanceof EntityPlayer) {
			applyCollisionLiving(entityOne, entity);
			return;
		}

		if (!this.worldObj.isRemote) {
			if (entity != entityOne.riddenByEntity) {

				double var2 = entity.posX - entityOne.posX;
				double var4 = entity.posZ - entityOne.posZ;
				double var6 = var2 * var2 + var4 * var4;
				var6 = MathHelper.sqrt_double(var6);
				if (var6 <= ((AbstractTrains) entityOne).getLinkageDistance((EntityMinecart) entityOne)*0.8 && var6 >= 9.999999747378752E-5D) {

					var2 /= var6;
					var4 /= var6;
					double var8 = 1.0D / var6;

					if (var8 > 1.0D) {
						var8 = 1.0D;
					}

					var2 *= var8;
					var4 *= var8;
					var2 *= 0.10000000149011612D;
					var4 *= 0.10000000149011612D;
					var2 *= 0.4D;
					var4 *= 0.4D;
					var2 *= 0.5D;
					var4 *= 0.5D;

					if (entity instanceof EntityMinecart) {
						double var10 = entity.posX - entityOne.posX;
						double var12 = entity.posZ - entityOne.posZ;
						Vec3 var14 = Vec3.createVectorHelper(var10, 0.0D, var12).normalize();
						Vec3 var15 = Vec3.createVectorHelper(MathHelper.cos(entityOne.rotationYaw * (float) Math.PI / 180.0F), 0.0D, MathHelper.sin(entityOne.rotationYaw * (float) Math.PI / 180.0F)).normalize();
						double var16 = Math.abs(var14.dotProduct(var15));

						if (var16 < 0.800000011920929D) {
							return;
						}

						double var18 = entity.motionX + entityOne.motionX;
						double var20 = entity.motionZ + entityOne.motionZ;

						if (((EntityMinecart) entity).isPoweredCart() && !((EntityMinecart) entityOne).isPoweredCart()) {
							entityOne.motionX *= 0.20000000298023224D;
							entityOne.motionZ *= 0.20000000298023224D;
							entityOne.addVelocity(entity.motionX - var2, 0.0D, entity.motionZ - var4);
							entity.motionX *= 0.949999988079071D;
							entity.motionZ *= 0.949999988079071D;
						}
						else if (!((EntityMinecart) entity).isPoweredCart() && ((EntityMinecart) entityOne).isPoweredCart()) {
							entity.motionX *= 0.20000000298023224D;
							entity.motionZ *= 0.20000000298023224D;
							entity.addVelocity(entityOne.motionX + var2, 0.0D, entityOne.motionZ + var4);
							entityOne.motionX *= 0.949999988079071D;
							entityOne.motionZ *= 0.949999988079071D;
						}
						else {
							var18 /= 2.0D;
							var20 /= 2.0D;
							entityOne.motionX *= 0.20000000298023224D;
							entityOne.motionZ *= 0.20000000298023224D;
							entityOne.addVelocity(var18 - var2, 0.0D, var20 - var4);
							entity.motionX *= 0.20000000298023224D;
							entity.motionZ *= 0.20000000298023224D;
							entity.addVelocity(var18 + var2, 0.0D, var20 + var4);
						}
					}
					else {
						if (entityOne instanceof EntityMinecart)
							entityOne.addVelocity(-var2, 0.0D, -var4);
						if(entity instanceof EntityPlayer){

							MovingObjectPosition movingobjectposition = worldObj.rayTraceBlocks(Vec3.createVectorHelper(entityOne.posX, entityOne.posY, entityOne.posZ), Vec3.createVectorHelper(entityOne.posX + entityOne.motionX, entityOne.posY + entityOne.motionY, entityOne.posZ + entityOne.motionZ), false);
							if (entity != null && entity instanceof EntityPlayer) {
								movingobjectposition = new MovingObjectPosition(entity);
							}
							if (movingobjectposition != null) {
								if (movingobjectposition.entityHit != null) {
									float f7 = MathHelper.sqrt_double(entityOne.motionX * entityOne.motionX + entityOne.motionZ * entityOne.motionZ);
									movingobjectposition.entityHit.addVelocity(-((entityOne.motionX * 1 * 0.0060000002384185791D)) / f7, 0.00000000000000001D, -(((entityOne.motionZ * 1 * 0.0060000002384185791D)) / f7));
									entity.velocityChanged = true;
								}
							}
						}
					}
				}
			}
		}

	}

	/**
	 * Mobs can't ride carts except if it is a stock car
	 * 
	 * @param entity: the mob
	 * @param entityOne: the cart
	 * @return
	 */
	public boolean unAutorizedMob(Entity entity, Entity entityOne) {
		return (!(entityOne instanceof EntityStockCar) && !(entityOne instanceof EntityStockCarDRWG))
				&& ((entity instanceof EntitySlime) || (entity instanceof EntityCreeper)
						|| (entity instanceof EntityEnderman) || (entity instanceof EntityIronGolem)
						|| (entity instanceof EntityGiantZombie) || (entity instanceof EntitySkeleton)
						|| (entity instanceof EntitySpider) || (entity instanceof EntityZombie)
						|| (entity instanceof EntityCow) || (entity instanceof EntityMooshroom)
						|| (entity instanceof EntityPig) || (entity instanceof EntityPigZombie)
						|| (entity instanceof EntitySheep) || (entity instanceof EntityChicken));
	}

	public void applyRideEntity(Entity entity, Entity entityOne) {

		if (worldObj.isRemote) {
			return;
		}
		if (entity == entityOne.riddenByEntity) {
			return;
		}
		if (!((AbstractTrains) entityOne).canBeRidden()) {
			return;
		}
		if (!(entityOne instanceof EntityStockCar) && !(entityOne instanceof EntityStockCarDRWG)) {
			return;
		}
		if ((entity instanceof EntityLiving) && ((AbstractTrains) entityOne).canBeRidden() && entityOne.riddenByEntity == null && entity.ridingEntity == null) {
			entity.mountEntity(entityOne);
		}

	}

	/* Creatures are shot away when a cart/loco hits them */
	public void applyCollisionLiving(Entity entity, Entity entityOne) {
		if (worldObj.isRemote) {
			return;
		}
		//System.out.println(entity+" "+ entityOne);
		double d = entity.posX - entityOne.posX;
		double d1 = entity.posZ - entityOne.posZ;

		double d2 = MathHelper.abs_max(d, d1);

		if (d2 <= 0.7D && !(entityOne instanceof EntityPlayer)&& d!=0 && d1!=0) {
			d2 = MathHelper.sqrt_double(d2);
			if(d2==0){
				d2=0.1;
			}
			d /= d2;
			d1 /= d2;
			double d3 = 1.0D / d2;
			if (d3 > 1.0D) {
				d3 = 1.0D;
			}
			d *= d3;
			d1 *= d3;
			d *= 0.10000000149011612D;
			d1 *= 0.10000000149011612D;
			d *= 1.0F - entity.entityCollisionReduction;
			d1 *= 1.0F - entity.entityCollisionReduction;
			d *= 0.5D;
			d1 *= 0.5D;

			if (entity.ridingEntity == null) {

				Vec3 vec3d4 = Vec3.createVectorHelper(entityOne.posX, entityOne.posY, entityOne.posZ);
				Vec3 vec3d5 = Vec3.createVectorHelper(entityOne.posX + entityOne.motionX, entityOne.posY + entityOne.motionY, entityOne.posZ + entityOne.motionZ);
				MovingObjectPosition movingobjectposition = worldObj.rayTraceBlocks(vec3d4, vec3d5, false);

				if (entity != null) {
					movingobjectposition = new MovingObjectPosition(entity);

				}
				if (movingobjectposition != null) {

					if (movingobjectposition.entityHit != null) {

						float f1 = MathHelper.sqrt_double(entityOne.motionX * entityOne.motionX + entityOne.motionY * entityOne.motionY + entityOne.motionZ * entityOne.motionZ);
						float f7 = MathHelper.sqrt_double(entityOne.motionX * entityOne.motionX + entityOne.motionZ * entityOne.motionZ);
						double damage = 1D;
						f1 *= 6;//ratio
						f1 *= 10;//to get speed in "pseudo m/s"
						if ((f1 * 3.6) < 35) {//if speed is smaller than 35km/h then don't do any damage but push entities
							if (f7 == 0) {

								movingobjectposition.entityHit.addVelocity(d * 0.666666667, 0.0D, d1 * 0.666666667);

								entity.velocityChanged = true;
								return;
							}
							//System.out.println("bla");
							movingobjectposition.entityHit.addVelocity(((entityOne.motionX * 1 * 0.060000002384185791D)) / f7, 0.00000000000000001D, (((entityOne.motionZ * 1 * 0.060000002384185791D)) / f7));
							entity.velocityChanged = true;
							return;
						}
						if (entity instanceof EntityCreeper) {//Creeper are killed in one shot hopefully
							damage = 100D;
						}
						int j1 = (int) Math.ceil((f1) * damage);


						if (unAutorizedMob(movingobjectposition.entityHit, entityOne) || ((entity instanceof EntityPlayer || entityOne instanceof EntityPlayer)) && ((f1 * 3.6) > 60))// (movingobjectposition.entityHit instanceof EntityCreature) && !(movingobjectposition.entityHit instanceof EntityWolf))
						{

							entity.attackEntityFrom(TrainsDamageSource.ranOver, j1);//DamageSource.causeMobDamage((EntityLiving) entity);
							if (f7 > 0.0F) {
								movingobjectposition.entityHit.addVelocity((entityOne.motionX * 2 * 0.60000002384185791D) / f7, 0.10000000000000001D, (entityOne.motionZ * 2 * 0.60000002384185791D) / f7);
								entity.velocityChanged = true;
							}

							//worldObj.playSoundAtEntity(entityOne, "damage.fallsmall", 1.0F, 1.2F / (rand.nextFloat() * 0.2F + 0.9F));
							entityOne.playSound("damage.fallsmall", 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
							for (int var9 = 0; var9 < 4; ++var9) {
								entity.worldObj.spawnParticle("crit", entity.posX + entity.motionX * var9 / 4.0D, entity.posY + entity.motionY * var9 / 4.0D, entity.posZ + entity.motionZ * var9 / 4.0D, -entity.motionX, -entity.motionY + 0.2D, -entity.motionZ);
							}

						}

					}
				}
			}

		}

	}

	public void applyCollision3(Entity entity, Entity entityOne) {

		if (worldObj.isRemote) {
			return;
		}

		double d = entity.posX - entityOne.posX;
		double d1 = entity.posZ - entityOne.posZ;

		// double d2 = d * d + d1 * d1;
		double d2 = MathHelper.abs_max(d, d1);

		if (d2 >= 0.0099999997764825821D) {
			d2 = MathHelper.sqrt_double(d2);
			d /= d2;
			d1 /= d2;
			double d3 = 1.0D / d2;
			if (d3 > 1.0D) {
				d3 = 1.0D;
			}
			d *= d3;
			d1 *= d3;
			d *= 0.10000000149011612D;
			d1 *= 0.10000000149011612D;
			d *= 1.0F - entityOne.entityCollisionReduction;
			d1 *= 1.0F - entityOne.entityCollisionReduction;
			d *= 0.5D;
			d1 *= 0.5D;

			if (entity instanceof AbstractTrains) {
				if (((AbstractTrains) entity).isLocomotive() && !((AbstractTrains) entityOne).isLocomotive()) {

					entityOne.motionX = 0;
					entityOne.motionZ = 0;
					if ((!((AbstractTrains) entity).isBuilder() && !((AbstractTrains) entityOne).isBuilder())) {
						entityOne.addVelocity(entity.motionX - (d), 0.0D, entity.motionZ - (d1));
					}
					else {
						entity.motionX = 0;
						entity.motionZ = 0;
					}

					// System.out.println("is 1");

				}
				else if (!((AbstractTrains) entity).isLocomotive() && ((AbstractTrains) entityOne).isLocomotive() && (!((AbstractTrains) entity).isBuilder() && !((AbstractTrains) entityOne).isBuilder())) {

					entity.motionX = 0;
					entity.motionZ = 0;
					entity.addVelocity(entityOne.motionX + (d), 0.0D, entityOne.motionZ + (d1));

					// System.out.println("is 2");

				}
				else if (((AbstractTrains) entity).isFreightOrPassenger() && ((AbstractTrains) entityOne).isFreightOrPassenger()) {

					entity.motionX = 0;
					entity.motionZ = 0;
					entity.addVelocity(entityOne.motionX + d, 0.0D, entityOne.motionZ + d1);

					// System.out.println("is 3");
					entityOne.motionX *= 0.98999998807907104D;
					entityOne.motionZ *= 0.98999998807907104D;

				}
				//else {

					// entityOne.addVelocity(entityOne.motionX+(d*5), 0.0D, entityOne.motionZ+(d*5)); //addVelocity(d7 - d, 0.0D, d8 - d1);

				//}
			}

			// System.out.println("debug");
			// System.out.println("==============");
		}

	}

	public void applyCollision2(Entity entity, Entity entityOne) {

		if (worldObj.isRemote) {
			return;
		}

		double d = entity.posX - entityOne.posX;
		double d1 = entity.posZ - entityOne.posZ;

		double d2 = MathHelper.abs_max(d, d1);

		if (d2 >= 0.0099999997764825821D) {
			d2 = MathHelper.sqrt_double(d2);
			d /= d2;
			d1 /= d2;
			double d3 = 1.0D / d2;
			if (d3 > 1.0D) {
				d3 = 1.0D;
			}
			d *= d3;
			d1 *= d3;
			d *= 0.10000000149011612D;
			d1 *= 0.10000000149011612D;
			d *= 1.0F - entityOne.entityCollisionReduction;
			d1 *= 1.0F - entityOne.entityCollisionReduction;
			d *= 0.5D;
			d1 *= 0.5D;

			if (entity instanceof EntityMinecart) {
				double d4 = entity.posX - entityOne.posX;
				double d5 = entity.posZ - entityOne.posZ;
				Vec3 vec3d = Vec3.createVectorHelper(d4, 0.0D, d5).normalize();
				Vec3 vec3d1 = Vec3.createVectorHelper(MathHelper.cos((entityOne.rotationYaw * 3.141593F) / 180F), 0.0D, MathHelper.sin((entityOne.rotationYaw * 3.141593F) / 180F)).normalize();
				double d6 = Math.abs(vec3d.dotProduct(vec3d1));

				if (d6 < 0.80000001192092896D) {

					return;

				}

				if (!((AbstractTrains) entityOne).isLocomotive()) {

					entityOne.motionX = 0;
					entityOne.motionZ = 0;

					entityOne.addVelocity(entity.motionX - (d), 0.0D, entity.motionZ - (d1));
					// System.out.println("is 1");

				}
				else if (((AbstractTrains) entityOne).isLocomotive()) {

					entity.motionX = 0;
					entity.motionZ = 0;
					entity.addVelocity(entityOne.motionX + (d), 0.0D, entityOne.motionZ + (d1));

				}
				else if (((AbstractTrains) entityOne).isFreightOrPassenger()) {

					entity.motionX = 0;
					entity.motionZ = 0;
					entity.addVelocity(entityOne.motionX + d, 0.0D, entityOne.motionZ + d1);

					entity.motionX *= 0.98999998807907104D;
					entity.motionZ *= 0.98999998807907104D;

				}
				else {
					entityOne.addVelocity(entityOne.motionX + (d * 5), 0.0D, entityOne.motionZ + (d * 5));

				}
			}

		}

	}

}