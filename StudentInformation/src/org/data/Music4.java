package org.data;

public class Music4 {
	public static void main(String[] args) {
		
		String E1 = "Green";
		String E2 = "Technology";
		
		System.out.println(System.identityHashCode(E1));
		System.out.println(System.identityHashCode(E2));
		
		E1= E1.concat(E2);
		System.out.println(System.identityHashCode(E1));
	}

}