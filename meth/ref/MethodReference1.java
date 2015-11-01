package meth.ref;

import java.util.ArrayList;

// Define clase con método estático.
class Factorial{
	static int factorial(int numero){
		int factorial = 1;
		for (int i=1; i<=numero; i++) {
			factorial = factorial*i;
		}
		return factorial;
	}
}

// Define clase con método estático
class Absoluto {
	static int abs(int x){
		return Math.abs(x);
	}
}

// Define interfaz funcional
interface Operacion{
	int opera(int x);
}


public class MethodReference1 {

	static int operaNum(Operacion o, int x){
		return o.opera(x);
	}

	public static void main(String[] args) {
		// Define ArrayList y crea instancia 
		// para guardar resultaods
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		// envía la referencia al método en y 
		// Agrega resultados de  
		// tres tipos de clases con método estático
		nums.add(operaNum(Factorial::factorial, 10));
		nums.add(operaNum(Absoluto::abs, -1 ));
		nums.add(operaNum(Math::abs, -100));
		
		// Imprime cada elemento por medio
		// de la referencia al método
		nums.forEach(System.out::println);
		
	}
}
