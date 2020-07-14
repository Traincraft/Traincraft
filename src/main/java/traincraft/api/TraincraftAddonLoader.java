package traincraft.api;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.minecraft.util.math.Vec3d;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FalseFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import traincraft.Traincraft;
import traincraft.renderer.TraincraftModel;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TraincraftAddonLoader {
    
    private static final JsonParser JSON_PARSER = new JsonParser();
    
    public static void loadFolders(File rootDirectory){
        for(File file : FileUtils.listFiles(rootDirectory, new String[]{"json"}, true)){
            try{
                JsonElement jsonElement = JSON_PARSER.parse(FileUtils.readFileToString(file, StandardCharsets.UTF_8));
                if(jsonElement.isJsonObject()){
                    loadTrainJson(jsonElement.getAsJsonObject());
                }
            } catch(IOException e){
                Traincraft.LOGGER.error("Addon file '" + file.getAbsolutePath() + "' could not be read!", e);
            }
        }
    }
    
    private static void loadTrainJson(JsonObject root){
        if(root.has("type")){
            switch(root.get("type").getAsString()){
                case "steam": {
                    // todo load steam train
                    break;
                }
                case "diesel": {
                    // todo load diesel train
                    break;
                }
                case "electric": {
                    // todo load electric train
                    break;
                }
                default: {
                    loadRollingStock(root, new WrapperRollingStock());
                    break;
                }
            }
        } else {
            loadRollingStock(root, new WrapperRollingStock());
        }
    }
    
    private static void loadRollingStock(JsonObject root, WrapperRollingStock wrapper){
        // general information
        if(root.has("name")){
            wrapper.setName(root.get("name").getAsString());
        }
        if(root.has("desc")){
            if(root.get("desc").isJsonArray()){
                for(JsonElement line : root.get("desc").getAsJsonArray()){
                    wrapper.addDescriptionLine(line.getAsString());
                }
            } else {
                wrapper.addDescriptionLine(root.get("desc").getAsString());
            }
        }
        
        // model information
        if(root.has("model") && root.get("model").isJsonObject()){
            JsonObject model = root.get("model").getAsJsonObject();
            if(model.has("location")){
                wrapper.setModel(TCUtil.loadModelFromJTMT(JSON_PARSER, model.get("location").getAsString()));
            }
            if(model.has("scale")){
                if(model.get("scale").isJsonArray()){ // array with 3 double as x, y, z
                    JsonArray scaleArray = model.get("scale").getAsJsonArray();
                    if(scaleArray.size() == 3){
                        wrapper.setModelScale(new Vec3d(scaleArray.get(0).getAsDouble(), scaleArray.get(1).getAsDouble(), scaleArray.get(2).getAsDouble()));
                    }
                } else { // single value for all three values
                    double scale = model.get("scale").getAsDouble();
                    wrapper.setModelScale(new Vec3d(scale, scale, scale));
                }
            }
            if(model.has("translate")){
                if(model.get("translate").isJsonArray()){ // array with 3 double as x, y, z
                    JsonArray translateArray = model.get("translate").getAsJsonArray();
                    if(translateArray.size() == 3){
                        wrapper.setModelOffset(new Vec3d(translateArray.get(0).getAsDouble(), translateArray.get(1).getAsDouble(), translateArray.get(2).getAsDouble()));
                    }
                } else { // single value for all three values
                    double translate = model.get("translate").getAsDouble();
                    wrapper.setModelOffset(new Vec3d(translate, translate, translate));
                }
            }
            if(model.has("rotation")){
                if(model.get("rotation").isJsonArray()){ // array with 3 double as x, y, z
                    JsonArray rotationArray = model.get("rotation").getAsJsonArray();
                    if(rotationArray.size() == 3){
                        wrapper.setModelRotation(new Vec3d(rotationArray.get(0).getAsDouble(), rotationArray.get(1).getAsDouble(), rotationArray.get(2).getAsDouble()));
                    }
                } else { // single value for all three values
                    double rotation = model.get("rotation").getAsDouble();
                    wrapper.setModelRotation(new Vec3d(rotation, rotation, rotation));
                }
            }
        }
        
        // actual rolling stock values
        
    }
    
}
