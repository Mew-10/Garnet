package net.benjamin.garnet.entity.client;

import net.benjamin.garnet.GarnetMod;
import net.benjamin.garnet.entity.custom.BlaraolsEntity;
import net.minecraft.client.model.SilverfishModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Silverfish;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BlaraolsRenderer extends MobRenderer<BlaraolsEntity, BlaraolsModel<BlaraolsEntity>> {

    public BlaraolsRenderer(EntityRendererProvider.Context p_174378_) {
        super(p_174378_, new BlaraolsModel<>(p_174378_.bakeLayer(ModelLayers.SILVERFISH)), 0.3F);
    }

    @Override
    public ResourceLocation getTextureLocation(BlaraolsEntity pEntity) {
        return new ResourceLocation(GarnetMod.MOD_ID, "textures/entity/blaraols.png");
    }

    protected float getFlipDegrees(BlaraolsEntity pLivingEntity) {
        return 180.0F;
    }
}