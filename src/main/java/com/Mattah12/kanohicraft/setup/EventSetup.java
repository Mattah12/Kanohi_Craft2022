/*
package com.Mattah12.kanohicraft.setup;

import com.Mattah12.kanohicraft.KanohiCraft;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = KanohiCraft.MODID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventsMod {
    @SubscribeEvent
    public static void ColorHandlerEvent(final ColorHandlerEvent.Item event)
    {
        event.getItemColors().register((item,hue) ->
                {return hue > 0 ? -1 : KanohiItem.getColor(item);},
                ModItems.MASK_HAU.get(),ModItems.MASK_MIRU.get();
    }
}*/
