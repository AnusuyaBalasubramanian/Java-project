package org.bike;

public class Ktm implements Bike{
	@Override
	public void cost() {
		System.out.println("hero bike cost = 2 lakh");
		}
	@Override
	public void speed() {
System.out.println("hero bike speed = 150kmph");		
	}
	public static void main(String[] args) {
		
		Ktm k = new Ktm();
		k.cost();
		k.speed();
}
}

