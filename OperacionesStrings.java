
public class OperacionesStrings {
	// Método principal
	public static void main(String[] args){
		// Crear objetos String
		String mensaje1 = "Java: Write once, run anywhere. Java!";
		String mensaje2 = "Java: Write once, run away!";
		String mensaje3 = new String(mensaje1);
		
		// Tamaño de strings
		System.out.println("Tamaño del mensaje1: " + mensaje1.length() + " caracteres.");
		System.out.println("Tamaño del mensaje2: " + mensaje2.length() + " caracteres.");
		System.out.println("Tamaño del mensaje3: " + mensaje3.length() + " caracteres.");
		
		// Comparar strings
		System.out.println("Mensaje1 equals to Mensaje2? " + mensaje1.equals(mensaje2));
		System.out.println("Mensaje2 equals to Mensaje3? " + mensaje2.equals(mensaje3));
		System.out.println("Mensaje3 equals to Mensaje1? " + mensaje3.equals(mensaje1));
		
		// Ocurrencias de substrings
		System.out.println("La primer ocurrencia de la palabra \"Java\" está en el caracter " 
							+ mensaje1.indexOf("Java") + " y la última en en caracter "
							+ mensaje1.lastIndexOf("Java"));

		// Combinando operaciones de Strings
		System.out.println("El penúltimo caracter de mensaje2 uno es: \"" 
							+ mensaje2.charAt(mensaje2.length() - 2) + "\"");
		System.out.println("El penúltimo caracter de mensaje3 uno es: \"" 
				+ mensaje3.charAt(mensaje3.length() - 2) + "\"");
	}
}

