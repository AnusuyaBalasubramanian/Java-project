
package org.data;

import java.util.ArrayList;
import java.util.List;

public class Collection2 {
	public static void main(String[] args) {
		
List<Integer> k = new ArrayList<Integer>();
				 
		k.add(10);
		k.add(20);
		k.add(30);
		k.add(90);
		k.add(10);
		k.add(10);
		k.add(40);
		k.add(50);
		k.add(10);
		
System.out.println(k);
k.set(7, 90);
System.out.println("replace the element 50 to 90"
		+ " in the 7th index = "+k);
		
	}}
