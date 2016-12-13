/*
 * This file ("TestTrainModel.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.client.models;

import si.meansoft.traincraft.api.TrainBase;

/**
 * @author canitzp
 */
public class TestTrainModel<T extends TrainBase> extends TrainModel<T> {

    public TestTrainModel() {
        super(128);
    }

    @Override
    public void initParts() {
        this.addBody(0, 0, 0, 0, 0, 10, 2, 40);
        this.addBody(0, 2, 0, 0, 0, 10, 16, 1);
        this.addWheel(-0.5F, 0, 0, 0, 0, 1, 5, 5);
        this.addWheel(-0.5F, 0, 35, 0, 0, 1, 5, 5);
        this.addWheel(-10.5F, 0, 0, 0, 0, 1, 5, 5);
        this.addWheel(-10.5F, 0, 35, 0, 0, 1, 5, 5);
        //this.addPart(-10.5F, 0, 35, 0, 0, PredefinedTrainShapes.WHEEL_5X5);
    }

    /* test BoxCartUS
    this.addBody(13, 1, -7, 10, 1, 4, 3, 3);
        this.addBody(-23, 32, -9, 0, 34, 46, 2, 9).setRotationAngle(-0.15707963267948966F, 0, 0);
        this.addBody(23, 6, -2, 7, 2, 7, 3, 4);
        this.addBody(-12, 2, -5, 0, 0, 2, 2, 10);
        this.addBody(-22, 2, -5, 0, 0, 2, 2, 10);
        this.addBody(-17, 1, 4, 3, 2, 4, 3, 3);
        this.addBody(-17, 1, -7, 5, 2, 4, 3, 3);
        this.addBody(-11, 5, 3, 1, 1, 20, 1, 1);
        this.addBody(-11, 5, -4, 1, 1, 20, 1, 1);
        this.addBody(-8, 8, 10, 93, 1, 16, 22, 1);
        this.addBody(8, 8, 10, 93, 1, 16, 22, 1).setRotationAngle(0, -3.141592653589793F, 0);
        this.addBody(-23, 6, -9, 0, 46, 46, 26, 1);
        this.addBody(-24, 0, -6, 0, 92, 48, 7, 12);
        this.addBody(23, 6, 9, 0, 46, 46, 26, 1).setRotationAngle(0, -3.141592653589793F, 0);
        this.addBody(-22, 6, 8, 94, 32, 1, 26, 16).setRotationAngle(0, -3.141592653589793F, 0);
        this.addBody(22, 6, -8, 94, 32, 1, 26, 16);
        this.addBody(-30, 6, -2, 1, 1, 7, 3, 4);
        this.addBody(-22, 6, -8, 0, 74, 44, 2, 16);
        this.addBody(-24, 0, -5, 0, 111, 48, 7, 10);
        this.addBody(20, 2, -5, 0, 0, 2, 2, 10);
        this.addBody(-21, 4, -4, 1, 0, 10, 2, 8);
        this.addBody(10, 2, -5, 0, 0, 2, 2, 10);
        this.addBody(-23, 32, 9, 0, 34, 46, 2, 9).setRotationAngle(-2.9845130209103035F, 0, 0);
        this.addBody(-24, 35, -2, 1, 25, 48, 1, 4);
        this.addBody(13, 1, 4, 6, 2, 4, 3, 3);
        this.addBody(11, 4, -4, 0, 0, 10, 2, 8);
     */

}
