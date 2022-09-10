package net.benjamin.garnet.entity;

import net.benjamin.garnet.GarnetMod;
import net.benjamin.garnet.entity.custom.RollyEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, GarnetMod.MOD_ID);

    public static final RegistryObject<EntityType<RollyEntity>> ROLLY =
            ENTITY_TYPES.register("rolly",
                    () -> EntityType.Builder.of(RollyEntity::new, MobCategory.CREATURE)
                            .sized(0.8f, 0.6f)
                            .build(new ResourceLocation(GarnetMod.MOD_ID, "rolly").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}

