package net.a11v1r15.enchanot.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

import net.minecraft.entity.DamageUtil;

@Mixin(DamageUtil.class)
public class DamageUtilMixin {
    @ModifyArgs(method = "getInflictedDamage", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/MathHelper;clamp"))
    private void enchanot$negativeIncludingClamp(Args args){
        args.set(1, -(float)args.get(2));
    }
}
