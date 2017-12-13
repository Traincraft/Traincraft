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

public class ModelGS4Tender extends ModelBase
{
    int textureX = 32;
    int textureY = 32;

    public ModelGS4Tender()
    {
        gs4tenderModel = new ModelRendererTurbo[1];
        gs4tenderModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 23

        gs4tenderModel[0].addBox(0F, 0F, 0F, 76, 24, 22, 0F); // Box 23
        gs4tenderModel[0].setRotationPoint(-24F, -19F, -11F);


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 1; i++)
        {
            gs4tenderModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo gs4tenderModel[];
}
