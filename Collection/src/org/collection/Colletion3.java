package org.collection;
import java.util.ArrayList;
import java.util.List;
public class Colletion3 {
	public static void main(String[] args) {
		List<Integer> s1 = new ArrayList<Integer>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(90);
		s1.add(10);
		s1.add(10);
		s1.add(40);
		s1.add(50);
		System.out.println(s1);// lastIndof
		int s2 = s1.lastIndexOf(10);
System.out.println("element 10 thelastindexof the index position= "+s2);

int s3 = s1.indexOf(10);// Indeof
System.out.println("element 10 indexof the fridt position= " +s3);
}}


