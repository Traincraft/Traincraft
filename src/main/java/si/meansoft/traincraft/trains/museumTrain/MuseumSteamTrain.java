/*
 * This file ("MuseumSteamTrain.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.trains.museumTrain;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import si.meansoft.traincraft.Util;
import si.meansoft.traincraft.api.TrainBase;
import si.meansoft.traincraft.api.TrainPart;
import si.meansoft.traincraft.client.models.TrainModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author canitzp
 */
public class MuseumSteamTrain extends TrainBase {

    public MuseumSteamTrain(World world) {
        super(world, "museumTrain");
    }

    @Override
    public double getMountedYOffset() {
        return 0;
    }

    @Override
    protected List<TrainPart<? extends TrainBase>> initParts(TrainModel<? extends TrainBase> model) {
        List<TrainPart<? extends TrainBase>> parts = new ArrayList<>();
        // 8, 20, 8
        parts.add(new TrainPart<TrainBase>(this, TrainPart.TrainParts.SEET, 14, 14, 8, 20, 16, model));
        return parts;
    }

    @Override
    protected void writeNBT(NBTTagCompound nbt, Util.NBTType type) {

    }

    @Override
    protected void readNBT(NBTTagCompound nbt, Util.NBTType type) {

    }
}
