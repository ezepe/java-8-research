package com.keze.testing_rest;

import java.util.stream.Stream;

public class MainTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AgentRepository aRepo = new AgentRepository();
		Agent auxAgent = aRepo.getAgentList().stream()
				.filter(agent -> agent.getId() == 2).findFirst().get();
		
		System.out.println(auxAgent.toString());
	}

}
