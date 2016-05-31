package train.common.api;

import mods.railcraft.api.carts.IMinecart;
import mods.railcraft.api.carts.IRoutableCart;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import java.util.List;

public class EntityBogieUtility extends EntityBogie implements IMinecart, IRoutableCart{

	private int updateTicks;

	public EntityBogieUtility(World world) {
		super(world);
		this.isOnRail = false;
		this.prevDpdx = 0F;
		this.prevDpdz = 0F;
		this.worldObj = world;
		if(entityMainTrain!=null){
			setSize(entityMainTrain.width,entityMainTrain.height);
		}else{
			setSize(0.98F, 1.98F);
		}
		this.setCollisionHandler(null);
		//yOffset = 0;
	}
	public EntityBogieUtility(World world, double d, double d1, double d2,EntityRollingStock mainTrain,int id,int index, double bogieShift) {
		this(world);
		entityMainTrain = mainTrain;
		this.motionX = 0.0D;
		this.motionY = 0.0D;
		this.motionZ = 0.0D;
		this.prevPosX = d;
		this.prevPosY = d1;
		this.prevPosZ = d2;
		this.entityMainTrainID=id;
		this.bogieIndex=index;
		this.bogieShift=bogieShift;
		setPosition(d, d1 + yOffset, d2);
	}

	@Override
	public void onUpdate(){
		//if(updateTicks%20==0)System.out.println(this);

		super.onUpdate();
		updateTicks++;
		if(!worldObj.isRemote){
			//if(updateTicks%20==0)System.out.println(this);
			if(this.entityMainTrain==null){
				AxisAlignedBB box2 = null;
				box2 = boundingBox.expand(20, 20, 20);
				List lis = worldObj.getEntitiesWithinAABBExcludingEntity(this, box2);

				if (lis != null && lis.size() > 0) {

					for (int j1 = 0; j1 < lis.size(); j1++) {
						Entity entity = (Entity) lis.get(j1);
						if (entity instanceof AbstractTrains) {
							//System.out.println(entityMainTrainID+ " "+ ((AbstractTrains) entity).getID());
							if (((AbstractTrains) entity).getUniqueTrainID() == this.entityMainTrainID) {
								entityMainTrain = (EntityRollingStock) entity;
								entityMainTrain.bogieUtility[bogieIndex]=this;
							}
						}
					}
				}
				if(entityMainTrain==null && updateTicks > 200){
					this.setDead();
				}
			}


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
						this.applyEntityCollision(entity);
					}/*else if(entity != this.riddenByEntity && entity.canBePushed() && !(entity instanceof EntityMinecart)){
	                	this.applyEntityCollision(entity);
	                }*/
				}
			}
		}

	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		this.entityMainTrainID = nbttagcompound.getInteger("trainID");
		this.bogieIndex = nbttagcompound.getInteger("bogieIndex");
		this.bogieShift = nbttagcompound.getDouble("bogieShift");
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		nbttagcompound.setInteger("trainID", entityMainTrainID);
		nbttagcompound.setInteger("bogieIndex", bogieIndex);
		nbttagcompound.setDouble("bogieShift", bogieShift);
	}
	@Override
	public void applyEntityCollision(Entity par1Entity) {
		if(this.entityMainTrain!=null){
			if(this.entityMainTrain.isAttached && par1Entity instanceof EntityPlayer){
				this.entityMainTrain.applyEntityCollision(par1Entity);
			}else if(!this.entityMainTrain.isAttached)this.entityMainTrain.applyEntityCollision(par1Entity);
		}
	}

}

