
package net.mcreator.extrametals.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.ActionResultType;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.BlockState;

import net.mcreator.extrametals.procedures.WaterCopperBucketRightClickedOnBlockProcedure;
import net.mcreator.extrametals.itemgroup.ExtraMetalsItemGroup;
import net.mcreator.extrametals.ExtraMetalsModElements;

import java.util.Map;
import java.util.HashMap;

@ExtraMetalsModElements.ModElement.Tag
public class WaterCopperBucketItem extends ExtraMetalsModElements.ModElement {
	@ObjectHolder("extra_metals:water_copper_bucket")
	public static final Item block = null;
	public WaterCopperBucketItem(ExtraMetalsModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ExtraMetalsItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("water_copper_bucket");
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

		@Override
		public ActionResultType onItemUseFirst(ItemStack stack, ItemUseContext context) {
			ActionResultType retval = super.onItemUseFirst(stack, context);
			World world = context.getWorld();
			BlockPos pos = context.getPos();
			PlayerEntity entity = context.getPlayer();
			Direction direction = context.getFace();
			BlockState blockstate = world.getBlockState(pos);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			ItemStack itemstack = context.getItem();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				WaterCopperBucketRightClickedOnBlockProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
