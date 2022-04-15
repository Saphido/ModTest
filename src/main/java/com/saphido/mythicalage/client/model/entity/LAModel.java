package com.saphido.mythicalage.client.model.entity;

import com.saphido.mythicalage.MythicalAgeMod;
import com.saphido.mythicalage.core.entity.LAEntity;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class LAModel extends AnimatedTickingGeoModel<LAEntity> {

	@Override
	public ResourceLocation getModelLocation(LAEntity object) {
		return new ResourceLocation(MythicalAgeMod.ModID, "geo/la.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(LAEntity object) {
		return new ResourceLocation(MythicalAgeMod.ModID, "textures/entity/la.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(LAEntity animatable) {
		return new ResourceLocation(MythicalAgeMod.ModID, "animations/le.animations.json");
	}

}