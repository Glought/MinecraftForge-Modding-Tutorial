package net.minecraft.src.tutorial;

//Java imports
import java.io.File;
import java.io.IOException;

//minecraft imports
import net.minecraft.client.Minecraft; // needed to get the .minecraft folder
import net.minecraft.src.forge.Configuration; //configuration class

public class Props {

	//Configuration, used for save and load data
	public static Configuration config;
	
	public static int iXXXID;
	
	//Initialization of the config
	// Args: String mod used to name the config file to mods name
	public static void initProps(String mod){
		
		//creating a folder for the mod in the folder config within the .minecraft folder
		File file = new File(Minecraft.getMinecraftDir() + "/config/" + mod);
		file.mkdir(); //creates the folder
		//getting the config file
		File newFile = new File(Minecraft.getMinecraftDir() + "/config/" + mod + "main.cfg");
		
		//try to create the config file
		try{
			newFile.createNewFile(); //creating the file
			System.out.println("Successfully created/read configuration file"); //on success print message
		}
		//if creation fails print error message
		catch(IOException e){
			System.out.println("Could not create configuration file for mod_HelloWorld. Reason:");
			System.out.println(e);
		}
		
		//allocate the file to the config
		config = new Configuration(newFile);
		
		//load data
		config.load();
		/********************************/
		//here you add all configurations like BlockIDs ItemIDs or other settings

		iXXXID = config.getOrCreateIntProperty("itemXXX", "item", 6000).getInt(6000);
		/*******************************/
		//save the data
		config.save();
	}
	
}

