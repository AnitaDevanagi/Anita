package com.qac.corejava.MapKeyValuePairs.HashMap;

import java.util.HashMap;

public class Rollnumber {
	public static  void main(String[] args) {
	   HashMap map = new HashMap();
	   map.put(12,"Pallavi");
	   map.put(13,"Arun");
	   map.put(18, "Kavya");
	   map.put(19, "Spoorthi");
	   map.put(20, "Nidhi");
	   map.put(null,"Keerthi");
	   
	   System.out.println(map.get(12));
	   System.out.println(map.keySet());
	   System.out.println(map.values());
	   System.out.println(map.containsKey(12));
	   System.out.println(map.clone());
       System.out.println(map.hashCode());
       System.out.println(map.containsValue("Amith"));
	   System.out.println(map.isEmpty());
	   System.out.println(map.size());
	   System.out.println(map.entrySet());
	   System.out.println(map.toString());
	   System.out.println(map.remove(12, "Pallavi"));
	   System.out.println(map.remove(20));
	 
		
		
	}

}
