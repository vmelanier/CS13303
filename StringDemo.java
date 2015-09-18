
public class StringDemo {
	// Método principal
	public static void main(String args[]){
		// Puedes declarar strings de diferentes formas
		String mensaje0 = "Este es un string";
		String mensaje1 = new String("Este también es un string.");
		// Crea un string a partir de un string existente
		String mensaje2 = new String(mensaje0);

		// Imprimir el contenido
		System.out.println(mensaje0);
		System.out.println(mensaje1);
		System.out.println(mensaje2);
	}
}

