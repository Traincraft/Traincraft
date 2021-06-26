package tmt;

import net.minecraft.client.model.PositionTextureVertex;

public class PositionTransformVertex{

	public Vec3f vector3F;
	public float textureX;
	public float textureY;

	public PositionTransformVertex(float x, float y, float z, float u, float v){
		this(new Vec3f(x, y, z), u, v);
	}

	@Deprecated
	public PositionTransformVertex(PositionTextureVertex vertex, float u, float v){
		vector3F = new Vec3f(vertex.vector3D);
		textureX = u;
		textureY = v;
	}

	public PositionTransformVertex(Vec3f vector, float u, float v){
		vector3F = new Vec3f(vector.xCoord, vector.yCoord, vector.zCoord);
		textureX = u;
		textureY = v;
	}

	public PositionTransformVertex setTexturePosition(float p_78240_1_, float p_78240_2_) {
		return new PositionTransformVertex(vector3F, p_78240_1_, p_78240_2_);
	}

	
}
