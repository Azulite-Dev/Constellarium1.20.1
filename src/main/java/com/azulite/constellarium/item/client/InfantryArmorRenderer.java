package com.azulite.constellarium.item.client;

import com.azulite.constellarium.item.custom.InfantryArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class InfantryArmorRenderer extends GeoArmorRenderer<InfantryArmorItem> {
    public InfantryArmorRenderer() {
        super(new InfantryArmorModel());
    }
}