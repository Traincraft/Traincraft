/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("PassengerSeat.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.api;


import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;

public class PassengerSeat {
    
    private final AxisAlignedBB boundingBox;
    private final Vec3d centerPoint;
    private boolean controllingSeat;
    private Entity currentUser;
    
    public PassengerSeat(AxisAlignedBB boundingBox){
        this.boundingBox = boundingBox;
        this.centerPoint = new Vec3d(boundingBox.minX + (this.getWidth() / 2D), boundingBox.minY + (this.getHeight() / 2D), boundingBox.minZ + (this.getDepth() / 2D));
    }
    
    public AxisAlignedBB getBoundingBox(){
        return boundingBox;
    }
    
    public Vec3d getCenter(){
        return this.centerPoint;
    }
    
    public double getWidth(){
        return this.boundingBox.maxX - this.boundingBox.minX;
    }
    
    public double getHeight(){
        return this.boundingBox.maxY - this.boundingBox.minY;
    }
    
    public double getDepth(){
        return this.boundingBox.maxZ - this.boundingBox.minZ;
    }
    
    public Entity getCurrentUser(){
        return currentUser;
    }
    
    public void setCurrentUser(Entity currentUser){
        this.currentUser = currentUser;
    }
    
    public boolean isFree(){
        return this.currentUser == null;
    }
    
    public boolean isUsedBy(Entity entity){
        return !this.isFree() && this.currentUser.equals(entity);
    }
    
    public void setAsController(){
        this.controllingSeat = true;
    }
    
    public boolean isControllingSeat(){
        return controllingSeat;
    }
}
