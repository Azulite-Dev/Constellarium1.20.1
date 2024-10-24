package com.azulite.constellarium.item;

import com.azulite.constellarium.Constellarium;
import com.azulite.constellarium.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup CONSTALLARIUM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Constellarium.MOD_ID,"constellarium"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.constellarium"))
                    .icon(() -> new ItemStack(ModItems.CONSTELLARIUM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CONSTELLARIUM);
                        entries.add(ModBlocks.CONSTELLARIUM_BLOCK);
                    }).build());

    public static void registerItemGroups(){
        Constellarium.LOGGER.info("Registering Constellarium item groups! Nearly there...");

    }
}
