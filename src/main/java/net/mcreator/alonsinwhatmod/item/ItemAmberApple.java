
package net.mcreator.alonsinwhatmod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.alonsinwhatmod.procedure.ProcedureAmberAppleEaten;
import net.mcreator.alonsinwhatmod.creativetab.TabAlonsinwhatMod;
import net.mcreator.alonsinwhatmod.ElementsAmberUtilities;

@ElementsAmberUtilities.ModElement.Tag
public class ItemAmberApple extends ElementsAmberUtilities.ModElement {
	@GameRegistry.ObjectHolder("amberutils:amberapple")
	public static final Item block = null;
	public ItemAmberApple(ElementsAmberUtilities instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("amberutils:amberapple", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(4, 8f, false);
			setUnlocalizedName("amberapple");
			setRegistryName("amberapple");
			setAlwaysEdible();
			setCreativeTab(TabAlonsinwhatMod.tab);
			setMaxStackSize(64);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}

		@Override
		protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
			super.onFoodEaten(itemStack, world, entity);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureAmberAppleEaten.executeProcedure($_dependencies);
			}
		}
	}
}
