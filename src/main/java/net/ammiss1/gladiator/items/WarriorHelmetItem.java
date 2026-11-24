package net.ammiss1.gladiator.items;

import com.geckolib.animatable.GeoItem;
import com.geckolib.animatable.client.GeoRenderProvider;
import com.geckolib.animatable.instance.AnimatableInstanceCache;
import com.geckolib.util.GeckoLibUtil;
import net.minecraft.world.item.Item;

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
            private final Supplier
        })
    }
}
