//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model:
// Model Creator: Vladimir Lenin
// Created on:04.09.2017 - 12:12:33
// Last changed on: 04.09.2017 - 12:12:33
package train.client.render.models;

import net.minecraft.entity.Entity;
import train.client.tmt.ModelBase;
import train.client.tmt.ModelRendererTurbo;

public class ModelGS4Tender extends ModelBase
{
    int textureX = 512;
    int textureY = 64;

    public ModelGS4Tender()
    {
        gs4tenderModel = new ModelRendererTurbo[23];
        gs4tenderModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 01
        gs4tenderModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // 02
        gs4tenderModel[2] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // 03
        gs4tenderModel[3] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // 04
        gs4tenderModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 05
        gs4tenderModel[5] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // 06
        gs4tenderModel[6] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // 07
        gs4tenderModel[7] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // 08
        gs4tenderModel[8] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // 09
        gs4tenderModel[9] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // 10
        gs4tenderModel[10] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // 11
        gs4tenderModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // 12
        gs4tenderModel[12] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // 13
        gs4tenderModel[13] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // 14
        gs4tenderModel[14] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // 15
        gs4tenderModel[15] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // 16
        gs4tenderModel[16] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // 17
        gs4tenderModel[17] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // 18
        gs4tenderModel[18] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // 19
        gs4tenderModel[19] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // 20
        gs4tenderModel[20] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // 21
        gs4tenderModel[21] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // 22
        gs4tenderModel[22] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // 23

        gs4tenderModel[0].addBox(0F, 0F, 0F, 76, 24, 22, 0F); // 01
        gs4tenderModel[0].setRotationPoint(-38F, -19F, -11F);

        gs4tenderModel[1].addShapeBox(0F, 0F, 0F, 51, 1, 22, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 02
        gs4tenderModel[1].setRotationPoint(-38F, -20F, -11F);

        gs4tenderModel[2].addShapeBox(0F, 0F, 0F, 51, 1, 14, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 03
        gs4tenderModel[2].setRotationPoint(-38F, -21F, -7F);

        gs4tenderModel[3].addShapeBox(0F, 0F, 0F, 27, 3, 22, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 04
        gs4tenderModel[3].setRotationPoint(11F, -22F, -11F);

        gs4tenderModel[4].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // 05
        gs4tenderModel[4].setRotationPoint(-39F, -19F, -2F);

        gs4tenderModel[5].addBox(0F, 0F, 0F, 80, 3, 2, 0F); // 06
        gs4tenderModel[5].setRotationPoint(-40F, 3F, -1F);

        gs4tenderModel[6].addBox(0F, 0F, 0F, 27, 3, 10, 0F); // 07
        gs4tenderModel[6].setRotationPoint(-36F, 5F, -5F);

        gs4tenderModel[7].addBox(0F, 0F, 0F, 27, 3, 10, 0F); // 08
        gs4tenderModel[7].setRotationPoint(9F, 5F, -5F);

        gs4tenderModel[8].addBox(0F, 0F, 0F, 23, 2, 14, 0F); // 09
        gs4tenderModel[8].setRotationPoint(-34F, 6F, -7F);

        gs4tenderModel[9].addBox(0F, 0F, 0F, 23, 2, 14, 0F); // 10
        gs4tenderModel[9].setRotationPoint(11F, 6F, -7F);

        gs4tenderModel[10].addBox(0F, 0F, 0F, 16, 3, 10, 0F); // 11
        gs4tenderModel[10].setRotationPoint(-8F, 5F, -5F);

        gs4tenderModel[11].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 12
        gs4tenderModel[11].setRotationPoint(10F, 5F, 6F);

        gs4tenderModel[12].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 13
        gs4tenderModel[12].setRotationPoint(30F, 5F, 6F);

        gs4tenderModel[13].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 14
        gs4tenderModel[13].setRotationPoint(20F, 5F, 6F);

        gs4tenderModel[14].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 15
        gs4tenderModel[14].setRotationPoint(-35F, 5F, 6F);

        gs4tenderModel[15].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 16
        gs4tenderModel[15].setRotationPoint(-15F, 5F, 6F);

        gs4tenderModel[16].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 17
        gs4tenderModel[16].setRotationPoint(-25F, 5F, 6F);

        gs4tenderModel[17].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 18
        gs4tenderModel[17].setRotationPoint(10F, 5F, -6F);

        gs4tenderModel[18].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 19
        gs4tenderModel[18].setRotationPoint(30F, 5F, -6F);

        gs4tenderModel[19].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 20
        gs4tenderModel[19].setRotationPoint(20F, 5F, -6F);

        gs4tenderModel[20].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 21
        gs4tenderModel[20].setRotationPoint(-35F, 5F, -6F);

        gs4tenderModel[21].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 22
        gs4tenderModel[21].setRotationPoint(-15F, 5F, -6F);

        gs4tenderModel[22].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // 23
        gs4tenderModel[22].setRotationPoint(-25F, 5F, -6F);


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 23; i++)
        {
            gs4tenderModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo gs4tenderModel[];
}
