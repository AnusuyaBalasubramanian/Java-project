package org.collection;

import java.util.ArrayList;
import java.util.List;

public class Collection6 {
public static void main(String[] args) {
		List<Integer> s1= new ArrayList<Integer>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(60);
		s1.add(70);
		System.out.println(s1);
		s1.remove(2);
System.out.println("Remove the value present at 2nd index position ="+s1);
		List<Integer> s2= new ArrayList<Integer>();
		s2.add(10);
		s2.add(20);
		s2.add(30);
		s2.add(90);
		s2.add(10);
		s2.add(10);
		s2.add(40);
		System.out.println(s2);
	
s2.remove(5);
System.out.println("Remove the value present last at 10nd values ="+s2);
}}
