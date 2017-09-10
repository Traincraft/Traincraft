
package train.client.render.models;

import net.minecraft.entity.Entity;
import train.client.tmt.ModelBase;
import train.client.tmt.ModelRendererTurbo;

public class ModelBloombergTrucks extends ModelBase
{
    int textureX = 64;
    int textureY = 128;

    public ModelBloombergTrucks()
    {
        bloombergtrucksModel = new ModelRendererTurbo[55];
        bloombergtrucksModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
        bloombergtrucksModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 3
        bloombergtrucksModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 4
        bloombergtrucksModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
        bloombergtrucksModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 6
        bloombergtrucksModel[5] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 22
        bloombergtrucksModel[6] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 23
        bloombergtrucksModel[7] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 24
        bloombergtrucksModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 25
        bloombergtrucksModel[9] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 26
        bloombergtrucksModel[10] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 27
        bloombergtrucksModel[11] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 28
        bloombergtrucksModel[12] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 29
        bloombergtrucksModel[13] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 30
        bloombergtrucksModel[14] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 31
        bloombergtrucksModel[15] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 55
        bloombergtrucksModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 57
        bloombergtrucksModel[17] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 58
        bloombergtrucksModel[18] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 59
        bloombergtrucksModel[19] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 60
        bloombergtrucksModel[20] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 61
        bloombergtrucksModel[21] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 62
        bloombergtrucksModel[22] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 63
        bloombergtrucksModel[23] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 64
        bloombergtrucksModel[24] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 65
        bloombergtrucksModel[25] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 66
        bloombergtrucksModel[26] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 67
        bloombergtrucksModel[27] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 68
        bloombergtrucksModel[28] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 69
        bloombergtrucksModel[29] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 70
        bloombergtrucksModel[30] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 71
        bloombergtrucksModel[31] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 72
        bloombergtrucksModel[32] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 73
        bloombergtrucksModel[33] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 74
        bloombergtrucksModel[34] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 75
        bloombergtrucksModel[35] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 76
        bloombergtrucksModel[36] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 77
        bloombergtrucksModel[37] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 78
        bloombergtrucksModel[38] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 79
        bloombergtrucksModel[39] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 80
        bloombergtrucksModel[40] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 81
        bloombergtrucksModel[41] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 82
        bloombergtrucksModel[42] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 83
        bloombergtrucksModel[43] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 84
        bloombergtrucksModel[44] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 85
        bloombergtrucksModel[45] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 86
        bloombergtrucksModel[46] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 87
        bloombergtrucksModel[47] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 88
        bloombergtrucksModel[48] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 90
        bloombergtrucksModel[49] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 93
        bloombergtrucksModel[50] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 94
        bloombergtrucksModel[51] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 95
        bloombergtrucksModel[52] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 55
        bloombergtrucksModel[53] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 56
        bloombergtrucksModel[54] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 57

        bloombergtrucksModel[0].addShapeBox(-3F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
        bloombergtrucksModel[0].setRotationPoint(0F, -7F, 6F);

        bloombergtrucksModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, -0.5F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 3
        bloombergtrucksModel[1].setRotationPoint(0F, -8F, 0F);

        bloombergtrucksModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, -0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
        bloombergtrucksModel[2].setRotationPoint(0F, -8F, -2F);

        bloombergtrucksModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0.1F, -0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
        bloombergtrucksModel[3].setRotationPoint(-2F, -8F, -2F);

        bloombergtrucksModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 6
        bloombergtrucksModel[4].setRotationPoint(-2F, -8F, 0F);

        bloombergtrucksModel[5].addShapeBox(-3F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.35F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0.35F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0.35F, 0F); // Box 22
        bloombergtrucksModel[5].setRotationPoint(-3F, -7F, 6F);

        bloombergtrucksModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.1F, 0F, -1.35F, -0.1F, 0F, -1.35F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
        bloombergtrucksModel[6].setRotationPoint(-7F, -8F, 6F);

        bloombergtrucksModel[7].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
        bloombergtrucksModel[7].setRotationPoint(-11F, -8F, 6F);

        bloombergtrucksModel[8].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.35F, -0.1F, 0F, 0.35F, -0.1F, 0F, 0.35F, 0F, 0F, 0.35F, 0F); // Box 25
        bloombergtrucksModel[8].setRotationPoint(-12F, -7F, 6F);

        bloombergtrucksModel[9].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -0.3F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, 0F, -0.3F, 0F, 0F); // Box 26
        bloombergtrucksModel[9].setRotationPoint(-8F, -5F, 6F);

        bloombergtrucksModel[10].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0.3F, -0.35F, -0.1F, 0.3F, -0.35F, -0.1F, 0.3F, -0.35F, 0F, 0.3F, -0.35F, 0F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 27
        bloombergtrucksModel[10].setRotationPoint(-10F, -5F, 6F);

        bloombergtrucksModel[11].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, -0.35F, -0.1F, -0.3F, -0.35F, -0.1F, -0.3F, -0.35F, 0F, 0F, -0.35F, 0F, -1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0F, -1F, 0F, 0F); // Box 28
        bloombergtrucksModel[11].setRotationPoint(-12F, -5F, 6F);

        bloombergtrucksModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 29
        bloombergtrucksModel[12].setRotationPoint(-13F, -6F, 6F);

        bloombergtrucksModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, -2F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 30
        bloombergtrucksModel[13].setRotationPoint(-13F, -8F, 6F);

        bloombergtrucksModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F, 0F, -1F, -0.6F, 0F); // Box 31
        bloombergtrucksModel[14].setRotationPoint(-13F, -5F, 6F);

        bloombergtrucksModel[15].addShapeBox(0F, 0F, -6F, 1, 1, 12, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 55
        bloombergtrucksModel[15].setRotationPoint(-9.5F, -3.75F, 0F);

        bloombergtrucksModel[16].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.35F, -0.1F, 0F, 0.35F, -0.1F, 0F, 0.35F, 0F, 0F, 0.35F, 0F); // Box 57
        bloombergtrucksModel[16].setRotationPoint(6F, -7F, 6F);

        bloombergtrucksModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 58
        bloombergtrucksModel[17].setRotationPoint(12F, -6F, 6F);

        bloombergtrucksModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.5F, -0.1F, -0.5F, -2F, -0.1F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 59
        bloombergtrucksModel[18].setRotationPoint(11F, -8F, 6F);

        bloombergtrucksModel[19].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
        bloombergtrucksModel[19].setRotationPoint(7F, -8F, 6F);

        bloombergtrucksModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1.35F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, 0F, 0F, -1.35F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
        bloombergtrucksModel[20].setRotationPoint(6F, -8F, 6F);

        bloombergtrucksModel[21].addShapeBox(-3F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0.35F, -0.1F, 0F, 0.35F, 0F, 0F, 0F, 0F); // Box 62
        bloombergtrucksModel[21].setRotationPoint(6F, -7F, 6F);

        bloombergtrucksModel[22].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, -0.35F, -0.1F, -0.3F, -0.35F, -0.1F, -0.3F, -0.35F, 0F, 0F, -0.35F, 0F, -1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0F, -1F, 0F, 0F); // Box 63
        bloombergtrucksModel[22].setRotationPoint(6F, -5F, 6F);

        bloombergtrucksModel[23].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0.3F, -0.35F, -0.1F, 0.3F, -0.35F, -0.1F, 0.3F, -0.35F, 0F, 0.3F, -0.35F, 0F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 64
        bloombergtrucksModel[23].setRotationPoint(8F, -5F, 6F);

        bloombergtrucksModel[24].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -0.3F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, 0F, -0.3F, 0F, 0F); // Box 65
        bloombergtrucksModel[24].setRotationPoint(10F, -5F, 6F);

        bloombergtrucksModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.1F, -1F, -0.6F, -0.1F, -1F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 66
        bloombergtrucksModel[25].setRotationPoint(12F, -5F, 6F);

        bloombergtrucksModel[26].addShapeBox(-3F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 67
        bloombergtrucksModel[26].setRotationPoint(0F, -7F, -7F);

        bloombergtrucksModel[27].addShapeBox(-3F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -0.35F, -0.1F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0.35F, -0.1F); // Box 68
        bloombergtrucksModel[27].setRotationPoint(-3F, -7F, -7F);

        bloombergtrucksModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -1.35F, 0F, 0F, -1.35F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 69
        bloombergtrucksModel[28].setRotationPoint(-7F, -8F, -7F);

        bloombergtrucksModel[29].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 70
        bloombergtrucksModel[29].setRotationPoint(-11F, -8F, -7F);

        bloombergtrucksModel[30].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, -0.1F, 0F, 0.35F, -0.1F); // Box 71
        bloombergtrucksModel[30].setRotationPoint(-12F, -7F, -7F);

        bloombergtrucksModel[31].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -0.3F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.1F, -0.3F, -0.35F, -0.1F, -0.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.1F, -0.3F, 0F, -0.1F); // Box 72
        bloombergtrucksModel[31].setRotationPoint(-8F, -5F, -7F);

        bloombergtrucksModel[32].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0.3F, -0.35F, 0F, 0.3F, -0.35F, 0F, 0.3F, -0.35F, -0.1F, 0.3F, -0.35F, -0.1F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F); // Box 73
        bloombergtrucksModel[32].setRotationPoint(-10F, -5F, -7F);

        bloombergtrucksModel[33].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.1F, -1F, 0F, -0.1F); // Box 74
        bloombergtrucksModel[33].setRotationPoint(-12F, -5F, -7F);

        bloombergtrucksModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0.25F, 0F, -0.1F); // Box 75
        bloombergtrucksModel[34].setRotationPoint(-13F, -6F, -7F);

        bloombergtrucksModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.1F, -0.5F, -2F, -0.1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F); // Box 76
        bloombergtrucksModel[35].setRotationPoint(-13F, -8F, -7F);

        bloombergtrucksModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -1F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.1F, -1F, -0.6F, -0.1F); // Box 77
        bloombergtrucksModel[36].setRotationPoint(-13F, -5F, -7F);

        bloombergtrucksModel[37].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, -0.1F, 0F, 0.35F, -0.1F); // Box 78
        bloombergtrucksModel[37].setRotationPoint(6F, -7F, -7F);

        bloombergtrucksModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 79
        bloombergtrucksModel[38].setRotationPoint(12F, -6F, -7F);

        bloombergtrucksModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 80
        bloombergtrucksModel[39].setRotationPoint(11F, -8F, -7F);

        bloombergtrucksModel[40].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 81
        bloombergtrucksModel[40].setRotationPoint(7F, -8F, -7F);

        bloombergtrucksModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1.35F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.1F, 0F, -1.35F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 82
        bloombergtrucksModel[41].setRotationPoint(6F, -8F, -7F);

        bloombergtrucksModel[42].addShapeBox(-3F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, -0.1F, 0F, 0F, -0.1F); // Box 83
        bloombergtrucksModel[42].setRotationPoint(6F, -7F, -7F);

        bloombergtrucksModel[43].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.1F, -1F, 0F, -0.1F); // Box 84
        bloombergtrucksModel[43].setRotationPoint(6F, -5F, -7F);

        bloombergtrucksModel[44].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0.3F, -0.35F, 0F, 0.3F, -0.35F, 0F, 0.3F, -0.35F, -0.1F, 0.3F, -0.35F, -0.1F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F); // Box 85
        bloombergtrucksModel[44].setRotationPoint(8F, -5F, -7F);

        bloombergtrucksModel[45].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -0.3F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.1F, -0.3F, -0.35F, -0.1F, -0.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.1F, -0.3F, 0F, -0.1F); // Box 86
        bloombergtrucksModel[45].setRotationPoint(10F, -5F, -7F);

        bloombergtrucksModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.6F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, -0.1F, 0F, -0.6F, -0.1F); // Box 87
        bloombergtrucksModel[46].setRotationPoint(12F, -5F, -7F);

        bloombergtrucksModel[47].addShapeBox(0F, 0F, -6F, 1, 1, 12, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 88
        bloombergtrucksModel[47].setRotationPoint(8.5F, -3.75F, 0F);

        bloombergtrucksModel[48].addShapeBox(0F, 0F, 0F, 28, 28, 0, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, -21F, -21F, 0F, -21F, -21F, 0F, 0F, -21F, 0F); // Box 90
        bloombergtrucksModel[48].setRotationPoint(5.5F, -7F, 6F);

        bloombergtrucksModel[49].addShapeBox(0F, 0F, -6F, 1, 2, 12, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 93
        bloombergtrucksModel[49].setRotationPoint(2F, -7F, 0F);

        bloombergtrucksModel[50].addShapeBox(0F, 0F, -6F, 1, 2, 12, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 94
        bloombergtrucksModel[50].setRotationPoint(-3F, -7F, 0F);

        bloombergtrucksModel[51].addBox(0F, 0F, -3F, 4, 1, 6, 0F); // Box 95
        bloombergtrucksModel[51].setRotationPoint(-2F, -7F, 0F);

        bloombergtrucksModel[52].addShapeBox(0F, 0F, 0F, 28, 28, 0, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, -21F, -21F, 0F, -21F, -21F, 0F, 0F, -21F, 0F); // Box 55
        bloombergtrucksModel[52].setRotationPoint(5.5F, -7F, -6F);

        bloombergtrucksModel[53].addShapeBox(0F, 0F, 0F, 28, 28, 0, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, -21F, -21F, 0F, -21F, -21F, 0F, 0F, -21F, 0F); // Box 56
        bloombergtrucksModel[53].setRotationPoint(-12.5F, -7F, -6F);

        bloombergtrucksModel[54].addShapeBox(0F, 0F, 0F, 28, 28, 0, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, -21F, -21F, 0F, -21F, -21F, 0F, 0F, -21F, 0F); // Box 57
        bloombergtrucksModel[54].setRotationPoint(-12.5F, -7F, 6F);


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 55; i++)
        {
            bloombergtrucksModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo bloombergtrucksModel[];
}