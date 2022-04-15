package com.saphido.mythicalage.client.renderer.entity;

import com.saphido.mythicalage.client.model.entity.LAModel;
import com.saphido.mythicalage.client.renderer.entity.layer.ExampleLayer;
import com.saphido.mythicalage.core.entity.LAEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class LARenderer extends GeoEntityRenderer<LAEntity> {

    @SuppressWarnings("unchecked")
	public LARenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new LAModel());
        this.addLayer(new ExampleLayer(this));
        this.shadowRadius = 0.25f;
    }
}
