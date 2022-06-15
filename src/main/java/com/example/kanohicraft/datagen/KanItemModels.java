package com.example.kanohicraft.datagen;

import com.example.kanohicraft.KanohiCraft;
import com.example.kanohicraft.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class KanItemModels extends ItemModelProvider {

    public KanItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, KanohiCraft.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Registration.PROTODERMIS_ORE_OVERWORLD_ITEM.get().getRegistryName().getPath(), modLoc("block/protodermis_ore_overworld"));
        withExistingParent(Registration.PROTODERMIS_ORE_NETHER_ITEM.get().getRegistryName().getPath(), modLoc("block/protodermis_ore_nether"));
        withExistingParent(Registration.PROTODERMIS_ORE_END_ITEM.get().getRegistryName().getPath(), modLoc("block/protodermis_ore_end"));
        withExistingParent(Registration.PROTODERMIS_ORE_DEEPSLATE_ITEM.get().getRegistryName().getPath(), modLoc("block/protodermis_ore_deepslate"));

        withExistingParent(Registration.PROTOGEN_ITEM.get().getRegistryName().getPath(),modLoc("block/protogen"));

        singleTexture(Registration.PROTODERMIS_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                    "layer0", modLoc("item/protodermis_nugget"));
        singleTexture(Registration.PROTODERMIS_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/protodermis_ingot"));
    }
}