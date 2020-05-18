package tmt;

/**
 * This class represents a coordinate space and its UV coordinates. This allows for
 * easier flat shape planning.
 * @author GaryCXJk
 *
 */
public class Coord2D {

	public float xCoord;
	public float yCoord;
	public int uCoord;
	public int vCoord;
	
	public Coord2D(float x, float y){
		xCoord = x;
		yCoord = y;
		uCoord = (int)Math.floor(x);
		vCoord = (int)Math.floor(y);
	}
	

	public Coord2D(float x, float y, int u, int v){
		this(x, y);
		uCoord = u;
		vCoord = v;
	}
	
}
