package si.meansoft.traincraft.items;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import si.meansoft.traincraft.blocks.BlockTrack;
import si.meansoft.traincraft.tile.TileEntityTrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author canitzp
 */
public class ItemBlockTrack extends ItemBlockBase {

    public ItemBlockTrack(Block block) {
        super(block);
    }

    @Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (this.block instanceof BlockTrack) {
            pos = pos.up();
            BlockTrack track = (BlockTrack) this.block;
            EnumFacing horizontalFacing = playerIn.getHorizontalFacing();
            if (track.canPlaceTrack(worldIn, pos, playerIn, stack, hitX, hitY, hitZ)) {
                if (stack.stackSize > 0 && playerIn.canPlayerEdit(pos, facing, stack) && worldIn.canBlockBePlaced(track, pos, false, facing, playerIn, stack)) {
                    IBlockState state = this.block.onBlockPlaced(worldIn, pos, facing, hitX, hitY, hitZ, this.getMetadata(stack), playerIn);
                    if (state != null) {
                        boolean flipAlongX = track.trackType.isCurve() && track.faceLeft(horizontalFacing, hitX, hitZ);
                        List<BlockPos> settedBlocks = track.placeTrack(worldIn, pos, playerIn, hitX, hitY, hitZ);
                        int blockIndex = 0;
                        if(playerIn.isCreative() || stack.stackSize >= settedBlocks.size()){
                            for (BlockPos pos1 : settedBlocks) {
                                if (placeBlockAt(stack, playerIn, worldIn, pos1, facing, hitX, hitY, hitZ, state)) {
                                    SoundType soundtype = worldIn.getBlockState(pos1).getBlock().getSoundType(worldIn.getBlockState(pos1), worldIn, pos1, playerIn);
                                    worldIn.playSound(playerIn, pos1, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);
                                    stack.stackSize--;
                                    if (pos1 != pos) {
                                        TileEntityTrack tile = (TileEntityTrack) worldIn.getTileEntity(pos1);
                                        if (tile != null) {
                                            tile.create(pos, blockIndex, horizontalFacing);
                                        }
                                    } else {
                                        List<BlockPos> toDestroy = new ArrayList<>(settedBlocks);
                                        toDestroy.remove(pos);
                                        TileEntityTrack tile = (TileEntityTrack) worldIn.getTileEntity(pos1);
                                        if (tile != null) {
                                            tile.create(toDestroy, blockIndex, flipAlongX, horizontalFacing);
                                        }
                                    }
                                    blockIndex++;
                                }
                            }
                        }
                    }
                }
            }
            return EnumActionResult.SUCCESS;
        }
        return EnumActionResult.FAIL;
    }

}
