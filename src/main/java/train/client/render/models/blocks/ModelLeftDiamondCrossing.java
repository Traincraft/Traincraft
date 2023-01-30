package train.client.render.models.blocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.common.library.Info;
import train.common.tile.TileTCRail;

@SideOnly(Side.CLIENT)
public class ModelLeftDiamondCrossing extends ModelBase{
    private IModelCustom modelDiamondCrossing = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "diamond_crossing_l.obj"));


    public void render(String type) {
        if (type.equals("crossing") || type.equals("embedded_crossing"))
            modelDiamondCrossing.renderAll();
    }

    public void render(String type, TileTCRail tcRail, double x, double y, double z) {
        int facing = tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);
        render(type, x, y, z, facing, 1, 1, 1, 1);
    }

    public void render(String type , double x, double y, double z, int facing, float r, float g, float b, float a) {
        // Push a blank matrix onto the stack
        GL11.glPushMatrix();

        // Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
        GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);

        // Bind the texture, so that OpenGL properly textures our block.
        if (type.contains("embedded"))
            tmt.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_embedded.png"));
        else  tmt.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
        GL11.glColor4f(r, g, b, a);
        //GL11.glScalef(0.5f, 0.5f, 0.5f);
        if (facing == 1 || facing == 3) {
            GL11.glRotatef(90, 0, 1,0);
        }
        this.render(type);
        // Pop this matrix from the stack.
        GL11.glPopMatrix();
    }
}
