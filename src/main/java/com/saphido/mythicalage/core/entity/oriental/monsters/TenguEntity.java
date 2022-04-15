package com.saphido.mythicalage.core.entity.oriental.monsters;

import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.Difficulty;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.IAnimationTickable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.CustomInstructionKeyframeEvent;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class TenguEntity extends Monster implements IAnimatable, IAnimationTickable {
	private AnimationFactory factory = new AnimationFactory(this);
	
	private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
		if(event.isMoving()) {
		event.getController().setAnimation(new AnimationBuilder().addAnimation("biped.walk", true));
		} else {
		event.getController().setAnimation(new AnimationBuilder().addAnimation("biped.idle", true));
		}
		return PlayState.CONTINUE;
	}

	public TenguEntity(EntityType<? extends Monster> type, Level worldIn) {
		super(type, worldIn);
		this.noCulling = true;
	}

	@Override
	public void registerControllers(AnimationData data) {
		AnimationController<TenguEntity> controller = new AnimationController<>(this, "controller", 0, this::predicate);
		controller.registerCustomInstructionListener(this::customListener);
		data.addAnimationController(controller);
	}

	@SuppressWarnings("resource")
	private <ENTITY extends IAnimatable> void customListener(CustomInstructionKeyframeEvent<ENTITY> event) {
		final LocalPlayer player = Minecraft.getInstance().player;
		if (player != null) {
			player.displayClientMessage(new TextComponent("KeyFraming"), true);
		}
	}

	@Override
	public AnimationFactory getFactory() {
		return this.factory;
	}

	@Override
	protected void registerGoals() {
	      this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 8.0F));
	      this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
	      this.addBehaviourGoals();
		super.registerGoals();
	}

	private void addBehaviourGoals() {
	      this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
	      this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.0D, false));

	}
	

	   protected void populateDefaultEquipmentSlots(DifficultyInstance difficulty) {
		      super.populateDefaultEquipmentSlots(difficulty);
		      if (this.random.nextFloat() < (this.level.getDifficulty() != Difficulty.PEACEFUL ? 0.05F : 0.01F)) {
		         int i = this.random.nextInt(3);
		         if (i == 0) {
		            this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.IRON_SWORD));
		         } else {
		            this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.IRON_SHOVEL));
		         }
		      }
		   }

	@Override
	public int tickTimer() {
		return tickCount;
	}
}