package com.uniquemovement.util;

import net.minecraftforge.fml.common.Loader;

public class BaseModChecker {

	public static void checkForBaseMod() {

		if (!Loader.isModLoaded(Reference.BASE_MOD))
        {   
			System.out.println("===================================================================");
            System.out.println("====Papertazer Base not found. Unique Movement will not load.======");
            System.out.println("===================================================================");     
        }
        if (Loader.isModLoaded(Reference.BASE_MOD))
        {   
        	System.out.println("===================================================================");
        	System.out.println("===Papertazer Base was found. Unique Movement loaded no problem.===");
        	System.out.println("===================================================================");
        }
	}
}
