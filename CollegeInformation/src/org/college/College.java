package org.college;

public class College {

	private void collegeName() {
System.out.println("SASTRA");
	}
	private void collegecode() {
System.out.println("1234");
	}
	private void collegerank() {
System.out.println("34 rank");
	}
	public static void main(String[] args) {
		
		
		College a= new College();
		Student std= new Student();
		Hostel b= new Hostel();
		Dept c= new Dept();
		
		a.collegeName();
		a.collegecode();
		a.collegerank();
		
		std.studentName();
		std.studentDept();
		std.studentId();
		
		b.hostelName();
		c.deptName();		
	}
}
