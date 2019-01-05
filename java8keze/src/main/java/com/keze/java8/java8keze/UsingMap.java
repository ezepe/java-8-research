package com.keze.java8.java8keze;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class UsingMap {

	Map<Integer, String> aMap = new HashMap<>();
	public UsingMap() {
		// TODO Auto-generated constructor stub
		
		aMap.put(1, "Lorena");
		aMap.put(2, "Ezequiel");
		aMap.put(3, "Valentino");
	}
	
	public void simplePrint() {
		System.out.println("--- USING: 1.7 ---");
		for (Entry<Integer, String> e : aMap.entrySet()) {
			System.out.println("Key: "+e.getKey() + " - Value: "+e.getValue());
		}
	}
	
	public void newPrint() {
		System.out.println("--- USING: 1.8 ---");
		
		// Forma: 1
		// aMap.forEach( (k,v) -> System.out.println("Key: "+k +" - Value: "+v));
		
		// Forma 2: Utilizando API Stream
		aMap.entrySet().stream().forEach(System.out::println);
	}
	
	public void putIsAbsent() {
		aMap.putIfAbsent(4, "Leonidas");
	}
	
	public void computeIsPresent() {
		aMap.computeIfPresent(3, (k,v) -> "the value is: "+v);
	}
	
	public void getOrDefault() {
		String aValue = aMap.getOrDefault(5, "VALOR NO ASOCIADO A KEY");
		System.out.println(aValue);
	}
	
	public void RecoletWithFilter() {
		Map<Integer, String> recolectedMap = aMap.entrySet().stream().filter(e -> e.getValue().contains("en"))
				.collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
		
		recolectedMap.entrySet().stream().forEach(System.out::println);		
	}
}
