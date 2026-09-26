package com.example.crudapp;

import com.example.crudapp.DAO.EmployeeDAOInterface;
import com.example.crudapp.entity.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CrudappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudappApplication.class, args);
	}


	@Bean
	public CommandLineRunner clr(EmployeeDAOInterface employeeDAOinterface) {
		return runner -> {
//			readEmployee(employeeDAOinterface);
			employeesQuery(employeeDAOinterface);
		};
	}

	public void employeesQuery(EmployeeDAOInterface employeeDAOinterface) {
		List<Employee> employees = employeeDAOinterface.findAll();

		for(Employee employee : employees) {
			System.out.println(employee);
		}
	}


//	public void readEmployee(EmployeeDAOInterface employeeDAOinterface) {
//
//		System.out.println("Creating employee ...");
//		Employee newEmployee = new Employee("Casie", "Smith", "Casie123@gmail.com");
//
//		System.out.println("Saving employee ...");
//		employeeDAOinterface.save(newEmployee);
//
//		System.out.println("Saved employee ...");
//		System.out.println("Retrieving employee ..." + newEmployee.getId());
//		Employee employee = employeeDAOinterface.findById(newEmployee.getId());
//
//		System.out.println("Employee found "+employee);
//	}
//



//	private void createEmployee(EmployeeDAOInterface employeeDAOInterface) {
//		System.out.println("Creating employee ...");
//		Employee newEmployee = new Employee("Casie", "Smith", "Casie123@gmail.com");
//		Employee newEmployee2 = new Employee("Daisy", "Daily", "daisy@gmail.com");
//		Employee newEmployee3 = new Employee("Prashant", "Yadav", "prashant@gmail.com");
//		Employee newEmployee4 = new Employee("Som", "Dutta", "som@gmail.com");
//
//		System.out.println("Saving employee ...");
//		employeeDAOInterface.save(newEmployee);
//		employeeDAOInterface.save(newEmployee2);
//		employeeDAOInterface.save(newEmployee3);
//		employeeDAOInterface.save(newEmployee4);
//
//		System.out.println("Saved employee ...");
//	}
}
