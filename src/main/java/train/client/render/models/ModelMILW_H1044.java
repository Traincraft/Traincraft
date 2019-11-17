//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model:
// Model Creator: gevoo
// Created on:04.09.2017 - 12:12:33
// Last changed on: 04.09.2017 - 12:12:33
package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelMILW_H1044 extends ModelBase
{
    int textureX = 512;
    int textureY = 128;
    private ModelMILW_H1044_Bogie trucks = new ModelMILW_H1044_Bogie();

    public ModelMILW_H1044()
    {
        milw_h1044Model = new ModelRendererTurbo[91];
        milw_h1044Model[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // box01
        milw_h1044Model[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // box02
        milw_h1044Model[2] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // box03
        milw_h1044Model[3] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // box04
        milw_h1044Model[4] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // box05
        milw_h1044Model[5] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // box06
        milw_h1044Model[6] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // box07
        milw_h1044Model[7] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // box08
        milw_h1044Model[8] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // box09
        milw_h1044Model[9] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // box10
        milw_h1044Model[10] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // box11
        milw_h1044Model[11] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // box12
        milw_h1044Model[12] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // box13
        milw_h1044Model[13] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // box14
        milw_h1044Model[14] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // box15
        milw_h1044Model[15] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // box16
        milw_h1044Model[16] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // box17
        milw_h1044Model[17] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // box18
        milw_h1044Model[18] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // box19
        milw_h1044Model[19] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // box20
        milw_h1044Model[20] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // box21
        milw_h1044Model[21] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // box22
        milw_h1044Model[22] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // box23
        milw_h1044Model[23] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // box24
        milw_h1044Model[24] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // box25
        milw_h1044Model[25] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // box26
        milw_h1044Model[26] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // box27
        milw_h1044Model[27] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // box28
        milw_h1044Model[28] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // box29
        milw_h1044Model[29] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // box30
        milw_h1044Model[30] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // box31
        milw_h1044Model[31] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // box32
        milw_h1044Model[32] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // box33
        milw_h1044Model[33] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // box34
        milw_h1044Model[34] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // box35
        milw_h1044Model[35] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // box36
        milw_h1044Model[36] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // box37
        milw_h1044Model[37] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // box38
        milw_h1044Model[38] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // box39
        milw_h1044Model[39] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // box40
        milw_h1044Model[40] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // box41
        milw_h1044Model[41] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // box42
        milw_h1044Model[42] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // box43
        milw_h1044Model[43] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // box44
        milw_h1044Model[44] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // box45
        milw_h1044Model[45] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // box46
        milw_h1044Model[46] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // box47
        milw_h1044Model[47] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // box48
        milw_h1044Model[48] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // box49
        milw_h1044Model[49] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // box50
        milw_h1044Model[50] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // box51
        milw_h1044Model[51] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // box52
        milw_h1044Model[52] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // box53
        milw_h1044Model[53] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // box54
        milw_h1044Model[54] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // box55
        milw_h1044Model[55] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // box56
        milw_h1044Model[56] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // box57
        milw_h1044Model[57] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // box58
        milw_h1044Model[58] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // box59
        milw_h1044Model[59] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // box60
        milw_h1044Model[60] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // box61
        milw_h1044Model[61] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // box62
        milw_h1044Model[62] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // box63
        milw_h1044Model[63] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // box64
        milw_h1044Model[64] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // box65
        milw_h1044Model[65] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // box66
        milw_h1044Model[66] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // box67
        milw_h1044Model[67] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // box68
        milw_h1044Model[68] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // box69
        milw_h1044Model[69] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // box70
        milw_h1044Model[70] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // box71
        milw_h1044Model[71] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // box72
        milw_h1044Model[72] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // box73
        milw_h1044Model[73] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // box74
        milw_h1044Model[74] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // box75
        milw_h1044Model[75] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // box76
        milw_h1044Model[76] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // box77
        milw_h1044Model[77] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // box78
        milw_h1044Model[78] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // box79
        milw_h1044Model[79] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // box80
        milw_h1044Model[80] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // box81
        milw_h1044Model[81] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // box82
        milw_h1044Model[82] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // box83
        milw_h1044Model[83] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // box84
        milw_h1044Model[84] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // box85
        milw_h1044Model[85] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // box86
        milw_h1044Model[86] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // box87
        milw_h1044Model[87] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // box88
        milw_h1044Model[88] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // box89
        milw_h1044Model[89] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // box90
        milw_h1044Model[90] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 90

        milw_h1044Model[0].addShapeBox(0F, 0F, 0F, 1, 7, 20, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box01
        milw_h1044Model[0].setRotationPoint(-77F, -1F, -10F);

        milw_h1044Model[1].addBox(0F, 0F, 0F, 80, 2, 20, 0F); // box02
        milw_h1044Model[1].setRotationPoint(-73F, -2F, -10F);

        milw_h1044Model[2].addBox(0F, 0F, 0F, 66, 19, 14, 0F); // box03
        milw_h1044Model[2].setRotationPoint(-72F, -21F, -7F);

        milw_h1044Model[3].addBox(0F, 0F, 0F, 18, 5, 8, 0F); // box04
        milw_h1044Model[3].setRotationPoint(-42F, 0F, -3F);

        milw_h1044Model[4].addShapeBox(0F, 0F, 0F, 2, 20, 8, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box05
        milw_h1044Model[4].setRotationPoint(-74F, -22F, -4F);

        milw_h1044Model[5].addShapeBox(0F, 0F, 0F, 2, 20, 3, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box06
        milw_h1044Model[5].setRotationPoint(-74F, -22F, -7F);

        milw_h1044Model[6].addShapeBox(0F, 0F, 0F, 2, 20, 3, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // box07
        milw_h1044Model[6].setRotationPoint(-74F, -22F, 4F);

        milw_h1044Model[7].addShapeBox(0F, 0F, 0F, 66, 1, 14, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box08
        milw_h1044Model[7].setRotationPoint(-72F, -22F, -7F);

        milw_h1044Model[8].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // box09
        milw_h1044Model[8].setRotationPoint(-79F, 5F, -8F);

        milw_h1044Model[9].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // box10
        milw_h1044Model[9].setRotationPoint(-78F, -2F, -10F);

        milw_h1044Model[10].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // box11
        milw_h1044Model[10].setRotationPoint(-76F, 5F, -10F);

        milw_h1044Model[11].addShapeBox(0F, 0F, 0F, 1, 6, 20, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box12
        milw_h1044Model[11].setRotationPoint(-73F, 0F, -10F);

        milw_h1044Model[12].addBox(0F, 0F, 0F, 3, 0, 18, 0F); // box13
        milw_h1044Model[12].setRotationPoint(-76F, 3F, -9F);

        milw_h1044Model[13].addBox(0F, 0F, 0F, 3, 0, 18, 0F); // box14
        milw_h1044Model[13].setRotationPoint(-76F, 1F, -9F);

        milw_h1044Model[14].addShapeBox(0F, 0F, 0F, 1, 6, 20, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box15
        milw_h1044Model[14].setRotationPoint(6F, 0F, -10F);

        milw_h1044Model[15].addShapeBox(0F, 0F, 0F, 1, 7, 20, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box16
        milw_h1044Model[15].setRotationPoint(10F, -1F, -10F);

        milw_h1044Model[16].addBox(0F, 0F, 0F, 3, 0, 16, 0F); // box17
        milw_h1044Model[16].setRotationPoint(7F, 5F, -8F);

        milw_h1044Model[17].addBox(0F, 0F, 0F, 3, 0, 14, 0F); // box18
        milw_h1044Model[17].setRotationPoint(7F, 3F, -7F);

        milw_h1044Model[18].addBox(0F, 0F, 0F, 3, 0, 14, 0F); // box19
        milw_h1044Model[18].setRotationPoint(7F, 1F, -7F);

        milw_h1044Model[19].addBox(0F, 0F, 0F, 1, 17, 20, 0F); // box20
        milw_h1044Model[19].setRotationPoint(-6F, -19F, -10F);

        milw_h1044Model[20].addBox(0F, 0F, 0F, 12, 17, 0, 0F); // box21
        milw_h1044Model[20].setRotationPoint(-5F, -19F, -10F);

        milw_h1044Model[21].addBox(0F, 0F, 0F, 12, 17, 0, 0F); // box22
        milw_h1044Model[21].setRotationPoint(-5F, -19F, 10F);

        milw_h1044Model[22].addBox(0F, 0F, 0F, 0, 17, 20, 0F); // box23
        milw_h1044Model[22].setRotationPoint(7F, -19F, -10F);

        milw_h1044Model[23].addBox(0F, 0F, 0F, 15, 4, 3, 0F); // box24
        milw_h1044Model[23].setRotationPoint(-21F, -6F, -10F);

        milw_h1044Model[24].addBox(0F, 0F, 0F, 15, 4, 3, 0F); // box25
        milw_h1044Model[24].setRotationPoint(-21F, -6F, 7F);

        milw_h1044Model[25].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box26
        milw_h1044Model[25].setRotationPoint(-23F, -6F, 10F);

        milw_h1044Model[26].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box27
        milw_h1044Model[26].setRotationPoint(-23F, -6F, -10F);

        milw_h1044Model[27].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // box28
        milw_h1044Model[27].setRotationPoint(-23F, -4F, 7F);

        milw_h1044Model[28].addBox(0F, 0F, -14F, 2, 0, 3, 0F); // box29
        milw_h1044Model[28].setRotationPoint(-23F, -4F, 4F);

        milw_h1044Model[29].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // box30
        milw_h1044Model[29].setRotationPoint(-74F, -17F, -1F);

        milw_h1044Model[30].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // box31
        milw_h1044Model[30].setRotationPoint(-56F, -23F, -3F);

        milw_h1044Model[31].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // box32
        milw_h1044Model[31].setRotationPoint(-56F, -23F, 1F);

        milw_h1044Model[32].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // box33
        milw_h1044Model[32].setRotationPoint(-78F, -9F, 3F);

        milw_h1044Model[33].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // box34
        milw_h1044Model[33].setRotationPoint(-78F, -9F, -4F);

        milw_h1044Model[34].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box35
        milw_h1044Model[34].setRotationPoint(12F, -9F, -9F);

        milw_h1044Model[35].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // box36
        milw_h1044Model[35].setRotationPoint(12F, -9F, -4F);

        milw_h1044Model[36].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // box37
        milw_h1044Model[36].setRotationPoint(12F, -9F, 3F);

        milw_h1044Model[37].addShapeBox(0F, 0F, 0F, 0, 1, 16, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box38
        milw_h1044Model[37].setRotationPoint(12F, -10F, -8F);

        milw_h1044Model[38].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // box39
        milw_h1044Model[38].setRotationPoint(-80F, 1F, -1F);

        milw_h1044Model[39].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // box40
        milw_h1044Model[39].setRotationPoint(-74F, -2F, -10F);

        milw_h1044Model[40].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // box41
        milw_h1044Model[40].setRotationPoint(10F, -2F, -10F);

        milw_h1044Model[41].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // box42
        milw_h1044Model[41].setRotationPoint(-76F, -2F, -9F);

        milw_h1044Model[42].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // box43
        milw_h1044Model[42].setRotationPoint(8F, -2F, -9F);

        milw_h1044Model[43].addShapeBox(0F, 0F, 0F, 13, 1, 20, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box44
        milw_h1044Model[43].setRotationPoint(-6F, -20F, -10F);

        milw_h1044Model[44].addShapeBox(0F, 0F, 0F, 13, 1, 18, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box45
        milw_h1044Model[44].setRotationPoint(-6F, -21F, -9F);

        milw_h1044Model[45].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -3F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -3F, 0F, 0F); // box46
        milw_h1044Model[45].setRotationPoint(4F, -19F, -10F);

        milw_h1044Model[46].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -3F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -3F, 0F, 0F); // box47
        milw_h1044Model[46].setRotationPoint(4F, -19F, 9F);

        milw_h1044Model[47].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box48
        milw_h1044Model[47].setRotationPoint(-7F, -10F, -10F);

        milw_h1044Model[48].addShapeBox(0F, 0F, 0F, 18, 1, 14, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box49
        milw_h1044Model[48].setRotationPoint(-6F, -22F, -7F);

        milw_h1044Model[49].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box50
        milw_h1044Model[49].setRotationPoint(-8F, -8F, -10F);

        milw_h1044Model[50].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box51
        milw_h1044Model[50].setRotationPoint(-10F, -7F, -10F);

        milw_h1044Model[51].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box52
        milw_h1044Model[51].setRotationPoint(7F, -20F, -10F);

        milw_h1044Model[52].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box53
        milw_h1044Model[52].setRotationPoint(7F, -20F, 8F);

        milw_h1044Model[53].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box54
        milw_h1044Model[53].setRotationPoint(7F, -21F, -9F);

        milw_h1044Model[54].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box55
        milw_h1044Model[54].setRotationPoint(7F, -21F, 7F);

        milw_h1044Model[55].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box56
        milw_h1044Model[55].setRotationPoint(-10F, -7F, 10F);

        milw_h1044Model[56].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box57
        milw_h1044Model[56].setRotationPoint(-8F, -8F, 10F);

        milw_h1044Model[57].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box58
        milw_h1044Model[57].setRotationPoint(-7F, -10F, 10F);

        milw_h1044Model[58].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // box59
        milw_h1044Model[58].setRotationPoint(7F, -2F, -10F);

        milw_h1044Model[59].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // box60
        milw_h1044Model[59].setRotationPoint(11F, -2F, -10F);

        milw_h1044Model[60].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // box61
        milw_h1044Model[60].setRotationPoint(11F, 5F, -9F);

        milw_h1044Model[61].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // box62
        milw_h1044Model[61].setRotationPoint(12F, -9F, 7F);

        milw_h1044Model[62].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // box63
        milw_h1044Model[62].setRotationPoint(7F, -20F, -1F);

        milw_h1044Model[63].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
        milw_h1044Model[63].setRotationPoint(-2F, -19F, 10F);

        milw_h1044Model[64].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
        milw_h1044Model[64].setRotationPoint(-2F, -19F, -11F);

        milw_h1044Model[65].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // box66
        milw_h1044Model[65].setRotationPoint(-77F, -2F, -10F);

        milw_h1044Model[66].addShapeBox(0F, 0F, 0F, 0, 1, 16, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box67
        milw_h1044Model[66].setRotationPoint(-78F, -10F, -8F);

        milw_h1044Model[67].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // box68
        milw_h1044Model[67].setRotationPoint(-78F, -9F, 7F);

        milw_h1044Model[68].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box69
        milw_h1044Model[68].setRotationPoint(-78F, -9F, -9F);

        milw_h1044Model[69].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box70
        milw_h1044Model[69].setRotationPoint(-38F, 1F, -6F);

        milw_h1044Model[70].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box71
        milw_h1044Model[70].setRotationPoint(-38F, 1F, 5F);

        milw_h1044Model[71].addBox(0F, 0F, 0F, 11, 3, 1, 0F); // box72
        milw_h1044Model[71].setRotationPoint(-38F, 1F, 6F);

        milw_h1044Model[72].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // box73
        milw_h1044Model[72].setRotationPoint(-38F, 1F, 7F);

        milw_h1044Model[73].addBox(0F, 0F, 0F, 11, 3, 1, 0F); // box74
        milw_h1044Model[73].setRotationPoint(-38F, 1F, -5F);

        milw_h1044Model[74].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // box75
        milw_h1044Model[74].setRotationPoint(-38F, 1F, -4F);

        milw_h1044Model[75].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // box76
        milw_h1044Model[75].setRotationPoint(-40F, 2F, 6F);

        milw_h1044Model[76].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // box77
        milw_h1044Model[76].setRotationPoint(-40F, 2F, -5F);

        milw_h1044Model[77].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // box78
        milw_h1044Model[77].setRotationPoint(-27F, 2F, -5F);

        milw_h1044Model[78].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // box79
        milw_h1044Model[78].setRotationPoint(-27F, 2F, 6F);

        milw_h1044Model[79].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // box80
        milw_h1044Model[79].setRotationPoint(-26F, 0F, 6F);

        milw_h1044Model[80].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // box81
        milw_h1044Model[80].setRotationPoint(-26F, 0F, -5F);

        milw_h1044Model[81].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // box82
        milw_h1044Model[81].setRotationPoint(-40F, 0F, -5F);

        milw_h1044Model[82].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // box83
        milw_h1044Model[82].setRotationPoint(-40F, 0F, 6F);

        milw_h1044Model[83].addBox(0F, 0F, 0F, 66, 19, 14, 0F); // box84
        milw_h1044Model[83].setRotationPoint(-72F, -21F, -7F);

        milw_h1044Model[84].addBox(0F, 0F, 0F, 66, 19, 14, 0F); // box85
        milw_h1044Model[84].setRotationPoint(-72F, -21F, -7F);

        milw_h1044Model[85].addBox(0F, 0F, 0F, 66, 19, 14, 0F); // box86
        milw_h1044Model[85].setRotationPoint(-72F, -21F, -7F);

        milw_h1044Model[86].addBox(0F, 0F, 0F, 66, 19, 14, 0F); // box87
        milw_h1044Model[86].setRotationPoint(-72F, -21F, -7F);

        milw_h1044Model[87].addBox(0F, 0F, 0F, 66, 19, 14, 0F); // box88
        milw_h1044Model[87].setRotationPoint(-72F, -21F, -7F);

        milw_h1044Model[88].addBox(0F, 0F, 0F, 66, 19, 14, 0F); // box89
        milw_h1044Model[88].setRotationPoint(-72F, -21F, -7F);

        milw_h1044Model[89].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // box90
        milw_h1044Model[89].setRotationPoint(-31F, -3F, 0F);

        milw_h1044Model[90].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 90
        milw_h1044Model[90].setRotationPoint(11F, 1F, -1F);


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {

        GL11.glPushMatrix();
        GL11.glScaled(1.2f, 1.2f, 1.2f);
        for(ModelRendererTurbo m : milw_h1044Model)
        {
            m.render(f5);
        }
        GL11.glPopMatrix();

        Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/MILW_H1044_bogie.png"));

        GL11.glPushMatrix();
        GL11.glTranslated(-4.3,0.55,0);
        GL11.glScalef(1.45F, 1.45F, 0.8F);
        trucks.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        GL11.glTranslated(-0.65,0.55,0);
        GL11.glScalef(1.45F, 1.45F, 0.8F);
        trucks.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo milw_h1044Model[];
}
