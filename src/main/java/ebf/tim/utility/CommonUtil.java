package ebf.tim.utility;


import fexcraft.tmt.slim.Vec3d;
import fexcraft.tmt.slim.Vec3f;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import train.common.Traincraft;
import train.common.api.AbstractTrains;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * <h1>utilities</h1>
 * used for misc utility functions
 *
 * @author Eternal Blue Flame
 * @author Zora No Densha
 */
public class CommonUtil {
    /**converts a degrees float to radians*/
    public static final float radianF = (float) Math.PI / 180.0f;
    /**converts a radians double to degrees*/
    public static final double degreesD = 180.0d / Math.PI;
    public static final float degreesF = (float) (180.0d / Math.PI);
    private static List<String> loggedLangChecks = new ArrayList<>();



    /**redirect shorthand that typecasts doubles to ints
     * @see #isRailBlockAt(World, int, int, int) */
    public static boolean isRailBlockAt(World world, double x, double y, double z) {
        return isRailBlockAt(world,floorDouble(x), floorDouble(y),floorDouble(z));
    }

    public static Block getBlockAt(World world, double x, double y, double z){
        return world.getBlock(floorDouble(x), floorDouble(y),floorDouble(z));
    }

    public static Block getBlockAt(World world, int x, int y, int z){
        return world.getBlock(x,y,z);
    }

    public static boolean setBlock(World w, int x, int y, int z, Block b){
        return w.setBlock(x,y,z,b);
    }

    public static void setBlockMeta(World w, int x, int y, int z, int meta){
        w.setBlockMetadataWithNotify(x,y,z,meta,2);
        w.markBlockRangeForRenderUpdate(x, y, z, x, y, z);
        w.notifyBlocksOfNeighborChange(x, y, z, getBlockAt(w,x,y,z));
        w.scheduleBlockUpdate(x, y, z, getBlockAt(w,x,y,z), getBlockAt(w,x,y,z).tickRate(w));

        w.func_147453_f(x, y, z, getBlockAt(w,x,y,z));
    }

    public static void markBlockForUpdate(World w, int x, int y, int z){
        w.markBlockForUpdate(x,y,z);
    }

    public static int getBlockFacing(IBlockAccess w, int x, int y, int z){
        return w.getBlockMetadata(x,y,z);
    }

    public static int getRailMeta(IBlockAccess w, EntityMinecart cart, int x, int y, int z){
        return ((BlockRailBase)w.getBlock(x,y,z)).getBasicRailMetadata(w,cart,x,y,z);
    }

    public static boolean setBlock(World w, int x, int y, int z, Block b, int meta){
        boolean set =setBlock(w,x,y,z,b);
        if(set) {
            setBlockMeta(w, x, y, z, meta);
        }
        return set;
    }

    public static float getMaxRailSpeed(World world, BlockRailBase rail, AbstractTrains host, double x, double y, double z){
        return (rail.getRailMaxSpeed(world, host, floorDouble(x), floorDouble(y),floorDouble(z)));
    }

    public static int floorDouble(double value){
        return value < (int)value ? ((int)value) - 1 : (int)value;
    }

    /**
     * <h2>Vanilla Track  detection Overrrides</h2>
     * a modified version of vanilla track detection so that way it's more efficient and can support rails from other mods.
     */
    public static boolean isRailBlockAt(World world, int x, int y, int z) {
        //todo ZnD support, either by jar reference or API update
        return (/*world.getTileEntity(x, y, z) instanceof ITrackBase ||*/ world.getBlock(x, y, z) instanceof BlockRailBase);
    }

    /**
     * sound type does nothing for 1.7.10,
     * in later versions it's used to identify what made the sound, like if it's for an entity or a block.
     */
    public static void playSound(World world, double xCoord, double yCoord, double zCoord, String file, float volume, float pitch, int soundType){
        world.playSound(xCoord,yCoord,zCoord, file, volume,pitch,false);
    }

    public static void playSound(TileEntity tile, String file, float volume, float pitch){
        tile.getWorldObj().playSound(tile.xCoord,tile.yCoord,tile.zCoord, file, volume,pitch,false);
    }

    public static void playSound(Entity entity, String file, float volume, float pitch){
        entity.worldObj.playSoundAtEntity(entity, file, volume, pitch);
    }

    public static boolean stringContains(String s1, String... s2){
        for(String s3 : s2) {
            if (stringContains(s1,s3)){
                return true;
            }
        }
        return false;
    }

    public static boolean stringContains(String s1, String s2){
        if (s1 == null || s2 == null) {
            return false;
        }
        return s1.contains(s2);
    }

    public static int parseInt(String str, Class host) throws NumberFormatException{
        if (str == null || str.length()==0) {
            return 0;
        }

        int result = 0;
        boolean negative = false;
        for (char c : str.toCharArray()) {
            switch (c){
                case '-':{negative=true;break;}
                case '0':{result = (result * 10);break;}
                case '1':{result = (result * 10)+1;break;}
                case '2':{result = (result * 10)+2;break;}
                case '3':{result = (result * 10)+3;break;}
                case '4':{result = (result * 10)+4;break;}
                case '5':{result = (result * 10)+5;break;}
                case '6':{result = (result * 10)+6;break;}
                case '7':{result = (result * 10)+7;break;}
                case '8':{result = (result * 10)+8;break;}
                case '9':{result = (result * 10)+9;break;}
                case ' ':{break;}
                default:{throw new NumberFormatException("the string: \"" + str + "\" was not a number, please check " + host.getName());}
            }
        }
        return negative?-result:result;
    }

    public static String translate(String text){
        if(Traincraft.proxy.isClient()){
            return ClientUtil.translate(text);
        }
        return text;
    }

    public static String[]multiTranslate(String[] s){
        if(s==null){return null;}
        String[] ret = new String[s.length];
        for (int i=0; i<s.length;i++){
            ret[i]=translate(s[i]);
        }
        return ret;
    }

    public static String compressString(String str){
        try {
            ByteArrayOutputStream obj = new ByteArrayOutputStream();
            GZIPOutputStream gzip = new GZIPOutputStream(obj);
            gzip.write(str.getBytes(StandardCharsets.UTF_8));
            IOUtils.closeQuietly(gzip);
            return Base64.encodeBase64String(obj.toByteArray());
        } catch (IOException e){return "";}
    }

    public static String decompressString(String str){
        try {
            GZIPInputStream gis = new GZIPInputStream(new ByteArrayInputStream(Base64.decodeBase64(str)));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gis, StandardCharsets.UTF_8));
            StringBuilder outStr = new StringBuilder();

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                outStr.append(line);
            }
            return outStr.toString();
        } catch (Exception e){return "";}
    }


    /**
     *
     * @param path should be relative to `/scr/main/`? needs further testing
     * @return a list of file names in the provided path
     */
    public static List<String> listFolders(String path){
        InputStream stream = loadStream(path);
        if(stream==null){
            DebugUtil.println("failed to load folder", path);
            return new ArrayList<>();
        }
        //create a buffered reader for the directory
        InputStreamReader reader = new InputStreamReader(stream, StandardCharsets.UTF_8);
        BufferedReader buffer = new BufferedReader(reader);

        //build the list of files
        List<String> lines = new ArrayList<>();
        String line="";
        while(line !=null){
            try {
                line = buffer.readLine();
                if(line!=null) {
                    lines.add(path + "/" + line);
                }
            } catch (IOException ignored) {}
        }
        //close the streams to cleanup
        try {
            buffer.close();
            reader.close();
            stream.close();
        } catch (IOException ignored) {}

        return lines;
    }

    //in some scenarios the file structure seems to change based on whether or not the jar is compiled
    public static InputStream loadStream(String file){
        //todo: results may differ with `ClassLoader.getSystemClassLoader().getResourceAsStream` worth trying later
        String protocol = Traincraft.instance.getClass().getResource("").getProtocol();
        if(protocol.equals("jar")){
            return Traincraft.instance.getClass().getResourceAsStream("/assets/" + file);
        } else if(protocol.equals("file")) {
            return Traincraft.instance.getClass().getClassLoader().getResourceAsStream("assets/" + file);
        } else {
            System.out.println("Unknown way of running project -- not in IDE or jar form!");
            return null;
        }
//        if(DebugUtil.dev()) {  //is dev() reliable? what about deobf but packaged?
//            return TrainsInMotion.instance.getClass().getClassLoader().getResourceAsStream("assets/" + file);
//        } else {
//            return TrainsInMotion.instance.getClass().getResourceAsStream("/resources/" + file);
//        }
    }


    //returns file contents as string. returns null if the file does not exist
    public static String accessFile(String file) {
        InputStream stream = loadStream(file);

        //make a StringWriter and use apache commons to copy the contents of the input stream file
        StringWriter reader = new StringWriter();
        try {
            if(stream !=null) {
                IOUtils.copy(stream, reader);
                String str =reader.toString();
                //close the streams to cleanup
                try {
                    reader.close();
                    stream.close();
                } catch (IOException ignored) {}

                return str;
            } else {
                DebugUtil.println(file, " was null");
                return null;
            }
        } catch (IOException e) {
            DebugUtil.println(file, " was not found");
            return null;
        }

    }




    public static float calculatePitch(double yBack, double yFront, double distance){
            double yDiff = yFront - yBack;
            return (float) ((yDiff / distance) * -CommonUtil.degreesD);
    }

    /**
     * replacement for system atan2 function.
     * uses a lookup list of 1024 float entries (4kb roughly).
     * performance is measured at over 15 times more efficient.
     * @param x
     * @param z
     * @return angle in radians
     */
    public static float atan2f(double x, double z) {
        if (z < 0.0d) {
            if (x < 0.0d) {
                //0.03225806451 is (1.0D / (ATAN2_SQRT - 1))
                double invDiv = 1.0D / (((-z < -x) ? -x : -z) * 0.03225806451);
                return (atan2[(int)(-x * invDiv) * ATAN2_SQRT + (int)(-z * invDiv)] - 3.141592653f);
            } else {
                double invDiv = 1.0D / (((-z < x) ? x : -z) * 0.03225806451);
                return (atan2[(int)(x * invDiv) * ATAN2_SQRT + (int)(-z * invDiv)] - 3.141592653f)*-1;
            }
        } else {
            if (x < 0.0d) {
                double invDiv = 1.0D / (((z < -x) ? -x : z) * 0.03225806451);
                return (atan2[(int)(-x * invDiv) * ATAN2_SQRT + (int)(z * invDiv)]) * -1;
            }

            double invDiv = 1.0D / (((z < x) ? x : z) * 0.03225806451);
            return (atan2[(int)(x * invDiv) * ATAN2_SQRT + (int)(z * invDiv)]);
        }
    }

    public static float atan2degreesf(double x, double y){
        return atan2f(x,y)*57.295779514f;
    }

    private static final int ATAN2_SQRT = (int) Math.sqrt(1024);//32
    private static final float[] atan2 = new float[1024];
    static {
        for (int i = 0; i < ATAN2_SQRT; i++) {
            for (int j = 0; j < ATAN2_SQRT; j++) {
                atan2[j * ATAN2_SQRT + i] = (float) Math.atan2((float) j / ATAN2_SQRT, (float) i / ATAN2_SQRT);
            }
        }
    }


    public static float power(float base, float power){
        return (float)Math.pow(base,power);
    }

    public static double getDistanceWithDirection(double fromX, double fromZ, double toX, double toZ, float rotationYaw) {

        double lookX = MathHelper.cos(-rotationYaw * 0.017453292F - (float) Math.PI);
        double lookZ = -MathHelper.sin(-rotationYaw * 0.017453292F - (float) Math.PI);

        double vecX=fromX-toX;
        double vecZ=fromZ-toZ;

        double dotProduct = vecX * lookX + vecZ * lookZ;

        if (dotProduct < 0) {
            // Player 2 is behind Player 1
            return -Math.sqrt(dotProduct);
        } else {
            return Math.sqrt(dotProduct);
        }
    }

    /**
     * <h3>rotate vector</h3>
     * rotates a given vector based on pitch, yaw, and roll.
     * courtesy of Zora No Densha.
     * There are version for doubles and floats.
     */
    @Deprecated
    public static double[] rotatePoint(double[] f, float pitch, float yaw, float roll) {
        double cos;
        double sin;
        double[] xyz = new double[]{f[0],f[1],f[2]};
        //rotate pitch
        if (pitch != 0.0F) {
            pitch *= radianF;
            cos = Math.cos(pitch);
            sin = Math.sin(pitch);

            xyz[0] = (f[1] * sin) + (f[0] * cos);
            xyz[1] = (f[1] * cos) - (f[0] * sin);
        }
        //rotate yaw
        if (yaw != 0.0F) {
            yaw *= radianF;
            cos = MathHelper.cos(yaw);
            sin = MathHelper.sin(yaw);

            xyz[0] = (f[0] * cos) - (f[2] * sin);
            xyz[2] = (f[0] * sin) + (f[2] * cos);
        }
        //rotate roll
        if (roll != 0.0F) {
            roll *=  radianF;
            cos = MathHelper.cos(roll);
            sin = MathHelper.sin(roll);

            xyz[1] = (f[2] * cos) - (f[1] * sin);
            xyz[2] = (f[2] * sin) + (f[1] * cos);
        }

        return xyz;
    }

    public static double[] rotatePoint(double f, double pitch, double yaw) {
        double cos;
        double sin;
        double[] xyz = new double[]{f,0,0};
        //rotate pitch
        if (pitch != 0.0F) {
            pitch *= Math.PI / 180.0f;
            cos = Math.cos(pitch);
            sin = Math.sin(pitch);

            xyz[0] = (f * cos);
            xyz[1] = -(f * sin);
        }
        //rotate yaw
        if (yaw != 0.0F) {
            yaw *= Math.PI / 180.0f;
            cos = Math.cos(yaw);
            sin = Math.sin(yaw);

            xyz[0] = (f * cos);
            xyz[2] = (f * sin);
        }

        return xyz;
    }


    //private static float cos;
    //private static float sin;
    //private static float[] xyz = new float[]{0,0,0};
    public static float[] rotatePointF(float x, float y, float z, float pitch, float yaw, float roll) {
        float[] xyz = new float[]{x,y,z};
        float sin, cos;
        //rotate pitch
        if (pitch != 0.0F) {
            pitch *= radianF;
            cos = MathHelper.cos(pitch);
            sin = MathHelper.sin(pitch);

            xyz[0] = (y * sin) + (x * cos);
            xyz[1] = (y * cos) - (x * sin);
        }
        //rotate yaw
        if (yaw != 0.0F) {
            yaw *= radianF;
            cos = MathHelper.cos(yaw);
            sin = MathHelper.sin(yaw);

            xyz[0] = (x * cos) - (z * sin);
            xyz[2] = (x * sin) + (z * cos);
        }
        //rotate roll
        if (roll != 0.0F) {
            roll *=  radianF;
            cos = MathHelper.cos(roll);
            sin = MathHelper.sin(roll);

            xyz[1] = (z * cos) - (y * sin);
            xyz[2] = (z * sin) + (y * cos);
        }

        return xyz;
    }

    public static Vec3f rotatePoint(Vec3f f, float pitch, float yaw, float roll) {
        float cos;
        float sin;
        Vec3f xyz = new Vec3f(f.xCoord, f.yCoord, f.zCoord);
        //rotate pitch
        if (pitch != 0.0F) {
            pitch *= radianF;
            cos = MathHelper.cos(pitch);
            sin = MathHelper.sin(pitch);

            xyz.xCoord = (f.yCoord * sin) + (f.xCoord * cos);
            xyz.yCoord = (f.yCoord * cos) - (f.xCoord * sin);
        }
        //rotate yaw
        if (yaw != 0.0F) {
            yaw *= radianF;
            cos = MathHelper.cos(yaw);
            sin = MathHelper.sin(yaw);

            xyz.xCoord = (f.xCoord * cos) - (f.zCoord * sin);
            xyz.zCoord = (f.xCoord * sin) + (f.zCoord * cos);
        }
        //rotate roll
        if (roll != 0.0F) {
            roll *=  radianF;
            cos = MathHelper.cos(roll);
            sin = MathHelper.sin(roll);

            xyz.yCoord = (f.zCoord * cos) - (f.yCoord * sin);
            xyz.zCoord = (f.zCoord * sin) + (f.yCoord * cos);
        }

        return xyz;
    }

    @Deprecated //todo: a LOT of calls for this dont use pitch, for efficiency sake there should be a method that doesnt take it
    public static Vec3d rotateDistance(double distance, float pitch, float yaw) {
        Vec3d xyz = new Vec3d(distance, 0,0);
        //rotate pitch
        if (pitch != 0.0F) {
            pitch *= radianF;
            xyz.xCoord = distance * Math.cos(pitch);
            xyz.yCoord = distance * Math.sin(pitch);
        }
        //rotate yaw
        if (yaw != 0.0F) {
            yaw *= radianF;
            xyz.xCoord = (distance * MathHelper.cos(yaw));
            xyz.zCoord = (distance * MathHelper.sin(yaw));
        }
        return xyz;
    }

    public static void reverseArray(Object[] array) {
        if (array != null) {
            int i = 0;
            for(int j = array.length - 1; j > i; ++i) {
                Object tmp = array[j];
                array[j] = array[i];
                array[i] = tmp;
                --j;
            }
        }
    }

    public static float wrapAngleTo180(double input) {
        input %= 360.0d;

        if (input >= 180.0d) {
            input -= 360.0d;
        } else if (input < -180.0d) {
            input += 360.0d;
        }

        return (float)input;
    }


    /*
     *<h2> Ore Dictionary</h2>
     * we use HashMaps to collect ore directory data because even though it takes longer to collect the data, it's far more efficient to see if an entry exists than a list.
     * TODO: maybe have a post-init function to collect the ore directory data?
     */



    public static boolean oredictMatch(ItemStack input, String... ore){
        //collect the ore ID's for all relevant ores first
        List<Integer> ores = new ArrayList<>();
        for(String o : ore){
            ores.add(OreDictionary.getOreID(o));
        }
        //now itterate the integer inputs for all the oredict entries against all the
        for(int id : OreDictionary.getOreIDs(input)){
            for (Integer o : ores) {
                if (id == o) {
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean isLog(ItemStack i){
        return oredictMatch(i, "logWood", "woodRubber");
    }

    public static boolean isPlank(ItemStack i){
        return oredictMatch(i, "plankWood", "slabWood");
    }

    public static boolean isCoal(ItemStack i){
        return oredictMatch(i, "coal");
    }

    public static boolean isOre(ItemStack i){
        return oredictMatch(i, "ore");
    }


    /*<h1>shorthands for lazy bums</h1>*/

    public static ItemStack DefineStack (Item itm, int size){
        return new ItemStack(itm, size);
    }
    public static ItemStack DefineStack (Block itm, int size){
        return new ItemStack(Item.getItemFromBlock(itm), size);
    }
}
