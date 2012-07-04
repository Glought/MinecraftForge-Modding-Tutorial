package net.minecraft.src.tutorial.templates;

import net.minecraft.src.Block;
import net.minecraft.src.Material;
import net.minecraft.src.forge.ITextureProvider;

public class metablockXXX extends Block implements ITextureProvider {
	
	protected metablockXXX(int par1, int par2, Material par3Material) {
		super(par1, par2, par3Material);
	}
	
	@Override
	public int getBlockTextureFromSideAndMetadata(int side, int metadata) {
		
		return 00;
		
	}
	
	@Override
	protected int damageDropped(int metadata) {
		return metadata;
	}
}
