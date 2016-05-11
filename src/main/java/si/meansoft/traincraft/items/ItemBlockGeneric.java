package si.meansoft.traincraft.items;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * @author canitzp
 */
public class ItemBlockGeneric extends ItemBlock{

    public ItemBlockGeneric(Block block){
        super(block);
        this.setRegistryName(block.getRegistryName());
    }

    @Override
    public boolean placeBlockAt(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ, IBlockState newState){
        return newState != null && super.placeBlockAt(stack, player, world, pos, side, hitX, hitY, hitZ, newState);
    }
}
