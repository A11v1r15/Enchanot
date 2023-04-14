package net.a11v1r15.enchanot;

import net.minecraft.enchantment.ProtectionEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.damage.DamageSource;

public class UnprotectionCurseEnchantment extends ProtectionEnchantment {
    public UnprotectionCurseEnchantment(Enchantment.Rarity weight, Type protectionType) {
        super(weight, protectionType, new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET});
    }
 
    @Override
    public boolean isCursed() {
        return true;
    }

    @Override
    public int getProtectionAmount(int level, DamageSource source) {
        return -super.getProtectionAmount(level, source);
    }
}