package errores;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Throws {

	public static void main(String[] args) {
		try {
			// Archivo README.md existe
			Throws.readFile8("README.md");
			// Archivo README no existe
			Throws.readFile7("README");
		} catch (IOException ex){
			System.out.println(String.format("Occurrio un error de tipo %s: %s %s", 
					 ex.toString(), ex.getMessage(), ex.getStackTrace()));
		} finally {
			System.out.println("Código que siempre se ejecutará");
		}
		System.out.println("Fin del programa.");
	}
	
	public static void readFile8(String filename) throws IOException{
		// Leer archivo con NIO en Java 8
		Files.lines(Paths.get(filename)).forEach(System.out::println);
	}
	
	public static void readFile7(String filename) throws IOException{
		// Leer archivo con NIO en Java 7
		String string = new String(Files.readAllBytes(Paths.get(filename)));
		System.out.println(string);
	}
}
