package net.minecraft.src.tutorial.metablock;

import net.minecraft.src.Block;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.Material; // Material class to give the block a material
import net.minecraft.src.StepSound;
import net.minecraft.src.World;
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

	//return the metadata of the block when it is dropped
	@Override
    protected int damageDropped(int metadata)
    {
        return metadata;
    }
	
	//with this function we can set diffrent textures on the sides and metadata
	//if we dont use this it will use for all side the textureID given in at the
	//constructor
	@Override
	public int getBlockTextureFromSideAndMetadata(int side, int metadata) {
		if(side == 0 || side == 1) //if side = top or side = bottom return 01 (Hexcode)
		{
			if(metadata == 1){ // of metadata = 1 return 04 (hexcode)
				return 04;
			}
			return 01;
		}
		//for all othersides return 00
		//or when metadata == 1 03
		if(metadata == 1){
			return 03;
		}
		return 00;
		
	}
	
	@Override
	public String getTextureFile(){
		return mod_XXX.blockPNG; //return the block texture where the block texture is saved in
	}
}
