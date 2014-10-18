
package com.sarf.repository;

import java.util.List;

import javax.persistence.QueryHint;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import com.sarf.domain.Employee;


@Repository()
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	@Query(value="select e from Employee as e ")
	@QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value ="true") })
	List<Employee> findAllEmployees();

}
