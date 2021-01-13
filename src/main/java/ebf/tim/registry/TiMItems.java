package ebf.tim.registry;

import ebf.tim.TrainsInMotion;
import ebf.tim.items.*;
import net.minecraft.item.Item;

public class TiMItems {

    //todo
    public static Item adminKey,crowbar;


    public static Item cabinWood,cabinAluminium,cabinCopper,cabinIron,cabinSteel,cabinFiberglass,cabinPlastic;
    public static Item frameWood,frameAluminium,frameCopper,frameIron,frameSteel,frameFiberglass,framePlastic;
    public static Item wheelWood,wheelAluminium,wheelIron,wheelSteel,wheelPlastic;
    public static Item chimneyWood,chimneyAluminium,chimneyCopper,chimneyIron,chimneySteel,chimneyFiberglass,chimneyPlastic, chimneyAluminiumShort, chimneySteelShort;

    public static Item boilerWood,boilerIron,boilerSteel,boilerCopper;
    public static Item fireboxIron, fireboxSteel;
    public static Item petrolEngine,smallDieselEngine,mediumDieselEngine,largeDieselEngine;
    public static Item smallElectricEngine,mediumElectricEngine,largeElectricEngine;

    public static Item seatsWooden,seatsIron,seatsPadded,seatsLuxury;

    public static Item hydraulicTransmission,pneumaticTransmission,transformer,transformerHV,electricControls;

    public static Item enginePiston,cylinder,camshaft,graphite,steelPinCircuit, goldPinCircuit, connectingRod;

    public static Item copperWire,goldWire, carbonWire, steelWire, aluminiumWire, insulatedCopperWire, insulatedAluminiumWire;

    public static Item controlPanel, controlStand;

    public static Item walschaertsValveGear, stephensonValveGear, bakerValveGear, radialValveGear, conjugatingValveGear;

    public static Item railItem;

    public static Item generator;


    public static void registerItems(){

        TiMGenericRegistry.RegisterItem(new ItemStake(), TrainsInMotion.MODID, "stake",TrainsInMotion.creativeTab);

        TiMGenericRegistry.RegisterItem(new ItemAdminBook(),TrainsInMotion.MODID, "adminbook", TrainsInMotion.creativeTab);
        TiMGenericRegistry.RegisterItem(new ItemCraftGuide(),TrainsInMotion.MODID, "craftbook", TrainsInMotion.creativeTab);

        TiMGenericRegistry.RegisterItem(new ItemPaintBucket(),TrainsInMotion.MODID, "paintbucket", TrainsInMotion.creativeTab);
        TiMGenericRegistry.RegisterItem(new ItemKey(),TrainsInMotion.MODID,  "transportkey", TrainsInMotion.creativeTab);
        TiMGenericRegistry.RegisterItem(new ItemTicket(),TrainsInMotion.MODID,  "transportticket", TrainsInMotion.creativeTab);


        //overides the server registration of the rail item, so the client can have a complex model.
        //   server can't load the CustomItemModel class due to it's reliance on GL imports.
        if(!TrainsInMotion.proxy.isClient()) {
            railItem = TiMGenericRegistry.RegisterItem( new ItemRail(), TrainsInMotion.MODID, "timrail", TrainsInMotion.creativeTab);
        } else {
            railItem = TiMGenericRegistry.RegisterItem(new ItemRail(),TrainsInMotion.MODID,  "timrail", null, TrainsInMotion.creativeTab, null, ebf.tim.items.CustomItemModel.instance);
        }


        //Cabins
        cabinWood = createItem("cabin.wood");
        cabinAluminium = createItem("cabin.aluminium");
        cabinCopper = createItem("cabin.copper");
        cabinIron = createItem("cabin.iron");
        cabinSteel = createItem("cabin.steel");
        cabinFiberglass = createItem("cabin.fiberglass");
        cabinPlastic = createItem("cabin.plastic");

        //Frames
        frameWood = createItem("frame.wood");
        frameAluminium = createItem("frame.aluminium");
        frameCopper = createItem("frame.copper");
        frameIron = createItem("frame.iron");
        frameSteel = createItem("frame.steel");
        frameFiberglass = createItem("frame.fiberglass");
        framePlastic = createItem("frame.plastic");

        //Wheels
        wheelWood = createItem("wheel.wood");
        wheelAluminium = createItem("wheel.aluminium");
        wheelIron = createItem("wheel.iron");
        wheelSteel = createItem("wheel.steel");
        wheelPlastic = createItem("wheel.plastic");

        //Chimneys
        chimneyWood = createItem("chimney.wood");
        chimneyAluminium = createItem("chimney.aluminium");
        chimneyCopper = createItem("chimney.copper");
        chimneyIron = createItem("chimney.iron");
        chimneySteel = createItem("chimney.steel");
        chimneyFiberglass = createItem("chimney.fiberglass");
        chimneyPlastic = createItem("chimney.plastic");
        chimneyAluminiumShort = createItem("chimney.aluminium.short");
        chimneySteelShort = createItem("chimney.steel.short");

        //Boilers
        boilerWood = createItem("boiler.wood");
        boilerIron = createItem("boiler.iron");
        boilerSteel = createItem("boiler.steel");
        boilerCopper = createItem("boiler.copper");

        //Fireboxes
        fireboxIron = createItem("firebox.iron");
        fireboxSteel = createItem("firebox.steel");

        //Engines
        petrolEngine = createItem("petrol.engine");
        smallDieselEngine = createItem("small.diesel.engine");
        mediumDieselEngine = createItem("medium.diesel.engine");
        largeDieselEngine = createItem("large.diesel.engine");
        smallElectricEngine = createItem("small.electric.engine");
        mediumElectricEngine = createItem("medium.electric.engine");
        largeElectricEngine = createItem("large.electric.engine");

        //Seats
        seatsWooden = createItem("seats.wooden");
        seatsIron = createItem("seats.iron");
        seatsPadded = createItem("seats.padded");
        seatsLuxury = createItem("seats.luxury");

        //Transmissions + Other
        hydraulicTransmission = createItem("hydraulic.transmission");
        pneumaticTransmission = createItem("pneumatic.transmission");
        transformer = createItem("transformer");
        transformerHV = createItem("transformer.hv");
        electricControls = createItem("electric.controls");

        //Wires
        copperWire = createItem("copper.wire");
        goldWire = createItem("gold.wire");
        carbonWire = createItem("carbon.wire");
        steelWire = createItem("steel.wire");
        aluminiumWire = createItem("aluminium.wire");
        insulatedCopperWire = createItem("insulated.copper.wire");
        insulatedAluminiumWire = createItem("insulated.aluminium.wire");

        //Valve Gears
        walschaertsValveGear = createItem("walschaerts.valve.gear");
        stephensonValveGear = createItem("stephenson.valve.gear");
        bakerValveGear = createItem("baker.valve.gear");
        radialValveGear = createItem("radial.valve.gear");
        conjugatingValveGear = createItem("conjugating.valve.gear");

        //Other
        enginePiston = createItem("engine.piston");
        cylinder = createItem("engine.cylinder");
        camshaft = createItem("camshaft");
        graphite = createItem("graphite");
        steelPinCircuit = createItem("steel.pin.circuit");
        goldPinCircuit = createItem("gold.pin.circuit");
        controlPanel = createItem("control.panel");
        controlStand = createItem("control.stand");
        connectingRod = createItem("connecting.rod");

        //Idk if oversight or left out on purpose
        generator = createItem("generator");

    }

    private static Item createItem(String unlocalizedName) {
        Item item = new Item();
        TiMGenericRegistry.RegisterItem(item, TrainsInMotion.MODID, unlocalizedName, TrainsInMotion.creativeTabCrafting);
        item.setTextureName(TrainsInMotion.MODID+ ":" + "crafting/" + item.getUnlocalizedName().replace("item.", ""));
        return item;
    }

    //variables are not truly passed by reference, so this does not work.
//    private static void craftItmShorthand(Item i, String unlocalizedName) {
//        if (i == null) {
//            i=new Item();
//        }
//        TiMGenericRegistry.RegisterItem(i =new Item(),TrainsInMotion.MODID,unlocalizedName,TrainsInMotion.creativeTabCrafting);
//        i.setTextureName(TrainsInMotion.MODID+ ":" + "crafting/" + i.getUnlocalizedName().replace("item.", ""));
//    }

}
