package si.meansoft.traincraft.track;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author canitzp
 */
public class TrackGrid{


    public static final TrackGrid STRAIGHT_SHORT = new TrackGrid(3, 4)
            .add(true, true, false)
            .add(false, true, true)
            .add(false, false, true)
            .add(false, false, true).finish();


    private List<List<List<Boolean>>> placings = new ArrayList<>();
    private List<List<List<Boolean>>> rotatedPlacings = new ArrayList<>();
    private int currentYLevel = 0;
    private int widthX, widthZ;

    public TrackGrid(int sizeX, int sizeZ){
        this.widthX = sizeX;
        this.widthZ = sizeZ;
    }

    public TrackGrid setY(int y){
        this.currentYLevel = y;
        return this;
    }

    public TrackGrid add(Boolean... booleen){
        List<List<Boolean>> list;
        if(placings.size() > currentYLevel){
            list = placings.get(currentYLevel);
        } else {
            placings.add(currentYLevel, new ArrayList<>());
            list = placings.get(currentYLevel);
        }
        list.add(Arrays.asList(booleen));
        return this;
    }

    /**
     * Thanks to MisterErwin to create this list rotation method for me.
     */
    public TrackGrid finish(){
        final int M = placings.size();
        final int N = placings.get(0).size();
        for (int c = 0; c < N; c++) {
            List<List<Boolean>> list = new ArrayList<>();
            rotatedPlacings.add(c, list);
            for (int r = 0; r < M; r++) {
                list.add(r, placings.get(r).get(N - 1 - c));
            }
        }
        return this;
    }

    public List<BlockPos> getPosesToAffect(BlockPos start, EnumFacing facing){
        int[] offsets = getOffsetFromFacing(facing);
        //TODO write a reverse method for right or left placing (default: left)
        List<List<List<Boolean>>> neededList = offsets.length == 4 ? placings : placings;
        System.out.println(neededList);
        List<BlockPos> poses = new ArrayList<>();
        for(int y = 0; y < neededList.size(); y++){
            for(int back = 0; back < neededList.get(y).size(); back++){
                for(int line = 0; line < neededList.get(y).get(back).size(); line++){
                    Boolean b = neededList.get(y).get(back).get(line);
                    if(b){
                        poses.add(start.add(line + offsets[0], y + offsets[1], back + offsets[2]));
                    }
                }
            }
        }
        return poses;
    }

    private int[] getOffsetFromFacing(EnumFacing facing){
        switch(facing){
            case NORTH:{
                return new int[]{-widthX+1, 0, -widthZ};
            }
            case WEST:{
                return new int[]{0, 0, 0, 0};
            }
        }
        return new int[]{0, 0, 0};
    }

    @Override
    public String toString(){
        return this.placings.toString();
    }

}