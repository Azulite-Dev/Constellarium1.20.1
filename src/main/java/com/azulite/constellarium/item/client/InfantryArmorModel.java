package com.azulite.constellarium.item.client;

import com.azulite.constellarium.Constellarium;
import com.azulite.constellarium.item.custom.InfantryArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class InfantryArmorModel extends GeoModel<InfantryArmorItem> {
    @Override
    public Identifier getModelResource(InfantryArmorItem animatable) {
        return new Identifier(Constellarium.MOD_ID, "geo/line_infantry.geo.json");
    }

    @Override
    public Identifier getTextureResource(InfantryArmorItem animatable) {
        return new Identifier(Constellarium.MOD_ID, "textures/armor/line_infantry.png");
    }

    @Override
    public Identifier getAnimationResource(InfantryArmorItem animatable) {
        return new Identifier(Constellarium.MOD_ID, "animations/line_infantry.animation.json");
    }
}