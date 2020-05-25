package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelSlateWagon extends ModelBase {
    int textureX = 512;
    int textureY = 64;

    public ModelSlateWagon()
    {
        slatewagonModel = new ModelRendererTurbo[52];
        slatewagonModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        slatewagonModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
        slatewagonModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
        slatewagonModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
        slatewagonModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
        slatewagonModel[5] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 5
        slatewagonModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 6
        slatewagonModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 8
        slatewagonModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 9
        slatewagonModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 10
        slatewagonModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 11
        slatewagonModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 12
        slatewagonModel[12] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 13
        slatewagonModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 15
        slatewagonModel[14] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 16
        slatewagonModel[15] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 17
        slatewagonModel[16] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 18
        slatewagonModel[17] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 20
        slatewagonModel[18] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 21
        slatewagonModel[19] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 22
        slatewagonModel[20] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 23
        slatewagonModel[21] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 26
        slatewagonModel[22] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 27
        slatewagonModel[23] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 28
        slatewagonModel[24] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 29
        slatewagonModel[25] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 30
        slatewagonModel[26] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 31
        slatewagonModel[27] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 32
        slatewagonModel[28] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 33
        slatewagonModel[29] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 34
        slatewagonModel[30] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 35
        slatewagonModel[31] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 36
        slatewagonModel[32] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 37
        slatewagonModel[33] = new ModelRendererTurbo(this, 193, 22, textureX, textureY); // Box 33
        slatewagonModel[34] = new ModelRendererTurbo(this, 189, 22, textureX, textureY); // Box 34
        slatewagonModel[35] = new ModelRendererTurbo(this, 177, 22, textureX, textureY); // Box 35
        slatewagonModel[36] = new ModelRendererTurbo(this, 194, 22, textureX, textureY); // Box 36
        slatewagonModel[37] = new ModelRendererTurbo(this, 190, 22, textureX, textureY); // Box 38
        slatewagonModel[38] = new ModelRendererTurbo(this, 188, 22, textureX, textureY); // Box 39
        slatewagonModel[39] = new ModelRendererTurbo(this, 182, 22, textureX, textureY); // Box 42
        slatewagonModel[40] = new ModelRendererTurbo(this, 180, 22, textureX, textureY); // Box 43
        slatewagonModel[41] = new ModelRendererTurbo(this, 176, 22, textureX, textureY); // Box 45
        slatewagonModel[42] = new ModelRendererTurbo(this, 174, 22, textureX, textureY); // Box 46
        slatewagonModel[43] = new ModelRendererTurbo(this, 172, 22, textureX, textureY); // Box 47
        slatewagonModel[44] = new ModelRendererTurbo(this, 170, 22, textureX, textureY); // Box 48
        slatewagonModel[45] = new ModelRendererTurbo(this, 168, 22, textureX, textureY); // Box 49
        slatewagonModel[46] = new ModelRendererTurbo(this, 196, 22, textureX, textureY); // Box 50
        slatewagonModel[47] = new ModelRendererTurbo(this, 198, 22, textureX, textureY); // Box 51
        slatewagonModel[48] = new ModelRendererTurbo(this, 200, 22, textureX, textureY); // Box 52
        slatewagonModel[49] = new ModelRendererTurbo(this, 202, 22, textureX, textureY); // Box 53
        slatewagonModel[50] = new ModelRendererTurbo(this, 184, 22, textureX, textureY); // Box 54
        slatewagonModel[51] = new ModelRendererTurbo(this, 186, 22, textureX, textureY); // Box 55

        slatewagonModel[0].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 0
        slatewagonModel[0].setRotationPoint(-7F, 5F, -6F);

        slatewagonModel[1].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 1
        slatewagonModel[1].setRotationPoint(3F, 5F, -6F);

        slatewagonModel[2].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 2
        slatewagonModel[2].setRotationPoint(3F, 5F, 6F);

        slatewagonModel[3].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 3
        slatewagonModel[3].setRotationPoint(-7F, 5F, 6F);

        slatewagonModel[4].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 4
        slatewagonModel[4].setRotationPoint(-5F, 7F, -6F);

        slatewagonModel[5].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 5
        slatewagonModel[5].setRotationPoint(5F, 7F, -6F);

        slatewagonModel[6].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 6
        slatewagonModel[6].setRotationPoint(4F, 4F, -7F);

        slatewagonModel[7].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 8
        slatewagonModel[7].setRotationPoint(4F, 4F, 6F);

        slatewagonModel[8].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 9
        slatewagonModel[8].setRotationPoint(-6F, 4F, 6F);

        slatewagonModel[9].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 10
        slatewagonModel[9].setRotationPoint(-6F, 4F, -7F);

        slatewagonModel[10].addBox(0F, 0F, 0F, 21, 1, 14, 0F); // Box 11
        slatewagonModel[10].setRotationPoint(-10F, 3F, -7F);

        slatewagonModel[11].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 12
        slatewagonModel[11].setRotationPoint(-10F, -2F, -7F);

        slatewagonModel[12].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 13
        slatewagonModel[12].setRotationPoint(10F, -2F, -7F);

        slatewagonModel[13].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 15
        slatewagonModel[13].setRotationPoint(-9F, -2F, -7F);

        slatewagonModel[14].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 16
        slatewagonModel[14].setRotationPoint(-9F, 0F, -7F);

        slatewagonModel[15].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 17
        slatewagonModel[15].setRotationPoint(10F, -2F, 6F);

        slatewagonModel[16].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 18
        slatewagonModel[16].setRotationPoint(-10F, -2F, 6F);

        slatewagonModel[17].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 20
        slatewagonModel[17].setRotationPoint(-9F, -2F, 6F);

        slatewagonModel[18].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 21
        slatewagonModel[18].setRotationPoint(-9F, 0F, 6F);

        slatewagonModel[19].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 22
        slatewagonModel[19].setRotationPoint(-10F, 0F, -6F);

        slatewagonModel[20].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 23
        slatewagonModel[20].setRotationPoint(-10F, -2F, -6F);

        slatewagonModel[21].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 26
        slatewagonModel[21].setRotationPoint(10F, -2F, -6F);

        slatewagonModel[22].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 27
        slatewagonModel[22].setRotationPoint(10F, 0F, -6F);

        slatewagonModel[23].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 28
        slatewagonModel[23].setRotationPoint(-11F, 3F, -7F);

        slatewagonModel[24].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 29
        slatewagonModel[24].setRotationPoint(11F, 3F, -7F);

        slatewagonModel[25].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 30
        slatewagonModel[25].setRotationPoint(-12F, 4F, -6F);

        slatewagonModel[26].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 31
        slatewagonModel[26].setRotationPoint(-13F, 3F, -7F);

        slatewagonModel[27].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 32
        slatewagonModel[27].setRotationPoint(-13F, 3F, 4F);

        slatewagonModel[28].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 33
        slatewagonModel[28].setRotationPoint(-12F, 4F, 5F);

        slatewagonModel[29].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 34
        slatewagonModel[29].setRotationPoint(13F, 3F, 4F);

        slatewagonModel[30].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 35
        slatewagonModel[30].setRotationPoint(12F, 4F, 5F);

        slatewagonModel[31].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 36
        slatewagonModel[31].setRotationPoint(13F, 3F, -7F);

        slatewagonModel[32].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 37
        slatewagonModel[32].setRotationPoint(12F, 4F, -6F);

        slatewagonModel[33].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 33
        slatewagonModel[33].setRotationPoint(-9F, -5F, -6F);

        slatewagonModel[34].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 34
        slatewagonModel[34].setRotationPoint(-8F, -5F, -6F);

        slatewagonModel[35].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 35
        slatewagonModel[35].setRotationPoint(-7F, -5F, -6F);

        slatewagonModel[36].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 36
        slatewagonModel[36].setRotationPoint(-6F, -5F, -6F);

        slatewagonModel[37].addBox(0F, 0F, 0F, 1, 8, 12, 0F); // Box 38
        slatewagonModel[37].setRotationPoint(-5F, -5F, -6F);

        slatewagonModel[38].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 39
        slatewagonModel[38].setRotationPoint(-4F, -5F, -6F);

        slatewagonModel[39].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 42
        slatewagonModel[39].setRotationPoint(-1F, -5F, -6F);

        slatewagonModel[40].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 43
        slatewagonModel[40].setRotationPoint(0F, -5F, -6F);

        slatewagonModel[41].addBox(0F, 0F, 0F, 1, 8, 12, 0F); // Box 45
        slatewagonModel[41].setRotationPoint(1F, -5F, -6F);

        slatewagonModel[42].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 46
        slatewagonModel[42].setRotationPoint(2F, -5F, -6F);

        slatewagonModel[43].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 47
        slatewagonModel[43].setRotationPoint(3F, -5F, -6F);

        slatewagonModel[44].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 48
        slatewagonModel[44].setRotationPoint(4F, -5F, -6F);

        slatewagonModel[45].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 49
        slatewagonModel[45].setRotationPoint(5F, -5F, -6F);

        slatewagonModel[46].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 50
        slatewagonModel[46].setRotationPoint(6F, -5F, -6F);

        slatewagonModel[47].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 51
        slatewagonModel[47].setRotationPoint(7F, -5F, -6F);

        slatewagonModel[48].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 52
        slatewagonModel[48].setRotationPoint(8F, -5F, -6F);

        slatewagonModel[49].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 53
        slatewagonModel[49].setRotationPoint(9F, -5F, -6F);

        slatewagonModel[50].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 54
        slatewagonModel[50].setRotationPoint(-2F, -5F, -6F);

        slatewagonModel[51].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 55
        slatewagonModel[51].setRotationPoint(-3F, -5F, -6F);


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 52; i++)
        {
            slatewagonModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo slatewagonModel[];
}