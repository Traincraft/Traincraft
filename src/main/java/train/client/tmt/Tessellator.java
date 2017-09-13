package train.client.tmt;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.SimpleTexture;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;

import static org.lwjgl.opengl.GL11.GL_TEXTURE_2D;

@SideOnly(Side.CLIENT)
public class Tessellator {

	private static ByteBuffer bbuf = GLAllocation.createDirectByteBuffer(0x200000 * 4);
	private int rbs = 0, rbi = 0, dm, n;
	private boolean ht = false, in = false, drawing = false;
	private static Tessellator INSTANCE = new Tessellator();
	private static FloatBuffer fbuf = bbuf.asFloatBuffer();
	private static IntBuffer ibuf = bbuf.asIntBuffer();
	private float u, v, w;
	private int[] rb;

	public static Tessellator getInstance(){
		return INSTANCE;
	}

	public Tessellator(){

	}

	public void startDrawing(int i){
		if(!drawing){
			drawing = true; dm = i;
			in = ht = false;
			rbi = 0;

			bbuf.clear();
		}
	}

	public void draw(){
		if(drawing){
			drawing = false;
			GL11.glPushMatrix();
			GL11.glDisable(GL11.GL_LIGHTING);
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
			GL11.glEnable(GL11.GL_CULL_FACE);
				ibuf.clear();
				ibuf.put(rb, 0, 40);
				bbuf.position(0); bbuf.limit(40);
				if(ht){
					fbuf.position(3);
					GL11.glTexCoordPointer(4, 40, fbuf);
					GL11.glEnableClientState(GL11.GL_TEXTURE_COORD_ARRAY);
				}
				if(in){
					bbuf.position(32);
					GL11.glNormalPointer(40, bbuf);
					GL11.glEnableClientState(GL11.GL_NORMAL_ARRAY);
				}
				fbuf.position(0);
				GL11.glVertexPointer(3, 40, fbuf);
				GL11.glEnableClientState(GL11.GL_VERTEX_ARRAY);
				GL11.glDrawArrays(dm, 0, GL11.GL_QUADS);
				GL11.glDisableClientState(GL11.GL_VERTEX_ARRAY);
				if(ht){
					GL11.glDisableClientState(GL11.GL_TEXTURE_COORD_ARRAY);
				}
				if(in){
					GL11.glDisableClientState(GL11.GL_NORMAL_ARRAY);
				}
			}
			GL11.glDisable(GL11.GL_CULL_FACE);
			GL11.glDisable(GL11.GL_BLEND);
			GL11.glEnable(GL11.GL_LIGHTING);

			GL11.glPopMatrix();
	}


	public void addVertex(float par1, float par3, float par5){
		if(rbs == 0){rbs = 40; rb = new int[rbs];}
		if(ht){
			rb[rbi + 3] = Float.floatToRawIntBits(u); rb[rbi + 4] = Float.floatToRawIntBits(v);
			rb[rbi + 5] = 0; rb[rbi + 6] = Float.floatToRawIntBits(w);
		}
		if(in){rb[rbi + 7] = n;}
		rb[rbi] = Float.floatToRawIntBits(par1);
		rb[rbi + 1] = Float.floatToRawIntBits(par3);
		rb[rbi + 2] = Float.floatToRawIntBits(par5);
		rbi += 10;
	}

	public void addVertexWithUV(float i, float j, float k, float l, float m){
		this.setTextureUV(l, m); this.addVertex(i, j, k);
	}

	public void setNormal(int x, int y, int z){
		in = true;
		n = ((x * 127)) & 255 | (((y * 127)) & 255) << 8 | (((z * 127)) & 255) << 16;
	}

	public void setTextureUV(float i, float j){
		this.ht = true; this.u = i; this.v = j; this.w = 1.0F;
	}



	public static void bindTexture(ResourceLocation textureURI) {
		ITextureObject object;
		if (textureURI != null) {
			object = Minecraft.getMinecraft().getTextureManager().getTexture(textureURI);
			if (object == null) {
				object = new SimpleTexture(textureURI);
				Minecraft.getMinecraft().getTextureManager().loadTexture(textureURI, object);
			}
		} else {
			object = TextureUtil.missingTexture;
		}

		if (GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D) != object.getGlTextureId()) {
			GL11.glBindTexture(GL_TEXTURE_2D, object.getGlTextureId());
		}
	}
	
}