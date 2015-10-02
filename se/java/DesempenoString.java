package se.java;

public class DesempenoString {
	public static void main(String[] args) {
		/*
		 * Mide el tiempo de ejecución 
		 * concatenando strings: String,
		 * StringBuilder y StringBuffer
		 */
		System.out.println(String.format("%-15s %-15s", "Clase", "Tiempo(ms)"));
		System.out.println("---------------------------");
	    
		// Inicia String
		String prueba = new String();
		long incioString = System.currentTimeMillis();
		for (int i=0; i< 200000; i++){
			prueba += "@";
		}
		long finString = System.currentTimeMillis();
		
		// Resultado de String
		System.out.println(String.format("%-15s %-15s", "String", 
				finString-incioString));
		
		// Inicia StringBuilder
		long incioStringBuilder = System.currentTimeMillis();
		StringBuilder prueba2 = new StringBuilder();
		for (int i=0; i< 200000; i++){
			prueba2.append("@");
		}
		long finStringBuilder = System.currentTimeMillis();
		// Resultado de StringBuilder
		System.out.println(String.format("%-15s %-15s", "StringBuilder",
				finStringBuilder-incioStringBuilder));
		
		// Inicia StringBuffer
		long incioStringBuffer = System.currentTimeMillis();
		StringBuffer prueba3 = new StringBuffer();
		for (int i=0; i< 200000; i++){
			prueba3.append("@");
		}
		long finStringBuffer = System.currentTimeMillis();
		// Resultado de StringBuffer
		System.out.println(String.format("%-15s %-15s", "StringBuffer", 
				finStringBuffer-incioStringBuffer));
	}

}
