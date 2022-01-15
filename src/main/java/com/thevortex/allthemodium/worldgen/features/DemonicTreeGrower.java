package com.thevortex.allthemodium.worldgen.features;

import com.thevortex.allthemodium.worldgen.ATMConfiguredFeature;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class DemonicTreeGrower extends AbstractTreeGrower {

    @Nullable
    @Override
    protected ConfiguredFeature<?, ?> getConfiguredFeature(Random random, boolean bool) {
        int temp = random.nextInt(10);
        if(temp == 1) { return ATMConfiguredFeature.DEMONIC_TREE_GIANT; }
        if(temp > 6) { return ATMConfiguredFeature.DEMONIC_TREE; }
        return ATMConfiguredFeature.DEMONIC_TREE_MEDIUM;
    }
}
