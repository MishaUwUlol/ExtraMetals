
package net.mcreator.extrametals.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.extrametals.itemgroup.ExtraMetalsItemGroup;
import net.mcreator.extrametals.ExtraMetalsModElements;

@ExtraMetalsModElements.ModElement.Tag
public class BronzeIngotItem extends ExtraMetalsModElements.ModElement {
	@ObjectHolder("extra_metals:bronze_ingot")
	public static final Item block = null;
	public BronzeIngotItem(ExtraMetalsModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ExtraMetalsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("bronze_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
