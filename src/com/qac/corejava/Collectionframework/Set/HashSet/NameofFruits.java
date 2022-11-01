package com.qac.corejava.Collectionframework.Set.HashSet;

import java.util.HashSet;

public class NameofFruits {
	public static void main(String[] args) {
	
		/* Sort the data based Hashcode */
		
		
		HashSet set = new HashSet();
		set.add("Banana");
		set.add("Orange");
		set.add("Pinaple");
		set.add("Apple");
		set.add("Kivi");
		set.add(null);
		
		System.out.println(set);
		
		set.remove("Pinaple");
		System.out.println(set);
		
		set.removeAll(set);
		System.out.println(set);
		
	
	}                          

}
