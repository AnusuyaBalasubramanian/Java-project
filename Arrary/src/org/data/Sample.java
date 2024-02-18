package org.data;

public class Sample {
	public static void main(String[] args) {
		
		int a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int size = a.length;
		System.out.println("length of the array= "+size);
		
		int sum =1;
		for (int i = 1; i < a.length; i++) {
			sum = sum+a[i];
			}
		
		System.out.println(sum);
			
		}
		}


