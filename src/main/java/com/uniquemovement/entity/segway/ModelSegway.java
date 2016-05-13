package com.uniquemovement.entity.segway;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelSegway extends ModelBase
{

    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3Wheel;
    ModelRenderer Shape4Wheel;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
  
  public ModelSegway()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 46, 12);
      Shape1.addBox(0F, 0F, 0F, 1, 4, 8);
      Shape1.setRotationPoint(5F, 18F, -5F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 46, 0);
      Shape2.addBox(0F, 0F, 0F, 1, 4, 8);
      Shape2.setRotationPoint(-6F, 18F, -5F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3Wheel = new ModelRenderer(this, 23, 6);
      Shape3Wheel.addBox(0F, -2.5F, -2.5F, 1, 5, 5);
      Shape3Wheel.setRotationPoint(6F, 21.5F, -1F);
      Shape3Wheel.setTextureSize(64, 32);
      Shape3Wheel.mirror = true;
      setRotation(Shape3Wheel, 0F, 0F, 0F);
      Shape4Wheel = new ModelRenderer(this, 23, 6);
      Shape4Wheel.addBox(0F, -2.5F, -2.5F, 1, 5, 5);
      Shape4Wheel.setRotationPoint(-7F, 21.5F, -1F);
      Shape4Wheel.setTextureSize(64, 32);
      Shape4Wheel.mirror = true;
      setRotation(Shape4Wheel, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 10, 10);
      Shape5.addBox(0F, 0F, 0F, 2, 1, 7);
      Shape5.setRotationPoint(5F, 17F, -4F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 28, 10);
      Shape6.addBox(0F, 0F, 0F, 2, 1, 7);
      Shape6.setRotationPoint(-7F, 17F, -4F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 0, 0);
      Shape7.addBox(0F, 0F, 0F, 2, 15, 2);
      Shape7.setRotationPoint(-1F, 18F, -4F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape7, -2.88852F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 13, 0);
      Shape8.addBox(0F, 0F, 0F, 18, 2, 2);
      Shape8.setRotationPoint(-9F, 3F, -10F);
      Shape8.setTextureSize(64, 32);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 0, 25);
      Shape9.addBox(0F, 0F, 0F, 10, 1, 6);
      Shape9.setRotationPoint(-5F, 21F, -3F);
      Shape9.setTextureSize(64, 32);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0F);
      Shape10 = new ModelRenderer(this, 0, 18);
      Shape10.addBox(0F, 0F, 0F, 10, 5, 2);
      Shape10.setRotationPoint(-5F, 17F, -5F);
      Shape10.setTextureSize(64, 32);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0F);
      Shape11 = new ModelRenderer(this, 24, 18);
      Shape11.addBox(0F, 0F, 0F, 10, 4, 1);
      Shape11.setRotationPoint(-5F, 18F, -6F);
      Shape11.setTextureSize(64, 32);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3Wheel.render(f5);
    Shape4Wheel.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
    Shape11.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  protected float degToRad(float degrees)
  {
      return degrees * (float)Math.PI / 180 ;
  }
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Shape3Wheel.rotateAngleX = degToRad(f * 20f);
    this.Shape4Wheel.rotateAngleX = degToRad(f * 20f);
  }

}
