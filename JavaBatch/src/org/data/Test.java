package org.data;

public class Test {
	public static void main(String[] args) throws Throwable {
		try {
			System.out.println("1");
			int data = 5 / 0;
			
		} catch (ArithmeticException e) {
			Throwable obj = new Throwable("Sample");
					try {
						throw obj;
						} 
			catch (Exception e1) {
				System.out.println("8");
						
					}
			finally {
			System.out.println("3");
		}
			System.out.println("4");
	}
	}

}
