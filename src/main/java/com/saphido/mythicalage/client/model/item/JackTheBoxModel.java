package com.saphido.mythicalage.client.model.item;

import com.saphido.mythicalage.MythicalAgeMod;
import com.saphido.mythicalage.item.JackTheBoxItem;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class JackTheBoxModel extends AnimatedGeoModel<JackTheBoxItem> {
	@Override
	public ResourceLocation getModelLocation(JackTheBoxItem object) {
		return new ResourceLocation(MythicalAgeMod.ModID, "geo/jack.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(JackTheBoxItem object) {
		return new ResourceLocation(MythicalAgeMod.ModID, "textures/item/jack.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(JackTheBoxItem animatable) {
		return new ResourceLocation(MythicalAgeMod.ModID, "animations/jackinthebox.animation.json");
	}
}
