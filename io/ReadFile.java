package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	
	public static void main(String[] args) {
		// Nombre de Archivos a leer
		String[] fileNames = {"README.md", "README2.md"};
		
		// iterando nombres de archivo
		for (String fn: fileNames){
			readFile(fn);
		}

	}
	
	public static void readFile(String filename){
		BufferedReader br = null;
		FileReader fr = null;
		try {
			// File reader
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			System.out.println(String.format("Contenido de %s: \n", filename));
			// BufferedReader provee el Stream de Strings a interpretar
			for(String line; (line = br.readLine()) != null; ) {
		        System.out.println(line);
		    }
			
		} catch(IOException ex){
			System.out.println(ex.getMessage());
		} finally{
			// Cerrando el lector de archivo y Lector de Streams
			if (fr != null && br != null){
				try{
					System.out.println(String.format("WARN: Cerrando %s\n", filename));
					br.close(); 
					fr.close();
				} catch (Exception ex){
					System.out.println(ex.getMessage());
				}
			}
		}
	}

}
