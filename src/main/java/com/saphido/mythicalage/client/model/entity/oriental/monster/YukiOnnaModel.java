package com.saphido.mythicalage.client.model.entity.oriental.monster;

import com.saphido.mythicalage.MythicalAgeMod;
import com.saphido.mythicalage.core.entity.oriental.monsters.YukiOnnaEntity;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class YukiOnnaModel extends AnimatedTickingGeoModel<YukiOnnaEntity> {

	@Override
	public ResourceLocation getModelLocation(YukiOnnaEntity object) {
		return new ResourceLocation(MythicalAgeMod.ModID, "geo/yuki_onna.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(YukiOnnaEntity object) {
		return new ResourceLocation(MythicalAgeMod.ModID, "textures/entity/yuki_onna.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(YukiOnnaEntity animatable) {
		return new ResourceLocation(MythicalAgeMod.ModID, "animations/biped.animation.json");
	}

}