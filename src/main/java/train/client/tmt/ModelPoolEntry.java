package train.client.tmt;

import net.minecraft.client.model.PositionTextureVertex;
import net.minecraft.util.MathHelper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Used by the Model Pool to load models from config files such as OBJ.
 */
public class ModelPoolEntry {
	
    /**
     * Sets the current transformation group. The transformation group is used
     * to allow for vertex transformation. If a transformation group does not exist,
     * a new one will be created.
     * @param groupName the name of the transformation group you want to switch to
     */
    protected void setGroup(String groupName) {
    	setGroup(groupName, new Bone(0, 0, 0, 0), 1D);
    }
    
    /**
     * Sets the current transformation group. The transformation group is used
     * to allow for vertex transformation. If a transformation group does not exist,
     * a new one will be created.
     * @param groupName the name of the transformation group you want to switch to
     * @param bone the Bone this transformation group is attached to
     * @param weight the weight of the transformation group
     */
    protected void setGroup(String groupName, Bone bone, double weight) {
    	if(groups.size() == 0 || !groups.containsKey(groupName))
    		groups.put(groupName, new TransformGroupBone(bone, weight));
    	group = groups.get(groupName);
    }
    
    /**
     * Sets the current texture group, which is used to switch the
     * textures on a per-model base. Do note that any model that is
     * rendered afterwards will use the same texture. To counter it,
     * set a default texture, either at initialization or before
     * rendering.
     * @param groupName The name of the texture group. If the texture
     * group doesn't exist, it creates a new group automatically.
     */
    protected void setTextureGroup(String groupName) {
    	if(textures.size() == 0 || !textures.containsKey(groupName)) {
    		textures.put(groupName, new ArrayList<TexturedPolygon>());
    	}
    	texture = textures.get(groupName);
    }
    
    protected void applyGroups(Map<String, TransformGroupBone> groupsMap, Map<String, List<TexturedPolygon>> texturesMap) {
    	
    	Iterator<String> groupsItr = groups.keySet().iterator();
    	Iterator<String> texturesItr = textures.keySet().iterator();
    	
    	while(groupsItr.hasNext()) {
    		int nameIdx = 0;
    		String groupKey = groupsItr.next();
    		String currentGroup = name + "_0:" + groupKey;
    		while(groupsMap.size() > 0 && groupsMap.containsKey(currentGroup)) {
    			nameIdx++;
    			currentGroup = name + "_" + nameIdx + ":" + groupKey;
    		}
    		groupsMap.put(currentGroup, groups.get(groupKey));
    	}

    	while(texturesItr.hasNext()) {
    		int nameIdx = 0;
    		String groupKey = texturesItr.next();
    		String currentGroup = name + "_0:" + groupKey;
    		while(groupsMap.size() > 0 && texturesMap.containsKey(currentGroup)) {
    			nameIdx++;
    			currentGroup = name + "_" + nameIdx + ":" + groupKey;
    		}
    		texturesMap.put(currentGroup, textures.get(groupKey));
    	}
    }
    	
    public String name;
	public PositionTransformVertex[] vertices;
	public TexturedPolygon[] faces;
	public Map<String, TransformGroupBone> groups;
	public Map<String, List<TexturedPolygon>> textures;
	protected TransformGroupBone group;
	protected List<TexturedPolygon> texture = new ArrayList<TexturedPolygon>();


	public ModelPoolEntry() {
	}


	/**
	 * Loads an OBJ model from file and converts it to ModelRendererTurbo
	 * @param file the path and name of the model file
	 */
	public void getModelFromObj(File file) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));

			String s;

			ArrayList<PositionTransformVertex> verts = new ArrayList<PositionTransformVertex>();
			ArrayList<float[]> uvs = new ArrayList<float[]>();
			ArrayList<int[]> normals = new ArrayList<int[]>();
			ArrayList<TexturedPolygon> face = new ArrayList<TexturedPolygon>();

			while((s = in.readLine()) != null) {
				s = s.contains("#")?s.substring(0, s.indexOf("#")).trim():s.trim();

				if(s.equals("")) {
					continue;
				}

				if(s.startsWith("g ")) {
					//Groups
					setTextureGroup(s.substring(s.indexOf(" ") + 1).trim());
				}else if(s.startsWith("v ")) {
					//Vertexes
					s = s.substring(s.indexOf(" ") + 1).trim();
					float[] v = new float[3];
					for(int i = 0; i < 3; i++) {
						int ind = s.indexOf(" ");
						v[i] = (ind > -1)?Float.parseFloat(s.substring(0, ind)):Float.parseFloat(s);

						s = s.substring(s.indexOf(" ") + 1).trim();
					}

					float flt = v[2];
					v[2] = -v[1];
					v[1] = flt;

					verts.add(new PositionTransformVertex(v[0], v[1], v[2], 0, 0));
				} else if(s.startsWith("vt ")) {
					//UVs
					s = s.substring(s.indexOf(" ") + 1).trim();
					float[] v = new float[2];
					for(int i = 0; i < 2; i++) {
						int ind = s.indexOf(" ");
						v[i] = (ind > -1)?Float.parseFloat(s.substring(0, ind)): Float.parseFloat(s);

						s = s.substring(s.indexOf(" ") + 1).trim();
					}

					uvs.add(new float[] {v[0], 1F - v[1]});
				} else if(s.startsWith("vn ")) {
					//Normals
					s = s.substring(s.indexOf(" ") + 1).trim();
					int[] v = new int[3];
					for(int i = 0; i < 3; i++) {
						int ind = s.indexOf(" ");
						v[i] = (ind > -1)?Integer.parseInt(s.substring(0, ind)):Integer.parseInt(s);

						s = s.substring(s.indexOf(" ") + 1).trim();
					}

					int flt = v[2];
					v[2] = v[1];
					v[1] = flt;

					normals.add(new int[]{v[0], v[1], v[2]});
				} else if(s.startsWith("f ")) {
					//faces
					s = s.substring(s.indexOf(" ") + 1).trim();
					ArrayList<PositionTextureVertex> v = new ArrayList<PositionTextureVertex>();
					String s1;
					int finalPhase = 0;
					int[] normal = new int[] {0, 0, 0};
					ArrayList<int[]> iNormal = new ArrayList<int[]>();
					while(finalPhase < 1) {
						int vInt;
						float[] curUV;
						int[] curNormals;
						int ind = s.indexOf(" ");
						s1 = s;
						if(ind > -1) {
							s1 = s.substring(0, ind);
						}
						if(s1.contains("/")) {
							String[] f = s1.split("/");
							vInt = Integer.parseInt(f[0]) - 1;
							if(f[1].equals("")) {
								f[1] = f[0];
							}
							curUV = (uvs.size() > Integer.parseInt(f[1]) - 1)?uvs.get(Integer.parseInt(f[1]) - 1):new float[]{0, 0};
							int vnInt = 0;
							if(f.length == 3) {
								if(f[2].equals("")) {
									f[2] = f[0];
								}
								vnInt = Integer.parseInt(f[2]) - 1;
							} else {
								vnInt = Integer.parseInt(f[0]) - 1;
							}
							curNormals = (normals.size() > vnInt)?normals.get(vnInt):new int[]{0, 0, 0};
						} else {
							vInt = Integer.parseInt(s1) - 1;
							curUV = (uvs.size() > vInt)?uvs.get(vInt):new float[]{0, 0};
							curNormals = (normals.size() > vInt)?normals.get(vInt):new int[]{0, 0, 0};
						}

						iNormal.add(new int[]{curNormals[0], curNormals[1], curNormals[2]});

						normal[0]+= curNormals[0];
						normal[1]+= curNormals[1];
						normal[2]+= curNormals[2];

						if(vInt < verts.size()) {
							v.add(verts.get(vInt).setTexturePosition(curUV[0], curUV[1]));
							if(verts.get(vInt) != null) {
								verts.get(vInt).addGroup(group);
							}
						}
						if(ind > -1) {
							s = s.substring(s.indexOf(" ") + 1).trim();
						} else {
							finalPhase++;
						}
					}

					float d = MathHelper.sqrt_float(normal[0] * normal[0] + normal[1] * normal[1] + normal[2] * normal[2]);

					normal[0]/= d;
					normal[1]/= d;
					normal[2]/= d;

					PositionTextureVertex[] vToArr = new PositionTextureVertex[v.size()];

					for(int i = 0; i < v.size(); i++) {
						vToArr[i] = v.get(i);
					}

					TexturedPolygon poly = new TexturedPolygon(vToArr);
					poly.setNormals(iNormal);

					face.add(poly);
					texture.add(poly);
				}
			}

			vertices = new PositionTransformVertex[verts.size()];
			for(int i = 0; i < verts.size(); i++) {
				vertices[i] = verts.get(i);
			}
			faces = new TexturedPolygon[face.size()];
			for(int i = 0; i < face.size(); i++) {
				faces[i] = face.get(i);
			}
			in.close();
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
	}


}
