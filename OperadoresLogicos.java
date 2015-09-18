
public class OperadoresLogicos {
	public static void main(String[] args){
		boolean a = true;
		boolean b = false;
		boolean c = true;
		
		// operación lógica AND &&
		System.out.println("a && b      = " + (a && b));
		System.out.println("a && b && c = " + (a && b && c));
		
		// operación lógica OR inclusivo ||
		System.out.println("a || b      = " + (a || b));
		System.out.println("a || b || c = " + (a || b || c));
		
		// operación lógica Negación !
		System.out.println("!a          = " + (!a));
		System.out.println("!b          = " + (!b));
		
		// operación lógica OR exclusivo
		System.out.println("a ^ b       = " + (a ^ b));
		System.out.println("a ^ b ^ c   = " + (a ^ b ^ c));
		
		// Mezcla de operadores lógicos
		System.out.println("a ^ b || c  = " + (a ^ b || c));
		System.out.println("a && b ^ !c = " + (a && b ^ !c));
		System.out.println("a && !b ^ c = " + (a && !b ^ c));
	}
}

