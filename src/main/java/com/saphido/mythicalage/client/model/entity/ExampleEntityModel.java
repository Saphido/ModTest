package com.saphido.mythicalage.client.model.entity;

import com.saphido.mythicalage.MythicalAgeMod;
import com.saphido.mythicalage.core.entity.ExampleEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class ExampleEntityModel extends AnimatedTickingGeoModel<ExampleEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(ExampleEntity entity) {
		return new ResourceLocation(MythicalAgeMod.ModID, "animations/bat.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(ExampleEntity entity) {
		return new ResourceLocation(MythicalAgeMod.ModID, "geo/bat.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(ExampleEntity entity) {
		return new ResourceLocation(MythicalAgeMod.ModID, "textures/model/entity/bat.png");
	}

	@SuppressWarnings({ "unchecked", "unused", "rawtypes" })
	@Override
	public void setLivingAnimations(ExampleEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
		super.setLivingAnimations(entity, uniqueID, customPredicate);
		IBone head = this.getAnimationProcessor().getBone("head");

		LivingEntity entityIn = (LivingEntity) entity;
		EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
		head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
		head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
	}
}
