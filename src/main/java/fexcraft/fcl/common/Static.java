package fexcraft.fcl.common;

import java.io.InputStream;
import java.util.Random;

/**
 * @author Ferdinand Calo' (FEX___96)
 *
 * General Class with (mostly) Static content.
 */
public class Static {
	
	public static boolean mclib = false;
	public static boolean devmode = false;
	public static boolean server = false;
	
	public static final float MODELSCALE = 0.0625F;
	public static final float PI = 3.14159265358979323846f;
	
	public static final float sixteenth = 0.0625F;
	public static final float eighth = 0.125F;
	public static final float quarter = 0.250F;
	public static final float half = 0.5F;

	// Radians > Degrees
	public static final float rad180 = 3.14159f;
	public static final float rad160 = 2.79253f;
	public static final float rad120 = 2.0944f;
	public static final float rad90 = 1.5708f;
	public static final float rad60 = 1.0472f;
	public static final float rad45 = 0.785398f;
	public static final float rad30 = 0.523599f;
	public static final float rad20 = 0.349066f;
	public static final float rad12 = 0.20944f;
	public static final float rad10 = 0.174533f;
	public static final float rad6 = 0.10472f;
	public static final float rad5 = 0.0872665f;
	public static final float rad1 = 0.0174533f;
	
	public static final String NULL_UUID_STRING = "00000000-0000-0000-0000-000000000000";
	public static final String DEF1_UUID_STRING = "11111111-1111-1111-1111-111111111111";
	public static final Random random = new Random();
	
	public static final String zero(long am){
		StringBuffer buff = new StringBuffer();
		for(long l = 0; l < am; l++) buff.append("0");
		return buff.toString();
	}
	
	public static final boolean setAsMcLib(boolean bool){ return mclib = bool; }
	
	public static final boolean setDevmode(boolean bool){ return devmode = bool; }
	
	public static final boolean setIsServer(boolean bool){ return server = bool; }
	
	public static final void halt(){ halt(1); }
	
	public static void halt(int errid){
		if(mclib){
			Static.halt(errid);
		}
		System.exit(errid);
	}
	
	public static final void stop(){ if(devmode) halt(1); return; }
	
	public static final boolean dev(){ return devmode; }
	
	public static boolean isServer(){
		if(mclib){
			Static.isServer();
		}
		return server;
	}
	
	public static boolean isClient(){
		if(mclib){
			Static.isClient();
		}
		return !server;
	}

	public static InputStream getResource(String str){
		if(mclib){
			Static.getResource(str);
		}
		return Static.class.getClassLoader().getResourceAsStream(str);
	}

	public static float toDegrees(float rad){
		return (float)Math.toDegrees(rad);
	}

	public static float toRadians(float deg){
		return (float)Math.toRadians(deg);
	}
	
}