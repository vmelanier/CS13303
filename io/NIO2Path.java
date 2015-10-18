package io;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIO2Path {
	public static void main(String[] args) {
		// Construye el path a README.md
		StringBuilder sb = new StringBuilder();
		
		/* Obtiene el separador de directorios
		 * particular de Sistema Operativo para 
		 * asegurar portabilidad 
		 */
		String fs = FileSystems.getDefault().getSeparator();

		// Creando el Path relativo
		sb.append("..").append(fs); 
		sb.append(fs).append("CS13303").append(fs);
		sb.append(fs).append("README.md");
		
		// Crea el objeto Path a partir de Paths
		Path path = Paths.get(sb.toString());

		// Probando métodos incluidos
		System.out.format("Path Normalizado: %s\n", path.normalize().toString());
		System.out.format("Path Padre: %s\n", path.getParent());
		System.out.format("Path Raiz: %s\n", path.getRoot());
		System.out.format("Número de elementos en el Path: %s\n", path.getNameCount());
		System.out.format("Path es absoluto? %b\n", path.isAbsolute());
		System.out.format("Path absoluto: %s\n", path.toAbsolutePath());
		System.out.format("Nombre del archivo: %s\n", path.getFileName());
		System.out.format("URI: %s\n", path.toUri());
		
	}
}
