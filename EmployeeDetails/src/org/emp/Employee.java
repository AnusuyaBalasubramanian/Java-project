package org.emp;
public class Employee {
	private void empId(int regno) {
System.out.println("employee regno = "+regno);
	}
	private void empId(String name,int age) {
		System.out.println("employee name = "+name);
		System.out.println("employee age = "+age);
}
	private void empId(float salary) {
		System.out.println("employee salary = "+salary);
}
	private void empId(String adr,char gender) {
System.out.println("employee address = "+adr);
System.out.println("employee gender = "+gender);
	}
private void empId(long phoneNo) {
	System.out.println("employee phoneNo = "+phoneNo);
}
public static void main(String[] args) {
	
	Employee e = new Employee();
	e.empId(123456);
	e.empId("anu",21);
	e.empId("23 porur",'f');
	e.empId(4678976543l);
	e.empId(78.987f);
}
}
