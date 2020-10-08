package ebf.tim.utility;

import ebf.tim.TrainsInMotion;
import ebf.tim.entities.EntityBogie;
import ebf.tim.entities.EntitySeat;
import ebf.tim.entities.GenericRailTransport;
import fexcraft.tmt.slim.Vec3d;
import fexcraft.tmt.slim.Vec3f;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IEntityMultiPart;
import net.minecraft.entity.boss.EntityDragonPart;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;

import java.util.ArrayList;
import java.util.List;


public class HitboxDynamic {

    public Vec3f[] shape, pos = new Vec3f[6], renderShape;
    private float longest=0;

    public List<clientInteractBox> interactionBoxes = new ArrayList<>();


    public HitboxDynamic(float width, float height, float depth, GenericRailTransport entity){
        width *=0.5f;
        depth *=0.5f;
        shape= new Vec3f[]{
                new Vec3f(-width,0,depth)
                ,new Vec3f(width,0,depth)
                ,new Vec3f(width,0,-depth)
                ,new Vec3f(-width,0,-depth),
                new Vec3f(-width,height,depth),
                new Vec3f(width,height,depth),
                new Vec3f(width,height,-depth),
                new Vec3f(-width,height,-depth)};
        if(TrainsInMotion.proxy.isClient()) {
            renderShape = shape.clone();
        }
        if(Math.abs(width)>longest){
            longest=Math.abs(width);
        }
        if(Math.abs(depth)>longest){
            longest=Math.abs(depth);
        }
        if(TrainsInMotion.proxy.isClient()) {
            width*=2;depth*=2;
            interactionBoxes = new ArrayList<>();
            for (int f = 0; f < width / depth; f += 1) {
                interactionBoxes.add(new clientInteractBox(entity));
                entity.worldObj.spawnEntityInWorld(interactionBoxes.get(f));
            }
        }
    }


    public void position(double x, double y, double z, float pitch, float yaw){
        pos[0] = CommonUtil.rotatePoint(shape[0].addVector(-0.25f,0,0.25f)
                , pitch,  yaw, 0).addVector(f(x), f(y), f(z));
        pos[1] = CommonUtil.rotatePoint(shape[1].addVector(0.25f,0,0.25f)
                , pitch,  yaw, 0).addVector(f(x), f(y), f(z));
        pos[2] = CommonUtil.rotatePoint(shape[6].addVector(0.25f,0.5f,-0.25f)
                , pitch,  yaw, 0).addVector(f(x), f(y), f(z));
        pos[3] = CommonUtil.rotatePoint(shape[0].addVector(-0.25f,0,0.25f)
                , pitch,  yaw-180, 0).addVector(f(x), f(y), f(z));
        pos[4] = CommonUtil.rotatePoint(shape[1].addVector(0.25f,0,0.25f)
                , pitch,  yaw-180, 0).addVector(f(x), f(y), f(z));
        pos[5] = CommonUtil.rotatePoint(shape[6].addVector(0.25f,0.5f,-0.25f)
                , pitch,  yaw-180, 0).addVector(f(x), f(y), f(z));
        if (TrainsInMotion.proxy.isClient()) {
            for (int i = 0; i < 8; i++) {
                renderShape[i] = CommonUtil.rotatePoint(shape[i], pitch, yaw, 0);
            }
            for(int i=0; i<interactionBoxes.size();i++){
                Vec3d part = CommonUtil.rotateDistance(
                        (((GenericRailTransport)interactionBoxes.get(0).entityDragonObj).getHitboxSize()[2]*1.5f)+
                                ((((GenericRailTransport)interactionBoxes.get(0).entityDragonObj).getHitboxSize()[2]) *-i),
                        pitch, yaw).addVector(x,y,z);
                interactionBoxes.get(i).setPosition(part.xCoord,part.yCoord,part.zCoord);
            }

        }
    }
    private static float f(double d){ return (float)d;}


    /**
     * AWT methods
     */

    List<Entity> arraylist = new ArrayList<>();
    List[] entities;
    int i,j,k,l;
    GenericRailTransport stock;

    public List<Entity> getCollidingEntities(GenericRailTransport host){
        arraylist = new ArrayList<>();
        i = MathHelper.floor_double((-longest+host.posX - 0.25) / 16.0D);
        j = MathHelper.floor_double((longest+host.posX + 0.25) / 16.0D);
        k = MathHelper.floor_double((-longest+host.posZ - 0.25) / 16.0D);
        l = MathHelper.floor_double((longest+host.posZ + 0.25) / 16.0D);

        for (int i1 = i; i1 <= j; ++i1) {
            for (int j1 = k; j1 <= l; ++j1) {
                if (host.worldObj.getChunkProvider().chunkExists(i1, j1)) {
                    entities = host.worldObj.getChunkFromChunkCoords(i1, j1).entityLists;
                    for (List olist: entities) {
                        for(Object obj : olist) {
                            if(obj instanceof EntitySeat || obj instanceof EntityBogie || obj ==host
                                    || obj instanceof clientInteractBox){continue;}

                            if(obj instanceof GenericRailTransport) {
                                stock=(GenericRailTransport)obj;
                                Vec3 vec;
                                if(host.getBoolean(GenericRailTransport.boolValues.COUPLINGFRONT)) {
                                    vec = CommonUtil.rotateDistance(longest+0.25f, host.rotationPitch, host.rotationYaw);
                                    vec.addVector(host.posX, host.posY + 0.25, host.posZ);
                                    if (stock.collisionHandler.containsPoint(vec.xCoord, vec.yCoord, vec.zCoord)) {
                                        if (transportCollide(host, (GenericRailTransport) obj, true)) {
                                            continue;
                                        }
                                    }
                                }
                                if(host.getBoolean(GenericRailTransport.boolValues.COUPLINGBACK)) {
                                    vec = CommonUtil.rotateDistance(-longest - 0.25f, host.rotationPitch, host.rotationYaw);
                                    vec.addVector(host.posX, host.posY + 0.25, host.posZ);
                                    if (stock.collisionHandler.containsPoint(vec.xCoord, vec.yCoord, vec.zCoord)) {
                                        if (transportCollide(host, (GenericRailTransport) obj, false)) {
                                            continue;
                                        }
                                    }
                                }
                                continue;

                            }

                            if(containsEntity((Entity) obj)){
                                arraylist.add((Entity)obj);
                            }
                        }
                    }
                }
            }
        }

        return arraylist;
    }

    public boolean transportCollide(GenericRailTransport host, GenericRailTransport target, boolean front){
        if(front){
            Vec3 vec = CommonUtil.rotateDistance(target.collisionHandler.longest+0.25f, target.rotationPitch, target.rotationYaw);
            vec.addVector((target).posX,(target).posY+0.25,(target).posZ);
            if(containsPoint(vec.xCoord,vec.yCoord,vec.zCoord)){
                if(target.getBoolean(GenericRailTransport.boolValues.COUPLINGFRONT)){
                    host.frontLinkedTransport=target.getUniqueID();
                    target.frontLinkedTransport=host.getUniqueID();
                    host.frontLinkedID=target.getEntityId();
                    target.frontLinkedID=host.getEntityId();
                    host.setBoolean(GenericRailTransport.boolValues.COUPLINGFRONT,false);
                    target.setBoolean(GenericRailTransport.boolValues.COUPLINGFRONT,false);
                    host.updateConsist();
                    return true;
                }
            } else {
                vec = CommonUtil.rotateDistance(-target.collisionHandler.longest-0.25f, target.rotationPitch, target.rotationYaw);
                vec.addVector((target).posX,(target).posY+0.25,(target).posZ);
                if(containsPoint(vec.xCoord,vec.yCoord,vec.zCoord)) {
                    if (target.getBoolean(GenericRailTransport.boolValues.COUPLINGBACK)) {
                        host.frontLinkedTransport=target.getUniqueID();
                        target.backLinkedTransport=host.getUniqueID();
                        host.frontLinkedID=target.getEntityId();
                        target.backLinkedID=host.getEntityId();
                        host.setBoolean(GenericRailTransport.boolValues.COUPLINGFRONT,false);
                        target.setBoolean(GenericRailTransport.boolValues.COUPLINGBACK,false);
                        host.updateConsist();
                        return true;
                    }
                }
            }
        } else {
            Vec3 vec = CommonUtil.rotateDistance(target.collisionHandler.longest+0.25f, target.rotationPitch, target.rotationYaw);
            vec.addVector((target).posX,(target).posY+0.25,(target).posZ);
            if(containsPoint(vec.xCoord,vec.yCoord,vec.zCoord)){
                if(target.getBoolean(GenericRailTransport.boolValues.COUPLINGFRONT)){
                    host.backLinkedTransport=target.getUniqueID();
                    target.frontLinkedTransport=host.getUniqueID();
                    host.backLinkedID=target.getEntityId();
                    target.frontLinkedID=host.getEntityId();
                    host.setBoolean(GenericRailTransport.boolValues.COUPLINGBACK,false);
                    target.setBoolean(GenericRailTransport.boolValues.COUPLINGFRONT,false);
                    host.updateConsist();
                    return true;
                }
            } else {
                vec = CommonUtil.rotateDistance(-target.collisionHandler.longest-0.25f, target.rotationPitch, target.rotationYaw);
                vec.addVector((target).posX,(target).posY+0.25,(target).posZ);
                if(containsPoint(vec.xCoord,vec.yCoord,vec.zCoord)) {
                    if (target.getBoolean(GenericRailTransport.boolValues.COUPLINGBACK)) {
                        host.backLinkedTransport=target.getUniqueID();
                        target.backLinkedTransport=host.getUniqueID();
                        host.backLinkedID=target.getEntityId();
                        target.backLinkedID=host.getEntityId();
                        host.setBoolean(GenericRailTransport.boolValues.COUPLINGBACK,false);
                        target.setBoolean(GenericRailTransport.boolValues.COUPLINGBACK,false);
                        host.updateConsist();
                        return true;
                    }
                }
            }
        }
        return false;

    }
    public boolean containsPoint(double x, double y, double z){
        return containsPoint(pos[0],pos[1],pos[2], new Vec3f(x,y,z)) ||
                containsPoint(pos[3],pos[4],pos[5], new Vec3f(x,y,z));
    }

    //todo this probably isnt how i fix this, but it works.
    public boolean containsEntity(Entity e){
        return containsPoint(pos[0],pos[1],pos[2], new Vec3f(e.posX,e.posY+(e instanceof EntityPlayer && e.worldObj.isRemote?-1:0.25f),e.posZ)) ||
                containsPoint(pos[3],pos[4],pos[5], new Vec3f(e.posX,e.posY+(e instanceof EntityPlayer && e.worldObj.isRemote?-1:0.25f),e.posZ));
    }

    public static boolean containsPoint(Vec3f A, Vec3f B, Vec3f C, Vec3f P){
        if(P.yCoord>A.yCoord && P.yCoord<C.yCoord) {
            // Compute vectors
            Vec3f v0 = C.subtract(A);
            Vec3f v1 = B.subtract(A);
            Vec3f v2 = P.subtract(A);

            // Compute dot products
            float dot00 = v0.dot2D(v0);
            float dot01 = v0.dot2D(v1);
            float dot02 = v0.dot2D(v2);
            float dot11 = v1.dot2D(v1);
            float dot12 = v1.dot2D(v2);

            // Compute barycentric coordinates
            float invDenom = 1f / (dot00 * dot11 - dot01 * dot01);
            float u = (dot11 * dot02 - dot01 * dot12) * invDenom;
            float v = (dot00 * dot12 - dot01 * dot02) * invDenom;

            // Check if point is in triangle
            return (u > 0) && (v > 0) && (u + v < 1);
        }
        return false;
    }




    private static String dragonBoxName ="b";

    public class clientInteractBox extends EntityDragonPart{
        public clientInteractBox(GenericRailTransport transport) {
            super(transport, dragonBoxName, transport.getHitboxSize()[2],transport.getHitboxSize()[1]);
        }

        @Override
        public boolean canBeCollidedWith() {
            return true;
        }

        @Override
        public String getCommandSenderName(){
            return ((GenericRailTransport)entityDragonObj).getCommandSenderName();
        }

        @Override
        public boolean interactFirst(EntityPlayer p_130002_1_) {
            return ((GenericRailTransport)entityDragonObj).interactFirst(p_130002_1_);
        }
        //check often to be sure the host actually exists and didnt somehow get deleted in such a way that would make it skip hitbox removal.
        @Override
        public void onUpdate(){
            if(ticksExisted%100==0){
                if(!(worldObj.getEntityByID(((Entity)entityDragonObj).getEntityId()) instanceof GenericRailTransport)){
                    this.setDead();
                    worldObj.removeEntity(this);
                }
            }
        }
    }
}
