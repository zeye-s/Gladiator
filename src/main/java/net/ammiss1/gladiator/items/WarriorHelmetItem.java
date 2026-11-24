package net.ammiss1.gladiator.items;

import com.geckolib.animatable.GeoItem;
import com.geckolib.animatable.client.GeoRenderProvider;
import com.geckolib.animatable.instance.AnimatableInstanceCache;
import com.geckolib.animatable.manager.AnimatableManager;
import com.geckolib.renderer.GeoArmorRenderer;
import com.geckolib.util.GeckoLibUtil;
import com.google.common.base.Suppliers;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jspecify.annotations.Nullable;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class WarriorHelmetItem extends Item implements GeoItem {
    private final AnimatableInstanceCache geoCache =
            GeckoLibUtil.createInstanceCache(this);
    public WarriorHelmetItem(Properties properties){
        super(properties);
    }

    @Override
    public void createGeoRenderer(Consumer<GeoRenderProvider> consumer){
        consumer.accept(new GeoRenderProvider() {
            private final Supplier<GeoArmorRenderer<WarriorHelmetItem, ?>> renderer =
                    Suppliers.memoize(() ->
                            new GeoArmorRenderer<>(WarriorHelmetItem.this));

            @Override
            public @Nullable GeoArmorRenderer<?, ?> getGeoArmorRenderer(
                    ItemStack itemStack, EquipmentSlot equipmentSlot) {
                return this.renderer.get();
            }
        });
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {

    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return null;
    }
}
