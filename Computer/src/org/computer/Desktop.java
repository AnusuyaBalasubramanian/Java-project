package org.computer;

// child class

public class Desktop extends Computer {
	private void desktopSize() {
System.out.println("desktopsize is 32");
	}
	public static void main(String[] args) {
		
		Desktop c= new Desktop();
		c.desktopSize();
		c.computerModel1();
		}
	}
