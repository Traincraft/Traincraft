//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 26.07.2018 - 00:01:09
// Last changed on: 26.07.2018 - 00:01:09

package train.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;
import fexcraft.tmt.slim.Tessellator;
import train.common.library.Info;

public class ModelE103 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelE103() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[183];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private ModelE103Bogie bogie = new ModelE103Bogie();


	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for (ModelRendererTurbo mrt : bodyModel) {
			if (mrt.boxName.equals("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				mrt.render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				mrt.render(f5);
			}
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/e103bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslated(-1.35,0.1,0.06);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3,0,0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 62
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 63
		bodyModel[2] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 132
		bodyModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 9
		bodyModel[4] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 11
		bodyModel[5] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 16
		bodyModel[6] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 17
		bodyModel[7] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 18
		bodyModel[8] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 21
		bodyModel[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 22
		bodyModel[10] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 23
		bodyModel[11] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 24
		bodyModel[12] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 25
		bodyModel[13] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 26
		bodyModel[14] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 27
		bodyModel[15] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 28
		bodyModel[16] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 29
		bodyModel[17] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 30
		bodyModel[18] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 31
		bodyModel[19] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 32
		bodyModel[20] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 33
		bodyModel[21] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 34
		bodyModel[22] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 35
		bodyModel[23] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 36
		bodyModel[24] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 37
		bodyModel[25] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 38
		bodyModel[26] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 39
		bodyModel[27] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 40
		bodyModel[28] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 41
		bodyModel[29] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 43
		bodyModel[30] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 44
		bodyModel[31] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 46
		bodyModel[32] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 47
		bodyModel[33] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 48
		bodyModel[34] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 49
		bodyModel[35] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 50
		bodyModel[36] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 51
		bodyModel[37] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 52
		bodyModel[38] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 53
		bodyModel[39] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 54
		bodyModel[40] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 55
		bodyModel[41] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 56
		bodyModel[42] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 58
		bodyModel[43] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 59
		bodyModel[44] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 60
		bodyModel[45] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 61
		bodyModel[46] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 63
		bodyModel[47] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 65
		bodyModel[48] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 67
		bodyModel[49] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 69
		bodyModel[50] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 70
		bodyModel[51] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 71
		bodyModel[52] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 73
		bodyModel[53] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 74
		bodyModel[54] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 75
		bodyModel[55] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 76
		bodyModel[56] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 77
		bodyModel[57] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 76
		bodyModel[58] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 77
		bodyModel[59] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 78
		bodyModel[60] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 79
		bodyModel[61] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 80
		bodyModel[62] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 81
		bodyModel[63] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 82
		bodyModel[64] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 90
		bodyModel[65] = new ModelRendererTurbo(this, 169, 17, textureX, textureY, "lamp"); // FrontLeftYellow
		bodyModel[66] = new ModelRendererTurbo(this, 137, 57, textureX, textureY, "lamp"); // Box 90
		bodyModel[67] = new ModelRendererTurbo(this, 49, 73, textureX, textureY, "lamp"); // Box 91
		bodyModel[68] = new ModelRendererTurbo(this, 73, 73, textureX, textureY, "lamp"); // Box 92
		bodyModel[69] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 93
		bodyModel[70] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 94
		bodyModel[71] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 95
		bodyModel[72] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 96
		bodyModel[73] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 97
		bodyModel[74] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 98
		bodyModel[75] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 99
		bodyModel[76] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 100
		bodyModel[77] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 101
		bodyModel[78] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 102
		bodyModel[79] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 103
		bodyModel[80] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 104
		bodyModel[81] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 105
		bodyModel[82] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 106
		bodyModel[83] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 107
		bodyModel[84] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 108
		bodyModel[85] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 109
		bodyModel[86] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 110
		bodyModel[87] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 111
		bodyModel[88] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 112
		bodyModel[89] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 113
		bodyModel[90] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 114
		bodyModel[91] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 115
		bodyModel[92] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 116
		bodyModel[93] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 117
		bodyModel[94] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 118
		bodyModel[95] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 119
		bodyModel[96] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 120
		bodyModel[97] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 117
		bodyModel[98] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 118
		bodyModel[99] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 119
		bodyModel[100] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 120
		bodyModel[101] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 121
		bodyModel[102] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 122
		bodyModel[103] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 123
		bodyModel[104] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 124
		bodyModel[105] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 125
		bodyModel[106] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 126
		bodyModel[107] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 127
		bodyModel[108] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 128
		bodyModel[109] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 129
		bodyModel[110] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 130
		bodyModel[111] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 131
		bodyModel[112] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 132
		bodyModel[113] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 56
		bodyModel[114] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 57
		bodyModel[115] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 58
		bodyModel[116] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 59
		bodyModel[117] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 137
		bodyModel[118] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 138
		bodyModel[119] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 139
		bodyModel[120] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 140
		bodyModel[121] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 141
		bodyModel[122] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 142
		bodyModel[123] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 143
		bodyModel[124] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 145
		bodyModel[125] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 146
		bodyModel[126] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 147
		bodyModel[127] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 148
		bodyModel[128] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 149
		bodyModel[129] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 150
		bodyModel[130] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 151
		bodyModel[131] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 152
		bodyModel[132] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 153
		bodyModel[133] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 154
		bodyModel[134] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 155
		bodyModel[135] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 156
		bodyModel[136] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 157
		bodyModel[137] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 158
		bodyModel[138] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 159
		bodyModel[139] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 160
		bodyModel[140] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 161
		bodyModel[141] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 162
		bodyModel[142] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 163
		bodyModel[143] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 164
		bodyModel[144] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 165
		bodyModel[145] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 166
		bodyModel[146] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 167
		bodyModel[147] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 168
		bodyModel[148] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 169
		bodyModel[149] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 170
		bodyModel[150] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 171
		bodyModel[151] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 172
		bodyModel[152] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 173
		bodyModel[153] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 174
		bodyModel[154] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 175
		bodyModel[155] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 174
		bodyModel[156] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 175
		bodyModel[157] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 176
		bodyModel[158] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 177
		bodyModel[159] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 178
		bodyModel[160] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 179
		bodyModel[161] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 180
		bodyModel[162] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 181
		bodyModel[163] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 182
		bodyModel[164] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 183
		bodyModel[165] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 184
		bodyModel[166] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 185
		bodyModel[167] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 186
		bodyModel[168] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 187
		bodyModel[169] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 188
		bodyModel[170] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 189
		bodyModel[171] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 190
		bodyModel[172] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 191
		bodyModel[173] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 192
		bodyModel[174] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 194
		bodyModel[175] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 196
		bodyModel[176] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 197
		bodyModel[177] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 198
		bodyModel[178] = new ModelRendererTurbo(this, 233, 49, textureX, textureY, "lamp"); // Box 199
		bodyModel[179] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 200
		bodyModel[180] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 180
		bodyModel[181] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 181
		bodyModel[182] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 182

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 62
		bodyModel[0].setRotationPoint(52F, -1F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 63
		bodyModel[1].setRotationPoint(52F, -1F, 7F);

		bodyModel[2].addBox(0F, 0F, 0F, 65, 1, 22, 0F); // Box 132
		bodyModel[2].setRotationPoint(-28F, 0F, -11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 9
		bodyModel[3].setRotationPoint(-44F, -1F, -10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 11
		bodyModel[4].setRotationPoint(-44F, -1F, 7F);

		bodyModel[5].addBox(0F, 0F, 0F, 49, 12, 1, 0F); // Box 16
		bodyModel[5].setRotationPoint(-20F, -12F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 49, 6, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 17
		bodyModel[6].setRotationPoint(-20F, -18F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 65, 4, 6, 0F,0F, -1F, -6F, 0F, -1F, -6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 18
		bodyModel[7].setRotationPoint(-28F, -22F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 65, 4, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[8].setRotationPoint(-28F, -22F, 4F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 65, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[9].setRotationPoint(-28F, -21F, -4F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 6, 5, 7, 0F,-2F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F); // Box 23
		bodyModel[10].setRotationPoint(-43F, -5F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 13, 5, 4, 0F,-13F, 0F, 0F, 0F, 0F, -1F, -12F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, -1F, -11F, 0F, 0F, -1F, 0F, 0F); // Box 24
		bodyModel[11].setRotationPoint(-41F, -5F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 7, 7, 0F,-4F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[12].setRotationPoint(-43F, -12F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 13, 7, 4, 0F,-13F, 0F, 0F, 0F, 0F, -1F, -10F, 0F, 0F, -2F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, -1F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[13].setRotationPoint(-41F, -12F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 8, 6, 7, 0F,-7F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -6.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 27
		bodyModel[14].setRotationPoint(-42F, -18F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 11, 6, 6, 0F,-11F, 0F, -1F, 0F, 0F, -2F, -6F, 0F, -2F, -4F, 0F, -2F, -11F, 0F, 0F, 0F, 0F, -1F, -10F, 0F, -2F, 0F, 0F, -2F); // Box 28
		bodyModel[15].setRotationPoint(-39F, -18F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 9, 5, 4, 0F,-9F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -9F, -2F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[16].setRotationPoint(-37F, -23F, -4F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 7, 3, 6, 0F,0F, -3F, -3F, 0F, 0F, -6F, 0F, -1F, 0F, -7F, -1F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -3F); // Box 30
		bodyModel[17].setRotationPoint(-35F, -21F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 9, 5, 3, 0F,-8F, -2F, -3F, -1F, -3F, -3F, -1F, -3F, 0F, -8F, -2F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[18].setRotationPoint(-36F, -23F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 13, 5, 4, 0F,0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, -1F, -13F, 0F, 0F, -1F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, -1F, -13F, 0F, 0F); // Box 32
		bodyModel[19].setRotationPoint(-41F, -5F, 7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 6, 5, 7, 0F,0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F); // Box 33
		bodyModel[20].setRotationPoint(-43F, -5F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 7, 7, 0F,-1.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 34
		bodyModel[21].setRotationPoint(-43F, -12F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 13, 7, 4, 0F,-2F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -1F, -13F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, -1F, -13F, 0F, 0F); // Box 35
		bodyModel[22].setRotationPoint(-41F, -12F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 11, 6, 6, 0F,-4F, 0F, -2F, -6F, 0F, -2F, 0F, 0F, -2F, -11F, 0F, -1F, 0F, 0F, -2F, -10F, 0F, -2F, 0F, 0F, -1F, -11F, 0F, 0F); // Box 36
		bodyModel[23].setRotationPoint(-39F, -18F, 5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 8, 6, 7, 0F,-5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -0.5F, 0F, 0F, -6.5F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F); // Box 37
		bodyModel[24].setRotationPoint(-42F, -18F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 7, 3, 6, 0F,-7F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, -3F, -3F, -1F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 38
		bodyModel[25].setRotationPoint(-35F, -21F, 4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 9, 5, 3, 0F,-8F, -2F, 0F, -1F, -3F, 0F, -1F, -3F, -3F, -8F, -2F, -3F, 0F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, -1F, 0F, 0F); // Box 39
		bodyModel[26].setRotationPoint(-36F, -23F, 4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 9, 5, 4, 0F,-9F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -9F, -2F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, -1F, 0F, 0F); // Box 40
		bodyModel[27].setRotationPoint(-37F, -23F, 0F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 5, 7, 0F,-3F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[28].setRotationPoint(-40F, 2F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 5, 7, 0F,-1F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F); // Box 43
		bodyModel[29].setRotationPoint(-40F, 2F, 0F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 12, 2, 22, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 44
		bodyModel[30].setRotationPoint(-40F, 0F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -1F); // Box 46
		bodyModel[31].setRotationPoint(52F, 0F, -7F);
		bodyModel[31].rotateAngleY = -3.14159265F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 12, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 47
		bodyModel[32].setRotationPoint(37F, 0F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 5, 7, 0F,-5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F); // Box 48
		bodyModel[33].setRotationPoint(46F, -5F, 0F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 13, 5, 4, 0F,-12F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, -1F, -11F, 0F, 0F, -1F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, -1F); // Box 49
		bodyModel[34].setRotationPoint(37F, -5F, 7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 13, 7, 4, 0F,-10F, 0F, 0F, -2F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, -1F, -12F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, -1F); // Box 50
		bodyModel[35].setRotationPoint(37F, -12F, 7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 7, 7, 0F,-2.5F, 0F, 0F, -1.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 51
		bodyModel[36].setRotationPoint(47F, -12F, 0F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 8, 6, 7, 0F,-2F, 0F, 0F, -5F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F); // Box 52
		bodyModel[37].setRotationPoint(43F, -18F, 0F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 11, 6, 6, 0F,-6F, 0F, -2F, -4F, 0F, -2F, -11F, 0F, -1F, 0F, 0F, -2F, -10F, 0F, -2F, 0F, 0F, -2F, -11F, 0F, 0F, 0F, 0F, -1F); // Box 53
		bodyModel[38].setRotationPoint(37F, -18F, 5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 7, 3, 6, 0F,0F, -1F, 0F, -7F, -1F, 0F, 0F, -3F, -3F, 0F, 0F, -6F, 0F, 0F, -5F, -1F, 0F, -3F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[39].setRotationPoint(37F, -21F, 4F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 9, 5, 3, 0F,-1F, -3F, 0F, -8F, -2F, 0F, -8F, -2F, -3F, -1F, -3F, -3F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F); // Box 55
		bodyModel[40].setRotationPoint(36F, -23F, 4F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 9, 5, 4, 0F,0F, -3F, 0F, -9F, -2F, 0F, -9F, -2F, 0F, 0F, -3F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F); // Box 56
		bodyModel[41].setRotationPoint(37F, -23F, 0F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 9, 5, 4, 0F,0F, -3F, 0F, -9F, -2F, 0F, -9F, -2F, 0F, 0F, -3F, 0F, -7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 58
		bodyModel[42].setRotationPoint(37F, -23F, -4F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 9, 5, 3, 0F,-1F, -3F, -3F, -8F, -2F, -3F, -8F, -2F, 0F, -1F, -3F, 0F, -7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 59
		bodyModel[43].setRotationPoint(36F, -23F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 7, 3, 6, 0F,0F, 0F, -6F, 0F, -3F, -3F, -7F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -5F); // Box 60
		bodyModel[44].setRotationPoint(37F, -21F, -10F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 8, 6, 7, 0F,0F, 0F, 0F, -7F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -6.5F, 0F, 0F); // Box 61
		bodyModel[45].setRotationPoint(43F, -18F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 7, 7, 0F,0F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 63
		bodyModel[46].setRotationPoint(47F, -12F, -7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 6, 5, 7, 0F,-3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F); // Box 65
		bodyModel[47].setRotationPoint(46F, -5F, -7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 67
		bodyModel[48].setRotationPoint(49F, 0F, -7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 13, 5, 4, 0F,0F, 0F, -1F, -13F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, -1F, -13F, 0F, 0F, -1F, 0F, 0F, -11F, 0F, 0F); // Box 69
		bodyModel[49].setRotationPoint(37F, -5F, -11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 13, 7, 4, 0F,0F, 0F, -1F, -13F, 0F, 0F, -2F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -1F, -13F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); // Box 70
		bodyModel[50].setRotationPoint(37F, -12F, -11F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 11, 6, 6, 0F,0F, 0F, -2F, -11F, 0F, -1F, -4F, 0F, -2F, -6F, 0F, -2F, 0F, 0F, -1F, -11F, 0F, 0F, 0F, 0F, -2F, -10F, 0F, -2F); // Box 71
		bodyModel[51].setRotationPoint(37F, -18F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 73
		bodyModel[52].setRotationPoint(-42F, 0F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 6, 5, 7, 0F,-2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 74
		bodyModel[53].setRotationPoint(43F, 2F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 5, 7, 0F,-4F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F); // Box 75
		bodyModel[54].setRotationPoint(43F, 2F, 0F);

		bodyModel[55].addBox(0F, 0F, 0F, 65, 1, 1, 0F); // Box 76
		bodyModel[55].setRotationPoint(-28F, 1F, 10F);

		bodyModel[56].addBox(0F, 0F, 0F, 65, 1, 1, 0F); // Box 77
		bodyModel[56].setRotationPoint(-28F, 1F, -11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 76
		bodyModel[57].setRotationPoint(-19F, -22F, 0.5F);
		bodyModel[57].rotateAngleY = -3.14159265F;
		bodyModel[57].rotateAngleZ = 0.31415927F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[58].setRotationPoint(-20F, -22F, -4F);

		bodyModel[59].addShapeBox(-11F, -1F, 0F, 9, 1, 2, 0F,0F, -0.2F, -1.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -1.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -1.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -1.1F, 0F, -0.2F, -0.1F); // Box 78
		bodyModel[59].setRotationPoint(-30F, -23F, 0.5F);
		bodyModel[59].rotateAngleY = -3.14159265F;
		bodyModel[59].rotateAngleZ = -0.33161256F;

		bodyModel[60].addShapeBox(-11F, -1F, -2F, 9, 1, 2, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -1.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -1.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -1.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -1.1F); // Box 79
		bodyModel[60].setRotationPoint(-30F, -23F, -0.5F);
		bodyModel[60].rotateAngleY = -3.14159265F;
		bodyModel[60].rotateAngleZ = -0.33161256F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[61].setRotationPoint(-20F, -28F, -6.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[62].setRotationPoint(-20F, -28F, -4.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 82
		bodyModel[63].setRotationPoint(-20F, -28F, 4.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[64].setRotationPoint(-42.7F, -3F, -2F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, -0.4F, -0.4F, -7F, -0.4F, -0.1F, -0.8F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -7F, -0.4F, -0.1F, -0.8F, 0F, 0F, 0F, -0.4F, -0.4F); // FrontLeftYellow
		bodyModel[65].setRotationPoint(-39F, -4F, 7.75F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, -0.4F, -0.4F, -0.8F, 0F, 0F, -7F, -0.4F, -0.1F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.8F, 0F, 0F, -7F, -0.4F, -0.1F, 0F, -0.4F, -0.4F); // Box 90
		bodyModel[66].setRotationPoint(-39F, -4F, -9.75F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,-0.8F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -7F, -0.4F, -0.1F, -0.8F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -7F, -0.4F, -0.1F); // Box 91
		bodyModel[67].setRotationPoint(39F, -4F, -9.75F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,-7F, -0.4F, -0.1F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.8F, 0F, 0F, -7F, -0.4F, -0.1F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.8F, 0F, 0F); // Box 92
		bodyModel[68].setRotationPoint(39F, -4F, 7.75F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 93
		bodyModel[69].setRotationPoint(-22F, -18F, -11F);

		bodyModel[70].addShapeBox(3F, -6F, 0F, 2, 6, 2, 0F,0F, 0F, -1.2F, -2F, 0F, -1.2F, -2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F); // Box 94
		bodyModel[70].setRotationPoint(-25F, -12F, -11F);

		bodyModel[71].addShapeBox(0F, -6F, 0F, 3, 6, 2, 0F,0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F); // Box 95
		bodyModel[71].setRotationPoint(-25F, -12F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 96
		bodyModel[72].setRotationPoint(-25F, -12F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 14, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -12F, 0F, 0F); // Box 97
		bodyModel[73].setRotationPoint(37F, 0F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[74].setRotationPoint(49F, 0F, -7F);

		bodyModel[75].addBox(0F, 0F, 0F, 3, 12, 1, 0F); // Box 99
		bodyModel[75].setRotationPoint(-28F, -12F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 100
		bodyModel[76].setRotationPoint(-28F, -18F, -11F);

		bodyModel[77].addBox(0F, 0F, 0F, 3, 12, 1, 0F); // Box 101
		bodyModel[77].setRotationPoint(34F, -12F, -11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 102
		bodyModel[78].setRotationPoint(34F, -18F, -11F);

		bodyModel[79].addShapeBox(-5F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 103
		bodyModel[79].setRotationPoint(34F, -12F, -11F);

		bodyModel[80].addShapeBox(-3F, -6F, 0F, 3, 6, 2, 0F,0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F); // Box 104
		bodyModel[80].setRotationPoint(34F, -12F, -11F);

		bodyModel[81].addShapeBox(-5F, -6F, 0F, 2, 6, 2, 0F,-2F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, -2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F); // Box 105
		bodyModel[81].setRotationPoint(34F, -12F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F); // Box 106
		bodyModel[82].setRotationPoint(29F, -18F, -11F);

		bodyModel[83].addBox(0F, 0F, 0F, 49, 12, 1, 0F); // Box 107
		bodyModel[83].setRotationPoint(-20F, -12F, 10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 49, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[84].setRotationPoint(-20F, -18F, 9F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 109
		bodyModel[85].setRotationPoint(-22F, -18F, 9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 110
		bodyModel[86].setRotationPoint(-22F, -18F, 9F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 111
		bodyModel[87].setRotationPoint(-25F, -18F, 9F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 112
		bodyModel[88].setRotationPoint(-25F, -12F, 10F);

		bodyModel[89].addBox(0F, 0F, 0F, 3, 12, 1, 0F); // Box 113
		bodyModel[89].setRotationPoint(-28F, -12F, 10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[90].setRotationPoint(-28F, -18F, 9F);

		bodyModel[91].addBox(0F, 0F, 0F, 3, 12, 1, 0F); // Box 115
		bodyModel[91].setRotationPoint(34F, -12F, 10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[92].setRotationPoint(34F, -18F, 9F);

		bodyModel[93].addShapeBox(-5F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 117
		bodyModel[93].setRotationPoint(34F, -12F, 10F);

		bodyModel[94].addShapeBox(-3F, -6F, -1F, 3, 6, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 118
		bodyModel[94].setRotationPoint(34F, -12F, 10F);

		bodyModel[95].addShapeBox(-5F, -6F, -1F, 2, 6, 2, 0F,-2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, -2F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 119
		bodyModel[95].setRotationPoint(34F, -12F, 10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[96].setRotationPoint(29F, -18F, 9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 14, 2, 4, 0F,-12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 117
		bodyModel[97].setRotationPoint(37F, 0F, 7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[98].setRotationPoint(49F, 0F, 4F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 119
		bodyModel[99].setRotationPoint(52F, 0F, 10F);
		bodyModel[99].rotateAngleY = -3.14159265F;

		bodyModel[100].addShapeBox(0F, 0F, 0F, 14, 2, 4, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[100].setRotationPoint(-42F, 0F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 121
		bodyModel[101].setRotationPoint(-42F, 0F, -7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -0.5F); // Box 122
		bodyModel[102].setRotationPoint(-42F, 0F, -7F);
		bodyModel[102].rotateAngleY = -3.14159265F;

		bodyModel[103].addShapeBox(0F, 0F, 0F, 14, 2, 4, 0F,0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 123
		bodyModel[103].setRotationPoint(-42F, 0F, 7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[104].setRotationPoint(-42F, 0F, 4F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 125
		bodyModel[105].setRotationPoint(-42F, 0F, 10F);
		bodyModel[105].rotateAngleY = -3.14159265F;

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 126
		bodyModel[106].setRotationPoint(-42.7F, -3F, 0F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[107].setRotationPoint(50.7F, -3F, -2F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[108].setRotationPoint(50.7F, -3F, 0F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 12, 20, 0F); // Box 129
		bodyModel[109].setRotationPoint(-19F, -12F, -10F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 6, 18, 0F); // Box 130
		bodyModel[110].setRotationPoint(-19F, -18F, -9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[111].setRotationPoint(-19F, -18F, -10F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[112].setRotationPoint(-19F, -18F, 9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 9, 6, 0F,1.5F, -0.2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[113].setRotationPoint(-28F, -13F, 5F);
		bodyModel[113].rotateAngleY = -3.14159265F;

		bodyModel[114].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 57
		bodyModel[114].setRotationPoint(-27F, -13.2F, 4F);
		bodyModel[114].rotateAngleY = -3.14159265F;

		bodyModel[115].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 58
		bodyModel[115].setRotationPoint(-28F, -4F, 5F);
		bodyModel[115].rotateAngleY = -3.14159265F;

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 59
		bodyModel[116].setRotationPoint(-29.5F, -3F, 5F);
		bodyModel[116].rotateAngleY = -3.14159265F;

		bodyModel[117].addBox(0F, 0F, 0F, 3, 9, 2, 0F); // Box 137
		bodyModel[117].setRotationPoint(-37F, -9F, 5F);

		bodyModel[118].addBox(0F, 0F, 0F, 3, 9, 6, 0F); // Box 138
		bodyModel[118].setRotationPoint(-37F, -9F, -7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, 0F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -1.6F); // Box 139
		bodyModel[119].setRotationPoint(-37F, -10F, 7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 12, 2, 0F,0F, -0.5F, -1.6F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.6F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[120].setRotationPoint(-37F, -12F, -9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[121].setRotationPoint(-37F, -11F, -4F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[122].setRotationPoint(-37F, -9F, -1F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[123].setRotationPoint(-38.5F, -12F, -4F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[124].setRotationPoint(-37F, -12F, -7F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-1.9F, -0.5F, -1.05F, 0F, -0.5F, -0.7F, 0F, -0.5F, 0F, -0.85F, -0.5F, 0F, -1.9F, 0F, -1.05F, 0F, 0F, -0.7F, 0F, 0F, 0F, -0.85F, 0F, 0F); // Box 146
		bodyModel[125].setRotationPoint(-40F, -12F, -8F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, -0.6F, -0.4F, -0.5F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, -0.4F, 0F, -1F); // Box 147
		bodyModel[126].setRotationPoint(-38.5F, -12F, 6F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[127].setRotationPoint(-40.5F, -11.5F, -4F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 149
		bodyModel[128].setRotationPoint(-40.5F, -11.5F, 0F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[129].setRotationPoint(43F, -11F, -7F);

		bodyModel[130].addBox(0F, 0F, 0F, 3, 9, 6, 0F); // Box 151
		bodyModel[130].setRotationPoint(43F, -9F, 1F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 12, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.6F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, -0.8F); // Box 152
		bodyModel[131].setRotationPoint(43F, -12F, 7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[132].setRotationPoint(43F, -12F, 4F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, -0.5F, 0F, -0.85F, -0.5F, 0F, -1.9F, -0.5F, -1.05F, 0F, -0.5F, -0.7F, 0F, 0F, 0F, -0.85F, 0F, 0F, -1.9F, 0F, -1.05F, 0F, 0F, -0.7F); // Box 154
		bodyModel[133].setRotationPoint(46F, -12F, 4F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[134].setRotationPoint(47.5F, -11.5F, 0F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[135].setRotationPoint(47.5F, -11.5F, -6F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, -2F, -0.6F, -0.4F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, -0.6F, -0.4F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 157
		bodyModel[136].setRotationPoint(45.5F, -12F, -8F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,0F, 0F, -0.8F, 0F, 0F, -1.6F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, 0F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[137].setRotationPoint(43F, -10F, -9F);

		bodyModel[138].addBox(0F, 0F, 0F, 3, 9, 2, 0F); // Box 159
		bodyModel[138].setRotationPoint(43F, -9F, -7F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 9, 6, 0F,-1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[139].setRotationPoint(38F, -13F, 1F);
		bodyModel[139].rotateAngleY = -3.14159265F;

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 161
		bodyModel[140].setRotationPoint(43F, -9F, -5F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 162
		bodyModel[141].setRotationPoint(37F, -13.2F, 0F);
		bodyModel[141].rotateAngleY = -3.14159265F;

		bodyModel[142].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[142].setRotationPoint(42F, -4F, 1F);
		bodyModel[142].rotateAngleY = -3.14159265F;

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 164
		bodyModel[143].setRotationPoint(41.5F, -3F, 1F);
		bodyModel[143].rotateAngleY = -3.14159265F;

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 165
		bodyModel[144].setRotationPoint(45.5F, -12F, -6F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 166
		bodyModel[145].setRotationPoint(-19F, -20F, -4F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[146].setRotationPoint(-19F, -20F, -9F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[147].setRotationPoint(-19F, -20F, 4F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[148].setRotationPoint(27F, -20F, 4F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 170
		bodyModel[149].setRotationPoint(27F, -20F, -4F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[150].setRotationPoint(27F, -20F, -9F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[151].setRotationPoint(27F, -18F, -10F);

		bodyModel[152].addBox(0F, 0F, 0F, 1, 6, 18, 0F); // Box 173
		bodyModel[152].setRotationPoint(27F, -18F, -9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[153].setRotationPoint(27F, -18F, 9F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 12, 20, 0F); // Box 175
		bodyModel[154].setRotationPoint(27F, -12F, -10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[155].setRotationPoint(-18F, -17F, 10F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[156].setRotationPoint(15F, -17F, 10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[157].setRotationPoint(-3F, -17F, 10F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[158].setRotationPoint(-18F, -11F, 10.15F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[159].setRotationPoint(15F, -11F, 10.15F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[160].setRotationPoint(-3F, -11F, 10.15F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F); // Box 180
		bodyModel[161].setRotationPoint(-18F, -17F, -11F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F); // Box 181
		bodyModel[162].setRotationPoint(15F, -17F, -11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F,0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F); // Box 182
		bodyModel[163].setRotationPoint(-3F, -17F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 183
		bodyModel[164].setRotationPoint(-18F, -11F, -11.15F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 184
		bodyModel[165].setRotationPoint(15F, -11F, -11.15F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 185
		bodyModel[166].setRotationPoint(-3F, -11F, -11.15F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[167].setRotationPoint(26F, -22F, -4F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 187
		bodyModel[168].setRotationPoint(28F, -22F, -0.5F);
		bodyModel[168].rotateAngleZ = 0.31415927F;

		bodyModel[169].addShapeBox(-11F, -1F, -2F, 9, 1, 2, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -1.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -1.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -1.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -1.1F); // Box 188
		bodyModel[169].setRotationPoint(39F, -23F, 0.5F);
		bodyModel[169].rotateAngleZ = -0.33161256F;

		bodyModel[170].addShapeBox(-11F, -1F, 0F, 9, 1, 2, 0F,0F, -0.2F, -1.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -1.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -1.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -1.1F, 0F, -0.2F, -0.1F); // Box 189
		bodyModel[170].setRotationPoint(39F, -23F, -0.5F);
		bodyModel[170].rotateAngleZ = -0.33161256F;

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 190
		bodyModel[171].setRotationPoint(28F, -28F, 4.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[172].setRotationPoint(28F, -28F, -6.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[173].setRotationPoint(28F, -28F, -4.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1.05F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[174].setRotationPoint(-42.5F, -10F, -2F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.35F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 196
		bodyModel[175].setRotationPoint(-42.5F, -10F, 0F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, 0F, 0F, -0.95F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[176].setRotationPoint(50.5F, -10F, -2F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -1.05F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[177].setRotationPoint(50.5F, -10F, 0F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 199
		bodyModel[178].setRotationPoint(-42F, -12F, -1F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 200
		bodyModel[179].setRotationPoint(50F, -12F, -1F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 31, 2, 8, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[180].setRotationPoint(-11F, -23F, -4F);

		bodyModel[181].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 181
		bodyModel[181].setRotationPoint(49F, 2F, -1F);

		bodyModel[182].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 182
		bodyModel[182].setRotationPoint(-45F, 2F, -1F);
	}
}