package train.client.core.handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector2f;
import train.client.render.RenderTCRail;
import train.common.items.ItemTCRail;

public class CustomRenderHandler {

    String ballastMaterial;
    int blockColour;

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
        float a = 0.8f;
        if (validPlacement) {
            r = 0;
            g = 1;
        }

        y = item.getPlacementHeight(world, x, y, z);
        double px = TileEntityRendererDispatcher.staticPlayerX;
        double py = TileEntityRendererDispatcher.staticPlayerY;
        double pz = TileEntityRendererDispatcher.staticPlayerZ;
        int facing;

        if (item.getTrackType().getType().equals("DIAGONAL")) {
            facing = (MathHelper.floor_double(player.rotationYaw * 4.0F / 360.0F ) & 3) + 4;
        }
        else {
            facing = MathHelper.floor_double(player.rotationYaw * 4.0F / 360.0F + 0.5D) & 3;
        }
        Vector2f dir = ItemTCRail.getDirectionVector(facing);

        String variant;
        if (item.getTrackType().getLabel().contains("EMBEDDED")) {
            variant = "embedded";
        }
        else {
            variant = "normal";
        }

        // Render
        GL11.glPushMatrix();
        GL11.glTranslated(x - px, y + 1 - py, z - pz);
        GL11.glClear( GL11.GL_DEPTH_BUFFER_BIT );
        GL11.glEnable( GL11.GL_BLEND );

        // Straights
        if (item.getTrackType() == ItemTCRail.TrackTypes.SMALL_STRAIGHT
                || item.getTrackType() == ItemTCRail.TrackTypes.MEDIUM_STRAIGHT
                || item.getTrackType() == ItemTCRail.TrackTypes.LONG_STRAIGHT
                || item.getTrackType() == ItemTCRail.TrackTypes.VERY_LONG_STRAIGHT
                || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_SMALL_STRAIGHT
                || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_STRAIGHT
                || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_LONG_STRAIGHT
                || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_VERY_LONG_STRAIGHT) {
            int length = 1;
            if (item.getTrackType() == ItemTCRail.TrackTypes.MEDIUM_STRAIGHT  || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_STRAIGHT)
                length = 3;
            if (item.getTrackType() == ItemTCRail.TrackTypes.LONG_STRAIGHT   || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_LONG_STRAIGHT)
                length = 6;
            else if (item.getTrackType() == ItemTCRail.TrackTypes.VERY_LONG_STRAIGHT  || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_VERY_LONG_STRAIGHT)
                length = 12;

            for (int i = 0; i < length; i++) {
                float dx = dir.getX() * i;
                float dz = dir.getY() * i;
                if (item.getTrackType().getLabel().contains("EMBEDDED"))
                RenderTCRail.modelSmallStraight.render("embedded", facing, dx, 0, dz, r, g, b, a);
                else  RenderTCRail.modelSmallStraight.render("normal", facing, dx, 0, dz, r, g, b, a);
            }
        }

        if (item.getTrackType() == ItemTCRail.TrackTypes.SMALL_DIAGONAL_STRAIGHT
                || item.getTrackType() == ItemTCRail.TrackTypes.MEDIUM_DIAGONAL_STRAIGHT
                || item.getTrackType() == ItemTCRail.TrackTypes.LONG_DIAGONAL_STRAIGHT
                || item.getTrackType() == ItemTCRail.TrackTypes.VERY_LONG_DIAGONAL_STRAIGHT
                || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_SMALL_DIAGONAL_STRAIGHT
                || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_DIAGONAL_STRAIGHT
                || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_LONG_DIAGONAL_STRAIGHT
                || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_VERY_LONG_DIAGONAL_STRAIGHT) {
            int length = 1;
            if (item.getTrackType() == ItemTCRail.TrackTypes.MEDIUM_DIAGONAL_STRAIGHT  || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_DIAGONAL_STRAIGHT)
                length = 3;
            if (item.getTrackType() == ItemTCRail.TrackTypes.LONG_DIAGONAL_STRAIGHT   || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_LONG_DIAGONAL_STRAIGHT)
                length = 6;
            else if (item.getTrackType() == ItemTCRail.TrackTypes.VERY_LONG_DIAGONAL_STRAIGHT  || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_VERY_LONG_DIAGONAL_STRAIGHT)
                length = 12;
            float dx = 0;
            float dz = 0;
            for (int i = 0; i < length; i++) {
                if (facing == 6) {
                    dx = 1 * i;
                    dz = -1 * i;
                }
                if (facing == 4) {
                    dx = -1 * i;
                    dz = 1 * i;
                }
                if (facing == 7) {
                    dx = 1 * i;
                    dz = 1 * i;
                }
                if (facing == 5) {
                    dx = -1 * i;
                    dz = -1 * i;
                }
                if (item.getTrackType().getLabel().contains("EMBEDDED"))
                    RenderTCRail.modelSmallDiagonalStraight.render("embedded", facing, dx, 0, dz, r, g, b, a);
                else  RenderTCRail.modelSmallDiagonalStraight.render("normal", facing, dx, 0, dz, r, g, b, a);
            }
        }





        // Crossing
        else if (item.getTrackType() == ItemTCRail.TrackTypes.SMALL_ROAD_CROSSING) {
            RenderTCRail.modelSmallStraight.render("crossing", facing, 0, 0, 0, r, g, b, a);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.SMALL_ROAD_CROSSING_1) {
            RenderTCRail.modelSmallStraight.render("crossing1", facing, 0, 0, 0, r, g, b, a);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.SMALL_ROAD_CROSSING_2) {
            RenderTCRail.modelSmallStraight.render("crossing2", facing, 0, 0, 0, r, g, b, a);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.DOUBLE_DIAMOND_CROSSING || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_DOUBLE_DIAMOND_CROSSING) {
            String type = "normal";
            if (item.getTrackType().getLabel().contains("EMBEDDED"))
                type = "embedded";
            float dx = dir.getX();
            float dz = dir.getY();
            RenderTCRail.modelTwoWaysCrossing.render(type + "_diamond", dx, 0, dz, facing, r, g, b, a);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.DIAGONAL_TWO_WAYS_CROSSING || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_DIAGONAL_TWO_WAYS_CROSSING){
            String type = "normal";
            if (item.getTrackType().getLabel().contains("EMBEDDED"))
                type = "embedded";
            RenderTCRail.modelTwoWaysCrossing.render(type + "_diagonal_crossing", 0, 0, 0, facing, r, g, b, a);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.FOUR_WAYS_CROSSING || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_FOUR_WAYS_CROSSING){
            String type = "normal";
            if (item.getTrackType().getLabel().contains("EMBEDDED"))
                type = "embedded";
            RenderTCRail.modelTwoWaysCrossing.render(type + "_universal_crossing", 0, 0, 0, facing, r, g, b, a);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.DIAMOND_CROSSING || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_DIAMOND_CROSSING){
            float yaw = MathHelper.wrapAngleTo180_float(player.rotationYaw);
            boolean isLeftTurn = item.getTrackOrientation( facing, yaw ).equals("left");
            String type = "normal";
            if (item.getTrackType().getLabel().contains("EMBEDDED"))
              type = "embedded";
            float dx = dir.getX();
            float dz = dir.getY();
            if (isLeftTurn){
                RenderTCRail.modelLeftDiamondCrossing.render(type , dx, 0, dz, facing, r, g, b, a);
            }
            else {
                RenderTCRail.modelRightDiamondCrossing.render(type  , dx, 0, dz, facing, r, g, b, a);
           }
        }




        else if (item.getTrackType() == ItemTCRail.TrackTypes.TWO_WAYS_CROSSING || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_TWO_WAYS_CROSSING) {
            String type = "normal";
            if (item.getTrackType().getLabel().contains("EMBEDDED"))
                type = "embedded";
            float dx = dir.getX();
            float dz = dir.getY();

            RenderTCRail.modelTwoWaysCrossing.render( type + "_crossing", dx, 0, dz, facing, r, g, b, a );
            RenderTCRail.modelSmallStraight.render(type, 0, dx, 0, dz +1, r, g, b, a);
            RenderTCRail.modelSmallStraight.render(type, 1, dx + 1, 0, dz, r, g, b, a);
            RenderTCRail.modelSmallStraight.render(type, 2, dx, 0, dz - 1, r, g, b, a);
            RenderTCRail.modelSmallStraight.render(type, 3, dx - 1, 0, dz, r, g, b, a);
        }

        // Slopes
        else if (item.getTrackType() == ItemTCRail.TrackTypes.SLOPE_BALLAST) {
            blockInfo();
            RenderTCRail.modelSlope.render("ballast", facing, 0, 0, 0, r, g, b, a, ballastMaterial, blockColour );
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.SLOPE_GRAVEL) {
            blockInfo();
            RenderTCRail.modelSlope.render("gravel", facing, 0, 0, 0, r, g, b, a, ballastMaterial, blockColour);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.SLOPE_WOOD) {
            blockInfo();
            RenderTCRail.modelSlope.render("wood", facing, 0, 0, 0, r, g, b, a, ballastMaterial, blockColour);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.SLOPE_SNOW_GRAVEL) {
            blockInfo();
            RenderTCRail.modelSlope.render("snow", facing, 0, 0, 0, r, g, b, a, ballastMaterial, blockColour);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.SLOPE_DYNAMIC) {
            blockInfo();
            RenderTCRail.modelSlope.render("dynamic", facing, 0, 0, 0, r, g, b, a, ballastMaterial, blockColour);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.LARGE_SLOPE_BALLAST) {
            blockInfo();
            RenderTCRail.modelLargeSlope.render("ballast", facing, 0, 0, 0, r, g, b, a, ballastMaterial, blockColour);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.LARGE_SLOPE_GRAVEL) {
            blockInfo();
            RenderTCRail.modelLargeSlope.render("gravel", facing, 0, 0, 0, r, g, b, a, ballastMaterial, blockColour);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.LARGE_SLOPE_WOOD) {
            blockInfo();
            RenderTCRail.modelLargeSlope.render("wood", facing, 0, 0, 0, r, g, b, a, ballastMaterial, blockColour);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.LARGE_SLOPE_SNOW_GRAVEL) {
            blockInfo();
            RenderTCRail.modelLargeSlope.render("snow", facing, 0, 0, 0, r, g, b, a, ballastMaterial, blockColour);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.LARGE_SLOPE_DYNAMIC) {
            blockInfo();
            RenderTCRail.modelLargeSlope.render("dynamic", facing, 0, 0, 0, r, g, b, a, ballastMaterial, blockColour);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.VERY_LARGE_SLOPE_BALLAST) {
            blockInfo();
            RenderTCRail.modelVeryLargeSlope.render("ballast", facing, 0, 0, 0, r, g, b, a, ballastMaterial, blockColour);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.VERY_LARGE_SLOPE_GRAVEL) {
            blockInfo();
            RenderTCRail.modelVeryLargeSlope.render("gravel", facing, 0, 0, 0, r, g, b, a, ballastMaterial, blockColour);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.VERY_LARGE_SLOPE_WOOD) {
            blockInfo();
            RenderTCRail.modelVeryLargeSlope.render("wood", facing, 0, 0, 0, r, g, b, a, ballastMaterial, blockColour);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.VERY_LARGE_SLOPE_SNOW_GRAVEL) {
            blockInfo();
            RenderTCRail.modelVeryLargeSlope.render("snow", facing, 0, 0, 0, r, g, b, a, ballastMaterial, blockColour);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.VERY_LARGE_SLOPE_DYNAMIC) {
            blockInfo();
            RenderTCRail.modelVeryLargeSlope.render("dynamic", facing, 0, 0, 0, r, g, b, a, ballastMaterial, blockColour);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_SLOPE_DYNAMIC) {
            blockInfo();
            RenderTCRail.modelSlope.render("embedded_dynamic", facing, 0, 0, 0, r, g, b, a, ballastMaterial, blockColour);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_LARGE_SLOPE_DYNAMIC) {
            blockInfo();
            RenderTCRail.modelLargeSlope.render("embedded_dynamic", facing, 0, 0, 0, r, g, b, a, ballastMaterial, blockColour);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_VERY_LARGE_SLOPE_DYNAMIC) {
            blockInfo();
            RenderTCRail.modelVeryLargeSlope.render("embedded_dynamic", facing, 0, 0, 0, r, g, b, a, ballastMaterial, blockColour);
        }
        else if (item.getTrackType() == ItemTCRail.TrackTypes.LARGE_CURVED_SLOPE_DYNAMIC || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_LARGE_CURVED_SLOPE_DYNAMIC
        || item.getTrackType() == ItemTCRail.TrackTypes.VERY_LARGE_CURVED_SLOPE_DYNAMIC || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_VERY_LARGE_CURVED_SLOPE_DYNAMIC
        || item.getTrackType() == ItemTCRail.TrackTypes.SUPER_LARGE_CURVED_SLOPE_DYNAMIC || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_SUPER_LARGE_CURVED_SLOPE_DYNAMIC) {
            float yaw = MathHelper.wrapAngleTo180_float(player.rotationYaw);
            boolean isLeftTurn = item.getTrackOrientation( facing, yaw ).equals("left");

            if (item.getTrackType() == ItemTCRail.TrackTypes.LARGE_CURVED_SLOPE_DYNAMIC || item.getTrackType() == ItemTCRail.TrackTypes.VERY_LARGE_CURVED_SLOPE_DYNAMIC || item.getTrackType() == ItemTCRail.TrackTypes.SUPER_LARGE_CURVED_SLOPE_DYNAMIC
            || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_LARGE_CURVED_SLOPE_DYNAMIC || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_VERY_LARGE_CURVED_SLOPE_DYNAMIC || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_SUPER_LARGE_CURVED_SLOPE_DYNAMIC){
                String turnSize = "large";
                if (item.getTrackType() == ItemTCRail.TrackTypes.VERY_LARGE_CURVED_SLOPE_DYNAMIC)
                    turnSize = "verylarge";
                else if (item.getTrackType() == ItemTCRail.TrackTypes.SUPER_LARGE_CURVED_SLOPE_DYNAMIC)
                turnSize = "superlarge";
                else if (item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_LARGE_CURVED_SLOPE_DYNAMIC)
                turnSize = "embedded_large";
                else if (item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_VERY_LARGE_CURVED_SLOPE_DYNAMIC)
                turnSize = "embedded_verylarge";
                else if (item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_SUPER_LARGE_CURVED_SLOPE_DYNAMIC)
                turnSize = "embedded_superlarge";
                blockInfo();
                if ( isLeftTurn )
                {
                    RenderTCRail.modelLeftCurvedSlope.render( turnSize, facing, 0, 0, 0, r, g, b, a, ballastMaterial, blockColour );
                }
                else
                {
                    RenderTCRail.modelRightCurvedSlope.render( turnSize, facing, 0, 0, 0, r, g, b, a, ballastMaterial, blockColour );
                }
            }

        }


        /** Normal Parallel Curves*/

        else if (item.getTrackType() == ItemTCRail.TrackTypes.SMALL_PARALLEL_CURVE
                || item.getTrackType() == ItemTCRail.TrackTypes.MEDIUM_PARALLEL_CURVE
                || item.getTrackType() == ItemTCRail.TrackTypes.LARGE_PARALLEL_CURVE
                || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_SMALL_PARALLEL_CURVE
                || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_PARALLEL_CURVE
                || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_LARGE_PARALLEL_CURVE)
        {
            float yaw = MathHelper.wrapAngleTo180_float(player.rotationYaw);
            boolean isLeftTurn = item.getTrackOrientation( facing, yaw ).equals("left");

            if (item.getTrackType() == ItemTCRail.TrackTypes.SMALL_PARALLEL_CURVE
                    || item.getTrackType() == ItemTCRail.TrackTypes.MEDIUM_PARALLEL_CURVE
                    || item.getTrackType() == ItemTCRail.TrackTypes.LARGE_PARALLEL_CURVE
                    || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_SMALL_PARALLEL_CURVE
                    || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_PARALLEL_CURVE
                    || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_LARGE_PARALLEL_CURVE) {
                String turnSize = "small";
                if ( item.getTrackType() == ItemTCRail.TrackTypes.MEDIUM_PARALLEL_CURVE   || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_PARALLEL_CURVE )
                    turnSize = "medium";
                else if ( item.getTrackType() == ItemTCRail.TrackTypes.LARGE_PARALLEL_CURVE     || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_LARGE_PARALLEL_CURVE )
                    turnSize = "large";
                if ( isLeftTurn )
                {
                    RenderTCRail.modelLeftParallelCurve.render( turnSize, variant, facing, 0, 0, 0, r, g, b, a );
                }
                else
                {
                    RenderTCRail.modelRightParallelCurve.render( turnSize, variant, facing, 0, 0, 0, r, g, b, a );
                }
            }
        }
        // 45 Degree Turns

        else if (item.getTrackType() == ItemTCRail.TrackTypes.MEDIUM_45DEGREE_TURN || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_45DEGREE_TURN
                || item.getTrackType() == ItemTCRail.TrackTypes.LARGE_45DEGREE_TURN || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_LARGE_45DEGREE_TURN
                || item.getTrackType() == ItemTCRail.TrackTypes.VERY_LARGE_45DEGREE_TURN  || item.getTrackType() == ItemTCRail.TrackTypes.SUPER_LARGE_45DEGREE_TURN
                || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_VERY_LARGE_45DEGREE_TURN  || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_SUPER_LARGE_45DEGREE_TURN) {
            float yaw = MathHelper.wrapAngleTo180_float(player.rotationYaw);
            boolean isLeftTurn = item.getTrackOrientation( facing, yaw ).equals("left");
                String turnSize = "medium";
                if (item.getTrackType() == ItemTCRail.TrackTypes.LARGE_45DEGREE_TURN || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_LARGE_45DEGREE_TURN )
                turnSize = "large";
                if (item.getTrackType() == ItemTCRail.TrackTypes.VERY_LARGE_45DEGREE_TURN || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_VERY_LARGE_45DEGREE_TURN )
                turnSize = "verylarge";
                if (item.getTrackType() == ItemTCRail.TrackTypes.SUPER_LARGE_45DEGREE_TURN || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_SUPER_LARGE_45DEGREE_TURN )
                turnSize = "superlarge";
                if ( isLeftTurn )
                {
                    RenderTCRail.model45DegreeLeftTurn.render( turnSize, variant, facing, 0, 0, 0, r, g, b, a );
                }
                else
                {
                    RenderTCRail.model45DegreeRightTurn.render( turnSize, variant, facing, 0, 0, 0, r, g, b, a );
                }
            }




        // Turns
        else if (item.getTrackType() == ItemTCRail.TrackTypes.MEDIUM_TURN
            || item.getTrackType() == ItemTCRail.TrackTypes.LARGE_TURN
            || item.getTrackType() == ItemTCRail.TrackTypes.VERY_LARGE_TURN
            || item.getTrackType() == ItemTCRail.TrackTypes.SUPER_LARGE_TURN
            || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_TURN
            || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_LARGE_TURN
            || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_VERY_LARGE_TURN
            || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_SUPER_LARGE_TURN)



        {
            float yaw = MathHelper.wrapAngleTo180_float(player.rotationYaw);
            boolean isLeftTurn = item.getTrackOrientation( facing, yaw ).equals("left");


            if (item.getTrackType() == ItemTCRail.TrackTypes.MEDIUM_TURN || item.getTrackType() == ItemTCRail.TrackTypes.LARGE_TURN
                || item.getTrackType() == ItemTCRail.TrackTypes.VERY_LARGE_TURN || item.getTrackType() == ItemTCRail.TrackTypes.SUPER_LARGE_TURN
                    || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_TURN || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_LARGE_TURN
                    || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_VERY_LARGE_TURN || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_SUPER_LARGE_TURN) {
                String turnSize = "medium";
                if ( item.getTrackType() == ItemTCRail.TrackTypes.LARGE_TURN || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_LARGE_TURN)
                    turnSize = "large";
                else if ( item.getTrackType() == ItemTCRail.TrackTypes.VERY_LARGE_TURN || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_VERY_LARGE_TURN)
                    turnSize = "very_large";
                else if ( item.getTrackType() == ItemTCRail.TrackTypes.SUPER_LARGE_TURN || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_SUPER_LARGE_TURN)
                    turnSize = "super_large";

                if ( isLeftTurn )
                {
                    if (item.getTrackType().getLabel().contains("EMBEDDED"))
                    RenderTCRail.modelLeftTurn.render( "embedded_" + turnSize, facing, 0, 0, 0, r, g, b, a );
                    else  RenderTCRail.modelLeftTurn.render( turnSize, facing, 0, 0, 0, r, g, b, a );
                } else
                {
                    if (item.getTrackType().getLabel().contains("EMBEDDED"))
                        RenderTCRail.modelRightTurn.render( "embedded_" + turnSize, facing, 0, 0, 0, r, g, b, a );
                    else  RenderTCRail.modelRightTurn.render( turnSize, facing, 0, 0, 0, r, g, b, a );
                }
            }







        }

            // switches
        else if (item.getTrackType() == ItemTCRail.TrackTypes.MEDIUM_SWITCH
                || item.getTrackType() == ItemTCRail.TrackTypes.MEDIUM_PARALLEL_SWITCH
                || item.getTrackType() == ItemTCRail.TrackTypes.LARGE_SWITCH
                || item.getTrackType() == ItemTCRail.TrackTypes.MEDIUM_45DEGREE_SWITCH
                || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_SWITCH
                || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_PARALLEL_SWITCH
                || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_LARGE_SWITCH
                || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_45DEGREE_SWITCH)

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
            if ( item.getTrackType() == ItemTCRail.TrackTypes.MEDIUM_PARALLEL_SWITCH  || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_PARALLEL_SWITCH) {
                switchType = "medium_parallel";
                out_0_start = 5;
                out_0_end = 10;
                out_1_0 = 10;
                out_1_1 = 3;
            }
            else if ( item.getTrackType() == ItemTCRail.TrackTypes.LARGE_SWITCH   || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_LARGE_SWITCH) {
                switchType = "large_90";
                out_0_start = 5;
                out_0_end = 5;
                out_1_0 = 5;
                out_1_1 = 5;
            }
            else if ( item.getTrackType() == ItemTCRail.TrackTypes.MEDIUM_45DEGREE_SWITCH  || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_45DEGREE_SWITCH) {
                switchType = "medium_45degree";
                out_0_start = 0;
                out_0_end = 0;
                out_1_0 = 0;
                out_1_1 = 0;
            }

            Vector2f dir_1 = ItemTCRail.getDirectionVector( facing_1 );
            float dx_1 = dir_1.getX();
            float dz_1 = dir_1.getY();

                // Render straight tracks

            for ( int out_0 = out_0_start; out_0 < out_0_end + 1; out_0++ )
                RenderTCRail.modelSmallStraight.render( variant, facing, dx * out_0, 0, dz * out_0, r, g, b, a );

            if ( item.getTrackType() == ItemTCRail.TrackTypes.MEDIUM_PARALLEL_SWITCH  || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_PARALLEL_SWITCH)
            {
                RenderTCRail.modelSmallStraight.render( variant, facing, 0, 0, 0, r, g, b, a );
                RenderTCRail.modelSmallStraight.render( variant, facing, dx * out_1_0 + dx_1 * out_1_1, 0, dz * out_1_0 + dz_1 * out_1_1, r, g, b, a );
            }
            else if ( item.getTrackType() == ItemTCRail.TrackTypes.MEDIUM_45DEGREE_SWITCH || item.getTrackType() == ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_45DEGREE_SWITCH )
            {

            }

            else
            {
                RenderTCRail.modelSmallStraight.render( variant, facing, 0, 0, 0, r, g, b, a );
                RenderTCRail.modelSmallStraight.render( variant, facing_1, dx * out_1_0 + dx_1 * out_1_1, 0, dz * out_1_0 + dz_1 * out_1_1, r, g, b, a );
            }

                // Render switch
            if ( isLeftTurn )
            {
                RenderTCRail.modelLeftSwitchTurn.render( switchType, variant, facing, false, dx,0, dz, r, g, b, a );
            } else
            {
                RenderTCRail.modelRightSwitchTurn.render( switchType, variant, facing, false, dx,0,dz, r, g, b, a );
            }
        }


        GL11.glPopMatrix();
    }

    private void blockInfo() {
        World world = Minecraft.getMinecraft().theWorld;
        EntityClientPlayerMP player = Minecraft.getMinecraft().thePlayer;
        ItemTCRail item = (ItemTCRail) player.getHeldItem().getItem();
        int x = Minecraft.getMinecraft().objectMouseOver.blockX;
        int y = Minecraft.getMinecraft().objectMouseOver.blockY;
        int z = Minecraft.getMinecraft().objectMouseOver.blockZ;
        Block block = world.getBlock(x,y,z);
        int metadata = world.getBlockMetadata(x,y,z);
        blockColour = block.colorMultiplier(world, x, y, z);
        IIcon icon = block.getIcon(1, metadata);
        String iconName = icon.getIconName();
        ballastMaterial = iconName;
    }
}
