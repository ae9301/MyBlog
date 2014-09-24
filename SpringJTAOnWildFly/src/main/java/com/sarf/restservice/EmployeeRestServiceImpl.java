/*
 * Amadeus Confidential Information:
 * Unauthorized use and disclosure strictly forbidden.
 * @1998-2012 - Amadeus s.a.s - All Rights Reserved.
 */
package com.sarf.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sarf.domain.Employee;
import com.sarf.service.EmployeeService;

/**
 * @author mokhan
 * 
 */
@Service
@Transactional
public class EmployeeRestServiceImpl implements EmployeeRestService {

	@Autowired
	private EmployeeService employeeService;

	public void addEmployee(final String employeeName) {
		this.employeeService.addEmployee(employeeName);
	}

	public List<Employee> getEmployees() {
		final List<Employee> listEmployee = this.employeeService
				.getEmployees();
		return listEmployee;
	}
}
