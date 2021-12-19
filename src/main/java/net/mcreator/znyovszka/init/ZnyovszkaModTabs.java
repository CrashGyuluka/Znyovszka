
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.znyovszka.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ZnyovszkaModTabs {
	public static CreativeModeTab TAB_ZNYOVSZKA_TAB;

	public static void load() {
		TAB_ZNYOVSZKA_TAB = new CreativeModeTab("tabznyovszka_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ZnyovszkaModBlocks.BLUE_ZNYOVSZKOVIUM_ORE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
