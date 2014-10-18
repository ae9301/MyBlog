/*
 * Amadeus Confidential Information:
 * Unauthorized use and disclosure strictly forbidden.
 * @1998-2012 - Amadeus s.a.s - All Rights Reserved.
 */
package com.sarf.restservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 * @author mokhan
 * 
 */
@Path("/employee-service/")
@Produces(MediaType.APPLICATION_JSON)
public interface SarfRestService {

	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("get-all-employee")
	public Response getAllEmployees();
	
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("update-employee")
	public Response updateEmployee();
	

	
}
