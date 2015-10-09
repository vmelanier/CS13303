package oop;

public class Main {
	public static void main(String[] args) {
		
		Triangulo t1 = new Triangulo("Azul");
		t1.setAlto(40d);
		t1.setAncho(20d);
		t1.setTipo("Rectángulo");
		
		Triangulo t2 = new TrianguloMejorado("Verde", 3.0d, 2.0d);
		t2.setTipo("Rectángulo");
		
		Circulo c1 = new Circulo("Amarillo", 1.5d);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(c1);

	}
}
