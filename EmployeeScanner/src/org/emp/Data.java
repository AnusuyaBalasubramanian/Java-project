package org.emp;

import java.util.Scanner;

public class Data {
	public static void main(String[] args) {
		
		// scanner syntax
		Scanner s = new Scanner(System.in);
		System.out.println("enter the employee id is");
		int empid = s.nextInt();
		System.out.println("enter the employee name is");
		String empname = s.nextLine();
		System.out.println("enter the employee nickname is");
		String nickname = s.next();
		System.out.println("enter the employee email id is");
		String email = s.next();
		System.out.println(" enter the employee phone number is ");
		long phone = s.nextLong();
		System.out.println("enter the employee salary is");
		double sal = s.nextDouble();
		System.out.println("enter the employee gender is");
		char gen = s.next().charAt(0);
		System.out.println("enter the employee city is");
		String city = s.next();
		System.out.println("all the above information are");
		boolean result = s.nextBoolean();
		System.out.println("\n\n");// space 
		System.out.println("employee information are");
		
		System.out.println("employee id is = "+empid);
		System.out.println("employee name is = "+empname);
		System.out.println("employee nickname is = "+nickname);
		System.out.println("employee email id is = "+email);
		System.out.println("employee phone number is = "+phone);
		System.out.println("employee salary is = "+sal);
		System.out.println("employee city is = "+city);
		System.out.println("employee info is = "+result);
		System.out.println("employee gender is = "+gen);
		


}}
