package org.collection;
 import java.util.HashSet;
import java.util.Set;

public class Employee1 {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();//HashSet.....random order
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(400);
		s.add(300);// not allow duplicate
		s.add(null);
		s.add(null);//allow one null value
		s.add(500);
		s.add(600);
System.out.println("hashset print the element as random order:"+s);
	}

}
