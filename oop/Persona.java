package oop;

public class Persona {
	private String nombre;
	private String apellido;
	private String nombreCompleto;
	
	public Persona(String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
		this.nombreCompleto = this.nombre +" " + this.apellido;
	}
	// Inician getters
	public String getNombre(){
		return this.nombre;
	}
	
	public String getApellido(){
		return this.apellido;
	}
	
	public String getNombreCompleto(){
		return this.nombreCompleto;
	}

}
