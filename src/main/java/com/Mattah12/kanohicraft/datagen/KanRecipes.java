package com.Mattah12.kanohicraft.datagen;

import com.Mattah12.kanohicraft.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class KanRecipes extends RecipeProvider {

    public KanRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

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