package net.minecraft.src.tutorial;

import net.minecraft.src.BaseMod; 

//each mod needs to have a class with the name mod_ infront of the name
public class mod_XXX extends BaseMod {
	
	@Override
	public String getVersion() {
		return "0.0.1"; // returns the version number as String
	}

	@Override
	public void load() {
		
	}

	static {
		Props.initProps("XXX"); //Init the Config with the Name XXX
	}
}
