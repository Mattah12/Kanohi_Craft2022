package com.Mattah12.kanohicraft.setup;

import com.Mattah12.kanohicraft.client.ProtoGenScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup {

    public static void init(FMLClientSetupEvent event){
        event.enqueueWork(() -> {
            MenuScreens.register(Registration.PROTOGEN_CONTAINER.get(), ProtoGenScreen::new);

        });

        ItemBlockRenderTypes.setRenderLayer(Registration.LIGHTSTONE_BLOCK_OVERWORLD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(Registration.LIGHTSTONE_BLOCK_DEEPSLATE.get(), RenderType.cutout());


    }
}
