package net.ammiss1.gladiator.items;

import net.ammiss1.gladiator.Gladiator;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import java.util.Map;

public class WarriorMaterial {
    public static final int BASE_DURABILITY= 215;

    public static final ResourceKey<EquipmentAsset> WARRIOR_ARMOR_MATERIAL_KEY =
            ResourceKey.create(EquipmentAssets.ROOT_ID, Gladiator.id("warrior"));

    public static final TagKey<Item> REPAIRS_WARRIOR_ARMOR =
            TagKey.create(BuiltInRegistries.ITEM.key(), Gladiator.id("repairs_warrior_armor"));

    public static final ArmorMaterial INSTANCE = new ArmorMaterial(
            BASE_DURABILITY,
            Map.of(
                    ArmorType.HELMET, 2,
                    ArmorType.CHESTPLATE, 6
            ),
             9,
            SoundEvents.ARMOR_EQUIP_IRON,
            0.5F,
            0.0F,
            REPAIRS_WARRIOR_ARMOR,
            WARRIOR_ARMOR_MATERIAL_KEY
    );
}
