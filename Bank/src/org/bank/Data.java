package org.bank;
import java.util.LinkedHashSet;
import java.util.Set;
public class Data {
	public static void main(String[] args) {//set
Set<Integer> s = new LinkedHashSet<>();// synatx
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(null);
		s.add(50);
		s.add(null);
Set<Integer> s1 = new LinkedHashSet<>();
		s1.add(100);
		s1.add(200);
		s1.add(300);
		s1.add(400);
		s1.add(null);
		s1.add(50);
		s1.add(40);
//1)retainall()....to retain the common element.....
		s.retainAll(s1);
		System.out.println("retain the common element s and s1= "+s);
		System.out.println(s1);
//2)removeAll().......it remove the common element in destion 
		s.removeAll(s1);
		System.out.println(s1);
		System.out.println(s);
//3)equa(object)......to check 2 listl equal or not
		boolean equals = s.equals(s1);
		System.out.println(equals);
//4)addall(colection).....to add all the element from one collection to another
		 s.addAll(s1);
		System.out.println(s1);
		System.out.println(s);
//5)contains(element).....used to check element present or not
		boolean contains = s.contains(100);
		System.out.println(contains);
		
	}

}