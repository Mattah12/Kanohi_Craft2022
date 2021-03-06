package com.Mattah12.kanohicraft;

import com.Mattah12.kanohicraft.setup.ClientSetup;
import com.Mattah12.kanohicraft.setup.ModSetup;
import com.Mattah12.kanohicraft.setup.Registration;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(KanohiCraft.MODID)
public class KanohiCraft {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "kanohicraft";

    public KanohiCraft() {

        // Register the deferred registry
        ModSetup.setup();
        Registration.init();

        // Register the setup method for modloading
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(ModSetup::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT,() -> () -> modbus.addListener(ClientSetup::init));
    }
}
