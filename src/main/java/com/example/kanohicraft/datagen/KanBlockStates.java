package com.example.kanohicraft.datagen;

import com.example.kanohicraft.KanohiCraft;
import com.example.kanohicraft.setup.Registration;
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
    }
}