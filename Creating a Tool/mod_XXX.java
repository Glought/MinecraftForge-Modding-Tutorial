package net.minecraft.src.tutorial;

import net.minecraft.src.BaseMod;
import net.minecraft.src.Block;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.forge.EnumHelper;
import net.minecraft.src.forge.MinecraftForgeClient;

//each mod needs to have a class with the name mod_ infront of the name
public class mod_XXX extends BaseMod {
	
	public static Item itemXXX; // our item we want to create with a recipe
	public static Item itemtoolXXX; // our tool we want to create
	
	public static final String itemPNG = "/tutorialtextures/items.png";
	
	// Forge Hook to add own Tools types
	// Params String name, int harvestLevel, int maxUses, float efficiency, int damage, int enchantability
	static EnumToolMaterial materialStick = EnumHelper.addToolMaterial("STICK", 1, 180, 10.0F, 1, 7);
	@Override
	public String getVersion() {
		return "0.0.1"; // returns the version number as String
	}

	@Override
	public void load() {
		MinecraftForgeClient.preloadTexture(this.itemPNG);
		this.addNames(); //adding all names
		this.registerRecipes(); //register all recipes
	}
	
	//private method for proper source
	private void addNames(){
		//this have to be called so modloader knows the itemname and can add it to minecraft
		
		ModLoader.addName(itemtoolXXX, "Tool XXX");
		ModLoader.addName(itemXXX, "Item XXX");
	}
	
	private void registerRecipes(){
		
		// Adding a Shaped recipe for our item
		// we get 2 itemXXX from this recipe
		ModLoader.addRecipe(new ItemStack(itemXXX, 2), new Object[] 
		{
			//the first 3 strings are your recipe in the craftingtable
			//the char 'X' is set to be a Item.Stick
			//and the char '+' ist set to be Block.Cobblestone
			//so our item will me maked out of 6 cobblestone and 1 stick
			"X X", "X+X", "X X", 'X', Item.stick, '+', Block.cobblestone
		});
		ModLoader.addRecipe(new ItemStack(itemtoolXXX, 1), new Object[] 
				{
					//the first 3 strings are your recipe in the craftingtable
					//the char 'X' is set to be a Item.Stick
					//and the char '+' ist set to be Block.Cobblestone
					//so our item will me maked out of 6 cobblestone and 1 stick
					"XXX", " + ", " + ", 'X', itemXXX, '+', Block.cobblestone
				});
	}
	
	static {
		Props.initProps("XXX"); //Init the Config with the Name XXX
		
		//new blockXXX  | Getting the blockID from the config 
		//setBlockName  | sets the blockName will be overwritten by modloader because we use metadatas
		itemXXX = new itemXXX(Props.iXXXID).setItemName("item XXX").setIconCoord(1, 0);
		
		// our tool the second param is the tool material we created above
		itemtoolXXX = new itemToolXXX(Props.itXXXID, materialStick).setItemName("Tool XXX").setIconCoord(0, 0);
	}
}
