package com.qac.corejava.Collectionframework.List.LinkedList;

import java.util.LinkedList;

public class CarNames {
       public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("TATA");
		list.add("Mahindra");
		list.add("Marithi Baleno");
		list.add("Kia");
	
		
		System.out.println(list);
		System.out.println(list.clone());
		System.out.println(list.contains("Kia"));
		System.out.println(list.element());
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.remove());
		
		
		list.remove(0);
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
	}
       
       
}
