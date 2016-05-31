package train.common.core.handlers;

import mods.railcraft.api.tracks.RailTools;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import train.common.api.AbstractTrains;
import train.common.api.EntityRollingStock;

import java.util.List;

public class LinkHandler {

	private World worldObj;

	public LinkHandler(World world) {
		worldObj = world;
	}

	/* coupling cart stuff */
	public void handleStake(Entity entityOne, AxisAlignedBB customBoundingBox) {

		AxisAlignedBB box2 = null;
		double length = 5;

		box2 = customBoundingBox.expand(15, 5, 15);

		List lis = worldObj.getEntitiesWithinAABBExcludingEntity(entityOne, box2);
		if(((EntityRollingStock)entityOne).bogieLoco[0]!=null){
			List listBogie = worldObj.getEntitiesWithinAABBExcludingEntity(entityOne, ((EntityRollingStock)entityOne).bogieLoco[0].boundingBox.expand(7, 5, 7));
			for(int i = 0; i < listBogie.size();i++ ){
				lis.add(listBogie.get(i));
			}
		}


		if (lis != null && lis.size() > 0) {

			for (int j1 = 0; j1 < lis.size(); j1++) {
				Entity entity = (Entity) lis.get(j1);

				/**
				 * first testing if the link can be emptied
				 */
				if (entityOne instanceof AbstractTrains && entity instanceof AbstractTrains && ((EntityRollingStock)entityOne).updateTicks%10==0) {
					//doesLink1StillExist(entityOne, lis);
					//doesLink2StillExist(entityOne, lis);
				}

				if (entity != entityOne.riddenByEntity && (entity instanceof AbstractTrains) &&  (entityOne instanceof AbstractTrains) && ((AbstractTrains) entityOne).isAttaching && ((AbstractTrains) entity).isAttaching) {
					addStake(entity, entityOne, true);
				}

			}

		}

		if (((AbstractTrains) entityOne).cartLinked1 != null) {
			StakePhysic(((AbstractTrains) entityOne).cartLinked1, entityOne,1);
		}
		if (((AbstractTrains) entityOne).cartLinked2 != null) {
			StakePhysic(((AbstractTrains) entityOne).cartLinked2, entityOne,2);
		}
	}

	/**
	 * testing if the attached cart on link1 still exist
	 * 
	 * @param entityOne
	 * @param lis
	 */
	private void doesLink1StillExist(Entity entityOne, List lis) {
		boolean link1Missing = false;
		boolean link2Missing = false;
		
		for (int j1 = 0; j1 < lis.size(); j1++) {
			Entity entity = (Entity) lis.get(j1);
			/**
			 * Check if the entity with the registered ID still exist
			 */
			if (entity instanceof AbstractTrains && (((AbstractTrains) entity).getUniqueTrainID() == ((AbstractTrains) entityOne).Link1)) {
				link1Missing = false;
			}
			else{
				link1Missing = true;
			}
			if (entity instanceof AbstractTrains && (((AbstractTrains) entity).getUniqueTrainID() == ((AbstractTrains) entityOne).Link2)) {
				link2Missing = false;
			}else{
				link2Missing = true;
			}

		}
		((AbstractTrains)entityOne).clearLinkTimer++;
		if(((AbstractTrains)entityOne).clearLinkTimer<20)return;
		((AbstractTrains)entityOne).clearLinkTimer=0;
		//System.out.println("link1Missing "+link1Missing+" link2Missing "+link2Missing);
		
		if(link1Missing && ((AbstractTrains) entityOne).Link1!=0 && ((AbstractTrains) entityOne).Link1!=-1){
			System.out.println("clear 1   "+((AbstractTrains) entityOne).Link1+"  "+entityOne);
			freeLink1(entityOne);
		}
		if(link2Missing && ((AbstractTrains) entityOne).Link2!=0 && ((AbstractTrains) entityOne).Link2!=-1){
			System.out.println("clear 2   "+((AbstractTrains) entityOne).Link2+"  "+entityOne);
			freeLink2(entityOne);
		}
		/*if (((AbstractTrains) entityOne).Link1 != 0)
			freeLink1(entityOne);
		/**
		 * When links are reseted with Draft gear, it's set to -1 so freeLink() is called
		 */
		/*if (((AbstractTrains) entityOne).Link1 == -1)
			freeLink1(entityOne);*/

	}

	/**
	 * testing if the attached cart on link2 still exist
	 * 
	 * @param entityOne
	 * @param lis
	 */
	private void doesLink2StillExist(Entity entityOne, List lis) {
		for (int j1 = 0; j1 < lis.size(); j1++) {
			Entity entity = (Entity) lis.get(j1);
			/**
			 * Check if the entity with the registered ID still exist
			 */
			if (entity instanceof AbstractTrains && (((AbstractTrains) entity).getUniqueTrainID() == ((AbstractTrains) entityOne).Link2)) {

				return;
			}
		}
		((AbstractTrains)entityOne).clearLinkTimer++;
		if(((AbstractTrains)entityOne).clearLinkTimer<60)return;
		((AbstractTrains)entityOne).clearLinkTimer=0;
		System.out.println("clear 1   "+((AbstractTrains) entityOne).Link1+"  "+entityOne);
		//System.out.println("clear 2"+entityOne);
		
		if (((AbstractTrains) entityOne).Link2 != 0)
			freeLink2(entityOne);
		/**
		 * When links are reseted with Draft gear, it's set to -1 so freeLink() is called
		 */
		if (((AbstractTrains) entityOne).Link2 == -1)
			freeLink2(entityOne);
	}

	/**
	 * obvious
	 * 
	 * @param entity
	 */
	private void freeLink1(Entity entity) {
		((AbstractTrains) entity).Link1 = 0;
		((AbstractTrains) entity).cartLinked1 = null;
		((EntityRollingStock) entity).RollingStock.clear();
		// System.out.println("free link1 "+entity);

	}

	/**
	 * same
	 * 
	 * @param entity
	 */
	private void freeLink2(Entity entity) {
		((AbstractTrains) entity).Link2 = 0;
		((AbstractTrains) entity).cartLinked2 = null;
		((EntityRollingStock) entity).RollingStock.clear();
		// System.out.println("free link2 "+entity);
	}

	/**
	 * First it resets linkageNumber then it checks the links if link1 exist then linkageNumber++ else linkageNumber-- (only if linkageNumber is higher than 0) Same for link2
	 * 
	 * @param entity
	 */
	private void addLinkNumber(Entity entity) {
		((EntityRollingStock) entity).linkageNumber = 0;

		if (((AbstractTrains) entity).Link1 != 0) {
			((EntityRollingStock) entity).linkageNumber++;
		}
		else if (((EntityRollingStock) entity).linkageNumber > 0) {
			((EntityRollingStock) entity).linkageNumber--;
		}
		if (((AbstractTrains) entity).Link2 != 0) {
			((EntityRollingStock) entity).linkageNumber++;
		}
		else if (((EntityRollingStock) entity).linkageNumber > 0) {
			((EntityRollingStock) entity).linkageNumber--;
		}

	}


	private float distanceBehindCart;
	/**
	 * Attaching to colliding carts
	 */
	public void addStake(Entity cart1, Entity cart2, boolean byPlayer) {
		distanceBehindCart = ((AbstractTrains) cart1).getLinkageDistance((EntityMinecart) cart1);
		if (worldObj.isRemote) {
			return;
		}
		if (((AbstractTrains) cart2).isAttaching && (((AbstractTrains) cart1).isAttaching)) {
			if (cart1 instanceof AbstractTrains) {

				double distancesX[] = new double[4];
				double distancesZ[] = new double[4];
				double euclidian[] = new double[4];

				double d=0;
				double d1=0;
				double vecX=0;
				double vecZ=0;

				if(((EntityRollingStock) cart1).bogieLoco[0]!=null || ((EntityRollingStock) cart2).bogieLoco[0]!=null){

					if(((EntityRollingStock) cart1).bogieLoco[0]!=null && ((EntityRollingStock) cart2).bogieLoco[0]==null){
						distancesX[0] = ((AbstractTrains) cart1).posX - ((AbstractTrains) cart2).posX ;
						distancesZ[0] = ((AbstractTrains) cart1).posZ - ((AbstractTrains) cart2).posZ ;

						distancesX[1] = ((EntityRollingStock) cart1).bogieLoco[0].posX - ((AbstractTrains) cart2).posX ;
						distancesZ[1] = ((EntityRollingStock) cart1).bogieLoco[0].posZ - ((AbstractTrains) cart2).posZ ;

						if(((EntityRollingStock) cart2).bogieUtility[0]!=null && ((EntityRollingStock) cart1).bogieUtility[0]==null){
							double shift2 = ((EntityRollingStock) cart2).bogieUtility[0].bogieShift/2;

							float rotationCos2 = (float) Math.cos(Math
									.toRadians(((EntityRollingStock) cart2).serverRealRotation + 90));
							float rotationSin2 = (float) Math.sin(Math
									.toRadians(((EntityRollingStock) cart2).serverRealRotation + 90));

							double bogieX2 = (cart2.posX - (rotationCos2 * shift2));
							double bogieZ2 = (cart2.posZ - (rotationSin2* shift2));

							distancesX[0] = ((AbstractTrains) cart1).posX - bogieX2 ;
							distancesZ[0] = ((AbstractTrains) cart1).posZ - bogieZ2 ;
							distancesX[1] = ((EntityRollingStock) cart1).bogieLoco[0].posX - bogieX2;
							distancesZ[1] = ((EntityRollingStock) cart1).bogieLoco[0].posZ - bogieZ2;
						}
						distancesX[2] = 100;
						distancesZ[2] = 100;
						distancesX[3] = 100;
						distancesZ[3] = 100;
						for(int i = 0; i< distancesX.length;i++){
							euclidian[i] = MathHelper.sqrt_double((distancesX[i] * distancesX[i]) + (distancesZ[i] * distancesZ[i]));
						}

					}else if(((EntityRollingStock) cart1).bogieLoco[0]==null && ((EntityRollingStock) cart2).bogieLoco[0]!=null){	
						distancesX[0] = ((AbstractTrains) cart1).posX - ((AbstractTrains) cart2).posX ;
						distancesZ[0] = ((AbstractTrains) cart1).posZ - ((AbstractTrains) cart2).posZ ;
						distancesX[1] = ((AbstractTrains) cart1).posX - ((EntityRollingStock) cart2).bogieLoco[0].posX ;
						distancesZ[1] = ((AbstractTrains) cart1).posZ - ((EntityRollingStock) cart2).bogieLoco[0].posZ ;

						if(((EntityRollingStock) cart1).bogieUtility[0]!=null && ((EntityRollingStock) cart2).bogieUtility[0]==null){
							double shift1 = ((EntityRollingStock) cart1).bogieUtility[0].bogieShift/2;

							float rotationCos1 = (float) Math.cos(Math
									.toRadians(((EntityRollingStock) cart1).serverRealRotation + 90));
							float rotationSin1 = (float) Math.sin(Math
									.toRadians(((EntityRollingStock) cart1).serverRealRotation + 90));

							double bogieX1 = (cart1.posX - (rotationCos1 * shift1));
							double bogieZ1 = (cart1.posZ - (rotationSin1* shift1));

							distancesX[0] = bogieX1 - ((AbstractTrains) cart2).posX;
							distancesZ[0] = bogieZ1 - ((AbstractTrains) cart2).posZ;
							distancesX[1] = bogieX1 - ((EntityRollingStock) cart2).bogieLoco[0].posX;
							distancesZ[1] = bogieZ1 - ((EntityRollingStock) cart2).bogieLoco[0].posZ;
						}
						distancesX[2] = 100;
						distancesZ[2] = 100;
						distancesX[3] = 100;
						distancesZ[3] = 100;
						for(int i = 0; i< distancesX.length;i++){
							euclidian[i] = MathHelper.sqrt_double((distancesX[i] * distancesX[i]) + (distancesZ[i] * distancesZ[i]));
						}

					}else{
						distancesX[0] = ((AbstractTrains) cart1).posX - ((AbstractTrains) cart2).posX ;
						distancesZ[0] = ((AbstractTrains) cart1).posZ - ((AbstractTrains) cart2).posZ ;
						distancesX[1] = ((EntityRollingStock) cart1).bogieLoco[0].posX - ((AbstractTrains) cart2).posX ;
						distancesZ[1] = ((EntityRollingStock) cart1).bogieLoco[0].posZ - ((AbstractTrains) cart2).posZ ;
						distancesX[2] = ((AbstractTrains) cart1).posX - ((EntityRollingStock) cart2).bogieLoco[0].posX ;
						distancesZ[2] = ((AbstractTrains) cart1).posZ - ((EntityRollingStock) cart2).bogieLoco[0].posZ ;
						distancesX[3] = ((EntityRollingStock) cart1).bogieLoco[0].posX - ((EntityRollingStock) cart2).bogieLoco[0].posX ;
						distancesZ[3] = ((EntityRollingStock) cart1).bogieLoco[0].posZ - ((EntityRollingStock) cart2).bogieLoco[0].posZ ;

						for(int i = 0; i< distancesX.length;i++){
							euclidian[i] = MathHelper.sqrt_double((distancesX[i] * distancesX[i]) + (distancesZ[i] * distancesZ[i]));
						}
					}
					double minX = euclidian[0];
					int minIndex=0;
					for ( int k=0; k<euclidian.length; k++ )
					{
						if ( Math.abs(euclidian[k]) < Math.abs(minX)){
							minX = euclidian[k];
							minIndex = k;
						}
					}

					d = distancesX[minIndex];
					d1 = distancesZ[minIndex];
					vecX=d;
					vecZ=d1;

				}else if(((EntityRollingStock) cart1).bogieUtility[0]!=null || ((EntityRollingStock) cart2).bogieUtility[0]!=null){

					if(((EntityRollingStock) cart1).bogieUtility[0]!=null && ((EntityRollingStock) cart2).bogieUtility[0]==null){
						double shift1 = ((EntityRollingStock) cart1).bogieUtility[0].bogieShift/2;

						float rotationCos1 = (float) Math.cos(Math
								.toRadians(((EntityRollingStock) cart1).serverRealRotation + 90));
						float rotationSin1 = (float) Math.sin(Math
								.toRadians(((EntityRollingStock) cart1).serverRealRotation + 90));

						double bogieX1 = (cart1.posX - (rotationCos1 * shift1));
						double bogieZ1 = (cart1.posZ - (rotationSin1* shift1));

						d = bogieX1 - ((AbstractTrains) cart2).posX ;
						d1 = bogieZ1 - ((AbstractTrains) cart2).posZ ;



					}else if(((EntityRollingStock) cart1).bogieUtility[0]==null && ((EntityRollingStock) cart2).bogieUtility[0]!=null){

						double shift2 = ((EntityRollingStock) cart2).bogieUtility[0].bogieShift/2;

						float rotationCos2 = (float) Math.cos(Math
								.toRadians(((EntityRollingStock) cart2).serverRealRotation + 90));
						float rotationSin2 = (float) Math.sin(Math
								.toRadians(((EntityRollingStock) cart2).serverRealRotation + 90));

						double bogieX2 = (cart2.posX - (rotationCos2 * shift2));
						double bogieZ2 = (cart2.posZ - (rotationSin2 * shift2));

						d = ((AbstractTrains) cart1).posX - bogieX2 ;
						d1 = ((AbstractTrains) cart1).posZ - bogieZ2 ;
					}else{


						double shift1 = ((EntityRollingStock) cart1).bogieUtility[0].bogieShift/2;
						double shift2 = ((EntityRollingStock) cart2).bogieUtility[0].bogieShift/2;

						float rotationCos2 = (float) Math.cos(Math
								.toRadians(((EntityRollingStock) cart2).serverRealRotation + 90));
						float rotationSin2 = (float) Math.sin(Math
								.toRadians(((EntityRollingStock) cart2).serverRealRotation + 90));

						float rotationCos1 = (float) Math.cos(Math
								.toRadians(((EntityRollingStock) cart1).serverRealRotation + 90));
						float rotationSin1 = (float) Math.sin(Math
								.toRadians(((EntityRollingStock) cart1).serverRealRotation + 90));

						double bogieX1 = (cart1.posX - (rotationCos1 * shift1));
						double bogieZ1 = (cart1.posZ - (rotationSin1* shift1));

						double bogieX2 = (cart2.posX - (rotationCos2 * shift2));
						double bogieZ2 = (cart2.posZ - (rotationSin2 * shift2));

						d = bogieX1 - bogieX2 ;
						d1 = bogieZ1 - bogieZ2 ;

					}

					vecX=d;
					vecZ=d1;


				}else{
					d = ((AbstractTrains) cart1).posX - ((AbstractTrains) cart2).posX;
					d1 = ((AbstractTrains) cart1).posZ - ((AbstractTrains) cart2).posZ;
					vecX = ((AbstractTrains) cart1).posX - ((AbstractTrains) cart2).posX;
					vecZ = ((AbstractTrains) cart1).posZ - ((AbstractTrains) cart2).posZ;
				}
				double d2 = MathHelper.sqrt_double((d * d) + (d1 * d1));
				//System.out.println(d2);
				if (d2 <= distanceBehindCart) {
					/**
					 * attach only if the link is free, each cart has two link obviously
					 */
					
					
					
					if (((AbstractTrains) cart1).Link1 == 0 || ((AbstractTrains) cart1).Link1 == -1) {
						((AbstractTrains) cart1).Link1 = ((AbstractTrains) cart2).getUniqueTrainID();
						//System.out.println(((AbstractTrains) cart1).Link1+" 1 "+((AbstractTrains) cart2).getUniqueTrainID());

					}
					else if (((AbstractTrains) cart1).Link2 == 0 || ((AbstractTrains) cart1).Link2 == -1) {
						((AbstractTrains) cart1).Link2 = ((AbstractTrains) cart2).getUniqueTrainID();
						//System.out.println(((AbstractTrains) cart1).Link2+" 2 "+((AbstractTrains) cart2).getUniqueTrainID());
					}
					if (((AbstractTrains) cart1).cartLinked1 == null) {
						((AbstractTrains) cart1).cartLinked1 = (EntityRollingStock) cart2;
					}
					else if (((AbstractTrains) cart1).cartLinked2 == null) {
						((AbstractTrains) cart1).cartLinked2 = (EntityRollingStock) cart2;
					}

					if (((AbstractTrains) cart2).Link1 == 0 || ((AbstractTrains) cart2).Link1 == -1) {
						((AbstractTrains) cart2).Link1 = ((AbstractTrains) cart1).getUniqueTrainID();
					}
					else if (((AbstractTrains) cart2).Link2 == 0 || ((AbstractTrains) cart2).Link2 == -1) {
						((AbstractTrains) cart2).Link2 = ((AbstractTrains) cart1).getUniqueTrainID();
					}

					if (((AbstractTrains) cart2).cartLinked1 == null) {
						((AbstractTrains) cart2).cartLinked1 = (EntityRollingStock) cart1;
					}
					else if (((AbstractTrains) cart2).cartLinked2 == null) {
						((AbstractTrains) cart2).cartLinked2 = (EntityRollingStock) cart1;
					}

					((AbstractTrains) cart2).isAttached = true;

					((AbstractTrains) cart2).isAttaching = false;

					((AbstractTrains) cart1).isAttaching = false;


					((AbstractTrains) cart1).isAttached = true;

					if (((AbstractTrains) cart2).cartLinked1 != null && ((AbstractTrains) cart2).cartLinked1.train != null) {
						((AbstractTrains) cart2).cartLinked1.allTrains.remove(((AbstractTrains) cart2).cartLinked1.train);
						((AbstractTrains) cart2).cartLinked1.train.getTrains().clear();
						//System.out.println("clearing linked 1");
					}
					if (((AbstractTrains) cart2).cartLinked2 != null && ((AbstractTrains) cart2).cartLinked2.train != null) {
						((AbstractTrains) cart2).cartLinked2.allTrains.remove(((AbstractTrains) cart2).cartLinked2.train);
						((AbstractTrains) cart2).cartLinked2.train.getTrains().clear();
						//System.out.println("clearing linked 2");
					}


					EntityPlayer entityplayer = cart1.worldObj.getClosestPlayerToEntity(cart1, 20);//
					if (entityplayer != null && byPlayer) {
						entityplayer.addChatMessage(new ChatComponentText("attached!"));
					}
				}
			}
		}
	}

	/**
	 * testing if the carts are registered as linked
	 * 
	 * @param cart1
	 * @param cart2
	 * @return
	 */
	public boolean areLinked(Entity cart1, Entity cart2) {
		// Debug purpose
		/* System.out.println("cart1.getID() "+ ((AbstractTrains)cart1).getID()); System.out.println("cart2.getID() "+ ((AbstractTrains)cart2).getID()); System.out.println("cart1 link1 " + ((AbstractTrains)cart1).Link1); System.out.println("cart1 link2 " + ((AbstractTrains)cart1).Link2); System.out.println("cart2 link1 " + ((AbstractTrains)cart2).Link1); System.out.println("cart2 link2 " + ((AbstractTrains)cart2).Link2); */
		/**
		 * testing if the ID of the cart1 is registered as attached to the cart2 same with cart2 attached to cart1
		 */
		if ((((AbstractTrains) cart2).getUniqueTrainID() == ((AbstractTrains) cart1).Link1) || (((AbstractTrains) cart2).getUniqueTrainID() == ((AbstractTrains) cart1).Link2)) {
			return true;
		}
		else if ((((AbstractTrains) cart1).getUniqueTrainID() == ((AbstractTrains) cart2).Link1) || (((AbstractTrains) cart1).getUniqueTrainID() == ((AbstractTrains) cart2).Link2)) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * getting the optimal distance for each cart
	 * 
	 * @param cart1
	 * @param cart2
	 * @return
	 */
	public float getOptimalDistance(Entity cart1, Entity cart2) {
		float dist = 0.0F;
		if ((cart1 instanceof AbstractTrains))
			dist += ((AbstractTrains) cart1).getOptimalDistance((EntityMinecart) cart2);
		else {
			dist += 0.78F;
		}
		if ((cart2 instanceof AbstractTrains))
			dist += ((AbstractTrains) cart2).getOptimalDistance((EntityMinecart) cart1);
		else {
			dist += 0.78F;
		}
		return dist;
	}

	/**
	 * testing if the cart can pull or not
	 * 
	 * @param cart1
	 * @param cart2
	 * @return
	 */
	private boolean canCartBeAdjustedBy(Entity cart1, Entity cart2) {
		if (cart1 == cart2) {
			return false;
		}
		// System.out.println("cart "+cart1+"  cart adjusted "+((EntityRollingStock)cart1).canBeAdjusted((EntityMinecart)cart2));
		if (((cart1 instanceof EntityRollingStock)) && (!((EntityRollingStock) cart1).canBeAdjusted((EntityMinecart) cart2))) {
			return false;
		}
		return !RailTools.isCartLockedDown((EntityMinecart) cart1);
	}

	private int indexPickedX;
	private int indexPickedZ;
	private boolean picked = false;
	/**
	 * Handles the cart coupling physics
	 */
	private void StakePhysic(Entity cart1, Entity cart2, int linkIndex) {
		if (cart1 instanceof AbstractTrains && cart2 instanceof AbstractTrains && ((AbstractTrains) cart2).isAttached && ((AbstractTrains) cart1).isAttached && areLinked(cart2, cart1)) {

			if (worldObj.isRemote) {
				return;
			}

			boolean adj1 = canCartBeAdjustedBy(cart1, cart2);
			boolean adj2 = canCartBeAdjustedBy(cart2, cart1);


			double distancesX[] = new double[4];
			double distancesZ[] = new double[4];
			double euclidian[] = new double[4];

			double d=0;
			double d1=0;
			double vecX=0;
			double vecZ=0;
			int minIndex=0;

			if(((EntityRollingStock) cart1).bogieLoco[0]!=null || ((EntityRollingStock) cart2).bogieLoco[0]!=null){

				if(((EntityRollingStock) cart1).bogieLoco[0]!=null && ((EntityRollingStock) cart2).bogieLoco[0]==null){
					distancesX[0] = ((AbstractTrains) cart1).posX - ((AbstractTrains) cart2).posX ;
					distancesZ[0] = ((AbstractTrains) cart1).posZ - ((AbstractTrains) cart2).posZ ;

					distancesX[1] = ((EntityRollingStock) cart1).bogieLoco[0].posX - ((AbstractTrains) cart2).posX ;
					distancesZ[1] = ((EntityRollingStock) cart1).bogieLoco[0].posZ - ((AbstractTrains) cart2).posZ ;

					distancesX[2] = 100;
					distancesZ[2] = 100;
					distancesX[3] = 100;
					distancesZ[3] = 100;
					for(int i = 0; i< distancesX.length;i++){
						euclidian[i] = MathHelper.sqrt_double((distancesX[i] * distancesX[i]) + (distancesZ[i] * distancesZ[i]));
					}

				}else if(((EntityRollingStock) cart1).bogieLoco[0]==null && ((EntityRollingStock) cart2).bogieLoco[0]!=null){	
					distancesX[0] = ((AbstractTrains) cart1).posX - ((AbstractTrains) cart2).posX ;
					distancesZ[0] = ((AbstractTrains) cart1).posZ - ((AbstractTrains) cart2).posZ ;
					distancesX[1] = ((AbstractTrains) cart1).posX - ((EntityRollingStock) cart2).bogieLoco[0].posX ;
					distancesZ[1] = ((AbstractTrains) cart1).posZ - ((EntityRollingStock) cart2).bogieLoco[0].posZ ;

					distancesX[2] = 100;
					distancesZ[2] = 100;
					distancesX[3] = 100;
					distancesZ[3] = 100;
					for(int i = 0; i< distancesX.length;i++){
						euclidian[i] = MathHelper.sqrt_double((distancesX[i] * distancesX[i]) + (distancesZ[i] * distancesZ[i]));
					}

				}else{
					distancesX[0] = ((AbstractTrains) cart1).posX - ((AbstractTrains) cart2).posX ;
					distancesZ[0] = ((AbstractTrains) cart1).posZ - ((AbstractTrains) cart2).posZ ;
					distancesX[1] = ((EntityRollingStock) cart1).bogieLoco[0].posX - ((AbstractTrains) cart2).posX ;
					distancesZ[1] = ((EntityRollingStock) cart1).bogieLoco[0].posZ - ((AbstractTrains) cart2).posZ ;
					distancesX[2] = ((AbstractTrains) cart1).posX - ((EntityRollingStock) cart2).bogieLoco[0].posX ;
					distancesZ[2] = ((AbstractTrains) cart1).posZ - ((EntityRollingStock) cart2).bogieLoco[0].posZ ;
					distancesX[3] = ((EntityRollingStock) cart1).bogieLoco[0].posX - ((EntityRollingStock) cart2).bogieLoco[0].posX ;
					distancesZ[3] = ((EntityRollingStock) cart1).bogieLoco[0].posZ - ((EntityRollingStock) cart2).bogieLoco[0].posZ ;

					for(int i = 0; i< distancesX.length;i++){
						euclidian[i] = MathHelper.sqrt_double((distancesX[i] * distancesX[i]) + (distancesZ[i] * distancesZ[i]));
					}
				}
				double minX = euclidian[0];
				for ( int k=0; k<euclidian.length; k++ )
				{
					if ( Math.abs(euclidian[k]) < Math.abs(minX)){
						minX = euclidian[k];
						minIndex = k;
					}
				}

				d = distancesX[minIndex];
				d1 = distancesZ[minIndex];
				vecX=d;
				vecZ=d1;

			}else{
				d = ((AbstractTrains) cart1).posX - ((AbstractTrains) cart2).posX;
				d1 = ((AbstractTrains) cart1).posZ - ((AbstractTrains) cart2).posZ;
				vecX = ((AbstractTrains) cart1).posX - ((AbstractTrains) cart2).posX;
				vecZ = ((AbstractTrains) cart1).posZ - ((AbstractTrains) cart2).posZ;
			}

			double d2 = MathHelper.sqrt_double((d * d) + (d1 * d1));
			if(d2>15){
				//System.out.println("distance too big "+ cart1 +" "+cart2);
				if(cart1.worldObj!=null){
					EntityPlayer player = cart1.worldObj.getClosestPlayer(cart1.posX, cart1.posY, cart1.posZ, 300);
					if(player!=null){
						player.addChatMessage(new ChatComponentText(String.format("[TRAINCRAFT] The rolling stock at %d %d %d had a problem loading and has lost its link. Attached cart was too far away", (int)cart1.posX, (int)cart1.posY, (int)cart1.posZ)));
					}
				}
				
				//if(((AbstractTrains) cart1).cartLinked1!=null && ((AbstractTrains) cart1).cartLinked1.un)
				if(linkIndex==1){
					this.freeLink1(cart1);
					this.freeLink1(cart2);
				}
				if(linkIndex==2){
					this.freeLink2(cart1);
					this.freeLink2(cart2);
				}
				return;
			}
			double vecNorm = MathHelper.sqrt_double(vecX * vecX + vecZ * vecZ);

			double unitX = vecX / vecNorm;
			double unitZ = vecZ / vecNorm;

			float optDist = getOptimalDistance(cart1, cart2);
			double stretch = d2 - optDist;
			//System.out.println("stretch "+stretch);

			double div = 0.2499999761581421D;
			double springX = div * stretch * vecX * -1;
			double springZ = div * stretch * vecZ * -1;

			springX = limitForce(springX);
			springZ = limitForce(springZ);


			if (adj1) {
				((AbstractTrains) cart1).motionX += springX;
				((AbstractTrains) cart1).motionZ += springZ;
			}
			if (adj2) {
				((AbstractTrains) cart2).motionX -= springX;
				((AbstractTrains) cart2).motionZ -= springZ;
			}

			double speedVecX = ((AbstractTrains) cart1).motionX - ((AbstractTrains) cart2).motionX;
			double speedVecZ = ((AbstractTrains) cart1).motionZ - ((AbstractTrains) cart2).motionZ;

			double dot = speedVecX * unitX + speedVecZ * unitZ;

			double divider = 0.4000000059604645D;//0.4000000059604645

			double dampX = divider * dot * unitX * -1;// 0.4
			double dampZ = divider * dot * unitZ * -1;

			dampX = limitForce(dampX);
			dampZ = limitForce(dampZ);

			if (adj1) {
				((AbstractTrains) cart1).motionX += dampX;
				((AbstractTrains) cart1).motionZ += dampZ;
			}
			if (adj2) {
				((AbstractTrains) cart2).motionX -= dampX;
				((AbstractTrains) cart2).motionZ -= dampZ;
			}
		}
	}

	private double limitForce(double force) {
		return Math.copySign(Math.abs(Math.min(Math.abs((double) force), 6.0D)), (double) force);
	}
	private double limitForce(double force, double max) {
		return Math.copySign(Math.abs(Math.min(Math.abs((double) force), max)), (double) force);
	}
}