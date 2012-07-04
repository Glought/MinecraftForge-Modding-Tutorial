package net.minecraft.src.tutorial.templates;

import net.minecraft.src.BaseMod;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.forge.MinecraftForgeClient;

public class mod_XXX extends BaseMod {
		
	public static final String itemPNG = "/XXX/items.png";
	public static final String blockPNG = "/XXX/blocks.png";
	
	@Override
	public String getVersion() {
		return "0.0.1"; 
	}

	@Override
	public void load() {
		MinecraftForgeClient.preloadTexture(this.blockPNG);
		MinecraftForgeClient.preloadTexture(this.itemPNG);
		this.registerBlocks(); 
		this.addNames(); 
		this.registerRecipes(); 
	}
	
	private void registerBlocks() {
	}
	
	private void addNames(){
		
	}
	
	private void registerRecipes(){
		
	}
	
	static {
		Props.initProps("XXX"); 
	}
}
