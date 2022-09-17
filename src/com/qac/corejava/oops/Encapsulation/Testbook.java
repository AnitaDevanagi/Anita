package com.qac.corejava.oops.Encapsulation;

public class Testbook {
	public static void main(String [] args) {
		Book a = new Book();
		a.setname("Wings of Fire");
		a.setauthors("A P J Abdul Kalam, ‎Arun Tiwari");
		a.setyear(1999);
		short c=180;
		a.setpages(c);
		a.setpublisher("Universities Press");
		a.settype("Autobiography");
		a.print();
	}
	
}



