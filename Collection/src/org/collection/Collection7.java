package org.collection;

import java.util.ArrayList;
import java.util.List;
public class Collection7 {
	public static void main(String[] args) {
		List<Integer> s1= new ArrayList<Integer>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(90);
		s1.add(10);
		s1.add(10);
		s1.add(40);
		s1.add(50);
		System.out.println(s1);
		s1.add(2, 50);
		System.out.println("Add a value 50 in the 2nd index =" +s1);
		s1.add(7, 70);
		System.out.println("Add a value 70 at the end of the list= "+s1);
		s1.add(8, 80);
		System.out.println("Add a value 80 at the 8th index of list= "+s1);
		s1.add(10, 100);
		System.out.println("Add a value 100 at the last index of 10 in the list= "+s1);
	}}
