package org.bike;

public class Ktm extends Bike {
	@Override
	public void cost() {
System.out.println("hero bike cost = 1.72 lakh");
	}
	public void speed() {
System.out.println("hero bike speed = 130kmph");
	}
	public static void main(String[] args) {
			Ktm k = new Ktm();
			k.cost();
			k.speed();
			}
	}
