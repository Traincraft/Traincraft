//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model:
// Model Creator: Larky2k
// Created on:31.08.2017 - 09:50:57
// Last changed on: 31.08.2017 - 09:50:57
package train.client.render;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelGTNG extends ModelBase {
    int textureX = 512;
    int textureY = 128;

    public ModelGTNG() {
        gtngModel = new ModelRendererTurbo[103];
        gtngModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        gtngModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
        gtngModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
        gtngModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
        gtngModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
        gtngModel[5] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 5
        gtngModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 6
        gtngModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 7
        gtngModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 8
        gtngModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 9
        gtngModel[10] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 10
        gtngModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 11
        gtngModel[12] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 12
        gtngModel[13] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 13
        gtngModel[14] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 14
        gtngModel[15] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 15
        gtngModel[16] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 16
        gtngModel[17] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 17
        gtngModel[18] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 18
        gtngModel[19] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 19
        gtngModel[20] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 20
        gtngModel[21] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 21
        gtngModel[22] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 22
        gtngModel[23] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 23
        gtngModel[24] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 24
        gtngModel[25] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 25
        gtngModel[26] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 26
        gtngModel[27] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 27
        gtngModel[28] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 28
        gtngModel[29] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 29
        gtngModel[30] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 30
        gtngModel[31] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 31
        gtngModel[32] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 32
        gtngModel[33] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 33
        gtngModel[34] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 34
        gtngModel[35] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 35
        gtngModel[36] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 36
        gtngModel[37] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 37
        gtngModel[38] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 38
        gtngModel[39] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 39
        gtngModel[40] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 40
        gtngModel[41] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 41
        gtngModel[42] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 42
        gtngModel[43] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 43
        gtngModel[44] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 44
        gtngModel[45] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 45
        gtngModel[46] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 46
        gtngModel[47] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 47
        gtngModel[48] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 48
        gtngModel[49] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 49
        gtngModel[50] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 50
        gtngModel[51] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 51
        gtngModel[52] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 52
        gtngModel[53] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 54
        gtngModel[54] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 55
        gtngModel[55] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 56
        gtngModel[56] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 57
        gtngModel[57] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 58
        gtngModel[58] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 59
        gtngModel[59] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 60
        gtngModel[60] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 61
        gtngModel[61] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 62
        gtngModel[62] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 63
        gtngModel[63] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 64
        gtngModel[64] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 65
        gtngModel[65] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 66
        gtngModel[66] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 67
        gtngModel[67] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 68
        gtngModel[68] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 69
        gtngModel[69] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 70
        gtngModel[70] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 71
        gtngModel[71] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 72
        gtngModel[72] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 73
        gtngModel[73] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 74
        gtngModel[74] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 75
        gtngModel[75] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 76
        gtngModel[76] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 77
        gtngModel[77] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 78
        gtngModel[78] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 79
        gtngModel[79] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 80
        gtngModel[80] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 81
        gtngModel[81] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 82
        gtngModel[82] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 83
        gtngModel[83] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 84
        gtngModel[84] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 85
        gtngModel[85] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 86
        gtngModel[86] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 87
        gtngModel[87] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 88
        gtngModel[88] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 89
        gtngModel[89] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 90
        gtngModel[90] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 91
        gtngModel[91] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 92
        gtngModel[92] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 93
        gtngModel[93] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 94
        gtngModel[94] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 95
        gtngModel[95] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 96
        gtngModel[96] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 97
        gtngModel[97] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 98
        gtngModel[98] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 99
        gtngModel[99] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 100
        gtngModel[100] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 101
        gtngModel[101] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 102
        gtngModel[102] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 103

        gtngModel[0].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 0
        gtngModel[0].setRotationPoint(-29F, 5F, -6F);

        gtngModel[1].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 1
        gtngModel[1].setRotationPoint(-29F, 5F, 6F);

        gtngModel[2].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 2
        gtngModel[2].setRotationPoint(-19F, 5F, 6F);

        gtngModel[3].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 3
        gtngModel[3].setRotationPoint(-19F, 5F, -6F);

        gtngModel[4].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 4
        gtngModel[4].setRotationPoint(-27F, 7F, -6F);

        gtngModel[5].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 5
        gtngModel[5].setRotationPoint(-17F, 7F, -6F);

        gtngModel[6].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 6
        gtngModel[6].setRotationPoint(-28F, 6F, 6F);

        gtngModel[7].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 7
        gtngModel[7].setRotationPoint(-18F, 6F, 6F);

        gtngModel[8].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 8
        gtngModel[8].setRotationPoint(-23F, 5F, 6F);

        gtngModel[9].addBox(0F, 0F, 0F, 13, 0, 1, 0F); // Box 9
        gtngModel[9].setRotationPoint(-28F, 9F, 6F);

        gtngModel[10].addBox(0F, 0F, 0F, 13, 0, 1, 0F); // Box 10
        gtngModel[10].setRotationPoint(-28F, 6F, 6F);

        gtngModel[11].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 11
        gtngModel[11].setRotationPoint(-31F, 6F, 6F);

        gtngModel[12].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 12
        gtngModel[12].setRotationPoint(-31F, 6F, 6F);
        gtngModel[12].rotateAngleZ = 0.71558499F;

        gtngModel[13].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 13
        gtngModel[13].setRotationPoint(-12F, 6F, 6F);
        gtngModel[13].rotateAngleZ = 2.42600766F;

        gtngModel[14].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 14
        gtngModel[14].setRotationPoint(-15F, 6F, 6F);

        gtngModel[15].addBox(0F, 0F, 0F, 3, 1, 12, 0F); // Box 15
        gtngModel[15].setRotationPoint(-23F, 5F, -6F);

        gtngModel[16].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 16
        gtngModel[16].setRotationPoint(-31F, 6F, -7F);

        gtngModel[17].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 17
        gtngModel[17].setRotationPoint(-31F, 6F, -7F);
        gtngModel[17].rotateAngleZ = 0.71558499F;

        gtngModel[18].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 18
        gtngModel[18].setRotationPoint(-28F, 6F, -7F);

        gtngModel[19].addBox(0F, 0F, 0F, 13, 0, 1, 0F); // Box 19
        gtngModel[19].setRotationPoint(-28F, 9F, -7F);

        gtngModel[20].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 20
        gtngModel[20].setRotationPoint(-23F, 5F, -7F);

        gtngModel[21].addBox(0F, 0F, 0F, 13, 0, 1, 0F); // Box 21
        gtngModel[21].setRotationPoint(-28F, 6F, -7F);

        gtngModel[22].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 22
        gtngModel[22].setRotationPoint(-15F, 6F, -7F);

        gtngModel[23].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 23
        gtngModel[23].setRotationPoint(-12F, 6F, -7F);
        gtngModel[23].rotateAngleZ = 2.42600766F;

        gtngModel[24].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 24
        gtngModel[24].setRotationPoint(-18F, 6F, -7F);

        gtngModel[25].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 25
        gtngModel[25].setRotationPoint(-23F, 1F, -2F);

        gtngModel[26].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
        gtngModel[26].setRotationPoint(-33F, 1F, -8F);

        gtngModel[27].addBox(0F, 0F, 0F, 3, 1, 18, 0F); // Box 27
        gtngModel[27].setRotationPoint(-33F, 0F, -9F);

        gtngModel[28].addBox(0F, 0F, 0F, 3, 1, 18, 0F); // Box 28
        gtngModel[28].setRotationPoint(-33F, 4F, -9F);

        gtngModel[29].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
        gtngModel[29].setRotationPoint(-33F, 1F, -3F);

        gtngModel[30].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
        gtngModel[30].setRotationPoint(-33F, 1F, 2F);

        gtngModel[31].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
        gtngModel[31].setRotationPoint(-33F, 1F, 7F);

        gtngModel[32].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 32
        gtngModel[32].setRotationPoint(-35F, 2F, -1F);

        gtngModel[33].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 33
        gtngModel[33].setRotationPoint(-36F, 1F, -2F);

        gtngModel[34].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 34
        gtngModel[34].setRotationPoint(-32F, -4F, -4F);

        gtngModel[35].addBox(0F, 0F, 0F, 5, 0, 5, 0F); // Box 35
        gtngModel[35].setRotationPoint(-34F, -4F, -6F);

        gtngModel[36].addBox(0F, 0F, 0F, 3, 1, 18, 0F); // Box 36
        gtngModel[36].setRotationPoint(-23F, 3F, -9F);

        gtngModel[37].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
        gtngModel[37].setRotationPoint(-23F, -4F, -9F);

        gtngModel[38].addBox(0F, 0F, 0F, 1, 3, 20, 0F); // Box 38
        gtngModel[38].setRotationPoint(-23F, -7F, -10F);

        gtngModel[39].addShapeBox(0F, 0F, 0F, 15, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F); // Box 39
        gtngModel[39].setRotationPoint(-23F, -4F, -10F);

        gtngModel[40].addBox(0F, 0F, 0F, 16, 1, 20, 0F); // Box 40
        gtngModel[40].setRotationPoint(-8F, 4F, -10F);

        gtngModel[41].addBox(0F, 0F, 0F, 44, 3, 1, 0F); // Box 41
        gtngModel[41].setRotationPoint(-22F, -7F, -10F);

        gtngModel[42].addBox(0F, 0F, 0F, 16, 8, 1, 0F); // Box 42
        gtngModel[42].setRotationPoint(-8F, -4F, -10F);

        gtngModel[43].addShapeBox(0F, 0F, 0F, 15, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 43
        gtngModel[43].setRotationPoint(8F, -4F, -10F);

        gtngModel[44].addBox(0F, 0F, 0F, 1, 3, 20, 0F); // Box 44
        gtngModel[44].setRotationPoint(22F, -7F, -10F);

        gtngModel[45].addShapeBox(0F, 0F, 0F, 15, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F); // Box 45
        gtngModel[45].setRotationPoint(-23F, -4F, 9F);

        gtngModel[46].addBox(0F, 0F, 0F, 16, 8, 1, 0F); // Box 46
        gtngModel[46].setRotationPoint(-8F, -4F, 9F);

        gtngModel[47].addBox(0F, 0F, 0F, 44, 3, 1, 0F); // Box 47
        gtngModel[47].setRotationPoint(-22F, -7F, 9F);

        gtngModel[48].addShapeBox(0F, 0F, 0F, 15, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 48
        gtngModel[48].setRotationPoint(8F, -4F, 9F);

        gtngModel[49].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
        gtngModel[49].setRotationPoint(-23F, -4F, 7F);

        gtngModel[50].addBox(0F, 0F, 0F, 18, 1, 18, 0F); // Box 50
        gtngModel[50].setRotationPoint(-22F, -4.9F, -9F);
        gtngModel[50].rotateAngleZ = 0.52359878F;

        gtngModel[51].addBox(0F, 0F, 0F, 18, 1, 18, 0F); // Box 51
        gtngModel[51].setRotationPoint(7F, 4F, -9F);
        gtngModel[51].rotateAngleZ = -0.54105207F;

        gtngModel[52].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
        gtngModel[52].setRotationPoint(-23F, -4F, 2F);

        gtngModel[53].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
        gtngModel[53].setRotationPoint(-26F, -4F, 2F);

        gtngModel[54].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
        gtngModel[54].setRotationPoint(-26F, -4F, 7F);

        gtngModel[55].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
        gtngModel[55].setRotationPoint(-26F, -4F, -3F);

        gtngModel[56].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gtngModel[56].setRotationPoint(-26F, -4F, -8F);

        gtngModel[57].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 58
        gtngModel[57].setRotationPoint(14F, 6F, -7F);

        gtngModel[58].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 59
        gtngModel[58].setRotationPoint(13F, 5F, -6F);

        gtngModel[59].addBox(0F, 0F, 0F, 13, 0, 1, 0F); // Box 60
        gtngModel[59].setRotationPoint(14F, 6F, -7F);

        gtngModel[60].addBox(0F, 0F, 0F, 13, 0, 1, 0F); // Box 61
        gtngModel[60].setRotationPoint(14F, 9F, -7F);

        gtngModel[61].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 62
        gtngModel[61].setRotationPoint(11F, 6F, -7F);
        gtngModel[61].rotateAngleZ = 0.71558499F;

        gtngModel[62].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 63
        gtngModel[62].setRotationPoint(19F, 5F, -7F);

        gtngModel[63].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 64
        gtngModel[63].setRotationPoint(23F, 5F, -6F);

        gtngModel[64].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 65
        gtngModel[64].setRotationPoint(24F, 6F, -7F);

        gtngModel[65].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 66
        gtngModel[65].setRotationPoint(30F, 6F, -7F);
        gtngModel[65].rotateAngleZ = 2.42600766F;

        gtngModel[66].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 67
        gtngModel[66].setRotationPoint(27F, 6F, -7F);

        gtngModel[67].addBox(0F, 0F, 0F, 3, 1, 12, 0F); // Box 68
        gtngModel[67].setRotationPoint(19F, 5F, -6F);

        gtngModel[68].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 69
        gtngModel[68].setRotationPoint(19F, 1F, -2F);

        gtngModel[69].addBox(0F, 0F, 0F, 3, 1, 18, 0F); // Box 70
        gtngModel[69].setRotationPoint(19F, 3F, -9F);

        gtngModel[70].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
        gtngModel[70].setRotationPoint(9F, 1F, -8F);

        gtngModel[71].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
        gtngModel[71].setRotationPoint(19F, -4F, -9F);

        gtngModel[72].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
        gtngModel[72].setRotationPoint(22F, -4F, -8F);

        gtngModel[73].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
        gtngModel[73].setRotationPoint(19F, -4F, -3F);

        gtngModel[74].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
        gtngModel[74].setRotationPoint(22F, -4F, -3F);

        gtngModel[75].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
        gtngModel[75].setRotationPoint(22F, -4F, 2F);

        gtngModel[76].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
        gtngModel[76].setRotationPoint(19F, -4F, 2F);

        gtngModel[77].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
        gtngModel[77].setRotationPoint(9F, 1F, 7F);

        gtngModel[78].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
        gtngModel[78].setRotationPoint(19F, -4F, 7F);

        gtngModel[79].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
        gtngModel[79].setRotationPoint(22F, -4F, 7F);

        gtngModel[80].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
        gtngModel[80].setRotationPoint(9F, 1F, 2F);

        gtngModel[81].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 82
        gtngModel[81].setRotationPoint(30F, 2F, -1F);

        gtngModel[82].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 83
        gtngModel[82].setRotationPoint(35F, 1F, -2F);

        gtngModel[83].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 84
        gtngModel[83].setRotationPoint(31F, -4F, 4F);

        gtngModel[84].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
        gtngModel[84].setRotationPoint(9F, 1F, -3F);

        gtngModel[85].addBox(0F, 0F, 0F, 5, 0, 5, 0F); // Box 86
        gtngModel[85].setRotationPoint(29F, -4F, 2F);

        gtngModel[86].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 87
        gtngModel[86].setRotationPoint(25F, 7F, -6F);

        gtngModel[87].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 88
        gtngModel[87].setRotationPoint(15F, 7F, -6F);

        gtngModel[88].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 89
        gtngModel[88].setRotationPoint(19F, 5F, 6F);

        gtngModel[89].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 90
        gtngModel[89].setRotationPoint(14F, 6F, 6F);

        gtngModel[90].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 91
        gtngModel[90].setRotationPoint(24F, 6F, 6F);

        gtngModel[91].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 92
        gtngModel[91].setRotationPoint(23F, 5F, 6F);

        gtngModel[92].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 93
        gtngModel[92].setRotationPoint(13F, 5F, 6F);

        gtngModel[93].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 94
        gtngModel[93].setRotationPoint(11F, 6F, 6F);

        gtngModel[94].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 95
        gtngModel[94].setRotationPoint(11F, 6F, 6F);
        gtngModel[94].rotateAngleZ = 0.71558499F;

        gtngModel[95].addBox(0F, 0F, 0F, 13, 0, 1, 0F); // Box 96
        gtngModel[95].setRotationPoint(14F, 9F, 6F);

        gtngModel[96].addBox(0F, 0F, 0F, 3, 1, 18, 0F); // Box 97
        gtngModel[96].setRotationPoint(30F, 4F, -9F);

        gtngModel[97].addBox(0F, 0F, 0F, 13, 0, 1, 0F); // Box 98
        gtngModel[97].setRotationPoint(14F, 6F, 6F);

        gtngModel[98].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 99
        gtngModel[98].setRotationPoint(30F, 6F, 6F);
        gtngModel[98].rotateAngleZ = 2.42600766F;

        gtngModel[99].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 100
        gtngModel[99].setRotationPoint(27F, 6F, 6F);

        gtngModel[100].addBox(0F, 0F, 0F, 3, 1, 18, 0F); // Box 101
        gtngModel[100].setRotationPoint(30F, 0F, -9F);

        gtngModel[101].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 102
        gtngModel[101].setRotationPoint(11F, 6F, -7F);

        gtngModel[102].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
        gtngModel[102].setRotationPoint(-23F, -4F, -3F);

    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        for (int i = 0; i < 103; i++) {
            gtngModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
    }

    public ModelRendererTurbo gtngModel[];
}