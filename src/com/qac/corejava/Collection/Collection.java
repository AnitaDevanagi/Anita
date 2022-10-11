package com.qac.corejava.Collection;

import java.util.ArrayList;

public class Collection {
	public static void main(String [] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Ankita");
	    name.add("Pooja");
	    name.add("Kiran");
	    name.add("Adhi");
	    name.add("Keerthi");
	    System.out.println(name);
	    System.out.println(name.get(3));
	    
	    name.add(1,"pruthvi");
	    System.out.println(name);
	    
	    name.remove(2);
	    System.out.println(name);
	    
		
}
}
