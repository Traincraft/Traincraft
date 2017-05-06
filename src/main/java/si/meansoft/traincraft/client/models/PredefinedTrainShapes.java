/*
 * This file ("PredefinedTrainShapes.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2017
 */

package si.meansoft.traincraft.client.models;


/**
 * @author canitzp
 */
public enum PredefinedTrainShapes {

    WHEEL_5X5(0, 0, (float) Math.PI, new Part(0, 0, 1, 1, 5, 3));

    private Part[] part;
    private float rotationX, rotationY, rotationZ;

    PredefinedTrainShapes(Part... parts) {
        this(0, 0, 0, parts);
    }

    PredefinedTrainShapes(float rotationX, float rotationY, float rotationZ, Part... parts) {
        this.part = parts;
    }

    public Part[] getPart() {
        return part;
    }

    public float getRotationX() {
        return rotationX;
    }

    public float getRotationY() {
        return rotationY;
    }

    public float getRotationZ() {
        return rotationZ;
    }

    public static class Part {
        public float offsetX, offsetY, offsetZ;
        public int width, height, depth;

        Part(float offsetX, float offsetY, float offsetZ, int width, int height, int depth) {
            this.offsetX = offsetX;
            this.offsetY = offsetY;
            this.offsetZ = offsetZ;
            this.width = width;
            this.height = height;
            this.depth = depth;
        }
    }

}
