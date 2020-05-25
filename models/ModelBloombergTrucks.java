
package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelBloombergTrucks extends ModelBase
{
    int textureX = 64;
    int textureY = 64;

    public ModelBloombergTrucks()
    {
        bloombergtrucksModel = new ModelRendererTurbo[48];
        bloombergtrucksModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        bloombergtrucksModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
        bloombergtrucksModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 2
        bloombergtrucksModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
        bloombergtrucksModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
        bloombergtrucksModel[5] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 5
        bloombergtrucksModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 6
        bloombergtrucksModel[7] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 7
        bloombergtrucksModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
        bloombergtrucksModel[9] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 9
        bloombergtrucksModel[10] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 10
        bloombergtrucksModel[11] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 11
        bloombergtrucksModel[12] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 12
        bloombergtrucksModel[13] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 14
        bloombergtrucksModel[14] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 15
        bloombergtrucksModel[15] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 16
        bloombergtrucksModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 17
        bloombergtrucksModel[17] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 18
        bloombergtrucksModel[18] = new ModelRendererTurbo(this, 58, 20, textureX, textureY); // Box 19
        bloombergtrucksModel[19] = new ModelRendererTurbo(this, 58, 28, textureX, textureY); // Box 20
        bloombergtrucksModel[20] = new ModelRendererTurbo(this, 40, 16, textureX, textureY); // Box 21
        bloombergtrucksModel[21] = new ModelRendererTurbo(this, 58, 25, textureX, textureY); // Box 24
        bloombergtrucksModel[22] = new ModelRendererTurbo(this, 32, 16, textureX, textureY); // Box 25
        bloombergtrucksModel[23] = new ModelRendererTurbo(this, 1, 30, textureX, textureY); // Box 26
        bloombergtrucksModel[24] = new ModelRendererTurbo(this, 44, 35, textureX, textureY); // Box 27
        bloombergtrucksModel[25] = new ModelRendererTurbo(this, 58, 33, textureX, textureY); // Box 28
        bloombergtrucksModel[26] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 29
        bloombergtrucksModel[27] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 30
        bloombergtrucksModel[28] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 31
        bloombergtrucksModel[29] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 32
        bloombergtrucksModel[30] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 34
        bloombergtrucksModel[31] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 35
        bloombergtrucksModel[32] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 36
        bloombergtrucksModel[33] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 37
        bloombergtrucksModel[34] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 38
        bloombergtrucksModel[35] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 39
        bloombergtrucksModel[36] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 40
        bloombergtrucksModel[37] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 41
        bloombergtrucksModel[38] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 42
        bloombergtrucksModel[39] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 43
        bloombergtrucksModel[40] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 44
        bloombergtrucksModel[41] = new ModelRendererTurbo(this, 34, 50, textureX, textureY); // Box 45
        bloombergtrucksModel[42] = new ModelRendererTurbo(this, 2, 50, textureX, textureY); // Box 46
        bloombergtrucksModel[43] = new ModelRendererTurbo(this, 4, 24, textureX, textureY); // Box 48
        bloombergtrucksModel[44] = new ModelRendererTurbo(this, 30, 20, textureX, textureY); // Box 48
        bloombergtrucksModel[45] = new ModelRendererTurbo(this, 30, 20, textureX, textureY); // Box 51
        bloombergtrucksModel[46] = new ModelRendererTurbo(this, 30, 20, textureX, textureY); // Box 52
        bloombergtrucksModel[47] = new ModelRendererTurbo(this, 30, 20, textureX, textureY); // Box 53

        bloombergtrucksModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        bloombergtrucksModel[0].setRotationPoint(-2F, 3F, -3F);

        bloombergtrucksModel[1].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Box 1
        bloombergtrucksModel[1].setRotationPoint(-3F, 3F, -6F);

        bloombergtrucksModel[2].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Box 2
        bloombergtrucksModel[2].setRotationPoint(2F, 3F, -6F);

        bloombergtrucksModel[3].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 3
        bloombergtrucksModel[3].setRotationPoint(-3F, 3F, -7F);

        bloombergtrucksModel[4].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 4
        bloombergtrucksModel[4].setRotationPoint(-3F, 3F, 6F);

        bloombergtrucksModel[5].addFlexTrapezoid(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, 0.25F, 0.00F, 0.00F, 0.00F, 0.00F, ModelRendererTurbo.MR_RIGHT); // Box 5
        bloombergtrucksModel[5].setRotationPoint(-5F, 3F, -7F);

        bloombergtrucksModel[6].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 6
        bloombergtrucksModel[6].setRotationPoint(-9F, 3.25F, -7F);

        bloombergtrucksModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
        bloombergtrucksModel[7].setRotationPoint(-9F, 2.25F, -7F);

        bloombergtrucksModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 8
        bloombergtrucksModel[8].setRotationPoint(-10F, 3.25F, -7F);

        bloombergtrucksModel[9].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 9
        bloombergtrucksModel[9].setRotationPoint(-10.75F, 3.75F, -7F);

        bloombergtrucksModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 10
        bloombergtrucksModel[10].setRotationPoint(-9F, 5.25F, -7F);

        bloombergtrucksModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 11
        bloombergtrucksModel[11].setRotationPoint(-6F, 5.25F, -7F);

        bloombergtrucksModel[12].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 12
        bloombergtrucksModel[12].setRotationPoint(-8F, 5.25F, -7F);

        bloombergtrucksModel[13].addFlexTrapezoid(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, 0.25F, 0.00F, 0.00F, 0.00F, 0.00F, ModelRendererTurbo.MR_RIGHT); // Box 14
        bloombergtrucksModel[13].setRotationPoint(-5F, 3F, 6F);

        bloombergtrucksModel[14].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 15
        bloombergtrucksModel[14].setRotationPoint(-9F, 3.25F, 6F);

        bloombergtrucksModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
        bloombergtrucksModel[15].setRotationPoint(-9F, 2.25F, 6F);

        bloombergtrucksModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 17
        bloombergtrucksModel[16].setRotationPoint(-10F, 3.25F, 6F);

        bloombergtrucksModel[17].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 18
        bloombergtrucksModel[17].setRotationPoint(-10.75F, 3.75F, 6F);

        bloombergtrucksModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 19
        bloombergtrucksModel[18].setRotationPoint(-9F, 5.25F, 6F);

        bloombergtrucksModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 20
        bloombergtrucksModel[19].setRotationPoint(-6F, 5.25F, 6F);

        bloombergtrucksModel[20].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 21
        bloombergtrucksModel[20].setRotationPoint(-8F, 5.25F, 6F);

        bloombergtrucksModel[21].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 24
        bloombergtrucksModel[21].setRotationPoint(9.75F, 3.75F, 6F);

        bloombergtrucksModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F); // Box 25
        bloombergtrucksModel[22].setRotationPoint(9F, 3.25F, 6F);

        bloombergtrucksModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
        bloombergtrucksModel[23].setRotationPoint(5F, 2.25F, 6F);

        bloombergtrucksModel[24].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 27
        bloombergtrucksModel[24].setRotationPoint(5F, 3.25F, 6F);

        bloombergtrucksModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 28
        bloombergtrucksModel[25].setRotationPoint(5F, 5.25F, 6F);

        bloombergtrucksModel[26].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 29
        bloombergtrucksModel[26].setRotationPoint(6F, 5.25F, 6F);

        bloombergtrucksModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 30
        bloombergtrucksModel[27].setRotationPoint(8F, 5.25F, 6F);

        bloombergtrucksModel[28].addFlexTrapezoid(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, 0.25F, 0.00F, 0.00F, 0.00F, 0.00F, ModelRendererTurbo.MR_LEFT); // Box 31
        bloombergtrucksModel[28].setRotationPoint(3F, 3F, 6F);

        bloombergtrucksModel[29].addFlexTrapezoid(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, 0.25F, 0.00F, 0.00F, 0.00F, 0.00F, ModelRendererTurbo.MR_LEFT); // Box 32
        bloombergtrucksModel[29].setRotationPoint(3F, 3F, -7F);

        bloombergtrucksModel[30].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
        bloombergtrucksModel[30].setRotationPoint(5F, 2.25F, -7F);

        bloombergtrucksModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F); // Box 35
        bloombergtrucksModel[31].setRotationPoint(9F, 3.25F, -7F);

        bloombergtrucksModel[32].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 36
        bloombergtrucksModel[32].setRotationPoint(9.75F, 3.75F, -7F);

        bloombergtrucksModel[33].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 37
        bloombergtrucksModel[33].setRotationPoint(5F, 3.25F, -7F);

        bloombergtrucksModel[34].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 38
        bloombergtrucksModel[34].setRotationPoint(6F, 5.25F, -7F);

        bloombergtrucksModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 39
        bloombergtrucksModel[35].setRotationPoint(8F, 5.25F, -7F);

        bloombergtrucksModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 40
        bloombergtrucksModel[36].setRotationPoint(5F, 5.25F, -7F);

        bloombergtrucksModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
        bloombergtrucksModel[37].setRotationPoint(-2F, 2F, -2F);

        bloombergtrucksModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 42
        bloombergtrucksModel[38].setRotationPoint(-2F, 2F, 0F);

        bloombergtrucksModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 43
        bloombergtrucksModel[39].setRotationPoint(0F, 2F, 0F);

        bloombergtrucksModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
        bloombergtrucksModel[40].setRotationPoint(0F, 2F, -2F);

        bloombergtrucksModel[41].addBox(0.5F, 0.5F, 0F, 1, 1, 12, 0F); // Box 45
        bloombergtrucksModel[41].setRotationPoint(-8F, 5F, -6F);

        bloombergtrucksModel[42].addBox(0.5F, 0.5F, 0F, 1, 1, 12, 0F); // Box 46
        bloombergtrucksModel[42].setRotationPoint(6F, 5F, -6F);

        bloombergtrucksModel[43].addBox(0F, 0F, 0F, 6, 3, 12, 0F); // Box 48
        bloombergtrucksModel[43].setRotationPoint(-3F, 5F, -6F);

        bloombergtrucksModel[44].addShapeBox(-6.5F, -6.5F, 0F, 13, 13, 0, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F); // Box 48
        bloombergtrucksModel[44].setRotationPoint(-7F, 6F, -5.97F);

        bloombergtrucksModel[45].addShapeBox(-6.5F, -6.5F, 0F, 13, 13, 0, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F); // Box 51
        bloombergtrucksModel[45].setRotationPoint(-7F, 6F, 5.97F);

        bloombergtrucksModel[46].addShapeBox(-6.5F, -6.5F, 0F, 13, 13, 0, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F); // Box 52
        bloombergtrucksModel[46].setRotationPoint(7F, 6F, 5.97F);

        bloombergtrucksModel[47].addShapeBox(-6.5F, -6.5F, 0F, 13, 13, 0, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F); // Box 53
        bloombergtrucksModel[47].setRotationPoint(7F, 6F, -5.97F);


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 48; i++)
        {
            bloombergtrucksModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo bloombergtrucksModel[];
}