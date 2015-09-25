
public class Autoboxing {
	// Método principal
	public static void main(String[] args) {
		
		// 1. Comparación de primitivos 
		// No autoboxing
		int a = 1;
		int b = 1;
		System.out.println("a==b: " + (a==b));
		
		// 2. Comparación de objeto y primitivo
		Integer c = 4; 			// autoboxing
		int d = 4;
		System.out.println("c==d: " + (c==d));
		
		// 3. Comparación de objetos
		Integer e = new Integer(4);		// no autoboxing
		Integer f = new Integer(4);
		System.out.println("e==f: " + (e==f));
		
		// 4. Comparación de objetos 2
		Integer h = 2; 		// autoboxing
		Integer i = 2;		// autoboxing
		System.out.println("h==i: " + (h==i)); 	// unboxing
		
		// 5. Operación con autoboxing
		Double j = 3.1;			// Autoboxing
		double k = j + 0.0415; 		// Unboxing
		Double l = new Double(k); 	// no autoboxing
		System.out.println("k==l: " +(k == l));
		
		// 6. Unboxing - objeto a primitivo
		double[] m = new double[2];
		m[0] = new Double(3.1);
		m[1] = new Double(3.1415);
		
		// 7. Autoboxing - primitivo a objeto
		Double[] n = new Double[2];
		n[0] = 3.1;
		n[1] = 3.1415;
		System.out.println("m[0]==n[0]: " + (m[0]==n[0]));
		System.out.println("m[1]==n[1]: " + (m[1]==n[1]));
	}
}
