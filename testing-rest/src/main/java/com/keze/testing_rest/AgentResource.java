package com.keze.testing_rest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("agents")
public class AgentResource {

	AgentRepository aRepo = new AgentRepository();
	
	@GET
	@Path("all-agents")
	@Produces(MediaType.APPLICATION_XML)
	public List<Agent> getAll() {
	
		System.out.println("CALLING AGENTS ..");
		List<Agent> aSimpleList = aRepo.getAgentList();
		return aSimpleList;
	}
	
	@GET
	@Path("agent/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Agent getAgent(@PathParam("id") int id) {
		
		System.out.println("RETURN AGENT ID: "+ id);
		Agent auxAgent = aRepo.getAgentList().stream()
				.filter(agent -> agent.getId() == id).findFirst().get();
		
		return auxAgent;
	}
	
	@POST
	@Path("add-agent")
	public Agent createAgent(Agent anAgent) {
		System.out.println("SENDING AGENTS .. ");
		aRepo.create(anAgent);
		return anAgent;
	}
}
