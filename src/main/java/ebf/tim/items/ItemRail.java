package ebf.tim.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.blocks.RailTileEntity;
import ebf.tim.blocks.rails.BlockRailCore;
import ebf.tim.registry.TiMBlocks;
import ebf.tim.utility.CommonUtil;
import mods.railcraft.api.core.items.ITrackItem;
import net.minecraft.block.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;

import java.util.List;

/**
 * <h1>Key Item</h1>
 * the key used to allow people other than the owner to interact with a locked train or rollingstock.
 * @author Eternal Blue Flame
 */
public class ItemRail extends Item implements ITrackItem {

    public ItemRail(){}

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    @Deprecated
    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int meta, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
        if(world.isRemote){return true;}
        net.minecraft.block.Block block = world.getBlock(x, y, z);

        if (block != Blocks.vine && block != Blocks.tallgrass && block != Blocks.deadbush) {
            switch (meta) {
                case 0:{--y;break;}
                case 1:{++y;break;}
                case 2:{--z;break;}
                case 3:{++z;break;}
                case 4:{--x;break;}
                case 5:{++x;break;}
            }
        }

        if(block instanceof BlockRailBase){
            if(meta==0) {
                return false;
            } else if (meta==1){
                y--;
                int rotation = MathHelper.floor_double((player!=null?player.rotationYawHead:p_77648_10_) * 4.0F / 360.0F + 0.5D) & 3;
                switch (rotation){
                    case 0:{z++;
                    if(world.getBlock(x,y,z) instanceof BlockRailBase){z++;}
                        if(world.getBlock(x,y,z) instanceof BlockRailBase){z++;}
                        if(world.getBlock(x,y,z) instanceof BlockRailBase){z++;}
                        if(world.getBlock(x,y,z) instanceof BlockRailBase){return false;}
                        break;
                    }//south
                    case 1:{x--;
                        if(world.getBlock(x,y,z) instanceof BlockRailBase){x--;}
                        if(world.getBlock(x,y,z) instanceof BlockRailBase){x--;}
                        if(world.getBlock(x,y,z) instanceof BlockRailBase){x--;}
                        if(world.getBlock(x,y,z) instanceof BlockRailBase){return false;}}//west
                    break;
                    case 2:{z--;
                        if(world.getBlock(x,y,z) instanceof BlockRailBase){z--;}
                        if(world.getBlock(x,y,z) instanceof BlockRailBase){z--;}
                        if(world.getBlock(x,y,z) instanceof BlockRailBase){z--;}
                        if(world.getBlock(x,y,z) instanceof BlockRailBase){return false;}}//north
                    break;
                    case 3:{x++;
                        if(world.getBlock(x,y,z) instanceof BlockRailBase){x++;}
                        if(world.getBlock(x,y,z) instanceof BlockRailBase){x++;}
                        if(world.getBlock(x,y,z) instanceof BlockRailBase){x++;}
                        if(world.getBlock(x,y,z) instanceof BlockRailBase){return false;}}//east
                }

            }
        }

        if (!player.canPlayerEdit(x,y,z, meta, stack) || stack.stackSize==0 ||
        !world.getChunkProvider().chunkExists(
                x>>4, z>>4)) {
            return false;
        } else {
            if(!(world.getBlock(x,y,z) instanceof BlockAir)){
                //replaceable covers things like fluids, IPlantable and IGrowable cover things like grass and flowers
                if(!world.getBlock(x,y,z).isReplaceable(world,x,y,z)
                        && !(block instanceof IPlantable) && !(block instanceof IGrowable)){
                    return false;
                } else {
                    //if it is replaceable, try to spawn the dropped item.
                    Item blockStack = world.getBlock(x,y,z).getItemDropped(x,world.rand,z);
                    if(blockStack!=null){
                        world.spawnEntityInWorld(new EntityItem(world,x,y+0.5,z, new ItemStack(blockStack)));
                    }
                }
            }

            if (world.setBlock(x,y,z, getPlacedBlock(), 0, 3)) {
                int i1 = getPlacedBlock().onBlockPlaced(world, x,y,z, meta, p_77648_8_, p_77648_9_, p_77648_10_, 0);
                if (world.getBlock(x,y,z) == getPlacedBlock()) {
                    getPlacedBlock().onBlockPlacedBy(world, x,y,z, player, stack);

                    ((BlockRailCore)world.getBlock(x,y,z)).updateShape(x,y,z,world,
                            //set rail
                            stack.getTagCompound().getTag("rail")!=null?
                                    ItemStack.loadItemStackFromNBT(stack.getTagCompound().getCompoundTag("rail")):
                                    new ItemStack(Items.iron_ingot),
                            //set ties
                            stack.getTagCompound().getTag("ties")!=null?
                                    ItemStack.loadItemStackFromNBT(stack.getTagCompound().getCompoundTag("ties")):
                                    null,

                            //set ballast
                            stack.getTagCompound().getTag("ballast")!=null?
                                    ItemStack.loadItemStackFromNBT(stack.getTagCompound().getCompoundTag("ballast")):
                                    null,

                            //set wires
                            stack.getTagCompound().getTag("wires")!=null?
                                    ItemStack.loadItemStackFromNBT(stack.getTagCompound().getCompoundTag("wires")):
                                    null
                            );
                }

                world.playSoundEffect(x + 0.5F, y + 0.5F, z + 0.5F, getPlacedBlock().stepSound.func_150496_b(), (getPlacedBlock().stepSound.getVolume() + 1.0F) / 2.0F, getPlacedBlock().stepSound.getPitch() * 0.8F);
                getPlacedBlock().onPostBlockPlaced(world, x,y,z, i1);
                --stack.stackSize;
            }
            return true;
        }
    }

    public boolean isPlacedTileEntity(ItemStack stack, TileEntity tile){
        return tile.getClass() == RailTileEntity.class;
    }

    public net.minecraft.block.Block getPlacedBlock(){
        return TiMBlocks.railBlock;
    }

    public boolean placeTrack(ItemStack stack, World world, int x, int y, int z){
        if(world.isRemote){return true;}
        net.minecraft.block.Block block = world.getBlock(x, y, z);

        if (!(World.doesBlockHaveSolidTopSurface(world ,x, y, z))){
            return false;
        }

        if(block.isReplaceable(world, x, y+1, z) || block instanceof BlockFlower || block == Blocks.double_plant || block instanceof BlockMushroom){
            block.dropBlockAsItem(world, x, y+1, z, world.getBlockMetadata(x, y+1, z), 0);
        }

        int meta=world.getBlockMetadata(x,y,z);

        if (world.canPlaceEntityOnSide(getPlacedBlock(),x,y,z, false, meta, null, stack)) {
            int i1 = getPlacedBlock().onBlockPlaced(world, x, y, z, meta, 0, 0, 0, 0);

            if (world.setBlock(x, y, z, getPlacedBlock(), 0, 3)) {
                if (world.getBlock(x, y, z) == getPlacedBlock()) {
                    getPlacedBlock().onPostBlockPlaced(world, x, y, z, i1);
                    ((BlockRailCore) world.getBlock(x, y, z)).updateShape(x, y, z, world,
                            //set rail
                            stack.getTagCompound().getTag("rail")!=null?
                                    ItemStack.loadItemStackFromNBT(stack.getTagCompound().getCompoundTag("rail")):
                                    new ItemStack(Items.iron_ingot),
                            //set ties
                            stack.getTagCompound().getTag("ties")!=null?
                                    ItemStack.loadItemStackFromNBT(stack.getTagCompound().getCompoundTag("ties")):
                                    null,

                            //set ballast
                            stack.getTagCompound().getTag("ballast")!=null?
                                    ItemStack.loadItemStackFromNBT(stack.getTagCompound().getCompoundTag("ballast")):
                                    null,

                            //set wires
                            stack.getTagCompound().getTag("wires")!=null?
                                    ItemStack.loadItemStackFromNBT(stack.getTagCompound().getCompoundTag("wires")):
                                    null
                    );
                }

                world.playSoundEffect(x + 0.5F, y + 0.5F, z + 0.5F, getPlacedBlock().stepSound.func_150496_b(), (getPlacedBlock().stepSound.getVolume() + 1.0F) / 2.0F, getPlacedBlock().stepSound.getPitch() * 0.8F);
                --stack.stackSize;
            }
        }

        return true;
    }

    /**
     * <h2>Description text</h2>
     * Allows items to add custom lines of information to the mouseover description, by adding new lines to stringList.
     * Each string added defines a new line.
     * We can cover the key and ticket description here, to simplify other classes.
     */
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List stringList, boolean p_77624_4_) {


        if( stack.hasTagCompound()){
            if(stack.getTagCompound().hasKey("rail")) {
                stringList.add(CommonUtil.translate("menu.rails") + " " + ItemStack.loadItemStackFromNBT(stack.getTagCompound().getCompoundTag("rail")).getDisplayName());
            } else {
                stringList.add("default rails");
            }

            //todo: for some reason i ill never understand, the lang file returns ties and ballast backwards.
            if(stack.getTagCompound().hasKey("ballast")) {
                stringList.add(CommonUtil.translate("menu.ballast")+ " " + ItemStack.loadItemStackFromNBT(stack.getTagCompound().getCompoundTag("ballast")).getDisplayName());
            } else {
                stringList.add(CommonUtil.translate("menu.noballast"));
            }
            if(stack.getTagCompound().hasKey("ties")) {
                stringList.add(CommonUtil.translate("menu.ties")+ " " + ItemStack.loadItemStackFromNBT(stack.getTagCompound().getCompoundTag("ties")).getDisplayName());
            } else {
                stringList.add(CommonUtil.translate("menu.noties"));
            }

            if(stack.getTagCompound().hasKey("wires")) {
                stringList.add(CommonUtil.translate("menu.wires") + " " +ItemStack.loadItemStackFromNBT(stack.getTagCompound().getCompoundTag("wires")).getDisplayName());
            } else {
                stringList.add(CommonUtil.translate("menu.nowires"));
            }
        }
    }

    public static ItemStack setStackData(ItemStack stack, ItemStack ingot, ItemStack ballast, ItemStack ties, ItemStack wires){
        //init stack NBT
        stack.setTagCompound(new NBTTagCompound());
        //add a tag for the stack then put the stack in it.
        if(ingot!=null && ingot.getItem()!=null) {
            stack.getTagCompound().setTag("rail", new NBTTagCompound());
            ingot.writeToNBT(stack.getTagCompound().getCompoundTag("rail"));
        }

        //rinse and repeat
        if(ties!=null && ties.getItem()!=null && !isItemBanned(ties)) {
            stack.getTagCompound().setTag("ties",new NBTTagCompound());
            ties.writeToNBT(stack.getTagCompound().getCompoundTag("ties"));
        } else if(ties!=null && ties.getItem()!=null){
            return null;
        }
        if(ballast!=null && ballast.getItem()!=null && !isItemBanned(ballast)) {
            stack.getTagCompound().setTag("ballast",new NBTTagCompound());
            ballast.writeToNBT(stack.getTagCompound().getCompoundTag("ballast"));
        } else if(ballast!=null && ballast.getItem()!=null){
            return null;
        }
        if(wires!=null && wires.getItem()!=null && !isItemWires(wires)) {
            stack.getTagCompound().setTag("wires",new NBTTagCompound());
            wires.writeToNBT(stack.getTagCompound().getCompoundTag("wires"));
        } else if(wires!=null && wires.getItem()!=null){
            return null;
        }
        return stack;
    }

    public static boolean isItemWires(ItemStack s){
        return true;
    }

    public static boolean isItemBanned(ItemStack s){
        return CommonUtil.stringContains(s.getItem().delegate.name(),"chisel") || Block.getBlockFromItem(s.getItem()).hasTileEntity(s.getItemDamage());
    }

    //adds custom versions of this to the creative menu, with the necessary NBT and metadata
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item p_150895_1_, CreativeTabs p_150895_2_, List tabItems) {
        if(p_150895_1_ instanceof ItemRail) {
            for(Item ingot : new Item[]{Items.iron_ingot, Items.gold_ingot}){
                for(Block b : new Block[]{null, Blocks.gravel, Blocks.stone}){
                    for(Block t : new Block[]{Blocks.log, Blocks.planks, Blocks.double_stone_slab, null})
                    tabItems.add(setStackData(new ItemStack(p_150895_1_),new ItemStack(ingot), new ItemStack(b),new ItemStack(t), null));
                }
            }
        } else {
            tabItems.add(new ItemStack(p_150895_1_));
        }
    }
}