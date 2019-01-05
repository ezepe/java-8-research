package com.keze.java8.java8keze;

import java.util.ArrayList;
import java.util.List;

public class UsingParallelStream {

	private List<Integer> integerList = new ArrayList<Integer>();
	public UsingParallelStream() {
		// TODO Auto-generated constructor stub
		
		for (int i = 0; i < 10; i++) {
			integerList.add(i);
		}
	}
	
	public void testSimpleStream() {
		System.out.println("--- SIMPLE THREAD STREAM ---");
		integerList.stream().forEach(System.out::println);
	}
	
	public void testParallelStream() {
		System.out.println("--- PARALLEL THREAD STREAM ---");
		integerList.parallelStream().forEach(System.out::println);
	}
}
