package ebf.tim.utility;

public class Vec6f extends Vec5f {
    public float w=0;


    public Vec6f(double x, double y, double z, float u, float v, float w){
        super(x,y,z,u,v);
        this.w=w;
    }

    public Vec6f(double x, double y, double z){
        this(x,y,z,0f,0f,0f);
    }


    public Vec6f(Vec5f v){
        super(v.xCoord,v.yCoord,v.zCoord, v.u,v.v);
    }

    public Vec6f(float x, float y, float z, float u, float v){
        super(x,y,z,u,v);
    }

    public Vec6f setW(float w){
        this.w=w;
        return this;
    }

    public Vec6f crossProduct(Vec6f o){
        return new Vec6f(xCoord*o.xCoord,yCoord*o.yCoord,zCoord*o.zCoord,u*o.u,v*o.v);
    }


    public Vec6f add(Vec6f vec){
        return new Vec6f(xCoord+vec.xCoord,yCoord+vec.yCoord,zCoord+vec.zCoord,u+vec.u,v+vec.v, w+vec.w);
    }

    public float[] toFloatArray(){
        return new float[]{xCoord,yCoord,zCoord,u,v,w};
    }

    public static Vec6f fromFloatArray(float[] f){
        return new Vec6f(f[0],f[1],f[2],f[3],f[4],f[5]);
    }
}
