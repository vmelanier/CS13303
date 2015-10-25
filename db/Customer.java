package db;

public class Customer {
	// 1. Crear los atributos de la clase Customer en base a la definición de la base de datos
	// Escribe tu codigo aqui {

	// }
	
	//2. Crear los métodos de acceso
	// Escribe tu codigo aqui {

	// }
	
	
	@Override
	public String toString(){
		return String.format("%-5s %-10s %-20s %-25s %-15s %-5s", this.customerId, this.firstName, 
				this.lastName, this.company, this.email, this.supportRepId);
	}
}
