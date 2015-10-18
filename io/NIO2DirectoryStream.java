package io;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIO2DirectoryStream {
	public static void main(String[] args) {
		/* Obtener  acceso al recurso */
		Path folder = Paths.get("../CS13303");
		
		/* 1. Listar contenidos del directorio  
		 */
		System.out.format("Contenidos del directorio \"%s\": \n", folder.getFileName());
		try(DirectoryStream<Path> stream = Files.newDirectoryStream(folder)){
			stream.forEach(System.out::println);
		} catch (IOException | DirectoryIteratorException ex){
			System.err.format("Error %s: %s", ex.getClass(), ex.getMessage());
		}
		System.out.println("");
		
		/* 2. Listar contenidos del 
		 * directorio usando glob
		 */
		String glob = "*.git*";
		System.out.format("Sólo archivos con extensión %s: \n", glob);
		try(DirectoryStream<Path> stream = Files.newDirectoryStream(folder, glob)){
			stream.forEach(System.out::println);
		} catch (IOException | DirectoryIteratorException ex){
			System.err.format("Error %s: %s", ex.getClass(), ex.getMessage());
		}
		
	}
}
