
package net.mcreator.alonsinwhatmod.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.alonsinwhatmod.item.ItemAmberApple;
import net.mcreator.alonsinwhatmod.ElementsAmberUtilities;

@ElementsAmberUtilities.ModElement.Tag
public class TabAlonsinwhatMod extends ElementsAmberUtilities.ModElement {
	public TabAlonsinwhatMod(ElementsAmberUtilities instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabalonsinwhatmod") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemAmberApple.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
