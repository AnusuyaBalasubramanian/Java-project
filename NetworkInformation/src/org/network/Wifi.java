package org.network;

public class Wifi {
	private void wifiName() {
System.out.println("wifi names =12345");
	}
	public static void main(String[] args) {
		
		Wifi a= new Wifi();
		MobileData b= new MobileData();	
		Lan c = new Lan();
		Wireless d = new Wireless();
		
		
		a.wifiName();
		c.lanName();
		b.dataName();
		d.modamName();
		
	}

	
}
