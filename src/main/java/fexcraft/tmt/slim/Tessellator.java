package fexcraft.tmt.slim;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.utility.DebugUtil;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

/**
* @Author EternalBlueFlame
* 
*/
@SideOnly(Side.CLIENT)
public class Tessellator{

	public static Tessellator INSTANCE = new Tessellator();

	private static Float x, y, z;
	//@Depreciated
	private static List<float[]> verticies = new ArrayList<>(); //0,1,2 are the position, 3,4,5,6 are the texture vectors.

	public static Tessellator getInstance(){
		return INSTANCE;
	}

	//use this to reset and define the drawing mode
	public void startDrawing(int mode){
		verticies=new ArrayList<>();
		GL11.glBegin(mode);
	}

	public void draw(){
		for(float[] f : verticies){
			if(f.length>3) {
				GL11.glTexCoord2f(f[3], f[4]);
			}
			GL11.glVertex3f(f[0],f[1],f[2]);
		}
		GL11.glEnd();
	}
	
	public void addVertex(float i, float j, float k){
		if(x!=null){
			verticies.add(new float[]{i + x, j + y, k + z});

		} else {
			verticies.add(new float[]{i, j, k});
		}
	}
	
	public void addVertexWithUV(float i, float j, float k, float u, float v){
		if(x!=null){
			verticies.add(new float[]{i + x, j + y, k + z, u, v});
		} else {
			verticies.add(new float[]{i, j, k, u, v});
		}
	}

	public void addVertexWithUVW(float i, float j, float k, float l, float m, float n){
		this.setTextureUVW(l, m, n);
		this.addVertex(i, j, k);
	}

	public void setTextureUV(float u, float v){
		float[] vert = verticies.get(verticies.size()-1);
		verticies.set(verticies.size()-1, new float[]{vert[0],vert[1],vert[2],u,v});
	}
	
	public void setTextureUVW(float u, float v, float w){
		float[] vert = verticies.get(verticies.size()-1);
		verticies.set(verticies.size()-1, new float[]{vert[0],vert[1],vert[2],u,v,0.0f,w});
	}

	public static void setTranslation(float xOffset, float yOffset, float zOffset){
		x = xOffset; y = yOffset; z = zOffset;
	}
	
	public static void addTranslation(float xOffset, float yOffset, float zOffset){
		x += xOffset; y += yOffset; z += zOffset;
	}

	public static void bindTexture(ResourceLocation uri){
		TextureManager.bindTexture(uri);
	}

	public void drawTexturedVertsWithNormal(TexturedPolygon polygon, float scale){
		GL11.glBegin(polygon.vertices.size()==4?GL11.GL_QUADS:polygon.vertices.size()==3?GL11.GL_TRIANGLES:GL11.GL_POLYGON);

		if(polygon.normal!=null) {
			GL11.glNormal3f(polygon.normal.xCoord, polygon.normal.yCoord, polygon.normal.zCoord);
		} else if(polygon.vertices.size()>2) {
			Vec3f vec0 = new Vec3f(polygon.vertices.get(1).vector3F.subtract(polygon.vertices.get(0).vector3F));
			Vec3f vec1 = new Vec3f(polygon.vertices.get(1).vector3F.subtract(polygon.vertices.get(2).vector3F));
			Vec3f vec2 = vec1.crossProduct(vec0).normalize();
			//integer based normal map scaling fits in better with vanilla, plus it looks more like TC.
			GL11.glNormal3i(
					((int)(vec2.xCoord * 127.0F)) & 255,
					(((int)(vec2.yCoord * 127.0F)) & 255) << 8,
					(((int)(vec2.zCoord * 127.0F)) & 255) << 16);
		}

		for (TexturedVertex vert : polygon.vertices) {
			GL11.glTexCoord2f(vert.textureX, vert.textureY);

			if (x != null) {
				GL11.glVertex3f((vert.vector3F.xCoord + x) * scale, (vert.vector3F.yCoord + y) * scale, (vert.vector3F.zCoord + z) * scale);
			} else {
				GL11.glVertex3f(vert.vector3F.xCoord * scale, vert.vector3F.yCoord * scale, vert.vector3F.zCoord * scale);
			}
		}

		GL11.glEnd();
	}

}
