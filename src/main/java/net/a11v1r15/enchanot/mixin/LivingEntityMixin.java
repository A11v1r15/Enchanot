package net.a11v1r15.enchanot.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Constant;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin
extends Entity {
    public LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }
    
    @ModifyConstant(method = "modifyAppliedDamage(Lnet/minecraft/entity/damage/DamageSource;F)F", constant = @Constant(intValue = 0, expandZeroConditions = Constant.Condition.GREATER_THAN_ZERO))
    private int enchanot$negativeIncludingProtection(int value){
        return Integer.MIN_VALUE;
    }
}