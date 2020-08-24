package com.nullharp.steampunk.util;

import com.nullharp.steampunk.SoundList;
import com.nullharp.steampunk.Steampunk;
import com.nullharp.steampunk.armor.*;
import com.nullharp.steampunk.blocks.BlockItemBase;
import com.nullharp.steampunk.blocks.CopperOreBlock;
import com.nullharp.steampunk.blocks.CreativePowercellBlock;
import com.nullharp.steampunk.blocks.TitaniumOreBlock;
import com.nullharp.steampunk.items.*;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Steampunk.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Steampunk.MOD_ID);


    public static void init() {

        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
        // Basic Items
        public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", ItemBase::new);
        public static final RegistryObject<Item> RAW_STEEL_INGOT = ITEMS.register("raw_steel_ingot", ItemBase::new);
        public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", ItemBase::new);

        public static final RegistryObject<Item> RAW_TITANIUM_INGOT = ITEMS.register("raw_titanium_ingot", RawTitaniumIngot::new);
        public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", ItemBase::new);
        public static final RegistryObject<Item> TITANIUM_STEEL_INGOT = ITEMS.register("titanium_steel_ingot", TitaniumSteelIngot::new);

        // Advanced Items
            // Debug and Testing Items
            public static final RegistryObject<Item> TEST_TOOLTIPS = ITEMS.register("test_tooltips", TestTooltips::new);

            // Music Disk Items
            public static final RegistryObject<Item> STICKBUG_DISK = ITEMS.register("stickbug_disk", () -> new StickBugDisk(1, SoundList.MUSIC_DISK_STICKBUG_LAZY.get(), new Item.Properties().maxStackSize(1).group(Steampunk.MAIN)));

            // Forge Energy Items
            public static final RegistryObject<Item> POWER_CORE_OFF = ITEMS.register("power_core_off", PowerCore::new);
            public static final RegistryObject<Item> POWER_CORE_ON = ITEMS.register("power_core_on", PowerCore::new);

        // Armor
            // Copper
            public static final RegistryObject<ArmorItem> COPPER_HELMET = ITEMS.register("copper_helmet", CopperHelmet::new);
            public static final RegistryObject<ArmorItem> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", CopperChestplate::new);
            public static final RegistryObject<ArmorItem> COPPER_LEGGINGS = ITEMS.register("copper_leggings", CopperLeggings::new);
            public static final RegistryObject<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots", CopperBoots::new);

            // Reinforced Copper
            public static final RegistryObject<ArmorItem> REINFORCED_HELMET = ITEMS.register("reinforced_helmet", () -> new ReinforcedArmor(Copper.COPPER, EquipmentSlotType.HEAD, new Item.Properties().group(Steampunk.MAIN)));
            public static final RegistryObject<ArmorItem> REINFORCED_CHESTPLATE = ITEMS.register("reinforced_chestplate", () -> new ReinforcedArmor(Copper.COPPER, EquipmentSlotType.CHEST, new Item.Properties().group(Steampunk.MAIN)));
            public static final RegistryObject<ArmorItem> REINFORCED_LEGGINGS = ITEMS.register("reinforced_leggings", () -> new ReinforcedArmor(Copper.COPPER, EquipmentSlotType.LEGS, new Item.Properties().group(Steampunk.MAIN)));
            public static final RegistryObject<ArmorItem> REINFORCED_BOOTS = ITEMS.register("reinforced_boots", () -> new ReinforcedArmor(Copper.COPPER, EquipmentSlotType.FEET, new Item.Properties().group(Steampunk.MAIN)));

        // Titanium Infused Steel
        public static final RegistryObject<ArmorItem> TITANIUM_HELMET = ITEMS.register("titanium_helmet", () -> new TitaniumArmor(Copper.COPPER, EquipmentSlotType.HEAD, new Item.Properties().group(Steampunk.MAIN)));
        public static final RegistryObject<ArmorItem> TITANIUM_CHESPLATE = ITEMS.register("titanium_chestplate", () -> new TitaniumArmor(Copper.COPPER, EquipmentSlotType.CHEST, new Item.Properties().group(Steampunk.MAIN)));
        public static final RegistryObject<ArmorItem> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings", () -> new TitaniumArmor(Copper.COPPER, EquipmentSlotType.LEGS, new Item.Properties().group(Steampunk.MAIN)));
        public static final RegistryObject<ArmorItem> TITANIUM_BOOTS = ITEMS.register("titanium_boots", () -> new TitaniumArmor(Copper.COPPER, EquipmentSlotType.FEET, new Item.Properties().group(Steampunk.MAIN)));




    // Blocks
    public static final RegistryObject<Block> COPPER_ORE_BLOCK = BLOCKS.register("copper_ore_block", CopperOreBlock::new);
    public static final RegistryObject<Block> TITANIUM_ORE_BLOCK = BLOCKS.register("titanium_ore_block", TitaniumOreBlock::new);
    public static final RegistryObject<Block> CREATIVE_POWERCELL_BLOCK = BLOCKS.register("creative_powercell_block", CreativePowercellBlock::new);

    // Block Items
    public static final RegistryObject<Item> COPPER_ORE_BLOCK_ITEM = ITEMS.register("copper_ore_block", () -> new BlockItemBase(COPPER_ORE_BLOCK.get()));
    public static final RegistryObject<Item> TITANIUM_ORE_BLOCK_ITEM = ITEMS.register("titanium_ore_block", () -> new BlockItemBase(TITANIUM_ORE_BLOCK.get()));
    public static final RegistryObject<Item> CREATIVE_POWERCELL_BLOCK_ITEM = ITEMS.register("creative_powercell_block", () -> new BlockItemBase(CREATIVE_POWERCELL_BLOCK.get()));

}
