package com.qac.corejava.Collectionframework.Set.HashSet.LinkedHashset;

import java.util.LinkedHashSet;

public class Birds {
	public static void main(String[] args) {
		
	LinkedHashSet set = new LinkedHashSet();
	set.add("parrot");
	set.add("Pigeon");
	set.add("Ostrich");
	set.add("Swan");
	set.add("Hornbill");
	
	System.out.println(set);
	System.out.println(set.equals(set));
	System.out.println(set.isEmpty());
	System.out.println(set.toString());
	System.out.println(set.contains("Swan"));
	
	
	}
}
