package se.java;

import java.util.ArrayList;
import java.util.Random;

public class For {
	public static void main(String[] args) {
		// 1. Genera una lista de Integers aleatorios
		Random random = new Random();
		int tamano = 20;
		
		ArrayList<Integer> intList = new ArrayList<>();
		Integer[] intArray = new Integer[tamano];
		
	    for (int i = 0; i < tamano; i++) {
	    	int tmp = random.nextInt(100);
	    	intList.add(tmp);
	    	intArray[i] = tmp;
	    }
	    
	    // 2. imprime la lista de integers aleatorios 
	    // con la referencia del elemento con un for 
	    System.out.println("ArrayList con for tradicional:");
	    for (int i=0; i<tamano; i ++){
	    	System.out.print(String.format("%s ", intList.get(i)));
	    }
	    
	    System.out.println("");
	    
	    // 3. imprime la lista de integers aleatorios 
	    // como referencia con un for mejorado 	    
	    System.out.println("Array con for mejorado:");
	    for (int i: intArray){
	    	System.out.print(String.format("%s ", i));
	    }
	    
	    System.out.println("");
	    System.out.println("ArrayList con for mejorado:");
	    for (int i: intList){
	    	System.out.print(String.format("%s ", i));
	    }
	    
	}
}
