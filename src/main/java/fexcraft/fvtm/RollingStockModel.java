package fexcraft.fvtm;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import train.common.core.handlers.ConfigHandler;

import java.util.ArrayList;
import java.util.Arrays;
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
        for(TurboList list :groups) {
            if(list.init){
                list.initAllParts();
            }
        }


        if(ConfigHandler.DISABLECACHE) {
            for(TurboList list :groups) {
                list.render(list.boxList);
            }
        } else if(staticPartMap.get(this.getClass().getName())==null) {
            staticPartMap.put(this.getClass().getName(), GLAllocation.generateDisplayLists(1));
            GL11.glNewList(staticPartMap.get(this.getClass().getName()), GL11.GL_COMPILE);
            for(TurboList list :groups) {
                list.render(list.boxList);
            }
            GL11.glEndList();
            //if(!ClientProxy.EnableAnimations) {
            //    for(TurboList list :groups) {
            //        list.boxList = null;
            //    }
            //}
        } else {
            if(GL11.glIsList(staticPartMap.get(this.getClass().getName()))) {
                GL11.glCallList(staticPartMap.get(this.getClass().getName()));
            } else {
                staticPartMap.put(this.getClass().getName(), GLAllocation.generateDisplayLists(1));
                GL11.glNewList(staticPartMap.get(this.getClass().getName()), GL11.GL_COMPILE);
                for(TurboList list :groups) {
                    list.render(list.boxList);
                }
                GL11.glEndList();
            }
        }

        for(TurboList list :groups) {
            if (list.animatedList != null) {
                for (int i = 0; i < list.animatedList.size(); i++) {
                    if (list.displayList.size() > i && GL11.glIsList(list.displayList.get(i))) {
                        GL11.glCallList(list.displayList.get(i));
                    } else if (list.animatedList.get(i) != null) {
                        list.displayList.add(GLAllocation.generateDisplayLists(1));
                        GL11.glNewList(list.displayList.get(i), GL11.GL_COMPILE);
                        GL11.glPushMatrix();
                        list.animatedList.get(i).render();
                        GL11.glPopMatrix();
                        GL11.glEndList();
                    }
                }
            }
        }
    }

    @Override
    public List<ModelRendererTurbo> getParts(){
        List<ModelRendererTurbo> turboList = new ArrayList<ModelRendererTurbo>();
        for(TurboList g: groups){
            turboList.addAll(g.boxList);
            turboList.addAll(g.animatedList);
        }
        return turboList;
    }
    
}
