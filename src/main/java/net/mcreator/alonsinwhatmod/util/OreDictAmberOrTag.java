
package net.mcreator.alonsinwhatmod.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.alonsinwhatmod.block.BlockAmberOre;
import net.mcreator.alonsinwhatmod.ElementsAmberUtilities;

@ElementsAmberUtilities.ModElement.Tag
public class OreDictAmberOrTag extends ElementsAmberUtilities.ModElement {
	public OreDictAmberOrTag(ElementsAmberUtilities instance) {
		super(instance, 13);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("amberore", new ItemStack(BlockAmberOre.block, (int) (1)));
	}
}
