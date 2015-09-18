
public class BoolDemo {
	public static void main(String[] args){
		// definición de variables
		boolean encendido = true;
		boolean apagado = false;
		boolean estado = false;
		
		// Mostrando estado inicial
		System.out.println("Estado inicial: "+ estado);

		// Valores booleans pueden controlar instrucciones if
		// Cambiando estado a encendido (true)
		if (encendido) estado = encendido;
		System.out.println("Estado medio: "+ estado);
		
		// Cambiando estado a apagado (false)
		if (encendido) estado = apagado;
		System.out.println("Estado final: "+ estado);
		
		// Resultado de un operador de comparación es booleano
		System.out.println("10 > 9: " + (10>9));
		System.out.println("9 > 10: " + (9>10));

		// Condición dentro de comparación
		// (valor > valor2) ? valor_true : valor_false
		System.out.println("10 > 9: " + ((10>9) ? "Verdadero" : "Falso"));
		System.out.println("9 > 10: " + ((9>10) ? "Verdadero" : "Falso"));
	}
}

