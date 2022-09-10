package net.benjamin.garnet.item;

import net.benjamin.garnet.GarnetMod;
import net.benjamin.garnet.entity.ModEntityTypes;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GarnetMod.MOD_ID);

    public static final RegistryObject<Item> ROLLY_SPAWN_EGG = ITEMS.register("rolly_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.ROLLY,513318, 764775638,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
