package lambda;

// Interfaz funcional que toma dos números
// de  parámetros y regresa un boolean
interface PruebaNumerica{
	boolean prueba(int n, int m);
}

public class Lambda2 {
	public static void main(String[] args) {
		// Expresiones lambdas diferentes
		// compatibles con interfaz funcional
		PruebaNumerica esMayorQue = (x, y) -> (x>y);
		PruebaNumerica esMenorQue = (x, y) -> (x<y);
		PruebaNumerica esFactor = (x, y) -> ( x%y == 0);
		
		// Acceso al método implementado
		System.out.println("2 es mayor que 5: " + esMayorQue.prueba(2, 5));
		System.out.println("3 es menor que 8: " + esMenorQue.prueba(3, 8));
		System.out.println("2 es factor de 4 " + esFactor.prueba(2, 4));
	}
}
