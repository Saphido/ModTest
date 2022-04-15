package com.saphido.mythicalage.client.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.saphido.mythicalage.client.model.entity.ExampleEntityModel;
import com.saphido.mythicalage.core.entity.ExampleEntity;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;



public class ExampleRenderer extends GeoEntityRenderer<ExampleEntity> {
	public ExampleRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ExampleEntityModel());
	}

	@Override
	public RenderType getRenderType(ExampleEntity animatable, float partialTicks, PoseStack stack,
			MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
			ResourceLocation textureLocation) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
