package train.client.tmt;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.util.MathHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * The Bone class makes it possible to create skeletons, which should help you out in
 * animating your mobs a little bit more easy. However, since you won't work with a
 * graphical interface, creating bones will be different from what you are probably
 * used to.
 * <br /><br />
 * First, you will need to instantiate every Bone in the constructor of your model
 * file. The default orientation, when all angles are set to zero, will be in the
 * vector (0, 0, length), meaning it will always point backwards on a regular model.
 * You can also set what its parent node is. If a Bone does not have a parent node,
 * it is assumed it is the root node. Each Bone can only have one parent, but several
 * children. Also, all children will inherit the offset position of the root node.
 * <br /><br />
 * The neutral position basically defines in what direction the Bone normally faces
 * when in rest. This will not affect the rotation of any model currently attached
 * to it or the rotation of the child nodes, but will affect the position of the
 * child nodes when recalculating their positions. The length always defines how far
 * each child Bone will be placed, since child Bones are always placed at the end of
 * their parent Bone.
 * <br /><br />
 * Once you're ready to render, you can call the prepareDraw method. You only need
 * to apply it to one Bone, since it will always search for the root node to execute
 * the code there. It will then automatically rotate every child Bone and places
 * them at the right position. Finally, use the setAnglesToModels method to rotate
 * each model and place them at the correct spot. Note that if you also apply custom
 * rotation for the individual models that you should apply that after you've run
 * setAnglesToModels, since this will override the settings the model originally had.
 * The best way to solve this is to make a separate method to rotate the Bones.
 * <br /><br />
 * The following would be an example of a biped with a skeleton. It takes ModelBiped
 * as an example and extends it with a skeleton. First, we have the part that goes
 * in the constructor.
 * <pre>
 * // First, the origin will be placed. This is where the rest is attached to.
 * skeletonOrigin = new Bone(0, 0, 0, 0);
 * 
 * // Next, the entire skeleton is built up.
 * skeletonHead = new Bone(-3.141593F / 2, 0, 0, 0, skeletonOrigin);
 * skeletonBody = new Bone(3.141593F / 2, 0, 0, 12, skeletonOrigin);
 * skeletonShoulderRight = new Bone(0, -3.141593F / 2, 0, 5, skeletonOrigin);
 * skeletonShoulderLeft = new Bone(0, 3.141593F / 2, 0, 5, skeletonOrigin);
 * skeletonArmRight = new Bone(3.141593F / 2, 0, 0, 12, skeletonShoulderRight);
 * skeletonArmLeft = new Bone(3.141593F / 2, 0, 0, 12, skeletonShoulderLeft);
 * skeletonPelvisRight = new Bone(0, -3.141593F / 2, 0, 2, skeletonBody);
 * skeletonPelvisLeft = new Bone(0, 3.141593F / 2, 0, 2, skeletonBody);
 * skeletonLegRight = new Bone(3.141593F / 2, 0, 0, 12, skeletonPelvisRight);
 * skeletonLegLeft = new Bone(3.141593F / 2, 0, 0, 12, skeletonPelvisLeft);
 * 
 * // Finally, all models will be attached to the skeletons.
 * skeletonHead.addModel(bipedHead);
 * skeletonHead.addModel(bipedHeadwear);
 * skeletonBody.addModel(bipedBody);
 * skeletonArmRight.addModel(bipedRightArm);
 * skeletonArmLeft.addModel(bipedLeftArm);
 * skeletonLegRight.addModel(bipedRightLeg);
 * skeletonLegLeft.addModel(bipedRightLeg);
 * </pre>
 * <br /><br />
 * After that, you could replace anything in the setRotationAngles method with
 * the following code. It's not a complete code, but you'll get the basics.
 * <br /><br />
 * <pre>
 * skeletonHead.relativeAngles.yCoord = f3 / 57.29578F;
 * skeletonHead.relativeAngles.xCoord = f4 / 57.29578F;
 * skeletonArmRight.relativeAngles.xCoord = MathHelper.cos(f * 0.6662F + 3.141593F) * 2.0F * f1 * 0.5F;
 * skeletonArmRight.relativeAngles.zCoord = 0.0F;
 * skeletonArmLeft.relativeAngles.xCoord = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
 * skeletonArmLeft.relativeAngles.zCoord = 0.0F;
 * skeletonLegRight.relativeAngles.xCoord = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
 * skeletonLegRight.relativeAngles.yCoord = 0.0F;
 * skeletonLegLeft.relativeAngles.xCoord = MathHelper.cos(f * 0.6662F + 3.141593F) * 1.4F * f1;
 * skeletonLegLeft.relativeAngles.yCoord = 0.0F;
 * </pre>
 * <br /><br />
 * Finally, in the render method, you could use the following code.
 * <br /><br />
 * <pre>
 * setRotationAngles(f, f1, f2, f3, f4, f5);
 * skeletonOrigin.prepareDraw();
 * skeletonOrigin.setAnglesToModels();
 * </pre>
 * <br /><br />
 * This should generate the same animation of the regular biped. Don't forget to add
 * the individual render methods for each model though, as it won't automatically
 * render them.
 * <br /><br />
 * @author GaryCXJk
 *
 */
public class Bone {
	/**
	 * Constructor to create a bone.
	 * @param x the x-rotation of the bone
	 * @param y the y-rotation of the bone
	 * @param z the z-rotation of the bone
	 * @param l the length of the bone
	 */
	public Bone(float x, float y, float z, float l) {
		neutralAngles = new Vec3f(x,y,z);
		length = l;
	}
	
	/**
	 * Constructor to create a bone.
	 * @param xOrig the x-offset of the origin
	 * @param yOrig the y-offset of the origin
	 * @param zOrig the z-offset of the origin
	 * @param xRot the x-rotation of the bone
	 * @param yRot the y-rotation of the bone
	 * @param zRot the z-rotation of the bone
	 * @param l the length of the bone
	 */
	public Bone(float xOrig, float yOrig, float zOrig, float xRot, float yRot, float zRot, float l) {
		this(xRot, yRot, zRot, l);
		positionVector = setOffset(xOrig, yOrig, zOrig);
	}
	
	/**
	 * Constructor to create a bone. This attaches the bone to a parent bone, and will
	 * calculate its current position relative to the origin.
	 * @param x the x-rotation of the bone
	 * @param y the y-rotation of the bone
	 * @param z the z-rotation of the bone
	 * @param l the length of the bone
	 * @param parent the parent Bone node this Bone is attached to
	 */
	public Bone(float x, float y, float z, float l, Bone parent) {
		this(x, y, z, l);
		attachBone(parent);
	}
	
	/**
	 * Detaches the bone from its parent.
	 */
	public void detachBone() {
		parentNode.childNodes.remove(this);
		parentNode = null;
	}
	
	/**
	 * Attaches the bone to a parent. If the parent is already set, detaches the bone
	 * from the previous parent.
	 * @param parent the parent Bone node this Bone is attached to
	 */
	public void attachBone(Bone parent) {
		if(parentNode != null) {
			detachBone();
		}
		parentNode = parent;
		parent.addChildBone(this);
		offsetX = parent.offsetX;
		offsetY = parent.offsetY;
		offsetZ = parent.offsetZ;
		resetOffset(false);
	}
	
	/**
	 * Sets the current offset of the parent root Bone. Note that this will
	 * always set the parent root Bone, not the current Bone, as its offset
	 * is determined by the offset, rotation and length of its parent.
	 * @param x the x-position
	 * @param y the y-position
	 * @param z the z-position
	 * @return a Vec3d with the new coordinates of the current bone
	 */
	public Vec3d setOffset(float x, float y, float z) {
		if(parentNode != null) {
			Vec3d vector = parentNode.setOffset(x, y, z);
			offsetX = (float)vector.xCoord;
			offsetY = (float)vector.yCoord;
			offsetZ = (float)vector.zCoord;
			return vector;
		}
		offsetX = x;
		offsetY = y;
		offsetZ = z;
		resetOffset(true);
		return new Vec3d(x, y, z);
	}

	/**
	 * Resets the offset.
	 * ETERNAL'S NOTE: resetOffset(false) is the same as the now removed resetOffset().
	 * @param doRecursive
	 */
	public void resetOffset(boolean doRecursive) {
		if(parentNode != null) {
			parentNode.setVectorRotations(new Vec3d(0, 0, parentNode.length));
			positionVector.add(parentNode.positionVector);
		}
		if(doRecursive && !childNodes.isEmpty()) {
			for(Bone child : childNodes) {
				child.resetOffset(true);
			}
		}
	}
	
	/**
	 * Sets the current neutral rotation of the bone. This is the same rotation as in
	 * the constructor.
	 * @param x the x-rotation of the bone
	 * @param y the y-rotation of the bone
	 * @param z the z-rotation of the bone
	 */
	public void setNeutralRotation(float x, float y, float z) {
		neutralAngles.xCoord = x;
		neutralAngles.yCoord = y;
		neutralAngles.zCoord = z;
	}
	
	/**
	 * Gets the root parent bone.
	 * @return the root parent Bone.
	 */
	public Bone getRootParent() {
		return parentNode == null?this:parentNode.getRootParent();
	}
	
	/**
	 * Attaches a model to the bone. Its base rotation will be set to the neutral
	 * rotation of the model.
	 * @param model the model to attach
	 */
	public void addModel(ModelRenderer model) {
		addModel(model, false);
	}
	
	/**
	 * Attaches a model to the bone. If inherit is true, it sets the base rotation
	 * to the neutral rotation of the Bone, otherwise it's set to the neutral
	 * rotation of the model.
	 * @param model the model to attach
	 * @param inherit whether the model should inherit the Bone's base rotations
	 */
	public void addModel(ModelRenderer model, boolean inherit) {
		addModel(model, 0F, 0F, 0F, inherit, false);
	}
	
	/**
	 * Attaches a model to the bone. If inherit is true, it sets the base rotation
	 * to the neutral rotation of the Bone, otherwise it's set to the neutral
	 * rotation of the model. When isUpright is set, the model will be rotated
	 * (-PI / 2, 0, 0).
	 * @param model the model to attach
	 * @param inherit whether the model should inherit the Bone's base rotations
	 * @param isUpright whether the model is modeled in the upright position
	 */	
	public void addModel(ModelRenderer model, boolean inherit, boolean isUpright) {
		addModel(model, 0F, 0F, 0F, inherit, isUpright);
	}
	
	/**
	 * Attaches a model to the bone with a given base rotation.
	 * @param model the model to attach
	 * @param x the base x-rotation
	 * @param y the base y-rotation
	 * @param z the base z-rotation
	 */
	public void addModel(ModelRenderer model, float x, float y, float z) {
		addModel(model, x, y, z, false, false);
	}
	
	/**
	 * Attaches a model to the bone with a given base rotation. When inherit is
	 * true, it will add the Bone's neutral rotation to the given angles.
	 * @param model the model to attach
	 * @param x the base x-rotation
	 * @param y the base y-rotation
	 * @param z the base z-rotation
	 * @param inherit whether the model should inherit the Bone's base rotations
	 */	
	public void addModel(ModelRenderer model, float x, float y, float z, boolean inherit) {
		addModel(model, x, y, z, inherit, false);
	}
	
	/**
	 * Attaches a model to the bone with a given base rotation. When inherit is
	 * true, it will add the Bone's neutral rotation to the given angles.
	 * When isUpright is set, the model will be rotated (-PI / 2, 0, 0).
	 * @param model the model to attach
	 * @param x the base x-rotation
	 * @param y the base y-rotation
	 * @param z the base z-rotation
	 * @param inherit whether the model should inherit the Bone's base rotations
	 * @param isUpright whether the model is modeled in the upright position
	 */		
	public void addModel(ModelRenderer model, float x, float y, float z, boolean inherit, boolean isUpright) {
		if(inherit) {
			x += neutralAngles.xCoord + (isUpright ? (float)Math.PI / 2 : 0);
			y += neutralAngles.yCoord;
			z += neutralAngles.zCoord;
		}
		models.add(model);
		modelBaseRot.put(model, new Vec3f(x, y, z));
	}
	
	/**
	 * Removes the given model from the Bone. Always detach the model before adding
	 * it to another Bone. The best thing however is to just keep the model to one
	 * bone.
	 * @param model the model to remove from the bone
	 */
	public void removeModel(ModelRenderer model) {
		models.remove(model);
		modelBaseRot.remove(model);
	}
	
	/**
	 * Gets the current absolute angles. The absolute angle is calculated by getting
	 * the sum of all parent Bones' relative angles plus the current relative angle.
	 * This must be called after using the prepareDraw method.
	 * @return an Angle3D object which holds the current angles of the current node.
	 */
	public Vec3f getAbsoluteAngle() {
		return absoluteAngles;
	}
	
	/**
	 * Gets the current position of the bone. You should call this after all rotations
	 * and positions are applied, e.g. after prepareDraw has been called.
	 * @return a vector containing the current position relative to the origin.
	 */
	public Vec3d getPosition() {
		return positionVector;
	}
	
	protected void addChildBone(Bone bone) {
		childNodes.add(bone);
	}
	
	/**
	 * Prepares the bones for rendering. This will automatically take the root Bone
	 * if it isn't.
	 */
	public void prepareDraw() {
		if(parentNode != null)
			parentNode.prepareDraw();
		else {
			setAbsoluteRotations();
			setVectors();
		}
	}
	
	/**
	 * Sets the current rotation of the Bone, not calculating any parent bones in.
	 * @param x
	 * @param y
	 * @param z
	 */
	public void setRotations(float x, float y, float z) {
		relativeAngles.xCoord = x;
		relativeAngles.yCoord = y;
		relativeAngles.zCoord = z;
	}
	
	protected void setAbsoluteRotations() {
		absoluteAngles.zCoord = relativeAngles.xCoord;
		absoluteAngles.yCoord = relativeAngles.yCoord;
		absoluteAngles.zCoord = relativeAngles.zCoord;
		for(Bone node : childNodes) {
			node.setAbsoluteRotations(absoluteAngles.zCoord, absoluteAngles.yCoord, absoluteAngles.zCoord);
		}
	}
	
	protected void setAbsoluteRotations(float x, float y, float z) {
		absoluteAngles.zCoord = relativeAngles.xCoord + x;
		absoluteAngles.yCoord = relativeAngles.yCoord + y;
		absoluteAngles.zCoord = relativeAngles.zCoord + z;
		for(Bone node : childNodes) {
			node.setAbsoluteRotations(absoluteAngles.zCoord, absoluteAngles.yCoord, absoluteAngles.zCoord);
		}
		
	}
	
	protected Vec3d setVectorRotations(Vec3d vector) {
		return setVectorRotations(vector,
				neutralAngles.xCoord + absoluteAngles.zCoord,
				neutralAngles.yCoord + absoluteAngles.yCoord,
				neutralAngles.zCoord + absoluteAngles.zCoord);
	}
	
	protected Vec3d setVectorRotations(Vec3d vector, float xRot, float yRot, float zRot) {
        float xC = MathHelper.cos(xRot);
        float yC = MathHelper.cos(yRot);
        float zC = MathHelper.cos(zRot);

        // rotation around x
		double xy = xC*vector.yCoord - xC*vector.zCoord;
		double xz = xC*vector.zCoord + xC*vector.yCoord;
		// rotation around y
		double yx = yC*vector.xCoord + yC*xz;
		// rotation around z

		
        vector.xCoord = zC*yx - zC*xy;
        vector.yCoord = zC*xy + zC*yx;
        vector.zCoord = yC*xz - yC*vector.xCoord;
		return vector;
	}


	protected void setVectors() {
		Vec3d tempVec = new Vec3d(0, 0, length);
		positionVector = new Vec3d(offsetX, offsetY, offsetZ);
		tempVec.add(positionVector);
		tempVec = setVectorRotations(tempVec);
		for(Bone node : childNodes) {
			node.setVectors(tempVec);
		}
	}
	
	protected void setVectors(Vec3d vector) {
		positionVector = vector;
		Vec3d tempVec = new Vec3d(0, 0, length);
		tempVec = setVectorRotations(tempVec);
		tempVec.add(vector);
		for(Bone node : childNodes) {
			node.setVectors(tempVec);
		}
		
	}
	
	/**
	 * Sets the current angles of the Bone to the models attached to it.
	 */
	public void setAnglesToModels() {
		for(ModelRenderer currentModel : models) {
			Vec3f baseAngles = modelBaseRot.get(currentModel);
			currentModel.rotateAngleX = baseAngles.xCoord + absoluteAngles.zCoord;
			currentModel.rotateAngleY = baseAngles.yCoord + absoluteAngles.yCoord;
			currentModel.rotateAngleZ = baseAngles.zCoord + absoluteAngles.zCoord;
			currentModel.rotationPointX = (float)positionVector.xCoord;
			currentModel.rotationPointY = (float)positionVector.yCoord;
			currentModel.rotationPointZ = (float)positionVector.zCoord;
		}
		
		for(Bone node : childNodes) {
			node.setAnglesToModels();
		}
	}

	protected Vec3f neutralAngles;
	public Vec3f relativeAngles = new Vec3f(0, 0, 0);
	private Vec3f absoluteAngles = new Vec3f(0, 0, 0);
	private Vec3d positionVector = new Vec3d(0, 0, 0);
	private float length;
	private Bone parentNode = null;
	protected ArrayList<Bone> childNodes = new ArrayList<Bone>();
	private ArrayList<ModelRenderer> models = new ArrayList<ModelRenderer>();
	private Map<ModelRenderer, Vec3f> modelBaseRot = new HashMap<ModelRenderer, Vec3f>();
	private float offsetX = 0;
	private float offsetY = 0;
	private float offsetZ = 0;

}
