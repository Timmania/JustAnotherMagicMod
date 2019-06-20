package com.timmania.jamm.init;

import com.timmania.jamm.world.gen.JammWorldGen;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModGen {
    public static void registerWorldGenerators() {
        GameRegistry.registerWorldGenerator(new JammWorldGen(), 0);
    }
}
