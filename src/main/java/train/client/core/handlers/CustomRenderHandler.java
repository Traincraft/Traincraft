package train.client.core.handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector2f;
import train.client.render.RenderTCRail;
import train.common.items.ItemTCRail;

public class CustomRenderHandler {

    @SubscribeEvent
    public void onRenderWorldLast(RenderWorldLastEvent event )
    {
        EntityClientPlayerMP player = Minecraft.getMinecraft().thePlayer;
        if ( player != null && player.getHeldItem() != null && ( player.getHeldItem().getItem() instanceof ItemTCRail) )
        {
            renderTCRailPreview(player, player.getHeldItem() );
        }
    }

    private void renderTCRailPreview(EntityClientPlayerMP player, ItemStack stack) {
        World world = Minecraft.getMinecraft().theWorld;
        if(world==null || Minecraft.getMinecraft().objectMouseOver==null){return;}
        int x = Minecraft.getMinecraft().objectMouseOver.blockX;
        int y = Minecraft.getMinecraft().objectMouseOver.blockY;
        int z = Minecraft.getMinecraft().objectMouseOver.blockZ;
        
        if (world.getBlock(x, y, z) == Blocks.air) {
            return;
        }

        ItemTCRail item = (ItemTCRail) player.getHeldItem().getItem();

        // Check if item can be placed and select color
        boolean validPlacement = item.tryToPlaceTrack(player.getHeldItem(), player, world, x, y, z, false);
        float r = 1;
        float g = 0;
        float b = 0;
        float a = 0.5f;
        if (validPlacement) {
            r = 0;
            g = 1;
        }

        y = item.getPlacementHeight(world, x, y, z);
        double px = TileEntityRendererDispatcher.staticPlayerX;
        double py = TileEntityRendererDispatcher.staticPlayerY;
        double pz = TileEntityRendererDispatcher.staticPlayerZ;
        int facing = MathHelper.floor_double(player.rotationYaw * 4.0F / 360.0F + 0.5D) & 3;
        Vector2f dir = ItemTCRail.getDirectionVector(facing);

        // Render
        GL11.glPushMatrix();
        GL11.glTranslated(x - px, y + 1 - py, z - pz);
        GL11.glClear( GL11.GL_DEPTH_BUFFER_BIT );
        GL11.glEnable( GL11.GL_BLEND );

        // Straights
        if (item.getTrackType() == ItemTCRail.TrackTypes.SMALL_STRAIGHT
                || item.getTrackType() == ItemTCRail.TrackTypes.MEDIUM_STRAIGHT
                || item.getTrackType() == ItemTCRail.TrackTypes.LONG_STRAIGHT) {
            int length = 1;
            if (item.getTrackType() == ItemTCRail.TrackTypes.MEDIUM_STRAIGHT)
                length = 3;
            else if (item.getTrackType() == ItemTCRail.TrackTypes.LONG_STRAIGHT)
                length = 6;

            for (int i = 0; i < length; i++) {
                float dx = dir.getX() * i;
                float dz = dir.getY() * i;
                RenderTCRail.modelSmallStraight.render("straight", facing, dx, 0, dz, r, g, b, a);
            }
        }

        // Crossing
        else if (item.getTrackType() == ItemTCRail.TrackTypes.SMALL_ROAD_CROSSING) {
            RenderTCRail.modelSmallStraight.render("crossing", facing, 0, 0, 0, r, g, b, 0.5f);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.SUPER_LONG) {
            RenderTCRail.modelSmallStraight.render("super_long", facing, 0, 0, 0, r,g,b,0.5f);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.SMALL_ROAD_CROSSING_1) {
            RenderTCRail.modelSmallStraight.render("crossing1", facing, 0, 0, 0, r, g, b, 0.5f);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.SMALL_ROAD_CROSSING_2) {
            RenderTCRail.modelSmallStraight.render("crossing2", facing, 0, 0, 0, r, g, b, 0.5f);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.TWO_WAYS_CROSSING) {
            float dx = dir.getX();
            float dz = dir.getY();

            RenderTCRail.modelTwoWaysCrossing.render( dx, 0, dz, r, g, b, 0.5f );
            RenderTCRail.modelSmallStraight.render("straight", 0, dx, 0, dz +1, r, g, b, a);
            RenderTCRail.modelSmallStraight.render("straight", 1, dx + 1, 0, dz, r, g, b, a);
            RenderTCRail.modelSmallStraight.render("straight", 2, dx, 0, dz - 1, r, g, b, a);
            RenderTCRail.modelSmallStraight.render("straight", 3, dx - 1, 0, dz, r, g, b, a);
        }
        // Slopes
        else if (item.getTrackType() == ItemTCRail.TrackTypes.SLOPE_BALLAST) {
            RenderTCRail.modelSlope.render("ballast", facing, 0, 0, 0, r, g, b, 0.5f);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.SLOPE_GRAVEL) {
            RenderTCRail.modelSlope.render("gravel", facing, 0, 0, 0, r, g, b, 0.5f);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.SLOPE_WOOD) {
            RenderTCRail.modelSlope.render("wood", facing, 0, 0, 0, r, g, b, 0.5f);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.SLOPE_SNOW_GRAVEL) {
            RenderTCRail.modelSlope.render("snow", facing, 0, 0, 0, r, g, b, 0.5f);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.LARGE_SLOPE_BALLAST) {
            RenderTCRail.modelLargeSlope.render("ballast", facing, 0, 0, 0, r, g, b, 0.5f);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.LARGE_SLOPE_GRAVEL) {
            RenderTCRail.modelLargeSlope.render("gravel", facing, 0, 0, 0, r, g, b, 0.5f);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.LARGE_SLOPE_WOOD) {
            RenderTCRail.modelLargeSlope.render("wood", facing, 0, 0, 0, r, g, b, 0.5f);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.LARGE_SLOPE_SNOW_GRAVEL) {
            RenderTCRail.modelLargeSlope.render("snow", facing, 0, 0, 0, r, g, b, 0.5f);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.VERY_LARGE_SLOPE_BALLAST) {
            RenderTCRail.modelVeryLargeSlope.render("ballast", facing, 0, 0, 0, r, g, b, 0.5f);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.VERY_LARGE_SLOPE_GRAVEL) {
            RenderTCRail.modelVeryLargeSlope.render("gravel", facing, 0, 0, 0, r, g, b, 0.5f);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.VERY_LARGE_SLOPE_WOOD) {
            RenderTCRail.modelVeryLargeSlope.render("wood", facing, 0, 0, 0, r, g, b, 0.5f);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.VERY_LARGE_SLOPE_SNOW_GRAVEL) {
            RenderTCRail.modelVeryLargeSlope.render("snow", facing, 0, 0, 0, r, g, b, 0.5f);
        }
        // Turns
        else if (item.getTrackType() == ItemTCRail.TrackTypes.MEDIUM_TURN
            || item.getTrackType() == ItemTCRail.TrackTypes.LARGE_TURN
            || item.getTrackType() == ItemTCRail.TrackTypes.VERY_LARGE_TURN
            || item.getTrackType() == ItemTCRail.TrackTypes.VERY_LARGE_TURN
            || item.getTrackType() == ItemTCRail.TrackTypes.SUPER_LARGE_TURN)
        {
            float yaw = MathHelper.wrapAngleTo180_float(player.rotationYaw);
            boolean isLeftTurn = item.getTrackOrientation( facing, yaw ).equals("left");

            String turnSize = "medium";
            if ( item.getTrackType() == ItemTCRail.TrackTypes.LARGE_TURN )
                turnSize = "large";
            else if ( item.getTrackType() == ItemTCRail.TrackTypes.VERY_LARGE_TURN )
                turnSize = "very_large";
            else if ( item.getTrackType() == ItemTCRail.TrackTypes.SUPER_LARGE_TURN)
                turnSize = "super_large";
            if ( isLeftTurn )
            {
                RenderTCRail.modelLeftTurn.render( turnSize, facing, 0, 0, 0, r, g, b, a );
            } else
            {
                RenderTCRail.modelRightTurn.render( turnSize, facing, 0, 0, 0, r, g, b, a );
            }

        }

            // switchs
        else if (item.getTrackType() == ItemTCRail.TrackTypes.MEDIUM_SWITCH
                || item.getTrackType() == ItemTCRail.TrackTypes.MEDIUM_PARALLEL_SWITCH
                || item.getTrackType() == ItemTCRail.TrackTypes.LARGE_SWITCH )
        {
            float yaw = MathHelper.wrapAngleTo180_float(player.rotationYaw);
            boolean isLeftTurn = item.getTrackOrientation( facing, yaw ).equals("left");

            float dx = dir.getX();
            float dz = dir.getY();
            int out_0_start = 3;
            int out_0_end = 3;
            int facing_1 = isLeftTurn ? (facing + 4 - 1)%4 : (facing + 1)%4;
            int out_1_0 = 3;
            int out_1_1 = 3;

            String switchType = "medium";
            if ( item.getTrackType() == ItemTCRail.TrackTypes.MEDIUM_PARALLEL_SWITCH ) {
                switchType = "medium_parallel";
                out_0_start = 5;
                out_0_end = 10;
                out_1_0 = 10;
                out_1_1 = 3;
            }
            else if ( item.getTrackType() == ItemTCRail.TrackTypes.LARGE_SWITCH ) {
                switchType = "large_90";
                out_0_start = 5;
                out_0_end = 5;
                out_1_0 = 5;
                out_1_1 = 5;
            }

            Vector2f dir_1 = ItemTCRail.getDirectionVector( facing_1 );
            float dx_1 = dir_1.getX();
            float dz_1 = dir_1.getY();

                // Render straight tracks
            RenderTCRail.modelSmallStraight.render( "straight", facing, 0, 0, 0, r, g, b, a );
            for ( int out_0 = out_0_start; out_0 < out_0_end + 1; out_0++ )
                RenderTCRail.modelSmallStraight.render( "straight", facing, dx * out_0, 0, dz * out_0, r, g, b, a );

            if ( item.getTrackType() == ItemTCRail.TrackTypes.MEDIUM_PARALLEL_SWITCH )
            {
                RenderTCRail.modelSmallStraight.render( "straight", facing, dx * out_1_0 + dx_1 * out_1_1, 0, dz * out_1_0 + dz_1 * out_1_1, r, g, b, a );
            } else
            {
                RenderTCRail.modelSmallStraight.render( "straight", facing_1, dx * out_1_0 + dx_1 * out_1_1, 0, dz * out_1_0 + dz_1 * out_1_1, r, g, b, a );
            }

                // Render switch
            if ( isLeftTurn )
            {
                RenderTCRail.modelLeftSwitchTurn.render( switchType, facing, false, dx,0, dz, r, g, b, a );
            } else
            {
                RenderTCRail.modelRightSwitchTurn.render( switchType, facing, false, dx,0,dz, r, g, b, a );
            }
        }

        GL11.glPopMatrix();
    }
}
