package com.saphido.mythicalage.core.init;

import com.saphido.mythicalage.MythicalAgeMod;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitSound {
	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,
			MythicalAgeMod.ModID);

	public static RegistryObject<SoundEvent> JACK_MUSIC = SOUNDS.register("jack_music",
			() -> new SoundEvent(new ResourceLocation(MythicalAgeMod.ModID, "jack_music")));
}
