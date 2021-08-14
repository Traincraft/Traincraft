//mario eh eh eh
package train.client.render.models; //Path where your ass is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.render.models.cabs.ModelD9_Cab4Window;
import train.client.render.models.cabs.ModelD9_CabSquareWindow;
import train.common.api.AbstractTrains;
import train.common.library.Info;

import java.util.ArrayList;

public class ModelDash9_44CW extends ModelConverter //Same as my ass
{
	int textureX = 512;
	int textureY = 256;

	public ModelDash9_44CW() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[173];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 31
		bodyModel[1] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 33
		bodyModel[2] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 34
		bodyModel[3] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 45
		bodyModel[4] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 61
		bodyModel[5] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 81
		bodyModel[6] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 82
		bodyModel[7] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 83
		bodyModel[8] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 84
		bodyModel[9] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 139
		bodyModel[10] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 140
		bodyModel[11] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 143
		bodyModel[12] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 144
		bodyModel[13] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 162
		bodyModel[14] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 163
		bodyModel[15] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 164
		bodyModel[16] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 82
		bodyModel[17] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 96
		bodyModel[18] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 97
		bodyModel[19] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 124
		bodyModel[20] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 130
		bodyModel[21] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 131
		bodyModel[22] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 122 CANADA WHAT
		bodyModel[23] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 2
		bodyModel[24] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 122
		bodyModel[25] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 128
		bodyModel[26] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 130 this is 2 kinds of railing
		bodyModel[27] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 129
		bodyModel[28] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 131
		bodyModel[29] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 132
		bodyModel[30] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 76
		bodyModel[31] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 85
		bodyModel[32] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 85
		bodyModel[33] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 136
		bodyModel[34] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 138
		bodyModel[35] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 139
		bodyModel[36] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 141
		bodyModel[37] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 142
		bodyModel[38] = new ModelRendererTurbo(this, 1, 34, textureX, textureY); // Box 143
		bodyModel[39] = new ModelRendererTurbo(this, 25, 34, textureX, textureY); // Box 141
		bodyModel[40] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 143
		bodyModel[41] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 144
		bodyModel[42] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 169
		bodyModel[43] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 170
		bodyModel[44] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 171
		bodyModel[45] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 177
		bodyModel[46] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 187
		bodyModel[47] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 188
		bodyModel[48] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 184
		bodyModel[49] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 135
		bodyModel[50] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 136
		bodyModel[51] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 137
		bodyModel[52] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 138
		bodyModel[53] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 139
		bodyModel[54] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 97
		bodyModel[55] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 138
		bodyModel[56] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 123
		bodyModel[57] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 125
		bodyModel[58] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 138
		bodyModel[59] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 97
		bodyModel[60] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 97
		bodyModel[61] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 145
		bodyModel[62] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 146
		bodyModel[63] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 147
		bodyModel[64] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 78
		bodyModel[65] = new ModelRendererTurbo(this, 209, 9, textureX, textureY, "lamp"); // Box 189 lamp ditch front
		bodyModel[66] = new ModelRendererTurbo(this, 353, 9, textureX, textureY, "lamp"); // Box 150 lamp lamp ditch front
		bodyModel[67] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 151
		bodyModel[68] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 4
		bodyModel[69] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 2
		bodyModel[70] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 4
		bodyModel[71] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 4
		bodyModel[72] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 4
		bodyModel[73] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 4
		bodyModel[74] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 4
		bodyModel[75] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 4
		bodyModel[76] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 164
		bodyModel[77] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 165
		bodyModel[78] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 166
		bodyModel[79] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 167
		bodyModel[80] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 168
		bodyModel[81] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 169
		bodyModel[82] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 170
		bodyModel[83] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 171
		bodyModel[84] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 173
		bodyModel[85] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 174
		bodyModel[86] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 175
		bodyModel[87] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 176
		bodyModel[88] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 181
		bodyModel[89] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 182
		bodyModel[90] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 183
		bodyModel[91] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 184
		bodyModel[92] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 188
		bodyModel[93] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 189
		bodyModel[94] = new ModelRendererTurbo(this, 41, 34, textureX, textureY); // Box 191
		bodyModel[95] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 192
		bodyModel[96] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 193
		bodyModel[97] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 194
		bodyModel[98] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 195
		bodyModel[99] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 196
		bodyModel[100] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 197
		bodyModel[101] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 198
		bodyModel[102] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 199
		bodyModel[103] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 200
		bodyModel[104] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 205
		bodyModel[105] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 206
		bodyModel[106] = new ModelRendererTurbo(this, 89, 57, textureX, textureY, "lamp"); // Box 207 lamp ditch rear
		bodyModel[107] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 211
		bodyModel[108] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 212
		bodyModel[109] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 213
		bodyModel[110] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 214
		bodyModel[111] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 215
		bodyModel[112] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 216
		bodyModel[113] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 217
		bodyModel[114] = new ModelRendererTurbo(this, 153, 65, textureX, textureY, "lamp"); // Box 218 lamp ditch rear
		bodyModel[115] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 219
		bodyModel[116] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 220
		bodyModel[117] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 31
		bodyModel[118] = new ModelRendererTurbo(this, 177, 65, textureX, textureY, "lamp"); // Box 247 lamp rear
		bodyModel[119] = new ModelRendererTurbo(this, 185, 65, textureX, textureY, "lamp"); // Box 248 lamp rear
		bodyModel[120] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 226
		bodyModel[121] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 231
		bodyModel[122] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 346
		bodyModel[123] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 347
		bodyModel[124] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 208
		bodyModel[125] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 209
		bodyModel[126] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 218
		bodyModel[127] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 219
		bodyModel[128] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 220
		bodyModel[129] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 221
		bodyModel[130] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 222
		bodyModel[131] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 223
		bodyModel[132] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 224
		bodyModel[133] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 225
		bodyModel[134] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 226
		bodyModel[135] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 227
		bodyModel[136] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 228
		bodyModel[137] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 229
		bodyModel[138] = new ModelRendererTurbo(this, 193, 65, textureX, textureY, "lamp"); // Box 230 lamp lamp ditch front
		bodyModel[139] = new ModelRendererTurbo(this, 385, 65, textureX, textureY, "lamp"); // Box 231 lamp lamp ditch front
		bodyModel[140] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 232
		bodyModel[141] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 233
		bodyModel[142] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 88
		bodyModel[143] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 90
		bodyModel[144] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 119
		bodyModel[145] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 126
		bodyModel[146] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 127
		bodyModel[147] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 128
		bodyModel[148] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 129
		bodyModel[149] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 130
		bodyModel[150] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 135
		bodyModel[151] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 136
		bodyModel[152] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 132
		bodyModel[153] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 133
		bodyModel[154] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 134
		bodyModel[155] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 233
		bodyModel[156] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 122 OTHER BIT
		bodyModel[157] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 402
		bodyModel[158] = new ModelRendererTurbo(this, 79, 100, textureX, textureY); // Box 237
		bodyModel[159] = new ModelRendererTurbo(this, 9, 122, textureX, textureY); // Box 172
		bodyModel[160] = new ModelRendererTurbo(this, 6, 122, textureX, textureY); // Box 221
		bodyModel[161] = new ModelRendererTurbo(this, 32, 122, textureX, textureY); // Box 222
		bodyModel[162] = new ModelRendererTurbo(this, 35, 122, textureX, textureY); // Box 223
		bodyModel[163] = new ModelRendererTurbo(this, 17, 138, textureX, textureY); // Box 296
		bodyModel[164] = new ModelRendererTurbo(this, 6, 139, textureX, textureY); // Box 280
		bodyModel[165] = new ModelRendererTurbo(this, 9, 139, textureX, textureY); // Box 281
		bodyModel[166] = new ModelRendererTurbo(this, 12, 138, textureX, textureY); // Box 282
		bodyModel[167] = new ModelRendererTurbo(this, 17, 138, textureX, textureY); // Box 228
		bodyModel[168] = new ModelRendererTurbo(this, 12, 138, textureX, textureY); // Box 229
		bodyModel[169] = new ModelRendererTurbo(this, 106, 76, textureX, textureY, "lamp"); // Box 231 lamp lamp ditch front
		bodyModel[170] = new ModelRendererTurbo(this, 180, 98, textureX, textureY); // Box 232
		bodyModel[171] = new ModelRendererTurbo(this, 106, 76, textureX, textureY, "lamp"); // Box 231 lamp lamp ditch front
		bodyModel[172] = new ModelRendererTurbo(this, 180, 98, textureX, textureY); // Box 232

		bodyModel[0].addBox(0F, 0F, 0F, 89, 1, 4, 0F); // Box 31
		bodyModel[0].setRotationPoint(-44F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 6, 2, 14, 0F); // Box 33
		bodyModel[1].setRotationPoint(-51F, -1F, -7F);

		bodyModel[2].addBox(0F, 0F, 0F, 89, 1, 4, 0F); // Box 34
		bodyModel[2].setRotationPoint(-44F, -1F, 7F);

		bodyModel[3].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 45
		bodyModel[3].setRotationPoint(-51F, -9F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[4].setRotationPoint(-44F, 1F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 81
		bodyModel[5].setRotationPoint(30F, 0F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 82
		bodyModel[6].setRotationPoint(16F, 0F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 83
		bodyModel[7].setRotationPoint(-16F, 1F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 84
		bodyModel[8].setRotationPoint(-31F, 1F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 139
		bodyModel[9].setRotationPoint(-51F, -1F, 10F);

		bodyModel[10].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 140
		bodyModel[10].setRotationPoint(-51F, -1F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[11].setRotationPoint(-51F, -7F, 8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 144
		bodyModel[12].setRotationPoint(-51F, -7F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[13].setRotationPoint(-53F, -1F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, -1F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[14].setRotationPoint(-53F, -1F, -1F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[15].setRotationPoint(-53F, -1F, 2F);

		bodyModel[16].addBox(0F, 0F, 0F, 22, 20, 14, 0F); // Box 82
		bodyModel[16].setRotationPoint(23F, -21F, -7F);

		bodyModel[17].addBox(-1F, 0F, 0F, 24, 23, 14, 0F); // Box 96
		bodyModel[17].setRotationPoint(-21F, -24F, -7F);

		bodyModel[18].addBox(0F, 0F, 0F, 21, 21, 14, 0F); // Box 97
		bodyModel[18].setRotationPoint(2F, -22F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 21, 7, 0F,1F, -1F, 0F, -3F, -1F, 0F, 0F, -1F, -1F, 1F, -1F, -1F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 124
		bodyModel[19].setRotationPoint(46F, -22F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 21, 7, 0F,1F, -1F, -1F, 0F, -1F, -1F, -3F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 130
		bodyModel[20].setRotationPoint(46F, -22F, 0F);

		bodyModel[21].addBox(0F, 0F, 0F, 3, 15, 2, 0F); // Box 131
		bodyModel[21].setRotationPoint(45F, -15.5F, -1F);

		bodyModel[22].addBox(0F, 0F, 0F, 10, 4, 4, 0F); // Box 122 CANADA WHAT
		bodyModel[22].setRotationPoint(-22F, -5F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[23].setRotationPoint(17F, -24.5F, -3F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 53, 8, 0, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 122
		bodyModel[24].setRotationPoint(-7F, -9F, 11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 56, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[25].setRotationPoint(-10F, -9F, -11F);

		bodyModel[26].addBox(0F, 0F, 0F, 12, 15, 0, 0F); // Box 130 this is 2 kinds of railing
		bodyModel[26].setRotationPoint(-22F, -20F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[27].setRotationPoint(8.5F, -23.75F, -2F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[28].setRotationPoint(10F, -23F, -1.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[29].setRotationPoint(9F, -23.75F, 1F);

		bodyModel[30].addBox(0F, 0F, -9F, 31, 3, 4, 0F); // Box 76
		bodyModel[30].setRotationPoint(-15F, 2F, -2F);

		bodyModel[31].addShapeBox(0F, -1F, -9F, 31, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 85
		bodyModel[31].setRotationPoint(-15F, 8F, -1.5F);

		bodyModel[32].addShapeBox(0F, -2F, -9F, 31, 2, 24, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 85
		bodyModel[32].setRotationPoint(-15F, 7F, -3F);

		bodyModel[33].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 136
		bodyModel[33].setRotationPoint(-6F, 3F, 8F);

		bodyModel[34].addBox(0F, 0F, 0F, 8, 3, 4, 0F); // Box 138
		bodyModel[34].setRotationPoint(-15F, 2F, 7F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 139
		bodyModel[35].setRotationPoint(12F, 2F, 7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[36].setRotationPoint(-6F, 2F, 10F);

		bodyModel[37].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 142
		bodyModel[37].setRotationPoint(-6F, 2F, 9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 143
		bodyModel[38].setRotationPoint(-6F, 4F, 10F);

		bodyModel[39].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 141
		bodyModel[39].setRotationPoint(-6F, 4F, 9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[40].setRotationPoint(-6F, 2F, 8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[41].setRotationPoint(-6F, 4F, 8F);

		bodyModel[42].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 169
		bodyModel[42].setRotationPoint(3F, 3F, 8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[43].setRotationPoint(3F, 2F, 10F);

		bodyModel[44].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 171
		bodyModel[44].setRotationPoint(3F, 2F, 9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 177
		bodyModel[45].setRotationPoint(3F, 4F, 10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[46].setRotationPoint(3F, 2F, 8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[47].setRotationPoint(3F, 4F, 8F);

		bodyModel[48].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 184
		bodyModel[48].setRotationPoint(3F, 4F, 9F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 135
		bodyModel[49].setRotationPoint(-31F, 0F, 7F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 136
		bodyModel[50].setRotationPoint(-16F, 0F, 7F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 137
		bodyModel[51].setRotationPoint(16F, 0F, 7F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 138
		bodyModel[52].setRotationPoint(30F, 0F, 7F);

		bodyModel[53].addBox(0F, 0F, -9F, 31, 3, 14, 0F); // Box 139
		bodyModel[53].setRotationPoint(-15F, 2F, 2F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 21, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[54].setRotationPoint(2F, -23F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 16, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[55].setRotationPoint(-22F, -5F, 7F);

		bodyModel[56].addBox(0F, 0F, 0F, 15, 8, 0, 0F); // Box 123
		bodyModel[56].setRotationPoint(-22F, -13F, 11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[57].setRotationPoint(-7F, -13F, 11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[58].setRotationPoint(-6F, -3F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 21, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[59].setRotationPoint(2F, -23F, 3F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 21, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[60].setRotationPoint(2F, -23F, -3F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 145
		bodyModel[61].setRotationPoint(-45F, -1F, -11F);

		bodyModel[62].addBox(0F, 0F, 0F, 91, 4, 14, 0F); // Box 146
		bodyModel[62].setRotationPoint(-45F, -1F, -7F);

		bodyModel[63].addBox(0F, 0F, 0F, 0, 10, 20, 0F); // Box 147
		bodyModel[63].setRotationPoint(-51F, -1F, -10F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[64].setRotationPoint(-52.25F, -3F, 4F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 lamp ditch front
		bodyModel[65].setRotationPoint(-52.75F, -3F, 4F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 150 lamp lamp ditch front
		bodyModel[66].setRotationPoint(-52.75F, -3F, -6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[67].setRotationPoint(-52.25F, -3F, -6F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[68].setRotationPoint(-55F, 3F, -1.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[69].setRotationPoint(-52F, 2.5F, -2F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[70].setRotationPoint(-54F, 5F, 0F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[71].setRotationPoint(-54F, 4F, 2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[72].setRotationPoint(-54F, 7F, 0F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[73].setRotationPoint(-54F, 5F, -10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[74].setRotationPoint(-54.5F, 4F, -10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[75].setRotationPoint(-54F, 7F, -10F);

		bodyModel[76].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 164
		bodyModel[76].setRotationPoint(-45F, -1F, -11F);

		bodyModel[77].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 165
		bodyModel[77].setRotationPoint(-45F, -1F, 10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 166
		bodyModel[78].setRotationPoint(-45F, -7F, -11F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[79].setRotationPoint(-45F, -7F, 8F);

		bodyModel[80].addBox(0F, 0F, -6F, 0, 5, 1, 0F); // Box 168
		bodyModel[80].setRotationPoint(-45F, -10F, -2F);

		bodyModel[81].addBox(0F, 0F, -6F, 0, 5, 1, 0F); // Box 169
		bodyModel[81].setRotationPoint(-45F, -10F, 13F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		bodyModel[82].setRotationPoint(-45F, -1F, 7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[83].setRotationPoint(-44F, 1F, 7F);

		bodyModel[84].addBox(0F, 0F, 0F, 7, 0, 3, 0F); // Box 173
		bodyModel[84].setRotationPoint(-51F, 8F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 7, 0, 3, 0F); // Box 174
		bodyModel[85].setRotationPoint(-51F, 6F, -10F);

		bodyModel[86].addBox(0F, 0F, 0F, 7, 0, 2, 0F); // Box 175
		bodyModel[86].setRotationPoint(-51F, 4F, -9F);

		bodyModel[87].addBox(0F, 0F, 0F, 6, 0, 3, 0F); // Box 176
		bodyModel[87].setRotationPoint(-51F, 2F, -8F);

		bodyModel[88].addBox(0F, 0F, 0F, 0, 1, 3, 0F); // Box 181
		bodyModel[88].setRotationPoint(-45F, 4F, -11F);

		bodyModel[89].addBox(0F, 0F, 0F, 0, 1, 3, 0F); // Box 182
		bodyModel[89].setRotationPoint(-45F, 4F, 8F);

		bodyModel[90].addBox(0F, 0F, 0F, 36, 1, 4, 0F); // Box 183
		bodyModel[90].setRotationPoint(-44F, 0F, -11F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 184
		bodyModel[91].setRotationPoint(-44F, 0F, 7F);

		bodyModel[92].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 188
		bodyModel[92].setRotationPoint(-51F, -9F, 7F);

		bodyModel[93].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 189
		bodyModel[93].setRotationPoint(-52.5F, -9F, -4F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 191
		bodyModel[94].setRotationPoint(-51F, -9F, -7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[95].setRotationPoint(-51F, -9F, 4F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[96].setRotationPoint(45F, -1F, 7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[97].setRotationPoint(44F, 1F, 7F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 195
		bodyModel[98].setRotationPoint(44F, 0F, 7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 196
		bodyModel[99].setRotationPoint(44F, 1F, -11F);

		bodyModel[100].addBox(0F, 0F, 0F, 0, 10, 20, 0F); // Box 197
		bodyModel[100].setRotationPoint(52F, -1F, -10F);

		bodyModel[101].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 198
		bodyModel[101].setRotationPoint(52F, -1F, -11F);

		bodyModel[102].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 199
		bodyModel[102].setRotationPoint(52F, -1F, 10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[103].setRotationPoint(52F, -7F, 8F);

		bodyModel[104].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 205
		bodyModel[104].setRotationPoint(52F, -9F, -8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 206
		bodyModel[105].setRotationPoint(52F, -7F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 207 lamp ditch rear
		bodyModel[106].setRotationPoint(52.25F, -3F, -6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[107].setRotationPoint(52F, 2.5F, -2F);

		bodyModel[108].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 212
		bodyModel[108].setRotationPoint(53F, 3F, -1.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 213
		bodyModel[109].setRotationPoint(51.75F, -3F, -6F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 214
		bodyModel[110].setRotationPoint(51.75F, -3F, 4F);

		bodyModel[111].addBox(0F, 0F, 0F, 7, 2, 14, 0F); // Box 215
		bodyModel[111].setRotationPoint(46F, -1F, -7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[112].setRotationPoint(45F, -1F, -11F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 217
		bodyModel[113].setRotationPoint(44F, 0F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 218 lamp ditch rear
		bodyModel[114].setRotationPoint(52.25F, -3F, 4F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 219
		bodyModel[115].setRotationPoint(46F, -15.5F, -0.5F);
		bodyModel[115].rotateAngleZ = 0.78539816F;

		bodyModel[116].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 220
		bodyModel[116].setRotationPoint(45F, -19F, -1F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 31
		bodyModel[117].setRotationPoint(47.25F, -22.05F, -1F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp rear
		bodyModel[118].setRotationPoint(47.5F, -22.05F, -1F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp rear
		bodyModel[119].setRotationPoint(47.5F, -20.05F, -1F);

		bodyModel[120].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 226
		bodyModel[120].setRotationPoint(45F, -20F, -1F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[121].setRotationPoint(7.5F, -24F, -0.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[122].setRotationPoint(-51F, 1F, -3F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 347
		bodyModel[123].setRotationPoint(49F, 1F, -3F);

		bodyModel[124].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 208
		bodyModel[124].setRotationPoint(-31.5F, 2.5F, -1F);

		bodyModel[125].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 209
		bodyModel[125].setRotationPoint(29.5F, 2.5F, -1F);

		bodyModel[126].addBox(0F, 0F, 0F, 7, 0, 3, 0F); // Box 218
		bodyModel[126].setRotationPoint(-51F, 6F, 7F);

		bodyModel[127].addBox(0F, 0F, 0F, 7, 0, 3, 0F); // Box 219
		bodyModel[127].setRotationPoint(-51F, 8F, 8F);

		bodyModel[128].addBox(0F, 0F, 0F, 7, 0, 2, 0F); // Box 220
		bodyModel[128].setRotationPoint(-51F, 4F, 7F);

		bodyModel[129].addBox(0F, 0F, 0F, 6, 0, 3, 0F); // Box 221
		bodyModel[129].setRotationPoint(-51F, 2F, 5F);

		bodyModel[130].addBox(0F, 0F, 0F, 7, 0, 3, 0F); // Box 222
		bodyModel[130].setRotationPoint(45F, 8F, 8F);

		bodyModel[131].addBox(0F, 0F, 0F, 7, 0, 3, 0F); // Box 223
		bodyModel[131].setRotationPoint(45F, 6F, 7F);

		bodyModel[132].addBox(0F, 0F, 0F, 7, 0, 2, 0F); // Box 224
		bodyModel[132].setRotationPoint(45F, 4F, 7F);

		bodyModel[133].addBox(0F, 0F, 0F, 6, 0, 3, 0F); // Box 225
		bodyModel[133].setRotationPoint(46F, 2F, 5F);

		bodyModel[134].addBox(0F, 0F, 0F, 7, 0, 3, 0F); // Box 226
		bodyModel[134].setRotationPoint(45F, 8F, -11F);

		bodyModel[135].addBox(0F, 0F, 0F, 7, 0, 3, 0F); // Box 227
		bodyModel[135].setRotationPoint(45F, 6F, -10F);

		bodyModel[136].addBox(0F, 0F, 0F, 7, 0, 2, 0F); // Box 228
		bodyModel[136].setRotationPoint(45F, 4F, -9F);

		bodyModel[137].addBox(0F, 0F, 0F, 6, 0, 3, 0F); // Box 229
		bodyModel[137].setRotationPoint(46F, 2F, -8F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 230 lamp lamp ditch front
		bodyModel[138].setRotationPoint(-51.75F, 1F, 5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 231 lamp lamp ditch front
		bodyModel[139].setRotationPoint(-51.75F, 1F, -7F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[140].setRotationPoint(-51.25F, 1F, -7F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[141].setRotationPoint(-51.25F, 1F, 5F);

		bodyModel[142].addShapeBox(0F, -1F, 0F, 23, 2, 11, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[142].setRotationPoint(23F, -23F, -11F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 23, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[143].setRotationPoint(23F, -24F, 0F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 17, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 119
		bodyModel[144].setRotationPoint(26F, -19F, 7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 126
		bodyModel[145].setRotationPoint(45F, -20F, -9F);

		bodyModel[146].addBox(0F, 0F, 0F, 22, 1, 2, 0F); // Box 127
		bodyModel[146].setRotationPoint(23F, -20F, -9F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 17, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[147].setRotationPoint(26F, -19F, -9F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[148].setRotationPoint(45F, -20F, 5F);

		bodyModel[149].addBox(0F, 0F, 0F, 22, 1, 2, 0F); // Box 130
		bodyModel[149].setRotationPoint(23F, -20F, 7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 23, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 135
		bodyModel[150].setRotationPoint(23F, -20F, -11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 23, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 136
		bodyModel[151].setRotationPoint(23F, -20F, 9F);

		bodyModel[152].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 132
		bodyModel[152].setRotationPoint(46F, -23F, -1F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,1F, -1F, -1F, 0F, -1F, -1F, -2F, -1F, -2F, 1F, -1F, -2F, 1F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -2F, 1F, 0F, -2F); // Box 133
		bodyModel[153].setRotationPoint(47F, -24F, 0F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,1F, -1F, -2F, -2F, -1F, -2F, 0F, -1F, -1F, 1F, -1F, -1F, 1F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 134
		bodyModel[154].setRotationPoint(47F, -24F, -7F);

		bodyModel[155].addBox(0F, -1F, 0F, 23, 2, 22, 0F); // Box 233
		bodyModel[155].setRotationPoint(23F, -21F, -11F);

		bodyModel[156].addBox(0F, 0F, 0F, 10, 10, 4, 0F); // Box 122 OTHER BIT
		bodyModel[156].setRotationPoint(-22F, -15F, -11F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[157].setRotationPoint(46F, -23.5F, -1F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 5, 18, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[158].setRotationPoint(52F, 4F, -9F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[159].setRotationPoint(-51F, -9F, -11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[160].setRotationPoint(-51F, -9F, 10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[161].setRotationPoint(52F, -9F, 10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[162].setRotationPoint(52F, -9F, -11F);

		bodyModel[163].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[163].setRotationPoint(46F, -9F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[164].setRotationPoint(46F, -7F, -11.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[165].setRotationPoint(46F, -7F, 10.5F);

		bodyModel[166].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[166].setRotationPoint(46F, -9F, 9F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 228
		bodyModel[167].setRotationPoint(45F, 4F, -11F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 229
		bodyModel[168].setRotationPoint(45F, 4F, 10F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 231 lamp lamp ditch front
		bodyModel[169].setRotationPoint(-51.75F, 1F, -6F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[170].setRotationPoint(-51.25F, 1F, -6F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 231 lamp lamp ditch front
		bodyModel[171].setRotationPoint(-51.75F, 1F, 4F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[172].setRotationPoint(-51.25F, 1F, 4F);
	}
	Modelnewgevotruck theTrucks = new Modelnewgevotruck();
	ModelD9_CabSquareWindow theCabbo1 = new ModelD9_CabSquareWindow();
	ModelD9_Cab4Window theCabbo2 = new ModelD9_Cab4Window();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 173; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				bodyModel[i].render(f5);
			}
		}

		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 7) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newgevotruck_LightGrey.png")); //supposed to be LightGrey, is black for testing
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.8F, 0.0F, 0F);
			theTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.65F, 0.0F, 0);
			theTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/gewidecab_Red.png"));
			GL11.glPushMatrix();
			theCabbo1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 8) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newgevotruck_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.8F, 0.0F, 0F);
			theTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.65F, 0.0F, 0);
			theTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/cab4Window_furrx.png"));
			GL11.glPushMatrix();
			theCabbo2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 2) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newgevotruck_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.8F, 0.0F, 0F);
			theTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.65F, 0.0F, 0);
			theTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/gewidecab_Green.png"));
			GL11.glPushMatrix();
			theCabbo1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newgevotruck_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.8F, -0.0F, 0F);
			theTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.65F, 0.0F, 0);
			theTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo h1044Model[];
	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{1.03D, 1.4D, 0.0D});
			}
		};
	}
}
//gewidecab_Red.png
//d9-44cw_LightGrey.png
//cab4Window_template.png