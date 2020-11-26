package ebf.tim.blocks.rails;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.XmlBuilder;
import ebf.tim.blocks.RailTileEntity;
import ebf.tim.items.ItemRail;
import ebf.tim.registry.TiMItems;
import ebf.tim.utility.DebugUtil;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.ArrayList;

/**
 * @author Eternal Blue Flame
 */
public class BlockRailCore extends BlockRail implements ITileEntityProvider {

    private static final int[] updateMatrix = {-2,-1,0,1,2};






    //750mm single gauge track, each entry in the array is another gauge the rails would support
    public final int[] gaugemm;
    //scales the model parts
    public final float renderScale;


    public BlockRailCore(){
        setCreativeTab(null);
        gaugemm=new int[]{750};
        renderScale=1;
    }

    public BlockRailCore(int gauge, float renderScale){
        setCreativeTab(null);
        gaugemm=new int[]{gauge};
        this.renderScale=renderScale;
    }

    public BlockRailCore(int[] gauge, float renderScale){
        setCreativeTab(null);
        gaugemm=gauge;
        this.renderScale=renderScale;
    }

    @Override
    public boolean hasTileEntity(int metadata) {
        return true;
    }

    @Override
    public int tickRate(World world){return 40;}

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean getTickRandomly(){return false;}

    @Override
    public int getRenderType() {
        return Blocks.rail.getRenderType();
    }

    @Override
    public boolean isFlexibleRail(IBlockAccess world, int y, int x, int z){return true;}

    @Override
    public float getRailMaxSpeed(World world, EntityMinecart cart, int y, int x, int z){
        return 0.4f;//getTile(world, x, y, z)!=null?getTile(world, x, y, z).getRailSpeed():0.4f;
    }

    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess p_149720_1_, int p_149720_2_, int p_149720_3_, int p_149720_4_) {
        return super.colorMultiplier(p_149720_1_, p_149720_2_, p_149720_3_, p_149720_4_);
    }

    @Override
    public boolean canCollideCheck(int p_149678_1_, boolean p_149678_2_){
        return true;
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        if (getBasicRailMetadata(world, null, x,y,z) >6) {
            return AxisAlignedBB.getBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.5f, 1.0F);
        } else {
            return AxisAlignedBB.getBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
        }
    }


    public void setBlockBoundsBasedOnState(IBlockAccess p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_) {
        if (getBasicRailMetadata(p_149719_1_, null, p_149719_2_, p_149719_3_, p_149719_4_) >6) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5f, 1.0F);
        } else {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
        }
    }


    public boolean isBlockSolid(IBlockAccess p_149747_1_, int p_149747_2_, int p_149747_3_, int p_149747_4_, int p_149747_5_) {
        return true;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta){
        return new RailTileEntity();
    }

    @Override
    public TileEntity createTileEntity(World world, int metadata){
        return createNewTileEntity(world,metadata);
    }



    @Override
    public int getBasicRailMetadata(IBlockAccess world, EntityMinecart cart, int x, int y, int z) {
        if(!(world.getTileEntity(x,y,z) instanceof RailTileEntity)){
            return 0;
        }
        int meta = ((RailTileEntity) world.getTileEntity(x,y,z)).getMeta();
        if(isPowered()) {
            meta = meta & 7;
        }

        if (cart == null || cart.getEntityData() == null){
                return meta;
            }
        //first be sure the key exists, and create it if it doesn't, that way we be sure we don't crash. Also if it doesn't exist we can just return the base meta unchanged.
        if (!cart.getEntityData().hasKey("tim.lastusedrail.meta")){
            cart.getEntityData().setInteger("tim.lastusedrail.meta",meta);
            return meta;
        }
        boolean changed = false;
        switch (meta) {
            //add support for intersections
            case 0: {
                //only part that theoretically works.
                if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 1) {
                    meta = 1;
                }
                changed = true;
                break;
            }
            case 1: {
                if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 0) {
                    meta = 0;
                }
                changed = true;
                break;
            }
            case 6:{
                if(getTileEntityMeta(world,x+1,y,z)==9 && cart.motionZ>0 && cart.getEntityData().getInteger("tim.lastusedrail.meta")==0){
                    return 0;//this already worked fine, but make it smoother
                } else if(getTileEntityMeta(world,x+1,y,z)==7){
                    if(cart.getEntityData().getInteger("tim.lastusedrail.meta")==0) {
                        return 0;//cover parallel entering from wrong end on straight
                    } else if(cart.getEntityData().getInteger("tim.lastusedrail.meta")==7){
                        return 9;//cover parallel off shape
                    }
                } else if(getTileEntityMeta(world,x,y,z+1)==8 && cart.motionX>0 && cart.getEntityData().getInteger("tim.lastusedrail.meta")==1){
                    return 1;//this already worked fine, but make it smoother
                } else if (getTileEntityMeta(world,x,y,z+1)==9) {
                    if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 1) {
                        return 1;//cover parallel entering from wrong end on straight
                    } else if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 9) {
                        return 7;//cover parallel off shape
                    }
                }
                changed = true;
                break;
            }
            case 7:{
                if(getTileEntityMeta(world,x-1,y,z)==9 && cart.motionX>0 && cart.getEntityData().getInteger("tim.lastusedrail.meta")==0){
                    return 0;//this already worked fine, but make it smoother
                } else if(getTileEntityMeta(world,x-1,y,z)==8){
                    if(cart.getEntityData().getInteger("tim.lastusedrail.meta")==0) {
                        return 0;//cover parallel entering from wrong end on straight
                    } else if(cart.getEntityData().getInteger("tim.lastusedrail.meta")==9){
                        return 6;//cover parallel off shape
                    }
                } else if(getTileEntityMeta(world,x,y,z+1)==9 && cart.motionX<0 && cart.getEntityData().getInteger("tim.lastusedrail.meta")==1){
                    return 1;//this already worked fine, but make it smoother
                } else if (getTileEntityMeta(world,x,y,z+1)==8) {
                    if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 1) {
                        return 1;//cover parallel entering from wrong end on straight
                    } else if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 7) {
                        return 6;//cover parallel off shape
                    }
                } else if(getTileEntityMeta(world,x-1,y,z)==6) {
                    if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 0) {
                        return 0;//cover parallel entering from wrong end on straight
                    } else if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 6) {
                        return 8;//cover parallel off shape
                    }
                }
                changed = true;
                break;
            }
            case 8:{
                if(getTileEntityMeta(world,x-1,y,z)==6 && cart.motionZ<0 && cart.getEntityData().getInteger("tim.lastusedrail.meta")==0){
                    return 0;//this already worked fine, but make it smoother
                } else if(getTileEntityMeta(world,x-1,y,z)==9){
                    if(cart.getEntityData().getInteger("tim.lastusedrail.meta")==0) {
                        return 0;//cover parallel entering from wrong end on straight
                    } else if(cart.getEntityData().getInteger("tim.lastusedrail.meta")==9){
                        return 7;//cover parallel off shape
                    }
                } else if(getTileEntityMeta(world,x,y,z-1)==6 && cart.motionX<0 && cart.getEntityData().getInteger("tim.lastusedrail.meta")==1){
                    return 1;//this already worked fine, but make it smoother
                } else if (getTileEntityMeta(world,x,y,z-1)==7) {
                    if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 1) {
                        return 1;//cover parallel entering from wrong end on straight
                    } else if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 7) {
                        return 9;//cover parallel off shape
                    }
                }
                changed = true;
                break;
            }
            case 9:{
                if(getTileEntityMeta(world,x+1,y,z)==6 && cart.motionZ>0 && cart.getEntityData().getInteger("tim.lastusedrail.meta")==0){
                    return 0;//this already worked fine, but make it smoother
                } else if(getTileEntityMeta(world,x+1,y,z)==7){
                    if(cart.getEntityData().getInteger("tim.lastusedrail.meta")==0 && cart.motionZ<0) {
                        return 0;//cover parallel entering from wrong end on straight
                    } else if(cart.getEntityData().getInteger("tim.lastusedrail.meta")==8){
                        return 6;//cover parallel off shape
                    }
                } else if(getTileEntityMeta(world,x,y,z-1)==7 && cart.motionX>0 && cart.getEntityData().getInteger("tim.lastusedrail.meta")==1){
                    return 1;//this already worked fine, but make it smoother
                } else if (getTileEntityMeta(world,x,y,z-1)==6) {
                    if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 1) {
                        return 1;//cover parallel entering from wrong end on straight
                    } else if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 6) {
                        return 8;//cover parallel off shape
                    }
                } else if(getTileEntityMeta(world,x+1,y,z)==8 && getTileEntityMeta(world,x+1,y,z-1)==6) {
                    if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 0) {
                        return 0;//cover parallel entering from wrong end on straight
                    } else if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 9) {
                        return 6;//cover parallel off shape
                    }
                }
                changed = true;
                break;
            }
            default: {
                changed = false;
            }
        }
        //note changes in the entity so we can keep track of whether or not this is an intersection
        if (changed){
            cart.getEntityData().setInteger("tim.lastusedrail.meta",meta);
            cart.getEntityData().setInteger("tim.lastusedrail.x",x);
            cart.getEntityData().setInteger("tim.lastusedrail.z",z);
        }
        return meta;
    }

    public int getTileEntityMeta(IBlockAccess w, int x, int y, int z){
        if(w.getTileEntity(x,y,z) instanceof RailTileEntity){
            return ((RailTileEntity) w.getTileEntity(x,y,z)).getMeta();
        }
        return -1;
    }

    @Override
    public void onBlockAdded(World p_149726_1_, int p_149726_2_, int p_149726_3_, int p_149726_4_) {
        updateNearbyShapes(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_);

        if (this.field_150053_a) {
            this.onNeighborBlockChange(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_, this);
        }
    }


    @Override
    public Material getMaterial(){
        return Blocks.iron_block.getMaterial();
    }


    @Override
    public boolean canPlaceBlockAt(World p_149742_1_, int p_149742_2_, int p_149742_3_, int p_149742_4_) {
        return true;
    }

    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z, EntityPlayer player) {
        return getPickBlock(target, world, x, y, z);
    }
    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
        if(world.getTileEntity(x,y,z) instanceof RailTileEntity) {
            XmlBuilder xml =((RailTileEntity) world.getTileEntity(x,y,z)).getData();
            return ItemRail.setStackData(
                    new ItemStack(TiMItems.railItem, 1), xml.getItemStack("rail"),
                    xml.getItemStack("ballast"), xml.getItemStack("ties"), xml.getItemStack("wires"));
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        return new ArrayList<>();
    }



    @Override
    public void onNeighborBlockChange(World worldObj, int x, int y, int z, Block b) {
        updateNearbyShapes(worldObj,x,y,z);
    }


    @Override
    public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_) {
        if(!p_149749_1_.isRemote){
            TileEntity e = p_149749_1_.getTileEntity(p_149749_2_,p_149749_3_,p_149749_4_);
            if(e instanceof RailTileEntity){
                ((RailTileEntity) e).dropItem();
            }
        }
        p_149749_1_.removeTileEntity(p_149749_2_, p_149749_3_, p_149749_4_);
    }

    @Override
    public int onBlockPlaced(World p_149660_1_, int p_149660_2_, int p_149660_3_, int p_149660_4_, int p_149660_5_, float p_149660_6_, float p_149660_7_, float p_149660_8_, int p_149660_9_) {
        //updateNearbyShapes(p_149660_1_, p_149660_2_, p_149660_3_, p_149660_4_);
        return p_149660_9_;
    }

    public void updateNearbyShapes(World world, int xCoord, int yCoord, int zCoord){
        //update the meta of just this rail
        new RailData(world,xCoord,yCoord,zCoord).rebuildRailMeta();

        //rails above and below the current rail don't always get updated because of how vanilla handles updating nearby blocks.
        // force it.
        for(int x : updateMatrix) {
            for (int z : updateMatrix) {
                new RailData(world,xCoord+x,yCoord+1,zCoord+z).rebuildRailMeta();
                new RailData(world,xCoord+x,yCoord-1,zCoord+z).rebuildRailMeta();
            }
        }

        //update all the other nearby rails.
        TileEntity te;
        for(int x : updateMatrix){
            for(int z : updateMatrix){
                for(int y : updateMatrix){
                    te=world.getTileEntity(x+xCoord,y+yCoord,z+zCoord);
                    if(te instanceof RailTileEntity && ((RailTileEntity) te).getData()!=null){
                        RailShapeCore.processPoints(x+xCoord,y+yCoord, z+zCoord,world,
                                getShape(world, x+xCoord,y+yCoord, z+zCoord),
                                ((RailTileEntity) te).getData());
                    }
                }
            }
        }
    }

    //override this to provide a different gauge
    public void updateShape(int xPos, int yPos, int zPos, World worldObj, ItemStack rail, @Nullable ItemStack ties, @Nullable ItemStack ballast, @Nullable ItemStack wires){
        RailShapeCore.processPoints(xPos, yPos, zPos, getShape(worldObj, xPos, yPos, zPos),gaugemm, renderScale, worldObj, rail, ties, ballast, wires);
    }



    public static RailSimpleShape getShape(World worldObj, int xPos, int yPos, int zPos){
        if(!(worldObj.getBlock(xPos,yPos,zPos) instanceof BlockRailCore)){
            return null;
        }
        TileEntity te= worldObj.getTileEntity(xPos, yPos, zPos);
        if(!(te instanceof RailTileEntity)){
            te = new RailTileEntity();
            te.xCoord=xPos;
            te.yCoord=yPos;
            te.zCoord=zPos;
        }
        switch (((RailTileEntity)te).getMeta()){
            //Z straight
            case 0: {
                return RailVanillaShapes.vanillaZStraight(worldObj, xPos, yPos, zPos);
            }
            //X straight
            case 1: {
                return RailVanillaShapes.vanillaXStraight(worldObj, xPos, yPos, zPos);
            }

            //curves
            case 9: {
                return RailVanillaShapes.vanillaCurve9(worldObj, xPos, yPos, zPos);
            }
            case 8: {
                return RailVanillaShapes.vanillaCurve8(worldObj, xPos, yPos, zPos);
            }
            case 7: {
                return RailVanillaShapes.vanillaCurve7(worldObj, xPos, yPos, zPos);
            }
            case 6: {
                return RailVanillaShapes.vanillaCurve6(worldObj, xPos, yPos, zPos);
            }
            //Z slopes
            case 5 :{
                return RailVanillaShapes.vanillaSlopeZ5(worldObj, xPos, yPos, zPos);
            }
            case 4 :{
                return RailVanillaShapes.vanillaSlopeZ4(worldObj, xPos, yPos, zPos);
            }
            //X slopes
            case 2 :{
                return RailVanillaShapes.vanillaSlopeX2(worldObj, xPos, yPos, zPos);
            }
            case 3 :{
                return RailVanillaShapes.vanillaSlopeX3(worldObj, xPos, yPos, zPos);
            }
        }
        return null;
    }


    /**
     * checks an array of blocks for a specific class and meta to check if the shape should be made.
     * @param world
     * @return boolean for if the shape can be made
     */
    public static boolean checkBlockMeta(World world, int xCoord, int yCoord, int zCoord, int ... meta){
        if (!world.getChunkProvider().chunkExists(xCoord/16, zCoord/16) ||
                !(world.getBlock(xCoord,yCoord,zCoord) instanceof BlockRailBase)){
            return false;
        }else {
            int block = getRailMeta(world, xCoord, yCoord, zCoord,null);
            for (int m : meta) {
                if (m==block){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Simplifies getting rail metadata for a block, returns -1 is the block is not a rail.
     * in 1.8+ this will have to change to returning the expected int based on the block state, or the getBasicRailMetadata for TiM rails
     */
    public static int getRailMeta(IBlockAccess world, int x, int y, int z, @Nullable EntityMinecart cart){
        if(!(world.getBlock(x,y,z) instanceof BlockRailBase)){
            return -1;
        }
        return ((BlockRailBase) world.getBlock(x,y,z)).getBasicRailMetadata(world, cart,x,y,z);
    }


    public static int[] getNearbyMeta(World world, int xCoord, int yCoord, int zCoord){
        int[] meta = new int[9];
        int i=0;
        for(int z=-1;z<2;z++){
            for(int x=-1;x<2;x++){
                meta[i]= getRailMeta(world, xCoord+x,yCoord,zCoord+z,null);
                i++;
            }
        }
        return meta;
    }



    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
        return Blocks.rail.getIcon(0, 0);
    }


    @SideOnly(Side.CLIENT)
    @Override
    public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int p_149646_5_) {
        return false;
    }

    @Override
    public int getLightOpacity(IBlockAccess world, int x, int y, int z) {
        return 0;
    }


    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass() {
        return -1;
    }

    /*@Override
    @SideOnly(Side.CLIENT)
    protected String getTextureName() {
        Blocks.flowing_water.getTextureName();
    }*/


}
