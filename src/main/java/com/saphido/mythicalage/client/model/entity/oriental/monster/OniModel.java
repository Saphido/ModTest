package com.saphido.mythicalage.client.model.entity.oriental.monster;

import com.saphido.mythicalage.MythicalAgeMod;
import com.saphido.mythicalage.core.entity.oriental.monsters.OniEntity;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class OniModel extends AnimatedTickingGeoModel<OniEntity> {

	@Override
	public ResourceLocation getModelLocation(OniEntity object) {
		return new ResourceLocation(MythicalAgeMod.ModID, "geo/oni.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(OniEntity object) {
		return new ResourceLocation(MythicalAgeMod.ModID, "textures/entity/oni.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(OniEntity animatable) {
		return new ResourceLocation(MythicalAgeMod.ModID, "animations/biped.animation.json");
	}

}