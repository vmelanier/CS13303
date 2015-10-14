package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInput {
	public static void main(String[] args) {
		System.out.println("Qué día es hoy?");
		// Creando BuferredReader a partir de un
		// InputStreamReader para interacción con el usuario
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		String dia = null;
		try { 
			dia = br.readLine(); 
			} 
		catch (IOException ex){ 
			System.out.println(ex.getMessage());
			}
		finally{
			// Cerrando el lector de archivo y Lector de Streams
			if (br != null){
				try{
					System.out.println("WARN: Cerrando BufferedReader");
					br.close(); 
				} catch (Exception ex){
					System.out.println(ex.getMessage());
				}
			}
		}
		System.out.println(String.format("Hoy es %s" , dia));
	}
}
