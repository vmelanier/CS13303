package errores;

class Number4Exception extends Exception{
	public Number4Exception(String message){
		super(message);
	}
}

public class ExcepcionPersonalizada {
	
	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5, 3, 7};
		int[] array2 = {5, 0, 3, 2, 1, 0};
		
		for (int i=0; i<array1.length; i++){
			 try{
				 System.out.println(String.format("%s/%s=%s", 
						 array1[i], array2[i], array1[i]/array2[i]));
				 try{
					 // Creando un error NullPointerException
					 if (array1[i] == 5){
						 String nulo = null;
						 System.out.println(nulo.length());
						 }	
					 else if (array1[i] == 4){
						 throw new Number4Exception("Se encontró un número 4!");   
					 }
					 } catch (NullPointerException ex ) {        // Subclase
						 System.out.println(String.format("Occurrio un error de tipo %s: %s %s", 
								 ex.toString(), ex.getMessage(), ex.getStackTrace()));
						 }	
			 } catch (Throwable ex){                    // Super clase
				 System.out.println(String.format("Occurrio un error de tipo Throwable %s: %s %s", 
						 ex.toString(), ex.getMessage(), ex.getStackTrace()));
			 }
		}
		System.out.println("Fin del programa");
	}

}
