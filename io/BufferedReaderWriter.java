package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedReaderWriter {
	public static void main(String[] args) {
		// Nombre de Archivos a leer
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
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName));) {
			StringBuffer sBuffer = new StringBuffer();
			String string;
			// Lee archivo por lineas y almacena en string
			while((string = reader.readLine()) != null){
				// Escribe la linea en writer
				sBuffer.append(string );
				sBuffer.append(System.lineSeparator());
			}
			System.out.println(String.format("Contenido del archivo %s: %s", fileName, sBuffer.toString()));
		} catch (IOException e) {
			System.out.println(String.format("Error %s: %s", e.getClass(), e.getMessage()));
		}		
	}

	private static void copyFile(String sourceFileName, String targetFileName)  {
		try (BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
			 BufferedWriter writer = new BufferedWriter(new FileWriter(targetFileName));) {
			String string;
			// Lee archivo por lineas y almacena en string
			while((string = reader.readLine()) != null){
				// Escribe la linea en writer agregando el salto de linea necesario
				writer.write(string + System.lineSeparator());
			}
		} catch (IOException e) {
			System.out.println(String.format("Error %s: %s", e.getClass(), e.getMessage()));
		}
	}
}
