package com.saphido.mythicalage.client.model.entity;

import com.saphido.mythicalage.MythicalAgeMod;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

@SuppressWarnings("rawtypes")
public class ReplaceCreeperModel extends AnimatedGeoModel {
	@Override
	public ResourceLocation getModelLocation(Object object) {
		return new ResourceLocation(MythicalAgeMod.ModID, "geo/creeper.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(Object object) {
		return new ResourceLocation(MythicalAgeMod.ModID, "textures/model/entity/creeper.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(Object animatable) {
		return new ResourceLocation(MythicalAgeMod.ModID, "animations/creeper.animation.json");
	}
}
