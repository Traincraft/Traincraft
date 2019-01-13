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
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelEMDF7B extends ModelBase
{
    int textureX = 256;
    int textureY = 256;

    public ModelEMDF7B()
    {
        emdf7bModel = new ModelRendererTurbo[101];
        emdf7bModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 002
        emdf7bModel[1] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 020
        emdf7bModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 065
        emdf7bModel[3] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 066
        emdf7bModel[4] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 072
        emdf7bModel[5] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 096
        emdf7bModel[6] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 107
        emdf7bModel[7] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 108
        emdf7bModel[8] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 168
        emdf7bModel[9] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 170
        emdf7bModel[10] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 344
        emdf7bModel[11] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 354
        emdf7bModel[12] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 221
        emdf7bModel[13] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 222
        emdf7bModel[14] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 223
        emdf7bModel[15] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 224
        emdf7bModel[16] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 225
        emdf7bModel[17] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 226
        emdf7bModel[18] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 227
        emdf7bModel[19] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 168
        emdf7bModel[20] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 169
        emdf7bModel[21] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 170
        emdf7bModel[22] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 171
        emdf7bModel[23] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 172
        emdf7bModel[24] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 173
        emdf7bModel[25] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 174
        emdf7bModel[26] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 175
        emdf7bModel[27] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 176
        emdf7bModel[28] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 177
        emdf7bModel[29] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 178
        emdf7bModel[30] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 179
        emdf7bModel[31] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 180
        emdf7bModel[32] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 181
        emdf7bModel[33] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 182
        emdf7bModel[34] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 186
        emdf7bModel[35] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 187
        emdf7bModel[36] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 188
        emdf7bModel[37] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 189
        emdf7bModel[38] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 190
        emdf7bModel[39] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 191
        emdf7bModel[40] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 192
        emdf7bModel[41] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 201
        emdf7bModel[42] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 203
        emdf7bModel[43] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 204
        emdf7bModel[44] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 210
        emdf7bModel[45] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 164
        emdf7bModel[46] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 165
        emdf7bModel[47] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 167
        emdf7bModel[48] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 169
        emdf7bModel[49] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 170
        emdf7bModel[50] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 171
        emdf7bModel[51] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 172
        emdf7bModel[52] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 173
        emdf7bModel[53] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 174
        emdf7bModel[54] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 175
        emdf7bModel[55] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 176
        emdf7bModel[56] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 177
        emdf7bModel[57] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 178
        emdf7bModel[58] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 179
        emdf7bModel[59] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 180
        emdf7bModel[60] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 181
        emdf7bModel[61] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 182
        emdf7bModel[62] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 183
        emdf7bModel[63] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 184
        emdf7bModel[64] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 185
        emdf7bModel[65] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 187
        emdf7bModel[66] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 188
        emdf7bModel[67] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 189
        emdf7bModel[68] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 190
        emdf7bModel[69] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 192
        emdf7bModel[70] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 193
        emdf7bModel[71] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 196
        emdf7bModel[72] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 197
        emdf7bModel[73] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 198
        emdf7bModel[74] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 199
        emdf7bModel[75] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 200
        emdf7bModel[76] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 201
        emdf7bModel[77] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 202
        emdf7bModel[78] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 203
        emdf7bModel[79] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 204
        emdf7bModel[80] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 205
        emdf7bModel[81] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 206
        emdf7bModel[82] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 207
        emdf7bModel[83] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 208
        emdf7bModel[84] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 209
        emdf7bModel[85] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 210
        emdf7bModel[86] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 211
        emdf7bModel[87] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 212
        emdf7bModel[88] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 213
        emdf7bModel[89] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 214
        emdf7bModel[90] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 215
        emdf7bModel[91] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 96
        emdf7bModel[92] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 97
        emdf7bModel[93] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 98
        emdf7bModel[94] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 99
        emdf7bModel[95] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 100
        emdf7bModel[96] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 101
        emdf7bModel[97] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 102
        emdf7bModel[98] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 103
        emdf7bModel[99] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 104
        emdf7bModel[100] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 105

        emdf7bModel[0].addBox(0F, 0F, -11F, 78, 24, 22, 0F); // Box 002
        emdf7bModel[0].setRotationPoint(-39F, -22F, 0F);

        emdf7bModel[1].addBox(0F, 0F, -11F, 38, 3, 18, 0F); // Box 020
        emdf7bModel[1].setRotationPoint(-19F, 2F, 2F);

        emdf7bModel[2].addBox(0F, 0F, -1.5F, 1, 2, 3, 0F); // Box 065
        emdf7bModel[2].setRotationPoint(-2F, -26.75F, 0F);

        emdf7bModel[3].addBox(0F, 0F, -1.5F, 1, 2, 3, 0F); // Box 066
        emdf7bModel[3].setRotationPoint(10F, -26.75F, 0F);

        emdf7bModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 072
        emdf7bModel[4].setRotationPoint(-6F, -25.75F, -2F);

        emdf7bModel[5].addShapeBox(0F, 0F, -10F, 78, 1, 18, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 096
        emdf7bModel[5].setRotationPoint(-39F, -23F, 1F);

        emdf7bModel[6].addShapeBox(0F, 0F, 0F, 78, 1, 2, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 107
        emdf7bModel[6].setRotationPoint(-39F, -24.25F, -5F);

        emdf7bModel[7].addShapeBox(0F, 0F, 0F, 78, 1, 2, 0F, 0F, -0.65F, -2F, 0F, -0.65F, -2F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 108
        emdf7bModel[7].setRotationPoint(-39F, -25.5F, -5F);

        emdf7bModel[8].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 168
        emdf7bModel[8].setRotationPoint(27F, 2F, -11F);

        emdf7bModel[9].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 170
        emdf7bModel[9].setRotationPoint(30F, 2F, -11F);

        emdf7bModel[10].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 344
        emdf7bModel[10].setRotationPoint(31F, -11F, 10.5F);

        emdf7bModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
        emdf7bModel[11].setRotationPoint(28F, 3.5F, -11.5F);

        emdf7bModel[12].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 221
        emdf7bModel[12].setRotationPoint(26.75F, -11F, 10.5F);

        emdf7bModel[13].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 222
        emdf7bModel[13].setRotationPoint(26.75F, -11F, -12.5F);

        emdf7bModel[14].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 223
        emdf7bModel[14].setRotationPoint(31F, -11F, -12.5F);

        emdf7bModel[15].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 224
        emdf7bModel[15].setRotationPoint(37.5F, -7F, -12.5F);

        emdf7bModel[16].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 225
        emdf7bModel[16].setRotationPoint(35.5F, -7F, -12.5F);

        emdf7bModel[17].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 226
        emdf7bModel[17].setRotationPoint(35.5F, -7F, 10.5F);

        emdf7bModel[18].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 227
        emdf7bModel[18].setRotationPoint(37.5F, -7F, 10.5F);

        emdf7bModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 168
        emdf7bModel[19].setRotationPoint(-6F, -25.75F, 0F);

        emdf7bModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
        emdf7bModel[20].setRotationPoint(-8F, -25.75F, -2F);

        emdf7bModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 170
        emdf7bModel[21].setRotationPoint(-8F, -25.75F, 0F);

        emdf7bModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 171
        emdf7bModel[22].setRotationPoint(0F, -25.75F, 0F);

        emdf7bModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
        emdf7bModel[23].setRotationPoint(0F, -25.75F, -2F);

        emdf7bModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 173
        emdf7bModel[24].setRotationPoint(2F, -25.75F, 0F);

        emdf7bModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
        emdf7bModel[25].setRotationPoint(2F, -25.75F, -2F);

        emdf7bModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 175
        emdf7bModel[26].setRotationPoint(5F, -25.75F, 0F);

        emdf7bModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
        emdf7bModel[27].setRotationPoint(5F, -25.75F, -2F);

        emdf7bModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 177
        emdf7bModel[28].setRotationPoint(7F, -25.75F, 0F);

        emdf7bModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
        emdf7bModel[29].setRotationPoint(7F, -25.75F, -2F);

        emdf7bModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 179
        emdf7bModel[30].setRotationPoint(13F, -25.75F, 0F);

        emdf7bModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
        emdf7bModel[31].setRotationPoint(13F, -25.75F, -2F);

        emdf7bModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 181
        emdf7bModel[32].setRotationPoint(15F, -25.75F, 0F);

        emdf7bModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
        emdf7bModel[33].setRotationPoint(15F, -25.75F, -2F);

        emdf7bModel[34].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F, 0F, -0.5F, 0F, -9F, -0.5F, 0F, -9F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, -9F, -3F, 0F, -9F, -3F, 0F, 0F, -3F, 0F); // Box 186
        emdf7bModel[34].setRotationPoint(27.5F, -1F, 11F);

        emdf7bModel[35].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F, 0F, -0.5F, 0F, -9F, -0.5F, 0F, -9F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, -9F, -3F, 0F, -9F, -3F, 0F, 0F, -3F, 0F); // Box 187
        emdf7bModel[35].setRotationPoint(27.5F, -1F, -12F);

        emdf7bModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
        emdf7bModel[36].setRotationPoint(28F, 6F, -11.5F);

        emdf7bModel[37].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 189
        emdf7bModel[37].setRotationPoint(27F, 2F, 10F);

        emdf7bModel[38].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 190
        emdf7bModel[38].setRotationPoint(30F, 2F, 10F);

        emdf7bModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
        emdf7bModel[39].setRotationPoint(28F, 3.5F, 10.5F);

        emdf7bModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
        emdf7bModel[40].setRotationPoint(28F, 6F, 10.5F);

        emdf7bModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
        emdf7bModel[41].setRotationPoint(39F, 0F, -6F);

        emdf7bModel[42].addShapeBox(0F, 0F, -11F, 38, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 203
        emdf7bModel[42].setRotationPoint(-19F, 5F, 2F);

        emdf7bModel[43].addShapeBox(0F, 0F, -11F, 38, 1, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 204
        emdf7bModel[43].setRotationPoint(-19F, 6F, 2.5F);

        emdf7bModel[44].addShapeBox(0F, 0F, 0F, 78, 1, 2, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
        emdf7bModel[44].setRotationPoint(-39F, -23F, -11F);

        emdf7bModel[45].addShapeBox(0F, 0F, 0F, 78, 1, 2, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, -2F, 0F, -0.65F, -2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 164
        emdf7bModel[45].setRotationPoint(-39F, -25.5F, 3F);

        emdf7bModel[46].addBox(0F, 0F, -10F, 78, 1, 10, 0F); // Box 165
        emdf7bModel[46].setRotationPoint(-39F, -24.25F, 5F);

        emdf7bModel[47].addShapeBox(0F, 0F, 0F, 78, 1, 6, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 167
        emdf7bModel[47].setRotationPoint(-39F, -25.5F, -3F);

        emdf7bModel[48].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 169
        emdf7bModel[48].setRotationPoint(-28F, 2F, -11F);

        emdf7bModel[49].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 170
        emdf7bModel[49].setRotationPoint(-27F, -11F, -12.5F);

        emdf7bModel[50].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F, 0F, -0.5F, 0F, -9F, -0.5F, 0F, -9F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, -9F, -3F, 0F, -9F, -3F, 0F, 0F, -3F, 0F); // Box 171
        emdf7bModel[50].setRotationPoint(-30.5F, -1F, -12F);

        emdf7bModel[51].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 172
        emdf7bModel[51].setRotationPoint(-31.25F, -11F, -12.5F);

        emdf7bModel[52].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 173
        emdf7bModel[52].setRotationPoint(-31F, 2F, -11F);

        emdf7bModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
        emdf7bModel[53].setRotationPoint(-30F, 3.5F, -11.5F);

        emdf7bModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
        emdf7bModel[54].setRotationPoint(-30F, 6F, -11.5F);

        emdf7bModel[55].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 176
        emdf7bModel[55].setRotationPoint(-37.5F, -7F, -12.5F);

        emdf7bModel[56].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 177
        emdf7bModel[56].setRotationPoint(-35.5F, -7F, -12.5F);

        emdf7bModel[57].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 178
        emdf7bModel[57].setRotationPoint(-28F, 2F, 10F);

        emdf7bModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
        emdf7bModel[58].setRotationPoint(-30F, 6F, 10.5F);

        emdf7bModel[59].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 180
        emdf7bModel[59].setRotationPoint(-31F, 2F, 10F);

        emdf7bModel[60].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F, 0F, -0.5F, 0F, -9F, -0.5F, 0F, -9F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, -9F, -3F, 0F, -9F, -3F, 0F, 0F, -3F, 0F); // Box 181
        emdf7bModel[60].setRotationPoint(-30.5F, -1F, 11F);

        emdf7bModel[61].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 182
        emdf7bModel[61].setRotationPoint(-31.25F, -11F, 10.5F);

        emdf7bModel[62].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 183
        emdf7bModel[62].setRotationPoint(-27F, -11F, 10.5F);

        emdf7bModel[63].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 184
        emdf7bModel[63].setRotationPoint(-37.5F, -7F, 10.5F);

        emdf7bModel[64].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 185
        emdf7bModel[64].setRotationPoint(-35.5F, -7F, 10.5F);

        emdf7bModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
        emdf7bModel[65].setRotationPoint(-30F, 3.5F, 10.5F);

        emdf7bModel[66].addShapeBox(0F, 0F, 0F, 1, 18, 2, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
        emdf7bModel[66].setRotationPoint(-40F, -18F, 4F);

        emdf7bModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        emdf7bModel[67].setRotationPoint(-40F, 0F, -6F);

        emdf7bModel[68].addShapeBox(0F, 0F, 0F, 1, 18, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
        emdf7bModel[68].setRotationPoint(-40F, -18F, -6F);

        emdf7bModel[69].addShapeBox(0F, 0F, 0F, 78, 1, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 192
        emdf7bModel[69].setRotationPoint(-39F, -24.25F, 3F);

        emdf7bModel[70].addShapeBox(0F, 0F, 0F, 78, 1, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
        emdf7bModel[70].setRotationPoint(-39F, -23F, 9F);

        emdf7bModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 196
        emdf7bModel[71].setRotationPoint(-21F, -25.75F, 0F);

        emdf7bModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 197
        emdf7bModel[72].setRotationPoint(-18F, -25.75F, 0F);

        emdf7bModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
        emdf7bModel[73].setRotationPoint(-21F, -25.75F, -3F);

        emdf7bModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
        emdf7bModel[74].setRotationPoint(-18F, -25.75F, -3F);

        emdf7bModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
        emdf7bModel[75].setRotationPoint(-37F, 3.5F, 10.5F);

        emdf7bModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
        emdf7bModel[76].setRotationPoint(-37F, 6F, 10.5F);

        emdf7bModel[77].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 202
        emdf7bModel[77].setRotationPoint(-38F, 2F, 10F);

        emdf7bModel[78].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 203
        emdf7bModel[78].setRotationPoint(-35F, 2F, 10F);

        emdf7bModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
        emdf7bModel[79].setRotationPoint(36F, 3.5F, 10.5F);

        emdf7bModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
        emdf7bModel[80].setRotationPoint(36F, 6F, 10.5F);

        emdf7bModel[81].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 206
        emdf7bModel[81].setRotationPoint(35F, 2F, 10F);

        emdf7bModel[82].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 207
        emdf7bModel[82].setRotationPoint(38F, 2F, 10F);

        emdf7bModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
        emdf7bModel[83].setRotationPoint(-37F, 3.5F, -11.5F);

        emdf7bModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
        emdf7bModel[84].setRotationPoint(-37F, 6F, -11.5F);

        emdf7bModel[85].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 210
        emdf7bModel[85].setRotationPoint(-38F, 2F, -11F);

        emdf7bModel[86].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 211
        emdf7bModel[86].setRotationPoint(-35F, 2F, -11F);

        emdf7bModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
        emdf7bModel[87].setRotationPoint(36F, 3.5F, -11.5F);

        emdf7bModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
        emdf7bModel[88].setRotationPoint(36F, 6F, -11.5F);

        emdf7bModel[89].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 214
        emdf7bModel[89].setRotationPoint(35F, 2F, -11F);

        emdf7bModel[90].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 215
        emdf7bModel[90].setRotationPoint(38F, 2F, -11F);

        emdf7bModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 96
        emdf7bModel[91].setRotationPoint(-40F, -20F, -6F);

        emdf7bModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 97
        emdf7bModel[92].setRotationPoint(-40F, -21F, -1F);

        emdf7bModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
        emdf7bModel[93].setRotationPoint(-40F, -20F, 1F);

        emdf7bModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
        emdf7bModel[94].setRotationPoint(-40F, -21F, 0F);

        emdf7bModel[95].addShapeBox(0F, 0F, 0F, 1, 18, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
        emdf7bModel[95].setRotationPoint(39F, -18F, -6F);

        emdf7bModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 101
        emdf7bModel[96].setRotationPoint(39F, -20F, -6F);

        emdf7bModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 102
        emdf7bModel[97].setRotationPoint(39F, -21F, -1F);

        emdf7bModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
        emdf7bModel[98].setRotationPoint(39F, -20F, 1F);

        emdf7bModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
        emdf7bModel[99].setRotationPoint(39F, -21F, 0F);

        emdf7bModel[100].addShapeBox(0F, 0F, 0F, 1, 18, 2, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
        emdf7bModel[100].setRotationPoint(39F, -18F, 4F);


    }


    private ModelBloombergTrucks fronttrucks = new ModelBloombergTrucks();
    private ModelBloombergTrucks backtrucks = new ModelBloombergTrucks();
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 101; i++)
        {
            emdf7bModel[i].render(f5);
        }
        GL11.glPushMatrix();
        Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/trains/Blomberg_b_trucks.png"));
        GL11.glTranslated(-1.8,0,0);
        GL11.glScalef(0.9F, 0.9F, 0.9F);
        fronttrucks.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/trains/Blomberg_b_trucks.png"));
        GL11.glTranslated(1.8,0,0);
        GL11.glScalef(0.9F, 0.9F, 0.9F);
        backtrucks.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo emdf7bModel[];
}
