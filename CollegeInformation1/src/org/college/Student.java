package org.college;
// sub child
public class Student extends Dept {
	private void studentName() {
System.out.println("student name = anu");
	}
	private void studentDept() {
System.out.println("student dept name = ECS");
	}
	private void studentId() {
System.out.println("student id = 22023009");
	}
	public static void main(String[] args) {
		Student s= new Student();
		s.studentId();
		s.studentName();
		s.studentDept();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.HostelName();
		s.deptName();
}
}
