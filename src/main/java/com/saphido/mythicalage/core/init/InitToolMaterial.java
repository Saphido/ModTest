package com.saphido.mythicalage.core.init;

import com.saphido.mythicalage.core.BaseToolMaterial;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public final class InitToolMaterial {
	private InitToolMaterial() {
		
	}

	protected static final Tier FROST_IRON = new BaseToolMaterial(15.5f, 500, 5, 25f, 2500, 
			() -> Ingredient.of(InitItem.FUR.get()));
}
