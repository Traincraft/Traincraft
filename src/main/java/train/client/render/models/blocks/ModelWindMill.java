package train.client.render.models.blocks;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.common.library.Info;
import train.common.tile.TileWindMill;

@SideOnly(Side.CLIENT)
public class ModelWindMill extends ModelBase {
	private IModelCustom modelWindMill;
	//private IModelCustom modelWindMillWheel;
	private long lastframe;
	private float wheel;
	private int l;
	public float wheel1 = 0.4188790204786391F;

	public ModelWindMill() {
		modelWindMill = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "wind_mill.obj"));
	}

	public void render() {
		modelWindMill.renderAll();
	}

	public void render(TileWindMill windMill, double x, double y, double z) {
		// Push a blank matrix onto the stack
		GL11.glPushMatrix();

		// Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
		GL11.glTranslatef((float) x + 0.5f, (float) y + 0.43f, (float) z + 0.5f);

		// Bind the texture, so that OpenGL properly textures our block.
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "water_wheel_uv.png"));
		int j = 0x331D14;//0x1C0F0A; //0x5a3222;
		//System.out.println(j);
		float f1 = 1.0F;
		float f2 = (float) (j >> 16 & 255) / 255.0F;
		float f3 = (float) (j >> 8 & 255) / 255.0F;
		float f4 = (float) (j & 255) / 255.0F;
		GL11.glColor4f(f1 * f2, f1 * f3, f1 * f4, 1);
		GL11.glScalef(0.5f, 0.5f, 0.5f);
		int facing = windMill.getWorldObj().getBlockMetadata((int) windMill.xCoord, (int) windMill.yCoord, (int) windMill.zCoord);
		if (facing == 3) {
		}
		if (facing == 1) {
			GL11.glRotatef(180, 0, 1, 0);
		}
		if (facing == 0) {
			GL11.glRotatef(-90, 0, 1, 0);
		}
		if (facing == 2) {
			GL11.glRotatef(90, 0, 1, 0);
		}

		this.render();

		// Pop this matrix from the stack.
		GL11.glPopMatrix();
	}

}
