package train.client.tmt;


import net.minecraft.util.MathHelper;

/**
 * The PositionTransformGroup class adds a class which allows for vertex transformations.
 * @author GaryCXJk
 *
 */
public class TransformGroupBone {
	public TransformGroupBone(Bone bone, double wght) {
		baseVector = bone.getPosition();
		baseAngle = bone.getAbsoluteAngle();
		attachedBone = bone;
		weight = wght;
	}
	
	public Vec3f getBaseAngles()
	{
		return baseAngle;
	}
	
	public Vec3f getTransformAngle() {
		Vec3f returnAngle = attachedBone.getAbsoluteAngle();
		returnAngle.xCoord-= baseAngle.xCoord;
		returnAngle.yCoord-= baseAngle.yCoord;
		returnAngle.zCoord-= baseAngle.zCoord;
		return returnAngle;
	}
	
	public Vec3d getBaseVector()
	{
		return new Vec3d(baseVector.xCoord, baseVector.yCoord, baseVector.zCoord);
	}
	
	public Vec3d getTransformVector() {
		return baseVector.subtract(attachedBone.getPosition());
	}
	
	public Vec3d getCurrentVector()
	{
		return attachedBone.getPosition();
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public void attachBone(Bone bone) {
		baseVector = bone.getPosition();
		baseAngle = bone.getAbsoluteAngle();
		attachedBone = bone;
	}
	
	public Vec3d doTransformation(PositionTransformVertex vertex) {
		Vec3d vector = new Vec3d(vertex.neutralVector.xCoord, vertex.neutralVector.yCoord, vertex.neutralVector.zCoord);
		vector = getBaseVector().subtract(vector);
		Vec3f angle = getTransformAngle();
		vector = setVectorRotations(vector, angle.xCoord, angle.yCoord, angle.zCoord);
		
		return vector;
	}
	
	protected Vec3d setVectorRotations(Vec3d vector, float xRot, float yRot, float zRot) {
        float xC = MathHelper.cos(xRot);
        float xS = MathHelper.sin(xRot);
        float yC = MathHelper.cos(yRot);
        float yS = MathHelper.sin(yRot);
        float zC = MathHelper.cos(zRot);
        float zS = MathHelper.sin(zRot);

        
        // rotation around x
		double xy = xC*vector.yCoord - xS*vector.zCoord;
		double xz = xC*vector.zCoord + xS*vector.yCoord;
		// rotation around y
		double yz = yC*xz - yS*vector.xCoord;
		double yx = yC*vector.xCoord + yS*xz;
		// rotation around z
		double zx = zC*yx - zS*xy;
		double zy = zC*xy + zS*yx;

		
        vector.xCoord = zx;
        vector.yCoord = zy;
        vector.zCoord = yz;
		return vector;
	}

	protected Vec3f baseAngle;
	protected Vec3d baseVector;
	protected Bone attachedBone;
	protected double weight;
}
