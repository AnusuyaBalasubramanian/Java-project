package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	
	private void empName() {
System.out.println("employee name is anu");
	}
	
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		Company com=new Company();
		Client ent= new Client();
		Project s= new Project();
		
		emp.empName();
		com.companyName();
		ent.clientName();
	s.projectName();
	
		
	}

}
