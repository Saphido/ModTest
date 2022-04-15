package com.saphido.mythicalage.client.renderer.item;

import com.saphido.mythicalage.client.model.item.PistoletModel;
import com.saphido.mythicalage.item.weapons.PistoletItem;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class PistoletRenderer extends GeoItemRenderer<PistoletItem> {
	public PistoletRenderer() {
		super(new PistoletModel());
	}

}