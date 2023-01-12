package train.client.render.models.blocks;
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
public class ModelRightCurvedSlopeTCTrack extends ModelBase {
    private IModelCustom modelLargeRightCurvedTrack;
    private IModelCustom modelLargeRightCurvedBallast;

    public ModelRightCurvedSlopeTCTrack() {
        modelLargeRightCurvedTrack = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_slope_curve_large.obj"));
        modelLargeRightCurvedBallast = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "turn_slope_gravel_test.obj"));
    }


    public void render(String type, TileTCRail tcRail, double x, double y, double z) {
        int facing = tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);
        render( type, facing, x, y, z, 1, 1, 1, 1);
    }

    public void render(String type, int facing, double x, double y, double z, float r, float g, float b, float a) {
        // Push a blank matrix onto the stack
        GL11.glPushMatrix();

        // Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
        GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);

        // Bind the texture, so that OpenGL properly textures our block.
        if (facing == 2){
            GL11.glRotatef(90, 0, 1, 0);
            if(type.equals("large"))
                GL11.glTranslatef(-0.5f, 0.0f, -0.5f);
        }
        if (facing == 0){
            GL11.glRotatef(-90, 0, 1, 0);
            if(type.equals("large"))
                GL11.glTranslatef(-0.5f, 0.0f, -0.5f);
        }
        if (facing == 1){
            GL11.glRotatef(180, 0, 1, 0);
            if(type.equals("large"))
                GL11.glTranslatef(-0.5f, 0.0f, -0.5f);
        } if (facing == 3){
            GL11.glRotatef(0, 0, 1, 0);
            if(type.equals("large"))
                GL11.glTranslatef(-0.5f, 0.0f, -0.5f);
        }

        tmt.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
        modelLargeRightCurvedTrack.renderAll();
        tmt.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/blocks/asphalt.png"));
        modelLargeRightCurvedBallast.renderAll();

        GL11.glColor4f(r, g, b, a);
        //GL11.glScalef(0.5f, 0.5f, 0.5f);


       // if (type.equals("large"))
       //     this.renderLarge();
        // Pop this matrix from the stack.
        GL11.glPopMatrix();
    }
}
