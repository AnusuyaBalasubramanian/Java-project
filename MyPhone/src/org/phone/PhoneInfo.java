package org.phone;

public class PhoneInfo {
	
	private void phoneName() {
System.out.println("phone name is= vivo");
	}
	private void phoneMieinum() {
System.out.println("phone Mininum is = 2345678798");
	}
	private void phoneCamera() {
System.out.println("phone camera is= vivo X28");
	}
	private void storageSpace() {
System.out.println("phone storagespace is= 64gp");
	}
	private void osName() {
System.out.println(" os name is= windows");
	}
	
	public static void main(String[] args) {
	
		PhoneInfo phone= new PhoneInfo();
		phone.phoneName();
		phone.phoneMieinum();
		phone.osName();
		phone.phoneCamera();
		phone.storageSpace();
		
	}

}
