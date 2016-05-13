package si.meansoft.traincraft;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.server.SPacketBlockChange;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;

/**
 * @author canitzp
 */
public class Util {

    public static void sendTilePacketToAllAround(TileEntity tile){
        for(EntityPlayer player : tile.getWorld().playerEntities){
            if(player instanceof EntityPlayerMP){
                BlockPos pos = tile.getPos();
                if(player.getDistance(pos.getX(), pos.getY(), pos.getZ()) <= 64){
                    ((EntityPlayerMP)player).playerNetServerHandler.sendPacket(tile.getDescriptionPacket());
                }
            }
        }
    }

    public static String firstCharToUpperCase(String string){
        return string.length() >= 1 ? string.substring(0, 1).toUpperCase() + string.substring(1) : string;
    }

    public static int getStackSize(ItemStack stack){
        return stack != null ? stack.stackSize : 0;
    }

    /**
    * Harvests a Block by a Player
    *
    * @param world  The World
    * @param pos    The Block position
    * @param player The Player
    * @return If the Block could be harvested normally (so that it drops an item)
    * <p>
    * Author: Ellpeck
    */
    public static boolean playerHarvestBlock(World world, BlockPos pos, EntityPlayer player, ItemStack stack) {
        Block block = world.getBlockState(pos).getBlock();
        IBlockState state = world.getBlockState(pos);
        int meta = world.getBlockState(pos).getBlock().getMetaFromState(world.getBlockState(pos));
        TileEntity tile = world.getTileEntity(pos);
        boolean canHarvest = block.canHarvestBlock(world, pos, player);
        if (player instanceof EntityPlayerMP) {
            int event = ForgeHooks.onBlockBreakEvent(world, ((EntityPlayerMP) player).interactionManager.getGameType(), (EntityPlayerMP) player, pos);
            if (event == -1) {
                return false;
            }
        }
        if (!world.isRemote) {
            block.onBlockHarvested(world, pos, state, player);
        } else {
            world.playAuxSFX(2001, pos, Block.getIdFromBlock(block) + (meta << 12));
        }
        boolean removed = block.removedByPlayer(state, world, pos, player, canHarvest);
        if (removed) {
            block.onBlockDestroyedByPlayer(world, pos, state);
            if (!world.isRemote && !player.capabilities.isCreativeMode) {
                if (canHarvest) {
                    block.harvestBlock(world, player, pos, state, tile, player.getHeldItemMainhand());
                }
                if (EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack) != 0) {
                    block.dropXpOnBlockBreak(world, pos, block.getExpDrop(state, world, pos, EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack)));
                }

            }
        }
        if (!world.isRemote) {
            if (player instanceof EntityPlayerMP) {
                ((EntityPlayerMP) player).playerNetServerHandler.sendPacket(new SPacketBlockChange(world, pos));
            }
        } else {
            Minecraft.getMinecraft().getNetHandler().addToSendQueue(new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, pos, Minecraft.getMinecraft().objectMouseOver.sideHit));
        }
        return removed;
    }

}
