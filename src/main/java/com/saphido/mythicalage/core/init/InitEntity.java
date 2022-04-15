package com.saphido.mythicalage.core.init;

import com.saphido.mythicalage.MythicalAgeMod;
import com.saphido.mythicalage.core.entity.oriental.monsters.TenguEntity;
import com.saphido.mythicalage.core.entity.oriental.monsters.YukiOnnaEntity;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class InitEntity {
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES,
			MythicalAgeMod.ModID);

//Oriental entities
	public static final RegistryObject<EntityType<YukiOnnaEntity>> YUKI_ONNA_ENTITY = buildEntity(
			YukiOnnaEntity::new, YukiOnnaEntity.class, 0.8F, 1.9F);
	public static final RegistryObject<EntityType<TenguEntity>> TENGU_ENTITY = buildEntity(
			TenguEntity::new, TenguEntity.class, 0.8F, 1.9F);
	
//Others

	public static <T extends Entity> RegistryObject<EntityType<T>> buildEntity(EntityType.EntityFactory<T> entity,
			Class<T> entityClass, float width, float height) {
		String name = entityClass.getSimpleName().toLowerCase();
		return ENTITIES.register(name,
				() -> EntityType.Builder.of(entity, MobCategory.CREATURE).sized(width, height).build(name));
	}
}
