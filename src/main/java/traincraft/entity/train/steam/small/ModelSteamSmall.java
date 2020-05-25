package traincraft.entity.train.steam.small;

import net.fexcraft.lib.tmt.ModelRendererTurbo;
import traincraft.renderer.TraincraftModel;

public class ModelSteamSmall extends TraincraftModel {
	
	public ModelSteamSmall() {
		ModelRendererTurbo[] modelParts = new ModelRendererTurbo[19];

		modelParts[0] = new ModelRendererTurbo(this, 0, 0, 128, 128);
		modelParts[1] = new ModelRendererTurbo(this, 43, 112, 128, 128);
		modelParts[2] = new ModelRendererTurbo(this, 64, 0, 128, 128);
		modelParts[3] = new ModelRendererTurbo(this, 0, 103, 128, 128);
		modelParts[4] = new ModelRendererTurbo(this, 60, 42, 128, 128);
		modelParts[5] = new ModelRendererTurbo(this, 18, 68, 128, 128);
		modelParts[6] = new ModelRendererTurbo(this, 0, 24, 128, 128);
		modelParts[7] = new ModelRendererTurbo(this, 0, 68, 128, 128);
		modelParts[8] = new ModelRendererTurbo(this, 0, 24, 128, 128);
		modelParts[9] = new ModelRendererTurbo(this, 88, 26, 128, 128);
		modelParts[10] = new ModelRendererTurbo(this, 0, 12, 128, 128);
		modelParts[11] = new ModelRendererTurbo(this, 88, 57, 128, 128);
		modelParts[12] = new ModelRendererTurbo(this, 0, 40, 128, 128);
		modelParts[13] = new ModelRendererTurbo(this, 0, 40, 128, 128);
		modelParts[14] = new ModelRendererTurbo(this, 39, 0, 128, 128);
		modelParts[15] = new ModelRendererTurbo(this, 60, 42, 128, 128);
		modelParts[16] = new ModelRendererTurbo(this, 60, 94, 128, 128);
		modelParts[17] = new ModelRendererTurbo(this, 7, 59, 128, 128);
		modelParts[18] = new ModelRendererTurbo(this, 0, 37, 128, 128);

		modelParts[0].addBox(0F, 0F, 0F, 6, 4, 8, 0.0F);
		modelParts[0].setPosition(-3F, 8F, 8F);
		modelParts[1].addBox(0F, 0F, 0F, 4, 12, 4, 0.0F);
		modelParts[1].setPosition(-2F, 24F, 12F);
		modelParts[2].addBox(0F, 0F, 0F, 20, 4, 12, 0.0F);
		modelParts[2].setPosition(-10F, 4F, 8F);
		modelParts[3].addBox(0F, 0F, 0F, 20, 24, 1, 0.0F);
		modelParts[3].setPosition(-10F, 12F, -1F);
		modelParts[4].addBox(0F, 0F, 0F, 1, 1, 13, 0.0F);
		modelParts[4].setPosition(6F, 5F, -11F);
		modelParts[5].addBox(0F, 0F, 0F, 1, 12, 8, 0.0F);
		modelParts[5].setPosition(9F, 24F, -9F);
		modelParts[6].addBox(0F, 0F, 0F, 2, 8, 8, 0.0F);
		modelParts[6].setPosition(4F, 0F, -4F);
		modelParts[7].addBox(0F, 0F, 0F, 1, 12, 8, 0.0F);
		modelParts[7].setPosition(-10F, 24F, -9F);
		modelParts[8].addBox(0F, 0F, 0F, 2, 8, 8, 0.0F);
		modelParts[8].setPosition(4F, 0F, -16F);
		modelParts[9].addBox(0F, 0F, 0F, 1, 12, 19, 0.0F);
		modelParts[9].setPosition(-10F, 12F, -20F);
		modelParts[10].addBox(0F, 0F, 0F, 6, 6, 6, 0.0F);
		modelParts[10].setPosition(-3F, 24F, 3F);
		modelParts[11].addBox(0F, 0F, 0F, 1, 12, 19, 0.0F);
		modelParts[11].setPosition(9F, 12F, -20F);
		modelParts[12].addBox(0F, 0F, 0F, 2, 8, 8, 0.0F);
		modelParts[12].setPosition(-6F, 0F, -16F);
		modelParts[13].addBox(0F, 0F, 0F, 2, 8, 8, 0.0F);
		modelParts[13].setPosition(-6F, 0F, -4F);
		modelParts[14].addBox(0F, 0F, 0F, 6, 8, 6, 0.0F);
		modelParts[14].setPosition(-3F, 22F, 16F);
		modelParts[15].addBox(0F, 0F, 0F, 1, 1, 13, 0.0F);
		modelParts[15].setPosition(-7F, 5F, -14F);
		modelParts[16].addBox(0F, 0F, 0F, 12, 12, 22, 0.0F);
		modelParts[16].setPosition(-6F, 12F, -4F);
		modelParts[17].addBox(0F, 0F, 0F, 20, 4, 30, 0.0F);
		modelParts[17].setPosition(-10F, 8F, -22F);
		modelParts[18].addBox(0F, 0F, 0F, 20, 1, 20, 0.0F);
		modelParts[18].setPosition(-10F, 36F, -20F);
		
		this.add("body", modelParts);
	}

}
