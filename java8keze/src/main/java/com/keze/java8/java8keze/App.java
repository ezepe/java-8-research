package com.keze.java8.java8keze;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	LambdaLista aLambdaLista = new LambdaLista();
//    	aLambdaLista.simplePrint();
//    	aLambdaLista.filterAPIStream("V");
//    	aLambdaLista.orderAPIStream();
//    	aLambdaLista.countAPIStream();
    	
//    	UsingOptionalClass uOC = new UsingOptionalClass();
//    	uOC.orElse(null);
//    	uOC.orElseThrow(null);
//    	uOC.isPresent("Pepe");

//    	UsingParallelStream uPS = new UsingParallelStream();
//    	uPS.testSimpleStream();
//    	uPS.testParallelStream();
    	
//    	UsingMap uM = new UsingMap();
//    	uM.simplePrint();
    	
//    	uM.putIsAbsent();
//    	uM.computeIsPresent();
//    	uM.getOrDefault();
//    	uM.newPrint();
//    	uM.RecoletWithFilter();
    
    	UsingHighOrderFunctions uHOF = new UsingHighOrderFunctions();
    	uHOF.toPrint(uHOF.convertToUpperCase, "pepe");
    }
}
