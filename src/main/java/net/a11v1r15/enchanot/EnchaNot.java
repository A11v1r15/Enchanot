package net.a11v1r15.enchanot;

import net.fabricmc.api.ModInitializer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.ProtectionEnchantment;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnchaNot implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("EnchaNot");
	public static Enchantment UNPROTECTION_CURSE            = new UnprotectionCurseEnchantment(Enchantment.Rarity.COMMON, ProtectionEnchantment.Type.ALL);
    public static Enchantment FIRE_UNPROTECTION_CURSE       = new UnprotectionCurseEnchantment(Enchantment.Rarity.UNCOMMON, ProtectionEnchantment.Type.FIRE);
    public static Enchantment LEAD_FALLING_CURSE            = new UnprotectionCurseEnchantment(Enchantment.Rarity.UNCOMMON, ProtectionEnchantment.Type.FALL);
    public static Enchantment BLAST_UNPROTECTION_CURSE      = new UnprotectionCurseEnchantment(Enchantment.Rarity.RARE, ProtectionEnchantment.Type.EXPLOSION);
    public static Enchantment PROJECTILE_UNPROTECTION_CURSE = new UnprotectionCurseEnchantment(Enchantment.Rarity.UNCOMMON, ProtectionEnchantment.Type.PROJECTILE);
    //public static Enchantment SUFFOCATION_CURSE             = new RespirationCurseEnchantment();
    //public static Enchantment AQUA_AVERSION_CURSE           = new AquaAversionCurseCurseEnchantment();
    //public static Enchantment THORNS_CURSE                  = new ThornsCurseEnchantment();
    //public static Enchantment DEPTH_STRIDER_CURSE           = new DepthStriderCurseEnchantment();
    //public static Enchantment FROST_WALKER_CURSE            = new FrostWalkerCurseEnchantment();
    //public static Enchantment UNBINDING_CURSE_CURSE         = new BindingCurseCurseEnchantment();
    //public static Enchantment SOUL_SPEED_CURSE              = new SoulSpeedCurseEnchantment();
    //public static Enchantment SWIFT_SNEAK_CURSE             = new SwiftSneakCurseEnchantment();
    //public static Enchantment BLUNTNESS_CURSE               = new DamageCurseEnchantment();
    //public static Enchantment SMITE_CURSE                   = new DamageCurseEnchantment();
    //public static Enchantment BANE_OF_ARTHROPODS_CURSE      = new DamageCurseEnchantment();
    //public static Enchantment KNOCKBACK_CURSE               = new KnockbackCurseEnchantment();
    //public static Enchantment FIRE_ASPECT_CURSE             = new FireAspectCurseEnchantment();
    //public static Enchantment LOOTING_CURSE                 = new LuckCurseEnchantment();
    //public static Enchantment SWEEPING_CURSE                = new SweepingCurseEnchantment();
    //public static Enchantment EFFICIENCY_CURSE              = new EfficiencyCurseEnchantment();
    //public static Enchantment SILK_TOUCH_CURSE              = new SilkTouchCurseEnchantment();
    //public static Enchantment UNBREAKING_CURSE              = new UnbreakingCurseEnchantment();
    //public static Enchantment FORTUNE_CURSE                 = new LuckCurseEnchantment();
    //public static Enchantment POWER_CURSE                   = new PowerCurseEnchantment();
    //public static Enchantment PUNCH_CURSE                   = new PunchCurseEnchantment();
    //public static Enchantment FLAME_CURSE                   = new FlameCurseEnchantment();
    //public static Enchantment INFINITY_CURSE                = new InfinityCurseEnchantment();
    //public static Enchantment CURSE_OF_THE_SEA_CURSE        = new LuckCurseEnchantment();
    //public static Enchantment LURE_CURSE                    = new LureCurseEnchantment();
    //public static Enchantment LOYALTY_CURSE                 = new LoyaltyCurseEnchantment();
    //public static Enchantment IMPALING_CURSE                = new ImpalingCurseEnchantment();
    //public static Enchantment RIPTIDE_CURSE                 = new RiptideCurseEnchantment();
    //public static Enchantment CHANNELING_CURSE              = new ChannelingCurseEnchantment();
    //public static Enchantment MULTISHOT_CURSE               = new MultishotCurseEnchantment();
    //public static Enchantment QUICK_CHARGE_CURSE            = new QuickChargeCurseEnchantment();
    //public static Enchantment PIERCING_CURSE                = new PiercingCurseEnchantment();
    //public static Enchantment MENDING_CURSE                 = new MendingCurseEnchantment();
    //public static Enchantment VANISHING_CURSE_CURSE         = new VanishingCurseCurseEnchantment();


	@Override
	public void onInitialize() {
		Registry.register(Registries.ENCHANTMENT, new Identifier("a11v1r15", "unprotection_curse"), UNPROTECTION_CURSE);
		Registry.register(Registries.ENCHANTMENT, new Identifier("a11v1r15", "fire_unprotection_curse"), FIRE_UNPROTECTION_CURSE);
		Registry.register(Registries.ENCHANTMENT, new Identifier("a11v1r15", "lead_falling_curse"), LEAD_FALLING_CURSE);
		Registry.register(Registries.ENCHANTMENT, new Identifier("a11v1r15", "blast_unprotection_curse"), BLAST_UNPROTECTION_CURSE);
		Registry.register(Registries.ENCHANTMENT, new Identifier("a11v1r15", "projectile_unprotection_curse"), PROJECTILE_UNPROTECTION_CURSE);
		LOGGER.info("Curse you");
	}
}