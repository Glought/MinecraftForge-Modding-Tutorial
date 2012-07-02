package net.minecraft.src.tutorial;

import net.minecraft.src.Block;
import net.minecraft.src.Material; // Material class to give the block a material
import net.minecraft.src.StepSound;
import net.minecraft.src.forge.ITextureProvider;

public class blockXXX extends Block implements ITextureProvider {

	protected blockXXX(int blockID, int textureID) {
		// setting the blockID and the default textureID
		// giving this block the Material.wood
		super(blockID, textureID, Material.wood);
		setHardness(3.1F); //sets the hardness, represents the amount of hits it needs to break
		setResistance(0.3F); //sets the resistance of the block
		setLightValue(10); //sets the lighvalue of the block so it acts like glowstone
		setStepSound(soundWoodFootstep); //sets the sound which is played when a entity runs over it
		//setBlockUnbreakable() //if you want that the block is unbreakable call this functions
	}

	//with this function we can set diffrent textures on the sides
	//if we dont use this it will use for all side the textureID given in at the
	//constructor
	@Override
	public int getBlockTextureFromSide(int side) {
		// We want the texture next to our default texture from this block for the bottom and top side
		// so we just add 1 when the side is 0 or 1 else we return the default one
		switch(side){
		case 0: // -Y (bottom side)
			return this.blockIndexInTexture + 1;
		case 1: // +Y (top side)
			return this.blockIndexInTexture + 1;
		}
		return this.blockIndexInTexture;
		
	}
	
	@Override
	public String getTextureFile(){
		return "/tutorial/blocks.png"; //return the block texture where the block texture is saved in
	}
}
