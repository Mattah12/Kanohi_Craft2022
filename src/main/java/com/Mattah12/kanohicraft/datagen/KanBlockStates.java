package com.Mattah12.kanohicraft.datagen;

import com.Mattah12.kanohicraft.KanohiCraft;
import com.Mattah12.kanohicraft.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelBuilder;
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

        lightstoneOreBlock(Registration.LIGHTSTONE_BLOCK_OVERWORLD.get(),
                "block/lightstone_block_overworld",
                "block/lightstone_block_inner");

        lightstoneOreBlock(Registration.LIGHTSTONE_BLOCK_DEEPSLATE.get(),
                "block/lightstone_block_deepslate",
                "block/lightstone_block_inner");

        simpleBlock(Registration.LIGHTSTONE_WOOD_LAMP.get());
        simpleBlock(Registration.LIGHTSTONE_STONE_LAMP.get());
    }



    //Building custom model for transparent lightstone crystal blocks
    public void lightstoneOreBlock(Block block, String outerTexture, String innerTexture)
    {
        String registryName = block.getRegistryName().toString();
        BlockModelBuilder model = models().withExistingParent(registryName, mcLoc("block"))
                .texture("particle", outerTexture)
                .texture("inner", innerTexture)
                .texture("outer", outerTexture);
        ModelBuilder<BlockModelBuilder>.ElementBuilder element1 = model.element();

        element1.from(1,1,1).to(15,15,15)
                .allFaces((direction, builder) -> {
                    builder.texture("#inner").cullface(direction);
                });

        ModelBuilder<BlockModelBuilder>.ElementBuilder element2 = model.element();
        element2.from(0,0,0).to(16,16,16)
                .allFaces((direction, builder) -> {
                    builder.texture("#outer").cullface(direction);
                });

        getVariantBuilder(block).partialState().addModels(new ConfiguredModel(model));
    }

}
