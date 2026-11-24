package net.ammiss1.gladiator.client;

import com.geckolib.animatable.client.GeoRenderProvider;
import com.geckolib.renderer.GeoArmorRenderer;
import com.google.common.base.Suppliers;
import net.ammiss1.gladiator.items.ModItems;
import net.ammiss1.gladiator.items.WarriorHelmetItem;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;


public class GladiatorClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		ModItems.WARRIOR_HELMET.geoRenderProvider.setValue(
				new GeoRenderProvider() {

					private final Supplier<GeoArmorRenderer<WarriorHelmetItem, HumanoidRenderState>> renderer =
							Suppliers.memoize(() ->
									new GeoArmorRenderer<>(
											ModItems.WARRIOR_HELMET
									));

					@Override
					public @Nullable GeoArmorRenderer<?, ?> getGeoArmorRenderer(
							ItemStack itemStack,
							EquipmentSlot equipmentSlot) {

						return this.renderer.get();
					}
				}
		);
	}
}