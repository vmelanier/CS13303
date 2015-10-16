package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputByteStreams2 {

	public static void main(String[] args) throws IOException {
		// Nombre de Archivos a leer
		String[] fileNames = {"README.md", "README2.md"};

		// copiar archivo 0 a 1
		copyFile(fileNames[0], fileNames[1]);
		
		// Leer archivos
		// iterando nombres de archivo
		for (String fn: fileNames){
			InputByteStreams.readFile(fn);
		}
	}

	public static void copyFile(String fileNameSource, String fileNameTarget) {

		int i;
		try (FileInputStream fileInputStream = new FileInputStream(fileNameSource);
			 FileOutputStream fileOutputStream = new FileOutputStream(fileNameTarget)){
			
			// Leer archivo origen
			while((i = fileInputStream.read()) != -1){ 	// -1 indica el final del archivo
				//escribir archivo destino
				fileOutputStream.write(i);
			}
		} catch (IOException e) {
			System.out.println(String.format("Error %s: %s", e.getClass() ,e.getMessage()));
		}
	}
}
