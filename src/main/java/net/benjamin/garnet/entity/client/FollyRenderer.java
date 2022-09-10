package net.benjamin.garnet.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.benjamin.garnet.GarnetMod;
import net.benjamin.garnet.entity.custom.RollyEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class FollyRenderer extends GeoEntityRenderer<RollyEntity> {
    public FollyRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new RollyModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(RollyEntity instance) {
        return new ResourceLocation(GarnetMod.MOD_ID, "textures/entity/rolly.png");
    }

    @Override
    public RenderType getRenderType(RollyEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}