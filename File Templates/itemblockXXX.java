package net.minecraft.src.tutorial.templates;

import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class itemblockXXX extends ItemBlock {

	public itemblockXXX(int blockID) {
		super(blockID);
	}
	
	@Override
	public int getMetadata(int metadata)
	{
		return metadata;
	}
	
	private static final String blockNames[] =
	{
		"XXX", "XXX2"
	};
	
	@Override
	public String getItemNameIS(ItemStack itemstack){
		return new StringBuilder().append("block").append(blockNames[itemstack.getItemDamage()]).toString();
	}
}

