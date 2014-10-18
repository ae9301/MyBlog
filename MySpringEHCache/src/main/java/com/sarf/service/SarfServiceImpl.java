package com.sarf.service;

import java.util.List;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sarf.domain.Employee;
import com.sarf.repository.EmployeeRepository;


@Service("sarfService")
@Transactional
public class SarfServiceImpl{
		
	static final Logger logger = Logger.getLogger(SarfServiceImpl.class);  
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public List<Employee> getEmployees() {
		logger.info("Fetching all employees");
		List<Employee>  employeeList = employeeRepository.findAllEmployees();
		logger.info("Fetched all employees successfully");
		return employeeList;
	}

		
	public void updateEmployee() {
		Employee employee = this.employeeRepository.findOne(1000);
		employee.setEmployeeName(UUID.randomUUID().toString());
		this.employeeRepository.save(employee);
		logger.info("Employee with id 1000 updated successfully");
	}

	

}
