package se.java;

public class NestedFor {
	public static void main(String[] args) {
		// 1. Ejemplo de ciclo anidado 
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
				}
			System.out.println();
			}
		
	}
}
