package net.minecraft.src.tutorial.metablock;

import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class itemblockXXX extends ItemBlock {

	public itemblockXXX(int blockID) {
		super(blockID);
	}
	
	//returns the metadata of the block
	@Override
	public int getMetadata(int metadata)
	{
		return metadata;
	}
	
	// This is for your naming of the metablock
	private static final String blockNames[] =
	{
		"XXX", "XXX2"
	};
	
	@Override
	public String getItemNameIS(ItemStack itemstack){
		//this returns a string with the block name
		//example: blockXXX
		return new StringBuilder().append("block").append(blockNames[itemstack.getItemDamage()]).toString();
	}
}

