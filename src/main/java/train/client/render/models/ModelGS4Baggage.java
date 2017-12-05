//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model:
// Model Creator: Vladimir Lenin
// Created on:04.09.2017 - 12:12:33
// Last changed on: 04.09.2017 - 12:12:33
package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelGS4Baggage extends ModelBase
{
    int textureX = 512;
    int textureY = 256;

    public ModelGS4Baggage()
    {
        gs4baggageModel = new ModelRendererTurbo[37];
        gs4baggageModel[0] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 1
        gs4baggageModel[1] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 1
        gs4baggageModel[2] = new ModelRendererTurbo(this, 1, 199, textureX, textureY); // Box 1
        gs4baggageModel[3] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 1
        gs4baggageModel[4] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 1
        gs4baggageModel[5] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 1
        gs4baggageModel[6] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 1
        gs4baggageModel[7] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 1
        gs4baggageModel[8] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 1
        gs4baggageModel[9] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 1
        gs4baggageModel[10] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 1
        gs4baggageModel[11] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 1
        gs4baggageModel[12] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 1
        gs4baggageModel[13] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 1
        gs4baggageModel[14] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 1
        gs4baggageModel[15] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 1
        gs4baggageModel[16] = new ModelRendererTurbo(this, 1, 125, textureX, textureY); // Box 1
        gs4baggageModel[17] = new ModelRendererTurbo(this, 69, 133, textureX, textureY); // Box 1
        gs4baggageModel[18] = new ModelRendererTurbo(this, 54, 125, textureX, textureY); // Box 1
        gs4baggageModel[19] = new ModelRendererTurbo(this, 173, 125, textureX, textureY); // Box 25
        gs4baggageModel[20] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 56
        gs4baggageModel[21] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 1
        gs4baggageModel[22] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 1
        gs4baggageModel[23] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 1
        gs4baggageModel[24] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 1
        gs4baggageModel[25] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 1
        gs4baggageModel[26] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 1
        gs4baggageModel[27] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 1
        gs4baggageModel[28] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 1
        gs4baggageModel[29] = new ModelRendererTurbo(this, 173, 155, textureX, textureY); // Box 72
        gs4baggageModel[30] = new ModelRendererTurbo(this, 69, 163, textureX, textureY); // Box 73
        gs4baggageModel[31] = new ModelRendererTurbo(this, 1, 155, textureX, textureY); // Box 74
        gs4baggageModel[32] = new ModelRendererTurbo(this, 54, 155, textureX, textureY); // Box 75
        gs4baggageModel[33] = new ModelRendererTurbo(this, 0, 74, textureX, textureY); // Box 76
        gs4baggageModel[34] = new ModelRendererTurbo(this, 0, 74, textureX, textureY); // Box 77
        gs4baggageModel[35] = new ModelRendererTurbo(this, 0, 74, textureX, textureY); // Box 78
        gs4baggageModel[36] = new ModelRendererTurbo(this, 0, 74, textureX, textureY); // Box 79

        gs4baggageModel[0].addBox(0F, 0F, 0F, 1, 26, 20, 0F); // Box 1
        gs4baggageModel[0].setRotationPoint(-54F, -24F, -10F);

        gs4baggageModel[1].addBox(0F, 0F, 0F, 1, 26, 20, 0F); // Box 1
        gs4baggageModel[1].setRotationPoint(53F, -24F, -10F);

        gs4baggageModel[2].addShapeBox(0F, 0F, 0F, 108, 3, 22, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
        gs4baggageModel[2].setRotationPoint(-54F, -27F, -11F);

        gs4baggageModel[3].addShapeBox(0F, 0F, 0F, 108, 1, 12, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
        gs4baggageModel[3].setRotationPoint(-54F, -28F, -6F);

        gs4baggageModel[4].addBox(0F, 0F, 0F, 6, 5, 22, 0F); // Box 1
        gs4baggageModel[4].setRotationPoint(-54F, 3F, -11F);

        gs4baggageModel[5].addShapeBox(0F, 0F, 0F, 5, 5, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 1
        gs4baggageModel[5].setRotationPoint(-48F, 3F, -11F);

        gs4baggageModel[6].addBox(0F, 0F, 0F, 6, 5, 22, 0F); // Box 1
        gs4baggageModel[6].setRotationPoint(48F, 3F, -11F);

        gs4baggageModel[7].addShapeBox(0F, 0F, 0F, 5, 5, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 1
        gs4baggageModel[7].setRotationPoint(43F, 3F, -11F);

        gs4baggageModel[8].addShapeBox(0F, 0F, 0F, 3, 5, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 1
        gs4baggageModel[8].setRotationPoint(16F, 3F, -11F);

        gs4baggageModel[9].addShapeBox(0F, 0F, 0F, 35, 5, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 1
        gs4baggageModel[9].setRotationPoint(-19F, 3F, -11F);

        gs4baggageModel[10].addBox(0F, 0F, 0F, 24, 4, 12, 0F); // Box 1
        gs4baggageModel[10].setRotationPoint(-43F, 3F, -6F);

        gs4baggageModel[11].addBox(0F, 0F, 0F, 20, 2, 14, 0F); // Box 1
        gs4baggageModel[11].setRotationPoint(-41F, 6F, -7F);

        gs4baggageModel[12].addBox(0F, 0F, 0F, 20, 2, 14, 0F); // Box 1
        gs4baggageModel[12].setRotationPoint(21F, 6F, -7F);

        gs4baggageModel[13].addBox(0F, 0F, 0F, 24, 4, 12, 0F); // Box 1
        gs4baggageModel[13].setRotationPoint(19F, 3F, -6F);

        gs4baggageModel[14].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 1
        gs4baggageModel[14].setRotationPoint(54F, 1F, -1F);

        gs4baggageModel[15].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 1
        gs4baggageModel[15].setRotationPoint(-57F, 1F, -1F);

        gs4baggageModel[16].addBox(0F, 0F, 0F, 25, 26, 1, 0F); // Box 1
        gs4baggageModel[16].setRotationPoint(-54F, -24F, -11F);

        gs4baggageModel[17].addBox(0F, 0F, 0F, 26, 20, 1, 0F); // Box 1
        gs4baggageModel[17].setRotationPoint(-13F, -18F, -11F);

        gs4baggageModel[18].addBox(0F, 0F, 0F, 58, 6, 1, 0F); // Box 1
        gs4baggageModel[18].setRotationPoint(-29F, -24F, -11F);

        gs4baggageModel[19].addBox(0F, 0F, 0F, 25, 26, 1, 0F); // Box 25
        gs4baggageModel[19].setRotationPoint(29F, -24F, -11F);

        gs4baggageModel[20].addBox(0F, 0F, 0F, 108, 1, 22, 0F); // Box 56
        gs4baggageModel[20].setRotationPoint(-54F, 2F, -11F);

        gs4baggageModel[21].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
        gs4baggageModel[21].setRotationPoint(37F, 4F, 7F);

        gs4baggageModel[22].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
        gs4baggageModel[22].setRotationPoint(19F, 4F, -7F);

        gs4baggageModel[23].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
        gs4baggageModel[23].setRotationPoint(37F, 4F, -7F);

        gs4baggageModel[24].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
        gs4baggageModel[24].setRotationPoint(19F, 4F, 7F);

        gs4baggageModel[25].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
        gs4baggageModel[25].setRotationPoint(-25F, 4F, 7F);

        gs4baggageModel[26].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
        gs4baggageModel[26].setRotationPoint(-43F, 4F, -7F);

        gs4baggageModel[27].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
        gs4baggageModel[27].setRotationPoint(-25F, 4F, -7F);

        gs4baggageModel[28].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
        gs4baggageModel[28].setRotationPoint(-43F, 4F, 7F);

        gs4baggageModel[29].addBox(0F, 0F, 0F, 25, 26, 1, 0F); // Box 72
        gs4baggageModel[29].setRotationPoint(29F, -24F, 10F);

        gs4baggageModel[30].addBox(0F, 0F, 0F, 26, 20, 1, 0F); // Box 73
        gs4baggageModel[30].setRotationPoint(-13F, -18F, 10F);

        gs4baggageModel[31].addBox(0F, 0F, 0F, 25, 26, 1, 0F); // Box 74
        gs4baggageModel[31].setRotationPoint(-54F, -24F, 10F);

        gs4baggageModel[32].addBox(0F, 0F, 0F, 58, 6, 1, 0F); // Box 75
        gs4baggageModel[32].setRotationPoint(-29F, -24F, 10F);

        gs4baggageModel[33].addBox(0F, 0F, 0F, 16, 20, 0, 0F); // Box 76
        gs4baggageModel[33].setRotationPoint(-29F, -18F, -10.5F);

        gs4baggageModel[34].addBox(0F, 0F, 0F, 16, 20, 0, 0F); // Box 77
        gs4baggageModel[34].setRotationPoint(-29F, -18F, 10.5F);

        gs4baggageModel[35].addBox(0F, 0F, 0F, 16, 20, 0, 0F); // Box 78
        gs4baggageModel[35].setRotationPoint(13F, -18F, 10.5F);

        gs4baggageModel[36].addBox(0F, 0F, 0F, 16, 20, 0, 0F); // Box 79
        gs4baggageModel[36].setRotationPoint(13F, -18F, -10.5F);


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 37; i++)
        {
            gs4baggageModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo gs4baggageModel[];
}
