package ebf.tim.models;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.skin;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.ClientProxy;
import ebf.tim.utility.CommonUtil;
import ebf.tim.utility.DebugUtil;
import fexcraft.tmt.slim.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import static org.lwjgl.opengl.GL11.*;

/**
 * <h2>Entity Rendering</h2>
 * used for rendering all trains and rollingstock, along with their particle effects, smoke and steam as examples.
 * all the variables have to be stored outside this class because it's assigned to the entity class, not it's instances.
 * @author Eternal Blue Flame
 */
public class RenderWagon extends Render {

    private static double railOffset = 0.34f;
    private static int i=0, ii=0, iii=0;
    public static RenderWagon instance = new RenderWagon();
    public static RenderBlocks renderBlocks;

    //public RenderWagon() {}

    /**
     * <h3>overall texture</h3>
     * returns the texture for this entity, required by the super, we use it so we have access to the texture from outside this class, for example
     * @see GroupedModelRender#doRender(RenderBlocks, ItemStack, RenderWagon, float, GenericRailTransport)
     */
    public ResourceLocation getEntityTexture(Entity entity){
        return null;
    }

    /**
     * <h3>base render extension</h3>
     * acts as a redirect for the base render function to our own function.
     * This is just to do typecasting and a few calculations beforehand so we only need to do them once per render.
     * todo: 1.9+ should support Entity<t zextends GenericRailTransport> so this typecasting method should be completely useless then.
     */
    @Override
    public void doRender(Entity entity, double x, double y, double z, float yaw, float partialTick){
        if (entity instanceof GenericRailTransport && ((GenericRailTransport) entity).frontBogie!=null){
            render((GenericRailTransport) entity,x,y,z, entity.prevRotationYaw + MathHelper.wrapAngleTo180_float(entity.rotationYaw - entity.prevRotationYaw)*partialTick, false);
        }
    }

    public void render(GenericRailTransport entity, double x, double y, double z, float yaw, boolean isPaintBucket) {
        renderBlocks=field_147909_c;
        doRender(entity,x,y,z,yaw,entity.frontBogie!=null?entity.frontBogie.yOffset:0, isPaintBucket, null, this);
    }


    public void render(GenericRailTransport entity, double x, double y, double z, float yaw, boolean isPaintBucket, skin textureURI) {
        renderBlocks=field_147909_c;
        doRender(entity,x,y,z,yaw,entity.frontBogie!=null?entity.frontBogie.yOffset:0, isPaintBucket, textureURI, this);
    }

    /**
     * <h3>Actually render</h3>
     *
     * here we define position, rotation, pitch, bind the texture, render the model, and then manage smoke.
     *
     * Most all of this is pretty self-explanatory by function name, except for:
     *      glPushMatrix - this basically allocates room that we want to do something, like the GL equivalent of a starting bracket.
     *      glPopMatrix - this basically tells GL to do what we just allocated, like the GL equivalent of an ending bracket.
     *
     * @param entity the entity to render.
     * @param x the x position of the entity with offset for the camera position.
     * @param y the y position of the entity with offset for the camera position.
     * @param z the z position of the entity with offset for the camera position.
     * @param yaw is used to rotate the train's yaw, its exactly the same as entity.rotationYaw.
     *
     *
     */
    public static void doRender(GenericRailTransport entity, double x, double y, double z, float yaw, float bogieOffset, boolean isPaintBucket, @Nullable skin textureURI, RenderWagon renderInstance){

        if (entity.renderData.modelList == null || entity.renderData.needsModelUpdate) {
            entity.renderData = new TransportRenderData();
            entity.renderData.modelList = entity.getModel();
            entity.renderData.bogies = entity.bogies();

            //cache animating parts
            if (entity.worldObj!=null && ClientProxy.EnableAnimations && entity.renderData.needsModelUpdate) {
                boolean isAdded;
                for (ModelBase part : entity.renderData.modelList) {
                    for (ModelRendererTurbo render : part.getParts()) {
                        if (render.boxName ==null){continue;}
                        //attempt to cache the parts for the main transport model
                        if(StaticModelAnimator.checkCulls(render)){
                            render.showModel = false;
                        }
                        if(render.boxName.contains(StaticModelAnimator.tagGlow)){
                            render.boxName=render.boxName.replace(StaticModelAnimator.tagGlow,"");
                            render.ignoresLighting=true;
                        }
                        if (StaticModelAnimator.checkAnimators(render)) {
                            entity.renderData.animatedPart.add(StaticModelAnimator.initPart(render, entity));
                            render.animated=true;
                        } else if (GroupedModelRender.canAdd(render)) {
                            //if it's a grouped render we have to figure out if we already have a group for this or not.
                            isAdded = false;
                            for (GroupedModelRender cargo : entity.renderData.blockCargoRenders) {
                                if (cargo.getGroupName().equals(render.boxName)) {
                                    cargo.add(render);
                                    isAdded = true;
                                    break;
                                }
                            }
                            if (!isAdded) {
                                entity.renderData.blockCargoRenders.add(new GroupedModelRender().add(render));
                            }
                            render.showModel = false;
                        }
                        if(ParticleFX.parseData(render.boxName, entity.getClass())!=null){
                            entity.renderData.particles.addAll(ParticleFX.newParticleItterator(render.boxName,
                                    render.rotationPointX, render.rotationPointY, render.rotationPointZ,
                                    render.rotateAngleX,render.rotateAngleY,render.rotateAngleZ, entity));
                        }
                    }
                }
                //cache the animating parts on the bogies.
                if (entity.renderData.bogies != null) {
                    for (Bogie bogie : entity.renderData.bogies) {
                        List<ParticleFX> animators = new ArrayList<>();
                        for (ModelRendererTurbo box : bogie.bogieModel.getParts()) {
                            if (box.boxName ==null){continue;}
                            //attempt to cache the parts for the main transport model
                            if(StaticModelAnimator.checkCulls(box)){
                                box.showModel = false;
                            }
                            if(box.boxName.contains(StaticModelAnimator.tagGlow)){
                                box.boxName=box.boxName.replace(StaticModelAnimator.tagGlow,"");
                                box.ignoresLighting=true;
                            }
                            if (StaticModelAnimator.checkAnimators(box)) {
                                entity.renderData.animatedPart.add(StaticModelAnimator.initPart(box, entity));
                                box.animated=true;
                            }
                            if(ParticleFX.parseData(box.boxName, entity.getClass())!=null){
                                animators.addAll(ParticleFX.newParticleItterator(box.boxName,
                                        box.rotationPointX, box.rotationPointY, box.rotationPointZ,
                                        box.rotateAngleX,box.rotateAngleY,box.rotateAngleZ, entity));
                            }
                        }
                        entity.renderData.bogieParticles.add(animators);
                        if(bogie.subBogies==null){continue;}
                        //cache the animating parts on sub-bogies
                        for(Bogie subBogie : bogie.subBogies){
                            for(ModelRendererTurbo box : subBogie.bogieModel.getParts()){
                                if (box.boxName ==null){continue;}
                                //attempt to cache the parts for the main transport model
                                if(StaticModelAnimator.checkCulls(box)){
                                    box.showModel = false;
                                }
                                if(box.boxName.contains(StaticModelAnimator.tagGlow)){
                                    box.boxName=box.boxName.replace(StaticModelAnimator.tagGlow,"");
                                    box.ignoresLighting=true;
                                }
                                if (StaticModelAnimator.checkAnimators(box)) {
                                    entity.renderData.animatedPart.add(StaticModelAnimator.initPart(box, entity));
                                    box.animated=true;
                                }
                            }
                        }
                    }
                }
            }
            entity.renderData.needsModelUpdate=false;
        }

        //apply an additional offset based on the rails.
        //do this in render not in entity, otherwise it breaks Y position on client.
        if(entity.frontBogie!=null && entity.backBogie!=null) {
            if(ClientProxy.railSkin==0){
                railOffset=entity.frontBogie.yOffset>0.4?entity.frontBogie.yOffset-0.075:entity.frontBogie.yOffset;
                railOffset+=entity.backBogie.yOffset>0.4?entity.backBogie.yOffset-0.075:entity.backBogie.yOffset;
                railOffset*=0.5;
            } else {
                railOffset=(entity.frontBogie.yOffset+entity.backBogie.yOffset)*0.5;
            }
        }




        GL11.glPushMatrix();
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glAlphaFunc(GL11.GL_GREATER, 0.1f);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glLightModelf(GL_LIGHT_MODEL_TWO_SIDE, GL_FALSE);
        GL11.glLightModelf(GL_LIGHT_MODEL_LOCAL_VIEWER, GL_TRUE);
        GL11.glShadeModel(GL_SMOOTH);
        GL11.glEnable(GL_NORMALIZE);

        //set the render position
        GL11.glTranslated(x, y+ railOffset + ((entity.getRenderScale()-0.0625f)*10)+bogieOffset, z);
        //rotate the model.
        GL11.glRotatef(-yaw - 180f, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(entity.rotationPitch - 180f, 0.0f, 0.0f, 1.0f);

        /*
         * <h3>animations</h3>
         * Be sure animations are enabled in user settings, then check of there is something to animate.
         * if there is, then calculate the vectors and apply the animations
         */
        if (entity.worldObj!=null && !Minecraft.getMinecraft().isGamePaused() &&ClientProxy.EnableAnimations) {
            if (entity.renderData.wheelPitch >= 6.2831855f || entity.renderData.wheelPitch <=-6.2831855f) {
                entity.renderData.wheelPitch -= Math.copySign(6.2831855f, entity.renderData.wheelPitch);
            }
            //use this to sync animations with framerate
            float fps = Minecraft.getMinecraft().getLimitFramerate();
            //define the rotation angle, if it's going fast enough.
            entity.renderData.wheelPitch +=
                    ((((entity.frontVelocityX * entity.frontVelocityX) + (entity.frontVelocityZ * entity.frontVelocityZ))
                            *0.05f)*(fps/60f));

            //entity.renderData.wheelPitch+=0.03f;

            if (entity.renderData.wheelPitch != entity.renderData.lastWheelPitch) {
                entity.renderData.lastWheelPitch =entity.renderData.wheelPitch;
                //if it's actually moving, then define the new position

                entity.renderData.animationCache[0][0] = entity.getPistonOffset();
                //animate the tagged parts
                for (AnimationBase partToAnimate : entity.renderData.animatedPart) {
                    if(partToAnimate==null){continue;}
                    partToAnimate.animate(entity.renderData.wheelPitch, entity.renderData.animationCache[0], entity);
                }
            }
        }

        /*
         * <h3>Render geometry</h3>
         * Be sure the bound texture reference is null then Bind the texture. After that render any geometry that is supposed to use the default texture.
         * if there are any cargo blocks to render, then render them dependant on if there is enough stuff in the inventory to merit it.
         * In that render there is a check whether to render it as a cargo block, or use the geometry size/position/rotation to render a block similar to enderman.
         * @see net.minecraft.client.renderer.entity.RenderEnderman#renderEquippedItems(EntityEnderman, float)
         */
        //System.out.println(entity.getTexture(0).getResourcePath() + entity.getDataWatcher().getWatchableObjectInt(24));
        skin s;
        if(!isPaintBucket && entity.worldObj!=null) {
            TextureManager.adjustLightFixture(entity.worldObj, (int) entity.posX, (int) entity.posY + 1, (int) entity.posZ);
            s=entity.getTexture(Minecraft.getMinecraft().thePlayer);
        } else if (textureURI!=null){
            s=textureURI;
        } else {
            s=entity.getTextureByID(Minecraft.getMinecraft().thePlayer,false, entity.getDefaultSkin());
        }

        for(i=0; i< entity.renderData.modelList.length;i++) {
            TextureManager.bindTexture(s.getTexture(i), s.colorsFrom, s.colorsTo, entity.colorsFrom, entity.colorsTo);
            GL11.glPushMatrix();
            if(entity.modelOffsets()!=null && entity.modelOffsets().length>i) {
                GL11.glTranslated(entity.modelOffsets()[i][0],entity.modelOffsets()[i][1],entity.modelOffsets()[i][2]);
            }
            if(entity.modelRotations()!=null && entity.modelRotations().length>i) {
                GL11.glRotatef(entity.modelRotations()[i][0],1,0,0);
                GL11.glRotatef(entity.modelRotations()[i][1],0,1,0);
                GL11.glRotatef(entity.modelRotations()[i][2],0,0,1);
            }
            entity.renderData.modelList[i].render(entity, 0,0,0,0,0, entity.getRenderScale());
            GL11.glPopMatrix();
        }

        //todo add support for model offsets by making this a list like for bogies.
        //render the particles, if there are any.
        if(entity.worldObj!=null && !isPaintBucket) {
            for (ParticleFX particle : entity.renderData.particles) {
                ParticleFX.doRender(particle, entity.getRenderScale(), yaw);
            }
        }



        //loop for the groups of cargo
        for (i = 0; i< entity.renderData.blockCargoRenders.size() && i < entity.calculatePercentageOfSlotsUsed(entity.renderData.blockCargoRenders.size()); i++) {
            entity.renderData.blockCargoRenders.get(i).doRender(renderBlocks, entity.getFirstBlock(i), renderInstance, entity.getRenderScale(), entity);
        }

        /*
         * <h4> render bogies</h4>
         * in TiM here we render the bogies. This will be removed in TC.
         * this loops for every bogie defined in the registry for the transport, that way we can have different bogies.
         */


        if (entity.renderData.bogies != null) {
            ii=0;
            for(Bogie b : entity.renderData.bogies) {
                //bind the texture
                if (s.getBogieSkin(ii) != null) {
                    TextureManager.bindTexture(s.getBogieSkin(ii), s.colorsFrom, s.colorsTo, entity.colorsFrom, entity.colorsTo);
                }
                GL11.glPushMatrix();
                GL11.glTranslated(-b.offset[0], -b.offset[1], -b.offset[2]);
                b.setRotation(entity);
                if(!isPaintBucket) {
                    GL11.glRotatef(b.rotationYaw - yaw, 0.0f, 1.0f, 0);
                    GL11.glRotatef(entity.rotationPitch, 0.0f, 0.0f, 1.0f);
                }
                b.bogieModel.render(entity, 0, 0, 0, 0, 0, entity.getRenderScale());

                //render the particles, if there are any. do this _after_ the normal render because it breaks texture bind
                if(!isPaintBucket && entity.worldObj!=null) {
                    for (ParticleFX p : entity.renderData.bogieParticles.get(ii)) {
                        ParticleFX.doRender(p, entity.getRenderScale(), yaw);
                    }
                }

                if(b.subBogies!=null) {
                    iii=0;
                    for (Bogie sub : b.subBogies) {
                        if(s.getSubBogieSkin(iii)!=null){
                            TextureManager.bindTexture(s.getSubBogieSkin(iii), s.colorsFrom, s.colorsTo, entity.colorsFrom, entity.colorsTo);
                        }
                        GL11.glPushMatrix();
                        GL11.glTranslated(sub.offset[0]-b.offset[0], sub.offset[1]-b.offset[1], sub.offset[2]-b.offset[2]);
                        sub.setRotation(entity);

                        if(!isPaintBucket) {
                            GL11.glRotatef(sub.rotationYaw - b.rotationYaw, 0.0f, 1.0f, 0);
                        }
                        sub.bogieModel.render(entity, 0, 0, 0, 0, 0, entity.getRenderScale());
                        GL11.glPopMatrix();
                        iii++;
                    }
                }

                GL11.glPopMatrix();
                ii++;
            }
        }

        GL11.glPopMatrix();
        if(entity.worldObj==null || isPaintBucket){return;}
        //render the smoke and steam particles, if there are any.
        //this has to render seperate from the rest of the train as it's position is intended to be independant outside of spawn position
            for (ParticleFX particle : entity.renderData.particles) {
                ParticleFX.renderSmoke(particle, x, y, z, entity.getRenderScale(), yaw);
            }

        //render hitboxes
        if(RenderManager.debugBoundingBox && entity.collisionHandler!=null && entity.collisionHandler.renderShape !=null) {
            GL11.glPushMatrix();
            GL11.glEnable(GL11.GL_BLEND);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            //GL11.glDepthMask(false);

            GL11.glPushMatrix();
            GL11.glTranslated(x,y,z);

            GL11.glColor3f(1,1,1);
            //GL11.glEnable(GL11.GL_LINE);
            //DebugUtil.println(entity.collisionHandler.renderShape[0]);

            Tessellator.getInstance().startDrawing(GL11.GL_LINE_STRIP);
            Tessellator.getInstance().addVertex(entity.collisionHandler.renderShape[0].xCoord, entity.collisionHandler.renderShape[0].yCoord, entity.collisionHandler.renderShape[0].zCoord);
            Tessellator.getInstance().addVertex(entity.collisionHandler.renderShape[1].xCoord, entity.collisionHandler.renderShape[1].yCoord, entity.collisionHandler.renderShape[1].zCoord);
            Tessellator.getInstance().addVertex(entity.collisionHandler.renderShape[2].xCoord, entity.collisionHandler.renderShape[2].yCoord, entity.collisionHandler.renderShape[2].zCoord);
            Tessellator.getInstance().addVertex(entity.collisionHandler.renderShape[3].xCoord, entity.collisionHandler.renderShape[3].yCoord, entity.collisionHandler.renderShape[3].zCoord);
            Tessellator.getInstance().addVertex(entity.collisionHandler.renderShape[0].xCoord, entity.collisionHandler.renderShape[0].yCoord, entity.collisionHandler.renderShape[0].zCoord);
            Tessellator.getInstance().draw();


            Tessellator.getInstance().startDrawing(GL11.GL_LINE_STRIP);
            Tessellator.getInstance().addVertex(entity.collisionHandler.renderShape[4].xCoord, entity.collisionHandler.renderShape[4].yCoord, entity.collisionHandler.renderShape[4].zCoord);
            Tessellator.getInstance().addVertex(entity.collisionHandler.renderShape[5].xCoord, entity.collisionHandler.renderShape[5].yCoord, entity.collisionHandler.renderShape[5].zCoord);
            Tessellator.getInstance().addVertex(entity.collisionHandler.renderShape[6].xCoord, entity.collisionHandler.renderShape[6].yCoord, entity.collisionHandler.renderShape[6].zCoord);
            Tessellator.getInstance().addVertex(entity.collisionHandler.renderShape[7].xCoord, entity.collisionHandler.renderShape[7].yCoord, entity.collisionHandler.renderShape[7].zCoord);
            Tessellator.getInstance().addVertex(entity.collisionHandler.renderShape[4].xCoord, entity.collisionHandler.renderShape[4].yCoord, entity.collisionHandler.renderShape[4].zCoord);
            Tessellator.getInstance().draw();



            Tessellator.getInstance().startDrawing(GL11.GL_LINES);
            Tessellator.getInstance().addVertex(entity.collisionHandler.renderShape[0].xCoord, entity.collisionHandler.renderShape[0].yCoord, entity.collisionHandler.renderShape[0].zCoord);
            Tessellator.getInstance().addVertex(entity.collisionHandler.renderShape[4].xCoord, entity.collisionHandler.renderShape[4].yCoord, entity.collisionHandler.renderShape[4].zCoord);
            Tessellator.getInstance().draw();
            Tessellator.getInstance().startDrawing(GL11.GL_LINES);
            Tessellator.getInstance().addVertex(entity.collisionHandler.renderShape[1].xCoord, entity.collisionHandler.renderShape[1].yCoord, entity.collisionHandler.renderShape[1].zCoord);
            Tessellator.getInstance().addVertex(entity.collisionHandler.renderShape[5].xCoord, entity.collisionHandler.renderShape[5].yCoord, entity.collisionHandler.renderShape[5].zCoord);
            Tessellator.getInstance().draw();
            Tessellator.getInstance().startDrawing(GL11.GL_LINES);
            Tessellator.getInstance().addVertex(entity.collisionHandler.renderShape[2].xCoord, entity.collisionHandler.renderShape[2].yCoord, entity.collisionHandler.renderShape[2].zCoord);
            Tessellator.getInstance().addVertex(entity.collisionHandler.renderShape[6].xCoord, entity.collisionHandler.renderShape[6].yCoord, entity.collisionHandler.renderShape[6].zCoord);
            Tessellator.getInstance().draw();
            Tessellator.getInstance().startDrawing(GL11.GL_LINE_STRIP);
            Tessellator.getInstance().addVertex(entity.collisionHandler.renderShape[3].xCoord, entity.collisionHandler.renderShape[3].yCoord, entity.collisionHandler.renderShape[3].zCoord);
            Tessellator.getInstance().addVertex(entity.collisionHandler.renderShape[7].xCoord, entity.collisionHandler.renderShape[7].yCoord, entity.collisionHandler.renderShape[7].zCoord);
            Tessellator.getInstance().draw();
            GL11.glPopMatrix();

            GL11.glTranslated(x,y,z);
            drawRotationPoint(new Vec3f(entity.frontBogie.posX-entity.posX,entity.frontBogie.posY-entity.posY,entity.frontBogie.posZ-entity.posZ), entity);



            if(entity.frontBogie==null || entity.backBogie==null){
                return;
            }


            drawRotationPoint(new Vec3f(entity.backBogie.posX-entity.posX,entity.backBogie.posY-entity.posY,entity.backBogie.posZ-entity.posZ), entity);

            GL11.glDisable(GL11.GL_BLEND);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glEnable(GL11.GL_ALPHA_TEST);
            //GL11.glDepthMask(true);
            GL11.glPopMatrix();
        }
    }

    private static void drawRotationPoint(Vec3f b, Entity entity){

        GL11.glEnable(GL11.GL_BLEND);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glDisable(GL11.GL_ALPHA_TEST);
        GL11.glColor3f(0,0,1);
        Tessellator.getInstance().startDrawing(GL11.GL_LINE_STRIP);
        Tessellator.getInstance().addVertex(b.xCoord,b.yCoord+3, b.zCoord);
        Tessellator.getInstance().addVertex(b.xCoord,b.yCoord, b.zCoord);
        Tessellator.getInstance().draw();

        GL11.glColor3f(1,0,0);
        Tessellator.getInstance().startDrawing(GL11.GL_LINE_STRIP);
        Tessellator.getInstance().addVertex(b.xCoord,b.yCoord, b.zCoord);
        Vec3f bogiePos = CommonUtil.rotatePoint(new Vec3f(0,0,-3),entity.rotationPitch, entity.rotationYaw,0).add(b);
        Tessellator.getInstance().addVertex(bogiePos.xCoord,bogiePos.yCoord, bogiePos.zCoord);
        Tessellator.getInstance().draw();


        GL11.glColor3f(0,1,0);
        Tessellator.getInstance().startDrawing(GL11.GL_LINE_STRIP);
        Tessellator.getInstance().addVertex(b.xCoord,b.yCoord+3, b.zCoord);
        bogiePos = CommonUtil.rotatePoint(new Vec3f(-3,0,0),entity.rotationPitch, entity.rotationYaw,0).add(b);
        Tessellator.getInstance().addVertex(bogiePos.xCoord,bogiePos.yCoord+3, bogiePos.zCoord);
        Tessellator.getInstance().draw();
        GL11.glEnable(GL11.GL_TEXTURE_2D);
    }
}
