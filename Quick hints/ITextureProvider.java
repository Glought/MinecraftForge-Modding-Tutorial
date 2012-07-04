/*

As you know many bugs happen because of missspelling something to prefent
this you should save things like paths,ids or or or
in variables


*/



//Example

//where you implement the ITextureProvider you add the method 

@Override
public String getTextureFile(){
	return "FILE";
}

// and you need to preload the texture in your mod_ file with

MinecraftForgeClient.preload("FILE");

//to prefent here missspelling of the path create a static final
//string

public static final String filePath = "FILE";

//and use this variable in your this 2 methods

@Override
public String getTextureFile(){
	return mod_FILE.filePath;
}

MinecraftForgeClient.preload(this.filePath);

//and you have a easy quick fix for missspelling things