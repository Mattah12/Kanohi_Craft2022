package com.Mattah12.kanohicraft.datagen;

import com.Mattah12.kanohicraft.KanohiCraft;
import com.Mattah12.kanohicraft.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class KanBlockStates extends BlockStateProvider {

    public KanBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, KanohiCraft.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {

        simpleBlock(Registration.PROTODERMIS_ORE_OVERWORLD.get());
        simpleBlock(Registration.PROTODERMIS_ORE_NETHER.get());
        simpleBlock(Registration.PROTODERMIS_ORE_END.get());
        simpleBlock(Registration.PROTODERMIS_ORE_DEEPSLATE.get());
        simpleBlock(Registration.PROTODERMIS_BLOCK.get());

        simpleBlock(Registration.LIGHTSTONE_BLOCK_OVERWORLD.get());
        simpleBlock(Registration.LIGHTSTONE_BLOCK_DEEPSLATE.get());
    }
}
