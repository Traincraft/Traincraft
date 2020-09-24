/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("TCUtil.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.api;

import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import org.apache.commons.io.FileUtils;
import traincraft.Traincraft;
import traincraft.renderer.TraincraftModel;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TCUtil {
    
    private static final TraincraftModel EMPTY = new TraincraftModel();
    
    public static AxisAlignedBB generateRotatedAABB(double x, double y, double z, double width, double height, double depth, double rotationAngle){
        return null;
    }
    
    public static TraincraftModel loadModelFromJTMT(ResourceLocation jtmtLocation){
        String locationPath = String.format("/assets/%s/jtmt/%s.jtmt", jtmtLocation.getNamespace(), jtmtLocation.getPath());
        InputStream is = TCUtil.class.getResourceAsStream(locationPath);
        if(is != null){
            try(InputStreamReader json = new InputStreamReader(is)){
                JsonElement parse = new JsonParser().parse(json);
                if(parse.isJsonObject()){
                    return new TraincraftModel(parse.getAsJsonObject());
                } else{
                    Traincraft.LOGGER.error(new JsonParseException(String.format("JTMT file is not a json-object! '%s'", locationPath)));
                }
            } catch(IOException e){
                Traincraft.LOGGER.error("JTMT file error! '" + locationPath + "'", e);
            }
        } else{
            Traincraft.LOGGER.error(new FileNotFoundException(String.format("JTMT file not found! '%s'", locationPath)));
        }
        return EMPTY;
    }
    
    public static TraincraftModel loadModelFromJTMT(JsonParser parser, String jtmtLocation){
        try{
            JsonElement jsonElement = parser.parse(FileUtils.readFileToString(new File(jtmtLocation), StandardCharsets.UTF_8));
            if(jsonElement.isJsonObject()){
                return new TraincraftModel(jsonElement.getAsJsonObject());
            } else{
                Traincraft.LOGGER.error(new JsonParseException(String.format("JTMT file is not a json-object! '%s'", jtmtLocation)));
            }
        } catch(IOException e){
            Traincraft.LOGGER.error("JTMT File '" + jtmtLocation + "' could not be loaded!", e);
        }
        return null;
    }
}
