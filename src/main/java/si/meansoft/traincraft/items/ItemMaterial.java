package si.meansoft.traincraft.items;

public class ItemMaterial extends ItemSubtypeBase{

    public ItemMaterial(){
        super("material", Materials.class);
    }

    public enum Materials{

        GRAPHITE("Graphite"),
        STEEL_INGOT("Steel"),
        PLASTIC("Plastic"),
        FUEL_CANISTER_EMPTY("FuelCanisterEmpty"),
        FUEL_CANISTER_FULL("FuelCanisterFull");

        public String name;

        Materials(String name){
            this.name = name;
        }

        public String toString(){
            return this.name;
        }

    }
}
