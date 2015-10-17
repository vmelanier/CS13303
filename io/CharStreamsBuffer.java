package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharStreamsBuffer {
	public static void main(String[] args) {
		char c;
		// Crea un BufferedReader basado en InputStreamReader
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Hola, Cómo estás? (Termina con un punto \".\")");
		System.out.println("Tu respuesta es: ");

		// Leer los ccaracteres hasta que se ingrese un punto
		try {
			while((c = (char) bReader.read()) != '.'){
				System.out.print(c);
			}
		} catch (IOException e) {
			System.out.println(String.format("Error %s: %s", e.getClass(), e.getMessage()));
		}
	}
}
