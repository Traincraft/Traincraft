package traincraft.renderer;

import com.google.gson.JsonObject;
import net.fexcraft.lib.tmt.Format2Model;

/**
 * A class representing general model data for Traincraft.
 * A sub class can be used to animate models or just call specific methods.
 *
 * @since 5.0.0
 * @author Fexcraft
 */
public class TraincraftModel extends Format2Model {
	
	public TraincraftModel() {}
	
	public TraincraftModel(JsonObject jsonObject) {
		super(jsonObject);
	}
	
}
