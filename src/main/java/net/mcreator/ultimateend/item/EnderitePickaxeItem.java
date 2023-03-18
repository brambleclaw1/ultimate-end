
package net.mcreator.ultimateend.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.ultimateend.init.UltimateendModItems;

public class EnderitePickaxeItem extends PickaxeItem {
	public EnderitePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 6000;
			}

			public float getSpeed() {
				return 18f;
			}

			public float getAttackDamageBonus() {
				return 61f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 28;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(UltimateendModItems.ENDERITE_INGOT.get()));
			}
		}, 1, 4f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant());
	}
}
