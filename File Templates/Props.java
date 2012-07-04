package net.minecraft.src.tutorial.templates;

import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft; 
import net.minecraft.src.forge.Configuration; 

public class Props {

	public static Configuration config;

	
	public static void initProps(String mod){
		
		File file = new File(Minecraft.getMinecraftDir() + "/config/" + mod);
		file.mkdir();
		File newFile = new File(Minecraft.getMinecraftDir() + "/config/" + mod + "main.cfg");
		
		try{
			newFile.createNewFile();
			System.out.println("Successfully created/read configuration file");
		}
		catch(IOException e){
			System.out.println("Could not create configuration file for mod_HelloWorld. Reason:");
			System.out.println(e);
		}
		
		config = new Configuration(newFile);
		
		config.load();
		/********************************/
		//Props.config.CATEGORY_ITEM item category
		//Props.config.CATEGORY_BLOCK block category
		//Props.config.CATEGORY_GENERAL general category
		
		
		/*******************************/
		//save the data
		config.save();
	}
	
}

