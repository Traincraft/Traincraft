package ebf.tim.blocks.rails;

import ebf.tim.utility.Vec6f;

public class RailSimpleShape {

    private Vec6f start, center=new Vec6f(0,0,0,0,0,0), end;
    private int tieCount=4;

    public RailSimpleShape setSleeperCount(int s){
        tieCount=s;
        return this;
    }
    public float getSleeperCount(){
        return tieCount;
    }


    public RailSimpleShape setStart(float x, float y, float z){
        return setStart(x,y,z,0,0,0);
    }
    public RailSimpleShape setStart(float x, float y, float z,float w){
        return setStart(x,y,z,0,0,w);
    }
    public RailSimpleShape setStart(float x, float y, float z,float u,float v,float w){
        start=new Vec6f(x,y,z,u,v,w);
        return this;
    }
    public RailSimpleShape setStart(Vec6f s){
        start=s;
        return this;
    }

    public RailSimpleShape setCenter(float x, float y, float z){
        return setCenter(x,y,z,0,0,0);
    }
    public RailSimpleShape setCenter(float x, float y, float z,float w){
        return setCenter(x,y,z,0,0,w);
    }
    public RailSimpleShape setCenter(float x, float y, float z,float u,float v,float w){
        center=new Vec6f(x,y,z,u,v,w);
        return this;
    }
    public RailSimpleShape setCenter(Vec6f c){
        center=c;
        return this;
    }

    public RailSimpleShape setEnd(float x, float y, float z){
        return setEnd(x,y,z,0,0,0);
    }
    public RailSimpleShape setEnd(float x, float y, float z,float w){
        return setEnd(x,y,z,0,0,w);
    }
    public RailSimpleShape setEnd(float x, float y, float z,float u,float v,float w){
        end=new Vec6f(x,y,z,u,v,w);
        return this;
    }
    public RailSimpleShape setEnd(Vec6f e){
        end=e;
        return this;
    }

    public Vec6f getStart() {
        return start.add(normalize());
    }

    public Vec6f getCenter() {
        return center.add(normalize());
    }

    public Vec6f getEnd() {
        return end.add(normalize());
    }

    public Vec6f getRawStart() {
        return start;
    }

    public Vec6f getRawCenter() {
        return center;
    }

    public Vec6f getRawEnd() {
        return end;
    }


    public RailSimpleShape flipX(){
        start.xCoord=-start.xCoord;
        center.xCoord=-center.xCoord;
        end.xCoord=-end.xCoord;
        return this;
    }
    public RailSimpleShape flipZ(){
        start.zCoord=-start.zCoord;
        center.zCoord=-center.zCoord;
        end.zCoord=-end.zCoord;
        return this;
    }
    public RailSimpleShape changeAxis(){
        float oldX;
        oldX =start.xCoord;
        start.xCoord=start.zCoord;
        start.zCoord=oldX;

        oldX =center.xCoord;
        center.xCoord=center.zCoord;
        center.zCoord=oldX;

        oldX =end.xCoord;
        end.xCoord=end.zCoord;
        end.zCoord=oldX;
        return this;
    }

    private static Vec6f normalize(){return new Vec6f(0.5f,0,0.5f,0,0,0);}

}
