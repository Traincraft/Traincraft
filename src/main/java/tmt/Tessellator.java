package tmt;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.SimpleTexture;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;

import static org.lwjgl.opengl.GL11.GL_TEXTURE_2D;

/**
* @Author Ferdinand (FEX___96)
* 
*/
@SideOnly(Side.CLIENT)
public class Tessellator{
	
	private static ByteBuffer bbuf = GLAllocation.createDirectByteBuffer(0x200000 * 4);
	private int rbs = 0, verts = 0, /*br, c,*/ rbi = 0, /*vertices = 0,*/ dm, n, vtc;
	private boolean ht = false, in = false, drawing = false;
	public static Tessellator INSTANCE = new Tessellator();
	private static FloatBuffer fbuf = bbuf.asFloatBuffer();
	//private static ShortBuffer sbuf = bbuf.asShortBuffer();
	private static IntBuffer ibuf = bbuf.asIntBuffer();
	private float u, v, w, x, y, z;
	private int[] rb;
	
	public static Tessellator getInstance(){
		return INSTANCE;
	}
	
	public Tessellator(){
		super();
	}
	
	public void startDrawing(int i){
		if(!drawing){
			drawing = true; dm = i;
			in = ht = false;
			reset();
		}
	}

	public int draw(){
		if(drawing){
			drawing = false; int o = 0;
			while(o < verts){
				vtc = Math.min(verts - o, 0x200000 >> 5);
				ibuf.clear(); ibuf.put(rb, o * 10, vtc * 10); bbuf.position(0); bbuf.limit(vtc * 40); o += vtc;
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
				GL11.glDrawArrays(dm, 0, vtc);
				GL11.glDisableClientState(GL11.GL_VERTEX_ARRAY);
				if(ht){
					GL11.glDisableClientState(GL11.GL_TEXTURE_COORD_ARRAY);
				}
				if(in){
					GL11.glDisableClientState(GL11.GL_NORMAL_ARRAY);
				}
			}
			if(rbs > 0x20000 && rbi < (rbs << 3)){
				rbs = 0; rb = null;
			}
			reset();
		}
		return 0;
	}
	
	private void reset(){
		verts = rbi = 0;//vertices = 0;
		
		bbuf.clear();
	}
	
	public void addVertex(float par1, float par3, float par5){
		if(rbi >= rbs - 40) {
			if(rbs == 0){rbs = 0x10000; rb = new int[rbs];}
			else{rbs *= 2; rb = Arrays.copyOf(rb, rbs);}
		}
		if(ht){
			rb[rbi + 3] = Float.floatToRawIntBits(u); rb[rbi + 4] = Float.floatToRawIntBits(v);
			rb[rbi + 5] = Float.floatToRawIntBits(0.0F); rb[rbi + 6] = Float.floatToRawIntBits(w);
		}
		if(in){rb[rbi + 8] = n;}
		rb[rbi] = Float.floatToRawIntBits((par1 + x));
		rb[rbi + 1] = Float.floatToRawIntBits((par3 + y));
		rb[rbi + 2] = Float.floatToRawIntBits((par5 + z));
		rbi += 10; verts++; //vertices++;
	}
	
	public void addVertexWithUV(float i, float j, float k, float l, float m){
		this.setTextureUV(l, m); this.addVertex(i, j, k);
	}
	
	public void addVertexWithUVW(float i, float j, float k, float l, float m, float n){
		this.setTextureUVW(l, m, n); this.addVertex(i, j, k);
	}
	
	public void setNormal(float x, float y, float z){
		in = true;
		byte b0 = (byte)((int)(x * 127.0F)); byte b1 = (byte)((int)(y * 127.0F)); byte b2 = (byte)((int)(z * 127.0F));
		n = b0 & 255 | (b1 & 255) << 8 | (b2 & 255) << 16;
	}
	
	public void setTextureUV(float i, float j){
		this.ht = true; this.u = i; this.v = j; this.w = 1.0F;
	}
	
	public void setTextureUVW(float i, float j, float k){
		this.ht = true; this.u = i; this.v = j; this.w = k;
	}
	
	public void setTranslation(float x, float y, float z){
		this.x = x; this.y = y; this.z = z;
	}
	
	public void addTranslation(float x, float y, float z){
		this.x += x; this.y += y; this.z += z;
	}


	/**
	 * Eternal: custom texture binding method, generally same as vanilla, but possible to improve performance later.
	 * @param textureURI
	 */
	public static void bindTexture(ResourceLocation textureURI) {
		ITextureObject object = Minecraft.getMinecraft().getTextureManager().getTexture(textureURI);
		if (object == null) {
			object = new SimpleTexture(textureURI);
			Minecraft.getMinecraft().getTextureManager().loadTexture(textureURI, object);
		}
		GL11.glBindTexture(GL_TEXTURE_2D, object.getGlTextureId());
	}
	
}
