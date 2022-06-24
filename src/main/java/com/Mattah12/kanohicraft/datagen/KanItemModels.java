package com.Mattah12.kanohicraft.datagen;

import com.Mattah12.kanohicraft.KanohiCraft;
import com.Mattah12.kanohicraft.setup.Registration;
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
        withExistingParent(Registration.PROTODERMIS_BLOCK.get().getRegistryName().getPath(), modLoc("block/protodermis_block"));



        singleTexture(Registration.PROTODERMIS_RAW.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                    "layer0", modLoc("item/raw_protodermis"));
        singleTexture(Registration.PROTODERMIS_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/protodermis_ingot"));
        singleTexture(Registration.PROTODERMIS_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/protodermis_nugget"));
        singleTexture(Registration.MASK_HAU.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/maskhau"));
        singleTexture(Registration.MASK_MIRU.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/maskmiru"));
    }
}