package org.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class Employee6 {
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> Mp = new LinkedHashMap<Integer, Integer>();
		
		Mp.put(10, 10);
		Mp.put(20, 20);
		Mp.put(30, 30);
		Mp.put(40, 40);
		Mp.put(50, 50);
		Mp.put(60, 60);
		Mp.put(10, 10);
		Mp.put(50, 50);
		Mp.put(40, 40);
		
		System.out.println(Mp);
		
		
	}

	
	
	
}