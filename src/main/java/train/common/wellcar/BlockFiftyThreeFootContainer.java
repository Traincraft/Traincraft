package train.common.wellcar;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.Traincraft;
import train.common.items.ItemPaintbrushThing;
import train.common.library.GuiIDs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BlockFiftyThreeFootContainer extends BlockContainer {
    private final Random rand = new Random();
    private TileFortyFootContainer theTile;
    public BlockFiftyThreeFootContainer(Material p_i45386_1_) {
        super(p_i45386_1_);
        this.minX = -1.1F;
        this.minZ = -0.2F;
        this.minY = 0.0F;
        this.maxX = 2.2F;
        this.maxY = 2F;
        this.maxZ = 1.1F;
        this.setBlockBounds(-1.1F, 0.0F, -0.2F, 2.2F, 1.5F, 1.1F);

    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        if (theTile == null) {
            theTile = new TileFortyFootContainer();
        }
        return new TileFortyFootContainer();
    }
    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }


    public int getRenderType()
    {
        return -1;
    }

    @Override
    public void addCollisionBoxesToList(World world, int x, int y, int z, AxisAlignedBB bounds, List list, Entity entity) {
        /*System.out.println("Adding??");
        this.setBlockBounds(-1.1F, 0.0F, -0.2F, 2.2F, 1.5F, 1.1F);
        AxisAlignedBB bounds1 = AxisAlignedBB.getBoundingBox(-1.1F, 0.0F, -0.2F, 2.2F, 1.5F, 1.1F);
        list.add(bounds1);
        super.addCollisionBoxesToList(world, x, y, z, bounds1, list, entity);
       // super.addCollisionBoxesToList(world, x, y, z, AxisAlignedBB.getBoundingBox(-1.1F, 0.0F, -0.2F, 2.2F, 1.5F, 1.1F), list, entity);
        this.setBlockBoundsForItemRender();*/
        /*this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
        super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
        this.setBlockBoundsForItemRender();*/
        AxisAlignedBB axisalignedbb1 = this.getCollisionBoundingBoxFromPool(world, x, y, z);

        if (axisalignedbb1 != null && bounds.intersectsWith(axisalignedbb1))
        {
            list.add(axisalignedbb1);
        }
    }


    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float lx, float ly, float lz)
    {

        TileEntity te = world.getTileEntity(x, y, z);
        if (te instanceof TileFortyFootContainer && world.isRemote) {
            if (player.getHeldItem() != null && player.getHeldItem().getItem() instanceof ItemPaintbrushThing) {
                ((TileFortyFootContainer) te).goToNextColor();
            }
        }
        if (world.isRemote) return true;

        if (te instanceof TileFortyFootContainer) {
            if (player.getHeldItem() != null && player.getHeldItem().getItem() instanceof ItemPaintbrushThing) {
                ((TileFortyFootContainer)te).goToNextColor();
            } else {
                player.openGui(Traincraft.instance, GuiIDs.FORTY_FOOT_CONTAINER, world, x, y, z);
            }
            return true;
        }


        return false;
    }


    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        return AxisAlignedBB.getBoundingBox((double)p_149668_2_ + this.minX, (double)p_149668_3_ + this.minY, (double)p_149668_4_ + this.minZ, (double)p_149668_2_ + this.maxX + 7F, (double)p_149668_3_ + this.maxY, (double)p_149668_4_ + this.maxZ);
    }

    @Override
    public boolean isSideSolid(IBlockAccess world, int i, int j, int k, ForgeDirection side) {
        return true;


    }
    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        ArrayList<ItemStack> ret = super.getDrops(world, x, y, z, metadata, fortune);
        ItemStack stack = new ItemStack(world.getBlock(x, y, z), 1, metadata);

        TileFortyFootContainer te = world.getTileEntity(x, y,z) instanceof TileFortyFootContainer ? (TileFortyFootContainer)world.getTileEntity(x,y,z) : null;

        if (te != null)
        {

            NBTTagCompound tag = new NBTTagCompound();
            te.writeToNBT(tag);
            if (!stack.hasTagCompound())
            {
                stack.setTagCompound(tag);
            }
            ret.add(stack);
        }
        return ret;
    }

    public void harvestBlock(World world, EntityPlayer player, int x, int y, int z,  int k) {
        super.harvestBlock(world, player, x,y,z,k);
        world.setBlockToAir(x,y,z);
    }

    @Override
    public boolean removedByPlayer(World world, EntityPlayer player, int x, int y, int z, boolean willHarvest)
    {
        if (willHarvest)
        {
            return true; // If it will harvest, delay deletion of the block
            // until after getDrops
        }
        if (player.capabilities.isCreativeMode) {
            harvestBlock(world, player, x,y,z, 0);
        }
        return super.removedByPlayer(world, player, x, y, z, false);
    }

    @Override
    public Item getItemDropped(int metadata, Random rand, int fortuneLevel) {
        return null;
    }

    /*@Override
    public Item getItemDropped(int metadata, Random rand, int fortuneLevel) {
    *//*    ItemStack item = new ItemStack(new ItemFortyFootContainer(new BlockFortyFootContainer(Material.rock)));
        TileFortyFootContainer theContainerTile = theTile;
        NBTTagCompound nbt = new NBTTagCompound();
        NBTTagList list = new NBTTagList();

        for (int i = 0; i < theContainerTile.inventory.length; ++i)
        {
            if (theContainerTile.inventory[i] != null)
            {
                NBTTagCompound comp = new NBTTagCompound();
                comp.setByte("Slot", (byte)i);
                theContainerTile.inventory[i].writeToNBT(comp);
                list.appendTag(comp);
            }
        }

        nbt.setTag("Items", list);
        System.out.println("um.hellp?");
        item.setTagCompound(nbt);
        System.out.println("Faile?");
        System.out.println(item.toString());
        return new ItemFortyFootContainer(new BlockFortyFootContainer(Material.rock));*//*

    }*/

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack stack)
    {
        TileFortyFootContainer te = (TileFortyFootContainer) world.getTileEntity(x, y, z);
        int playerYaw = MathHelper.floor_double((player.rotationYaw / 90.0F) + 2.5D) & 3;

        if (te != null && stack.getTagCompound() != null)
        {
            te.directionPlaced = playerYaw;
            stack.getTagCompound().setInteger("x", x);
            stack.getTagCompound().setInteger("y", y);
            stack.getTagCompound().setInteger("z", z);
            te.readFromNBT(stack.getTagCompound());
        }
    }
}
