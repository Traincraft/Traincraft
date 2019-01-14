package train.client.render.models.blocks;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.common.library.Info;
import train.common.tile.TileLantern;

@SideOnly(Side.CLIENT)
public class ModelLantern extends ModelBase {
	private IModelCustom modelLantern;
	private final RenderItem renderItem;

	public ModelLantern() {
		modelLantern = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "lantern.obj"));
		renderItem = new RenderItem() {

			@Override
			public boolean shouldBob() {

				return false;
			};
		};

		renderItem.setRenderManager(RenderManager.instance);
	}

	public void render() {
		modelLantern.renderAll();
	}

	public void render(TileLantern lantern, double x, double y, double z) {
		// Push a blank matrix onto the stack
		GL11.glPushMatrix();

		// Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
		GL11.glTranslatef((float) x + 0.5f, (float) y + 0.5f, (float) z + 0.5f);

		// Scale our object to about half-size in all directions (the OBJ file is a little large)
		GL11.glScalef(0.5f, 0.5f, 0.5f);

		// Bind the texture, so that OpenGL properly textures our block.
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "lantern_uv_draw_2.png"));
		int j = lantern.getRandomColor();
		//System.out.println(j);
		float f1 = 1.0F;
		float f2 = (float) (j >> 16 & 255) / 255.0F;
		float f3 = (float) (j >> 8 & 255) / 255.0F;
		float f4 = (float) (j & 255) / 255.0F;
		GL11.glColor4f(f1 * f2, f1 * f3, f1 * f4,1);
		// Render the object, using modelTutBox.renderAll();

		this.render();
		GL11.glColor4f(1, 1, 1,1);

		// Pop this matrix from the stack.
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		EntityItem ghostEntityItem = new EntityItem(lantern.getWorldObj());
		ghostEntityItem.setEntityItemStack(new ItemStack(Blocks.torch, 1));
		ghostEntityItem.hoverStart = 0.0F;

		GL11.glTranslatef((float) x + 0.5F, (float) y + 0.1F, (float) z + 0.5F);
		GL11.glScalef(0.5F, 0.5F, 0.5F);
		renderItem.doRender(ghostEntityItem, 0, 0, 0, 0, 0);

		GL11.glPopMatrix();
	}

}
