package com.qac.corejava.oops.corejavaCombines;

public class TestTv {
	public static void main(String [] args) {
		Panasonic panasonic = new Panasonic ();
		panasonic.screentype="LED";
		panasonic.issmartTv=true;
	  System.out.println(panasonic.screentype);
	  System.out.println(panasonic.issmartTv);
	  System.out.println(Tv.name);
	  System.out.println(Tv.cost );
	  panasonic.powercomsumption();
	  panasonic.watch();
	}

}
