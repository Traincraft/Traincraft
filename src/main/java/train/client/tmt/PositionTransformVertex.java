package train.client.tmt;

import net.minecraft.client.model.PositionTextureVertex;

import java.util.ArrayList;

/**
 * an extension to PositionTextureVertex that adds support for the neutral vector.
 */
public class PositionTransformVertex extends PositionTextureVertex {
	public PositionTransformVertex(double x, double y, double z, float u, float v) {
		this(new Vec3d(x, y, z), u, v);
	}
	
	public PositionTransformVertex(PositionTextureVertex vertex, float u, float v) {
		super(vertex, u, v);
		neutralVector = (vertex instanceof PositionTransformVertex)?((PositionTransformVertex) vertex).neutralVector:new Vec3d(vertex.vector3D.xCoord, vertex.vector3D.yCoord, vertex.vector3D.zCoord);
	}
	
	public PositionTransformVertex(PositionTextureVertex vertex) {
		this(vertex, vertex.texturePositionX, vertex.texturePositionY);
	}
	
	public PositionTransformVertex(Vec3d vector, float u, float v) {
		super(vector, u, v);
		neutralVector = vector;
	}
	
	public void setTransformation() {
		if(transformGroups.size() == 0) {
			vector3D = neutralVector;
			return;
		}
		double weight = 0D;
		for(TransformGroupBone transform : transformGroups) {
			weight += transform.getWeight();
		}
		vector3D.xCoord = 0;
		vector3D.yCoord = 0;
		vector3D.zCoord = 0;

		for(TransformGroupBone transform : transformGroups) {
			double cWeight = transform.getWeight() / weight;
			Vec3d vector = transform.doTransformation(this);
			
			vector3D.xCoord += cWeight * vector.xCoord;
			vector3D.yCoord += cWeight * vector.yCoord;
			vector3D.zCoord += cWeight * vector.zCoord;
		}
	}
	
	public void addGroup(TransformGroupBone group)
	{
		transformGroups.add(group);
	}
	
	public void removeGroup(TransformGroupBone group)
	{
		transformGroups.remove(group);
	}
		
	public Vec3d neutralVector;
	public ArrayList<TransformGroupBone> transformGroups = new ArrayList<TransformGroupBone>();
	
}
