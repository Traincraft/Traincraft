package train.common.entity.rollingStock;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.EntityRollingStock;
import train.common.api.IPassenger;
import train.common.library.BlockIDs;
import train.common.wellcar.BasicallyContainer;

public class HuskyStackWellcar extends EntityRollingStock implements IPassenger {
    public BasicallyContainer container1;
    public BasicallyContainer container2;

    public HuskyStackWellcar(World world) {
        super(world);
    }

    public HuskyStackWellcar(World world, double d, double d1, double d2) {
        super(world, d, d1, d2);
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 3.3F;
    }
    @Override
    public void setDead() {
        super.setDead();
        ItemStack stackToPlace = new ItemStack(BlockIDs.FortyFootContainer.block, 1);

        if (container1 != null) {
            if (container1.savedData != null) {
                container1.savedData.removeTag("x");
                container1.savedData.removeTag("y");
                container1.savedData.removeTag("z");
                stackToPlace.setTagCompound(container1.savedData);
            }
            if (!worldObj.isRemote) {
                EntityItem dropItem = new EntityItem(this.worldObj, this.posX, this.posY, this.posZ, stackToPlace.copy());
                dropItem.delayBeforeCanPickup = 1;
                worldObj.spawnEntityInWorld(dropItem);
            }
        }

        if (container2 != null) {
            if (container2.savedData != null) {
                container2.savedData.removeTag("x");
                container2.savedData.removeTag("y");
                container2.savedData.removeTag("z");
                stackToPlace.setTagCompound(container2.savedData);
            }
            if (!worldObj.isRemote) {
                EntityItem dropItem = new EntityItem(this.worldObj, this.posX, this.posY, this.posZ, stackToPlace.copy());
                dropItem.delayBeforeCanPickup = 1;
                worldObj.spawnEntityInWorld(dropItem);
            }

        }

        isDead = true;
    }
    @Override
    public boolean interactFirst(EntityPlayer entityplayer) {
        super.interactFirst(entityplayer);
        playerEntity = entityplayer;
        if (entityplayer.getHeldItem() != null && entityplayer.getHeldItem().getUnlocalizedName().equals("tile.tc:FortyFootContainer")) {
            ItemStack theItem = entityplayer.getHeldItem();
            if (container1 == null) {
                if (theItem.getTagCompound() != null) {
                    this.container1 = new BasicallyContainer("FortyFootContainer", theItem.getTagCompound().getString("currentColorString"), theItem.getTagCompound());
                } else {
                    this.container1 = new BasicallyContainer("FortyFootContainer", "Grey", null);
                }
            } else {
                if (theItem.getTagCompound() != null) {
                    this.container2 = new BasicallyContainer("FortyFootContainer", theItem.getTagCompound().getString("currentColorString"), theItem.getTagCompound());
                } else {
                    this.container2 = new BasicallyContainer("FortyFootContainer", "Grey", null);
                }
            }
            if (!worldObj.isRemote) {
                entityplayer.inventory.setInventorySlotContents(entityplayer.inventory.currentItem, (ItemStack)null);
            }
            /*NBTTagList list = theItem.getTagCompound().getTagList("Items", Constants.NBT.TAG_COMPOUND);

            if (container1 == null) {
                this.container1 = new BasicallyContainer("FortyFootContainer", "grey", list);
            } else {
                this.container2 = new BasicallyContainer("FortyFootContainer", "grey", list);
            }*/
        } else if (entityplayer.getHeldItem() == null && entityplayer.isSneaking()) {
            ItemStack theItemStack = new ItemStack(BlockIDs.FortyFootContainer.block, 1);
            if (container2 != null) {
                if (container2.savedData != null) {
                    container2.savedData.removeTag("x");
                    container2.savedData.removeTag("y");
                    container2.savedData.removeTag("z");
                    theItemStack.setTagCompound(container2.savedData);
                }
                if (!worldObj.isRemote) {
                    EntityItem dropItem = new EntityItem(entityplayer.getEntityWorld(), entityplayer.posX, entityplayer.posY, entityplayer.posZ, theItemStack.copy());
                    dropItem.delayBeforeCanPickup = 1;
                    playerEntity.worldObj.spawnEntityInWorld(dropItem);
                }
                container2 = null;

            } else {
                if (container1.savedData != null) {
                    container1.savedData.removeTag("x");
                    container1.savedData.removeTag("y");
                    container1.savedData.removeTag("z");
                    theItemStack.setTagCompound(container1.savedData);
                }
                if (!worldObj.isRemote) {
                    EntityItem dropItem = new EntityItem(entityplayer.getEntityWorld(), entityplayer.posX, entityplayer.posY, entityplayer.posZ, theItemStack.copy());
                    dropItem.delayBeforeCanPickup = 1;
                    playerEntity.worldObj.spawnEntityInWorld(dropItem);
                }
                container1 = null;
            }
        }
        return true;
    }

}
