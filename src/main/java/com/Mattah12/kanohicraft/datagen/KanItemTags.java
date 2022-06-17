package com.Mattah12.kanohicraft.datagen;

import com.Mattah12.kanohicraft.KanohiCraft;
import com.Mattah12.kanohicraft.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class KanItemTags extends ItemTagsProvider {

    public KanItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, KanohiCraft.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.ORES)
                .add(Registration.PROTODERMIS_ORE_OVERWORLD_ITEM.get())
                .add(Registration.PROTODERMIS_ORE_NETHER_ITEM.get())
                .add(Registration.PROTODERMIS_ORE_END_ITEM.get())
                .add(Registration.PROTODERMIS_ORE_DEEPSLATE_ITEM.get());
        tag(Tags.Items.INGOTS)
                .add(Registration.PROTODERMIS_INGOT.get());
        tag(Registration.PROTODERMIS_ORE_ITEM)
                .add(Registration.PROTODERMIS_ORE_OVERWORLD_ITEM.get())
                .add(Registration.PROTODERMIS_ORE_NETHER_ITEM.get())
                .add(Registration.PROTODERMIS_ORE_END_ITEM.get())
                .add(Registration.PROTODERMIS_ORE_DEEPSLATE_ITEM.get());

    }

    @Override
    public String getName() {
        return "KanohiCraft Tags";
    }
}