package com.uniquemovement.entity.hovercraft;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHovercraft  extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Engine;
  
  public ModelHovercraft ()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 20, 4, 35);
      Shape1.setRotationPoint(-10F, 20F, -13F);
      Shape1.setTextureSize(128, 128);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 41, 46);
      Shape2.addBox(0F, 0F, 0F, 3, 4, 25);
      Shape2.setRotationPoint(6F, 16F, -12F);
      Shape2.setTextureSize(128, 128);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 41);
      Shape3.addBox(0F, 0F, 0F, 12, 4, 3);
      Shape3.setRotationPoint(-6F, 16F, -12F);
      Shape3.setTextureSize(128, 128);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 8, 40);
      Shape4.addBox(0F, 0F, 0F, 3, 4, 25);
      Shape4.setRotationPoint(-9F, 16F, -12F);
      Shape4.setTextureSize(128, 128);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 14, 78);
      Shape5.addBox(0F, 0F, 0F, 18, 4, 8);
      Shape5.setRotationPoint(-9F, 16F, 13F);
      Shape5.setTextureSize(128, 128);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 78, 12);
      Shape6.addBox(0F, 0F, 0F, 1, 16, 5);
      Shape6.setRotationPoint(-9F, 0F, 16F);
      Shape6.setTextureSize(128, 128);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 92, 12);
      Shape7.addBox(0F, 0F, 0F, 1, 16, 5);
      Shape7.setRotationPoint(8F, 0F, 16F);
      Shape7.setTextureSize(128, 128);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 78, 0);
      Shape8.addBox(0F, 0F, 0F, 18, 1, 5);
      Shape8.setRotationPoint(-9F, -1F, 16F);
      Shape8.setTextureSize(128, 128);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 6, 84);
      Shape9.addBox(-0.5F, 0F, 0F, 1, 23, 1);
      Shape9.setRotationPoint(-8F, 0F, 17F);
      Shape9.setTextureSize(128, 128);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, -0.7853982F);
      Shape10 = new ModelRenderer(this, 0, 84);
      Shape10.addBox(-0.5F, 0F, 0F, 1, 23, 1);
      Shape10.setRotationPoint(8F, 0F, 17F);
      Shape10.setTextureSize(128, 128);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0.7853982F);
      Shape11 = new ModelRenderer(this, 0, 76);
      Shape11.addBox(0F, 0F, 0F, 2, 2, 4);
      Shape11.setRotationPoint(-1F, 7F, 16.5F);
      Shape11.setTextureSize(128, 128);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, 0F);
      Engine = new ModelRenderer(this, 0, 110);
      Engine.addBox(-8F, -8F, 0F, 16, 16, 0);
      Engine.setRotationPoint(0F, 8F, 20F);
      Engine.setTextureSize(128, 128);
      Engine.mirror = true;
      setRotation(Engine, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
    Shape11.render(f5);
    Engine.render(f5);
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
    this.Engine.rotateAngleZ = degToRad(f * -40f);
  }
}
