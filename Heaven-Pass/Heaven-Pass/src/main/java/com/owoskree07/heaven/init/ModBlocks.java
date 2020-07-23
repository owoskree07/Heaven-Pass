package com.owoskree07.heaven.init;

import com.owoskree07.heaven.ExampleMod;
import com.owoskree07.heaven.blocks.CloudOreBlock;
import com.owoskree07.heaven.blocks.FragmentedSunBlock;
import com.owoskree07.heaven.blocks.SunOreBlock;
import com.owoskree07.heaven.blocks.SunburstBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MOD_ID);

    // Blocks
    public static final RegistryObject<Block> SUNBURST_BLOCK = BLOCKS.register("sunburst_block", SunburstBlock::new);
    public static final RegistryObject<Block> SUN_ORE_BLOCK = BLOCKS.register("sun_ore_block", SunOreBlock::new);
    public static final RegistryObject<Block> FRAGMENTED_SUN_BLOCK = BLOCKS.register("fragmented_sun_block", FragmentedSunBlock::new);
    public static final RegistryObject<Block> ClOUD_ORE_BLOCK = BLOCKS.register("cloud_ore_block", CloudOreBlock::new);

}

