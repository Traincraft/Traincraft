package traincraft.api;

import com.google.common.collect.Sets;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.client.resources.data.MetadataSerializer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import traincraft.Traincraft;

import javax.annotation.Nullable;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class TraincraftAddonLoader {
    
    private static final Gson GSON = new Gson();
    private static final JsonParser JSON_PARSER = new JsonParser();
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
    
    public static void loadInternals(Side side, String modId, File rootDirectory) {
    
        try{
            URI uri = TraincraftAddonLoader.class.getResource("/assets").toURI();
            Path myPath;
            if (uri.getScheme().equals("jar")) {
                FileSystem fileSystem = FileSystems.newFileSystem(uri, Collections.emptyMap());
                myPath = fileSystem.getPath("/assets");
            } else {
                myPath = Paths.get(uri);
            }
            Stream<Path> walk = Files.walk(myPath, 10);
            for (Iterator<Path> it = walk.iterator(); it.hasNext();){
                System.out.println(it.next());
            }
            FMLCommonHandler.instance().exitJava(0, false);
        }catch(URISyntaxException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        
        /*
        CodeSource codeSource = TraincraftAddonLoader.class.getProtectionDomain().getCodeSource();
        List<String> files = new ArrayList<>();
        if(codeSource != null){
            try{
                URL jarFile = codeSource.getLocation();
                ZipInputStream zip = new ZipInputStream(jarFile.openStream());
                ZipEntry ze;
    
                while((ze = zip.getNextEntry()) != null){
                    String entryName = ze.getName();
                    if(entryName.startsWith("assets/" + modId + "/rolling_stock/") && entryName.endsWith(".json")){
                        files.add(entryName);
                    }
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        
        if(!files.isEmpty()){
            for(String path : files){
                InputStream is = TraincraftAddonLoader.class.getResourceAsStream(path);
                if(is != null){
                    JsonElement jsonElement = JSON_PARSER.parse(new InputStreamReader(is));
                    if(jsonElement.isJsonObject()){
                        loadTrainJson(side, rootDirectory, jsonElement.getAsJsonObject());
                    }
                } else {
                    Traincraft.LOGGER.error("Addon path '" + path + "' could not be read!");
                }
            }
        }*/
    }
    
    private static void loadTrainJson(Side side, File file, JsonObject root){
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
                    loadRollingStock(side, file, root, new WrapperRollingStock());
                    break;
                }
            }
        } else {
            loadRollingStock(side, file, root, new WrapperRollingStock());
        }
    }
    
    private static void loadRollingStock(Side side, File file, JsonObject root, WrapperRollingStock wrapper){
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
        if(root.has("size")){
            if(root.get("size").isJsonArray()){ // array with 3 double as x, y, z
                JsonArray sizeArray = root.get("size").getAsJsonArray();
                if(sizeArray.size() == 3){
                    wrapper.setSize(new Vec3d(sizeArray.get(0).getAsDouble(), sizeArray.get(1).getAsDouble(), sizeArray.get(2).getAsDouble()));
                }
            } else { // single value for all three values
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
            Map<String, String> rawSkinsMap = GSON.fromJson(root.get("skins"), new TypeToken<Map<String, String>>(){}.getType());
            if(rawSkinsMap != null && !rawSkinsMap.isEmpty()){
                if(side.isClient()){
                    rawSkinsMap.forEach((key, value) -> {
                        ResourceLocation resourceLocation;
                        if(FilenameUtils.isExtension(value, "png")){ // load as external file
                            resourceLocation = loadFileTexture(new File(file.getParentFile(), value));
                        } else { // load as internal resource location
                            resourceLocation = new ResourceLocation(value);
                        }
                        wrapper.addSkin(key, resourceLocation);
                    });
                }
            }
        }
    
        System.out.println(wrapper);
        
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
            }catch(NoSuchFieldException | IllegalAccessException e){
                e.printStackTrace();
            }
        }
        
        if(traincraftResourceLoader != null){
            if(file.exists()){
                ResourceLocation loc = new ResourceLocation("tcaddon", FilenameUtils.removeExtension(file.getName()));
                traincraftResourceLoader.registerTexture(loc, file);
                return loc;
            } else {
                Traincraft.LOGGER.error("Addon texture: '" + file.getAbsolutePath() + "' does not exist!");
            }
        }
        return TextureMap.LOCATION_MISSING_TEXTURE;
    }
    
    @SideOnly(Side.CLIENT)
    private static class TCRL implements IResourcePack{
    
        private final Map<ResourceLocation, File> fileResources = new HashMap<>();
        
        public void registerTexture(ResourceLocation location, File file){
            this.fileResources.put(location, file);
        }
        
        @Override
        public InputStream getInputStream(ResourceLocation location) throws IOException {
            if(this.resourceExists(location)){
                File file = this.fileResources.get(location);
                return new FileInputStream(file);
            }
            return null;
        }
    
        @Override
        public boolean resourceExists(ResourceLocation location) {
            return this.fileResources.containsKey(location);
        }
    
        @Override
        public Set<String> getResourceDomains() {
            return Sets.newHashSet("tcaddon");
        }
    
        @Nullable
        @Override
        public <T extends IMetadataSection> T getPackMetadata(MetadataSerializer metadataSerializer, String metadataSectionName) throws IOException {
            return null;
        }
    
        @Override
        public BufferedImage getPackImage() throws IOException {
            return null;
        }
    
        @Override
        public String getPackName() {
            return "TraincraftAddonResources";
        }
    }
    
}
