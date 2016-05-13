package com.uniquemovement.player;

import net.minecraft.client.renderer.GlStateManager;

import org.lwjgl.opengl.GL11;


import api.player.model.ModelPlayerAPI;
import api.player.model.ModelPlayerBase;

public class PlayerOverrideDefault extends ModelPlayerBase
{
	public PlayerOverrideDefault(ModelPlayerAPI modelPlayerAPI)
	{
		super(modelPlayerAPI);
	}

	@Override
	public void afterSetRotationAngles(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, net.minecraft.entity.Entity paramEntity)
	{
		if (paramEntity.isSneaking()){
			this.modelPlayer.bipedLeftLeg.rotateAngleZ = 0F;
			this.modelPlayer.bipedRightLeg.rotateAngleZ = 0F;
			this.modelPlayer.bipedLeftLeg.setRotationPoint(1.9F, 9.0F, 5.2F);
			this.modelPlayer.bipedRightLeg.setRotationPoint(-1.9F, 9.0F, 5.2F);
			this.modelPlayer.bipedLeftLegwear.setRotationPoint(1.9F, 9.0F, 5.2F);
			this.modelPlayer.bipedRightLegwear.setRotationPoint(-1.9F, 9.0F, 5.2F);
		}
			else
			{
				this.modelPlayer.bipedLeftLeg.rotateAngleZ = 0F;
				this.modelPlayer.bipedRightLeg.rotateAngleZ = 0F;
				this.modelPlayer.bipedLeftLeg.setRotationPoint(1.9F, 13.0F, 0.0F);
				this.modelPlayer.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			}
	}
}