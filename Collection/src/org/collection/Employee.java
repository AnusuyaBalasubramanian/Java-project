package org.collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class Employee {
	public static void main(String[] args) {
	//diamond bracket integer = wrapper class used for similar datatypes
Set<Integer> s = new HashSet<>();// random order
			s.add(100);
			s.add(200);
			s.add(300);
			s.add(400);
System.out.println("hashset printthe element as random order:"+s);
Set<Integer> s1 = new LinkedHashSet<>();//insertion order
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(400);
System.out.println("LinkedHashSet printthe element as insertion order:"+s1);
		
Set<Integer> s2 = new TreeSet<>();//ascending order
				s.add(100);
				s.add(200);
				s.add(300);
				s.add(400);
System.out.println("LinkedHashSet printthe element as ascending order:"+s2);
}}