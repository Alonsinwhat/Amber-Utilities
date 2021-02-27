
package net.mcreator.alonsinwhatmod.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.alonsinwhatmod.item.ItemAmberGem;
import net.mcreator.alonsinwhatmod.ElementsAmberUtilities;

@ElementsAmberUtilities.ModElement.Tag
public class OreDictAmber extends ElementsAmberUtilities.ModElement {
	public OreDictAmber(ElementsAmberUtilities instance) {
		super(instance, 11);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("amber", new ItemStack(ItemAmberGem.block, (int) (1)));
	}
}
