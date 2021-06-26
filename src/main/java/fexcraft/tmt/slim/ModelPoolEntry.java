package fexcraft.tmt.slim;

import java.io.File;

public abstract class ModelPoolEntry {
	
	public String name;
	public TexturedPolygon[] faces;
	protected String[] fileExtensions;
	
	public File checkValidPath(String path){
		File file = null;
		for(int index = 0; index < fileExtensions.length && (file == null || !file.exists()); index++){
			String absPath = path;
			if(!path.endsWith("." + fileExtensions[index])){
				absPath+= "." + fileExtensions[index];
			}
			file = new File(absPath);
		}
		if(file == null || !file.exists()){
			return null;
		}
		return file;
	}
	
	public abstract void getModel(File file);
    
}
