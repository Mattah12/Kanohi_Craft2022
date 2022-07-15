package com.Mattah12.kanohicraft.datagen;

import com.Mattah12.kanohicraft.KanohiCraft;
import com.Mattah12.kanohicraft.setup.Registration;
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
                .add(Registration.PROTODERMIS_ORE_DEEPSLATE.get())
                .add(Registration.PROTODERMIS_BLOCK.get())
                .add(Registration.LIGHTSTONE_BLOCK_DEEPSLATE.get())
                .add(Registration.LIGHTSTONE_BLOCK_OVERWORLD.get())
                .add(Registration.LIGHTSTONE_WOOD_LAMP.get())
                .add(Registration.LIGHTSTONE_STONE_LAMP.get())
                .add(Registration.LIGHTSTONE_REFINED_WOOD_LAMP.get())
                .add(Registration.LIGHTSTONE_REFINED_STONE_LAMP.get())
                .add(Registration.FOUNDRY.get());
        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(Registration.LIGHTSTONE_WOOD_LAMP.get())
                .add(Registration.LIGHTSTONE_STONE_LAMP.get())
                .add(Registration.LIGHTSTONE_REFINED_WOOD_LAMP.get())
                .add(Registration.LIGHTSTONE_REFINED_STONE_LAMP.get())
                .add(Registration.LIGHTSTONE_BLOCK_DEEPSLATE.get())
                .add(Registration.LIGHTSTONE_BLOCK_OVERWORLD.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(Registration.PROTOGEN.get())
                .add(Registration.PROTODERMIS_ORE_OVERWORLD.get())
                .add(Registration.PROTODERMIS_ORE_NETHER.get())
                .add(Registration.PROTODERMIS_ORE_END.get())
                .add(Registration.PROTODERMIS_ORE_DEEPSLATE.get())
                .add(Registration.PROTODERMIS_BLOCK.get())
                .add(Registration.FOUNDRY.get());
        tag(Tags.Blocks.ORES)
                .add(Registration.PROTODERMIS_ORE_OVERWORLD.get())
                .add(Registration.PROTODERMIS_ORE_NETHER.get())
                .add(Registration.PROTODERMIS_ORE_END.get())
                .add(Registration.PROTODERMIS_ORE_DEEPSLATE.get());
        tag(Registration.PROTODERMIS_ORE)
                .add(Registration.PROTODERMIS_ORE_OVERWORLD.get())
                .add(Registration.PROTODERMIS_ORE_NETHER.get())
                .add(Registration.PROTODERMIS_ORE_END.get())
                .add(Registration.PROTODERMIS_ORE_DEEPSLATE.get())
                .add(Registration.PROTODERMIS_BLOCK.get());
        tag(Registration.LIGHTSTONE_BLOCKS)
                .add(Registration.LIGHTSTONE_BLOCK_DEEPSLATE.get())
                .add(Registration.LIGHTSTONE_BLOCK_OVERWORLD.get())
                .add(Registration.LIGHTSTONE_WOOD_LAMP.get())
                .add(Registration.LIGHTSTONE_STONE_LAMP.get())
                .add(Registration.LIGHTSTONE_REFINED_WOOD_LAMP.get())
                .add(Registration.LIGHTSTONE_REFINED_STONE_LAMP.get())
                .add(Registration.LIGHTSTONE_TORCH.get())
                .add(Registration.LIGHTSTONE_REFINED_TORCH.get())
                .add(Registration.WALL_LIGHTSTONE_TORCH.get())
                .add(Registration.WALL_LIGHTSTONE_REFINED_TORCH.get());
    }

    @Override
    public String getName() {
        return "KanohiCraft Tags";
    }
}