package com.qac.corejava.oops.corejavaCombines;

public class TestButterfly {
	public static void main(String [] args) {
		Monarch monarch=new Monarch();
		monarch.setScientificname("Danausn plexippus");
		monarch.setHabitate("Grassland");
		monarch.setName(" Monarch");
		monarch.setSize((byte)4);
		
		System.out.println(monarch.getScientificname());
		System.out.println(monarch.getHabitate());
		System.out.println(monarch.getName());
		System.out.println(monarch.getSize());
		
		monarch.eat();
		monarch.fly();
			
	  }
}

