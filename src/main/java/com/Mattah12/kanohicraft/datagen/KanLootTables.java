package com.Mattah12.kanohicraft.datagen;

import com.Mattah12.kanohicraft.setup.Registration;
import net.minecraft.data.DataGenerator;

public class KanLootTables extends BaseLootTableProvider {

    public KanLootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
        lootTables.put(Registration.PROTOGEN.get(), createStandardTable("protogen", Registration.PROTOGEN.get(), Registration.PROTOGEN_BE.get()));
        lootTables.put(Registration.PROTODERMIS_ORE_OVERWORLD.get(), createSilkTouchTable("protodermis_ore_overworld", Registration.PROTODERMIS_ORE_OVERWORLD.get(), Registration.PROTODERMIS_RAW.get(), 1, 3));
        lootTables.put(Registration.PROTODERMIS_ORE_NETHER.get(), createSilkTouchTable("protodermis_ore_nether", Registration.PROTODERMIS_ORE_NETHER.get(), Registration.PROTODERMIS_RAW.get(), 1, 3));
        lootTables.put(Registration.PROTODERMIS_ORE_END.get(), createSilkTouchTable("protodermis_ore_end", Registration.PROTODERMIS_ORE_END.get(), Registration.PROTODERMIS_RAW.get(), 1, 3));
        lootTables.put(Registration.PROTODERMIS_ORE_DEEPSLATE.get(), createSilkTouchTable("protodermis_ore_deepslate", Registration.PROTODERMIS_ORE_DEEPSLATE.get(), Registration.PROTODERMIS_RAW.get(), 1, 3));

        lootTables.put(Registration.LIGHTSTONE_BLOCK_OVERWORLD.get(), createSilkTouchTable("lightstone_block_overworld", Registration.LIGHTSTONE_BLOCK_OVERWORLD.get(), Registration.LIGHTSTONE.get(), 2, 3));
        lootTables.put(Registration.LIGHTSTONE_BLOCK_DEEPSLATE.get(), createSilkTouchTable("lightstone_block_deepslate", Registration.LIGHTSTONE_BLOCK_DEEPSLATE.get(), Registration.LIGHTSTONE.get(), 1, 4));

        createSimpleTable("protodermis_block", Registration.PROTODERMIS_BLOCK.get());
        createSimpleTable("lightstone_wood_lamp", Registration.LIGHTSTONE_WOOD_LAMP.get());
        createSimpleTable("lightstone_stone_lamp", Registration.LIGHTSTONE_STONE_LAMP.get());
        createSimpleTable("lighstone_torch", Registration.LIGHTSTONE_TORCH.get());
        createSimpleTable("lighstone_refined_torch", Registration.LIGHTSTONE_REFINED_TORCH.get());
        createSimpleTable("wall_lighstone_torch", Registration.WALL_LIGHTSTONE_TORCH.get());
        createSimpleTable("wall_lighstone_refined_torch", Registration.WALL_LIGHTSTONE_REFINED_TORCH.get());


    }
}