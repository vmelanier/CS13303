
public class OperadoresRelacionales {
	public static void main(String [] args){
		int x = 5;
		int y = 4;
		int z = 1;
		int x1 = 5;
		
		System.out.println("x=" + x + "; y=" + y + "; z=" + z + "; x1=" + x1);
		// Operador Mayor que >
		System.out.println("x > z   : " + (x > z));

		// Operador Menor que >
		System.out.println("x < y   : " + (x < y));
		
		// Operador Mayor igual que
		System.out.println("x1 >= x : " + (x1 >= x));
		
		// Operador Menor igual que
		System.out.println("y <= x  : " + (y <= x));
		
		// Operador Igual
		System.out.println("z == x  : " + (z == x));
		
		// Operador No Igual o Diferente
		System.out.println("x1 != y : " + (x1 != y));
	}
}

