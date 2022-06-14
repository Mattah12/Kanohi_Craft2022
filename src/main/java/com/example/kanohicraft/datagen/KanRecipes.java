package com.example.kanohicraft.datagen;

import com.example.kanohicraft.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class KanRecipes extends RecipeProvider {

    public KanRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.PROTODERMIS_ORE_ITEM),
                        Registration.PROTODERMIS_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.PROTODERMIS_ORE_ITEM))
                .save(consumer, "protodermis_ingot1");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.PROTODERMIS_NUGGET.get()),
                        Registration.PROTODERMIS_INGOT.get(), 0.0f, 100)
                .unlockedBy("has_nugget", has(Registration.PROTODERMIS_NUGGET.get()))
                .save(consumer, "protodermis_ingot2");

    }
}