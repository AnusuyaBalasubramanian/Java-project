package org.length;
public class Data2 {         
	// 3) tolowercase.....to convert string into lower case
	public static void main(String[] args) {
		
		String s ="JAVA PROGRamming teST";
		String s1 = s.toLowerCase();
		
		System.out.println("convert to lowercase: "+s1);
	// 4) statswith(value).........to check whether string starts with given prefix or not
		boolean S2 = s.startsWith("jAV");
		System.out.println("Check wherther string starts with jAV :" +S2);
		//5) endswith(value)........to check whether string ends with given suffic or not
		boolean s3 = s.endsWith("teST       ");
		System.out.println("check wherther string end with teST:"+s3);
		//6) isEmpty() check whether the string empty or not
		boolean s4 = s.isEmpty();
		System.out.println("emty or not:"+s4);
		String a ="";
		boolean s5 = a.isEmpty();
		System.out.println("emty or not:"+s5);
		//7)contains(value).........to check wherther the string contains the particular substring or not
		boolean contains = s.contains("ing");
	System.out.println("to check wherther particular value is present or not :" +contains);
	
	//8)charAt(index)......it bis used to find the character present in the particular index value
	      char charAt = s.charAt(6);
	      System.out.println("character present in given string :" +charAt);
		
	 
}}