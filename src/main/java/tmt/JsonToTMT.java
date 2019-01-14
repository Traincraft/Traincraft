package tmt;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


/**
* Tool to parse `ModelRendererTurbo` objects from JSON.
* @Author Ferdinand Calo' (FEX___96)
*/
public class JsonToTMT {
	
	//def
	public static final float def = 0f;
	public static final int idef = 0;
	//common
	public static final String[] format  = new String[]{"format", "form", "f"};//1.1f
	public static final String[] width  = new String[]{"width",  "wid", "w"};
	public static final String[] height = new String[]{"height", "hgt", "h"};
	public static final String[] depth  = new String[]{"depth",  "dep", "d"};
	public static final String[] offx = new String[]{"offset_x", "off_x", "offx", "ox"};
	public static final String[] offy = new String[]{"offset_y", "off_y", "offy", "oy"};
	public static final String[] offz = new String[]{"offset_z", "off_z", "offz", "oz"};
	public static final String[] expansion = new String[]{"expansion", "exp", "e"};
	public static final String[] scale = new String[]{"scale", "s"};
	public static final String[] texturex = new String[]{"texture_x", "texturex", "tex_x", "tx"};
	public static final String[] texturey = new String[]{"texture_y", "texturey", "tex_y", "ty"};
	//
	public static final String[] posx = new String[]{"rotation_point_x", "pos_x", "posx", "px", "x"};
	public static final String[] posy = new String[]{"rotation_point_y", "pos_y", "posy", "py", "y"};
	public static final String[] posz = new String[]{"rotation_point_z", "pos_z", "posz", "pz", "z"};
	public static final String[] rotx = new String[]{"rotation_angle_x", "rotangle_x", "rotanglex", "rot_x", "rx"};
	public static final String[] roty = new String[]{"rotation_angle_y", "rotangle_y", "rotangley", "rot_y", "ry"};
	public static final String[] rotz = new String[]{"rotation_angle_z", "rotangle_z", "rotanglez", "rot_z", "rz"};
	//settings
	public static final String[] oldrot = new String[]{"old_ration", "old_rotation_order", "oro"};
	public static final String[] mirror = new String[]{"mirror", "mir", "m"};
	public static final String[] flip = new String[]{"flip", "fl", "usd"};
	//cyl
	public static final String[] radius = new String[]{"radius", "rad", "r"};
	public static final String[] length = new String[]{"length", "len", "l"};
	public static final String[] segments = new String[]{"segments", "seg", "sg"};
	public static final String[] basescale = new String[]{"base_scale", "basescale", "bs"};
	public static final String[] topscale = new String[]{"top_scale", "topscale", "ts"};
	public static final String[] direction = new String[]{"direction", "dir", "facing"};


	public final static ModelRendererTurbo parse(net.minecraft.client.model.ModelBase base, JsonObject obj, int tx, int ty){
		ModelRendererTurbo model = new ModelRendererTurbo(base, get(texturex, obj, idef), get(texturey, obj, idef), tx, ty);
		//
		float x = get(offx, obj, def);
		float y = get(offy, obj, def);
		float z = get(offz, obj, def);
		int w = get(width, obj, idef);
		int h = get(height, obj, idef);
		int d = get(depth, obj, idef);
		//Eternal edit: changed the switch to if statements because java6 cant switch on a string.
		String s = obj.get("type").getAsString();
		if (s.equals("box") || s.equals("cube") || s.equals("s")){
			model.addBox(x, y, z, w, h, d, get(expansion, obj, def));
		} else if (s.equals("shapebox") || s.equals("sbox") || s.equals("sb")){
			model.addShapeBox(x, y, z, w, h, d, get(scale, obj, def),
					get("x0", obj, def), get("y0", obj, def), get("z0", obj, def),
					get("x1", obj, def), get("y1", obj, def), get("z1", obj, def),
					get("x2", obj, def), get("y2", obj, def), get("z2", obj, def),
					get("x3", obj, def), get("y3", obj, def), get("z3", obj, def),
					get("x4", obj, def), get("y4", obj, def), get("z4", obj, def),
					get("x5", obj, def), get("y5", obj, def), get("z5", obj, def),
					get("x6", obj, def), get("y6", obj, def), get("z6", obj, def),
					get("x7", obj, def), get("y7", obj, def), get("z7", obj, def)
			);
		} else if (s.equals("cylinder") || s.equals("c")){
			model.addCylinder(x, y, z, get(radius, obj, 1f), get(length, obj, 1f), get(segments, obj, 16), get(basescale, obj, 1f), get(topscale, obj, 1f), get(direction, obj, 4));
		} else if (s.equals("cone") || s.equals("cn")){
			model.addCone(x, y, z, get(radius, obj, 1f), get(length, obj, 1f), get(segments, obj, 12), get(basescale, obj, 1f), get(direction, obj, 4));
		}
		/* import unavailable: net.fexcraft.mod.lib.util.json.JsonUtil;
		model.rotorder = JsonUtil.getIfExists(obj, oldrot, model.rotorder);
		model.mirror = JsonUtil.getIfExists(obj, mirror, false);
		model.flip = JsonUtil.getIfExists(obj, flip, false);
		*/
		model.rotateAngleX = get(rotx, obj, def);
		model.rotateAngleY = get(roty, obj, def);
		model.rotateAngleZ = get(rotz, obj, def);
		//
		model.setRotationPoint(get(posx, obj, def), get(posy, obj, def), get(posz, obj, def));
		return model;
	}

	public final static ModelRendererTurbo[] parse(net.minecraft.client.model.ModelBase base, JsonArray array, int tx, int ty){
		if(array != null){
			ModelRendererTurbo[] model = new ModelRendererTurbo[array.size()];
			for(int i = 0; i < array.size(); i++){
				model[i] = parse(base, array.get(i).getAsJsonObject(), tx, ty);
			}
			return model;
		}
		return new ModelRendererTurbo[0];
	}

	public final static ModelRendererTurbo[] parse(net.minecraft.client.model.ModelBase base, String string, JsonObject object, int tx, int ty){
		if(base == null){
			/*unavailable import, could be easily replaced with generic debugger later on
			if(Static.dev()){
				Static.halt();
			}
			else{
				Print.log("Provided Modelbase is NULL, expect errors!", object);
			}*/
		}
		if(object.has(string) && object.get(string).isJsonArray()){
			return parse(base, object.get(string).getAsJsonArray(), tx, ty);
		}
		return new ModelRendererTurbo[0];
	}
	
	public static final float get(String s, JsonObject obj, float def){
		if(obj.has(s)){
			return obj.get(s).getAsFloat();
		}
		return def;
	}
	
	public static final float get(String[] s, JsonObject obj, float def){
		for(String str : s){
			if(obj.has(str)){
				return obj.get(str).getAsFloat();
			}
		}
		return 0;
	}
	
	public static final int get(String[] s, JsonObject obj, int def){
		for(String str : s){
			if(obj.has(str)){
				return obj.get(str).getAsInt();
			}
		}
		return 0;
	}
	
}