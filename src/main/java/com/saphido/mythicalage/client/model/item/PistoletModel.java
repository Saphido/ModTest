package com.saphido.mythicalage.client.model.item;

import com.saphido.mythicalage.MythicalAgeMod;
import com.saphido.mythicalage.item.weapons.PistoletItem;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PistoletModel extends AnimatedGeoModel<PistoletItem> {
	@Override
	public ResourceLocation getModelLocation(PistoletItem object) {
		return new ResourceLocation(MythicalAgeMod.ModID, "geo/pistolet.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(PistoletItem object) {
		return new ResourceLocation(MythicalAgeMod.ModID, "textures/item/pistolet.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(PistoletItem animatable) {
		return new ResourceLocation(MythicalAgeMod.ModID, "animations/pistol.animation.json");
	}
}
