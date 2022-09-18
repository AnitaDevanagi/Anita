package com.qac.corejava.oops.Inheritance.Relations;
import com.qac.corejava.oops.Inheritance.Relations.IS_aRelation.Cat;

public class Testanimal {
	
	public static void main(String[] args) {
		Cat c = new Cat();
		c.setname("Cat");
		c.setnoOflegs((byte)4);
		c.settail((byte)1);
		c.setstay("Forest");
		System.out.println(c.getname());
		System.out.println(c.getnoOflegs());
		System.out.println(c.gettail());
		System.out.println(c.getstay());
	}
}
