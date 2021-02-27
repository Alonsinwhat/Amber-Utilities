
package net.mcreator.alonsinwhatmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.alonsinwhatmod.item.ItemAmberCoalItem;
import net.mcreator.alonsinwhatmod.ElementsAmberUtilities;

@ElementsAmberUtilities.ModElement.Tag
public class FuelAmberCoalUsage extends ElementsAmberUtilities.ModElement {
	public FuelAmberCoalUsage(ElementsAmberUtilities instance) {
		super(instance, 15);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemAmberCoalItem.block, (int) (1)).getItem())
			return 3200;
		return 0;
	}
}
