/*
 * Amadeus Confidential Information:
 * Unauthorized use and disclosure strictly forbidden.
 * @1998-2012 - Amadeus s.a.s - All Rights Reserved.
 */
package com.sarf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sarf.domain.Employee;
import com.sarf.repository.EmployeeRepository;


@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

		/** {@inheritDoc} */
	public void addEmployee(final String employeeName) {
		final Employee e = new Employee();
		e.setStrEmployeeName(employeeName);
		this.employeeRepository.saveAndFlush(e);
	}
	public List<Employee> getEmployees() {
		return this.employeeRepository.findAll();
	}
}
