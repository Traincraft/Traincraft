package ebf.tim.utility;

import ebf.tim.entities.EntityBogie;
import ebf.tim.entities.EntitySeat;
import ebf.tim.entities.GenericRailTransport;
import fexcraft.tmt.slim.Vec3d;
import fexcraft.tmt.slim.Vec3f;
import mods.railcraft.api.carts.IFluidCart;
import mods.railcraft.api.carts.ILinkableCart;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragonPart;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTankInfo;
import net.minecraftforge.fluids.IFluidHandler;

import java.util.ArrayList;
import java.util.List;


public class HitboxDynamic {
    //shape code is depreciated, as cool as rotating hitboxes are, none of the rest of MC can be interacted through it.
    //public Vec3f[] shape, pos = new Vec3f[6], renderShape;

    private float longest=0;

    public List<collisionBox> interactionBoxes = new ArrayList<>();


    public HitboxDynamic(float depth, float height, float width, GenericRailTransport entity){
        depth *=0.5f;
        width *=0.5f;
        /*shape= new Vec3f[]{
                new Vec3f(-depth,0,width)
                ,new Vec3f(depth,0,width)
                ,new Vec3f(depth,0,-width)
                ,new Vec3f(-depth,0,-width),
                new Vec3f(-depth,height,width),
                new Vec3f(depth,height,width),
                new Vec3f(depth,height,-width),
                new Vec3f(-depth,height,-width)};
        if(TrainsInMotion.proxy.isClient()) {
            renderShape = shape.clone();
        }*/
        if(Math.abs(depth)>longest){
            longest=Math.abs(depth);
        }
        if(Math.abs(width)>longest){
            longest=Math.abs(width);
        }

        depth*=2;width*=2;
        interactionBoxes = new ArrayList<>();
        int count =0;
        for (float f = 0; f < depth-(width*0.25f); f +=width) {
            interactionBoxes.add(new collisionBox(entity));
            entity.worldObj.spawnEntityInWorld(interactionBoxes.get(count));
            count++;
        }
    }


    public void position(double x, double y, double z, float pitch, float yaw){
        /*pos[0] = CommonUtil.rotatePoint(shape[0].addVector(-0.25f,0,0.25f)
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

        for (int i = 0; i < 8; i++) {
            renderShape[i] = CommonUtil.rotatePoint(shape[i], pitch, yaw, 0);
        }*/
        for(int i=0; i<interactionBoxes.size();i++){
            Vec3d part = CommonUtil.rotateDistance(
                    (interactionBoxes.get(0).host.getHitboxSize()[2]*i)-
                            (interactionBoxes.get(0).host.getHitboxSize()[0]*0.5f)+
                            (interactionBoxes.get(0).host.getHitboxSize()[2]*0.25f),
                    pitch, yaw).addVector(x,y,z);
            interactionBoxes.get(i).setPosition(part.xCoord,part.yCoord,part.zCoord);
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
                            if(obj instanceof EntitySeat || obj instanceof EntityBogie || obj instanceof collisionBox ||
                                    ((Entity)obj).getEntityId()==host.getEntityId()){continue;}

                            if(obj instanceof GenericRailTransport) {
                                stock=((GenericRailTransport) obj);
                                if(host.frontLinkedID!=null && stock.getEntityId()==host.frontLinkedID){
                                    continue;
                                } else if(host.backLinkedID!=null && stock.getEntityId()==host.backLinkedID){
                                    continue;
                                }
                                Vec3 vec;
                                if(host.getBoolean(GenericRailTransport.boolValues.COUPLINGFRONT)) {
                                    vec = CommonUtil.rotateDistance(longest+1.3f, host.rotationPitch, host.rotationYaw);
                                    vec.addVector(host.posX, host.posY+0.1, host.posZ);
                                    if (stock.collisionHandler.containsPoint(vec.xCoord, vec.yCoord, vec.zCoord)) {
                                        if (transportCollide(host, stock, true)) {
                                            continue;
                                        }
                                    }
                                }
                                if(host.getBoolean(GenericRailTransport.boolValues.COUPLINGBACK)) {
                                    vec = CommonUtil.rotateDistance(-longest - 1.3f, host.rotationPitch, host.rotationYaw);
                                    vec.addVector(host.posX, host.posY+0.1, host.posZ);
                                    if (stock.collisionHandler.containsPoint(vec.xCoord, vec.yCoord, vec.zCoord)) {
                                        if (transportCollide(host, stock, false)) {
                                            continue;
                                        }
                                    }
                                }

                                for(collisionBox b : stock.collisionHandler.interactionBoxes){
                                    if(containsEntity(b)) {
                                        arraylist.add(b);
                                    }
                                }

                            }

                            else if(containsEntity((Entity) obj)){
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
            vec.addVector((target).posX,(target).posY+0.3,(target).posZ);
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
                vec = CommonUtil.rotateDistance(-target.collisionHandler.longest-0.3f, target.rotationPitch, target.rotationYaw);
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
            Vec3 vec = CommonUtil.rotateDistance(target.collisionHandler.longest+0.3f, target.rotationPitch, target.rotationYaw);
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
                vec = CommonUtil.rotateDistance(-target.collisionHandler.longest-0.3f, target.rotationPitch, target.rotationYaw);
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
        for(collisionBox box : interactionBoxes){
            if(x>=box.boundingBox.minX && x<=box.boundingBox.maxX &&
                    y>=box.boundingBox.minY && y<=box.boundingBox.maxY &&
                    z>=box.boundingBox.minZ && z<=box.boundingBox.maxZ){
                return true;
            }
        }
        return false;
    }

    public boolean containsEntity(Entity e){
        for(collisionBox box : interactionBoxes){
            //check for X
            if (e.boundingBox.intersectsWith(box.boundingBox.expand(0.2D, e instanceof EntityPlayer?1.2D:0.2D, 0.2D)))
                return true;
        }
        return false;
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

    public class collisionBox extends EntityDragonPart implements IInventory, IFluidHandler, IFluidCart, ILinkableCart{
        GenericRailTransport host;
        public collisionBox(GenericRailTransport transport) {
            super(transport, dragonBoxName, transport.getHitboxSize()[2],transport.getHitboxSize()[1]);
            host=transport;
        }

        @Override
        public boolean canBeCollidedWith() {
            return true;
        }

        @Override
        public String getCommandSenderName(){
            return host.getCommandSenderName();
        }

        @Override
        public boolean interactFirst(EntityPlayer p_130002_1_) {
            return host.interactFirst(p_130002_1_);
        }
        //check often to be sure the host actually exists and didnt somehow get deleted in such a way that would make it skip hitbox removal.
        @Override
        public void onUpdate(){
            if(worldObj.isRemote && ticksExisted%10==0){
                if(Minecraft.getMinecraft().thePlayer.ridingEntity instanceof GenericRailTransport ||
                        Minecraft.getMinecraft().thePlayer.ridingEntity instanceof EntitySeat){
                    this.boundingBox.maxX =0;
                    this.boundingBox.maxZ =0;
                    this.boundingBox.maxY =0;
                } else {
                    this.boundingBox.maxX = this.boundingBox.minX + (double)this.width;
                    this.boundingBox.maxZ = this.boundingBox.minZ + (double)this.width;
                    this.boundingBox.maxY = this.boundingBox.minY + (double)this.height;
                }
            }

            if(ticksExisted%100==0){
                if(!(worldObj.getEntityByID(((Entity)entityDragonObj).getEntityId()) instanceof GenericRailTransport)){
                    this.setDead();
                    worldObj.removeEntity(this);
                }
            }
        }

        @Override
        public boolean canPassFluidRequests(Fluid fluid) {return host.canPassFluidRequests(fluid);}

        @Override
        public boolean canAcceptPushedFluid(EntityMinecart requester, Fluid fluid) {
            return host.canAcceptPushedFluid(requester,fluid);}

        @Override
        public boolean canProvidePulledFluid(EntityMinecart requester, Fluid fluid) {
            return host.canProvidePulledFluid(requester,fluid);}

        @Override
        public void setFilling(boolean filling) {host.setFilling(filling);}

        @Override
        public boolean isLinkable() {return host.isLinkable();}

        @Override
        public boolean canLinkWithCart(EntityMinecart cart) {return host.canLinkWithCart(cart);}

        @Override
        public boolean hasTwoLinks() {return host.hasTwoLinks();}

        @Override
        public float getLinkageDistance(EntityMinecart cart) {return host.getLinkageDistance(cart);}

        @Override
        public float getOptimalDistance(EntityMinecart cart) {return host.getOptimalDistance(cart);}

        @Override
        public boolean canBeAdjusted(EntityMinecart cart) {return host.canBeAdjusted(cart);}

        @Override
        public void onLinkCreated(EntityMinecart cart) {host.onLinkCreated(cart);}

        @Override
        public void onLinkBroken(EntityMinecart cart) {host.onLinkBroken(cart);}

        @Override
        public int getSizeInventory() {return host.getSizeInventory();}

        @Override
        public ItemStack getStackInSlot(int p_70301_1_) {return host.getStackInSlot(p_70301_1_);}

        @Override
        public ItemStack decrStackSize(int p_70298_1_, int p_70298_2_) {
            return host.decrStackSize(p_70298_1_,p_70298_2_);}

        @Override
        public ItemStack getStackInSlotOnClosing(int p_70304_1_) {
            return host.getStackInSlotOnClosing(p_70304_1_);}

        @Override
        public void setInventorySlotContents(int p_70299_1_, ItemStack p_70299_2_) {
            host.setInventorySlotContents(p_70299_1_,p_70299_2_);}

        @Override
        public String getInventoryName() {return host.getInventoryName();}

        @Override
        public boolean hasCustomInventoryName() {return host.hasCustomInventoryName();}

        @Override
        public int getInventoryStackLimit() {return host.getInventoryStackLimit();}

        @Override
        public void markDirty() {host.markDirty();}

        @Override
        public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {return host.isUseableByPlayer(p_70300_1_);}

        @Override
        public void openInventory() {host.openInventory();}

        @Override
        public void closeInventory() {host.closeInventory();}

        @Override
        public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
            return host.isItemValidForSlot(p_94041_1_, p_94041_2_);}

        @Override
        public int fill(ForgeDirection from, FluidStack resource, boolean doFill) {
            return host.fill(from, resource, doFill);}

        @Override
        public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain) {
            return host.drain(from, resource, doDrain);}

        @Override
        public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) {
            return host.drain(from, maxDrain, doDrain);}

        @Override
        public boolean canFill(ForgeDirection from, Fluid fluid) {return host.canFill(from, fluid);}

        @Override
        public boolean canDrain(ForgeDirection from, Fluid fluid) {return host.canDrain(from, fluid);}

        @Override
        public FluidTankInfo[] getTankInfo(ForgeDirection from) {return host.getTankInfo(from);}

        @Override
        /**
         * Called when a user uses the creative pick block button on this entity.
         *
         * @param target The full target the player is looking at
         * @return A ItemStack to add to the player's inventory, Null if nothing should be added.
         */
        public ItemStack getPickedResult(MovingObjectPosition target) {
            return host.getCartItem();
        }

        @Override
        public void setPosition(double p_70107_1_, double p_70107_3_, double p_70107_5_) {
            this.posX = p_70107_1_;
            this.posY = p_70107_3_;
            this.posZ = p_70107_5_;
            float f = this.width / 2.0F;
            float f1 = this.height;
            if(boundingBox.maxZ!=0) {
                this.boundingBox.setBounds(p_70107_1_ - (double) f, p_70107_3_ - (double) this.yOffset + (double) this.ySize, p_70107_5_ - (double) f, p_70107_1_ + (double) f, p_70107_3_ - (double) this.yOffset + (double) this.ySize + (double) f1, p_70107_5_ + (double) f);
            }
        }
    }
}
