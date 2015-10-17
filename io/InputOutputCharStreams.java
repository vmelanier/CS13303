package io;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.io.FileWriter;

public class InputOutputCharStreams {
	public static void main(String[] args) {
		String[] fileNames = {"README.md", "README2.md"};

		// copiar archivo 0 a 1
		copyFile(fileNames[0], fileNames[1]);
		
		// Leer archivos
		// iterando nombres de archivo
		for (String fn: fileNames){
			readFile(fn);
		}
	}

	private static void readFile(String fileName) {
		// Abrir el archivo
		try(Reader reader = new FileReader (fileName)){
			int c;
			// Leer el archivo
			while((c = reader.read()) != -1 ){
				// Imprimir el contenido 
				System.out.print((char) c );
			}
		} catch (IOException e){
			System.out.println(String.format("Error %s: %s", e.getClass() ,e.getMessage()));
		}
		
	}

	private static void copyFile(String sourceFileName, String targetFileName) {
		// Abrir archivo origen y destino
		try(Reader reader = new FileReader (sourceFileName);
			Writer writer = new FileWriter (targetFileName)){
			
			int c;
			// Leer archivo origen
			while((c = reader.read()) != -1 ){
				// Escribir archivo destino
				writer.write(c);
			}
			
		} catch (IOException e){
			System.out.println(String.format("Error %s: %s", e.getClass() ,e.getMessage()));
		}
	}
}
