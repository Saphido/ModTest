package com.saphido.mythicalage.client.model.entity.oriental.monster;

import com.saphido.mythicalage.MythicalAgeMod;
import com.saphido.mythicalage.core.entity.oriental.monsters.TenguEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class TenguModel extends AnimatedTickingGeoModel<TenguEntity> {

	@Override
	public ResourceLocation getModelLocation(TenguEntity object) {
		return new ResourceLocation(MythicalAgeMod.ModID, "geo/tengu.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(TenguEntity object) {
		return new ResourceLocation(MythicalAgeMod.ModID, "textures/entity/tengu.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(TenguEntity animatable) {
		return new ResourceLocation(MythicalAgeMod.ModID, "animations/biped.animation.json");
	}

}