package org.bank;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public interface Employee {
	public static void main(String[] args) {
//hashset()...random order print 
		Set<Integer> s = new HashSet<>();
		s.add(10);
		s.add(10);// set not allow duplicate
		s.add(20);
		s.add(30);
		s.add(null);
		s.add(null);// allow one null value
		s.add(40);
		System.out.println("hashset print rondom order="+s);
		System.out.println();
	//liknedhashset().....insertion order
	Set<Integer>s1 = new LinkedHashSet<>();
	s1.add(100);
	s1.add(200);
	s1.add(900);
	s1.add(400);
	s1.add(400);
	s1.add(30);
	s1.add(4);
	System.out.println(s1);
//treeset()....ascending order print
	Set<Integer>s2 = new TreeSet<>();
	s2.add(100);
	s2.add(200);
	s2.add(900);
	s2.add(400);
	s2.add(3);
	s2.add(30);///s2.add(null)....treeset not allow null...null point exception 
	s2.add(4);
	System.out.println(s2);
		
		
	

}
}