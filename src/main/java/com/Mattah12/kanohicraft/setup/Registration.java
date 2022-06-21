package com.Mattah12.kanohicraft.setup;

import com.Mattah12.kanohicraft.KanohiCraft;
import com.Mattah12.kanohicraft.blocks.ProtoGenBE;
import com.Mattah12.kanohicraft.blocks.ProtoGenBlock;
import com.Mattah12.kanohicraft.blocks.ProtoGenContainer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, KanohiCraft.MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KanohiCraft.MODID);
    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, KanohiCraft.MODID);
    private static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, KanohiCraft.MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITIES.register(bus);
        CONTAINERS.register(bus);
    }

    // Some common properties for our blocks and items
    public static final BlockBehaviour.Properties BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops();
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);

    public static final RegistryObject<Block> PROTODERMIS_ORE_OVERWORLD = BLOCKS.register("protodermis_ore_overworld", () -> new Block(Registration.BLOCK_PROPERTIES));
    public static final RegistryObject<Item> PROTODERMIS_ORE_OVERWORLD_ITEM = fromBlock(PROTODERMIS_ORE_OVERWORLD);
    public static final RegistryObject<Block> PROTODERMIS_ORE_NETHER = BLOCKS.register("protodermis_ore_nether", () -> new Block(Registration.BLOCK_PROPERTIES));
    public static final RegistryObject<Item> PROTODERMIS_ORE_NETHER_ITEM = fromBlock(PROTODERMIS_ORE_NETHER);
    public static final RegistryObject<Block> PROTODERMIS_ORE_END = BLOCKS.register("protodermis_ore_end", () -> new Block(Registration.BLOCK_PROPERTIES));
    public static final RegistryObject<Item> PROTODERMIS_ORE_END_ITEM = fromBlock(PROTODERMIS_ORE_END);
    public static final RegistryObject<Block> PROTODERMIS_ORE_DEEPSLATE = BLOCKS.register("protodermis_ore_deepslate", () -> new Block(Registration.BLOCK_PROPERTIES));
    public static final RegistryObject<Item> PROTODERMIS_ORE_DEEPSLATE_ITEM = fromBlock(PROTODERMIS_ORE_DEEPSLATE);

    public static final RegistryObject<ProtoGenBlock> PROTOGEN = BLOCKS.register("protogen", ProtoGenBlock::new);
    public static final RegistryObject<Item> PROTOGEN_ITEM = fromBlock(PROTOGEN);
    public static final RegistryObject<BlockEntityType<ProtoGenBE>> PROTOGEN_BE = BLOCK_ENTITIES.register("protogen", () -> BlockEntityType.Builder.of(ProtoGenBE::new, PROTOGEN.get()).build(null));
    public static final RegistryObject<MenuType<ProtoGenContainer>> PROTOGEN_CONTAINER = CONTAINERS.register("",
            () -> IForgeMenuType.create((windowId, inv, data) -> new ProtoGenContainer(windowId, data.readBlockPos(), inv, inv.player)));


    public static final RegistryObject<Item> PROTODERMIS_RAW = ITEMS.register("raw_protodermis", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> PROTODERMIS_INGOT = ITEMS.register("protodermis_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> PROTODERMIS_NUGGET = ITEMS.register("protodermis_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Block> PROTODERMIS_BLOCK = BLOCKS.register("protodermis_block", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> PROTODERMIS_BLOCK_ITEM = fromBlock(PROTODERMIS_BLOCK);


    public static final Tags.IOptionalNamedTag<Block> PROTODERMIS_ORE = BlockTags.createOptional(new ResourceLocation(KanohiCraft.MODID, "protodermis_ore"));
    public static final Tags.IOptionalNamedTag<Item> PROTODERMIS_ORE_ITEM = ItemTags.createOptional(new ResourceLocation(KanohiCraft.MODID, "protodermis_ore"));


    // Conveniance function: Take a RegistryObject<Block> and make a corresponding RegistryObject<Item> from it
    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
