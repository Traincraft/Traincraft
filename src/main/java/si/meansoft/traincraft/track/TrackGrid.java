package si.meansoft.traincraft.track;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a grid which a track will be using.
 *
 * @author canitzp
 * @author MisterErwin
 */
public class TrackGrid {

// @canitzp Your old thingy
//    public static final TrackGrid STRAIGHT_SHORT = new TrackGrid(3, 4)
//            .add(true, true, false)
//            .add(false, true, true)
//            .add(false, false, true)
//            .add(false, false, true).finish();

    /* [X|Z]
     *      0|0 , 1|0 , 2|0
     *      0|1 , 1|1 , 2|1
     */

    //Blame @canitzp as this is not that straight :)
    public static final TrackGrid STRAIGHT_SHORT = new TrackBuilder(3, 4)
            .add(false, true, true)
            .add(true, true, false)
            .add(true, false, false) //First true here is the placed block!
            .build();

    /*
    A test case to see if the rotation was right.
    Might want to remove it at some point :)
    public static final TrackGrid STRAIGHT_SHORT = new TrackBuilder(3, 5)
            .add(true, true, true)
            .add(true, false, false)
            .add(true, false, false)
            .add(true, false, false)
            .add(true, false, false) //First true here is the placed block!
            .build();
    */

    private final boolean[][][] list;
    private final int widthX, widthZ;

    private TrackGrid(int sizeX, int sizeZ, boolean[][][] list) {
        this.widthX = sizeX;
        this.widthZ = sizeZ;
        this.list = list;
    }

    /**
     * @param start      the placed Block. Used to generate offsets
     * @param facing     the direction the track should be "pointing"
     * @param flipAlongX False if the track should be curved to the left(default). True to be otherwise
     * @return a List of BlockPos which this track will occupy.
     */
    public List<BlockPos> getPosesToAffect(BlockPos start, EnumFacing facing, boolean flipAlongX) {
        List<BlockPos> poses = new ArrayList<>();

        //Who needs matrix rotation anyways :P

        for (int y = 0; y < list.length; ++y) {
            boolean[][] map = list[y];
            if (flipAlongX)
                for (int z = 0; z < widthZ; ++z) {
                    for (int x = 0; x < widthX; ++x) {
                        if (facing == EnumFacing.NORTH && map[z][widthX - 1 - x])
                            poses.add(start.add(x - widthX + 1, y, z - widthZ + 1));
                        else if (facing == EnumFacing.EAST && map[widthZ - z - 1][widthX - x - 1]) // borken
                            poses.add(start.add(z, y, x - widthX + 1));
                        else if (facing == EnumFacing.SOUTH && map[widthZ - z - 1][x])
                            poses.add(start.add(x, y, z));
                        else if (facing == EnumFacing.WEST && map[z][x])
                            poses.add(start.add(z - widthZ + 1, y, x));

                    }
                }
            else
                for (int z = 0; z < widthZ; ++z) {
                    for (int x = 0; x < widthX; ++x) {
                        if (facing == EnumFacing.NORTH && map[z][x])
                            poses.add(start.add(x, y, z - widthZ + 1));
                        else if (facing == EnumFacing.EAST && map[widthZ - z - 1][x])
                            poses.add(start.add(z, y, x));
                        else if (facing == EnumFacing.SOUTH && map[widthZ - z - 1][widthX - x - 1])
                            poses.add(start.add(x - widthX + 1, y, z));
                        else if (facing == EnumFacing.WEST && map[z][widthX - x - 1])
                            poses.add(start.add(z - widthZ + 1, y, x - widthX + 1));

                    }
                }
        }
        return poses;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        boolean[][] a = list[0];
        for (boolean[] n : a) {
            for (boolean aN : n) stringBuilder.append(aN ? 1 : 0);
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }


    private static class TrackBuilder {
        private List<List<boolean[]>> buildList = new ArrayList<>();
        private int currentYLevel = 0;
        private final int sizeX, sizeZ;

        /**
         * The track is oriented to the right. The placed block will be the most left(x=0) and lowest(z=max) point
         *
         * @param sizeX the size along the X-Axis
         * @param sizeZ the size along the Y-Axis
         */
        public TrackBuilder(int sizeX, int sizeZ) {
            this.sizeX = sizeX;
            this.sizeZ = sizeZ;
            buildList.add(new ArrayList<>()); //Y-Level = 0
        }

        /**
         * Set the shape along the X-Axis
         *
         * @param booleans an array of booleans where index 0 is the left most one
         * @return this
         */
        public TrackBuilder add(boolean... booleans) {
            if (booleans.length != sizeX)
                throw new IllegalArgumentException("The provided args (" + booleans.length + ") did not match " + sizeX);
            List<boolean[]> list = buildList.get(currentYLevel);
            if (list == null) { //Ensure that the
                list = new ArrayList<>();
                buildList.add(currentYLevel, list);
            }
            list.add(booleans);
            return this;
        }

        public TrackBuilder setY(int y) {
            if (buildList.get(currentYLevel).size() != sizeZ)
                throw new IllegalArgumentException("The Z length (" + buildList.get(currentYLevel).size() + ") did not match " + sizeZ);

            this.currentYLevel = y;
            this.buildList.add(y, new ArrayList<>());
            return this;
        }

        /**
         * Finish the building step and return a TrackGrid
         *
         * @return a TrackGrid representing the data
         */
        public TrackGrid build() {
            if (buildList.get(currentYLevel).size() != sizeZ)
                throw new IllegalArgumentException("The Z length (" + buildList.get(currentYLevel).size() + ") did not match " + sizeZ);

            boolean[][][] ret = new boolean[buildList.size()][buildList.get(0).size()][buildList.get(0).get(0).length];
            int i = 0, j;
            for (List<boolean[]> lb : buildList) {
                j = 0;
                for (boolean[] bs : lb)
                    ret[i][j++] = bs;
                i++;
            }
            return new TrackGrid(sizeX, sizeZ, ret);
        }
    }
}