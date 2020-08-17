package com.nullharp.steampunk.util;

import com.nullharp.steampunk.Steampunk;
import com.nullharp.steampunk.armor.Copper;
import com.nullharp.steampunk.armor.TitaniumSteel;
import com.nullharp.steampunk.blocks.BlockItemBase;
import com.nullharp.steampunk.blocks.CopperOreBlock;
import com.nullharp.steampunk.blocks.CreativePowercellBlock;
import com.nullharp.steampunk.blocks.TitaniumOreBlock;
import com.nullharp.steampunk.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
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

    // Items only
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", ItemBase::new);
    public static final RegistryObject<Item> RAW_STEEL_INGOT = ITEMS.register("raw_steel_ingot", ItemBase::new);
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", ItemBase::new);
    public static final RegistryObject<Item> RAW_TITANIUM_INGOT = ITEMS.register("raw_titanium_ingot", ItemBase::new);
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", ItemBase::new);
    public static final RegistryObject<Item> TITANIUM_STEEL_INGOT = ITEMS.register("titanium_steel_ingot", ItemBase::new);

    // Forge Energey Items

    public static final RegistryObject<Item> POWER_CORE_OFF = ITEMS.register("power_core_off", ItemBase::new);
    public static final RegistryObject<Item> POWER_CORE_ON = ITEMS.register("power_core_on", ItemBase::new);

    // Armor
        // Copper
        public static final RegistryObject<ArmorItem> COPPER_HELMET = ITEMS.register("copper_helmet", () ->
                new CopperHelmet());
        public static final RegistryObject<ArmorItem> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () ->
                new CopperChestplate());
        public static final RegistryObject<ArmorItem> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () ->
                new CopperLeggings());
        public static final RegistryObject<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots", () ->
                new CopperBoots());

        // Titanium Infused Steel
        public static final RegistryObject<ArmorItem> TITANIUM_STEEL_HELMET = ITEMS.register("titanium_steel_helmet", () ->
                new ArmorItem(TitaniumSteel.TITANIUM_STEEL, EquipmentSlotType.HEAD, new Item.Properties().group(Steampunk.TAB)));
        public static final RegistryObject<ArmorItem> TITANIUM_STEEL_CHESTPLATE = ITEMS.register("titanium_steel_chestplate", () ->
            new ArmorItem(TitaniumSteel.TITANIUM_STEEL, EquipmentSlotType.CHEST, new Item.Properties().group(Steampunk.TAB)));
        public static final RegistryObject<ArmorItem> TITANIUM_STEEL_LEGGINGS = ITEMS.register("titanium_steel_leggings", () ->
            new ArmorItem(TitaniumSteel.TITANIUM_STEEL, EquipmentSlotType.LEGS, new Item.Properties().group(Steampunk.TAB)));
        public static final RegistryObject<ArmorItem> TITANIUM_STEEL_BOOTS = ITEMS.register("titanium_steel_boots", () ->
            new ArmorItem(TitaniumSteel.TITANIUM_STEEL, EquipmentSlotType.FEET, new Item.Properties().group(Steampunk.TAB)));




    // Blocks only
    public static final RegistryObject<Block> COPPER_ORE_BLOCK = BLOCKS.register("copper_ore_block", CopperOreBlock::new);
    public static final RegistryObject<Block> TITANIUM_ORE_BLOCK = BLOCKS.register("titanium_ore_block", TitaniumOreBlock::new);
    public static final RegistryObject<Block> CREATIVE_POWERCELL_BLOCK = BLOCKS.register("creative_powercell_block", CreativePowercellBlock::new);

    // Block Items
    public static final RegistryObject<Item> COPPER_ORE_BLOCK_ITEM = ITEMS.register("copper_ore_block", () -> new BlockItemBase(COPPER_ORE_BLOCK.get()));
    public static final RegistryObject<Item> TITANIUM_ORE_BLOCK_ITEM = ITEMS.register("titanium_ore_block", () -> new BlockItemBase(TITANIUM_ORE_BLOCK.get()));
    public static final RegistryObject<Item> CREATIVE_POWERCELL_BLOCK_ITEM = ITEMS.register("creative_powercell_block", () -> new BlockItemBase(CREATIVE_POWERCELL_BLOCK.get()));

}
