package ebf.tim.blocks;

import ebf.tim.TrainsInMotion;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

/**
 * <h1>Block core</h1>
 * Generic block class to simplify the process of creating new blocks.
 * All the functionality for every block can be managed here, and then just instanced in the registry with new parameters.
 *
 * @author Eternal Blue Flame
 */
public class BlockDynamic extends BlockContainer {

    public boolean rotates=true;
    public ModelBase model=null;
    //for models 0 is entire texture, for blocks, texture is:
    //0 up, 1 down, 2 north, 3 south, 4 east, 5 west.
    public ResourceLocation texture=null;
    public int assemblyTableTier = -1; //only applies if it is an assembly table/traintable. no need to set otherwise. -1 unless set.

    public BlockDynamic(Material material, boolean isDirectional, boolean isStorage, int tier) {
        super(material);
        rotates=isDirectional;
        this.isBlockContainer=isStorage;
        this.opaque=true;
        this.assemblyTableTier = tier;
    }

    public BlockDynamic(Material material, boolean isDirectional, boolean isStorage) {
        super(material);
        rotates=isDirectional;
        this.isBlockContainer=isStorage;
        this.opaque=true;
    }

    public Block setModel(ModelBase modelBase){
        model=modelBase;
        return this;
    }

    @Override
    public void breakBlock(World w, int x, int y, int z, Block b, int meta) {
        super.breakBlock(w, x, y, z, b, meta);
        w.removeTileEntity(x,y,z);
    }


    @Override
    public int getRenderType(){
        return -1;
    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    public boolean hasTileEntity(int metadata)
    {
        return true;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return isBlockContainer?new TileEntityStorage(this):new TileRenderFacing(this);
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack){
        super.onBlockPlacedBy(world, x, y, z, entity, stack);
        if(world.getTileEntity(x,y,z)==null){
            world.setTileEntity(x,y,z,createNewTileEntity(world,0));
        }
        if(world.getTileEntity(x,y,z) instanceof TileRenderFacing){
            ((TileRenderFacing) world.getTileEntity(x,y,z)).setFacing(
                    MathHelper.floor_double((entity.rotationYaw / 90.0F) + 2.5D) & 3);
        }
    }


    @Override
    public boolean onBlockActivated(World worldOBJ, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
        if (player.isSneaking() || !isBlockContainer) {
            return false;
        } else if (worldOBJ.isRemote) {
            return true;
        }

        if (worldOBJ.getTileEntity(x, y, z) instanceof TileEntityStorage) {
            player.openGui(TrainsInMotion.instance, 0, worldOBJ, x, y, z);
            return true;
        } else {
            return false;
        }

    }

}
