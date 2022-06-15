package com.example.kanohicraft.datagen;

import com.example.kanohicraft.KanohiCraft;
import com.example.kanohicraft.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class KanBlockTags extends BlockTagsProvider {

    public KanBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, KanohiCraft.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.PROTOGEN.get())
                .add(Registration.PROTODERMIS_ORE_OVERWORLD.get())
                .add(Registration.PROTODERMIS_ORE_NETHER.get())
                .add(Registration.PROTODERMIS_ORE_END.get())
                .add(Registration.PROTODERMIS_ORE_DEEPSLATE.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(Registration.PROTOGEN.get())
                .add(Registration.PROTODERMIS_ORE_OVERWORLD.get())
                .add(Registration.PROTODERMIS_ORE_NETHER.get())
                .add(Registration.PROTODERMIS_ORE_END.get())
                .add(Registration.PROTODERMIS_ORE_DEEPSLATE.get());
        tag(Tags.Blocks.ORES)
                .add(Registration.PROTODERMIS_ORE_OVERWORLD.get())
                .add(Registration.PROTODERMIS_ORE_NETHER.get())
                .add(Registration.PROTODERMIS_ORE_END.get())
                .add(Registration.PROTODERMIS_ORE_DEEPSLATE.get());

        tag(Registration.PROTODERMIS_ORE)
                .add(Registration.PROTODERMIS_ORE_OVERWORLD.get())
                .add(Registration.PROTODERMIS_ORE_NETHER.get())
                .add(Registration.PROTODERMIS_ORE_END.get())
               .add(Registration.PROTODERMIS_ORE_DEEPSLATE.get());
    }

    @Override
    public String getName() {
        return "KanohiCraft Tags";
    }
}