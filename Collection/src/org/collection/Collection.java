package org.collection;

import java.util.ArrayList;
import java.util.List;

public class Collection {
	public static void main(String[] args) {
		 
List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		li.add(30);
		
System.out.println(li);
		li.set(5, 100);
		li.set(4, 100);
		
System.out.println("replace the
 element 10 tp 100 in the 4th and 5th index ="+li);
		
		
		
	}
}