package org.length;

public class DataLength5 {
	public static void main(String[] args) {
		String B = "5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101";
		boolean B1 = B.contains("pincode");
		System.out.println(B1);
		
		String C = "5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101";
		String C1 = C.replace(",pincode-626101","  ");
		System.out.println(C1);
	}
	}
