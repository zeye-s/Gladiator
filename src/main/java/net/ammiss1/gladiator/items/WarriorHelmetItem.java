package net.ammiss1.gladiator.items;

import com.geckolib.animatable.GeoItem;
import com.geckolib.animatable.instance.AnimatableInstanceCache;
import com.geckolib.animatable.manager.AnimatableManager;
import com.geckolib.util.GeckoLibUtil;
import com.llamalad7.mixinextras.lib.apache.commons.mutable.MutableObject;
import net.minecraft.world.item.Item;
import java.util.function.Consumer;


public class WarriorHelmetItem extends Item implements GeoItem {
    private final AnimatableInstanceCache geoCache =
            GeckoLibUtil.createInstanceCache(this);

    public final MutableObject<Object> geoRenderProvider =
            new MutableObject<>();

    public WarriorHelmetItem(Properties properties) {
        super(properties);
    }

    @Override
    @SuppressWarnings("rawtypes")
    public void createGeoRenderer(Consumer consumer) {
        consumer.accept(this.geoRenderProvider.getValue());
    }

    @Override
    public void registerControllers(
            AnimatableManager.ControllerRegistrar controllers) {
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.geoCache;
    }
}
