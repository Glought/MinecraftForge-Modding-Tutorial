package net.minecraft.src.tutorial;

import net.minecraft.src.Item;
import net.minecraft.src.forge.ITextureProvider;

public class itemXXX extends Item implements ITextureProvider {

	protected itemXXX(int itemID) {
		super(itemID); //calling the super contructor and giing him the itemID so minecraft knows the itemID
		maxStackSize = 32; //represents the max StackSize, max for this item is 32. It cant be Higher then 64
		setMaxDamage(0);
	}
	
	// this method is needed to use the sprite system from forge
	@Override
	public String getTextureFile(){
		return "/tutorialtextures/items.png"; // return the texture file where the icon is in
	}

}
