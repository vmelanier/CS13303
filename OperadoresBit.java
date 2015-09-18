
public class OperadoresBit {
	public static void main(String[] args){
		// definición de variables
		int x = 15; /* 0000 1111 */
		int y = 50; /* 0011 0010 */
		int z = 1;  /* 0000 0001 */
		
		// operador bit and
		int and = x&y;
		String andbin = "0000 0010";
		System.out.println("x&y = " + and + " ; binario: "+ andbin);

		// operador bit or inclusivo
		int or = x|y;
		String orbin = "0011 1111";
		System.out.println("x|y = " + or + "; binario: "+ orbin);
		
		// operador bit or exclusivo
		int xor = x^z;
		String xorbin = "0000 1110";
		System.out.println("x^y = " + xor + "; binario: "+ xorbin);

		// operador bit unario
		int un = ~z;
		String unbin = "1111 1110";
		System.out.println("~z = " + un + " ; binario: "+ unbin);

	}

}

