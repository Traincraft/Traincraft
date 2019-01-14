package train.client.tmt;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Stores the list of models loaded from config files such as OBJ.
 */
public class ModelPool {
	
    public static ModelPoolEntry addFile(String file, Map<String, TransformGroupBone> group, Map<String, List<TexturedPolygon>> textureGroup){
		if(modelMap.containsKey(file)){
			ModelPoolEntry entry = modelMap.get(file);
			entry.applyGroups(group, textureGroup);
			return entry;
		}
		ModelPoolEntry entry = new ModelPoolEntry();
		//InputStream in = entry.getClass().getResourceAsStream("/assets/" + file + ".obj");
		File f = new File(file + ".obj");
		if(f.exists() && !f.isDirectory()) {
			try {
				File tempfile = File.createTempFile(file, ".obj");			tempfile.deleteOnExit();
				//IOUtils.copy(in, new FileOutputStream(tempfile));
				//System.out.println("RENDER: " + tempfile.getPath());
				//if(!tempfile.exists()){
				//System.out.println("The model with the name " + file + " does not exist.");
				//return null;
				//}
				entry.groups = new HashMap<String, TransformGroupBone>();
				entry.textures = new HashMap<String, List<TexturedPolygon>>();
				entry.name = file;
				entry.setGroup("0");
				entry.setTextureGroup("0");
				entry.getModelFromObj(tempfile);
				entry.applyGroups(group, textureGroup);
				modelMap.put(file, entry);
				return entry;
			} catch (Throwable t){}
		}
		System.out.println("TMT ERROR: could not find model file \" " +file + ".obj\"");
		return null;
	}
	
    private static Map<String, ModelPoolEntry> modelMap = new HashMap<String, ModelPoolEntry>();
}
