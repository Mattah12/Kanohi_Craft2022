package com.example.kanohicraft.datagen;

import com.example.kanohicraft.KanohiCraft;
import com.example.kanohicraft.setup.Registration;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.MultiPartBlockStateBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;

public class KanBlockStates extends BlockStateProvider {

    public KanBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, KanohiCraft.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        registerProtoGen();

        simpleBlock(Registration.PROTODERMIS_ORE_OVERWORLD.get());
        simpleBlock(Registration.PROTODERMIS_ORE_NETHER.get());
        simpleBlock(Registration.PROTODERMIS_ORE_END.get());
        simpleBlock(Registration.PROTODERMIS_ORE_DEEPSLATE.get());
    }

    private void registerProtoGen() {
        Block block = Registration.PROTOGEN.get();
        ResourceLocation back = modLoc("block/protogen_back");
        ResourceLocation east = modLoc("block/protogen_east");
        ResourceLocation west = modLoc("block/protogen_west");
        ResourceLocation top = modLoc("block/protogen_top");
        ResourceLocation off = modLoc("block/protogen_off");
        ResourceLocation powered = modLoc("block/protogen_powered");
        simpleBlock(block, models().cube(block.getRegistryName().getPath(), back, east, west, top, off, powered));
    }

/*    private void registerProtoGen() {
        BlockModelBuilder frame = models().getBuilder("block/protogen/main");
        frame.parent(models().getExistingFile(mcLoc("cube")));

        floatingCube(frame, 0f, 0f, 0f, 1f, 16f, 1f);
        floatingCube(frame, 15f, 0f, 0f, 16f, 16f, 1f);
        floatingCube(frame, 0f, 0f, 15f, 1f, 16f, 16f);
        floatingCube(frame, 15f, 0f, 15f, 16f, 16f, 16f);

        floatingCube(frame, 1f, 0f, 0f, 15f, 1f, 1f);
        floatingCube(frame, 1f, 15f, 0f, 15f, 16f, 1f);
        floatingCube(frame, 1f, 0f, 15f, 15f, 1f, 16f);
        floatingCube(frame, 1f, 15f, 15f, 15f, 16f, 16f);

        floatingCube(frame, 0f, 0f, 1f, 1f, 1f, 15f);
        floatingCube(frame, 15f, 0f, 1f, 16f, 1f, 15f);
       floatingCube(frame, 0f, 15f, 1f, 1f, 16f, 15f);
        floatingCube(frame, 15f, 15f, 1f, 16f, 16f, 15f);

        floatingCube(frame, 1f, 1f, 1f, 15f, 15f, 15f);

        frame.texture("window", modLoc("block/powergen_window"));
        frame.texture("particle", modLoc("block/powergen_off"));

       createPowergenModel(Registration.POWERGEN.get(), frame);
    }*/

/*
    private void floatingCube(BlockModelBuilder builder, float fx, float fy, float fz, float tx, float ty, float tz) {
        builder.element()
                .from(fx, fy, fz)
                .to(tx, ty, tz)
                .allFaces((direction, faceBuilder) -> faceBuilder.texture("#window"))
                .end();
    }*/

    private void createProtoGenModel(Block block, BlockModelBuilder frame) {
        BlockModelBuilder singleOff = models().getBuilder("block/protogen/singleoff")
                .element().from(3, 3, 3).to(13, 13, 13).face(Direction.DOWN).texture("#single").end().end()
                .texture("single", modLoc("block/protogen_off"));
        BlockModelBuilder singleOn = models().getBuilder("block/protogen/singleon")
                .element().from(3, 3, 3).to(13, 13, 13).face(Direction.DOWN).texture("#single").end().end()
                .texture("single", modLoc("block/protogen_powered"));

        MultiPartBlockStateBuilder bld = getMultipartBuilder(block);

        bld.part().modelFile(frame).addModel();

        BlockModelBuilder[] models = new BlockModelBuilder[] { singleOff, singleOn };
        for (int i = 0 ; i < 2 ; i++) {
            boolean powered = i == 1;
            bld.part().modelFile(models[i]).addModel().condition(BlockStateProperties.POWERED, powered);
            bld.part().modelFile(models[i]).rotationX(180).addModel().condition(BlockStateProperties.POWERED, powered);
            bld.part().modelFile(models[i]).rotationX(90).addModel().condition(BlockStateProperties.POWERED, powered);
            bld.part().modelFile(models[i]).rotationX(270).addModel().condition(BlockStateProperties.POWERED, powered);
            bld.part().modelFile(models[i]).rotationY(90).rotationX(90).addModel().condition(BlockStateProperties.POWERED, powered);
            bld.part().modelFile(models[i]).rotationY(270).rotationX(90).addModel().condition(BlockStateProperties.POWERED, powered);
        }
    }
}

