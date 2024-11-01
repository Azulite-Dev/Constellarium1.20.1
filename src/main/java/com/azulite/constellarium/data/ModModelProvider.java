package com.azulite.constellarium.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import com.azulite.constellarium.block.ModBlocks;
import com.azulite.constellarium.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.ModelIds;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.INFANTRY_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.INFANTRY_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.INFANTRY_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.INFANTRY_BOOTS, Models.GENERATED);
    }
}