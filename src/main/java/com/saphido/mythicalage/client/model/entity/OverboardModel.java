package com.saphido.mythicalage.client.model.entity;

import com.saphido.mythicalage.MythicalAgeMod;
import com.saphido.mythicalage.core.entity.OverboardEntity;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OverboardModel extends AnimatedGeoModel<OverboardEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(OverboardEntity entity) {
		return new ResourceLocation(MythicalAgeMod.ModID, "animations/bike.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(OverboardEntity entity) {
		return new ResourceLocation(MythicalAgeMod.ModID, "geo/overboard.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(OverboardEntity entity) {
		return new ResourceLocation(MythicalAgeMod.ModID, "textures/model/entity/overboard.png");
	}
}
