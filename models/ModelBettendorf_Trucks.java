//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PRR X31a Wagon Top
// Model Creator:
// Created on:20.08.2017 - 10:25:49
// Last changed on: 20.08.2017 - 10:25:49

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelBettendorf_Trucks extends ModelBase
{
    int textureX = 64;
    int textureY = 64;

    public ModelBettendorf_Trucks()
    {
        bettendorf_trucksModel = new ModelRendererTurbo[23];
        bettendorf_trucksModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 104
        bettendorf_trucksModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 105
        bettendorf_trucksModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 106
        bettendorf_trucksModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 107
        bettendorf_trucksModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 108
        bettendorf_trucksModel[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 109
        bettendorf_trucksModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 110
        bettendorf_trucksModel[7] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 111
        bettendorf_trucksModel[8] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 112
        bettendorf_trucksModel[9] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 114
        bettendorf_trucksModel[10] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 115
        bettendorf_trucksModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 116
        bettendorf_trucksModel[12] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 117
        bettendorf_trucksModel[13] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 118
        bettendorf_trucksModel[14] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 119
        bettendorf_trucksModel[15] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 120
        bettendorf_trucksModel[16] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 121
        bettendorf_trucksModel[17] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 122
        bettendorf_trucksModel[18] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 123
        bettendorf_trucksModel[19] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 124
        bettendorf_trucksModel[20] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 125
        bettendorf_trucksModel[21] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 126
        bettendorf_trucksModel[22] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 127

        bettendorf_trucksModel[0].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 104
        bettendorf_trucksModel[0].setRotationPoint(-9F, -6F, -6F);

        bettendorf_trucksModel[1].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 105
        bettendorf_trucksModel[1].setRotationPoint(-9F, -6F, 6F);

        bettendorf_trucksModel[2].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 106
        bettendorf_trucksModel[2].setRotationPoint(3F, -6F, -6F);

        bettendorf_trucksModel[3].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 107
        bettendorf_trucksModel[3].setRotationPoint(3F, -6F, 6F);

        bettendorf_trucksModel[4].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 108
        bettendorf_trucksModel[4].setRotationPoint(5.5F, -3.5F, -7F);

        bettendorf_trucksModel[5].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 109
        bettendorf_trucksModel[5].setRotationPoint(-6.5F, -3.5F, -7F);

        bettendorf_trucksModel[6].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
        bettendorf_trucksModel[6].setRotationPoint(-7F, -4.25F, -7.5F);

        bettendorf_trucksModel[7].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
        bettendorf_trucksModel[7].setRotationPoint(5F, -4.25F, -7.5F);

        bettendorf_trucksModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
        bettendorf_trucksModel[8].setRotationPoint(-0.5F, -3.75F, -8F);

        bettendorf_trucksModel[9].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
        bettendorf_trucksModel[9].setRotationPoint(-1.5F, -5.25F, -7.5F);

        bettendorf_trucksModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
        bettendorf_trucksModel[10].setRotationPoint(-1F, -4.75F, -8F);

        bettendorf_trucksModel[11].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 116
        bettendorf_trucksModel[11].setRotationPoint(1.5F, -5.25F, -7.5F);

        bettendorf_trucksModel[12].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 117
        bettendorf_trucksModel[12].setRotationPoint(-5.5F, -5.25F, -7.5F);

        bettendorf_trucksModel[13].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 118
        bettendorf_trucksModel[13].setRotationPoint(1.5F, -3.25F, -7.5F);

        bettendorf_trucksModel[14].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 119
        bettendorf_trucksModel[14].setRotationPoint(-5.5F, -3.25F, -7.5F);

        bettendorf_trucksModel[15].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 120
        bettendorf_trucksModel[15].setRotationPoint(-7F, -4.25F, 6.5F);

        bettendorf_trucksModel[16].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 121
        bettendorf_trucksModel[16].setRotationPoint(-5.5F, -3.25F, 6.5F);

        bettendorf_trucksModel[17].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 122
        bettendorf_trucksModel[17].setRotationPoint(-5.5F, -5.25F, 6.5F);

        bettendorf_trucksModel[18].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
        bettendorf_trucksModel[18].setRotationPoint(-1.5F, -5.25F, 6.5F);

        bettendorf_trucksModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
        bettendorf_trucksModel[19].setRotationPoint(-0.5F, -3.75F, 7F);

        bettendorf_trucksModel[20].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 125
        bettendorf_trucksModel[20].setRotationPoint(1.5F, -3.25F, 6.5F);

        bettendorf_trucksModel[21].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 126
        bettendorf_trucksModel[21].setRotationPoint(1.5F, -5.25F, 6.5F);

        bettendorf_trucksModel[22].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 127
        bettendorf_trucksModel[22].setRotationPoint(5F, -4.25F, 6.5F);


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 23; i++)
        {
            bettendorf_trucksModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo bettendorf_trucksModel[];
}