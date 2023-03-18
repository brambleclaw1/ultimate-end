
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ultimateend.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.ultimateend.UltimateendMod;

public class UltimateendModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, UltimateendMod.MODID);
	public static final RegistryObject<SoundEvent> AMBIENT = REGISTRY.register("ambient", () -> new SoundEvent(new ResourceLocation("ultimateend", "ambient")));
}
