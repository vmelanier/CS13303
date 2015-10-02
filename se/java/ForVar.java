package se.java;

public class ForVar {
	public static void main(String[] args) {

		// 1. Ciclo for con múltiples variables de control
		int i, j;
		for(i=0, j=20; i<j; i++, j--){
			System.out.println(String.format("i , j: %s, %s", i, j));
		}
		
		// 2. Ciclo infinito
		// for ( ; ; ){
		//	System.out.println("Infinito!");
		// }
		
		// 3. Ciclo sin cuerpo
		int mult = 1 ;
		for (int y=1; y<10; mult*= y++);
		System.out.println(String.format("mult=%s", mult));
		
	}
}
