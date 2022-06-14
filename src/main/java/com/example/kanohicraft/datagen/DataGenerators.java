package com.example.kanohicraft.datagen;

import com.example.kanohicraft.KanohiCraft;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = KanohiCraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new KanRecipes(generator));
            generator.addProvider(new KanLootTables(generator));
            KanBlockTags blockTags = new KanBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new KanItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(new KanBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new KanItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new KanLanguageProvider(generator, "en_us"));
        }
    }
}
