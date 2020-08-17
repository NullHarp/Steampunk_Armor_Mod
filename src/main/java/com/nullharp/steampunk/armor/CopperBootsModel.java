package com.nullharp.steampunk.armor;

// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class CopperBootsModel extends BipedModel<LivingEntity> {
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public CopperBootsModel(float size) {
		super(size);
		textureWidth = 128;
		textureHeight = 128;

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(0, 32).addBox(-7.0F, 8.75F, -4.0F, 6.0F, 4.0F, 7.0F, -0.45F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(0, 32).addBox(1.0F, 8.75F, -4.0F, 6.0F, 4.0F, 7.0F, -0.45F, false);

		this.bipedLeftLeg.addChild(this.LeftLeg);
		this.bipedRightLeg.addChild(this.RightLeg);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}