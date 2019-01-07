package com.keze.testing_rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("agents")
public class AgentResource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Agent getAgent() {
		
		System.out.println("CALLING AGENTS ..");
		Agent anAgent = new Agent();
 		anAgent.setFirstName("Ezequiel");
 		anAgent.setLastName("Perez");
 		anAgent.setCellPhone("221 4445566");
 		anAgent.setPhone("221 6667788");
 		anAgent.setDni("99999999");
 		
 		return anAgent;
	}
}
