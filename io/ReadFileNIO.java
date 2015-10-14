package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFileNIO {
	public static void main(String[] args) {
		// Nombre de Archivos a leer
		String[] fileNames = {"README.md", "README2.md"};
		
		// iterando nombres de archivo
		for (String fn: fileNames){
			try {
				// Utilizando NIO2 API para mejorar el rendimiento
				// y simplificar el código
				Files.readAllLines(Paths.get(fn)).forEach(System.out::println);
			} catch (IOException e) {
				System.out.println(e);
			}
		}

	}

}
