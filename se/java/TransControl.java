package se.java;

import java.util.Random;

public class TransControl {
	public static void main(String[] args) {
		
		// 1. Genera una lista de Integers aleatorios
		Random random = new Random();
		Integer[][] intArray = new Integer[3][3];
		int i, j;
	    for (i = 0; i < 3; i++) {
	    	for (j=0; j<3; j++){
	    		intArray[i][j] = random.nextInt(10);
	    	}
	    }
		// 2.  Break sin etiqueta
	    System.out.println("Break sin etiqueta:");
	    for (i = 0; i < 3; i++) {
	    	for (j=0; j<3; j++){
	    		if (intArray[i][j] == 0){
	    			System.out.println(String.format("Encontré un 0! Break! (%s, %s)", i,j));
	    			break;
	    		}
	    		else{
	    			System.out.println(String.format("%s (%s, %s)", intArray[i][j], i,j));
	    		}
	    	}
	    }
		
		// 2. Break con etiqueta
		System.out.println("Break con etiqueta:");
		etiqueta:
		    for (i = 0; i < 3; i++) {
		    	for (j=0; j<3; j++){
		    		if (intArray[i][j] == 0){
		    			System.out.println(String.format("Encontré un 0! Break! (%s, %s)", i,j));
		    			break etiqueta;
		    		}
		    		else{
		    			System.out.println(String.format("%s (%s, %s)", intArray[i][j], i,j));
		    		}
		    	}
		    }
	}
}
