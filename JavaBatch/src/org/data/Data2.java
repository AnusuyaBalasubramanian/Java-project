package org.data;

public class Data2 {
	public static void main(String[] args) {
		try {
			System.out.println("100");
			System.out.println("200");
			System.out.println("300");
			System.out.println("400");
			
		} catch (ArithmeticException e) {
			System.out.println("TO print ArithmeticException");
			System.out.println("500");
		}
		catch (Exception e) {
			System.out.println("600");
			}
		finally {
			System.out.println("always excuted the finally block");
			System.out.println("700");
			
		}
		
	}

}