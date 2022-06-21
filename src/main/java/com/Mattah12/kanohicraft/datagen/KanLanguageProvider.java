package com.Mattah12.kanohicraft.datagen;

import com.Mattah12.kanohicraft.KanohiCraft;
import com.Mattah12.kanohicraft.blocks.ProtoGenBlock;
import com.Mattah12.kanohicraft.setup.ModSetup;
import com.Mattah12.kanohicraft.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class KanLanguageProvider extends LanguageProvider {

    public KanLanguageProvider(DataGenerator gen, String locale) {
        super(gen, KanohiCraft.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + ModSetup.TAB_NAME, "KanohiCraft");

        add(ProtoGenBlock.MESSAGE_PROTOGEN, "Protodermis Generator generating at %s per tick");
        add(ProtoGenBlock.SCREEN_TUTORIAL_PROTOGEN, "Protodermis Generator");

        add(Registration.PROTOGEN.get(), "Protodermis Generator");

        add(Registration.PROTODERMIS_ORE_OVERWORLD.get(), "Protodermis Ore");
        add(Registration.PROTODERMIS_ORE_NETHER.get(), "Protodermis Ore");
        add(Registration.PROTODERMIS_ORE_END.get(), "Protodermis Ore");
        add(Registration.PROTODERMIS_ORE_DEEPSLATE.get(), "Protodermis Ore");

        add(Registration.PROTODERMIS_RAW.get(), "Raw Protodermis");
        add(Registration.PROTODERMIS_INGOT.get(), "Protodermis Ingot");
        add(Registration.PROTODERMIS_NUGGET.get(), "Protodermis Nugget");
        add(Registration.PROTODERMIS_BLOCK.get(), "Protodermis Block");
    }
}