package traincraft.items.guide;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import traincraft.items.BaseItem;

import javax.annotation.Nonnull;

public class GuideItem extends BaseItem {

    public GuideItem() {
        super("guide", item -> item.setMaxStackSize(1));
    }
    
    /**
     * Client side function to open/display the GuiScreen of the Guide.
     *
     * @param player Player who opens the guide
     * @param hand Hand the guide is in
     * @param pos Position where the player clicks on or the player position itself
     */
    public void openGuide(@Nonnull EntityPlayer player, @Nonnull EnumHand hand, @Nonnull BlockPos pos){
        if(player instanceof EntityPlayerSP){
            Minecraft.getMinecraft().displayGuiScreen(new GuideGui(((EntityPlayerSP) player), hand, pos));
        }
    }
    
    @Nonnull
    @Override
    public EnumActionResult onItemUse(@Nonnull EntityPlayer player, @Nonnull World world, @Nonnull BlockPos pos, @Nonnull EnumHand hand, @Nonnull EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(world.isRemote){
            this.openGuide(player, hand, pos);
        }
        return EnumActionResult.SUCCESS;
    }
    
    @Nonnull
    @Override
    public ActionResult<ItemStack> onItemRightClick(@Nonnull World world, @Nonnull EntityPlayer player, @Nonnull EnumHand hand) {
        if(world.isRemote){
            this.openGuide(player, hand, new BlockPos(player.posX, player.posY, player.posZ));
        }
        return ActionResult.newResult(EnumActionResult.SUCCESS, player.getHeldItem(hand));
    }
}
