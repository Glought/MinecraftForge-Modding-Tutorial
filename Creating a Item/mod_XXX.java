package net.minecraft.src.tutorial;

import net.minecraft.src.BaseMod; //BaseMod
import net.minecraft.src.Item; // the item class
import net.minecraft.src.ModLoader; //ModLoader

//each mod needs to have a class with the name mod_ infront of the name
public class mod_XXX extends BaseMod {
	
	public static Item itemXXX; // Our item we want to create
	
	@Override
	public String getVersion() {
		return "0.0.1"; // returns the version number as String
	}

	@Override
	public void load() {
		this.addNames(); //adding all names
	}

	//private methd for proper source
	private void addNames(){
		//this have to be called so modloader knows the itemname and can add it to minecraft
		ModLoader.addName(itemXXX, "XXX"); //Sets the itemname fpr itemXXX to XXX
	}
	
	static {
		Props.initProps("XXX"); //Init the Config with the Name XXX
		
		//new itemXXX  | Getting the itemID from the config 
		//setIconCoord | set the position of the itemIcon in the texturefile Args x, y
		//setItemName  | sets the itemName
		itemXXX = new itemXXX(Props.iXXXID).setIconCoord(0, 0).setItemName("XXX");
	}
}
