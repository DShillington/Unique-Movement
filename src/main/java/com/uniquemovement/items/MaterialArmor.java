package com.uniquemovement.items;


import java.util.List;


import com.uniquemovement.UniqueMovementMod;
import com.uniquemovement.util.Reference;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class MaterialArmor extends ItemArmor {
	public static float defensePoints;
    public MaterialArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(UniqueMovementMod.MovementTab);
    }
    
    @Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == MovementItems.Helmet)
		{
		return Reference.MOD_ID + ":" + "textures/models/armor/Helmet.png";
		}
		return null;
		}
    @SideOnly(Side.CLIENT)
	  public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot)
	  {
	    ModelBiped armorModel = null;
	    if (itemStack != null) {
		  if (itemStack.getItem() == MovementItems.Helmet) {
			        armorModel = UniqueMovementMod.proxy.getArmorModelHalo();
			      }
	    }
	    if(armorModel != null){
	    	armorModel.bipedHead.showModel = armorSlot == 0;
	    	armorModel.bipedHeadwear.showModel = armorSlot == 0;
	    	armorModel.bipedBody.showModel = armorSlot == 1 || armorSlot == 2;
	    	armorModel.bipedRightArm.showModel = armorSlot == 1;
	    	armorModel.bipedLeftArm.showModel = armorSlot == 1;
	    	armorModel.bipedRightLeg.showModel = armorSlot == 2 || armorSlot == 3;
	    	armorModel.bipedLeftLeg.showModel = armorSlot == 2 || armorSlot == 3;
	    	armorModel.isSneak = entityLiving.isSneaking();
	    	armorModel.isRiding = entityLiving.isRiding();
	    	armorModel.isChild = entityLiving.isChild();
	    	armorModel.heldItemRight = entityLiving.getCurrentArmor(0) != null ? 1 :0;
	    	if(entityLiving instanceof EntityPlayer){
	    		armorModel.aimedBow =((EntityPlayer)entityLiving).getItemInUseDuration() > 2;
	    		} 
	    	return armorModel;
	    		}
	    return null;
	  }
    
}