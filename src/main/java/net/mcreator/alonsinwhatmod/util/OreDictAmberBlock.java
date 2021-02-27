
package net.mcreator.alonsinwhatmod.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.alonsinwhatmod.block.BlockAmberOreBlock;
import net.mcreator.alonsinwhatmod.ElementsAmberUtilities;

@ElementsAmberUtilities.ModElement.Tag
public class OreDictAmberBlock extends ElementsAmberUtilities.ModElement {
	public OreDictAmberBlock(ElementsAmberUtilities instance) {
		super(instance, 12);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("amberblock", new ItemStack(BlockAmberOreBlock.block, (int) (1)));
	}
}
