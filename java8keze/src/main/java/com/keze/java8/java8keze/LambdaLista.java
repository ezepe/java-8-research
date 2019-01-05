package com.keze.java8.java8keze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

import com.keze.java8.java8keze.ifuncional.IOperation;

public class LambdaLista {

		List<String> aList = new ArrayList<String>();
		
		public LambdaLista() {

			aList.add("Eze");
			aList.add("Lore");
			aList.add("Valen");
			aList.add("Perez");
			aList.add("Boris");
			aList.add("Leonidas");	
		}

		public void simplePrint() {
			System.out.println("--- LISTA SIN ORDENAR ---");
			aList.forEach(System.out::println);
		}
		public void filterAPIStream(String filter) {
			
			System.out.println("--- LISTA FILTRADA POR CRITERIO " +filter+" ---");
			aList.stream().filter(x -> x.startsWith(filter)).forEach(System.out::println);
		}
		
		public void orderAPIStream() {
			System.out.println("--- LISTA ORDENADA: ASC ---");
			aList.stream().sorted().forEach(System.out::println);
			
			System.out.println("--- LISTA ORDENADA: DESC ---");
			aList.stream().sorted( (x,y) -> y.compareTo(x)).forEach(System.out::println);
			
		}
		
		public void countAPIStream() {
			System.out.println("--- CANTIDAD DE ELEMENTOS ---");
			System.out.println(aList.stream().count());
		}
}
