package net.minecraft.src.tutorial.templates;

import net.minecraft.src.Item;
import net.minecraft.src.forge.ITextureProvider;

public class itemXXX extends Item implements ITextureProvider {

	protected itemXXX(int itemID) {
		super(itemID);
	}
	
	@Override
	public String getTextureFile(){
		return mod_XXX.itemPNG; 
	}

}
