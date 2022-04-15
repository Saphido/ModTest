package com.saphido.mythicalage.client.model.tile;

import com.saphido.mythicalage.MythicalAgeMod;
import com.saphido.mythicalage.block.tile.BotariamTileEntity;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BotariamModel extends AnimatedGeoModel<BotariamTileEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(BotariamTileEntity animatable) {
		return new ResourceLocation(MythicalAgeMod.ModID, "animations/botarium.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(BotariamTileEntity animatable) {
		return new ResourceLocation(MythicalAgeMod.ModID, "geo/botarium.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(BotariamTileEntity entity) {
		return new ResourceLocation(MythicalAgeMod.ModID, "textures/block/botarium.png");
	}
}