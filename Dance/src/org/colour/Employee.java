package org.colour;//same package


//defalut same package....using excent
public class Employee extends Studend {// public
	
	private void empid() {

		System.out.println("Employee id is: 6758904555");
	}
	private void empname() {
System.out.println("Employee name is : virat");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.studentid();
		e.studentname();
		e.empid();
		e.empname();
		}}
