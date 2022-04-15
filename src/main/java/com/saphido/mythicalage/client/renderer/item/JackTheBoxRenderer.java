package com.saphido.mythicalage.client.renderer.item;

import com.saphido.mythicalage.client.model.item.JackTheBoxModel;
import com.saphido.mythicalage.item.JackTheBoxItem;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class JackTheBoxRenderer extends GeoItemRenderer<JackTheBoxItem> {
	public JackTheBoxRenderer() {
		super(new JackTheBoxModel());
	}
}
