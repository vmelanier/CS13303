package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringStreamsBuffer {
	public static void main(String[] args) {
		// Crea un BufferedReader basado en InputStreamReader
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sBuffer = new StringBuffer();
		String s;
		
		System.out.println("Hola, Cómo estás? (Termina con el siguiente caracter \"^\")");
		

		// Leer los ccaracteres hasta que se ingrese un punto
		try {
			while(!(s = (String) bReader.readLine()).equals("^")){
				sBuffer.append(s);
			}
			
			System.out.println(String.format("Tu respuesta es: %s", sBuffer.toString()));
		} catch (IOException e) {
			System.out.println(String.format("Error %s: %s", e.getClass(), e.getMessage()));
		}
	}
}
