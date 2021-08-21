package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.render.models.containers.Modelcontainer40;
import train.common.entity.rollingStock.HuskyStackWellcar;
import train.common.library.Info;

public class ModelHuskyStackWellcar extends ModelBase
{
    int textureX = 512;
    int textureY = 512;

    public ModelHuskyStackWellcar()
    {
        huskystackwellcarModel = new ModelRendererTurbo[46];
        huskystackwellcarModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 62
        huskystackwellcarModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 83
        huskystackwellcarModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 84
        huskystackwellcarModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 89
        huskystackwellcarModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 90
        huskystackwellcarModel[5] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 91
        huskystackwellcarModel[6] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 92
        huskystackwellcarModel[7] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 93
        huskystackwellcarModel[8] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 95
        huskystackwellcarModel[9] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 96
        huskystackwellcarModel[10] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 97
        huskystackwellcarModel[11] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 98
        huskystackwellcarModel[12] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 99
        huskystackwellcarModel[13] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 100
        huskystackwellcarModel[14] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 102
        huskystackwellcarModel[15] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 103
        huskystackwellcarModel[16] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 104
        huskystackwellcarModel[17] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 106
        huskystackwellcarModel[18] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 110
        huskystackwellcarModel[19] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 112
        huskystackwellcarModel[20] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 114
        huskystackwellcarModel[21] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 115
        huskystackwellcarModel[22] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 116
        huskystackwellcarModel[23] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 117
        huskystackwellcarModel[24] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 118
        huskystackwellcarModel[25] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 119
        huskystackwellcarModel[26] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 121
        huskystackwellcarModel[27] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 122
        huskystackwellcarModel[28] = new ModelRendererTurbo(this, 0, 44, textureX, textureY); // Box 101
        huskystackwellcarModel[29] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 57
        huskystackwellcarModel[30] = new ModelRendererTurbo(this, 422, 27, textureX, textureY); // Box 58
        huskystackwellcarModel[31] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 69
        huskystackwellcarModel[32] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 70
        huskystackwellcarModel[33] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 71
        huskystackwellcarModel[34] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 72
        huskystackwellcarModel[35] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 45
        huskystackwellcarModel[36] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 46
        huskystackwellcarModel[37] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 47
        huskystackwellcarModel[38] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 48
        huskystackwellcarModel[39] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 49
        huskystackwellcarModel[40] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 50
        huskystackwellcarModel[41] = new ModelRendererTurbo(this, 163, 25, textureX, textureY); // Box 51
        huskystackwellcarModel[42] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 52
        huskystackwellcarModel[43] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 53
        huskystackwellcarModel[44] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 54
        huskystackwellcarModel[45] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 55

        huskystackwellcarModel[0].addBox(0F, 0F, 0F, 82, 5, 1, 0F); // Box 62
        huskystackwellcarModel[0].setRotationPoint(-41F, -3F, -11F);

        huskystackwellcarModel[1].addBox(0F, 0F, 0F, 7, 1, 22, 0F); // Box 83
        huskystackwellcarModel[1].setRotationPoint(-51F, 1F, -11F);

        huskystackwellcarModel[2].addBox(0F, 0F, 0F, 9, 1, 16, 0F); // Box 84
        huskystackwellcarModel[2].setRotationPoint(-50F, 2F, -8F);

        huskystackwellcarModel[3].addBox(0F, 0F, 0F, 82, 5, 1, 0F); // Box 89
        huskystackwellcarModel[3].setRotationPoint(-41F, -3F, 10F);

        huskystackwellcarModel[4].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 90
        huskystackwellcarModel[4].setRotationPoint(-41F, 2F, 10F);

        huskystackwellcarModel[5].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
        huskystackwellcarModel[5].setRotationPoint(-41F, 2F, -11F);

        huskystackwellcarModel[6].addBox(0F, 0F, 0F, 10, 4, 20, 0F); // Box 92
        huskystackwellcarModel[6].setRotationPoint(-41F, -1F, -10F);

        huskystackwellcarModel[7].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Box 93
        huskystackwellcarModel[7].setRotationPoint(-44F, -4F, -1F);

        huskystackwellcarModel[8].addBox(0F, 0F, 0F, 4, 1, 20, 0F); // Box 95
        huskystackwellcarModel[8].setRotationPoint(-36F, -3F, -10F);

        huskystackwellcarModel[9].addBox(0F, 0F, 0F, 3, 1, 9, 0F); // Box 96
        huskystackwellcarModel[9].setRotationPoint(-44F, 0F, -11F);

        huskystackwellcarModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 97
        huskystackwellcarModel[10].setRotationPoint(-44.5F, -4.5F, 0.5F);

        huskystackwellcarModel[11].addBox(0F, 0F, 0F, 0, 4, 4, 0F); // Box 98
        huskystackwellcarModel[11].setRotationPoint(-44.5F, -6F, -1F);

        huskystackwellcarModel[12].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 99
        huskystackwellcarModel[12].setRotationPoint(36F, 2F, 10F);

        huskystackwellcarModel[13].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
        huskystackwellcarModel[13].setRotationPoint(36F, 2F, -11F);

        huskystackwellcarModel[14].addShapeBox(0F, 0F, 0F, 62, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 102
        huskystackwellcarModel[14].setRotationPoint(-31F, 2F, 10F);

        huskystackwellcarModel[15].addShapeBox(0F, 0F, 0F, 62, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
        huskystackwellcarModel[15].setRotationPoint(-31F, 2F, -11F);

        huskystackwellcarModel[16].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F); // Box 104
        huskystackwellcarModel[16].setRotationPoint(-36F, 2F, 10F);

        huskystackwellcarModel[17].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 106
        huskystackwellcarModel[17].setRotationPoint(-36F, 2F, -11F);

        huskystackwellcarModel[18].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, 0F, -1F); // Box 110
        huskystackwellcarModel[18].setRotationPoint(31F, 2F, 10F);

        huskystackwellcarModel[19].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 112
        huskystackwellcarModel[19].setRotationPoint(31F, 2F, -11F);

        huskystackwellcarModel[20].addBox(0F, 0F, 0F, 9, 1, 16, 0F); // Box 114
        huskystackwellcarModel[20].setRotationPoint(41F, 2F, -8F);

        huskystackwellcarModel[21].addBox(0F, 0F, 0F, 7, 1, 22, 0F); // Box 115
        huskystackwellcarModel[21].setRotationPoint(44F, 1F, -11F);

        huskystackwellcarModel[22].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Box 116
        huskystackwellcarModel[22].setRotationPoint(41F, -4F, -3F);

        huskystackwellcarModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 117
        huskystackwellcarModel[23].setRotationPoint(42.5F, -4.5F, -1.5F);

        huskystackwellcarModel[24].addBox(0F, 0F, 0F, 0, 4, 4, 0F); // Box 118
        huskystackwellcarModel[24].setRotationPoint(44.5F, -6F, -3F);

        huskystackwellcarModel[25].addBox(0F, 0F, 0F, 10, 4, 20, 0F); // Box 119
        huskystackwellcarModel[25].setRotationPoint(31F, -1F, -10F);

        huskystackwellcarModel[26].addBox(0F, 0F, 0F, 4, 1, 20, 0F); // Box 121
        huskystackwellcarModel[26].setRotationPoint(32F, -3F, -10F);

        huskystackwellcarModel[27].addBox(0F, 0F, 0F, 3, 1, 9, 0F); // Box 122
        huskystackwellcarModel[27].setRotationPoint(41F, 0F, 2F);

        huskystackwellcarModel[28].addBox(0F, 0F, 0F, 62, 1, 20, 0F); // Box 101
        huskystackwellcarModel[28].setRotationPoint(-31F, 7F, -10F);

        huskystackwellcarModel[29].addShapeBox(0F, 0F, 0F, 1, 6, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 57
        huskystackwellcarModel[29].setRotationPoint(-32F, 2F, -10F);

        huskystackwellcarModel[30].addShapeBox(0F, 0F, 0F, 1, 6, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 58
        huskystackwellcarModel[30].setRotationPoint(31F, 2F, -10F);

        huskystackwellcarModel[31].addBox(0F, 0F, 0F, 19, 1, 4, 0F); // Box 69
        huskystackwellcarModel[31].setRotationPoint(-50F, 3F, -2F);

        huskystackwellcarModel[32].addBox(0F, 0F, 0F, 19, 1, 4, 0F); // Box 70
        huskystackwellcarModel[32].setRotationPoint(31F, 3F, -2F);

        huskystackwellcarModel[33].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 71
        huskystackwellcarModel[33].setRotationPoint(-53F, 2F, -1.5F);

        huskystackwellcarModel[34].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 72
        huskystackwellcarModel[34].setRotationPoint(50F, 2F, -1.5F);

        huskystackwellcarModel[35].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 45
        huskystackwellcarModel[35].setRotationPoint(34F, -4F, -3F);

        huskystackwellcarModel[36].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 46
        huskystackwellcarModel[36].setRotationPoint(36F, -3F, -1.5F);

        huskystackwellcarModel[37].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 47
        huskystackwellcarModel[37].setRotationPoint(-41F, -3F, -10F);

        huskystackwellcarModel[38].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 48
        huskystackwellcarModel[38].setRotationPoint(-41F, -3F, 8F);

        huskystackwellcarModel[39].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 49
        huskystackwellcarModel[39].setRotationPoint(36F, -3F, 8F);

        huskystackwellcarModel[40].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 50
        huskystackwellcarModel[40].setRotationPoint(36F, -3F, -10F);

        huskystackwellcarModel[41].addBox(0F, 0F, 0F, 5, 13, 0, 0F); // Box 51
        huskystackwellcarModel[41].setRotationPoint(-50F, -7F, -11.01F);

        huskystackwellcarModel[42].addBox(0F, 0F, 0F, 5, 13, 0, 0F); // Box 52
        huskystackwellcarModel[42].setRotationPoint(45F, -7F, -11.01F);

        huskystackwellcarModel[43].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 53
        huskystackwellcarModel[43].setRotationPoint(-40F, -4F, 0F);

        huskystackwellcarModel[44].addBox(0F, 0F, 0F, 5, 13, 0, 0F); // Box 54
        huskystackwellcarModel[44].setRotationPoint(-50F, -7F, 11.01F);

        huskystackwellcarModel[45].addBox(0F, 0F, 0F, 5, 13, 0, 0F); // Box 55
        huskystackwellcarModel[45].setRotationPoint(45F, -7F, 11.01F);

    }

    Model70Truck bogie = new Model70Truck();
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 46; i++)
        {
            huskystackwellcarModel[i].render(f5);
        }
        Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70truck_Black.png"));

        GL11.glPushMatrix();
        GL11.glScalef(1F,1F,1f);
        GL11.glTranslated(-2.7,0.51,-0.4);
        bogie.render(entity,f,f1,f2,f3,f4,f5);

        GL11.glTranslated(5.15,0,0.03);
        bogie.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();

        if (entity instanceof HuskyStackWellcar) {
            HuskyStackWellcar wellcar = (HuskyStackWellcar)entity;
            if (wellcar.container1 != null && wellcar.container1.theType.equals("FortyFootContainer")) {
                Modelcontainer40 theContainer = new Modelcontainer40();
                Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/container40_" + wellcar.container1.color + ".png"));

                GL11.glPushMatrix();
                GL11.glScalef(1,1,0.9f);
                GL11.glTranslated(0,0,0);
                theContainer.render(entity, f, f1, f2, f3, f4, f5);
                GL11.glPopMatrix();
            }
            if (wellcar.container2 != null && wellcar.container2.theType.equals("FortyFootContainer")) {
                Modelcontainer40 theContainer = new Modelcontainer40();
                Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/container40_" + wellcar.container2.color + ".png"));

                GL11.glPushMatrix();
                GL11.glScalef(1,1,0.9f);
                GL11.glTranslated(0,-1.313,0);
                theContainer.render(entity, f, f1, f2, f3, f4, f5);
                GL11.glPopMatrix();
            }
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo huskystackwellcarModel[];

}