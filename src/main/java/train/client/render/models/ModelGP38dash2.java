//the fox is at it again
package train.client.render.models;


import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelGP38dash2 extends ModelConverter
{
	int textureX = 512;
	int textureY = 256;

	public ModelGP38dash2() 
	{
		bodyModel = new ModelRendererTurbo[407];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 164
		bodyModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 114
		bodyModel[3] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 163
		bodyModel[4] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 166
		bodyModel[5] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 168
		bodyModel[6] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 169
		bodyModel[7] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 3
		bodyModel[8] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 246
		bodyModel[9] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 247
		bodyModel[10] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 259
		bodyModel[11] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 262
		bodyModel[12] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 263
		bodyModel[13] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 264
		bodyModel[14] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 265
		bodyModel[15] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 266
		bodyModel[16] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 271
		bodyModel[17] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 272
		bodyModel[18] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 273
		bodyModel[19] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 274
		bodyModel[20] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 275
		bodyModel[21] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 276
		bodyModel[22] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 271
		bodyModel[23] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 272
		bodyModel[24] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 273
		bodyModel[25] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 274
		bodyModel[26] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 275
		bodyModel[27] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 276
		bodyModel[28] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 3
		bodyModel[29] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 246
		bodyModel[30] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 247
		bodyModel[31] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 164
		bodyModel[32] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 259
		bodyModel[33] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 261
		bodyModel[34] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 262
		bodyModel[35] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 263
		bodyModel[36] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 264
		bodyModel[37] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 265
		bodyModel[38] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 266
		bodyModel[39] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 4
		bodyModel[40] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 4
		bodyModel[41] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 261
		bodyModel[42] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 19
		bodyModel[43] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 31
		bodyModel[44] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 40
		bodyModel[45] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 41
		bodyModel[46] = new ModelRendererTurbo(this, 385, 9, textureX, textureY, "Lamp"); // Box 115 liveryimg 2
		bodyModel[47] = new ModelRendererTurbo(this, 497, 9, textureX, textureY, "Lamp"); // Box 116 liveryimg 2
		bodyModel[48] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 43
		bodyModel[49] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // box64
		bodyModel[50] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // box65
		bodyModel[51] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 44
		bodyModel[52] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 45
		bodyModel[53] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 56
		bodyModel[54] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 61
		bodyModel[55] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 63
		bodyModel[56] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 4
		bodyModel[57] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 98
		bodyModel[58] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 5
		bodyModel[59] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 61
		bodyModel[60] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 63
		bodyModel[61] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 80
		bodyModel[62] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 81
		bodyModel[63] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 86
		bodyModel[64] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 87
		bodyModel[65] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 255
		bodyModel[66] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 256
		bodyModel[67] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 38R
		bodyModel[68] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 176
		bodyModel[69] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 178
		bodyModel[70] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 179
		bodyModel[71] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 78
		bodyModel[72] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 188
		bodyModel[73] = new ModelRendererTurbo(this, 505, 9, textureX, textureY, "Lamp"); // Box 189 ditchlight front
		bodyModel[74] = new ModelRendererTurbo(this, 41, 17, textureX, textureY, "Lamp"); // Box 190 ditchlight front
		bodyModel[75] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 243
		bodyModel[76] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 244
		bodyModel[77] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 249
		bodyModel[78] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 250
		bodyModel[79] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 239
		bodyModel[80] = new ModelRendererTurbo(this, 105, 17, textureX, textureY, "Lamp"); // Box 240 ditchlight rear
		bodyModel[81] = new ModelRendererTurbo(this, 321, 17, textureX, textureY, "Lamp"); // Box 241 ditchlight rear
		bodyModel[82] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 242
		bodyModel[83] = new ModelRendererTurbo(this, 377, 17, textureX, textureY, "Lamp"); // Box 247 lamp rear
		bodyModel[84] = new ModelRendererTurbo(this, 385, 17, textureX, textureY, "Lamp"); // Box 248 lamp rear
		bodyModel[85] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 234
		bodyModel[86] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 236
		bodyModel[87] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 237
		bodyModel[88] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 80
		bodyModel[89] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 144
		bodyModel[90] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 145
		bodyModel[91] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 147
		bodyModel[92] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 148
		bodyModel[93] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 61
		bodyModel[94] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 81
		bodyModel[95] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 81
		bodyModel[96] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 174
		bodyModel[97] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 176
		bodyModel[98] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 177
		bodyModel[99] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 191
		bodyModel[100] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 227
		bodyModel[101] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 4
		bodyModel[102] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 4
		bodyModel[103] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 4
		bodyModel[104] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 4
		bodyModel[105] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 4
		bodyModel[106] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 4
		bodyModel[107] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 4
		bodyModel[108] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 4
		bodyModel[109] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 4
		bodyModel[110] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 4
		bodyModel[111] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 4
		bodyModel[112] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 4
		bodyModel[113] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 2
		bodyModel[114] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 2
		bodyModel[115] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 114
		bodyModel[116] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 74
		bodyModel[117] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 78
		bodyModel[118] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 9
		bodyModel[119] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 10
		bodyModel[120] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 15
		bodyModel[121] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 21
		bodyModel[122] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 48
		bodyModel[123] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 43
		bodyModel[124] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 44
		bodyModel[125] = new ModelRendererTurbo(this, 369, 33, textureX, textureY, "Lamp"); // Box 117 liveryimg 2
		bodyModel[126] = new ModelRendererTurbo(this, 457, 33, textureX, textureY, "Lamp"); // Box 118 liveryimg 2
		bodyModel[127] = new ModelRendererTurbo(this, 505, 17, textureX, textureY, "Lamp"); // Box 186 lamp front
		bodyModel[128] = new ModelRendererTurbo(this, 113, 33, textureX, textureY, "Lamp"); // Box 187 lamp front
		bodyModel[129] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 201
		bodyModel[130] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 314 door swing right
		bodyModel[131] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 315 door swing right
		bodyModel[132] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 489
		bodyModel[133] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 278
		bodyModel[134] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 281
		bodyModel[135] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 288
		bodyModel[136] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 315
		bodyModel[137] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 316
		bodyModel[138] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 273
		bodyModel[139] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 285
		bodyModel[140] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 286
		bodyModel[141] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 264
		bodyModel[142] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 276
		bodyModel[143] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 277
		bodyModel[144] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 297
		bodyModel[145] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 299
		bodyModel[146] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 272
		bodyModel[147] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 273
		bodyModel[148] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 274
		bodyModel[149] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 275
		bodyModel[150] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 278
		bodyModel[151] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 101
		bodyModel[152] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 104
		bodyModel[153] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 105
		bodyModel[154] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 284
		bodyModel[155] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 285
		bodyModel[156] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 286
		bodyModel[157] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 302
		bodyModel[158] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 303
		bodyModel[159] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 304
		bodyModel[160] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 268 anticlimber
		bodyModel[161] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 269anticlimber
		bodyModel[162] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 293
		bodyModel[163] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 43
		bodyModel[164] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 43
		bodyModel[165] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 43
		bodyModel[166] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 43
		bodyModel[167] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 384
		bodyModel[168] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 385
		bodyModel[169] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 386
		bodyModel[170] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 387
		bodyModel[171] = new ModelRendererTurbo(this, 49, 49, textureX, textureY, "Lamp"); // Box 340 commander beacon
		bodyModel[172] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 341
		bodyModel[173] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 361
		bodyModel[174] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 362
		bodyModel[175] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 363
		bodyModel[176] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 364
		bodyModel[177] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 365
		bodyModel[178] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 366
		bodyModel[179] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 379
		bodyModel[180] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 380
		bodyModel[181] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 381
		bodyModel[182] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 423 AC
		bodyModel[183] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 369
		bodyModel[184] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 370
		bodyModel[185] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 371
		bodyModel[186] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 372
		bodyModel[187] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 373
		bodyModel[188] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 374
		bodyModel[189] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 430
		bodyModel[190] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 308
		bodyModel[191] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 309
		bodyModel[192] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 310
		bodyModel[193] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 311
		bodyModel[194] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 11
		bodyModel[195] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 210
		bodyModel[196] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 211
		bodyModel[197] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 219
		bodyModel[198] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 220
		bodyModel[199] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 221
		bodyModel[200] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 222
		bodyModel[201] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 223
		bodyModel[202] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 224
		bodyModel[203] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 19
		bodyModel[204] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 334
		bodyModel[205] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 243
		bodyModel[206] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 244
		bodyModel[207] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 245
		bodyModel[208] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 246
		bodyModel[209] = new ModelRendererTurbo(this, 417, 57, textureX, textureY, "Lamp"); // Box 247 commander beacon
		bodyModel[210] = new ModelRendererTurbo(this, 433, 57, textureX, textureY, "Lamp"); // Box 248 commander beacon
		bodyModel[211] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 249
		bodyModel[212] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 250
		bodyModel[213] = new ModelRendererTurbo(this, 385, 81, textureX, textureY, "Lamp"); // Box 251 ditchlight front
		bodyModel[214] = new ModelRendererTurbo(this, 473, 81, textureX, textureY, "Lamp"); // Box 252 ditchlight front
		bodyModel[215] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 253
		bodyModel[216] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 254
		bodyModel[217] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 255
		bodyModel[218] = new ModelRendererTurbo(this, 505, 89, textureX, textureY, "Lamp"); // Box 256 ditchlight rear
		bodyModel[219] = new ModelRendererTurbo(this, 89, 97, textureX, textureY, "Lamp"); // Box 257 ditchlight rear
		bodyModel[220] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 258
		bodyModel[221] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 36
		bodyModel[222] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 271
		bodyModel[223] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 272
		bodyModel[224] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 313
		bodyModel[225] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 314
		bodyModel[226] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 315
		bodyModel[227] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 316
		bodyModel[228] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 327
		bodyModel[229] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 328
		bodyModel[230] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 329
		bodyModel[231] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 330
		bodyModel[232] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 270
		bodyModel[233] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 271
		bodyModel[234] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 272
		bodyModel[235] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 273
		bodyModel[236] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 274
		bodyModel[237] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 42
		bodyModel[238] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 45
		bodyModel[239] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 42
		bodyModel[240] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 48
		bodyModel[241] = new ModelRendererTurbo(this, 353, 97, textureX, textureY, "Lamp"); // Box 294 lamp canada front
		bodyModel[242] = new ModelRendererTurbo(this, 393, 97, textureX, textureY, "Lamp"); // Box 295 lamp canada front
		bodyModel[243] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 298
		bodyModel[244] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 300
		bodyModel[245] = new ModelRendererTurbo(this, 417, 97, textureX, textureY, "Lamp"); // Box 301 lamp bnsf front
		bodyModel[246] = new ModelRendererTurbo(this, 425, 97, textureX, textureY, "Lamp"); // Box 302 lamp bnsf front
		bodyModel[247] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 303
		bodyModel[248] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 304
		bodyModel[249] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 305
		bodyModel[250] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 306
		bodyModel[251] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 307
		bodyModel[252] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 318
		bodyModel[253] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 319
		bodyModel[254] = new ModelRendererTurbo(this, 449, 97, textureX, textureY, "Lamp"); // Box 314 lamp sp front
		bodyModel[255] = new ModelRendererTurbo(this, 457, 97, textureX, textureY, "Lamp"); // Box 315 lamp sp front
		bodyModel[256] = new ModelRendererTurbo(this, 473, 97, textureX, textureY, "Lamp"); // Box 316 lamp sp front
		bodyModel[257] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 317
		bodyModel[258] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 20
		bodyModel[259] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 114
		bodyModel[260] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 74
		bodyModel[261] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 78
		bodyModel[262] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 245
		bodyModel[263] = new ModelRendererTurbo(this, 1, 105, textureX, textureY, "cull"); // Box 389 support cull
		bodyModel[264] = new ModelRendererTurbo(this, 89, 81, textureX, textureY, "Lamp"); // Box 162 commander beacon
		bodyModel[265] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 165
		bodyModel[266] = new ModelRendererTurbo(this, 161, 81, textureX, textureY, "Lamp"); // Box 334 commander beacon
		bodyModel[267] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 335
		bodyModel[268] = new ModelRendererTurbo(this, 345, 81, textureX, textureY, "Lamp"); // Box 336 commander beacon
		bodyModel[269] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 337
		bodyModel[270] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 338
		bodyModel[271] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 339
		bodyModel[272] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 340
		bodyModel[273] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 341
		bodyModel[274] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 342
		bodyModel[275] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 343
		bodyModel[276] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 344
		bodyModel[277] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 345
		bodyModel[278] = new ModelRendererTurbo(this, 401, 89, textureX, textureY, "Lamp"); // Box 346 commander beacon
		bodyModel[279] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 347
		bodyModel[280] = new ModelRendererTurbo(this, 289, 105, textureX, textureY, "cull"); // Box 348 cull
		bodyModel[281] = new ModelRendererTurbo(this, 297, 105, textureX, textureY, "Lamp"); // Box 349 ditchlight front
		bodyModel[282] = new ModelRendererTurbo(this, 321, 105, textureX, textureY, "Lamp"); // Box 350 ditchlight front
		bodyModel[283] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 351 cull
		bodyModel[284] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 352 cull
		bodyModel[285] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 353 cull
		bodyModel[286] = new ModelRendererTurbo(this, 353, 105, textureX, textureY, "Lamp"); // Box 354 ditchlight rear
		bodyModel[287] = new ModelRendererTurbo(this, 505, 105, textureX, textureY, "Lamp"); // Box 355 ditchlight rear
		bodyModel[288] = new ModelRendererTurbo(this, 1, 113, textureX, textureY, "cull"); // Box 356 support cull
		bodyModel[289] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 359
		bodyModel[290] = new ModelRendererTurbo(this, 401, 97, textureX, textureY, "Lamp"); // Box 360 commander beacon
		bodyModel[291] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Box 361
		bodyModel[292] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 365
		bodyModel[293] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 366
		bodyModel[294] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 367
		bodyModel[295] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 368
		bodyModel[296] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 369
		bodyModel[297] = new ModelRendererTurbo(this, 433, 97, textureX, textureY, "Lamp"); // Box 475 commander beacon
		bodyModel[298] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 476
		bodyModel[299] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 477 extra stacc
		bodyModel[300] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 478 extra stacc
		bodyModel[301] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 479 extra stacc
		bodyModel[302] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 480 extra stacc
		bodyModel[303] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 346 cover
		bodyModel[304] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 355
		bodyModel[305] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 356
		bodyModel[306] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 484
		bodyModel[307] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 485
		bodyModel[308] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 486
		bodyModel[309] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 487
		bodyModel[310] = new ModelRendererTurbo(this, 113, 105, textureX, textureY, "Lamp"); // Box 176 glow
		bodyModel[311] = new ModelRendererTurbo(this, 25, 113, textureX, textureY, "Lamp"); // Box 176 glow
		bodyModel[312] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 114
		bodyModel[313] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 74
		bodyModel[314] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 78
		bodyModel[315] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 245
		bodyModel[316] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 196 winterization hatch
		bodyModel[317] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 86
		bodyModel[318] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 87
		bodyModel[319] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 86
		bodyModel[320] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 510
		bodyModel[321] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 511
		bodyModel[322] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 512
		bodyModel[323] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 513
		bodyModel[324] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 143 sandcap
		bodyModel[325] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 351 sandcap
		bodyModel[326] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 352
		bodyModel[327] = new ModelRendererTurbo(this, 369, 113, textureX, textureY, "Lamp"); // Box 353 lamp front arr
		bodyModel[328] = new ModelRendererTurbo(this, 73, 121, textureX, textureY, "Lamp"); // Box 354 lamp front arr
		bodyModel[329] = new ModelRendererTurbo(this, 97, 121, textureX, textureY, "cull"); // Box 355 support cull
		bodyModel[330] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 364 prime base
		bodyModel[331] = new ModelRendererTurbo(this, 129, 121, textureX, textureY, "Lamp"); // Box 6 PRIME1-1
		bodyModel[332] = new ModelRendererTurbo(this, 145, 121, textureX, textureY, "Lamp"); // Box 7 PRIME1-3
		bodyModel[333] = new ModelRendererTurbo(this, 161, 121, textureX, textureY, "Lamp"); // Box 8 PRIME1-2
		bodyModel[334] = new ModelRendererTurbo(this, 177, 121, textureX, textureY, "Lamp"); // Box 9 PRIME1-4
		bodyModel[335] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 361
		bodyModel[336] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 362
		bodyModel[337] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 363
		bodyModel[338] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 364
		bodyModel[339] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 365 extra stacc
		bodyModel[340] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 366 extra stacc
		bodyModel[341] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 367
		bodyModel[342] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 368
		bodyModel[343] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 369
		bodyModel[344] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 370
		bodyModel[345] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 371
		bodyModel[346] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 372
		bodyModel[347] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 373 arr antenna
		bodyModel[348] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 374 arr antenna
		bodyModel[349] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 375 arr antenna
		bodyModel[350] = new ModelRendererTurbo(this, 225, 121, textureX, textureY, "Lamp"); // Box 376 glow
		bodyModel[351] = new ModelRendererTurbo(this, 433, 121, textureX, textureY, "Lamp"); // Box 377 glow
		bodyModel[352] = new ModelRendererTurbo(this, 441, 121, textureX, textureY, "cull"); // Box 378 cull
		bodyModel[353] = new ModelRendererTurbo(this, 449, 121, textureX, textureY, "cull"); // Box 450 cull
		bodyModel[354] = new ModelRendererTurbo(this, 473, 121, textureX, textureY, "cull"); // Box 451 cull
		bodyModel[355] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 452
		bodyModel[356] = new ModelRendererTurbo(this, 129, 129, textureX, textureY, "cull"); // Box 453 cull
		bodyModel[357] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 454
		bodyModel[358] = new ModelRendererTurbo(this, 161, 129, textureX, textureY, "cull"); // Box 455 cull
		bodyModel[359] = new ModelRendererTurbo(this, 457, 113, textureX, textureY, "cull"); // Box 479 cull
		bodyModel[360] = new ModelRendererTurbo(this, 473, 113, textureX, textureY, "cull"); // Box 339 cull
		bodyModel[361] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 446
		bodyModel[362] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 447
		bodyModel[363] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 448
		bodyModel[364] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 449
		bodyModel[365] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 395
		bodyModel[366] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 396
		bodyModel[367] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Box 397
		bodyModel[368] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 398
		bodyModel[369] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 399
		bodyModel[370] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 400
		bodyModel[371] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 401
		bodyModel[372] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 402
		bodyModel[373] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 284
		bodyModel[374] = new ModelRendererTurbo(this, 449, 121, textureX, textureY, "Lamp"); // Box 404 commander beacon
		bodyModel[375] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 405
		bodyModel[376] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 350
		bodyModel[377] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 351
		bodyModel[378] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 408
		bodyModel[379] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 409
		bodyModel[380] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 515
		bodyModel[381] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 516
		bodyModel[382] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 517
		bodyModel[383] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 518
		bodyModel[384] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 519
		bodyModel[385] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 399
		bodyModel[386] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 400
		bodyModel[387] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 401
		bodyModel[388] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 402
		bodyModel[389] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 403
		bodyModel[390] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 404
		bodyModel[391] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 405
		bodyModel[392] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 406
		bodyModel[393] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 407
		bodyModel[394] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 408
		bodyModel[395] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 409
		bodyModel[396] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 410
		bodyModel[397] = new ModelRendererTurbo(this, 418, 141, textureX, textureY, "cull"); // Box 3 cull
		bodyModel[398] = new ModelRendererTurbo(this, 420, 152, textureX, textureY); // Box 5
		bodyModel[399] = new ModelRendererTurbo(this, 436, 129, textureX, textureY); // Box 401
		bodyModel[400] = new ModelRendererTurbo(this, 442, 126, textureX, textureY); // Box 402
		bodyModel[401] = new ModelRendererTurbo(this, 64, 115, textureX, textureY); // Box 403
		bodyModel[402] = new ModelRendererTurbo(this, 217, 124, textureX, textureY); // Box 404
		bodyModel[403] = new ModelRendererTurbo(this, 193, 124, textureX, textureY); // Box 405
		bodyModel[404] = new ModelRendererTurbo(this, 209, 124, textureX, textureY); // Box 406
		bodyModel[405] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 296 nose cover
		bodyModel[406] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 299 nose cover

		bodyModel[0].addBox(0F, 0F, 0F, 70, 1, 4, 0F); // Box 1
		bodyModel[0].setRotationPoint(-36F, 0F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[1].setRotationPoint(-37F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 70, 3, 14, 0F); // Box 114
		bodyModel[2].setRotationPoint(-36F, 0F, -7F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[3].setRotationPoint(-26F, 3F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		bodyModel[4].setRotationPoint(21F, 3F, -2F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 168
		bodyModel[5].setRotationPoint(-25F, 2F, -10.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 169
		bodyModel[6].setRotationPoint(22F, 2F, -10.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 3
		bodyModel[7].setRotationPoint(-41.01F, 0F, -9F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 246
		bodyModel[8].setRotationPoint(-41F, 2F, -10F);

		bodyModel[9].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 247
		bodyModel[9].setRotationPoint(-41F, 2F, 9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[10].setRotationPoint(-37F, 1F, 7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[11].setRotationPoint(-37F, 0F, 7F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 3, 14, 0F); // Box 263
		bodyModel[12].setRotationPoint(-38F, 0F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[13].setRotationPoint(-37F, 3F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[14].setRotationPoint(-37F, 3F, 7F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 266
		bodyModel[15].setRotationPoint(-41F, 0F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[16].setRotationPoint(-41F, 0F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[17].setRotationPoint(-41F, 7F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[18].setRotationPoint(-41F, 4F, -10F);

		bodyModel[19].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[19].setRotationPoint(-41F, 2F, -9F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[20].setRotationPoint(-41F, 6F, -9F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[21].setRotationPoint(-41F, 3F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[22].setRotationPoint(-41F, 0F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[23].setRotationPoint(-41F, 7F, 9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[24].setRotationPoint(-41F, 4F, 8F);

		bodyModel[25].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[25].setRotationPoint(-41F, 2F, 7F);

		bodyModel[26].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[26].setRotationPoint(-41F, 6F, 9F);

		bodyModel[27].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[27].setRotationPoint(-41F, 3F, 8F);

		bodyModel[28].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 3
		bodyModel[28].setRotationPoint(39.01F, 0F, -9F);

		bodyModel[29].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 246
		bodyModel[29].setRotationPoint(39.02F, 2F, -10F);

		bodyModel[30].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 247
		bodyModel[30].setRotationPoint(39.02F, 2F, 9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[31].setRotationPoint(34F, 1F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[32].setRotationPoint(34F, 1F, 7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[33].setRotationPoint(34F, 0F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[34].setRotationPoint(34F, 0F, 7F);

		bodyModel[35].addBox(0F, 0F, 0F, 2, 3, 14, 0F); // Box 263
		bodyModel[35].setRotationPoint(34F, 0F, -7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F); // Box 264
		bodyModel[36].setRotationPoint(34F, 3F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[37].setRotationPoint(34F, 3F, 7F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 266
		bodyModel[38].setRotationPoint(36F, 0F, -7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[39].setRotationPoint(-41F, 2F, -3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 4
		bodyModel[40].setRotationPoint(34F, 2F, -3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[41].setRotationPoint(-37F, 0F, -11F);

		bodyModel[42].addBox(0F, 0F, 0F, 53, 21, 14, 0F); // Box 19
		bodyModel[42].setRotationPoint(-18F, -21F, -7F);

		bodyModel[43].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31
		bodyModel[43].setRotationPoint(36.25F, -18F, -2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[44].setRotationPoint(35F, -21F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[45].setRotationPoint(35F, -21F, 0F);

		bodyModel[46].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 115 liveryimg 2
		bodyModel[46].setRotationPoint(35.45F, -15.5F, -6F);
		bodyModel[46].rotateAngleY = -0.41887902F;

		bodyModel[47].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 116 liveryimg 2
		bodyModel[47].setRotationPoint(35.45F, -15.5F, 6F);
		bodyModel[47].rotateAngleY = 0.41887902F;

		bodyModel[48].addBox(0F, 0F, 0F, 6, 13, 14, 0F); // Box 43
		bodyModel[48].setRotationPoint(-35F, -13F, -7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[49].setRotationPoint(-26F, -18F, 11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[50].setRotationPoint(-26F, -18F, -12F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 44
		bodyModel[51].setRotationPoint(-35F, -2F, -11F);

		bodyModel[52].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // Box 45
		bodyModel[52].setRotationPoint(-35F, -4F, 7F);

		bodyModel[53].addBox(0F, 0F, 0F, 5, 4, 4, 0F); // Box 56
		bodyModel[53].setRotationPoint(-34F, -4F, -11F);

		bodyModel[54].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[54].setRotationPoint(-41F, -2F, 10F);

		bodyModel[55].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[55].setRotationPoint(-41F, -2F, -11F);

		bodyModel[56].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[56].setRotationPoint(-45F, 3F, -1.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 98
		bodyModel[57].setRotationPoint(-44F, 0F, -3F);

		bodyModel[58].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[58].setRotationPoint(39F, 3F, -1.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[59].setRotationPoint(39.02F, -2F, 10F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[60].setRotationPoint(39.02F, -2F, -11F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 80
		bodyModel[61].setRotationPoint(39.02F, -8F, -8F);

		bodyModel[62].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 81
		bodyModel[62].setRotationPoint(39.02F, -8F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[63].setRotationPoint(-4F, 0.5F, 9F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		bodyModel[64].setRotationPoint(-4F, 1.5F, 9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[65].setRotationPoint(-4F, 1.5F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[66].setRotationPoint(-4F, 0.5F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 47, 8, 0, 0F); // Box 38R
		bodyModel[67].setRotationPoint(-12F, -8F, 11.01F);

		bodyModel[68].addBox(0F, 0F, 0F, 32, 8, 0, 0F); // Box 176
		bodyModel[68].setRotationPoint(-15F, -10F, -11.01F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[69].setRotationPoint(-35F, -4F, -11F);

		bodyModel[70].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 179
		bodyModel[70].setRotationPoint(40F, 0F, -3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[71].setRotationPoint(-41.5F, -2F, 4.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[72].setRotationPoint(-41.5F, -2F, -6.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight front
		bodyModel[73].setRotationPoint(-41.75F, -2F, 4.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight front
		bodyModel[74].setRotationPoint(-41.75F, -2F, -6.5F);

		bodyModel[75].addBox(0F, 0F, 0F, 0, 11, 2, 0F); // Box 243
		bodyModel[75].setRotationPoint(35F, -8F, 9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[76].setRotationPoint(35F, -7F, 10.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[77].setRotationPoint(35F, -7F, -11.5F);

		bodyModel[78].addBox(0F, 0F, 0F, 0, 11, 2, 0F); // Box 250
		bodyModel[78].setRotationPoint(35F, -8F, -11F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[79].setRotationPoint(38.5F, -2F, -6.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight rear
		bodyModel[80].setRotationPoint(38.75F, -2F, -6.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight rear
		bodyModel[81].setRotationPoint(38.75F, -2F, 4.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[82].setRotationPoint(38.5F, -2F, 4.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp rear
		bodyModel[83].setRotationPoint(37.5F, -18F, -2F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp rear
		bodyModel[84].setRotationPoint(37.5F, -18F, 0F);

		bodyModel[85].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 234
		bodyModel[85].setRotationPoint(40F, -8F, -3F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[86].setRotationPoint(39F, -8F, -7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[87].setRotationPoint(39F, -8F, 3F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[88].setRotationPoint(-41F, -8F, -7F);

		bodyModel[89].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 144
		bodyModel[89].setRotationPoint(-41F, -8F, -8F);

		bodyModel[90].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 145
		bodyModel[90].setRotationPoint(-42F, -8F, -3F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[91].setRotationPoint(-41F, -8F, 3F);

		bodyModel[92].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 148
		bodyModel[92].setRotationPoint(-41F, -8F, 7F);

		bodyModel[93].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 61
		bodyModel[93].setRotationPoint(-37F, -10F, -11F);

		bodyModel[94].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 81
		bodyModel[94].setRotationPoint(-37F, -10F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[95].setRotationPoint(-37F, -8F, -11.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[96].setRotationPoint(-34F, -11F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[97].setRotationPoint(-37F, -10F, 10.5F);

		bodyModel[98].addBox(0F, 0F, 0F, 0, 15, 2, 0F); // Box 177
		bodyModel[98].setRotationPoint(-37F, -12F, 9F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 191
		bodyModel[99].setRotationPoint(-36F, -9F, -11F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 227
		bodyModel[100].setRotationPoint(-35F, -11F, 11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[101].setRotationPoint(-44F, 6F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[102].setRotationPoint(-44F, 5F, 2F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[103].setRotationPoint(-44F, 7F, 0F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[104].setRotationPoint(-44F, 6F, -10F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[105].setRotationPoint(-44.5F, 5F, -10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[106].setRotationPoint(-44F, 7F, -10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[107].setRotationPoint(39F, 6F, 0F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[108].setRotationPoint(39F, 5F, 2F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 4
		bodyModel[109].setRotationPoint(39F, 7F, 0F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[110].setRotationPoint(39F, 6F, -10F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		bodyModel[111].setRotationPoint(39.5F, 5F, -10F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 4
		bodyModel[112].setRotationPoint(39F, 7F, -10F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[113].setRotationPoint(-42F, 2.5F, -2F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[114].setRotationPoint(39F, 2.5F, -2F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[115].setRotationPoint(-14F, 2F, -10.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[116].setRotationPoint(-14F, 1F, -10.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[117].setRotationPoint(-13.75F, 2.5F, -10.25F);

		bodyModel[118].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 9
		bodyModel[118].setRotationPoint(-29F, -18F, 10F);

		bodyModel[119].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 10
		bodyModel[119].setRotationPoint(-28F, -18F, -11F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 14, 17, 0F); // Box 15
		bodyModel[120].setRotationPoint(-29F, -18F, -7F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 14, 17, 0F); // Box 21
		bodyModel[121].setRotationPoint(-19F, -18F, -10F);

		bodyModel[122].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48
		bodyModel[122].setRotationPoint(-31F, -21F, -1F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[123].setRotationPoint(-31F, -21F, -6F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[124].setRotationPoint(-31F, -21F, 1F);

		bodyModel[125].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2
		bodyModel[125].setRotationPoint(-29.05F, -19.5F, -6F);
		bodyModel[125].rotateAngleY = 0.38397244F;

		bodyModel[126].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2
		bodyModel[126].setRotationPoint(-29.05F, -19.5F, 6F);
		bodyModel[126].rotateAngleY = -0.38397244F;

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 lamp front
		bodyModel[127].setRotationPoint(-31.5F, -21F, -1F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 lamp front
		bodyModel[128].setRotationPoint(-31.5F, -19F, -1F);

		bodyModel[129].addBox(0F, 0F, 0F, 11, 4, 22, 0F); // Box 201
		bodyModel[129].setRotationPoint(-29F, -4F, -11F);

		bodyModel[130].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[130].setRotationPoint(-18.5F, -18F, 10.5F);

		bodyModel[131].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 315 door swing right
		bodyModel[131].setRotationPoint(-28.5F, -18F, -10.5F);

		bodyModel[132].addBox(0F, 0F, 0F, 15, 3, 22, 0F); // Box 489
		bodyModel[132].setRotationPoint(-8F, 3F, -11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[133].setRotationPoint(-8F, 2F, -11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 15, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[134].setRotationPoint(-8F, 6F, -11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 15, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[135].setRotationPoint(-8F, 6F, -9F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[136].setRotationPoint(-8F, 2F, 7F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 15, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[137].setRotationPoint(-8F, 6F, 9F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[138].setRotationPoint(-17F, -22F, -6F);

		bodyModel[139].addBox(0F, 0F, 0F, 8, 5, 1, 0F); // Box 285
		bodyModel[139].setRotationPoint(-17F, -20.5F, -7.5F);

		bodyModel[140].addBox(0F, 0F, 0F, 8, 5, 1, 0F); // Box 286
		bodyModel[140].setRotationPoint(-17F, -20.5F, 6.5F);

		bodyModel[141].addBox(0F, 0F, 0F, 6, 1, 14, 0F); // Box 264
		bodyModel[141].setRotationPoint(-9F, -22F, -7F);

		bodyModel[142].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276
		bodyModel[142].setRotationPoint(26F, -22.5F, -3F);

		bodyModel[143].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277
		bodyModel[143].setRotationPoint(18F, -22.5F, -3F);

		bodyModel[144].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 297
		bodyModel[144].setRotationPoint(25F, -19.5F, -7.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 299
		bodyModel[145].setRotationPoint(25F, -19.5F, 6.5F);

		bodyModel[146].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 272
		bodyModel[146].setRotationPoint(15.5F, -19.5F, -7.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 273
		bodyModel[147].setRotationPoint(15.5F, -19.5F, 6.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274
		bodyModel[148].setRotationPoint(-1.5F, -22F, -2.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 275
		bodyModel[149].setRotationPoint(11.5F, -22F, -2.5F);

		bodyModel[150].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[150].setRotationPoint(3F, -22F, -3F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[151].setRotationPoint(2F, -21F, 7F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 104
		bodyModel[152].setRotationPoint(11F, -21F, 7F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 105
		bodyModel[153].setRotationPoint(-3F, -21F, 7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[154].setRotationPoint(2F, -21F, -9F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 285
		bodyModel[155].setRotationPoint(-3F, -21F, -9F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[156].setRotationPoint(11F, -21F, -9F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[157].setRotationPoint(-42F, 0F, 5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[158].setRotationPoint(-42F, 0F, -5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[159].setRotationPoint(-42F, 0F, -6F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268 anticlimber
		bodyModel[160].setRotationPoint(-43F, 0F, -7F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 269anticlimber
		bodyModel[161].setRotationPoint(-43F, 0F, 0F);

		bodyModel[162].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[162].setRotationPoint(-32F, -12F, -11F);

		bodyModel[163].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 43
		bodyModel[163].setRotationPoint(-37F, -13F, -6F);

		bodyModel[164].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 43
		bodyModel[164].setRotationPoint(-37F, -13F, -7F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[165].setRotationPoint(-36.5F, -8.5F, -7F);

		bodyModel[166].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[166].setRotationPoint(-36F, -6.5F, -7F);

		bodyModel[167].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[167].setRotationPoint(-31.5F, -22.5F, -1.5F);

		bodyModel[168].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[168].setRotationPoint(-30F, -23F, -0.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[169].setRotationPoint(-30.75F, -22.5F, 0.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 387
		bodyModel[170].setRotationPoint(-29.75F, -22.5F, -0.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 commander beacon
		bodyModel[171].setRotationPoint(-25.47F, -23F, -0.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 341
		bodyModel[172].setRotationPoint(-25.32F, -22F, -0.5F);

		bodyModel[173].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 361
		bodyModel[173].setRotationPoint(-25.5F, -23F, -6F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[174].setRotationPoint(-26.5F, -23F, -6F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 363
		bodyModel[175].setRotationPoint(-26.5F, -22F, -6F);

		bodyModel[176].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[176].setRotationPoint(-25.5F, -23F, 2F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[177].setRotationPoint(-26.5F, -23F, 2F);

		bodyModel[178].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 366
		bodyModel[178].setRotationPoint(-26.5F, -22F, 2F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[179].setRotationPoint(12.5F, -22.5F, -7F);

		bodyModel[180].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 380
		bodyModel[180].setRotationPoint(11.5F, -23.5F, -6.75F);

		bodyModel[181].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 381
		bodyModel[181].setRotationPoint(10.5F, -23.5F, -5.25F);

		bodyModel[182].addBox(0F, 0F, 0F, 6, 2, 8, 0F); // Box 423 AC
		bodyModel[182].setRotationPoint(-26F, -23F, -4F);

		bodyModel[183].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 369
		bodyModel[183].setRotationPoint(-18.5F, -23F, 2F);

		bodyModel[184].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 370
		bodyModel[184].setRotationPoint(-18.5F, -23F, 2F);

		bodyModel[185].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 371
		bodyModel[185].setRotationPoint(-18.5F, -23F, 6F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[186].setRotationPoint(-18.5F, -24F, 4F);

		bodyModel[187].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[187].setRotationPoint(-15.5F, -23F, 6F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 374
		bodyModel[188].setRotationPoint(-15.5F, -23F, 2F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 430
		bodyModel[189].setRotationPoint(-24F, -23F, 0F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 308
		bodyModel[190].setRotationPoint(-18F, -21F, -11F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[191].setRotationPoint(-9F, -21F, -11F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 310
		bodyModel[192].setRotationPoint(-18F, -21F, 7F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[193].setRotationPoint(-9F, -21F, 7F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[194].setRotationPoint(-29F, -21F, -11F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[195].setRotationPoint(-19F, -21F, -11F);

		bodyModel[196].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[196].setRotationPoint(-29F, -21F, -7F);

		bodyModel[197].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[197].setRotationPoint(-19F, -21F, -7F);

		bodyModel[198].addBox(0F, 0F, 0F, 9, 1, 14, 0F); // Box 220
		bodyModel[198].setRotationPoint(-28F, -21F, -7F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[199].setRotationPoint(-28F, -21F, -11F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[200].setRotationPoint(-28F, -21F, 7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[201].setRotationPoint(-19F, -21F, 7F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[202].setRotationPoint(-29F, -21F, 7F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[203].setRotationPoint(-7F, 2F, -11.5F);
		bodyModel[203].rotateAngleX = 0.87266463F;

		bodyModel[204].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 334
		bodyModel[204].setRotationPoint(-7F, 3.5F, 8.75F);
		bodyModel[204].rotateAngleX = 0.87266463F;

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[205].setRotationPoint(39F, 0F, -5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[206].setRotationPoint(39F, 0F, -6F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 245
		bodyModel[207].setRotationPoint(39F, 0F, 5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 246
		bodyModel[208].setRotationPoint(-23.85F, -21F, 8.5F);
		bodyModel[208].rotateAngleX = -0.62831853F;

		bodyModel[209].addShapeBox(0F, -1F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 247 commander beacon
		bodyModel[209].setRotationPoint(-24F, -21F, 8.5F);
		bodyModel[209].rotateAngleX = -0.62831853F;

		bodyModel[210].addShapeBox(0F, -1F, -1F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 248 commander beacon
		bodyModel[210].setRotationPoint(-24F, -21F, -8.5F);
		bodyModel[210].rotateAngleX = 0.62831853F;

		bodyModel[211].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 249
		bodyModel[211].setRotationPoint(-23.85F, -21F, -8.5F);
		bodyModel[211].rotateAngleX = 0.62831853F;

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[212].setRotationPoint(-41.5F, 0F, 6F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 251 ditchlight front
		bodyModel[213].setRotationPoint(-41.75F, 0F, 6F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 252 ditchlight front
		bodyModel[214].setRotationPoint(-41.75F, 0F, -8F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[215].setRotationPoint(-41.5F, 0F, -8F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 254
		bodyModel[216].setRotationPoint(38.5F, 0F, 6F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 255
		bodyModel[217].setRotationPoint(38.5F, 0F, -8F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 256 ditchlight rear
		bodyModel[218].setRotationPoint(38.75F, 0F, -8F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 257 ditchlight rear
		bodyModel[219].setRotationPoint(38.75F, 0F, 6F);

		bodyModel[220].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 258
		bodyModel[220].setRotationPoint(-37F, -12F, 11F);

		bodyModel[221].addBox(0F, 0F, 0F, 37, 2, 4, 0F); // Box 36
		bodyModel[221].setRotationPoint(-18F, -2F, -11F);

		bodyModel[222].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[222].setRotationPoint(-16F, -13F, -9F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[223].setRotationPoint(-16F, -15F, -9F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[224].setRotationPoint(-17F, -12F, -11F);

		bodyModel[225].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 314
		bodyModel[225].setRotationPoint(-18F, -12F, -11F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[226].setRotationPoint(17F, -10F, -11F);

		bodyModel[227].addBox(0F, 0F, 0F, 16, 8, 0, 0F); // Box 316
		bodyModel[227].setRotationPoint(19F, -8F, -11F);

		bodyModel[228].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[228].setRotationPoint(16F, -22.5F, -5.5F);

		bodyModel[229].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[229].setRotationPoint(17F, -22.25F, -4.5F);

		bodyModel[230].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[230].setRotationPoint(16.5F, -22.25F, -6.5F);

		bodyModel[231].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[231].setRotationPoint(18.5F, -21.5F, -5.5F);

		bodyModel[232].addBox(0F, 0F, 0F, 2, 8, 4, 0F); // Box 270
		bodyModel[232].setRotationPoint(-18F, -10F, -10.5F);

		bodyModel[233].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 271
		bodyModel[233].setRotationPoint(14.5F, -23.25F, 0.5F);

		bodyModel[234].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 272
		bodyModel[234].setRotationPoint(14F, -23.25F, -1.5F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 273
		bodyModel[235].setRotationPoint(16F, -22.5F, -0.5F);

		bodyModel[236].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 274
		bodyModel[236].setRotationPoint(13.5F, -23.5F, -0.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[237].setRotationPoint(-40F, -8F, -7F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 45
		bodyModel[238].setRotationPoint(-40F, -8F, 0F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 42
		bodyModel[239].setRotationPoint(-40F, -10F, 1F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 48
		bodyModel[240].setRotationPoint(-38.98F, -13F, -1F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 294 lamp canada front
		bodyModel[241].setRotationPoint(-40F, -10F, -1F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 295 lamp canada front
		bodyModel[242].setRotationPoint(-40F, -12F, -1F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 298
		bodyModel[243].setRotationPoint(-40F, -10F, -7F);

		bodyModel[244].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 300
		bodyModel[244].setRotationPoint(-36F, -2F, 7F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 301 lamp bnsf front
		bodyModel[245].setRotationPoint(-40F, -13F, -1F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 302 lamp bnsf front
		bodyModel[246].setRotationPoint(-40F, -11F, -1F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[247].setRotationPoint(-14F, -4F, 11F);

		bodyModel[248].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 304
		bodyModel[248].setRotationPoint(-14F, -2F, 7F);

		bodyModel[249].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 305
		bodyModel[249].setRotationPoint(-18F, -4F, 7F);

		bodyModel[250].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 306
		bodyModel[250].setRotationPoint(-18F, -12F, 11F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[251].setRotationPoint(-16F, -12F, 11F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 318
		bodyModel[252].setRotationPoint(-40F, -13F, 1F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 319
		bodyModel[253].setRotationPoint(-40F, -13F, -7F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 314 lamp sp front
		bodyModel[254].setRotationPoint(-39.75F, -12F, -2F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 315 lamp sp front
		bodyModel[255].setRotationPoint(-39.75F, -12F, 0F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 316 lamp sp front
		bodyModel[256].setRotationPoint(-39.75F, -14F, -1F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 317
		bodyModel[257].setRotationPoint(-38.98F, -14F, -1.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[258].setRotationPoint(-39.15F, -13F, -2F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[259].setRotationPoint(-0.5F, -19F, -8.7F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[260].setRotationPoint(-0.5F, -20F, -8.7F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[261].setRotationPoint(-0.25F, -18.5F, -8.45F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		bodyModel[262].setRotationPoint(-0.5F, -21F, -8.5F);

		bodyModel[263].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 389 support cull
		bodyModel[263].setRotationPoint(-27.5F, -21.5F, -9F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 commander beacon
		bodyModel[264].setRotationPoint(-26.97F, -23.5F, -8.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[265].setRotationPoint(-26.82F, -22.5F, -8.5F);

		bodyModel[266].addShapeBox(0F, -1F, -1F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 334 commander beacon
		bodyModel[266].setRotationPoint(-20F, -22F, 0.5F);

		bodyModel[267].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 335
		bodyModel[267].setRotationPoint(-19.85F, -22F, 0.5F);

		bodyModel[268].addShapeBox(0F, -1F, -1F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 336 commander beacon
		bodyModel[268].setRotationPoint(-27.5F, -22F, 0.5F);

		bodyModel[269].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 337
		bodyModel[269].setRotationPoint(-27.35F, -22F, 0.5F);

		bodyModel[270].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 338
		bodyModel[270].setRotationPoint(-14F, -24.25F, -1.5F);

		bodyModel[271].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 339
		bodyModel[271].setRotationPoint(-14.5F, -24.5F, -0.5F);

		bodyModel[272].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 340
		bodyModel[272].setRotationPoint(-13.5F, -24.25F, 0.5F);

		bodyModel[273].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 341
		bodyModel[273].setRotationPoint(-12F, -23.5F, -0.5F);

		bodyModel[274].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 342
		bodyModel[274].setRotationPoint(-26F, -23F, -0.5F);

		bodyModel[275].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 343
		bodyModel[275].setRotationPoint(-26.75F, -22.5F, 0.5F);

		bodyModel[276].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 344
		bodyModel[276].setRotationPoint(-27.5F, -22.5F, -1.5F);

		bodyModel[277].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 345
		bodyModel[277].setRotationPoint(-25.75F, -22.5F, -0.5F);

		bodyModel[278].addShapeBox(0F, -1F, -1F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 346 commander beacon
		bodyModel[278].setRotationPoint(-30.5F, -22F, 0.5F);

		bodyModel[279].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 347
		bodyModel[279].setRotationPoint(-30.35F, -22F, 0.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 348 cull
		bodyModel[280].setRotationPoint(-41.5F, 1F, -5.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 349 ditchlight front
		bodyModel[281].setRotationPoint(-41.75F, 1F, -5.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 350 ditchlight front
		bodyModel[282].setRotationPoint(-41.75F, 1F, 3.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 351 cull
		bodyModel[283].setRotationPoint(-41.5F, 1F, 3.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 352 cull
		bodyModel[284].setRotationPoint(38.5F, 1F, -5.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 353 cull
		bodyModel[285].setRotationPoint(38.5F, 1F, 3.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 354 ditchlight rear
		bodyModel[286].setRotationPoint(38.75F, 1F, 3.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 355 ditchlight rear
		bodyModel[287].setRotationPoint(38.75F, 1F, -5.5F);

		bodyModel[288].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 356 support cull
		bodyModel[288].setRotationPoint(-27.5F, -21.5F, 7F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 359
		bodyModel[289].setRotationPoint(14.68F, -22F, 6.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 360 commander beacon
		bodyModel[290].setRotationPoint(14.53F, -23F, 6.5F);

		bodyModel[291].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 361
		bodyModel[291].setRotationPoint(-12F, 3F, -11F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[292].setRotationPoint(-12F, 6F, -11F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[293].setRotationPoint(-12F, 6F, -9F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 367
		bodyModel[294].setRotationPoint(-12F, 6F, 9F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[295].setRotationPoint(-12F, 2F, -11F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[296].setRotationPoint(-12F, 2F, 7F);

		bodyModel[297].addShapeBox(0F, -1F, -1F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 475 commander beacon
		bodyModel[297].setRotationPoint(32.5F, -22F, 0.5F);

		bodyModel[298].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 476
		bodyModel[298].setRotationPoint(32.65F, -22F, 0.5F);

		bodyModel[299].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 477 extra stacc
		bodyModel[299].setRotationPoint(11.5F, -24F, -2.5F);

		bodyModel[300].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 478 extra stacc
		bodyModel[300].setRotationPoint(-1.5F, -24F, -2.5F);

		bodyModel[301].addBox(0F, 0F, 0F, 2, 3, 5, 0F); // Box 479 extra stacc
		bodyModel[301].setRotationPoint(7.5F, -24F, -2.5F);

		bodyModel[302].addBox(0F, 0F, 0F, 2, 3, 5, 0F); // Box 480 extra stacc
		bodyModel[302].setRotationPoint(2.5F, -24F, -2.5F);

		bodyModel[303].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 346 cover
		bodyModel[303].setRotationPoint(-37F, -9F, -7F);

		bodyModel[304].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 355
		bodyModel[304].setRotationPoint(-36F, -12F, -7.5F);

		bodyModel[305].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[305].setRotationPoint(-35F, -11F, -7.5F);

		bodyModel[306].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 484
		bodyModel[306].setRotationPoint(-28F, -23.5F, 3.5F);

		bodyModel[307].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 485
		bodyModel[307].setRotationPoint(-28.75F, -23F, 4.5F);

		bodyModel[308].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 486
		bodyModel[308].setRotationPoint(-29.5F, -23F, 2.5F);

		bodyModel[309].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 487
		bodyModel[309].setRotationPoint(-27.75F, -23F, 3.5F);

		bodyModel[310].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 176 glow
		bodyModel[310].setRotationPoint(-38.1F, -11.5F, 5.5F);
		bodyModel[310].rotateAngleY = -0.43633231F;

		bodyModel[311].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 176 glow
		bodyModel[311].setRotationPoint(-38.1F, -11.5F, -5.5F);
		bodyModel[311].rotateAngleY = 0.43633231F;

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[312].setRotationPoint(-33F, -19F, -0.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[313].setRotationPoint(-33F, -20F, -0.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[314].setRotationPoint(-32.75F, -18.5F, -0.25F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[315].setRotationPoint(-33F, -21F, -0.5F);

		bodyModel[316].addBox(0F, 0F, 0F, 8, 3, 7, 0F); // Box 196 winterization hatch
		bodyModel[316].setRotationPoint(17F, -23.5F, -3.5F);

		bodyModel[317].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 86
		bodyModel[317].setRotationPoint(-28.1F, -12F, -5F);
		bodyModel[317].rotateAngleY = -0.38397244F;

		bodyModel[318].addBox(0F, 0F, 0F, 1, 9, 10, 0F); // Box 87
		bodyModel[318].setRotationPoint(-28F, -13F, -4F);

		bodyModel[319].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 86
		bodyModel[319].setRotationPoint(-27F, -14F, -5F);
		bodyModel[319].rotateAngleY = -0.38397244F;

		bodyModel[320].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 510
		bodyModel[320].setRotationPoint(-41F, 6F, -11F);

		bodyModel[321].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 511
		bodyModel[321].setRotationPoint(-41F, 6F, 10F);

		bodyModel[322].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 512
		bodyModel[322].setRotationPoint(39F, 6F, 10F);

		bodyModel[323].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 513
		bodyModel[323].setRotationPoint(39F, 6F, -11F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 143 sandcap
		bodyModel[324].setRotationPoint(-38.5F, -13.5F, -1F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 351 sandcap
		bodyModel[325].setRotationPoint(34.5F, -21.5F, -1F);

		bodyModel[326].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 352
		bodyModel[326].setRotationPoint(-31F, -23F, -2F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 353 lamp front arr
		bodyModel[327].setRotationPoint(-31.25F, -23F, -2F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 354 lamp front arr
		bodyModel[328].setRotationPoint(-31.25F, -23F, 0F);

		bodyModel[329].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 355 support cull
		bodyModel[329].setRotationPoint(-29.5F, -22.5F, -1F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[330].setRotationPoint(-29.5F, -23.5F, -1F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[331].setRotationPoint(-29.5F, -24F, -1F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[332].setRotationPoint(-29.5F, -24F, -1F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[333].setRotationPoint(-29.5F, -24F, -1F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[334].setRotationPoint(-29.5F, -24F, -1F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[335].setRotationPoint(25F, -22.5F, -6.5F);

		bodyModel[336].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[336].setRotationPoint(23F, -23.5F, -4.5F);

		bodyModel[337].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[337].setRotationPoint(24F, -23.5F, -6.5F);

		bodyModel[338].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[338].setRotationPoint(25F, -23.5F, -5.5F);

		bodyModel[339].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 365 extra stacc
		bodyModel[339].setRotationPoint(1F, -22F, -2.5F);

		bodyModel[340].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 366 extra stacc
		bodyModel[340].setRotationPoint(9F, -22F, -2.5F);

		bodyModel[341].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 367
		bodyModel[341].setRotationPoint(7F, 3F, -11F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[342].setRotationPoint(7F, 6F, -9F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[343].setRotationPoint(7F, 2F, -11F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[344].setRotationPoint(7F, 6F, -11F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 371
		bodyModel[345].setRotationPoint(7F, 6F, 9F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[346].setRotationPoint(7F, 2F, 7F);

		bodyModel[347].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 373 arr antenna
		bodyModel[347].setRotationPoint(-25.5F, -22.5F, -4F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374 arr antenna
		bodyModel[348].setRotationPoint(-26.5F, -22.5F, -4F);

		bodyModel[349].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 375 arr antenna
		bodyModel[349].setRotationPoint(-26.5F, -21.5F, -4F);

		bodyModel[350].addBox(-1F, 0F, 0F, 1, 1, 1, 0F); // Box 376 glow
		bodyModel[350].setRotationPoint(36.1F, -13F, 5.5F);
		bodyModel[350].rotateAngleY = 0.43633231F;

		bodyModel[351].addBox(-1F, 0F, -1F, 1, 1, 1, 0F); // Box 377 glow
		bodyModel[351].setRotationPoint(36.1F, -13F, -5.5F);
		bodyModel[351].rotateAngleY = -0.43633231F;

		bodyModel[352].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 378 cull
		bodyModel[352].setRotationPoint(14F, -21F, 7F);

		bodyModel[353].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 450 cull
		bodyModel[353].setRotationPoint(-43F, 7F, -9F);

		bodyModel[354].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 451 cull
		bodyModel[354].setRotationPoint(-43F, 7F, 3F);

		bodyModel[355].addBox(0F, 0F, 0F, 3, 0, 18, 0F); // Box 452
		bodyModel[355].setRotationPoint(-44F, 9F, -9F);

		bodyModel[356].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 453 cull
		bodyModel[356].setRotationPoint(39F, 7F, 3F);

		bodyModel[357].addBox(0F, 0F, 0F, 3, 0, 18, 0F); // Box 454
		bodyModel[357].setRotationPoint(39F, 9F, -9F);

		bodyModel[358].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 455 cull
		bodyModel[358].setRotationPoint(39F, 7F, -9F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479 cull
		bodyModel[359].setRotationPoint(39F, 8F, -2F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339 cull
		bodyModel[360].setRotationPoint(-43F, 8F, -2F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 446
		bodyModel[361].setRotationPoint(-44.5F, 3F, -10F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 447
		bodyModel[362].setRotationPoint(-44F, 3F, 2F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[363].setRotationPoint(-44F, 4F, 2F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[364].setRotationPoint(-44F, 4F, -10F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[365].setRotationPoint(39F, 4F, 2F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F); // Box 396
		bodyModel[366].setRotationPoint(39F, 4F, -10F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 397
		bodyModel[367].setRotationPoint(39.5F, 3F, -10F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[368].setRotationPoint(39F, 3F, 2F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 399
		bodyModel[369].setRotationPoint(39F, -5F, 3F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 400
		bodyModel[370].setRotationPoint(39.5F, -4.5F, 3F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[371].setRotationPoint(-42F, -5F, -5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 402
		bodyModel[372].setRotationPoint(-42.5F, -4.5F, -5F);

		bodyModel[373].addShapeBox(-1.5F, -1.5F, -0.5F, 3, 3, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 284
		bodyModel[373].setRotationPoint(-27F, -19.5F, -9F);
		bodyModel[373].rotateAngleX = -0.9250245F;
		bodyModel[373].rotateAngleY = 0.01745329F;
		bodyModel[373].rotateAngleZ = -0.01745329F;

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 404 commander beacon
		bodyModel[374].setRotationPoint(-26.97F, -23.5F, 7.5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 405
		bodyModel[375].setRotationPoint(-26.82F, -22.5F, 7.5F);

		bodyModel[376].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[376].setRotationPoint(-28.01F, -16F, -12F);

		bodyModel[377].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[377].setRotationPoint(-28.01F, -16F, 11F);

		bodyModel[378].addBox(0F, 0F, 0F, 3, 1, 21, 0F); // Box 408
		bodyModel[378].setRotationPoint(21.5F, 1F, -10.5F);

		bodyModel[379].addBox(0F, 0F, 0F, 3, 1, 21, 0F); // Box 409
		bodyModel[379].setRotationPoint(-25.5F, 1F, -10.5F);

		bodyModel[380].addBox(0F, 0F, 0F, 70, 1, 4, 0F); // Box 515
		bodyModel[380].setRotationPoint(-36F, 0F, 7F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		bodyModel[381].setRotationPoint(-41.01F, -8F, -10F);
		bodyModel[381].rotateAngleY = -3.14159265F;

		bodyModel[382].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		bodyModel[382].setRotationPoint(-41.01F, -8F, 11F);
		bodyModel[382].rotateAngleY = -3.14159265F;

		bodyModel[383].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		bodyModel[383].setRotationPoint(39.01F, -8F, 11F);
		bodyModel[383].rotateAngleY = -3.14159265F;

		bodyModel[384].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[384].setRotationPoint(39.01F, -8F, -10F);
		bodyModel[384].rotateAngleY = -3.14159265F;

		bodyModel[385].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[385].setRotationPoint(35F, 7F, -11F);

		bodyModel[386].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 400
		bodyModel[386].setRotationPoint(35F, 6F, -9F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[387].setRotationPoint(35F, 4F, -10F);

		bodyModel[388].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 402
		bodyModel[388].setRotationPoint(35F, 3F, -8F);

		bodyModel[389].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 403
		bodyModel[389].setRotationPoint(35F, 2F, -9F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[390].setRotationPoint(36F, 0F, -8F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 405
		bodyModel[391].setRotationPoint(35F, 7F, 9F);

		bodyModel[392].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 406
		bodyModel[392].setRotationPoint(35F, 6F, 9F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 407
		bodyModel[393].setRotationPoint(35F, 4F, 8F);

		bodyModel[394].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 408
		bodyModel[394].setRotationPoint(35F, 2F, 7F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 409
		bodyModel[395].setRotationPoint(36F, 0F, 7F);

		bodyModel[396].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 410
		bodyModel[396].setRotationPoint(35F, 3F, 8F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull
		bodyModel[397].setRotationPoint(-26F, -17F, 10F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[398].setRotationPoint(-26F, -18F, 10F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F); // Box 401
		bodyModel[399].setRotationPoint(-29F, -22.5F, -4.5F);

		bodyModel[400].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 402
		bodyModel[400].setRotationPoint(-28F, -22.5F, -4F);

		bodyModel[401].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 403
		bodyModel[401].setRotationPoint(34F, -22.5F, -5F);

		bodyModel[402].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 404
		bodyModel[402].setRotationPoint(34F, -23.5F, -4.5F);

		bodyModel[403].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 405
		bodyModel[403].setRotationPoint(32F, -23.5F, -3.5F);

		bodyModel[404].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 406
		bodyModel[404].setRotationPoint(33F, -23.5F, -5.5F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.57F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 296 nose cover
		bodyModel[405].setRotationPoint(-40F, -13F, 0F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.57F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 299 nose cover
		bodyModel[406].setRotationPoint(-40F, -13F, -1F);
	}
	ModelBapBlombergB theTrucks2 = new ModelBapBlombergB();
	ModelTypeB theTrucks3 = new ModelTypeB();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 407; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("Lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}

		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 6||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 1||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 11||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 3457||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 3458||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 3455) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.5, 0.15, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 3247) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeb_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.5, 0.3, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.95, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 13454||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 15345) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeb_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.55, 0.3, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.5, 0.15, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}