package ebf.tim.api;

import net.minecraft.util.ResourceLocation;

public class skin {
    public String[] texture;
    public ResourceLocation[] bogieTextures, subBogieTextures;
    public int[] colorsFrom, colorsTo;
    public String name, modid, description;
    public int id;

    public skin(String modId, String[] texture, String name, String description){
        this.texture=texture;
        this.modid=modId;
        this.description=description;
        this.name=name;
    }

    public skin(String modId, String texture, String name, String description){
        this.texture=new String[]{texture};
        this.modid=modId;
        this.description=description;
        this.name=name;
    }


    public ResourceLocation getBogieSkin(int index){
        if(bogieTextures ==null || bogieTextures.length==0){
            return null;
        }
        if(bogieTextures.length>index){
            return bogieTextures[index];
        } else {
            return bogieTextures[0];
        }
    }

    public ResourceLocation getSubBogieSkin(int index){
        if(subBogieTextures ==null || subBogieTextures.length==0){
            return null;
        }
        if(subBogieTextures.length>index){
            return subBogieTextures[index];
        } else {
            return subBogieTextures[0];
        }
    }

    public String[] getDescription(){return description.split("\n");}

    public ResourceLocation getTexture(int id){return new ResourceLocation(modid,id>=texture.length?texture[0]:texture[id]);}


    public skin setBogieTextures(String... textures){
        bogieTextures=resourceList(modid,textures);
        return this;
    }
    public skin setBogieTextures(ResourceLocation... textures){
        bogieTextures=textures;
        return this;
    }
    public skin setSubBogieTextures(String... textures){
        subBogieTextures=resourceList(modid,textures);
        return this;
    }
    public skin setSubBogieTextures(ResourceLocation... textures){
        subBogieTextures=textures;
        return this;
    }
    public skin setRecolorsTo(int... recolorsTo){
        colorsTo=recolorsTo;
        return this;
    }

    public skin setRecolorsFrom(int... recolorsFrom){
        colorsFrom=recolorsFrom;
        return this;
    }

    public skin setTexture(String[] texture){
        this.texture=texture;
        return this;
    }


    public skin setTexture(String modId, String[] texture){
        this.texture=texture;
        this.modid=modId;
        return this;
    }

    public skin setName(String name){
        this.name=name;
        return this;
    }

    public skin setDescription(String description){
        this.description = description;
        return this;
    }

    public void setId(int i){
        id=i;
    }


    private static ResourceLocation[] resourceList(String modid, String[] URIs){
        ResourceLocation[] value = new ResourceLocation[URIs.length];
        for (int i=0; i< URIs.length; i++){
            if(URIs[i].contains(":")){
                value[i] = new ResourceLocation(URIs[i]);
            } else {
                value[i] = new ResourceLocation(modid, URIs[i]);
            }
        }
        return value;
    }
}
