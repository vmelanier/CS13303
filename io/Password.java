package io;

import java.io.Console;

public class Password {
	public static void main(String[] args) {
		// Obtiene la referencia a la consola del sistema
		Console consola = System.console();

		/*
		 * Valida si la consola está disponible
		 * en caso que se ejecute dentro del IDE
		 * */
		if (consola == null){
			System.err.println("Consola no disponible.");
			System.exit(1);
		}
		
		// Solicita los elementos de entrada
		String usuario = consola.readLine("%s: ", "Usuario");
		char[] password = consola.readPassword("%s: ", "Password");

		// Crea un string a partir de un arreglo de caracteres
		String passwordStr = new String(password);
		
		// Valida el contenido de los valores leidos.
		if (usuario.equals("su") && passwordStr.equals("secure")){
			consola.writer().println("Bienvenido, root.");
		} else{
			consola.writer().format("Lo siento %s, sólo root puede acceder.", usuario);
		}
	}
}
