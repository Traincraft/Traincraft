package src.train.common.api;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import src.train.common.library.ItemIDs;

public class TrainsOnClick {
	public boolean onClickWithStake(AbstractTrains train, ItemStack itemstack, EntityPlayer playerEntity, World world) {
		if (itemstack != null && itemstack.itemID == ItemIDs.stake.item.itemID && !world.isRemote) {
			if (playerEntity.isSneaking() && train instanceof Locomotive) {
				if (!train.canBeAdjusted(train)) {
					playerEntity.addChatMessage(((EntityRollingStock) train).getTrainName() + " can be pulled, don't forget to fuel it!");
					playerEntity.addChatMessage("Attach the BACK of this locomotive to the BACK of another locomotive. Otherwise you will encounter weird problems on turns");
					((Locomotive) train).setCanBeAdjusted(true);
					((Locomotive) train).canBePulled = true;
				}
				else {
					playerEntity.addChatMessage(((EntityRollingStock) train).getTrainName() + " can pull");
					((Locomotive) train).setCanBeAdjusted(false);
					((Locomotive) train).canBePulled = false;
				}
				return true;
			}
			if (!((AbstractTrains) train).isAttaching) {
				((AbstractTrains) train).isAttaching = true;
				playerEntity.addChatMessage("Attaching mode on for: " + ((EntityRollingStock) train).getTrainName());
				itemstack.damageItem(1, playerEntity);

			}
			else {
				playerEntity.addChatMessage("Reset, click again to couple new cart to this one");
				((AbstractTrains) train).Link1 = -1;
				((AbstractTrains) train).Link2 = -1;
				if(((AbstractTrains) train).cartLinked1!=null && ((AbstractTrains) train).cartLinked1.Link1==((AbstractTrains) train).getUniqueTrainID())((AbstractTrains) train).cartLinked1.Link1=-1;
				if(((AbstractTrains) train).cartLinked1!=null && ((AbstractTrains) train).cartLinked1.Link2==((AbstractTrains) train).getUniqueTrainID())((AbstractTrains) train).cartLinked1.Link2=-1;
				if(((AbstractTrains) train).cartLinked2!=null && ((AbstractTrains) train).cartLinked2.Link1==((AbstractTrains) train).getUniqueTrainID())((AbstractTrains) train).cartLinked2.Link1=-1;
				if(((AbstractTrains) train).cartLinked2!=null && ((AbstractTrains) train).cartLinked2.Link2==((AbstractTrains) train).getUniqueTrainID())((AbstractTrains) train).cartLinked2.Link2=-1;
				
				if(((AbstractTrains) train).cartLinked1!=null && ((AbstractTrains) train).cartLinked1.cartLinked1!=null &&((AbstractTrains) train).cartLinked1.cartLinked1.equals(train))((AbstractTrains) train).cartLinked1.cartLinked1=null;
				if(((AbstractTrains) train).cartLinked1!=null && ((AbstractTrains) train).cartLinked1.cartLinked2!=null &&((AbstractTrains) train).cartLinked1.cartLinked2.equals(train))((AbstractTrains) train).cartLinked1.cartLinked2=null;
				if(((AbstractTrains) train).cartLinked2!=null && ((AbstractTrains) train).cartLinked2.cartLinked2!=null &&((AbstractTrains) train).cartLinked2.cartLinked2.equals(train))((AbstractTrains) train).cartLinked2.cartLinked2=null;
				if(((AbstractTrains) train).cartLinked2!=null && ((AbstractTrains) train).cartLinked2.cartLinked1!=null &&((AbstractTrains) train).cartLinked2.cartLinked1.equals(train))((AbstractTrains) train).cartLinked2.cartLinked1=null;
				
				
				((AbstractTrains) train).cartLinked1 = null;
				((AbstractTrains) train).cartLinked2 = null;
				((AbstractTrains) train).isAttaching = false;
				((AbstractTrains) train).isAttached = false;

				if (((EntityRollingStock) train).train != null) {
					((EntityRollingStock) train).train.resetTrain();
				}
				
				
				if (((EntityRollingStock) train).train != null && ((EntityRollingStock) train).train.getTrains().size() <= 1) {
					/** no more @RollingStocks in the train then remove the train object from the global list */
					((EntityRollingStock) train).allTrains.remove(((EntityRollingStock) train).train);
					//System.out.println("Train is destroyed, remove it from the global array");
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
}
