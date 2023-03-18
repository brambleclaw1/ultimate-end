
package net.mcreator.ultimateend.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.ultimateend.init.UltimateendModItems;

public class EnderiteSwordItem extends SwordItem {
	public EnderiteSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 6000;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 94f;
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
		}, 3, 4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
	}
}
