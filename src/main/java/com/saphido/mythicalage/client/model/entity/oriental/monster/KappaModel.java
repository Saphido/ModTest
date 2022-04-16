package com.saphido.mythicalage.client.model.entity.oriental.monster;

import com.saphido.mythicalage.MythicalAgeMod;
import com.saphido.mythicalage.core.entity.oriental.monsters.KappaEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class KappaModel extends AnimatedTickingGeoModel<KappaEntity> {

	@Override
	public ResourceLocation getModelLocation(KappaEntity object) {
		return new ResourceLocation(MythicalAgeMod.ModID, "geo/kappa.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(KappaEntity object) {
		return new ResourceLocation(MythicalAgeMod.ModID, "textures/entity/kappa.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(KappaEntity animatable) {
		return new ResourceLocation(MythicalAgeMod.ModID, "animations/biped.animation.json");
	}

}