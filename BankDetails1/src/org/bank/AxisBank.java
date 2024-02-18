package org.bank;

public class AxisBank extends BankInfo {
	@Override
	public void deposit() {
System.out.println(" deposit the amount = AxisBank account");
	}
	public static void main(String[] args) {
		AxisBank b = new AxisBank();
		b.deposit();
		b.fixed();
		b.saving();
}
}

