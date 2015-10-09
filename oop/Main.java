package oop;

public class Main {
	public static void main(String[] args) {
		// Creando objeto Triangulo y TrianguloMejorado
		Triangulo t1 = new Triangulo(4.0d, 2.0d);
		Triangulo t2 = new TrianguloMejorado(3.0d, 2.0d);
		
		// utilizando un setter para establecer el color azul
		t1.setColor("Azul");
		t2.setColor("Rojo");

		// imprimiendo la representación toString()
		System.out.println(t1);
		System.out.println(t2);
		
		// imprimiendo el cálculo del área
		System.out.println(t1.area());
		
	}
}
