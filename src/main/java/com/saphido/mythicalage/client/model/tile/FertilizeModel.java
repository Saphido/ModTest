package com.saphido.mythicalage.client.model.tile;

import com.saphido.mythicalage.MythicalAgeMod;
import com.saphido.mythicalage.block.tile.FertilizeTileEntity;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FertilizeModel extends AnimatedGeoModel<FertilizeTileEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(FertilizeTileEntity animatable) {
		if (animatable.getLevel().isRaining()) {
			return new ResourceLocation(MythicalAgeMod.ModID, "animations/fertilizer.animation.json");
		} else {
			return new ResourceLocation(MythicalAgeMod.ModID, "animations/botarium.animation.json");
		}
	}

	@Override
	public ResourceLocation getModelLocation(FertilizeTileEntity animatable) {
		if (animatable.getLevel().isRaining()) {
			return new ResourceLocation(MythicalAgeMod.ModID, "geo/fertilizer.geo.json");
		} else {
			return new ResourceLocation(MythicalAgeMod.ModID, "geo/botarium.geo.json");
		}
	}

	@Override
	public ResourceLocation getTextureLocation(FertilizeTileEntity entity) {
		if (entity.getLevel().isRaining()) {
			return new ResourceLocation(MythicalAgeMod.ModID + ":textures/block/fertilizer.png");
		} else {
			return new ResourceLocation(MythicalAgeMod.ModID + ":textures/block/botarium.png");
		}
	}
}