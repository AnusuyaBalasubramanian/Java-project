package org.company;
// child class

import org.client.Client;

public class Company extends Client {
	private void companyName() {
System.out.println("company name is zoho");
	}
	public static void main(String[] args) {
		Company c = new Company();
		c.companyName();
		c.clientName();
		}
}
