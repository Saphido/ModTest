package com.saphido.mythicalage.block.tile;

import com.saphido.mythicalage.core.init.InitTile;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class FertilizeTileEntity extends BlockEntity implements IAnimatable {
	private final AnimationFactory manager = new AnimationFactory(this);

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private <E extends BlockEntity & IAnimatable> PlayState predicate(AnimationEvent<E> event) {
		AnimationController controller = event.getController();
		controller.transitionLengthTicks = 0;
		if (event.getAnimatable().getLevel().isRaining()) {
			controller.setAnimation(new AnimationBuilder().addAnimation("fertilizer.animation.deploy", true)
					.addAnimation("fertilizer.animation.idle", true));
		} else {
			controller.setAnimation(new AnimationBuilder().addAnimation("Botarium.anim.deploy", true)
					.addAnimation("Botarium.anim.idle", true));
		}
		return PlayState.CONTINUE;
	}

	public FertilizeTileEntity(BlockPos pos, BlockState state) {
		super(InitTile.FERTILIZE.get(), pos, state);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void registerControllers(AnimationData data) {
		data.addAnimationController(new AnimationController(this, "controller", 0, this::predicate));
	}

	@Override
	public AnimationFactory getFactory() {
		return this.manager;
	}
}
