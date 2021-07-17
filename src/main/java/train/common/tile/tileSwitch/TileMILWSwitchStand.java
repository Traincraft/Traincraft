package train.common.tile.tileSwitch;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.library.BlockIDs;
import train.common.tile.TileTraincraft;

import java.util.Random;

public class TileMILWSwitchStand extends TileTraincraft {

    private int updateTicks = 0;
    private static Random rand = new Random();
    private ForgeDirection facing;

    @Override
    public void readFromNBT(NBTTagCompound nbtTag, boolean forSyncing) {
        //super.readFromNBT(nbtTag, false);

        facing = ForgeDirection.getOrientation(nbtTag.getByte("Orientation"));
    }

    @Override
    public void updateEntity() {
        super.updateEntity();
        updateTicks++;

        /**
         * Remove any block on top of the wind mill
         */
        if (!worldObj.isRemote) {
            if (updateTicks % 20 == 0) {
                if (!this.worldObj.isAirBlock(this.xCoord, this.yCoord + 1, this.zCoord)) {
                    Block block = this.worldObj.getBlock(this.xCoord, this.yCoord + 1, this.zCoord);
                    if (block != null) {
                        EntityItem entityitem = new EntityItem(worldObj, this.xCoord, this.yCoord + 1, this.zCoord, new ItemStack(Item.getItemFromBlock(BlockIDs.MILWSwitchStand.block), 1));
                        float f3 = 0.05F;
                        entityitem.motionX = (float) rand.nextGaussian() * f3;
                        entityitem.motionY = (float) rand.nextGaussian() * f3 + 0.2F;
                        entityitem.motionZ = (float) rand.nextGaussian() * f3;
                        worldObj.spawnEntityInWorld(entityitem);
                    }
                    this.worldObj.setBlockToAir(this.xCoord, this.yCoord, this.zCoord);
                }
                syncTileEntity();
            }
        }
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound nbtTag, boolean forSyncing) {
        //super.writeToNBT(nbtTag, forSyncing);
        if (facing != null) {

            nbtTag.setByte("Orientation", (byte) facing.ordinal());
        }
        else {

            nbtTag.setByte("Orientation", (byte) ForgeDirection.NORTH.ordinal());
        }
        return nbtTag;
    }

    public ForgeDirection getFacing() {
        if(facing!=null){
            return this.facing;
        }
        return ForgeDirection.UNKNOWN;
    }


    public void setFacing(ForgeDirection face) {

        if (facing != face)
            this.facing = face;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-1, zCoord-1, xCoord + 2, yCoord + 2, zCoord + 2);
    }

}