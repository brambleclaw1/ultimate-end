
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ultimateend.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.ultimateend.block.TheUnknownPortalBlock;
import net.mcreator.ultimateend.block.HeartOfEnderBlock;
import net.mcreator.ultimateend.block.EnderiteOreBlock;
import net.mcreator.ultimateend.block.EnderiteChunkBlock;
import net.mcreator.ultimateend.block.EndTomatoBlock;
import net.mcreator.ultimateend.block.DarkStoneBlock;
import net.mcreator.ultimateend.UltimateendMod;

public class UltimateendModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, UltimateendMod.MODID);
	public static final RegistryObject<Block> ENDERITE_ORE = REGISTRY.register("enderite_ore", () -> new EnderiteOreBlock());
	public static final RegistryObject<Block> ENDERITE_CHUNK = REGISTRY.register("enderite_chunk", () -> new EnderiteChunkBlock());
	public static final RegistryObject<Block> HEART_OF_ENDER = REGISTRY.register("heart_of_ender", () -> new HeartOfEnderBlock());
	public static final RegistryObject<Block> END_TOMATO = REGISTRY.register("end_tomato", () -> new EndTomatoBlock());
	public static final RegistryObject<Block> DARK_STONE = REGISTRY.register("dark_stone", () -> new DarkStoneBlock());
	public static final RegistryObject<Block> THE_UNKNOWN_PORTAL = REGISTRY.register("the_unknown_portal", () -> new TheUnknownPortalBlock());
}
