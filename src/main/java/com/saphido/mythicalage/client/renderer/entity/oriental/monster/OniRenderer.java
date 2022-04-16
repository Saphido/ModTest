package com.saphido.mythicalage.client.renderer.entity.oriental.monster;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.saphido.mythicalage.client.model.entity.oriental.monster.OniModel;
import com.saphido.mythicalage.core.entity.oriental.monsters.OniEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class OniRenderer extends GeoEntityRenderer<OniEntity> {
	public OniRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new OniModel());
	}

	@Override
	public RenderType getRenderType(OniEntity animatable, float partialTicks, PoseStack stack,
			MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
			ResourceLocation textureLocation) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
	
	
}

