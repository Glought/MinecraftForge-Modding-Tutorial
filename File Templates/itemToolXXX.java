package net.minecraft.src.tutorial.templates;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemPickaxe;
import net.minecraft.src.forge.ITextureProvider;

public class itemToolXXX extends ItemPickaxe implements ITextureProvider {

	protected itemToolXXX(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
	}
	
	@Override
	public String getTextureFile(){
		return "/tutorialtextures/items.png";
	}

}
