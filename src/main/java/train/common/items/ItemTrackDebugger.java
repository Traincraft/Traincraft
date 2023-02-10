package train.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.library.BlockIDs;
import train.common.library.Info;
import train.common.library.ItemIDs;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailGag;
import mods.railcraft.api.tracks.*;

import java.util.List;

public class ItemTrackDebugger extends Item {
    public ItemTrackDebugger() {
        super();
        maxStackSize = 1;
        setCreativeTab(null);
    }


    @Override
    public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {



        if (!world.isRemote) {

            if (!(player.canCommandSenderUseCommand(2, "") && player.capabilities.isCreativeMode)){
                player.addChatMessage(new ChatComponentText("You are not allowed to to that!"));
                return false;
            }

            Block block = world.getBlock(x, y, z);
            if (block == BlockIDs.tcRail.block){
                TileTCRail tile = (TileTCRail) world.getTileEntity(x, y, z);

                if (tile != null)
                    player.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "TileTCRail"));
                    player.addChatMessage(new ChatComponentText( EnumChatFormatting.BOLD.GOLD + "Name: " +  EnumChatFormatting.WHITE + tile.getType()));
                    player.addChatMessage(new ChatComponentText(EnumChatFormatting.BOLD.GOLD + "x: "    +  EnumChatFormatting.WHITE +  tile.xCoord + EnumChatFormatting.GOLD +  " y: " +  EnumChatFormatting.WHITE +tile.yCoord +  EnumChatFormatting.GOLD + " z: "+  EnumChatFormatting.WHITE + tile.zCoord));
                    player.addChatMessage(new ChatComponentText(EnumChatFormatting.BOLD.GOLD + "Meta: " +  EnumChatFormatting.WHITE + tile.getBlockMetadata()));
                    player.addChatMessage(new ChatComponentText(EnumChatFormatting.BOLD.GOLD + "cx: "   +  EnumChatFormatting.WHITE + tile.cx  + EnumChatFormatting.GOLD + " cy: "+ EnumChatFormatting.WHITE + tile.cy  + EnumChatFormatting.GOLD + " cz: " + EnumChatFormatting.WHITE + tile.cz));
                    player.addChatMessage(new ChatComponentText(EnumChatFormatting.BOLD.GOLD + "r: " + EnumChatFormatting.WHITE + tile.r));
                    player.addChatMessage(new ChatComponentText(EnumChatFormatting.BOLD.GOLD + "SwitchState: " + EnumChatFormatting.WHITE + tile.getSwitchState()));
                    player.addChatMessage(new ChatComponentText(EnumChatFormatting.BOLD.GOLD + "LinkedX: "    +  EnumChatFormatting.WHITE +  tile.linkedX + EnumChatFormatting.GOLD +  " LinkedY: " +  EnumChatFormatting.WHITE +tile.linkedY +  EnumChatFormatting.GOLD + " LinkedZ: "+  EnumChatFormatting.WHITE + tile.linkedZ));
                    player.addChatMessage(new ChatComponentText(EnumChatFormatting.BOLD.GOLD + "SlopeLength: "    +  EnumChatFormatting.WHITE +  tile.slopeLength + EnumChatFormatting.GOLD +  " SlopeHeight: " +  EnumChatFormatting.WHITE +tile.slopeHeight +  EnumChatFormatting.GOLD + " SlopeAngle: "+  EnumChatFormatting.WHITE + tile.slopeAngle));
                    player.addChatMessage(new ChatComponentText(EnumChatFormatting.BOLD.GOLD + "RailLength: " + EnumChatFormatting.WHITE + tile.railLength));
                player.addChatMessage(new ChatComponentText(EnumChatFormatting.BOLD.GOLD + "BallastMaterial: "    +  EnumChatFormatting.WHITE +  Block.getBlockById(tile.getBallastMaterial()).getLocalizedName() + EnumChatFormatting.GOLD +  " BallastMetadata: " +  EnumChatFormatting.WHITE +tile.ballastMetadata +  EnumChatFormatting.GOLD + " BallastColour: "+  EnumChatFormatting.WHITE + tile.ballastColour));


                    player.addChatMessage(new ChatComponentText(" "));
            }
            else  if (block == BlockIDs.tcRailGag.block){
                TileTCRailGag tile = (TileTCRailGag) world.getTileEntity(x, y, z);
                if (tile != null) {
                    player.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + "TileTCGag"));
                    player.addChatMessage(new ChatComponentText( EnumChatFormatting.BOLD.GOLD + "Name: " +  EnumChatFormatting.WHITE + tile.type));
                    player.addChatMessage(new ChatComponentText(EnumChatFormatting.BOLD.GOLD + "x: "    +  EnumChatFormatting.WHITE +  tile.xCoord + EnumChatFormatting.GOLD +  " y: " +  EnumChatFormatting.WHITE + tile.yCoord +  EnumChatFormatting.GOLD + " z: "+  EnumChatFormatting.WHITE + tile.zCoord));
                    player.addChatMessage(new ChatComponentText(EnumChatFormatting.BOLD.GOLD + "Meta: " +  EnumChatFormatting.WHITE + tile.getBlockMetadata()));
                    player.addChatMessage(new ChatComponentText(EnumChatFormatting.BOLD.GOLD + "OriginX: "    +  EnumChatFormatting.WHITE +  tile.originX + EnumChatFormatting.GOLD +  " OriginY: " +  EnumChatFormatting.WHITE + tile.originY +  EnumChatFormatting.GOLD + " OriginZ: "+  EnumChatFormatting.WHITE + tile.originZ));
                    player.addChatMessage(new ChatComponentText( EnumChatFormatting.BOLD.GOLD + "CanPlaceRollingStock: " +  EnumChatFormatting.WHITE + tile.canPlaceRollingstock));
                    player.addChatMessage(new ChatComponentText(" "));

                }
            }

            else if (BlockRailBase.func_150051_a(block)) {
                TileEntity tile = world.getTileEntity(x, y, z);
                if (tile == null) {
                    return false;
                }


                    player.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "BlockRailBase"));

            }
            else {
                player.addChatMessage(new ChatComponentText("Not a rail"));
                return false;
            }


        }



        return super.onItemUse(itemstack, player, world, x, y, z, par7, par8, par9, par10);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":item_track_debugger");
    }
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add("\u00a77" + "Gets TileEntityData for current track");
    }
}
