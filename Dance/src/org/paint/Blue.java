package org.paint;

public class Blue {
	
	public static void main(String[] args) {
//1) literal string ....
		
	String s1 = "testing";
	String s2 = "testing";
	String s3 = "xecel";
	
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
	System.out.println(System.identityHashCode(s3));
	}

	
}
