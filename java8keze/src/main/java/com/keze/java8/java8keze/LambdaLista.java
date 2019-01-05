package com.keze.java8.java8keze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.keze.java8.java8keze.ifuncional.IOperation;

public class LambdaLista {
	
	public void orderList() {
		
		List<String> aList = new ArrayList<String>();
		
		aList.add("Eze");
		aList.add("Lore");
		aList.add("Valen");
		aList.add("Perez");
		aList.add("Boris");
		aList.add("Leonidas");

		
//		Collections.sort(aList, (String str1, String str2) -> str1.compareTo(str2));
		Collections.sort(aList, String::compareToIgnoreCase);
		aList.forEach((aName) -> System.out.println(aName));

		
	}
	
	public double interfazFuncional() {
		
		IOperation aOperation = (double x, double y) -> (x+y)/2;
		return aOperation.calcularPromedio(3, 9.1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LambdaLista aLambdaLista = new LambdaLista();
//		aLambdaLista.orderList();
		System.out.println( aLambdaLista.interfazFuncional());
	}

}
