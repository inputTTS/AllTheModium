package com.thevortex.allthemodium;


import com.thevortex.allthemodium.registry.*;
import com.thevortex.allthemodium.registry.mek_reg.ATMSlurries;
import com.thevortex.allthemodium.worldgen.structures.ATMStructures;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;

import com.thevortex.allthemodium.reference.Reference;

import static com.thevortex.allthemodium.reference.Reference.MOD_ID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.thevortex.allthemodium.events.BlockBreak;

import java.util.Set;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Reference.MOD_ID)
public class AllTheModium
{

	public static final ResourceKey<Level> OverWorld = Level.OVERWORLD;
	public static final ResourceKey<Level> Nether = Level.NETHER;
	public static final ResourceKey<Level> The_End = Level.END;
	public static final ResourceLocation MINING_DIM_ID = ResourceLocation.fromNamespaceAndPath(MOD_ID,"mining");
	//public static final ResourceLocation THE_OTHER_DIM_ID = ResourceLocation.fromNamespaceAndPath(MOD_ID,"the_other");

	public static final ResourceLocation THE_BEYOND_DIM_ID = ResourceLocation.fromNamespaceAndPath(MOD_ID,"the_beyond");

	public static final ResourceKey<DimensionType> Mining_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE, MINING_DIM_ID);
	//public static final ResourceKey<DimensionType> THE_OTHER_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE, THE_OTHER_DIM_ID);
	public static final ResourceKey<DimensionType> THE_BEYOND = ResourceKey.create(Registries.DIMENSION_TYPE,THE_BEYOND_DIM_ID);

	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
	public static boolean ALLOW_TELEPORT_MINING = false;


    public AllTheModium(IEventBus modEventBus, ModContainer modContainer) {
        // Register the setup method for modloading
		modEventBus.register(ModRegistry.class);

		FluidTypeRegistry.FLUID_TYPES.register(modEventBus);
    	FluidRegistry.FLUIDS.register(modEventBus);
		
       	ModRegistry.BLOCKS.register(modEventBus);
		BlockRegistry.BLOCKS.register(modEventBus);
		ModRegistry.SHAPED_BLOCKS.register(modEventBus);
		ModRegistry.STAIRBLOCKS.register(modEventBus);
		ModRegistry.SLABBLOCKS.register(modEventBus);
		ModRegistry.WALLBLOCKS.register(modEventBus);
		ModRegistry.PILLARBLOCKS.register(modEventBus);

		ModRegistry.ITEMS.register(modEventBus);
		ItemRegistry.ITEMS.register(modEventBus);
    	
		ArmorRegistries.ARMOR_MATERIALS.register(modEventBus);
		
    	ModRegistry.ENTITIES.register(modEventBus);
    	ModRegistry.ENTITY.register(modEventBus);

    	ModRegistry.CARVERS.register(modEventBus);
		ModRegistry.BIOMES.register(modEventBus);
    	//ATMCraftingSetup.REGISTRY.register(modEventBus);
		ATMStructures.STRUCTURES.register(modEventBus);
		ModRegistry.FEATURES.register(modEventBus);
		ModRegistry.CREATIVE_TABS.register(modEventBus);
		

		if(ModList.get().isLoaded("mekanism")) {

			ATMSlurries.SLURRIES.register(modEventBus);
		}

		//MinecraftForge.EVENT_BUS.addListener(EventPriority.NORMAL, APStructure::setupStructureSpawns);
		//MinecraftForge.EVENT_BUS.addListener(EventPriority.NORMAL, DungeonStructure::setupStructureSpawns);
		//MinecraftForge.EVENT_BUS.addListener(EventPriority.NORMAL, PVStructure::setupStructureSpawns);
        // Register ourselves for server and other game events we are interested in
        NeoForge.EVENT_BUS.register(BlockBreak.class);
		setupLogFilter();
	}


	private static void setupLogFilter() {
		var rootLogger = LogManager.getRootLogger();
		if (rootLogger instanceof org.apache.logging.log4j.core.Logger logger) {
			logger.addFilter(new MsgFilter());
		} else {
			LOGGER.error("Registration failed with unexpected class: {}", rootLogger.getClass());
		}
	}



}
