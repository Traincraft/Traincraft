package ebf.tim.blocks.rails;

import net.minecraft.world.World;

import static ebf.tim.blocks.rails.BlockRailCore.checkBlockMeta;
import static ebf.tim.blocks.rails.BlockRailCore.getNearbyMeta;

/**
 * @author Eternal Blue Flame
 */
public class RailVanillaShapes extends RailShapeCore{

    private static final float parallelWidth = 0.0625f*1.5f;

    public static RailSimpleShape vanillaZStraight(World worldObj, int xCoord, int yCoord, int zCoord) {
        //new code
        RailSimpleShape shape = new RailSimpleShape();
        shape.setSleeperCount(4);
        shape.setStart(0, 0, -0.5f).setEnd(0, 0, 0.5f);

        int[] nearbyMeta = getNearbyMeta(worldObj, xCoord, yCoord, zCoord);


        //intersections
        if (nearbyMeta[7] == 1 &&
                checkBlockMeta(worldObj, xCoord, yCoord, zCoord + 2, 0)) {
            shape.setEnd(0, 0, 1f).setSleeperCount(9);
        }
        if (nearbyMeta[1] == 1 && checkBlockMeta(worldObj, xCoord, yCoord, zCoord - 2, 0)) {
            shape.setStart(0, 0, -1f).setSleeperCount(6);
        }

        //cover half-lengths
        if (((nearbyMeta[1] == 7 && nearbyMeta[0] == 9) || (nearbyMeta[1] == 6 && nearbyMeta[2] == 8)) &&
                ((nearbyMeta[7] == 8 && nearbyMeta[6] == 6) || (nearbyMeta[7] == 9 && nearbyMeta[8] == 7))) {
            //covers when both the following are true
            shape.setStart(0, 0, 0.025f).setEnd(0, 0, -0.025f).setSleeperCount(2);
        } else if ((nearbyMeta[1] == 7 && nearbyMeta[0] == 9) || (nearbyMeta[1] == 6 && nearbyMeta[2] == 8)) {
            shape.setStart(0, 0, 0).setCenter(0, 0, 0.25f).setSleeperCount(2);
        } else if ((nearbyMeta[7] == 8 && nearbyMeta[6] == 6) || (nearbyMeta[7] == 9 && nearbyMeta[8] == 7)) {
            shape.setEnd(0, 0, 0).setCenter(0, 0, -0.25f).setSleeperCount(2);
        }

        //cover parallels
        if (nearbyMeta[7] == 7 && nearbyMeta[6] == 9) {
            shape.setEnd(parallelWidth, 0, 2f, parallelWidth)
                    .setCenter(0, 0, 1f)
                    .setSleeperCount(9);
        } else if (nearbyMeta[7] == 8 && nearbyMeta[6] == 9 &&
                checkBlockMeta(worldObj, xCoord, yCoord, zCoord + 2, 0)//cover sharp u-turns
        ) {
            shape.setEnd(0, 0, 1.5f)
                    .setCenter(0, 0, 1f)
                    .setSleeperCount(8);
        }

        if (nearbyMeta[7] == 6 && nearbyMeta[8] == 8) {
            shape.setEnd(-parallelWidth, 0, 2f, parallelWidth)
                    .setCenter(0, 0, 1f)
                    .setSleeperCount(8);
        } else if (nearbyMeta[7] == 9 && nearbyMeta[8] == 8 &&
                checkBlockMeta(worldObj, xCoord, yCoord, zCoord + 2, 0)//cover sharp u-turns
        ) {
            shape.setEnd(0, 0, 2f)
                    .setCenter(0, 0, 1f)
                    .setSleeperCount(8);
        }

        if (nearbyMeta[1] == 9 && nearbyMeta[2] == 7) {
            shape.setStart(-parallelWidth, 0, -2f, parallelWidth)
                    .setCenter(0, 0, -1.5f)
                    .setSleeperCount(8);
        } else if (nearbyMeta[1] == 6 && nearbyMeta[2] == 7 &&
                checkBlockMeta(worldObj, xCoord, yCoord, zCoord - 2, 0)//cover sharp u-turns
        ) {
            shape.setStart(0, 0, -2f)
                    .setCenter(0, 0, -1f)
                    .setSleeperCount(8);
        }
        if (nearbyMeta[1] == 8 && nearbyMeta[0] == 6) {
            shape.setStart(parallelWidth, 0, -2f, parallelWidth)
                    .setCenter(0, 0, -1f)
                    .setSleeperCount(8);
        } else if (nearbyMeta[1] == 7 && nearbyMeta[0] == 6 &&
                checkBlockMeta(worldObj, xCoord, yCoord, zCoord - 2, 0)//cover sharp u-turns
        ) {
            shape.setStart(0, 0, -1.5f)
                    .setCenter(0, 0, -1f)
                    .setSleeperCount(8);
        }


        //slopes
        if(nearbyMeta[7]==5 && nearbyMeta[1]==4){
            shape.setStart(0,0.2f,-0.6f).setEnd(0,0.2f,0.6f);
        }
        else if (nearbyMeta[7]==5){
            shape.setCenter(0,0,0.2f).setEnd(0,0.2f,0.6f);
        }
        else if (nearbyMeta[1]==4){
            shape.setCenter(0,0,-0.2f).setStart(0,0.2f,-0.6f);
        }

        if(checkBlockMeta(worldObj,xCoord, yCoord-1,zCoord+1, 4) &&
                checkBlockMeta(worldObj,xCoord, yCoord-1,zCoord-1, 5)){
            shape.setStart(0,-0.2f,-0.6f).setEnd(0,-0.2f,0.6f);
        }
        else if (checkBlockMeta(worldObj,xCoord, yCoord-1,zCoord+1, 4)){
            shape.setCenter(0,0,0.2f).setEnd(0,-0.2f,0.6f);
        }
        else if (checkBlockMeta(worldObj,xCoord, yCoord-1,zCoord-1, 5)){
            shape.setCenter(0,0,-0.2f).setStart(0,-0.2f,-0.6f);
        }

        return shape;
    }

    public static RailSimpleShape vanillaXStraight(World worldObj, int xCoord, int yCoord, int zCoord){
        RailSimpleShape shape = new RailSimpleShape();
        shape.setSleeperCount(4);
        shape.setStart(0.5f,0,0).setEnd(-0.5f,0,0);

        int[] nearbyMeta = getNearbyMeta(worldObj, xCoord, yCoord, zCoord);

        //intersections
        if(nearbyMeta[3]==0&& checkBlockMeta(worldObj, xCoord-2, yCoord,zCoord,1)){
            shape.setEnd(-1f,0,0).setSleeperCount(6);
        }
        if(nearbyMeta[5]==0&& checkBlockMeta(worldObj, xCoord+2, yCoord,zCoord,1)){
            shape.setStart(1f,0,0).setSleeperCount(6);
        }

        //cover half-lengths
        if(((nearbyMeta[2]==6 && nearbyMeta[5]==8) || (nearbyMeta[5]==7&&nearbyMeta[8]==9)) &&
                ((nearbyMeta[0]==7 && nearbyMeta[3]==9) || (nearbyMeta[3]==6 &&nearbyMeta[6]==8))){
            //covers when both the following are true
            shape.setStart(0.025f,0,0).setEnd(-0.025f,0,0).setSleeperCount(2);
        }
        else if((nearbyMeta[2]==6 && nearbyMeta[5]==8) || (nearbyMeta[5]==7&&nearbyMeta[8]==9)){
            shape.setStart(0,0,0).setCenter(-0.25f,0,0).setEnd(-0.5f,0,0).setSleeperCount(2);
        }
        else if((nearbyMeta[0]==7 && nearbyMeta[3]==9) || (nearbyMeta[3]==6 &&nearbyMeta[6]==8)){
            shape.setStart(0,0,0).setCenter(0.25f,0,0).setEnd(0.5f,0,0).setSleeperCount(2);
        }


        //cover parallels
        if(((nearbyMeta[3]==9 && nearbyMeta[0]==6) || (nearbyMeta[3]==6 && nearbyMeta[6]==9))
                && checkBlockMeta(worldObj, xCoord-2, yCoord, zCoord, 1)//cover sharp u-turns
        ){
            shape.setEnd(-2,0,0)
                    .setCenter(-1,0,0)
                    .setSleeperCount(8);
        } else if(nearbyMeta[3]==8 && nearbyMeta[0]==6){
            shape.setEnd(-2,0,parallelWidth,parallelWidth)
                    .setCenter(-1,0,0)
                    .setSleeperCount(8);
        } else if(nearbyMeta[3]==7 && nearbyMeta[6]==9){
            shape.setEnd(-2,0,-parallelWidth,parallelWidth)
                    .setCenter(-1,0,0)
                    .setSleeperCount(8);
        }

        if(((nearbyMeta[5]==8 && nearbyMeta[2]==7) || (nearbyMeta[5]==7 && nearbyMeta[8]==8)) &&
                checkBlockMeta(worldObj, xCoord+2, yCoord, zCoord, 1)//cover sharp u-turns
        ){
            shape.setStart(2,0,0)
                    .setCenter(1,0,0)
                    .setSleeperCount(8);
        } else if(nearbyMeta[5]==9 && nearbyMeta[2]==7){
            shape.setStart(2,0,parallelWidth,parallelWidth)
                    .setCenter(1,0,0)
                    .setSleeperCount(8);
        } else if(nearbyMeta[5]==6 && nearbyMeta[8]==8){
            shape.setStart(2,0,-parallelWidth,parallelWidth)
                    .setCenter(1,0,0)
                    .setSleeperCount(8);
        }

        //slopes
        if(nearbyMeta[3]==3 && nearbyMeta[5]==2){
            shape.setStart(0.6f,0.2f,0).setEnd(-0.6f,0.2f,0);
        }
        else if (nearbyMeta[3]==3){
            shape.setEnd(-0.6f,0.2f,0).setCenter(-0.4f,0,0);
        }
        else if (nearbyMeta[5]==2){
            shape.setStart(0.6f,0.2f,0).setCenter(0.4f,0,0);
        }

        if(checkBlockMeta(worldObj,xCoord+1, yCoord-1,zCoord,3) &&
                checkBlockMeta(worldObj,xCoord-1, yCoord-1,zCoord,2)){
            shape.setStart(0.6f,-0.2f,0).setEnd(-0.6f,-0.2f,0);
        }
        else if (checkBlockMeta(worldObj,xCoord+1, yCoord-1,zCoord,3)){
            shape.setStart(0.6f,-0.2f,0).setCenter(0.4f,0,0);
        }
        else if (checkBlockMeta(worldObj,xCoord-1, yCoord-1,zCoord,2)){
            shape.setEnd(-0.6f,-0.2f,0).setCenter(-0.4f,0,0);
        }

        return shape;
    }


    public static RailSimpleShape vanillaCurve6(World worldObj, int xCoord, int yCoord, int zCoord){
        RailSimpleShape shape = new RailSimpleShape();
        shape.setSleeperCount(4);

        shape.setStart(0,0,0.5f).setEnd(0.5f,0,0);


        int[] nearbyMeta = getNearbyMeta(worldObj, xCoord, yCoord, zCoord);


        //diagonals
        if (nearbyMeta[5]==8 || nearbyMeta[7]==8) {
            shape.setCenter(0.25f, 0, 0.25f)
                    .setSleeperCount(3);
            if (nearbyMeta[7]==0){
                shape.setStart(0,0,1)
                        .setCenter(0f,0,0.5f)
                        .setSleeperCount(5);
            }
            if (nearbyMeta[5]==1){
                shape.setEnd(1,0,0)
                        .setCenter(0.5f,0,0)
                        .setSleeperCount(5);
            }
        }

        //parallels
        if(nearbyMeta[1]==0&& nearbyMeta[5]==7){
            shape.setStart( 0.5f,0,0)
                    .setCenter( 0.25f, 0,-0.25f)
                    .setEnd(parallelWidth,0,-1-parallelWidth,0,0,-parallelWidth)
                    .setSleeperCount(5);
        }

        if(nearbyMeta[7]==9&& nearbyMeta[3]==1){
            shape.setEnd( -1-parallelWidth,0,parallelWidth,parallelWidth)
                    .setCenter( -0.25f, 0,0.25f)
                    .setStart(0,0,0.5f,0)
                    .setSleeperCount(5);

        }


        //handle slopes
        if (nearbyMeta[5]==2){
            shape.setEnd(0.6f,0.2f,0);
        }
        else if (checkBlockMeta(worldObj,xCoord+1, yCoord-1,zCoord,3)){
            shape.setEnd(0.6f,-0.2f,0);
        }
        if (nearbyMeta[7]==5){
            shape.setStart(0,0.2f,0.6f);
        }
        else if (checkBlockMeta(worldObj,xCoord, yCoord-1,zCoord+1, 4)){
            shape.setStart(0,-0.2f,0.6f);
        }

        return shape;
    }

    public static RailSimpleShape vanillaCurve8(World worldObj, int xCoord, int yCoord, int zCoord){
        //the base shape
        RailSimpleShape shape = new RailSimpleShape();
        shape.setSleeperCount(4);

        shape.setStart(-0.5f,0,0).setEnd(0,0,-0.5f);

        int[] nearbyMeta = getNearbyMeta(worldObj, xCoord, yCoord, zCoord);

        if (nearbyMeta[3]==6 ||nearbyMeta[1]==6) {
            //first half of the diagonal
            shape.setCenter( -0.25f, 0, -0.25f)
                    .setSleeperCount(3);
            if (nearbyMeta[1]==0) {
                //extension of one side to match up with a straight block
                shape.setEnd( 0, 0, -1f)
                        .setCenter( 0, 0, -0.5f)
                        .setSleeperCount(6);
            }
            if (nearbyMeta[3]==1) {
                shape.setStart( -1, 0, 0)
                        .setCenter( -0.5f, 0, 0)
                        .setSleeperCount(6);
            }
        }

        //parallels
        if(nearbyMeta[3]==9 && nearbyMeta[7]==0){
            shape.setEnd( -0.5f,0,0)
                    .setCenter( -0.25f,0, 0.25f)
                    .setStart(-parallelWidth,0,1+parallelWidth,0,0,-parallelWidth)
                    .setSleeperCount(5);
        }
        if(nearbyMeta[1]==7 && nearbyMeta[5]==1){
            shape.setStart(1+parallelWidth,0,-parallelWidth, parallelWidth)
                    .setCenter(0.25f,0,-0.25f);
        }

        //slopes
        if (nearbyMeta[3]==3){
            shape.setStart(-0.6f,0.2f,0);
        }
        else if (checkBlockMeta(worldObj,xCoord-1, yCoord-1,zCoord,2)){
            shape.setStart(-0.6f,-0.2f,0);
        }
        if (nearbyMeta[1]==4){
            shape.setEnd(0,0.2f,-0.6f);
        }
        else if (checkBlockMeta(worldObj,xCoord, yCoord-1,zCoord-1, 5)){
            shape.setEnd(0,-0.2f,-0.6f);
        }


        return shape;
    }


    public static RailSimpleShape vanillaCurve7(World worldObj, int xCoord, int yCoord, int zCoord){
        //the base shape
        RailSimpleShape shape = new RailSimpleShape();
        shape.setSleeperCount(4);
        shape.setStart(-0.5f,0,0).setEnd(0,0,0.5f);
        int[] nearbyMeta = getNearbyMeta(worldObj, xCoord, yCoord, zCoord);

        //diagonals
        if (nearbyMeta[7]==9 || nearbyMeta[3]==9){
            shape.setCenter( -0.25f,0, 0.25f)
                    .setSleeperCount(3);
            if (nearbyMeta[7]==0){
                //extension of one side to match up with a straight block
                shape.setEnd(0, 0,1)
                        .setCenter( 0,0, 0.5f)
                        .setSleeperCount(5);
            }
            if (nearbyMeta[3]==1){
                //extension of one side to match up with a straight block
                shape.setStart( -1, 0,0)
                        .setCenter( -0.5f , 0,0)
                        .setSleeperCount(5);
            }
        }

        //parallels
        if(nearbyMeta[7]==8 && nearbyMeta[5]==1){
            shape.setEnd( 1+parallelWidth,0,parallelWidth,parallelWidth)
                    .setCenter( 0.25f, 0,0.25f)
                    .setStart(0,0,0.5f,0)
                    .setSleeperCount(5);
        }
        if(nearbyMeta[3]==6 && nearbyMeta[1]==0){
            shape.setStart(-0.5f,0,0)
                    .setCenter(-0.25f,0,-0.25f)
                    .setEnd(-parallelWidth,0,-1f-parallelWidth,parallelWidth)
                    .setSleeperCount(6);
        }

        //slopes
        if (nearbyMeta[3]==3){
            shape.setStart(-0.6f,0.2f,0f);
        }
        else if (checkBlockMeta(worldObj,xCoord-1, yCoord-1,zCoord,2)){
            shape.setStart(-0.6f,-0.2f,0f);
        }
        if(nearbyMeta[7]==5){
            shape.setEnd(0,0.2f,0.6f);
        }
        else if (checkBlockMeta(worldObj,xCoord, yCoord-1,zCoord+1, 4)){
            shape.setEnd(0,-0.2f,0.6f);
        }
        return shape;
    }

    public static RailSimpleShape vanillaCurve9(World worldObj, int xCoord, int yCoord, int zCoord){
        //the base shape
        RailSimpleShape shape = new RailSimpleShape();
        shape.setSleeperCount(4);
        shape.setStart(0.5f,0,0).setEnd(0,0,-0.5f);
        int[] nearbyMeta = getNearbyMeta(worldObj, xCoord, yCoord, zCoord);

        if (nearbyMeta[5]==7 || nearbyMeta[1]==7){
            //first half of the diagonal
            shape.setCenter( 0.25f, 0,-0.25f)
                    .setSleeperCount(3);
            if (nearbyMeta[1]==0){
                //extension of one side to match up with a straight block
                shape.setEnd( 0,0,-1)
                        .setCenter( 0, 0,-0.5f)
                        .setSleeperCount(5);
            }
            if (nearbyMeta[5]==1) {
                //extension of one side to match up with a straight block
                shape.setStart( 1, 0,0)
                        .setCenter( 0.5f,0, 0)
                        .setSleeperCount(5);
            }
        }

        //parallels
        if(nearbyMeta[5]==8 && nearbyMeta[7]==0){
            shape.setStart( 0.5f,0,0)
                    .setCenter( 0.25f, 0,0.25f)
                    .setEnd(parallelWidth,0,1+parallelWidth,0,0,-parallelWidth)
                    .setSleeperCount(5);
        }
        if(nearbyMeta[1]==6 && nearbyMeta[3]==1){
            shape.setStart( -1f-parallelWidth,0,-parallelWidth,-parallelWidth)
                    .setCenter( -0.25f, 0,-0.25f)
                    .setEnd(0,0,-0.5f)
                    .setSleeperCount(5);
        }


        //slopes
        if (nearbyMeta[5]==2){
            shape.setStart(0.6f,0.2f,0);
        }
        else if (checkBlockMeta(worldObj,xCoord+1, yCoord-1,zCoord,3)){
            shape.setStart(0.6f,-0.2f,0);
        }
        if (nearbyMeta[1]==4){
            shape.setEnd(0,0.2f,-0.6f);
        }
        else if (checkBlockMeta(worldObj,xCoord, yCoord-1,zCoord-1, 5)){
            shape.setEnd(0,-0.2f,-0.6f);
        }

        return shape;
    }





    public static RailSimpleShape vanillaSlopeZ5(World worldObj, int xCoord, int yCoord, int zCoord){
        RailSimpleShape shape = new RailSimpleShape();
        shape.setSleeperCount(4);
        shape.setStart(0,0,-0.5f).setCenter(0,0.5f,0).setEnd(0,1,0.5f);

        if (!checkBlockMeta(worldObj,xCoord, yCoord-1,zCoord-1,5)){
            shape.setStart(0,0.2f,-0.4f);
        }
        if (!checkBlockMeta(worldObj,xCoord, yCoord+1,zCoord+1,5)){
            shape.setEnd(0,0.8f,0.4f);
        }

        return shape;
    }

    public static RailSimpleShape vanillaSlopeZ4(World worldObj, int xCoord, int yCoord, int zCoord){
        RailSimpleShape shape = new RailSimpleShape();
        shape.setSleeperCount(4);
        shape.setStart(0,0,0.5f).setCenter(0,0.5f,0).setEnd(0,1,-0.5f);


        if (!checkBlockMeta(worldObj,xCoord, yCoord-1,zCoord+1,4)){
            shape.setStart(0,0.2f,0.4f);
        }
        if (!checkBlockMeta(worldObj,xCoord, yCoord+1,zCoord-1,4)){
            shape.setEnd(0,0.8f,-0.4f);
        }

        return shape;
    }

    public static RailSimpleShape vanillaSlopeX2(World worldObj, int xCoord, int yCoord, int zCoord){
        RailSimpleShape shape = new RailSimpleShape();
        shape.setSleeperCount(4);

        shape.setStart(-0.5f,0,0).setCenter(0,0.5f,0).setEnd(0.5f,1,0);

        if (!checkBlockMeta(worldObj,xCoord-1, yCoord-1,zCoord,2)){
            shape.setStart(-0.4f,0.2f,0,0);
        }
        if(!checkBlockMeta(worldObj,xCoord+1, yCoord+1,zCoord,2)){
            shape.setEnd(0.4f,0.8f,0,0);
        }

        return shape;
    }

    public static RailSimpleShape vanillaSlopeX3(World worldObj, int xCoord, int yCoord, int zCoord){
        RailSimpleShape shape = new RailSimpleShape();
        shape.setSleeperCount(4);

        shape.setStart(0.5f,0,0).setCenter(0,0.5f,0).setEnd(-0.5f,1,0);

        if (!checkBlockMeta(worldObj,xCoord-1, yCoord+1,zCoord,3)){
            shape.setEnd(-0.4f,0.8f,0,0);
        }
        if(!checkBlockMeta(worldObj,xCoord+1, yCoord-1,zCoord,3)){
            shape.setStart(0.4f,0.2f,0,0);
        }

        return shape;
    }

}
