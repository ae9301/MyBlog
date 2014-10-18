package com.sarf.service;

import java.util.List;

import com.sarf.domain.Employee;

public interface SarfService {
	public List<Employee> getEmployees();
	public void updateEmployee() ;
	
}
