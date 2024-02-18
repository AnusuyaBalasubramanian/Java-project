package org.collection;
import java.util.ArrayList;
import java.util.List;
public class Collection4 {
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
		Integer a1 = s1.get(7);
System.out.println("To get the element in the given index= "+a1);
		Integer a2 = s1.get(3);
System.out.println("To get the element in the given index= "+a2);
        
	boolean a3 = s1.contains(10);
System.out.println("to get the value present or not= "+a3);
         boolean a4 = s1.contains(70);
  System.out.println("to get the value present or not= "+a4);
}}