package se.java;

public class Switch {

	public static void main(String[] args) {

		// 1. Switch evaluando int
		System.out.println("Switch evaluando ints:");
		for (int i=0; i<=6; i++){
			switch(i){
			case 0:
				System.out.println("Cero");
				break;
			case 1:
				System.out.println("Uno");
				break;	
			case 2:
				System.out.println("Dos");
				break;	
			case 3:
				System.out.println("Tres");
				break;	
			case 4:
				System.out.println("Cuatro");
				break;			
			case 5:
				System.out.println("Cinco");
				break;
			default:
				System.out.println("?");
				break;
			}

		}		

		// 2. Switch evaluando Strings
		System.out.println("Switch evaluando Strings:");
		String[] nombres = new String[]{"Jose", "Manuel", "Java"};
		for (String nombre: nombres){
			switch (nombre){
			case "Jose": 
				System.out.println("Hola José"); 
				break;
			case "Manuel": 
				System.out.println("Hola Manuel"); 
				break;
			default:
				System.out.println(String.format("Hola %s, mucho gusto.", nombre));
			}
		}
	}
}
