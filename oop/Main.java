package oop;

public class Main {
	public static void main(String[] args) {
		// Creando objeto Triangulo
		Triangulo t1 = new Triangulo(4.0d, 2.0d);

		// utilizando un setter para establecer el color azul
		t1.setColor("Azul");

		// imprimiendo la representación toString()
		System.out.println(t1);
		
		// imprimiendo el cálculo del área
		System.out.println(t1.area());
		
	}
}
