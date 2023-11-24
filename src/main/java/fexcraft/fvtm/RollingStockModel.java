package fexcraft.fvtm;

import ebf.tim.utility.DebugUtil;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import fexcraft.tmt.slim.Tessellator;
import fexcraft.tmt.slim.TexturedPolygon;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * A compatibility class for "FVTM Scheme/Format" models.
 * @Author Eternal BlueFlame
 *
 * @OriginalAuthor Ferdinand Calo' (FEX___96)
 */

public class RollingStockModel extends ModelBase {

    public List<TurboList> groups = new ArrayList<>();
    public int textureX, textureY;
    public RollingStockModel(){}

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5){
        if(init){
            for(TurboList list :groups) {
                list.initAllParts();
            }
            //for the named list, we sort those into this class to avoid subclassing errors with the animator.
            for(TurboList list :groups) {
                namedList.addAll(list.namedList);
            }
            init=false;
        }
        //this can happen somehow
        if(groups==null){
            return;
        }


        if(disableCache) {
            for(TurboList list :groups) {
                if(list!=null) {
                    list.render(list.boxList);
                }
            }
        } else if(staticPartMap.get(this.getClass().getName())==null || localGLID==null) {
            if(localGLID==null && staticPartMap.get(this.getClass().getName())!=null){
                localGLID = staticPartMap.get(this.getClass().getName());
                return;
            }

            staticPartMap.put(this.getClass().getName(), GLAllocation.generateDisplayLists(1));
            GL11.glNewList(staticPartMap.get(this.getClass().getName()), GL11.GL_COMPILE);
            localGLID = staticPartMap.get(this.getClass().getName());
            for(TurboList list :groups) {
                list.render(list.boxList);
            }
            GL11.glEndList();
            if(!ModelBase.EnableAnimations) {
                for(TurboList list :groups) {
                    list.boxList = null;
                }
            }
        } else {
            if(GL11.glIsList(this.localGLID)) {
                GL11.glCallList(this.localGLID);
            } else {
                staticPartMap.put(this.getClass().getName(), GLAllocation.generateDisplayLists(1));
                GL11.glNewList(staticPartMap.get(this.getClass().getName()), GL11.GL_COMPILE);
                localGLID=staticPartMap.get(this.getClass().getName());
                for(TurboList list :groups) {
                    list.render(list.boxList);
                }
                GL11.glEndList();
            }
        }

        if(namedList ==null){return;}
        for(ModelRendererTurbo part : namedList) {
            //for animations to work we have to limit the displaylist cache to ONLY the geometry, and then
            //    the position and offsets must be done manually every frame.
            if (!part.showModel) {
                continue;
            }
            GL11.glPushMatrix();
            if (part.ignoresLighting) {
                Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
            }
            GL11.glTranslatef(part.rotationPointX * 0.0625F, part.rotationPointY * 0.0625F, part.rotationPointZ * 0.0625F);
            GL11.glRotatef(part.rotateAngleY, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(part.rotateAngleZ, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(part.rotateAngleX, 1.0F, 0.0F, 0.0F);
            if (part.glID!=null && GL11.glIsList(part.glID)) {
                GL11.glCallList(part.glID);
            } else {
                part.glID = GLAllocation.generateDisplayLists(1);
                GL11.glNewList(part.glID, GL11.GL_COMPILE);
                for (TexturedPolygon poly : part.faces) {
                    Tessellator.getInstance().drawTexturedVertsWithNormal(poly, 0.0625F);
                }
                GL11.glEndList();
            }

            GL11.glTranslatef(-part.rotationPointX * 0.0625F, -part.rotationPointY * 0.0625F, -part.rotationPointZ * 0.0625F);
            if (part.ignoresLighting) {
                Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
            }
            GL11.glPopMatrix();


        }
    }

    @Override
    public List<ModelRendererTurbo> getnamedParts(){
        if(init){
            for(TurboList list :groups) {
                list.initAllParts();
            }
            //for the named list, we sort those into this class to avoid subclassing errors with the animator.
            for(TurboList list :groups) {
                namedList.addAll(list.namedList);
            }
            init=false;
        }
        return namedList;
    }

    public TurboList get(String s){
        for(TurboList t : groups){
            if(t.boxname.equals(s)){
                return t;
            }
        }
        return null;
    }

}
