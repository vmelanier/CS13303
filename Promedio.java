
public class Promedio {
	// Método principal
	public static void main(String[] args){
		// Definir las calificaciones
		double examen1 = 10.0;
		double examen2 = 9.4;
		double examen3 = 9.2;
 		double examen4 = 8.5;

 		// Calular el promedio y hacer el casting a entero
 		int promedio = (int) (examen1 + examen2 + examen3 + examen4) / 4;
 		System.out.println("El promedio de los cuatro exámenes es: " + promedio);
		
	}

}

