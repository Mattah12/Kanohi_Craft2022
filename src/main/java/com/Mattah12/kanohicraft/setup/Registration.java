package com.Mattah12.kanohicraft.setup;

import com.Mattah12.kanohicraft.KanohiCraft;
import com.Mattah12.kanohicraft.blocks.*;
import com.Mattah12.kanohicraft.items.FireStaffItem;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.level.block.*;
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

import static com.Mattah12.kanohicraft.setup.ModSetup.ITEM_GROUP;

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
    public static final BlockBehaviour.Properties STONE_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops();
    public static final BlockBehaviour.Properties METAL_PROPERTIES = BlockBehaviour.Properties.of(Material.METAL).strength(3f).requiresCorrectToolForDrops();
    public static final BlockBehaviour.Properties LIGHTSTONE_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops().noOcclusion().lightLevel(s -> 8);
    public static final BlockBehaviour.Properties LIGHTSTONE_LAMP_PROPERTIES = BlockBehaviour.Properties.of(Material.GLASS).strength(2f).requiresCorrectToolForDrops().noOcclusion().lightLevel(s -> 15);
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ITEM_GROUP);

    public static final RegistryObject<Block> PROTODERMIS_ORE_OVERWORLD = BLOCKS.register("protodermis_ore_overworld", () -> new Block(Registration.STONE_PROPERTIES));
    public static final RegistryObject<Item> PROTODERMIS_ORE_OVERWORLD_ITEM = fromBlock(PROTODERMIS_ORE_OVERWORLD);
    public static final RegistryObject<Block> PROTODERMIS_ORE_NETHER = BLOCKS.register("protodermis_ore_nether", () -> new Block(Registration.STONE_PROPERTIES));
    public static final RegistryObject<Item> PROTODERMIS_ORE_NETHER_ITEM = fromBlock(PROTODERMIS_ORE_NETHER);
    public static final RegistryObject<Block> PROTODERMIS_ORE_END = BLOCKS.register("protodermis_ore_end", () -> new Block(Registration.STONE_PROPERTIES));
    public static final RegistryObject<Item> PROTODERMIS_ORE_END_ITEM = fromBlock(PROTODERMIS_ORE_END);
    public static final RegistryObject<Block> PROTODERMIS_ORE_DEEPSLATE = BLOCKS.register("protodermis_ore_deepslate", () -> new Block(Registration.STONE_PROPERTIES));
    public static final RegistryObject<Item> PROTODERMIS_ORE_DEEPSLATE_ITEM = fromBlock(PROTODERMIS_ORE_DEEPSLATE);

    public static final RegistryObject<Block> LIGHTSTONE_BLOCK_OVERWORLD = BLOCKS.register("lightstone_block_overworld", () -> new Block(Registration.LIGHTSTONE_PROPERTIES));
    public static final RegistryObject<Item> LIGHTSTONE_BLOCK_OVERWORLD_ITEM = fromBlock(LIGHTSTONE_BLOCK_OVERWORLD);
    public static final RegistryObject<Block> LIGHTSTONE_BLOCK_DEEPSLATE = BLOCKS.register("lightstone_block_deepslate", () -> new Block(Registration.LIGHTSTONE_PROPERTIES));
    public static final RegistryObject<Item> LIGHTSTONE_BLOCK_DEEPSLATE_ITEM = fromBlock(LIGHTSTONE_BLOCK_DEEPSLATE);

    public static final RegistryObject<Block> LIGHTSTONE_WOOD_LAMP = BLOCKS.register("lightstone_wood_lamp", () -> new Block(Registration.LIGHTSTONE_LAMP_PROPERTIES));
    public static final RegistryObject<Item> LIGHTSTONE_WOOD_LAMP_ITEM = fromBlock(LIGHTSTONE_WOOD_LAMP);
    public static final RegistryObject<Block> LIGHTSTONE_STONE_LAMP = BLOCKS.register("lightstone_stone_lamp", () -> new Block(Registration.LIGHTSTONE_LAMP_PROPERTIES));
    public static final RegistryObject<Item> LIGHTSTONE_STONE_LAMP_ITEM = fromBlock(LIGHTSTONE_STONE_LAMP);
    public static final RegistryObject<Block> LIGHTSTONE_REFINED_WOOD_LAMP = BLOCKS.register("lightstone_refined_wood_lamp", () -> new Block(Registration.LIGHTSTONE_LAMP_PROPERTIES));
    public static final RegistryObject<Item> LIGHTSTONE_REFINED_WOOD_LAMP_ITEM = fromBlock(LIGHTSTONE_REFINED_WOOD_LAMP);
    public static final RegistryObject<Block> LIGHTSTONE_REFINED_STONE_LAMP = BLOCKS.register("lightstone_refined_stone_lamp", () -> new Block(Registration.LIGHTSTONE_LAMP_PROPERTIES));
    public static final RegistryObject<Item> LIGHTSTONE_REFINED_STONE_LAMP_ITEM = fromBlock(LIGHTSTONE_REFINED_STONE_LAMP);

    public static final RegistryObject<Block> LIGHTSTONE_TORCH = BLOCKS.register("lightstone_torch", () -> new TorchBlock(BlockBehaviour.Properties.of(Material.DECORATION)
            .noCollission().noOcclusion().instabreak().lightLevel((p_50886_) -> {return 10;})
            .sound(SoundType.GLASS), ParticleTypes.FLAME));
    public static final RegistryObject<Block> WALL_LIGHTSTONE_TORCH = BLOCKS.register ("wall_lightstone_torch", () -> new WallTorchBlock((BlockBehaviour.Properties.of(Material.DECORATION)
            .noCollission().instabreak().lightLevel((p_152607_) -> {return 10;})
            .sound(SoundType.GLASS).dropsLike(Registration.LIGHTSTONE_TORCH.get())), ParticleTypes.FLAME));
    public static final RegistryObject<StandingAndWallBlockItem> LIGHTSTONE_TORCH_ITEM = ITEMS.register("lightstone_torch", () ->
            new StandingAndWallBlockItem(Registration.LIGHTSTONE_TORCH.get(), Registration.WALL_LIGHTSTONE_TORCH.get(),
                    new Item.Properties().tab(ITEM_GROUP)));


    public static final RegistryObject<Block> LIGHTSTONE_REFINED_TORCH = BLOCKS.register("lightstone_refined_torch", () -> new TorchBlock(BlockBehaviour.Properties.of(Material.DECORATION)
            .noCollission().noOcclusion().instabreak().lightLevel((p_50886_) -> {return 15;})
            .sound(SoundType.GLASS), ParticleTypes.ELECTRIC_SPARK));
    public static final RegistryObject<Block> WALL_LIGHTSTONE_REFINED_TORCH = BLOCKS.register ("wall_lightstone_refined_torch", () -> new WallTorchBlock((BlockBehaviour.Properties.of(Material.DECORATION)
            .noCollission().instabreak().lightLevel((p_152607_) -> {return 15;})
            .sound(SoundType.GLASS).dropsLike(Registration.LIGHTSTONE_REFINED_TORCH.get())), ParticleTypes.FLAME));
    public static final RegistryObject<StandingAndWallBlockItem> LIGHTSTONE_REFINED_TORCH_ITEM = ITEMS.register("lightstone_refined_torch", () ->
            new StandingAndWallBlockItem(Registration.LIGHTSTONE_REFINED_TORCH.get(), Registration.WALL_LIGHTSTONE_REFINED_TORCH.get(),
                    new Item.Properties().tab(ITEM_GROUP)));


    public static final RegistryObject<ProtoGenBlock> PROTOGEN = BLOCKS.register("protogen", ProtoGenBlock::new);
    public static final RegistryObject<Item> PROTOGEN_ITEM = fromBlock(PROTOGEN);
    public static final RegistryObject<BlockEntityType<ProtoGenBE>> PROTOGEN_BE = BLOCK_ENTITIES.register("protogen", () -> BlockEntityType.Builder.of(ProtoGenBE::new, PROTOGEN.get()).build(null));
    public static final RegistryObject<MenuType<ProtoGenContainer>> PROTOGEN_CONTAINER = CONTAINERS.register("",
            () -> IForgeMenuType.create((windowId, inv, data) -> new ProtoGenContainer(windowId, data.readBlockPos(), inv, inv.player)));

    public static final RegistryObject<FoundryBlock> FOUNDRY = BLOCKS.register("foundry", FoundryBlock::new);
    public static final RegistryObject<Item> FOUNDRY_ITEM = fromBlock(FOUNDRY);
    public static final RegistryObject<BlockEntityType<FoundryBE>> FOUNDRY_BE = BLOCK_ENTITIES.register("foundry", () -> BlockEntityType.Builder.of(FoundryBE::new, FOUNDRY.get()).build(null));
    //public static final RegistryObject<MenuType<ProtoGenContainer>> FOUNDRY_CONTAINER = CONTAINERS.register("",
    //        () -> IForgeMenuType.create((windowId, inv, data) -> new ProtoGenContainer(windowId, data.readBlockPos(), inv, inv.player)));


    public static final RegistryObject<Item> PROTODERMIS_RAW = ITEMS.register("raw_protodermis", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> PROTODERMIS_INGOT = ITEMS.register("protodermis_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> PROTODERMIS_NUGGET = ITEMS.register("protodermis_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Block> PROTODERMIS_BLOCK = BLOCKS.register("protodermis_block", () -> new Block(METAL_PROPERTIES));
    public static final RegistryObject<Item> PROTODERMIS_BLOCK_ITEM = fromBlock(PROTODERMIS_BLOCK);

    public static final RegistryObject<Item> LIGHTSTONE = ITEMS.register("lightstone", () -> new Item(ITEM_PROPERTIES));

    public static final RegistryObject<Item> FIRE_STAFF = ITEMS.register("fire_staff", () -> new FireStaffItem(new Item.Properties()
            .tab(ITEM_GROUP)
            .stacksTo(1)
            .durability(32)));

    public static final RegistryObject<Item> MASK_HAU = ITEMS.register("mask_hau", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> MASK_MIRU = ITEMS.register("mask_miru", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> MASK_KAUKAU = ITEMS.register("mask_kaukau", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> MASK_PAKARI = ITEMS.register("mask_pakari", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> MASK_AKAKU = ITEMS.register("mask_akaku", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> MASK_KAKAMA = ITEMS.register("mask_kakama", () -> new Item(ITEM_PROPERTIES));


    public static final Tags.IOptionalNamedTag<Block> PROTODERMIS_ORE = BlockTags.createOptional(new ResourceLocation(KanohiCraft.MODID, "protodermis_ore"));
    public static final Tags.IOptionalNamedTag<Item> PROTODERMIS_ORE_ITEM = ItemTags.createOptional(new ResourceLocation(KanohiCraft.MODID, "protodermis_ore"));
    public static final Tags.IOptionalNamedTag<Item> KANOHI = ItemTags.createOptional(new ResourceLocation(KanohiCraft.MODID,"kanohi"));
    public static final Tags.IOptionalNamedTag<Item> KANOKA = ItemTags.createOptional(new ResourceLocation(KanohiCraft.MODID,"kanoka"));
    public static final Tags.IOptionalNamedTag<Item> LIGHTSTONE_ITEMS = ItemTags.createOptional(new ResourceLocation(KanohiCraft.MODID,"lightstone_item"));
    public static final Tags.IOptionalNamedTag<Block> LIGHTSTONE_BLOCKS = BlockTags.createOptional(new ResourceLocation(KanohiCraft.MODID,"lightstone_block"));
    public static final Tags.IOptionalNamedTag<Item> FIRE_STAFF_ITEMS = ItemTags.createOptional(new ResourceLocation(KanohiCraft.MODID,"fire_staff_items"));


    // Conveniance function: Take a RegistryObject<Block> and make a corresponding RegistryObject<Item> from it
    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
