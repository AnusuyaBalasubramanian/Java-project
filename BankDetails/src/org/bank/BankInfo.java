package org.bank;
// child class
public class BankInfo extends AxisBank {
	private void saving() {
System.out.println("saving the amount in bank 1000");
	}
	private void fixed() {
System.out.println("fixed the amount in Axisbank");
	}
public static void main(String[] args) {
	BankInfo b = new BankInfo();
	b.saving();
	b.fixed();
	b.deposit();
}
}
