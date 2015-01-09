package org.freeforums.geforce.beacon.network;

import java.util.HashMap;

public class Links {
	
	public static HashMap<String, String> webLinks = new HashMap<String, String>();
	public static HashMap<String, String> localMods = new HashMap<String, String>();
	public static HashMap<String, String> modAliases = new HashMap<String, String>();
	
	public static void setupLinks(){
		webLinks.put("cfm v3.4.6", "http://www.mrcrayfish.com/uploads/mods/furnituremod/MrCrayfishFurnitureModv3.4.6(1.7.10).jar");
                webLinks.put("securitycraft v1.6.1", "http://minecraft.curseforge.com/mc-mods/64760-securitycraft-mod/files/2217735/download");
	}
	
	public static void setupLocalMods(){}
	
	public static void setupAliases(){
		modAliases.put("cfm v3.4.6", "MrCrayfish's Furniture Mod v3.4.6");
	}
	
	public static String getLink(String mod){
		return webLinks.get(mod);
	}
	
	public static String getLocalModPath(String mod){
		return localMods.get(mod);
	}
	
	public static String getAlias(String mod){
		return modAliases.get(mod);
	}
	
	public static boolean hasWebLink(String mod){
		return webLinks.containsKey(mod);
	}
	
	public static boolean hasLocalMod(String mod){
		return localMods.containsKey(mod);
	}
	
	public static boolean hasAlias(String mod){
		return modAliases.containsKey(mod);
	}

	
}