package org.collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Collection5 {
	public static void main(String[] args) {
		List<Integer> s1 = new ArrayList<Integer>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(50);
		s1.add(60);
		System.out.println(s1);
		Integer a1 = s1.get(2);
System.out.println("Get the value present at 2nd index= "+a1);
		List<Integer> s2 = new LinkedList<Integer>();
				s2.add(100);
				s2.add(200);
				s2.add(300);
				s2.add(400);
				s2.add(500);
				s2.add(600);
				s2.add(700);
				System.out.println(s2);
				Integer a2 = s2.get(4);
	System.out.println("Get the value present at 4nd index= "+a2);
				List<Integer> s3 = new ArrayList<Integer>();
				s3.add(105);
				s3.add(205);
				s3.add(305);
				s3.add(405);
				s3.add(505);
				s3.add(605);
				s3.add(705);
				System.out.println(s3);
				Integer a3 = s3.get(8);
	System.out.println("Get the value present at 4nd index= "+a3);
	}}
