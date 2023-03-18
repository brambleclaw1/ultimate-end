
package net.mcreator.ultimateend.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.ultimateend.init.UltimateendModItems;

public abstract class DeathArmorItem extends ArmorItem {
	public DeathArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 505;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{200, 500, 600, 200}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 70;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(UltimateendModItems.HEART_OF_ENDER_NUGGET.get()));
			}

			@Override
			public String getName() {
				return "death_armor";
			}

			@Override
			public float getToughness() {
				return 8.1f;
			}

			@Override
			public float getKnockbackResistance() {
				return 1f;
			}
		}, slot, properties);
	}

	public static class Helmet extends DeathArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ultimateend:textures/models/armor/heartoftheworldarmor_layer_1.png";
		}
	}

	public static class Chestplate extends DeathArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ultimateend:textures/models/armor/heartoftheworldarmor_layer_1.png";
		}
	}

	public static class Leggings extends DeathArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ultimateend:textures/models/armor/heartoftheworldarmor_layer_2.png";
		}
	}

	public static class Boots extends DeathArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ultimateend:textures/models/armor/heartoftheworldarmor_layer_1.png";
		}
	}
}
