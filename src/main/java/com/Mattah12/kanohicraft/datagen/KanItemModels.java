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
        withExistingParent(Registration.LIGHTSTONE_BLOCK_OVERWORLD_ITEM.get().getRegistryName().getPath(), modLoc("block/lightstone_block_overworld"));
        withExistingParent(Registration.LIGHTSTONE_BLOCK_DEEPSLATE_ITEM.get().getRegistryName().getPath(), modLoc("block/lightstone_block_deepslate"));
        withExistingParent(Registration.LIGHTSTONE_WOOD_LAMP_ITEM.get().getRegistryName().getPath(), modLoc("block/lightstone_wood_lamp"));
        withExistingParent(Registration.LIGHTSTONE_STONE_LAMP_ITEM.get().getRegistryName().getPath(), modLoc("block/lightstone_stone_lamp"));



        singleTexture(Registration.PROTODERMIS_RAW.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                    "layer0", modLoc("item/raw_protodermis"));
        singleTexture(Registration.PROTODERMIS_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/protodermis_ingot"));
        singleTexture(Registration.PROTODERMIS_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/protodermis_nugget"));

        singleTexture(Registration.LIGHTSTONE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/lightstone"));


        singleTexture(Registration.MASK_HAU.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/maskhau"));
        singleTexture(Registration.MASK_MIRU.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/maskmiru"));
        singleTexture(Registration.MASK_AKAKU.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/maskakaku"));
        singleTexture(Registration.MASK_KAKAMA.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/maskkakama"));
        singleTexture(Registration.MASK_PAKARI.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/maskpakari"));
        singleTexture(Registration.MASK_KAUKAU.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/maskkaukau"));
    }
}