package train.common.core.util;

import net.minecraft.block.BlockRailBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import train.common.api.EntityRollingStock;
import train.common.api.Locomotive;


public class TraincraftUtil {

    public static boolean dev = false;

    public static void println(Object... o) {
        if (dev) {
            System.out.println("------------------Traincraft Debug Begin------------------");
            System.out.println(Thread.currentThread().getStackTrace()[2]);//print what function just called this
            for (Object obj : o) {
                System.out.println(obj);
            }
            System.out.println("------------------Traincraft Debug End--------------------");
        }
    }

    public static Item getItemFromName(String name) {
        if (Item.itemRegistry.containsKey(name)) {
            return (Item) Item.itemRegistry.getObject(name);
        } else {
            return null;
        }
    }

    public static ItemStack getItemFromUnlocalizedName(String itemName, int meta) {
        Item item = getItemFromName(itemName);
        if (item != null) {
            return new ItemStack(item, 1, meta);
        }
        return null;
    }

    public static int getByteFromColor(String c) {
        switch (c) {
            case "Black":
                return 0;
            case "Red":
                return 1;
            case "Green":
                return 2;
            case "Brown":
                return 3;
            case "Blue":
                return 4;
            case "Purple":
                return 5;
            case "Cyan":
                return 6;
            case "LightGrey":
                return 7;
            case "Grey":
                return 8;
            case "Magenta":
                return 13;
            case "Lime":
                return 10;
            case "Yellow":
                return 11;
            case "LightBlue":
                return 12;
            case "Pink":
                return 9;
            case "Orange":
                return 14;
            case "White":
                return 15;
            case "Skin16":
                return 16;
            case "Skin17":
                return 17;
            case "Skin18":
                return 18;
            case "Skin19":
                return 19;
            case "Skin20":
                return 20;
            case "Skin21":
                return 21;
            case "Skin22":
                return 22;
            case "Skin23":
                return 23;
            case "Skin24":
                return 24;
            case "Skin25":
                return 25;
            case "Skin26":
                return 26;
            case "Skin27":
                return 27;
            case "Skin28":
                return 28;
            case "Skin29":
                return 29;
            case "Skin30":
                return 30;
            case "Full":
                return 101;
            case "Empty":
                return 100;
        }
        return 0;
    }

    public static int[] getBytesFromColors(String[] c) {
        int[] ret = new int[c.length];
        for (int i = 0; i < c.length; i++) {
            ret[i] = getByteFromColor(c[i]);
        }
        return ret;
    }

    public static boolean itemStackMatches(ItemStack item1, ItemStack item2) {
        return (item1.getItem() == item2.getItem()) &&
                (item1.getItemDamage() == item2.getItemDamage()
                        || item1.getItemDamage() == OreDictionary.WILDCARD_VALUE
                        || item2.getItemDamage() == OreDictionary.WILDCARD_VALUE);
    }

    public static boolean isRailBlockAt(World world, int x, int y, int z) {
        return world.getBlock(x, y, z) instanceof BlockRailBase;
    }

    public static final double degrees = (180d / Math.PI);
    public static final double radian = (Math.PI / 180.0D);

    public static void updateRider(EntityRollingStock transport, double distance, double yOffset) {
        if (transport.riddenByEntity == null) {
            return;
        }
        double pitchRads = transport.anglePitchClient * radian;
        double rotationCos1 = Math.cos(Math.toRadians(transport.renderYaw + ((transport instanceof Locomotive) ? 90 : 180)));
        double rotationSin1 = Math.sin(Math.toRadians(transport.renderYaw + ((transport instanceof Locomotive) ? 90 : 180)));
        if (transport.side.isServer()) {
            rotationCos1 = Math.cos(Math.toRadians(transport.serverRealRotation + 90));
            rotationSin1 = Math.sin(Math.toRadians((transport.serverRealRotation + 90)));
            transport.anglePitchClient = transport.serverRealPitch * 60;
        }
        float pitch = (float) (transport.posY + ((Math.tan(pitchRads) * distance) + transport.getMountedYOffset())
                + transport.riddenByEntity.getYOffset() + yOffset);

        double bogieX1 = (transport.posX + (rotationCos1 * distance));
        double bogieZ1 = (transport.posZ + (rotationSin1 * distance));
        //System.out.println(rotationCos1+" "+rotationSin1);
        if (transport.anglePitchClient > 20 && rotationCos1 == 1) {
            bogieX1 -= pitchRads * 2;
            pitch -= (float) (pitchRads * 1.2);
        }
        if (transport.anglePitchClient > 20 && rotationSin1 == 1) {
            bogieZ1 -= pitchRads * 2;
            pitch -= (float) (pitchRads * 1.2);
        }
        if (pitchRads == 0.0) {
            transport.riddenByEntity.setPosition(bogieX1, (transport.posY + transport.getMountedYOffset() + transport.riddenByEntity.getYOffset() + yOffset), bogieZ1);
        }
        if (pitchRads > -1.01 && pitchRads < 1.01) {
            transport.riddenByEntity.setPosition(bogieX1, pitch, bogieZ1);
        }
    }

    public static float atan2f(double x, double z) {
        float pi = -3.141592653f;
        float multiplier = 1.0f;

        if (z < 0.0d) {
            if (x < 0.0d) {
                z = -z;
                x = -x;
            } else {
                z = -z;
                multiplier = -1.0f;
            }

        } else {
            if (x < 0.0d) {
                x = -x;
                multiplier = -1.0f;
            }

            pi = 0.0f;
        }

        double invDiv = 1.0D / ((Math.max(z, x)) * (1.0D / (ATAN2_SQRT - 1)));
        return (atan2[(int) (x * invDiv) * ATAN2_SQRT + (int) (z * invDiv)] + pi) * multiplier;
    }

    public static float atan2degreesf(double x, double y) {
        return atan2f(x, y) * degreesF;
    }

    private static final int ATAN2_SQRT = (int) Math.sqrt(1024);
    private static final float[] atan2 = new float[1024];

    static {
        for (int i = 0; i < ATAN2_SQRT; i++) {
            for (int j = 0; j < ATAN2_SQRT; j++) {
                atan2[j * ATAN2_SQRT + i] = (float) Math.atan2((float) j / ATAN2_SQRT, (float) i / ATAN2_SQRT);
            }
        }
    }

    public static final float degreesF = (float) (180.0d / Math.PI);

    public static Vec3 func_514_g(double d, double d1, double d2) {
        return Vec3.createVectorHelper(MathHelper.floor_double(d), MathHelper.floor_double(d1), MathHelper.floor_double(d2));
    }
}
