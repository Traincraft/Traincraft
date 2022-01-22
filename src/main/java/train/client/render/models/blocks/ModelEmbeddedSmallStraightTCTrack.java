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
import train.common.tile.TileTCRail;



@SideOnly(Side.CLIENT)
public class ModelEmbeddedSmallStraightTCTrack extends ModelBase {

    private IModelCustom modelEmbeddedSmallStraight;

    public ModelEmbeddedSmallStraightTCTrack() {
        modelEmbeddedSmallStraight = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_embedded_straight.obj"));

    }

    public void render(String type) {
        if (type.equals("straight")) {
            modelEmbeddedSmallStraight.renderAll();
        }
    }

    public void render(String type, TileTCRail tcRail, double x, double y, double z) {
        int facing = tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);
        render(type, facing, x, y, z, 1, 1, 1, 1);
    }

    public void render(String type, int facing, double x, double y, double z, float r, float g, float b, float a) {
        // Push a blank matrix onto the stack
        GL11.glPushMatrix();

        // Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
        GL11.glTranslatef((float) x + 0.5f, (float) y - 0.025F, (float) z + 0.5f);
        GL11.glColor4f(r, g, b, a);

        if (type.equals("straight")) {
            FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
        }

        if (facing == 0) {
            GL11.glRotatef(90, 0, 1, 0);
        }
        if (facing == 1) {
            GL11.glRotatef(90, 0, 1, 0);
        }

        if (facing == 3) {
            GL11.glRotatef(90, 0, 1, 0);
        }

        render(type);

        // Pop this matrix from the stack.
        GL11.glPopMatrix();
    }

}

