package com.keze.java8.java8keze;

import java.util.Optional;

public class UsingOptionalClass {

	public void simpleTest(String aValue) {
		
	}
	
	public void orElse(String aValue) {
		Optional<String> anOptional = Optional.ofNullable(aValue);
		String testString = anOptional.orElse("NULL: A Default String");
		System.out.println(testString);
	}
	
	public void orElseThrow(String aValue) {
		Optional<String> anOptional = Optional.ofNullable(aValue);
		anOptional.orElseThrow(ArithmeticException::new);
		System.out.println(aValue);
	}
	
	public void isPresent(String aValue) {
		Optional<String> anOptional = Optional.ofNullable(aValue);
		System.out.println( anOptional.isPresent() );
	}
}
