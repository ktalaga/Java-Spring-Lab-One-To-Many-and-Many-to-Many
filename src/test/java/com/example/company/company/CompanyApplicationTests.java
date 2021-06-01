package com.example.company.company;

import com.example.company.company.models.Department;
import com.example.company.company.models.Employee;
import com.example.company.company.repositories.DepartmentRepository;
import com.example.company.company.repositories.EmployeeRepository;
import com.example.company.company.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CompanyApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void createEmployeeAndDepartment() {
		Department department = new Department("Back End");
		departmentRepository.save(department);
		Employee employee1 = new Employee("Konrad", "Talaga", 99, department);
		employeeRepository.save(employee1);
	}
}
