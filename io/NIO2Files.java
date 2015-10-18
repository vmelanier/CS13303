package io;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NIO2Files {
	public static void main(String[] args) {
		// 1. Construye el path a README.md
		StringBuilder sb = new StringBuilder();

		/* 2. Obtiene el separador de directorios
		 * particular de Sistema Operativo para 
		 * asegurar portabilidad 
		 */
		String fs = FileSystems.getDefault().getSeparator();

		// 3. Creando el Path relativo
		sb.append("..").append(fs); 
		sb.append(fs).append("CS13303").append(fs);
		sb.append(fs).append("README.md");

		// 4. Crea el objeto Path a partir de Paths
		Path path = Paths.get(sb.toString());
		Path path2 = Paths.get(sb.append("2").toString());

		// 5. Implementación de Files
		try {
			System.out.format("Archivo %s Existe? %b\n", path.getFileName(), Files.exists(path));
			// Copiar archivo
			Files.copy(path, path2, StandardCopyOption.REPLACE_EXISTING);
			// Validación de archivo
			System.out.format("Archivo ejecutable? %b\n", Files.isExecutable(path));
			System.out.format("Archivo tiene Permisos de lectura? %b\n", Files.isReadable(path));
			System.out.format("Archivo tiene Permisos de escritura? %b\n", Files.isWritable(path));
			// Comparación de archivo
			System.out.format("Archivo %s es igual a %s? %b\n", path.getFileName(),
					path2.getFileName(), Files.isSameFile(path, path2));
			// Validación de segundo archivo
			System.out.format("Archivo %s Existe? %b\n", path2.getFileName(), Files.exists(path2));
			System.out.format("Borrando %s si existe \n", path2.getFileName());
			// Borrar archivo
			Files.deleteIfExists(path2);
			System.out.format("Archivo %s Existe? %b\n", path2.getFileName(), Files.exists(path2));
			
		} catch (IOException e) {
			System.err.format("Error %s: %s", e.getClass(), e.getMessage());
		}
	}
}
