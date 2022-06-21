//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model:
// Model Creator:
// Created on:05.06.2020 - 13:20:15
// Last changed on: 05.06.2020 - 13:20:15

package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;

public class ModelPCH120Car extends ModelBase
{
    int textureX = 512;
    int textureY = 512;

    public ModelPCH120Car()
    {
        pch120carModel = new ModelRendererTurbo[73];
        pch120carModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        pch120carModel[1] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 68
        pch120carModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 74
        pch120carModel[3] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 75
        pch120carModel[4] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 76
        pch120carModel[5] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 77
        pch120carModel[6] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 183
        pch120carModel[7] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 184
        pch120carModel[8] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 185
        pch120carModel[9] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 186
        pch120carModel[10] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 187
        pch120carModel[11] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 191 door slide right
        pch120carModel[12] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 192
        pch120carModel[13] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 193
        pch120carModel[14] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 195
        pch120carModel[15] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 196
        pch120carModel[16] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 197
        pch120carModel[17] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 198
        pch120carModel[18] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 199
        pch120carModel[19] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 200
        pch120carModel[20] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 201
        pch120carModel[21] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 202
        pch120carModel[22] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 203
        pch120carModel[23] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 204
        pch120carModel[24] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 205
        pch120carModel[25] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 206
        pch120carModel[26] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 207
        pch120carModel[27] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 212
        pch120carModel[28] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 279
        pch120carModel[29] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 280
        pch120carModel[30] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 281 glow
        pch120carModel[31] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 282 glow
        pch120carModel[32] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 283 glow
        pch120carModel[33] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 284 glow
        pch120carModel[34] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 361
        pch120carModel[35] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 362
        pch120carModel[36] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 363
        pch120carModel[37] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 364
        pch120carModel[38] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 206
        pch120carModel[39] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 366
        pch120carModel[40] = new ModelRendererTurbo(this, 59, 87, textureX, textureY); // Box 80
        pch120carModel[41] = new ModelRendererTurbo(this, 79, 90, textureX, textureY); // Box 81
        pch120carModel[42] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 82
        pch120carModel[43] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 84
        pch120carModel[44] = new ModelRendererTurbo(this, 124, 78, textureX, textureY); // Box 85
        pch120carModel[45] = new ModelRendererTurbo(this, 124, 78, textureX, textureY); // Box 86
        pch120carModel[46] = new ModelRendererTurbo(this, 59, 87, textureX, textureY); // Box 87
        pch120carModel[47] = new ModelRendererTurbo(this, 79, 90, textureX, textureY); // Box 88
        pch120carModel[48] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 89
        pch120carModel[49] = new ModelRendererTurbo(this, 124, 78, textureX, textureY); // Box 90
        pch120carModel[50] = new ModelRendererTurbo(this, 59, 87, textureX, textureY); // Box 91
        pch120carModel[51] = new ModelRendererTurbo(this, 79, 90, textureX, textureY); // Box 92
        pch120carModel[52] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 93
        pch120carModel[53] = new ModelRendererTurbo(this, 124, 78, textureX, textureY); // Box 94
        pch120carModel[54] = new ModelRendererTurbo(this, 79, 90, textureX, textureY); // Box 95
        pch120carModel[55] = new ModelRendererTurbo(this, 79, 90, textureX, textureY); // Box 96
        pch120carModel[56] = new ModelRendererTurbo(this, 79, 90, textureX, textureY); // Box 97
        pch120carModel[57] = new ModelRendererTurbo(this, 59, 87, textureX, textureY); // Box 98
        pch120carModel[58] = new ModelRendererTurbo(this, 59, 87, textureX, textureY); // Box 99
        pch120carModel[59] = new ModelRendererTurbo(this, 59, 87, textureX, textureY); // Box 100
        pch120carModel[60] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 101
        pch120carModel[61] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 102
        pch120carModel[62] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 103
        pch120carModel[63] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 104
        pch120carModel[64] = new ModelRendererTurbo(this, 124, 78, textureX, textureY); // Box 105
        pch120carModel[65] = new ModelRendererTurbo(this, 124, 78, textureX, textureY); // Box 106
        pch120carModel[66] = new ModelRendererTurbo(this, 124, 78, textureX, textureY); // Box 107
        pch120carModel[67] = new ModelRendererTurbo(this, 124, 78, textureX, textureY); // Box 108
        pch120carModel[68] = new ModelRendererTurbo(this, 163, 77, textureX, textureY); // Box 112
        pch120carModel[69] = new ModelRendererTurbo(this, 163, 77, textureX, textureY); // Box 113
        pch120carModel[70] = new ModelRendererTurbo(this, 424, 74, textureX, textureY); // Box 112
        pch120carModel[71] = new ModelRendererTurbo(this, 128, 15, textureX, textureY); // Box 113
        pch120carModel[72] = new ModelRendererTurbo(this, 128, 6, textureX, textureY); // Box 114

        pch120carModel[0].addBox(0F, 0F, 0F, 63, 1, 1, 0F); // Box 0
        pch120carModel[0].setRotationPoint(-32F, 0F, -11F);

        pch120carModel[1].addBox(0F, 0F, 0F, 5, 19, 1, 0F); // Box 68
        pch120carModel[1].setRotationPoint(-32F, -20F, -11F);

        pch120carModel[2].addBox(0F, 0F, 0F, 1, 20, 6, 0F); // Box 74
        pch120carModel[2].setRotationPoint(-32F, -20F, -10F);

        pch120carModel[3].addBox(0F, 0F, 0F, 1, 20, 6, 0F); // Box 75
        pch120carModel[3].setRotationPoint(-32F, -20F, 4F);

        pch120carModel[4].addBox(0F, 0F, 0F, 63, 1, 8, 0F); // Box 76
        pch120carModel[4].setRotationPoint(-32F, -1F, -4F);

        pch120carModel[5].addBox(0F, 0F, 0F, 63, 1, 1, 0F); // Box 77
        pch120carModel[5].setRotationPoint(-32F, 0F, 10F);

        pch120carModel[6].addShapeBox(0F, 0F, 0F, 63, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
        pch120carModel[6].setRotationPoint(-32F, -22F, -11F);

        pch120carModel[7].addShapeBox(0F, 0F, 0F, 63, 1, 6, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
        pch120carModel[7].setRotationPoint(-32F, -23F, -9F);

        pch120carModel[8].addShapeBox(0F, 0F, 0F, 63, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
        pch120carModel[8].setRotationPoint(-32F, -22F, 9F);

        pch120carModel[9].addShapeBox(0F, 0F, 0F, 63, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
        pch120carModel[9].setRotationPoint(-32F, -23F, 3F);

        pch120carModel[10].addBox(0F, 0F, 0F, 63, 1, 6, 0F); // Box 187
        pch120carModel[10].setRotationPoint(-32F, -23F, -3F);

        pch120carModel[11].addShapeBox(0F, 0F, 0F, 8, 19, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 191 door slide right
        pch120carModel[11].setRotationPoint(-27F, -20F, -11F);

        pch120carModel[12].addBox(0F, 0F, 0F, 37, 19, 1, 0F); // Box 192
        pch120carModel[12].setRotationPoint(-19F, -20F, -11F);

        pch120carModel[13].addBox(0F, 0F, 0F, 5, 19, 1, 0F); // Box 193
        pch120carModel[13].setRotationPoint(26F, -20F, -11F);

        pch120carModel[14].addBox(0F, 0F, 0F, 63, 1, 7, 0F); // Box 195
        pch120carModel[14].setRotationPoint(-32F, -1F, -11F);

        pch120carModel[15].addBox(0F, 0F, 0F, 63, 1, 7, 0F); // Box 196
        pch120carModel[15].setRotationPoint(-32F, -1F, 4F);

        pch120carModel[16].addShapeBox(0F, 0F, 0F, 8, 19, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 197
        pch120carModel[16].setRotationPoint(18F, -20F, -11F);

        pch120carModel[17].addShapeBox(0F, 0F, 0F, 8, 19, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 198
        pch120carModel[17].setRotationPoint(18F, -20F, 10F);

        pch120carModel[18].addBox(0F, 0F, 0F, 5, 19, 1, 0F); // Box 199
        pch120carModel[18].setRotationPoint(26F, -20F, 10F);

        pch120carModel[19].addBox(0F, 0F, 0F, 37, 19, 1, 0F); // Box 200
        pch120carModel[19].setRotationPoint(-19F, -20F, 10F);

        pch120carModel[20].addShapeBox(0F, 0F, 0F, 8, 19, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 201
        pch120carModel[20].setRotationPoint(-27F, -20F, 10F);

        pch120carModel[21].addBox(0F, 0F, 0F, 5, 19, 1, 0F); // Box 202
        pch120carModel[21].setRotationPoint(-32F, -20F, 10F);

        pch120carModel[22].addShapeBox(0F, 0F, 0F, 1, 19, 8, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 203
        pch120carModel[22].setRotationPoint(-32F, -20F, -4F);

        pch120carModel[23].addShapeBox(0F, 0F, 0F, 1, 19, 8, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 204
        pch120carModel[23].setRotationPoint(30F, -20F, -4F);

        pch120carModel[24].addBox(0F, 0F, 0F, 1, 19, 6, 0F); // Box 205
        pch120carModel[24].setRotationPoint(30F, -20F, -10F);

        pch120carModel[25].addBox(0F, 0F, 0F, 1, 19, 6, 0F); // Box 206
        pch120carModel[25].setRotationPoint(30F, -20F, 4F);

        pch120carModel[26].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 207
        pch120carModel[26].setRotationPoint(30F, -22F, -9F);

        pch120carModel[27].addShapeBox(0F, 0F, 0F, 63, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
        pch120carModel[27].setRotationPoint(-32F, 0F, -4F);

        pch120carModel[28].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 279
        pch120carModel[28].setRotationPoint(30F, 0F, 4F);

        pch120carModel[29].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 280
        pch120carModel[29].setRotationPoint(30F, 0F, -10F);

        pch120carModel[30].addBox(0F, 0F, 0F, 61, 1, 1, 0F); // Box 281 glow
        pch120carModel[30].setRotationPoint(-31F, -22F, -9F);

        pch120carModel[31].addShapeBox(0F, 0F, 0F, 61, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 282 glow
        pch120carModel[31].setRotationPoint(-31F, -21F, -9F);

        pch120carModel[32].addBox(0F, 0F, 0F, 61, 1, 1, 0F); // Box 283 glow
        pch120carModel[32].setRotationPoint(-31F, -22F, 8F);

        pch120carModel[33].addShapeBox(0F, 0F, 0F, 61, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284 glow
        pch120carModel[33].setRotationPoint(-31F, -21F, 8F);

        pch120carModel[34].addBox(0F, 0F, 0F, 7, 3, 20, 0F); // Box 361
        pch120carModel[34].setRotationPoint(-8F, 1F, -10F);

        pch120carModel[35].addBox(0F, 0F, 0F, 4, 3, 20, 0F); // Box 362
        pch120carModel[35].setRotationPoint(3F, 1F, -10F);

        pch120carModel[36].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 363
        pch120carModel[36].setRotationPoint(-20F, 0F, -10F);

        pch120carModel[37].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 364
        pch120carModel[37].setRotationPoint(17F, 0F, -10F);

        pch120carModel[38].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 206
        pch120carModel[38].setRotationPoint(-34F, 0F, -1.5F);

        pch120carModel[39].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 366
        pch120carModel[39].setRotationPoint(31F, 0F, -1.5F);

        pch120carModel[40].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 80
        pch120carModel[40].setRotationPoint(-18F, -10F, -10F);

        pch120carModel[41].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 81
        pch120carModel[41].setRotationPoint(-18F, -4F, -10F);

        pch120carModel[42].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
        pch120carModel[42].setRotationPoint(-19F, -9F, -10F);

        pch120carModel[43].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
        pch120carModel[43].setRotationPoint(-7F, -9F, -10F);

        pch120carModel[44].addBox(0F, 0F, 0F, 1, 21, 0, 0F); // Box 85
        pch120carModel[44].setRotationPoint(-19F, -22F, -3.99F);

        pch120carModel[45].addBox(0F, 0F, 0F, 1, 21, 0, 0F); // Box 86
        pch120carModel[45].setRotationPoint(-7F, -22F, -3.99F);

        pch120carModel[46].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 87
        pch120carModel[46].setRotationPoint(-6F, -10F, -10F);

        pch120carModel[47].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 88
        pch120carModel[47].setRotationPoint(-6F, -4F, -10F);

        pch120carModel[48].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
        pch120carModel[48].setRotationPoint(5F, -9F, -10F);

        pch120carModel[49].addBox(0F, 0F, 0F, 1, 21, 0, 0F); // Box 90
        pch120carModel[49].setRotationPoint(5F, -22F, -3.99F);

        pch120carModel[50].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 91
        pch120carModel[50].setRotationPoint(6F, -10F, -10F);

        pch120carModel[51].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 92
        pch120carModel[51].setRotationPoint(6F, -4F, -10F);

        pch120carModel[52].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
        pch120carModel[52].setRotationPoint(17F, -9F, -10F);

        pch120carModel[53].addBox(0F, 0F, 0F, 1, 21, 0, 0F); // Box 94
        pch120carModel[53].setRotationPoint(17F, -22F, -3.99F);

        pch120carModel[54].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 95
        pch120carModel[54].setRotationPoint(-6F, -4F, 4F);

        pch120carModel[55].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 96
        pch120carModel[55].setRotationPoint(6F, -4F, 4F);

        pch120carModel[56].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 97
        pch120carModel[56].setRotationPoint(-18F, -4F, 4F);

        pch120carModel[57].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
        pch120carModel[57].setRotationPoint(-18F, -10F, 9F);

        pch120carModel[58].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
        pch120carModel[58].setRotationPoint(-6F, -10F, 9F);

        pch120carModel[59].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
        pch120carModel[59].setRotationPoint(6F, -10F, 9F);

        pch120carModel[60].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 101
        pch120carModel[60].setRotationPoint(5F, -9F, 4F);

        pch120carModel[61].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 102
        pch120carModel[61].setRotationPoint(17F, -9F, 4F);

        pch120carModel[62].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 103
        pch120carModel[62].setRotationPoint(-7F, -9F, 4F);

        pch120carModel[63].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 104
        pch120carModel[63].setRotationPoint(-19F, -9F, 4F);

        pch120carModel[64].addBox(0F, 0F, 0F, 1, 21, 0, 0F); // Box 105
        pch120carModel[64].setRotationPoint(5F, -22F, 3.99F);

        pch120carModel[65].addBox(0F, 0F, 0F, 1, 21, 0, 0F); // Box 106
        pch120carModel[65].setRotationPoint(17F, -22F, 3.99F);

        pch120carModel[66].addBox(0F, 0F, 0F, 1, 21, 0, 0F); // Box 107
        pch120carModel[66].setRotationPoint(-19F, -22F, 3.99F);

        pch120carModel[67].addBox(0F, 0F, 0F, 1, 21, 0, 0F); // Box 108
        pch120carModel[67].setRotationPoint(-7F, -22F, 3.99F);

        pch120carModel[68].addBox(0F, 0F, 0F, 61, 2, 0, 0F); // Box 112
        pch120carModel[68].setRotationPoint(-31F, -22F, -3F);

        pch120carModel[69].addBox(0F, 0F, 0F, 61, 2, 0, 0F); // Box 113
        pch120carModel[69].setRotationPoint(-31F, -22F, 3F);

        pch120carModel[70].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 112
        pch120carModel[70].setRotationPoint(-32F, -22F, -9F);

        pch120carModel[71].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 113
        pch120carModel[71].setRotationPoint(-32F, 0F, -10F);

        pch120carModel[72].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 114
        pch120carModel[72].setRotationPoint(-32F, 0F, 4F);


    }
    ModelPCHBogie theBogie = new ModelPCHBogie();

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 73; i++)
        {
            pch120carModel[i].render(f5);
        }
        Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/pch120_bogie.png"));
        GL11.glPushMatrix();
        GL11.glTranslatef(1.1F ,0.1F,0F);
        //GL11.glScalef(0.9f,0.9f,0.8f);
        theBogie.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        GL11.glTranslated(-1F,0.1F,0);
        theBogie.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo pch120carModel[];
}