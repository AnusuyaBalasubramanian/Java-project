package org.paint;

public class Black1 {
	//3) immutable string
	// syntax.....s1.concat(s2);......s1= s1.concat(s2)
	public static void main(String[] args) {
	String s1 = "Testing";
	String s2 = "Program";
	String s3 = "Java";
	String s4 = "System";
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
	System.out.println(System.identityHashCode(s3));
	System.out.println(System.identityHashCode(s4));
	
	s1 = s1.concat(s2);
	s2 = s2.concat(s1);
	s3 = s3.concat(s4);
	s4 = s4.concat(s3);
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
	System.out.println(System.identityHashCode(s3));
	System.out.println(System.identityHashCode(s4));
	
	
	
	}

}
