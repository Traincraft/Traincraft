package si.meansoft.traincraft.client.models;

import net.minecraft.client.model.ModelRenderer;

/**
 * @author canitzp
 */
public class ModelTrackShortStraight extends ModelExtendedBase{

    public ModelRenderer box1;
    public ModelRenderer box2;
    public ModelRenderer box3;
    public ModelRenderer box4;
    public ModelRenderer box5;
    public ModelRenderer box6;
    public ModelRenderer box7;
    public ModelRenderer box8;
    public ModelRenderer box9;
    public ModelRenderer box10;

    public ModelTrackShortStraight(){
        box1 = new ModelRenderer(this, 0, 0);
        box1.setTextureSize(128, 128);
        box1.addBox(0F, 0F, 0F, 32, 2, 4, 0F);

        box2 = new ModelRenderer(this, 0, 0);
        box2.setTextureSize(128, 128);
        box2.addBox(0F, 0F, 0F, 32, 2, 4, 0F);

        box3 = new ModelRenderer(this, 0, 0);
        box3.setTextureSize(128, 128);
        box3.addBox(0F, 0F, 0F, 32, 2, 4, 0F);

        box4 = new ModelRenderer(this, 0, 0);
        box4.setTextureSize(128, 128);
        box4.addBox(0F, 0F, 0F, 32, 2, 4, 0F);

        box5 = new ModelRenderer(this, 0, 7);
        box5.setTextureSize(128, 128);
        box5.addBox(0F, 0F, 0F, 3, 1, 32, 0F);

        box6 = new ModelRenderer(this, 0, 41);
        box6.setTextureSize(128, 128);
        box6.addBox(0F, 0F, 0F, 3, 1, 32, 0F);

        box7 = new ModelRenderer(this, 0, 75);
        box7.setTextureSize(128, 128);
        box7.addBox(0F, 0F, 0F, 2, 2, 32, 0F);

        box8 = new ModelRenderer(this, 0, 7);
        box8.setTextureSize(128, 128);
        box8.addBox(0F, 0F, 0F, 3, 1, 32, 0F);

        box9 = new ModelRenderer(this, 0, 75);
        box9.setTextureSize(128, 128);
        box9.addBox(0F, 0F, 0F, 2, 2, 32, 0F);

        box10 = new ModelRenderer(this, 0, 41);
        box10.setTextureSize(128, 128);
        box10.addBox(0F, 0F, 0F, 3, 1, 32, 0F);

    }

    @Override
    public void render(float scale){
        box1.render(scale);
        box2.render(scale);
        box3.render(scale);
        box4.render(scale);
        box5.render(scale);
        box6.render(scale);
        box7.render(scale);
        box8.render(scale);
        box9.render(scale);
        box10.render(scale);
    }

}
