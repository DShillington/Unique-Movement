package com.uniquemovement.player;

import net.minecraft.client.renderer.GlStateManager;

import org.lwjgl.opengl.GL11;

import com.uniquemovement.entity.cargoboat.EntityCargoBoat;

import api.player.model.ModelPlayerAPI;
import api.player.model.ModelPlayerBase;

public class PlayerOverrideCargoBoat extends ModelPlayerBase
{
	public PlayerOverrideCargoBoat(ModelPlayerAPI modelPlayerAPI)
	{
		super(modelPlayerAPI);
	}

	@Override
	public void afterSetRotationAngles(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, net.minecraft.entity.Entity paramEntity)
	{
		if (paramEntity.ridingEntity != null && 
			(paramEntity.ridingEntity instanceof EntityCargoBoat))
		{
			//First Skin Layer
			this.modelPlayer.bipedLeftArm.rotateAngleX = -2.5F;
			this.modelPlayer.bipedLeftArm.rotateAngleY = 0.3F;
			this.modelPlayer.bipedRightArm.rotateAngleX = -0F;
			this.modelPlayer.bipedLeftLeg.rotateAngleZ = -0.1F;
			this.modelPlayer.bipedRightLeg.rotateAngleZ = 0.1F;
			this.modelPlayer.bipedLeftLeg.rotateAngleY = 0.0F;
			this.modelPlayer.bipedRightLeg.rotateAngleY = 0.0F;
			this.modelPlayer.bipedLeftLeg.rotateAngleX = -0.0F;
			this.modelPlayer.bipedRightLeg.rotateAngleX = 0.0F;
			this.modelPlayer.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			this.modelPlayer.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			this.modelPlayer.bipedHead.rotateAngleY = 0f;
			this.modelPlayer.bipedHead.rotateAngleX = 0f;
			this.modelPlayer.bipedHead.rotateAngleZ = 0f;
			//Second Skin Layer
			this.modelPlayer.bipedLeftArmwear.rotateAngleX = -1.2F;
			this.modelPlayer.bipedRightArmwear.rotateAngleX = -1.2F;
			this.modelPlayer.bipedLeftLegwear.rotateAngleZ = -0.1F;
			this.modelPlayer.bipedRightLegwear.rotateAngleZ = 0.1F;
			this.modelPlayer.bipedLeftLegwear.rotateAngleY = 0.0F;
			this.modelPlayer.bipedRightLegwear.rotateAngleY = 0.0F;
			this.modelPlayer.bipedLeftLegwear.rotateAngleX = -0.0F;
			this.modelPlayer.bipedRightLegwear.rotateAngleX = 0.0F;
			this.modelPlayer.bipedLeftLegwear.setRotationPoint(1.9F, 12.0F, 0.0F);
			this.modelPlayer.bipedRightLegwear.setRotationPoint(-1.9F, 12.0F, 0.0F);
				}
		else
		{
			this.modelPlayer.bipedLeftLeg.rotateAngleZ = 0F;
			this.modelPlayer.bipedRightLeg.rotateAngleZ = 0F;
			this.modelPlayer.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			this.modelPlayer.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		}
		
	}
}