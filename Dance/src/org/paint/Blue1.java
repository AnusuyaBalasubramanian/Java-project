package org.paint;

public class Blue1 {
	//4) mutable string
	public static void main(String[] args) {
	StringBuffer s1 = new StringBuffer("Testing");
	StringBuffer s2 = new StringBuffer("Program");
	StringBuffer s3 =new StringBuffer("Java");
	
	
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
	System.out.println(System.identityHashCode(s3));
	
	
	s1 = s1.append(s2);
	s2 = s2.append(s1);
	
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
	
	}
}
