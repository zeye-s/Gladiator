package net.ammiss1.gladiator.client.datagen;

import net.ammiss1.gladiator.items.ModItemsID;
import net.ammiss1.gladiator.items.WarriorMaterial;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.references.ItemIds;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class GladiatorTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public GladiatorTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider>
            registriesFuture){
        super (output, registriesFuture);

        builder(WarriorMaterial.REPAIRS_WARRIOR_ARMOR)
                .add(ItemIds.IRON_INGOT, ItemIds.GOLD_INGOT);
        builder(ItemTags.HEAD_ARMOR)
                .add(ModItemsID.WARRIOR_HELMET);
        }


    @Override
    protected void addTags(HolderLookup.Provider wrapperLookUp){
    }



}
