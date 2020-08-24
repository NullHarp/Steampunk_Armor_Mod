package com.nullharp.steampunk.armor;// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class PlatedArmorModel extends BipedModel<LivingEntity> {

	public PlatedArmorModel(float modelSize) {
		super(modelSize, 0.0F, 128, 128);

		ModelRenderer RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		bipedRightLeg.addChild(RightLeg);
		RightLeg.setTextureOffset(0, 32).addBox(-7.0F, 8.75F, -4.0F, 6.0F, 4.0F, 7.0F, -0.45F, false);
		RightLeg.setTextureOffset(63, 14).addBox(-6.0F, 0.0F, -2.625F, 4.0F, 3.0F, 1.0F, -0.05F, false);
		RightLeg.setTextureOffset(63, 14).addBox(-6.0F, 6.0F, -2.625F, 4.0F, 3.0F, 1.0F, -0.05F, false);
		RightLeg.setTextureOffset(9, 39).addBox(-5.5F, 3.5F, -2.625F, 3.0F, 2.0F, 1.0F, -0.05F, false);
		RightLeg.setTextureOffset(63, 14).addBox(-2.375F, 6.0F, -2.0F, 1.0F, 3.0F, 4.0F, -0.05F, false);
		RightLeg.setTextureOffset(63, 14).addBox(-6.0F, 0.0F, 1.625F, 4.0F, 3.0F, 1.0F, -0.05F, false);
		RightLeg.setTextureOffset(63, 14).addBox(-6.0F, 6.0F, 1.625F, 4.0F, 3.0F, 1.0F, -0.05F, false);
		RightLeg.setTextureOffset(63, 14).addBox(-2.375F, 0.0F, -2.0F, 1.0F, 3.0F, 4.0F, -0.05F, false);
		RightLeg.setTextureOffset(63, 14).addBox(-6.625F, 6.0F, -2.0F, 1.0F, 3.0F, 4.0F, -0.05F, false);
		RightLeg.setTextureOffset(63, 14).addBox(-6.625F, 0.0F, -2.0F, 1.0F, 3.0F, 4.0F, -0.05F, false);

		ModelRenderer LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		bipedLeftLeg.addChild(LeftLeg);
		LeftLeg.setTextureOffset(0, 32).addBox(1.0F, 8.75F, -4.0F, 6.0F, 4.0F, 7.0F, -0.45F, false);
		LeftLeg.setTextureOffset(63, 14).addBox(2.0F, 0.0F, -2.625F, 4.0F, 3.0F, 1.0F, -0.05F, false);
		LeftLeg.setTextureOffset(63, 14).addBox(2.0F, 6.0F, -2.625F, 4.0F, 3.0F, 1.0F, -0.05F, false);
		LeftLeg.setTextureOffset(9, 39).addBox(2.5F, 3.5F, -2.625F, 3.0F, 2.0F, 1.0F, -0.05F, false);
		LeftLeg.setTextureOffset(63, 14).addBox(2.0F, 0.0F, 1.625F, 4.0F, 3.0F, 1.0F, -0.05F, false);
		LeftLeg.setTextureOffset(63, 14).addBox(2.0F, 6.0F, 1.625F, 4.0F, 3.0F, 1.0F, -0.05F, false);
		LeftLeg.setTextureOffset(63, 14).addBox(5.625F, 0.0F, -2.0F, 1.0F, 3.0F, 4.0F, -0.05F, false);
		LeftLeg.setTextureOffset(63, 14).addBox(1.4F, 6.0F, -2.0F, 1.0F, 3.0F, 4.0F, -0.05F, false);
		LeftLeg.setTextureOffset(63, 14).addBox(1.4F, 0.0F, -2.0F, 1.0F, 3.0F, 4.0F, -0.05F, false);
		LeftLeg.setTextureOffset(63, 14).addBox(5.625F, 6.0F, -2.0F, 1.0F, 3.0F, 4.0F, -0.05F, false);

		ModelRenderer Body = new ModelRenderer(this);
		Body.setRotationPoint(-2.0F, 12.0F, 0.0F);
		bipedBody.addChild(Body);
		Body.setTextureOffset(16, 16).addBox(-2.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		Body.setTextureOffset(63, 14).addBox(-2.25F, -6.0F, -2.625F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(63, 14).addBox(4.25F, -6.0F, -2.625F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(63, 14).addBox(-2.0F, -10.0F, 1.625F, 8.0F, 10.0F, 1.0F, 0.0F, false);

		ModelRenderer AngledPlate = new ModelRenderer(this);
		AngledPlate.setRotationPoint(0.0F, 0.0F, -3.0F);
		Body.addChild(AngledPlate);
		setRotationAngle(AngledPlate, 0.0F, 0.0F, 0.0873F);
		AngledPlate.setTextureOffset(63, 14).addBox(-3.0F, -10.0F, 0.375F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		AngledPlate.setTextureOffset(63, 14).addBox(2.2064F, -3.2481F, 0.375F, 4.0F, 3.0F, 1.0F, 0.0F, false);

		ModelRenderer AngledPlate2 = new ModelRenderer(this);
		AngledPlate2.setRotationPoint(4.0F, 0.0F, -3.0F);
		Body.addChild(AngledPlate2);
		setRotationAngle(AngledPlate2, 0.0F, 0.0F, -0.0873F);
		AngledPlate2.setTextureOffset(63, 14).addBox(-1.0F, -10.0F, 0.375F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		AngledPlate2.setTextureOffset(63, 14).addBox(-6.2064F, -3.2481F, 0.375F, 4.0F, 3.0F, 1.0F, 0.0F, false);

		ModelRenderer Gear3 = new ModelRenderer(this);
		Gear3.setRotationPoint(2.0F, -5.25F, -2.0F);
		Body.addChild(Gear3);
		Gear3.setTextureOffset(24, 1).addBox(-2.5F, -0.5F, 4.0F, 5.0F, 1.0F, 1.0F, -0.25F, false);
		Gear3.setTextureOffset(24, 1).addBox(0.5F, -1.5F, 4.0F, 1.0F, 3.0F, 1.0F, -0.25F, false);
		Gear3.setTextureOffset(24, 1).addBox(-1.5F, -1.5F, 4.0F, 1.0F, 3.0F, 1.0F, -0.25F, false);
		Gear3.setTextureOffset(24, 1).addBox(-0.5F, -2.5F, 4.0F, 1.0F, 5.0F, 1.0F, -0.25F, false);
		Gear3.setTextureOffset(24, 1).addBox(-1.5F, -1.5F, 4.0F, 3.0F, 1.0F, 1.0F, -0.25F, false);
		Gear3.setTextureOffset(24, 1).addBox(-1.5F, 0.5F, 4.0F, 3.0F, 1.0F, 1.0F, -0.25F, false);

		ModelRenderer GearsRot3 = new ModelRenderer(this);
		GearsRot3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Gear3.addChild(GearsRot3);
		setRotationAngle(GearsRot3, 0.0F, 0.0F, 0.7854F);
		GearsRot3.setTextureOffset(24, 1).addBox(-0.5F, -2.5F, 4.0F, 1.0F, 5.0F, 1.0F, -0.25F, false);
		GearsRot3.setTextureOffset(24, 1).addBox(-2.5F, -0.5F, 4.0F, 5.0F, 1.0F, 1.0F, -0.25F, false);

		ModelRenderer Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.addChild(Head);
		Head.setTextureOffset(0, 0).addBox(1.75F, -5.625F, -4.75F, 1.0F, 1.0F, 1.0F, -0.2F, false);
		Head.setTextureOffset(32, 6).addBox(-3.5F, -4.25F, -6.0F, 7.0F, 7.0F, 3.0F, -2.0F, false);
		Head.setTextureOffset(49, 0).addBox(-3.475F, -4.25F, -5.175F, 7.0F, 7.0F, 2.0F, -1.9F, false);

		ModelRenderer Eye = new ModelRenderer(this);
		Eye.setRotationPoint(0.0F, -5.0F, 0.0F);
		Head.addChild(Eye);
		Eye.setTextureOffset(24, 0).addBox(-4.75F, -2.25F, -5.5F, 5.0F, 2.0F, 2.0F, -1.125F, false);
		Eye.setTextureOffset(24, 0).addBox(-4.375F, -2.625F, -5.55F, 2.0F, 5.0F, 2.0F, -1.125F, false);
		Eye.setTextureOffset(24, 0).addBox(-4.75F, 0.0F, -5.5F, 5.0F, 2.0F, 2.0F, -1.125F, false);
		Eye.setTextureOffset(24, 0).addBox(-2.125F, -2.625F, -5.55F, 2.0F, 5.0F, 2.0F, -1.125F, false);
		Eye.setTextureOffset(24, 0).addBox(-0.25F, -2.25F, -5.5F, 5.0F, 2.0F, 2.0F, -1.125F, false);
		Eye.setTextureOffset(24, 0).addBox(0.125F, -2.625F, -5.55F, 2.0F, 5.0F, 2.0F, -1.125F, false);
		Eye.setTextureOffset(24, 0).addBox(-0.25F, 0.0F, -5.5F, 5.0F, 2.0F, 2.0F, -1.125F, false);
		Eye.setTextureOffset(24, 0).addBox(2.375F, -2.625F, -5.55F, 2.0F, 5.0F, 2.0F, -1.125F, false);

		ModelRenderer PipesR = new ModelRenderer(this);
		PipesR.setRotationPoint(-2.75F, -2.25F, 0.5F);
		Head.addChild(PipesR);
		setRotationAngle(PipesR, 0.1745F, -0.0873F, 0.1309F);
		PipesR.setTextureOffset(24, 2).addBox(-3.0F, -1.0F, -6.0F, 3.0F, 1.0F, 1.0F, -0.25F, false);
		PipesR.setTextureOffset(24, 0).addBox(-3.5F, -1.0F, -6.0F, 1.0F, 1.0F, 6.0F, -0.25F, false);
		PipesR.setTextureOffset(24, 0).addBox(-3.5F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);
		PipesR.setTextureOffset(24, 2).addBox(-1.0F, -1.0F, -6.0F, 1.0F, 1.0F, 2.0F, -0.25F, false);

		ModelRenderer PipesL = new ModelRenderer(this);
		PipesL.setRotationPoint(2.75F, -2.25F, 0.5F);
		Head.addChild(PipesL);
		setRotationAngle(PipesL, 0.1745F, 0.0873F, -0.1309F);
		PipesL.setTextureOffset(24, 2).addBox(0.0F, -1.0F, -6.0F, 1.0F, 1.0F, 2.0F, -0.25F, false);
		PipesL.setTextureOffset(24, 2).addBox(0.0F, -1.0F, -6.0F, 3.0F, 1.0F, 1.0F, -0.25F, false);
		PipesL.setTextureOffset(24, 0).addBox(2.5F, -1.0F, -6.0F, 1.0F, 1.0F, 6.0F, -0.25F, false);
		PipesL.setTextureOffset(24, 0).addBox(1.5F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		ModelRenderer Gears = new ModelRenderer(this);
		Gears.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(Gears);

		ModelRenderer Gear1 = new ModelRenderer(this);
		Gear1.setRotationPoint(1.25F, -5.25F, 0.0F);
		Gears.addChild(Gear1);
		Gear1.setTextureOffset(24, 1).addBox(-2.5F, -0.5F, 4.0F, 5.0F, 1.0F, 1.0F, -0.25F, false);
		Gear1.setTextureOffset(24, 1).addBox(0.5F, -1.5F, 4.0F, 1.0F, 3.0F, 1.0F, -0.25F, false);
		Gear1.setTextureOffset(24, 1).addBox(-1.5F, -1.5F, 4.0F, 1.0F, 3.0F, 1.0F, -0.25F, false);
		Gear1.setTextureOffset(24, 1).addBox(-0.5F, -2.5F, 4.0F, 1.0F, 5.0F, 1.0F, -0.25F, false);
		Gear1.setTextureOffset(24, 1).addBox(-1.5F, -1.5F, 4.0F, 3.0F, 1.0F, 1.0F, -0.25F, false);
		Gear1.setTextureOffset(24, 1).addBox(-1.5F, 0.5F, 4.0F, 3.0F, 1.0F, 1.0F, -0.25F, false);

		ModelRenderer GearsRot = new ModelRenderer(this);
		GearsRot.setRotationPoint(0.0F, 0.0F, 0.0F);
		Gear1.addChild(GearsRot);
		setRotationAngle(GearsRot, 0.0F, 0.0F, 0.7854F);
		GearsRot.setTextureOffset(24, 1).addBox(-0.5F, -2.5F, 4.0F, 1.0F, 5.0F, 1.0F, -0.25F, false);
		GearsRot.setTextureOffset(24, 1).addBox(-2.5F, -0.5F, 4.0F, 5.0F, 1.0F, 1.0F, -0.25F, false);

		ModelRenderer Gear2 = new ModelRenderer(this);
		Gear2.setRotationPoint(-1.5F, -2.5F, 0.0F);
		Gears.addChild(Gear2);
		setRotationAngle(Gear2, 0.0F, 0.0F, 0.3927F);
		Gear2.setTextureOffset(24, 1).addBox(-2.5F, -0.5F, 4.0F, 5.0F, 1.0F, 1.0F, -0.25F, false);
		Gear2.setTextureOffset(24, 1).addBox(0.5F, -1.5F, 4.0F, 1.0F, 3.0F, 1.0F, -0.25F, false);
		Gear2.setTextureOffset(24, 1).addBox(-1.5F, -1.5F, 4.0F, 1.0F, 3.0F, 1.0F, -0.25F, false);
		Gear2.setTextureOffset(24, 1).addBox(-0.5F, -2.5F, 4.0F, 1.0F, 5.0F, 1.0F, -0.25F, false);
		Gear2.setTextureOffset(24, 1).addBox(-1.5F, -1.5F, 4.0F, 3.0F, 1.0F, 1.0F, -0.25F, false);
		Gear2.setTextureOffset(24, 1).addBox(-1.5F, 0.5F, 4.0F, 3.0F, 1.0F, 1.0F, -0.25F, false);

		ModelRenderer GearsRot2 = new ModelRenderer(this);
		GearsRot2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Gear2.addChild(GearsRot2);
		setRotationAngle(GearsRot2, 0.0F, 0.0F, 0.7854F);
		GearsRot2.setTextureOffset(24, 1).addBox(-0.5F, -2.5F, 4.0F, 1.0F, 5.0F, 1.0F, -0.25F, false);
		GearsRot2.setTextureOffset(24, 1).addBox(-2.5F, -0.5F, 4.0F, 5.0F, 1.0F, 1.0F, -0.25F, false);

		ModelRenderer LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		bipedLeftArm.addChild(LeftArm);

		ModelRenderer Angle = new ModelRenderer(this);
		Angle.setRotationPoint(14.0F, -2.0F, 0.0F);
		LeftArm.addChild(Angle);
		setRotationAngle(Angle, 0.0F, 0.0F, -0.1745F);
		Angle.setTextureOffset(59, 10).addBox(-2.575F, -1.0F, -2.5F, 2.0F, 1.0F, 5.0F, -0.025F, false);
		Angle.setTextureOffset(60, 10).addBox(-1.575F, 0.0F, -2.5F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		Angle.setTextureOffset(60, 10).addBox(-2.0958F, 2.9544F, -2.5F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		ModelRenderer AngleBack = new ModelRenderer(this);
		AngleBack.setRotationPoint(13.5F, -2.0F, 0.0F);
		LeftArm.addChild(AngleBack);
		setRotationAngle(AngleBack, -0.1745F, 0.0F, 0.0F);
		AngleBack.setTextureOffset(63, 14).addBox(-5.0F, 3.4615F, -1.8653F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		AngleBack.setTextureOffset(63, 14).addBox(-5.0F, 0.5071F, -2.3863F, 5.0F, 3.0F, 1.0F, 0.0F, false);

		ModelRenderer AngleBack2 = new ModelRenderer(this);
		AngleBack2.setRotationPoint(13.5F, -2.675F, 3.7F);
		LeftArm.addChild(AngleBack2);
		setRotationAngle(AngleBack2, 0.1745F, 0.0F, 0.0F);
		AngleBack2.setTextureOffset(63, 14).addBox(-5.0F, 3.4848F, -2.8849F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		AngleBack2.setTextureOffset(63, 14).addBox(-5.0F, 0.5071F, -2.3863F, 5.0F, 3.0F, 1.0F, 0.0F, false);

		ModelRenderer RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		bipedRightArm.addChild(RightArm);

		ModelRenderer Angle2 = new ModelRenderer(this);
		Angle2.setRotationPoint(-14.0F, -2.0F, 0.0F);
		RightArm.addChild(Angle2);
		setRotationAngle(Angle2, 0.0F, 0.0F, 0.1745F);
		Angle2.setTextureOffset(59, 10).addBox(0.6712F, -1.0434F, -2.5F, 2.0F, 1.0F, 5.0F, -0.025F, false);
		Angle2.setTextureOffset(60, 10).addBox(0.5598F, 0.0045F, -2.5F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		Angle2.setTextureOffset(60, 10).addBox(1.0672F, 3.0315F, -2.5F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		ModelRenderer AngleBack3 = new ModelRenderer(this);
		AngleBack3.setRotationPoint(-8.5F, -2.0F, 0.0F);
		RightArm.addChild(AngleBack3);
		setRotationAngle(AngleBack3, -0.1745F, 0.0F, 0.0F);
		AngleBack3.setTextureOffset(63, 14).addBox(-5.0F, 3.4615F, -1.8653F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		AngleBack3.setTextureOffset(63, 14).addBox(-5.0F, 0.5071F, -2.3863F, 5.0F, 3.0F, 1.0F, 0.0F, false);

		ModelRenderer AngleBack4 = new ModelRenderer(this);
		AngleBack4.setRotationPoint(-8.5F, -2.675F, 3.7F);
		RightArm.addChild(AngleBack4);
		setRotationAngle(AngleBack4, 0.1745F, 0.0F, 0.0F);
		AngleBack4.setTextureOffset(63, 14).addBox(-5.0F, 3.4848F, -2.8849F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		AngleBack4.setTextureOffset(63, 14).addBox(-5.0F, 0.5071F, -2.3863F, 5.0F, 3.0F, 1.0F, 0.0F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}