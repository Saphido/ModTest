package com.saphido.mythicalage.common;


import com.saphido.mythicalage.MythicalAgeMod;
import com.saphido.mythicalage.core.init.InitEntity;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;

@Mod.EventBusSubscriber(modid = MythicalAgeMod.ModID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonListener {
	@SubscribeEvent
	public static void registerEntityAttributes(EntityAttributeCreationEvent event) {
		if (!FMLEnvironment.production && !MythicalAgeMod.DISABLE_IN_DEV) {
			
//Oriental Entities
			event.put(InitEntity.YUKI_ONNA_ENTITY.get(),
					Mob.createMobAttributes()
					.add(Attributes.MAX_HEALTH, 1.0D)
					.add(Attributes.ATTACK_DAMAGE, 5.0D)
					.add(Attributes.MOVEMENT_SPEED, 0.26f)
					.build());
			
			event.put(InitEntity.TENGU_ENTITY.get(),
					Mob.createMobAttributes()
					.add(Attributes.MAX_HEALTH, 1.0D)
					.add(Attributes.ATTACK_DAMAGE, 5.0D)
					.add(Attributes.MOVEMENT_SPEED, 0.26f)
					.build());
//Others
			
		}

	}
}