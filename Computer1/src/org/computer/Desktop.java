package org.computer;

public class Desktop implements Software,HardWare {
	
	@Override
	public void softwareResources() {
		System.out.println("Software = os,windows,linux,word,excel");
	}
@Override
public void hardwareResources() {
System.out.println("Hardware = cpu,monitor,printer,keyboard,RAM");	
}
	private void desktopModel() {
System.out.println("desktopModel = ram2456");
	}
	
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.softwareResources();
		d.hardwareResources();
		d.desktopModel();
		
	}
}