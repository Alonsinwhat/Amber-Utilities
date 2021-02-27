
package net.mcreator.alonsinwhatmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.alonsinwhatmod.item.ItemAmberGem;
import net.mcreator.alonsinwhatmod.block.BlockAmberOre;
import net.mcreator.alonsinwhatmod.ElementsAmberUtilities;

@ElementsAmberUtilities.ModElement.Tag
public class RecipeAmberOreSmelt extends ElementsAmberUtilities.ModElement {
	public RecipeAmberOreSmelt(ElementsAmberUtilities instance) {
		super(instance, 16);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockAmberOre.block, (int) (1)), new ItemStack(ItemAmberGem.block, (int) (1)), 1F);
	}
}
