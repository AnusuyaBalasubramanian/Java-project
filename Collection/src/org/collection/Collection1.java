package org.collection;

import java.util.ArrayList;
import java.util.List;

public class Collection1  {
	public static void main(String[] args) {
List<Integer>li = new ArrayList<>();
	
	li.add(100);
	li.add(200);
	li.add(300);
	li.add(400);
	li.add(500);
	li.add(600);
	li.add(700);
	
	System.out.println(li);
	li.set(2, 350);
System.out.println("replace the element 300 to 350 in the 5th index =" +li);



}}
