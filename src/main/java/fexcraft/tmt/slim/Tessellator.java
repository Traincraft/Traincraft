package fexcraft.tmt.slim;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
* @Author EternalBlueFlame
* 
*/
@SideOnly(Side.CLIENT)
public class Tessellator{

	public static Tessellator INSTANCE = new Tessellator();

	private static Float x, y, z;

	public static Tessellator getInstance(){
		return INSTANCE;
	}

	//use this to reset and define the drawing mode
	public void startDrawing(int mode){
		x=null;y=null;z=null;
		GL11.glBegin(mode);
	}

	public void draw(){
		GL11.glEnd();
	}
	
	public void addVertex(float i, float j, float k){
		if(x!=null){
			GL11.glVertex3f(i+x,j+y,k+z);

		} else {
			GL11.glVertex3f(i,j,k);
		}
	}
	
	public void addVertexWithUV(float i, float j, float k, float u, float v){

		GL11.glTexCoord2f(u,v);
		if(x!=null){
			GL11.glVertex3f(i+x,j+y,k+z);

		} else {
			GL11.glVertex3f(i,j,k);
		}
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

		if(polygon.vertices.get(3).vector3F==polygon.vertices.get(1).vector3F
				|| polygon.vertices.get(1).vector3F ==polygon.vertices.get(2).vector3F
				|| polygon.vertices.get(3).vector3F ==polygon.vertices.get(2).vector3F){
			setNormal(polygon.vertices.get(2).vector3F, polygon.vertices.get(0).vector3F, polygon.vertices.get(1).vector3F);
		} else {
			setNormal(polygon.vertices.get(3).vector3F, polygon.vertices.get(1).vector3F, polygon.vertices.get(2).vector3F);
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


	public static void setNormal(Vec3f vec0, Vec3f vec1, Vec3f vec2) {
		Vec3f vec = new Vec3f(vec1.subtract(vec2)).crossProduct(vec1.subtract(vec0)).normalize();
		GL11.glNormal3b(
				((byte)((int)(vec.xCoord * 100F))),
				((byte)((int)(vec.yCoord * 100F))),
				((byte)((int)(vec.zCoord * 100F))));
	}

}
