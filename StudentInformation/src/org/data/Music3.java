package org.data;

public class Music3 {
	public static void main(String[] args) {
		String A1 = "Nisha";
		String A2 = "Rengan";
		String A3 = "NishaRengan";
		String A4 = "Nisha";
		
		System.out.println(System.identityHashCode(A1));
		System.out.println(System.identityHashCode(A2));
		System.out.println(System.identityHashCode(A3));
		System.out.println(System.identityHashCode(A4));
	}}
