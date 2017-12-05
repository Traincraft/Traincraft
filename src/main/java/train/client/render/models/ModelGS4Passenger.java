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

public class ModelGS4Passenger extends ModelBase
{
    int textureX = 512;
    int textureY = 512;

    public ModelGS4Passenger()
    {
		gs4passengerModel = new ModelRendererTurbo[69];
		gs4passengerModel[0] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // 01
		gs4passengerModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 02
		gs4passengerModel[2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // 03
		gs4passengerModel[3] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // 04
		gs4passengerModel[4] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // 05
		gs4passengerModel[5] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // 06
		gs4passengerModel[6] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // 07
		gs4passengerModel[7] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // 08
		gs4passengerModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // 09
		gs4passengerModel[9] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // 10
		gs4passengerModel[10] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // 11
		gs4passengerModel[11] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // 12
		gs4passengerModel[12] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // 13
		gs4passengerModel[13] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // 14
		gs4passengerModel[14] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // 15
		gs4passengerModel[15] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // 16
		gs4passengerModel[16] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // 17
		gs4passengerModel[17] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // 18
		gs4passengerModel[18] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // 19
		gs4passengerModel[19] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // 20
		gs4passengerModel[20] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // 21
		gs4passengerModel[21] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // 22
		gs4passengerModel[22] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // 23
		gs4passengerModel[23] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // 24
		gs4passengerModel[24] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // 25
		gs4passengerModel[25] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // 26
		gs4passengerModel[26] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // 27
		gs4passengerModel[27] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // 28
		gs4passengerModel[28] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // 29
		gs4passengerModel[29] = new ModelRendererTurbo(this, 126, 118, textureX, textureY); // 34
		gs4passengerModel[30] = new ModelRendererTurbo(this, 86, 340, textureX, textureY); // 35
		gs4passengerModel[31] = new ModelRendererTurbo(this, 374, 226, textureX, textureY); // 36
		gs4passengerModel[32] = new ModelRendererTurbo(this, 125, 257, textureX, textureY); // 37
		gs4passengerModel[33] = new ModelRendererTurbo(this, 105, 436, textureX, textureY); // 38
		gs4passengerModel[34] = new ModelRendererTurbo(this, 296, 168, textureX, textureY); // 39
		gs4passengerModel[35] = new ModelRendererTurbo(this, 333, 364, textureX, textureY); // 40
		gs4passengerModel[36] = new ModelRendererTurbo(this, 500, 481, textureX, textureY); // 41
		gs4passengerModel[37] = new ModelRendererTurbo(this, 129, 501, textureX, textureY); // 42
		gs4passengerModel[38] = new ModelRendererTurbo(this, 227, 264, textureX, textureY); // 43
		gs4passengerModel[39] = new ModelRendererTurbo(this, 79, 138, textureX, textureY); // 44
		gs4passengerModel[40] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 45
		gs4passengerModel[41] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // 46
		gs4passengerModel[42] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // 47
		gs4passengerModel[43] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // 48
		gs4passengerModel[44] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // 49
		gs4passengerModel[45] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // 50
		gs4passengerModel[46] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // 51
		gs4passengerModel[47] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // 52
		gs4passengerModel[48] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // 53
		gs4passengerModel[49] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // 54
		gs4passengerModel[50] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // 55
		gs4passengerModel[51] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // 56
		gs4passengerModel[52] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // 57
		gs4passengerModel[53] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // 58
		gs4passengerModel[54] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // 59
		gs4passengerModel[55] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // 60
		gs4passengerModel[56] = new ModelRendererTurbo(this, 333, 364, textureX, textureY); // 61
		gs4passengerModel[57] = new ModelRendererTurbo(this, 333, 364, textureX, textureY); // 62
		gs4passengerModel[58] = new ModelRendererTurbo(this, 333, 364, textureX, textureY); // 63
		gs4passengerModel[59] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // 32
		gs4passengerModel[60] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // 33
		gs4passengerModel[61] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // 32
		gs4passengerModel[62] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // 33
		gs4passengerModel[63] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // 32
		gs4passengerModel[64] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // 33
		gs4passengerModel[65] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // 32
		gs4passengerModel[66] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // 33
		gs4passengerModel[67] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // 32
		gs4passengerModel[68] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // 33

		gs4passengerModel[0].addBox(0F, 0F, 0F, 3, 26, 1, 0F); // 01
		gs4passengerModel[0].setRotationPoint(-53F, -29F, 10F);

		gs4passengerModel[1].addBox(0F, 0F, 0F, 6, 14, 1, 0F); // 02
		gs4passengerModel[1].setRotationPoint(-50F, -17F, 10F);

		gs4passengerModel[2].addBox(0F, 0F, 0F, 6, 5, 1, 0F); // 03
		gs4passengerModel[2].setRotationPoint(-50F, -29F, 10F);

		gs4passengerModel[3].addBox(0F, 0F, 0F, 3, 26, 1, 0F); // 04
		gs4passengerModel[3].setRotationPoint(-44F, -29F, 10F);

		gs4passengerModel[4].addBox(0F, 0F, 0F, 84, 14, 1, 0F); // 05
		gs4passengerModel[4].setRotationPoint(-41F, -17F, 10F);

		gs4passengerModel[5].addBox(0F, 0F, 0F, 84, 5, 1, 0F); // 06
		gs4passengerModel[5].setRotationPoint(-41F, -29F, 10F);

		gs4passengerModel[6].addBox(0F, 0F, 0F, 3, 7, 1, 0F); // 07
		gs4passengerModel[6].setRotationPoint(-26F, -24F, 10F);

		gs4passengerModel[7].addBox(0F, 0F, 0F, 3, 26, 1, 0F); // 08
		gs4passengerModel[7].setRotationPoint(43F, -29F, 10F);

		gs4passengerModel[8].addBox(0F, 0F, 0F, 6, 5, 1, 0F); // 09
		gs4passengerModel[8].setRotationPoint(46F, -29F, 10F);

		gs4passengerModel[9].addBox(0F, 0F, 0F, 3, 26, 1, 0F); // 10
		gs4passengerModel[9].setRotationPoint(52F, -29F, 10F);

		gs4passengerModel[10].addBox(0F, 0F, 0F, 6, 14, 1, 0F); // 11
		gs4passengerModel[10].setRotationPoint(46F, -17F, 10F);

		gs4passengerModel[11].addBox(0F, 0F, 0F, 1, 26, 20, 0F); // 12
		gs4passengerModel[11].setRotationPoint(-53F, -29F, -10F);

		gs4passengerModel[12].addBox(0F, 0F, 0F, 1, 26, 20, 0F); // 13
		gs4passengerModel[12].setRotationPoint(54F, -29F, -10F);

		gs4passengerModel[13].addShapeBox(0F, 0F, 0F, 82, 3, 5, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 14
		gs4passengerModel[13].setRotationPoint(-53F, -32F, -11F);

		gs4passengerModel[14].addShapeBox(0F, 0F, 0F, 82, 1, 5, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 15
		gs4passengerModel[14].setRotationPoint(-53F, -33F, -6F);

		gs4passengerModel[15].addShapeBox(0F, 0F, 0F, 82, 3, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 16
		gs4passengerModel[15].setRotationPoint(-53F, -32F, -6F);

		gs4passengerModel[16].addShapeBox(0F, 0F, 0F, 82, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 17
		gs4passengerModel[16].setRotationPoint(-53F, -33F, -1F);

		gs4passengerModel[17].addBox(0F, 0F, 0F, 6, 5, 22, 0F); // 18
		gs4passengerModel[17].setRotationPoint(-53F, -2F, -11F);

		gs4passengerModel[18].addShapeBox(0F, 0F, 0F, 5, 5, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // 19
		gs4passengerModel[18].setRotationPoint(-47F, -2F, -11F);

		gs4passengerModel[19].addBox(0F, 0F, 0F, 6, 5, 22, 0F); // 20
		gs4passengerModel[19].setRotationPoint(49F, -2F, -11F);

		gs4passengerModel[20].addShapeBox(0F, 0F, 0F, 5, 5, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // 21
		gs4passengerModel[20].setRotationPoint(44F, -2F, -11F);

		gs4passengerModel[21].addShapeBox(0F, 0F, 0F, 3, 5, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // 22
		gs4passengerModel[21].setRotationPoint(17F, -2F, -11F);

		gs4passengerModel[22].addShapeBox(0F, 0F, 0F, 35, 5, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // 23
		gs4passengerModel[22].setRotationPoint(-18F, -2F, -11F);

		gs4passengerModel[23].addBox(0F, 0F, 0F, 24, 4, 12, 0F); // 24
		gs4passengerModel[23].setRotationPoint(-42F, -2F, -6F);

		gs4passengerModel[24].addBox(0F, 0F, 0F, 20, 2, 14, 0F); // 25
		gs4passengerModel[24].setRotationPoint(-40F, 1F, -7F);

		gs4passengerModel[25].addBox(0F, 0F, 0F, 20, 2, 14, 0F); // 26
		gs4passengerModel[25].setRotationPoint(22F, 1F, -7F);

		gs4passengerModel[26].addBox(0F, 0F, 0F, 24, 4, 12, 0F); // 27
		gs4passengerModel[26].setRotationPoint(20F, -2F, -6F);

		gs4passengerModel[27].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // 28
		gs4passengerModel[27].setRotationPoint(55F, -4F, -1F);

		gs4passengerModel[28].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // 29
		gs4passengerModel[28].setRotationPoint(-56F, -4F, -1F);

		gs4passengerModel[29].addBox(0F, 0F, 0F, 3, 26, 1, 0F); // 34
		gs4passengerModel[29].setRotationPoint(-53F, -29F, -11F);

		gs4passengerModel[30].addBox(0F, 0F, 0F, 6, 14, 1, 0F); // 35
		gs4passengerModel[30].setRotationPoint(-50F, -17F, -11F);

		gs4passengerModel[31].addBox(0F, 0F, 0F, 6, 5, 1, 0F); // 36
		gs4passengerModel[31].setRotationPoint(-50F, -29F, -11F);

		gs4passengerModel[32].addBox(0F, 0F, 0F, 3, 26, 1, 0F); // 37
		gs4passengerModel[32].setRotationPoint(-44F, -29F, -11F);

		gs4passengerModel[33].addBox(0F, 0F, 0F, 84, 14, 1, 0F); // 38
		gs4passengerModel[33].setRotationPoint(-41F, -17F, -11F);

		gs4passengerModel[34].addBox(0F, 0F, 0F, 84, 5, 1, 0F); // 39
		gs4passengerModel[34].setRotationPoint(-41F, -29F, -11F);

		gs4passengerModel[35].addBox(0F, 0F, 0F, 3, 7, 1, 0F); // 40
		gs4passengerModel[35].setRotationPoint(10F, -24F, -11F);

		gs4passengerModel[36].addBox(0F, 0F, 0F, 3, 26, 1, 0F); // 41
		gs4passengerModel[36].setRotationPoint(43F, -29F, -11F);

		gs4passengerModel[37].addBox(0F, 0F, 0F, 6, 5, 1, 0F); // 42
		gs4passengerModel[37].setRotationPoint(46F, -29F, -11F);

		gs4passengerModel[38].addBox(0F, 0F, 0F, 3, 26, 1, 0F); // 43
		gs4passengerModel[38].setRotationPoint(52F, -29F, -11F);

		gs4passengerModel[39].addBox(0F, 0F, 0F, 6, 14, 1, 0F); // 44
		gs4passengerModel[39].setRotationPoint(46F, -17F, -11F);

		gs4passengerModel[40].addBox(0F, 0F, 0F, 108, 1, 22, 0F); // 45
		gs4passengerModel[40].setRotationPoint(-53F, -3F, -11F);

		gs4passengerModel[41].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // 46
		gs4passengerModel[41].setRotationPoint(38F, -1F, 7F);

		gs4passengerModel[42].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // 47
		gs4passengerModel[42].setRotationPoint(20F, -1F, -7F);

		gs4passengerModel[43].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // 48
		gs4passengerModel[43].setRotationPoint(38F, -1F, -7F);

		gs4passengerModel[44].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // 49
		gs4passengerModel[44].setRotationPoint(20F, -1F, 7F);

		gs4passengerModel[45].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // 50
		gs4passengerModel[45].setRotationPoint(-24F, -1F, 7F);

		gs4passengerModel[46].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // 51
		gs4passengerModel[46].setRotationPoint(-42F, -1F, -7F);

		gs4passengerModel[47].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // 52
		gs4passengerModel[47].setRotationPoint(-24F, -1F, -7F);

		gs4passengerModel[48].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // 53
		gs4passengerModel[48].setRotationPoint(-42F, -1F, 7F);

		gs4passengerModel[49].addShapeBox(0F, 0F, 0F, 27, 3, 5, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 54
		gs4passengerModel[49].setRotationPoint(28F, -32F, -11F);

		gs4passengerModel[50].addShapeBox(0F, 0F, 0F, 27, 1, 5, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 55
		gs4passengerModel[50].setRotationPoint(28F, -33F, -6F);

		gs4passengerModel[51].addShapeBox(0F, 0F, 0F, 27, 3, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 56
		gs4passengerModel[51].setRotationPoint(28F, -32F, -6F);

		gs4passengerModel[52].addShapeBox(0F, 0F, 0F, 27, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 57
		gs4passengerModel[52].setRotationPoint(28F, -33F, -1F);

		gs4passengerModel[53].addBox(0F, 0F, 0F, 3, 7, 1, 0F); // 58
		gs4passengerModel[53].setRotationPoint(-9F, -24F, 10F);

		gs4passengerModel[54].addBox(0F, 0F, 0F, 3, 7, 1, 0F); // 59
		gs4passengerModel[54].setRotationPoint(10F, -24F, 10F);

		gs4passengerModel[55].addBox(0F, 0F, 0F, 3, 7, 1, 0F); // 60
		gs4passengerModel[55].setRotationPoint(26F, -24F, 10F);

		gs4passengerModel[56].addBox(0F, 0F, 0F, 3, 7, 1, 0F); // 61
		gs4passengerModel[56].setRotationPoint(27F, -24F, -11F);

		gs4passengerModel[57].addBox(0F, 0F, 0F, 3, 7, 1, 0F); // 62
		gs4passengerModel[57].setRotationPoint(-26F, -24F, -11F);

		gs4passengerModel[58].addBox(0F, 0F, 0F, 3, 7, 1, 0F); // 63
		gs4passengerModel[58].setRotationPoint(-9F, -24F, -11F);

		gs4passengerModel[59].addBox(0F, 0F, 0F, 8, 6, 11, 0F); // 32
		gs4passengerModel[59].setRotationPoint(36F, -9F, -1F);

		gs4passengerModel[60].addShapeBox(0F, 0F, 0F, 2, 11, 11, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F,
				0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // 33
		gs4passengerModel[60].setRotationPoint(43F, -20F, -1F);

		gs4passengerModel[61].addBox(0F, 0F, 0F, 8, 6, 11, 0F); // 32
		gs4passengerModel[61].setRotationPoint(19F, -9F, -1F);

		gs4passengerModel[62].addShapeBox(0F, 0F, 0F, 2, 11, 11, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F,
				0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // 33
		gs4passengerModel[62].setRotationPoint(26F, -20F, -1F);

		gs4passengerModel[63].addBox(0F, 0F, 0F, 8, 6, 11, 0F); // 32
		gs4passengerModel[63].setRotationPoint(3F, -9F, -1F);

		gs4passengerModel[64].addShapeBox(0F, 0F, 0F, 2, 11, 11, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F,
				0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // 33
		gs4passengerModel[64].setRotationPoint(10F, -20F, -1F);

		gs4passengerModel[65].addBox(0F, 0F, 0F, 8, 6, 11, 0F); // 32
		gs4passengerModel[65].setRotationPoint(-16F, -9F, -1F);

		gs4passengerModel[66].addShapeBox(0F, 0F, 0F, 2, 11, 11, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F,
				0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // 33
		gs4passengerModel[66].setRotationPoint(-9F, -20F, -1F);

		gs4passengerModel[67].addBox(0F, 0F, 0F, 8, 6, 11, 0F); // 32
		gs4passengerModel[67].setRotationPoint(-33F, -9F, -1F);

		gs4passengerModel[68].addShapeBox(0F, 0F, 0F, 2, 11, 11, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F,
				0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // 33
		gs4passengerModel[68].setRotationPoint(-26F, -20F, -1F);


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 69; i++)
        {
            gs4passengerModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo gs4passengerModel[];
}
