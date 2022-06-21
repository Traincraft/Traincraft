//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 05.06.2020 - 17:54:23
// Last changed on: 05.06.2020 - 17:54:23

package train.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

import java.util.ArrayList;

public class ModelSD9 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSD9() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[376];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 266
		bodyModel[3] = new ModelRendererTurbo(this, 241, 3, textureX, textureY); // Box 143
		bodyModel[4] = new ModelRendererTurbo(this, 297, 3, textureX, textureY); // Box 62
		bodyModel[5] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 61
		bodyModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 63
		bodyModel[7] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 4
		bodyModel[8] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 78
		bodyModel[9] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 188
		bodyModel[10] = new ModelRendererTurbo(this, 345, 1, textureX, textureY, "lamp"); // Box 189 ditchlight front upper
		bodyModel[11] = new ModelRendererTurbo(this, 353, 1, textureX, textureY, "lamp"); // Box 190 ditchlight front upper
		bodyModel[12] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 4
		bodyModel[13] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 4
		bodyModel[14] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 4
		bodyModel[15] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 4
		bodyModel[16] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 4
		bodyModel[17] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 4
		bodyModel[18] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 3
		bodyModel[20] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 266
		bodyModel[21] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 271
		bodyModel[22] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 272
		bodyModel[23] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 273
		bodyModel[24] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 274
		bodyModel[25] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 275
		bodyModel[26] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 271
		bodyModel[27] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 272
		bodyModel[28] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 273
		bodyModel[29] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 274
		bodyModel[30] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 275
		bodyModel[31] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 276
		bodyModel[32] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 5
		bodyModel[33] = new ModelRendererTurbo(this, 425, 3, textureX, textureY); // Box 143
		bodyModel[34] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 61
		bodyModel[35] = new ModelRendererTurbo(this, 505, 3, textureX, textureY); // Box 62
		bodyModel[36] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 63
		bodyModel[37] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 4
		bodyModel[38] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 4
		bodyModel[39] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 4
		bodyModel[40] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 4
		bodyModel[41] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 4
		bodyModel[42] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 4
		bodyModel[43] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 2
		bodyModel[44] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 214
		bodyModel[45] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 209
		bodyModel[46] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 211
		bodyModel[47] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 4
		bodyModel[48] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 4
		bodyModel[49] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 214
		bodyModel[50] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 215
		bodyModel[51] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 216
		bodyModel[52] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 217
		bodyModel[53] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 218
		bodyModel[54] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 219
		bodyModel[55] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 220
		bodyModel[56] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 221
		bodyModel[57] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 223
		bodyModel[58] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 39
		bodyModel[59] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 119
		bodyModel[60] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 125
		bodyModel[61] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 9
		bodyModel[62] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 10
		bodyModel[63] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 15
		bodyModel[64] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 21
		bodyModel[65] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 314 door swing right
		bodyModel[66] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 315 door swing right
		bodyModel[67] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 344
		bodyModel[68] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 345
		bodyModel[69] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 346
		bodyModel[70] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 347
		bodyModel[71] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 348
		bodyModel[72] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 349
		bodyModel[73] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 350
		bodyModel[74] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 351
		bodyModel[75] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 352
		bodyModel[76] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 353
		bodyModel[77] = new ModelRendererTurbo(this, 3, 156, textureX, textureY); // Box 265
		bodyModel[78] = new ModelRendererTurbo(this, 10, 156, textureX, textureY, "lamp"); // Box 247 headlight front 1
		bodyModel[79] = new ModelRendererTurbo(this, 10, 161, textureX, textureY, "lamp"); // Box 248 headlight front 2
		bodyModel[80] = new ModelRendererTurbo(this, 299, 59, textureX, textureY); // Box 358 
		bodyModel[81] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 362
		bodyModel[82] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 363
		bodyModel[83] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 364
		bodyModel[84] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 365
		bodyModel[85] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 366
		bodyModel[86] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 239
		bodyModel[87] = new ModelRendererTurbo(this, 385, 17, textureX, textureY, "lamp"); // Box 240 ditchlight rear upper
		bodyModel[88] = new ModelRendererTurbo(this, 409, 17, textureX, textureY, "lamp"); // Box 241 ditchlight rear upper
		bodyModel[89] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 242
		bodyModel[90] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 371
		bodyModel[91] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 372
		bodyModel[92] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 373
		bodyModel[93] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 374
		bodyModel[94] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 486
		bodyModel[95] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 489
		bodyModel[96] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 38R
		bodyModel[97] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 176
		bodyModel[98] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 243
		bodyModel[99] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 250
		bodyModel[100] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 500
		bodyModel[101] = new ModelRendererTurbo(this, 369, 42, textureX, textureY); // Box 501
		bodyModel[102] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 503
		bodyModel[103] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 131
		bodyModel[104] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 132
		bodyModel[105] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 133
		bodyModel[106] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 134
		bodyModel[107] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 135
		bodyModel[108] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 136
		bodyModel[109] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 137
		bodyModel[110] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 138
		bodyModel[111] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 139
		bodyModel[112] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 140
		bodyModel[113] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 141
		bodyModel[114] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 142
		bodyModel[115] = new ModelRendererTurbo(this, 3, 171, textureX, textureY); // Box 150
		bodyModel[116] = new ModelRendererTurbo(this, 1, 82, textureX, textureY); // Box 152
		bodyModel[117] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 154
		bodyModel[118] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 155
		bodyModel[119] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 89
		bodyModel[120] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 91
		bodyModel[121] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 101
		bodyModel[122] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 105
		bodyModel[123] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 172
		bodyModel[124] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 173
		bodyModel[125] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 176
		bodyModel[126] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 177
		bodyModel[127] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 178
		bodyModel[128] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 179
		bodyModel[129] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 180
		bodyModel[130] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 181
		bodyModel[131] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 182
		bodyModel[132] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 183
		bodyModel[133] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 184
		bodyModel[134] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 185
		bodyModel[135] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 190
		bodyModel[136] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 191
		bodyModel[137] = new ModelRendererTurbo(this, 233, 89, textureX, textureY, "cull"); // Box 196 winterization hatch cull
		bodyModel[138] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 202
		bodyModel[139] = new ModelRendererTurbo(this, 3, 166, textureX, textureY); // Box 216
		bodyModel[140] = new ModelRendererTurbo(this, 11, 193, textureX, textureY, "lamp"); // Box 218 lower gyralight front
		bodyModel[141] = new ModelRendererTurbo(this, 2, 193, textureX, textureY, "lamp"); // Box 219 lower gyralight front mount
		bodyModel[142] = new ModelRendererTurbo(this, 11, 193, textureX, textureY, "lamp"); // Box 220 lower gyralight front
		bodyModel[143] = new ModelRendererTurbo(this, 27, 193, textureX, textureY, "lamp"); // Box 224 lamp lower gyralight rear
		bodyModel[144] = new ModelRendererTurbo(this, 18, 193, textureX, textureY, "lamp"); // Box 225 lower gyralight rear mount
		bodyModel[145] = new ModelRendererTurbo(this, 27, 193, textureX, textureY, "lamp"); // Box 226 lamp lower gyralight rear
		bodyModel[146] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 237
		bodyModel[147] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 238
		bodyModel[148] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 247 extra stack
		bodyModel[149] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 248 extra stack
		bodyModel[150] = new ModelRendererTurbo(this, 265, 90, textureX, textureY); // Box 272
		bodyModel[151] = new ModelRendererTurbo(this, 386, 90, textureX, textureY); // Box 86 control a
		bodyModel[152] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 278
		bodyModel[153] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 279
		bodyModel[154] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 280
		bodyModel[155] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 281
		bodyModel[156] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 283
		bodyModel[157] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 285
		bodyModel[158] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 286
		bodyModel[159] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 287
		bodyModel[160] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 288
		bodyModel[161] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 289
		bodyModel[162] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 290
		bodyModel[163] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 291
		bodyModel[164] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 292
		bodyModel[165] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 293
		bodyModel[166] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 294
		bodyModel[167] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 295
		bodyModel[168] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 296
		bodyModel[169] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 297
		bodyModel[170] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 298
		bodyModel[171] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 299
		bodyModel[172] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 300
		bodyModel[173] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 301
		bodyModel[174] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 302
		bodyModel[175] = new ModelRendererTurbo(this, 27, 186, textureX, textureY, "lamp"); // Box 303 lamp upper gyralight rear
		bodyModel[176] = new ModelRendererTurbo(this, 18, 186, textureX, textureY); // Box 304 upper gyralight rear mount
		bodyModel[177] = new ModelRendererTurbo(this, 27, 186, textureX, textureY, "lamp"); // Box 305 lamp upper gyralight rear
		bodyModel[178] = new ModelRendererTurbo(this, 18, 181, textureX, textureY); // Box 306 emergency gyralight rear mount
		bodyModel[179] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 307
		bodyModel[180] = new ModelRendererTurbo(this, 27, 181, textureX, textureY, "lamp"); // Box 308 emergency gyralight rear
		bodyModel[181] = new ModelRendererTurbo(this, 11, 186, textureX, textureY, "lamp"); // Box 309 upper gyralight front
		bodyModel[182] = new ModelRendererTurbo(this, 2, 186, textureX, textureY); // Box 310 upper gyralight front mount
		bodyModel[183] = new ModelRendererTurbo(this, 11, 186, textureX, textureY, "lamp"); // Box 311 upper gyralight front
		bodyModel[184] = new ModelRendererTurbo(this, 2, 181, textureX, textureY); // Box 312 emergency gyralight front mount
		bodyModel[185] = new ModelRendererTurbo(this, 11, 181, textureX, textureY, "lamp"); // Box 313 emergency gyralight front
		bodyModel[186] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 314
		bodyModel[187] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 315
		bodyModel[188] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 316
		bodyModel[189] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 114
		bodyModel[190] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 74
		bodyModel[191] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 78
		bodyModel[192] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 245
		bodyModel[193] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 323
		bodyModel[194] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 324
		bodyModel[195] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 114
		bodyModel[196] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 74
		bodyModel[197] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 78
		bodyModel[198] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 877
		bodyModel[199] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 332
		bodyModel[200] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 333
		bodyModel[201] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 334
		bodyModel[202] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 335
		bodyModel[203] = new ModelRendererTurbo(this, 497, 105, textureX, textureY, "cull"); // Box 336 cull
		bodyModel[204] = new ModelRendererTurbo(this, 89, 121, textureX, textureY, "cull"); // Box 337 cull
		bodyModel[205] = new ModelRendererTurbo(this, 257, 121, textureX, textureY, "cull"); // Box 338 cull
		bodyModel[206] = new ModelRendererTurbo(this, 273, 121, textureX, textureY, "cull"); // Box 339 cull
		bodyModel[207] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 197
		bodyModel[208] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 198
		bodyModel[209] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 199
		bodyModel[210] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 200
		bodyModel[211] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 201
		bodyModel[212] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 345
		bodyModel[213] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 346
		bodyModel[214] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 347
		bodyModel[215] = new ModelRendererTurbo(this, 121, 57, textureX, textureY, "lamp"); // Box 162 commander beacon
		bodyModel[216] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 165
		bodyModel[217] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 622
		bodyModel[218] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 638
		bodyModel[219] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 639
		bodyModel[220] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 640
		bodyModel[221] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 74
		bodyModel[222] = new ModelRendererTurbo(this, 313, 105, textureX, textureY, "lamp"); // Box 186 lamp
		bodyModel[223] = new ModelRendererTurbo(this, 353, 105, textureX, textureY, "lamp"); // Box 187 lamp
		bodyModel[224] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 644
		bodyModel[225] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 645
		bodyModel[226] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 646
		bodyModel[227] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 647
		bodyModel[228] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 648
		bodyModel[229] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 649
		bodyModel[230] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 240
		bodyModel[231] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 241
		bodyModel[232] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 242
		bodyModel[233] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Box 243
		bodyModel[234] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 262
		bodyModel[235] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 203
		bodyModel[236] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 204
		bodyModel[237] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 205
		bodyModel[238] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 206
		bodyModel[239] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 267
		bodyModel[240] = new ModelRendererTurbo(this, 441, 73, textureX, textureY, "lamp"); // Box 268 commander beacon
		bodyModel[241] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 269
		bodyModel[242] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 114
		bodyModel[243] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 74
		bodyModel[244] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 75
		bodyModel[245] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 76
		bodyModel[246] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 77
		bodyModel[247] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 78
		bodyModel[248] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 276
		bodyModel[249] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 277
		bodyModel[250] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 278
		bodyModel[251] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 279
		bodyModel[252] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 280
		bodyModel[253] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 281
		bodyModel[254] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 389
		bodyModel[255] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 390
		bodyModel[256] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 391
		bodyModel[257] = new ModelRendererTurbo(this, 449, 113, textureX, textureY, "lamp"); // Box 162 commander beacon
		bodyModel[258] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 165
		bodyModel[259] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 287
		bodyModel[260] = new ModelRendererTurbo(this, 89, 121, textureX, textureY, "lamp"); // Box 288 commander beacon
		bodyModel[261] = new ModelRendererTurbo(this, 31, 140, textureX, textureY); // Box 131 control a
		bodyModel[262] = new ModelRendererTurbo(this, 25, 144, textureX, textureY); // Box 131 control a
		bodyModel[263] = new ModelRendererTurbo(this, 15, 141, textureX, textureY); // Box 131 control a
		bodyModel[264] = new ModelRendererTurbo(this, 12, 129, textureX, textureY); // Box 131 control a
		bodyModel[265] = new ModelRendererTurbo(this, 21, 132, textureX, textureY); // Box 131 control a
		bodyModel[266] = new ModelRendererTurbo(this, 10, 141, textureX, textureY); // Box 131 control a
		bodyModel[267] = new ModelRendererTurbo(this, 20, 142, textureX, textureY); // Box 131 control a
		bodyModel[268] = new ModelRendererTurbo(this, 7, 131, textureX, textureY); // Box 131 control a
		bodyModel[269] = new ModelRendererTurbo(this, 26, 131, textureX, textureY); // Box 131 control a
		bodyModel[270] = new ModelRendererTurbo(this, 18, 127, textureX, textureY); // Box 131 control a
		bodyModel[271] = new ModelRendererTurbo(this, 59, 76, textureX, textureY, "lamp"); // Box 357 glow marker
		bodyModel[272] = new ModelRendererTurbo(this, 59, 74, textureX, textureY, "lamp"); // Box 357 glow marker
		bodyModel[273] = new ModelRendererTurbo(this, 59, 72, textureX, textureY, "lamp"); // Box 357 glow marker
		bodyModel[274] = new ModelRendererTurbo(this, 59, 70, textureX, textureY, "lamp"); // Box 357 glow marker
		bodyModel[275] = new ModelRendererTurbo(this, 35, 122, textureX, textureY, "lamp"); // Box 363 numberboard
		bodyModel[276] = new ModelRendererTurbo(this, 46, 122, textureX, textureY, "lamp"); // Box 364 numberboard
		bodyModel[277] = new ModelRendererTurbo(this, 57, 122, textureX, textureY, "lamp"); // Box 115 numberboard
		bodyModel[278] = new ModelRendererTurbo(this, 68, 122, textureX, textureY, "lamp"); // Box 116 numberboard
		bodyModel[279] = new ModelRendererTurbo(this, 40, 119, textureX, textureY, "lamp"); // Box 363 numberboard
		bodyModel[280] = new ModelRendererTurbo(this, 51, 119, textureX, textureY, "lamp"); // Box 364 numberboard
		bodyModel[281] = new ModelRendererTurbo(this, 56, 77, textureX, textureY, "lamp"); // Box 357 glow marker
		bodyModel[282] = new ModelRendererTurbo(this, 53, 77, textureX, textureY, "lamp"); // Box 357 glow marker
		bodyModel[283] = new ModelRendererTurbo(this, 179, 113, textureX, textureY); // Box 203
		bodyModel[284] = new ModelRendererTurbo(this, 153, 68, textureX, textureY); // Box 204
		bodyModel[285] = new ModelRendererTurbo(this, 348, 38, textureX, textureY); // Box 114
		bodyModel[286] = new ModelRendererTurbo(this, 343, 38, textureX, textureY); // Box 74
		bodyModel[287] = new ModelRendererTurbo(this, 500, 38, textureX, textureY); // Box 78
		bodyModel[288] = new ModelRendererTurbo(this, 293, 11, textureX, textureY); // Box 877
		bodyModel[289] = new ModelRendererTurbo(this, 394, 53, textureX, textureY); // Box 332
		bodyModel[290] = new ModelRendererTurbo(this, 506, 53, textureX, textureY); // Box 333
		bodyModel[291] = new ModelRendererTurbo(this, 497, 100, textureX, textureY); // Box 197
		bodyModel[292] = new ModelRendererTurbo(this, 1, 109, textureX, textureY); // Box 198
		bodyModel[293] = new ModelRendererTurbo(this, 251, 99, textureX, textureY); // Box 199
		bodyModel[294] = new ModelRendererTurbo(this, 497, 94, textureX, textureY); // Box 197
		bodyModel[295] = new ModelRendererTurbo(this, 334, 108, textureX, textureY); // Box 226
		bodyModel[296] = new ModelRendererTurbo(this, 334, 110, textureX, textureY); // Box 321
		bodyModel[297] = new ModelRendererTurbo(this, 217, 131, textureX, textureY); // Box 322
		bodyModel[298] = new ModelRendererTurbo(this, 440, 119, textureX, textureY); // Box 323
		bodyModel[299] = new ModelRendererTurbo(this, 185, 128, textureX, textureY); // Box 324
		bodyModel[300] = new ModelRendererTurbo(this, 461, 119, textureX, textureY); // Box 325
		bodyModel[301] = new ModelRendererTurbo(this, 51, 67, textureX, textureY); // Box 326
		bodyModel[302] = new ModelRendererTurbo(this, 115, 99, textureX, textureY); // Box 327
		bodyModel[303] = new ModelRendererTurbo(this, 115, 93, textureX, textureY); // Box 328
		bodyModel[304] = new ModelRendererTurbo(this, 284, 122, textureX, textureY); // Box 330
		bodyModel[305] = new ModelRendererTurbo(this, 284, 122, textureX, textureY); // Box 331
		bodyModel[306] = new ModelRendererTurbo(this, 289, 122, textureX, textureY); // Box 332
		bodyModel[307] = new ModelRendererTurbo(this, 289, 122, textureX, textureY); // Box 333
		bodyModel[308] = new ModelRendererTurbo(this, 347, 9, textureX, textureY); // Box 334
		bodyModel[309] = new ModelRendererTurbo(this, 37, 131, textureX, textureY); // Box 335
		bodyModel[310] = new ModelRendererTurbo(this, 52, 131, textureX, textureY); // Box 336
		bodyModel[311] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 337
		bodyModel[312] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 338
		bodyModel[313] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 339
		bodyModel[314] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 340
		bodyModel[315] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 341
		bodyModel[316] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 342
		bodyModel[317] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 343
		bodyModel[318] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 344
		bodyModel[319] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 345
		bodyModel[320] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 346
		bodyModel[321] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 347
		bodyModel[322] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 348
		bodyModel[323] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 349
		bodyModel[324] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 350
		bodyModel[325] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 351
		bodyModel[326] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 352
		bodyModel[327] = new ModelRendererTurbo(this, 52, 129, textureX, textureY); // Box 353
		bodyModel[328] = new ModelRendererTurbo(this, 57, 130, textureX, textureY); // Box 354
		bodyModel[329] = new ModelRendererTurbo(this, 104, 128, textureX, textureY); // Box 355
		bodyModel[330] = new ModelRendererTurbo(this, 139, 128, textureX, textureY); // Box 122
		bodyModel[331] = new ModelRendererTurbo(this, 118, 128, textureX, textureY); // Box 123
		bodyModel[332] = new ModelRendererTurbo(this, 111, 133, textureX, textureY); // Box 268
		bodyModel[333] = new ModelRendererTurbo(this, 121, 135, textureX, textureY); // Box 269
		bodyModel[334] = new ModelRendererTurbo(this, 111, 142, textureX, textureY); // Box 344
		bodyModel[335] = new ModelRendererTurbo(this, 101, 139, textureX, textureY); // Box 345
		bodyModel[336] = new ModelRendererTurbo(this, 3, 161, textureX, textureY); // Box 346
		bodyModel[337] = new ModelRendererTurbo(this, 3, 176, textureX, textureY); // Box 347
		bodyModel[338] = new ModelRendererTurbo(this, 10, 166, textureX, textureY, "lamp"); // Box 248 headlight front 3
		bodyModel[339] = new ModelRendererTurbo(this, 10, 171, textureX, textureY, "lamp"); // Box 248 headlight front 4
		bodyModel[340] = new ModelRendererTurbo(this, 10, 176, textureX, textureY, "lamp"); // Box 248 headlight front 5
		bodyModel[341] = new ModelRendererTurbo(this, 19, 161, textureX, textureY); // Box 351
		bodyModel[342] = new ModelRendererTurbo(this, 19, 156, textureX, textureY); // Box 352
		bodyModel[343] = new ModelRendererTurbo(this, 26, 156, textureX, textureY, "lamp"); // Box 353 headlight rear 1
		bodyModel[344] = new ModelRendererTurbo(this, 26, 161, textureX, textureY, "lamp"); // Box 354 headlight rear 2
		bodyModel[345] = new ModelRendererTurbo(this, 26, 166, textureX, textureY, "lamp"); // Box 355 headlight rear 3
		bodyModel[346] = new ModelRendererTurbo(this, 19, 166, textureX, textureY); // Box 356
		bodyModel[347] = new ModelRendererTurbo(this, 26, 171, textureX, textureY, "lamp"); // Box 357 headlight rear 4
		bodyModel[348] = new ModelRendererTurbo(this, 19, 171, textureX, textureY); // Box 358
		bodyModel[349] = new ModelRendererTurbo(this, 19, 176, textureX, textureY); // Box 359
		bodyModel[350] = new ModelRendererTurbo(this, 26, 176, textureX, textureY, "lamp"); // Box 360 headlight rear 5
		bodyModel[351] = new ModelRendererTurbo(this, 37, 161, textureX, textureY); // Box 361
		bodyModel[352] = new ModelRendererTurbo(this, 37, 156, textureX, textureY); // Box 362
		bodyModel[353] = new ModelRendererTurbo(this, 37, 167, textureX, textureY); // Box 363
		bodyModel[354] = new ModelRendererTurbo(this, 37, 164, textureX, textureY); // Box 364
		bodyModel[355] = new ModelRendererTurbo(this, 16, 88, textureX, textureY, "lamp"); // Box 176 glow marker
		bodyModel[356] = new ModelRendererTurbo(this, 16, 91, textureX, textureY, "lamp"); // Box 176 glow marker
		bodyModel[357] = new ModelRendererTurbo(this, 111, 170, textureX, textureY); // Box 412
		bodyModel[358] = new ModelRendererTurbo(this, 90, 172, textureX, textureY); // Box 413
		bodyModel[359] = new ModelRendererTurbo(this, 88, 165, textureX, textureY); // Box 86
		bodyModel[360] = new ModelRendererTurbo(this, 2, 201, textureX, textureY); // Box 252
		bodyModel[361] = new ModelRendererTurbo(this, 9, 202, textureX, textureY, "lamp"); // Box 190 ditchlight f u
		bodyModel[362] = new ModelRendererTurbo(this, 9, 202, textureX, textureY, "lamp"); // Box 446 ditchlight f u
		bodyModel[363] = new ModelRendererTurbo(this, 2, 201, textureX, textureY); // Box 447
		bodyModel[364] = new ModelRendererTurbo(this, 2, 207, textureX, textureY); // Box 314
		bodyModel[365] = new ModelRendererTurbo(this, 9, 208, textureX, textureY, "lamp"); // Box 315 ditchlight r u
		bodyModel[366] = new ModelRendererTurbo(this, 2, 207, textureX, textureY); // Box 318
		bodyModel[367] = new ModelRendererTurbo(this, 9, 208, textureX, textureY, "lamp"); // Box 319 ditchlight r u
		bodyModel[368] = new ModelRendererTurbo(this, 424, 239, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[369] = new ModelRendererTurbo(this, 426, 234, textureX, textureY); // Box 5
		bodyModel[370] = new ModelRendererTurbo(this, 34, 177, textureX, textureY, "lamp"); // Box 6 PRIME1-1
		bodyModel[371] = new ModelRendererTurbo(this, 34, 177, textureX, textureY, "lamp"); // Box 7 PRIME1-3
		bodyModel[372] = new ModelRendererTurbo(this, 34, 177, textureX, textureY, "lamp"); // Box 8 PRIME1-2
		bodyModel[373] = new ModelRendererTurbo(this, 34, 177, textureX, textureY, "lamp"); // Box 9 PRIME1-4
		bodyModel[374] = new ModelRendererTurbo(this, 35, 170, textureX, textureY, "cull"); // Box 426 cull
		bodyModel[375] = new ModelRendererTurbo(this, 34, 181, textureX, textureY); // Box 428

		bodyModel[0].addBox(0F, 0F, 0F, 76, 4, 22, 0F); // Box 1
		bodyModel[0].setRotationPoint(-38F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 9, 20, 0F); // Box 3
		bodyModel[1].setRotationPoint(-42.01F, -1F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 3, 14, 0F); // Box 266
		bodyModel[2].setRotationPoint(-42F, -1F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[3].setRotationPoint(-42.01F, -9F, -8F);
		bodyModel[3].rotateAngleY = -3.14159265F;

		bodyModel[4].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 62
		bodyModel[4].setRotationPoint(-42.01F, -9F, 8F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[5].setRotationPoint(-42F, -3F, 10F);

		bodyModel[6].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[6].setRotationPoint(-42F, -3F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[7].setRotationPoint(-45F, 3F, -1.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[8].setRotationPoint(-42F, -3F, 4.75F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[9].setRotationPoint(-42F, -3F, -6.75F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight front upper
		bodyModel[10].setRotationPoint(-42.25F, -3F, 4.75F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight front upper
		bodyModel[11].setRotationPoint(-42.25F, -3F, -6.75F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[12].setRotationPoint(-45F, 6F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[13].setRotationPoint(-45F, 5F, 2F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[14].setRotationPoint(-45F, 7F, 0F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[15].setRotationPoint(-45F, 6F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[16].setRotationPoint(-45.5F, 5F, -10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[17].setRotationPoint(-45F, 7F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[18].setRotationPoint(-43F, 2.5F, -2F);

		bodyModel[19].addBox(0F, 0F, 0F, 0, 9, 20, 0F); // Box 3
		bodyModel[19].setRotationPoint(42.01F, -1F, -10F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 3, 14, 0F); // Box 266
		bodyModel[20].setRotationPoint(38F, -1F, -7F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 271
		bodyModel[21].setRotationPoint(38F, 0.5F, -8F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 272
		bodyModel[22].setRotationPoint(38F, 8F, -11F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 273
		bodyModel[23].setRotationPoint(38F, 5.5F, -10F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[24].setRotationPoint(38F, 3F, -9F);

		bodyModel[25].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[25].setRotationPoint(38F, 7F, -8F);

		bodyModel[26].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 271
		bodyModel[26].setRotationPoint(38F, 0.5F, 7F);

		bodyModel[27].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 272
		bodyModel[27].setRotationPoint(38F, 8F, 8F);

		bodyModel[28].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 273
		bodyModel[28].setRotationPoint(38F, 5.5F, 7F);

		bodyModel[29].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[29].setRotationPoint(38F, 3F, 7F);

		bodyModel[30].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[30].setRotationPoint(38F, 7F, 8F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[31].setRotationPoint(38F, 4.5F, 7F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[32].setRotationPoint(41F, 3F, -1.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[33].setRotationPoint(42.01F, -9F, -8F);
		bodyModel[33].rotateAngleY = -3.14159265F;

		bodyModel[34].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[34].setRotationPoint(42.02F, -3F, 10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 62
		bodyModel[35].setRotationPoint(42.01F, -9F, 8F);

		bodyModel[36].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[36].setRotationPoint(42.02F, -3F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[37].setRotationPoint(42F, 6F, 0F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[38].setRotationPoint(42F, 5F, 2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 4
		bodyModel[39].setRotationPoint(42F, 7F, 0F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[40].setRotationPoint(42F, 6F, -10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		bodyModel[41].setRotationPoint(42.5F, 5F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 4
		bodyModel[42].setRotationPoint(42F, 7F, -10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[43].setRotationPoint(42F, 2.5F, -2F);

		bodyModel[44].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 214
		bodyModel[44].setRotationPoint(38F, 4.5F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 209
		bodyModel[45].setRotationPoint(-38.01F, 2F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[46].setRotationPoint(-38.01F, 2F, 6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[47].setRotationPoint(-42F, 2F, -3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 4
		bodyModel[48].setRotationPoint(37F, 2F, -3F);

		bodyModel[49].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 214
		bodyModel[49].setRotationPoint(-42F, -9F, -8F);

		bodyModel[50].addBox(0F, 0F, 0F, 11, 12, 14, 0F); // Box 215
		bodyModel[50].setRotationPoint(-36F, -13F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 12, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[51].setRotationPoint(-39F, -13F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 217
		bodyModel[52].setRotationPoint(-39F, -13F, 1F);

		bodyModel[53].addBox(0F, 0F, 0F, 3, 12, 2, 0F); // Box 218
		bodyModel[53].setRotationPoint(-39F, -13F, -1F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 14, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[54].setRotationPoint(36F, -15F, -7F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 19, 2, 0F); // Box 220
		bodyModel[55].setRotationPoint(36F, -20F, -1F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 14, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[56].setRotationPoint(36F, -15F, 1F);

		bodyModel[57].addBox(0F, 0F, 0F, 49, 19, 14, 0F); // Box 223
		bodyModel[57].setRotationPoint(-13F, -20F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 2F, 12, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[58].setRotationPoint(-25F, -22F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 119
		bodyModel[59].setRotationPoint(-24F, -20F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[60].setRotationPoint(-25F, -20F, 7F);

		bodyModel[61].addBox(0F, 0F, 0F, 11, 12, 1, 0F); // Box 9
		bodyModel[61].setRotationPoint(-25F, -17F, 10F);

		bodyModel[62].addBox(0F, 0F, 0F, 11, 12, 1, 0F); // Box 10
		bodyModel[62].setRotationPoint(-24F, -17F, -11F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 12, 17, 0F); // Box 15
		bodyModel[63].setRotationPoint(-25F, -17F, -7F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 12, 17, 0F); // Box 21
		bodyModel[64].setRotationPoint(-14F, -17F, -10F);

		bodyModel[65].addBox(-0.5F, 0F, -3.5F, 1, 12, 4, 0F); // Box 314 door swing right
		bodyModel[65].setRotationPoint(-13.5F, -17F, 10.5F);

		bodyModel[66].addBox(-0.5F, 0F, -0.5F, 1, 12, 4, 0F); // Box 315 door swing right
		bodyModel[66].setRotationPoint(-24.5F, -17F, -10.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 344
		bodyModel[67].setRotationPoint(-25F, -5F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 8, 4, 4, 0F); // Box 345
		bodyModel[68].setRotationPoint(-33F, -5F, -11F);

		bodyModel[69].addBox(0F, 0F, 0F, 8, 4, 4, 0F); // Box 346
		bodyModel[69].setRotationPoint(-33F, -5F, 7F);

		bodyModel[70].addShapeBox(0F, 0F, 2F, 12, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[70].setRotationPoint(-25F, -22F, -4F);

		bodyModel[71].addShapeBox(0F, 0F, 2F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 348
		bodyModel[71].setRotationPoint(-25F, -22F, 0F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 349
		bodyModel[72].setRotationPoint(-25F, -20F, -7F);

		bodyModel[73].addBox(0F, 0F, 0F, 11, 7, 14, 0F); // Box 350
		bodyModel[73].setRotationPoint(-36F, -20F, -7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[74].setRotationPoint(-39F, -20F, -7F);

		bodyModel[75].addBox(0F, 0F, 0F, 3, 7, 2, 0F); // Box 352
		bodyModel[75].setRotationPoint(-39F, -20F, -1F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 353
		bodyModel[76].setRotationPoint(-39F, -20F, 1F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 265
		bodyModel[77].setRotationPoint(-39.5F, -18F, -1F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight front 1
		bodyModel[78].setRotationPoint(-40.25F, -18F, -1F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight front 2
		bodyModel[79].setRotationPoint(-40.25F, -16F, -1F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 358 
		bodyModel[80].setRotationPoint(36.5F, -19F, -7F);

		bodyModel[81].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 362
		bodyModel[81].setRotationPoint(-13F, -5F, -11F);

		bodyModel[82].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 363
		bodyModel[82].setRotationPoint(-13F, -5F, 7F);

		bodyModel[83].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 364
		bodyModel[83].setRotationPoint(42F, -9F, -8F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 365
		bodyModel[84].setRotationPoint(38.01F, 2F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[85].setRotationPoint(38.01F, 2F, 6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[86].setRotationPoint(41F, -3F, -6.75F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight rear upper
		bodyModel[87].setRotationPoint(41.25F, -3F, -6.75F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight rear upper
		bodyModel[88].setRotationPoint(41.25F, -3F, 4.75F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[89].setRotationPoint(41F, -3F, 4.75F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[90].setRotationPoint(-14F, -20F, 7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[91].setRotationPoint(-25F, -20F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[92].setRotationPoint(-14F, -20F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 374
		bodyModel[93].setRotationPoint(-24F, -20F, 7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[94].setRotationPoint(1F, 6F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 10, 2, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[95].setRotationPoint(-9F, 4F, -11F);

		bodyModel[96].addBox(0F, 0F, 0F, 40, 8, 0, 0F); // Box 38R
		bodyModel[96].setRotationPoint(-2F, -9F, 11.01F);

		bodyModel[97].addBox(0F, 0F, 0F, 40, 8, 0, 0F); // Box 176
		bodyModel[97].setRotationPoint(-2F, -9F, -11.01F);

		bodyModel[98].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 243
		bodyModel[98].setRotationPoint(38F, -9F, 9F);

		bodyModel[99].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 250
		bodyModel[99].setRotationPoint(38F, -9F, -11F);

		bodyModel[100].addBox(0F, 0F, 0F, 7, 8, 0, 0F); // Box 500
		bodyModel[100].setRotationPoint(-13F, -13F, -11.01F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 501
		bodyModel[101].setRotationPoint(-6F, -13F, -11.01F);

		bodyModel[102].addBox(0F, 0F, 0F, 7, 8, 0, 0F); // Box 503
		bodyModel[102].setRotationPoint(-13F, -13F, 11.01F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, -1.3F, -1F, 0F, -1.3F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F); // Box 131
		bodyModel[103].setRotationPoint(-33.01F, -13F, -11.01F);
		bodyModel[103].rotateAngleY = -3.14159265F;

		bodyModel[104].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 132
		bodyModel[104].setRotationPoint(-33F, -13F, -11.01F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 133
		bodyModel[105].setRotationPoint(-39F, -7F, -11.01F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 134
		bodyModel[106].setRotationPoint(-39F, -7F, 11.01F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0.4F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.4F, -1F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 135
		bodyModel[107].setRotationPoint(-33.01F, -13F, 11.02F);
		bodyModel[107].rotateAngleY = -3.14159265F;

		bodyModel[108].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 136
		bodyModel[108].setRotationPoint(-33F, -13F, 11.01F);

		bodyModel[109].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 137
		bodyModel[109].setRotationPoint(-35F, -3F, -11F);

		bodyModel[110].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 138
		bodyModel[110].setRotationPoint(-35F, -3F, 5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[111].setRotationPoint(-35F, -5F, -11.01F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 140
		bodyModel[112].setRotationPoint(-34F, -5F, -11.01F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 141
		bodyModel[113].setRotationPoint(-34F, -5F, 11.01F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[114].setRotationPoint(-35F, -5F, 11.01F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 150
		bodyModel[115].setRotationPoint(-39.5F, -12F, -1F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 152
		bodyModel[116].setRotationPoint(-37.5F, -12F, -6F);

		bodyModel[117].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 154
		bodyModel[117].setRotationPoint(-44F, 8F, -10F);

		bodyModel[118].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 155
		bodyModel[118].setRotationPoint(42F, 8F, -10F);

		bodyModel[119].addBox(0F, 0F, 0F, 11, 1, 7, 0F); // Box 89
		bodyModel[119].setRotationPoint(1F, -21.5F, -3.5F);

		bodyModel[120].addBox(0F, 0F, 0F, 12, 1, 14, 0F); // Box 91
		bodyModel[120].setRotationPoint(0.5F, -21F, -7F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[121].setRotationPoint(0.5F, -19F, 7F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // Box 105
		bodyModel[122].setRotationPoint(-4.5F, -19F, 7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 172
		bodyModel[123].setRotationPoint(12.5F, -19F, 7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[124].setRotationPoint(0.5F, -21F, 7F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 176
		bodyModel[125].setRotationPoint(-4.5F, -21F, 7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 177
		bodyModel[126].setRotationPoint(12.5F, -21F, 7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[127].setRotationPoint(0.5F, -21F, -9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[128].setRotationPoint(12.5F, -21F, -9F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[129].setRotationPoint(12.5F, -19F, -9F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[130].setRotationPoint(0.5F, -19F, -9F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 182
		bodyModel[131].setRotationPoint(-4.5F, -19F, -9F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[132].setRotationPoint(-4.5F, -21F, -9F);

		bodyModel[133].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 184
		bodyModel[133].setRotationPoint(-2F, -22F, -1.5F);

		bodyModel[134].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 185
		bodyModel[134].setRotationPoint(13F, -22F, -1.5F);

		bodyModel[135].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 190
		bodyModel[135].setRotationPoint(-37F, -20.5F, -1F);

		bodyModel[136].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 191
		bodyModel[136].setRotationPoint(35F, -20.5F, -1F);

		bodyModel[137].addBox(0F, 0F, 0F, 7, 2, 6, 0F); // Box 196 winterization hatch cull
		bodyModel[137].setRotationPoint(15F, -22F, -3F);

		bodyModel[138].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 202
		bodyModel[138].setRotationPoint(-37F, -13.5F, -1F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 216
		bodyModel[139].setRotationPoint(-39.5F, -14F, -1F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 218 lower gyralight front
		bodyModel[140].setRotationPoint(-41.25F, -19F, -1F);

		bodyModel[141].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 219 lower gyralight front mount
		bodyModel[141].setRotationPoint(-40.5F, -19F, -1F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 220 lower gyralight front
		bodyModel[142].setRotationPoint(-41.25F, -17F, -1F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 224 lamp lower gyralight rear
		bodyModel[143].setRotationPoint(39.75F, -19F, -1F);

		bodyModel[144].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 225 lower gyralight rear mount
		bodyModel[144].setRotationPoint(38.5F, -19F, -1F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 226 lamp lower gyralight rear
		bodyModel[145].setRotationPoint(39.75F, -17F, -1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[146].setRotationPoint(-6F, -5F, -11.01F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[147].setRotationPoint(-6F, -5F, 11.01F);

		bodyModel[148].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 247 extra stack
		bodyModel[148].setRotationPoint(-2F, -24F, -1.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 248 extra stack
		bodyModel[149].setRotationPoint(13F, -24F, -1.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[150].setRotationPoint(-6F, -13F, 11.01F);

		bodyModel[151].addBox(0F, 0F, 0F, 4, 8, 2, 0F); // Box 86 control a
		bodyModel[151].setRotationPoint(-24F, -13F, 1F);
		bodyModel[151].rotateAngleY = -0.6981317F;

		bodyModel[152].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[152].setRotationPoint(-9F, 3F, -11F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[153].setRotationPoint(1F, 3F, -11F);

		bodyModel[154].addBox(0F, 0F, 0F, 10, 2, 22, 0F); // Box 280
		bodyModel[154].setRotationPoint(1F, 4F, -11F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[155].setRotationPoint(-9F, 6F, -11F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 283
		bodyModel[156].setRotationPoint(1F, 6F, 9F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[157].setRotationPoint(1F, 3F, 10F);

		bodyModel[158].addBox(0F, 0F, 0F, 10, 1, 20, 0F); // Box 286
		bodyModel[158].setRotationPoint(1F, 3F, -10F);

		bodyModel[159].addBox(0F, 0F, 0F, 10, 3, 18, 0F); // Box 287
		bodyModel[159].setRotationPoint(1F, 6F, -9F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 10, 3, 18, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[160].setRotationPoint(-9F, 6F, -9F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 10, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[161].setRotationPoint(-9F, 3F, -10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[162].setRotationPoint(-39F, -8F, -11.01F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[163].setRotationPoint(-39F, -8F, 11.01F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 292
		bodyModel[164].setRotationPoint(-14F, -20F, -7F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 293
		bodyModel[165].setRotationPoint(-11F, 3F, -9F);

		bodyModel[166].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 294
		bodyModel[166].setRotationPoint(-11F, 6F, -9F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 295
		bodyModel[167].setRotationPoint(-12F, 3F, -9F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 296
		bodyModel[168].setRotationPoint(-12F, 6F, -9F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[169].setRotationPoint(-10F, 6F, -9F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[170].setRotationPoint(-10F, 3F, -9F);

		bodyModel[171].addBox(0F, 0F, 0F, 18, 5, 1, 0F); // Box 299
		bodyModel[171].setRotationPoint(18F, -19F, -8F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 5, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[172].setRotationPoint(36F, -19F, -8F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[173].setRotationPoint(36F, -19F, 1F);

		bodyModel[174].addBox(0F, 0F, 0F, 18, 5, 1, 0F); // Box 302
		bodyModel[174].setRotationPoint(18F, -19F, 7F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 303 lamp upper gyralight rear
		bodyModel[175].setRotationPoint(40.25F, -20F, -1F);

		bodyModel[176].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 304 upper gyralight rear mount
		bodyModel[176].setRotationPoint(39F, -20F, -1F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 305 lamp upper gyralight rear
		bodyModel[177].setRotationPoint(40.25F, -18F, -1F);

		bodyModel[178].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 306 emergency gyralight rear mount
		bodyModel[178].setRotationPoint(39F, -22F, -1F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[179].setRotationPoint(37F, -22F, -1F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 308 emergency gyralight rear
		bodyModel[180].setRotationPoint(40.25F, -22F, -1F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 309 upper gyralight front
		bodyModel[181].setRotationPoint(-41.75F, -18F, -1F);

		bodyModel[182].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 310 upper gyralight front mount
		bodyModel[182].setRotationPoint(-41F, -20F, -1F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 311 upper gyralight front
		bodyModel[183].setRotationPoint(-41.75F, -20F, -1F);

		bodyModel[184].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 312 emergency gyralight front mount
		bodyModel[184].setRotationPoint(-41F, -22F, -1F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 313 emergency gyralight front
		bodyModel[185].setRotationPoint(-41.75F, -22F, -1F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[186].setRotationPoint(-39F, -22F, -1F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[187].setRotationPoint(-9F, 3F, 10F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[188].setRotationPoint(-9F, 6F, 9F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[189].setRotationPoint(-7F, -18.5F, -8.7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[190].setRotationPoint(-7F, -19.5F, -8.7F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[191].setRotationPoint(-6.75F, -18F, -8.45F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		bodyModel[192].setRotationPoint(-7F, -20.5F, -8.5F);

		bodyModel[193].addBox(0F, 0F, 0F, 8, 1, 5, 0F); // Box 323
		bodyModel[193].setRotationPoint(26.75F, -21F, -2.5F);

		bodyModel[194].addBox(0F, 0F, 0F, 8, 1, 5, 0F); // Box 324
		bodyModel[194].setRotationPoint(17.75F, -21F, -2.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[195].setRotationPoint(-41F, -21F, -0.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[196].setRotationPoint(-41F, -22F, -0.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[197].setRotationPoint(-40.75F, -20.5F, -0.25F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 877
		bodyModel[198].setRotationPoint(-40.75F, -22.5F, -1.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 332
		bodyModel[199].setRotationPoint(-40F, -22F, -1F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 333
		bodyModel[200].setRotationPoint(-40F, -22F, 1F);

		bodyModel[201].addBox(0F, 0F, 0F, 18, 1, 0, 0F); // Box 334
		bodyModel[201].setRotationPoint(18F, -21F, -6F);

		bodyModel[202].addBox(0F, 0F, 0F, 18, 1, 0, 0F); // Box 335
		bodyModel[202].setRotationPoint(18F, -21F, 6F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 13, 5, 0F); // Box 336 cull
		bodyModel[203].setRotationPoint(36.5F, -14F, -6F);
		bodyModel[203].rotateAngleY = -0.4712389F;

		bodyModel[204].addBox(0F, 0F, -5F, 1, 13, 5, 0F); // Box 337 cull
		bodyModel[204].setRotationPoint(36.5F, -14F, 6F);
		bodyModel[204].rotateAngleY = 0.4712389F;

		bodyModel[205].addBox(0F, 0F, 0F, 1, 13, 5, 0F); // Box 338 cull
		bodyModel[205].setRotationPoint(-39.5F, -14F, 2F);
		bodyModel[205].rotateAngleY = -0.4712389F;

		bodyModel[206].addBox(0F, 0F, -5F, 1, 13, 5, 0F); // Box 339 cull
		bodyModel[206].setRotationPoint(-39.5F, -14F, -2F);
		bodyModel[206].rotateAngleY = 0.4712389F;

		bodyModel[207].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 197
		bodyModel[207].setRotationPoint(-20.5F, -23.25F, 0F);

		bodyModel[208].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 198
		bodyModel[208].setRotationPoint(-19.5F, -23.25F, -1F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 199
		bodyModel[209].setRotationPoint(-19F, -22.25F, -1.5F);

		bodyModel[210].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 200
		bodyModel[210].setRotationPoint(-20F, -22.75F, -2F);

		bodyModel[211].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 201
		bodyModel[211].setRotationPoint(-19.5F, -22.75F, 1F);

		bodyModel[212].addBox(0F, 0F, 0F, 2, 5, 0, 0F); // Box 345
		bodyModel[212].setRotationPoint(-12F, 3F, -9.01F);

		bodyModel[213].addBox(0F, 0F, 0F, 2, 5, 0, 0F); // Box 346
		bodyModel[213].setRotationPoint(-12F, 3F, 9.01F);

		bodyModel[214].addBox(0F, 0F, 2F, 1, 2, 0, 0F); // Box 347
		bodyModel[214].setRotationPoint(-25F, -23.5F, -2F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 commander beacon
		bodyModel[215].setRotationPoint(-14.53F, -22.5F, -0.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[216].setRotationPoint(-14.37F, -22.5F, -0.5F);

		bodyModel[217].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 622
		bodyModel[217].setRotationPoint(20F, 3F, -1F);

		bodyModel[218].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 638
		bodyModel[218].setRotationPoint(28F, 3F, -1F);

		bodyModel[219].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 639
		bodyModel[219].setRotationPoint(-30F, 3F, -1F);

		bodyModel[220].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 640
		bodyModel[220].setRotationPoint(-22F, 3F, -1F);

		bodyModel[221].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 74
		bodyModel[221].setRotationPoint(-27F, -21.5F, -1F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 lamp
		bodyModel[222].setRotationPoint(-27.25F, -21.5F, -1F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 lamp
		bodyModel[223].setRotationPoint(-27.25F, -19.5F, -1F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		bodyModel[224].setRotationPoint(-27F, -19.5F, -7F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 645
		bodyModel[225].setRotationPoint(-27F, -21.5F, -7F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 646
		bodyModel[226].setRotationPoint(-26F, -21.5F, -2F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 647
		bodyModel[227].setRotationPoint(-27F, -21.5F, 1F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 648
		bodyModel[228].setRotationPoint(-27F, -19.5F, 1F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 649
		bodyModel[229].setRotationPoint(-26F, -21.5F, 1F);

		bodyModel[230].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 240
		bodyModel[230].setRotationPoint(-12F, -22F, -1F);

		bodyModel[231].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 241
		bodyModel[231].setRotationPoint(-10.5F, -22F, 0F);

		bodyModel[232].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 242
		bodyModel[232].setRotationPoint(-11.5F, -22F, 1F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 243
		bodyModel[233].setRotationPoint(-10F, -21F, -1F);

		bodyModel[234].addBox(0F, 0F, 2F, 3, 1, 0, 0F); // Box 262
		bodyModel[234].setRotationPoint(-23F, -22.5F, -2F);

		bodyModel[235].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 203
		bodyModel[235].setRotationPoint(-8F, -22F, 3F);

		bodyModel[236].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 204
		bodyModel[236].setRotationPoint(-8F, -21F, 3F);

		bodyModel[237].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 205
		bodyModel[237].setRotationPoint(-33F, -21F, 3F);

		bodyModel[238].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 206
		bodyModel[238].setRotationPoint(-35F, -22F, 3F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 267
		bodyModel[239].setRotationPoint(-26.32F, -22.5F, -0.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 268 commander beacon
		bodyModel[240].setRotationPoint(-26.45F, -22.5F, -0.5F);

		bodyModel[241].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 269
		bodyModel[241].setRotationPoint(-32F, -21F, 0F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[242].setRotationPoint(-6F, -22F, -0.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[243].setRotationPoint(-6F, -23F, -0.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 75
		bodyModel[244].setRotationPoint(-5.75F, -24F, -1.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[245].setRotationPoint(-5.75F, -24F, -2F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 77
		bodyModel[246].setRotationPoint(-5.75F, -24F, 1F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[247].setRotationPoint(-5.75F, -21.5F, -0.25F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[248].setRotationPoint(7.5F, -24F, -2F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[249].setRotationPoint(7.25F, -23F, -0.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 278
		bodyModel[250].setRotationPoint(7.5F, -21.5F, -0.25F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 279
		bodyModel[251].setRotationPoint(7.25F, -22F, -0.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 280
		bodyModel[252].setRotationPoint(7.5F, -24F, 1F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 281
		bodyModel[253].setRotationPoint(7.5F, -24F, -1.5F);

		bodyModel[254].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 389
		bodyModel[254].setRotationPoint(-11F, -22F, 4F);

		bodyModel[255].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 390
		bodyModel[255].setRotationPoint(-11F, -22F, 4F);

		bodyModel[256].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 391
		bodyModel[256].setRotationPoint(-11F, -22F, 6F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 commander beacon
		bodyModel[257].setRotationPoint(-10.45F, -24F, 4.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[258].setRotationPoint(-10.32F, -23F, 4.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 287
		bodyModel[259].setRotationPoint(-34.32F, -21F, -0.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 288 commander beacon
		bodyModel[260].setRotationPoint(-34.45F, -21F, -0.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 131 control a
		bodyModel[261].setRotationPoint(-19F, -12F, -1F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 131 control a
		bodyModel[262].setRotationPoint(-19.5F, -10F, -1.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131 control a
		bodyModel[263].setRotationPoint(-22F, -11.5F, 5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131 control a
		bodyModel[264].setRotationPoint(-23F, -11.5F, 4F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131 control a
		bodyModel[265].setRotationPoint(-24F, -11.5F, 5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131 control a
		bodyModel[266].setRotationPoint(-22F, -11.5F, 4F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 131 control a
		bodyModel[267].setRotationPoint(-22F, -11.5F, 6F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131 control a
		bodyModel[268].setRotationPoint(-24F, -11.5F, 4F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 131 control a
		bodyModel[269].setRotationPoint(-24F, -11.5F, 6F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F); // Box 131 control a
		bodyModel[270].setRotationPoint(-23.5F, -13.5F, 4.5F);

		bodyModel[271].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 357 glow marker
		bodyModel[271].setRotationPoint(-37.5F, -19F, -6.01F);

		bodyModel[272].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 357 glow marker
		bodyModel[272].setRotationPoint(-37.5F, -19F, 6.01F);

		bodyModel[273].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 357 glow marker
		bodyModel[273].setRotationPoint(36.5F, -19F, -7.01F);

		bodyModel[274].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 357 glow marker
		bodyModel[274].setRotationPoint(36.5F, -19F, 7.01F);

		bodyModel[275].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 363 numberboard
		bodyModel[275].setRotationPoint(-36.55F, -17.5F, -6F);
		bodyModel[275].rotateAngleY = 0.4712389F;

		bodyModel[276].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 364 numberboard
		bodyModel[276].setRotationPoint(-36.55F, -17.5F, 6F);
		bodyModel[276].rotateAngleY = -0.4712389F;

		bodyModel[277].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 115 numberboard
		bodyModel[277].setRotationPoint(36.95F, -17.5F, -6F);
		bodyModel[277].rotateAngleY = -0.41887902F;

		bodyModel[278].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 116 numberboard
		bodyModel[278].setRotationPoint(36.95F, -17.5F, 6F);
		bodyModel[278].rotateAngleY = 0.41887902F;

		bodyModel[279].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 363 numberboard
		bodyModel[279].setRotationPoint(-25.35F, -19.5F, -6F);
		bodyModel[279].rotateAngleY = 0.32288591F;

		bodyModel[280].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 364 numberboard
		bodyModel[280].setRotationPoint(-25.4F, -19.5F, 6F);
		bodyModel[280].rotateAngleY = -0.31415927F;

		bodyModel[281].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 357 glow marker
		bodyModel[281].setRotationPoint(-37.5F, -12F, -6.01F);

		bodyModel[282].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 357 glow marker
		bodyModel[282].setRotationPoint(-37.5F, -12F, 6.01F);

		bodyModel[283].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 203
		bodyModel[283].setRotationPoint(-10F, -22F, -4F);

		bodyModel[284].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 204
		bodyModel[284].setRotationPoint(-8F, -21F, -4F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[285].setRotationPoint(40F, -21F, -0.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[286].setRotationPoint(40F, -22F, -0.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[287].setRotationPoint(40.25F, -20.5F, -0.25F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 877
		bodyModel[288].setRotationPoint(40.25F, -22.5F, -1.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 332
		bodyModel[289].setRotationPoint(38F, -22F, -1F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 333
		bodyModel[290].setRotationPoint(38F, -22F, 1F);

		bodyModel[291].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 197
		bodyModel[291].setRotationPoint(15.5F, -24F, 0.5F);

		bodyModel[292].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 198
		bodyModel[292].setRotationPoint(15.5F, -24F, -1.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 199
		bodyModel[293].setRotationPoint(15.5F, -23F, -1.5F);

		bodyModel[294].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 197
		bodyModel[294].setRotationPoint(13.5F, -24F, -0.5F);

		bodyModel[295].addBox(0F, 0F, 0F, 0, 1, 14, 0F); // Box 226
		bodyModel[295].setRotationPoint(-42F, 8F, -7F);

		bodyModel[296].addBox(0F, 0F, 0F, 0, 1, 14, 0F); // Box 321
		bodyModel[296].setRotationPoint(42F, 8F, -7F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[297].setRotationPoint(18F, -20F, -8F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[298].setRotationPoint(36F, -20F, -8F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[299].setRotationPoint(18F, -20F, 7F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[300].setRotationPoint(36F, -20F, 1F);

		bodyModel[301].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 326
		bodyModel[301].setRotationPoint(-37.5F, -19F, -6F);

		bodyModel[302].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 327
		bodyModel[302].setRotationPoint(42F, -1.01F, -2F);

		bodyModel[303].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 328
		bodyModel[303].setRotationPoint(-44F, -1.01F, -2F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[304].setRotationPoint(42F, 8F, -9F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 331
		bodyModel[305].setRotationPoint(42F, 8F, 7F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 332
		bodyModel[306].setRotationPoint(-42F, 8F, 7F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[307].setRotationPoint(-42F, 8F, -9F);

		bodyModel[308].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 334
		bodyModel[308].setRotationPoint(-31F, -22F, 0F);

		bodyModel[309].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 335
		bodyModel[309].setRotationPoint(-43F, -1F, -3F);

		bodyModel[310].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 336
		bodyModel[310].setRotationPoint(42F, -1F, -3F);

		bodyModel[311].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 337
		bodyModel[311].setRotationPoint(38F, 2F, 7F);

		bodyModel[312].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 338
		bodyModel[312].setRotationPoint(-42F, 2F, 7F);

		bodyModel[313].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 339
		bodyModel[313].setRotationPoint(-42F, 3F, 7F);

		bodyModel[314].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 340
		bodyModel[314].setRotationPoint(-42F, 4.5F, 7F);

		bodyModel[315].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 341
		bodyModel[315].setRotationPoint(-42F, 5.5F, 7F);

		bodyModel[316].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 342
		bodyModel[316].setRotationPoint(-42F, 7F, 8F);

		bodyModel[317].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 343
		bodyModel[317].setRotationPoint(-42F, 8F, 8F);

		bodyModel[318].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 344
		bodyModel[318].setRotationPoint(-42F, 0.5F, 7F);

		bodyModel[319].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 345
		bodyModel[319].setRotationPoint(-42F, 7F, -8F);

		bodyModel[320].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 346
		bodyModel[320].setRotationPoint(-42F, 8F, -11F);

		bodyModel[321].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 347
		bodyModel[321].setRotationPoint(-42F, 5.5F, -10F);

		bodyModel[322].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 348
		bodyModel[322].setRotationPoint(-42F, 4.5F, -7F);

		bodyModel[323].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 349
		bodyModel[323].setRotationPoint(-42F, 3F, -9F);

		bodyModel[324].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 350
		bodyModel[324].setRotationPoint(-42F, 0.5F, -8F);

		bodyModel[325].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 351
		bodyModel[325].setRotationPoint(38F, 2F, -7F);

		bodyModel[326].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 352
		bodyModel[326].setRotationPoint(-42F, 2F, -7F);

		bodyModel[327].addBox(0F, 0F, 0F, 1, 0, 16, 0F); // Box 353
		bodyModel[327].setRotationPoint(-43F, -1.01F, -8F);

		bodyModel[328].addBox(0F, 0F, 0F, 1, 0, 16, 0F); // Box 354
		bodyModel[328].setRotationPoint(42F, -1.01F, -8F);

		bodyModel[329].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 355
		bodyModel[329].setRotationPoint(-27F, -11F, 7F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -2F, 0F, -1.75F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 122
		bodyModel[330].setRotationPoint(-24F, -17F, 11F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,-1.75F, -2F, 0F, -1.75F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 123
		bodyModel[331].setRotationPoint(-23F, -17F, -12F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[332].setRotationPoint(-44F, -1F, -7F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 269
		bodyModel[333].setRotationPoint(-44F, -1F, 0F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 344
		bodyModel[334].setRotationPoint(43F, -1F, 0F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 345
		bodyModel[335].setRotationPoint(43F, -1F, -7F);

		bodyModel[336].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 346
		bodyModel[336].setRotationPoint(-39.5F, -16F, -1F);

		bodyModel[337].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 347
		bodyModel[337].setRotationPoint(-39.5F, -10F, -1F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight front 3
		bodyModel[338].setRotationPoint(-40.25F, -14F, -1F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight front 4
		bodyModel[339].setRotationPoint(-40.25F, -12F, -1F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight front 5
		bodyModel[340].setRotationPoint(-40.25F, -10F, -1F);

		bodyModel[341].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 351
		bodyModel[341].setRotationPoint(38.5F, -16F, -1F);

		bodyModel[342].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 352
		bodyModel[342].setRotationPoint(38.5F, -18F, -1F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 353 headlight rear 1
		bodyModel[343].setRotationPoint(39.25F, -18F, -1F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 354 headlight rear 2
		bodyModel[344].setRotationPoint(39.25F, -16F, -1F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 355 headlight rear 3
		bodyModel[345].setRotationPoint(39.25F, -14F, -1F);

		bodyModel[346].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 356
		bodyModel[346].setRotationPoint(38.5F, -14F, -1F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 357 headlight rear 4
		bodyModel[347].setRotationPoint(39.25F, -12F, -1F);

		bodyModel[348].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 358
		bodyModel[348].setRotationPoint(38.5F, -12F, -1F);

		bodyModel[349].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 359
		bodyModel[349].setRotationPoint(38.5F, -10F, -1F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 360 headlight rear 5
		bodyModel[350].setRotationPoint(39.25F, -10F, -1F);

		bodyModel[351].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 361
		bodyModel[351].setRotationPoint(13.5F, -22F, -6F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 362
		bodyModel[352].setRotationPoint(14F, -21F, -7F);

		bodyModel[353].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 363
		bodyModel[353].setRotationPoint(12.5F, -22F, -5F);

		bodyModel[354].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 364
		bodyModel[354].setRotationPoint(12F, -22F, -7F);

		bodyModel[355].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 176 glow marker
		bodyModel[355].setRotationPoint(-36.9F, -11.5F, 5.5F);
		bodyModel[355].rotateAngleY = -0.43633231F;

		bodyModel[356].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 176 glow marker
		bodyModel[356].setRotationPoint(-36.9F, -11.5F, -5.5F);
		bodyModel[356].rotateAngleY = 0.43633231F;

		bodyModel[357].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 412
		bodyModel[357].setRotationPoint(-24F, -13F, 3F);

		bodyModel[358].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413
		bodyModel[358].setRotationPoint(-25.1F, -12F, 1F);
		bodyModel[358].rotateAngleY = -0.38397244F;

		bodyModel[359].addShapeBox(-0.5F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[359].setRotationPoint(-23.5F, -14F, 1F);
		bodyModel[359].rotateAngleY = -0.38397244F;

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[360].setRotationPoint(-43F, -4F, -5.75F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f u
		bodyModel[361].setRotationPoint(-43.25F, -4F, -5.75F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f u
		bodyModel[362].setRotationPoint(-43.25F, -4F, 3.75F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[363].setRotationPoint(-43F, -4F, 3.75F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 314
		bodyModel[364].setRotationPoint(42F, -4F, -5.75F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 315 ditchlight r u
		bodyModel[365].setRotationPoint(42.25F, -4F, -5.75F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 318
		bodyModel[366].setRotationPoint(42F, -4F, 3.75F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 319 ditchlight r u
		bodyModel[367].setRotationPoint(42.25F, -4F, 3.75F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[368].setRotationPoint(-22F, -16F, 10F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[369].setRotationPoint(-22F, -17F, 10F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[370].setRotationPoint(-23F, -21.5F, 7.5F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[371].setRotationPoint(-23F, -21.5F, 7.5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[372].setRotationPoint(-23F, -21.5F, 7.5F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[373].setRotationPoint(-23F, -21.5F, 7.5F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull
		bodyModel[374].setRotationPoint(-23.5F, -20F, 7F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[375].setRotationPoint(-23F, -21F, 7.5F);
	}
	ModelFlexicoil_C1 theTrucc = new ModelFlexicoil_C1();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 376; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
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

		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 15||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 0) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c1_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.63, 0.0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.12, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 6) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Flexi_C1_bnsf_h1.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.63, 0.0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.12, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c1_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.63, -0.0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.12, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}

	}
	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{0.75D, 1.4D, 0.0D});
				add(new double[]{1.65D, 1.4D, 0.0D});
			}
		};
	}
}