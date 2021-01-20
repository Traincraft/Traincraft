package ebf.tim.utility;


import ebf.tim.entities.GenericRailTransport;
import fexcraft.tmt.slim.Vec3d;
import fexcraft.tmt.slim.Vec3f;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedList;
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


    /**
     * <h2>Vanilla Track  detection Overrrides</h2>
     * a modified version of vanilla track detection so that way it's more efficient and can support rails from other mods.
     */
    public static boolean isRailBlockAt(World world, int x, int y, int z) {
        //todo ZnD support, either by jar reference or API update
        return (/*world.getTileEntity(x, y, z) instanceof ITrackBase ||*/ world.getBlock(x, y, z) instanceof BlockRailBase);
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
            throw new NumberFormatException("the string: \"" + str + "\" was not a number, please check " + host.getName());
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
            }
        }
        return negative?-result:result;
    }

    public static String translate(String text){
        if (StatCollector.translateToLocal(text).equals(text) && !loggedLangChecks.contains(text)){
            DebugUtil.println("Missing lang entry for: ",text,Thread.currentThread().getStackTrace()[2]);
            loggedLangChecks.add(text);
            return text;
        } else {
            return StatCollector.translateToLocal(text);
        }
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


    public static float calculatePitch(double yFront, double yBack, double distance){
            double yDiff = yFront - yBack;
            return (float) (Math.acos(yDiff / Math.sqrt(distance + yDiff * yDiff)) * CommonUtil.degreesD) - 90f;
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

    /**
     * <h2>rail placement from item</h2>
     * basic functionality to place a train or rollingstock on the rails on item use.
     */
    public static boolean placeOnRail(GenericRailTransport entity, EntityPlayer playerEntity, ItemStack stack, World worldObj, int posX, int posY, int posZ) {

        //be sure there is a rail at the location
        if (CommonUtil.isRailBlockAt(worldObj, posX,posY,posZ) && !worldObj.isRemote) {
            //define the direction
            int railMeta=((BlockRailBase)worldObj.getBlock(posX,posY,posZ)).getBasicRailMetadata(worldObj, null,posX,posY,posZ);
            int playerMeta=MathHelper.floor_double((playerEntity.rotationYaw / 90.0F) + 2.5D) & 3;

            if(railMeta==0){
                //this direction is a bit more complicated due to how the numbers line up when coming from the other side
                //also we have to %360 because some moron thought it a cool idea to have the character rotate from -360 to 360
                if(playerEntity.rotationYaw%360>90&&playerEntity.rotationYaw%360<270){
                    playerMeta=0;
                } else {
                    playerMeta=2;
                }
            } else if (railMeta==1){
                if(playerEntity.rotationYaw%360>180){
                    playerMeta=1;
                } else {
                    playerMeta=3;
                }
            }

            //check player direction
            if (playerMeta == 3) {
                //check if the transport can be placed in the area
                if (!CommonUtil.isRailBlockAt(worldObj, posX + MathHelper.floor_float(entity.rotationPoints()[0]+ 1.0F ), posY, posZ)
                        && !CommonUtil.isRailBlockAt(worldObj, posX + MathHelper.floor_float(entity.rotationPoints()[1] - 1.0F ), posY, posZ)) {
                    playerEntity.addChatMessage(new ChatComponentText("Place on a straight piece of track that is of sufficient length"));
                    return false;
                }
                entity.rotationYaw= 0;
                //spawn the entity
                worldObj.spawnEntityInWorld(entity);
                entity.entityFirstInit(stack);
                return true;

            }
            //same as above, but reverse direction.
            else if (playerMeta == 1) {

                if (!CommonUtil.isRailBlockAt(worldObj, posX - MathHelper.floor_double(entity.rotationPoints()[0]+ 1.0f ), posY, posZ)
                        && !CommonUtil.isRailBlockAt(worldObj, posX - MathHelper.floor_double(entity.rotationPoints()[1]- 1.0f ), posY, posZ)) {
                    playerEntity.addChatMessage(new ChatComponentText("Place on a straight piece of track that is of sufficient length"));
                    return false;
                }
                entity.rotationYaw= 180;

                worldObj.spawnEntityInWorld(entity);
                entity.entityFirstInit(stack);
                return true;
            }

            else if (playerMeta == 0) {

                if (!CommonUtil.isRailBlockAt(worldObj, posX, posY, posZ + MathHelper.floor_float(entity.rotationPoints()[0]+ 1.0f ))
                        && !CommonUtil.isRailBlockAt(worldObj, posX, posY, posZ + MathHelper.floor_float(entity.rotationPoints()[1]- 1.0f ))) {
                    playerEntity.addChatMessage(new ChatComponentText("Place on a straight piece of track that is of sufficient length"));
                    return false;
                }
                entity.rotationYaw= 90;

                worldObj.spawnEntityInWorld(entity);
                entity.entityFirstInit(stack);
                return true;
            }
            else if (playerMeta == 2) {

                if (!CommonUtil.isRailBlockAt(worldObj, posX, posY, posZ - MathHelper.floor_double(entity.rotationPoints()[0]+ 1.0f ))
                        && !CommonUtil.isRailBlockAt(worldObj, posX, posY, posZ - MathHelper.floor_double(entity.rotationPoints()[1]- 1.0f ))) {
                    playerEntity.addChatMessage(new ChatComponentText("Place on a straight piece of track that is of sufficient length"));
                    return false;
                }

                entity.rotationYaw= 270;
                worldObj.spawnEntityInWorld(entity);
                entity.entityFirstInit(stack);
                return true;
            }
        }


        return false;
    }


    /*
     *<h2> Ore Dictionary</h2>
     * we use HashMaps to collect ore directory data because even though it takes longer to collect the data, it's far more efficient to see if an entry exists than a list.
     * TODO: maybe have a post-init function to collect the ore directory data?
     */


    private static LinkedList<String> OREDICT_PLANK = null;
    private static LinkedList<String> OREDICT_LOG = null;
    private static LinkedList<String> OREDICT_COAL = null;

    public static boolean isLog(ItemStack i){
        if (OREDICT_LOG == null){
            OREDICT_LOG = new LinkedList<>();
            for (ItemStack item: OreDictionary.getOres("logWood")) {
                OREDICT_LOG.add(i.getUnlocalizedName());
            }
        }
        return OREDICT_LOG.contains(i.getUnlocalizedName());
    }

    public static boolean isPlank(ItemStack i){
        if (OREDICT_PLANK == null){
            OREDICT_PLANK = new LinkedList<>();
            for (ItemStack item: OreDictionary.getOres("plankWood")) {
                OREDICT_PLANK.add(i.getUnlocalizedName());
            }
            for (ItemStack item: OreDictionary.getOres("slabWood")) {
                OREDICT_PLANK.add(i.getUnlocalizedName());
            }
        }
        return OREDICT_PLANK.contains(i.getUnlocalizedName());
    }

    public static boolean isCoal(ItemStack i){
        if (OREDICT_COAL == null){
            OREDICT_COAL = new LinkedList<>();
            for (ItemStack item: OreDictionary.getOres("coal")) {
                OREDICT_COAL.add(i.getUnlocalizedName());
            }
        }
        return OREDICT_COAL.contains(i.getUnlocalizedName());
    }


    /*<h1>shorthands for lazy bums</h1>*/

    public static ItemStack DefineStack (Item itm, int size){
        return new ItemStack(itm, size);
    }
    public static ItemStack DefineStack (Block itm, int size){
        return new ItemStack(Item.getItemFromBlock(itm), size);
    }
}
