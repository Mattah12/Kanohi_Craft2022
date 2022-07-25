package com.Mattah12.kanohicraft.events;

import com.Mattah12.kanohicraft.KanohiCraft;
import com.Mattah12.kanohicraft.recipes.FoundryRecipe;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = KanohiCraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class KanEventBusEvents {

    @SubscribeEvent
    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event) {
        Registry.register(Registry.RECIPE_TYPE, FoundryRecipe.Type.ID, FoundryRecipe.Type.INSTANCE);
    }
}
