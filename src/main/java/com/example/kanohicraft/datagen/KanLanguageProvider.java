package com.example.kanohicraft.datagen;

import com.example.kanohicraft.KanohiCraft;
import com.example.kanohicraft.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.example.kanohicraft.setup.ModSetup.TAB_NAME;

public class KanLanguageProvider extends LanguageProvider {

    public KanLanguageProvider(DataGenerator gen, String locale) {
        super(gen, KanohiCraft.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "KanohiCraft");
        add(Registration.PROTODERMIS_ORE_OVERWORLD.get(), "Protodermis Ore");
        add(Registration.PROTODERMIS_ORE_NETHER.get(), "Protodermis Ore");
        add(Registration.PROTODERMIS_ORE_END.get(), "Protodermis Ore");
        add(Registration.PROTODERMIS_ORE_DEEPSLATE.get(), "Protodermis Ore");
        add(Registration.PROTODERMIS_NUGGET.get(), "Protodermis Nugget");
        add(Registration.PROTODERMIS_INGOT.get(), "Protodermis Ingot");
    }
}