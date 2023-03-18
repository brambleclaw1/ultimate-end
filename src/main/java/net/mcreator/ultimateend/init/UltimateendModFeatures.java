
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ultimateend.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.ultimateend.world.features.plants.EndTomatoFeature;
import net.mcreator.ultimateend.world.features.ores.EnderiteOreFeature;
import net.mcreator.ultimateend.world.features.ores.DarkStoneFeature;
import net.mcreator.ultimateend.world.features.MobArenaFeature;
import net.mcreator.ultimateend.world.features.LargeAmethystTreeFeature;
import net.mcreator.ultimateend.world.features.EndCabinFeature;
import net.mcreator.ultimateend.world.features.AmethystTreeFeature;
import net.mcreator.ultimateend.UltimateendMod;

@Mod.EventBusSubscriber
public class UltimateendModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, UltimateendMod.MODID);
	public static final RegistryObject<Feature<?>> AMETHYST_TREE = REGISTRY.register("amethyst_tree", AmethystTreeFeature::feature);
	public static final RegistryObject<Feature<?>> ENDERITE_ORE = REGISTRY.register("enderite_ore", EnderiteOreFeature::feature);
	public static final RegistryObject<Feature<?>> END_TOMATO = REGISTRY.register("end_tomato", EndTomatoFeature::feature);
	public static final RegistryObject<Feature<?>> LARGE_AMETHYST_TREE = REGISTRY.register("large_amethyst_tree", LargeAmethystTreeFeature::feature);
	public static final RegistryObject<Feature<?>> MOB_ARENA = REGISTRY.register("mob_arena", MobArenaFeature::feature);
	public static final RegistryObject<Feature<?>> DARK_STONE = REGISTRY.register("dark_stone", DarkStoneFeature::feature);
	public static final RegistryObject<Feature<?>> END_CABIN = REGISTRY.register("end_cabin", EndCabinFeature::feature);
}
