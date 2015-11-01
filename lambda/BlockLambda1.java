package lambda;

//definición de interfaz funcional
interface OpMat{
	int calcula(int a);
}

public class BlockLambda1 {
	
	public static void main(String[] args) {
		/* 
		 * expresión lambda de bloque asignada 
		 * a la referencia de interfaz
		 */ 
		OpMat factorial = (x) -> {    
	        int factRes = 1;
	        for (int i=1; i<=x; i++) {
	        	factRes = factRes*i;
	        }
	        return factRes;
		};

		// acceso al método implementado
		System.out.println("Factorial de 5 es: " + factorial.calcula(5));
		System.out.println("Factorial de 0 es: " + factorial.calcula(0));
	}
}
