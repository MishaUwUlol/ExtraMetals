
package net.mcreator.extrametals.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.extrametals.item.CopperIngotItem;
import net.mcreator.extrametals.ExtraMetalsModElements;

@ExtraMetalsModElements.ModElement.Tag
public class ExtraMetalsItemGroup extends ExtraMetalsModElements.ModElement {
	public ExtraMetalsItemGroup(ExtraMetalsModElements instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabextra_metals") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CopperIngotItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
