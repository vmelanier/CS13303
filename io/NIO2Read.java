package io;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class NIO2Read {
	public static void main(String[] args) {
		// Declaración de una lista de String
		List <String> lineas = new ArrayList();
		try{
			// Abrir el archivo
			Path path = Paths.get("README.md");
			
			// Cargar contenidos
			lineas = Files.readAllLines(path, Charset.defaultCharset());
			System.out.format("El archivo %s tiene %s lineas.\n", path.getFileName(), lineas.size() );
			System.out.println("Contenido:");
			
			// Imprimir contenidos
			lineas.forEach(System.out::println);
		} catch (IOException e){
			System.err.format("Error %s: %s", e.getClass(), e.getMessage());
		}
	}
}
