package net.ammiss1.gladiator.items;

import net.ammiss1.gladiator.Gladiator;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class ModItemsID {
    public static ResourceKey<Item> create(String name) {
        return ResourceKey.create(Registries.ITEM, Gladiator.id(name));
    }

    public static final ResourceKey<Item> Warrior_Helmet = create("warrior_helmet");
}
