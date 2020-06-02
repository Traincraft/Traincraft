package traincraft.api;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import traincraft.Traincraft;
import traincraft.renderer.TraincraftModel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TCUtil {
    
    private static final TraincraftModel EMPTY = new TraincraftModel();
    
    public static AxisAlignedBB generateRotatedAABB(double x, double y, double z, double width, double height, double depth, double rotationAngle){
        return null;
    }
    
    public static TraincraftModel loadModelFromJTMT(ResourceLocation jtmtLocation){
        String locationPath = String.format("/assets/%s/jtmt/%s", jtmtLocation.getNamespace(), jtmtLocation.getPath());
        InputStream is = TCUtil.class.getResourceAsStream(locationPath);
        if(is != null){
            try (InputStreamReader json = new InputStreamReader(is)){
                JsonElement parse = new JsonParser().parse(json);
                if(parse.isJsonObject()){
                    return new TraincraftModel(parse.getAsJsonObject());
                } else {
                    Traincraft.LOGGER.error(new JsonParseException(String.format("JTMT file is not a json-object! '%s'", locationPath)));
                }
            }catch(IOException e){
                Traincraft.LOGGER.error("JTMT file error! '" + locationPath + "'", e);
            }
        } else {
            Traincraft.LOGGER.error(new FileNotFoundException(String.format("JTMT file not found! '%s'", locationPath)));
        }
        return EMPTY;
    }
}
