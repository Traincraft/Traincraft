//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 22.08.2020 - 22:31:05
// Last changed on: 22.08.2020 - 22:31:05

package train.client.render.models; //Path where the model is located


import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;
import fexcraft.tmt.slim.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

import java.util.ArrayList;

public class ModelC415S extends ModelConverter //Same as Filename
{
    int textureX = 512;
    int textureY = 256;

    public ModelC415S() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[347];

        initbodyModel_1();

        translateAll(0F, 0F, 0F);


        flipAll();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 389, 201, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 371, 196, textureX, textureY); // Box 2
        bodyModel[2] = new ModelRendererTurbo(this, 52, 126, textureX, textureY); // Box 2
        bodyModel[3] = new ModelRendererTurbo(this, 339, 236, textureX, textureY); // Box 0
        bodyModel[4] = new ModelRendererTurbo(this, 389, 201, textureX, textureY); // Box 26
        bodyModel[5] = new ModelRendererTurbo(this, 371, 196, textureX, textureY); // Box 27
        bodyModel[6] = new ModelRendererTurbo(this, 319, 218, textureX, textureY); // Box 52
        bodyModel[7] = new ModelRendererTurbo(this, 326, 236, textureX, textureY); // Box 66
        bodyModel[8] = new ModelRendererTurbo(this, 326, 212, textureX, textureY); // Box 67
        bodyModel[9] = new ModelRendererTurbo(this, 359, 191, textureX, textureY); // Box 115
        bodyModel[10] = new ModelRendererTurbo(this, 359, 191, textureX, textureY); // Box 141
        bodyModel[11] = new ModelRendererTurbo(this, 339, 212, textureX, textureY); // Box 206
        bodyModel[12] = new ModelRendererTurbo(this, 218, 145, textureX, textureY); // Box 490
        bodyModel[13] = new ModelRendererTurbo(this, 245, 125, textureX, textureY); // Box 502
        bodyModel[14] = new ModelRendererTurbo(this, 254, 119, textureX, textureY); // Box 503
        bodyModel[15] = new ModelRendererTurbo(this, 249, 147, textureX, textureY); // Box 504
        bodyModel[16] = new ModelRendererTurbo(this, 228, 119, textureX, textureY); // Box 156
        bodyModel[17] = new ModelRendererTurbo(this, 270, 122, textureX, textureY); // Box 158
        bodyModel[18] = new ModelRendererTurbo(this, 266, 125, textureX, textureY); // Box 159
        bodyModel[19] = new ModelRendererTurbo(this, 218, 125, textureX, textureY); // Box 160
        bodyModel[20] = new ModelRendererTurbo(this, 222, 122, textureX, textureY); // Box 161
        bodyModel[21] = new ModelRendererTurbo(this, 246, 120, textureX, textureY, "lamp"); // Box 162 headlight r
        bodyModel[22] = new ModelRendererTurbo(this, 246, 120, textureX, textureY, "lamp"); // Box 163 headlight r
        bodyModel[23] = new ModelRendererTurbo(this, 436, 169, textureX, textureY); // Box 178 tank main
        bodyModel[24] = new ModelRendererTurbo(this, 358, 201, textureX, textureY); // Box 201
        bodyModel[25] = new ModelRendererTurbo(this, 479, 179, textureX, textureY); // Box 202
        bodyModel[26] = new ModelRendererTurbo(this, 370, 147, textureX, textureY); // Box 224
        bodyModel[27] = new ModelRendererTurbo(this, 318, 132, textureX, textureY); // Box 225
        bodyModel[28] = new ModelRendererTurbo(this, 456, 97, textureX, textureY); // Box 228
        bodyModel[29] = new ModelRendererTurbo(this, 490, 179, textureX, textureY); // Box 237
        bodyModel[30] = new ModelRendererTurbo(this, 331, 185, textureX, textureY); // Box 245 j1
        bodyModel[31] = new ModelRendererTurbo(this, 331, 185, textureX, textureY); // Box 250 j1
        bodyModel[32] = new ModelRendererTurbo(this, 479, 171, textureX, textureY); // Box 560
        bodyModel[33] = new ModelRendererTurbo(this, 425, 171, textureX, textureY); // Box 562
        bodyModel[34] = new ModelRendererTurbo(this, 450, 164, textureX, textureY); // Box 564 tank extra1
        bodyModel[35] = new ModelRendererTurbo(this, 450, 159, textureX, textureY); // Box 569 tank extra 1
        bodyModel[36] = new ModelRendererTurbo(this, 448, 99, textureX, textureY); // Box 682
        bodyModel[37] = new ModelRendererTurbo(this, 448, 110, textureX, textureY); // Box 708
        bodyModel[38] = new ModelRendererTurbo(this, 490, 110, textureX, textureY); // Box 709
        bodyModel[39] = new ModelRendererTurbo(this, 434, 132, textureX, textureY, "lamp"); // Box 359 ditchlight fl
        bodyModel[40] = new ModelRendererTurbo(this, 441, 132, textureX, textureY, "cull"); // Box 360 cull
        bodyModel[41] = new ModelRendererTurbo(this, 434, 97, textureX, textureY, "lamp"); // Box 272 ditchlight r
        bodyModel[42] = new ModelRendererTurbo(this, 441, 97, textureX, textureY, "cull"); // Box 273 cull
        bodyModel[43] = new ModelRendererTurbo(this, 358, 201, textureX, textureY); // Box 318
        bodyModel[44] = new ModelRendererTurbo(this, 441, 132, textureX, textureY, "cull"); // Box 320 cull
        bodyModel[45] = new ModelRendererTurbo(this, 434, 132, textureX, textureY, "lamp"); // Box 321 ditchlight fl
        bodyModel[46] = new ModelRendererTurbo(this, 441, 97, textureX, textureY, "cull"); // Box 322 cull
        bodyModel[47] = new ModelRendererTurbo(this, 434, 97, textureX, textureY, "lamp"); // Box 323 ditchlight r
        bodyModel[48] = new ModelRendererTurbo(this, 359, 191, textureX, textureY); // Box 324
        bodyModel[49] = new ModelRendererTurbo(this, 359, 191, textureX, textureY); // Box 325
        bodyModel[50] = new ModelRendererTurbo(this, 324, 238, textureX, textureY); // Box 401
        bodyModel[51] = new ModelRendererTurbo(this, 53, 122, textureX, textureY); // Box 404
        bodyModel[52] = new ModelRendererTurbo(this, 49, 125, textureX, textureY); // Box 405
        bodyModel[53] = new ModelRendererTurbo(this, 28, 125, textureX, textureY); // Box 406
        bodyModel[54] = new ModelRendererTurbo(this, 11, 119, textureX, textureY); // Box 409
        bodyModel[55] = new ModelRendererTurbo(this, 37, 119, textureX, textureY); // Box 410
        bodyModel[56] = new ModelRendererTurbo(this, 29, 120, textureX, textureY, "lamp"); // Box 411 headlight f
        bodyModel[57] = new ModelRendererTurbo(this, 29, 120, textureX, textureY, "lamp"); // Box 412 headlight f
        bodyModel[58] = new ModelRendererTurbo(this, 165, 126, textureX, textureY); // Box 938
        bodyModel[59] = new ModelRendererTurbo(this, 127, 239, textureX, textureY); // Box 939
        bodyModel[60] = new ModelRendererTurbo(this, 2, 224, textureX, textureY); // Box 940
        bodyModel[61] = new ModelRendererTurbo(this, 203, 239, textureX, textureY); // Box 944
        bodyModel[62] = new ModelRendererTurbo(this, 109, 203, textureX, textureY); // Box 945
        bodyModel[63] = new ModelRendererTurbo(this, 119, 220, textureX, textureY); // Box 946
        bodyModel[64] = new ModelRendererTurbo(this, 119, 196, textureX, textureY); // Box 947
        bodyModel[65] = new ModelRendererTurbo(this, 114, 219, textureX, textureY); // Box 1150
        bodyModel[66] = new ModelRendererTurbo(this, 104, 202, textureX, textureY); // Box 1151
        bodyModel[67] = new ModelRendererTurbo(this, 192, 236, textureX, textureY); // Box 314 door swing right
        bodyModel[68] = new ModelRendererTurbo(this, 116, 236, textureX, textureY); // Box 315 door swing right
        bodyModel[69] = new ModelRendererTurbo(this, 150, 236, textureX, textureY); // Box 1158
        bodyModel[70] = new ModelRendererTurbo(this, 74, 236, textureX, textureY); // Box 1159
        bodyModel[71] = new ModelRendererTurbo(this, 85, 224, textureX, textureY); // Box 1510
        bodyModel[72] = new ModelRendererTurbo(this, 117, 230, textureX, textureY); // Box 1511 door swing right
        bodyModel[73] = new ModelRendererTurbo(this, 151, 230, textureX, textureY); // Box 1512
        bodyModel[74] = new ModelRendererTurbo(this, 161, 224, textureX, textureY); // Box 1513
        bodyModel[75] = new ModelRendererTurbo(this, 193, 230, textureX, textureY); // Box 1514 door swing right
        bodyModel[76] = new ModelRendererTurbo(this, 75, 230, textureX, textureY); // Box 1515
        bodyModel[77] = new ModelRendererTurbo(this, 6, 147, textureX, textureY); // Box 1516
        bodyModel[78] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 1517
        bodyModel[79] = new ModelRendererTurbo(this, 22, 133, textureX, textureY); // Box 1518
        bodyModel[80] = new ModelRendererTurbo(this, 43, 140, textureX, textureY); // Box 1519
        bodyModel[81] = new ModelRendererTurbo(this, 25, 138, textureX, textureY, "lamp"); // Box 1521 markerlight
        bodyModel[82] = new ModelRendererTurbo(this, 25, 138, textureX, textureY, "lamp"); // Box 1522 markerlight
        bodyModel[83] = new ModelRendererTurbo(this, 239, 133, textureX, textureY); // Box 1523
        bodyModel[84] = new ModelRendererTurbo(this, 252, 138, textureX, textureY, "lamp"); // Box 1526 markerlight
        bodyModel[85] = new ModelRendererTurbo(this, 252, 138, textureX, textureY, "lamp"); // Box 1527 markerlight
        bodyModel[86] = new ModelRendererTurbo(this, 425, 178, textureX, textureY); // Box 1528
        bodyModel[87] = new ModelRendererTurbo(this, 123, 104, textureX, textureY); // Box 1529
        bodyModel[88] = new ModelRendererTurbo(this, 113, 114, textureX, textureY); // Box 1530
        bodyModel[89] = new ModelRendererTurbo(this, 104, 115, textureX, textureY); // Box 1534
        bodyModel[90] = new ModelRendererTurbo(this, 70, 106, textureX, textureY); // Box 1535
        bodyModel[91] = new ModelRendererTurbo(this, 66, 120, textureX, textureY); // Box 1536
        bodyModel[92] = new ModelRendererTurbo(this, 45, 132, textureX, textureY, "lamp"); // Box 1537 gyralight FL
        bodyModel[93] = new ModelRendererTurbo(this, 35, 132, textureX, textureY, "lamp"); // Box 1538 gyralight FL
        bodyModel[94] = new ModelRendererTurbo(this, 123, 126, textureX, textureY); // Box 1540
        bodyModel[95] = new ModelRendererTurbo(this, 21, 145, textureX, textureY); // Box 192
        bodyModel[96] = new ModelRendererTurbo(this, 30, 145, textureX, textureY, "lamp"); // Box 193 sp gyralight FU
        bodyModel[97] = new ModelRendererTurbo(this, 252, 145, textureX, textureY); // Box 194
        bodyModel[98] = new ModelRendererTurbo(this, 245, 145, textureX, textureY, "lamp"); // Box 195 sp gyralight RU
        bodyModel[99] = new ModelRendererTurbo(this, 230, 132, textureX, textureY, "lamp"); // Box 196 gyralight RL
        bodyModel[100] = new ModelRendererTurbo(this, 240, 132, textureX, textureY, "lamp"); // Box 197 gyralight RL
        bodyModel[101] = new ModelRendererTurbo(this, 323, 237, textureX, textureY); // Box 198
        bodyModel[102] = new ModelRendererTurbo(this, 323, 213, textureX, textureY); // Box 199
        bodyModel[103] = new ModelRendererTurbo(this, 324, 214, textureX, textureY); // Box 200
        bodyModel[104] = new ModelRendererTurbo(this, 479, 213, textureX, textureY); // Box 215
        bodyModel[105] = new ModelRendererTurbo(this, 472, 214, textureX, textureY); // Box 216
        bodyModel[106] = new ModelRendererTurbo(this, 479, 237, textureX, textureY); // Box 221
        bodyModel[107] = new ModelRendererTurbo(this, 472, 238, textureX, textureY); // Box 225
        bodyModel[108] = new ModelRendererTurbo(this, 466, 236, textureX, textureY); // Box 228
        bodyModel[109] = new ModelRendererTurbo(this, 466, 212, textureX, textureY); // Box 230
        bodyModel[110] = new ModelRendererTurbo(this, 456, 62, textureX, textureY); // Box 232
        bodyModel[111] = new ModelRendererTurbo(this, 448, 75, textureX, textureY); // Box 233
        bodyModel[112] = new ModelRendererTurbo(this, 490, 75, textureX, textureY); // Box 234
        bodyModel[113] = new ModelRendererTurbo(this, 490, 83, textureX, textureY); // Box 235
        bodyModel[114] = new ModelRendererTurbo(this, 448, 83, textureX, textureY); // Box 236
        bodyModel[115] = new ModelRendererTurbo(this, 158, 208, textureX, textureY); // Box 237
        bodyModel[116] = new ModelRendererTurbo(this, 318, 147, textureX, textureY); // Box 238
        bodyModel[117] = new ModelRendererTurbo(this, 305, 146, textureX, textureY); // Box 249
        bodyModel[118] = new ModelRendererTurbo(this, 308, 144, textureX, textureY); // Box 250
        bodyModel[119] = new ModelRendererTurbo(this, 233, 133, textureX, textureY); // Box 241 sp light mount
        bodyModel[120] = new ModelRendererTurbo(this, 38, 133, textureX, textureY); // Box 242 sp light mount
        bodyModel[121] = new ModelRendererTurbo(this, 364, 147, textureX, textureY); // Box 351
        bodyModel[122] = new ModelRendererTurbo(this, 384, 132, textureX, textureY); // Box 361
        bodyModel[123] = new ModelRendererTurbo(this, 305, 131, textureX, textureY); // Box 362
        bodyModel[124] = new ModelRendererTurbo(this, 308, 129, textureX, textureY); // Box 363
        bodyModel[125] = new ModelRendererTurbo(this, 490, 118, textureX, textureY); // Box 364
        bodyModel[126] = new ModelRendererTurbo(this, 448, 64, textureX, textureY); // Box 365
        bodyModel[127] = new ModelRendererTurbo(this, 412, 144, textureX, textureY); // Box 366
        bodyModel[128] = new ModelRendererTurbo(this, 419, 146, textureX, textureY); // Box 367
        bodyModel[129] = new ModelRendererTurbo(this, 412, 129, textureX, textureY); // Box 370
        bodyModel[130] = new ModelRendererTurbo(this, 419, 131, textureX, textureY); // Box 371
        bodyModel[131] = new ModelRendererTurbo(this, 315, 147, textureX, textureY); // Box 372
        bodyModel[132] = new ModelRendererTurbo(this, 315, 132, textureX, textureY); // Box 373
        bodyModel[133] = new ModelRendererTurbo(this, 409, 132, textureX, textureY); // Box 374
        bodyModel[134] = new ModelRendererTurbo(this, 409, 147, textureX, textureY); // Box 375
        bodyModel[135] = new ModelRendererTurbo(this, 266, 241, textureX, textureY); // Box 376
        bodyModel[136] = new ModelRendererTurbo(this, 104, 120, textureX, textureY); // Box 377
        bodyModel[137] = new ModelRendererTurbo(this, 256, 237, textureX, textureY); // Box 380
        bodyModel[138] = new ModelRendererTurbo(this, 256, 231, textureX, textureY); // Box 381
        bodyModel[139] = new ModelRendererTurbo(this, 256, 234, textureX, textureY); // Box 382
        bodyModel[140] = new ModelRendererTurbo(this, 251, 234, textureX, textureY); // Box 383
        bodyModel[141] = new ModelRendererTurbo(this, 163, 209, textureX, textureY); // Box 384
        bodyModel[142] = new ModelRendererTurbo(this, 448, 118, textureX, textureY); // Box 385
        bodyModel[143] = new ModelRendererTurbo(this, 86, 201, textureX, textureY); // Box 386
        bodyModel[144] = new ModelRendererTurbo(this, 58, 201, textureX, textureY); // Box 387
        bodyModel[145] = new ModelRendererTurbo(this, 57, 136, textureX, textureY); // Box 143
        bodyModel[146] = new ModelRendererTurbo(this, 217, 136, textureX, textureY); // Box 389
        bodyModel[147] = new ModelRendererTurbo(this, 65, 204, textureX, textureY, "cull"); // Box WW F1T cull
        bodyModel[148] = new ModelRendererTurbo(this, 63, 209, textureX, textureY, "cull"); // Box 311 WW F1B cull
        bodyModel[149] = new ModelRendererTurbo(this, 168, 120, textureX, textureY); // Box 392
        bodyModel[150] = new ModelRendererTurbo(this, 168, 120, textureX, textureY); // Box 393
        bodyModel[151] = new ModelRendererTurbo(this, 86, 209, textureX, textureY, "cull"); // Box 395 WW E1B cull
        bodyModel[152] = new ModelRendererTurbo(this, 88, 204, textureX, textureY, "cull"); // Box 396 WW E1T cull
        bodyModel[153] = new ModelRendererTurbo(this, 240, 215, textureX, textureY); // Box 397
        bodyModel[154] = new ModelRendererTurbo(this, 240, 212, textureX, textureY); // Box 398
        bodyModel[155] = new ModelRendererTurbo(this, 235, 214, textureX, textureY); // Box 399
        bodyModel[156] = new ModelRendererTurbo(this, 502, 181, textureX, textureY); // Box 114
        bodyModel[157] = new ModelRendererTurbo(this, 502, 178, textureX, textureY); // Box 74
        bodyModel[158] = new ModelRendererTurbo(this, 502, 184, textureX, textureY); // Box 78
        bodyModel[159] = new ModelRendererTurbo(this, 474, 132, textureX, textureY); // Box 403
        bodyModel[160] = new ModelRendererTurbo(this, 450, 132, textureX, textureY); // Box 404
        bodyModel[161] = new ModelRendererTurbo(this, 477, 131, textureX, textureY); // Box 405
        bodyModel[162] = new ModelRendererTurbo(this, 443, 131, textureX, textureY); // Box 406
        bodyModel[163] = new ModelRendererTurbo(this, 460, 135, textureX, textureY); // Box 407
        bodyModel[164] = new ModelRendererTurbo(this, 474, 135, textureX, textureY); // Box 408
        bodyModel[165] = new ModelRendererTurbo(this, 230, 251, textureX, textureY); // Box 364 prime base
        bodyModel[166] = new ModelRendererTurbo(this, 230, 247, textureX, textureY, "lamp"); // Box 6 PRIME1-1
        bodyModel[167] = new ModelRendererTurbo(this, 230, 247, textureX, textureY, "lamp"); // Box 7 PRIME1-3
        bodyModel[168] = new ModelRendererTurbo(this, 230, 247, textureX, textureY, "lamp"); // Box 8 PRIME1-2
        bodyModel[169] = new ModelRendererTurbo(this, 230, 247, textureX, textureY, "lamp"); // Box 9 PRIME1-4
        bodyModel[170] = new ModelRendererTurbo(this, 443, 96, textureX, textureY); // Box 242
        bodyModel[171] = new ModelRendererTurbo(this, 450, 97, textureX, textureY); // Box 243
        bodyModel[172] = new ModelRendererTurbo(this, 460, 100, textureX, textureY); // Box 244
        bodyModel[173] = new ModelRendererTurbo(this, 474, 100, textureX, textureY); // Box 245
        bodyModel[174] = new ModelRendererTurbo(this, 477, 96, textureX, textureY); // Box 246
        bodyModel[175] = new ModelRendererTurbo(this, 474, 97, textureX, textureY); // Box 247
        bodyModel[176] = new ModelRendererTurbo(this, 441, 126, textureX, textureY); // Box 101
        bodyModel[177] = new ModelRendererTurbo(this, 441, 126, textureX, textureY); // Box 252
        bodyModel[178] = new ModelRendererTurbo(this, 434, 127, textureX, textureY, "lamp"); // Box 189 ditchlight fu
        bodyModel[179] = new ModelRendererTurbo(this, 434, 127, textureX, textureY, "lamp"); // Box 190 ditchlight fu
        bodyModel[180] = new ModelRendererTurbo(this, 441, 91, textureX, textureY); // Box 252
        bodyModel[181] = new ModelRendererTurbo(this, 434, 92, textureX, textureY, "lamp"); // Box 253 ditchlight r
        bodyModel[182] = new ModelRendererTurbo(this, 441, 91, textureX, textureY); // Box 254
        bodyModel[183] = new ModelRendererTurbo(this, 434, 92, textureX, textureY, "lamp"); // Box 255 ditchlight r
        bodyModel[184] = new ModelRendererTurbo(this, 98, 112, textureX, textureY); // Box 114
        bodyModel[185] = new ModelRendererTurbo(this, 98, 109, textureX, textureY); // Box 74
        bodyModel[186] = new ModelRendererTurbo(this, 98, 115, textureX, textureY); // Box 78
        bodyModel[187] = new ModelRendererTurbo(this, 91, 114, textureX, textureY); // Box 113
        bodyModel[188] = new ModelRendererTurbo(this, 90, 113, textureX, textureY); // Box 114
        bodyModel[189] = new ModelRendererTurbo(this, 90, 113, textureX, textureY); // Box 115
        bodyModel[190] = new ModelRendererTurbo(this, 91, 109, textureX, textureY); // Box 116
        bodyModel[191] = new ModelRendererTurbo(this, 93, 120, textureX, textureY); // Box 117
        bodyModel[192] = new ModelRendererTurbo(this, 240, 222, textureX, textureY); // Box 264
        bodyModel[193] = new ModelRendererTurbo(this, 235, 222, textureX, textureY); // Box 265
        bodyModel[194] = new ModelRendererTurbo(this, 240, 225, textureX, textureY); // Box 266
        bodyModel[195] = new ModelRendererTurbo(this, 240, 219, textureX, textureY); // Box 267
        bodyModel[196] = new ModelRendererTurbo(this, 256, 225, textureX, textureY); // Box 268
        bodyModel[197] = new ModelRendererTurbo(this, 256, 222, textureX, textureY); // Box 269
        bodyModel[198] = new ModelRendererTurbo(this, 256, 219, textureX, textureY); // Box 271
        bodyModel[199] = new ModelRendererTurbo(this, 187, 196, textureX, textureY); // Box 377 cs spd
        bodyModel[200] = new ModelRendererTurbo(this, 204, 206, textureX, textureY); // Box 378 cs
        bodyModel[201] = new ModelRendererTurbo(this, 172, 211, textureX, textureY); // Box 148 cs
        bodyModel[202] = new ModelRendererTurbo(this, 174, 206, textureX, textureY); // Box 150 cs
        bodyModel[203] = new ModelRendererTurbo(this, 193, 206, textureX, textureY); // Box 152 cs
        bodyModel[204] = new ModelRendererTurbo(this, 217, 132, textureX, textureY); // Box 383
        bodyModel[205] = new ModelRendererTurbo(this, 57, 132, textureX, textureY); // Box 384
        bodyModel[206] = new ModelRendererTurbo(this, 438, 192, textureX, textureY); // Box 385 tank main
        bodyModel[207] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 386
        bodyModel[208] = new ModelRendererTurbo(this, 415, 123, textureX, textureY); // Box 387
        bodyModel[209] = new ModelRendererTurbo(this, 416, 119, textureX, textureY); // Box 388
        bodyModel[210] = new ModelRendererTurbo(this, 417, 117, textureX, textureY); // Box 389
        bodyModel[211] = new ModelRendererTurbo(this, 416, 119, textureX, textureY); // Box 390
        bodyModel[212] = new ModelRendererTurbo(this, 418, 117, textureX, textureY); // Box 391
        bodyModel[213] = new ModelRendererTurbo(this, 417, 115, textureX, textureY); // Box 392
        bodyModel[214] = new ModelRendererTurbo(this, 408, 121, textureX, textureY); // Box 393
        bodyModel[215] = new ModelRendererTurbo(this, 406, 123, textureX, textureY); // Box 394
        bodyModel[216] = new ModelRendererTurbo(this, 408, 117, textureX, textureY); // Box 395
        bodyModel[217] = new ModelRendererTurbo(this, 407, 119, textureX, textureY); // Box 396
        bodyModel[218] = new ModelRendererTurbo(this, 407, 119, textureX, textureY); // Box 397
        bodyModel[219] = new ModelRendererTurbo(this, 409, 117, textureX, textureY); // Box 398
        bodyModel[220] = new ModelRendererTurbo(this, 408, 115, textureX, textureY); // Box 399
        bodyModel[221] = new ModelRendererTurbo(this, 371, 189, textureX, textureY); // Box 301
        bodyModel[222] = new ModelRendererTurbo(this, 371, 189, textureX, textureY); // Box 302
        bodyModel[223] = new ModelRendererTurbo(this, 370, 192, textureX, textureY); // Box 303
        bodyModel[224] = new ModelRendererTurbo(this, 370, 192, textureX, textureY); // Box 304
        bodyModel[225] = new ModelRendererTurbo(this, 370, 192, textureX, textureY); // Box 305
        bodyModel[226] = new ModelRendererTurbo(this, 370, 192, textureX, textureY); // Box 306
        bodyModel[227] = new ModelRendererTurbo(this, 370, 192, textureX, textureY); // Box 307
        bodyModel[228] = new ModelRendererTurbo(this, 370, 192, textureX, textureY); // Box 308
        bodyModel[229] = new ModelRendererTurbo(this, 370, 192, textureX, textureY); // Box 309
        bodyModel[230] = new ModelRendererTurbo(this, 370, 192, textureX, textureY); // Box 310
        bodyModel[231] = new ModelRendererTurbo(this, 272, 237, textureX, textureY); // Box 425
        bodyModel[232] = new ModelRendererTurbo(this, 461, 131, textureX, textureY); // Box 311
        bodyModel[233] = new ModelRendererTurbo(this, 461, 96, textureX, textureY); // Box 312
        bodyModel[234] = new ModelRendererTurbo(this, 380, 185, textureX, textureY); // Box 291 j2
        bodyModel[235] = new ModelRendererTurbo(this, 380, 185, textureX, textureY); // Box 292 j2
        bodyModel[236] = new ModelRendererTurbo(this, 343, 244, textureX, textureY); // Box 293
        bodyModel[237] = new ModelRendererTurbo(this, 343, 242, textureX, textureY); // Box 294
        bodyModel[238] = new ModelRendererTurbo(this, 452, 114, textureX, textureY); // Box 364
        bodyModel[239] = new ModelRendererTurbo(this, 486, 114, textureX, textureY); // Box 296
        bodyModel[240] = new ModelRendererTurbo(this, 452, 79, textureX, textureY); // Box 297
        bodyModel[241] = new ModelRendererTurbo(this, 486, 79, textureX, textureY); // Box 298
        bodyModel[242] = new ModelRendererTurbo(this, 485, 115, textureX, textureY); // Box 299
        bodyModel[243] = new ModelRendererTurbo(this, 451, 115, textureX, textureY); // Box 301
        bodyModel[244] = new ModelRendererTurbo(this, 485, 80, textureX, textureY); // Box 302
        bodyModel[245] = new ModelRendererTurbo(this, 451, 80, textureX, textureY); // Box 303
        bodyModel[246] = new ModelRendererTurbo(this, 123, 126, textureX, textureY); // Box 305
        bodyModel[247] = new ModelRendererTurbo(this, 11, 130, textureX, textureY, "lamp"); // Box 302 numberboard
        bodyModel[248] = new ModelRendererTurbo(this, 11, 130, textureX, textureY, "lamp"); // Box 303 numberboard
        bodyModel[249] = new ModelRendererTurbo(this, 5, 122, textureX, textureY); // Box 309
        bodyModel[250] = new ModelRendererTurbo(this, 1, 125, textureX, textureY); // Box 310
        bodyModel[251] = new ModelRendererTurbo(this, 13, 140, textureX, textureY); // Box 311
        bodyModel[252] = new ModelRendererTurbo(this, 256, 130, textureX, textureY, "lamp"); // Box 302 numberboard
        bodyModel[253] = new ModelRendererTurbo(this, 256, 130, textureX, textureY, "lamp"); // Box 303 numberboard
        bodyModel[254] = new ModelRendererTurbo(this, 114, 195, textureX, textureY); // Box 318
        bodyModel[255] = new ModelRendererTurbo(this, 134, 202, textureX, textureY); // Box 319
        bodyModel[256] = new ModelRendererTurbo(this, 144, 219, textureX, textureY); // Box 320
        bodyModel[257] = new ModelRendererTurbo(this, 144, 195, textureX, textureY); // Box 321
        bodyModel[258] = new ModelRendererTurbo(this, 419, 194, textureX, textureY); // Box 322 tank extra 1
        bodyModel[259] = new ModelRendererTurbo(this, 477, 194, textureX, textureY); // Box 323 tank extra 1
        bodyModel[260] = new ModelRendererTurbo(this, 230, 140, textureX, textureY); // Box 304
        bodyModel[261] = new ModelRendererTurbo(this, 260, 140, textureX, textureY); // Box 305
        bodyModel[262] = new ModelRendererTurbo(this, 241, 244, textureX, textureY); // Box 364 prime base
        bodyModel[263] = new ModelRendererTurbo(this, 241, 240, textureX, textureY, "lamp"); // Box 6 PRIME2-1
        bodyModel[264] = new ModelRendererTurbo(this, 241, 240, textureX, textureY, "lamp"); // Box 7 PRIME2-3
        bodyModel[265] = new ModelRendererTurbo(this, 241, 240, textureX, textureY, "lamp"); // Box 8 PRIME2-2
        bodyModel[266] = new ModelRendererTurbo(this, 241, 240, textureX, textureY, "lamp"); // Box 9 PRIME2-4
        bodyModel[267] = new ModelRendererTurbo(this, 240, 248, textureX, textureY, "cull"); // Box 311 support cull
        bodyModel[268] = new ModelRendererTurbo(this, 431, 120, textureX, textureY, "cull"); // Box 339 cull crossover
        bodyModel[269] = new ModelRendererTurbo(this, 431, 85, textureX, textureY, "cull"); // Box 328 cull crossover
        bodyModel[270] = new ModelRendererTurbo(this, 436, 81, textureX, textureY, "cull"); // Box 314 cull crossover
        bodyModel[271] = new ModelRendererTurbo(this, 436, 116, textureX, textureY, "cull"); // Box 315 cull crossover
        bodyModel[272] = new ModelRendererTurbo(this, 34, 152, textureX, textureY, "lamp"); // Box 1537 gyralight FU
        bodyModel[273] = new ModelRendererTurbo(this, 34, 152, textureX, textureY, "lamp"); // Box 1538 gyralight FU
        bodyModel[274] = new ModelRendererTurbo(this, 21, 150, textureX, textureY); // Box 242 ane light mount
        bodyModel[275] = new ModelRendererTurbo(this, 241, 152, textureX, textureY, "lamp"); // Box 1537 gyralight RU
        bodyModel[276] = new ModelRendererTurbo(this, 241, 152, textureX, textureY, "lamp"); // Box 1537 gyralight RU
        bodyModel[277] = new ModelRendererTurbo(this, 248, 150, textureX, textureY); // Box 242 ane light mount
        bodyModel[278] = new ModelRendererTurbo(this, 273, 236, textureX, textureY); // Box 322 AC's industrial railroading
        bodyModel[279] = new ModelRendererTurbo(this, 350, 145, textureX, textureY); // Box 323
        bodyModel[280] = new ModelRendererTurbo(this, 364, 154, textureX, textureY); // Box 317
        bodyModel[281] = new ModelRendererTurbo(this, 350, 156, textureX, textureY); // Box 318
        bodyModel[282] = new ModelRendererTurbo(this, 361, 147, textureX, textureY); // Box 319
        bodyModel[283] = new ModelRendererTurbo(this, 361, 154, textureX, textureY); // Box 320
        bodyModel[284] = new ModelRendererTurbo(this, 397, 156, textureX, textureY); // Box 330
        bodyModel[285] = new ModelRendererTurbo(this, 262, 248, textureX, textureY); // Box 364 prime base
        bodyModel[286] = new ModelRendererTurbo(this, 262, 244, textureX, textureY, "lamp"); // Box 6 PRIME4-1
        bodyModel[287] = new ModelRendererTurbo(this, 262, 244, textureX, textureY, "lamp"); // Box 7 PRIME4-3
        bodyModel[288] = new ModelRendererTurbo(this, 262, 244, textureX, textureY, "lamp"); // Box 8 PRIME4-2
        bodyModel[289] = new ModelRendererTurbo(this, 262, 244, textureX, textureY, "lamp"); // Box 9 PRIME4-4
        bodyModel[290] = new ModelRendererTurbo(this, 254, 252, textureX, textureY); // Box 277 support
        bodyModel[291] = new ModelRendererTurbo(this, 252, 248, textureX, textureY); // Box 364 prime base
        bodyModel[292] = new ModelRendererTurbo(this, 252, 244, textureX, textureY, "lamp"); // Box 6 PRIME3-1
        bodyModel[293] = new ModelRendererTurbo(this, 252, 244, textureX, textureY, "lamp"); // Box 7 PRIME3-3
        bodyModel[294] = new ModelRendererTurbo(this, 252, 244, textureX, textureY, "lamp"); // Box 8 PRIME3-2
        bodyModel[295] = new ModelRendererTurbo(this, 252, 244, textureX, textureY, "lamp"); // Box 9 PRIME3-4
        bodyModel[296] = new ModelRendererTurbo(this, 264, 252, textureX, textureY); // Box 277 support
        bodyModel[297] = new ModelRendererTurbo(this, 272, 239, textureX, textureY); // Box 425
        bodyModel[298] = new ModelRendererTurbo(this, 404, 156, textureX, textureY); // Box 43
        bodyModel[299] = new ModelRendererTurbo(this, 405, 159, textureX, textureY); // Box 43
        bodyModel[300] = new ModelRendererTurbo(this, 78, 158, textureX, textureY, "cull"); // Box 348 stair cull
        bodyModel[301] = new ModelRendererTurbo(this, 78, 158, textureX, textureY, "cull"); // Box 349 stair cull
        bodyModel[302] = new ModelRendererTurbo(this, 78, 158, textureX, textureY, "cull"); // Box 350 stair cull
        bodyModel[303] = new ModelRendererTurbo(this, 192, 158, textureX, textureY, "cull"); // Box 358 stair cull
        bodyModel[304] = new ModelRendererTurbo(this, 192, 158, textureX, textureY, "cull"); // Box 359 stair cull
        bodyModel[305] = new ModelRendererTurbo(this, 192, 158, textureX, textureY, "cull"); // Box 360 stair cull
        bodyModel[306] = new ModelRendererTurbo(this, 378, 141, textureX, textureY); // Box 352
        bodyModel[307] = new ModelRendererTurbo(this, 381, 139, textureX, textureY); // Box 353
        bodyModel[308] = new ModelRendererTurbo(this, 381, 132, textureX, textureY); // Box 354
        bodyModel[309] = new ModelRendererTurbo(this, 378, 130, textureX, textureY); // Box 355
        bodyModel[310] = new ModelRendererTurbo(this, 378, 132, textureX, textureY); // Box 356
        bodyModel[311] = new ModelRendererTurbo(this, 378, 139, textureX, textureY); // Box 357
        bodyModel[312] = new ModelRendererTurbo(this, 491, 129, textureX, textureY); // Box 359
        bodyModel[313] = new ModelRendererTurbo(this, 491, 94, textureX, textureY); // Box 360
        bodyModel[314] = new ModelRendererTurbo(this, 112, 104, textureX, textureY); // Box 361 sps stack
        bodyModel[315] = new ModelRendererTurbo(this, 240, 237, textureX, textureY); // Box 380
        bodyModel[316] = new ModelRendererTurbo(this, 240, 231, textureX, textureY); // Box 381
        bodyModel[317] = new ModelRendererTurbo(this, 240, 234, textureX, textureY); // Box 382
        bodyModel[318] = new ModelRendererTurbo(this, 231, 232, textureX, textureY); // Box 295
        bodyModel[319] = new ModelRendererTurbo(this, 272, 251, textureX, textureY); // Box 364 prime base
        bodyModel[320] = new ModelRendererTurbo(this, 272, 247, textureX, textureY, "lamp"); // Box 6 PRIME5-1
        bodyModel[321] = new ModelRendererTurbo(this, 272, 247, textureX, textureY, "lamp"); // Box 7 PRIME5-3
        bodyModel[322] = new ModelRendererTurbo(this, 272, 247, textureX, textureY, "lamp"); // Box 8 PRIME5-2
        bodyModel[323] = new ModelRendererTurbo(this, 272, 247, textureX, textureY, "lamp"); // Box 9 PRIME5-4
        bodyModel[324] = new ModelRendererTurbo(this, 283, 252, textureX, textureY); // Box 409 commander base
        bodyModel[325] = new ModelRendererTurbo(this, 283, 248, textureX, textureY, "lamp"); // Box 410 commander beacon
        bodyModel[326] = new ModelRendererTurbo(this, 289, 252, textureX, textureY); // Box 409 commander base
        bodyModel[327] = new ModelRendererTurbo(this, 289, 248, textureX, textureY, "lamp"); // Box 410 commander beacon
        bodyModel[328] = new ModelRendererTurbo(this, 131, 112, textureX, textureY); // Box 380
        bodyModel[329] = new ModelRendererTurbo(this, 417, 117, textureX, textureY); // Box 381
        bodyModel[330] = new ModelRendererTurbo(this, 416, 119, textureX, textureY); // Box 382
        bodyModel[331] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 383
        bodyModel[332] = new ModelRendererTurbo(this, 415, 123, textureX, textureY); // Box 384
        bodyModel[333] = new ModelRendererTurbo(this, 416, 119, textureX, textureY); // Box 385
        bodyModel[334] = new ModelRendererTurbo(this, 418, 117, textureX, textureY); // Box 386
        bodyModel[335] = new ModelRendererTurbo(this, 417, 115, textureX, textureY); // Box 387
        bodyModel[336] = new ModelRendererTurbo(this, 406, 123, textureX, textureY); // Box 388
        bodyModel[337] = new ModelRendererTurbo(this, 408, 121, textureX, textureY); // Box 389
        bodyModel[338] = new ModelRendererTurbo(this, 407, 119, textureX, textureY); // Box 390
        bodyModel[339] = new ModelRendererTurbo(this, 408, 117, textureX, textureY); // Box 391
        bodyModel[340] = new ModelRendererTurbo(this, 407, 119, textureX, textureY); // Box 392
        bodyModel[341] = new ModelRendererTurbo(this, 409, 117, textureX, textureY); // Box 393
        bodyModel[342] = new ModelRendererTurbo(this, 408, 115, textureX, textureY); // Box 394
        bodyModel[343] = new ModelRendererTurbo(this, 198, 109, textureX, textureY); // Box 500
        bodyModel[344] = new ModelRendererTurbo(this, 143, 140, textureX, textureY); // Box 1542
        bodyModel[345] = new ModelRendererTurbo(this, 153, 100, textureX, textureY); // Box 394
        bodyModel[346] = new ModelRendererTurbo(this, 143, 140, textureX, textureY); // Box 304

        bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
        bodyModel[0].setRotationPoint(-39F, 3F, -1.5F);

        bodyModel[1].addBox(0F, 0F, 0F, 2, 3, 5, 0F); // Box 2
        bodyModel[1].setRotationPoint(-36.5F, 2.5F, -2.5F);

        bodyModel[2].addBox(0F, 0F, 0F, 27, 17, 14, 0F); // Box 2
        bodyModel[2].setRotationPoint(-29F, -17F, -7F);

        bodyModel[3].addBox(0F, 0F, 0F, 59, 1, 4, 0F); // Box 0
        bodyModel[3].setRotationPoint(-30F, 0F, -11F);

        bodyModel[4].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 26
        bodyModel[4].setRotationPoint(35F, 3F, -1.5F);

        bodyModel[5].addBox(0F, 0F, 0F, 2, 3, 5, 0F); // Box 27
        bodyModel[5].setRotationPoint(33.5F, 2.5F, -2.5F);

        bodyModel[6].addBox(0F, 0F, 0F, 69, 3, 14, 0F); // Box 52
        bodyModel[6].setRotationPoint(-35F, 0F, -7F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
        bodyModel[7].setRotationPoint(-32F, 0F, -11F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 67
        bodyModel[8].setRotationPoint(-32F, 0F, 7F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 115
        bodyModel[9].setRotationPoint(-33F, 3F, -3F);

        bodyModel[10].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 141
        bodyModel[10].setRotationPoint(-35F, 3F, -3F);

        bodyModel[11].addBox(0F, 0F, 0F, 59, 1, 4, 0F); // Box 206
        bodyModel[11].setRotationPoint(-30F, 0F, 7F);

        bodyModel[12].addBox(0F, 0F, 0F, 1, 9, 14, 0F); // Box 490
        bodyModel[12].setRotationPoint(28F, -9F, -7F);

        bodyModel[13].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 502
        bodyModel[13].setRotationPoint(28F, -17F, -1F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 503
        bodyModel[14].setRotationPoint(28F, -17F, 1F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 9, 12, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 504
        bodyModel[15].setRotationPoint(29F, -9F, -6F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
        bodyModel[16].setRotationPoint(28F, -17F, -7F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.34F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 158
        bodyModel[17].setRotationPoint(28F, -13F, 6F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.34F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F); // Box 159
        bodyModel[18].setRotationPoint(28F, -13F, 1F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.34F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 160
        bodyModel[19].setRotationPoint(28F, -13F, -6F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F); // Box 161
        bodyModel[20].setRotationPoint(28F, -13F, -7F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 162 headlight r
        bodyModel[21].setRotationPoint(29.25F, -15F, -1F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 163 headlight r
        bodyModel[22].setRotationPoint(29.25F, -17F, -1F);

        bodyModel[23].addBox(0F, 0F, 0F, 13, 6, 16, 0F); // Box 178 tank main
        bodyModel[23].setRotationPoint(-7F, 2F, -8F);

        bodyModel[24].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 201
        bodyModel[24].setRotationPoint(-21F, 3F, -2F);

        bodyModel[25].addBox(0F, 0F, -3F, 1, 1, 4, 0F); // Box 202
        bodyModel[25].setRotationPoint(-6.5F, 3F, -8F);
        bodyModel[25].rotateAngleX = -0.64577182F;

        bodyModel[26].addBox(0F, 0F, 0F, 19, 8, 0, 0F); // Box 224
        bodyModel[26].setRotationPoint(10F, -8F, -11F);

        bodyModel[27].addBox(0F, 0F, 0F, 28, 8, 0, 0F); // Box 225
        bodyModel[27].setRotationPoint(-30F, -8F, 11F);

        bodyModel[28].addBox(0F, 0F, 0F, 0, 9, 14, 0F); // Box 228
        bodyModel[28].setRotationPoint(-35F, -9F, -7F);

        bodyModel[29].addBox(0F, 0F, -1F, 1, 1, 4, 0F); // Box 237
        bodyModel[29].setRotationPoint(-6.5F, 3F, 8F);
        bodyModel[29].rotateAngleX = 0.64577182F;

        bodyModel[30].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 245 j1
        bodyModel[30].setRotationPoint(-20F, 1F, -11F);

        bodyModel[31].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 250 j1
        bodyModel[31].setRotationPoint(17F, 1F, -11F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 560
        bodyModel[32].setRotationPoint(-4.5F, 1F, -11F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 562
        bodyModel[33].setRotationPoint(-4.5F, 1F, 8F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 564 tank extra1
        bodyModel[34].setRotationPoint(-7F, 5F, -10F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569 tank extra 1
        bodyModel[35].setRotationPoint(-7F, 5F, 8F);

        bodyModel[36].addBox(0F, 0F, 0F, 0, 9, 22, 0F); // Box 682
        bodyModel[36].setRotationPoint(-35.01F, 0F, -11F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 708
        bodyModel[37].setRotationPoint(-35F, -8F, 8F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 709
        bodyModel[38].setRotationPoint(-35F, -8F, -9F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 359 ditchlight fl
        bodyModel[39].setRotationPoint(-36F, 0F, -6.75F);

        bodyModel[40].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 360 cull
        bodyModel[40].setRotationPoint(-35.75F, 0F, -6.75F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 272 ditchlight r
        bodyModel[41].setRotationPoint(34F, 0F, -6.75F);

        bodyModel[42].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 273 cull
        bodyModel[42].setRotationPoint(33.75F, 0F, -6.75F);

        bodyModel[43].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 318
        bodyModel[43].setRotationPoint(16F, 3F, -2F);

        bodyModel[44].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 320 cull
        bodyModel[44].setRotationPoint(-35.75F, 0F, 4.75F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 321 ditchlight fl
        bodyModel[45].setRotationPoint(-36F, 0F, 4.75F);

        bodyModel[46].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 322 cull
        bodyModel[46].setRotationPoint(33.75F, 0F, 4.75F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 323 ditchlight r
        bodyModel[47].setRotationPoint(34F, 0F, 4.75F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 324
        bodyModel[48].setRotationPoint(30F, 3F, -3F);

        bodyModel[49].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 325
        bodyModel[49].setRotationPoint(32F, 3F, -3F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 401
        bodyModel[50].setRotationPoint(-30F, 1F, -11F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F); // Box 404
        bodyModel[51].setRotationPoint(-31F, -13F, -7F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -1F, 0F, -0.34F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 405
        bodyModel[52].setRotationPoint(-31F, -13F, -6F);

        bodyModel[53].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 406
        bodyModel[53].setRotationPoint(-31F, -17F, -1F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 409
        bodyModel[54].setRotationPoint(-31F, -17F, 1F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
        bodyModel[55].setRotationPoint(-31F, -17F, -7F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 411 headlight f
        bodyModel[56].setRotationPoint(-31.25F, -15F, -1F);

        bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 headlight f
        bodyModel[57].setRotationPoint(-31.25F, -17F, -1F);

        bodyModel[58].addBox(0F, 0F, 0F, 18, 17, 14, 0F); // Box 938
        bodyModel[58].setRotationPoint(10F, -17F, -7F);

        bodyModel[59].addBox(0F, 0F, 0F, 10, 12, 1, 0F); // Box 939
        bodyModel[59].setRotationPoint(-1F, -20F, -11F);

        bodyModel[60].addBox(0F, 0F, 0F, 12, 8, 22, 0F); // Box 940
        bodyModel[60].setRotationPoint(-2F, -8F, -11F);

        bodyModel[61].addBox(0F, 0F, 0F, 10, 12, 1, 0F); // Box 944
        bodyModel[61].setRotationPoint(-1F, -20F, 10F);

        bodyModel[62].addBox(0F, 0F, 0F, 12, 1, 14, 0F); // Box 945
        bodyModel[62].setRotationPoint(-2F, -23F, -7F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 946
        bodyModel[63].setRotationPoint(-2F, -21F, -11F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 947
        bodyModel[64].setRotationPoint(-2F, -21F, 7F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 1150
        bodyModel[65].setRotationPoint(-4F, -20F, -11F);

        bodyModel[66].addBox(0F, 0F, 0F, 2, 0, 14, 0F); // Box 1151
        bodyModel[66].setRotationPoint(-4F, -23F, -7F);

        bodyModel[67].addBox(-0.5F, 0F, -0.5F, 1, 12, 4, 0F); // Box 314 door swing right
        bodyModel[67].setRotationPoint(9.5F, -20F, 7.5F);

        bodyModel[68].addBox(-0.5F, 0F, -3.5F, 1, 12, 4, 0F); // Box 315 door swing right
        bodyModel[68].setRotationPoint(-1.5F, -20F, -7.5F);

        bodyModel[69].addBox(0F, 0F, 0F, 1, 12, 4, 0F); // Box 1158
        bodyModel[69].setRotationPoint(9F, -20F, -11F);

        bodyModel[70].addBox(0F, 0F, 0F, 1, 12, 4, 0F); // Box 1159
        bodyModel[70].setRotationPoint(-2F, -20F, 7F);

        bodyModel[71].addBox(0F, 0F, 0F, 1, 14, 14, 0F); // Box 1510
        bodyModel[71].setRotationPoint(-2F, -22F, -7F);

        bodyModel[72].addShapeBox(-0.5F, 0F, -2.5F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1511 door swing right
        bodyModel[72].setRotationPoint(-1.5F, -22F, -7.5F);

        bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1512
        bodyModel[73].setRotationPoint(9F, -22F, -10F);

        bodyModel[74].addBox(0F, 0F, 0F, 1, 14, 14, 0F); // Box 1513
        bodyModel[74].setRotationPoint(9F, -22F, -7F);

        bodyModel[75].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1514 door swing right
        bodyModel[75].setRotationPoint(9.5F, -22F, 7.5F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1515
        bodyModel[76].setRotationPoint(-2F, -22F, 7F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1516
        bodyModel[77].setRotationPoint(-31F, -9F, -6F);

        bodyModel[78].addBox(0F, 0F, 0F, 1, 9, 14, 0F); // Box 1517
        bodyModel[78].setRotationPoint(-30F, -9F, -7F);

        bodyModel[79].addBox(0F, 0F, 0F, 2, 3, 8, 0F); // Box 1518
        bodyModel[79].setRotationPoint(-31F, -12F, -4F);

        bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 2F, -1F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 2F); // Box 1519
        bodyModel[80].setRotationPoint(-32F, -12F, -7F);

        bodyModel[81].addBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F); // Box 1521 markerlight
        bodyModel[81].setRotationPoint(-30F, -11.5F, -5.37F);
        bodyModel[81].rotateAngleY = 0.48869219F;

        bodyModel[82].addBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F); // Box 1522 markerlight
        bodyModel[82].setRotationPoint(-30F, -11.5F, 5.37F);
        bodyModel[82].rotateAngleY = -0.48869219F;

        bodyModel[83].addBox(0F, 0F, 0F, 2, 3, 8, 0F); // Box 1523
        bodyModel[83].setRotationPoint(28F, -12F, -4F);

        bodyModel[84].addBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F); // Box 1526 markerlight
        bodyModel[84].setRotationPoint(29F, -11.5F, -5.37F);
        bodyModel[84].rotateAngleY = 1.11701072F;

        bodyModel[85].addBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F); // Box 1527 markerlight
        bodyModel[85].setRotationPoint(29F, -11.5F, 5.37F);
        bodyModel[85].rotateAngleY = -1.11701072F;

        bodyModel[86].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 1528
        bodyModel[86].setRotationPoint(-4.5F, 4F, 8F);

        bodyModel[87].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 1529
        bodyModel[87].setRotationPoint(-4F, -23F, -1.5F);

        bodyModel[88].addBox(0F, 0F, 0F, 7, 2, 3, 0F); // Box 1530
        bodyModel[88].setRotationPoint(-10F, -19F, -1.5F);

        bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 1534
        bodyModel[89].setRotationPoint(-11F, -19F, -1.5F);

        bodyModel[90].addBox(0F, 0F, 0F, 2, 7, 4, 0F); // Box 1535
        bodyModel[90].setRotationPoint(-10F, -24F, -2F);

        bodyModel[91].addBox(0F, 0F, 0F, 11, 1, 4, 0F); // Box 1536
        bodyModel[91].setRotationPoint(-23F, -17.5F, -2F);

        bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1537 gyralight FL
        bodyModel[92].setRotationPoint(-31.5F, -12.25F, -2F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1538 gyralight FL
        bodyModel[93].setRotationPoint(-31.5F, -12.25F, 0F);

        bodyModel[94].addShapeBox(0F, 0F, 0F, 9, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 1540
        bodyModel[94].setRotationPoint(-28F, -15F, 6.25F);

        bodyModel[95].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 192
        bodyModel[95].setRotationPoint(-31.25F, -19F, -1F);

        bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 193 sp gyralight FU
        bodyModel[96].setRotationPoint(-31.5F, -19F, -1F);

        bodyModel[97].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 194
        bodyModel[97].setRotationPoint(28.25F, -19F, -1F);

        bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 195 sp gyralight RU
        bodyModel[98].setRotationPoint(29.5F, -19F, -1F);

        bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 196 gyralight RL
        bodyModel[99].setRotationPoint(29.5F, -12.25F, -2F);

        bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 197 gyralight RL
        bodyModel[100].setRotationPoint(29.5F, -12.25F, 0F);

        bodyModel[101].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 198
        bodyModel[101].setRotationPoint(-30F, 4F, -11F);
        bodyModel[101].rotateAngleY = 0.46251225F;

        bodyModel[102].addShapeBox(0F, 0F, -1F, 0, 3, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
        bodyModel[102].setRotationPoint(-30F, 4F, 11F);
        bodyModel[102].rotateAngleY = -0.46251225F;

        bodyModel[103].addShapeBox(0F, 0F, 0F, 0, 7, 4, 0F,2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
        bodyModel[103].setRotationPoint(-30F, 1F, 7F);

        bodyModel[104].addShapeBox(0F, 0F, -1F, 0, 3, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
        bodyModel[104].setRotationPoint(29F, 4F, 11F);
        bodyModel[104].rotateAngleY = 0.46251225F;

        bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 7, 4, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
        bodyModel[105].setRotationPoint(29F, 1F, 7F);

        bodyModel[106].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 221
        bodyModel[106].setRotationPoint(29F, 4F, -11F);
        bodyModel[106].rotateAngleY = -0.46251225F;

        bodyModel[107].addShapeBox(0F, 0F, 0F, 0, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 225
        bodyModel[107].setRotationPoint(29F, 1F, -11F);

        bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
        bodyModel[108].setRotationPoint(29F, 0F, -11F);

        bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 230
        bodyModel[109].setRotationPoint(29F, 0F, 7F);

        bodyModel[110].addBox(0F, 0F, 0F, 0, 9, 14, 0F); // Box 232
        bodyModel[110].setRotationPoint(34F, -9F, -7F);

        bodyModel[111].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 233
        bodyModel[111].setRotationPoint(34F, -8F, -9F);

        bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 234
        bodyModel[112].setRotationPoint(34F, -8F, 8F);

        bodyModel[113].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 235
        bodyModel[113].setRotationPoint(34F, -1F, 10F);

        bodyModel[114].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 236
        bodyModel[114].setRotationPoint(34F, -1F, -11F);

        bodyModel[115].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 237
        bodyModel[115].setRotationPoint(10F, -23F, -0.5F);

        bodyModel[116].addBox(0F, 0F, 0F, 21, 8, 0, 0F); // Box 238
        bodyModel[116].setRotationPoint(-30F, -8F, -11F);

        bodyModel[117].addShapeBox(0F, 0F, 1F, 0, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
        bodyModel[117].setRotationPoint(-30.5F, -7F, -11F);
        bodyModel[117].rotateAngleY = 0.4712389F;

        bodyModel[118].addBox(0F, 0F, 0F, 0, 11, 3, 0F); // Box 250
        bodyModel[118].setRotationPoint(-30.5F, -8F, -11F);
        bodyModel[118].rotateAngleY = 0.4712389F;

        bodyModel[119].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 241 sp light mount
        bodyModel[119].setRotationPoint(29.25F, -12.25F, -2F);

        bodyModel[120].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 242 sp light mount
        bodyModel[120].setRotationPoint(-31.25F, -12.25F, -2F);

        bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
        bodyModel[121].setRotationPoint(-3F, -14F, -11F);

        bodyModel[122].addBox(0F, 0F, 0F, 12, 8, 0, 0F); // Box 361
        bodyModel[122].setRotationPoint(17F, -8F, 11F);

        bodyModel[123].addShapeBox(0F, 0F, -2F, 0, 6, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
        bodyModel[123].setRotationPoint(-30.5F, -7F, 11F);
        bodyModel[123].rotateAngleY = -0.4712389F;

        bodyModel[124].addBox(0F, 0F, -3F, 0, 11, 3, 0F); // Box 363
        bodyModel[124].setRotationPoint(-30.5F, -8F, 11F);
        bodyModel[124].rotateAngleY = -0.4712389F;

        bodyModel[125].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 364
        bodyModel[125].setRotationPoint(-35F, -1F, -11F);

        bodyModel[126].addBox(0F, 0F, 0F, 0, 9, 22, 0F); // Box 365
        bodyModel[126].setRotationPoint(34.01F, 0F, -11F);

        bodyModel[127].addBox(0F, 0F, 0F, 0, 11, 3, 0F); // Box 366
        bodyModel[127].setRotationPoint(29.5F, -8F, -11F);
        bodyModel[127].rotateAngleY = -0.4712389F;

        bodyModel[128].addShapeBox(0F, 0F, 1F, 0, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
        bodyModel[128].setRotationPoint(29.5F, -7F, -11F);
        bodyModel[128].rotateAngleY = -0.4712389F;

        bodyModel[129].addBox(0F, 0F, -3F, 0, 11, 3, 0F); // Box 370
        bodyModel[129].setRotationPoint(29.5F, -8F, 11F);
        bodyModel[129].rotateAngleY = 0.4712389F;

        bodyModel[130].addShapeBox(0F, 0F, -2F, 0, 6, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
        bodyModel[130].setRotationPoint(29.5F, -7F, 11F);
        bodyModel[130].rotateAngleY = 0.4712389F;

        bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 372
        bodyModel[131].setRotationPoint(-31F, -8F, -11F);

        bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 373
        bodyModel[132].setRotationPoint(-31F, -8F, 11F);

        bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 374
        bodyModel[133].setRotationPoint(29F, -8F, 11F);

        bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 375
        bodyModel[134].setRotationPoint(29F, -8F, -11F);

        bodyModel[135].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 376
        bodyModel[135].setRotationPoint(10.5F, -24F, -0.5F);

        bodyModel[136].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 377
        bodyModel[136].setRotationPoint(-6F, -18F, -7F);

        bodyModel[137].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 380
        bodyModel[137].setRotationPoint(-6F, -24.5F, 3F);

        bodyModel[138].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 381
        bodyModel[138].setRotationPoint(-5F, -24.5F, 5F);

        bodyModel[139].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 382
        bodyModel[139].setRotationPoint(-5F, -24.5F, 4F);

        bodyModel[140].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 383
        bodyModel[140].setRotationPoint(-4F, -24F, 4F);

        bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
        bodyModel[141].setRotationPoint(10F, -23F, 0F);

        bodyModel[142].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 385
        bodyModel[142].setRotationPoint(-35F, -1F, 10F);

        bodyModel[143].addBox(0F, 0F, 0F, 12, 0, 2, 0F); // Box 386
        bodyModel[143].setRotationPoint(-2F, -18F, 11F);
        bodyModel[143].rotateAngleX = -0.87266463F;

        bodyModel[144].addBox(0F, 0F, -2F, 12, 0, 2, 0F); // Box 387
        bodyModel[144].setRotationPoint(-2F, -18F, -11F);
        bodyModel[144].rotateAngleX = 0.87266463F;

        bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 143
        bodyModel[145].setRotationPoint(-29.5F, -17.5F, -1F);

        bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 389
        bodyModel[146].setRotationPoint(26.5F, -17.5F, -1F);

        bodyModel[147].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box WW F1T cull
        bodyModel[147].setRotationPoint(2F, -18F, -13F);

        bodyModel[148].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311 WW F1B cull
        bodyModel[148].setRotationPoint(2F, -17F, -15F);

        bodyModel[149].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 392
        bodyModel[149].setRotationPoint(14F, -17.75F, -4F);

        bodyModel[150].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 393
        bodyModel[150].setRotationPoint(25F, -17.75F, 2F);

        bodyModel[151].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 395 WW E1B cull
        bodyModel[151].setRotationPoint(0F, -17F, 10F);

        bodyModel[152].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 396 WW E1T cull
        bodyModel[152].setRotationPoint(0F, -18F, 10F);

        bodyModel[153].addBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F); // Box 397
        bodyModel[153].setRotationPoint(-5F, -22.75F, 8.5F);
        bodyModel[153].rotateAngleX = -0.66322512F;

        bodyModel[154].addBox(0F, -0.5F, -0.5F, 2, 1, 1, 0F); // Box 398
        bodyModel[154].setRotationPoint(-4F, -22F, 9.5F);
        bodyModel[154].rotateAngleX = -0.66322512F;

        bodyModel[155].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 399
        bodyModel[155].setRotationPoint(-3.5F, -22F, 8.75F);
        bodyModel[155].rotateAngleX = -0.66322512F;

        bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
        bodyModel[156].setRotationPoint(-8F, 1.75F, 9.5F);

        bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
        bodyModel[157].setRotationPoint(-8F, 0.75F, 9.5F);

        bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
        bodyModel[158].setRotationPoint(-7.75F, 2.25F, 9.75F);

        bodyModel[159].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 403
        bodyModel[159].setRotationPoint(-36F, 7F, -10F);

        bodyModel[160].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 404
        bodyModel[160].setRotationPoint(-36F, 7F, 3F);

        bodyModel[161].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 405
        bodyModel[161].setRotationPoint(-38F, 8F, -10F);

        bodyModel[162].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 406
        bodyModel[162].setRotationPoint(-38F, 8F, 3F);

        bodyModel[163].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 407
        bodyModel[163].setRotationPoint(-38F, 7F, 3F);

        bodyModel[164].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 408
        bodyModel[164].setRotationPoint(-38F, 7F, -3F);

        bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
        bodyModel[165].setRotationPoint(10F, -24F, -1F);

        bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
        bodyModel[166].setRotationPoint(10F, -24.5F, -1F);

        bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
        bodyModel[167].setRotationPoint(10F, -24.5F, -1F);

        bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
        bodyModel[168].setRotationPoint(10F, -24.5F, -1F);

        bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
        bodyModel[169].setRotationPoint(10F, -24.5F, -1F);

        bodyModel[170].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 242
        bodyModel[170].setRotationPoint(34F, 8F, -10F);

        bodyModel[171].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 243
        bodyModel[171].setRotationPoint(34F, 7F, -10F);

        bodyModel[172].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 244
        bodyModel[172].setRotationPoint(34F, 7F, -3F);

        bodyModel[173].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 245
        bodyModel[173].setRotationPoint(34F, 7F, 3F);

        bodyModel[174].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 246
        bodyModel[174].setRotationPoint(34F, 8F, 3F);

        bodyModel[175].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 247
        bodyModel[175].setRotationPoint(34F, 7F, 3F);

        bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
        bodyModel[176].setRotationPoint(-35F, -3F, 3F);

        bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
        bodyModel[177].setRotationPoint(-35F, -3F, -5F);

        bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight fu
        bodyModel[178].setRotationPoint(-35.25F, -3F, 3F);

        bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight fu
        bodyModel[179].setRotationPoint(-35.25F, -3F, -5F);

        bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 252
        bodyModel[180].setRotationPoint(33F, -3F, 3F);

        bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 253 ditchlight r
        bodyModel[181].setRotationPoint(33.25F, -3F, 3F);

        bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 254
        bodyModel[182].setRotationPoint(33F, -3F, -5F);

        bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 255 ditchlight r
        bodyModel[183].setRotationPoint(33.25F, -3F, -5F);

        bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
        bodyModel[184].setRotationPoint(-12.5F, -20F, -0.5F);

        bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
        bodyModel[185].setRotationPoint(-12.5F, -21F, -0.5F);

        bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
        bodyModel[186].setRotationPoint(-12.25F, -19.5F, -0.25F);

        bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
        bodyModel[187].setRotationPoint(-12.5F, -18F, -2F);

        bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 114
        bodyModel[188].setRotationPoint(-12.5F, -21F, -2F);

        bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
        bodyModel[189].setRotationPoint(-12.5F, -21F, 1F);

        bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 116
        bodyModel[190].setRotationPoint(-12.5F, -21.5F, -1F);

        bodyModel[191].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 117
        bodyModel[191].setRotationPoint(-12.5F, -17.5F, -1F);

        bodyModel[192].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 264
        bodyModel[192].setRotationPoint(-5F, -24.5F, -0.5F);

        bodyModel[193].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 265
        bodyModel[193].setRotationPoint(-4F, -24F, -0.5F);

        bodyModel[194].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 266
        bodyModel[194].setRotationPoint(-6F, -24.5F, -1.5F);

        bodyModel[195].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 267
        bodyModel[195].setRotationPoint(-5F, -24.5F, 0.5F);

        bodyModel[196].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 268
        bodyModel[196].setRotationPoint(-6F, -23F, 3F);

        bodyModel[197].addBox(-0.5F, 0F, 0F, 3, 1, 1, 0F); // Box 269
        bodyModel[197].setRotationPoint(-5F, -23F, 4F);

        bodyModel[198].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 271
        bodyModel[198].setRotationPoint(-5F, -23F, 5F);

        bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -2F, 0F, -5F, -2F); // Box 377 cs spd
        bodyModel[199].setRotationPoint(-1F, -22F, -1F);

        bodyModel[200].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 378 cs
        bodyModel[200].setRotationPoint(-1F, -16F, 3.75F);

        bodyModel[201].addBox(0F, 0F, 0F, 8, 7, 2, 0F); // Box 148 cs
        bodyModel[201].setRotationPoint(-1F, -15.01F, -3F);
        bodyModel[201].rotateAngleY = -0.61086524F;

        bodyModel[202].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 150 cs
        bodyModel[202].setRotationPoint(2F, -17.01F, -5.25F);
        bodyModel[202].rotateAngleY = -0.57595865F;

        bodyModel[203].addBox(0F, 0F, 0F, 2, 8, 6, 0F); // Box 152 cs
        bodyModel[203].setRotationPoint(0F, -16.01F, -3F);
        bodyModel[203].rotateAngleY = 0.15707963F;

        bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 383
        bodyModel[204].setRotationPoint(26.5F, -18.5F, -1F);

        bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 384
        bodyModel[205].setRotationPoint(-29.5F, -18.5F, -1F);

        bodyModel[206].addBox(0F, 0F, 0F, 11, 1, 16, 0F); // Box 385 tank main
        bodyModel[206].setRotationPoint(-6F, 8F, -8F);

        bodyModel[207].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 386
        bodyModel[207].setRotationPoint(-35F, 7F, -9F);

        bodyModel[208].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
        bodyModel[208].setRotationPoint(-35F, 8F, -11F);

        bodyModel[209].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
        bodyModel[209].setRotationPoint(-35F, 5F, -10F);

        bodyModel[210].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 389
        bodyModel[210].setRotationPoint(-35F, 4F, -9F);

        bodyModel[211].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 390
        bodyModel[211].setRotationPoint(-35F, 2.5F, -9F);

        bodyModel[212].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 391
        bodyModel[212].setRotationPoint(-35F, 1.5F, -8F);

        bodyModel[213].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
        bodyModel[213].setRotationPoint(-35F, 0F, -8F);

        bodyModel[214].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 393
        bodyModel[214].setRotationPoint(-35F, 7F, 9F);

        bodyModel[215].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 394
        bodyModel[215].setRotationPoint(-35F, 8F, 9F);

        bodyModel[216].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 395
        bodyModel[216].setRotationPoint(-35F, 4F, 9F);

        bodyModel[217].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 396
        bodyModel[217].setRotationPoint(-35F, 5F, 9F);

        bodyModel[218].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
        bodyModel[218].setRotationPoint(-35F, 2.5F, 8F);

        bodyModel[219].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 398
        bodyModel[219].setRotationPoint(-35F, 1.5F, 8F);

        bodyModel[220].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 399
        bodyModel[220].setRotationPoint(-35F, 0F, 7F);

        bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
        bodyModel[221].setRotationPoint(-36.5F, 1.5F, -2.5F);

        bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
        bodyModel[222].setRotationPoint(33.5F, 1.5F, -2.5F);

        bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
        bodyModel[223].setRotationPoint(-36.5F, 2.5F, -3.5F);

        bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 304
        bodyModel[224].setRotationPoint(-36.5F, 2.5F, 2.5F);

        bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 305
        bodyModel[225].setRotationPoint(33.5F, 2.5F, 2.5F);

        bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
        bodyModel[226].setRotationPoint(33.5F, 2.5F, -3.5F);

        bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
        bodyModel[227].setRotationPoint(-36.5F, 5.5F, -3.5F);

        bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 308
        bodyModel[228].setRotationPoint(-36.5F, 5.5F, 2.5F);

        bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 309
        bodyModel[229].setRotationPoint(33.5F, 5.5F, 2.5F);

        bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
        bodyModel[230].setRotationPoint(33.5F, 5.5F, -3.5F);

        bodyModel[231].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
        bodyModel[231].setRotationPoint(8F, -24F, 2F);

        bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
        bodyModel[232].setRotationPoint(-38F, 7F, -3F);

        bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
        bodyModel[233].setRotationPoint(34F, 7F, -3F);

        bodyModel[234].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 291 j2
        bodyModel[234].setRotationPoint(-18F, 1F, -11F);

        bodyModel[235].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 292 j2
        bodyModel[235].setRotationPoint(15F, 1F, -11F);

        bodyModel[236].addBox(0F, 0F, 0F, 59, 1, 0, 0F); // Box 293
        bodyModel[236].setRotationPoint(-30F, 1F, -11.01F);

        bodyModel[237].addBox(0F, 0F, 0F, 59, 1, 0, 0F); // Box 294
        bodyModel[237].setRotationPoint(-30F, 1F, 11.01F);

        bodyModel[238].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
        bodyModel[238].setRotationPoint(-35F, -7F, 6F);

        bodyModel[239].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 296
        bodyModel[239].setRotationPoint(-35F, -7F, -7F);

        bodyModel[240].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 297
        bodyModel[240].setRotationPoint(34F, -7F, -7F);

        bodyModel[241].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        bodyModel[241].setRotationPoint(34F, -7F, 6F);

        bodyModel[242].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 299
        bodyModel[242].setRotationPoint(-35F, -3F, -8F);

        bodyModel[243].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
        bodyModel[243].setRotationPoint(-35F, -3F, 6F);

        bodyModel[244].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
        bodyModel[244].setRotationPoint(34F, -3F, 6F);

        bodyModel[245].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 303
        bodyModel[245].setRotationPoint(34F, -3F, -8F);

        bodyModel[246].addShapeBox(0F, 0F, 0F, 9, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 305
        bodyModel[246].setRotationPoint(-28F, -15F, -7.25F);

        bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0.1F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, -1.75F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, -1.75F, 0F, -0.25F); // Box 302 numberboard
        bodyModel[247].setRotationPoint(-31F, -16F, 1F);

        bodyModel[248].addShapeBox(0F, 0F, -6F, 1, 2, 6, 0F,-1.75F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0.1F, 0F, -0.25F, -1.75F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0.1F, 0F, -0.25F); // Box 303 numberboard
        bodyModel[248].setRotationPoint(-31F, -16F, -1F);

        bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 309
        bodyModel[249].setRotationPoint(-31F, -13F, 6F);

        bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, -0.34F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F); // Box 310
        bodyModel[250].setRotationPoint(-31F, -13F, 1F);

        bodyModel[251].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, 2F, 0F, 0F, -1F, -0.5F, 0F, 0F, -1F, 0F, -3F, -2F, 0F, 2F, 0F, 0F, -1F, -0.5F, 0F, 0F, -1F, 0F, -3F); // Box 311
        bodyModel[251].setRotationPoint(-32F, -12F, 6F);

        bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, -0.25F, 0.1F, 0F, -0.25F, -1.75F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0.1F, 0F, -0.25F, -1.75F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 302 numberboard
        bodyModel[252].setRotationPoint(29F, -16F, 1F);

        bodyModel[253].addShapeBox(0F, 0F, -6F, 1, 2, 6, 0F,2F, 0F, -0.25F, -1.75F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, -1.75F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 303 numberboard
        bodyModel[253].setRotationPoint(29F, -16F, -1F);

        bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
        bodyModel[254].setRotationPoint(-4F, -20F, 7F);

        bodyModel[255].addBox(0F, 0F, 0F, 2, 0, 14, 0F); // Box 319
        bodyModel[255].setRotationPoint(10F, -23F, -7F);

        bodyModel[256].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 320
        bodyModel[256].setRotationPoint(10F, -20F, -11F);

        bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
        bodyModel[257].setRotationPoint(10F, -20F, 7F);

        bodyModel[258].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 322 tank extra 1
        bodyModel[258].setRotationPoint(-7F, 8F, -8F);

        bodyModel[259].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 323 tank extra 1
        bodyModel[259].setRotationPoint(5F, 8F, -8F);

        bodyModel[260].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.5F, 0F, 0F, -1F, 0F, -3F, -2F, 0F, 2F, 0F, 0F, -1F, -0.5F, 0F, 0F, -1F, 0F, -3F, -2F, 0F, 2F, 0F, 0F, -1F); // Box 304
        bodyModel[260].setRotationPoint(28F, -12F, -7F);

        bodyModel[261].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -1F, -2F, 0F, 2F, -1F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 2F, -1F, 0F, -3F, -0.5F, 0F, 0F); // Box 305
        bodyModel[261].setRotationPoint(28F, -12F, 6F);

        bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
        bodyModel[262].setRotationPoint(3F, -24F, 8F);

        bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
        bodyModel[263].setRotationPoint(3F, -24.5F, 8F);

        bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
        bodyModel[264].setRotationPoint(3F, -24.5F, 8F);

        bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
        bodyModel[265].setRotationPoint(3F, -24.5F, 8F);

        bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
        bodyModel[266].setRotationPoint(3F, -24.5F, 8F);

        bodyModel[267].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 311 support cull
        bodyModel[267].setRotationPoint(3F, -23F, 7F);

        bodyModel[268].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 339 cull crossover
        bodyModel[268].setRotationPoint(-34.5F, 0F, -2F);
        bodyModel[268].rotateAngleZ = -1.48352986F;

        bodyModel[269].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 328 cull crossover
        bodyModel[269].setRotationPoint(33.5F, 0F, 2F);
        bodyModel[269].rotateAngleY = -3.14159265F;
        bodyModel[269].rotateAngleZ = -1.48352986F;

        bodyModel[270].addShapeBox(-5F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 314 cull crossover
        bodyModel[270].setRotationPoint(33.5F, 0F, 2F);
        bodyModel[270].rotateAngleY = -3.14159265F;
        bodyModel[270].rotateAngleZ = -1.48352986F;

        bodyModel[271].addShapeBox(-5F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 315 cull crossover
        bodyModel[271].setRotationPoint(-34.5F, 0F, -2F);
        bodyModel[271].rotateAngleZ = -1.48352986F;

        bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1537 gyralight FU
        bodyModel[272].setRotationPoint(-31.5F, -19F, -2F);

        bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1538 gyralight FU
        bodyModel[273].setRotationPoint(-31.5F, -19F, 0F);

        bodyModel[274].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 242 ane light mount
        bodyModel[274].setRotationPoint(-31.25F, -19F, -2F);

        bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1537 gyralight RU
        bodyModel[275].setRotationPoint(29.5F, -19F, -2F);

        bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1537 gyralight RU
        bodyModel[276].setRotationPoint(29.5F, -19F, 0F);

        bodyModel[277].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 242 ane light mount
        bodyModel[277].setRotationPoint(28.25F, -19F, -2F);

        bodyModel[278].addBox(0F, 0F, 0F, 4, 2, 6, 0F); // Box 322 AC's industrial railroading
        bodyModel[278].setRotationPoint(2F, -24.5F, -3F);

        bodyModel[279].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 0F, 0F, -3.5F, 6F, 0F, -3.5F, 6F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, -0.5F, 0F, 0F); // Box 323
        bodyModel[279].setRotationPoint(-8F, -8F, -11F);

        bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 317
        bodyModel[280].setRotationPoint(-2.5F, -11F, -11F);

        bodyModel[281].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 0F, 0F, -3.5F, 6F, 0F, -3.5F, 6F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, -0.5F, 0F, 0F); // Box 318
        bodyModel[281].setRotationPoint(-7.5F, -5F, -11F);

        bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 319
        bodyModel[282].setRotationPoint(-9F, -8F, -11F);

        bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 320
        bodyModel[283].setRotationPoint(-8.5F, -5F, -11F);

        bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 330
        bodyModel[284].setRotationPoint(22F, -7F, -11.25F);

        bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
        bodyModel[285].setRotationPoint(-3.5F, -23.25F, 8F);

        bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
        bodyModel[286].setRotationPoint(-3.5F, -23.75F, 8F);

        bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
        bodyModel[287].setRotationPoint(-3.5F, -23.75F, 8F);

        bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
        bodyModel[288].setRotationPoint(-3.5F, -23.75F, 8F);

        bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
        bodyModel[289].setRotationPoint(-3.5F, -23.75F, 8F);

        bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 277 support
        bodyModel[290].setRotationPoint(9.5F, -22.25F, -10F);

        bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
        bodyModel[291].setRotationPoint(9.5F, -23.25F, -10F);

        bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
        bodyModel[292].setRotationPoint(9.5F, -23.75F, -10F);

        bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
        bodyModel[293].setRotationPoint(9.5F, -23.75F, -10F);

        bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
        bodyModel[294].setRotationPoint(9.5F, -23.75F, -10F);

        bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
        bodyModel[295].setRotationPoint(9.5F, -23.75F, -10F);

        bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 277 support
        bodyModel[296].setRotationPoint(-3.5F, -22.25F, 10F);

        bodyModel[297].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
        bodyModel[297].setRotationPoint(7F, -24F, 0F);

        bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
        bodyModel[298].setRotationPoint(22.5F, -6.5F, -11F);

        bodyModel[299].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 43
        bodyModel[299].setRotationPoint(23F, -4.5F, -11F);

        bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 348 stair cull
        bodyModel[300].setRotationPoint(-3.5F, -6F, -11F);

        bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 349 stair cull
        bodyModel[301].setRotationPoint(-5F, -4F, -11F);

        bodyModel[302].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 350 stair cull
        bodyModel[302].setRotationPoint(-6.5F, -2F, -11F);

        bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 358 stair cull
        bodyModel[303].setRotationPoint(9.5F, -6F, 7F);

        bodyModel[304].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 359 stair cull
        bodyModel[304].setRotationPoint(11F, -4F, 7F);

        bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 360 stair cull
        bodyModel[305].setRotationPoint(12.5F, -2F, 7F);

        bodyModel[306].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,-3.5F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 6F, 0F, -3F, -6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -6F, 0F); // Box 352
        bodyModel[306].setRotationPoint(7.5F, -5F, 11F);

        bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 353
        bodyModel[307].setRotationPoint(15.5F, -5F, 11F);

        bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 354
        bodyModel[308].setRotationPoint(16F, -8F, 11F);

        bodyModel[309].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,-3.5F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 6F, 0F, -3F, -6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -6F, 0F); // Box 355
        bodyModel[309].setRotationPoint(8F, -8F, 11F);

        bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
        bodyModel[310].setRotationPoint(10F, -14F, 11F);

        bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 357
        bodyModel[311].setRotationPoint(9.5F, -11F, 11F);

        bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 359
        bodyModel[312].setRotationPoint(-36F, -1F, -4F);

        bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 360
        bodyModel[313].setRotationPoint(34F, -1F, 2F);

        bodyModel[314].addBox(0F, 0F, 0F, 3, 5, 2, 0F); // Box 361 sps stack
        bodyModel[314].setRotationPoint(-5F, -23.5F, -1F);

        bodyModel[315].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 380
        bodyModel[315].setRotationPoint(-4F, -21.75F, -11F);

        bodyModel[316].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 381
        bodyModel[316].setRotationPoint(-4F, -23.25F, -9F);

        bodyModel[317].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 382
        bodyModel[317].setRotationPoint(-3F, -22.5F, -10F);

        bodyModel[318].addBox(0F, -0.5F, -1.5F, 1, 1, 3, 0F); // Box 295
        bodyModel[318].setRotationPoint(-2.5F, -21.5F, -9.25F);
        bodyModel[318].rotateAngleX = 0.66322512F;

        bodyModel[319].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
        bodyModel[319].setRotationPoint(3F, -24F, -1F);

        bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME5-1
        bodyModel[320].setRotationPoint(3F, -24.5F, -1F);

        bodyModel[321].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME5-3
        bodyModel[321].setRotationPoint(3F, -24.5F, -1F);

        bodyModel[322].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME5-2
        bodyModel[322].setRotationPoint(3F, -24.5F, -1F);

        bodyModel[323].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME5-4
        bodyModel[323].setRotationPoint(3F, -24.5F, -1F);

        bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
        bodyModel[324].setRotationPoint(0F, -24F, -0.5F);

        bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
        bodyModel[325].setRotationPoint(0F, -25F, -0.5F);

        bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
        bodyModel[326].setRotationPoint(10F, -24F, -0.5F);

        bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
        bodyModel[327].setRotationPoint(10F, -25F, -0.5F);

        bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 380
        bodyModel[328].setRotationPoint(-3F, -18F, -1.5F);

        bodyModel[329].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 381
        bodyModel[329].setRotationPoint(30F, 4F, -9F);

        bodyModel[330].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
        bodyModel[330].setRotationPoint(30F, 5F, -10F);

        bodyModel[331].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 383
        bodyModel[331].setRotationPoint(30F, 7F, -9F);

        bodyModel[332].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
        bodyModel[332].setRotationPoint(30F, 8F, -11F);

        bodyModel[333].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 385
        bodyModel[333].setRotationPoint(30F, 2.5F, -9F);

        bodyModel[334].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 386
        bodyModel[334].setRotationPoint(31F, 1.5F, -8F);

        bodyModel[335].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
        bodyModel[335].setRotationPoint(31F, 0F, -8F);

        bodyModel[336].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 388
        bodyModel[336].setRotationPoint(30F, 8F, 9F);

        bodyModel[337].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 389
        bodyModel[337].setRotationPoint(30F, 7F, 9F);

        bodyModel[338].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 390
        bodyModel[338].setRotationPoint(30F, 5F, 9F);

        bodyModel[339].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 391
        bodyModel[339].setRotationPoint(30F, 4F, 9F);

        bodyModel[340].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
        bodyModel[340].setRotationPoint(30F, 2.5F, 8F);

        bodyModel[341].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 393
        bodyModel[341].setRotationPoint(31F, 1.5F, 8F);

        bodyModel[342].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 394
        bodyModel[342].setRotationPoint(31F, 0F, 7F);

        bodyModel[343].addShapeBox(0F, 0F, 0F, 11, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 500
        bodyModel[343].setRotationPoint(15F, -17.75F, -2F);

        bodyModel[344].addShapeBox(0F, 0F, 0F, 8, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 1542
        bodyModel[344].setRotationPoint(18F, -9F, 6.05F);

        bodyModel[345].addShapeBox(0F, 0F, 0F, 10, 1, 24, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 394
        bodyModel[345].setRotationPoint(15.5F, -17.25F, -12F);

        bodyModel[346].addShapeBox(0F, 0F, 0F, 8, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 304
        bodyModel[346].setRotationPoint(18F, -9F, -7.05F);
    }
    ModelTypeBnew typeB2 = new ModelTypeBnew();
    ModelHiAd hiAd = new ModelHiAd();

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        for (int i = 0; i < 346; i++) {
            if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
                Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                bodyModel[i].render(f5);
                Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
            } else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
                GL11.glDisable(GL11.GL_CULL_FACE);
                bodyModel[i].render(f5);
                GL11.glEnable(GL11.GL_CULL_FACE);
            } else {
                bodyModel[i].render(f5);
            }
        }
        if (entity instanceof AbstractTrains && AbstractTrains.getColorFromString(((AbstractTrains) entity).getColor()) == 135461 || entity instanceof AbstractTrains && AbstractTrains.getColorFromString(((AbstractTrains) entity).getColor()) == 7234 || entity instanceof AbstractTrains && AbstractTrains.getColorFromString(((AbstractTrains) entity).getColor()) == 8546 || entity instanceof AbstractTrains && AbstractTrains.getColorFromString(((AbstractTrains) entity).getColor()) == 5546) {
            Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
            GL11.glPushMatrix();
            GL11.glTranslated(-1.2, -0.06, 0);
            typeB2.render(entity, f, f1, f2, f3, f4, f5);

            GL11.glTranslated(2.35, 0, 0);
            typeB2.render(entity, f, f1, f2, f3, f4, f5);
            GL11.glPopMatrix();
        } else if (entity instanceof AbstractTrains && AbstractTrains.getColorFromString(((AbstractTrains) entity).getColor()) == 3 || entity instanceof AbstractTrains && AbstractTrains.getColorFromString(((AbstractTrains) entity).getColor()) == 2 || entity instanceof AbstractTrains && AbstractTrains.getColorFromString(((AbstractTrains) entity).getColor()) == 11) {
            Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/HiAd_Black.png"));
            GL11.glPushMatrix();
            GL11.glTranslated(-1.2, 0.0, 0);
            hiAd.render(entity, f, f1, f2, f3, f4, f5);

            GL11.glTranslated(2.33, 0, 0);
            hiAd.render(entity, f, f1, f2, f3, f4, f5);
            GL11.glPopMatrix();
        } else if (entity instanceof AbstractTrains && AbstractTrains.getColorFromString(((AbstractTrains) entity).getColor()) == 13244 || entity instanceof AbstractTrains && AbstractTrains.getColorFromString(((AbstractTrains) entity).getColor()) == 145) {
            Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/HiAd_Silver.png"));
            GL11.glPushMatrix();
            GL11.glTranslated(-1.2, 0.0, 0);
            hiAd.render(entity, f, f1, f2, f3, f4, f5);

            GL11.glTranslated(2.33, 0, 0);
            hiAd.render(entity, f, f1, f2, f3, f4, f5);
            GL11.glPopMatrix();
        } else {
            Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
            GL11.glPushMatrix();
            GL11.glTranslated(-1.2, -0.01, 0);
            typeB2.render(entity, f, f1, f2, f3, f4, f5);

            GL11.glTranslated(2.35, 0, 0);
            typeB2.render(entity, f, f1, f2, f3, f4, f5);
            GL11.glPopMatrix();
        }
    }

    public float[] getTrans() {
        return new float[]{-1.2F, 0.15F, 0.00F};
    }

    public ArrayList<double[]> getSmokePosition() {
        return new ArrayList<double[]>() {
            {
                add(new double[]{1.77D, 1.45D, 0.0D});
            }
        };
    }
}