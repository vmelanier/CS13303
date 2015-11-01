package lambda;

interface FunString {
	String procesa(String str);
}

public class ArgumentoLambda {

	static String modificaStr(FunString str, String s){
		return str.procesa(s);
	}

	public static void main(String[] args) {
		// Define  variables a probar
		String p1 = "Ateo por Arabia iba raro poeta";
		String p2 = "Pepe pecas pica papas";
		
		// Define variables temporales
		String r1 = new String();
		String r2 = new String();
		
		/*
		 *  Define expresión lambda de bloque que 
		 *  modifica la cadena de entrada para regresar
		 *  la cadena a la inversa y en minúsculas
		 * */
		FunString reverso = (s) -> {
			StringBuilder resultado = new StringBuilder();
			int tamano = s.length();
			for (int i=tamano-1; i >= 0; i--)
				resultado.append(s.charAt(i));
			return resultado.toString().toLowerCase();
		};
		
		// Define expresión lambda para reemplazar espacios
		FunString sinEspacios = (s) -> s.replaceAll("\\s","").toLowerCase();
		
		// Enviar reverso al método modificaStr con p1
		// y además enviar sinEspacios con el resultado
		r2 = modificaStr(sinEspacios, modificaStr(reverso, p1));
		
		// Envia sinEspacios y p1
		r1 = modificaStr(sinEspacios, p1);

		// Compara resultados r1 y r2
		System.out.println("\""+p1+"\" " + (r1.equals(r2) ? "Es palíndromo" : "No es palíndromo"));
		
		r2 = modificaStr(sinEspacios, modificaStr(reverso, p2));
		r1 = modificaStr(sinEspacios, p2);
		System.out.println("\""+p2+"\" " + (r1.equals(r2) ? "Es palíndromo" : "No es palíndromo"));
	}

}
