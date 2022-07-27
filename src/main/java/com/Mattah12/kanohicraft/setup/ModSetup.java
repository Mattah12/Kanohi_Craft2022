package com.Mattah12.kanohicraft.setup;

import com.Mattah12.kanohicraft.KanohiCraft;
import com.Mattah12.kanohicraft.worldgen.ores.Ores;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = KanohiCraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModSetup {

    public static final String TAB_NAME = "kanohicraft";

    public static final CreativeModeTab KANOHICRAFT_TAB = new CreativeModeTab(TAB_NAME) {
        @Override
        public ItemStack makeIcon() {return new ItemStack(Registration.MASK_HAU.get());}
    };

    public static void setup(){
        IEventBus bus = MinecraftForge.EVENT_BUS;
        bus.addListener(Ores::onBiomeLoadingEvent);
    }

    public static void init(FMLCommonSetupEvent event){
        event.enqueueWork(() ->{
            Ores.registerConfiguredFeatures();
        });
    }

}
