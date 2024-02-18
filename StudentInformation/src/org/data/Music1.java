package org.data;

public class Music1 {
	public static void main(String[] args) {
		String A1 = new String("Nisha");
		String A2 = new String("Nisha");
		System.out.println(System.identityHashCode(A1));
		System.out.println(System.identityHashCode(A2));
	}

}
