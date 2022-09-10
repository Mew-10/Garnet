package net.benjamin.garnet.entity.client;

import net.benjamin.garnet.GarnetMod;
import net.benjamin.garnet.entity.custom.RollyEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RollyModel extends AnimatedGeoModel<RollyEntity> {
    @Override
    public ResourceLocation getModelLocation(RollyEntity object) {
        return new ResourceLocation(GarnetMod.MOD_ID, "geo/rolly.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(RollyEntity object) {
        return new ResourceLocation(GarnetMod.MOD_ID, "textures/entity/rolly.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(RollyEntity animatable) {
        return new ResourceLocation(GarnetMod.MOD_ID, "animations/the_rolly.animation.json");
    }
}