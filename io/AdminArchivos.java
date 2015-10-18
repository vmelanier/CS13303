package io;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdminArchivos {
	public static void main(String[] args) {
		int seleccion;
		try (Scanner scanner = new Scanner(System.in)){
			while(true){
				System.out.println("Administrador de Archivos\n");
				// Inicio Menu
				System.out.println("Opciones: ");
				System.out.println("(1) Copiar Archivo");
				System.out.println("(2) Leer Archivo");
				System.out.println("(3) Salir");
				System.out.println("\nPor favor ingrese una opción: ");
				// Fin de Menu
				// Try Anidado
				try{
					// Asigna token Integer parseado
					seleccion = scanner.nextInt();
					switch(seleccion){
					case 1:
						// Copiar Archivo
						System.out.println("Ingrese archivo origen:");
						String origen = scanner.next();

						System.out.println("Ingrese archivo destino:");
						String destino = scanner.next();
						
						System.out.format("\nSe copiará %s a %s \n", origen, destino);
						break;
					case 2:
						// Leer Archivo
						System.out.println("Ingrese archivo a leer:");
						String archivo = scanner.next();
						System.out.format("\nSe leerá %s\n", archivo);
						break;
					case 3:
						System.out.println("Saliendo..");
						return;
					default:
						System.err.println("Opción inválida.");
						break;
					}
				} catch (InputMismatchException ex){
					System.err.format("Opción inválida. %s. \n", ex.getClass());
					// itera nuevo token
					scanner.next();
				}

			}
		} catch (Exception ex){
			System.err.println(ex.getMessage());
		}
	}
}
