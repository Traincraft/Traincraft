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

public class ModelGS4Loco extends ModelBase
{
    int textureX = 512;
    int textureY = 256;

    public ModelGS4Loco()
    {
        gs4locoModel = new ModelRendererTurbo[1];
        gs4locoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 152

        gs4locoModel[0].addBox(0F, 0F, 0F, 120, 36, 22, 0F); // Box 152
        gs4locoModel[0].setRotationPoint(-107F, -26F, -11F);

    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(ModelRendererTurbo m : gs4locoModel)
        {
            m.render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo gs4locoModel[];
}