package com.azulite.constellarium.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent STARFALL_CAKE = new FoodComponent.Builder()
            .hunger(10).saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 60),1f)
            .build();
}
