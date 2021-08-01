//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:16.07.2020 - 19:16:29
// Last changed on: 16.07.2020 - 19:16:29

package train.client.render.models.containers;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import tmt.ModelRendererTurbo;

public class ModelA40AFootContainer extends ModelBase
{
    int textureX = 512;
    int textureY = 512;

    public ModelA40AFootContainer()
    {
        a40afootcontainerModel = new ModelRendererTurbo[1];
        a40afootcontainerModel[0] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box Container 40 foot

        a40afootcontainerModel[0].addBox(0F, 0F, 0F, 54, 21, 20, 0F); // Box Container 40 foot
        a40afootcontainerModel[0].setRotationPoint(-27F, -14F, -11F);


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 1; i++)
        {
            a40afootcontainerModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo a40afootcontainerModel[];
}