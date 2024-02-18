package org.allvehicle;

import org.threewheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheller;

public class Vehicle {
	private void VehicleNecessery() {

		System.out.println("vehiclenecessery = yes");
	}
public static void main(String[] args) {
	
	Vehicle a= new Vehicle();
	TwoWheller b= new TwoWheller();
	ThreeWheeler c= new ThreeWheeler();
	FourWheeler d= new FourWheeler();
	
	a.VehicleNecessery();
	b.bike();
	b.cycle();
	c.auto();
	d.bus();
	d.car();
	d.lorry();
	
	
}
}
