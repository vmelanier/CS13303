package io;

import java.io.FileInputStream;
import java.io.IOException;

public class InputByteStreams {

	public static void main(String[] args) throws IOException {
		// Nombre de Archivos a leer
		String[] fileNames = {"README.md", "README2.md"};

		// iterando nombres de archivo
		for (String fn: fileNames){
			readFile(fn);
		}
	}

	public static void readFile(String fileName) {
		FileInputStream fileInputStream = null;
		int i;
		try{
			// Abir el archivo
			fileInputStream = new FileInputStream(fileName);
			
			// Leer archivo
			while((i = fileInputStream.read()) != -1){ 	// -1 indica el final del archivo
				System.out.print((char) i);
			}
		} catch (IOException e) {
			System.out.println(String.format("Error %s: %s", e.getClass() ,e.getMessage()));
		} finally {
			try {
				// Cerrar archivo si no es nulo
				if (fileInputStream != null)
					fileInputStream.close();
			} catch(IOException e){
				System.out.println(String.format("Error %s: %s", e.getClass() ,e.getMessage()));
			}
		}
	}
}
