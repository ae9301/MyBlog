/*
 * Amadeus Confidential Information:
 * Unauthorized use and disclosure strictly forbidden.
 * @1998-2012 - Amadeus s.a.s - All Rights Reserved.
 */
package com.sarf.service;

import java.util.List;

import com.sarf.domain.Employee;
public interface EmployeeService {
	public void addEmployee(String emolpyeeName);
	public List<Employee> getEmployees();
}
