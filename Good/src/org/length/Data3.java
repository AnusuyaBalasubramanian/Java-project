package org.length;
public class Data3 {
	public static void main(String[] args) {
		        // 0123456789012345678901234
		String s ="computer programming test";
//9) indexof(value)......ton find the index of the partcular index value
		int indexOf = s.indexOf('p');
		System.out.println("get the index position of p:"+indexOf);
		
//10)lastindexof(value)......to finmd the lastindex of the partcular index value
		int lastIndexOf = s.lastIndexOf('p');
		System.out.println("last index of given string p: "+lastIndexOf);
		
//11) substring(start index).....to create a sub string from the given start index to enf of the string
		String substring = s.substring(7);
		System.out.println("staring index position is :"+substring);
		
//12)substring(start index,end index)....tocreat a sub string from the given start index to given end index.
		String substring2 = s.substring(5,22 );
		System.out.println("given start index to given end:" +substring2);
		
//13)replace(old,new)......to replace one char or word into another char or word
		String replace = s.replace('t', '*');
		System.out.println(replace);                         
		String replace1 = s.replace("c", "7");
		System.out.println(replace1);
		String replace2 = s.replace("test", "class");
		System.out.println(replace2);
//14)replaceall(old,new)......to replace all the occurence of one char or word into another char or word.
		
		String replaceAll = s.replaceAll("computer programming test", "destop coding program");
		System.out.println(replaceAll);
		
		String s2 = "Happy Yourself Fist";
		String s3 = "happy yourself fiST";
//15)equal()......to compare the 2 string.it is case sensitive.return type is boolean.
		boolean s15 = s2.equals(s3);
	System.out.println(s15);
	
//16)equalsignore case()......to compare the 2 string.it is not case sensitive.return type booleaan
	
	boolean s16 = s2.equalsIgnoreCase(s3);
	System.out.println(s16);
	
//17)compareto().....to compare to string based on ASCII value.return type is int
	
	int s17 = s2.compareTo(s3);
	System.out.println("to compare 2 strings s2-s3(h-h):" +s17);
	
//18) trim().....to remove space present before and after the srting
	
	String s18 = s2.trim();
	System.out.println(s18);
		
	}}


