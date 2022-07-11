package com.Mattah12.kanohicraft.datagen;

import com.Mattah12.kanohicraft.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.ShapelessRecipe;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class KanRecipes extends RecipeProvider {

    public KanRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        ShapelessRecipeBuilder.shapeless(Registration.PROTODERMIS_NUGGET.get(),9)
                .requires(Registration.PROTODERMIS_INGOT.get())
                .unlockedBy("protodermis", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PROTODERMIS_INGOT.get()))
                .save(consumer, "proto_nugget_from_ingot");

        ShapelessRecipeBuilder.shapeless(Registration.PROTODERMIS_INGOT.get(),9)
                .requires(Registration.PROTODERMIS_BLOCK.get())
                .unlockedBy("protodermis", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PROTODERMIS_INGOT.get()))
                .save(consumer, "proto_ingots_from_block");

        ShapelessRecipeBuilder.shapeless(Registration.LIGHTSTONE_TORCH.get())
                .requires(Registration.LIGHTSTONE.get())
                .requires(Items.STICK)
                .unlockedBy("lightstone", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LIGHTSTONE.get()))
                .save(consumer, "lightstone_torch_recipe");

        ShapedRecipeBuilder.shaped(Registration.PROTOGEN.get())
                .pattern("xxx")
                .pattern("xyx")
                .pattern("xzx")
                .define('x', Registration.PROTODERMIS_INGOT.get())
                .define('y', Blocks.FURNACE)
                .define('z',Tags.Items.DUSTS_REDSTONE)
                .group("kanohicraft")
                .unlockedBy("protodermis", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PROTODERMIS_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(Registration.PROTODERMIS_BLOCK.get())
                .pattern("xxx")
                .pattern("xxx")
                .pattern("xxx")
                .define('x', Registration.PROTODERMIS_INGOT.get())
                .group("kanohicraft")
                .unlockedBy("protodermis", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PROTODERMIS_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(Registration.PROTODERMIS_INGOT.get())
                .pattern("xxx")
                .pattern("xxx")
                .pattern("xxx")
                .define('x', Registration.PROTODERMIS_NUGGET.get())
                .group("kanohicraft")
                .unlockedBy("protodermis", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PROTODERMIS_INGOT.get()))
                .save(consumer, "proto_ingot_from_nuggets");

        ShapedRecipeBuilder.shaped(Registration.LIGHTSTONE_REFINED_TORCH.get())
                .pattern("  x")
                .pattern(" y ")
                .pattern("z  ")
                .define('x', Registration.LIGHTSTONE.get())
                .define('y', Blocks.COBBLESTONE)
                .define('z', Items.STICK)
                .group("kanohicraft")
                .unlockedBy("lightstone", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LIGHTSTONE.get()))
                .save(consumer, "refined_lightstone_torch_recipe");

        ShapedRecipeBuilder.shaped(Registration.LIGHTSTONE_STONE_LAMP.get())
                .pattern("xyx")
                .pattern("xzx")
                .pattern("xyx")
                .define('x', Blocks.STONE)
                .define('y', Blocks.GLASS)
                .define('z', Registration.LIGHTSTONE_TORCH.get())
                .group("kanohicraft")
                .unlockedBy("lighstone", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LIGHTSTONE.get()))
                .save(consumer, "lightstone_stone_lamp");

        ShapedRecipeBuilder.shaped(Registration.LIGHTSTONE_WOOD_LAMP.get())
                .pattern("xyx")
                .pattern("xzx")
                .pattern("xyx")
                .define('x', Blocks.OAK_PLANKS)
                .define('y', Blocks.GLASS)
                .define('z', Registration.LIGHTSTONE_TORCH.get())
                .group("kanohicraft")
                .unlockedBy("lighstone", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LIGHTSTONE.get()))
                .save(consumer, "lightstone_wood_lamp");

        ShapedRecipeBuilder.shaped(Registration.LIGHTSTONE_REFINED_STONE_LAMP.get())
                .pattern("xyx")
                .pattern("xzx")
                .pattern("xyx")
                .define('x', Blocks.STONE)
                .define('y', Blocks.GLASS)
                .define('z', Registration.LIGHTSTONE_REFINED_TORCH.get())
                .group("kanohicraft")
                .unlockedBy("lighstone", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LIGHTSTONE.get()))
                .save(consumer, "lightstone_refined_stone_lamp");

        ShapedRecipeBuilder.shaped(Registration.LIGHTSTONE_REFINED_WOOD_LAMP.get())
                .pattern("xyx")
                .pattern("xzx")
                .pattern("xyx")
                .define('x', Blocks.OAK_PLANKS)
                .define('y', Blocks.GLASS)
                .define('z', Registration.LIGHTSTONE_REFINED_TORCH.get())
                .group("kanohicraft")
                .unlockedBy("lighstone", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LIGHTSTONE.get()))
                .save(consumer, "lightstone_refined_wood_lamp");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.PROTODERMIS_ORE_ITEM),
                        Registration.PROTODERMIS_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.PROTODERMIS_ORE_ITEM))
                .save(consumer, "protodermis_ingot1");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.PROTODERMIS_RAW.get()),
                        Registration.PROTODERMIS_INGOT.get(), 0.0f, 100)
                .unlockedBy("has_nugget", has(Registration.PROTODERMIS_RAW.get()))
                .save(consumer, "protodermis_ingot2");

    }
}