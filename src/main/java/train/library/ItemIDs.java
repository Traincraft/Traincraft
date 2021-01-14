/*******************************************************************************
 * Copyright (c) 2012 mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author mrbrutal
 ******************************************************************************/

package train.library;

import net.minecraft.item.Item;

public enum ItemIDs {
	//diesel("ItemContainer", "item_diesel_filled", 20),
	//stake("ItemStacked", "item_stake", 1),
	//steeldust("ItemTrain", "item_steeldust", 0),
	coaldust("ItemTrain", "item_coaldust", 15),
	//boiler("ItemTrain", "item_boiler_steel", 5),
	//firebox("ItemTrain", "item_firebox_steel", 5),
	//bogie("ItemTrain", "item_bogie_steel", 4),
	//steelframe("ItemTrain", "item_frame_steel", 6),
	//steelcab("ItemTrain", "item_cab_steel", 5),
	//steelchimney("ItemTrain", "item_chimney_steel", 5),
	airship("ItemZeppelin", "item_zeppelin", 1),
	balloon("ItemTrain", "item_balloon", 7),
	propeller("ItemTrain", "item_propeller", 6),
	steamengine("ItemTrain", "item_engine_steam", 2),
	//dieselengine("ItemTrain", "item_engine_diesel", 1),
	//piston("ItemTrain", "item_piston", 9),
	//camshaft("ItemTrain", "item_camshaft", 8),
	//cylinder("ItemTrain", "item_cylinder", 7),
	//electmotor("ItemTrain", "item_engine_electric", 1),
	//woodenFrame("ItemTrain", "item_frame_wood", 12),
	//woodenBogie("ItemTrain", "item_bogie_wood", 15),
	//woodenCab("ItemTrain", "item_cab_wood", 10),
	//ironChimney("ItemTrain", "item_chimney_iron", 7),
	//ironFirebox("ItemTrain", "item_firebox_iron", 4),
	//ironBoiler("ItemTrain", "item_boiler_iron", 5),
	//ironFrame("ItemTrain", "item_frame_iron", 6),
	//ironBogie("ItemTrain", "item_bogie_iron", 8),
	//ironCab("ItemTrain", "item_cab_iron", 5),
	//steel("ItemTrain", "item_steel", 4),
	//refinedFuel("ItemContainer", "item_fuel_filled", 15),
	signal("ItemSignal", "item_signal", 0),
	//seats("ItemTrain", "item_seats", 15),
	//transformer("ItemTrain", "item_transformer", 4),
	//controls("ItemTrain", "item_controls", 7),
	//transmition("ItemTrain", "item_transmition", 5),
	//generator("ItemTrain", "item_generator", 5),
	overalls("ItemTCArmor", "armour_overalls", 1),
	jacket("ItemTCArmor", "armour_jacket", 1),
	hat("ItemTCArmor", "armour_hat", 1),
	//rawPlastic("ItemTrain", "item_plastic", 20),
	//ingotCopper("ItemTrain", "item_copper", 9),
	//copperWireFine("ItemTrain", "item_wire", 4),
	//electronicCircuit("ItemTrain", "item_circuit", 2),
	//chunkLoaderActivator("ItemChunkLoaderActivator", "item_chunk_loader", 1),
	//refinedFuelLiquid("ItemTrain", "item_liquid_fuel"),
	//dieselLiquid("ItemTrain", "item_liquid_diesel"),
	emptyCanister("ItemContainer", "item_canister", 40),
	//copperRail("ItemRail", "item_rail_copper", 1),
	//steelRail("ItemRail", "item_rail_steel", 1),
	copperRail("ItemTrain", "item_rail_copper", 1),
	steelRail("ItemTrain", "item_rail_steel", 1),
	//adminBook("ItemAdminBook", "item_book_blue", 0),

	hat_ticketMan_paintable("ItemTCArmor", "armor_ticket_man_hat", 1),
	pants_ticketMan_paintable("ItemTCArmor", "armor_ticket_man_pants", 1),
	jacket_ticketMan_paintable("ItemTCArmor", "armor_ticket_man_jacket", 1),
	hat_driver_paintable("ItemTCArmor", "armor_driver_hat", 1),
	pants_driver_paintable("ItemTCArmor", "armor_driver_pants", 1),
	jacket_driver_paintable("ItemTCArmor", "armor_driver_jacket", 1),

	helmet_suit_paintable("ItemTCArmor", "armor_composite_helmet", 1),
	pants_suit_paintable("ItemTCArmor", "armor_composite_pants", 1),
	boots_suit_paintable("ItemTCArmor", "armor_composite_boots", 1),
	jacket_suit_paintable("ItemTCArmor", "armor_composite_chest", 1),
	reinforcedPlastic("ItemTrain", "item_fiberglass_plate", 10),
	reinforcedPlates("ItemTrain", "item_reinforced_plate", 10),
	composite_wrench("ItemWrench", "item_composite_wrench", 1),

	zeppelin("ItemZeppelin", "item_zeppelin_one_balloon", 1);

	public Item item;
	public String className;
	public String iconName;

	/**
	 * amount for one emerald. For ItemRollingStock, it is the price for one train
	 */
	public int amountForEmerald;

	/**
	 * @param classMethodName
	 * @param iconName
	 * @param amountForEmerald for one emerald. For ItemRollingStock, it is the price for one train
	 */
	ItemIDs(String classMethodName, String iconName, int amountForEmerald) {
		this.className = classMethodName;
		this.iconName = iconName;
		this.amountForEmerald = amountForEmerald;
	}

}