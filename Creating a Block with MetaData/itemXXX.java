package net.minecraft.src.tutorial.metablock;

import net.minecraft.src.Item;
import net.minecraft.src.forge.ITextureProvider; //Handler for the Textures

public class itemXXX extends Item implements ITextureProvider {

	protected itemXXX(int itemID) {
		super(itemID); //calling the super contructor and giing him the itemID so minecraft knows the itemID
		maxStackSize = 32; //represents the max StackSize, max for this item is 32. It cant be Higher then 64
	}
	
	// this method is needed to use the sprite system from forge
	@Override
	public String getTextureFile(){
		return mod_XXX.itemPNG; // return the texture file where the icon is in
	}

}
