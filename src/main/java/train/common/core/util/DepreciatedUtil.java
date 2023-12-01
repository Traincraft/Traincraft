package train.common.core.util;

public class DepreciatedUtil {
    public static String getColorAsString(int i) {
        switch (i) {
            case 0:
                return "Black";
            case 1:
                return "Red";
            case 2:
                return "Green";
            case 3:
                return "Brown";
            case 4:
                return "Blue";
            case 5:
                return "Purple";
            case 6:
                return "Cyan";
            case 7:
                return "LightGrey";
            case 8:
                return "Grey";
            case 13:
                return "Magenta";
            case 10:
                return "Lime";
            case 11:
                return "Yellow";
            case 12:
                return "LightBlue";
            case 9:
                return "Pink";
            case 14:
                return "Orange";
            case 15:
                return "White";
            case 16:
                return "Skin16";
            case 17:
                return "Skin17";
            case 18:
                return "Skin18";
            case 19:
                return "Skin19";
            case 20:
                return "Skin20";
            case 21:
                return "Skin21";
            case 22:
                return "Skin22";
            case 23:
                return "Skin23";
            case 24:
                return "Skin24";
            case 25:
                return "Skin25";
            case 26:
                return "Skin26";
            case 27:
                return "Skin27";
            case 28:
                return "Skin28";
            case 29:
                return "Skin29";
            case 30:
                return "Skin30";
            case 100:
                return "Empty";
            case 101:
                return "Full";
            default:
                return "" + i;
        }
    }

    public static int getColorFromString(String color) {
        if (color.equals("Black")) return 0;
        if (color.equals("Red")) return 1;
        if (color.equals("Green")) return 2;
        if (color.equals("Brown")) return 3;
        if (color.equals("Blue")) return 4;
        if (color.equals("Purple")) return 5;
        if (color.equals("Cyan")) return 6;
        if (color.equals("LightGrey")) return 7;
        if (color.equals("Grey")) return 8;
        if (color.equals("Magenta")) return 13;
        if (color.equals("Lime")) return 10;
        if (color.equals("Yellow")) return 11;
        if (color.equals("LightBlue")) return 12;
        if (color.equals("Pink")) return 9;
        if (color.equals("Orange")) return 14;
        if (color.equals("White")) return 15;
        if (color.equals("Skin16")) return 16;
        if (color.equals("Skin17")) return 17;
        if (color.equals("Skin18")) return 18;
        if (color.equals("Skin19")) return 19;
        if (color.equals("Skin20")) return 20;
        if (color.equals("Skin21")) return 21;
        if (color.equals("Skin22")) return 22;
        if (color.equals("Skin23")) return 23;
        if (color.equals("Skin24")) return 24;
        if (color.equals("Skin25")) return 25;
        if (color.equals("Empty")) return 100;
        if (color.equals("Full")) return 101;
        return -1;
    }
}
