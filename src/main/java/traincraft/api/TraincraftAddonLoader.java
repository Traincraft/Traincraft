/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("TraincraftAddonLoader.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.api;

import com.google.common.collect.BiMap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Sets;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.client.resources.data.MetadataSerializer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.ModContainer;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import traincraft.Traincraft;
import traincraft.entity.TCEntities;
import traincraft.renderer.RendererRollingStock;

import javax.annotation.Nullable;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Stream;

public class TraincraftAddonLoader {
    
    private static final Gson GSON = new Gson();
    private static final JsonParser JSON_PARSER = new JsonParser();
    private static ListMultimap<ModContainer, EntityRegistry.EntityRegistration> entityRegistrationMultimap;
    private static BiMap<Class<? extends Entity>, EntityRegistry.EntityRegistration> entityRegistrationMap;
    @SideOnly(Side.CLIENT)
    private static TCRL traincraftResourceLoader = null;
    
    public static void loadFolders(Side side, File rootDirectory){
        if(rootDirectory.exists()){
            for(File file : FileUtils.listFiles(rootDirectory, new String[]{"json"}, true)){
                try{
                    JsonElement jsonElement = JSON_PARSER.parse(FileUtils.readFileToString(file, StandardCharsets.UTF_8));
                    if(jsonElement.isJsonObject()){
                        loadTrainJson(side, file, jsonElement.getAsJsonObject());
                    }
                } catch(IOException e){
                    Traincraft.LOGGER.error("Addon file '" + file.getAbsolutePath() + "' could not be read!", e);
                }
            }
        }
    }
    
    public static void loadInternals(Side side, String modId, File rootDirectory){
        String path = String.format("/assets/" + modId + "/rolling_stock");
        try{
            URI uri = TraincraftAddonLoader.class.getResource(path).toURI();
            Path myPath;
            if(uri.getScheme().equals("jar")){
                FileSystem fileSystem = FileSystems.newFileSystem(uri, Collections.emptyMap());
                myPath = fileSystem.getPath(path);
            } else{
                myPath = Paths.get(uri);
            }
            Stream<Path> walk = Files.walk(myPath, 10);
            walk.filter(path1 -> FilenameUtils.isExtension(path1.toString(), "json")).forEach(path1 -> {
                try{
                    JsonElement jsonElement = JSON_PARSER.parse(new String(Files.readAllBytes(path1), StandardCharsets.UTF_8));
                    if(jsonElement.isJsonObject()){
                        loadTrainJson(side, path1.toFile(), jsonElement.getAsJsonObject());
                    }
                } catch(IOException e){
                    e.printStackTrace();
                }
            });
        } catch(URISyntaxException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
    // create entity and item
    private static void registerWrapper(Side side, WrapperRollingStock wrapper){
        ModContainer mc = FMLCommonHandler.instance().findContainerFor(Traincraft.INSTANCE);
        ResourceLocation resourceLocation = wrapper.getId();
        Class<? extends WrapperRollingStock.WrapperRollingStockEntityImpl> clazz = wrapper.createEntity(null).getClass();
        EntityRegistry.EntityRegistration er = EntityRegistry.instance().new EntityRegistration(mc,
            resourceLocation,
            clazz,
            resourceLocation.getPath(),
            TCEntities.entityIds++,
            64,
            1,
            true,
            wrapper::createEntity);
        
        if(entityRegistrationMap == null){
            // Reflection to get the map from "EntityRegistry.class"
            try{
                Field entityClassRegistrations = ReflectionHelper.findField(EntityRegistry.class, "entityClassRegistrations");
                entityRegistrationMap = (BiMap<Class<? extends Entity>, EntityRegistry.EntityRegistration>) entityClassRegistrations.get(EntityRegistry.instance());
            } catch(IllegalAccessException | ReflectionHelper.UnableToFindFieldException e){
                e.printStackTrace();
            }
            
        }
        
        if(entityRegistrationMultimap == null){
            // Reflection to get the map from "EntityRegistry.class"
            try{
                Field entityClassRegistrations = ReflectionHelper.findField(EntityRegistry.class, "entityRegistrations");
                entityRegistrationMultimap = (ListMultimap<ModContainer, EntityRegistry.EntityRegistration>) entityClassRegistrations.get(EntityRegistry.instance());
            } catch(IllegalAccessException | ReflectionHelper.UnableToFindFieldException e){
                e.printStackTrace();
            }
            
        }
        
        if(entityRegistrationMap != null){
            entityRegistrationMap.put(clazz, er);
        }
        ForgeRegistries.ENTITIES.register(new CustomEntityEntry<>(wrapper, resourceLocation.getPath()));
        if(entityRegistrationMultimap != null){
            entityRegistrationMultimap.put(mc, er);
        }
        
        if(side == Side.CLIENT){
            RenderingRegistry.registerEntityRenderingHandler(clazz, RendererRollingStock::new);
        }
        System.out.println("Registered: " + wrapper);
    }
    
    private static void loadTrainJson(Side side, File file, JsonObject root){
        if(root.has("type")){
            switch(root.get("type").getAsString()){
                case "steam":{
                    // todo load steam train
                    break;
                }
                case "diesel":{
                    // todo load diesel train
                    break;
                }
                case "electric":{
                    // todo load electric train
                    break;
                }
                default:{
                    loadRollingStock(side, file, root, new WrapperRollingStock());
                    break;
                }
            }
        } else{
            loadRollingStock(side, file, root, new WrapperRollingStock());
        }
    }
    
    private static void loadRollingStock(Side side, File file, JsonObject root, WrapperRollingStock wrapper){
        // general information
        if(root.has("id")){
            wrapper.setId(new ResourceLocation(root.get("id").getAsString()));
        } else{
            Traincraft.LOGGER.error(String.format("Can't load rolling stock from '%s': Missing id", file));
            return;
        }
        if(root.has("name")){
            wrapper.setName(root.get("name").getAsString());
        }
        if(root.has("desc")){
            if(root.get("desc").isJsonArray()){
                for(JsonElement line : root.get("desc").getAsJsonArray()){
                    wrapper.addDescriptionLine(line.getAsString());
                }
            } else{
                wrapper.addDescriptionLine(root.get("desc").getAsString());
            }
        }
        
        // model information
        if(root.has("model") && root.get("model").isJsonObject()){
            JsonObject model = root.get("model").getAsJsonObject();
            if(model.has("location")){
                String location = model.get("location").getAsString();
                if(FilenameUtils.isExtension(location, new String[]{"json", "jtmt"})){
                    wrapper.setModel(TCUtil.loadModelFromJTMT(JSON_PARSER, location));
                } else{
                    wrapper.setModel(TCUtil.loadModelFromJTMT(new ResourceLocation(location)));
                }
            }
            if(model.has("scale")){
                if(model.get("scale").isJsonArray()){ // array with 3 double as x, y, z
                    JsonArray scaleArray = model.get("scale").getAsJsonArray();
                    if(scaleArray.size() == 3){
                        wrapper.setModelScale(new Vec3d(scaleArray.get(0).getAsDouble(), scaleArray.get(1).getAsDouble(), scaleArray.get(2).getAsDouble()));
                    }
                } else{ // single value for all three values
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
                } else{ // single value for all three values
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
                } else{ // single value for all three values
                    double rotation = model.get("rotation").getAsDouble();
                    wrapper.setModelRotation(new Vec3d(rotation, rotation, rotation));
                }
            }
        }
        
        // actual rolling stock values
        if(root.has("size")){
            if(root.get("size").isJsonArray()){ // array with 3 double as x, y, z
                JsonArray sizeArray = root.get("size").getAsJsonArray();
                if(sizeArray.size() == 3){
                    wrapper.setSize(new Vec3d(sizeArray.get(0).getAsDouble(), sizeArray.get(1).getAsDouble(), sizeArray.get(2).getAsDouble()));
                }
            } else{ // single value for all three values
                double size = root.get("size").getAsDouble();
                wrapper.setSize(new Vec3d(size, size, size));
            }
        }
        if(root.has("acceleration")){
            wrapper.setAcceleration(root.get("acceleration").getAsDouble());
        }
        if(root.has("breakPower")){
            wrapper.setBreakPower(root.get("breakPower").getAsDouble());
        }
        if(root.has("maxSpeed")){
            wrapper.setMaxSpeed(root.get("maxSpeed").getAsDouble());
        }
        if(root.has("maxReverseSpeed")){
            wrapper.setMaxReverseSpeed(root.get("maxReverseSpeed").getAsDouble());
        }
        if(root.has("mass")){
            wrapper.setMass(root.get("mass").getAsDouble());
        }
        if(root.has("skins")){
            Map<String, String> rawSkinsMap = GSON.fromJson(root.get("skins"), new TypeToken<Map<String, String>>() {
            }.getType());
            if(rawSkinsMap != null && !rawSkinsMap.isEmpty()){
                if(side.isClient()){
                    rawSkinsMap.forEach((key, value) -> {
                        ResourceLocation resourceLocation;
                        if(FilenameUtils.isExtension(value, "png")){ // load as external file
                            resourceLocation = loadFileTexture(new File(file.getParentFile(), value));
                        } else{ // load as internal resource location
                            resourceLocation = new ResourceLocation(value);
                        }
                        wrapper.addSkin(key, resourceLocation);
                    });
                }
            }
        }
        
        registerWrapper(side, wrapper);
    }
    
    // CLIENT ONLY!
    @SideOnly(Side.CLIENT)
    private static ResourceLocation loadFileTexture(File file){
        if(traincraftResourceLoader == null){
            try{
                Field field = FMLClientHandler.class.getDeclaredField("resourcePackList");
                field.setAccessible(true);
                Object o = field.get(FMLClientHandler.instance());
                if(o instanceof List){
                    ((List) o).add(traincraftResourceLoader = new TCRL());
                }
            } catch(NoSuchFieldException | IllegalAccessException e){
                e.printStackTrace();
            }
        }
        
        if(traincraftResourceLoader != null){
            if(file.exists()){
                ResourceLocation loc = new ResourceLocation("tcaddon", FilenameUtils.removeExtension(file.getName()));
                traincraftResourceLoader.registerTexture(loc, file);
                return loc;
            } else{
                Traincraft.LOGGER.error("Addon texture: '" + file.getAbsolutePath() + "' does not exist!");
            }
        }
        return TextureMap.LOCATION_MISSING_TEXTURE;
    }
    
    @SideOnly(Side.CLIENT)
    private static class TCRL implements IResourcePack {
        
        private final Map<ResourceLocation, File> fileResources = new HashMap<>();
        
        @Override
        public InputStream getInputStream(ResourceLocation location) throws IOException{
            if(this.resourceExists(location)){
                File file = this.fileResources.get(location);
                return new FileInputStream(file);
            }
            return null;
        }
        
        @Override
        public boolean resourceExists(ResourceLocation location){
            return this.fileResources.containsKey(location);
        }
        
        @Override
        public Set<String> getResourceDomains(){
            return Sets.newHashSet("tcaddon");
        }
        
        @Nullable
        @Override
        public <T extends IMetadataSection> T getPackMetadata(MetadataSerializer metadataSerializer, String metadataSectionName) throws IOException{
            return null;
        }
        
        @Override
        public BufferedImage getPackImage() throws IOException{
            return null;
        }
        
        @Override
        public String getPackName(){
            return "TraincraftAddonResources";
        }
        
        public void registerTexture(ResourceLocation location, File file){
            this.fileResources.put(location, file);
        }
    }
    
}
