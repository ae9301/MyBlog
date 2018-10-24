package com.sarf.restservice;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.sarf.service.SarfServiceImpl;

public class SarfRestServiceImpl implements SarfRestService {

	@Autowired
	private SarfServiceImpl sarfService;
	
	public Response getAllEmployees() {
		this.sarfService.getEmployees();
		return Response.ok().build();
	}

	
	public Response updateEmployee() {
		sarfService.updateEmployee();
		return Response.ok().build();
	}
	
	
}
