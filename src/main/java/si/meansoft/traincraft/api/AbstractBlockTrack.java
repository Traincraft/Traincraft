/*
 * This file ("AbstractBlockTrack.java") is part of the Traincraft mod for Minecraft.
 * It is created by all persons that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.api;

import mods.railcraft.common.carts.ItemCart;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import si.meansoft.traincraft.Compat;
import si.meansoft.traincraft.IRegistryEntry;
import si.meansoft.traincraft.Traincraft;
import si.meansoft.traincraft.blocks.BlockContainerBase;
import si.meansoft.traincraft.compat.RailcraftUtil;
import si.meansoft.traincraft.items.ItemBlockBase;
import si.meansoft.traincraft.tile.TileEntityTrack;
import si.meansoft.traincraft.track.TrackType;

import java.util.List;

/**
 * @author canitzp
 */
public abstract class AbstractBlockTrack extends BlockContainerBase implements ITraincraftTrack{

    private TrackType type;

    protected static final AxisAlignedBB FLAT_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D);
    public static final PropertyBool SHOULD_RENDER = PropertyBool.create("should_render");

    public AbstractBlockTrack(TrackType type, Class<? extends TileEntityTrack> tileClass){
        super(Material.IRON, "track_" + type.getInternName(), tileClass);
        this.setCreativeTab(Traincraft.trackTab);
        this.type = type;
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(SHOULD_RENDER, shouldRenderDefault()));
    }

    @Override
    public IRegistryEntry[] getRegisterElements() {
        return new IRegistryEntry[]{this, getItemBlock(this), createNewTileEntity(null, 0)};
    }

    protected abstract ItemBlockBase getItemBlock(AbstractBlockTrack track);

    protected boolean shouldRenderDefault(){
        return false;
    }

    @Override
    public TrackType getTrackType(){
        return this.type;
    }

    @Override
    public boolean canPlaceTrack(World world, BlockPos pos, EntityLivingBase placer, ItemStack stack, float hitX, float hitY, float hitZ, boolean flipAlongX){
        EnumFacing dir = placer.getHorizontalFacing();
        for (BlockPos pos1 : getTrackType().getGrid().getPosesToAffect(pos, dir, flipAlongX)) {
            if (!world.getBlockState(pos1).getBlock().isReplaceable(world, pos1) || !world.isSideSolid(pos1.down(), EnumFacing.UP)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public List<BlockPos> getPositionToPlace(World world, BlockPos pos, EntityLivingBase placer, float hitX, float hitY, float hitZ, boolean flipAlongX){
        EnumFacing dir = placer.getHorizontalFacing();
        return getTrackType().getGrid().getPosesToAffect(pos, dir, getTrackType().isCurve() && flipAlongX);
    }

    @Override
    public void onMinecartDriveOver(World world, BlockPos pos, IBlockState state, EntityMinecart cart, Entity ridingEntity){
        EnumFacing facing = state.getValue(FACING);
        TileEntityTrack tileTrack = (TileEntityTrack) world.getTileEntity(pos);
        BlockPos nextPosition = tileTrack.sendRequestToTracks(cart.getAdjustedHorizontalFacing());
        if(!nextPosition.equals(pos)){
            cart.moveToBlockPosAndAngles(nextPosition, cart.rotationYaw, cart.rotationPitch);
        }
        if(ridingEntity != null){
            //cart.rotationYaw = ridingEntity.getRotationYawHead() % 360;
        }
        cart.rotationYaw = 0; //TODO get rotation between to positions
    }

    @Override
    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
        return super.getActualState(state, worldIn, pos);
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state){
        return (state.getValue(SHOULD_RENDER) || shouldRenderDefault()) ? EnumBlockRenderType.MODEL : EnumBlockRenderType.INVISIBLE;
    }

    @Override
    protected BlockStateContainer createBlockState(){
        return new BlockStateContainer(this, FACING, SHOULD_RENDER);
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess world, BlockPos pos) {
        return FLAT_AABB;
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos){return FLAT_AABB;}

    @Override
    public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
        return true;
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        int meta = 0;
        meta = meta | state.getValue(FACING).getIndex();
        if (state.getValue(SHOULD_RENDER)) {
            meta |= 8;
        }
        return meta;
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta)).withProperty(SHOULD_RENDER, (meta & 8) > 0);
    }

    @Override
    public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer, EnumHand hand) {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite()).withProperty(SHOULD_RENDER, shouldRenderDefault());
    }

    @Override
    public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
        this.removeTrack(world, pos, !player.isCreative());
        return super.removedByPlayer(state, world, pos, player, willHarvest);
    }

    @Override
    public void onBlockExploded(World world, BlockPos pos, Explosion explosion) {
        this.removeTrack(world, pos, world.rand.nextInt(3) == 0);
        super.onBlockExploded(world, pos, explosion);
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ){
        ItemStack stack = player.getHeldItem(hand);
        if(stack != ItemStack.EMPTY){
            if(Compat.isRailcraftLoaded && stack.getItem() instanceof ItemCart){
                if(!world.isRemote){
                    processRailcraftItem(stack, player, pos);
                }
                if(!player.isCreative()) stack.setCount(stack.getCount() - 1);
                return true;
            }
            if(stack.getItem() instanceof ItemMinecart){
                if(!world.isRemote){
                    EntityMinecart.Type minecartType = ReflectionHelper.getPrivateValue(ItemMinecart.class, (ItemMinecart) stack.getItem(), 1);
                    EntityMinecart cart = EntityMinecart.create(world, (double) pos.getX() + 0.5D, (double) pos.getY() + 0.0625D, (double) pos.getZ() + 0.5D, minecartType);
                    if(stack.hasDisplayName()){
                        cart.setCustomNameTag(stack.getDisplayName());
                    }
                    world.spawnEntity(cart);
                }
                if(!player.isCreative()) stack.setCount(stack.getCount() - 1);
                return true;
            }
        }
        return super.onBlockActivated(world, pos, state, player, hand, side, hitX, hitY, hitZ);
    }

    @Optional.Method(modid = "railcraft")
    private void processRailcraftItem(ItemStack stack, EntityPlayer player, BlockPos pos){
        RailcraftUtil.placeRailcraftCart(((ItemCart)stack.getItem()).getCartType(), player, stack, player.getEntityWorld(), pos);
    }

    public void setRendering(TileEntity tile, boolean shouldRender){
        System.out.println("1:" + shouldRender);
        if(!shouldRenderDefault() && tile != null && tile.getWorld() != null){
            World world = tile.getWorld();
            if(!world.isRemote){
                System.out.println("2:" + shouldRender);
                world.setBlockState(tile.getPos(), world.getBlockState(tile.getPos()).withProperty(SHOULD_RENDER, shouldRender), 2);
            }
        }
    }

}
