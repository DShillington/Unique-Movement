package com.uniquemovement.entity.tardis;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelTardis extends ModelBase
{
  //fields
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
    ModelRenderer RotationPointPiece;
    ModelRenderer Shape13;
    ModelRenderer Shape1;
    ModelRenderer Shape12;
    ModelRenderer Shape14;
  
  public ModelTardis()
  {
    textureWidth = 256;
    textureHeight = 256;
    
      Shape2 = new ModelRenderer(this, 98, 0);
      Shape2.addBox(-11F, 47F, -11F, 22, 1, 22);
      Shape2.setRotationPoint(0F, -25F, 0F);
      Shape2.setTextureSize(256, 256);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 0);
      Shape3.addBox(-12F, 48F, -12F, 24, 1, 24);
      Shape3.setRotationPoint(0F, -25F, 0F);
      Shape3.setTextureSize(256, 256);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 0, 42);
      Shape4.addBox(-11F, 15F, -11F, 2, 32, 2);
      Shape4.setRotationPoint(0F, -25F, 0F);
      Shape4.setTextureSize(256, 256);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 0, 42);
      Shape5.addBox(9F, 15F, -11F, 2, 32, 2);
      Shape5.setRotationPoint(0F, -25F, 0F);
      Shape5.setTextureSize(256, 256);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 0, 42);
      Shape6.addBox(-11F, 15F, 9F, 2, 32, 2);
      Shape6.setRotationPoint(0F, -25F, 0F);
      Shape6.setTextureSize(256, 256);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 0, 42);
      Shape7.addBox(9F, 15F, 9F, 2, 32, 2);
      Shape7.setRotationPoint(0F, -25F, 0F);
      Shape7.setTextureSize(256, 256);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 79, 76);
      Shape8.addBox(-11F, 11F, -11F, 22, 4, 22);
      Shape8.setRotationPoint(0F, -25F, 0F);
      Shape8.setTextureSize(256, 256);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 0, 129);
      Shape9.addBox(-10F, 9F, -10F, 20, 2, 20);
      Shape9.setRotationPoint(0F, -25F, 0F);
      Shape9.setTextureSize(256, 256);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0F);
      Shape10 = new ModelRenderer(this, 0, 152);
      Shape10.addBox(-9F, 7F, -9F, 18, 2, 18);
      Shape10.setRotationPoint(0F, -25F, 0F);
      Shape10.setTextureSize(256, 256);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0F);
      Shape11 = new ModelRenderer(this, 14, 37);
      Shape11.addBox(-1.5F, 1F, -1.5F, 3, 5, 3);
      Shape11.setRotationPoint(0F, -25F, 0F);
      Shape11.setTextureSize(256, 256);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, 0F);
      RotationPointPiece = new ModelRenderer(this, 0, 38);
      RotationPointPiece.addBox(-0.5F, 0F, -0.5F, 1, 1, 1);
      RotationPointPiece.setRotationPoint(0F, -25F, 0F);
      RotationPointPiece.setTextureSize(256, 256);
      RotationPointPiece.mirror = true;
      setRotation(RotationPointPiece, 0F, 0F, 0F);
      Shape13 = new ModelRenderer(this, 0, 29);
      Shape13.addBox(-2.5F, 6F, -2.5F, 5, 1, 5);
      Shape13.setRotationPoint(0F, -25F, 0F);
      Shape13.setTextureSize(256, 256);
      Shape13.mirror = true;
      setRotation(Shape13, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 76);
      Shape1.addBox(-10F, 15F, -10F, 20, 32, 20);
      Shape1.setRotationPoint(0F, -25F, 0F);
      Shape1.setTextureSize(256, 256);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape12 = new ModelRenderer(this, 40, 28);
      Shape12.addBox(-12F, 12F, -10F, 24, 2, 20);
      Shape12.setRotationPoint(0F, -25F, 0F);
      Shape12.setTextureSize(256, 256);
      Shape12.mirror = true;
      setRotation(Shape12, 0F, 0F, 0F);
      Shape14 = new ModelRenderer(this, 40, 50);
      Shape14.addBox(-10F, 12F, -12F, 20, 2, 24);
      Shape14.setRotationPoint(0F, -25F, 0F);
      Shape14.setTextureSize(256, 256);
      Shape14.mirror = true;
      setRotation(Shape14, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
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
    RotationPointPiece.render(f5);
    Shape13.render(f5);
    Shape1.render(f5);
    Shape12.render(f5);
    Shape14.render(f5);
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
	  
	   this.RotationPointPiece.rotateAngleY = degToRad(f * 8f);
	   this.Shape1.rotateAngleY = this.RotationPointPiece.rotateAngleY;
	   this.Shape2.rotateAngleY = this.RotationPointPiece.rotateAngleY;
	   this.Shape3.rotateAngleY = this.RotationPointPiece.rotateAngleY;
	   this.Shape4.rotateAngleY = this.RotationPointPiece.rotateAngleY;
	   this.Shape5.rotateAngleY = this.RotationPointPiece.rotateAngleY;
	   this.Shape6.rotateAngleY = this.RotationPointPiece.rotateAngleY;
	   this.Shape7.rotateAngleY = this.RotationPointPiece.rotateAngleY;
	   this.Shape8.rotateAngleY = this.RotationPointPiece.rotateAngleY;
	   this.Shape9.rotateAngleY = this.RotationPointPiece.rotateAngleY;
	   this.Shape10.rotateAngleY = this.RotationPointPiece.rotateAngleY;
	   this.Shape11.rotateAngleY = this.RotationPointPiece.rotateAngleY;
	   this.Shape12.rotateAngleY = this.RotationPointPiece.rotateAngleY;
	   this.Shape13.rotateAngleY = this.RotationPointPiece.rotateAngleY;
	   this.Shape14.rotateAngleY = this.RotationPointPiece.rotateAngleY;
  
}
}
