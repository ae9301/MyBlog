package com.sarf.service;

import java.util.List;

import com.sarf.domain.Employee;
public interface EmployeeService {
	public void addEmployee(String emolpyeeName);
	public List<Employee> getEmployees();
}
