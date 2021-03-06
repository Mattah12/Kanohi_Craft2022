package com.Mattah12.kanohicraft.setup;

import com.Mattah12.kanohicraft.client.FoundryScreen;
import com.Mattah12.kanohicraft.client.ProtoGenScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup {

    public static void init(FMLClientSetupEvent event){
        event.enqueueWork(() -> {
            MenuScreens.register(Registration.PROTOGEN_CONTAINER.get(), ProtoGenScreen::new);
            MenuScreens.register(Registration.FOUNDRY_MENU.get(), FoundryScreen::new);
        });


        ItemBlockRenderTypes.setRenderLayer(Registration.LIGHTSTONE_BLOCK_OVERWORLD.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(Registration.LIGHTSTONE_BLOCK_DEEPSLATE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(Registration.LIGHTSTONE_WOOD_LAMP.get(),RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(Registration.LIGHTSTONE_STONE_LAMP.get(),RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(Registration.LIGHTSTONE_REFINED_WOOD_LAMP.get(),RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(Registration.LIGHTSTONE_REFINED_STONE_LAMP.get(),RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(Registration.LIGHTSTONE_TORCH.get(),RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(Registration.WALL_LIGHTSTONE_TORCH.get(),RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(Registration.LIGHTSTONE_REFINED_TORCH.get(),RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(Registration.WALL_LIGHTSTONE_REFINED_TORCH.get(),RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(Registration.FOUNDRY.get(),RenderType.cutout());

    }
}
