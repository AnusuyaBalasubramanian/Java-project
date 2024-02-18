package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {

	
	private void TransportForm() {
System.out.println("bike,car,bus,train,aeroplane");
	}
	public static void main(String[] args) {
		
Transport a =new Transport();
Road b= new Road();
Air c= new Air();
Water d =new Water();

a.TransportForm();
b.bike();
b.cycle();
b.car();
c.aeroPlane();
c.heliCopter();
d.boat();
d.ships();
}
}
