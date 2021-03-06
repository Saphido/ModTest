package com.saphido.mythicalage.client;


import com.saphido.mythicalage.MythicalAgeMod;
import com.saphido.mythicalage.client.renderer.entity.oriental.monster.KappaRenderer;
import com.saphido.mythicalage.client.renderer.entity.oriental.monster.OniRenderer;
import com.saphido.mythicalage.client.renderer.entity.oriental.monster.TenguRenderer;
import com.saphido.mythicalage.client.renderer.entity.oriental.monster.YukiOnnaRenderer;
import com.saphido.mythicalage.client.renderer.tile.BotariamTileRenderer;
import com.saphido.mythicalage.client.renderer.tile.FertilizeTileRenderer;
import com.saphido.mythicalage.core.init.InitBlock;
import com.saphido.mythicalage.core.init.InitEntity;
import com.saphido.mythicalage.core.init.InitTile;
import com.saphido.mythicalage.item.PotatoArmorItem;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.loading.FMLEnvironment;
import software.bernie.example.client.renderer.armor.PotatoArmorRenderer;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = MythicalAgeMod.ModID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientListener {

	@SubscribeEvent
	public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
		if (!FMLEnvironment.production && !MythicalAgeMod.DISABLE_IN_DEV) {
			
//Oriental Entities
			
			event.registerEntityRenderer(InitEntity.YUKI_ONNA_ENTITY.get(), YukiOnnaRenderer::new);
			event.registerEntityRenderer(InitEntity.TENGU_ENTITY.get(), TenguRenderer::new);
			event.registerEntityRenderer(InitEntity.KAPPA_ENTITY.get(), KappaRenderer::new);
			event.registerEntityRenderer(InitEntity.ONI_ENTITY.get(), OniRenderer::new);


//Others

			event.registerBlockEntityRenderer(InitTile.BOTARIAM_TILE.get(), BotariamTileRenderer::new);
			event.registerBlockEntityRenderer(InitTile.FERTILIZE.get(), FertilizeTileRenderer::new);


		}
	}

	@SubscribeEvent
	public static void registerRenderers(final EntityRenderersEvent.AddLayers event) {
		if (!FMLEnvironment.production && !MythicalAgeMod.DISABLE_IN_DEV) {
			GeoArmorRenderer.registerArmorRenderer(PotatoArmorItem.class, new PotatoArmorRenderer());
		}
	}

	@SubscribeEvent
	public static void registerRenderers(final FMLClientSetupEvent event) {
		if (!FMLEnvironment.production && !MythicalAgeMod.DISABLE_IN_DEV) {
			ItemBlockRenderTypes.setRenderLayer(InitBlock.BOTARIAM_BLOCK.get(), RenderType.cutout());
		}
	}
}
