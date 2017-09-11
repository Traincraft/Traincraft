//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model:
// Model Creator: Apoc The Wanderer
// Created on:28.07.2017 - 12:22:41
// Last changed on: 28.07.2017 - 12:22:41
package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.client.tmt.ModelBase;
import train.client.tmt.ModelRendererTurbo;
import train.client.tmt.Tessellator;
import train.common.library.Info;

public class ModelEMDF7B extends ModelBase
{
    int textureX = 1024;
    int textureY = 512;

    public ModelEMDF7B()
    {
        emdf7bModel = new ModelRendererTurbo[135];
        emdf7bModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // box001
        emdf7bModel[1] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // box002
        emdf7bModel[2] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // box003
        emdf7bModel[3] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // box004
        emdf7bModel[4] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // box005
        emdf7bModel[5] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // box006
        emdf7bModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // box007
        emdf7bModel[7] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // box008
        emdf7bModel[8] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // box009
        emdf7bModel[9] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // box010
        emdf7bModel[10] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // box011
        emdf7bModel[11] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // box012
        emdf7bModel[12] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // box013
        emdf7bModel[13] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // box014
        emdf7bModel[14] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // box015
        emdf7bModel[15] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // box016
        emdf7bModel[16] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // box017
        emdf7bModel[17] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // box018
        emdf7bModel[18] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // box019
        emdf7bModel[19] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // box020
        emdf7bModel[20] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // box021
        emdf7bModel[21] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // box022
        emdf7bModel[22] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // box023
        emdf7bModel[23] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // box024
        emdf7bModel[24] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // box025
        emdf7bModel[25] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // box026
        emdf7bModel[26] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // box027
        emdf7bModel[27] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // box028
        emdf7bModel[28] = new ModelRendererTurbo(this, 633, 9, textureX, textureY); // box029
        emdf7bModel[29] = new ModelRendererTurbo(this, 793, 9, textureX, textureY); // box030
        emdf7bModel[30] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // box031
        emdf7bModel[31] = new ModelRendererTurbo(this, 569, 9, textureX, textureY); // box032
        emdf7bModel[32] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // box033
        emdf7bModel[33] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // box034
        emdf7bModel[34] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // box035
        emdf7bModel[35] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // box036
        emdf7bModel[36] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // box037
        emdf7bModel[37] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // box038
        emdf7bModel[38] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // box039
        emdf7bModel[39] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // box040
        emdf7bModel[40] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // box041
        emdf7bModel[41] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // box042
        emdf7bModel[42] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // box043
        emdf7bModel[43] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // box044
        emdf7bModel[44] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // box045
        emdf7bModel[45] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // box046
        emdf7bModel[46] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // box047
        emdf7bModel[47] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // box048
        emdf7bModel[48] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // box049
        emdf7bModel[49] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // box050
        emdf7bModel[50] = new ModelRendererTurbo(this, 721, 17, textureX, textureY); // box051
        emdf7bModel[51] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // box052
        emdf7bModel[52] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // box053
        emdf7bModel[53] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // box054
        emdf7bModel[54] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // box055
        emdf7bModel[55] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // box056
        emdf7bModel[56] = new ModelRendererTurbo(this, 593, 9, textureX, textureY); // box057
        emdf7bModel[57] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // box058
        emdf7bModel[58] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // box059
        emdf7bModel[59] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // box060
        emdf7bModel[60] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // box061
        emdf7bModel[61] = new ModelRendererTurbo(this, 777, 17, textureX, textureY); // box062
        emdf7bModel[62] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // box063
        emdf7bModel[63] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // box064
        emdf7bModel[64] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // box065
        emdf7bModel[65] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // box066
        emdf7bModel[66] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // box067
        emdf7bModel[67] = new ModelRendererTurbo(this, 777, 17, textureX, textureY); // box068
        emdf7bModel[68] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // box069
        emdf7bModel[69] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // box070
        emdf7bModel[70] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // box071
        emdf7bModel[71] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // box072
        emdf7bModel[72] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // box073
        emdf7bModel[73] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // box074
        emdf7bModel[74] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // box075
        emdf7bModel[75] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // box076
        emdf7bModel[76] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // box077
        emdf7bModel[77] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // box078
        emdf7bModel[78] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // box079
        emdf7bModel[79] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // box080
        emdf7bModel[80] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // box081
        emdf7bModel[81] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // box082
        emdf7bModel[82] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // box083
        emdf7bModel[83] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // box084
        emdf7bModel[84] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // box085
        emdf7bModel[85] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // box086
        emdf7bModel[86] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // box087
        emdf7bModel[87] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // box088
        emdf7bModel[88] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // box089
        emdf7bModel[89] = new ModelRendererTurbo(this, 617, 25, textureX, textureY); // box090
        emdf7bModel[90] = new ModelRendererTurbo(this, 921, 25, textureX, textureY); // box091
        emdf7bModel[91] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // box092
        emdf7bModel[92] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // box093
        emdf7bModel[93] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // box094
        emdf7bModel[94] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // box095
        emdf7bModel[95] = new ModelRendererTurbo(this, 529, 9, textureX, textureY); // box096
        emdf7bModel[96] = new ModelRendererTurbo(this, 537, 9, textureX, textureY); // box097
        emdf7bModel[97] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // box098
        emdf7bModel[98] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // box099
        emdf7bModel[99] = new ModelRendererTurbo(this, 569, 9, textureX, textureY); // box100
        emdf7bModel[100] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // box101
        emdf7bModel[101] = new ModelRendererTurbo(this, 577, 9, textureX, textureY); // box102
        emdf7bModel[102] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // box103
        emdf7bModel[103] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // box104
        emdf7bModel[104] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // box105
        emdf7bModel[105] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // box106
        emdf7bModel[106] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // box107
        emdf7bModel[107] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // box108
        emdf7bModel[108] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // box109
        emdf7bModel[109] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // box110
        emdf7bModel[110] = new ModelRendererTurbo(this, 777, 33, textureX, textureY); // box111
        emdf7bModel[111] = new ModelRendererTurbo(this, 921, 49, textureX, textureY); // box112
        emdf7bModel[112] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // box113
        emdf7bModel[113] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // box114
        emdf7bModel[114] = new ModelRendererTurbo(this, 617, 9, textureX, textureY); // box115
        emdf7bModel[115] = new ModelRendererTurbo(this, 961, 9, textureX, textureY); // box116
        emdf7bModel[116] = new ModelRendererTurbo(this, 969, 9, textureX, textureY); // box117
        emdf7bModel[117] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // box118
        emdf7bModel[118] = new ModelRendererTurbo(this, 945, 49, textureX, textureY); // box119
        emdf7bModel[119] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // box120
        emdf7bModel[120] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // box121
        emdf7bModel[121] = new ModelRendererTurbo(this, 841, 49, textureX, textureY); // box122
        emdf7bModel[122] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // box123
        emdf7bModel[123] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // box124
        emdf7bModel[124] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // box125
        emdf7bModel[125] = new ModelRendererTurbo(this, 521, 57, textureX, textureY); // box126
        emdf7bModel[126] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // box127
        emdf7bModel[127] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // box128
        emdf7bModel[128] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // box129
        emdf7bModel[129] = new ModelRendererTurbo(this, 553, 57, textureX, textureY); // box130
        emdf7bModel[130] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); // box131
        emdf7bModel[131] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // box132
        emdf7bModel[132] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // box133
        emdf7bModel[133] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // box134
        emdf7bModel[134] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // box135

        emdf7bModel[0].addBox(0F, 0F, 0F, 78, 1, 22, 0F); // box001
        emdf7bModel[0].setRotationPoint(-38F, 1F, -11F);

        emdf7bModel[1].addShapeBox(0F, 0F, 0F, 78, 1, 2, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box002
        emdf7bModel[1].setRotationPoint(-38F, -23F, 9F);

        emdf7bModel[2].addBox(0F, 0F, -11F, 6, 6, 22, 0F); // box003
        emdf7bModel[2].setRotationPoint(-11F, 2F, 0F);

        emdf7bModel[3].addShapeBox(0F, 0F, -11F, 17, 3, 22, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // box004
        emdf7bModel[3].setRotationPoint(-5F, 2F, 0F);

        emdf7bModel[4].addBox(0F, 0F, -11F, 15, 3, 22, 0F); // box005
        emdf7bModel[4].setRotationPoint(-4F, 5F, 0F);

        emdf7bModel[5].addShapeBox(0F, 0F, -10F, 7, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // box006
        emdf7bModel[5].setRotationPoint(2F, 8F, 0F);

        emdf7bModel[6].addBox(0F, 0F, -1.5F, 1, 2, 3, 0F); // box007
        emdf7bModel[6].setRotationPoint(4F, -26.75F, 0F);

        emdf7bModel[7].addBox(0F, 0F, -1.5F, 1, 2, 3, 0F); // box008
        emdf7bModel[7].setRotationPoint(16F, -26.75F, 0F);

        emdf7bModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // box009
        emdf7bModel[8].setRotationPoint(-7F, -25F, -3F);

        emdf7bModel[9].addShapeBox(0F, 0F, 0F, 17, 1, 6, 0F, 0F, -0.1F, 0F, 2F, -0.1F, 0F, 2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // box010
        emdf7bModel[9].setRotationPoint(23F, -25F, -3F);

        emdf7bModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box011
        emdf7bModel[10].setRotationPoint(0F, -25.75F, -2F);

        emdf7bModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // box012
        emdf7bModel[11].setRotationPoint(-1F, -25.75F, -2F);

        emdf7bModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // box013
        emdf7bModel[12].setRotationPoint(2F, -25.75F, -2F);

        emdf7bModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box014
        emdf7bModel[13].setRotationPoint(7F, -25.75F, -2F);

        emdf7bModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // box015
        emdf7bModel[14].setRotationPoint(6F, -25.75F, -2F);

        emdf7bModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // box016
        emdf7bModel[15].setRotationPoint(9F, -25.75F, -2F);

        emdf7bModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box017
        emdf7bModel[16].setRotationPoint(12F, -25.75F, -2F);

        emdf7bModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // box018
        emdf7bModel[17].setRotationPoint(11F, -25.75F, -2F);

        emdf7bModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // box019
        emdf7bModel[18].setRotationPoint(14F, -25.75F, -2F);

        emdf7bModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box020
        emdf7bModel[19].setRotationPoint(19F, -25.75F, -2F);

        emdf7bModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // box021
        emdf7bModel[20].setRotationPoint(18F, -25.75F, -2F);

        emdf7bModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // box022
        emdf7bModel[21].setRotationPoint(21F, -25.75F, -2F);

        emdf7bModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // box023
        emdf7bModel[22].setRotationPoint(-14F, -25.75F, -3F);

        emdf7bModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box024
        emdf7bModel[23].setRotationPoint(-13F, -25.75F, -3F);

        emdf7bModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // box025
        emdf7bModel[24].setRotationPoint(-9F, -25.75F, -3F);

        emdf7bModel[25].addShapeBox(0F, 0F, -3F, 38, 1, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box026
        emdf7bModel[25].setRotationPoint(-15F, -25F, 0F);

        emdf7bModel[26].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F); // box027
        emdf7bModel[26].setRotationPoint(-38F, -24F, 8F);

        emdf7bModel[27].addShapeBox(0F, 0F, -10F, 1, 2, 20, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // box028
        emdf7bModel[27].setRotationPoint(39F, -24F, 0F);

        emdf7bModel[28].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F, 1.5F, -0.5F, 1F, 1.5F, -0.5F, 1F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 1F, 0F, 0F, 1F, 0F); // box029
        emdf7bModel[28].setRotationPoint(-38F, -25F, 6F);

        emdf7bModel[29].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F, 2F, -1.1F, 1F, 2F, -1.1F, 1F, 1.5F, -1.5F, 0F, 1.5F, -1.5F, 0F, 0F, 0.75F, 1F, 0F, 0.75F, 1F, 0F, 1.25F, 0F, 0F, 1.25F, 0F); // box030
        emdf7bModel[29].setRotationPoint(-38F, -26F, 4F);

        emdf7bModel[30].addShapeBox(0F, 0F, -10F, 1, 2, 20, 0F, 0F, -1.25F, -5F, 0F, -1.25F, -5F, 0F, -1.25F, -5F, 0F, -1.25F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // box031
        emdf7bModel[30].setRotationPoint(39F, -25F, 0F);

        emdf7bModel[31].addShapeBox(0F, 0F, -10F, 1, 2, 20, 0F, 0F, -1.75F, -7F, 0F, -1.75F, -7F, 0F, -1.75F, -7F, 0F, -1.75F, -7F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0.25F, -5F); // box032
        emdf7bModel[31].setRotationPoint(39F, -26F, 0F);

        emdf7bModel[32].addShapeBox(0F, 0F, -2F, 4, 72, 8, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6F, 0F, 0F, -6F, 0F, -54F, 0F, -3F, -54F, 0F, -3F, -54F, -6F, 0F, -54F, -6F); // box033
        emdf7bModel[32].setRotationPoint(40F, -18F, -4F);

        emdf7bModel[33].addShapeBox(0F, 0F, 0F, 4, 8, 48, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -36F, 0F, 0F, -36F, 0F, -6F, 0F, -3F, -6F, 0F, -3F, -6F, -36F, 0F, -6F, -36F); // box034
        emdf7bModel[33].setRotationPoint(40F, -20F, -6F);

        emdf7bModel[34].addShapeBox(0F, 0F, 0F, 4, 48, 4, 0F, 0F, 0F, -0.4F, -3.8F, 0F, -0.4F, -3.8F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, -36F, -0.4F, -3.8F, -36F, -0.4F, -3.8F, -36F, -3.4F, 0F, -36F, -3.4F); // box035
        emdf7bModel[34].setRotationPoint(-26.5F, -11F, -12F);

        emdf7bModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // box036
        emdf7bModel[35].setRotationPoint(-26.5F, -11F, -12F);

        emdf7bModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // box037
        emdf7bModel[36].setRotationPoint(-21.5F, -11F, -12F);

        emdf7bModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // box038
        emdf7bModel[37].setRotationPoint(-26.5F, 0.4F, -12F);

        emdf7bModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // box039
        emdf7bModel[38].setRotationPoint(-21.5F, 0.4F, -12F);

        emdf7bModel[39].addBox(0F, 0F, 0F, 7, 2, 3, 0F); // box040
        emdf7bModel[39].setRotationPoint(35F, 2F, -1.5F);

        emdf7bModel[40].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box041
        emdf7bModel[40].setRotationPoint(24.1F, 2F, -11F);

        emdf7bModel[41].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box042
        emdf7bModel[41].setRotationPoint(27.1F, 2F, -11F);

        emdf7bModel[42].addShapeBox(0F, 0F, 0F, 4, 4, 48, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -36F, 0F, 0F, -36F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, -36F, 0F, -3F, -36F); // box043
        emdf7bModel[42].setRotationPoint(40F, 0F, -6F);

        emdf7bModel[43].addShapeBox(0F, 0F, 0F, 4, 32, 4, 0F, 0F, 0F, -0.4F, -3.8F, 0F, -0.4F, -3.8F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, -24F, -0.4F, -3.8F, -24F, -0.4F, -3.8F, -24F, -3.4F, 0F, -24F, -3.4F); // box044
        emdf7bModel[43].setRotationPoint(-37.5F, -7F, -12F);

        emdf7bModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // box045
        emdf7bModel[44].setRotationPoint(-37.5F, 0.4F, -12F);

        emdf7bModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // box046
        emdf7bModel[45].setRotationPoint(-35.5F, 0.4F, -12F);

        emdf7bModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // box047
        emdf7bModel[46].setRotationPoint(37.5F, 0.4F, 11F);

        emdf7bModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -1.5F, 0F, -0.8F, -1.5F, 0F, -0.8F, -1.5F, -0.6F, 0F, -1.5F, -0.6F); // box048
        emdf7bModel[47].setRotationPoint(39.5F, -7F, 11F);

        emdf7bModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // box049
        emdf7bModel[48].setRotationPoint(39.5F, 0.4F, 11F);

        emdf7bModel[49].addShapeBox(0F, 0F, -2F, 4, 72, 8, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6F, 0F, 0F, -6F, 0F, -54F, 0F, -3F, -54F, 0F, -3F, -54F, -6F, 0F, -54F, -6F); // box050
        emdf7bModel[49].setRotationPoint(40F, -18F, 6F);

        emdf7bModel[50].addShapeBox(0F, 0F, 0F, 4, 48, 4, 0F, 0F, 0F, -0.4F, -3.8F, 0F, -0.4F, -3.8F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, -36F, -0.4F, -3.8F, -36F, -0.4F, -3.8F, -36F, -3.4F, 0F, -36F, -3.4F); // box051
        emdf7bModel[50].setRotationPoint(-21.5F, -11F, -12F);

        emdf7bModel[51].addShapeBox(0F, 0F, 0F, 4, 32, 4, 0F, 0F, 0F, -0.4F, -3.8F, 0F, -0.4F, -3.8F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, -24F, -0.4F, -3.8F, -24F, -0.4F, -3.8F, -24F, -3.4F, 0F, -24F, -3.4F); // box052
        emdf7bModel[51].setRotationPoint(-35.5F, -7F, -12F);

        emdf7bModel[52].addShapeBox(0F, 0F, 0F, 4, 32, 4, 0F, 0F, 0F, -3.4F, -3.8F, 0F, -3.4F, -3.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -24F, -3.4F, -3.8F, -24F, -3.4F, -3.8F, -24F, -0.4F, 0F, -24F, -0.4F); // box053
        emdf7bModel[52].setRotationPoint(37.5F, -7F, 8F);

        emdf7bModel[53].addShapeBox(0F, 0F, 0F, 4, 32, 4, 0F, 0F, 0F, -3.4F, -3.8F, 0F, -3.4F, -3.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -24F, -3.4F, -3.8F, -24F, -3.4F, -3.8F, -24F, -0.4F, 0F, -24F, -0.4F); // box054
        emdf7bModel[53].setRotationPoint(39.5F, -7F, 8F);

        emdf7bModel[54].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, -0.5F, 0F, -9F, -0.5F, 0F, -9F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -3F, 0F, -9F, -3F, 0F, -9F, -3F, -3F, 0F, -3F, -3F); // box055
        emdf7bModel[54].setRotationPoint(-25.4F, 0F, -12F);

        emdf7bModel[55].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, -3F, 0F, -3F, -3F); // box056
        emdf7bModel[55].setRotationPoint(25.1F, 6F, -11F);

        emdf7bModel[56].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, -3F, 0F, -3F, -3F); // box057
        emdf7bModel[56].setRotationPoint(25.1F, 3.5F, -11F);

        emdf7bModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -1.5F, 0F, -0.8F, -1.5F, 0F, -0.8F, -1.5F, -0.6F, 0F, -1.5F, -0.6F); // box058
        emdf7bModel[57].setRotationPoint(37.5F, -7F, 11F);

        emdf7bModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.6F, -0.8F, -1.5F, -0.6F, -0.8F, -1.5F, 0F, 0F, -1.5F, 0F); // box059
        emdf7bModel[58].setRotationPoint(-35.5F, -7F, -12F);

        emdf7bModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.6F, -0.8F, -1.5F, -0.6F, -0.8F, -1.5F, 0F, 0F, -1.5F, 0F); // box060
        emdf7bModel[59].setRotationPoint(-37.5F, -7F, -12F);

        emdf7bModel[60].addShapeBox(0F, 0F, -2F, 4, 72, 8, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6F, 0F, 0F, -6F, 0F, -54F, 0F, -3F, -54F, 0F, -3F, -54F, -6F, 0F, -54F, -6F); // box061
        emdf7bModel[60].setRotationPoint(-39F, -18F, 6F);

        emdf7bModel[61].addShapeBox(0F, 0F, 0F, 4, 4, 48, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -36F, 0F, 0F, -36F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, -36F, 0F, -3F, -36F); // box062
        emdf7bModel[61].setRotationPoint(-39F, 0F, -6F);

        emdf7bModel[62].addBox(0F, 0F, 0F, 7, 2, 3, 0F); // box063
        emdf7bModel[62].setRotationPoint(-40F, 2F, -1.5F);

        emdf7bModel[63].addShapeBox(0F, 0F, -2F, 4, 72, 8, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6F, 0F, 0F, -6F, 0F, -54F, 0F, -3F, -54F, 0F, -3F, -54F, -6F, 0F, -54F, -6F); // box064
        emdf7bModel[63].setRotationPoint(-39F, -18F, -4F);

        emdf7bModel[64].addShapeBox(0F, 0F, 0F, 4, 8, 48, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -36F, 0F, 0F, -36F, 0F, -6F, 0F, -3F, -6F, 0F, -3F, -6F, -36F, 0F, -6F, -36F); // box065
        emdf7bModel[64].setRotationPoint(-39F, -20F, -6F);

        emdf7bModel[65].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box066
        emdf7bModel[65].setRotationPoint(-25.9F, 2F, -11F);

        emdf7bModel[66].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box067
        emdf7bModel[66].setRotationPoint(-22.9F, 2F, -11F);

        emdf7bModel[67].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, -3F, 0F, -3F, -3F); // box068
        emdf7bModel[67].setRotationPoint(-24.9F, 3.5F, -11F);

        emdf7bModel[68].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, -3F, 0F, -3F, -3F); // box069
        emdf7bModel[68].setRotationPoint(-24.9F, 6F, -11F);

        emdf7bModel[69].addShapeBox(0F, 0F, 0F, 4, 32, 4, 0F, 0F, 0F, -3.4F, -3.8F, 0F, -3.4F, -3.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -24F, -3.4F, -3.8F, -24F, -3.4F, -3.8F, -24F, -0.4F, 0F, -24F, -0.4F); // box070
        emdf7bModel[69].setRotationPoint(-37.5F, -7F, 8F);

        emdf7bModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // box071
        emdf7bModel[70].setRotationPoint(-37.5F, 0.4F, 11F);

        emdf7bModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // box072
        emdf7bModel[71].setRotationPoint(-35.5F, 0.4F, 11F);

        emdf7bModel[72].addShapeBox(0F, 0F, 0F, 4, 32, 4, 0F, 0F, 0F, -3.4F, -3.8F, 0F, -3.4F, -3.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -24F, -3.4F, -3.8F, -24F, -3.4F, -3.8F, -24F, -0.4F, 0F, -24F, -0.4F); // box073
        emdf7bModel[72].setRotationPoint(-35.5F, -7F, 8F);

        emdf7bModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -1.5F, 0F, -0.8F, -1.5F, 0F, -0.8F, -1.5F, -0.6F, 0F, -1.5F, -0.6F); // box074
        emdf7bModel[73].setRotationPoint(-35.5F, -7F, 11F);

        emdf7bModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -1.5F, 0F, -0.8F, -1.5F, 0F, -0.8F, -1.5F, -0.6F, 0F, -1.5F, -0.6F); // box075
        emdf7bModel[74].setRotationPoint(-37.5F, -7F, 11F);

        emdf7bModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // box076
        emdf7bModel[75].setRotationPoint(28.5F, -11F, -12F);

        emdf7bModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // box077
        emdf7bModel[76].setRotationPoint(28.5F, 0.4F, -12F);

        emdf7bModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // box078
        emdf7bModel[77].setRotationPoint(23.5F, -11F, -12F);

        emdf7bModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // box079
        emdf7bModel[78].setRotationPoint(37.5F, 0.4F, -12F);

        emdf7bModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.6F, -0.8F, -1.5F, -0.6F, -0.8F, -1.5F, 0F, 0F, -1.5F, 0F); // box080
        emdf7bModel[79].setRotationPoint(39.5F, -7F, -12F);

        emdf7bModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // box081
        emdf7bModel[80].setRotationPoint(39.5F, 0.4F, -12F);

        emdf7bModel[81].addShapeBox(0F, 0F, 0F, 4, 48, 4, 0F, 0F, 0F, -0.4F, -3.8F, 0F, -0.4F, -3.8F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, -36F, -0.4F, -3.8F, -36F, -0.4F, -3.8F, -36F, -3.4F, 0F, -36F, -3.4F); // box082
        emdf7bModel[81].setRotationPoint(23.5F, -11F, -12F);

        emdf7bModel[82].addShapeBox(0F, 0F, 0F, 4, 32, 4, 0F, 0F, 0F, -0.4F, -3.8F, 0F, -0.4F, -3.8F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, -24F, -0.4F, -3.8F, -24F, -0.4F, -3.8F, -24F, -3.4F, 0F, -24F, -3.4F); // box083
        emdf7bModel[82].setRotationPoint(37.5F, -7F, -12F);

        emdf7bModel[83].addShapeBox(0F, 0F, 0F, 4, 48, 4, 0F, 0F, 0F, -0.4F, -3.8F, 0F, -0.4F, -3.8F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, -36F, -0.4F, -3.8F, -36F, -0.4F, -3.8F, -36F, -3.4F, 0F, -36F, -3.4F); // box084
        emdf7bModel[83].setRotationPoint(28.5F, -11F, -12F);

        emdf7bModel[84].addShapeBox(0F, 0F, 0F, 4, 32, 4, 0F, 0F, 0F, -0.4F, -3.8F, 0F, -0.4F, -3.8F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, -24F, -0.4F, -3.8F, -24F, -0.4F, -3.8F, -24F, -3.4F, 0F, -24F, -3.4F); // box085
        emdf7bModel[84].setRotationPoint(39.5F, -7F, -12F);

        emdf7bModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.6F, -0.8F, -1.5F, -0.6F, -0.8F, -1.5F, 0F, 0F, -1.5F, 0F); // box086
        emdf7bModel[85].setRotationPoint(37.5F, -7F, -12F);

        emdf7bModel[86].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, -0.5F, 0F, -9F, -0.5F, 0F, -9F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -3F, 0F, -9F, -3F, 0F, -9F, -3F, -3F, 0F, -3F, -3F); // box087
        emdf7bModel[86].setRotationPoint(24.63F, 0F, -12F);

        emdf7bModel[87].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box088
        emdf7bModel[87].setRotationPoint(-35F, 2F, -11F);

        emdf7bModel[88].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box089
        emdf7bModel[88].setRotationPoint(-38F, 2F, -11F);

        emdf7bModel[89].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, -3F, 0F, -3F, -3F); // box090
        emdf7bModel[89].setRotationPoint(-37F, 3.5F, -11F);

        emdf7bModel[90].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, -3F, 0F, -3F, -3F); // box091
        emdf7bModel[90].setRotationPoint(-37F, 6F, -11F);

        emdf7bModel[91].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box092
        emdf7bModel[91].setRotationPoint(-35F, 2F, 10F);

        emdf7bModel[92].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, -3F, -6F, -0.5F, -3F, -6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -3F, -6F, -3F, -3F, -6F, -3F, 0F, 0F, -3F, 0F); // box093
        emdf7bModel[92].setRotationPoint(-37F, 3.5F, 7F);

        emdf7bModel[93].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box094
        emdf7bModel[93].setRotationPoint(-38F, 2F, 10F);

        emdf7bModel[94].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, -3F, -6F, -0.5F, -3F, -6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -3F, -6F, -3F, -3F, -6F, -3F, 0F, 0F, -3F, 0F); // box095
        emdf7bModel[94].setRotationPoint(-37F, 6F, 7F);

        emdf7bModel[95].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box096
        emdf7bModel[95].setRotationPoint(39F, 2F, -11F);

        emdf7bModel[96].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box097
        emdf7bModel[96].setRotationPoint(36F, 2F, -11F);

        emdf7bModel[97].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, -3F, 0F, -3F, -3F); // box098
        emdf7bModel[97].setRotationPoint(37F, 3.5F, -11F);

        emdf7bModel[98].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, -3F, 0F, -3F, -3F); // box099
        emdf7bModel[98].setRotationPoint(37F, 6F, -11F);

        emdf7bModel[99].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box100
        emdf7bModel[99].setRotationPoint(39F, 2F, 10F);

        emdf7bModel[100].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, -3F, -6F, -0.5F, -3F, -6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -3F, -6F, -3F, -3F, -6F, -3F, 0F, 0F, -3F, 0F); // box101
        emdf7bModel[100].setRotationPoint(37F, 3.5F, 7F);

        emdf7bModel[101].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box102
        emdf7bModel[101].setRotationPoint(36F, 2F, 10F);

        emdf7bModel[102].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, -3F, -6F, -0.5F, -3F, -6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -3F, -6F, -3F, -3F, -6F, -3F, 0F, 0F, -3F, 0F); // box103
        emdf7bModel[102].setRotationPoint(37F, 6F, 7F);

        emdf7bModel[103].addShapeBox(0F, 0F, 0F, 23, 1, 6, 0F, 2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 2F, -0.1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // box104
        emdf7bModel[103].setRotationPoint(-38F, -25F, -3F);

        emdf7bModel[104].addShapeBox(0F, 0F, 0F, 78, 1, 2, 0F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box105
        emdf7bModel[104].setRotationPoint(-38F, -23F, -11F);

        emdf7bModel[105].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // box106
        emdf7bModel[105].setRotationPoint(-38F, -24F, -9F);

        emdf7bModel[106].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1.5F, -0.5F, 1F, 1.5F, -0.5F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 1F, 0F, 0.25F, 1F); // box107
        emdf7bModel[106].setRotationPoint(-38F, -25F, -7F);

        emdf7bModel[107].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F, 1.5F, -1.5F, 0F, 1.5F, -1.5F, 0F, 2F, -1.1F, 1F, 2F, -1.1F, 1F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.75F, 1F, 0F, 0.75F, 1F); // box108
        emdf7bModel[107].setRotationPoint(-38F, -26F, -5F);

        emdf7bModel[108].addShapeBox(0F, 0F, -10F, 1, 2, 20, 0F, 0F, -1.75F, -7F, 0F, -1.75F, -7F, 0F, -1.75F, -7F, 0F, -1.75F, -7F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0.25F, -5F); // box109
        emdf7bModel[108].setRotationPoint(-38F, -26F, 0F);

        emdf7bModel[109].addShapeBox(0F, 0F, -10F, 1, 2, 20, 0F, 0F, -1.25F, -5F, 0F, -1.25F, -5F, 0F, -1.25F, -5F, 0F, -1.25F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // box110
        emdf7bModel[109].setRotationPoint(-38F, -25F, 0F);

        emdf7bModel[110].addShapeBox(0F, 0F, -10F, 1, 2, 20, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // box111
        emdf7bModel[110].setRotationPoint(-38F, -24F, 0F);

        emdf7bModel[111].addShapeBox(0F, 0F, 0F, 4, 48, 4, 0F, 0F, 0F, -3.4F, -3.8F, 0F, -3.4F, -3.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -36F, -3.4F, -3.8F, -36F, -3.4F, -3.8F, -36F, -0.4F, 0F, -36F, -0.4F); // box112
        emdf7bModel[111].setRotationPoint(-26.5F, -11F, 8F);

        emdf7bModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // box113
        emdf7bModel[112].setRotationPoint(-26.5F, -11F, 11F);

        emdf7bModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // box114
        emdf7bModel[113].setRotationPoint(-21.5F, -11F, 11F);

        emdf7bModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // box115
        emdf7bModel[114].setRotationPoint(-26.5F, 0.4F, 11F);

        emdf7bModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // box116
        emdf7bModel[115].setRotationPoint(-21.5F, 0.4F, 11F);

        emdf7bModel[116].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box117
        emdf7bModel[116].setRotationPoint(24.1F, 2F, 10F);

        emdf7bModel[117].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box118
        emdf7bModel[117].setRotationPoint(27.1F, 2F, 10F);

        emdf7bModel[118].addShapeBox(0F, 0F, 0F, 4, 48, 4, 0F, 0F, 0F, -3.4F, -3.8F, 0F, -3.4F, -3.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -36F, -3.4F, -3.8F, -36F, -3.4F, -3.8F, -36F, -0.4F, 0F, -36F, -0.4F); // box119
        emdf7bModel[118].setRotationPoint(-21.5F, -11F, 8F);

        emdf7bModel[119].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, -0.5F, -3F, -9F, -0.5F, -3F, -9F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -3F, -9F, -3F, -3F, -9F, -3F, 0F, 0F, -3F, 0F); // box120
        emdf7bModel[119].setRotationPoint(-25.4F, 0F, 8F);

        emdf7bModel[120].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, -3F, -6F, -0.5F, -3F, -6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -3F, -6F, -3F, -3F, -6F, -3F, 0F, 0F, -3F, 0F); // box121
        emdf7bModel[120].setRotationPoint(25.1F, 6F, 7F);

        emdf7bModel[121].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, -3F, -6F, -0.5F, -3F, -6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -3F, -6F, -3F, -3F, -6F, -3F, 0F, 0F, -3F, 0F); // box122
        emdf7bModel[121].setRotationPoint(25.1F, 3.5F, 7F);

        emdf7bModel[122].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box123
        emdf7bModel[122].setRotationPoint(-25.9F, 2F, 10F);

        emdf7bModel[123].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box124
        emdf7bModel[123].setRotationPoint(-22.9F, 2F, 10F);

        emdf7bModel[124].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, -3F, -6F, -0.5F, -3F, -6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -3F, -6F, -3F, -3F, -6F, -3F, 0F, 0F, -3F, 0F); // box125
        emdf7bModel[124].setRotationPoint(-24.9F, 3.5F, 7F);

        emdf7bModel[125].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, -3F, -6F, -0.5F, -3F, -6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -3F, -6F, -3F, -3F, -6F, -3F, 0F, 0F, -3F, 0F); // box126
        emdf7bModel[125].setRotationPoint(-24.9F, 6F, 7F);

        emdf7bModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // box127
        emdf7bModel[126].setRotationPoint(28.5F, -11F, 11F);

        emdf7bModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // box128
        emdf7bModel[127].setRotationPoint(28.5F, 0.4F, 11F);

        emdf7bModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // box129
        emdf7bModel[128].setRotationPoint(23.5F, -11F, 11F);

        emdf7bModel[129].addShapeBox(0F, 0F, 0F, 4, 48, 4, 0F, 0F, 0F, -3.4F, -3.8F, 0F, -3.4F, -3.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -36F, -3.4F, -3.8F, -36F, -3.4F, -3.8F, -36F, -0.4F, 0F, -36F, -0.4F); // box130
        emdf7bModel[129].setRotationPoint(23.5F, -11F, 8F);

        emdf7bModel[130].addShapeBox(0F, 0F, 0F, 4, 48, 4, 0F, 0F, 0F, -3.4F, -3.8F, 0F, -3.4F, -3.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -36F, -3.4F, -3.8F, -36F, -3.4F, -3.8F, -36F, -0.4F, 0F, -36F, -0.4F); // box131
        emdf7bModel[130].setRotationPoint(28.5F, -11F, 8F);

        emdf7bModel[131].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, -0.5F, -3F, -9F, -0.5F, -3F, -9F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -3F, -9F, -3F, -3F, -9F, -3F, 0F, 0F, -3F, 0F); // box132
        emdf7bModel[131].setRotationPoint(24.63F, 0F, 8F);

        emdf7bModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // box133
        emdf7bModel[132].setRotationPoint(23.5F, 0.4F, -12F);

        emdf7bModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // box134
        emdf7bModel[133].setRotationPoint(23.5F, 0.4F, 11F);

        emdf7bModel[134].addShapeBox(0F, 0F, -11F, 312, 92, 88, 0F, 0F, 0F, 0F, -234F, 0F, 0F, -234F, 0F, -66F, 0F, 0F, -66F, 0F, -69F, 0F, -234F, -69F, 0F, -234F, -69F, -66F, 0F, -69F, -66F); // box135
        emdf7bModel[134].setRotationPoint(-38F, -22F, 0F);


    }

    private ModelBloombergTrucks fronttrucks = new ModelBloombergTrucks();
    private ModelBloombergTrucks backtrucks = new ModelBloombergTrucks();
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 135; i++)
        {
            emdf7bModel[i].render(f5);
        }
        GL11.glPushMatrix();
        Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/trains/Blomberg_b_trucks.png"));
        GL11.glTranslated(-1.5,0.6,0);
        GL11.glScalef(0.9F, 0.9F, 0.9F);
        fronttrucks.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/trains/Blomberg_b_trucks.png"));
        GL11.glTranslated(1.55,0.6,0);
        GL11.glScalef(0.9F, 0.9F, 0.9F);
        backtrucks.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo emdf7bModel[];
}
