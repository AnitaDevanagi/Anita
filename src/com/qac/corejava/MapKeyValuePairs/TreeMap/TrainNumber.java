package com.qac.corejava.MapKeyValuePairs.TreeMap;

import java.util.TreeMap;

public class TrainNumber {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put(14722,"Abohar Jodhpur Express");
		map.put(19038, "Avadh Express");
		map.put(12947, "Azimabad Express");
		map.put(12507,"Aroni express");
		map.put(12048, "Shatabdi Express");
		map.put(13908,"Channai Express");
		map.put(15678,"Mumbai Express");
		
		
		
		System.out.println(map.get(12048));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.containsKey(15678));
		System.out.println(map.containsValue("Udyan Express"));
		System.out.println(map.firstKey());
		System.out.println(map.hashCode());
		System.out.println(map.lastKey());
		System.out.println(map.size());
		System.out.println(map.pollFirstEntry());
		System.out.println(map.pollLastEntry());
		System.out.println(map.navigableKeySet());
		System.out.println(map.comparator());
		
		
	}

}
