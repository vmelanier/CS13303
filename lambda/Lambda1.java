package lambda;

// definición de interfaz funcional
interface MiIntefaz {
	double getVal(double x);
}

public class Lambda1 {
	
	public static void main(String[] args) {
		/* 
		 * expresión lambda asignada 
		 * a la referencia de interfaz
		 */ 
		MiIntefaz mi = (x) -> 100 * (1/(x*x));
		
		// acceso al método implementado
		System.out.println("Resultado de 100(1/2^2): " + mi.getVal(2.0));
	}

}
