package se.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IO {
	public static void main(String[] args) {
		/*
		 * Lee contenido de un archivo de texto
		 * con el paquete Java New IO disponible
		 * en Java 8
		 *  
		 * */
		try {
			Files.lines(Paths.get("README.md")).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
