/*
 * Amadeus Confidential Information:
 * Unauthorized use and disclosure strictly forbidden.
 * @1998-2012 - Amadeus s.a.s - All Rights Reserved.
 */
package com.sarf.restservice;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sarf.domain.Employee;

/**
 * @author mokhan
 * 
 */
@Path("/employee-service/")
@Produces(MediaType.APPLICATION_JSON)
public interface EmployeeRestService {

	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Path("addEmployee")
	public void addEmployee(@FormParam("employeeName") String employeeName);

	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("getEmployees")
	public List<Employee> getEmployees();

}
