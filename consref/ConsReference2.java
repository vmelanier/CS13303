package consref;

import java.util.ArrayList;

//Interfaz funcional con método
//que regresa referencia un generico
interface Fabrica <T>{
	T crea();
}

public class ConsReference2 {
	public static void main(String[] args) {
		// Crea referencia al constructor de ArrayList.
		Fabrica<ArrayList<Domain>> fabricaLista = ArrayList::new;
		
		/*
		 * Crea referencia al constructor de Domain.
		 * Debido a que FabricaDomains.crea() toma un 
		 * argumento, el constructor a utilizar es el 
		 * que cuenta con un argumento
		 * */
		FabricaDomains fd = Domain::new;

		/* crea una lista por medio de la referencia fabricaLista
		 * crea un referencia a la interfaz FabricaDomains 
		 * */
		ArrayList<Domain> domains = fabricaLista.crea();
		domains.add(fd.crea("jmll.me"));
		domains.add(fd.crea("jose-manuel.me"));

		// Imprime su representación a String por medio de 
		// la referencia a un método 
		domains.forEach(System.out::println);
	}
}
