package com.empmgt.ui;

import com.empmgt.entities.*;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeMain app = new EmployeeMain();
		app.run();

	}

	private void run() {
		Employee employees[] = new Employee[4];
		Department department1 = new Department("D1", "Development");
		Department department2 = new Department("D2", "Testing");
		Developer developer1 = new Developer(1, "Green", department1, "React");
		Developer developer2 = new Developer(2, "Maddy", department1, "Angular");
		Tester tester1 = new Tester(3, "Nikhil", department2, "Selenium");
		Tester tester2 = new Tester(4, "Joey", department2, "Ranorex");
		employees[0] = developer1;
		employees[1] = developer2;
		employees[2] = tester1;
		employees[3] = tester2;

		for (int i = 0; i < employees.length; i++) {
			if (employees[i] instanceof Developer) {
				Developer developer = (Developer) employees[i];
				displayEmployee(developer);
			} else {
				Tester tester = (Tester) employees[i];
				displayEmployee(tester);
			}

		}

	}

	private void displayBaseEmployee(Employee employee) {
		System.out.println("Employee id is " + employee.getId());
		System.out.println("Employee name is " + employee.getName());
		Department department = employee.getDepartment();
		System.out.println("Employee department id is " + department.getDeptId());
		System.out.println("Employee department name is " + department.getDeptName());

	}

	private void displayEmployee(Developer employee) {
		displayBaseEmployee(employee);
		System.out.println("Language used by Developer is " + employee.getLanguage());

	}

	private void displayEmployee(Tester employee) {
		displayBaseEmployee(employee);
		System.out.println("Tools used by Tester is " + employee.getTools());

	}

}