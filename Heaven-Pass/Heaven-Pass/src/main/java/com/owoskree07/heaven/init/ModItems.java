package com.owoskree07.heaven.init;

import com.owoskree07.heaven.ExampleMod;
import com.owoskree07.heaven.blocks.BlockItemBase;
import com.owoskree07.heaven.items.ItemBase;
import com.owoskree07.heaven.util.enums.ModArmorMaterial;
import com.owoskree07.heaven.util.enums.ModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

    // Items
    public static final RegistryObject<Item> SUN_DROPLET = ITEMS.register("sun_droplet", ItemBase::new);

    public static final RegistryObject<Item> SUNBURST_INGOT = ITEMS.register("sunburst_ingot", ItemBase::new);

    public static final RegistryObject<Item> CLOUD_INGOT = ITEMS.register("cloud_ingot", ItemBase::new);


    // Tools
    public static final RegistryObject<SwordItem> SUN_SWORD = ITEMS.register("sun_sword",
            () -> new SwordItem(ModItemTier.SUN, 6, -2.4F, new Item.Properties().group(ExampleMod.TAB)));

    public static final RegistryObject<PickaxeItem> SUN_PICKAXE = ITEMS.register("sun_pickaxe",
            () -> new PickaxeItem(ModItemTier.SUN, 1, -2.4F, new Item.Properties().group(ExampleMod.TAB)));

    public static final RegistryObject<AxeItem> SUN_AXE = ITEMS.register("sun_axe",
            () -> new AxeItem(ModItemTier.SUN, 2, -2.4F, new Item.Properties().group(ExampleMod.TAB)));

    public static final RegistryObject<ShovelItem> SUN_SHOVEL = ITEMS.register("sun_shovel",
            () -> new ShovelItem(ModItemTier.SUN, 0, -2.4F, new Item.Properties().group(ExampleMod.TAB)));

    public static final RegistryObject<HoeItem> SUN_HOE = ITEMS.register("sun_hoe",
            () -> new HoeItem(ModItemTier.SUN, -3,-1, new Item.Properties().group(ExampleMod.TAB)));

    public static final RegistryObject<SwordItem> CLOUD_SWORD = ITEMS.register("cloud_sword",
            () -> new SwordItem(ModItemTier.CLOUD, 3, -2.4F, new Item.Properties().group(ExampleMod.TAB)));

    public static final RegistryObject<PickaxeItem> CLOUD_PICKAXE = ITEMS.register("cloud_pickaxe",
            () -> new PickaxeItem(ModItemTier.CLOUD, 1, -2.4F, new Item.Properties().group(ExampleMod.TAB)));

    public static final RegistryObject<AxeItem> CLOUD_AXE = ITEMS.register("cloud_axe",
            () -> new AxeItem(ModItemTier.CLOUD, 2, -2.4F, new Item.Properties().group(ExampleMod.TAB)));

    public static final RegistryObject<ShovelItem> CLOUD_SHOVEL = ITEMS.register("cloud_shovel",
            () -> new ShovelItem(ModItemTier.CLOUD, 0, -2.4F, new Item.Properties().group(ExampleMod.TAB)));

    public static final RegistryObject<HoeItem> CLOUD_HOE = ITEMS.register("cloud_hoe",
            () -> new HoeItem(ModItemTier.CLOUD, -3,-1, new Item.Properties().group(ExampleMod.TAB)));


    // Armor
    public static final RegistryObject<ArmorItem> SUN_HELMET = ITEMS.register("sun_helmet",
            () -> new ArmorItem(ModArmorMaterial.SUN, EquipmentSlotType.HEAD, new Item.Properties().group(ExampleMod.TAB)));

    public static final RegistryObject<ArmorItem> SUN_CHESTPLATE = ITEMS.register("sun_chestplate",
            () -> new ArmorItem(ModArmorMaterial.SUN, EquipmentSlotType.CHEST, new Item.Properties().group(ExampleMod.TAB)));

    public static final RegistryObject<ArmorItem> SUN_LEGGINGS = ITEMS.register("sun_leggings",
            () -> new ArmorItem(ModArmorMaterial.SUN, EquipmentSlotType.LEGS, new Item.Properties().group(ExampleMod.TAB)));

    public static final RegistryObject<ArmorItem> SUN_BOOTS = ITEMS.register("sun_boots",
            () -> new ArmorItem(ModArmorMaterial.SUN, EquipmentSlotType.FEET, new Item.Properties().group(ExampleMod.TAB)));

    public static final RegistryObject<ArmorItem> CLOUD_HELMET = ITEMS.register("cloud_helmet",
            () -> new ArmorItem(ModArmorMaterial.CLOUD, EquipmentSlotType.HEAD, new Item.Properties().group(ExampleMod.TAB)));

    public static final RegistryObject<ArmorItem> CLOUD_CHESTPLATE = ITEMS.register("cloud_chestplate",
            () -> new ArmorItem(ModArmorMaterial.CLOUD, EquipmentSlotType.CHEST, new Item.Properties().group(ExampleMod.TAB)));

    public static final RegistryObject<ArmorItem> CLOUD_LEGGINGS = ITEMS.register("cloud_leggings",
            () -> new ArmorItem(ModArmorMaterial.CLOUD, EquipmentSlotType.LEGS, new Item.Properties().group(ExampleMod.TAB)));

    public static final RegistryObject<ArmorItem> CLOUD_BOOTS = ITEMS.register("cloud_boots",
            () -> new ArmorItem(ModArmorMaterial.CLOUD, EquipmentSlotType.FEET, new Item.Properties().group(ExampleMod.TAB)));


    // Block Items
    public static final RegistryObject<Item> SUNBURST_BLOCK_ITEM = ITEMS.register("sunburst_block",
            () -> new BlockItemBase(ModBlocks.SUNBURST_BLOCK.get()));

    public static final RegistryObject<Item> SUN_ORE_BLOCK_ITEM = ITEMS.register("sun_ore_block",
            () -> new BlockItemBase(ModBlocks.SUN_ORE_BLOCK.get()));

    public static final RegistryObject<Item> FRAGMENTED_SUN_BLOCK_ITEM = ITEMS.register("fragmented_sun_block",
            () -> new BlockItemBase(ModBlocks.FRAGMENTED_SUN_BLOCK.get()));

    public static final RegistryObject<Item> ClOUD_ORE_BLOCK_ITEM = ITEMS.register("cloud_ore_block",
            () -> new BlockItemBase(ModBlocks.ClOUD_ORE_BLOCK.get()));
}
