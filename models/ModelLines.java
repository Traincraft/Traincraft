package train.client.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLines extends ModelBase {
	// fields
	ModelRenderer Middle;
	ModelRenderer Down;
	ModelRenderer Up;
	ModelRenderer Left;
	ModelRenderer Right;
	ModelRenderer Back;
	ModelRenderer Front;

	public ModelLines() {
		textureWidth = 64;
		textureHeight = 32;

		Middle = new ModelRenderer(this, 0, 0);
		Middle.addBox(-1F, -1F, -1F, 2, 2, 2);
		Middle.setRotationPoint(0F, 16F, 0F);
		Middle.setTextureSize(64, 32);
		Middle.mirror = true;
		setRotation(Middle, 0F, 0F, 0F);
		Down = new ModelRenderer(this, 0, 4);
		Down.addBox(-1F, 0F, -1F, 2, 7, 2);
		Down.setRotationPoint(0F, 17F, 0F);
		Down.setTextureSize(64, 32);
		Down.mirror = true;
		setRotation(Down, 0F, 0F, 0F);
		Up = new ModelRenderer(this, 0, 4);
		Up.addBox(-1F, -7F, -1F, 2, 7, 2);
		Up.setRotationPoint(0F, 15F, 0F);
		Up.setTextureSize(64, 32);
		Up.mirror = true;
		setRotation(Up, 0F, 0F, 0F);
		Left = new ModelRenderer(this, 0, 13);
		Left.addBox(0F, -1F, -1F, 7, 2, 2);
		Left.setRotationPoint(1F, 16F, 0F);
		Left.setTextureSize(64, 32);
		Left.mirror = true;
		setRotation(Left, 0F, 0F, 0F);
		Right = new ModelRenderer(this, 0, 13);
		Right.addBox(-7F, -1F, -1F, 7, 2, 2);
		Right.setRotationPoint(-1F, 16F, 0F);
		Right.setTextureSize(64, 32);
		Right.mirror = true;
		setRotation(Right, 0F, 0F, 0F);
		Back = new ModelRenderer(this, 8, 4);
		Back.addBox(-1F, -1F, 0F, 2, 2, 7);
		Back.setRotationPoint(0F, 16F, 1F);
		Back.setTextureSize(64, 32);
		Back.mirror = true;
		setRotation(Back, 0F, 0F, 0F);
		Front = new ModelRenderer(this, 8, 4);
		Front.addBox(-1F, -1F, -7F, 2, 2, 7);
		Front.setRotationPoint(0F, 16F, -1F);
		Front.setTextureSize(64, 32);
		Front.mirror = true;
		setRotation(Front, 0F, 0F, 0F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Middle.render(f5);
		Down.render(f5);
		Up.render(f5);
		Left.render(f5);
		Right.render(f5);
		Back.render(f5);
		Front.render(f5);
	}

	public void renderMiddle() {
		Middle.render(0.0625F);
	}

	public void renderDown() {
		Down.render(0.0625F);
	}

	public void renderUp() {
		Up.render(0.0625F);
	}

	public void renderLeft() {
		Left.render(0.0625F);
	}

	public void renderRight() {
		Right.render(0.0625F);
	}

	public void renderBack() {
		Back.render(0.0625F);
	}

	public void renderFront() {
		Front.render(0.0625F);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
	}

}
