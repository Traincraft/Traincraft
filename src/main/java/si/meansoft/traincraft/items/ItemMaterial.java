package si.meansoft.traincraft.items;

/**
 * @author Ellpeck
 */
public class ItemMaterial extends ItemSubtypeBase{

    public ItemMaterial(){
        super("material", Materials.class);
    }

    public enum Materials{

        GRAPHITE("Graphite"),
        PLASTIC("Plastic"),
        COAL_DUST("CoalDust"),
        BALLOON("Balloon"),
        PROPELLER("Propeller"),
        PISTON("Piston"),
        CAMSHAFT("Camshaft"),
        CYLINDER("Cylinder"),
        SEATS("Seats"),
        TRANSFORMER("Transformer"),
        CONTROLS("Controls"),
        TRANSMITION("Transmition"),
        GENERATOR("Generator"),
        ELECTRONIC_CIRCUIT("ElectronicCircuit"),
        STEAM_ENGINE("SteamEngine"),
        DIESEL_ENGINE("DieselEngine"),
        ELECTRIC_ENGINE("ElectricEngine"),
        FUEL_CANISTER_EMPTY("FuelCanisterEmpty"),
        FUEL_CANISTER_FULL("FuelCanisterFull"),
        WOODEN_BOGIE("WoodenBogie"),
        WOODEN_CAB("WoodenCab"),
        WOODEN_FRAME("WoodenFrame"),
        IRON_BOGIE("IronBogie"),
        IRON_BOILER("IronBoiler"),
        IRON_CAB("IronCab"),
        IRON_CHIMNEY("IronChimney"),
        IRON_FRAME("IronFrame"),
        IRON_FIREBOX("IronFirebox"),
        STEEL_INGOT("Steel"),
        STEEL_DUST("SteelDust"),
        STEEL_BOGIE("SteelBogie"),
        STEEL_BOILER("SteelBoiler"),
        STEEL_CAB("SteelCab"),
        STEEL_CHIMNEY("SteelChimney"),
        STEEL_FRAME("SteelFrame"),
        STEEL_FIREBOX("SteelFirebox");


        public String name;

        Materials(String name){
            this.name = name;
        }

        public String toString(){
            return this.name;
        }

    }
}
