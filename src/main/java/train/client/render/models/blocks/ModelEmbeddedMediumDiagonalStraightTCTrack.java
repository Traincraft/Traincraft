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
public class ModelEmbeddedMediumDiagonalStraightTCTrack extends ModelBase {

    private IModelCustom modelEmbeddedMediumDiagonalStraight;


    public ModelEmbeddedMediumDiagonalStraightTCTrack() {
        modelEmbeddedMediumDiagonalStraight = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_embedded_straight_diagonal_medium.obj"));

    }

    public void render(String type) {
        if (type.equals("diagonal")) {
            modelEmbeddedMediumDiagonalStraight.renderAll();
        }

    }

    public void render(String type, TileTCRail tcRail, double x, double y, double z) {
        int facing = tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);
        render( type, facing, x, y, z, 1, 1, 1, 1 );
    }

    public void render( String type, int facing, double x, double y, double z, float r, float g, float b, float a )
    {
        // Push a blank matrix onto the stack
        GL11.glPushMatrix();

        // Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
        GL11.glTranslatef((float) x + 0f, (float) y, (float) z + 0f);
        GL11.glColor4f(r, g, b, a);



        // Bind the texture, so that OpenGL properly textures our block.
        if (type.equals("diagonal") ) {
            FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
        }
        if (facing == 4) {
            GL11.glTranslatef(1f,0,0f);
            GL11.glRotatef(-90, 0, 1,0);
        }

        if (facing == 5) {
            GL11.glTranslatef(1f,0,1f);
            GL11.glRotatef(180, 0, 1,0f);

        }
        if (facing == 6) {
            GL11.glTranslatef(0f,0,1f);
            GL11.glRotatef(90, 0, 1,0);
        }

        if (facing == 7) {
            GL11.glTranslatef(0f,0,0f);
            GL11.glRotatef(0, 0, 1,0f);

        }




        render(type);

        // Pop this matrix from the stack.
        GL11.glPopMatrix();
    }

}
