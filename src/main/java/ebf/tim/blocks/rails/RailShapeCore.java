package ebf.tim.blocks.rails;

import ebf.XmlBuilder;
import ebf.tim.blocks.RailTileEntity;
import ebf.tim.utility.CommonUtil;
import ebf.tim.utility.Vec5f;
import ebf.tim.utility.Vec6f;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RailShapeCore {

    public List<Vec6f> activePath = new ArrayList<>();
    public boolean[] ends = {true, true};
    public int[] gauge;
    public float tieCount;
    public float renderScale;
    public ItemStack rail,ties,ballast,wires;
    /*CLIENT ONLY*/
    public List<Vec5f> activeTiePath = new ArrayList<>();
    public static Random rand = new Random();


    public static void processPoints(int x, int y, int z,
                                     RailSimpleShape coordList, int[] mmFromCenter, float renderScale,
                                     World dimension, ItemStack track,
                                     @Nullable ItemStack trackTies, @Nullable ItemStack trackBallast,
                                     @Nullable ItemStack overheadWires){
        if (dimension.getTileEntity(x,y,z) instanceof RailTileEntity) {
            RailShapeCore shape = multiTriGenModel(coordList, mmFromCenter);
            shape.renderScale=renderScale;
            shape.rail=track;
            shape.ties=trackTies;
            shape.ballast=trackBallast;
            shape.wires=overheadWires;

            ((RailTileEntity) dimension.getTileEntity(x, y, z)).setData(shape.toXML());
            dimension.getTileEntity(x, y, z).markDirty();
        }

    }

    public static void processPoints(int x, int y, int z, World dimension, RailSimpleShape coordList, XmlBuilder builder){
        if (dimension.getTileEntity(x,y,z) instanceof RailTileEntity && builder.containsFloat("scale")) {
            RailShapeCore shape = multiTriGenModel(coordList, builder.getIntArray("gauge"));
            shape.renderScale=builder.getFloat("scale");
            shape.rail=builder.getItemStack("rail");
            shape.ties=builder.getItemStack("ties");
            shape.ballast=builder.getItemStack("ballast");
            shape.wires=builder.getItemStack("wires");

            ((RailTileEntity) dimension.getTileEntity(x, y, z)).setData(shape.toXML());
            dimension.getTileEntity(x, y, z).markDirty();
        }

    }


    public XmlBuilder toXML(){
        XmlBuilder builder = new XmlBuilder();
        builder.putIntArray("gauge", gauge);
        builder.putFloat("tiecount", tieCount);
        builder.putFloat("scale", renderScale);
        builder.putItemStack("rail", rail);
        if(ties!=null){
            builder.putItemStack("ties", ties);
        }
        if(ballast!=null){
            builder.putItemStack("ballast", ballast);
        }
        if(wires!=null){
            builder.putItemStack("wires", wires);
        }


        for(int i=0; i<activePath.size();i++){
            builder.putFloatArray("activepath"+i,activePath.get(i).toFloatArray());
        }

        return builder;
    }

    public RailShapeCore fromXML(XmlBuilder builder){
        gauge=builder.getIntArray("gauge");
        tieCount=builder.getFloat("tiecount");
        renderScale=builder.getFloat("scale");
        rail= builder.getItemStack("rail");
        if(builder.containsItemStack("ties")){
            ties = builder.getItemStack("ties");
        }
        if(builder.containsItemStack("ballast")){
            ballast = builder.getItemStack("ballast");
        }
        if(builder.containsItemStack("wires")){
            wires = builder.getItemStack("wires");
        }


        activePath=new ArrayList<>();
        int i=0;
        while(builder.containsFloatArray("activepath"+i)){
            activePath.add(Vec6f.fromFloatArray(builder.getfloatArray("activepath"+i)));
            i++;
        }

        return this;
    }


    public float[] getGaugePositions(){
        float[] pos = new float[gauge.length+1];
        pos[0]=-gauge[0]*0.00041666666f;//83333333f;
        if(gauge[0]!=0.0) {
            for (int i = 0; i < gauge.length; i++) {
                pos[i + 1] = gauge[i] * 0.00041666666f;
            }
        }
        return pos;
    }

    public static RailShapeCore multiTriGenModel(RailSimpleShape shape, int[] railOffsets){
        RailShapeCore sc = new RailShapeCore();
        sc.gauge=railOffsets;
        sc.activePath = new ArrayList<>();
        sc.activeTiePath= new ArrayList<>();
        List<Vec6f> points;
        float t;
        int i;

        float originalT=1f/3f;//1/6

        t = originalT*-1;
        //calculate the bezier curve, this initial janky version is used to get an accurate gauge of the distance between points.
        points = new ArrayList<>();
        Vec6f v;
        while (t <= 1+originalT) {
            //define position
            v=new Vec6f(
                    (((1f - t) * (1f - t)) * shape.getStart().xCoord) + (2f * (1f - t) * t * shape.getCenter().xCoord) + ((t * t) * shape.getEnd().xCoord),//X
                    0,//Y
                    (((1f - t) * (1f - t)) * shape.getStart().zCoord) + (2f * (1f - t) * t * shape.getCenter().zCoord) + ((t * t) * shape.getEnd().zCoord)//X
            ,0,0,
                    (((1f - t) * (1f - t)) * shape.getStart().w) + (2f * (1f - t) * t * shape.getCenter().w) + ((t * t) * shape.getEnd().w));

            if(shape.getRawStart().yCoord!=0 || shape.getRawEnd().yCoord!=0) {
                v.yCoord = (((1f - t) * (1f - t)) * shape.getStart().yCoord) + (2f * (1f - t) * t * (shape.getCenter().yCoord)) + ((t * t) * shape.getEnd().yCoord);
            }

            points.add(v);
            t += originalT;
        }
        //define rotations
        for (i=1; i < points.size() - 1; i++) {
            points.get(i).setUV(0, CommonUtil.atan2degreesf(
                    points.get(i-1).zCoord - (points.get(i+1).zCoord),
                    points.get(i-1).xCoord - (points.get(i+1).xCoord)));
            sc.activePath.add(points.get(i));
        }
        //segment path
        //sc.activePath.add(points.get(1).setW(shape.getStart().w));
        //sc.activePath.add(points.get(2).setW(shape.getCenter().w));
        //sc.activePath.add(points.get(3).setW(shape.getCenter().w));
        //sc.activePath.add(points.get(4).setW(shape.getEnd().w));


        //update tracks at the ends to deform to the shape for this track


        //update this track again using the deformed versions for the other tracks.

        //add offset to counteract overlapping ties.
        for (i=1; i < points.size() - 1; i++) {
            points.get(i).yCoord+=rand.nextInt(10)*0.00001f;
        }
        //define ties todo: borked on diagonals
        t=0;
        while (!positionPastEnd(t, points)){
            sc.activeTiePath.add(getPosition(t, points));
            t+=0.25d;
        }



        return sc;
    }

    public static boolean positionPastEnd(float distance, List<Vec6f> points){
        float totalTraveled = 0;
        for(int i = 0; i < points.size() - 1; i++){
            if((totalTraveled += points.get(i).distance2d(points.get(i + 1))) > distance){
                return false;
            }
        }
        return true;
    }

    public static Vec6f getPosition(float distance, List<Vec6f> points){
        float totalTraveled = 0, traveled;
        for(int i = 0; i < points.size() - 1; i++){
            traveled = totalTraveled += points.get(i).distance2d(points.get(i + 1));
            if(traveled >= distance){
                return points.get(i);
            }
        }
        return points.get(1);//.distance(points.get(0), distance);
    }
}
