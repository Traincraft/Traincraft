package tmt;

import net.minecraft.util.MathHelper;

import java.util.ArrayList;


public class Shape2D {
	
	public ArrayList<Coord2D> coords;
	
	public Shape2D(){
		coords = new ArrayList<Coord2D>();
	}
	
	public Shape2D(Coord2D[] coordArray){
		coords = new ArrayList<Coord2D>();
		for(Coord2D coord : coordArray){
			coords.add(coord);
		}
	}
	
	public Shape2D(ArrayList<Coord2D> coordList){
		coords = coordList;
	}
	
	public Coord2D[] getCoordArray(){
		return (Coord2D[])coords.toArray();
	}
	
	public Shape3D extrude(float x, float y, float z, float rotX, float rotY, float rotZ, float depth, int u, int v, float textureWidth, float textureHeight, int shapeTextureWidth, int shapeTextureHeight, int sideTextureWidth, int sideTextureHeight, float[] faceLengths){
		PositionTransformVertex[] verts = new PositionTransformVertex[coords.size() * 2];
		PositionTransformVertex[] vertsTop = new PositionTransformVertex[coords.size()];
		PositionTransformVertex[] vertsBottom = new PositionTransformVertex[coords.size()];
		TexturedPolygon[] poly = new TexturedPolygon[coords.size() + 2];
		Vec3f extrudeVector = new Vec3f(0, 0, depth);

		setVectorRotations(extrudeVector, rotX, rotY, rotZ);
		
		if(faceLengths != null && faceLengths.length < coords.size()){
			faceLengths = null;
		}
		float totalLength = 0;
		for(int idx = 0; idx < coords.size(); idx++){
			Coord2D curCoord = coords.get(idx);
			Coord2D nextCoord = coords.get((idx + 1) % coords.size());
			float texU1 = ((float)(curCoord.uCoord + u) / (float)textureWidth);
			float texU2 = ((float)(shapeTextureWidth * 2 - curCoord.uCoord + u) / (float)textureWidth);
			float texV = ((float)(curCoord.vCoord + v) / (float)textureHeight);
			Vec3f vecCoord = new Vec3f(curCoord.xCoord, curCoord.yCoord, 0);
			setVectorRotations(vecCoord, rotX, rotY, rotZ);
			verts[idx] = new PositionTransformVertex(
													x + vecCoord.xCoord,
													y + vecCoord.yCoord,
													z + vecCoord.zCoord, texU1, texV);
			verts[idx + coords.size()] = new PositionTransformVertex(
													x + vecCoord.xCoord - extrudeVector.xCoord,
													y + vecCoord.yCoord - extrudeVector.yCoord,
													z + vecCoord.zCoord - extrudeVector.zCoord, texU2, texV);
			vertsTop[idx] = new PositionTransformVertex(verts[idx].vector3F, verts[idx].textureX, verts[idx].textureY);
			vertsBottom[coords.size() - idx - 1] = new PositionTransformVertex(verts[idx + coords.size()].vector3F,verts[idx + coords.size()].textureX,verts[idx + coords.size()].textureY);
			if(faceLengths != null){
				totalLength+= faceLengths[idx];
			}
			else{
				totalLength+= Math.sqrt(Math.pow(curCoord.xCoord - nextCoord.xCoord, 2) + Math.pow(curCoord.yCoord - nextCoord.yCoord, 2));
			}
		}
		poly[coords.size()] = new TexturedPolygon(vertsTop);
		poly[coords.size() + 1] = new TexturedPolygon(vertsBottom);
		float currentLengthPosition = totalLength;
		
		for(int idx = 0; idx < coords.size(); idx++){
			Coord2D curCoord = coords.get(idx);
			Coord2D nextCoord = coords.get((idx + 1) % coords.size());
			float currentLength = (float)Math.sqrt(Math.pow(curCoord.xCoord - nextCoord.xCoord, 2) + Math.pow(curCoord.yCoord - nextCoord.yCoord, 2));
			if(faceLengths != null){
				currentLength = faceLengths[faceLengths.length - idx - 1];
			}
			float ratioPosition = currentLengthPosition / totalLength;
			float ratioLength = (currentLengthPosition - currentLength) / totalLength;
			float texU1 = ((float)(ratioLength * (float)sideTextureWidth + u) / (float)textureWidth);
			float texU2 = ((float)(ratioPosition * (float)sideTextureWidth + u) / (float)textureWidth);
			float texV1 = (((float)v + (float)shapeTextureHeight) / (float)textureHeight);
			float texV2 = (((float)v + (float)shapeTextureHeight + (float)sideTextureHeight) / (float)textureHeight);
			PositionTransformVertex[] polySide = new PositionTransformVertex[4];
			polySide[0] = new PositionTransformVertex(verts[idx].vector3F, texU2, texV1);
			polySide[1] = new PositionTransformVertex(verts[coords.size() + idx].vector3F, texU2, texV2);
			polySide[2] = new PositionTransformVertex(verts[coords.size() + ((idx + 1) % coords.size())].vector3F, texU1, texV2);
			polySide[3] = new PositionTransformVertex(verts[(idx + 1) % coords.size()].vector3F, texU1, texV1);
			poly[idx] = new TexturedPolygon(polySide);
			currentLengthPosition -= currentLength;
		}
		return new Shape3D(verts, poly);
	}
	
	protected Vec3f setVectorRotations(Vec3f extrudeVector, float xRot, float yRot, float zRot){
		float x = xRot;
		float y = yRot;
		float z = zRot;
        float xC = MathHelper.cos(x);
        float xS = MathHelper.sin(x);
        float yC = MathHelper.cos(y);
        float yS = MathHelper.sin(y);
        float zC = MathHelper.cos(z);
        float zS = MathHelper.sin(z);
        
        double xVec = extrudeVector.xCoord;
        double yVec = extrudeVector.yCoord;
        double zVec = extrudeVector.zCoord;
        
        // rotation around x
		double xy = xC*yVec - xS*zVec;
		double xz = xC*zVec + xS*yVec;
		// rotation around y
		double yz = yC*xz - yS*xVec;
		double yx = yC*xVec + yS*xz;
		// rotation around z
		double zx = zC*yx - zS*xy;
		double zy = zC*xy + zS*yx;
		
		xVec = zx;
		yVec = zy;
		zVec = yz;
		
        return new Vec3f((float) xVec, (float) yVec, (float) zVec);
	}
	
}
