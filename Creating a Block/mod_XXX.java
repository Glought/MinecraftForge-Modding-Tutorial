package net.minecraft.src.tutorial;

import net.minecraft.src.BaseMod;
import net.minecraft.src.Block;
import net.minecraft.src.ModLoader;

//each mod needs to have a class with the name mod_ infront of the name
public class mod_XXX extends BaseMod {
	
	public static Block blockXXX; // Our block we want to create
	@Override
	public String getVersion() {
		return "0.0.1"; // returns the version number as String
	}

	@Override
	public void load() {
		this.registerBlocks();
		this.addNames(); //adding all names
	}
	
	//private method for proper source
	private void registerBlocks() {
		//ModLoader needs to know that you want to add a block to the game
		ModLoader.registerBlock(blockXXX);
	}
	
	//private method for proper source
	private void addNames(){
		//this have to be called so modloader knows the itemname and can add it to minecraft
		ModLoader.addName(blockXXX, "Block XXX"); //Sets the blockname for blockXXX to Block XXX
	}
	
	static {
		Props.initProps("XXX"); //Init the Config with the Name XXX
		
		//new blockXXX  | Getting the blockID from the config 
		//setBlockName  | sets the blockName
		blockXXX = new blockXXX(Props.bXXXID, 0).setBlockName("Block XXX");
	}
}
