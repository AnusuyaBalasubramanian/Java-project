package org.collection;

import java.util.HashSet;
import java.util.Set;

public class Employee2 {
	public static void main(String[] args) {
Set<Integer> s = new HashSet<>();//HashSet.....random order
		s.add(2);
		s.add(4);
		s.add(8);
		s.add(10);
		s.add(12);
		s.add(14);
Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(3);
        s1.add(5);
        s1.add(6);
        s1.add(7);
        s1.add(2);
        s1.add(4);
   s.retainAll(s1);//retain common element
System.out.println("retain common element from s1 and s to s:"+s);
   System.out.println(s1);
    //removeAll() it remove the common ele in distination list
   s.removeAll(s1);
   System.out.println(s);
   //equals(obj) ...to check 2 lists are equal or not
   boolean equals = s.equals(s1);
   System.out.println(equals);
   //addall....add all the ele from sto s1
   s1.addAll(s);
   System.out.println(s1);
   System.out.println(s);
        
}}
