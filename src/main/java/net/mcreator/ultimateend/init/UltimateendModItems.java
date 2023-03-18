
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ultimateend.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ultimateend.item.TheUnknownItem;
import net.mcreator.ultimateend.item.HeartOfEnderNuggetItem;
import net.mcreator.ultimateend.item.EnderiteSwordItem;
import net.mcreator.ultimateend.item.EnderiteShovelItem;
import net.mcreator.ultimateend.item.EnderiteScrapItem;
import net.mcreator.ultimateend.item.EnderitePickaxeItem;
import net.mcreator.ultimateend.item.EnderiteIngotItem;
import net.mcreator.ultimateend.item.EnderiteHoeItem;
import net.mcreator.ultimateend.item.EnderiteBowItem;
import net.mcreator.ultimateend.item.EnderiteAxeItem;
import net.mcreator.ultimateend.item.EnderiteArrowItem;
import net.mcreator.ultimateend.item.EnderiteArmorItem;
import net.mcreator.ultimateend.item.EndTomatoItemItem;
import net.mcreator.ultimateend.item.DeathArmorItem;
import net.mcreator.ultimateend.UltimateendMod;

public class UltimateendModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UltimateendMod.MODID);
	public static final RegistryObject<Item> ENDERITE_INGOT = REGISTRY.register("enderite_ingot", () -> new EnderiteIngotItem());
	public static final RegistryObject<Item> ENDERITE_SCRAP = REGISTRY.register("enderite_scrap", () -> new EnderiteScrapItem());
	public static final RegistryObject<Item> ENDERITE_ORE = block(UltimateendModBlocks.ENDERITE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ENDERITE_SWORD = REGISTRY.register("enderite_sword", () -> new EnderiteSwordItem());
	public static final RegistryObject<Item> ENDERITE_PICKAXE = REGISTRY.register("enderite_pickaxe", () -> new EnderitePickaxeItem());
	public static final RegistryObject<Item> ENDERITE_AXE = REGISTRY.register("enderite_axe", () -> new EnderiteAxeItem());
	public static final RegistryObject<Item> ENDERITE_CHUNK = block(UltimateendModBlocks.ENDERITE_CHUNK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> HEART_OF_ENDER = block(UltimateendModBlocks.HEART_OF_ENDER, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> END_TOMATO_ITEM = REGISTRY.register("end_tomato_item", () -> new EndTomatoItemItem());
	public static final RegistryObject<Item> END_TOMATO = doubleBlock(UltimateendModBlocks.END_TOMATO, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ENDERITE_ARMOR_HELMET = REGISTRY.register("enderite_armor_helmet", () -> new EnderiteArmorItem.Helmet());
	public static final RegistryObject<Item> ENDERITE_ARMOR_CHESTPLATE = REGISTRY.register("enderite_armor_chestplate", () -> new EnderiteArmorItem.Chestplate());
	public static final RegistryObject<Item> ENDERITE_ARMOR_LEGGINGS = REGISTRY.register("enderite_armor_leggings", () -> new EnderiteArmorItem.Leggings());
	public static final RegistryObject<Item> ENDERITE_ARMOR_BOOTS = REGISTRY.register("enderite_armor_boots", () -> new EnderiteArmorItem.Boots());
	public static final RegistryObject<Item> ENTITY_303_SPAWN_EGG = REGISTRY.register("entity_303_spawn_egg", () -> new ForgeSpawnEggItem(UltimateendModEntities.ENTITY_303, -6750208, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ENDERITE_ARROW = REGISTRY.register("enderite_arrow", () -> new EnderiteArrowItem());
	public static final RegistryObject<Item> ENDERITE_BOW = REGISTRY.register("enderite_bow", () -> new EnderiteBowItem());
	public static final RegistryObject<Item> HEART_OF_ENDER_NUGGET = REGISTRY.register("heart_of_ender_nugget", () -> new HeartOfEnderNuggetItem());
	public static final RegistryObject<Item> DEATH_ARMOR_HELMET = REGISTRY.register("death_armor_helmet", () -> new DeathArmorItem.Helmet());
	public static final RegistryObject<Item> DEATH_ARMOR_CHESTPLATE = REGISTRY.register("death_armor_chestplate", () -> new DeathArmorItem.Chestplate());
	public static final RegistryObject<Item> DEATH_ARMOR_LEGGINGS = REGISTRY.register("death_armor_leggings", () -> new DeathArmorItem.Leggings());
	public static final RegistryObject<Item> DEATH_ARMOR_BOOTS = REGISTRY.register("death_armor_boots", () -> new DeathArmorItem.Boots());
	public static final RegistryObject<Item> ENDERITE_HOE = REGISTRY.register("enderite_hoe", () -> new EnderiteHoeItem());
	public static final RegistryObject<Item> ENDERITE_SHOVEL = REGISTRY.register("enderite_shovel", () -> new EnderiteShovelItem());
	public static final RegistryObject<Item> DARK_STONE = block(UltimateendModBlocks.DARK_STONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> THE_UNKNOWN = REGISTRY.register("the_unknown", () -> new TheUnknownItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
