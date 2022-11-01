package com.qac.corejava.Collectionframework.List.ArrayList;

import java.util.ArrayList;

public class Employeedetails {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Amulya");
		list.add("Infosys");
		list.add(45000);
		list.add("Bangalore");
		
		ArrayList list1 = new ArrayList();
		list1.add("Sharath");
		list1.add("Wipro");
		list1.add(55000);
		list1.add("Bangalore");
		
		list.addAll(list1);
	    System.out.println(list);
	  
	  ArrayList<Integer> list2 = new ArrayList<Integer>();
	  list2.add(101);
	  list2.add(123);
	  list2.add(113);
	  list2.add(160);
	  list2.add(180);
	  System.out.println(list2);
	  System.out.println(list2.size());
	  System.out.println(list2.lastIndexOf(list2));
	  System.out.println(list2.isEmpty());
	  System.out.println(list2.toString());
	  System.out.println(list2.remove(1));
	  
	  
	  
	  
	  
	}
	
	}