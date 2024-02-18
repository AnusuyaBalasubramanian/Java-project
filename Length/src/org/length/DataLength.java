package org.length;

public class DataLength {
	public static void main(String[] args) {
		
		String A1 = "java";
		String A2 = "Java";
		int A3 = A1.compareTo(A2);
		System.out.println("compare the two string A1-A2 (j-J) ="+A3);
		
		String B1 = "Anu";
		String B2 = "anusuya";
		int B3 = B1.compareTo(B2);
		System.out.println("Compare the two string B1-B2 (A-a) ="+B3);
		}}
