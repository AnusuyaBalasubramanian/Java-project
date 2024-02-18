package org.emp;
public class Employee {
	private void empId() {

System.out.println("employee id 1234");

	}
	private void empName() {
System.out.println("employee name anu");
	}
	
	private void empDob() {
System.out.println("employee DOB 26/06/2002");
	}
	private void empPh() {
System.out.println("employee phone number is 2345677888");
	}

	private void empEmail() {
System.out.println("employee email id is anusuyabalu008@gmail.com");
	}
	private void empAddress() {
System.out.println("employee address nagai");
	}
	public static void main(String[] args) {
			
		Employee emp =new Employee();
		
		emp.empId();
		emp.empName();
		emp.empDob();
		emp.empPh();
		emp.empEmail();
		emp.empAddress();
	
		
		
	}
	
	
}
