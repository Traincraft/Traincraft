package tmt;

import net.minecraft.client.model.PositionTextureVertex;

//TexturedVertex sounds cooler and is shorter than PositionTextureVertex
public class TexturedVertex {

	public Vec3f vector3F;
	public float textureX;
	public float textureY;

	public TexturedVertex(float x, float y, float z, float u, float v){
		this(new Vec3f(x, y, z), u, v);
	}

	@Deprecated
	public TexturedVertex(PositionTextureVertex vertex, float u, float v){
		vector3F = new Vec3f(vertex.vector3D);
		textureX = u;
		textureY = v;
	}

	public TexturedVertex(Vec3f vector, float u, float v){
		vector3F = new Vec3f(vector.xCoord, vector.yCoord, vector.zCoord);
		textureX = u;
		textureY = v;
	}

	public TexturedVertex setTexturePosition(float p_78240_1_, float p_78240_2_) {
		return new TexturedVertex(vector3F, p_78240_1_, p_78240_2_);
	}

	
}
