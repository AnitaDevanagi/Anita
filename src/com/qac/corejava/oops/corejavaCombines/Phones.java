package com.qac.corejava.oops.corejavaCombines;

public class Phones {
	
	int[] costperphone= {40000,30000,28000,25000};
	
	public static void main(String []args) {
		String ramRedmi="4gb";
		String ramLenovo ="4gb";
		
	    String[] names = new String[4]; 
		names[0]="iphone";
		names[1]="Lenovo";
		names[2]="Poco";
		names[3]="Redmi";
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		Phones cost = new Phones();
		for (int i=0; i<cost.costperphone.length;i++) {
			System.out.println(cost.costperphone[i]);
			
		}
		
		if(ramRedmi.equals(ramLenovo)) {
			System.out.println("The ram of Redmi and Lenovo are same");
			
		}
		
		else {
		System.out.println("The ram of Redmi and Lenovo are not same");
		}
		
	}

}
