package org.phone;

public class InternalStorage {

	private void processorName() {
System.out.println("processor name is = Apple A16 Bionic ");
	}
	private void ramSize() {
System.out.println("ramsize is = 12gb");
	}
public static void main(String[] args) {
	ExternalSrorage ex= new ExternalSrorage();
	InternalStorage inter= new InternalStorage();
	
	inter.processorName();
	inter.ramSize();
	
	ex.size();
}		
}
