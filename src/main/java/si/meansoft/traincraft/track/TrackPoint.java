package si.meansoft.traincraft.track;

import net.minecraft.util.math.BlockPos;

import java.util.*;

/**
 * @author canitzp
 */
public class TrackPoint{

    private Map<Integer, Float[]> pointsAtBlock = new HashMap<>();
    private BlockPos pos;

    public TrackPoint(BlockPos pos){
        this.pos = pos;
    }

    public TrackPoint addPoint(int index, float x, float y, float z){
        Float[] floats = new Float[]{x, y, z};
        if(pointsAtBlock.containsKey(index)){
            System.out.println("Overwriting '" + Arrays.toString(pointsAtBlock.get(index)) + "' with '" + Arrays.toString(floats) + "'");
        }
        pointsAtBlock.put(index, floats);
        return this;
    }

    public List<Float[]> getSortedCoordinates(){
        List<Float[]> floats = new ArrayList<>();
        for(Map.Entry<Integer, Float[]> entry : pointsAtBlock.entrySet()){
            floats.add(entry.getKey(), entry.getValue());
        }
        return floats;
    }

}
