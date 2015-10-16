package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputByteStreams {

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
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		
		int i;
		try{
			// Abir archivos origen y destino
			fileInputStream = new FileInputStream(fileNameSource);
			fileOutputStream = new FileOutputStream(fileNameTarget);
			
			// Leer archivo origen
			while((i = fileInputStream.read()) != -1){ 	// -1 indica el final del archivo
				//escribir archivo destino
				fileOutputStream.write(i);
			}
		} catch (IOException e) {
			System.out.println(String.format("Error %s: %s", e.getClass() ,e.getMessage()));
		} finally {
			try {
				// Cerrar archivo si no es nulo
				if (fileInputStream != null)
					fileInputStream.close();
				if (fileOutputStream != null)
					fileInputStream.close();
			} catch(IOException e){
				System.out.println(String.format("Error %s: %s", e.getClass() ,e.getMessage()));
			}
		}
	}
}
