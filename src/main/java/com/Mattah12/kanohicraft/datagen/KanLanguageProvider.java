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
        add("itemGroup." + ModSetup.TAB_NAME, "Kanohi Craft");

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

        add(Registration.LIGHTSTONE.get(), "Lightstone");
        add(Registration.LIGHTSTONE_BLOCK_OVERWORLD.get(), "Lightstone Deposit");
        add(Registration.LIGHTSTONE_BLOCK_DEEPSLATE.get(), "Lightstone Deposit");
        add(Registration.LIGHTSTONE_WOOD_LAMP.get(), "Wooden Lightstone Lamp");
        add(Registration.LIGHTSTONE_STONE_LAMP.get(), "Stone Lightstone Lamp");
        add(Registration.LIGHTSTONE_TORCH.get(), "Lightstone Torch");
        add(Registration.LIGHTSTONE_REFINED_TORCH.get(), "Refined Lightstone Torch");


        add(Registration.MASK_HAU.get(), "Kanohi Hau: Mask of Shielding");
        add(Registration.MASK_MIRU.get(), "Kanohi Miru: Mask of Levitation");
        add(Registration.MASK_KAUKAU.get(), "Kanohi Kaukau: Mask of Water Breathing");
        add(Registration.MASK_PAKARI.get(), "Kanohi Pakari: Mask of Strength");
        add(Registration.MASK_AKAKU.get(), "Kanohi Akaku: Mask of X-Ray Vision");
        add(Registration.MASK_KAKAMA.get(), "Kanohi Kakama: Mask of Speed");
    }
}