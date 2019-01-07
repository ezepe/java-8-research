package com.keze.testing_rest;

import java.util.ArrayList;
import java.util.List;

import javassist.bytecode.analysis.Analyzer;

public class AgentRepository {

	List<Agent> agentList = new ArrayList<Agent>();
	
	public AgentRepository() {
		// TODO Auto-generated constructor stub
		
		Agent anAgent = new Agent();
		anAgent.setId(1);
 		anAgent.setFirstName("Ezequiel");
 		anAgent.setLastName("Perez");
 		anAgent.setCellPhone("221 4445566");
 		anAgent.setPhone("221 6667788");
 		anAgent.setDni("99999999");
 		
 		Agent bnAgent = new Agent();
 		bnAgent.setId(2);
 		bnAgent.setFirstName("Pablo");
 		bnAgent.setLastName("Latina");
 		bnAgent.setCellPhone("221 4445566");
 		bnAgent.setPhone("221 6667788");
 		bnAgent.setDni("77777777");
 		
 		agentList.add(anAgent);
 		agentList.add(bnAgent);
	}
		
		public List<Agent> getAgentList() {
			
			agentList.forEach(System.out::println);
			return agentList;
		}

		public void create(Agent anAgent) {
			// TODO Auto-generated method stub
			
			agentList.add(anAgent);
			
			System.out.println(anAgent.toString());
			System.out.println("AGENTE AGREGADO ..");
			
		}

}
