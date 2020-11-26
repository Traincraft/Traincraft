package ebf.tim.registry;

/**
 * <h1>NBT URI list</h1>
 * A list of NBT keys to simplify reading and writing from NBT, helps performance by having static values for it.
 * Also helps prevent NBT errors due to mis-matching NBT keys.
 * @author Eternal Blue Flame
 */
public class NBTKeys {

    //generic rail transport bools
    /**used for the lock in GenericRailTransport*/
    public static final String locked ="extended.islocked";
    /**used for the lamp in GenericRailTransport*/
    public static final String lamp = "extended.lamp";
    /**used for the alive/dead state in GenericRailTransport*/
    public static final String dead = "extended.dead";
    /**used for the coupling state in GenericRailTransport*/
    public static final String coupling = "extended.coupling";
    /**used for the creative state in GenericRailTransport*/
    public static final String creative = "extended.creative";
    /**used for the handbrake in GenericRailTransport*/
    public static final String handbrake = "extended.handbrake";
    /**used for whether to use a whitelist or blacklist in GenericRailTransport*/
    public static final String whitelist = "filter.whitelist";
    //train bools
    /**used for the running state in EntityTrainCore*/
    public static final String running = "train.running";
    /**used for the accelerator in EntityTrainCore*/
    public static final String accelerator = "train.accelerator";

    /**used for the skin's MODID in GenericRailTransport*/
    public static final String skinMODID = "extended.skin.modid";
    /**used for the skin's URI in GenericRailTransport*/
    public static final String skinURI = "extended.skin.uri";

    //UUID's
    /**the most significant bits for the frontLinkedTransport in GenericRailTransport*/
    public static final String frontLinkMost = "extended.frontLinkedTransport.most";
    /**the least significant bits for the frontLinkedTransport in GenericRailTransport*/
    public static final String frontLinkLeast = "extended.frontLinkedTransport.least";
    /**the most significant bits for the backLinkedTransport in GenericRailTransport*/
    public static final String backLinkMost = "extended.backLinkedTransport.most";
    /**the least significant bits for the backLinkedTransport in GenericRailTransport*/
    public static final String backLinkLeast = "extended.backLinkedTransport.least";
    /**the most significant bits for the owner in GenericRailTransport*/
    public static final String ownerMost = "extended.owner.most";
    /**the name for the owner in GenericRailTransport*/
    public static final String ownerName = "extended.owner.name";
    /**the least significant bits for the owner in GenericRailTransport*/
    public static final String ownerLeast = "extended.owner.least";
    /**the length of the filter items in GenericRailTransport*/
    public static final String bools = "extended.bools.";

    //lists
    /**the list of inventory items in GenericRailTransport*/
    public static final String inventoryItem = "storage.item.";
    /**the list of filter inventory items in GenericRailTransport*/
    public static final String filterItem = "filter.item.";
    /**the length of the filter items in GenericRailTransport*/
    public static final String filterLength = "filter.length.";


    //ints
    /**the storage for fuel, used in FuelHandler for most all transports*/
    public static final String transportFuel = "fuel.main";
    /**the storage for steam in FuelHandler, only used for steam and nuclear steam trains*/
    public static final String transportSteam = "fuel.steam";
    /**the last known speed of the train*/
    public static final String trainSpeed= "train.speed";


    //positions
    public static final String frontBogieX = "extended.front.x";
    public static final String frontBogieZ = "extended.front.z";
    public static final String backBogieX = "extended.back.x";
    public static final String backBogieZ = "extended.back.z";

    public static final  String rotationRoll = "extended.roll";
    public static final  String prevRotationRoll = "extended.prevroll";

}
