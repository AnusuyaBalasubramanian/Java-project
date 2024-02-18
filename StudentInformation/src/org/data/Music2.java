package org.data;

public class Music2 {
	public static void main(String[] args) {
		String A1 = new String("Nisha");
		String A2 = new String("Rengan");
		String A3 = new String("NishaRengan");
		
		System.out.println(System.identityHashCode(A1));
		System.out.println(System.identityHashCode(A2));
		System.out.println(System.identityHashCode(A3));
		}
}
