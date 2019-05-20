package net.guides.springboot2.springaop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import net.guides.springboot2.springaop.model.Employee;

/**
 * Employee Service
 * 
 * @author Ramesh
 *
 */
@Service
public class EmployeeService {

	private List<Employee> employees = new ArrayList<>();

	public List<Employee> getAllEmployees() {
		System.out.println("Method getAllEmployees() called");
		return employees;
	}

	public Employee getEmployeeById(Long employeeId) {
		System.out.println("Method getEmployeeById() called");
		for (Employee employee : employees) {
			if (employee.getId() == Long.valueOf(employeeId)) {
				return employee;
			}else {
				//Throwing an exception
		        throw new NullPointerException("ID not found");
			}
		}
		return null;
	}

	public void addEmployee(Employee employee) {
		System.out.println("Method addEmployee() called");
		employees.add(employee);
	}

	public void updateEmployee(Employee employeeDetails) {
		System.out.println("Method updateEmployee() called");
		for (Employee employee : employees) {
			if (employee.getId() == Long.valueOf(employeeDetails.getId())) {
				employees.remove(employee);
				employees.add(employeeDetails);
			}
		}
	}

	public void deleteEmployee(Long employeeId) {
		System.out.println("Method deleteEmployee() called");
		for (Employee employee : employees) {
			if (employee.getId() == Long.valueOf(employeeId)) {
				employees.remove(employee);
			}
		}
	}
}
