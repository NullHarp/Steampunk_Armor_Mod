package com.nullharp.steampunk.armor;

// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.layers.BipedArmorLayer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class CopperHelmetModel extends BipedModel<LivingEntity> {
	private final ModelRenderer Head;
	private final ModelRenderer Eye;
	private final ModelRenderer PipesR;
	private final ModelRenderer PipesL;
	private final ModelRenderer Gears;
	private final ModelRenderer Gear1;
	private final ModelRenderer GearsRot;
	private final ModelRenderer Gear2;
	private final ModelRenderer GearsRot2;

	public CopperHelmetModel(float size) {
		super(size);
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedHead.addChild(Head);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.525F, false);
		Head.setTextureOffset(0, 0).addBox(1.75F, -5.625F, -4.75F, 1.0F, 1.0F, 1.0F, -0.2F, false);
		Head.setTextureOffset(32, 6).addBox(-3.5F, -4.25F, -6.0F, 7.0F, 7.0F, 3.0F, -2.0F, false);
		Head.setTextureOffset(49, 0).addBox(-3.475F, -4.25F, -5.175F, 7.0F, 7.0F, 2.0F, -1.9F, false);

		Eye = new ModelRenderer(this);
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

		PipesR = new ModelRenderer(this);
		PipesR.setRotationPoint(-2.75F, -2.25F, 0.5F);
		Head.addChild(PipesR);
		setRotationAngle(PipesR, 0.1745F, -0.0873F, 0.1309F);
		PipesR.setTextureOffset(24, 2).addBox(-3.0F, -1.0F, -6.0F, 3.0F, 1.0F, 1.0F, -0.25F, false);
		PipesR.setTextureOffset(24, 0).addBox(-3.5F, -1.0F, -6.0F, 1.0F, 1.0F, 6.0F, -0.25F, false);
		PipesR.setTextureOffset(24, 0).addBox(-3.5F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);
		PipesR.setTextureOffset(24, 2).addBox(-1.0F, -1.0F, -6.0F, 1.0F, 1.0F, 2.0F, -0.25F, false);

		PipesL = new ModelRenderer(this);
		PipesL.setRotationPoint(2.75F, -2.25F, 0.5F);
		Head.addChild(PipesL);
		setRotationAngle(PipesL, 0.1745F, 0.0873F, -0.1309F);
		PipesL.setTextureOffset(24, 2).addBox(0.0F, -1.0F, -6.0F, 1.0F, 1.0F, 2.0F, -0.25F, false);
		PipesL.setTextureOffset(24, 2).addBox(0.0F, -1.0F, -6.0F, 3.0F, 1.0F, 1.0F, -0.25F, false);
		PipesL.setTextureOffset(24, 0).addBox(2.5F, -1.0F, -6.0F, 1.0F, 1.0F, 6.0F, -0.25F, false);
		PipesL.setTextureOffset(24, 0).addBox(1.5F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		Gears = new ModelRenderer(this);
		Gears.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(Gears);
		

		Gear1 = new ModelRenderer(this);
		Gear1.setRotationPoint(1.25F, -5.25F, 0.0F);
		Gears.addChild(Gear1);
		Gear1.setTextureOffset(24, 1).addBox(-2.5F, -0.5F, 4.0F, 5.0F, 1.0F, 1.0F, -0.25F, false);
		Gear1.setTextureOffset(24, 1).addBox(0.5F, -1.5F, 4.0F, 1.0F, 3.0F, 1.0F, -0.25F, false);
		Gear1.setTextureOffset(24, 1).addBox(-1.5F, -1.5F, 4.0F, 1.0F, 3.0F, 1.0F, -0.25F, false);
		Gear1.setTextureOffset(24, 1).addBox(-0.5F, -2.5F, 4.0F, 1.0F, 5.0F, 1.0F, -0.25F, false);
		Gear1.setTextureOffset(24, 1).addBox(-1.5F, -1.5F, 4.0F, 3.0F, 1.0F, 1.0F, -0.25F, false);
		Gear1.setTextureOffset(24, 1).addBox(-1.5F, 0.5F, 4.0F, 3.0F, 1.0F, 1.0F, -0.25F, false);

		GearsRot = new ModelRenderer(this);
		GearsRot.setRotationPoint(0.0F, 0.0F, 0.0F);
		Gear1.addChild(GearsRot);
		setRotationAngle(GearsRot, 0.0F, 0.0F, 0.7854F);
		GearsRot.setTextureOffset(24, 1).addBox(-0.5F, -2.5F, 4.0F, 1.0F, 5.0F, 1.0F, -0.25F, false);
		GearsRot.setTextureOffset(24, 1).addBox(-2.5F, -0.5F, 4.0F, 5.0F, 1.0F, 1.0F, -0.25F, false);

		Gear2 = new ModelRenderer(this);
		Gear2.setRotationPoint(-1.5F, -2.5F, 0.0F);
		Gears.addChild(Gear2);
		setRotationAngle(Gear2, 0.0F, 0.0F, 0.3927F);
		Gear2.setTextureOffset(24, 1).addBox(-2.5F, -0.5F, 4.0F, 5.0F, 1.0F, 1.0F, -0.25F, false);
		Gear2.setTextureOffset(24, 1).addBox(0.5F, -1.5F, 4.0F, 1.0F, 3.0F, 1.0F, -0.25F, false);
		Gear2.setTextureOffset(24, 1).addBox(-1.5F, -1.5F, 4.0F, 1.0F, 3.0F, 1.0F, -0.25F, false);
		Gear2.setTextureOffset(24, 1).addBox(-0.5F, -2.5F, 4.0F, 1.0F, 5.0F, 1.0F, -0.25F, false);
		Gear2.setTextureOffset(24, 1).addBox(-1.5F, -1.5F, 4.0F, 3.0F, 1.0F, 1.0F, -0.25F, false);
		Gear2.setTextureOffset(24, 1).addBox(-1.5F, 0.5F, 4.0F, 3.0F, 1.0F, 1.0F, -0.25F, false);

		GearsRot2 = new ModelRenderer(this);
		GearsRot2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Gear2.addChild(GearsRot2);
		setRotationAngle(GearsRot2, 0.0F, 0.0F, 0.7854F);
		GearsRot2.setTextureOffset(24, 1).addBox(-0.5F, -2.5F, 4.0F, 1.0F, 5.0F, 1.0F, -0.25F, false);
		GearsRot2.setTextureOffset(24, 1).addBox(-2.5F, -0.5F, 4.0F, 5.0F, 1.0F, 1.0F, -0.25F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}