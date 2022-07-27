package com.Mattah12.kanohicraft.worldgen.ores;

import com.Mattah12.kanohicraft.setup.Registration;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class Ores {

    public static final int PROTODERMIS_VEINSIZE = 5;
    public static final int PROTODERMIS_AMOUNT = 16;
    public static final int PROTODERMIS_DEEPSLATE_VEINSIZE = 8;
    public static final int PROTODERMIS_NETHER_VEINSIZE = 8;
    public static final int LIGHTSTONE_VEINSIZE = 4;
    public static final int LIGHTSTONE_AMOUNT = 12;


    public static final RuleTest IN_ENDSTONE = new TagMatchTest(Tags.Blocks.END_STONES);


    public static PlacedFeature PROTO_OVERWORLD_OREGEN;
    public static PlacedFeature PROTO_DEEPSLATE_OREGEN;
    public static PlacedFeature PROTO_NETHER_OREGEN;
    public static PlacedFeature PROTO_END_OREGEN;
    public static PlacedFeature LIGHTSTONE_OVERWORLD_OREGEN;
    public static PlacedFeature LIGHTSTONE_DEEPSLATE_OREGEN;

    public static void registerConfiguredFeatures() {

        OreConfiguration protooverworldConfig = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, Registration.PROTODERMIS_ORE_OVERWORLD.get().defaultBlockState(), PROTODERMIS_VEINSIZE);
        PROTO_OVERWORLD_OREGEN = registerPlacedFeature("protodermis_ore_overworld", new ConfiguredFeature<>(Feature.ORE, protooverworldConfig),
                CountPlacement.of(PROTODERMIS_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(90)));

        OreConfiguration protodeepslateConfig = new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Registration.PROTODERMIS_ORE_DEEPSLATE.get().defaultBlockState(), PROTODERMIS_DEEPSLATE_VEINSIZE);
        PROTO_DEEPSLATE_OREGEN = registerPlacedFeature("protodermis_ore_deepslate", new ConfiguredFeature<>(Feature.ORE, protodeepslateConfig),
                CountPlacement.of(PROTODERMIS_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(64)));

        OreConfiguration protonetherConfig = new OreConfiguration(OreFeatures.NETHER_ORE_REPLACEABLES, Registration.PROTODERMIS_ORE_NETHER.get().defaultBlockState(), PROTODERMIS_NETHER_VEINSIZE);
        PROTO_NETHER_OREGEN = registerPlacedFeature("protodermis_ore_nether", new ConfiguredFeature<>(Feature.ORE, protonetherConfig),
                CountPlacement.of(PROTODERMIS_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(90)));

        OreConfiguration protoendConfig = new OreConfiguration(IN_ENDSTONE, Registration.PROTODERMIS_ORE_END.get().defaultBlockState(), PROTODERMIS_VEINSIZE);
        PROTO_END_OREGEN = registerPlacedFeature("protodermis_ore_end", new ConfiguredFeature<>(Feature.ORE, protoendConfig),
                CountPlacement.of(PROTODERMIS_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(100)));

        OreConfiguration lightstoneoverworldConfig = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, Registration.LIGHTSTONE_BLOCK_OVERWORLD.get().defaultBlockState(), LIGHTSTONE_VEINSIZE);
        LIGHTSTONE_OVERWORLD_OREGEN = registerPlacedFeature("lightstone_block_overworld", new ConfiguredFeature<>(Feature.ORE, lightstoneoverworldConfig),
                CountPlacement.of(LIGHTSTONE_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(90)));

        OreConfiguration lightstonedeepslateConfig = new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Registration.LIGHTSTONE_BLOCK_DEEPSLATE.get().defaultBlockState(), LIGHTSTONE_VEINSIZE);
        LIGHTSTONE_DEEPSLATE_OREGEN = registerPlacedFeature("lightstone_block_deepslate", new ConfiguredFeature<>(Feature.ORE, lightstonedeepslateConfig),
                CountPlacement.of(LIGHTSTONE_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(64)));
    }

    private static <C extends FeatureConfiguration, F extends Feature<C>> PlacedFeature registerPlacedFeature(String registryName, ConfiguredFeature<C, F> feature, PlacementModifier... placementModifiers) {
        PlacedFeature placed = BuiltinRegistries.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(registryName), feature).placed(placementModifiers);
        return PlacementUtils.register(registryName, placed);
    }

    public static void onBiomeLoadingEvent(BiomeLoadingEvent event) {
        if (event.getCategory() == Biome.BiomeCategory.NETHER) {
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, PROTO_NETHER_OREGEN);
        } else if (event.getCategory() == Biome.BiomeCategory.THEEND) {
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, PROTO_END_OREGEN);
        } else {
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, PROTO_OVERWORLD_OREGEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, PROTO_DEEPSLATE_OREGEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, LIGHTSTONE_OVERWORLD_OREGEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, LIGHTSTONE_DEEPSLATE_OREGEN);
        }
    }
}

