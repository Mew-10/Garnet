package net.benjamin.garnet.event;

import net.benjamin.garnet.GarnetMod;
import net.benjamin.garnet.entity.ModEntityTypes;
import net.benjamin.garnet.entity.custom.RollyEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GarnetMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.ROLLY.get(), RollyEntity.setAttributes());
    }
}
