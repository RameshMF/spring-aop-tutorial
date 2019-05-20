package net.guides.springboot2.springaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import net.guides.springboot2.springaop.model.Employee;
import net.guides.springboot2.springaop.service.EmployeeService;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext =  SpringApplication.run(Application.class, args);
		EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
		employeeService.addEmployee(new Employee(100L, "ramesh", "fadatare", "ramesh@gmail.com"));
		employeeService.getEmployeeById(100L);
		employeeService.getAllEmployees();
	}
}
