package com.saphido.mythicalage.core.init;

import com.saphido.mythicalage.MythicalAgeMod;
import com.saphido.mythicalage.item.JackTheBoxItem;
import com.saphido.mythicalage.item.PotatoArmorItem;
import com.saphido.mythicalage.item.drops.TatsuFragment1Item;
import com.saphido.mythicalage.item.drops.TatsuFragment2Item;
import com.saphido.mythicalage.item.drops.TatsuFragment3Item;
import com.saphido.mythicalage.item.drops.TatsuFragment4Item;
import com.saphido.mythicalage.item.drops.TatsuFragment5Item;
import com.saphido.mythicalage.item.drops.TatsuFragment6Item;
import com.saphido.mythicalage.item.drops.TatsuRelicItem;
import com.saphido.mythicalage.item.drops.FurItem;
import com.saphido.mythicalage.item.weapons.PistoletItem;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class InitItem {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MythicalAgeMod.ModID);


	
	public static final RegistryObject<BlockItem> BOTARIAM_ITEM = ITEMS.register("botariam",
			() -> new BlockItem(InitBlock.BOTARIAM_BLOCK.get(),
					new Item.Properties().tab(MythicalAgeMod.mythicalageItemGroup)));
	public static final RegistryObject<BlockItem> FERTILIZE_ITEM = ITEMS.register("fertilize",
			() -> new BlockItem(InitBlock.FERTILIZE_BLOCK.get(),
					new Item.Properties().tab(MythicalAgeMod.mythicalageItemGroup)));

	public static final RegistryObject<JackTheBoxItem> JACK_THE_BOX = ITEMS.register("jacktheboxitem",
			() -> new JackTheBoxItem(new Item.Properties()));

	public static final RegistryObject<PistoletItem> PISTOLET = ITEMS.register("pistolet", 
			() -> new PistoletItem());
//DROP ITEMS
	public static final RegistryObject<FurItem> FUR = ITEMS.register("fur", 
			() -> new FurItem());
	
//RELICS & FRAGMENTS
	public static final RegistryObject<TatsuRelicItem> TATSU_RELIC = ITEMS.register("tatsu_relic", 
			() -> new TatsuRelicItem());
	public static final RegistryObject<TatsuFragment1Item> TATSU_FRAGMENT_1 = ITEMS.register("tatsu_fragment_1", 
			() -> new TatsuFragment1Item());
	public static final RegistryObject<TatsuFragment2Item> TATSU_FRAGMENT_2 = ITEMS.register("tatsu_fragment_2", 
			() -> new TatsuFragment2Item());
	public static final RegistryObject<TatsuFragment3Item> TATSU_FRAGMENT_3 = ITEMS.register("tatsu_fragment_3", 
			() -> new TatsuFragment3Item());
	public static final RegistryObject<TatsuFragment4Item> TATSU_FRAGMENT_4 = ITEMS.register("tatsu_fragment_4", 
			() -> new TatsuFragment4Item());
	public static final RegistryObject<TatsuFragment5Item> TATSU_FRAGMENT_5 = ITEMS.register("tatsu_fragment_5", 
			() -> new TatsuFragment5Item());
	public static final RegistryObject<TatsuFragment6Item> TATSU_FRAGMENT_6 = ITEMS.register("tatsu_fragment_6", 
			() -> new TatsuFragment6Item());

//TOOLS
	public static final RegistryObject<SwordItem> TESSEN = ITEMS.register("tessen", 
			() -> new SwordItem(InitToolMaterial.FROST_IRON, 0, -2f, new Item.Properties().tab(MythicalAgeMod.mythicalageItemGroup)));
//SPAWN EGGS
	public static final RegistryObject<ForgeSpawnEggItem> YUKI_ONNA_ENTITY_SPAWN_EGG = ITEMS.register("yuki_onna_entity_spawn_egg", 
			() -> new ForgeSpawnEggItem(InitEntity.YUKI_ONNA_ENTITY, 0xDFE1E3, 0x405B6B,
				  new Item.Properties().tab(MythicalAgeMod.mythicalageItemGroup)));
	public static final RegistryObject<ForgeSpawnEggItem> TENGU_ENTITY_SPAWN_EGG = ITEMS.register("tengu_entity_spawn_egg", 
			() -> new ForgeSpawnEggItem(InitEntity.TENGU_ENTITY, 0xFF1300, 0xDFE1E3,
				  new Item.Properties().tab(MythicalAgeMod.mythicalageItemGroup)));
	public static final RegistryObject<ForgeSpawnEggItem> KAPPA_ENTITY_SPAWN_EGG = ITEMS.register("kappa_entity_spawn_egg", 
			() -> new ForgeSpawnEggItem(InitEntity.KAPPA_ENTITY, 0x027124, 0x9B771E,
				  new Item.Properties().tab(MythicalAgeMod.mythicalageItemGroup)));
	public static final RegistryObject<ForgeSpawnEggItem> ONI_ENTITY_SPAWN_EGG = ITEMS.register("oni_entity_spawn_egg", 
			() -> new ForgeSpawnEggItem(InitEntity.ONI_ENTITY, 0xFF1300, 0xEEE305,
				  new Item.Properties().tab(MythicalAgeMod.mythicalageItemGroup)));


	
	
	
	public static final RegistryObject<PotatoArmorItem> POTATO_HEAD = ITEMS.register("potato_head",
			() -> new PotatoArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, 
				  new Item.Properties()));
	
	public static final RegistryObject<PotatoArmorItem> POTATO_CHEST = ITEMS.register("potato_chest",
			() -> new PotatoArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.CHEST, 
			      new Item.Properties()));
	
	public static final RegistryObject<PotatoArmorItem> POTATO_LEGGINGS = ITEMS.register("potato_leggings",
			() -> new PotatoArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.LEGS, 
				  new Item.Properties()));
	
	public static final RegistryObject<PotatoArmorItem> POTATO_BOOTS = ITEMS.register("potato_boots",
			() -> new PotatoArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.FEET, 
				  new Item.Properties()));

}
