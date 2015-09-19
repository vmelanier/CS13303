/*
 * Compilación: java OperadorAritmetico.class
 * Ejecución: javac OperadorAritmetico 10 20
 * 
 * Imprime:
 * - Los dos números ingresados
 * - Resultado de la división de numero1 entre numero2
 * - Resultado de la suma de ambos numeros
 * - Resultado de la Resta de numer1 menos numero2
 * - Resultado de la Multiplicacion de ambos numeros
 * - Resultado del Modulo de numero1 modulo numero2
 * 
 */
public class OperadorAritmetico {
	public static void main(String[] args){
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println("Número 1: " + num1);
		System.out.println("Número 2: " + num2);
		
		System.out.println(Division(num1, num2));
		Suma(num1, num2);
		System.out.println(Resta(num1, num2));
		Multiplicacion(num1, num2);
		System.out.println(Modulo(num1, num2));
	}
	// Escribe tu código {

	//}
}

