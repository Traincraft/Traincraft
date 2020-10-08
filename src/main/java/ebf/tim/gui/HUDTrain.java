package ebf.tim.gui;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.ClientProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.StatCollector;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import org.lwjgl.opengl.GL11;

/**
 * <h1>Train HUD</h1>
 * the heads up display which shows the train's stats whenever there is a player riding it.
 * @author Eternal Blue Flame
 */
public class HUDTrain extends GuiScreen {

    @Override
    public boolean doesGuiPauseGame()
    {
        return false;
    }


    /**
     * <h2>Loco HUD</h2>
     * similar to the GUI, this will draw a HUD for the train when someone is in it.
     * @see GUITransport
     * The difference is that we override the experience bar render so that we can render the GUI alongside that, like a HUD.
     * @see GuiScreen
     * Some IDE's may report this function is unused, but it is actually used indirectly by minecraft's event manager, for this reason the warning was supressed.
     */
    @SubscribeEvent(priority = EventPriority.NORMAL)
    @SuppressWarnings("unused")
    /**checks if minecraft and the player is loaded, if true it checks if the player is in a locomotive, if true, it displays the debug GUI*/
    public void onRenderExperienceBar(RenderGameOverlayEvent event) {
        if (Minecraft.getMinecraft() != null && Minecraft.getMinecraft().thePlayer != null) {
            if (Minecraft.getMinecraft().thePlayer.ridingEntity instanceof EntityTrainCore) {
                EntityTrainCore trainEntity = (EntityTrainCore) Minecraft.getMinecraft().thePlayer.ridingEntity;

                if(fontRendererObj==null){
                    fontRendererObj=Minecraft.getMinecraft().fontRenderer;
                }

                /**displays the debug GUI with the following information:
                 * Entity Internal ID,
                 * Accelerator State, 
                 * speed,
                 * and if the brakes, train, and lamp are on or off*/
                fontRendererObj.drawString("Entity name: "+StatCollector.translateToLocal(trainEntity.transportName()), 8, 8, 4210752);
                fontRendererObj.drawString("DEBUG INFO:", 8, 18, 4210752);
                fontRendererObj.drawString("Accelerator State: " + -trainEntity.getDataWatcher().getWatchableObjectInt(18), 8, 28, 4210752);
                //speed is velocity /20 to get meters per second. convert to km/h by dividing by 3.6, or mph by 2.236936293
                double speed =(Math.abs(trainEntity.motionX)+Math.abs(trainEntity.motionZ))*0.05;//*0.05 same as /20 and not prone to error on speed 0;

                if(ClientProxy.speedInKmh) {
                    fontRendererObj.drawString("speed: " + Math.floor(speed*0.27777777777) + "km/h", 8, 38, 4210752);
                } else {
                    fontRendererObj.drawString("speed: " + Math.floor(speed*0.44703999981) + "mph", 8, 38, 4210752);
                }
                fontRendererObj.drawString( "brake is " +  (((trainEntity.getBoolean(GenericRailTransport.boolValues.BRAKE))?StatCollector.translateToLocal("gui.on"):StatCollector.translateToLocal("gui.off"))), 8, 48, 4210752);
                fontRendererObj.drawString( "train is " +  (((trainEntity.getBoolean(GenericRailTransport.boolValues.RUNNING))?StatCollector.translateToLocal("gui.on"):StatCollector.translateToLocal("gui.off"))), 8, 58, 4210752);
                fontRendererObj.drawString( "lamp is " +  (((trainEntity.getBoolean(GenericRailTransport.boolValues.LAMP))?StatCollector.translateToLocal("gui.on"):StatCollector.translateToLocal("gui.off"))), 8, 68, 4210752);

                GL11.glPushMatrix();
                GL11.glScalef(0.75f,0.75f,0.75f);
                fontRendererObj.drawString("This Debug GUI is a placeholder to show info of the train until a real GUI is ready", 8, 1, 0);
                GL11.glPopMatrix();
                //draw the gui background color
                //GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                //set the texture.
                //game.renderEngine.bindTexture(URIRegistry.TEXTURE_GENERIC.getResource("null.png"));
                //draw the texture
                //drawTexturedModalRect(0, 50, 0, 150, 137, 90);
            }
        }
    }

}