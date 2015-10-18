package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIO2Buffers {
	public static void main(String[] args) {
		// 1. Abriendo archivos
		Path path = Paths.get("README.md");
		Path path2 = Paths.get("README2.md");

		/* 2. Utilizando BufferedReader y BufferedWriter
		 * para copiar archivo
		 */
		System.out.format("Iniciando copia de %s -> %s\n", path.getFileName(), path2.getFileName());
		try (BufferedReader reader = Files.newBufferedReader(path, Charset.defaultCharset());
			 BufferedWriter writer = Files.newBufferedWriter(path2, Charset.defaultCharset()))
		{
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		        writer.write(line + System.lineSeparator());
		    }
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
		System.out.format("Copia completada %s -> %s\n", path.getFileName(), path2.getFileName());

		/* 3. Utilizando BufferedReader
		 * para leer nuevo archivo
		 */
		System.out.format("Conenido de destino: %s\n\n", path2.getFileName());
		try (BufferedReader reader = Files.newBufferedReader(path, Charset.defaultCharset());){
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		        System.out.println(line);
		    }
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
		
	}
}
