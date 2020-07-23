package com.owoskree07.heaven.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class FragmentedSunBlock extends Block {

    public FragmentedSunBlock() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(5.0f,6.0f)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.METAL)
                .setRequiresTool());
    }
}
