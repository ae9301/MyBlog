/*
 * Amadeus Confidential Information:
 * Unauthorized use and disclosure strictly forbidden.
 * @1998-2012 - Amadeus s.a.s - All Rights Reserved.
 */
package com.sarf.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sarf.domain.Employee;

@Repository()
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public Page<Employee> findAll(Pageable pageable);
}
