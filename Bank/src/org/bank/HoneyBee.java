package org.bank;
import java.util.ArrayList;
import java.util.List;
public interface HoneyBee {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();//syntax
//1) add(element).....to add the element in to the list
		li.add(10);//0
		li.add(20);//1
		li.add(30);//2
		li.add(40);//3
		li.add(50);//4
		li.add(40);//5
		
System.out.println("to add the all the elementin the list ="+li);
//2)get(index)........to get the element present in the particular index position		
		Integer s1 = li.get(4);
		System.out.println("to get element in the given index ="+s1);
//3)indexof(element).......to return the first accurence index position of given element
		int s2 = li.indexOf(40);
		System.out.println("get the (1 st occurance) of given element ="+s2);
//4)lastindexof(element)....to retun the last occurence index position given element
		int s3 = li.lastIndexOf(40);
		System.out.println("get the (last occurance) of given element =" + s3);
//5)isempty().......to check list is empty or not
		boolean empty = li.isEmpty();
		System.out.println("to check list is empty or not ="+empty);
//6)add(index,element)....to add the element into the list.in the particular index position
		li.add(6, 60);
		System.out.println(li);
//7)set(index,element),,,,,to replace the element present in the particular index position
		li.set(6, 78);
		System.out.println(li);
//8)remove(index).....to remove the given element
		li.remove(6);
		System.out.println(li);
		
		
	}

	
}
