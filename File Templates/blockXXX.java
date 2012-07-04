package net.minecraft.src.tutorial.templates;

import net.minecraft.src.Block;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.Material; // Material class to give the block a material
import net.minecraft.src.StepSound;
import net.minecraft.src.World;
import net.minecraft.src.forge.ITextureProvider;

public class blockXXX extends Block implements ITextureProvider {

	protected blockXXX(int blockID, int textureID) {
		super(blockID, textureID, Material.wood);
	}
	
	@Override
	public int getBlockTextureFromSide(int side) {
		
		return 00;
		
	}
	
	@Override
	public String getTextureFile(){
		return mod_XXX.blockPNG; 
	}
}
