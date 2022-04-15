package com.saphido.mythicalage.client.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.saphido.mythicalage.client.model.entity.OverboardModel;
import com.saphido.mythicalage.core.entity.OverboardEntity;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class OverboardRenderer extends GeoEntityRenderer<OverboardEntity> {
	public OverboardRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new OverboardModel());
	}

	@Override
	public RenderType getRenderType(OverboardEntity animatable, float partialTicks, PoseStack stack,
			MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
			ResourceLocation textureLocation) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
