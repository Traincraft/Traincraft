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
    
    public static final Gson GSON = new Gson();
    public static final JsonParser JSON_PARSER = new JsonParser();
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
    
    public static void loadInternals(Side side, String modId){
        String path = String.format("/assets/%s/rolling_stock", modId);
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
        } catch(URISyntaxException | IOException e){
            e.printStackTrace();
        }
    }
    
    // create entity and item
    private static void registerWrapper(Side side, IWrapperAddon<?> wrapper){
        ModContainer mc = FMLCommonHandler.instance().findContainerFor(Traincraft.INSTANCE);
        ResourceLocation resourceLocation = wrapper.getId();
        Class<? extends AbstractRollingStock> clazz = wrapper.createEntity(null).getClass();
        EntityRegistry.EntityRegistration er = EntityRegistry.instance().new EntityRegistration(
            mc,
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
                    WrapperSteamTrain wrapperSteamTrain = new WrapperSteamTrain();
                    wrapperSteamTrain.loadFromFile(side, file, root);
                    registerWrapper(side, wrapperSteamTrain);
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
                    WrapperRollingStock wrapperRollingStock = new WrapperRollingStock();
                    wrapperRollingStock.loadFromFile(side, file, root);
                    registerWrapper(side, wrapperRollingStock);
                    break;
                }
            }
        } else{
            WrapperRollingStock wrapperRollingStock = new WrapperRollingStock();
            wrapperRollingStock.loadFromFile(side, file, root);
            registerWrapper(side, wrapperRollingStock);
        }
    }
    
    // CLIENT ONLY!
    @SideOnly(Side.CLIENT)
    public static ResourceLocation loadFileTexture(File file){
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
