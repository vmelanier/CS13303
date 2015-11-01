package lambda;

/* Interfaz funcional que toma 
 * objetos genéricos
 * de  parámetros y regresa un boolean
 */
interface Prueba<T>{
	boolean probar(T x, T y);
}

public class Lambda3 {
	public static void main(String[] args) {
		/* 
		 * expresiones lambda asignadas
		 * a la referencia de interfaz
		 */ 
		Prueba<Integer> pruebaNum = (x, y) -> ( x > y);
		Prueba<String> pruebaStr = (x, y) -> (x.equals(y));
		Prueba<Object> pruebaObj = (x, y) -> ((x.toString().equals(y.toString())));
		
		System.out.println("Prueba Num 2>1: " + (pruebaNum.probar(2, 1) ? "Si" : "No"));
		System.out.println("Prueba Str Hola y hola: " + (pruebaStr.probar("Hola", "hola") ? "Si" : "No"));
		System.out.println("Prueba \"10.0\" y \"10.0\": " + (pruebaObj.probar(10.0, 10.0) ? "Si" : "No"));
	}
}
