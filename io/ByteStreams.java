package io;

import java.io.IOException;

public class ByteStreams {
	public static void main(String[] args) throws IOException {
		byte[] data = new byte[10];
		
		System.out.println("Hola, Cómo estás?");
		// InputStream -> System.in
		System.in.read(data);    // Leer arreglo de bytes 
		
		System.out.println("Tu respuesta es: ");
		// OutputStream -> PrintStream -> System.out
		for (byte b: data){
			System.out.write((char) b);
		}
	}
}
