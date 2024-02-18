package org.data;

public class Music5 {
public static void main(String[] args) {
	StringBuffer R1 = new StringBuffer("Green");
	StringBuffer R2 = new StringBuffer("technology");
	
	System.out.println(System.identityHashCode(R1));
	System.out.println(System.identityHashCode(R2));
	
	R1 = R1.append(R2);
	System.out.println(System.identityHashCode(R1));
	
	
}
}
