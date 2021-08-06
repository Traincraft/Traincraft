//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model:
// Model Creator:
// Created on: 16.07.2020 - 19:16:29
// Last changed on: 16.07.2020 - 19:16:29

package train.client.render.models.containers; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelcontainer40 extends ModelConverter //Same as Filename
{
    int textureX = 256;
    int textureY = 64;

    public Modelcontainer40() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[1];

        initbodyModel_1();

        translateAll(0F, 0F, 0F);


        flipAll();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 41, 7, textureX, textureY); // Box Container 40 foot

        bodyModel[0].addBox(0F, 0F, 0F, 54, 21, 20, 0F); // Box Container 40 foot
        bodyModel[0].setRotationPoint(-27F, -11F, -10F);
    }
}