package com.azulite.constellarium.item;

import com.azulite.constellarium.Constellarium;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CONSTELLARIUM = registerItem("constellarium", new Item(new FabricItemSettings()));
    public static final Item STARFALL_CAKE = registerItem("starfall_cake", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(CONSTELLARIUM);
        entries.add((STARFALL_CAKE));
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Constellarium.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Constellarium.LOGGER.info("Registering Mod items for " + Constellarium.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}

