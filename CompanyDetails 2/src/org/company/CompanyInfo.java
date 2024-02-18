package org.company;

public class CompanyInfo {
	private void companyName(String c) {
System.out.println(" 1 company name = "+c);
	}
	private void companyName(String v,int b) {
System.out.println(" 2 company name = "+v+b);
	}
	private void companyName(long g,int h,String j) {
System.out.println(" 3 company name = "+g+h+j);
	}
public static void main(String[] args) {
	CompanyInfo c = new CompanyInfo();
	c.companyName("tcs");
	c.companyName("yui",7);
	c.companyName(6789,5,"sagility");
}
}
