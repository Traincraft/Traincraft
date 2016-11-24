/*
 * This file ("TrainBase.java") is part of the Traincraft mod for Minecraft.
 * It is created by all persons that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.api;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import si.meansoft.traincraft.IRegistryEntry;
import si.meansoft.traincraft.Util;

/**
 * @author canitzp
 */
public abstract class TrainBase extends Entity implements IRegistryEntry{

    protected final String name;

    public TrainBase(World world, String name){
        super(world);
        this.name = name;
    }

    @Override
    protected void entityInit(){

    }

    @Override
    protected final void readEntityFromNBT(NBTTagCompound nbt){
        this.readNBT(nbt, Util.NBTType.SAVE);
    }

    @Override
    protected final void writeEntityToNBT(NBTTagCompound nbt){
        this.writeNBT(nbt, Util.NBTType.SAVE);
    }

    @Override
    public IRegistryEntry[] getRegisterElements(){
        return new IRegistryEntry[]{this};
    }

    @Override
    public void onRegister(IRegistryEntry[] otherEntries){

    }

    @Override
    public void ownRegistry(){

    }

    @Override
    public String getRegisterName(){
        return this.name;
    }

    protected abstract void writeNBT(NBTTagCompound nbt, Util.NBTType type);

    protected abstract void readNBT(NBTTagCompound nbt, Util.NBTType type);

}
