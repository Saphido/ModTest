package com.saphido.mythicalage.core.init;

import com.saphido.mythicalage.MythicalAgeMod;
import com.saphido.mythicalage.block.tile.BotariamTileEntity;
import com.saphido.mythicalage.block.tile.FertilizeTileEntity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitTile {
	public static final DeferredRegister<BlockEntityType<?>> TILES = DeferredRegister
			.create(ForgeRegistries.BLOCK_ENTITIES, MythicalAgeMod.ModID);

	public static final RegistryObject<BlockEntityType<BotariamTileEntity>> BOTARIAM_TILE = TILES
			.register("botariamtile", () -> BlockEntityType.Builder
					.of(BotariamTileEntity::new, InitBlock.BOTARIAM_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<FertilizeTileEntity>> FERTILIZE = TILES
			.register("fertilizetile", () -> BlockEntityType.Builder
					.of(FertilizeTileEntity::new, InitBlock.FERTILIZE_BLOCK.get()).build(null));
}
