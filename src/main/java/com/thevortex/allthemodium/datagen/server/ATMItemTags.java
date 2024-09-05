package com.thevortex.allthemodium.datagen.server;


import com.thevortex.allthemodium.reference.Reference;
import com.thevortex.allthemodium.registry.TagRegistry;
import com.thevortex.allthemodium.registry.ModRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

import org.checkerframework.checker.units.qual.t;

public class ATMItemTags extends ItemTagsProvider {


    public ATMItemTags(PackOutput packOutPut, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagsProvider.TagLookup<Block>> tagLookup, ExistingFileHelper existingFileHelper) {
        super(packOutPut, lookupProvider,tagLookup, Reference.MOD_ID, existingFileHelper);
    }


    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.ARMOR_ENCHANTABLE).add(ModRegistry.ALLTHEMODIUM_HELMET.get());
        tag(ItemTags.ARMOR_ENCHANTABLE).add(ModRegistry.ALLTHEMODIUM_CHESTPLATE.get());
        tag(ItemTags.ARMOR_ENCHANTABLE).add(ModRegistry.ALLTHEMODIUM_LEGGINGS.get());
        tag(ItemTags.ARMOR_ENCHANTABLE).add(ModRegistry.ALLTHEMODIUM_BOOTS.get());

        tag(ItemTags.ARMOR_ENCHANTABLE).add(ModRegistry.VIBRANIUM_HELMET.get());
        tag(ItemTags.ARMOR_ENCHANTABLE).add(ModRegistry.VIBRANIUM_CHESTPLATE.get());
        tag(ItemTags.ARMOR_ENCHANTABLE).add(ModRegistry.VIBRANIUM_LEGGINGS.get());
        tag(ItemTags.ARMOR_ENCHANTABLE).add(ModRegistry.VIBRANIUM_BOOTS.get());

        tag(ItemTags.ARMOR_ENCHANTABLE).add(ModRegistry.UNOBTAINIUM_HELMET.get());
        tag(ItemTags.ARMOR_ENCHANTABLE).add(ModRegistry.UNOBTAINIUM_CHESTPLATE.get());
        tag(ItemTags.ARMOR_ENCHANTABLE).add(ModRegistry.UNOBTAINIUM_LEGGINGS.get());
        tag(ItemTags.ARMOR_ENCHANTABLE).add(ModRegistry.UNOBTAINIUM_BOOTS.get());

        tag(ItemTags.TRIMMABLE_ARMOR).add(ModRegistry.ALLTHEMODIUM_HELMET.get());
        tag(ItemTags.TRIMMABLE_ARMOR).add(ModRegistry.ALLTHEMODIUM_CHESTPLATE.get());
        tag(ItemTags.TRIMMABLE_ARMOR).add(ModRegistry.ALLTHEMODIUM_LEGGINGS.get());
        tag(ItemTags.TRIMMABLE_ARMOR).add(ModRegistry.ALLTHEMODIUM_BOOTS.get());

        tag(ItemTags.TRIMMABLE_ARMOR).add(ModRegistry.VIBRANIUM_HELMET.get());
        tag(ItemTags.TRIMMABLE_ARMOR).add(ModRegistry.VIBRANIUM_CHESTPLATE.get());
        tag(ItemTags.TRIMMABLE_ARMOR).add(ModRegistry.VIBRANIUM_LEGGINGS.get());
        tag(ItemTags.TRIMMABLE_ARMOR).add(ModRegistry.VIBRANIUM_BOOTS.get());

        tag(ItemTags.TRIMMABLE_ARMOR).add(ModRegistry.UNOBTAINIUM_HELMET.get());
        tag(ItemTags.TRIMMABLE_ARMOR).add(ModRegistry.UNOBTAINIUM_CHESTPLATE.get());
        tag(ItemTags.TRIMMABLE_ARMOR).add(ModRegistry.UNOBTAINIUM_LEGGINGS.get());
        tag(ItemTags.TRIMMABLE_ARMOR).add(ModRegistry.UNOBTAINIUM_BOOTS.get());

        tag(ItemTags.TRIM_MATERIALS).add(ModRegistry.ALLTHEMODIUM_INGOT.get());
        tag(ItemTags.TRIM_MATERIALS).add(ModRegistry.VIBRANIUM_INGOT.get());
        tag(ItemTags.TRIM_MATERIALS).add(ModRegistry.UNOBTAINIUM_INGOT.get());


        tag(net.minecraft.tags.ItemTags.HEAD_ARMOR).add(ModRegistry.ALLTHEMODIUM_HELMET.get());
        tag(net.minecraft.tags.ItemTags.CHEST_ARMOR).add(ModRegistry.ALLTHEMODIUM_CHESTPLATE.get());
        tag(net.minecraft.tags.ItemTags.LEG_ARMOR).add(ModRegistry.ALLTHEMODIUM_LEGGINGS.get());
        tag(net.minecraft.tags.ItemTags.FOOT_ARMOR).add(ModRegistry.ALLTHEMODIUM_BOOTS.get());

        tag(net.minecraft.tags.ItemTags.HEAD_ARMOR_ENCHANTABLE).add(ModRegistry.ALLTHEMODIUM_HELMET.get());
        tag(net.minecraft.tags.ItemTags.CHEST_ARMOR_ENCHANTABLE).add(ModRegistry.ALLTHEMODIUM_CHESTPLATE.get());
        tag(net.minecraft.tags.ItemTags.LEG_ARMOR_ENCHANTABLE).add(ModRegistry.ALLTHEMODIUM_LEGGINGS.get());
        tag(net.minecraft.tags.ItemTags.FOOT_ARMOR_ENCHANTABLE).add(ModRegistry.ALLTHEMODIUM_BOOTS.get());

        tag(ItemTags.EQUIPPABLE_ENCHANTABLE).add(ModRegistry.ALLTHEMODIUM_HELMET.get());
        tag(ItemTags.EQUIPPABLE_ENCHANTABLE).add(ModRegistry.ALLTHEMODIUM_CHESTPLATE.get());
        tag(ItemTags.EQUIPPABLE_ENCHANTABLE).add(ModRegistry.ALLTHEMODIUM_LEGGINGS.get());
        tag(ItemTags.EQUIPPABLE_ENCHANTABLE).add(ModRegistry.ALLTHEMODIUM_BOOTS.get());
        
        tag(net.minecraft.tags.ItemTags.HEAD_ARMOR).add(ModRegistry.VIBRANIUM_HELMET.get());
        tag(net.minecraft.tags.ItemTags.CHEST_ARMOR).add(ModRegistry.VIBRANIUM_CHESTPLATE.get());
        tag(net.minecraft.tags.ItemTags.LEG_ARMOR).add(ModRegistry.VIBRANIUM_LEGGINGS.get());
        tag(net.minecraft.tags.ItemTags.FOOT_ARMOR).add(ModRegistry.VIBRANIUM_BOOTS.get());

        tag(net.minecraft.tags.ItemTags.HEAD_ARMOR_ENCHANTABLE).add(ModRegistry.VIBRANIUM_HELMET.get());
        tag(net.minecraft.tags.ItemTags.CHEST_ARMOR_ENCHANTABLE).add(ModRegistry.VIBRANIUM_CHESTPLATE.get());
        tag(net.minecraft.tags.ItemTags.LEG_ARMOR_ENCHANTABLE).add(ModRegistry.VIBRANIUM_LEGGINGS.get());
        tag(net.minecraft.tags.ItemTags.FOOT_ARMOR_ENCHANTABLE).add(ModRegistry.VIBRANIUM_BOOTS.get());

        tag(ItemTags.EQUIPPABLE_ENCHANTABLE).add(ModRegistry.VIBRANIUM_HELMET.get());
        tag(ItemTags.EQUIPPABLE_ENCHANTABLE).add(ModRegistry.VIBRANIUM_CHESTPLATE.get());
        tag(ItemTags.EQUIPPABLE_ENCHANTABLE).add(ModRegistry.VIBRANIUM_LEGGINGS.get());
        tag(ItemTags.EQUIPPABLE_ENCHANTABLE).add(ModRegistry.VIBRANIUM_BOOTS.get());
        
        tag(net.minecraft.tags.ItemTags.HEAD_ARMOR).add(ModRegistry.UNOBTAINIUM_HELMET.get());
        tag(net.minecraft.tags.ItemTags.CHEST_ARMOR).add(ModRegistry.UNOBTAINIUM_CHESTPLATE.get());
        tag(net.minecraft.tags.ItemTags.LEG_ARMOR).add(ModRegistry.UNOBTAINIUM_LEGGINGS.get());
        tag(net.minecraft.tags.ItemTags.FOOT_ARMOR).add(ModRegistry.UNOBTAINIUM_BOOTS.get());

        tag(net.minecraft.tags.ItemTags.HEAD_ARMOR_ENCHANTABLE).add(ModRegistry.UNOBTAINIUM_HELMET.get());
        tag(net.minecraft.tags.ItemTags.CHEST_ARMOR_ENCHANTABLE).add(ModRegistry.UNOBTAINIUM_CHESTPLATE.get());
        tag(net.minecraft.tags.ItemTags.LEG_ARMOR_ENCHANTABLE).add(ModRegistry.UNOBTAINIUM_LEGGINGS.get());
        tag(net.minecraft.tags.ItemTags.FOOT_ARMOR_ENCHANTABLE).add(ModRegistry.UNOBTAINIUM_BOOTS.get());

        tag(ItemTags.EQUIPPABLE_ENCHANTABLE).add(ModRegistry.UNOBTAINIUM_HELMET.get());
        tag(ItemTags.EQUIPPABLE_ENCHANTABLE).add(ModRegistry.UNOBTAINIUM_CHESTPLATE.get());
        tag(ItemTags.EQUIPPABLE_ENCHANTABLE).add(ModRegistry.UNOBTAINIUM_LEGGINGS.get());
        tag(ItemTags.EQUIPPABLE_ENCHANTABLE).add(ModRegistry.UNOBTAINIUM_BOOTS.get());

        

        tag(ItemTags.SWORDS).add(ModRegistry.ATM_SWORD.get());
        tag(ItemTags.SWORD_ENCHANTABLE).add(ModRegistry.ATM_SWORD.get());
        tag(ItemTags.SHARP_WEAPON_ENCHANTABLE).add(ModRegistry.ATM_SWORD.get());
        tag(ItemTags.WEAPON_ENCHANTABLE).add(ModRegistry.ATM_SWORD.get());
        tag(ItemTags.FIRE_ASPECT_ENCHANTABLE).add(ModRegistry.ATM_SWORD.get());

        tag(ItemTags.AXES).add(ModRegistry.ATM_AXE.get());
        tag(ItemTags.SHARP_WEAPON_ENCHANTABLE).add(ModRegistry.ATM_AXE.get());
        tag(ItemTags.WEAPON_ENCHANTABLE).add(ModRegistry.ATM_AXE.get());

        tag(ItemTags.PICKAXES).add(ModRegistry.ATM_PICKAXE.get());
        tag(ItemTags.MINING_ENCHANTABLE).add(ModRegistry.ATM_PICKAXE.get());
        tag(ItemTags.MINING_LOOT_ENCHANTABLE).add(ModRegistry.ATM_PICKAXE.get());

        tag(ItemTags.SHOVELS).add(ModRegistry.ATM_SHOVEL.get());
        tag(ItemTags.MINING_ENCHANTABLE).add(ModRegistry.ATM_SHOVEL.get());
        tag(ItemTags.MINING_LOOT_ENCHANTABLE).add(ModRegistry.ATM_SHOVEL.get());

        tag(ItemTags.HOES).add(ModRegistry.ATM_HOE.get());

        tag(ItemTags.MACE_ENCHANTABLE).add(ModRegistry.ATM_MACE.get());
        tag(ItemTags.WEAPON_ENCHANTABLE).add(ModRegistry.ATM_MACE.get());

        tag(ItemTags.MACE_ENCHANTABLE).add(ModRegistry.VIB_MACE.get());
        tag(ItemTags.WEAPON_ENCHANTABLE).add(ModRegistry.VIB_MACE.get());

        tag(ItemTags.MACE_ENCHANTABLE).add(ModRegistry.UNO_MACE.get());
        tag(ItemTags.WEAPON_ENCHANTABLE).add(ModRegistry.UNO_MACE.get());

        
        tag(ItemTags.SWORDS).add(ModRegistry.VIB_SWORD.get());
        tag(ItemTags.SWORD_ENCHANTABLE).add(ModRegistry.VIB_SWORD.get());
        tag(ItemTags.SHARP_WEAPON_ENCHANTABLE).add(ModRegistry.VIB_SWORD.get());
        tag(ItemTags.WEAPON_ENCHANTABLE).add(ModRegistry.VIB_SWORD.get());
        tag(ItemTags.FIRE_ASPECT_ENCHANTABLE).add(ModRegistry.VIB_SWORD.get());

        tag(ItemTags.AXES).add(ModRegistry.VIB_AXE.get());
        tag(ItemTags.SHARP_WEAPON_ENCHANTABLE).add(ModRegistry.VIB_AXE.get());
        tag(ItemTags.WEAPON_ENCHANTABLE).add(ModRegistry.VIB_AXE.get());

        tag(ItemTags.PICKAXES).add(ModRegistry.VIB_PICKAXE.get());
        tag(ItemTags.MINING_ENCHANTABLE).add(ModRegistry.VIB_PICKAXE.get());
        tag(ItemTags.MINING_LOOT_ENCHANTABLE).add(ModRegistry.VIB_PICKAXE.get());

        tag(ItemTags.SHOVELS).add(ModRegistry.VIB_SHOVEL.get());
        tag(ItemTags.MINING_ENCHANTABLE).add(ModRegistry.VIB_SHOVEL.get());
        tag(ItemTags.MINING_LOOT_ENCHANTABLE).add(ModRegistry.VIB_SHOVEL.get());

        tag(ItemTags.HOES).add(ModRegistry.VIB_HOE.get());

        tag(ItemTags.SWORDS).add(ModRegistry.UNO_SWORD.get());
        tag(ItemTags.SWORD_ENCHANTABLE).add(ModRegistry.UNO_SWORD.get());
        tag(ItemTags.SHARP_WEAPON_ENCHANTABLE).add(ModRegistry.UNO_SWORD.get());
        tag(ItemTags.WEAPON_ENCHANTABLE).add(ModRegistry.UNO_SWORD.get());
        tag(ItemTags.FIRE_ASPECT_ENCHANTABLE).add(ModRegistry.UNO_SWORD.get());

        tag(ItemTags.AXES).add(ModRegistry.UNO_AXE.get());
        tag(ItemTags.SHARP_WEAPON_ENCHANTABLE).add(ModRegistry.UNO_AXE.get());
        tag(ItemTags.WEAPON_ENCHANTABLE).add(ModRegistry.UNO_AXE.get());

        tag(ItemTags.PICKAXES).add(ModRegistry.UNO_PICKAXE.get());
        tag(ItemTags.MINING_ENCHANTABLE).add(ModRegistry.UNO_PICKAXE.get());
        tag(ItemTags.MINING_LOOT_ENCHANTABLE).add(ModRegistry.UNO_PICKAXE.get());

        tag(ItemTags.SHOVELS).add(ModRegistry.UNO_SHOVEL.get());
        tag(ItemTags.MINING_ENCHANTABLE).add(ModRegistry.UNO_SHOVEL.get());
        tag(ItemTags.MINING_LOOT_ENCHANTABLE).add(ModRegistry.UNO_SHOVEL.get());

        tag(ItemTags.HOES).add(ModRegistry.UNO_HOE.get());


        tag(TagRegistry.PIGLIN_LOVED).add(ModRegistry.ALLTHEMODIUM_BOOTS.get());
        tag(TagRegistry.PIGLIN_LOVED).add(ModRegistry.ALLTHEMODIUM_LEGGINGS.get());
        tag(TagRegistry.PIGLIN_LOVED).add(ModRegistry.ALLTHEMODIUM_CHESTPLATE.get());
        tag(TagRegistry.PIGLIN_LOVED).add(ModRegistry.ALLTHEMODIUM_HELMET.get());

        tag(net.minecraft.tags.ItemTags.PLANKS).add(ModRegistry.ANCIENT_PLANKS_ITEM.get());
        tag(net.minecraft.tags.ItemTags.LOGS).add(ModRegistry.ANCIENT_LOG_0_ITEM.get());
        tag(net.minecraft.tags.ItemTags.LOGS).add(ModRegistry.ANCIENT_LOG_1_ITEM.get());
        tag(net.minecraft.tags.ItemTags.LOGS).add(ModRegistry.ANCIENT_LOG_2_ITEM.get());

        tag(net.minecraft.tags.ItemTags.PLANKS).add(ModRegistry.DEMONIC_PLANKS_ITEM.get());
        tag(net.minecraft.tags.ItemTags.LOGS).add(ModRegistry.DEMONIC_LOG_ITEM.get());

        tag(net.minecraft.tags.ItemTags.PLANKS).add(ModRegistry.SOUL_PLANKS_ITEM.get());
        tag(net.minecraft.tags.ItemTags.LOGS).add(ModRegistry.SOUL_LOG_ITEM.get());
        tag(net.minecraft.tags.ItemTags.LOGS).add(ModRegistry.SOUL_LOG_0_ITEM.get());
        tag(net.minecraft.tags.ItemTags.LOGS).add(ModRegistry.SOUL_LOG_1_ITEM.get());
        tag(net.minecraft.tags.ItemTags.LOGS).add(ModRegistry.SOUL_LOG_2_ITEM.get());



        tag(net.minecraft.tags.ItemTags.STONE_CRAFTING_MATERIALS).add(ModRegistry.ANCIENT_STONE_ITEM.get());
        tag(net.minecraft.tags.ItemTags.STONE_TOOL_MATERIALS).add(ModRegistry.ANCIENT_STONE_ITEM.get());


        tag(TagRegistry.ANCIENT_WOODEN_PLANKS_ITEM).add(ModRegistry.ANCIENT_PLANKS_ITEM.get());
        tag(TagRegistry.DEMONIC_WOODEN_PLANKS_ITEM).add(ModRegistry.DEMONIC_PLANKS_ITEM.get());
        tag(TagRegistry.SOUL_WOODEN_PLANKS_ITEM).add(ModRegistry.SOUL_PLANKS_ITEM.get());
        tag(TagRegistry.ANCIENT_STONE_ITEM).add(ModRegistry.ANCIENT_STONE_ITEM.get());
        tag(TagRegistry.ANCIENT_MOSSY_STONE_ITEM).add(ModRegistry.ANCIENT_MOSSY_STONE_ITEM.get());
        tag(TagRegistry.ANCIENT_POLISHED_STONE_ITEM).add(ModRegistry.ANCIENT_POLISHED_STONE_ITEM.get());
        tag(TagRegistry.ANCIENT_SMOOTH_STONE_ITEM).add(ModRegistry.ANCIENT_SMOOTH_STONE_ITEM.get());
        tag(TagRegistry.ANCIENT_STONE_BRICKS_ITEM).add(ModRegistry.ANCIENT_STONE_BRICKS_ITEM.get());
        tag(TagRegistry.ANCIENT_CRACKED_STONE_BRICKS_ITEM).add(ModRegistry.ANCIENT_CRACKED_STONE_BRICKS_ITEM.get());
        tag(TagRegistry.ANCIENT_CHISELED_STONE_BRICKS_ITEM).add(ModRegistry.ANCIENT_CHISELED_STONE_BRICKS_ITEM.get());

        tag(TagRegistry.RAW_ALLTHEMODIUM).add(ModRegistry.RAW_ALLTHEMODIUM.get());
        tag(TagRegistry.RAW_VIBRANIUM).add(ModRegistry.RAW_VIBRANIUM.get());
        tag(TagRegistry.RAW_UNOBTAINIUM).add(ModRegistry.RAW_UNOBTAINIUM.get());

        tag(TagRegistry.RAW_MATERIALS).add(ModRegistry.RAW_ALLTHEMODIUM.get());
        tag(TagRegistry.RAW_MATERIALS).add(ModRegistry.RAW_VIBRANIUM.get());
        tag(TagRegistry.RAW_MATERIALS).add(ModRegistry.RAW_UNOBTAINIUM.get());

        tag(TagRegistry.RAW_ALLTHEMODIUM_FORGE).add(ModRegistry.RAW_ALLTHEMODIUM.get());
        tag(TagRegistry.RAW_VIBRANIUM_FORGE).add(ModRegistry.RAW_VIBRANIUM.get());
        tag(TagRegistry.RAW_UNOBTAINIUM_FORGE).add(ModRegistry.RAW_UNOBTAINIUM.get());

        tag(TagRegistry.ALLTHEMODIUM_INGOT).add(ModRegistry.ALLTHEMODIUM_INGOT.get());
        tag(TagRegistry.VIBRANIUM_INGOT).add(ModRegistry.VIBRANIUM_INGOT.get());
        tag(TagRegistry.UNOBTAINIUM_INGOT).add(ModRegistry.UNOBTAINIUM_INGOT.get());

        tag(TagRegistry.VIBRANIUM_ALLTHEMODIUM_INGOT).add(ModRegistry.VIBRANIUM_ALLTHEMODIUM_ALLOY.get());
        tag(TagRegistry.UNOBTAINIUM_ALLTHEMODIUM_INGOT).add(ModRegistry.UNOBTAINIUM_ALLTHEMODIUM_ALLOY.get());
        tag(TagRegistry.UNOBTAINIUM_VIBRANIUM_INGOT).add(ModRegistry.UNOBTAINIUM_VIBRANIUM_ALLOY.get());

        tag(TagRegistry.VIBRANIUM_ALLTHEMODIUM_BLOCK).add(ModRegistry.VA_ALLOY_ITEM.get());
        tag(TagRegistry.UNOBTAINIUM_ALLTHEMODIUM_BLOCK).add(ModRegistry.UA_ALLOY_ITEM.get());
        tag(TagRegistry.UNOBTAINIUM_VIBRANIUM_BLOCK).add(ModRegistry.UV_ALLOY_ITEM.get());

        tag(TagRegistry.ALLTHEMODIUM_DUST).add(ModRegistry.ALLTHEMODIUM_DUST.get());
        tag(TagRegistry.VIBRANIUM_DUST).add(ModRegistry.VIBRANIUM_DUST.get());
        tag(TagRegistry.UNOBTAINIUM_DUST).add(ModRegistry.UNOBTAINIUM_DUST.get());

        tag(TagRegistry.DUSTS).add(ModRegistry.ALLTHEMODIUM_DUST.get());
        tag(TagRegistry.DUSTS).add(ModRegistry.VIBRANIUM_DUST.get());
        tag(TagRegistry.DUSTS).add(ModRegistry.UNOBTAINIUM_DUST.get());

        tag(TagRegistry.INGOTS).add(ModRegistry.ALLTHEMODIUM_INGOT.get());
        tag(TagRegistry.INGOTS).add(ModRegistry.VIBRANIUM_INGOT.get());
        tag(TagRegistry.INGOTS).add(ModRegistry.UNOBTAINIUM_INGOT.get());

        tag(TagRegistry.ALLTHEMODIUM_NUGGET).add(ModRegistry.ALLTHEMODIUM_NUGGET.get());
        tag(TagRegistry.VIBRANIUM_NUGGET).add(ModRegistry.VIBRANIUM_NUGGET.get());
        tag(TagRegistry.UNOBTAINIUM_NUGGET).add(ModRegistry.UNOBTAINIUM_NUGGET.get());

        tag(TagRegistry.ALLTHEMODIUM_BLOCK_ITEM).add(ModRegistry.ALLTHEMODIUM_BLOCK_ITEM.get());
        tag(TagRegistry.VIBRANIUM_BLOCK_ITEM).add(ModRegistry.VIBRANIUM_BLOCK_ITEM.get());
        tag(TagRegistry.UNOBTAINIUM_BLOCK_ITEM).add(ModRegistry.UNOBTAINIUM_BLOCK_ITEM.get());

        tag(TagRegistry.RAW_ALLTHEMODIUM_BLOCK).add(ModRegistry.RAW_ALLTHEMODIUM_BLOCK_ITEM.get());
        tag(TagRegistry.RAW_VIBRANIUM_BLOCK).add(ModRegistry.RAW_VIBRANIUM_BLOCK_ITEM.get());
        tag(TagRegistry.RAW_UNOBTAINIUM_BLOCK).add(ModRegistry.RAW_UNOBTAINIUM_BLOCK_ITEM.get());


        tag(TagRegistry.ALLTHEMODIUM_ORE_ITEM).add(ModRegistry.ALLTHEMODIUM_ORE_ITEM.get());
        tag(TagRegistry.ALLTHEMODIUM_ORE_ITEM).add(ModRegistry.ALLTHEMODIUM_SLATE_ORE_ITEM.get());
        tag(TagRegistry.VIBRANIUM_ORE_ITEM).add(ModRegistry.VIBRANIUM_ORE_ITEM.get());
        tag(TagRegistry.VIBRANIUM_ORE_ITEM).add(ModRegistry.OTHER_VIBRANIUM_ORE_ITEM.get());
        tag(TagRegistry.UNOBTAINIUM_ORE_ITEM).add(ModRegistry.UNOBTAINIUM_ORE_ITEM.get());

        tag(TagRegistry.ORES).add(ModRegistry.ALLTHEMODIUM_ORE_ITEM.get());
        tag(TagRegistry.ORES).add(ModRegistry.ALLTHEMODIUM_SLATE_ORE_ITEM.get());
        tag(TagRegistry.ORES).add(ModRegistry.VIBRANIUM_ORE_ITEM.get());
        tag(TagRegistry.ORES).add(ModRegistry.OTHER_VIBRANIUM_ORE_ITEM.get());
        tag(TagRegistry.ORES).add(ModRegistry.UNOBTAINIUM_ORE_ITEM.get());

        tag(TagRegistry.ALLTHEMODIUM_GEAR).add(ModRegistry.ATM_GEAR.get());
        tag(TagRegistry.VIBRANIUM_GEAR).add(ModRegistry.VIB_GEAR.get());
        tag(TagRegistry.UNOBTAINIUM_GEAR).add(ModRegistry.ONOB_GEAR.get());

        tag(TagRegistry.ALLTHEMODIUM_PLATE).add(ModRegistry.ATM_PLATE.get());
        tag(TagRegistry.VIBRANIUM_PLATE).add(ModRegistry.VIB_PLATE.get());
        tag(TagRegistry.UNOBTAINIUM_PLATE).add(ModRegistry.ONOB_PLATE.get());

        tag(TagRegistry.ALLTHEMODIUM_ROD).add(ModRegistry.ATM_ROD.get());
        tag(TagRegistry.VIBRANIUM_ROD).add(ModRegistry.VIB_ROD.get());
        tag(TagRegistry.UNOBTAINIUM_ROD).add(ModRegistry.ONOB_ROD.get());

        tag(TagRegistry.ALLTHEMODIUM_SHARD).add(ModRegistry.ATM_SHARD.get());
        tag(TagRegistry.VIBRANIUM_SHARD).add(ModRegistry.VIB_SHARD.get());
        tag(TagRegistry.UNOBTAINIUM_SHARD).add(ModRegistry.ONOB_SHARD.get());

        tag(TagRegistry.ALLTHEMODIUM_CLUMP).add(ModRegistry.ATM_CLUMP.get());
        tag(TagRegistry.VIBRANIUM_CLUMP).add(ModRegistry.VIB_CLUMP.get());
        tag(TagRegistry.UNOBTAINIUM_CLUMP).add(ModRegistry.ONOB_CLUMP.get());

        tag(TagRegistry.ALLTHEMODIUM_CRYSTAL).add(ModRegistry.ATM_CRYSTAL.get());
        tag(TagRegistry.VIBRANIUM_CRYSTAL).add(ModRegistry.VIB_CRYSTAL.get());
        tag(TagRegistry.UNOBTAINIUM_CRYSTAL).add(ModRegistry.ONOB_CRYSTAL.get());

        tag(TagRegistry.ALLTHEMODIUM_DIRTYDUST).add(ModRegistry.ATM_DIRTY.get());
        tag(TagRegistry.VIBRANIUM_DIRTYDUST).add(ModRegistry.VIB_DIRTY.get());
        tag(TagRegistry.UNOBTAINIUM_DIRTYDUST).add(ModRegistry.ONOB_DIRTY.get());

        tag(TagRegistry.SHARD).add(ModRegistry.ATM_SHARD.get());
        tag(TagRegistry.SHARD).add(ModRegistry.VIB_SHARD.get());
        tag(TagRegistry.SHARD).add(ModRegistry.ONOB_SHARD.get());

        tag(TagRegistry.CLUMP).add(ModRegistry.ATM_CLUMP.get());
        tag(TagRegistry.CLUMP).add(ModRegistry.VIB_CLUMP.get());
        tag(TagRegistry.CLUMP).add(ModRegistry.ONOB_CLUMP.get());

        tag(TagRegistry.CRYSTAL).add(ModRegistry.ATM_CRYSTAL.get());
        tag(TagRegistry.CRYSTAL).add(ModRegistry.VIB_CRYSTAL.get());
        tag(TagRegistry.CRYSTAL).add(ModRegistry.ONOB_CRYSTAL.get());

        tag(TagRegistry.DIRTYDUST).add(ModRegistry.ATM_DIRTY.get());
        tag(TagRegistry.DIRTYDUST).add(ModRegistry.VIB_DIRTY.get());
        tag(TagRegistry.DIRTYDUST).add(ModRegistry.ONOB_DIRTY.get());

    }
}
