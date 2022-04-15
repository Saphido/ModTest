package com.saphido.mythicalage.core.init;

import com.saphido.mythicalage.MythicalAgeMod;
import com.saphido.mythicalage.block.BotariamBlock;
import com.saphido.mythicalage.block.FertilizeBlock;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitBlock {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			MythicalAgeMod.ModID);

	public static final RegistryObject<BotariamBlock> BOTARIAM_BLOCK = BLOCKS.register("botariamblock",
			BotariamBlock::new);
	public static final RegistryObject<FertilizeBlock> FERTILIZE_BLOCK = BLOCKS.register("fertilizeblock",
			FertilizeBlock::new);
}
