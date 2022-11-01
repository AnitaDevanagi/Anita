package com.qac.corejava.Collectionframework.Set.SortSet.TreeSet;

import java.util.TreeSet;

public class StudentNames {
    public static void main(String[] args) {
    	
       /* sort the data based on Alphabetical  order (Ascending order)*/ 
		TreeSet<String> set = new TreeSet<String>();
		set.add("Pallavi");
		set.add("Keerthi");
		set.add("Lavanya");
		set.add("Ravi");
		set.add("Amulya");
		set.add("Swapna");
		
		System.out.println(set);
		System.out.println(set.descendingSet());
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
		System.out.println(set.spliterator());
		System.out.println(set.descendingIterator());
		
		set.remove("Ravi");
		System.out.println(set);
	   }   
}
