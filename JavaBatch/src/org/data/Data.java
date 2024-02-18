package org.data;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Data {
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> mp= new LinkedHashMap<>();
		
		mp.put(10, 100);
		mp.put(20, 200);
		mp.put(30, null);
		mp.put(40, 300);
		mp.put(null, 400);
		mp.put(10, 500);
		mp.put(400, 30);
		
		System.out.println(mp);
		
		Set<Integer> keyset = mp.keySet();
		System.out.println(keyset);
		
		for (Integer entry : keyset) {
			System.out.println(entry);
			
		}
	}
	

}
