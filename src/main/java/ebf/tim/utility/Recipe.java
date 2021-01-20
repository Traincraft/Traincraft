package ebf.tim.utility;

import ebf.XmlBuilder;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Recipe {

    List<ItemStack> result = new ArrayList<>();
    List<List<ItemStack>> input = new ArrayList<>();
    private int tier = 0; //a tier either 0, 1, 2, or 3
    private int[] displayItem=new int[]{0,0,0,0,0,0,0,0,0,0}; //idk what this for, but it will have to be changed for supporting 10 input slots


    public Recipe(List<ItemStack> results, List<List<ItemStack>> cost, int tier) {
        this.result = results;
        this.input = cost;
        this.tier = tier;
    }
    public Recipe(List<ItemStack> results, List<List<ItemStack>> cost){
        result=results;input=cost;tier=1;
    }
    public void addResults(List<ItemStack> results){
        result.addAll(results);
    }

    @Deprecated
    public Recipe(ItemStack[] resultItems,
            ItemStack[] topLeft, ItemStack[] topCenter, ItemStack[] topRight,
                  ItemStack[] middleLeft, ItemStack[] middleCenter, ItemStack[] middleRight,
                  ItemStack[] bottomLeft, ItemStack[] bottomCenter, ItemStack[] bottomRight){

        result.addAll(Arrays.asList(resultItems));

        input.add(Arrays.asList(topLeft));
        input.add(Arrays.asList(topCenter));
        input.add(Arrays.asList(topRight));

        input.add(Arrays.asList(middleLeft));
        input.add(Arrays.asList(middleCenter));
        input.add(Arrays.asList(middleRight));

        input.add(Arrays.asList(bottomLeft));
        input.add(Arrays.asList(bottomCenter));
        input.add(Arrays.asList(bottomRight));

        tier = 0;
    }

    @Deprecated
    public Recipe(ItemStack result,
                  ItemStack topLeft, ItemStack topCenter, ItemStack topRight,
                  ItemStack middleLeft, ItemStack middleCenter, ItemStack middleRight,
                  ItemStack bottomLeft, ItemStack bottomCenter, ItemStack bottomRight){

        this.result.add(result);

        input.add(Collections.singletonList(topLeft));
        input.add(Collections.singletonList(topCenter));
        input.add(Collections.singletonList(topRight));

        input.add(Collections.singletonList(middleLeft));
        input.add(Collections.singletonList(middleCenter));
        input.add(Collections.singletonList(middleRight));

        input.add(Collections.singletonList(bottomLeft));
        input.add(Collections.singletonList(bottomCenter));
        input.add(Collections.singletonList(bottomRight));

        tier = 0;
    }

    //gets the individual stacks to check for crafting matches
    public List<ItemStack> topLeft(){return input.get(0);}
    public List<ItemStack> topCenter(){return input.get(1);}
    public List<ItemStack> topRight(){return input.get(2);}

    public List<ItemStack> middleLeft(){return input.get(3);}
    public List<ItemStack> middleCenter(){return input.get(4);}
    public List<ItemStack> middleRight(){return input.get(5);}

    public List<ItemStack> bottomLeft(){return input.get(6);}
    public List<ItemStack> bottomCenter(){return input.get(7);}
    public List<ItemStack> bottomRight(){return input.get(8);}

    public List<ItemStack> getresult(){return result;}

    public int getTier() {
        return tier;
    }

    public Recipe setTier(int tier) {
        this.tier = tier;
        return this;
    }

    public List<List<ItemStack>> getRecipeItems() {
        return input;
    }

    public void nextDisplayItem(){
        for(int i=0;i<input.size();i++) {
            displayItem[i]++;
            if (displayItem[i] >= input.get(i).size()) {
                displayItem[i] = 0;
            }
        }
    }

    //gets the list of itemstacks that should display on the crafting guide
    public ItemStack[] getDisplayArray(){
        return new ItemStack[]{
                input.get(0).get(displayItem[0]),input.get(1).get(displayItem[1]),input.get(2).get(displayItem[2]),
                input.get(3).get(displayItem[3]),input.get(4).get(displayItem[4]),input.get(5).get(displayItem[5]),
                input.get(6).get(displayItem[6]),input.get(7).get(displayItem[7]),input.get(8).get(displayItem[8]),
                result.get(displayItem[9])
        };
    }





    public boolean inputMatches(List<ItemStack> stacks){
        //first make sure that stacks isn't too small, ie. recipe for 9 slots and stacks is 10
        if (stacks.size() < input.size()) return false;

        int i=0;
        for(List<ItemStack> slot : input){
            for(ItemStack s : slot){
                if(s==null && stacks.get(i) == null) {
                    //both must be null otherwise stacks.get(i) could have something and it falsely matches
                    continue;
                } else if (s == null && stacks.get(i) != null) {
                    //the recipe can be null but an item could be in the slot
                    return false;
                } else if(stacks.get(i)==null || s.getItem()!=stacks.get(i).getItem() || s.stackSize>stacks.get(i).stackSize){
                    //s!=null here, so if stacks.get(i) null bad, or the item not equal, or stack not big enough
                    return false;
                }
            }
            i++;
        }
        return true;
    }



    public boolean recipeInputMatches(List<List<ItemStack>> stacks){ //is this correctly comparing when null is present in the stacks parameter?
        int i=0;
        boolean slotClear=false;
        for(List<ItemStack> slot : input){//iterate through the recipe's ingredients
            if (stacks.size() <= i){return false;} //recipes are variable length, terminate if it gets to the end without success
            for(ItemStack s : slot){//iterate through the items that fit as the recipe's ingredient
                for(ItemStack stak : stacks.get(i)) { //iterate the items that fit as that ingredient in stacks
                    slotClear = false; //need to reset, so doesn't carry over from prev. matching
                    if(s==null && stak==null) { //if both are null, that is ok, it matches
                        slotClear=true;
                        break;
                    } else if(s==null || stak==null){ //one is null when the other isn't.
                        //Can either s or stak be null when there is a possible ingredient?
                        //  I think not, so this means the ingredients don't match. Return false.
                        //  Already accounted for both null, so this is safe to return false.
                        return false;
                    }
                    if ((s.getItem() == stak.getItem() && s.stackSize <= stak.stackSize)) {
                        slotClear=true;
                        break;
                    }
                    if(slotClear){break;}
                }
                if(!slotClear){return false;}
            }
            i++;
        }
        return true;
    }





    public String saveRecipe(){
        XmlBuilder xml = new XmlBuilder();
        XmlBuilder slot;
        int ii=0,i=0;
        for (List<ItemStack> slots : input){
            slot = new XmlBuilder();
            for(ItemStack s : slots){
                slot.putItemStack("variant "+ii,s);
                ii++;
            }
            xml.putXml("slot " +i, slot);
            i++;
        }
        return xml.toXMLString();
    }

    public Recipe loadRecipe(String s){
        XmlBuilder xml = new XmlBuilder(s);
        input = new ArrayList<>();
        for (int i=0;i<9;i++){
            List<ItemStack> list=new ArrayList<>();

            XmlBuilder builder = xml.getXml("slot "+i);
            for(String stack : builder.itemMap.keySet()) {
                list.add(builder.getItemStack(stack));
            }
            input.add(list);

        }

        return this;
    }

}
