package meth.ref;

//Define clase para calcular factorial
class FactorialI{
	private int x;
	private int factorial;

	// Constructor con un parámetro
	FactorialI(int x){
		this.x = x;
		this.factorial = 1;
	}
	// Calcula el factorial de la variable X
	public int factorial(){
		for (int i=1; i<=x; i++) {
			this.factorial = this.factorial*i;
		}
		return this.factorial;
	}
	// Valida si x es mayor que el factorial
	public boolean esMayor(int x){
		return  x > this.factorial;
	}
}

// interfaz funcional
interface FuncNum {
	boolean prueba(FactorialI i, int x);
}

public class MethodReference2 {
	
	public static void main(String[] args) {
		// Define e inicializa dos instancias de 
		// FactorialI con diferentes números
		FactorialI facI1 = new FactorialI(10);
		FactorialI facI2 = new FactorialI(5);

		// Calcula facturial y lo imprime
		System.out.println("facI1.factorial=" + facI1.factorial());
		System.out.println("facI2.factorial=" + facI2.factorial());
		
		// Crea referencia al método esMayor de FactorialI
		// a la interfaz FuncNum 
		FuncNum esMayor = FactorialI::esMayor;

		// Invoca el método prueba con los objetos facI1 y facI2
		Boolean esMayorQueFacI1 = esMayor.prueba(facI1, 10000);
		Boolean esMayorQueFacI2 = esMayor.prueba(facI2, 121);
		
		// Imprime resultado
		System.out.println("10,000 > facI1.factorial? " + esMayorQueFacI1);
		System.out.println("121 > facI2.factorial? " + esMayorQueFacI2);
	}

}
