package com.keze.java8.java8keze;

import java.util.function.Function;

public class UsingHighOrderFunctions {

	Function<String, String> convertToUpperCase = x -> x.toUpperCase();
	Function<String, String> convertoToLowerCase = x -> x.toLowerCase();
	
	public void toPrint(Function<String, String> aFunction, String aValue) {
		System.out.println( aFunction.apply(aValue));
	}
}
