package consref;
import java.util.ArrayList;

// Interfaz funcional con método
// que regresa referencia a Domain
interface FabricaDomains {
	Domain crea(String d);
}

// Define clase Domain
class Domain{
	private String name;

	// Constructor con un argumento
	Domain(String name){
		this.name = name;
	}
	// Constructor por defecto
	Domain(){
		this.name = "name.com";
	}
	
	String getName(){
		return this.name;
	}
	
	@Override
	public String toString(){
		return "<Domain "+ this.name+">";
	}

}

public class ConsReference1 {

	public static void main(String[] args) {
		/*
		 * Crea referencia al constructor de Domain.
		 * Debido a que FabricaDomains.crea() toma un 
		 * argumento, el constructor a utilizar es el 
		 * que cuenta con un argumento
		 * */
		FabricaDomains fabDomains = Domain::new;

		// Crea un arrayList de tipo Domain
		ArrayList<Domain> domains = new ArrayList<Domain>();
		
		// Agrega dos objetos creados por la referencia de 
		// constructor
		domains.add(fabDomains.crea("jmll.me"));
		domains.add(fabDomains.crea("jose-manuel.me"));

		// Imprime su representación a String por medio de 
		// la referencia a un método 
		domains.forEach(System.out::println);
		
	}
}
