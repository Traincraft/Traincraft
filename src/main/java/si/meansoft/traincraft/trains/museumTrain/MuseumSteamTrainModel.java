/*
 * This file ("MuseumSteamTrainModel.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2017
 */

package si.meansoft.traincraft.trains.museumTrain;

import si.meansoft.traincraft.client.models.TrainModel;

/**
 * @author canitzp
 */
public class MuseumSteamTrainModel extends TrainModel<MuseumSteamTrain> {

    public MuseumSteamTrainModel() {
        super(64);
    }

    @Override
    public void initParts() {
        //Base
        this.addBody(0, 0, 0, 0, 0, 16, 4, 32);
        //Cage
        this.addBody(0, 4, 0, 0, 0, 1, 14, 16);
        this.addBody(15, 4, 0, 0, 0, 1, 14, 16);
        this.addBody(1, 4, 0, 0, 0, 14, 14, 1);
        this.addBody(1, 4, 15, 0, 0, 14, 14, 1);
        //Roof
        this.addBody(0, 18, 0, 0, 0, 1, 13, 1);
        this.addBody(0, 18, 15, 0, 0, 1, 13, 1);
        this.addBody(15, 18, 0, 0, 0, 1, 13, 1);
        this.addBody(15, 18, 15, 0, 0, 1, 13, 1);
        this.addBody(-1, 31, -1, 0, 0, 18, 1, 18);
        //Front
        this.addBody(0, 4, 16, 0, 0, 16, 8, 12);
        this.addBody(5, 4, 27, 0, 0, 6, 4, 5);
        this.addBody(6, 8, 27, 0, 0, 4, 24, 4);
        this.addBody(5, 28, 26, 0, 0, 6, 4, 6);
    }
}
