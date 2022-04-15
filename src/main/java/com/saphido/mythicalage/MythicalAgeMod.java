package com.saphido.mythicalage;

import com.saphido.mythicalage.core.init.InitBlock;
import com.saphido.mythicalage.core.init.InitEntity;
import com.saphido.mythicalage.core.init.InitItem;
import com.saphido.mythicalage.core.init.InitSound;
import com.saphido.mythicalage.core.init.InitTile;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import software.bernie.geckolib3.GeckoLib;

@Mod(MythicalAgeMod.ModID)

public class MythicalAgeMod {
	
	public static final String ModID = "mythicalage";
	public static CreativeModeTab mythicalageItemGroup;
	public static boolean DISABLE_IN_DEV = false;

	public MythicalAgeMod() {
		GeckoLib.initialize();
		if (!FMLEnvironment.production && !DISABLE_IN_DEV) {
			IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
			InitEntity.ENTITIES.register(bus);
			InitItem.ITEMS.register(bus);
			InitTile.TILES.register(bus);
			InitBlock.BLOCKS.register(bus);
			InitSound.SOUNDS.register(bus);
			mythicalageItemGroup = new CreativeModeTab(CreativeModeTab.getGroupCountSafe(), "mythical_age") {
				@Override
				public ItemStack makeIcon() {
					return new ItemStack(InitItem.FUR.get());
				}
			};
		}
	}
}
